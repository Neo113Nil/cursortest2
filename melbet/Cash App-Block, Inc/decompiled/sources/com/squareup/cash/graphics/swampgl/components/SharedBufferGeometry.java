package com.squareup.cash.graphics.swampgl.components;

import android.opengl.GLES20;
import android.opengl.GLES30;
import kotlin.Triple;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class SharedBufferGeometry implements Geometry {
    public static final Triple[] ATTRIBUTES = {new Triple("aPosition", 3, 0), new Triple("aNormal", 3, 12), new Triple("aTangent", 3, 24), new Triple("aBitangent", 3, 36), new Triple("aUV", 2, 48)};
    public final ReadonlyStateFlow ready;
    public final MeshGeometry source;
    public int vaoId;

    public SharedBufferGeometry(MeshGeometry meshGeometry) {
        meshGeometry.getClass();
        this.source = meshGeometry;
        this.ready = meshGeometry.ready;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final void draw() {
        MeshGeometry meshGeometry = this.source;
        if (meshGeometry.vboId == 0 || meshGeometry.iboId == 0) {
            return;
        }
        int i = this.vaoId;
        if (i == 0) {
            int[] iArr = new int[1];
            GLES30.glGenVertexArrays(1, iArr, 0);
            int i2 = iArr[0];
            GLES30.glBindVertexArray(i2);
            int[] iArr2 = new int[1];
            GLES20.glGetIntegerv(35725, iArr2, 0);
            int i3 = iArr2[0];
            GLES20.glBindBuffer(34962, meshGeometry.vboId);
            for (int i4 = 0; i4 < 5; i4++) {
                Triple triple = ATTRIBUTES[i4];
                String str = (String) triple.first;
                int intValue = ((Number) triple.second).intValue();
                int intValue2 = ((Number) triple.third).intValue();
                str.getClass();
                int glGetAttribLocation = GLES20.glGetAttribLocation(i3, str);
                if (glGetAttribLocation >= 0) {
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                    GLES20.glVertexAttribPointer(glGetAttribLocation, intValue, 5126, false, 56, intValue2);
                }
            }
            GLES20.glBindBuffer(34963, meshGeometry.iboId);
            GLES30.glBindVertexArray(0);
            this.vaoId = i2;
            Timber.Forest forest = Timber.Forest;
            forest.tag("SharedBufferGeometry");
            forest.d("Created shared VAO " + i2 + " for source mesh", new Object[0]);
            i = i2;
        }
        GLES30.glBindVertexArray(i);
        GLES20.glDrawElements(4, meshGeometry.indexCount, 5125, 0);
        GLES30.glBindVertexArray(0);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final AABB getAABB() {
        return this.source.getAABB();
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final StateFlow getReady() {
        return this.ready;
    }
}
