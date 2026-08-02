package com.squareup.cash.marketing.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardUpsellIllustration {
    public final String darkUrl;
    public final int height;
    public final String lightUrl;
    public final int width;

    public CardUpsellIllustration(String str, int i, int i2, String str2) {
        str.getClass();
        this.lightUrl = str;
        this.darkUrl = str2;
        this.height = i;
        this.width = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardUpsellIllustration)) {
            return false;
        }
        CardUpsellIllustration cardUpsellIllustration = (CardUpsellIllustration) obj;
        return Intrinsics.areEqual(this.lightUrl, cardUpsellIllustration.lightUrl) && this.darkUrl.equals(cardUpsellIllustration.darkUrl) && this.height == cardUpsellIllustration.height && this.width == cardUpsellIllustration.width;
    }

    public final int hashCode() {
        return Integer.hashCode(this.width) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.lightUrl.hashCode() * 31, 31, this.darkUrl), 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.height, this.width, ", width=", ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardUpsellIllustration(lightUrl=", this.lightUrl, ", darkUrl=", this.darkUrl, ", height="));
    }
}
