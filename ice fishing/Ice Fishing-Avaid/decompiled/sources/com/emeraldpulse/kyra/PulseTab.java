package com.emeraldpulse.kyra;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/emeraldpulse/kyra/PulseTab;", "", "label", "", "iconRes", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getIconRes", "()I", "Rooms", "Supplies", "Fixes", "Costs", "Score", "app_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class PulseTab {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PulseTab[] $VALUES;
    private final int iconRes;
    private final String label;
    public static final PulseTab Rooms = new PulseTab("Rooms", 0, "Rooms", R.drawable.ep_tab_rooms);
    public static final PulseTab Supplies = new PulseTab("Supplies", 1, "Supplies", R.drawable.ep_tab_inventory);
    public static final PulseTab Fixes = new PulseTab("Fixes", 2, "Fixes", R.drawable.ep_tab_fixes);
    public static final PulseTab Costs = new PulseTab("Costs", 3, "Costs", R.drawable.ep_tab_costs);
    public static final PulseTab Score = new PulseTab("Score", 4, "Score", R.drawable.ep_tab_readiness);

    private static final /* synthetic */ PulseTab[] $values() {
        return new PulseTab[]{Rooms, Supplies, Fixes, Costs, Score};
    }

    public static EnumEntries<PulseTab> getEntries() {
        return $ENTRIES;
    }

    private PulseTab(String str, int i, String str2, int i2) {
        this.label = str2;
        this.iconRes = i2;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getLabel() {
        return this.label;
    }

    static {
        PulseTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PulseTab valueOf(String str) {
        return (PulseTab) Enum.valueOf(PulseTab.class, str);
    }

    public static PulseTab[] values() {
        return (PulseTab[]) $VALUES.clone();
    }
}
