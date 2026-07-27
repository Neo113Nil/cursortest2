package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishKtorHiltKtor {
    public static final CatchingFishKtorHiltKtor CatchingFishDaggerWebsocket;
    public static final /* synthetic */ CatchingFishKtorHiltKtor[] CatchingFishLayout;
    public static final CatchingFishKtorHiltKtor CatchingFishReduxKtor;
    public static final CatchingFishKtorHiltKtor CatchingFishViewModelFAB;
    public static final CatchingFishKtorHiltKtor CatchingFishViewModelScope;
    public static final CatchingFishKtorHiltKtor CatchingFishWorkManager;

    static {
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor = new CatchingFishKtorHiltKtor("CPU_ACQUIRED", 0);
        CatchingFishReduxKtor = catchingFishKtorHiltKtor;
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor2 = new CatchingFishKtorHiltKtor("BLOCKING", 1);
        CatchingFishDaggerWebsocket = catchingFishKtorHiltKtor2;
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor3 = new CatchingFishKtorHiltKtor("PARKING", 2);
        CatchingFishWorkManager = catchingFishKtorHiltKtor3;
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor4 = new CatchingFishKtorHiltKtor("DORMANT", 3);
        CatchingFishViewModelScope = catchingFishKtorHiltKtor4;
        CatchingFishKtorHiltKtor catchingFishKtorHiltKtor5 = new CatchingFishKtorHiltKtor("TERMINATED", 4);
        CatchingFishViewModelFAB = catchingFishKtorHiltKtor5;
        CatchingFishLayout = new CatchingFishKtorHiltKtor[]{catchingFishKtorHiltKtor, catchingFishKtorHiltKtor2, catchingFishKtorHiltKtor3, catchingFishKtorHiltKtor4, catchingFishKtorHiltKtor5};
    }

    public static CatchingFishKtorHiltKtor valueOf(String str) {
        return (CatchingFishKtorHiltKtor) Enum.valueOf(CatchingFishKtorHiltKtor.class, str);
    }

    public static CatchingFishKtorHiltKtor[] values() {
        return (CatchingFishKtorHiltKtor[]) CatchingFishLayout.clone();
    }
}
