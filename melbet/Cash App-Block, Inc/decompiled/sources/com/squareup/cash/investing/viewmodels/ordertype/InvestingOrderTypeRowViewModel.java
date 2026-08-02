package com.squareup.cash.investing.viewmodels.ordertype;

import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingOrderTypeRowViewModel {
    public final ColorModel accentColor;
    public final String description;
    public final Icon icon;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class Icon {
        public static final /* synthetic */ Icon[] $VALUES;
        public static final Icon AUTO_INVEST;
        public static final Icon CUSTOM_ORDER_BUY;
        public static final Icon CUSTOM_ORDER_SELL;

        static {
            Icon icon = new Icon("AUTO_INVEST", 0);
            AUTO_INVEST = icon;
            Icon icon2 = new Icon("CUSTOM_ORDER_BUY", 1);
            CUSTOM_ORDER_BUY = icon2;
            Icon icon3 = new Icon("CUSTOM_ORDER_SELL", 2);
            CUSTOM_ORDER_SELL = icon3;
            $VALUES = new Icon[]{icon, icon2, icon3};
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    public InvestingOrderTypeRowViewModel(Icon icon, String str, String str2, ColorModel colorModel) {
        str.getClass();
        str2.getClass();
        colorModel.getClass();
        this.icon = icon;
        this.title = str;
        this.description = str2;
        this.accentColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingOrderTypeRowViewModel)) {
            return false;
        }
        InvestingOrderTypeRowViewModel investingOrderTypeRowViewModel = (InvestingOrderTypeRowViewModel) obj;
        return this.icon == investingOrderTypeRowViewModel.icon && Intrinsics.areEqual(this.title, investingOrderTypeRowViewModel.title) && Intrinsics.areEqual(this.description, investingOrderTypeRowViewModel.description) && Intrinsics.areEqual(this.accentColor, investingOrderTypeRowViewModel.accentColor);
    }

    public final int hashCode() {
        return this.accentColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.description);
    }

    public final String toString() {
        return "InvestingOrderTypeRowViewModel(icon=" + this.icon + ", title=" + this.title + ", description=" + this.description + ", accentColor=" + this.accentColor + ")";
    }
}
