package com.squareup.cash.graphics.backend.engine;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.geometry.Size;
import com.squareup.cash.graphics.backend.math.Matrix4;
import com.squareup.cash.graphics.backend.math.Vector4;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CameraState {
    public final Vector4 position;
    public final Matrix4 projectionMatrix;
    public final long screenSize;
    public final Matrix4 viewMatrix;

    public CameraState(long j, Matrix4 matrix4, Matrix4 matrix42, Vector4 vector4) {
        matrix4.getClass();
        matrix42.getClass();
        this.screenSize = j;
        this.viewMatrix = matrix4;
        this.projectionMatrix = matrix42;
        this.position = vector4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        return Size.m639equalsimpl0(this.screenSize, cameraState.screenSize) && Float.compare(0.1f, 0.1f) == 0 && Float.compare(20.0f, 20.0f) == 0 && Intrinsics.areEqual(this.viewMatrix, cameraState.viewMatrix) && Intrinsics.areEqual(this.projectionMatrix, cameraState.projectionMatrix) && this.position.equals(cameraState.position);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.position.vector) + ((Arrays.hashCode(this.projectionMatrix.matrix) + ((Arrays.hashCode(this.viewMatrix.matrix) + CameraState$Type$EnumUnboxingLocalUtility.m(20.0f, CameraState$Type$EnumUnboxingLocalUtility.m(0.1f, Long.hashCode(this.screenSize) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CameraState(screenSize=" + Size.m646toStringimpl(this.screenSize) + ", near=0.1, far=20.0, viewMatrix=" + this.viewMatrix + ", projectionMatrix=" + this.projectionMatrix + ", position=" + this.position + ")";
    }
}
