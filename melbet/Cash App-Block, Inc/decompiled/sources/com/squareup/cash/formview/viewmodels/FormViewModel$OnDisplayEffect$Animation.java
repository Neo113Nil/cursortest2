package com.squareup.cash.formview.viewmodels;

import com.squareup.protos.cash.ui.Animation;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FormViewModel$OnDisplayEffect$Animation extends CameraPropertiesKt {
    public final Animation animation;

    public FormViewModel$OnDisplayEffect$Animation(Animation animation) {
        animation.getClass();
        this.animation = animation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FormViewModel$OnDisplayEffect$Animation) && Intrinsics.areEqual(this.animation, ((FormViewModel$OnDisplayEffect$Animation) obj).animation);
    }

    public final int hashCode() {
        return this.animation.hashCode();
    }

    public final String toString() {
        return "Animation(animation=" + this.animation + ")";
    }
}
