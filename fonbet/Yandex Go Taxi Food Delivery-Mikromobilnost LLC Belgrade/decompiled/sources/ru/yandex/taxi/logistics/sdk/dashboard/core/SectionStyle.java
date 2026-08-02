package ru.yandex.taxi.logistics.sdk.dashboard.core;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/core/SectionStyle;", "", "DEFAULT", "DARK", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SectionStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionStyle[] $VALUES;
    public static final SectionStyle DARK;
    public static final SectionStyle DEFAULT;

    static {
        SectionStyle sectionStyle = new SectionStyle("DEFAULT", 0);
        DEFAULT = sectionStyle;
        SectionStyle sectionStyle2 = new SectionStyle("DARK", 1);
        DARK = sectionStyle2;
        SectionStyle[] sectionStyleArr = {sectionStyle, sectionStyle2};
        $VALUES = sectionStyleArr;
        $ENTRIES = a.a(sectionStyleArr);
    }

    public static SectionStyle valueOf(String str) {
        return (SectionStyle) Enum.valueOf(SectionStyle.class, str);
    }

    public static SectionStyle[] values() {
        return (SectionStyle[]) $VALUES.clone();
    }
}
