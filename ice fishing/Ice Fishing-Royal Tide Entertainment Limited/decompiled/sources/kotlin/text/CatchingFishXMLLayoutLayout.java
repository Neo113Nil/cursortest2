package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishXMLLayoutLayout {
    public static final CatchingFishXMLLayoutLayout CatchingFishDaggerWebsocket;
    public static final CatchingFishXMLLayoutLayout CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishXMLLayoutLayout[] CatchingFishViewModelFAB;
    public static final CatchingFishXMLLayoutLayout CatchingFishViewModelScope;
    public static final CatchingFishXMLLayoutLayout CatchingFishWorkManager;

    static {
        CatchingFishXMLLayoutLayout catchingFishXMLLayoutLayout = new CatchingFishXMLLayoutLayout("IGNORED", 0);
        CatchingFishReduxKtor = catchingFishXMLLayoutLayout;
        CatchingFishXMLLayoutLayout catchingFishXMLLayoutLayout2 = new CatchingFishXMLLayoutLayout("SCHEDULED", 1);
        CatchingFishDaggerWebsocket = catchingFishXMLLayoutLayout2;
        CatchingFishXMLLayoutLayout catchingFishXMLLayoutLayout3 = new CatchingFishXMLLayoutLayout("DEFERRED", 2);
        CatchingFishWorkManager = catchingFishXMLLayoutLayout3;
        CatchingFishXMLLayoutLayout catchingFishXMLLayoutLayout4 = new CatchingFishXMLLayoutLayout("IMMINENT", 3);
        CatchingFishViewModelScope = catchingFishXMLLayoutLayout4;
        CatchingFishViewModelFAB = new CatchingFishXMLLayoutLayout[]{catchingFishXMLLayoutLayout, catchingFishXMLLayoutLayout2, catchingFishXMLLayoutLayout3, catchingFishXMLLayoutLayout4};
    }

    public static CatchingFishXMLLayoutLayout valueOf(String str) {
        return (CatchingFishXMLLayoutLayout) Enum.valueOf(CatchingFishXMLLayoutLayout.class, str);
    }

    public static CatchingFishXMLLayoutLayout[] values() {
        return (CatchingFishXMLLayoutLayout[]) CatchingFishViewModelFAB.clone();
    }
}
