package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v2.BackgroundEffect;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Background implements Parcelable {
    public static final Parcelable.Creator<Background> CREATOR = new Size.Creator(3);
    public final String accessibilityDescription;
    public final Color color;
    public final TextFormat defaultTextFormat;
    public final List effects;
    public final Image fullSize;
    public final String id;
    public final boolean isDefault;
    public final Image thumbnail;

    public Background(String str, Image image, Image image2, Color color, boolean z, TextFormat textFormat, List list, String str2) {
        str.getClass();
        image.getClass();
        image2.getClass();
        color.getClass();
        textFormat.getClass();
        list.getClass();
        this.id = str;
        this.fullSize = image;
        this.thumbnail = image2;
        this.color = color;
        this.isDefault = z;
        this.defaultTextFormat = textFormat;
        this.effects = list;
        this.accessibilityDescription = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Background)) {
            return false;
        }
        Background background = (Background) obj;
        return Intrinsics.areEqual(this.id, background.id) && Intrinsics.areEqual(this.fullSize, background.fullSize) && Intrinsics.areEqual(this.thumbnail, background.thumbnail) && Intrinsics.areEqual(this.color, background.color) && this.isDefault == background.isDefault && Intrinsics.areEqual(this.defaultTextFormat, background.defaultTextFormat) && Intrinsics.areEqual(this.effects, background.effects) && Intrinsics.areEqual(this.accessibilityDescription, background.accessibilityDescription);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.defaultTextFormat.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.color, (this.thumbnail.hashCode() + ((this.fullSize.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31), 31, this.isDefault)) * 31, 31, this.effects);
        String str = this.accessibilityDescription;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Background(id=" + this.id + ", fullSize=" + this.fullSize + ", thumbnail=" + this.thumbnail + ", color=" + this.color + ", isDefault=" + this.isDefault + ", defaultTextFormat=" + this.defaultTextFormat + ", effects=" + this.effects + ", accessibilityDescription=" + this.accessibilityDescription + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeParcelable(this.fullSize, i);
        parcel.writeParcelable(this.thumbnail, i);
        parcel.writeParcelable(this.color, i);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeParcelable(this.defaultTextFormat, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.effects, parcel);
        while (m.hasNext()) {
            parcel.writeString(((BackgroundEffect) m.next()).name());
        }
        parcel.writeString(this.accessibilityDescription);
    }
}
