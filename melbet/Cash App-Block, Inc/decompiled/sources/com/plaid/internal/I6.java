package com.plaid.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class I6 {
    public final String a;
    public final long b;
    public final Map<String, String> c;
    public final J6 d;

    public I6(String str, Map map, J6 j6) {
        long currentTimeMillis = System.currentTimeMillis();
        str.getClass();
        map.getClass();
        j6.getClass();
        this.a = str;
        this.b = currentTimeMillis;
        this.c = map;
        this.d = j6;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I6)) {
            return false;
        }
        I6 i6 = (I6) obj;
        return Intrinsics.areEqual(this.a, i6.a) && this.b == i6.b && Intrinsics.areEqual(this.c, i6.c) && this.d == i6.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        Map<String, String> map = this.c;
        J6 j6 = this.d;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("RemoteLogEvent(eventName=", str, ", timestamp=", j);
        m.append(", metadata=");
        m.append(map);
        m.append(", logLevel=");
        m.append(j6);
        m.append(")");
        return m.toString();
    }

    public I6() {
        throw null;
    }
}
