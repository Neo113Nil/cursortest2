package just.adapter.snapping;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SnappingCallbacksHelper$State.values().length];
        try {
            iArr[SnappingCallbacksHelper$State.IN_PROCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SnappingCallbacksHelper$State.ENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SnappingCallbacksHelper$State.TERMINAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
