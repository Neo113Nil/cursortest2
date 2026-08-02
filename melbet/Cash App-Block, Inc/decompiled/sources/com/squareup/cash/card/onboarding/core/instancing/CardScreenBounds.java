package com.squareup.cash.card.onboarding.core.instancing;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CardScreenBounds {
    public final float bottom;
    public final int canonicalIndex;
    public final int instanceIndex;
    public final boolean isCentered;
    public final float left;
    public final float right;
    public final float top;

    public CardScreenBounds(int i, int i2, float f, float f2, float f3, float f4, boolean z) {
        this.instanceIndex = i;
        this.canonicalIndex = i2;
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.isCentered = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardScreenBounds)) {
            return false;
        }
        CardScreenBounds cardScreenBounds = (CardScreenBounds) obj;
        return this.instanceIndex == cardScreenBounds.instanceIndex && this.canonicalIndex == cardScreenBounds.canonicalIndex && Float.compare(this.left, cardScreenBounds.left) == 0 && Float.compare(this.top, cardScreenBounds.top) == 0 && Float.compare(this.right, cardScreenBounds.right) == 0 && Float.compare(this.bottom, cardScreenBounds.bottom) == 0 && this.isCentered == cardScreenBounds.isCentered;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isCentered) + CameraState$Type$EnumUnboxingLocalUtility.m(this.bottom, CameraState$Type$EnumUnboxingLocalUtility.m(this.right, CameraState$Type$EnumUnboxingLocalUtility.m(this.top, CameraState$Type$EnumUnboxingLocalUtility.m(this.left, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.canonicalIndex, Integer.hashCode(this.instanceIndex) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.instanceIndex, this.canonicalIndex, "CardScreenBounds(instanceIndex=", ", canonicalIndex=", ", left=");
        Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.left, ", top=", this.top, ", right=");
        Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.right, ", bottom=", this.bottom, ", isCentered=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, this.isCentered, ")");
    }
}
