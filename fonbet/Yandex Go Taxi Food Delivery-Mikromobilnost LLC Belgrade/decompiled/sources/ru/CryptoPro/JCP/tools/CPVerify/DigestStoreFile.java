package ru.CryptoPro.JCP.tools.CPVerify;

import defpackage.w511;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class DigestStoreFile implements DigestStore {
    public static final int DIGEST_LENGTH = 32;
    public final StoreNLoad a;
    public InsideKey[] b = new InsideKey[0];

    public static class InsideKey {
        public final byte[] a;
        public final String b;

        public InsideKey(byte[] bArr, String str) {
            this.b = str;
            this.a = bArr;
        }
    }

    public static class StoreNLoad {
        public File a;

        public final void a(InsideKey[] insideKeyArr) {
            byte[] bArr = new byte[0];
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.a);
                try {
                    byte[] byteArray = Array.toByteArray(insideKeyArr.length);
                    byte[] a = DigestStoreFile.a(bArr, byteArray);
                    fileOutputStream2.write(byteArray);
                    for (int i = 0; i < insideKeyArr.length; i++) {
                        byte[] bytes = insideKeyArr[i].b.getBytes("UTF-8");
                        byte[] byteArray2 = Array.toByteArray(bytes.length);
                        byte[] a2 = DigestStoreFile.a(DigestStoreFile.a(a, byteArray2), bytes);
                        byte[] bArr2 = new byte[byteArray2.length + 32 + bytes.length];
                        byte[] bArr3 = insideKeyArr[i].a;
                        a = DigestStoreFile.a(a2, bArr3);
                        System.arraycopy(bArr3, 0, bArr2, 0, 32);
                        System.arraycopy(byteArray2, 0, bArr2, 32, byteArray2.length);
                        System.arraycopy(bytes, 0, bArr2, byteArray2.length + 32, bytes.length);
                        fileOutputStream2.write(bArr2);
                    }
                    fileOutputStream2.write(new ListDigest(a).getDigest());
                    fileOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final InsideKey[] b() {
            FileInputStream fileInputStream;
            Vector vector = new Vector(0);
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(this.a);
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[0];
                byte[] bArr2 = new byte[4];
                int read = fileInputStream.read(bArr2, 0, 4);
                if (read == -1 || read < 4) {
                    throw new CPVerifyException(3);
                }
                int i = Array.getInt(bArr2, 0);
                if (i > 65536 || i > (fileInputStream.available() >>> 5)) {
                    throw new CPVerifyException(3);
                }
                byte[] a = DigestStoreFile.a(bArr, bArr2);
                for (int i2 = 0; i2 < i; i2++) {
                    byte[] bArr3 = new byte[36];
                    if (fileInputStream.read(bArr3) != 36) {
                        throw new CPVerifyException(3);
                    }
                    int i3 = Array.getInt(bArr3, 32);
                    if (i3 > 65536 || i3 > fileInputStream.available()) {
                        throw new CPVerifyException(3);
                    }
                    byte[] bArr4 = new byte[i3];
                    byte[] a2 = DigestStoreFile.a(a, Array.toByteArray(i3));
                    if (fileInputStream.read(bArr4) != i3) {
                        throw new CPVerifyException(3);
                    }
                    String str = new String(bArr4);
                    byte[] bArr5 = new byte[32];
                    System.arraycopy(bArr3, 0, bArr5, 0, 32);
                    InsideKey insideKey = new InsideKey(bArr5, str);
                    a = DigestStoreFile.a(DigestStoreFile.a(a2, bArr4), bArr5);
                    vector.add(insideKey);
                }
                byte[] bArr6 = new byte[32];
                int read2 = fileInputStream.read(bArr6, 0, 32);
                if (read2 == -1 || read2 < 32) {
                    throw new CPVerifyException(3);
                }
                if (!new ListDigest(a).verifyDigest(bArr6)) {
                    throw new CPVerifyException(2);
                }
                fileInputStream.close();
                int size = vector.size();
                InsideKey[] insideKeyArr = new InsideKey[size];
                for (int i4 = 0; i4 < size; i4++) {
                    insideKeyArr[i4] = (InsideKey) vector.elementAt(i4);
                }
                return insideKeyArr;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        }
    }

    public DigestStoreFile(File file) {
        File absoluteFile = file.getAbsoluteFile();
        StoreNLoad storeNLoad = new StoreNLoad();
        storeNLoad.a = absoluteFile;
        this.a = storeNLoad;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean canRead() {
        File file = this.a.a;
        return file.canRead() && file.isFile();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean canWrite() {
        File file = this.a.a;
        return file.canWrite() && file.isFile();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean deleteKey(String str) {
        boolean z;
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.b;
            if (i >= insideKeyArr.length) {
                z = false;
                i = 0;
                break;
            }
            if (insideKeyArr[i].b.equals(str)) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return false;
        }
        InsideKey[] insideKeyArr2 = this.b;
        int length = insideKeyArr2.length;
        int i2 = length - 1;
        InsideKey[] insideKeyArr3 = new InsideKey[i2];
        if (i > 0) {
            System.arraycopy(insideKeyArr2, 0, insideKeyArr3, 0, i);
        }
        if (i < i2) {
            int i3 = i + 1;
            System.arraycopy(this.b, i3, insideKeyArr3, i, length - i3);
        }
        this.b = insideKeyArr3;
        return true;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public byte[] getDigest(String str) {
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.b;
            if (i >= insideKeyArr.length) {
                return null;
            }
            if (insideKeyArr[i].b.equals(str)) {
                return this.b[i].a;
            }
            i++;
        }
    }

    public File getFile() {
        return this.a.a;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String getKeyValue(String str) {
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.b;
            if (i >= insideKeyArr.length) {
                return null;
            }
            if (insideKeyArr[i].b.equals(str)) {
                return this.b[i].b;
            }
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String[] getKeys() {
        String[] strArr = new String[this.b.length];
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.b;
            if (i >= insideKeyArr.length) {
                return strArr;
            }
            strArr[i] = insideKeyArr[i].b;
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String getStoreName() {
        return getFile().getAbsolutePath();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean isExist() {
        File file = this.a.a;
        return file.exists() && file.isFile();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String[] readStore() throws CPVerifyException {
        try {
            InsideKey[] b = this.a.b();
            this.b = b;
            int length = b.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = this.b[i].b;
            }
            return strArr;
        } catch (IOException unused) {
            throw new CPVerifyException(0);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public void resetStore() throws CPVerifyException {
        this.b = new InsideKey[0];
        writeStore();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String writeKey(String str, byte[] bArr) {
        String str2;
        String str3 = null;
        if (str == null || bArr == null) {
            w511.q();
            return null;
        }
        if (bArr.length != 32) {
            w511.q();
            return null;
        }
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        InsideKey insideKey = new InsideKey(bArr2, str);
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.b;
            int length = insideKeyArr.length;
            str2 = insideKey.b;
            if (i >= length) {
                break;
            }
            if (insideKeyArr[i].b.equals(str)) {
                this.b[i] = insideKey;
                str3 = str2;
                break;
            }
            i++;
        }
        if (str3 != null) {
            return str3;
        }
        InsideKey[] insideKeyArr2 = this.b;
        int length2 = insideKeyArr2.length;
        InsideKey[] insideKeyArr3 = new InsideKey[length2 + 1];
        System.arraycopy(insideKeyArr2, 0, insideKeyArr3, 0, length2);
        insideKeyArr3[length2] = insideKey;
        this.b = insideKeyArr3;
        return str2;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public void writeStore() throws CPVerifyException {
        try {
            this.a.a(this.b);
        } catch (IOException unused) {
            throw new CPVerifyException(0);
        }
    }
}
