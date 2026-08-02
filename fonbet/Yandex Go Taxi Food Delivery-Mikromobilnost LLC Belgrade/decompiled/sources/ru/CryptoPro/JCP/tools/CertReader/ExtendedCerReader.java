package ru.CryptoPro.JCP.tools.CertReader;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.ClassConfig;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class ExtendedCerReader implements CerReaderInterface {
    public static final HashMap c;
    public X509Certificate b = null;
    public final Collection a = (Collection) AccessController.doPrivileged(new AnonymousClass1());

    /* renamed from: ru.CryptoPro.JCP.tools.CertReader.ExtendedCerReader$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public final Object run() {
            ExtensionProcessor loadClass;
            ExtensionProcessor loadClass2;
            Vector vector = new Vector(0);
            HashSet hashSet = new HashSet();
            try {
                JCPPref jCPPref = new JCPPref(ExtendedCerReader.class);
                String[] keys = jCPPref.keys();
                for (int i = 0; i < keys.length; i++) {
                    String str = jCPPref.get(keys[i], null);
                    if (str != null && (loadClass2 = ExtendedCerReader.loadClass(str)) != null) {
                        vector.add(loadClass2);
                        hashSet.add(keys[i]);
                    }
                }
            } catch (BackingStoreException e) {
                JCPLogger.warning("Invalid Extension configuration", (Throwable) e);
            }
            for (Map.Entry entry : ExtendedCerReader.c.entrySet()) {
                if (!hashSet.contains(entry.getKey()) && (loadClass = ExtendedCerReader.loadClass((String) entry.getValue())) != null) {
                    vector.add(loadClass);
                }
            }
            return vector;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put(AdESUtility.KEY_USAGE, "ru.CryptoPro.JCP.tools.CertReader.KeyUsageProcessor");
        hashMap.put(AdESUtility.EXTENDED_KEY_USAGE, "ru.CryptoPro.JCP.tools.CertReader.ExtendedKeyUsageProcessor");
        hashMap.put("2.5.29.19", "ru.CryptoPro.JCPRequest.cert.BasicConstraintsProcessor");
        hashMap.put("2.5.29.32", "ru.CryptoPro.JCPRequest.cert.CertificatePoliciesProcessor");
        hashMap.put("2.5.29.31", "ru.CryptoPro.JCPRequest.cert.CRLDistributionPointsProcessor");
        hashMap.put("2.5.29.18", "ru.CryptoPro.JCPRequest.cert.IssuerAltNameProcessor");
        hashMap.put("2.5.29.16", "ru.CryptoPro.JCPRequest.cert.PrivateKeyUsagePeriodProcessor");
        hashMap.put("2.5.29.17", "ru.CryptoPro.JCPRequest.cert.SubjectAltNameProcessor");
        hashMap.put("2.5.29.14", "ru.CryptoPro.JCPRequest.cert.SubjectKeyIdentifierProcessor");
        hashMap.put("2.5.29.35", "ru.CryptoPro.JCPRequest.cert.AuthorityKeyIdentifierProcessor");
        hashMap.put("1.2.840.113549.1.9.15", "ru.CryptoPro.JCPRequest.cert.SMIMECapabilitiesProcessor");
        hashMap.put("1.3.6.1.4.1.311.20.2", "ru.CryptoPro.JCPRequest.cert.CertificateTemplateNameProcessor");
        hashMap.put("2.16.840.1.113730.1.1", "ru.CryptoPro.JCPRequest.cert.NetscapeCertTypeProcessor");
        hashMap.put("1.3.6.1.4.1.311.21.1", "ru.CryptoPro.JCPRequest.cert.CertSrvCAVersionProcessor");
        hashMap.put("1.3.6.1.5.5.7.1.1", "ru.CryptoPro.JCPRequest.cert.AuthorityInfoAccessProcessor");
    }

    public static boolean isValid(Class cls) {
        return ExtensionProcessor.class.isAssignableFrom(cls);
    }

    public static ExtensionProcessor loadClass(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, ClassConfig.class.getClassLoader());
        } catch (ClassNotFoundException e) {
            JCPLogger.warning("Invalid Extension configuration", (Throwable) e);
            cls = null;
        }
        if (cls == null || !isValid(cls)) {
            JCPLogger.warning("Invalid Extension configuration");
            return null;
        }
        try {
            return (ExtensionProcessor) cls.newInstance();
        } catch (ClassCastException | IllegalAccessException | InstantiationException e2) {
            JCPLogger.warning("Invalid Extension configuration", e2);
            return null;
        }
    }

    public static boolean registerNewProcessor(String str) {
        ExtensionProcessor loadClass = loadClass(str);
        if (loadClass == null) {
            return false;
        }
        new JCPPref(ExtendedCerReader.class).put(loadClass.getOID(), str);
        return true;
    }

    public final boolean a() {
        return (this.b == null || this.a == null) ? false : true;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public X509Certificate getCertificate() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Extension getExtension(String str) {
        if (!a()) {
            return null;
        }
        for (ExtensionProcessor extensionProcessor : this.a) {
            if (extensionProcessor.equals(str)) {
                return extensionProcessor.getExtension(this.b);
            }
        }
        return null;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getNonRealizedCritical() {
        Vector vector = new Vector(0);
        if (a()) {
            Vector vector2 = new Vector(0);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                vector2.add(((ExtensionProcessor) it.next()).getOID());
            }
            vector2.retainAll(this.b.getCriticalExtensionOIDs());
            vector.addAll(this.b.getCriticalExtensionOIDs());
            vector.removeAll(vector2);
        }
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getNonRealizedNonCritical() {
        Vector vector = new Vector(0);
        if (a()) {
            Vector vector2 = new Vector(0);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                vector2.add(((ExtensionProcessor) it.next()).getOID());
            }
            vector2.retainAll(this.b.getNonCriticalExtensionOIDs());
            vector.addAll(this.b.getNonCriticalExtensionOIDs());
            vector.removeAll(vector2);
        }
        return vector;
    }

    public ExtensionProcessor getProcessor(String str) {
        for (ExtensionProcessor extensionProcessor : this.a) {
            if (extensionProcessor.equals(str)) {
                return extensionProcessor;
            }
        }
        return null;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getRealizedCritical() {
        Vector vector = new Vector(0);
        if (a()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                vector.add(((ExtensionProcessor) it.next()).getOID());
            }
            vector.retainAll(this.b.getCriticalExtensionOIDs());
        }
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getRealizedNonCritical() {
        Vector vector = new Vector(0);
        if (a()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                vector.add(((ExtensionProcessor) it.next()).getOID());
            }
            vector.retainAll(this.b.getNonCriticalExtensionOIDs());
        }
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public void setCertificate(X509Certificate x509Certificate) {
        this.b = x509Certificate;
    }
}
