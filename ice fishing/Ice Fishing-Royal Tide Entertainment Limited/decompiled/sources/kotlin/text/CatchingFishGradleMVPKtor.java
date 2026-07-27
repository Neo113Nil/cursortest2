package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishGradleMVPKtor {
    public static final CatchingFishGradleMVPKtor CatchingFishDaggerWebsocket;
    public static final CatchingFishGradleMVPKtor CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishGradleMVPKtor[] CatchingFishWorkManager;

    static {
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor = new CatchingFishGradleMVPKtor("Ltr", 0);
        CatchingFishReduxKtor = catchingFishGradleMVPKtor;
        CatchingFishGradleMVPKtor catchingFishGradleMVPKtor2 = new CatchingFishGradleMVPKtor("Rtl", 1);
        CatchingFishDaggerWebsocket = catchingFishGradleMVPKtor2;
        CatchingFishWorkManager = new CatchingFishGradleMVPKtor[]{catchingFishGradleMVPKtor, catchingFishGradleMVPKtor2};
    }

    public static CatchingFishGradleMVPKtor valueOf(String str) {
        return (CatchingFishGradleMVPKtor) Enum.valueOf(CatchingFishGradleMVPKtor.class, str);
    }

    public static CatchingFishGradleMVPKtor[] values() {
        return (CatchingFishGradleMVPKtor[]) CatchingFishWorkManager.clone();
    }
}
