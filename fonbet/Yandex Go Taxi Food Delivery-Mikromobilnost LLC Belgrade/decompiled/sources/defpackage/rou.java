package defpackage;

import com.google.crypto.tink.proto.HashType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class rou {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HashType.values().length];
        a = iArr;
        try {
            iArr[HashType.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[HashType.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[HashType.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[HashType.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[HashType.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
