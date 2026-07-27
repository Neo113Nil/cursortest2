package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishKtorToastRedux {
    public static final CatchingFishKtorToastRedux CatchingFishDaggerWebsocket;
    public static final CatchingFishKtorToastRedux CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishKtorToastRedux[] CatchingFishViewModelScope;
    public static final CatchingFishKtorToastRedux CatchingFishWorkManager;

    static {
        CatchingFishKtorToastRedux catchingFishKtorToastRedux = new CatchingFishKtorToastRedux("None", 0);
        CatchingFishReduxKtor = catchingFishKtorToastRedux;
        CatchingFishKtorToastRedux catchingFishKtorToastRedux2 = new CatchingFishKtorToastRedux("Cancelled", 1);
        CatchingFishDaggerWebsocket = catchingFishKtorToastRedux2;
        CatchingFishKtorToastRedux catchingFishKtorToastRedux3 = new CatchingFishKtorToastRedux("Redirected", 2);
        CatchingFishWorkManager = catchingFishKtorToastRedux3;
        CatchingFishViewModelScope = new CatchingFishKtorToastRedux[]{catchingFishKtorToastRedux, catchingFishKtorToastRedux2, catchingFishKtorToastRedux3, new CatchingFishKtorToastRedux("RedirectCancelled", 3)};
    }

    public static CatchingFishKtorToastRedux valueOf(String str) {
        return (CatchingFishKtorToastRedux) Enum.valueOf(CatchingFishKtorToastRedux.class, str);
    }

    public static CatchingFishKtorToastRedux[] values() {
        return (CatchingFishKtorToastRedux[]) CatchingFishViewModelScope.clone();
    }
}
