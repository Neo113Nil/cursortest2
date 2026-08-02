package ru.rt.ebs.cryptosdk.presentation.customView;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/ScreenIconType;", "", "ATTENTION", "CANCEL", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class ScreenIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScreenIconType[] $VALUES;
    public static final ScreenIconType ATTENTION;
    public static final ScreenIconType CANCEL;

    static {
        ScreenIconType screenIconType = new ScreenIconType("ATTENTION", 0);
        ATTENTION = screenIconType;
        ScreenIconType screenIconType2 = new ScreenIconType("CANCEL", 1);
        CANCEL = screenIconType2;
        ScreenIconType[] screenIconTypeArr = {screenIconType, screenIconType2};
        $VALUES = screenIconTypeArr;
        $ENTRIES = kotlin.enums.a.a(screenIconTypeArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ScreenIconType valueOf(String str) {
        return (ScreenIconType) Enum.valueOf(ScreenIconType.class, str);
    }

    public static ScreenIconType[] values() {
        return (ScreenIconType[]) $VALUES.clone();
    }
}
