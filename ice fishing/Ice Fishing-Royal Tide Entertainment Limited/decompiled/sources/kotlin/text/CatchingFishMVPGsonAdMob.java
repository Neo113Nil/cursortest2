package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishMVPGsonAdMob {
    public static final CatchingFishMVPGsonAdMob CatchingFishDaggerWebsocket;
    public static final CatchingFishMVPGsonAdMob CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishMVPGsonAdMob[] CatchingFishViewModelScope;
    public static final CatchingFishMVPGsonAdMob CatchingFishWorkManager;

    static {
        CatchingFishMVPGsonAdMob catchingFishMVPGsonAdMob = new CatchingFishMVPGsonAdMob("IsPlacedInLookahead", 0);
        CatchingFishReduxKtor = catchingFishMVPGsonAdMob;
        CatchingFishMVPGsonAdMob catchingFishMVPGsonAdMob2 = new CatchingFishMVPGsonAdMob("IsPlacedInApproach", 1);
        CatchingFishDaggerWebsocket = catchingFishMVPGsonAdMob2;
        CatchingFishMVPGsonAdMob catchingFishMVPGsonAdMob3 = new CatchingFishMVPGsonAdMob("IsNotPlaced", 2);
        CatchingFishWorkManager = catchingFishMVPGsonAdMob3;
        CatchingFishViewModelScope = new CatchingFishMVPGsonAdMob[]{catchingFishMVPGsonAdMob, catchingFishMVPGsonAdMob2, catchingFishMVPGsonAdMob3};
    }

    public static CatchingFishMVPGsonAdMob valueOf(String str) {
        return (CatchingFishMVPGsonAdMob) Enum.valueOf(CatchingFishMVPGsonAdMob.class, str);
    }

    public static CatchingFishMVPGsonAdMob[] values() {
        return (CatchingFishMVPGsonAdMob[]) CatchingFishViewModelScope.clone();
    }
}
