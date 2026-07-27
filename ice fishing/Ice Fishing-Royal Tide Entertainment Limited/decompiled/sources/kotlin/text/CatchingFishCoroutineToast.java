package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishCoroutineToast {
    public static final CatchingFishCoroutineToast CatchingFishDaggerWebsocket;
    public static final CatchingFishCoroutineToast CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishCoroutineToast[] CatchingFishViewModelScope;
    public static final CatchingFishCoroutineToast CatchingFishWorkManager;

    static {
        CatchingFishCoroutineToast catchingFishCoroutineToast = new CatchingFishCoroutineToast("SUSPEND", 0);
        CatchingFishReduxKtor = catchingFishCoroutineToast;
        CatchingFishCoroutineToast catchingFishCoroutineToast2 = new CatchingFishCoroutineToast("DROP_OLDEST", 1);
        CatchingFishDaggerWebsocket = catchingFishCoroutineToast2;
        CatchingFishCoroutineToast catchingFishCoroutineToast3 = new CatchingFishCoroutineToast("DROP_LATEST", 2);
        CatchingFishWorkManager = catchingFishCoroutineToast3;
        CatchingFishViewModelScope = new CatchingFishCoroutineToast[]{catchingFishCoroutineToast, catchingFishCoroutineToast2, catchingFishCoroutineToast3};
    }

    public static CatchingFishCoroutineToast valueOf(String str) {
        return (CatchingFishCoroutineToast) Enum.valueOf(CatchingFishCoroutineToast.class, str);
    }

    public static CatchingFishCoroutineToast[] values() {
        return (CatchingFishCoroutineToast[]) CatchingFishViewModelScope.clone();
    }
}
