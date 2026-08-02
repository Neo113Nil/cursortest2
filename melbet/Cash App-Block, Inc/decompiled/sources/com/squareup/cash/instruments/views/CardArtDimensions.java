package com.squareup.cash.instruments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CardArtDimensions {
    public final int cornerRadius;
    public final int height;
    public final int width;

    public CardArtDimensions(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.cornerRadius = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardArtDimensions)) {
            return false;
        }
        CardArtDimensions cardArtDimensions = (CardArtDimensions) obj;
        return this.width == cardArtDimensions.width && this.height == cardArtDimensions.height && this.cornerRadius == cardArtDimensions.cornerRadius;
    }

    public final int hashCode() {
        return Integer.hashCode(this.cornerRadius) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cornerRadius, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.width, this.height, "CardArtDimensions(width=", ", height=", ", cornerRadius="));
    }
}
