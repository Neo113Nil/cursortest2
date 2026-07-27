package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishJUnitFragment {
    public static final /* synthetic */ CatchingFishJUnitFragment[] CatchingFishDaggerWebsocket;
    public static final CatchingFishJUnitFragment CatchingFishReduxKtor;

    static {
        CatchingFishJUnitFragment catchingFishJUnitFragment = new CatchingFishJUnitFragment("WARNING", 0);
        CatchingFishReduxKtor = catchingFishJUnitFragment;
        CatchingFishDaggerWebsocket = new CatchingFishJUnitFragment[]{catchingFishJUnitFragment, new CatchingFishJUnitFragment("ERROR", 1), new CatchingFishJUnitFragment("HIDDEN", 2)};
    }

    public static CatchingFishJUnitFragment valueOf(String str) {
        return (CatchingFishJUnitFragment) Enum.valueOf(CatchingFishJUnitFragment.class, str);
    }

    public static CatchingFishJUnitFragment[] values() {
        return (CatchingFishJUnitFragment[]) CatchingFishDaggerWebsocket.clone();
    }
}
