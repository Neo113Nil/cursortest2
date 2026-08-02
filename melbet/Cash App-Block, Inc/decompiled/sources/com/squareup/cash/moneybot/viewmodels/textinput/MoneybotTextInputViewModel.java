package com.squareup.cash.moneybot.viewmodels.textinput;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotTextInputViewModel {
    public final String cta;
    public final String initialText;
    public final Integer maxLength;
    public final String placeholder;

    public MoneybotTextInputViewModel(Integer num, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.initialText = str;
        this.placeholder = str2;
        this.maxLength = num;
        this.cta = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotTextInputViewModel)) {
            return false;
        }
        MoneybotTextInputViewModel moneybotTextInputViewModel = (MoneybotTextInputViewModel) obj;
        return Intrinsics.areEqual(this.initialText, moneybotTextInputViewModel.initialText) && Intrinsics.areEqual(this.placeholder, moneybotTextInputViewModel.placeholder) && Intrinsics.areEqual(this.maxLength, moneybotTextInputViewModel.maxLength) && Intrinsics.areEqual(this.cta, moneybotTextInputViewModel.cta);
    }

    public final int hashCode() {
        int hashCode = this.initialText.hashCode() * 31;
        String str = this.placeholder;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxLength;
        return this.cta.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MoneybotTextInputViewModel(initialText=", this.initialText, ", placeholder=", this.placeholder, ", maxLength=");
        m.append(this.maxLength);
        m.append(", cta=");
        m.append(this.cta);
        m.append(")");
        return m.toString();
    }
}
