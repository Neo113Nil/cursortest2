package kotlin.text;

/* loaded from: classes.dex */
public abstract /* synthetic */ class CatchingFishParcelableKtor {
    public static final /* synthetic */ int[] CatchingFishParcelableFAB;

    static {
        int[] iArr = new int[CatchingFishToolbarLiveData.values().length];
        try {
            iArr[CatchingFishToolbarLiveData.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CatchingFishToolbarLiveData.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CatchingFishToolbarLiveData.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        CatchingFishParcelableFAB = iArr;
    }
}
