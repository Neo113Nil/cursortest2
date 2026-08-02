package androidx.camera.core.impl;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class CameraValidatorImpl$ValidationCriteria {
    public final boolean checkBack;
    public final boolean checkFront;

    public CameraValidatorImpl$ValidationCriteria(boolean z, boolean z2) {
        this.checkBack = z;
        this.checkFront = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraValidatorImpl$ValidationCriteria)) {
            return false;
        }
        CameraValidatorImpl$ValidationCriteria cameraValidatorImpl$ValidationCriteria = (CameraValidatorImpl$ValidationCriteria) obj;
        return this.checkBack == cameraValidatorImpl$ValidationCriteria.checkBack && this.checkFront == cameraValidatorImpl$ValidationCriteria.checkFront;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.checkFront) + (Boolean.hashCode(this.checkBack) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationCriteria(checkBack=");
        sb.append(this.checkBack);
        sb.append(", checkFront=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.checkFront, ')');
    }
}
