package com.squareup.cash.payments.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ExpressivePreviewData {
    public final Color backgroundColor;
    public final List backgroundEffects;
    public final Image backgroundImage;
    public final ArrayList stickers;
    public final Color textColor;

    public ExpressivePreviewData(Image image, Color color, List list, Color color2, ArrayList arrayList) {
        image.getClass();
        color.getClass();
        list.getClass();
        this.backgroundImage = image;
        this.backgroundColor = color;
        this.backgroundEffects = list;
        this.textColor = color2;
        this.stickers = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpressivePreviewData)) {
            return false;
        }
        ExpressivePreviewData expressivePreviewData = (ExpressivePreviewData) obj;
        return Intrinsics.areEqual(this.backgroundImage, expressivePreviewData.backgroundImage) && Intrinsics.areEqual(this.backgroundColor, expressivePreviewData.backgroundColor) && Intrinsics.areEqual(this.backgroundEffects, expressivePreviewData.backgroundEffects) && Intrinsics.areEqual(this.textColor, expressivePreviewData.textColor) && this.stickers.equals(expressivePreviewData.stickers);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor, this.backgroundImage.hashCode() * 31, 31), 31, this.backgroundEffects);
        Color color = this.textColor;
        return this.stickers.hashCode() + ((m + (color == null ? 0 : color.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpressivePreviewData(backgroundImage=");
        sb.append(this.backgroundImage);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", backgroundEffects=");
        sb.append(this.backgroundEffects);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", stickers=");
        return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.stickers);
    }
}
