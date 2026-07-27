package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishLayoutWebSocket {
    public static final CatchingFishLayoutWebSocket CatchingFishDaggerWebsocket;
    public static final CatchingFishLayoutWebSocket CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishLayoutWebSocket[] CatchingFishViewModelScope;
    public static final CatchingFishLayoutWebSocket CatchingFishWorkManager;

    static {
        CatchingFishLayoutWebSocket catchingFishLayoutWebSocket = new CatchingFishLayoutWebSocket("Unknown", 0);
        CatchingFishReduxKtor = catchingFishLayoutWebSocket;
        CatchingFishLayoutWebSocket catchingFishLayoutWebSocket2 = new CatchingFishLayoutWebSocket("Dispatching", 1);
        CatchingFishDaggerWebsocket = catchingFishLayoutWebSocket2;
        CatchingFishLayoutWebSocket catchingFishLayoutWebSocket3 = new CatchingFishLayoutWebSocket("NotDispatching", 2);
        CatchingFishWorkManager = catchingFishLayoutWebSocket3;
        CatchingFishViewModelScope = new CatchingFishLayoutWebSocket[]{catchingFishLayoutWebSocket, catchingFishLayoutWebSocket2, catchingFishLayoutWebSocket3};
    }

    public static CatchingFishLayoutWebSocket valueOf(String str) {
        return (CatchingFishLayoutWebSocket) Enum.valueOf(CatchingFishLayoutWebSocket.class, str);
    }

    public static CatchingFishLayoutWebSocket[] values() {
        return (CatchingFishLayoutWebSocket[]) CatchingFishViewModelScope.clone();
    }
}
