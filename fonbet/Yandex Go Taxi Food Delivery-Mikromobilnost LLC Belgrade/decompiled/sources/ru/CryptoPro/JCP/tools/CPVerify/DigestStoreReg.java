package ru.CryptoPro.JCP.tools.CPVerify;

import defpackage.nzs;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class DigestStoreReg implements DigestStore {
    public static final int DIGEST_LENGTH = 32;
    public InsideKey[] a = new InsideKey[0];

    /* renamed from: ru.CryptoPro.JCP.tools.CPVerify.DigestStoreReg$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            Boolean bool = Boolean.TRUE;
            try {
                String[] keys = new JCPPref(DigestStoreReg.class).keys("DigestStoreREG");
                if (keys == null) {
                    return Boolean.FALSE;
                }
                if (DigestStoreReg.a("DigestStoreREGkeyforhash", keys) != -1 && DigestStoreReg.a("DigestStoreREGkeyforcount", keys) != -1) {
                    return bool;
                }
                return Boolean.FALSE;
            } catch (BackingStoreException unused) {
                return Boolean.FALSE;
            }
        }
    }

    public static class InsideKey {
        public final byte[] a;
        public final String b;

        public InsideKey(byte[] bArr, String str) {
            this.b = str;
            this.a = bArr;
        }
    }

    public static int a(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] c(InsideKey[] insideKeyArr) {
        byte[] bArr = new byte[0];
        if (insideKeyArr.length > 1) {
            for (int i = 1; i < insideKeyArr.length; i++) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (insideKeyArr[i2].b.compareTo(insideKeyArr[i].b) > 0) {
                        InsideKey insideKey = insideKeyArr[i];
                        insideKeyArr[i] = insideKeyArr[i2];
                        insideKeyArr[i2] = insideKey;
                    }
                }
            }
        }
        byte[] b = b(bArr, Array.toByteArray(insideKeyArr.length));
        for (int i3 = 0; i3 < insideKeyArr.length; i3++) {
            b = b(b(b, insideKeyArr[i3].a), insideKeyArr[i3].b.getBytes("UTF-8"));
        }
        return b;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean canRead() {
        return isExist();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean canWrite() {
        boolean isExist = isExist();
        return isExist ? nzs.u(DigestStoreReg.class) : isExist;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean deleteKey(String str) {
        boolean z;
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.a;
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
        InsideKey[] insideKeyArr2 = this.a;
        int length = insideKeyArr2.length;
        int i2 = length - 1;
        InsideKey[] insideKeyArr3 = new InsideKey[i2];
        if (i > 0) {
            System.arraycopy(insideKeyArr2, 0, insideKeyArr3, 0, i);
        }
        if (i < i2) {
            int i3 = i + 1;
            System.arraycopy(this.a, i3, insideKeyArr3, i, length - i3);
        }
        this.a = insideKeyArr3;
        return true;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public byte[] getDigest(String str) {
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.a;
            if (i >= insideKeyArr.length) {
                return null;
            }
            if (insideKeyArr[i].b.equals(str)) {
                return this.a[i].a;
            }
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String getKeyValue(String str) {
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.a;
            if (i >= insideKeyArr.length) {
                return null;
            }
            if (insideKeyArr[i].b.equals(str)) {
                return this.a[i].b;
            }
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String[] getKeys() {
        String[] strArr = new String[this.a.length];
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.a;
            if (i >= insideKeyArr.length) {
                return strArr;
            }
            strArr[i] = insideKeyArr[i].b;
            i++;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String getStoreName() {
        return "Preferences";
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean isExist() {
        return ((Boolean) AccessController.doPrivileged(new AnonymousClass1())).booleanValue();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String[] readStore() throws CPVerifyException {
        Object doPrivileged = AccessController.doPrivileged((PrivilegedAction<Object>) new PrivilegedAction() { // from class: ru.CryptoPro.JCP.tools.CPVerify.DigestStoreReg.2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v20 */
            /* JADX WARN: Type inference failed for: r0v21 */
            /* JADX WARN: Type inference failed for: r0v22 */
            /* JADX WARN: Type inference failed for: r0v23 */
            /* JADX WARN: Type inference failed for: r0v24 */
            /* JADX WARN: Type inference failed for: r0v25 */
            /* JADX WARN: Type inference failed for: r0v26 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String[]] */
            @Override // java.security.PrivilegedAction
            public Object run() {
                ?? r0;
                CPVerifyException cPVerifyException;
                int i;
                byte[] bArr;
                DigestStoreReg digestStoreReg = DigestStoreReg.this;
                int i2 = 0;
                try {
                    try {
                        JCPPref jCPPref = new JCPPref(DigestStoreReg.class);
                        String[] keys = jCPPref.keys("DigestStoreREG");
                        int i3 = 3;
                        if (keys == null) {
                            r0 = new CPVerifyException(3);
                        } else {
                            int a = DigestStoreReg.a("DigestStoreREGkeyforhash", keys);
                            int a2 = DigestStoreReg.a("DigestStoreREGkeyforcount", keys);
                            if (a != -1 && a2 != -1) {
                                int i4 = 2;
                                InsideKey[] insideKeyArr = new InsideKey[keys.length - 2];
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= keys.length) {
                                        cPVerifyException = null;
                                        break;
                                    }
                                    if (i5 == a2 || i5 == a) {
                                        i = i4;
                                    } else {
                                        byte[] byteArraySilent = jCPPref.getByteArraySilent(keys[i5], null);
                                        if (byteArraySilent == null) {
                                            cPVerifyException = new CPVerifyException(i3);
                                            break;
                                        }
                                        i = i4;
                                        String str = byteArraySilent.length < 33 ? null : new String(byteArraySilent, 32, byteArraySilent.length - 33, "UTF-8");
                                        if (byteArraySilent.length < 33) {
                                            bArr = null;
                                        } else {
                                            bArr = new byte[32];
                                            System.arraycopy(byteArraySilent, 0, bArr, 0, 32);
                                        }
                                        insideKeyArr[i5] = new InsideKey(bArr, str);
                                    }
                                    i5++;
                                    i4 = i;
                                    i3 = 3;
                                }
                                int i6 = i4;
                                if (cPVerifyException == null) {
                                    int i7 = jCPPref.getInt("DigestStoreREGkeyforcount", -1);
                                    if (i7 != -1 && i7 == keys.length - 2) {
                                        byte[] byteArraySilent2 = jCPPref.getByteArraySilent("DigestStoreREGkeyforhash", null);
                                        if (byteArraySilent2 == null) {
                                            r0 = new CPVerifyException(3);
                                        } else {
                                            try {
                                                if (new ListDigest(DigestStoreReg.c(insideKeyArr)).verifyDigest(byteArraySilent2)) {
                                                    digestStoreReg.a = insideKeyArr;
                                                } else {
                                                    r0 = new CPVerifyException(i6);
                                                }
                                            } catch (IOException unused) {
                                                r0 = new CPVerifyException(0);
                                            }
                                        }
                                    }
                                    r0 = new CPVerifyException(3);
                                }
                                r0 = cPVerifyException;
                            }
                            r0 = new CPVerifyException(3);
                        }
                    } catch (UnsupportedEncodingException e) {
                        CPVerifyException cPVerifyException2 = new CPVerifyException(0);
                        cPVerifyException2.initCause(e);
                        r0 = cPVerifyException2;
                    }
                } catch (BackingStoreException unused2) {
                    r0 = new CPVerifyException(1);
                }
                if (r0 == 0) {
                    r0 = new String[digestStoreReg.a.length];
                    while (true) {
                        InsideKey[] insideKeyArr2 = digestStoreReg.a;
                        if (i2 >= insideKeyArr2.length) {
                            break;
                        }
                        r0[i2] = insideKeyArr2[i2].b;
                        i2++;
                    }
                }
                return r0;
            }
        });
        if (doPrivileged instanceof String[]) {
            return (String[]) doPrivileged;
        }
        if (doPrivileged instanceof CPVerifyException) {
            throw ((CPVerifyException) doPrivileged);
        }
        throw new CPVerifyException(0);
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public void resetStore() throws CPVerifyException {
        this.a = new InsideKey[0];
        writeStore();
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String writeKey(String str, byte[] bArr) {
        String str2;
        String str3;
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        InsideKey insideKey = new InsideKey(bArr2, str);
        int i = 0;
        while (true) {
            InsideKey[] insideKeyArr = this.a;
            int length = insideKeyArr.length;
            str2 = insideKey.b;
            if (i >= length) {
                str3 = null;
                break;
            }
            if (insideKeyArr[i].b.equals(str)) {
                this.a[i] = insideKey;
                str3 = str2;
                break;
            }
            i++;
        }
        if (str3 != null) {
            return str3;
        }
        InsideKey[] insideKeyArr2 = this.a;
        int length2 = insideKeyArr2.length;
        InsideKey[] insideKeyArr3 = new InsideKey[length2 + 1];
        System.arraycopy(insideKeyArr2, 0, insideKeyArr3, 0, length2);
        insideKeyArr3[length2] = insideKey;
        this.a = insideKeyArr3;
        return str2;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public void writeStore() throws CPVerifyException {
        byte[] bArr;
        boolean z;
        JCPPref jCPPref = new JCPPref(DigestStoreReg.class);
        try {
            String[] keys = jCPPref.keys("DigestStoreREG");
            if (keys != null) {
                for (String str : keys) {
                    jCPPref.remove(str);
                }
            }
            InsideKey[] insideKeyArr = this.a;
            int length = insideKeyArr.length;
            try {
                try {
                    bArr = new ListDigest(c(insideKeyArr)).getDigest();
                    z = true;
                } catch (IOException unused) {
                    bArr = null;
                    z = false;
                }
                if (!z || bArr == null) {
                    throw new CPVerifyException(0);
                }
                int i = 0;
                while (true) {
                    try {
                        InsideKey[] insideKeyArr2 = this.a;
                        if (i >= insideKeyArr2.length) {
                            jCPPref.putByteArray("DigestStoreREGkeyforhash", bArr);
                            jCPPref.putInt("DigestStoreREGkeyforcount", length);
                            return;
                        }
                        byte[] bytes = insideKeyArr2[i].b.getBytes("UTF-8");
                        byte[] bArr2 = this.a[i].a;
                        byte[] bArr3 = new byte[bytes.length + 33];
                        System.arraycopy(bArr2, 0, bArr3, 0, 32);
                        System.arraycopy(bytes, 0, bArr3, 32, bytes.length);
                        bArr3[bytes.length + 32] = 0;
                        jCPPref.putByteArray("DigestStoreREG" + Long.toString(i), bArr3);
                        i++;
                    } catch (UnsupportedEncodingException e) {
                        CPVerifyException cPVerifyException = new CPVerifyException(0);
                        cPVerifyException.initCause(e);
                        throw cPVerifyException;
                    } catch (SecurityException unused2) {
                        throw new CPVerifyException(1);
                    }
                }
            } catch (UnsupportedEncodingException e2) {
                CPVerifyException cPVerifyException2 = new CPVerifyException(0);
                cPVerifyException2.initCause(e2);
                throw cPVerifyException2;
            }
        } catch (BackingStoreException unused3) {
            throw new CPVerifyException(1);
        }
    }
}
