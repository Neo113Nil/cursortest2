package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xhi extends bii {
    public final String a;
    public final int b;
    public final MusicBackendInvocationError c;

    public xhi(int i, MusicBackendInvocationError musicBackendInvocationError, String str) {
        str.getClass();
        musicBackendInvocationError.getClass();
        this.a = str;
        this.b = i;
        this.c = musicBackendInvocationError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhi)) {
            return false;
        }
        xhi xhiVar = (xhi) obj;
        return Intrinsics.d(this.a, xhiVar.a) && this.b == xhiVar.b && Intrinsics.d(this.c, xhiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder l = f1d.l(this.b, "BackendError(url=", this.a, ", code=", ", error=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
