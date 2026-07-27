package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishMVVMRoom {
    public static final CatchingFishMVVMRoom CatchingFishDaggerWebsocket;
    public static final CatchingFishMVVMRoom CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishMVVMRoom[] CatchingFishViewModelFAB;
    public static final CatchingFishMVVMRoom CatchingFishViewModelScope;
    public static final CatchingFishMVVMRoom CatchingFishWorkManager;

    static {
        CatchingFishMVVMRoom catchingFishMVVMRoom = new CatchingFishMVVMRoom("LookaheadMeasurement", 0);
        CatchingFishReduxKtor = catchingFishMVVMRoom;
        CatchingFishMVVMRoom catchingFishMVVMRoom2 = new CatchingFishMVVMRoom("LookaheadPlacement", 1);
        CatchingFishDaggerWebsocket = catchingFishMVVMRoom2;
        CatchingFishMVVMRoom catchingFishMVVMRoom3 = new CatchingFishMVVMRoom("Measurement", 2);
        CatchingFishWorkManager = catchingFishMVVMRoom3;
        CatchingFishMVVMRoom catchingFishMVVMRoom4 = new CatchingFishMVVMRoom("Placement", 3);
        CatchingFishViewModelScope = catchingFishMVVMRoom4;
        CatchingFishViewModelFAB = new CatchingFishMVVMRoom[]{catchingFishMVVMRoom, catchingFishMVVMRoom2, catchingFishMVVMRoom3, catchingFishMVVMRoom4};
    }

    public static CatchingFishMVVMRoom valueOf(String str) {
        return (CatchingFishMVVMRoom) Enum.valueOf(CatchingFishMVVMRoom.class, str);
    }

    public static CatchingFishMVVMRoom[] values() {
        return (CatchingFishMVVMRoom[]) CatchingFishViewModelFAB.clone();
    }
}
