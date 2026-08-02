package ru.yandex.taxi.preorder.summary.selector.data;

import defpackage.k4o;
import defpackage.vfh0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/preorder/summary/selector/data/TariffCardType;", "", "", "viewId", CA20Status.STATUS_USER_I, "a", "()I", "Single", "Option", "Regular", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffCardType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffCardType[] $VALUES;
    public static final TariffCardType Option;
    public static final TariffCardType Regular;
    public static final TariffCardType Single;
    private final int viewId;

    static {
        TariffCardType tariffCardType = new TariffCardType("Single", 0, vfh0.card_type_single);
        Single = tariffCardType;
        TariffCardType tariffCardType2 = new TariffCardType("Option", 1, vfh0.card_type_option);
        Option = tariffCardType2;
        TariffCardType tariffCardType3 = new TariffCardType("Regular", 2, vfh0.card_type_regular);
        Regular = tariffCardType3;
        TariffCardType[] tariffCardTypeArr = {tariffCardType, tariffCardType2, tariffCardType3};
        $VALUES = tariffCardTypeArr;
        $ENTRIES = a.a(tariffCardTypeArr);
    }

    public TariffCardType(String str, int i, int i2) {
        this.viewId = i2;
    }

    public static TariffCardType valueOf(String str) {
        return (TariffCardType) Enum.valueOf(TariffCardType.class, str);
    }

    public static TariffCardType[] values() {
        return (TariffCardType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getViewId() {
        return this.viewId;
    }
}
