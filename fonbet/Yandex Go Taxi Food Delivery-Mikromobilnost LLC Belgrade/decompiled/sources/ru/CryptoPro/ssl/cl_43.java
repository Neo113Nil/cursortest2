package ru.CryptoPro.ssl;

import defpackage.nt61;
import defpackage.unr0;
import defpackage.vv61;
import java.net.Socket;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.KeyStore.HDImage.FloppyStore;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageStore;
import ru.CryptoPro.JCP.KeyStore.JCPPrivateKeyEntry;
import ru.CryptoPro.JCP.KeyStore.VoidInputStream;
import ru.CryptoPro.JCP.params.JCPProtectionParameter;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.ExpandException;
import ru.CryptoPro.JCP.tools.PropertyExpander;
import ru.CryptoPro.JCPRequest.KeyUsage;
import ru.CryptoPro.ssl.util.TLSSettings;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
final class cl_43 extends X509ExtendedKeyManager {
    public static final String[] d = new String[0];
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Throwable, ru.CryptoPro.ssl.pc_10.cl_6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cl_43(KeyStore keyStore, char[] cArr, boolean z, PKIXBuilderParameters pKIXBuilderParameters, boolean z2, boolean z3) {
        String message;
        StringBuilder sb;
        String str;
        String sb2;
        Key key;
        this.c = z2;
        if (z) {
            SSLLogger.info("%% default SSL context is being initiated, key loading has been refused. To enable default initiation use -Ddisable_default_context=false %%");
        } else if (keyStore != null) {
            SSLLogger.fine("Key store format: " + keyStore.getType());
            if (cpSSLConfig.isJCP()) {
                try {
                    String name = keyStore.getProvider().getName();
                    if (name.equalsIgnoreCase("JCP") || name.equalsIgnoreCase("JCSP")) {
                        keyStore.load(new VoidInputStream(), null);
                    }
                } catch (Exception e) {
                    throw new KeyStoreException(e);
                }
            }
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                String nextElement = aliases.nextElement();
                if (!keyStore.isKeyEntry(nextElement) || keyStore.getCertificate(nextElement) == null) {
                    sb = new StringBuilder("Entry ");
                    sb.append(nextElement);
                    str = " is not an entry with private key and certificate, continue.";
                } else {
                    SSLLogger.info("%% adding as private keys %%");
                    if (cpSSLConfig.isJCP()) {
                        try {
                            SSLLogger.fine("Loading the private key (JCP): " + nextElement + "...");
                            key = keyStore.getKey(nextElement, cArr);
                        } catch (UnrecoverableKeyException e2) {
                            SSLLogger.subThrown("Error occurred during reading the key (JCP): " + nextElement, e2);
                        }
                    } else {
                        SSLLogger.fine("Loading the private key (Java CSP): " + nextElement + "...");
                        if (cArr == null || cArr.length <= 0) {
                            SSLLogger.fine("Reading the key (Java CSP): " + nextElement);
                            key = keyStore.getKey(nextElement, null);
                        } else {
                            JCPProtectionParameter jCPProtectionParameter = new JCPProtectionParameter(cArr, true, true);
                            SSLLogger.fine("Reading the entry (Java CSP): " + nextElement);
                            try {
                                key = ((JCPPrivateKeyEntry) keyStore.getEntry(nextElement, jCPProtectionParameter)).getPrivateKey();
                            } catch (UnrecoverableEntryException e3) {
                                SSLLogger.subThrown("Error occurred during reading the entry (Java CSP): " + nextElement, e3);
                            }
                        }
                    }
                    SSLLogger.fine("Private key " + nextElement + " has been loaded.");
                    if (key instanceof PrivateKey) {
                        Certificate[] certificateChain = keyStore.getCertificateChain(nextElement);
                        if (certificateChain != null && certificateChain.length != 0) {
                            if (certificateChain[0] instanceof X509Certificate) {
                                if (!(certificateChain instanceof X509Certificate[])) {
                                    X509Certificate[] x509CertificateArr = new X509Certificate[certificateChain.length];
                                    System.arraycopy(certificateChain, 0, x509CertificateArr, 0, certificateChain.length);
                                    certificateChain = x509CertificateArr;
                                }
                                X509Certificate x509Certificate = (X509Certificate) certificateChain[0];
                                Date time = Calendar.getInstance().getTime();
                                X509Certificate[] x509CertificateArr2 = vv61.d;
                                try {
                                    x509Certificate.checkValidity(time);
                                } catch (CertificateExpiredException unused) {
                                    sb = new StringBuilder();
                                    sb.append(nextElement);
                                    str = " certificate is expired or not yet valid.";
                                } catch (CertificateNotYetValidException unused2) {
                                }
                                X509Certificate[] x509CertificateArr3 = new X509Certificate[certificateChain.length];
                                System.arraycopy(certificateChain, 0, x509CertificateArr3, 0, certificateChain.length);
                                if (pKIXBuilderParameters != null) {
                                    StringBuilder x = unr0.x("Additional chain building and key usage validating of the certificate chain (through the key manager) for ", nextElement, " as ");
                                    x.append(z3 ? "client" : "server");
                                    x.append(" ...");
                                    SSLLogger.fine(x.toString());
                                    try {
                                        x509CertificateArr3 = new nt61(z3 ? "tls client" : "tls server", pKIXBuilderParameters).c(x509CertificateArr3, null, null);
                                    } catch (ru.CryptoPro.ssl.pc_10.cl_6 e4) {
                                        e = e4;
                                        if (e.a() != null) {
                                            Object a = e.a();
                                            int i = ru.CryptoPro.ssl.pc_10.cl_6.a;
                                            if (a.equals("End entity certificate extension check failed")) {
                                                if (keyStore.size() == 1) {
                                                    throw new KeyStoreException((Throwable) e);
                                                }
                                                StringBuilder x2 = unr0.x("Ignore certificate with alias ", nextElement, Extension.COLON_SPACE);
                                                x2.append(e.getMessage());
                                                sb2 = x2.toString();
                                            }
                                        }
                                        SSLLogger.ignoredException(e);
                                        cl_44 cl_44Var = new cl_44();
                                        cl_44Var.a = (PrivateKey) key;
                                        cl_44Var.b = x509CertificateArr3;
                                        this.a.put(nextElement, cl_44Var);
                                        if (SSLLogger.isFineEnabled()) {
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        SSLLogger.ignoredException(e);
                                        cl_44 cl_44Var2 = new cl_44();
                                        cl_44Var2.a = (PrivateKey) key;
                                        cl_44Var2.b = x509CertificateArr3;
                                        this.a.put(nextElement, cl_44Var2);
                                        if (SSLLogger.isFineEnabled()) {
                                        }
                                    }
                                }
                                cl_44 cl_44Var22 = new cl_44();
                                cl_44Var22.a = (PrivateKey) key;
                                cl_44Var22.b = x509CertificateArr3;
                                this.a.put(nextElement, cl_44Var22);
                                if (SSLLogger.isFineEnabled()) {
                                    StringBuffer stringBuffer = new StringBuffer("***\nfound key for: ");
                                    stringBuffer.append(nextElement);
                                    stringBuffer.append("\n");
                                    for (int i2 = 0; i2 < x509CertificateArr3.length; i2++) {
                                        stringBuffer.append("chain [");
                                        stringBuffer.append(i2);
                                        stringBuffer.append("] = ");
                                        stringBuffer.append(x509CertificateArr3[i2]);
                                        stringBuffer.append("\n");
                                    }
                                    stringBuffer.append("***\n");
                                    sb2 = stringBuffer.toString();
                                    SSLLogger.fine(sb2);
                                }
                            }
                        }
                        sb = new StringBuilder();
                        sb.append(nextElement);
                        str = " certificate chain not found.";
                    } else {
                        SSLLogger.fine(nextElement + " is not a private key.");
                    }
                }
                sb.append(str);
                sb2 = sb.toString();
                SSLLogger.fine(sb2);
            }
        }
        if (this.a.size() == 0) {
            StringBuffer stringBuffer2 = new StringBuffer("%% No appropriate keys for handshake");
            if (keyStore != null) {
                try {
                    if ("HDImageStore".equals(keyStore.getType())) {
                        stringBuffer2.append("\n");
                        stringBuffer2.append("PATH: ");
                        try {
                            stringBuffer2.append(PropertyExpander.expand(HDImageStore.getDir()));
                        } catch (ExpandException e6) {
                            stringBuffer2.append(HDImageStore.getDir());
                            stringBuffer2.append(Extension.O_BRAKE_SPACE);
                            message = e6.getMessage();
                            stringBuffer2.append(message);
                            stringBuffer2.append(Extension.C_BRAKE_SPACE);
                            SSLLogger.warning(stringBuffer2.toString());
                        }
                    } else if ("FloppyStore".equals(keyStore.getType())) {
                        try {
                            stringBuffer2.append(PropertyExpander.expand(FloppyStore.getDir()));
                        } catch (ExpandException e7) {
                            stringBuffer2.append(FloppyStore.getDir());
                            stringBuffer2.append(Extension.O_BRAKE_SPACE);
                            message = e7.getMessage();
                            stringBuffer2.append(message);
                            stringBuffer2.append(Extension.C_BRAKE_SPACE);
                            SSLLogger.warning(stringBuffer2.toString());
                        }
                    }
                } catch (Exception e8) {
                    SSLLogger.warning(stringBuffer2.toString(), e8);
                    return;
                }
            }
            SSLLogger.warning(stringBuffer2.toString());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:46|(1:48)(1:143)|49|(2:51|(5:140|141|132|133|70))(1:142)|(2:54|(2:56|(5:130|131|132|133|70))(3:134|135|(5:137|67|68|69|70)))(2:138|139)|58|59|(8:61|(1:63)(1:125)|64|(1:66)(5:(1:72)(1:124)|73|(3:76|(2:79|80)(1:78)|74)|122|123)|67|68|69|70)(1:126)|81|(2:113|114)(7:83|(1:85)(8:87|21b|99|(3:102|(2:105|106)(1:104)|100)|107|68|69|70)|86|67|68|69|70)) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x025d, code lost:
    
        ru.CryptoPro.ssl.SSLLogger.ignoredException(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String[] a(String str, Principal[] principalArr, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashSet hashSet;
        StringBuilder sb;
        String str6 = str;
        SSLLogger.fine("%% getting aliases for ".concat(z ? "Server" : "Client"));
        if (str6 == null) {
            SSLLogger.fine("%% key type is null.");
            return null;
        }
        Principal[] principalArr2 = principalArr == null ? new X500Principal[0] : principalArr;
        if (!(principalArr2 instanceof X500Principal[])) {
            ArrayList arrayList = new ArrayList(principalArr2.length);
            for (Principal principal : principalArr2) {
                if (principal instanceof X500Principal) {
                    arrayList.add((X500Principal) principal);
                } else {
                    try {
                        arrayList.add(new X500Principal(principal.getName()));
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            principalArr2 = (X500Principal[]) arrayList.toArray(new X500Principal[arrayList.size()]);
        }
        if (str6.contains("GOST3410") || !str6.contains("_")) {
            str2 = null;
        } else {
            int indexOf = str6.indexOf("_");
            str2 = str6.substring(indexOf + 1);
            str6 = str6.substring(0, indexOf);
        }
        X500Principal[] x500PrincipalArr = (X500Principal[]) principalArr2;
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = !z && (this.c || TLSSettings.getTlsClientDisableIssuerCheck()) && this.a.size() == 1;
        SSLLogger.finer("%% tlsClientAllowSingleCertLocal = " + z2);
        Iterator it = this.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str7 = (String) entry.getKey();
            SSLLogger.fine("%% checking alias: " + str7 + "...");
            cl_44 cl_44Var = (cl_44) entry.getValue();
            X509Certificate[] x509CertificateArr = cl_44Var.b;
            StringBuilder sb2 = new StringBuilder("%% certificate chain length = ");
            sb2.append(x509CertificateArr != null ? x509CertificateArr.length : 0);
            SSLLogger.fine(sb2.toString());
            if (z) {
                SSLLogger.fine("%% check public key algorithm (server)...");
                if (!str6.equals(x509CertificateArr[0].getPublicKey().getAlgorithm())) {
                    str3 = "%% inappropriate public key algorithm (server). Continue.";
                    SSLLogger.fine(str3);
                }
            } else {
                SSLLogger.fine("%% check public key algorithm ignored (client).");
            }
            if (str2 != null) {
                SSLLogger.fine("%% check signature algorithm...");
                if (x509CertificateArr.length <= 1) {
                    String sigAlgName = x509CertificateArr[0].getSigAlgName();
                    Locale locale = Locale.ENGLISH;
                    if (!sigAlgName.toUpperCase(locale).contains("WITH" + str2.toUpperCase(locale))) {
                        str4 = "%% inappropriate signature algorithm (pattern). Continue.";
                        SSLLogger.fine(str4);
                    }
                } else if (!str2.equals(x509CertificateArr[1].getPublicKey().getAlgorithm())) {
                    str3 = "%% inappropriate signature algorithm. Continue.";
                    SSLLogger.fine(str3);
                }
            } else {
                SSLLogger.fine("%% signature algorithm not found.");
            }
            List<String> extendedKeyUsage = x509CertificateArr[0].getExtendedKeyUsage();
            if (extendedKeyUsage != null) {
                int size = extendedKeyUsage.size();
                StringBuilder sb3 = new StringBuilder("%% check extended key usage of ");
                sb3.append(z ? "Server" : "Client");
                sb3.append(", size: ");
                sb3.append(size);
                sb3.append("...");
                SSLLogger.fine(sb3.toString());
                if (size == 0) {
                    str4 = "%% Extended key usage is empty. Continue.";
                } else {
                    String str8 = z ? KeyUsage.STR_OID_PKIX_SERVER_AUTH : "1.3.6.1.5.5.7.3.2";
                    String[] strArr = (String[]) extendedKeyUsage.toArray(new String[size]);
                    for (String str9 : strArr) {
                        if (str9.equals(str8)) {
                            str5 = "%% Extended key usage found and verified.";
                        }
                    }
                    StringBuilder x = unr0.x("%% Extended key usage exists but policy oid ", str8, " not found: ");
                    x.append(Arrays.toString(strArr));
                    x.append(". Continue.");
                    str4 = x.toString();
                }
                SSLLogger.fine(str4);
            } else {
                str5 = "%% Extended key usage not found.";
            }
            SSLLogger.fine(str5);
            if (z2) {
                SSLLogger.fine("Client answer with any single certificate allowed.");
                arrayList2.add(str7);
                SSLLogger.fine("matching alias: " + str7);
                break;
            }
            if (principalArr2.length == 0) {
                arrayList2.add(str7);
                sb = new StringBuilder("matching alias: ");
            } else {
                SSLLogger.fine("%% check credential issuers...");
                synchronized (cl_44Var) {
                    try {
                        if (cl_44Var.c == null) {
                            cl_44Var.c = new HashSet();
                            int i = 0;
                            while (true) {
                                X509Certificate[] x509CertificateArr2 = cl_44Var.b;
                                if (i >= x509CertificateArr2.length) {
                                    break;
                                }
                                cl_44Var.c.add(x509CertificateArr2[i].getIssuerX500Principal());
                                i++;
                            }
                        }
                        hashSet = cl_44Var.c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (int i2 = 0; i2 < x500PrincipalArr.length; i2++) {
                    if (hashSet.contains(principalArr2[i2])) {
                        arrayList2.add(str7);
                        sb = new StringBuilder("matching alias: ");
                    }
                }
            }
            sb.append(str7);
            str4 = sb.toString();
            SSLLogger.fine(str4);
        }
        String[] strArr2 = (String[]) arrayList2.toArray(d);
        String[] strArr3 = strArr2.length == 0 ? null : strArr2;
        if (strArr3 == null) {
            SSLLogger.warning("%% No alias is match");
        }
        return strArr3;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        if (strArr == null) {
            return null;
        }
        for (String str : strArr) {
            String[] clientAliases = getClientAliases(str, principalArr);
            if (clientAliases != null && clientAliases.length > 0) {
                return clientAliases[0];
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return chooseClientAlias(strArr, principalArr, null);
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return chooseServerAlias(str, principalArr, null);
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        String[] strArr;
        if (str == null) {
            return null;
        }
        if (principalArr == null || principalArr.length == 0) {
            HashMap hashMap = this.b;
            String[] strArr2 = (String[]) hashMap.get(str);
            if (strArr2 == null) {
                strArr = getServerAliases(str, principalArr);
                if (strArr == null) {
                    strArr = d;
                }
                hashMap.put(str, strArr);
            } else {
                strArr = strArr2;
            }
        } else {
            strArr = getServerAliases(str, principalArr);
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    @Override // javax.net.ssl.X509KeyManager
    public X509Certificate[] getCertificateChain(String str) {
        cl_44 cl_44Var;
        if (str == null || (cl_44Var = (cl_44) this.a.get(str)) == null) {
            return null;
        }
        return (X509Certificate[]) cl_44Var.b.clone();
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return a(str, principalArr, false);
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        cl_44 cl_44Var;
        if (str == null || (cl_44Var = (cl_44) this.a.get(str)) == null) {
            return null;
        }
        return cl_44Var.a;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return a(str, principalArr, true);
    }
}
