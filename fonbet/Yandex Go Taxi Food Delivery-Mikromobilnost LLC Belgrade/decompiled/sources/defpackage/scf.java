package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class scf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OutputPrefixType.values().length];
        a = iArr;
        try {
            iArr[OutputPrefixType.LEGACY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[OutputPrefixType.TINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[OutputPrefixType.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
