package ru.yandex.taxi.logistics.sdk.dashboard.core;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/core/SectionDomainStyle;", "", "DEFAULT", "DARK", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SectionDomainStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionDomainStyle[] $VALUES;
    public static final SectionDomainStyle DARK;
    public static final SectionDomainStyle DEFAULT;

    static {
        SectionDomainStyle sectionDomainStyle = new SectionDomainStyle("DEFAULT", 0);
        DEFAULT = sectionDomainStyle;
        SectionDomainStyle sectionDomainStyle2 = new SectionDomainStyle("DARK", 1);
        DARK = sectionDomainStyle2;
        SectionDomainStyle[] sectionDomainStyleArr = {sectionDomainStyle, sectionDomainStyle2};
        $VALUES = sectionDomainStyleArr;
        $ENTRIES = a.a(sectionDomainStyleArr);
    }

    public static SectionDomainStyle valueOf(String str) {
        return (SectionDomainStyle) Enum.valueOf(SectionDomainStyle.class, str);
    }

    public static SectionDomainStyle[] values() {
        return (SectionDomainStyle[]) $VALUES.clone();
    }
}
