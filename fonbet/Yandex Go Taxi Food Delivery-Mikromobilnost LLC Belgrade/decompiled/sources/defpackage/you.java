package defpackage;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.OutputPrefixType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class you {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        b = iArr;
        try {
            iArr[OutputPrefixType.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[OutputPrefixType.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[HashType.values().length];
        a = iArr2;
        try {
            iArr2[HashType.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[HashType.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[HashType.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[HashType.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[HashType.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
