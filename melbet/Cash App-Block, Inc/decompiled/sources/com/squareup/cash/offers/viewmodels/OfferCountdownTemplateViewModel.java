package com.squareup.cash.offers.viewmodels;

import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OfferCountdownTemplateViewModel {
    public final Long countdownMillis;
    public final ShoppingIconId icon;
    public final String stringToReplace;
    public final String text;
    public final Color textColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CountdownFormatStyle {
        public static final /* synthetic */ CountdownFormatStyle[] $VALUES;
        public static final CountdownFormatStyle DETAILED;

        /* JADX INFO: Fake field, exist only in values array */
        CountdownFormatStyle EF0;

        static {
            CountdownFormatStyle countdownFormatStyle = new CountdownFormatStyle("ABBREVIATED", 0);
            CountdownFormatStyle countdownFormatStyle2 = new CountdownFormatStyle("DETAILED", 1);
            DETAILED = countdownFormatStyle2;
            $VALUES = new CountdownFormatStyle[]{countdownFormatStyle, countdownFormatStyle2};
        }

        public static CountdownFormatStyle valueOf(String str) {
            return (CountdownFormatStyle) Enum.valueOf(CountdownFormatStyle.class, str);
        }

        public static CountdownFormatStyle[] values() {
            return (CountdownFormatStyle[]) $VALUES.clone();
        }
    }

    public OfferCountdownTemplateViewModel(CountdownFormatStyle countdownFormatStyle, ShoppingIconId shoppingIconId, String str, Color color, Long l, String str2) {
        countdownFormatStyle.getClass();
        str2.getClass();
        this.icon = shoppingIconId;
        this.text = str;
        this.textColor = color;
        this.countdownMillis = l;
        this.stringToReplace = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferCountdownTemplateViewModel)) {
            return false;
        }
        OfferCountdownTemplateViewModel offerCountdownTemplateViewModel = (OfferCountdownTemplateViewModel) obj;
        CountdownFormatStyle countdownFormatStyle = CountdownFormatStyle.DETAILED;
        return this.icon == offerCountdownTemplateViewModel.icon && Intrinsics.areEqual(this.text, offerCountdownTemplateViewModel.text) && Intrinsics.areEqual(this.textColor, offerCountdownTemplateViewModel.textColor) && Intrinsics.areEqual(this.countdownMillis, offerCountdownTemplateViewModel.countdownMillis) && Intrinsics.areEqual(this.stringToReplace, offerCountdownTemplateViewModel.stringToReplace);
    }

    public final int hashCode() {
        int hashCode = CountdownFormatStyle.DETAILED.hashCode() * 31;
        ShoppingIconId shoppingIconId = this.icon;
        int hashCode2 = (hashCode + (shoppingIconId == null ? 0 : shoppingIconId.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Color color = this.textColor;
        int hashCode4 = (hashCode3 + (color == null ? 0 : color.hashCode())) * 31;
        Long l = this.countdownMillis;
        return this.stringToReplace.hashCode() + ((hashCode4 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OfferCountdownTemplateViewModel(formatStyle=" + CountdownFormatStyle.DETAILED + ", icon=" + this.icon + ", text=" + this.text + ", textColor=" + this.textColor + ", countdownMillis=" + this.countdownMillis + ", stringToReplace=" + this.stringToReplace + ")";
    }
}
