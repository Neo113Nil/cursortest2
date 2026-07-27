package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishHandlerFAB {
    public static final CatchingFishHandlerFAB CatchingFishDaggerWebsocket;
    public static final CatchingFishHandlerFAB CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishHandlerFAB[] CatchingFishWorkManager;

    static {
        CatchingFishHandlerFAB catchingFishHandlerFAB = new CatchingFishHandlerFAB("SHOW_ORIGINAL", 0);
        CatchingFishReduxKtor = catchingFishHandlerFAB;
        CatchingFishHandlerFAB catchingFishHandlerFAB2 = new CatchingFishHandlerFAB("SHOW_TRANSLATED", 1);
        CatchingFishDaggerWebsocket = catchingFishHandlerFAB2;
        CatchingFishWorkManager = new CatchingFishHandlerFAB[]{catchingFishHandlerFAB, catchingFishHandlerFAB2};
    }

    public static CatchingFishHandlerFAB valueOf(String str) {
        return (CatchingFishHandlerFAB) Enum.valueOf(CatchingFishHandlerFAB.class, str);
    }

    public static CatchingFishHandlerFAB[] values() {
        return (CatchingFishHandlerFAB[]) CatchingFishWorkManager.clone();
    }
}
