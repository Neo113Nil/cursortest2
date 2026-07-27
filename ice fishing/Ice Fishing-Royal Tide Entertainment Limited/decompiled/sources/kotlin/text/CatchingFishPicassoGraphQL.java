package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishPicassoGraphQL {
    public static final CatchingFishPicassoGraphQL CatchingFishDaggerWebsocket;
    public static final CatchingFishPicassoGraphQL CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishPicassoGraphQL[] CatchingFishViewModelScope;
    public static final CatchingFishPicassoGraphQL CatchingFishWorkManager;

    static {
        CatchingFishPicassoGraphQL catchingFishPicassoGraphQL = new CatchingFishPicassoGraphQL("NETWORK_UNMETERED", 0);
        CatchingFishReduxKtor = catchingFishPicassoGraphQL;
        CatchingFishPicassoGraphQL catchingFishPicassoGraphQL2 = new CatchingFishPicassoGraphQL("DEVICE_IDLE", 1);
        CatchingFishDaggerWebsocket = catchingFishPicassoGraphQL2;
        CatchingFishPicassoGraphQL catchingFishPicassoGraphQL3 = new CatchingFishPicassoGraphQL("DEVICE_CHARGING", 2);
        CatchingFishWorkManager = catchingFishPicassoGraphQL3;
        CatchingFishViewModelScope = new CatchingFishPicassoGraphQL[]{catchingFishPicassoGraphQL, catchingFishPicassoGraphQL2, catchingFishPicassoGraphQL3};
    }

    public static CatchingFishPicassoGraphQL valueOf(String str) {
        return (CatchingFishPicassoGraphQL) Enum.valueOf(CatchingFishPicassoGraphQL.class, str);
    }

    public static CatchingFishPicassoGraphQL[] values() {
        return (CatchingFishPicassoGraphQL[]) CatchingFishViewModelScope.clone();
    }
}
