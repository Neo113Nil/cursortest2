package kotlin.text;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishJUnitWidget {
    public static final /* synthetic */ CatchingFishJUnitWidget[] CatchingFishDaggerWebsocket;
    public static final CatchingFishJUnitWidget CatchingFishReduxKtor;

    static {
        CatchingFishJUnitWidget catchingFishJUnitWidget = new CatchingFishJUnitWidget("DEFAULT", 0);
        CatchingFishReduxKtor = catchingFishJUnitWidget;
        CatchingFishJUnitWidget catchingFishJUnitWidget2 = new CatchingFishJUnitWidget("UNMETERED_ONLY", 1);
        CatchingFishJUnitWidget catchingFishJUnitWidget3 = new CatchingFishJUnitWidget("UNMETERED_OR_DAILY", 2);
        CatchingFishJUnitWidget catchingFishJUnitWidget4 = new CatchingFishJUnitWidget("FAST_IF_RADIO_AWAKE", 3);
        CatchingFishJUnitWidget catchingFishJUnitWidget5 = new CatchingFishJUnitWidget("NEVER", 4);
        CatchingFishJUnitWidget catchingFishJUnitWidget6 = new CatchingFishJUnitWidget("UNRECOGNIZED", 5);
        CatchingFishDaggerWebsocket = new CatchingFishJUnitWidget[]{catchingFishJUnitWidget, catchingFishJUnitWidget2, catchingFishJUnitWidget3, catchingFishJUnitWidget4, catchingFishJUnitWidget5, catchingFishJUnitWidget6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, catchingFishJUnitWidget);
        sparseArray.put(1, catchingFishJUnitWidget2);
        sparseArray.put(2, catchingFishJUnitWidget3);
        sparseArray.put(3, catchingFishJUnitWidget4);
        sparseArray.put(4, catchingFishJUnitWidget5);
        sparseArray.put(-1, catchingFishJUnitWidget6);
    }

    public static CatchingFishJUnitWidget valueOf(String str) {
        return (CatchingFishJUnitWidget) Enum.valueOf(CatchingFishJUnitWidget.class, str);
    }

    public static CatchingFishJUnitWidget[] values() {
        return (CatchingFishJUnitWidget[]) CatchingFishDaggerWebsocket.clone();
    }
}
