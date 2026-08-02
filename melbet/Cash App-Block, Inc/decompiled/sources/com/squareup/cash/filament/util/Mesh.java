package com.squareup.cash.filament.util;

import com.google.android.filament.Box;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;

/* loaded from: classes6.dex */
public final class Mesh {
    public final Box aabb;
    public final IndexBuffer indexBuffer;
    public final int renderable;
    public final VertexBuffer vertexBuffer;

    public Mesh(int i, IndexBuffer indexBuffer, VertexBuffer vertexBuffer, Box box) {
        this.renderable = i;
        this.indexBuffer = indexBuffer;
        this.vertexBuffer = vertexBuffer;
        this.aabb = box;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Mesh) {
            Mesh mesh = (Mesh) obj;
            return this.renderable == mesh.renderable && this.indexBuffer.equals(mesh.indexBuffer) && this.vertexBuffer.equals(mesh.vertexBuffer) && this.aabb == mesh.aabb;
        }
        return false;
    }

    public final int hashCode() {
        return this.aabb.hashCode() + ((this.vertexBuffer.hashCode() + ((this.indexBuffer.hashCode() + (Integer.hashCode(this.renderable) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Mesh(renderable=" + this.renderable + ", indexBuffer=" + this.indexBuffer + ", vertexBuffer=" + this.vertexBuffer + ", aabb=" + this.aabb + ")";
    }
}
