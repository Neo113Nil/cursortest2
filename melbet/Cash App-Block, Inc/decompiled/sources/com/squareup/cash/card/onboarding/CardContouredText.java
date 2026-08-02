package com.squareup.cash.card.onboarding;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardContouredText {
    public final Integer color;
    public final float opacity;
    public final int repeatCount;
    public final String text;

    public /* synthetic */ CardContouredText(String str, Integer num, float f, int i, int i2) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? 1.0f : f, 14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardContouredText)) {
            return false;
        }
        CardContouredText cardContouredText = (CardContouredText) obj;
        return Intrinsics.areEqual(this.text, cardContouredText.text) && Intrinsics.areEqual(this.color, cardContouredText.color) && Float.compare(this.opacity, cardContouredText.opacity) == 0 && this.repeatCount == cardContouredText.repeatCount;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Integer num = this.color;
        return Integer.hashCode(this.repeatCount) + CameraState$Type$EnumUnboxingLocalUtility.m(this.opacity, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.color, "CardContouredText(text=", this.text, ", color=", ", opacity=");
        m.append(this.opacity);
        m.append(", repeatCount=");
        m.append(this.repeatCount);
        m.append(")");
        return m.toString();
    }

    public CardContouredText(String str, Integer num, float f, int i) {
        str.getClass();
        this.text = str;
        this.color = num;
        this.opacity = f;
        this.repeatCount = i;
    }
}
