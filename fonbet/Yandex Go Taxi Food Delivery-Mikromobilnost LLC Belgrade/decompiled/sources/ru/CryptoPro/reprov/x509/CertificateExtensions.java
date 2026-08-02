package ru.CryptoPro.reprov.x509;

import defpackage.g8e;
import defpackage.ny61;
import defpackage.w511;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.utils.Debug;

/* loaded from: classes4.dex */
public class CertificateExtensions implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions";
    public static final String NAME = "extensions";
    private Map unparseableExtensions;
    private static final Debug debug = Debug.getInstance(X509CertImpl.NAME);
    private static Class[] PARAMS = {Boolean.class, Object.class};
    private Hashtable map = new Hashtable();
    private boolean unsupportedCritExt = false;

    public CertificateExtensions(DerInputStream derInputStream) throws IOException {
        init(derInputStream);
    }

    private void init(DerInputStream derInputStream) throws IOException {
        for (DerValue derValue : derInputStream.getSequence(5)) {
            parseExtension(new Extension(derValue));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void parseExtension(Extension extension) throws IOException {
        try {
            Class cls = OIDMap.getClass(extension.getExtensionId());
            if (cls != null) {
                CertAttrSet certAttrSet = (CertAttrSet) cls.getConstructor(PARAMS).newInstance(Boolean.valueOf(extension.isCritical()), extension.getExtensionValue());
                if (this.map.put(certAttrSet.getName(), (Extension) certAttrSet) != null) {
                    throw new IOException("Duplicate extensions not allowed");
                }
            } else {
                if (extension.isCritical()) {
                    this.unsupportedCritExt = true;
                }
                if (this.map.put(extension.getExtensionId().toString(), extension) != null) {
                    throw new IOException("Duplicate extensions not allowed");
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (extension.isCritical()) {
                if (!(targetException instanceof IOException)) {
                    throw ((IOException) new IOException(targetException.toString()).initCause(targetException));
                }
                throw ((IOException) targetException);
            }
            if (this.unparseableExtensions == null) {
                this.unparseableExtensions = new HashMap();
            }
            this.unparseableExtensions.put(extension.getExtensionId().toString(), new UnparseableExtension(extension, targetException));
            Debug debug2 = debug;
            if (debug2 != null) {
                debug2.println("Error parsing extension: " + extension);
                targetException.getClass();
                Encoder encoder = new Encoder();
                PrintStream printStream = System.err;
                encoder.encodeBuffer(extension.getExtensionValue());
                printStream.getClass();
            }
        } catch (Exception e3) {
            throw ((IOException) new IOException(e3.toString()).initCause(e3));
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (this.map.get(str) != null) {
            this.map.remove(str);
        } else {
            ny61.v(g8e.o("No extension found with name ", str));
        }
    }

    public void encode(OutputStream outputStream, boolean z) throws CertificateException, IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        for (Object obj : this.map.values().toArray()) {
            if (obj instanceof CertAttrSet) {
                ((CertAttrSet) obj).encode(derOutputStream);
            } else {
                if (!(obj instanceof Extension)) {
                    w511.y("Illegal extension object");
                    return;
                }
                ((Extension) obj).encode(derOutputStream);
            }
        }
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.write((byte) 48, derOutputStream);
        if (!z) {
            DerOutputStream derOutputStream3 = new DerOutputStream();
            derOutputStream3.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 3), derOutputStream2);
            derOutputStream2 = derOutputStream3;
        }
        outputStream.write(derOutputStream2.toByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertificateExtensions)) {
            return false;
        }
        CertificateExtensions certificateExtensions = (CertificateExtensions) obj;
        Object[] array = certificateExtensions.getAllExtensions().toArray();
        int length = array.length;
        if (length != this.map.size()) {
            return false;
        }
        String str = null;
        for (int i = 0; i < length; i++) {
            Object obj2 = array[i];
            if (obj2 instanceof CertAttrSet) {
                str = ((CertAttrSet) obj2).getName();
            }
            Extension extension = (Extension) array[i];
            if (str == null) {
                str = extension.getExtensionId().toString();
            }
            Extension extension2 = (Extension) this.map.get(str);
            if (extension2 == null || !extension2.equals(extension)) {
                return false;
            }
        }
        return getUnparseableExtensions().equals(certificateExtensions.getUnparseableExtensions());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        Object obj = this.map.get(str);
        if (obj != null) {
            return obj;
        }
        ny61.v(g8e.o("No extension found with name ", str));
        return null;
    }

    public Collection getAllExtensions() {
        return this.map.values();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return this.map.elements();
    }

    public Extension getExtension(String str) {
        return (Extension) this.map.get(str);
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return "extensions";
    }

    public Map getUnparseableExtensions() {
        Map map = this.unparseableExtensions;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.unsupportedCritExt;
    }

    public int hashCode() {
        return getUnparseableExtensions().hashCode() + this.map.hashCode();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (obj instanceof Extension) {
            this.map.put(str, (Extension) obj);
        } else {
            ny61.v("Unknown extension type.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        return this.map.toString();
    }

    public CertificateExtensions() {
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws CertificateException, IOException {
        encode(outputStream, false);
    }
}
