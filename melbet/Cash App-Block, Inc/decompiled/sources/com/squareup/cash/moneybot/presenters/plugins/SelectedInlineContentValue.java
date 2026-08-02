package com.squareup.cash.moneybot.presenters.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.crypto.tink.subtle.X25519;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelectedOption;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.cash.moneybot.presenters.plugins.JsonTemplateValue;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SelectedInlineContentValue extends Parcelable {

    public final class Amount implements SelectedInlineContentValue {
        public static final Parcelable.Creator<Amount> CREATOR = new LimitsScreen.Creator(22);
        public final Money value;

        public Amount(Money money) {
            money.getClass();
            this.value = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue
        public final String displayText(MoneyFormatter moneyFormatter) {
            moneyFormatter.getClass();
            return moneyFormatter.format(this.value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Amount) && Intrinsics.areEqual(this.value, ((Amount) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue
        public final JsonTemplateValue jsonTemplateValue(MoneyFormatter moneyFormatter) {
            String str;
            moneyFormatter.getClass();
            Long l = this.value.amount;
            if (l == null || (str = String.valueOf(l.longValue())) == null) {
                str = "null";
            }
            return new JsonTemplateValue.RawValue(str);
        }

        public final String toString() {
            return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Amount(value=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.value, i);
        }
    }

    public final class Picker implements SelectedInlineContentValue {
        public static final Parcelable.Creator<Picker> CREATOR = new LimitsScreen.Creator(23);
        public final MoneybotStaticPickerOption.Icon icon;
        public final String label;
        public final String value;

        public Picker(String str, String str2, MoneybotStaticPickerOption.Icon icon) {
            str.getClass();
            str2.getClass();
            this.value = str;
            this.label = str2;
            this.icon = icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue
        public final String displayText(MoneyFormatter moneyFormatter) {
            moneyFormatter.getClass();
            return this.label;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Picker)) {
                return false;
            }
            Picker picker = (Picker) obj;
            return Intrinsics.areEqual(this.value, picker.value) && Intrinsics.areEqual(this.label, picker.label) && Intrinsics.areEqual(this.icon, picker.icon);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value.hashCode() * 31, 31, this.label);
            MoneybotStaticPickerOption.Icon icon = this.icon;
            return m + (icon == null ? 0 : icon.hashCode());
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue
        public final String templateValue(MoneyFormatter moneyFormatter) {
            moneyFormatter.getClass();
            return this.value;
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Picker(value=", this.value, ", label=", this.label, ", icon=");
            m.append(this.icon);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.value);
            parcel.writeString(this.label);
            parcel.writeParcelable(this.icon, i);
        }
    }

    public final class Text implements SelectedInlineContentValue {
        public static final Parcelable.Creator<Text> CREATOR = new LimitsScreen.Creator(24);
        public final String value;

        public Text(String str) {
            str.getClass();
            this.value = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue
        public final String displayText(MoneyFormatter moneyFormatter) {
            moneyFormatter.getClass();
            return this.value;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.areEqual(this.value, ((Text) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(value=", this.value, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.value);
        }
    }

    public final class TransferOption implements SelectedInlineContentValue {
        public static final Parcelable.Creator<TransferOption> CREATOR = new LimitsScreen.Creator(25);
        public final TransferOptionPickerSelectedOption option;

        public TransferOption(TransferOptionPickerSelectedOption transferOptionPickerSelectedOption) {
            transferOptionPickerSelectedOption.getClass();
            this.option = transferOptionPickerSelectedOption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue
        public final String displayText(MoneyFormatter moneyFormatter) {
            moneyFormatter.getClass();
            return this.option.label;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransferOption) && Intrinsics.areEqual(this.option, ((TransferOption) obj).option);
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        @Override // com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue
        public final String templateValue(MoneyFormatter moneyFormatter) {
            moneyFormatter.getClass();
            return X25519.getOptionValue(this.option.selection);
        }

        public final String toString() {
            return "TransferOption(option=" + this.option + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.option, i);
        }
    }

    String displayText(MoneyFormatter moneyFormatter);

    default JsonTemplateValue jsonTemplateValue(MoneyFormatter moneyFormatter) {
        moneyFormatter.getClass();
        return new JsonTemplateValue.StringValue(templateValue(moneyFormatter));
    }

    default String templateValue(MoneyFormatter moneyFormatter) {
        moneyFormatter.getClass();
        return displayText(moneyFormatter);
    }
}
