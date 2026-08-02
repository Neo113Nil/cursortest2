package defpackage;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a8s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[kyf.values().length];
        try {
            iArr[kyf.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kyf.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kyf.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kyf.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
