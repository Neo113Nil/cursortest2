package com.squareup.cash.graphics.swampgl.components;

import android.opengl.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class Transform {
    public float[] _modelMatrix;
    public final StateFlowImpl _position;
    public final StateFlowImpl _rotation;
    public final StateFlowImpl _scale;
    public final Transform$special$$inlined$map$1 dirty;

    public Transform() {
        FlowKt.asStateFlow(FlowKt.MutableStateFlow(Boolean.TRUE));
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Vector3.ZERO);
        this._position = MutableStateFlow;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(new Quat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f));
        this._rotation = MutableStateFlow2;
        StateFlowImpl MutableStateFlow3 = FlowKt.MutableStateFlow(Vector3.ONE);
        this._scale = MutableStateFlow3;
        this._modelMatrix = new float[16];
        this.dirty = new Transform$special$$inlined$map$1(FlowKt.merge(MutableStateFlow, MutableStateFlow2, MutableStateFlow3), this, 0);
        this._modelMatrix = computeModelMatrix();
    }

    public final float[] computeModelMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, getScale().x, getScale().y, getScale().z);
        float[] rotationTransform = ((Quat) this._rotation.getValue()).toRotationTransform();
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        StateFlowImpl stateFlowImpl = this._position;
        Matrix.translateM(fArr2, 0, ((Vector3) stateFlowImpl.getValue()).x, ((Vector3) stateFlowImpl.getValue()).y, ((Vector3) stateFlowImpl.getValue()).z);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, rotationTransform, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.multiplyMM(fArr4, 0, fArr3, 0, fArr, 0);
        return fArr4;
    }

    public final Vector3 getScale() {
        return (Vector3) this._scale.getValue();
    }

    public final void setPosition(Vector3 vector3) {
        vector3.getClass();
        StateFlowImpl stateFlowImpl = this._position;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, vector3);
    }

    public final void setRotation(Quat quat) {
        quat.getClass();
        StateFlowImpl stateFlowImpl = this._rotation;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, quat);
    }

    public final void setScale(Vector3 vector3) {
        vector3.getClass();
        StateFlowImpl stateFlowImpl = this._scale;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, vector3);
    }
}
