package ru.yandex.taxi.address.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/address/models/SourcePicker;", "", "", "source", "Ljava/lang/String;", "a", "()Ljava/lang/String;", JCP.RAW_PREFIX, "A_FROM_HOME", "B_FROM_HOME", "A_FROM_ORDER", "B_FROM_ORDER", "A_FROM_SUMMARY", "B_FROM_SUMMARY", "ADDITIONAL_FROM_SUMMARY", "FROM_ROUTE_SELECTOR", "FROM_TRANSPORT_DISCOVERY", "FROM_TRANSPORT_SUMMARY", "DESTINATION_FROM_ROUTE_SELECTOR", "SHORTCUT_REQUESTED_FROM_HOME", "SOURCE_FROM_DELIVERY", "DEST_FROM_DELIVERY", "DEST_FROM_PVZ", "DEST_FROM_SHORTCUTS_SCREEN", "DEST_FROM_DELIVERY_DASHBOARD", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourcePicker {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SourcePicker[] $VALUES;
    public static final SourcePicker ADDITIONAL_FROM_SUMMARY;
    public static final SourcePicker A_FROM_HOME;
    public static final SourcePicker A_FROM_ORDER;
    public static final SourcePicker A_FROM_SUMMARY;
    public static final SourcePicker B_FROM_HOME;
    public static final SourcePicker B_FROM_ORDER;
    public static final SourcePicker B_FROM_SUMMARY;
    public static final SourcePicker DESTINATION_FROM_ROUTE_SELECTOR;
    public static final SourcePicker DEST_FROM_DELIVERY;
    public static final SourcePicker DEST_FROM_DELIVERY_DASHBOARD;
    public static final SourcePicker DEST_FROM_PVZ;
    public static final SourcePicker DEST_FROM_SHORTCUTS_SCREEN;
    public static final SourcePicker FROM_ROUTE_SELECTOR;
    public static final SourcePicker FROM_TRANSPORT_DISCOVERY;
    public static final SourcePicker FROM_TRANSPORT_SUMMARY;
    public static final SourcePicker NONE;
    public static final SourcePicker SHORTCUT_REQUESTED_FROM_HOME;
    public static final SourcePicker SOURCE_FROM_DELIVERY;
    private final String source;

    static {
        SourcePicker sourcePicker = new SourcePicker(JCP.RAW_PREFIX, 0, null);
        NONE = sourcePicker;
        SourcePicker sourcePicker2 = new SourcePicker("A_FROM_HOME", 1, "starting_main");
        A_FROM_HOME = sourcePicker2;
        SourcePicker sourcePicker3 = new SourcePicker("B_FROM_HOME", 2, "destination_main");
        B_FROM_HOME = sourcePicker3;
        SourcePicker sourcePicker4 = new SourcePicker("A_FROM_ORDER", 3, "starting_multiorder");
        A_FROM_ORDER = sourcePicker4;
        SourcePicker sourcePicker5 = new SourcePicker("B_FROM_ORDER", 4, "destination_multiorder");
        B_FROM_ORDER = sourcePicker5;
        SourcePicker sourcePicker6 = new SourcePicker("A_FROM_SUMMARY", 5, "starting_summary");
        A_FROM_SUMMARY = sourcePicker6;
        SourcePicker sourcePicker7 = new SourcePicker("B_FROM_SUMMARY", 6, "destination_summary");
        B_FROM_SUMMARY = sourcePicker7;
        SourcePicker sourcePicker8 = new SourcePicker("ADDITIONAL_FROM_SUMMARY", 7, "additional_summary");
        ADDITIONAL_FROM_SUMMARY = sourcePicker8;
        SourcePicker sourcePicker9 = new SourcePicker("FROM_ROUTE_SELECTOR", 8, "starting_edit");
        FROM_ROUTE_SELECTOR = sourcePicker9;
        SourcePicker sourcePicker10 = new SourcePicker("FROM_TRANSPORT_DISCOVERY", 9, "transport_discovery");
        FROM_TRANSPORT_DISCOVERY = sourcePicker10;
        SourcePicker sourcePicker11 = new SourcePicker("FROM_TRANSPORT_SUMMARY", 10, "transport_summary");
        FROM_TRANSPORT_SUMMARY = sourcePicker11;
        SourcePicker sourcePicker12 = new SourcePicker("DESTINATION_FROM_ROUTE_SELECTOR", 11, "destination_edit");
        DESTINATION_FROM_ROUTE_SELECTOR = sourcePicker12;
        SourcePicker sourcePicker13 = new SourcePicker("SHORTCUT_REQUESTED_FROM_HOME", 12, "shortcut_retry_home");
        SHORTCUT_REQUESTED_FROM_HOME = sourcePicker13;
        SourcePicker sourcePicker14 = new SourcePicker("SOURCE_FROM_DELIVERY", 13, "starting_delivery");
        SOURCE_FROM_DELIVERY = sourcePicker14;
        SourcePicker sourcePicker15 = new SourcePicker("DEST_FROM_DELIVERY", 14, "destination_delivery");
        DEST_FROM_DELIVERY = sourcePicker15;
        SourcePicker sourcePicker16 = new SourcePicker("DEST_FROM_PVZ", 15, "destination_pvz");
        DEST_FROM_PVZ = sourcePicker16;
        SourcePicker sourcePicker17 = new SourcePicker("DEST_FROM_SHORTCUTS_SCREEN", 16, "destination_shortcuts_screen");
        DEST_FROM_SHORTCUTS_SCREEN = sourcePicker17;
        SourcePicker sourcePicker18 = new SourcePicker("DEST_FROM_DELIVERY_DASHBOARD", 17, "destination_delivery_dashboard");
        DEST_FROM_DELIVERY_DASHBOARD = sourcePicker18;
        SourcePicker[] sourcePickerArr = {sourcePicker, sourcePicker2, sourcePicker3, sourcePicker4, sourcePicker5, sourcePicker6, sourcePicker7, sourcePicker8, sourcePicker9, sourcePicker10, sourcePicker11, sourcePicker12, sourcePicker13, sourcePicker14, sourcePicker15, sourcePicker16, sourcePicker17, sourcePicker18};
        $VALUES = sourcePickerArr;
        $ENTRIES = a.a(sourcePickerArr);
    }

    public SourcePicker(String str, int i, String str2) {
        this.source = str2;
    }

    public static SourcePicker valueOf(String str) {
        return (SourcePicker) Enum.valueOf(SourcePicker.class, str);
    }

    public static SourcePicker[] values() {
        return (SourcePicker[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public SourcePicker b(boolean z) {
        if (this == SHORTCUT_REQUESTED_FROM_HOME || this == A_FROM_HOME || this == B_FROM_HOME) {
            return z ? A_FROM_HOME : B_FROM_HOME;
        }
        SourcePicker sourcePicker = A_FROM_SUMMARY;
        return (this == sourcePicker || this == B_FROM_SUMMARY) ? z ? sourcePicker : B_FROM_SUMMARY : this;
    }
}
