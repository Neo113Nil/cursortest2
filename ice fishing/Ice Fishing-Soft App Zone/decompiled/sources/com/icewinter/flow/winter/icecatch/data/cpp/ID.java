package com.icewinter.flow.winter.icecatch.data.cpp;

import com.google.android.datatransport.WinterFlowBandwidthDebug;
import com.google.android.datatransport.WinterFlowManagerRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class ID {
    private static final /* synthetic */ WinterFlowBandwidthDebug $ENTRIES;
    private static final /* synthetic */ ID[] $VALUES;
    public static final ID APP_ADJUST_ID = new ID("APP_ADJUST_ID", 0);
    public static final ID APP_ADJUST_SDK_INFO = new ID("APP_ADJUST_SDK_INFO", 1);
    public static final ID APP_CONNECTION_DATA = new ID("APP_CONNECTION_DATA", 2);
    public static final ID APP_FIREBASE_ID = new ID("APP_FIREBASE_ID", 3);
    public static final ID APP_GOOGLE_BLANK_ID = new ID("APP_GOOGLE_BLANK_ID", 4);
    public static final ID APP_GOOGLE_ID = new ID("APP_GOOGLE_ID", 5);
    public static final ID APP_GOOGLE_REFER_ID = new ID("APP_GOOGLE_REFER_ID", 6);
    public static final ID APP_SECURE_KEY = new ID("APP_SECURE_KEY", 7);

    private static final /* synthetic */ ID[] $values() {
        return new ID[]{APP_ADJUST_ID, APP_ADJUST_SDK_INFO, APP_CONNECTION_DATA, APP_FIREBASE_ID, APP_GOOGLE_BLANK_ID, APP_GOOGLE_ID, APP_GOOGLE_REFER_ID, APP_SECURE_KEY};
    }

    static {
        ID[] $values = $values();
        $VALUES = $values;
        $ENTRIES = WinterFlowManagerRequest.WinterFlowMapperProtocol($values);
    }

    private ID(String str, int i) {
    }

    public static WinterFlowBandwidthDebug getEntries() {
        return $ENTRIES;
    }

    public static ID valueOf(String str) {
        return (ID) Enum.valueOf(ID.class, str);
    }

    public static ID[] values() {
        return (ID[]) $VALUES.clone();
    }
}
