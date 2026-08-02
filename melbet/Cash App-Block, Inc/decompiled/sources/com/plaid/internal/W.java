package com.plaid.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class W {
    public final E5 a;

    public W(E5 e5) {
        e5.getClass();
        this.a = e5;
    }

    public final X6 a(String str) {
        if (Intrinsics.areEqual(str, "X6")) {
            return new X6(this.a);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Unknown crash api class: ", str));
        return null;
    }
}
