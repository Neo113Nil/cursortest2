package f1;

import android.graphics.Shader;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public final long f2264e;

    public i0(long j3) {
        this.f2264e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return q.c(this.f2264e, ((i0) obj).f2264e);
        }
        return false;
    }

    @Override // f1.d0
    public final void g(float f10, long j3, l6.l lVar) {
        lVar.d(1.0f);
        long j6 = this.f2264e;
        if (f10 != 1.0f) {
            j6 = q.b(j6, q.d(j6) * f10);
        }
        lVar.f(j6);
        if (((Shader) lVar.f4200c) != null) {
            lVar.h(null);
        }
    }

    public final int hashCode() {
        int i10 = q.f2284i;
        return Long.hashCode(this.f2264e);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) q.i(this.f2264e)) + ')';
    }
}
