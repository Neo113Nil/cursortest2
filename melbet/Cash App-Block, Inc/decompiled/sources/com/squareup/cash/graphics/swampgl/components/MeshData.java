package com.squareup.cash.graphics.swampgl.components;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MeshData {
    public final AABB aabb;
    public final int[] indexData;
    public final List subMeshes;
    public final float[] vertexData;

    public MeshData(float[] fArr, int[] iArr, AABB aabb, List list) {
        list.getClass();
        this.vertexData = fArr;
        this.indexData = iArr;
        this.aabb = aabb;
        this.subMeshes = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MeshData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        MeshData meshData = (MeshData) obj;
        return Arrays.equals(this.vertexData, meshData.vertexData) && Arrays.equals(this.indexData, meshData.indexData) && this.aabb.equals(meshData.aabb) && Intrinsics.areEqual(this.subMeshes, meshData.subMeshes);
    }

    public final int hashCode() {
        return this.subMeshes.hashCode() + ((this.aabb.hashCode() + ((((Arrays.hashCode(this.indexData) + (Arrays.hashCode(this.vertexData) * 31)) * 31) + 14) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MeshData(vertexData=", Arrays.toString(this.vertexData), ", indexData=", Arrays.toString(this.indexData), ", vertexStride=14, aabb=");
        m.append(this.aabb);
        m.append(", subMeshes=");
        m.append(this.subMeshes);
        m.append(")");
        return m.toString();
    }
}
