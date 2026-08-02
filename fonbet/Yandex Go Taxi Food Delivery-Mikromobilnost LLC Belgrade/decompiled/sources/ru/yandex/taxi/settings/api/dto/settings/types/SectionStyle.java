package ru.yandex.taxi.settings.api.dto.settings.types;

import defpackage.d4q0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w0q0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/settings/api/dto/settings/types/SectionStyle;", "", "Companion", "d4q0", "DEFAULT", "BORDERED", "UNKNOWN", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SectionStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SectionStyle BORDERED;
    public static final d4q0 Companion;
    public static final SectionStyle DEFAULT;
    public static final SectionStyle UNKNOWN;

    static {
        SectionStyle sectionStyle = new SectionStyle("DEFAULT", 0);
        DEFAULT = sectionStyle;
        SectionStyle sectionStyle2 = new SectionStyle("BORDERED", 1);
        BORDERED = sectionStyle2;
        SectionStyle sectionStyle3 = new SectionStyle("UNKNOWN", 2);
        UNKNOWN = sectionStyle3;
        SectionStyle[] sectionStyleArr = {sectionStyle, sectionStyle2, sectionStyle3};
        $VALUES = sectionStyleArr;
        $ENTRIES = a.a(sectionStyleArr);
        Companion = new d4q0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(5));
    }

    public static SectionStyle valueOf(String str) {
        return (SectionStyle) Enum.valueOf(SectionStyle.class, str);
    }

    public static SectionStyle[] values() {
        return (SectionStyle[]) $VALUES.clone();
    }
}
