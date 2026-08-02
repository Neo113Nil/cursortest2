package com.squareup.cash.graphics.swampgl.anim;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class TransformChannel {
    public final String name;
    public final ArrayList positionKeys;
    public final ArrayList rotationKeys;
    public final ArrayList scaleKeys;

    public TransformChannel(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.name = str;
        this.positionKeys = arrayList;
        this.rotationKeys = arrayList2;
        this.scaleKeys = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformChannel)) {
            return false;
        }
        TransformChannel transformChannel = (TransformChannel) obj;
        return this.name.equals(transformChannel.name) && this.positionKeys.equals(transformChannel.positionKeys) && this.rotationKeys.equals(transformChannel.rotationKeys) && this.scaleKeys.equals(transformChannel.scaleKeys);
    }

    public final int hashCode() {
        return this.scaleKeys.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.rotationKeys, CameraState$Type$EnumUnboxingLocalUtility.m(this.positionKeys, this.name.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.positionKeys, "TransformChannel(name=", this.name, ", positionKeys=", ", rotationKeys=");
        m.append(this.rotationKeys);
        m.append(", scaleKeys=");
        m.append(this.scaleKeys);
        m.append(")");
        return m.toString();
    }
}
