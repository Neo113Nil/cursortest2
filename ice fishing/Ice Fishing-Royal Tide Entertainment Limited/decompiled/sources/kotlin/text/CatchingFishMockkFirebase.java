package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishMockkFirebase {
    public static final CatchingFishMockkFirebase CatchingFishDaggerWebsocket;
    public static final /* synthetic */ CatchingFishMockkFirebase[] CatchingFishLayout;
    public static final CatchingFishMockkFirebase CatchingFishReduxKtor;
    public static final CatchingFishMockkFirebase CatchingFishViewModelFAB;
    public static final CatchingFishMockkFirebase CatchingFishViewModelScope;
    public static final CatchingFishMockkFirebase CatchingFishWorkManager;

    static {
        CatchingFishMockkFirebase catchingFishMockkFirebase = new CatchingFishMockkFirebase("DESTROYED", 0);
        CatchingFishReduxKtor = catchingFishMockkFirebase;
        CatchingFishMockkFirebase catchingFishMockkFirebase2 = new CatchingFishMockkFirebase("INITIALIZED", 1);
        CatchingFishDaggerWebsocket = catchingFishMockkFirebase2;
        CatchingFishMockkFirebase catchingFishMockkFirebase3 = new CatchingFishMockkFirebase("CREATED", 2);
        CatchingFishWorkManager = catchingFishMockkFirebase3;
        CatchingFishMockkFirebase catchingFishMockkFirebase4 = new CatchingFishMockkFirebase("STARTED", 3);
        CatchingFishViewModelScope = catchingFishMockkFirebase4;
        CatchingFishMockkFirebase catchingFishMockkFirebase5 = new CatchingFishMockkFirebase("RESUMED", 4);
        CatchingFishViewModelFAB = catchingFishMockkFirebase5;
        CatchingFishLayout = new CatchingFishMockkFirebase[]{catchingFishMockkFirebase, catchingFishMockkFirebase2, catchingFishMockkFirebase3, catchingFishMockkFirebase4, catchingFishMockkFirebase5};
    }

    public static CatchingFishMockkFirebase valueOf(String str) {
        return (CatchingFishMockkFirebase) Enum.valueOf(CatchingFishMockkFirebase.class, str);
    }

    public static CatchingFishMockkFirebase[] values() {
        return (CatchingFishMockkFirebase[]) CatchingFishLayout.clone();
    }
}
