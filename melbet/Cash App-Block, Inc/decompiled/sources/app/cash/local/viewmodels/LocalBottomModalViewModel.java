package app.cash.local.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBottomModalViewModel {
    public static final LocalBottomModalViewModel Loading = new LocalBottomModalViewModel(false, null, new Payload.ItemCounter(new CartItemCounterViewModel(null, null, 0, 0, 0, CartItemCounterViewModel.Mode.Dynamic.INSTANCE, null, 66)), "", true, 16);
    public final String callToActionText;
    public final boolean enabled;
    public final boolean isLoading;
    public final Payload payload;
    public final Title title;

    public final class Title {
        public final String cta;
        public final boolean ignoreDisablement;
        public final String label;
        public final TitleTextStyle textStyle;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class TitleTextStyle {
            public static final /* synthetic */ TitleTextStyle[] $VALUES;
            public static final TitleTextStyle Default;
            public static final TitleTextStyle Prominent;
            public static final TitleTextStyle Warning;

            static {
                TitleTextStyle titleTextStyle = new TitleTextStyle("Default", 0);
                Default = titleTextStyle;
                TitleTextStyle titleTextStyle2 = new TitleTextStyle("Prominent", 1);
                Prominent = titleTextStyle2;
                TitleTextStyle titleTextStyle3 = new TitleTextStyle("Warning", 2);
                Warning = titleTextStyle3;
                $VALUES = new TitleTextStyle[]{titleTextStyle, titleTextStyle2, titleTextStyle3};
            }

            public static TitleTextStyle valueOf(String str) {
                return (TitleTextStyle) Enum.valueOf(TitleTextStyle.class, str);
            }

            public static TitleTextStyle[] values() {
                return (TitleTextStyle[]) $VALUES.clone();
            }
        }

        public Title(String str, String str2, TitleTextStyle titleTextStyle, int i) {
            str2 = (i & 4) != 0 ? null : str2;
            boolean z = (i & 8) == 0;
            titleTextStyle = (i & 16) != 0 ? TitleTextStyle.Default : titleTextStyle;
            str.getClass();
            this.label = str;
            this.cta = str2;
            this.ignoreDisablement = z;
            this.textStyle = titleTextStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Title)) {
                return false;
            }
            Title title = (Title) obj;
            return Intrinsics.areEqual(this.label, title.label) && Intrinsics.areEqual(this.cta, title.cta) && this.ignoreDisablement == title.ignoreDisablement && this.textStyle == title.textStyle;
        }

        public final int hashCode() {
            int hashCode = this.label.hashCode() * 961;
            String str = this.cta;
            return this.textStyle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.ignoreDisablement);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Title(label=", this.label, ", value=null, cta=", this.cta, ", ignoreDisablement=");
            m.append(this.ignoreDisablement);
            m.append(", textStyle=");
            m.append(this.textStyle);
            m.append(")");
            return m.toString();
        }
    }

    public LocalBottomModalViewModel(boolean z, Title title, Payload payload, String str, boolean z2, int i) {
        title = (i & 2) != 0 ? null : title;
        str.getClass();
        this.enabled = z;
        this.title = title;
        this.payload = payload;
        this.callToActionText = str;
        this.isLoading = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBottomModalViewModel)) {
            return false;
        }
        LocalBottomModalViewModel localBottomModalViewModel = (LocalBottomModalViewModel) obj;
        return this.enabled == localBottomModalViewModel.enabled && Intrinsics.areEqual(this.title, localBottomModalViewModel.title) && this.payload.equals(localBottomModalViewModel.payload) && Intrinsics.areEqual(this.callToActionText, localBottomModalViewModel.callToActionText) && this.isLoading == localBottomModalViewModel.isLoading;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.enabled) * 31;
        Title title = this.title;
        return Boolean.hashCode(this.isLoading) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.payload.hashCode() + ((hashCode + (title == null ? 0 : title.hashCode())) * 31)) * 31, 31, this.callToActionText), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalBottomModalViewModel(enabled=");
        sb.append(this.enabled);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", callToActionText=");
        sb.append(this.callToActionText);
        sb.append(", callToActionStyleProminent=false, isLoading=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isLoading, ")");
    }

    public interface Payload {

        public final class ItemCounter implements Payload {
            public final CartItemCounterViewModel model;

            public ItemCounter(CartItemCounterViewModel cartItemCounterViewModel) {
                this.model = cartItemCounterViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ItemCounter) && this.model.equals(((ItemCounter) obj).model);
            }

            public final int hashCode() {
                return this.model.hashCode();
            }

            public final String toString() {
                return "ItemCounter(model=" + this.model + ")";
            }
        }

        public final class NoPayload implements Payload {
            public static final NoPayload INSTANCE = new NoPayload();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoPayload);
            }

            public final int hashCode() {
                return 37967518;
            }

            public final String toString() {
                return "NoPayload";
            }
        }

        public final class OpenTabInfo implements Payload {
            public final String subtitleText;
            public final String titleText;

            public OpenTabInfo(String str, String str2) {
                str.getClass();
                this.titleText = str;
                this.subtitleText = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenTabInfo)) {
                    return false;
                }
                OpenTabInfo openTabInfo = (OpenTabInfo) obj;
                return Intrinsics.areEqual(this.titleText, openTabInfo.titleText) && Intrinsics.areEqual(this.subtitleText, openTabInfo.subtitleText);
            }

            public final int hashCode() {
                int hashCode = this.titleText.hashCode() * 31;
                String str = this.subtitleText;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("OpenTabInfo(titleText=", this.titleText, ", subtitleText=", this.subtitleText, ")");
            }
        }

        public final class ItemInfo implements Payload {
            public final Long amountRaw;
            public final String amountText;
            public final String quantityText;
            public final String strokedAmountText;

            public ItemInfo(String str, String str2, String str3, Long l) {
                str.getClass();
                str2.getClass();
                this.quantityText = str;
                this.amountText = str2;
                this.amountRaw = l;
                this.strokedAmountText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ItemInfo)) {
                    return false;
                }
                ItemInfo itemInfo = (ItemInfo) obj;
                return Intrinsics.areEqual(this.quantityText, itemInfo.quantityText) && Intrinsics.areEqual(this.amountText, itemInfo.amountText) && Intrinsics.areEqual(this.amountRaw, itemInfo.amountRaw) && Intrinsics.areEqual(this.strokedAmountText, itemInfo.strokedAmountText);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.quantityText.hashCode() * 31, 31, this.amountText);
                Long l = this.amountRaw;
                int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
                String str = this.strokedAmountText;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ItemInfo(quantityText=", this.quantityText, ", amountText=", this.amountText, ", amountRaw=");
                m.append(this.amountRaw);
                m.append(", strokedAmountText=");
                m.append(this.strokedAmountText);
                m.append(")");
                return m.toString();
            }

            public /* synthetic */ ItemInfo(Long l, String str, String str2) {
                this(str, str2, null, l);
            }
        }
    }
}
