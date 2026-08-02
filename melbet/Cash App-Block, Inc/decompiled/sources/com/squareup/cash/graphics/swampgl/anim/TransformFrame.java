package com.squareup.cash.graphics.swampgl.anim;

import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TransformFrame {
    public final Vector3 position;
    public final Quat rotation;
    public final Vector3 scale;

    public TransformFrame(Vector3 vector3, Quat quat, Vector3 vector32) {
        vector3.getClass();
        quat.getClass();
        vector32.getClass();
        this.position = vector3;
        this.rotation = quat;
        this.scale = vector32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformFrame)) {
            return false;
        }
        TransformFrame transformFrame = (TransformFrame) obj;
        return Intrinsics.areEqual(this.position, transformFrame.position) && Intrinsics.areEqual(this.rotation, transformFrame.rotation) && Intrinsics.areEqual(this.scale, transformFrame.scale);
    }

    public final int hashCode() {
        return this.scale.hashCode() + ((this.rotation.hashCode() + (this.position.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TransformFrame(position=" + this.position + ", rotation=" + this.rotation + ", scale=" + this.scale + ")";
    }
}
