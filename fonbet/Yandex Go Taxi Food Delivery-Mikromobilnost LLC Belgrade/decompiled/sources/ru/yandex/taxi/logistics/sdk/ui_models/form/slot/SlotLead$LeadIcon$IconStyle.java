package ru.yandex.taxi.logistics.sdk.ui_models.form.slot;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"ru/yandex/taxi/logistics/sdk/ui_models/form/slot/SlotLead$LeadIcon$IconStyle", "", "Lru/yandex/taxi/logistics/sdk/ui_models/form/slot/SlotLead$LeadIcon$IconStyle;", "Ly7m;", "width", "F", "c", "()F", "height", "b", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "a", "ICON", Card.CARD_TYPE_CREDIT_DEBIT, "BRAND", "BRANDXS", "USERPIC", "SERVICE", "IMAGE", "sdk-ui-models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SlotLead$LeadIcon$IconStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotLead$LeadIcon$IconStyle[] $VALUES;
    public static final SlotLead$LeadIcon$IconStyle BRAND;
    public static final SlotLead$LeadIcon$IconStyle BRANDXS;
    public static final SlotLead$LeadIcon$IconStyle ICON;
    public static final SlotLead$LeadIcon$IconStyle IMAGE;
    public static final SlotLead$LeadIcon$IconStyle PAYMENT;
    public static final SlotLead$LeadIcon$IconStyle SERVICE;
    public static final SlotLead$LeadIcon$IconStyle USERPIC;
    private final float cornerRadius;
    private final float height;
    private final float width;

    static {
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle = new SlotLead$LeadIcon$IconStyle(24.0f, 24.0f, 0.0f, 0, "ICON");
        ICON = slotLead$LeadIcon$IconStyle;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle2 = new SlotLead$LeadIcon$IconStyle(36.0f, 24.0f, 4.0f, 1, Card.CARD_TYPE_CREDIT_DEBIT);
        PAYMENT = slotLead$LeadIcon$IconStyle2;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle3 = new SlotLead$LeadIcon$IconStyle(40.0f, 40.0f, 12.0f, 2, "BRAND");
        BRAND = slotLead$LeadIcon$IconStyle3;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle4 = new SlotLead$LeadIcon$IconStyle(24.0f, 24.0f, 8.0f, 3, "BRANDXS");
        BRANDXS = slotLead$LeadIcon$IconStyle4;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle5 = new SlotLead$LeadIcon$IconStyle(40.0f, 40.0f, 40.0f, 4, "USERPIC");
        USERPIC = slotLead$LeadIcon$IconStyle5;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle6 = new SlotLead$LeadIcon$IconStyle(40.0f, 40.0f, 0.0f, 5, "SERVICE");
        SERVICE = slotLead$LeadIcon$IconStyle6;
        SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle7 = new SlotLead$LeadIcon$IconStyle(40.0f, 40.0f, 6.0f, 6, "IMAGE");
        IMAGE = slotLead$LeadIcon$IconStyle7;
        SlotLead$LeadIcon$IconStyle[] slotLead$LeadIcon$IconStyleArr = {slotLead$LeadIcon$IconStyle, slotLead$LeadIcon$IconStyle2, slotLead$LeadIcon$IconStyle3, slotLead$LeadIcon$IconStyle4, slotLead$LeadIcon$IconStyle5, slotLead$LeadIcon$IconStyle6, slotLead$LeadIcon$IconStyle7};
        $VALUES = slotLead$LeadIcon$IconStyleArr;
        $ENTRIES = a.a(slotLead$LeadIcon$IconStyleArr);
    }

    public SlotLead$LeadIcon$IconStyle(float f, float f2, float f3, int i, String str) {
        this.width = f;
        this.height = f2;
        this.cornerRadius = f3;
    }

    public static SlotLead$LeadIcon$IconStyle valueOf(String str) {
        return (SlotLead$LeadIcon$IconStyle) Enum.valueOf(SlotLead$LeadIcon$IconStyle.class, str);
    }

    public static SlotLead$LeadIcon$IconStyle[] values() {
        return (SlotLead$LeadIcon$IconStyle[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: b, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: c, reason: from getter */
    public final float getWidth() {
        return this.width;
    }
}
