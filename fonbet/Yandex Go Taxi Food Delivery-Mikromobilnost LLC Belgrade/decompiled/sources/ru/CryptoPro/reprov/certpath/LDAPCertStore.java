package ru.CryptoPro.reprov.certpath;

import defpackage.g8e;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.unr0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.LDAPCertStoreParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.naming.NameNotFoundException;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.utils.Cache;
import ru.CryptoPro.reprov.utils.GetPropertyAction;
import ru.CryptoPro.reprov.x509.X500Principal;
import ru.CryptoPro.reprov.x509.X509CertificatePair;

/* loaded from: classes4.dex */
public class LDAPCertStore extends CertStoreSpi {
    public static final int e;
    public static final int f;
    public static final String[] g;
    public static final byte[][] h;
    public static final Attributes i;
    public static final int j;
    public final CertificateFactory a;
    public DirContext b;
    public boolean c;
    public final Cache d;

    class LDAPCRLSelector extends X509CRLSelector {
        @Override // java.security.cert.X509CRLSelector
        public X509Certificate getCertificateChecking() {
            throw null;
        }

        @Override // java.security.cert.X509CRLSelector
        public Date getDateAndTime() {
            throw null;
        }

        @Override // java.security.cert.X509CRLSelector
        public Collection getIssuerNames() {
            return Collections.unmodifiableCollection(null);
        }

        @Override // java.security.cert.X509CRLSelector
        public Collection getIssuers() {
            return Collections.unmodifiableCollection(null);
        }

        @Override // java.security.cert.X509CRLSelector
        public BigInteger getMaxCRL() {
            throw null;
        }

        @Override // java.security.cert.X509CRLSelector
        public BigInteger getMinCRL() {
            throw null;
        }

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public boolean match(CRL crl) {
            throw null;
        }
    }

    class LDAPCertSelector extends X509CertSelector {
        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public byte[] getAuthorityKeyIdentifier() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public int getBasicConstraints() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public X509Certificate getCertificate() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public Date getCertificateValid() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public Set getExtendedKeyUsage() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public byte[] getIssuerAsBytes() throws IOException {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public String getIssuerAsString() {
            throw null;
        }

        public X500Principal getIssuerInternal() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public boolean[] getKeyUsage() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public boolean getMatchAllSubjectAltNames() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public byte[] getNameConstraints() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public Collection getPathToNames() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public Set getPolicy() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public Date getPrivateKeyValid() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public BigInteger getSerialNumber() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public Collection getSubjectAlternativeNames() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public byte[] getSubjectAsBytes() throws IOException {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public String getSubjectAsString() {
            throw null;
        }

        public X500Principal getSubjectInternal() {
            return null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public byte[] getSubjectKeyIdentifier() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public PublicKey getSubjectPublicKey() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector
        public String getSubjectPublicKeyAlgID() {
            throw null;
        }

        @Override // ru.CryptoPro.reprov.certpath.X509CertSelector, java.security.cert.CertSelector
        public boolean match(Certificate certificate) {
            throw null;
        }
    }

    class LDAPCertStoreParams extends LDAPCertStoreParameters {
        public volatile int a;

        public boolean equals(Object obj) {
            if (!(obj instanceof LDAPCertStoreParameters)) {
                return false;
            }
            LDAPCertStoreParameters lDAPCertStoreParameters = (LDAPCertStoreParameters) obj;
            return getPort() == lDAPCertStoreParameters.getPort() && getServerName().equalsIgnoreCase(lDAPCertStoreParameters.getServerName());
        }

        public int hashCode() {
            if (this.a == 0) {
                this.a = getServerName().toLowerCase().hashCode() + ((getPort() + 629) * 37);
            }
            return this.a;
        }
    }

    class LDAPRequest {
        public final String a;
        public HashMap b;
        public final ArrayList c = new ArrayList(5);

        public LDAPRequest(String str) {
            this.a = str;
        }

        public static byte[][] b(Attribute attribute) {
            if (attribute == null) {
                return LDAPCertStore.h;
            }
            byte[][] bArr = new byte[attribute.size()][];
            NamingEnumeration all = attribute.getAll();
            int i = 0;
            while (all.hasMore()) {
                Object next = all.next();
                if (next instanceof String) {
                    JCPLogger.finer("LDAPCertStore.getAttrValues() enum.next is a string!: ", next);
                }
                bArr[i] = (byte[]) next;
                i++;
            }
            return bArr;
        }

        public final void a(String str) {
            if (this.b == null) {
                this.c.add(str);
            } else {
                ny61.r("Request already sent");
            }
        }

        public final Map c() {
            Attributes attributes;
            String str = this.a;
            LDAPCertStore lDAPCertStore = LDAPCertStore.this;
            HashMap hashMap = this.b;
            if (hashMap != null) {
                return hashMap;
            }
            this.b = new HashMap(8);
            String[] strArr = LDAPCertStore.g;
            ArrayList arrayList = this.c;
            try {
                attributes = lDAPCertStore.b.getAttributes(str, (String[]) arrayList.toArray(strArr));
            } catch (NameNotFoundException unused) {
                attributes = LDAPCertStore.i;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                byte[][] b = b(attributes.get(str2));
                lDAPCertStore.d.put(g8e.p(str, "|", str2), b);
                this.b.put(str2, b);
            }
            return this.b;
        }

        public final byte[][] d(String str) {
            byte[][] bArr = (byte[][]) LDAPCertStore.this.d.get(unr0.r(new StringBuilder(), this.a, "|", str));
            return bArr != null ? bArr : (byte[][]) ((HashMap) c()).get(str);
        }
    }

    static {
        int integerProperty = GetProperty.getIntegerProperty("ru.CryptoPro.ldap.connect.timeout", 15);
        e = integerProperty < 0 ? 15000 : integerProperty * 1000;
        int integerProperty2 = GetProperty.getIntegerProperty("ru.CryptoPro.ldap.read.timeout", 10);
        f = integerProperty2 < 0 ? 10000 : integerProperty2 * 1000;
        g = new String[0];
        h = new byte[0][];
        i = new BasicAttributes();
        String str = (String) AccessController.doPrivileged(new GetPropertyAction("ru.CryptoPro.reprov.ldap.cache.lifetime"));
        j = str != null ? Integer.parseInt(str) : 30;
        Cache.newSoftMemoryCache(185);
    }

    public LDAPCertStore(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        this.c = false;
        if (!(certStoreParameters instanceof LDAPCertStoreParameters)) {
            kbs.t("parameters must be LDAPCertStoreParameters");
            throw null;
        }
        LDAPCertStoreParameters lDAPCertStoreParameters = (LDAPCertStoreParameters) certStoreParameters;
        d(lDAPCertStoreParameters.getServerName(), lDAPCertStoreParameters.getPort());
        try {
            this.a = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
            int i2 = j;
            this.d = i2 == 0 ? Cache.newNullCache() : i2 < 0 ? Cache.newSoftMemoryCache(750) : Cache.newSoftMemoryCache(750, i2);
        } catch (CertificateException unused) {
            kbs.t("unable to create CertificateFactory for X.509");
            throw null;
        }
    }

    public static ArrayList a(LDAPRequest lDAPRequest, X509CertSelector x509CertSelector, X509CertSelector x509CertSelector2) {
        Collection<X509CertificatePair> collection;
        X509Certificate reverse;
        X509Certificate forward;
        try {
            byte[][] d = lDAPRequest.d("crossCertificatePair;binary");
            int length = d.length;
            if (length == 0) {
                collection = Collections.EMPTY_SET;
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        arrayList.add(X509CertificatePair.generateCertificatePair(d[i2]));
                    } catch (CertificateException e2) {
                        JCPLogger.warning("LDAPCertStore.getCertPairs() encountered exception while parsing cert, skipping the bad data: ", (Throwable) e2);
                        JCPLogger.warningFormat("[{0}]", new Encoder().encodeBuffer(d[i2]));
                    }
                }
                collection = arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (X509CertificatePair x509CertificatePair : collection) {
                if (x509CertSelector != null && (forward = x509CertificatePair.getForward()) != null && x509CertSelector.match(forward)) {
                    arrayList2.add(forward);
                }
                if (x509CertSelector2 != null && (reverse = x509CertificatePair.getReverse()) != null && x509CertSelector2.match(reverse)) {
                    arrayList2.add(reverse);
                }
            }
            return arrayList2;
        } catch (NamingException e3) {
            throw new CertStoreException((Throwable) e3);
        }
    }

    public final Collection b(LDAPRequest lDAPRequest, String str, X509CRLSelector x509CRLSelector) {
        try {
            byte[][] d = lDAPRequest.d(str);
            int length = d.length;
            if (length == 0) {
                return Collections.EMPTY_SET;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    CRL generateCRL = this.a.generateCRL(new ByteArrayInputStream(d[i2]));
                    if (x509CRLSelector.match(generateCRL)) {
                        arrayList.add((X509CRL) generateCRL);
                    }
                } catch (CRLException e2) {
                    JCPLogger.warning("LDAPCertStore.getCRLs() encountered exception while parsing CRL, skipping the bad data: ", (Throwable) e2);
                    JCPLogger.warningFormat("[{0}]", new Encoder().encodeBuffer(d[i2]));
                }
            }
            return arrayList;
        } catch (NamingException e3) {
            throw new CertStoreException((Throwable) e3);
        }
    }

    public final Collection c(LDAPRequest lDAPRequest, String str, X509CertSelector x509CertSelector) {
        try {
            byte[][] d = lDAPRequest.d(str);
            int length = d.length;
            if (length == 0) {
                return Collections.EMPTY_SET;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    Certificate generateCertificate = this.a.generateCertificate(new ByteArrayInputStream(d[i2]));
                    if (x509CertSelector.match(generateCertificate)) {
                        arrayList.add((X509Certificate) generateCertificate);
                    }
                } catch (CertificateException e2) {
                    JCPLogger.warning("LDAPCertStore.getCertificates() encountered exception while parsing cert, skipping the bad data: ", (Throwable) e2);
                    JCPLogger.warningFormat("[{0}]", new Encoder().encodeBuffer(d[i2]));
                }
            }
            return arrayList;
        } catch (NamingException e3) {
            throw new CertStoreException((Throwable) e3);
        }
    }

    public final void d(String str, int i2) {
        String str2 = "ldap://" + str + ":" + i2;
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", str2);
        hashtable.put("com.sun.jndi.ldap.connect.timeout", String.valueOf(e));
        hashtable.put("com.sun.jndi.ldap.read.timeout", String.valueOf(f));
        try {
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            this.b = initialDirContext;
            if (initialDirContext.getEnvironment().get("java.naming.referral") == null) {
                this.b.addToEnvironment("java.naming.referral", "follow");
            }
        } catch (NamingException e2) {
            JCPLogger.warning("LDAPCertStore.engineInit about to throw InvalidAlgorithmParameterException", e2);
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException("unable to create InitialDirContext using supplied parameters");
            invalidAlgorithmParameterException.initCause(e2);
            throw invalidAlgorithmParameterException;
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public synchronized Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        HashSet hashSet;
        Collection<Object> collection;
        String str;
        try {
            JCPLogger.finer("LDAPCertStore.engineGetCRLs() selector: ", cRLSelector);
            if (cRLSelector == null) {
                cRLSelector = new X509CRLSelector();
            }
            if (!(cRLSelector instanceof X509CRLSelector)) {
                throw new CertStoreException("need X509CRLSelector to find CRLs");
            }
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            hashSet = new HashSet();
            X509Certificate certificateChecking = x509CRLSelector.getCertificateChecking();
            if (certificateChecking != null) {
                HashSet hashSet2 = new HashSet();
                hashSet2.add(certificateChecking.getIssuerX500Principal().getName(X500Principal.RFC2253));
                collection = hashSet2;
            } else {
                Collection<Object> issuerNames = x509CRLSelector.getIssuerNames();
                collection = issuerNames;
                if (issuerNames == null) {
                    throw new CertStoreException("need issuerNames or certChecking to find CRLs");
                }
            }
            for (Object obj : collection) {
                if (obj instanceof byte[]) {
                    try {
                        str = new X500Principal((byte[]) obj).getName(X500Principal.RFC2253);
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    str = (String) obj;
                }
                Collection collection2 = Collections.EMPTY_SET;
                if (certificateChecking == null || certificateChecking.getBasicConstraints() != -1) {
                    LDAPRequest lDAPRequest = new LDAPRequest(str);
                    lDAPRequest.a("crossCertificatePair;binary");
                    lDAPRequest.a("cACertificate;binary");
                    lDAPRequest.a("authorityRevocationList;binary");
                    if (this.c) {
                        lDAPRequest.a("certificateRevocationList;binary");
                    }
                    try {
                        collection2 = b(lDAPRequest, "authorityRevocationList;binary", x509CRLSelector);
                        if (collection2.isEmpty()) {
                            this.c = true;
                        } else {
                            hashSet.addAll(collection2);
                        }
                    } catch (CertStoreException e2) {
                        JCPLogger.warning("LDAPCertStore.engineGetCRLs non-fatal error retrieving ARLs:", (Throwable) e2);
                    }
                }
                if (collection2.isEmpty() || certificateChecking == null) {
                    LDAPRequest lDAPRequest2 = new LDAPRequest(str);
                    lDAPRequest2.a("certificateRevocationList;binary");
                    hashSet.addAll(b(lDAPRequest2, "certificateRevocationList;binary", x509CRLSelector));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashSet;
    }

    @Override // java.security.cert.CertStoreSpi
    public synchronized Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        HashSet hashSet;
        try {
            JCPLogger.finer("LDAPCertStore.engineGetCertificates() selector: ", String.valueOf(certSelector));
            if (certSelector == null) {
                certSelector = new X509CertSelector();
            }
            if (!(certSelector instanceof X509CertSelector)) {
                throw new CertStoreException("LDAPCertStore needs an X509CertSelector to find certs");
            }
            X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
            int basicConstraints = x509CertSelector.getBasicConstraints();
            String subjectAsString = x509CertSelector.getSubjectAsString();
            String issuerAsString = x509CertSelector.getIssuerAsString();
            hashSet = new HashSet();
            JCPLogger.finer("LDAPCertStore.engineGetCertificates() basicConstraints: ", Integer.valueOf(basicConstraints));
            if (subjectAsString != null) {
                JCPLogger.finer("LDAPCertStore.engineGetCertificates() subject is not null");
                LDAPRequest lDAPRequest = new LDAPRequest(subjectAsString);
                if (basicConstraints > -2) {
                    lDAPRequest.a("crossCertificatePair;binary");
                    lDAPRequest.a("cACertificate;binary");
                    lDAPRequest.a("authorityRevocationList;binary");
                    if (this.c) {
                        lDAPRequest.a("certificateRevocationList;binary");
                    }
                }
                if (basicConstraints < 0) {
                    lDAPRequest.a("userCertificate;binary");
                }
                if (basicConstraints > -2) {
                    hashSet.addAll(a(lDAPRequest, x509CertSelector, null));
                    JCPLogger.finer("LDAPCertStore.engineGetCertificates() after getMatchingCrossCerts(subject,xsel,null),certs.size(): ", Integer.valueOf(hashSet.size()));
                    hashSet.addAll(c(lDAPRequest, "cACertificate;binary", x509CertSelector));
                    JCPLogger.finer("LDAPCertStore.engineGetCertificates() after getCertificates(subject,CA_CERT,xsel),certs.size(): ", Integer.valueOf(hashSet.size()));
                }
                if (basicConstraints < 0) {
                    hashSet.addAll(c(lDAPRequest, "userCertificate;binary", x509CertSelector));
                    JCPLogger.finer("LDAPCertStore.engineGetCertificates() after getCertificates(subject,USER_CERT, xsel),certs.size(): ", Integer.valueOf(hashSet.size()));
                }
            } else {
                JCPLogger.finer("LDAPCertStore.engineGetCertificates() subject is null");
                if (basicConstraints == -2) {
                    throw new CertStoreException("need subject to find EE certs");
                }
                if (issuerAsString == null) {
                    throw new CertStoreException("need subject or issuer to find certs");
                }
            }
            JCPLogger.finer("LDAPCertStore.engineGetCertificates() about to getMatchingCrossCerts...");
            if (issuerAsString != null && basicConstraints > -2) {
                LDAPRequest lDAPRequest2 = new LDAPRequest(issuerAsString);
                lDAPRequest2.a("crossCertificatePair;binary");
                lDAPRequest2.a("cACertificate;binary");
                lDAPRequest2.a("authorityRevocationList;binary");
                if (this.c) {
                    lDAPRequest2.a("certificateRevocationList;binary");
                }
                hashSet.addAll(a(lDAPRequest2, null, x509CertSelector));
                JCPLogger.finer("LDAPCertStore.engineGetCertificates() after getMatchingCrossCerts(issuer,null,xsel),certs.size(): ", Integer.valueOf(hashSet.size()));
                hashSet.addAll(c(lDAPRequest2, "cACertificate;binary", x509CertSelector));
                JCPLogger.finer("LDAPCertStore.engineGetCertificates() after getCertificates(issuer,CA_CERT,xsel),certs.size(): ", Integer.valueOf(hashSet.size()));
            }
            JCPLogger.finer("LDAPCertStore.engineGetCertificates() returning certs");
        } catch (Throwable th) {
            throw th;
        }
        return hashSet;
    }
}
