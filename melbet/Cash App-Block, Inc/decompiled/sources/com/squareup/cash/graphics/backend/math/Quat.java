package com.squareup.cash.graphics.backend.math;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class Quat {
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public Quat(float[] fArr) {
        fArr.getClass();
        float f = fArr[0];
        float f2 = fArr[1];
        double d = fArr[2] * 0.5f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        double d2 = f2 * 0.5f;
        float cos2 = (float) Math.cos(d2);
        float sin2 = (float) Math.sin(d2);
        double d3 = f * 0.5f;
        float cos3 = (float) Math.cos(d3);
        float sin3 = (float) Math.sin(d3);
        float f3 = cos3 * cos2;
        float f4 = sin3 * sin2;
        this.w = (f4 * sin) + (f3 * cos);
        float f5 = sin3 * cos2;
        float f6 = cos3 * sin2;
        this.x = (f5 * cos) - (f6 * sin);
        this.y = (f5 * sin) + (f6 * cos);
        this.z = (f3 * sin) - (f4 * cos);
    }

    public final float angleShortestPath(Quat quat) {
        quat.getClass();
        return ((float) Math.acos(dot(dot(quat) < RecyclerView.DECELERATION_RATE ? new Quat(-quat.x, -quat.y, -quat.z, -quat.w) : quat) / ((float) Math.sqrt(quat.dot(quat) * dot(this))))) * 2.0f;
    }

    public final float dot(Quat quat) {
        return (this.w * quat.w) + (this.z * quat.z) + (this.y * quat.y) + (this.x * quat.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Quat.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Quat quat = (Quat) obj;
        return this.x == quat.x && this.y == quat.y && this.z == quat.z && this.w == quat.w;
    }

    public final int hashCode() {
        return Float.hashCode(this.w) + CameraState$Type$EnumUnboxingLocalUtility.m(this.z, CameraState$Type$EnumUnboxingLocalUtility.m(this.y, Float.hashCode(this.x) * 31, 31), 31);
    }

    public final Quat slerp(Quat quat, float f) {
        quat.getClass();
        float sqrt = (float) Math.sqrt(quat.dot(quat) * dot(this));
        if (sqrt <= RecyclerView.DECELERATION_RATE) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        float dot = dot(quat) / sqrt;
        float abs = Math.abs(dot);
        if (abs >= 0.9999999f) {
            return this;
        }
        float sin = (float) Math.sin((float) Math.acos(abs));
        if (sin <= RecyclerView.DECELERATION_RATE) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        float f2 = dot < RecyclerView.DECELERATION_RATE ? -1.0f : 1.0f;
        float sin2 = ((float) Math.sin((1.0f - f) * r0)) / sin;
        float sin3 = ((float) Math.sin((f2 * f) * r0)) / sin;
        return new Quat((quat.x * sin3) + (this.x * sin2), (quat.y * sin3) + (this.y * sin2), (quat.z * sin3) + (this.z * sin2), (quat.w * sin3) + (this.w * sin2));
    }

    public final Quat times(Quat quat) {
        quat.getClass();
        float f = quat.x;
        float f2 = this.w;
        float f3 = quat.w;
        float f4 = this.x;
        float f5 = quat.z;
        float f6 = this.y;
        float f7 = quat.y;
        float f8 = this.z;
        return new Quat(((f6 * f5) + ((f4 * f3) + (f2 * f))) - (f8 * f7), ((f8 * f) + ((f6 * f3) + (f2 * f7))) - (f4 * f5), ((f4 * f7) + ((f8 * f3) + (f2 * f5))) - (f6 * f), (((f2 * f3) - (f4 * f)) - (f6 * f7)) - (f8 * f5));
    }

    public final float[] toEulerAngles() {
        float f = this.w;
        float f2 = this.x;
        float f3 = ((f * this.y) - (this.z * f2)) * 2.0f;
        return new float[]{(float) Math.atan2(Recorder$$ExternalSyntheticOutline2.m$1(r3, r11, f * f2, 2.0f), 1.0f - (((r3 * r3) + (f2 * f2)) * 2.0f)), Math.abs(f3) >= 1.0f ? Math.copySign(1.5707964f, f3) : (float) Math.asin(f3), (float) Math.atan2(Recorder$$ExternalSyntheticOutline2.m$1(f2, r3, f * r11, 2.0f), 1.0f - (((r11 * r11) + (r3 * r3)) * 2.0f))};
    }

    public final float[] toRotationTransform() {
        float dot = dot(this);
        float f = dot != 1.0f ? dot > RecyclerView.DECELERATION_RATE ? 2.0f / dot : 0.0f : 2.0f;
        float f2 = this.x;
        float f3 = f2 * f;
        float f4 = this.y;
        float f5 = f4 * f;
        float f6 = this.z;
        float f7 = f * f6;
        float f8 = f2 * f3;
        float f9 = f2 * f5;
        float f10 = f2 * f7;
        float f11 = this.w;
        float f12 = f3 * f11;
        float f13 = f4 * f5;
        float f14 = f4 * f7;
        float f15 = f5 * f11;
        float f16 = f6 * f7;
        float f17 = f11 * f7;
        return new float[]{1.0f - (f13 + f16), f9 - f17, f10 + f15, RecyclerView.DECELERATION_RATE, f9 + f17, 1.0f - (f16 + f8), f14 - f12, RecyclerView.DECELERATION_RATE, f10 - f15, f14 + f12, 1.0f - (f8 + f13), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f};
    }

    public Quat(float f, float[] fArr) {
        fArr.getClass();
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = f4 * f4;
        float sqrt = (float) Math.sqrt(f5 + (f3 * f3) + (f2 * f2));
        double d = f * 0.5f;
        float sin = ((float) Math.sin(d)) / sqrt;
        float f6 = fArr[0] * sin;
        float f7 = fArr[1] * sin;
        float f8 = fArr[2] * sin;
        float cos = (float) Math.cos(d);
        this.x = f6;
        this.y = f7;
        this.z = f8;
        this.w = cos;
    }

    public Quat(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
    }
}
