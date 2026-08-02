package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wdw {
    public final Function0 a;

    public wdw(Function0 function0) {
        xdw xdwVar = xdw.a;
        function0.getClass();
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdw) || !Intrinsics.d(this.a, ((wdw) obj).a)) {
            return false;
        }
        xdw xdwVar = xdw.a;
        return true;
    }

    public final int hashCode() {
        return xdw.a.hashCode() + ((this.a.hashCode() + 148023428) * 31);
    }

    public final String toString() {
        return "YnisonAppConfig(appName=Yandex Music, versionName=2026.07.4 #157gpr, deviceId=" + this.a + ", deviceType=" + xdw.a + ")";
    }
}
