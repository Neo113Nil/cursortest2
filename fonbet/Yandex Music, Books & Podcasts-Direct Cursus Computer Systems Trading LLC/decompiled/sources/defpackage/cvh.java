package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cvh implements vrh {
    public final u8e a;
    public final int b;

    public cvh(u8e u8eVar, int i) {
        this.a = u8eVar;
        this.b = i;
    }

    @Override // defpackage.vrh
    public final void a(int i) {
        this.a.a(i);
    }

    @Override // defpackage.vrh
    public final void c(List list, int i) {
        int i2 = this.b;
        int i3 = 0;
        u8e u8eVar = this.a;
        if (i2 >= 7) {
            tde u = yde.u();
            while (i3 < list.size()) {
                u.a(((tb5) list.get(i3)).g());
                i3++;
            }
            u8eVar.h(u.f(), i);
            return;
        }
        qsn e = tb5.e(list, true, true);
        tde u2 = yde.u();
        while (i3 < e.d) {
            u2.a(((tb5) e.get(i3)).g());
            i3++;
        }
        u8eVar.D0(u2.f(), i);
    }

    @Override // defpackage.vrh
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.vrh
    public final void e(int i, alp alpVar) {
        this.a.f0(i, alpVar.b(), Bundle.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != cvh.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((cvh) obj).a.asBinder());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // defpackage.vrh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, vxf vxfVar) {
        String str = vxf.j;
        Object obj = vxfVar.c;
        int i2 = vxfVar.d;
        Bundle bundle = new Bundle();
        bundle.putInt(vxf.g, vxfVar.a);
        bundle.putLong(vxf.h, vxfVar.b);
        znh znhVar = vxfVar.e;
        if (znhVar != null) {
            String str2 = vxf.i;
            Bundle bundle2 = new Bundle();
            bundle2.putBundle(znh.e, znhVar.a);
            bundle2.putBoolean(znh.f, znhVar.b);
            bundle2.putBoolean(znh.g, znhVar.c);
            bundle2.putBoolean(znh.h, znhVar.d);
            bundle.putBundle(str2, bundle2);
        }
        qlp qlpVar = vxfVar.f;
        if (qlpVar != null) {
            bundle.putBundle(vxf.l, qlpVar.b());
        }
        bundle.putInt(vxf.k, i2);
        if (obj != null) {
            if (i2 != 1) {
                if (i2 == 2) {
                    bundle.putBundle(str, ((onh) obj).e(false));
                } else if (i2 == 3) {
                    yde ydeVar = (yde) obj;
                    tde u = yde.u();
                    for (int i3 = 0; i3 < ydeVar.size(); i3++) {
                        u.a(((onh) ydeVar.get(i3)).e(false));
                    }
                    bundle.putBinder(str, new vk3(u.f()));
                }
            }
            e7o.n();
            return;
        }
        this.a.y(i, bundle);
    }

    @Override // defpackage.vrh
    public final void g(int i, Bundle bundle) {
        this.a.C0(i, bundle);
    }

    @Override // defpackage.vrh
    public final void h(int i, tmp tmpVar, boolean z, boolean z2, int i2) {
        this.a.e0(i, tmpVar.a(z, z2).c(i2));
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // defpackage.vrh
    public final void i(List list, int i) {
        tde u = yde.u();
        for (int i2 = 0; i2 < list.size(); i2++) {
            u.a(((tb5) list.get(i2)).g());
        }
        this.a.D0(u.f(), i);
    }

    @Override // defpackage.vrh
    public final void j(int i, d8l d8lVar) {
        this.a.d0(i, d8lVar.c());
    }

    @Override // defpackage.vrh
    public final void k(int i, ump umpVar) {
        this.a.S(i, umpVar.b());
    }

    @Override // defpackage.vrh
    public final void m(int i, rdl rdlVar, d8l d8lVar, boolean z, boolean z2) {
        Bundle t;
        int i2 = this.b;
        vq1.A(i2 != 0);
        boolean z3 = z || !d8lVar.a(17);
        boolean z4 = z2 || !d8lVar.a(30);
        u8e u8eVar = this.a;
        if (i2 < 2) {
            u8eVar.E0(i, rdlVar.q(d8lVar, z, true).t(i2), z3);
            return;
        }
        rdl q = rdlVar.q(d8lVar, z, z2);
        if (u8eVar instanceof gmh) {
            t = new Bundle();
            t.putBinder(rdl.l0, new qdl(q));
        } else {
            t = q.t(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(pdl.d, z3);
        bundle.putBoolean(pdl.e, z4);
        u8eVar.h0(i, t, bundle);
    }

    @Override // defpackage.vrh
    public final void n(int i, blp blpVar, d8l d8lVar) {
        this.a.l0(i, blpVar.b(), d8lVar.c());
    }
}
