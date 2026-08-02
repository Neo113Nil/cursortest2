package com.squareup.cash.securitysignals.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SignalsContext {
    public final List touchEvents;

    public SignalsContext(List list) {
        list.getClass();
        this.touchEvents = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SignalsContext) && Intrinsics.areEqual(this.touchEvents, ((SignalsContext) obj).touchEvents);
    }

    public final List getTouchEvents() {
        return this.touchEvents;
    }

    public final int hashCode() {
        return this.touchEvents.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("SignalsContext(touchEvents=", ")", this.touchEvents);
    }
}
