package com.squareup.cash.buynowpaylater.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SUPCardInfo {
    public final String amount;
    public final String footer;
    public final String limit;
    public final Image paymentNetworkImg;
    public final String subTitle;
    public final String title;

    public SUPCardInfo(Image image, String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        image.getClass();
        this.title = str;
        this.subTitle = str2;
        this.amount = str3;
        this.limit = str4;
        this.footer = str5;
        this.paymentNetworkImg = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SUPCardInfo)) {
            return false;
        }
        SUPCardInfo sUPCardInfo = (SUPCardInfo) obj;
        return Intrinsics.areEqual(this.title, sUPCardInfo.title) && Intrinsics.areEqual(this.subTitle, sUPCardInfo.subTitle) && this.amount.equals(sUPCardInfo.amount) && this.limit.equals(sUPCardInfo.limit) && Intrinsics.areEqual(this.footer, sUPCardInfo.footer) && Intrinsics.areEqual(this.paymentNetworkImg, sUPCardInfo.paymentNetworkImg);
    }

    public final int hashCode() {
        return this.paymentNetworkImg.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subTitle), 31, this.amount), 31, this.limit), 31, this.footer);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SUPCardInfo(title=", this.title, ", subTitle=", this.subTitle, ", amount=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.amount, ", limit=", this.limit, ", footer=");
        m.append(this.footer);
        m.append(", paymentNetworkImg=");
        m.append(this.paymentNetworkImg);
        m.append(")");
        return m.toString();
    }
}
