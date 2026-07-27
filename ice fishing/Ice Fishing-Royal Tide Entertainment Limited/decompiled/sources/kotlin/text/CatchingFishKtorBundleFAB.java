package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishKtorBundleFAB {
    public static final CatchingFishKtorBundleFAB CatchingFishDaggerWebsocket;
    public static final CatchingFishKtorBundleFAB CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishKtorBundleFAB[] CatchingFishViewModelScope;
    public static final CatchingFishKtorBundleFAB CatchingFishWorkManager;

    static {
        CatchingFishKtorBundleFAB catchingFishKtorBundleFAB = new CatchingFishKtorBundleFAB("START", 0);
        CatchingFishReduxKtor = catchingFishKtorBundleFAB;
        CatchingFishKtorBundleFAB catchingFishKtorBundleFAB2 = new CatchingFishKtorBundleFAB("STOP", 1);
        CatchingFishDaggerWebsocket = catchingFishKtorBundleFAB2;
        CatchingFishKtorBundleFAB catchingFishKtorBundleFAB3 = new CatchingFishKtorBundleFAB("STOP_AND_RESET_REPLAY_CACHE", 2);
        CatchingFishWorkManager = catchingFishKtorBundleFAB3;
        CatchingFishViewModelScope = new CatchingFishKtorBundleFAB[]{catchingFishKtorBundleFAB, catchingFishKtorBundleFAB2, catchingFishKtorBundleFAB3};
    }

    public static CatchingFishKtorBundleFAB valueOf(String str) {
        return (CatchingFishKtorBundleFAB) Enum.valueOf(CatchingFishKtorBundleFAB.class, str);
    }

    public static CatchingFishKtorBundleFAB[] values() {
        return (CatchingFishKtorBundleFAB[]) CatchingFishViewModelScope.clone();
    }
}
