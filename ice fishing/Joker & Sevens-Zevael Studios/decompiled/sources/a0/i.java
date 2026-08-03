package a0;

import b0.q0;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f52a;

    /* renamed from: b, reason: collision with root package name */
    public final f f53b;

    /* renamed from: c, reason: collision with root package name */
    public final c f54c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f55d;

    public i(b0 b0Var, f fVar, c cVar, q0 q0Var) {
        this.f52a = b0Var;
        this.f53b = fVar;
        this.f54c = cVar;
        this.f55d = q0Var;
    }

    public final void a(int i10, Object obj, m0.r rVar, int i11) {
        int i12;
        Object obj2;
        m0.r rVar2;
        rVar.Z(-462424778);
        int i13 = (rVar.d(i10) ? 4 : 2) | i11 | (rVar.h(obj) ? 32 : 16) | (rVar.f(this) ? 256 : 128);
        if ((i13 & 147) == 146 && rVar.B()) {
            rVar.S();
            i12 = i10;
            obj2 = obj;
            rVar2 = rVar;
        } else {
            i12 = i10;
            obj2 = obj;
            rVar2 = rVar;
            x4.f.k(obj2, i12, this.f52a.f32q, u0.e.e(-824725566, new g(i10, 0, this), rVar), rVar2, ((i13 >> 3) & 14) | 3072 | ((i13 << 3) & 112));
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new h(this, i12, obj2, i11);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [oc.c, pc.k] */
    public final Object b(int i10) {
        f fVar = this.f53b;
        fVar.getClass();
        b0.h d10 = fVar.f44a.d(i10);
        return ((pc.k) d10.f827c.f8290g).invoke(Integer.valueOf(i10 - d10.f825a));
    }

    public final int c() {
        f fVar = this.f53b;
        fVar.getClass();
        return fVar.f44a.f873a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i10) {
        Object obj;
        q0 q0Var = this.f55d;
        Object[] objArr = (Object[]) q0Var.f875c;
        int i11 = i10 - q0Var.f873a;
        if (i11 >= 0) {
            pc.j.e(objArr, "<this>");
            if (i11 <= objArr.length - 1) {
                obj = objArr[i11];
                if (obj == null) {
                    return obj;
                }
                f fVar = this.f53b;
                fVar.getClass();
                int i12 = fVar.f44a.d(i10).f825a;
                return new b0.f(i10);
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return pc.j.a(this.f53b, ((i) obj).f53b);
    }

    public final int hashCode() {
        return this.f53b.hashCode();
    }
}
