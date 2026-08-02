package com.squareup.cash.money.booklet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CardSection implements MoneyTabBookletSection {
    public final String content;
    public final Image image;
    public final float imageAspectRatio;
    public final String title;

    public CardSection(Image image, float f, String str, String str2) {
        this.image = image;
        this.imageAspectRatio = f;
        this.title = str;
        this.content = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSection)) {
            return false;
        }
        CardSection cardSection = (CardSection) obj;
        return this.image.equals(cardSection.image) && Float.compare(this.imageAspectRatio, cardSection.imageAspectRatio) == 0 && this.title.equals(cardSection.title) && this.content.equals(cardSection.content);
    }

    public final int hashCode() {
        return this.content.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.imageAspectRatio, this.image.hashCode() * 31, 31), 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardSection(image=");
        sb.append(this.image);
        sb.append(", imageAspectRatio=");
        sb.append(this.imageAspectRatio);
        sb.append(", title=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ", content=", this.content, ")");
    }
}
