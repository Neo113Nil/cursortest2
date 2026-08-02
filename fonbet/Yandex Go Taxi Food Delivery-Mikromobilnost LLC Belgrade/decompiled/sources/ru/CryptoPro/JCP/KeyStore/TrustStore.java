package ru.CryptoPro.JCP.KeyStore;

import defpackage.dg11;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.Cipher.InGostMac;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.EllipticParamsSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class TrustStore extends KeyStoreSpi {
    public static final ResourceBundle c = ResourceBundle.getBundle("ru.CryptoPro.JCP.KeyStore.resources.KeyStore", Locale.getDefault());
    public boolean a;
    public final Hashtable b = new Hashtable(5);

    public static InGostMac a(char[] cArr, boolean z) {
        try {
            return new InGostMac(new SecretKeySpec(cArr, new byte[32], DigestParamsSpec.getInstance(1), new AlgIdSpec(AlgIdSpec.OID_19, EllipticParamsSpec.getInstance(1), DigestParamsSpec.getInstance(1), CryptParamsSpec.getInstance(1))), z);
        } catch (KeyManagementException e) {
            JCPLogger.fatal(e.getMessage());
            ProviderException providerException = new ProviderException(e.getMessage());
            providerException.initCause(e);
            throw providerException;
        }
    }

    public static void b(DataInputStream dataInputStream, Hashtable hashtable, InGostMac inGostMac, Hashtable hashtable2) {
        CertificateFactory certificateFactory;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        String readUTF = dataInputStream.readUTF();
        long readLong = dataInputStream.readLong();
        String readUTF2 = dataInputStream.readUTF();
        if (hashtable.containsKey(readUTF2)) {
            certificateFactory = (CertificateFactory) hashtable.get(readUTF2);
        } else {
            CertificateFactory certificateFactory2 = CertificateFactory.getInstance(readUTF2);
            hashtable.put(readUTF2, certificateFactory2);
            certificateFactory = certificateFactory2;
        }
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            c(inGostMac, bArr);
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    dg11 dg11Var = new dg11(certificateFactory.generateCertificate(byteArrayInputStream), new Date(readLong));
                    byteArrayInputStream.close();
                    hashtable2.put(readUTF, dg11Var);
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                byteArrayInputStream = null;
                th = th3;
            }
        } catch (OutOfMemoryError e) {
            IOException iOException = new IOException(c.getString("err.big.cert"));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static void c(InGostMac inGostMac, byte[] bArr) {
        try {
            inGostMac.update(bArr);
        } catch (InvalidKeyException e) {
            JCPLogger.fatal(e.getMessage());
            ProviderException providerException = new ProviderException(e.getMessage());
            providerException.initCause(e);
            throw providerException;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Enumeration engineAliases() {
        return this.b.keys();
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineContainsAlias(String str) {
        return this.b.containsKey(str.toLowerCase());
    }

    @Override // java.security.KeyStoreSpi
    public final void engineDeleteEntry(String str) {
        synchronized (this.b) {
            this.b.remove(str.toLowerCase());
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Certificate engineGetCertificate(String str) {
        Object obj = this.b.get(str.toLowerCase());
        if (obj == null) {
            return null;
        }
        return ((dg11) obj).b;
    }

    @Override // java.security.KeyStoreSpi
    public final String engineGetCertificateAlias(Certificate certificate) {
        String str;
        synchronized (this.b) {
            try {
                Enumeration keys = this.b.keys();
                while (true) {
                    if (!keys.hasMoreElements()) {
                        str = null;
                        break;
                    }
                    str = (String) keys.nextElement();
                    if (((dg11) this.b.get(str)).b.equals(certificate)) {
                    }
                }
            } finally {
            }
        }
        return str;
    }

    @Override // java.security.KeyStoreSpi
    public final Certificate[] engineGetCertificateChain(String str) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public final Date engineGetCreationDate(String str) {
        Object obj = this.b.get(str.toLowerCase());
        if (obj == null) {
            return null;
        }
        return new Date(((dg11) obj).a.getTime());
    }

    @Override // java.security.KeyStoreSpi
    public final Key engineGetKey(String str, char[] cArr) {
        throw new UnrecoverableKeyException(c.getString("err.no.key"));
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsCertificateEntry(String str) {
        return this.b.get(str.toLowerCase()) != null;
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsKeyEntry(String str) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public final void engineLoad(InputStream inputStream, char[] cArr) {
        int readInt;
        synchronized (this.b) {
            this.a = false;
            this.b.clear();
            if (inputStream != null) {
                Hashtable hashtable = new Hashtable(3);
                DataInputStream dataInputStream = null;
                try {
                    DataInputStream dataInputStream2 = new DataInputStream(inputStream);
                    try {
                        try {
                            readInt = dataInputStream2.readInt();
                        } catch (Throwable th) {
                            th = th;
                            dataInputStream = dataInputStream2;
                            if (dataInputStream != null) {
                                dataInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e) {
                        if (!(e instanceof EOFException)) {
                            throw e;
                        }
                    }
                    if (readInt != -1114130 && readInt != -1114367) {
                        throw new IOException(c.getString("err.keyStore.format"));
                    }
                    boolean z = readInt == -1114367;
                    int readInt2 = dataInputStream2.readInt();
                    if (cArr == null) {
                        this.a = true;
                    }
                    if (readInt2 > 0) {
                        InGostMac a = a(cArr, z);
                        c(a, Array.toByteArray(readInt));
                        c(a, Array.toByteArray(readInt2));
                        for (int i = 0; i < readInt2; i++) {
                            b(dataInputStream2, hashtable, a, this.b);
                        }
                        if (!this.a) {
                            try {
                                if (a.get() != dataInputStream2.readInt()) {
                                    this.b.clear();
                                    throw new IOException(c.getString("err.keyStore.err"));
                                }
                            } catch (InvalidKeyException e2) {
                                JCPLogger.fatal(e2.getMessage());
                                ProviderException providerException = new ProviderException(e2.getMessage());
                                providerException.initCause(e2);
                                throw providerException;
                            }
                        }
                    }
                    dataInputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetCertificateEntry(String str, Certificate certificate) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    throw new KeyStoreException(c.getString("err.null.pass.load.store"));
                }
                this.b.put(str.toLowerCase(), new dg11(certificate, new Date()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        throw new KeyStoreException(c.getString("err.no.key"));
    }

    @Override // java.security.KeyStoreSpi
    public final int engineSize() {
        return this.b.size();
    }

    @Override // java.security.KeyStoreSpi
    public final void engineStore(OutputStream outputStream, char[] cArr) {
        synchronized (this.b) {
            if (outputStream != null) {
                DataOutputStream dataOutputStream = null;
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                    try {
                        if (this.a) {
                            throw new IOException(c.getString("err.null.pass.load.store"));
                        }
                        if (cArr == null) {
                            throw new IllegalArgumentException(c.getString("err.null.pass"));
                        }
                        InGostMac a = a(cArr, true);
                        dataOutputStream2.writeInt(-1114367);
                        c(a, Array.toByteArray(-1114367));
                        dataOutputStream2.writeInt(this.b.size());
                        c(a, Array.toByteArray(this.b.size()));
                        Enumeration keys = this.b.keys();
                        while (keys.hasMoreElements()) {
                            String str = (String) keys.nextElement();
                            dg11 dg11Var = (dg11) this.b.get(str);
                            dataOutputStream2.writeUTF(str);
                            dataOutputStream2.writeLong(dg11Var.a.getTime());
                            Certificate certificate = dg11Var.b;
                            byte[] encoded = certificate.getEncoded();
                            dataOutputStream2.writeUTF(certificate.getType());
                            dataOutputStream2.writeInt(encoded.length);
                            dataOutputStream2.write(encoded);
                            c(a, encoded);
                        }
                        try {
                            dataOutputStream2.writeInt(a.get());
                            dataOutputStream2.close();
                            outputStream.flush();
                        } catch (InvalidKeyException e) {
                            JCPLogger.fatal(e.getMessage());
                            ProviderException providerException = new ProviderException(e.getMessage());
                            providerException.initCause(e);
                            throw providerException;
                        }
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        if (dataOutputStream != null) {
                            dataOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new KeyStoreException(c.getString("err.no.key"));
    }
}
