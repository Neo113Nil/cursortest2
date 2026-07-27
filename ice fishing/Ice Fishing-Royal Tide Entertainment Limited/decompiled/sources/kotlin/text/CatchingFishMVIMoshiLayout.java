package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishMVIMoshiLayout {
    public static final /* synthetic */ CatchingFishMVIMoshiLayout[] CatchingFishDaggerWebsocket;
    public static final CatchingFishMVIMoshiLayout CatchingFishReduxKtor;

    static {
        CatchingFishMVIMoshiLayout catchingFishMVIMoshiLayout = new CatchingFishMVIMoshiLayout("DEFAULT", 0);
        CatchingFishReduxKtor = catchingFishMVIMoshiLayout;
        CatchingFishDaggerWebsocket = new CatchingFishMVIMoshiLayout[]{catchingFishMVIMoshiLayout, new CatchingFishMVIMoshiLayout("SIGNED", 1), new CatchingFishMVIMoshiLayout("FIXED", 2)};
    }

    public static CatchingFishMVIMoshiLayout valueOf(String str) {
        return (CatchingFishMVIMoshiLayout) Enum.valueOf(CatchingFishMVIMoshiLayout.class, str);
    }

    public static CatchingFishMVIMoshiLayout[] values() {
        return (CatchingFishMVIMoshiLayout[]) CatchingFishDaggerWebsocket.clone();
    }
}
