package com.squareup.cash.paymentpad.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class ExchangeRatePreview {
    public final String contentDescription;
    public final boolean enabled;
    public final String text;

    public ExchangeRatePreview(String str, String str2, boolean z) {
        this.text = str;
        this.contentDescription = str2;
        this.enabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeRatePreview)) {
            return false;
        }
        ExchangeRatePreview exchangeRatePreview = (ExchangeRatePreview) obj;
        return this.text.equals(exchangeRatePreview.text) && this.contentDescription.equals(exchangeRatePreview.contentDescription) && this.enabled == exchangeRatePreview.enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.contentDescription);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExchangeRatePreview(text=", this.text, ", contentDescription=", this.contentDescription, ", enabled="), this.enabled, ")");
    }
}
