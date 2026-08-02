package com.datadog.android.core.feature.event;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class JvmCrash$Rum {
    public final String message;
    public final ArrayList threads;
    public final Throwable throwable;

    public JvmCrash$Rum(String str, Throwable th, ArrayList arrayList) {
        this.throwable = th;
        this.message = str;
        this.threads = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JvmCrash$Rum)) {
            return false;
        }
        JvmCrash$Rum jvmCrash$Rum = (JvmCrash$Rum) obj;
        return this.throwable.equals(jvmCrash$Rum.throwable) && this.message.equals(jvmCrash$Rum.message) && this.threads.equals(jvmCrash$Rum.threads);
    }

    public final int hashCode() {
        return this.threads.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.throwable.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rum(throwable=");
        sb.append(this.throwable);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", threads=");
        return Recorder$$ExternalSyntheticOutline1.m(")", sb, this.threads);
    }
}
