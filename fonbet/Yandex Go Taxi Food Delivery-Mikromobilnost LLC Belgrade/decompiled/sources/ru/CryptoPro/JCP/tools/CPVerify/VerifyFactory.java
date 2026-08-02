package ru.CryptoPro.JCP.tools.CPVerify;

import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class VerifyFactory implements DigestStore {
    public VerifiedFileListElement[] a = new VerifiedFileListElement[0];
    public DigestStore b;

    public VerifyFactory(DigestStore digestStore) {
        this.b = digestStore;
    }

    public static boolean createDigest(VerifiedFileListElement verifiedFileListElement) {
        boolean z = false;
        if (!verifiedFileListElement.getFile().exists()) {
            verifiedFileListElement.setStatus(4);
            return false;
        }
        try {
            verifiedFileListElement.setDigest(new FileDigest(verifiedFileListElement.getFile()).getDigest());
            z = true;
        } catch (IOException unused) {
            verifiedFileListElement.setStatus(3);
        }
        if (z) {
            verifiedFileListElement.setStatus(1);
        }
        return z;
    }

    public static boolean createSeveral(VerifiedFileListElement[] verifiedFileListElementArr) {
        boolean z = true;
        for (VerifiedFileListElement verifiedFileListElement : verifiedFileListElementArr) {
            z &= createDigest(verifiedFileListElement);
        }
        return z;
    }

    public static boolean verifyFile(VerifiedFileListElement verifiedFileListElement) {
        boolean z = false;
        if (!verifiedFileListElement.getFile().exists()) {
            verifiedFileListElement.setStatus(4);
            return false;
        }
        if (verifiedFileListElement.getStatus() == 4) {
            return false;
        }
        try {
            z = new FileDigest(verifiedFileListElement.getFile()).verifyDigest(verifiedFileListElement.getDigest());
        } catch (IOException unused) {
            verifiedFileListElement.setStatus(3);
        }
        verifiedFileListElement.setStatus(z ? 1 : 2);
        return z;
    }

    public static boolean verifySeveral(VerifiedFileListElement[] verifiedFileListElementArr) {
        boolean z = true;
        for (VerifiedFileListElement verifiedFileListElement : verifiedFileListElementArr) {
            z &= verifyFile(verifiedFileListElement);
        }
        return z;
    }

    public void add(File[] fileArr) {
        VerifiedFileListElement[] verifiedFileListElementArr = new VerifiedFileListElement[fileArr.length];
        int i = 0;
        for (int i2 = 0; i2 < fileArr.length; i2++) {
            int i3 = 0;
            while (true) {
                VerifiedFileListElement[] verifiedFileListElementArr2 = this.a;
                if (i3 >= verifiedFileListElementArr2.length) {
                    verifiedFileListElementArr[i] = new VerifiedFileListElement(fileArr[i2], 3, null);
                    i++;
                    break;
                } else if (verifiedFileListElementArr2[i3].getFile().equals(fileArr[i2])) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        VerifiedFileListElement[] verifiedFileListElementArr3 = this.a;
        VerifiedFileListElement[] verifiedFileListElementArr4 = new VerifiedFileListElement[verifiedFileListElementArr3.length + i];
        System.arraycopy(verifiedFileListElementArr3, 0, verifiedFileListElementArr4, 0, verifiedFileListElementArr3.length);
        System.arraycopy(verifiedFileListElementArr, 0, verifiedFileListElementArr4, this.a.length, i);
        this.a = verifiedFileListElementArr4;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean canRead() {
        return this.b.canRead();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean canWrite() {
        return this.b.canWrite();
    }

    public boolean createAll() {
        boolean z = true;
        int i = 0;
        while (true) {
            VerifiedFileListElement[] verifiedFileListElementArr = this.a;
            if (i >= verifiedFileListElementArr.length) {
                return z;
            }
            z &= createDigest(verifiedFileListElementArr[i]);
            i++;
        }
    }

    public void delete(int[] iArr) {
        VerifiedFileListElement[] verifiedFileListElementArr = new VerifiedFileListElement[this.a.length - iArr.length];
        int i = 0;
        if (iArr.length > 0) {
            int i2 = 0;
            while (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                for (int i4 = i3; i4 < iArr.length; i4++) {
                    int i5 = iArr[i2];
                    int i6 = iArr[i4];
                    if (i5 > i6) {
                        iArr[i2] = i6;
                        iArr[i4] = i5;
                    }
                }
                i2 = i3;
            }
        }
        int i7 = -1;
        int i8 = 0;
        while (true) {
            int length = iArr.length;
            VerifiedFileListElement[] verifiedFileListElementArr2 = this.a;
            if (i >= length) {
                System.arraycopy(verifiedFileListElementArr2, i7 + 1, verifiedFileListElementArr, i8, (verifiedFileListElementArr2.length - i7) - 1);
                this.a = verifiedFileListElementArr;
                return;
            }
            System.arraycopy(verifiedFileListElementArr2, i7 + 1, verifiedFileListElementArr, i8, (iArr[i] - i7) - 1);
            int i9 = iArr[i];
            i8 += (i9 - i7) - 1;
            this.b.deleteKey(this.a[i9].getFile().toString());
            i++;
            i7 = i9;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean deleteKey(String str) {
        return this.b.deleteKey(str);
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public byte[] getDigest(String str) {
        return this.b.getDigest(str);
    }

    public VerifiedFileListElement[] getFiles() {
        return this.a;
    }

    public VerifiedFileListElement[] getFilesFromStore() throws CPVerifyException {
        String[] readStore = readStore();
        VerifiedFileListElement[] verifiedFileListElementArr = new VerifiedFileListElement[readStore.length];
        for (int i = 0; i < readStore.length; i++) {
            verifiedFileListElementArr[i] = new VerifiedFileListElement(new File(this.b.getKeyValue(readStore[i])), 3, this.b.getDigest(readStore[i]));
        }
        this.a = verifiedFileListElementArr;
        return getFiles();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String getKeyValue(String str) {
        return this.b.getKeyValue(str);
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String[] getKeys() {
        return this.b.getKeys();
    }

    public DigestStore getStore() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String getStoreName() {
        return this.b.getStoreName();
    }

    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean isExist() {
        return this.b.isExist();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String[] readStore() throws CPVerifyException {
        return this.b.readStore();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public void resetStore() throws CPVerifyException {
        this.b.resetStore();
        this.a = new VerifiedFileListElement[0];
    }

    public boolean save() throws CPVerifyException {
        DigestStore digestStore;
        boolean verifyAll = verifyAll();
        if (verifyAll) {
            int i = 0;
            while (true) {
                VerifiedFileListElement[] verifiedFileListElementArr = this.a;
                int length = verifiedFileListElementArr.length;
                digestStore = this.b;
                if (i >= length) {
                    break;
                }
                digestStore.writeKey(verifiedFileListElementArr[i].getFile().toString(), this.a[i].getDigest());
                i++;
            }
            digestStore.writeStore();
        }
        return verifyAll;
    }

    public void setStore(DigestStore digestStore) {
        this.b = digestStore;
    }

    public boolean verifyAll() {
        boolean z = true;
        int i = 0;
        while (true) {
            VerifiedFileListElement[] verifiedFileListElementArr = this.a;
            if (i >= verifiedFileListElementArr.length) {
                return z;
            }
            z &= verifyFile(verifiedFileListElementArr[i]);
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String writeKey(String str, byte[] bArr) {
        return this.b.writeKey(str, bArr);
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public void writeStore() throws CPVerifyException {
        this.b.writeStore();
    }
}
