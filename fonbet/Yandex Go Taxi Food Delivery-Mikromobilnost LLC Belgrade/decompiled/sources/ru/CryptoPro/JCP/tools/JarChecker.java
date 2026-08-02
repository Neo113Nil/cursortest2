package ru.CryptoPro.JCP.tools;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import defpackage.dac;
import defpackage.ny61;
import defpackage.pzo;
import defpackage.r4x;
import defpackage.s4x;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.DigestOutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.Security;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.InternalGostPublicKey;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Sign.GostSignature;
import ru.CryptoPro.JCP.Util.DirList;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;
import ru.CryptoPro.JCP.spec.DefaultCSPProviderPublicKeySpec;
import ru.CryptoPro.JCP.tools.CPVerify.Prompt;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes4.dex */
public class JarChecker {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.tools.resources.checker";
    public static final String CHARSET = "UTF-8";
    public static final String FILE_NAME_HASH = "Digest.CP";
    public static final String FILE_NAME_SIGN = "Sign.CP";
    public static final String JCP_CER = "MIIIeDCCCCWgAwIBAgIRANwQTuSUkO6A6BF+2+fV5JYwCgYIKoUDBwEBAwIwggEZ\nMR8wHQYJKoZIhvcNAQkBFhBxY2FAY3J5cHRvcHJvLnJ1MRgwFgYFKoUDZAESDTEw\nMzc3MDAwODU0NDQxGjAYBggqhQMDgQMBARIMMDA3NzE3MTA3OTkxMQswCQYDVQQG\nEwJSVTEYMBYGA1UECAwPNzcg0JzQvtGB0LrQstCwMRkwFwYDVQQHDBDQsy4g0JzQ\nvtGB0LrQstCwMTAwLgYDVQQJDCfRg9C7LiDQodGD0YnRkdCy0YHQutC40Lkg0LLQ\nsNC7LCDQtC4gMTgxJTAjBgNVBAoMHNCe0J7QniAi0JrQoNCY0J/QotCeLdCf0KDQ\nniIxJTAjBgNVBAMMHNCe0J7QniAi0JrQoNCY0J/QotCeLdCf0KDQniIwHhcNMTgx\nMDI5MTMxOTA0WhcNMjExMDI5MTMyOTA0WjCCARUxGDAWBgUqhQNkARINMTAzNzcw\nMDA4NTQ0NDEaMBgGCCqFAwOBAwEBEgwwMDc3MTcxMDc5OTExKjAoBgNVBAkMIdCh\n0YPRidC10LLRgdC60LjQuSDQktCw0LssINC0LiAxODEhMB8GCSqGSIb3DQEJARYS\nY3Jvc3NAY3J5cHRvcHJvLnJ1MQswCQYDVQQGEwJSVTEcMBoGA1UECAwTNzcg0LMu\nINCc0L7RgdC60LLQsDEVMBMGA1UEBwwM0JzQvtGB0LrQstCwMSUwIwYDVQQKDBzQ\nntCe0J4gItCa0KDQmNCf0KLQni3Qn9Cg0J4iMSUwIwYDVQQDDBzQntCe0J4gItCa\n0KDQmNCf0KLQni3Qn9Cg0J4iMGYwHwYIKoUDBwEBAQEwEwYHKoUDAgIkAAYIKoUD\nBwEBAgIDQwAEQBDeCwduqJMSAflkTYtvNFLTOaqoww9RSEER206UP7vFhfOVzC2U\nuJ2ft2SAKAzuaV4HCaLFrYRf6N+5e1TXudajggU/MIIFOzAOBgNVHQ8BAf8EBAMC\nBsAwHQYDVR0OBBYEFBSb7LKc0hs9FwiTQp+kjP/DzJBQMDMGCSsGAQQBgjcVBwQm\nMCQGHCqFAwICMgEJgobkJ4G68gSFrZNYgr2vdtpzsjgCAQECAQAwggFgBgNVHSME\nggFXMIIBU4AUQogy0KOD7/QvJJVTwPTuiRxln06hggEspIIBKDCCASQxHjAcBgkq\nhkiG9w0BCQEWD2RpdEBtaW5zdnlhei5ydTELMAkGA1UEBhMCUlUxGDAWBgNVBAgM\nDzc3INCc0L7RgdC60LLQsDEZMBcGA1UEBwwQ0LMuINCc0L7RgdC60LLQsDEuMCwG\nA1UECQwl0YPQu9C40YbQsCDQotCy0LXRgNGB0LrQsNGPLCDQtNC+0LwgNzEsMCoG\nA1UECgwj0JzQuNC90LrQvtC80YHQstGP0LfRjCDQoNC+0YHRgdC40LgxGDAWBgUq\nhQNkARINMTA0NzcwMjAyNjcwMTEaMBgGCCqFAwOBAwEBEgwwMDc3MTA0NzQzNzUx\nLDAqBgNVBAMMI9Cc0LjQvdC60L7QvNGB0LLRj9C30Ywg0KDQvtGB0YHQuNC4ggsA\np2SkMwAAAAAAUjATBgNVHSUEDDAKBggrBgEFBQcDAzAbBgkrBgEEAYI3FQoEDjAM\nMAoGCCsGAQUFBwMDMB0GA1UdIAQWMBQwCAYGKoUDZHEBMAgGBiqFA2RxAjArBgNV\nHRAEJDAigA8yMDE4MTAyOTEzMTkwM1qBDzIwMTkxMDI5MTMxOTAzWjCCARwGBSqF\nA2RwBIIBETCCAQ0MNNCh0JrQl9CYICLQmtGA0LjQv9GC0L7Qn9GA0L4gQ1NQIiAo\n0LLQtdGA0YHQuNGPIDQuMCkMM9Cf0JDQmiAi0JrRgNC40L/RgtC+0J/RgNC+INCj\n0KYiICjQstC10YDRgdC40LggMi4wKQxP0KHQtdGA0YLQuNGE0LjQutCw0YIg0YHQ\nvtC+0YLQstC10YLRgdGC0LLQuNGPIOKEliDQodCkLzEyNC0zMDEwINC+0YIgMzAu\nMTIuMjAxNgxP0KHQtdGA0YLQuNGE0LjQutCw0YIg0YHQvtC+0YLQstC10YLRgdGC\n0LLQuNGPIOKEliDQodCkLzEyOC0yOTgzINC+0YIgMTguMTEuMjAxNjAqBgUqhQNk\nbwQhDB/QodCa0JfQmCDQmtGA0LjQv9GC0L7Qn9GA0L4gQ1NQMIGuBgNVHR8EgaYw\ngaMwUaBPoE2GS2h0dHA6Ly9jZHAuY3J5cHRvcHJvLnJ1L3JhL2NkcC80Mjg4MzJk\nMGEzODNlZmY0MmYyNDk1NTNjMGY0ZWU4OTFjNjU5ZjRlLmNybDBOoEygSoZIaHR0\ncDovL3EyMC5jcnlwdG9wcm8ucnUvY2RwLzQyODgzMmQwYTM4M2VmZjQyZjI0OTU1\nM2MwZjRlZTg5MWM2NTlmNGUuY3JsMIH1BggrBgEFBQcBAQSB6DCB5TA0BggrBgEF\nBQcwAYYoaHR0cDovL3FzLmNyeXB0b3Byby5ydS9vY3NwMjAxMi9vY3NwLnNyZjBX\nBggrBgEFBQcwAoZLaHR0cDovL2NkcC5jcnlwdG9wcm8ucnUvcmEvYWlhLzQyODgz\nMmQwYTM4M2VmZjQyZjI0OTU1M2MwZjRlZTg5MWM2NTlmNGUuY3J0MFQGCCsGAQUF\nBzAChkhodHRwOi8vcTIwLmNyeXB0b3Byby5ydS9haWEvNDI4ODMyZDBhMzgzZWZm\nNDJmMjQ5NTUzYzBmNGVlODkxYzY1OWY0ZS5jcnQwCgYIKoUDBwEBAwIDQQDUcHGJ\nCRSA84YzkWOXzV/K5vXCpWuHRe24wh8RPG2UKAlaijr33WxTrTkDlgXF+w7/ui2Q\nel8LXjlh0BgwnxqD";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCP.tools.resources.checker", Locale.getDefault());
    public static final String[] y = {"OK", "IllegalArg", "JCPnotInstall", "StoreNotFound", "FileNotFound", "StoreCorrupted", "CertificateNotFound", "KeyNotFound"};
    public static final Provider z;
    public String b;
    public final MessageDigest i;
    public final MessageDigest j;
    public final boolean u;
    public final byte[] a = new byte[8192];
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;
    public final Encoder h = new Encoder();
    public boolean k = false;
    public boolean l = false;
    public Key m = null;
    public Certificate n = null;
    public JarOutputStream o = null;
    public final Vector p = new Vector(10);
    public byte[] q = null;
    public Certificate[] r = null;
    public byte[][] s = null;
    public boolean t = false;
    public PrintStream v = new PrintStream(new a());
    public Manifest w = null;
    public byte[] x = null;

    public static class a extends OutputStream {
        @Override // java.io.OutputStream
        public final void write(int i) {
        }
    }

    static {
        Provider provider;
        try {
            provider = Security.getProvider("JCSP");
        } catch (Error | Exception e) {
            JCPLogger.thrown(e);
            provider = null;
        }
        z = provider;
    }

    public JarChecker() {
        String str;
        if (PaneDefaultProvider.getDefaultProviderIndexCached(null) != 1 || z == null) {
            this.u = false;
            str = "HDImageStore";
        } else {
            this.u = true;
            str = Platform.isWindows() ? JCSP.REG_STORE_NAME : "HDIMAGE";
        }
        this.b = str;
        this.i = a(false);
        this.j = a(true);
    }

    public static boolean arePublicKeyEqual(Certificate certificate, Certificate certificate2) throws IOException {
        try {
            Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
            certificate.tbsCertificate.subjectPublicKeyInfo.encode(asn1DerEncodeBuffer);
            byte[] msgCopy = asn1DerEncodeBuffer.getMsgCopy();
            Asn1DerEncodeBuffer asn1DerEncodeBuffer2 = new Asn1DerEncodeBuffer();
            certificate2.tbsCertificate.subjectPublicKeyInfo.encode(asn1DerEncodeBuffer2);
            return Arrays.equals(msgCopy, asn1DerEncodeBuffer2.getMsgCopy());
        } catch (Exception e) {
            IOException iOException = new IOException(e.getMessage());
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static void checkClassSign(Class cls) throws IOException {
        if (Platform.isAndroid) {
            return;
        }
        checkURLSign(JarTools.getClassURL(cls));
    }

    public static void checkJARSign(JarFile jarFile) throws IOException {
        JarChecker jarChecker = new JarChecker();
        jarChecker.t = true;
        jarChecker.i(jarChecker.b(jarFile, true), true);
    }

    public static void checkURLSign(URL url) throws IOException {
        JarFile jarFile = null;
        try {
            try {
                jarFile = JarTools.getJAR(url);
                checkJARSign(jarFile);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                IOException iOException = new IOException();
                iOException.initCause(e2);
                throw iOException;
            }
        } finally {
            if (jarFile != null) {
                jarFile.close();
            }
        }
    }

    public static Certificate createCert(byte[] bArr, int i, int i2) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
            Certificate certificate = new Certificate();
            certificate.decode(new Asn1DerDecodeBuffer(byteArrayInputStream));
            return certificate;
        } catch (Exception e) {
            IOException iOException = new IOException(e.getMessage());
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static PublicKey createPublicKey(byte[] bArr, boolean z2) throws IOException {
        String name;
        if (z2) {
            try {
                Provider provider = z;
                if (provider != null) {
                    name = provider.getName();
                    return KeyFactory.getInstance(JCP.GOST_EL_DEGREE_NAME, name).generatePublic(new DefaultCSPProviderPublicKeySpec(bArr));
                }
            } catch (Exception e) {
                IOException iOException = new IOException(e.getMessage());
                iOException.initCause(e);
                throw iOException;
            }
        }
        name = "JCP";
        return KeyFactory.getInstance(JCP.GOST_EL_DEGREE_NAME, name).generatePublic(new DefaultCSPProviderPublicKeySpec(bArr));
    }

    public static byte[] h(JarFile jarFile, JarEntry jarEntry) {
        if (jarEntry.isDirectory()) {
            throw new IOException();
        }
        int size = (int) jarEntry.getSize();
        byte[] bArr = new byte[size];
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        int i = 0;
        do {
            int read = inputStream.read(bArr, i, size - i);
            i += read;
            if (read == -1) {
                break;
            }
        } while (i != size);
        inputStream.close();
        return bArr;
    }

    public static void main(String[] strArr) throws Exception {
        JarChecker jarChecker = new JarChecker();
        try {
            try {
                jarChecker.v = System.out;
                jarChecker.k(strArr);
                PrintStream printStream = jarChecker.v;
                resource.getString(y[0]);
                printStream.getClass();
            } catch (Exception e) {
                jarChecker.v.getClass();
                throw e;
            }
        } finally {
            jarChecker.v = null;
        }
    }

    public static byte[] readFile(String str) throws IOException {
        int read;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                int available = fileInputStream2.available();
                byte[] bArr = new byte[available];
                int i = 0;
                do {
                    read = fileInputStream2.read(bArr, i, available - i);
                    i += read;
                } while (read > 0);
                fileInputStream2.close();
                return bArr;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final MessageDigest a(boolean z2) {
        String[] strArr = y;
        if (!this.u) {
            return new GostDigest();
        }
        try {
            Provider provider = z;
            if (provider == null) {
                throw new ClassNotFoundException();
            }
            Class<?> cls = Class.forName("ru.CryptoPro.JCSP.Digest.JCSPGostDigest", true, provider.getClass().getClassLoader());
            MessageDigest messageDigest = (MessageDigest) cls.newInstance();
            if (z2) {
                try {
                    cls.getMethod("setUseDefaultCSPProvider", Boolean.TYPE).invoke(messageDigest, Boolean.TRUE);
                    return messageDigest;
                } catch (Exception e) {
                    JCPLogger.subThrown(e);
                }
            }
            return messageDigest;
        } catch (ClassNotFoundException unused) {
            throw new Error(strArr[2]);
        } catch (IllegalAccessException unused2) {
            throw new Error(strArr[2]);
        } catch (InstantiationException unused3) {
            throw new Error(strArr[2]);
        }
    }

    public final Vector b(JarFile jarFile, boolean z2) {
        int indexOf;
        String trim;
        Decoder decoder;
        byte[] bArr;
        String str;
        Vector vector = new Vector(10);
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            JarEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (!nextElement.isDirectory()) {
                boolean equals = name.equals("META-INF/Digest.CP");
                int i = 0;
                MessageDigest messageDigest = this.j;
                MessageDigest messageDigest2 = this.i;
                if (equals) {
                    byte[] h = h(jarFile, nextElement);
                    if (z2) {
                        messageDigest.reset();
                        messageDigest.update(h);
                    } else {
                        messageDigest2.reset();
                        messageDigest2.update(h);
                    }
                    this.q = z2 ? messageDigest.digest() : messageDigest2.digest();
                    do {
                        int i2 = i;
                        while (i2 < h.length && h[i2] != 10) {
                            i2++;
                        }
                        try {
                            String str2 = new String(h, i, i2 - i, "UTF-8");
                            int i3 = i2 + 1;
                            int i4 = i3;
                            while (i4 < h.length && h[i4] != 10) {
                                i4++;
                            }
                            try {
                                String str3 = new String(h, i3, i4 - i3, "UTF-8");
                                if (!str2.contains("Signature-Version") && !str2.contains("Digest-Manifest-Main-Attributes")) {
                                    this.p.add(new s4x(this, str2, str3));
                                } else if ((str2.contains("Digest-Manifest-Main-Attributes") || str3.contains("Digest-Manifest-Main-Attributes")) && this.x == null) {
                                    if (str2.contains("Digest-Manifest-Main-Attributes")) {
                                        int indexOf2 = str2.indexOf(":");
                                        if (indexOf2 >= 0) {
                                            trim = str2.substring(indexOf2 + 1).trim();
                                            decoder = new Decoder();
                                            bArr = decoder.decodeBuffer(trim);
                                        }
                                        bArr = null;
                                    } else {
                                        if (str3.contains("Digest-Manifest-Main-Attributes") && (indexOf = str3.indexOf(":")) >= 0) {
                                            trim = str3.substring(indexOf + 1).trim();
                                            decoder = new Decoder();
                                            bArr = decoder.decodeBuffer(trim);
                                        }
                                        bArr = null;
                                    }
                                    this.x = bArr;
                                }
                                i = i4 + 2;
                            } catch (UnsupportedEncodingException e) {
                                JCPLogger.warningFormat("Encoding {0} not supported.", "UTF-8");
                                JCPLogger.warning(e);
                                IOException iOException = new IOException();
                                iOException.initCause(e);
                                throw iOException;
                            }
                        } catch (UnsupportedEncodingException e2) {
                            JCPLogger.warningFormat("Encoding {0} not supported.", "UTF-8");
                            JCPLogger.warning(e2);
                            IOException iOException2 = new IOException();
                            iOException2.initCause(e2);
                            throw iOException2;
                        }
                    } while (i < h.length);
                } else {
                    if (name.equals("META-INF/Sign.CP")) {
                        byte[] h2 = h(jarFile, nextElement);
                        if (Array.getInt(h2, 0) == 257) {
                            int i5 = Array.getInt(h2, 4);
                            if (i5 >= 1) {
                                int i6 = this.k ? i5 + 1 : i5;
                                this.r = new Certificate[i6];
                                this.s = (byte[][]) java.lang.reflect.Array.newInstance((Class<?>) Byte.TYPE, i6, 64);
                                int i7 = 8;
                                for (int i8 = 0; i8 < i5; i8++) {
                                    if (Array.getInt(h2, i7) == 64) {
                                        int i9 = i7 + 4;
                                        byte[] bArr2 = this.s[i8];
                                        System.arraycopy(h2, i9, bArr2, 0, bArr2.length);
                                        i7 = i9 + this.s[i8].length;
                                    } else {
                                        str = "Invalid length of signature";
                                    }
                                }
                                while (i < i5) {
                                    int i10 = Array.getInt(h2, i7);
                                    int i11 = i7 + 4;
                                    this.r[i] = createCert(h2, i11, i10);
                                    i7 = i11 + i10;
                                    i++;
                                }
                            } else {
                                str = "There are no signature in Jar File";
                            }
                        } else {
                            str = "Unknown format of jar signature";
                        }
                        ny61.v(str);
                        return null;
                    }
                    if (name.equals("META-INF/MANIFEST.MF")) {
                        this.w = jarFile.getManifest();
                        c(jarFile, nextElement, z2);
                    } else {
                        boolean startsWith = name.startsWith("META-INF/");
                        c(jarFile, nextElement, z2);
                        if (!startsWith) {
                            vector.add(new s4x(this, name, z2 ? messageDigest.digest() : messageDigest2.digest()));
                        }
                    }
                }
            }
        }
        return vector;
    }

    public final void c(JarFile jarFile, JarEntry jarEntry, boolean z2) {
        int read;
        JarEntry jarEntry2 = new JarEntry(jarEntry.getName());
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        MessageDigest messageDigest = this.i;
        MessageDigest messageDigest2 = this.j;
        if (z2) {
            messageDigest2.reset();
        } else {
            messageDigest.reset();
        }
        JarOutputStream jarOutputStream = this.o;
        if (jarOutputStream != null) {
            jarOutputStream.putNextEntry(jarEntry2);
        }
        do {
            byte[] bArr = this.a;
            read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                if (z2) {
                    messageDigest2.update(bArr, 0, read);
                } else {
                    messageDigest.update(bArr, 0, read);
                }
                JarOutputStream jarOutputStream2 = this.o;
                if (jarOutputStream2 != null) {
                    jarOutputStream2.write(bArr, 0, read);
                }
            }
        } while (read != -1);
        inputStream.close();
        JarOutputStream jarOutputStream3 = this.o;
        if (jarOutputStream3 != null) {
            jarOutputStream3.closeEntry();
        }
    }

    public final void d(JarOutputStream jarOutputStream) {
        if (this.s.length != this.r.length) {
            throw new IOException();
        }
        jarOutputStream.write(Array.toByteArray(257));
        jarOutputStream.write(Array.toByteArray(this.s.length));
        int i = 0;
        while (true) {
            byte[][] bArr = this.s;
            if (i >= bArr.length) {
                break;
            }
            jarOutputStream.write(Array.toByteArray(bArr[i].length));
            jarOutputStream.write(this.s[i]);
            i++;
        }
        for (int i2 = 0; i2 < this.r.length; i2++) {
            Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
            try {
                this.r[i2].encode(asn1DerEncodeBuffer);
                byte[] msgCopy = asn1DerEncodeBuffer.getMsgCopy();
                jarOutputStream.write(Array.toByteArray(msgCopy.length));
                jarOutputStream.write(msgCopy);
            } catch (Asn1Exception e) {
                JCPLogger.thrown(resource.getString("InvalidCert"), e);
            }
        }
    }

    public final void e(Certificate certificate) {
        java.security.cert.Certificate certificate2;
        try {
            Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
            certificate.encode(asn1DerEncodeBuffer);
            certificate2 = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(asn1DerEncodeBuffer.getMsgCopy()));
        } catch (Exception e) {
            JCPLogger.thrown(e);
            certificate2 = null;
        }
        if (certificate2 != null) {
            PrintStream printStream = this.v;
            ResourceBundle resourceBundle = resource;
            resourceBundle.getString("SigAlg");
            X509Certificate x509Certificate = (X509Certificate) certificate2;
            x509Certificate.getSigAlgName();
            printStream.getClass();
            PrintStream printStream2 = this.v;
            resourceBundle.getString("PubKey");
            certificate2.getPublicKey().toString();
            printStream2.getClass();
            PrintStream printStream3 = this.v;
            resourceBundle.getString("CertSubj");
            x509Certificate.getSubjectDN().toString();
            printStream3.getClass();
            PrintStream printStream4 = this.v;
            resourceBundle.getString("CertIss");
            x509Certificate.getIssuerDN().toString();
            printStream4.getClass();
        }
    }

    public final void f(boolean[] zArr, int i, boolean z2) {
        Certificate[] certificateArr = this.r;
        int length = (certificateArr.length - 1) - i;
        Certificate[] certificateArr2 = new Certificate[length];
        int[] iArr = {(certificateArr.length - 1) - i, 64};
        Class cls = Byte.TYPE;
        byte[][] bArr = (byte[][]) java.lang.reflect.Array.newInstance((Class<?>) cls, iArr);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Certificate[] certificateArr3 = this.r;
            if (i2 >= certificateArr3.length - 1) {
                break;
            }
            if (!zArr[i2]) {
                certificateArr2[i3] = certificateArr3[i2];
                byte[] bArr2 = this.s[i2];
                byte[] bArr3 = bArr[i3];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr3.length);
                i3++;
            }
            i2++;
        }
        if (z2) {
            int i4 = length + 1;
            this.r = new Certificate[i4];
            this.s = (byte[][]) java.lang.reflect.Array.newInstance((Class<?>) cls, i4, 64);
        } else {
            this.r = new Certificate[length];
            this.s = (byte[][]) java.lang.reflect.Array.newInstance((Class<?>) cls, length, 64);
        }
        System.arraycopy(certificateArr2, 0, this.r, 0, length);
        for (int i5 = 0; i5 < length; i5++) {
            byte[] bArr4 = bArr[i5];
            byte[] bArr5 = this.s[i5];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
        }
    }

    public final void finalize() {
        super.finalize();
        PrintStream printStream = this.v;
        if (printStream != null) {
            printStream.close();
        }
    }

    public final boolean g(Certificate certificate, byte[] bArr, boolean z2) {
        PublicKey createPublicKey = createPublicKey(certificate, z2);
        boolean z3 = this.u;
        KeyInterface keyInterface = null;
        try {
            try {
                if (!(createPublicKey instanceof InternalGostPublicKey)) {
                    throw new InvalidKeyException(ru.CryptoPro.JCP.Sign.a.resource.getString("InvKeyType"));
                }
                PublicKeyInterface publicKeyInterface = (PublicKeyInterface) ((InternalGostPublicKey) createPublicKey).getSpec();
                if (z3) {
                    publicKeyInterface = (PublicKeyInterface) publicKeyInterface.clone();
                }
                PublicKeyInterface publicKeyInterface2 = publicKeyInterface;
                boolean verifySignature = publicKeyInterface2.verifySignature(new GostSignature(Array.invByteOrderB(bArr)), this.q);
                if (z3) {
                    publicKeyInterface2.clear();
                }
                return verifySignature;
            } catch (CloneNotSupportedException e) {
                JCPLogger.thrown(e);
                if (!z3 || 0 == 0) {
                    return false;
                }
                keyInterface.clear();
                return false;
            } catch (InvalidKeyException e2) {
                JCPLogger.thrown(e2);
                if (!z3 || 0 == 0) {
                    return false;
                }
                keyInterface.clear();
                return false;
            } catch (SignatureException e3) {
                JCPLogger.thrown(e3);
                if (!z3 || 0 == 0) {
                    return false;
                }
                keyInterface.clear();
                return false;
            }
        } catch (Throwable th) {
            if (z3 && 0 != 0) {
                keyInterface.clear();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Vector vector, boolean z2) {
        PrintStream printStream;
        ResourceBundle resourceBundle;
        String str;
        Vector vector2;
        Security.addProvider(new JCP());
        if (this.k) {
            printStream = this.v;
            resourceBundle = resource;
            str = "VerifyBeforeSign";
        } else {
            String str2 = this.g;
            if (str2 != null || this.t) {
                if (str2 != null) {
                    printStream = this.v;
                    resourceBundle = resource;
                    str = "VerifyForCert";
                }
                if (this.x != null) {
                    if (!Arrays.equals(this.x, l(z2))) {
                        ResourceBundle resourceBundle2 = resource;
                        throw new IOException(resourceBundle2.getString("InvDigest") + resourceBundle2.getString("CorruptManifest"));
                    }
                }
                vector2 = this.p;
                if (!vector2.isEmpty() && this.r == null) {
                    if (this.t) {
                        ny61.v(resource.getString("NoSign"));
                        return;
                    }
                    PrintStream printStream2 = this.v;
                    resource.getString("NoSign");
                    printStream2.getClass();
                    return;
                }
                if ((!vector2.isEmpty() && this.r != null) || (!vector2.isEmpty() && this.r == null)) {
                    ResourceBundle resourceBundle3 = resource;
                    throw new IOException(resourceBundle3.getString("InvDigest") + resourceBundle3.getString("Corrupt_1"));
                }
                if (vector.size() == vector2.size()) {
                    ResourceBundle resourceBundle4 = resource;
                    throw new IOException(resourceBundle4.getString("InvDigest") + resourceBundle4.getString("Corrupt_2"));
                }
                Enumeration elements = vector2.elements();
                while (elements.hasMoreElements()) {
                    s4x s4xVar = (s4x) elements.nextElement();
                    if (!vector.contains(s4xVar)) {
                        ResourceBundle resourceBundle5 = resource;
                        throw new IOException(resourceBundle5.getString("InvDigest") + resourceBundle5.getString("Corrupt_3") + s4xVar.a);
                    }
                }
                String str3 = this.g;
                boolean z3 = this.u;
                int i = 0;
                if (str3 != null) {
                    byte[] readFile = readFile(str3);
                    if (DirList.isBase64(readFile)) {
                        readFile = DirList.intellectDecode(readFile);
                    }
                    this.n = createCert(readFile, 0, readFile.length);
                    while (true) {
                        Certificate[] certificateArr = this.r;
                        if (i >= certificateArr.length) {
                            PrintStream printStream3 = this.v;
                            resource.getString("NoSignForCert");
                            printStream3.getClass();
                            return;
                        } else {
                            if (arePublicKeyEqual(this.n, certificateArr[i])) {
                                boolean g = g(this.n, this.s[i], z3);
                                PrintStream printStream4 = this.v;
                                if (g) {
                                    resource.getString("ValidSig");
                                    printStream4.getClass();
                                    return;
                                } else {
                                    resource.getString("InValidSig");
                                    printStream4.getClass();
                                    return;
                                }
                            }
                            i++;
                        }
                    }
                } else {
                    if (!this.t) {
                        int length = this.r.length;
                        if (this.k) {
                            length--;
                        }
                        boolean[] zArr = new boolean[length];
                        Arrays.fill(zArr, false);
                        int i2 = 0;
                        for (int i3 = 0; i3 < length; i3++) {
                            if (!g(this.r[i3], this.s[i3], z3)) {
                                i2++;
                                zArr[i3] = true;
                            }
                        }
                        PrintStream printStream5 = this.v;
                        if (i2 == 0) {
                            ResourceBundle resourceBundle6 = resource;
                            resourceBundle6.getString("CountSign.1");
                            resourceBundle6.getString("CountSign.2");
                            printStream5.getClass();
                        } else {
                            ResourceBundle resourceBundle7 = resource;
                            resourceBundle7.getString("CountSign.1");
                            resourceBundle7.getString("CountSign.2");
                            printStream5.getClass();
                            if (i2 != length) {
                                while (i < length) {
                                    if (zArr[i]) {
                                        e(this.r[i]);
                                    }
                                    i++;
                                }
                            } else {
                                while (i < length) {
                                    e(this.r[i]);
                                    i++;
                                }
                                PrintStream printStream6 = this.v;
                                resource.getString("Corrupt_4");
                                printStream6.getClass();
                            }
                        }
                        if (this.k && this.l) {
                            PrintStream printStream7 = this.v;
                            ResourceBundle resourceBundle8 = resource;
                            resourceBundle8.getString("DelInv");
                            printStream7.getClass();
                            f(zArr, i2, true);
                            PrintStream printStream8 = this.v;
                            int length2 = this.r.length;
                            resourceBundle8.getString("CountSign.1");
                            int length3 = this.r.length;
                            resourceBundle8.getString("CountSign.2");
                            resourceBundle8.getString("AfterDel");
                            printStream8.getClass();
                            return;
                        }
                        return;
                    }
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(JCP_CER.getBytes("UTF-8"));
                    byte[] decodeBuffer = new Decoder().decodeBuffer(byteArrayInputStream);
                    byteArrayInputStream.close();
                    Certificate certificate = new Certificate();
                    try {
                        certificate.decode(new Asn1DerDecodeBuffer(decodeBuffer));
                        try {
                            certificate.tbsCertificate.subjectPublicKeyInfo.encode(new Asn1DerEncodeBuffer());
                            while (true) {
                                Certificate[] certificateArr2 = this.r;
                                if (i >= certificateArr2.length) {
                                    ny61.v(resource.getString("NoNeedSig"));
                                    return;
                                }
                                if (arePublicKeyEqual(certificate, certificateArr2[i])) {
                                    if (!g(certificate, this.s[i], z3)) {
                                        ny61.v(resource.getString("InValidSig"));
                                        return;
                                    }
                                    PrintStream printStream9 = this.v;
                                    resource.getString("ValidSig");
                                    printStream9.getClass();
                                    return;
                                }
                                i++;
                            }
                        } catch (Asn1Exception e) {
                            dac.g(resource.getString("InvalidCert"), e);
                            return;
                        }
                    } catch (Asn1Exception e2) {
                        dac.g(resource.getString("InvalidCert"), e2);
                        return;
                    }
                }
            } else {
                printStream = this.v;
                resourceBundle = resource;
                str = "VerifyAll";
            }
        }
        resourceBundle.getString(str);
        printStream.getClass();
        if (this.x != null) {
        }
        vector2 = this.p;
        if (!vector2.isEmpty()) {
        }
        if (!vector2.isEmpty()) {
        }
        if (vector.size() == vector2.size()) {
        }
    }

    public final void j(JarFile jarFile) {
        Vector b = b(jarFile, false);
        i(b, false);
        Certificate[] certificateArr = this.r;
        if (certificateArr != null && certificateArr.length > 16) {
            PrintStream printStream = this.v;
            resource.getString("Has16Sig");
            printStream.getClass();
            return;
        }
        Vector vector = new Vector();
        this.x = l(false);
        vector.add(new r4x(this));
        vector.add(new r4x(this, this.x));
        this.o.putNextEntry(new JarEntry("META-INF/Digest.CP"));
        OutputStream outputStream = this.o;
        byte[] bArr = this.q;
        MessageDigest messageDigest = this.i;
        if (bArr == null) {
            outputStream = new DigestOutputStream(this.o, messageDigest);
            messageDigest.reset();
        }
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            r4x r4xVar = (r4x) elements.nextElement();
            outputStream.write(r4xVar.a.getBytes("UTF-8"));
            outputStream.write(Extension.COLON_SPACE.getBytes("UTF-8"));
            outputStream.write(r4xVar.b.getBytes("UTF-8"));
            outputStream.write(10);
        }
        outputStream.write(10);
        Enumeration elements2 = b.elements();
        while (elements2.hasMoreElements()) {
            s4x s4xVar = (s4x) elements2.nextElement();
            outputStream.write(s4xVar.a.getBytes("UTF-8"));
            outputStream.write(10);
            outputStream.write(s4xVar.b.getBytes("UTF-8"));
            outputStream.write(10);
            outputStream.write(10);
        }
        if (this.q == null) {
            this.q = messageDigest.digest();
        }
        PrintStream printStream2 = this.v;
        resource.getString("Signing");
        printStream2.getClass();
        if (this.r == null) {
            this.r = new Certificate[1];
        }
        boolean[] zArr = new boolean[this.r.length - 1];
        Arrays.fill(zArr, false);
        JarEntry jarEntry = new JarEntry("META-INF/Sign.CP");
        int i = 0;
        while (true) {
            Certificate[] certificateArr2 = this.r;
            if (i >= certificateArr2.length - 1) {
                PrintStream printStream3 = this.v;
                resource.getString("NewSig");
                printStream3.getClass();
                Key key = this.m;
                if (!(key instanceof InternalGostPrivateKey)) {
                    ny61.v(ru.CryptoPro.JCP.Sign.a.resource.getString("InvKeyType"));
                    return;
                }
                try {
                    InternalGostPrivateKey internalGostPrivateKey = (InternalGostPrivateKey) key;
                    byte[] encode = ((PrivateKeyInterface) internalGostPrivateKey.getSpec()).signature(this.q, internalGostPrivateKey.getDigestAlgId(), 0).encode();
                    Certificate[] certificateArr3 = this.r;
                    certificateArr3[certificateArr3.length - 1] = this.n;
                    if (this.s == null) {
                        this.s = new byte[1][];
                    }
                    byte[][] bArr2 = this.s;
                    bArr2[bArr2.length - 1] = encode;
                    this.o.putNextEntry(jarEntry);
                    d(this.o);
                    return;
                } catch (InvalidKeyException e) {
                    dac.g(ru.CryptoPro.JCP.Sign.a.resource.getString("InvKeyType"), e);
                    return;
                } catch (SignatureException e2) {
                    dac.g(ru.CryptoPro.JCP.Sign.a.resource.getString("InvParams"), e2);
                    return;
                }
            }
            if (this.n.equals(certificateArr2[i])) {
                if (g(this.r[i], this.s[i], this.u)) {
                    PrintStream printStream4 = this.v;
                    resource.getString("HasValidSignWithCert");
                    printStream4.getClass();
                    f(zArr, 0, false);
                    this.o.putNextEntry(jarEntry);
                    d(this.o);
                    return;
                }
                zArr[i] = true;
                PrintStream printStream5 = this.v;
                resource.getString("HasInValidSignWithCert");
                printStream5.getClass();
                f(zArr, 1, true);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e9, code lost:
    
        if (r5.d == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f1, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(String[] strArr) {
        JarFile jarFile;
        String[] strArr2 = y;
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    if (strArr[0].equalsIgnoreCase("-sign")) {
                        this.k = true;
                    } else {
                        if (!strArr[0].equalsIgnoreCase(Prompt.ACTION_VERIFY_STR)) {
                            throw new IllegalArgumentException();
                        }
                        this.k = false;
                    }
                    for (int i = 1; i < strArr.length; i += 2) {
                        if (strArr[i].equalsIgnoreCase("-alias")) {
                            this.d = strArr[i + 1];
                        } else if (strArr[i].equalsIgnoreCase("-storetype")) {
                            this.b = strArr[i + 1];
                        } else if (strArr[i].equalsIgnoreCase("-keypass")) {
                            this.c = strArr[i + 1];
                        } else if (strArr[i].equalsIgnoreCase("-out")) {
                            this.f = strArr[i + 1];
                        } else if (strArr[i].equalsIgnoreCase("-in")) {
                            this.e = strArr[i + 1];
                        } else if (strArr[i].equalsIgnoreCase("-delsign")) {
                            this.l = true;
                        } else {
                            if (!strArr[i].equalsIgnoreCase("-cert")) {
                                throw new IllegalArgumentException();
                            }
                            this.g = strArr[i + 1];
                        }
                    }
                    if (this.e == null) {
                        throw new IllegalArgumentException();
                    }
                    if (!new File(this.e).exists()) {
                        throw new RuntimeException(resource.getString(strArr2[4]));
                    }
                    if (this.g != null && !new File(this.g).exists()) {
                        throw new RuntimeException(resource.getString(strArr2[4]));
                    }
                    boolean z2 = this.k;
                    if (z2 && this.g != null) {
                        throw new IllegalArgumentException();
                    }
                    if (z2 && this.f == null) {
                        throw new IllegalArgumentException();
                    }
                    JarFile jarFile2 = null;
                    if (z2) {
                        try {
                            Provider provider = this.u ? z : Security.getProvider("JCP");
                            if (provider == null) {
                                throw new ProviderException(resource.getString(strArr2[2]));
                            }
                            KeyStore keyStore = KeyStore.getInstance(this.b, provider);
                            keyStore.load(null, null);
                            java.security.cert.Certificate certificate = keyStore.getCertificate(this.d);
                            if (certificate == null) {
                                throw new InvalidKeyException(resource.getString(strArr2[6]));
                            }
                            Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(certificate.getEncoded());
                            Certificate certificate2 = new Certificate();
                            this.n = certificate2;
                            certificate2.decode(asn1DerDecodeBuffer);
                            String str = this.d;
                            String str2 = this.c;
                            Key key = keyStore.getKey(str, str2 != null ? str2.toCharArray() : null);
                            this.m = key;
                            if (key == null) {
                                throw new IllegalArgumentException(resource.getString(strArr2[7]));
                            }
                        } catch (Exception e) {
                            InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString(strArr2[5]));
                            invalidKeyException.initCause(e);
                            throw invalidKeyException;
                        }
                    }
                    try {
                        jarFile = new JarFile(this.e);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        if (this.k) {
                            this.o = new JarOutputStream(new FileOutputStream(this.f));
                        }
                        if (this.k) {
                            j(jarFile);
                        } else {
                            i(b(jarFile, true), true);
                        }
                        jarFile.close();
                        JarOutputStream jarOutputStream = this.o;
                        if (jarOutputStream != null) {
                            jarOutputStream.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        jarFile2 = jarFile;
                        if (jarFile2 != null) {
                            jarFile2.close();
                        }
                        JarOutputStream jarOutputStream2 = this.o;
                        if (jarOutputStream2 != null) {
                            jarOutputStream2.close();
                        }
                        throw th;
                    }
                }
            } catch (IllegalArgumentException e2) {
                PrintStream printStream = this.v;
                resource.getString(strArr2[1]);
                printStream.getClass();
                this.v.getClass();
                this.v.getClass();
                this.v.getClass();
                this.v.getClass();
                this.v.getClass();
                throw e2;
            }
        }
        throw new IllegalArgumentException();
    }

    public final byte[] l(boolean z2) {
        MessageDigest a2 = a(z2);
        a2.reset();
        ArrayList arrayList = new ArrayList(this.w.getMainAttributes().entrySet());
        Collections.sort(arrayList, new pzo(12, this));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Attributes.Name name = (Attributes.Name) entry.getKey();
            String str = (String) entry.getValue();
            a2.update(name.toString().getBytes("UTF-8"));
            a2.update(str.getBytes("UTF-8"));
        }
        return a2.digest();
    }

    public static PublicKey createPublicKey(Certificate certificate, boolean z2) throws IOException {
        try {
            Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
            certificate.tbsCertificate.subjectPublicKeyInfo.encode(asn1DerEncodeBuffer);
            return createPublicKey(asn1DerEncodeBuffer.getMsgCopy(), z2);
        } catch (Exception e) {
            IOException iOException = new IOException(e.getMessage());
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static boolean arePublicKeyEqual(PublicKey publicKey, Certificate certificate) throws IOException {
        try {
            byte[] encoded = publicKey.getEncoded();
            Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
            certificate.tbsCertificate.subjectPublicKeyInfo.encode(asn1DerEncodeBuffer);
            return Arrays.equals(encoded, asn1DerEncodeBuffer.getMsgCopy());
        } catch (Exception e) {
            IOException iOException = new IOException(e.getMessage());
            iOException.initCause(e);
            throw iOException;
        }
    }
}
