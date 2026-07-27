package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishBundleEspresso {
    public static final CatchingFishBundleEspresso CatchingFishDaggerWebsocket;
    public static final CatchingFishBundleEspresso CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishBundleEspresso[] CatchingFishWorkManager;

    static {
        CatchingFishBundleEspresso catchingFishBundleEspresso = new CatchingFishBundleEspresso("On", 0);
        CatchingFishReduxKtor = catchingFishBundleEspresso;
        CatchingFishBundleEspresso catchingFishBundleEspresso2 = new CatchingFishBundleEspresso("Off", 1);
        CatchingFishDaggerWebsocket = catchingFishBundleEspresso2;
        CatchingFishWorkManager = new CatchingFishBundleEspresso[]{catchingFishBundleEspresso, catchingFishBundleEspresso2, new CatchingFishBundleEspresso("Indeterminate", 2)};
    }

    public static CatchingFishBundleEspresso valueOf(String str) {
        return (CatchingFishBundleEspresso) Enum.valueOf(CatchingFishBundleEspresso.class, str);
    }

    public static CatchingFishBundleEspresso[] values() {
        return (CatchingFishBundleEspresso[]) CatchingFishWorkManager.clone();
    }
}
