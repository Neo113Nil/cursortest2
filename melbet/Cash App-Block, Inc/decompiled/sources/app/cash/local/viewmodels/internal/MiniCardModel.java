package app.cash.local.viewmodels.internal;

import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MiniCardModel {
    public final LocalColor color;
    public final LocalImage image;

    public MiniCardModel(LocalColor localColor, LocalImage localImage) {
        this.color = localColor;
        this.image = localImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniCardModel)) {
            return false;
        }
        MiniCardModel miniCardModel = (MiniCardModel) obj;
        return Intrinsics.areEqual(this.color, miniCardModel.color) && Intrinsics.areEqual(this.image, miniCardModel.image);
    }

    public final int hashCode() {
        LocalColor localColor = this.color;
        int hashCode = (localColor == null ? 0 : localColor.hashCode()) * 31;
        LocalImage localImage = this.image;
        return hashCode + (localImage != null ? localImage.hashCode() : 0);
    }

    public final String toString() {
        return "MiniCardModel(brandToken=null, color=" + this.color + ", image=" + this.image + ")";
    }
}
