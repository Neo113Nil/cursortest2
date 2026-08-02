package ru.yandex.taxi.persuggest.api;

import defpackage.c20;
import defpackage.fl0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/persuggest/api/AdditionalButtonStyle;", "", "Companion", "fl0", "DEFAULT", "ACTION", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdditionalButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AdditionalButtonStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final AdditionalButtonStyle ACTION;
    public static final fl0 Companion;
    public static final AdditionalButtonStyle DEFAULT;

    static {
        AdditionalButtonStyle additionalButtonStyle = new AdditionalButtonStyle("DEFAULT", 0);
        DEFAULT = additionalButtonStyle;
        AdditionalButtonStyle additionalButtonStyle2 = new AdditionalButtonStyle("ACTION", 1);
        ACTION = additionalButtonStyle2;
        AdditionalButtonStyle[] additionalButtonStyleArr = {additionalButtonStyle, additionalButtonStyle2};
        $VALUES = additionalButtonStyleArr;
        $ENTRIES = kotlin.enums.a.a(additionalButtonStyleArr);
        Companion = new fl0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(27));
    }

    public static AdditionalButtonStyle valueOf(String str) {
        return (AdditionalButtonStyle) Enum.valueOf(AdditionalButtonStyle.class, str);
    }

    public static AdditionalButtonStyle[] values() {
        return (AdditionalButtonStyle[]) $VALUES.clone();
    }
}
