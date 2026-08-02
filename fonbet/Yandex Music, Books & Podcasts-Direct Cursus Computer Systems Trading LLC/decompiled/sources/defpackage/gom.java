package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;

/* loaded from: classes6.dex */
public final class gom {
    public final rmh a;
    public final String b;
    public final DrmSecurityLevel c;

    public gom(rmh rmhVar, String str, DrmSecurityLevel drmSecurityLevel) {
        this.a = rmhVar;
        this.b = str;
        this.c = drmSecurityLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gom.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gom gomVar = (gom) obj;
        return Intrinsics.d(this.a, gomVar.a) && Intrinsics.d(this.b, gomVar.b) && this.c == gomVar.c;
    }

    public final int hashCode() {
        rmh rmhVar = this.a;
        int hashCode = (rmhVar != null ? rmhVar.hashCode() : 0) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PrepareDrm(mediaDrmCallbackDelegate=" + this.a + ", offlineLicenseKeyId=" + this.b + ", preferDrmSecurityLevel=" + this.c + ')';
    }
}
