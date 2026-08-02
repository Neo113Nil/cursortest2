package com.squareup.cash.graphics.swampgl.components.ibl;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class IblMipLevel {
    public final LinkedHashMap faces;
    public final int height;
    public final int level;
    public final int width;

    public IblMipLevel(int i, int i2, int i3, LinkedHashMap linkedHashMap) {
        this.level = i;
        this.width = i2;
        this.height = i3;
        this.faces = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IblMipLevel)) {
            return false;
        }
        IblMipLevel iblMipLevel = (IblMipLevel) obj;
        return this.level == iblMipLevel.level && this.width == iblMipLevel.width && this.height == iblMipLevel.height && this.faces.equals(iblMipLevel.faces);
    }

    public final int hashCode() {
        return this.faces.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, Integer.hashCode(this.level) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.level, this.width, "IblMipLevel(level=", ", width=", ", height=");
        m107m.append(this.height);
        m107m.append(", faces=");
        m107m.append(this.faces);
        m107m.append(")");
        return m107m.toString();
    }
}
