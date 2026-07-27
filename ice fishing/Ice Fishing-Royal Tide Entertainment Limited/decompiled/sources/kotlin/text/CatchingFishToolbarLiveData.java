package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishToolbarLiveData {
    private static final /* synthetic */ CatchingFishIntentMoshiMVI $ENTRIES;
    private static final /* synthetic */ CatchingFishToolbarLiveData[] $VALUES;
    public static final CatchingFishFABMVVMService Companion;
    public static final CatchingFishToolbarLiveData ON_ANY;
    public static final CatchingFishToolbarLiveData ON_CREATE;
    public static final CatchingFishToolbarLiveData ON_DESTROY;
    public static final CatchingFishToolbarLiveData ON_PAUSE;
    public static final CatchingFishToolbarLiveData ON_RESUME;
    public static final CatchingFishToolbarLiveData ON_START;
    public static final CatchingFishToolbarLiveData ON_STOP;

    static {
        CatchingFishToolbarLiveData catchingFishToolbarLiveData = new CatchingFishToolbarLiveData("ON_CREATE", 0);
        ON_CREATE = catchingFishToolbarLiveData;
        CatchingFishToolbarLiveData catchingFishToolbarLiveData2 = new CatchingFishToolbarLiveData("ON_START", 1);
        ON_START = catchingFishToolbarLiveData2;
        CatchingFishToolbarLiveData catchingFishToolbarLiveData3 = new CatchingFishToolbarLiveData("ON_RESUME", 2);
        ON_RESUME = catchingFishToolbarLiveData3;
        CatchingFishToolbarLiveData catchingFishToolbarLiveData4 = new CatchingFishToolbarLiveData("ON_PAUSE", 3);
        ON_PAUSE = catchingFishToolbarLiveData4;
        CatchingFishToolbarLiveData catchingFishToolbarLiveData5 = new CatchingFishToolbarLiveData("ON_STOP", 4);
        ON_STOP = catchingFishToolbarLiveData5;
        CatchingFishToolbarLiveData catchingFishToolbarLiveData6 = new CatchingFishToolbarLiveData("ON_DESTROY", 5);
        ON_DESTROY = catchingFishToolbarLiveData6;
        CatchingFishToolbarLiveData catchingFishToolbarLiveData7 = new CatchingFishToolbarLiveData("ON_ANY", 6);
        ON_ANY = catchingFishToolbarLiveData7;
        CatchingFishToolbarLiveData[] catchingFishToolbarLiveDataArr = {catchingFishToolbarLiveData, catchingFishToolbarLiveData2, catchingFishToolbarLiveData3, catchingFishToolbarLiveData4, catchingFishToolbarLiveData5, catchingFishToolbarLiveData6, catchingFishToolbarLiveData7};
        $VALUES = catchingFishToolbarLiveDataArr;
        $ENTRIES = new CatchingFishRetrofitMoshi(catchingFishToolbarLiveDataArr);
        Companion = new CatchingFishFABMVVMService();
    }

    public static CatchingFishToolbarLiveData valueOf(String str) {
        return (CatchingFishToolbarLiveData) Enum.valueOf(CatchingFishToolbarLiveData.class, str);
    }

    public static CatchingFishToolbarLiveData[] values() {
        return (CatchingFishToolbarLiveData[]) $VALUES.clone();
    }

    public final CatchingFishMockkFirebase CatchingFishParcelableFAB() {
        switch (CatchingFishExoPlayerLayout.CatchingFishParcelableFAB[ordinal()]) {
            case 1:
            case 2:
                return CatchingFishMockkFirebase.CatchingFishWorkManager;
            case 3:
            case 4:
                return CatchingFishMockkFirebase.CatchingFishViewModelScope;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return CatchingFishMockkFirebase.CatchingFishViewModelFAB;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                return CatchingFishMockkFirebase.CatchingFishReduxKtor;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new CatchingFishBiometricView();
        }
    }
}
