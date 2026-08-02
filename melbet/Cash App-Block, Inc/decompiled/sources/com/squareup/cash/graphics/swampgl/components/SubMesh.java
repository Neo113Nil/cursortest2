package com.squareup.cash.graphics.swampgl.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class SubMesh {
    public final int indexCount;
    public final int indexOffset;
    public final String name;

    public SubMesh(String str, int i, int i2) {
        this.name = str;
        this.indexOffset = i;
        this.indexCount = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubMesh)) {
            return false;
        }
        SubMesh subMesh = (SubMesh) obj;
        return this.name.equals(subMesh.name) && this.indexOffset == subMesh.indexOffset && this.indexCount == subMesh.indexCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.indexCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.indexOffset, this.name.hashCode() * 31, 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.indexCount, ")", Recorder$$ExternalSyntheticOutline2.m("SubMesh(name=", this.indexOffset, this.name, ", indexOffset=", ", indexCount="));
    }
}
