package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PreviewSticker {
    public final String accessibilityDescription;
    public final int id;
    public final String imageUrl;
    public final float rotation;
    public final float scaleFactor;
    public final int universalX;
    public final int universalY;
    public final float z;

    public PreviewSticker(int i, String str, int i2, int i3, float f, float f2, float f3, String str2) {
        str.getClass();
        this.id = i;
        this.imageUrl = str;
        this.universalX = i2;
        this.universalY = i3;
        this.rotation = f;
        this.scaleFactor = f2;
        this.z = f3;
        this.accessibilityDescription = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewSticker)) {
            return false;
        }
        PreviewSticker previewSticker = (PreviewSticker) obj;
        return this.id == previewSticker.id && Intrinsics.areEqual(this.imageUrl, previewSticker.imageUrl) && this.universalX == previewSticker.universalX && this.universalY == previewSticker.universalY && Float.compare(this.rotation, previewSticker.rotation) == 0 && Float.compare(this.scaleFactor, previewSticker.scaleFactor) == 0 && Float.compare(this.z, previewSticker.z) == 0 && Intrinsics.areEqual(this.accessibilityDescription, previewSticker.accessibilityDescription);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.z, CameraState$Type$EnumUnboxingLocalUtility.m(this.scaleFactor, CameraState$Type$EnumUnboxingLocalUtility.m(this.rotation, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.universalY, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.universalX, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.imageUrl), 31), 31), 31), 31), 31);
        String str = this.accessibilityDescription;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("PreviewSticker(id=", this.id, ", imageUrl=", this.imageUrl, ", universalX=");
        Recorder$$ExternalSyntheticOutline1.m105m(this.universalX, this.universalY, ", universalY=", ", rotation=", m);
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.rotation, ", scaleFactor=", this.scaleFactor, ", z=");
        m.append(this.z);
        m.append(", accessibilityDescription=");
        m.append(this.accessibilityDescription);
        m.append(")");
        return m.toString();
    }
}
