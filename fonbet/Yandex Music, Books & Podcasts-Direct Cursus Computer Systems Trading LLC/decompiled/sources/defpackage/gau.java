package defpackage;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class gau {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[kyf.values().length];
        try {
            iArr[kyf.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kyf.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
