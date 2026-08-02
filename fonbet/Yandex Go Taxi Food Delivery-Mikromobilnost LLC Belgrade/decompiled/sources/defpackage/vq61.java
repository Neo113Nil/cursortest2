package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public class vq61 extends KeyStoreSpi {
    public final KeyStore a = KeyStore.getInstance("HDImageFileInternal", "JCSP");

    @Override // java.security.KeyStoreSpi
    public final Enumeration engineAliases() {
        try {
            return this.a.aliases();
        } catch (KeyStoreException e) {
            ny61.o(e);
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineContainsAlias(String str) {
        try {
            return this.a.containsAlias(str);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return false;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineDeleteEntry(String str) {
        this.a.deleteEntry(str);
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineEntryInstanceOf(String str, Class cls) {
        try {
            return this.a.entryInstanceOf(str, cls);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return false;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Certificate engineGetCertificate(String str) {
        try {
            return this.a.getCertificate(str);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final String engineGetCertificateAlias(Certificate certificate) {
        try {
            return this.a.getCertificateAlias(certificate);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Certificate[] engineGetCertificateChain(String str) {
        try {
            return this.a.getCertificateChain(str);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final Date engineGetCreationDate(String str) {
        try {
            return this.a.getCreationDate(str);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final KeyStore.Entry engineGetEntry(String str, KeyStore.ProtectionParameter protectionParameter) {
        return this.a.getEntry(str, protectionParameter);
    }

    @Override // java.security.KeyStoreSpi
    public final Key engineGetKey(String str, char[] cArr) {
        try {
            return this.a.getKey(str, cArr);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsCertificateEntry(String str) {
        try {
            return this.a.isCertificateEntry(str);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return false;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final boolean engineIsKeyEntry(String str) {
        try {
            return this.a.isKeyEntry(str);
        } catch (KeyStoreException e) {
            ny61.o(e);
            return false;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineLoad(InputStream inputStream, char[] cArr) {
        this.a.load(inputStream, cArr);
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetCertificateEntry(String str, Certificate certificate) {
        this.a.setCertificateEntry(str, certificate);
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetEntry(String str, KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) {
        this.a.setEntry(str, entry, protectionParameter);
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        this.a.setKeyEntry(str, key, cArr, certificateArr);
    }

    @Override // java.security.KeyStoreSpi
    public final int engineSize() {
        try {
            return this.a.size();
        } catch (KeyStoreException e) {
            ny61.o(e);
            return 0;
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineStore(OutputStream outputStream, char[] cArr) {
        try {
            this.a.store(outputStream, cArr);
        } catch (KeyStoreException e) {
            ny61.o(e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public final void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
        this.a.load(loadStoreParameter);
    }

    @Override // java.security.KeyStoreSpi
    public final void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        this.a.setKeyEntry(str, bArr, certificateArr);
    }

    @Override // java.security.KeyStoreSpi
    public final void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
        try {
            this.a.store(loadStoreParameter);
        } catch (KeyStoreException e) {
            ny61.o(e);
        }
    }
}
