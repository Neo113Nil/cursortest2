package com.squareup.cash.card.onboarding.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.graphics.backend.math.Vector3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WandStatePose {
    public final float darkening;
    public final Vector3 eulerOffset;
    public final float lightIntensity;
    public final float opacity;
    public final Vector3 positionOffset;
    public final float saturation;
    public final float scale;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WandStatePose(com.squareup.cash.graphics.backend.math.Vector3 r9, com.squareup.cash.graphics.backend.math.Vector3 r10, float r11, float r12, float r13, float r14, float r15, int r16) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L6
            com.squareup.cash.graphics.backend.math.Vector3 r9 = com.squareup.cash.graphics.backend.math.Vector3.ZERO
        L6:
            r1 = r9
            r9 = r16 & 4
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto Lf
            r3 = r0
            goto L10
        Lf:
            r3 = r11
        L10:
            r9 = r16 & 8
            if (r9 == 0) goto L16
            r4 = r0
            goto L17
        L16:
            r4 = r12
        L17:
            r9 = r16 & 16
            if (r9 == 0) goto L1c
            r13 = 0
        L1c:
            r5 = r13
            r9 = r16 & 32
            if (r9 == 0) goto L23
            r6 = r0
            goto L24
        L23:
            r6 = r14
        L24:
            r9 = r16 & 64
            if (r9 == 0) goto L2c
            r7 = r0
            r2 = r10
            r0 = r8
            goto L2f
        L2c:
            r7 = r15
            r0 = r8
            r2 = r10
        L2f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.card.onboarding.graphics.WandStatePose.<init>(com.squareup.cash.graphics.backend.math.Vector3, com.squareup.cash.graphics.backend.math.Vector3, float, float, float, float, float, int):void");
    }

    public static WandStatePose copy$default(WandStatePose wandStatePose, Vector3 vector3) {
        Vector3 vector32 = wandStatePose.positionOffset;
        float f = wandStatePose.scale;
        float f2 = wandStatePose.opacity;
        float f3 = wandStatePose.darkening;
        float f4 = wandStatePose.lightIntensity;
        float f5 = wandStatePose.saturation;
        wandStatePose.getClass();
        vector32.getClass();
        return new WandStatePose(vector32, vector3, f, f2, f3, f4, f5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WandStatePose)) {
            return false;
        }
        WandStatePose wandStatePose = (WandStatePose) obj;
        return Intrinsics.areEqual(this.positionOffset, wandStatePose.positionOffset) && Intrinsics.areEqual(this.eulerOffset, wandStatePose.eulerOffset) && Float.compare(this.scale, wandStatePose.scale) == 0 && Float.compare(this.opacity, wandStatePose.opacity) == 0 && Float.compare(this.darkening, wandStatePose.darkening) == 0 && Float.compare(this.lightIntensity, wandStatePose.lightIntensity) == 0 && Float.compare(this.saturation, wandStatePose.saturation) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.saturation) + CameraState$Type$EnumUnboxingLocalUtility.m(this.lightIntensity, CameraState$Type$EnumUnboxingLocalUtility.m(this.darkening, CameraState$Type$EnumUnboxingLocalUtility.m(this.opacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.scale, (this.eulerOffset.hashCode() + (this.positionOffset.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WandStatePose(positionOffset=");
        sb.append(this.positionOffset);
        sb.append(", eulerOffset=");
        sb.append(this.eulerOffset);
        sb.append(", scale=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.scale, ", opacity=", this.opacity, ", darkening=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.darkening, ", lightIntensity=", this.lightIntensity, ", saturation=");
        return Recorder$$ExternalSyntheticOutline1.m(this.saturation, ")", sb);
    }

    public WandStatePose(Vector3 vector3, Vector3 vector32, float f, float f2, float f3, float f4, float f5) {
        vector3.getClass();
        this.positionOffset = vector3;
        this.eulerOffset = vector32;
        this.scale = f;
        this.opacity = f2;
        this.darkening = f3;
        this.lightIntensity = f4;
        this.saturation = f5;
    }
}
