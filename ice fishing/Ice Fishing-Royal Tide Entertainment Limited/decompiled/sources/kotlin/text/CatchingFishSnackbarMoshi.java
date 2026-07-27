package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishSnackbarMoshi {
    public static final CatchingFishSnackbarMoshi CatchingFishDaggerWebsocket;
    public static final CatchingFishSnackbarMoshi CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishSnackbarMoshi[] CatchingFishViewModelScope;
    public static final CatchingFishSnackbarMoshi CatchingFishWorkManager;

    /* JADX INFO: Fake field, exist only in values array */
    CatchingFishSnackbarMoshi EF0;

    static {
        CatchingFishSnackbarMoshi catchingFishSnackbarMoshi = new CatchingFishSnackbarMoshi("PENALTY_LOG", 0);
        CatchingFishSnackbarMoshi catchingFishSnackbarMoshi2 = new CatchingFishSnackbarMoshi("PENALTY_DEATH", 1);
        CatchingFishSnackbarMoshi catchingFishSnackbarMoshi3 = new CatchingFishSnackbarMoshi("DETECT_FRAGMENT_REUSE", 2);
        CatchingFishReduxKtor = catchingFishSnackbarMoshi3;
        CatchingFishSnackbarMoshi catchingFishSnackbarMoshi4 = new CatchingFishSnackbarMoshi("DETECT_FRAGMENT_TAG_USAGE", 3);
        CatchingFishDaggerWebsocket = catchingFishSnackbarMoshi4;
        CatchingFishSnackbarMoshi catchingFishSnackbarMoshi5 = new CatchingFishSnackbarMoshi("DETECT_RETAIN_INSTANCE_USAGE", 4);
        CatchingFishSnackbarMoshi catchingFishSnackbarMoshi6 = new CatchingFishSnackbarMoshi("DETECT_SET_USER_VISIBLE_HINT", 5);
        CatchingFishSnackbarMoshi catchingFishSnackbarMoshi7 = new CatchingFishSnackbarMoshi("DETECT_TARGET_FRAGMENT_USAGE", 6);
        CatchingFishSnackbarMoshi catchingFishSnackbarMoshi8 = new CatchingFishSnackbarMoshi("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        CatchingFishWorkManager = catchingFishSnackbarMoshi8;
        CatchingFishViewModelScope = new CatchingFishSnackbarMoshi[]{catchingFishSnackbarMoshi, catchingFishSnackbarMoshi2, catchingFishSnackbarMoshi3, catchingFishSnackbarMoshi4, catchingFishSnackbarMoshi5, catchingFishSnackbarMoshi6, catchingFishSnackbarMoshi7, catchingFishSnackbarMoshi8};
    }

    public static CatchingFishSnackbarMoshi valueOf(String str) {
        return (CatchingFishSnackbarMoshi) Enum.valueOf(CatchingFishSnackbarMoshi.class, str);
    }

    public static CatchingFishSnackbarMoshi[] values() {
        return (CatchingFishSnackbarMoshi[]) CatchingFishViewModelScope.clone();
    }
}
