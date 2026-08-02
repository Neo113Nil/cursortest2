package ru.yandex.taxi.logistics.sdk.tracking.impl.details.ui.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/impl/details/ui/model/TitleStyle;", "", "BIG", "NORMAL", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TitleStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TitleStyle[] $VALUES;
    public static final TitleStyle BIG;
    public static final TitleStyle NORMAL;

    static {
        TitleStyle titleStyle = new TitleStyle("BIG", 0);
        BIG = titleStyle;
        TitleStyle titleStyle2 = new TitleStyle("NORMAL", 1);
        NORMAL = titleStyle2;
        TitleStyle[] titleStyleArr = {titleStyle, titleStyle2};
        $VALUES = titleStyleArr;
        $ENTRIES = a.a(titleStyleArr);
    }

    public static TitleStyle valueOf(String str) {
        return (TitleStyle) Enum.valueOf(TitleStyle.class, str);
    }

    public static TitleStyle[] values() {
        return (TitleStyle[]) $VALUES.clone();
    }
}
