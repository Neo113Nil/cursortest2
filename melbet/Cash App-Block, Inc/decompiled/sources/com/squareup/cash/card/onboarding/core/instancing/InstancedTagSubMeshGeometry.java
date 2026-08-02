package com.squareup.cash.card.onboarding.core.instancing;

import android.opengl.GLES20;
import android.opengl.GLES30;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Geometry;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.SubMesh;
import com.squareup.cash.graphics.swampgl.components.Transform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class InstancedTagSubMeshGeometry implements Geometry {
    public int cachedProgramId;
    public final GLLauncher glLauncher;
    public int instanceCount;
    public int instanceVboId;
    public int locBitangent;
    public int locInstanceModel0;
    public int locInstanceModel1;
    public int locInstanceModel2;
    public int locInstanceModel3;
    public int locInstanceOpacity;
    public int locNormal;
    public int locPosition;
    public int locTangent;
    public int locUV;
    public final MeshGeometry mesh;
    public final ReadonlyStateFlow ready;
    public final int[] scratchInt;
    public ByteBuffer stagingByteBuffer;
    public int stagingCapacity;
    public FloatBuffer stagingFloatBuffer;
    public final SubMesh subMesh;
    public int vaoId;

    public InstancedTagSubMeshGeometry(MeshGeometry meshGeometry, SubMesh subMesh, GLLauncher gLLauncher) {
        gLLauncher.getClass();
        this.mesh = meshGeometry;
        this.subMesh = subMesh;
        this.glLauncher = gLLauncher;
        this.ready = meshGeometry.ready;
        ByteBuffer order = ByteBuffer.allocateDirect(1088).order(ByteOrder.nativeOrder());
        order.getClass();
        this.stagingByteBuffer = order;
        FloatBuffer asFloatBuffer = order.asFloatBuffer();
        asFloatBuffer.getClass();
        this.stagingFloatBuffer = asFloatBuffer;
        this.stagingCapacity = 16;
        this.scratchInt = new int[1];
        this.locInstanceModel0 = -1;
        this.locInstanceModel1 = -1;
        this.locInstanceModel2 = -1;
        this.locInstanceModel3 = -1;
        this.locInstanceOpacity = -1;
        this.locPosition = -1;
        this.locNormal = -1;
        this.locTangent = -1;
        this.locBitangent = -1;
        this.locUV = -1;
    }

    public static void enableInstanceVec4(int i, int i2) {
        if (i < 0) {
            return;
        }
        GLES20.glEnableVertexAttribArray(i);
        GLES20.glVertexAttribPointer(i, 4, 5126, false, 68, i2);
        GLES30.glVertexAttribDivisor(i, 1);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final void draw() {
        if (this.instanceCount == 0) {
            return;
        }
        MeshGeometry meshGeometry = this.mesh;
        if (meshGeometry.vboId == 0 || meshGeometry.iboId == 0) {
            return;
        }
        int[] iArr = this.scratchInt;
        GLES20.glGetIntegerv(35725, iArr, 0);
        int i = iArr[0];
        if (i != this.cachedProgramId) {
            this.cachedProgramId = i;
            this.locPosition = GLES20.glGetAttribLocation(i, "aPosition");
            this.locNormal = GLES20.glGetAttribLocation(i, "aNormal");
            this.locTangent = GLES20.glGetAttribLocation(i, "aTangent");
            this.locBitangent = GLES20.glGetAttribLocation(i, "aBitangent");
            this.locUV = GLES20.glGetAttribLocation(i, "aUV");
            this.locInstanceModel0 = GLES20.glGetAttribLocation(i, "aInstanceModel0");
            this.locInstanceModel1 = GLES20.glGetAttribLocation(i, "aInstanceModel1");
            this.locInstanceModel2 = GLES20.glGetAttribLocation(i, "aInstanceModel2");
            this.locInstanceModel3 = GLES20.glGetAttribLocation(i, "aInstanceModel3");
            this.locInstanceOpacity = GLES20.glGetAttribLocation(i, "aInstanceOpacity");
        }
        if (this.locPosition < 0) {
            return;
        }
        if (this.instanceVboId == 0) {
            int[] iArr2 = new int[1];
            GLES20.glGenBuffers(1, iArr2, 0);
            this.instanceVboId = iArr2[0];
        }
        if (this.vaoId == 0) {
            int[] iArr3 = new int[1];
            GLES30.glGenVertexArrays(1, iArr3, 0);
            this.vaoId = iArr3[0];
        }
        int i2 = this.instanceCount * 68;
        GLES20.glBindBuffer(34962, this.instanceVboId);
        GLES20.glBufferData(34962, i2, this.stagingByteBuffer, 35048);
        GLES30.glBindVertexArray(this.vaoId);
        GLES20.glBindBuffer(34962, meshGeometry.vboId);
        int i3 = this.locPosition;
        if (i3 >= 0) {
            GLES20.glEnableVertexAttribArray(i3);
            GLES20.glVertexAttribPointer(this.locPosition, 3, 5126, false, 56, 0);
        }
        int i4 = this.locNormal;
        if (i4 >= 0) {
            GLES20.glEnableVertexAttribArray(i4);
            GLES20.glVertexAttribPointer(this.locNormal, 3, 5126, false, 56, 12);
        }
        int i5 = this.locTangent;
        if (i5 >= 0) {
            GLES20.glEnableVertexAttribArray(i5);
            GLES20.glVertexAttribPointer(this.locTangent, 3, 5126, false, 56, 24);
        }
        int i6 = this.locBitangent;
        if (i6 >= 0) {
            GLES20.glEnableVertexAttribArray(i6);
            GLES20.glVertexAttribPointer(this.locBitangent, 3, 5126, false, 56, 36);
        }
        int i7 = this.locUV;
        if (i7 >= 0) {
            GLES20.glEnableVertexAttribArray(i7);
            GLES20.glVertexAttribPointer(this.locUV, 2, 5126, false, 56, 48);
        }
        GLES20.glBindBuffer(34962, this.instanceVboId);
        int i8 = this.locInstanceModel0;
        if (i8 >= 0) {
            enableInstanceVec4(i8, 0);
            enableInstanceVec4(this.locInstanceModel1, 16);
            enableInstanceVec4(this.locInstanceModel2, 32);
            enableInstanceVec4(this.locInstanceModel3, 48);
        }
        int i9 = this.locInstanceOpacity;
        if (i9 >= 0) {
            GLES20.glEnableVertexAttribArray(i9);
            GLES20.glVertexAttribPointer(this.locInstanceOpacity, 1, 5126, false, 68, 64);
            GLES30.glVertexAttribDivisor(this.locInstanceOpacity, 1);
        }
        GLES20.glBindBuffer(34963, meshGeometry.iboId);
        SubMesh subMesh = this.subMesh;
        GLES30.glDrawElementsInstanced(4, subMesh.indexCount, 5125, subMesh.indexOffset * 4, this.instanceCount);
        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.locPosition), Integer.valueOf(this.locNormal), Integer.valueOf(this.locTangent), Integer.valueOf(this.locBitangent), Integer.valueOf(this.locUV)}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue >= 0) {
                GLES20.glDisableVertexAttribArray(intValue);
            }
        }
        Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(this.locInstanceModel0), Integer.valueOf(this.locInstanceModel1), Integer.valueOf(this.locInstanceModel2), Integer.valueOf(this.locInstanceModel3), Integer.valueOf(this.locInstanceOpacity)}).iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Number) it2.next()).intValue();
            if (intValue2 >= 0) {
                GLES20.glDisableVertexAttribArray(intValue2);
                GLES30.glVertexAttribDivisor(intValue2, 0);
            }
        }
        GLES30.glBindVertexArray(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final AABB getAABB() {
        return this.mesh.getAABB();
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final StateFlow getReady() {
        return this.ready;
    }

    @Override // com.squareup.cash.graphics.swampgl.components.Geometry
    public final boolean isInstanced() {
        return true;
    }

    public final void setInstances(List list, float[] fArr) {
        list.getClass();
        fArr.getClass();
        int size = list.size();
        this.instanceCount = size;
        if (size == 0) {
            return;
        }
        if (fArr.length < size) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(fArr.length, size, "opacities (", ") shorter than transforms (", ")"));
            return;
        }
        int i = this.stagingCapacity;
        if (size > i) {
            do {
                i *= 2;
            } while (i < size);
            ByteBuffer order = ByteBuffer.allocateDirect(i * 68).order(ByteOrder.nativeOrder());
            order.getClass();
            this.stagingByteBuffer = order;
            FloatBuffer asFloatBuffer = order.asFloatBuffer();
            asFloatBuffer.getClass();
            this.stagingFloatBuffer = asFloatBuffer;
            this.stagingCapacity = i;
        }
        this.stagingFloatBuffer.clear();
        int i2 = 0;
        while (true) {
            FloatBuffer floatBuffer = this.stagingFloatBuffer;
            if (i2 >= size) {
                floatBuffer.position(0);
                return;
            } else {
                floatBuffer.put(((Transform) list.get(i2))._modelMatrix, 0, 16);
                this.stagingFloatBuffer.put(fArr[i2]);
                i2++;
            }
        }
    }
}
