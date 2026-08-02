package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ule {
    public final String a;
    public final List b;

    public ule(String str, c5b c5bVar) {
        this.a = str;
        this.b = c5bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ule.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ule uleVar = (ule) obj;
        return this.a.equals(uleVar.a) && Intrinsics.d(this.b, uleVar.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + k5r.e((((Boolean.hashCode(false) + k5r.e(k5r.d(k5r.c(-1713659219, 31, this.a), 31, this.b), 961, false)) * 31) + 1) * 31, 887503681, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitParameters(from='ru.yandex.music', deviceId='");
        sb.append(this.a);
        sb.append("', testIds=");
        return vz1.u(sb, this.b, ", isFailFast=false, yandexUid=null, automaticallyHandleAudioFocus=false, videoSourceType=1, playerLogsEnabled=true, vhBackendService=null, jsonFlags='', strmTrackingUrl=null, perfTrackingUrl=null, externalMediaDataProvider=null, useHardcodedRatioForBlurs=false)");
    }
}
