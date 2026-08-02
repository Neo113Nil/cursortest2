package ru.yandex.logistics.sdk.cargo_form.core.api.models;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/core/api/models/SlotLeadModel$LeadIcon$IconStyle", "", "Lru/yandex/logistics/sdk/cargo_form/core/api/models/SlotLeadModel$LeadIcon$IconStyle;", "ICON", Card.CARD_TYPE_CREDIT_DEBIT, "BRAND", "BRANDXS", "USERPIC", "SERVICE", "IMAGE", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SlotLeadModel$LeadIcon$IconStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotLeadModel$LeadIcon$IconStyle[] $VALUES;
    public static final SlotLeadModel$LeadIcon$IconStyle BRAND;
    public static final SlotLeadModel$LeadIcon$IconStyle BRANDXS;
    public static final SlotLeadModel$LeadIcon$IconStyle ICON;
    public static final SlotLeadModel$LeadIcon$IconStyle IMAGE;
    public static final SlotLeadModel$LeadIcon$IconStyle PAYMENT;
    public static final SlotLeadModel$LeadIcon$IconStyle SERVICE;
    public static final SlotLeadModel$LeadIcon$IconStyle USERPIC;

    static {
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle = new SlotLeadModel$LeadIcon$IconStyle("ICON", 0);
        ICON = slotLeadModel$LeadIcon$IconStyle;
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle2 = new SlotLeadModel$LeadIcon$IconStyle(Card.CARD_TYPE_CREDIT_DEBIT, 1);
        PAYMENT = slotLeadModel$LeadIcon$IconStyle2;
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle3 = new SlotLeadModel$LeadIcon$IconStyle("BRAND", 2);
        BRAND = slotLeadModel$LeadIcon$IconStyle3;
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle4 = new SlotLeadModel$LeadIcon$IconStyle("BRANDXS", 3);
        BRANDXS = slotLeadModel$LeadIcon$IconStyle4;
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle5 = new SlotLeadModel$LeadIcon$IconStyle("USERPIC", 4);
        USERPIC = slotLeadModel$LeadIcon$IconStyle5;
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle6 = new SlotLeadModel$LeadIcon$IconStyle("SERVICE", 5);
        SERVICE = slotLeadModel$LeadIcon$IconStyle6;
        SlotLeadModel$LeadIcon$IconStyle slotLeadModel$LeadIcon$IconStyle7 = new SlotLeadModel$LeadIcon$IconStyle("IMAGE", 6);
        IMAGE = slotLeadModel$LeadIcon$IconStyle7;
        SlotLeadModel$LeadIcon$IconStyle[] slotLeadModel$LeadIcon$IconStyleArr = {slotLeadModel$LeadIcon$IconStyle, slotLeadModel$LeadIcon$IconStyle2, slotLeadModel$LeadIcon$IconStyle3, slotLeadModel$LeadIcon$IconStyle4, slotLeadModel$LeadIcon$IconStyle5, slotLeadModel$LeadIcon$IconStyle6, slotLeadModel$LeadIcon$IconStyle7};
        $VALUES = slotLeadModel$LeadIcon$IconStyleArr;
        $ENTRIES = a.a(slotLeadModel$LeadIcon$IconStyleArr);
    }

    public static SlotLeadModel$LeadIcon$IconStyle valueOf(String str) {
        return (SlotLeadModel$LeadIcon$IconStyle) Enum.valueOf(SlotLeadModel$LeadIcon$IconStyle.class, str);
    }

    public static SlotLeadModel$LeadIcon$IconStyle[] values() {
        return (SlotLeadModel$LeadIcon$IconStyle[]) $VALUES.clone();
    }
}
