package com.squareup.cash.card.onboarding;

import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardPreviewSheet {
    public final String body;
    public final CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage image;
    public final String title;

    public CardPreviewSheet(String str, String str2, CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage localSheetImage) {
        str.getClass();
        str2.getClass();
        localSheetImage.getClass();
        this.title = str;
        this.body = str2;
        this.image = localSheetImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardPreviewSheet)) {
            return false;
        }
        CardPreviewSheet cardPreviewSheet = (CardPreviewSheet) obj;
        return Intrinsics.areEqual(this.title, cardPreviewSheet.title) && Intrinsics.areEqual(this.body, cardPreviewSheet.body) && this.image == cardPreviewSheet.image;
    }

    public final int hashCode() {
        return this.image.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardPreviewSheet(title=", this.title, ", body=", this.body, ", image=");
        m.append(this.image);
        m.append(")");
        return m.toString();
    }
}
