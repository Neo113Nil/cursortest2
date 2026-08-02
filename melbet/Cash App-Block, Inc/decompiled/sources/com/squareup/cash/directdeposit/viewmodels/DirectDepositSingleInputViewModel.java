package com.squareup.cash.directdeposit.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.arcade.values.NavigationIconType;
import app.cash.inputfieldtext.InputFieldText;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DirectDepositSingleInputViewModel {
    public final boolean buttonEnabled;
    public final String buttonText;
    public final String description;
    public final InputFieldText inputFieldText;
    public final String inputHelp;
    public final String inputHint;
    public final Type inputType;
    public final NavigationIconType navigationType;
    public final String title;

    public interface Type {

        public final class CompanyName implements Type {
            public static final CompanyName INSTANCE = new CompanyName();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CompanyName);
            }

            public final int hashCode() {
                return -1405359745;
            }

            public final String toString() {
                return "CompanyName";
            }
        }

        public final class Name implements Type {
            public static final Name INSTANCE = new Name();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Name);
            }

            public final int hashCode() {
                return -945362540;
            }

            public final String toString() {
                return "Name";
            }
        }

        public final class PaycheckCurrencyAmount implements Type {
            public final CurrencyCode currencyCode;

            public PaycheckCurrencyAmount(CurrencyCode currencyCode) {
                this.currencyCode = currencyCode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PaycheckCurrencyAmount) && this.currencyCode == ((PaycheckCurrencyAmount) obj).currencyCode;
            }

            public final int hashCode() {
                CurrencyCode currencyCode = this.currencyCode;
                if (currencyCode == null) {
                    return 0;
                }
                return currencyCode.hashCode();
            }

            public final String toString() {
                return "PaycheckCurrencyAmount(currencyCode=" + this.currencyCode + ")";
            }
        }

        public final class PaycheckPercentage implements Type {
            public static final PaycheckPercentage INSTANCE = new PaycheckPercentage();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PaycheckPercentage);
            }

            public final int hashCode() {
                return -856891549;
            }

            public final String toString() {
                return "PaycheckPercentage";
            }
        }
    }

    public DirectDepositSingleInputViewModel(Type type2, String str, String str2, String str3, String str4, InputFieldText inputFieldText, String str5, boolean z, int i) {
        NavigationIconType navigationIconType = (i & 16) != 0 ? NavigationIconType.CLOSE : NavigationIconType.BACK;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 128) != 0 ? null : str5;
        str.getClass();
        str2.getClass();
        str3.getClass();
        inputFieldText.getClass();
        this.inputType = type2;
        this.title = str;
        this.inputHint = str2;
        this.buttonText = str3;
        this.navigationType = navigationIconType;
        this.description = str4;
        this.inputFieldText = inputFieldText;
        this.inputHelp = str5;
        this.buttonEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositSingleInputViewModel)) {
            return false;
        }
        DirectDepositSingleInputViewModel directDepositSingleInputViewModel = (DirectDepositSingleInputViewModel) obj;
        return Intrinsics.areEqual(this.inputType, directDepositSingleInputViewModel.inputType) && Intrinsics.areEqual(this.title, directDepositSingleInputViewModel.title) && Intrinsics.areEqual(this.inputHint, directDepositSingleInputViewModel.inputHint) && Intrinsics.areEqual(this.buttonText, directDepositSingleInputViewModel.buttonText) && this.navigationType == directDepositSingleInputViewModel.navigationType && Intrinsics.areEqual(this.description, directDepositSingleInputViewModel.description) && Intrinsics.areEqual(this.inputFieldText, directDepositSingleInputViewModel.inputFieldText) && Intrinsics.areEqual(this.inputHelp, directDepositSingleInputViewModel.inputHelp) && this.buttonEnabled == directDepositSingleInputViewModel.buttonEnabled;
    }

    public final int hashCode() {
        int hashCode = (this.navigationType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inputType.hashCode() * 31, 31, this.title), 31, this.inputHint), 31, this.buttonText)) * 31;
        String str = this.description;
        int hashCode2 = (this.inputFieldText.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.inputHelp;
        return Boolean.hashCode(this.buttonEnabled) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectDepositSingleInputViewModel(inputType=");
        sb.append(this.inputType);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", inputHint=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.inputHint, ", buttonText=", this.buttonText, ", navigationType=");
        sb.append(this.navigationType);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", inputFieldText=");
        sb.append(this.inputFieldText);
        sb.append(", inputHelp=");
        sb.append(this.inputHelp);
        sb.append(", buttonEnabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonEnabled, ")");
    }
}
