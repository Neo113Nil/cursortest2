package com.squareup.cash.google.pay;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/google/pay/GooglePayActivationPresenter$VisaExtras", "", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GooglePayActivationPresenter$VisaExtras {
    public final String panReferenceID;
    public final String tokenReferenceID;

    public GooglePayActivationPresenter$VisaExtras(String str, String str2) {
        this.panReferenceID = str;
        this.tokenReferenceID = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayActivationPresenter$VisaExtras)) {
            return false;
        }
        GooglePayActivationPresenter$VisaExtras googlePayActivationPresenter$VisaExtras = (GooglePayActivationPresenter$VisaExtras) obj;
        return this.panReferenceID.equals(googlePayActivationPresenter$VisaExtras.panReferenceID) && this.tokenReferenceID.equals(googlePayActivationPresenter$VisaExtras.tokenReferenceID);
    }

    public final int hashCode() {
        return this.tokenReferenceID.hashCode() + (this.panReferenceID.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("VisaExtras(panReferenceID=", this.panReferenceID, ", tokenReferenceID=", this.tokenReferenceID, ")");
    }
}
