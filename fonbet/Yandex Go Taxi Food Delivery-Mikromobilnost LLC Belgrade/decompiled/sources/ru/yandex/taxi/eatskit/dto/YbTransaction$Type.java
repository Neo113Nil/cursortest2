package ru.yandex.taxi.eatskit.dto;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.dp51;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.yx51;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/eatskit/dto/YbTransaction$Type", "", "Lru/yandex/taxi/eatskit/dto/YbTransaction$Type;", "Companion", "yx51", Card.CARD_TYPE_DEBIT, Card.CARD_TYPE_CREDIT, "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YbTransaction$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbTransaction$Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final YbTransaction$Type CREDIT;
    public static final yx51 Companion;
    public static final YbTransaction$Type DEBIT;

    static {
        YbTransaction$Type ybTransaction$Type = new YbTransaction$Type(Card.CARD_TYPE_DEBIT, 0);
        DEBIT = ybTransaction$Type;
        YbTransaction$Type ybTransaction$Type2 = new YbTransaction$Type(Card.CARD_TYPE_CREDIT, 1);
        CREDIT = ybTransaction$Type2;
        YbTransaction$Type[] ybTransaction$TypeArr = {ybTransaction$Type, ybTransaction$Type2};
        $VALUES = ybTransaction$TypeArr;
        $ENTRIES = kotlin.enums.a.a(ybTransaction$TypeArr);
        Companion = new yx51();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dp51(12));
    }

    public static YbTransaction$Type valueOf(String str) {
        return (YbTransaction$Type) Enum.valueOf(YbTransaction$Type.class, str);
    }

    public static YbTransaction$Type[] values() {
        return (YbTransaction$Type[]) $VALUES.clone();
    }
}
