package ru.yandex.taxi.masstransit.router;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/router/MtHubLeadingItemKind;", "", Card.CARD_TYPE_CREDIT_DEBIT, "TRANSPORT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtHubLeadingItemKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtHubLeadingItemKind[] $VALUES;
    public static final MtHubLeadingItemKind PAYMENT;
    public static final MtHubLeadingItemKind TRANSPORT;

    static {
        MtHubLeadingItemKind mtHubLeadingItemKind = new MtHubLeadingItemKind(Card.CARD_TYPE_CREDIT_DEBIT, 0);
        PAYMENT = mtHubLeadingItemKind;
        MtHubLeadingItemKind mtHubLeadingItemKind2 = new MtHubLeadingItemKind("TRANSPORT", 1);
        TRANSPORT = mtHubLeadingItemKind2;
        MtHubLeadingItemKind[] mtHubLeadingItemKindArr = {mtHubLeadingItemKind, mtHubLeadingItemKind2};
        $VALUES = mtHubLeadingItemKindArr;
        $ENTRIES = kotlin.enums.a.a(mtHubLeadingItemKindArr);
    }

    public static MtHubLeadingItemKind valueOf(String str) {
        return (MtHubLeadingItemKind) Enum.valueOf(MtHubLeadingItemKind.class, str);
    }

    public static MtHubLeadingItemKind[] values() {
        return (MtHubLeadingItemKind[]) $VALUES.clone();
    }
}
