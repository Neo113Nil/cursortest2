package ru.CryptoPro.JCP.KeyStore;

import defpackage.zi10;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class MemoryStore extends KeyStoreSpi {
    public static final Hashtable[] b;
    public final Hashtable a;

    public static class MemoryStore0 extends MemoryStore {
    }

    public static class MemoryStore1 extends MemoryStore {
    }

    public static class MemoryStore2 extends MemoryStore {
    }

    public static class MemoryStore3 extends MemoryStore {
    }

    public static class MemoryStore4 extends MemoryStore {
    }

    public static class MemoryStore5 extends MemoryStore {
    }

    public static class MemoryStore6 extends MemoryStore {
    }

    public static class MemoryStore7 extends MemoryStore {
    }

    public static class MemoryStore8 extends MemoryStore {
    }

    public static class MemoryStore9 extends MemoryStore {
    }

    static {
        Hashtable[] hashtableArr = new Hashtable[10];
        for (int i = 0; i < 10; i++) {
            hashtableArr[i] = new Hashtable(1);
        }
        b = hashtableArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r0 <= 10) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MemoryStore() throws NoSuchAlgorithmException {
        int i;
        String name = getClass().getName();
        if (name.startsWith(JCP.MEMORY_STORE_CLASS_PREFIX)) {
            String substring = name.substring(49);
            if (substring.length() != 0) {
                try {
                    i = Integer.parseInt(substring);
                    if (i >= 0) {
                    }
                } catch (NumberFormatException unused) {
                }
            }
        } else if (!name.equals("ru.CryptoPro.JCP.KeyStore.MemoryStore")) {
            throw new NoSuchAlgorithmException();
        }
        i = -1;
        this.a = i == -1 ? new Hashtable(1) : b[i];
    }

    @Override // java.security.KeyStoreSpi
    public final Enumeration engineAliases() {
        return this.a.keys();
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineContainsAlias(String str) {
        return this.a.containsKey(str);
    }

    @Override // java.security.KeyStoreSpi
    public final void engineDeleteEntry(String str) {
        this.a.remove(str);
    }

    @Override // java.security.KeyStoreSpi
    public final Certificate engineGetCertificate(String str) {
        zi10 zi10Var = (zi10) this.a.get(str);
        if (zi10Var == null) {
            return null;
        }
        Certificate certificate = zi10Var.c;
        if (certificate != null) {
            return certificate;
        }
        Certificate[] certificateArr = zi10Var.d;
        if (certificateArr != null) {
            return certificateArr[0];
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public final String engineGetCertificateAlias(Certificate certificate) {
        Certificate certificate2;
        Certificate[] certificateArr;
        Certificate certificate3;
        Hashtable hashtable = this.a;
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            zi10 zi10Var = (zi10) hashtable.get(str);
            if (zi10Var != null && (((certificate2 = zi10Var.c) != null && certificate2.equals(certificate)) || ((certificateArr = zi10Var.d) != null && (certificate3 = certificateArr[0]) != null && certificate3.equals(certificate)))) {
                return str;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public final Certificate[] engineGetCertificateChain(String str) {
        zi10 zi10Var = (zi10) this.a.get(str);
        if (zi10Var == null) {
            return null;
        }
        return (Certificate[]) zi10Var.d.clone();
    }

    @Override // java.security.KeyStoreSpi
    public final Date engineGetCreationDate(String str) {
        zi10 zi10Var = (zi10) this.a.get(str);
        if (zi10Var == null) {
            return null;
        }
        return zi10Var.e;
    }

    @Override // java.security.KeyStoreSpi
    public final Key engineGetKey(String str, char[] cArr) {
        Key key;
        zi10 zi10Var = (zi10) this.a.get(str);
        if (zi10Var == null || (key = zi10Var.b) == null) {
            return null;
        }
        if (Arrays.equals(cArr, zi10Var.a)) {
            return key;
        }
        throw new UnrecoverableKeyException();
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsCertificateEntry(String str) {
        zi10 zi10Var = (zi10) this.a.get(str);
        return (zi10Var == null || zi10Var.c == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsKeyEntry(String str) {
        zi10 zi10Var = (zi10) this.a.get(str);
        return (zi10Var == null || zi10Var.b == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public final void engineLoad(InputStream inputStream, char[] cArr) {
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetCertificateEntry(String str, Certificate certificate) {
        Hashtable hashtable = this.a;
        hashtable.remove(str);
        hashtable.put(str, new zi10(null, null, certificate, null));
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        Hashtable hashtable = this.a;
        hashtable.remove(str);
        hashtable.put(str, new zi10(cArr, key, null, certificateArr));
    }

    @Override // java.security.KeyStoreSpi
    public final int engineSize() {
        return this.a.size();
    }

    @Override // java.security.KeyStoreSpi
    public final void engineStore(OutputStream outputStream, char[] cArr) {
        if (outputStream != null) {
            throw new IOException();
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new KeyStoreException();
    }
}
