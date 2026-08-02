package com.squareup.cash.graphics.swampgl.anim;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class CashAnimPlayer {
    public final SVGAndroidRenderer anim;
    public final TransformChannel channel;

    public CashAnimPlayer(SVGAndroidRenderer sVGAndroidRenderer) {
        this.anim = sVGAndroidRenderer;
        this.channel = (TransformChannel) ((ArrayList) sVGAndroidRenderer.fullPath).get(0);
    }

    public static int binarySearchFloor(ArrayList arrayList, float f) {
        int size = arrayList.size() - 2;
        int i = 0;
        while (i < size) {
            int i2 = ((i + size) + 1) / 2;
            if (((Keyframe) arrayList.get(i2)).time <= f) {
                i = i2;
            } else {
                size = i2 - 1;
            }
        }
        return i;
    }

    public static Vector3 evaluateVec3(ArrayList arrayList, float f, Vector3 vector3) {
        if (arrayList.isEmpty()) {
            return vector3;
        }
        if (arrayList.size() == 1 || f <= ((Keyframe) CollectionsKt.first((List) arrayList)).time) {
            return (Vector3) ((Keyframe) CollectionsKt.first((List) arrayList)).value;
        }
        if (f >= ((Keyframe) CollectionsKt.last((List) arrayList)).time) {
            return (Vector3) ((Keyframe) CollectionsKt.last((List) arrayList)).value;
        }
        int binarySearchFloor = binarySearchFloor(arrayList, f);
        Keyframe keyframe = (Keyframe) arrayList.get(binarySearchFloor);
        Keyframe keyframe2 = (Keyframe) arrayList.get(binarySearchFloor + 1);
        float f2 = keyframe2.time;
        float f3 = keyframe.time;
        Object obj = keyframe.value;
        if (f2 == f3) {
            return (Vector3) obj;
        }
        float f4 = (f - f3) / (f2 - f3);
        Vector3 vector32 = (Vector3) obj;
        Vector3 vector33 = (Vector3) keyframe2.value;
        float f5 = vector32.x;
        float m = CameraState$Type$EnumUnboxingLocalUtility.m(vector33.x, f5, f4, f5);
        float f6 = vector32.y;
        float m2 = CameraState$Type$EnumUnboxingLocalUtility.m(vector33.y, f6, f4, f6);
        float f7 = vector32.z;
        return new Vector3(m, m2, CameraState$Type$EnumUnboxingLocalUtility.m(vector33.z, f7, f4, f7));
    }

    public final TransformFrame evaluate(float f) {
        Quat quat;
        float f2 = this.anim.dpi;
        float f3 = f2 > RecyclerView.DECELERATION_RATE ? f % f2 : 0.0f;
        TransformChannel transformChannel = this.channel;
        Vector3 evaluateVec3 = evaluateVec3(transformChannel.positionKeys, f3, Vector3.ZERO);
        ArrayList arrayList = transformChannel.rotationKeys;
        if (arrayList.isEmpty()) {
            quat = new Quat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        } else if (arrayList.size() == 1 || f3 <= ((Keyframe) CollectionsKt.first((List) arrayList)).time) {
            quat = (Quat) ((Keyframe) CollectionsKt.first((List) arrayList)).value;
        } else if (f3 >= ((Keyframe) CollectionsKt.last((List) arrayList)).time) {
            quat = (Quat) ((Keyframe) CollectionsKt.last((List) arrayList)).value;
        } else {
            int binarySearchFloor = binarySearchFloor(arrayList, f3);
            Keyframe keyframe = (Keyframe) arrayList.get(binarySearchFloor);
            Keyframe keyframe2 = (Keyframe) arrayList.get(binarySearchFloor + 1);
            float f4 = keyframe2.time;
            float f5 = keyframe.time;
            Object obj = keyframe.value;
            quat = f4 == f5 ? (Quat) obj : ((Quat) obj).slerp((Quat) keyframe2.value, (f3 - f5) / (f4 - f5));
        }
        return new TransformFrame(evaluateVec3, quat, evaluateVec3(transformChannel.scaleKeys, f3, Vector3.ONE));
    }
}
