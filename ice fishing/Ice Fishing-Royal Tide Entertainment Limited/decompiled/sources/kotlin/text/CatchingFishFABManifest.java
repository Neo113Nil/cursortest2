package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishFABManifest {
    public static final CatchingFishFABManifest CatchingFishDaggerWebsocket;
    public static final CatchingFishFABManifest CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishFABManifest[] CatchingFishViewModelFAB;
    public static final CatchingFishFABManifest CatchingFishViewModelScope;
    public static final CatchingFishFABManifest CatchingFishWorkManager;

    static {
        CatchingFishFABManifest catchingFishFABManifest = new CatchingFishFABManifest("DEFAULT", 0);
        CatchingFishReduxKtor = catchingFishFABManifest;
        CatchingFishFABManifest catchingFishFABManifest2 = new CatchingFishFABManifest("LAZY", 1);
        CatchingFishDaggerWebsocket = catchingFishFABManifest2;
        CatchingFishFABManifest catchingFishFABManifest3 = new CatchingFishFABManifest("ATOMIC", 2);
        CatchingFishWorkManager = catchingFishFABManifest3;
        CatchingFishFABManifest catchingFishFABManifest4 = new CatchingFishFABManifest("UNDISPATCHED", 3);
        CatchingFishViewModelScope = catchingFishFABManifest4;
        CatchingFishViewModelFAB = new CatchingFishFABManifest[]{catchingFishFABManifest, catchingFishFABManifest2, catchingFishFABManifest3, catchingFishFABManifest4};
    }

    public static CatchingFishFABManifest valueOf(String str) {
        return (CatchingFishFABManifest) Enum.valueOf(CatchingFishFABManifest.class, str);
    }

    public static CatchingFishFABManifest[] values() {
        return (CatchingFishFABManifest[]) CatchingFishViewModelFAB.clone();
    }
}
