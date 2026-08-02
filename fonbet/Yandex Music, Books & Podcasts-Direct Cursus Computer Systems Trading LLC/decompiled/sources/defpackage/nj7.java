package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class nj7 implements ycg, qlh, rth, jpj, iyr {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nj7(int i, g8l g8lVar, g8l g8lVar2) {
        this.a = 1;
        this.b = i;
        this.c = g8lVar;
        this.d = g8lVar2;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        ual ualVar = (ual) this.c;
        View view2 = (View) this.d;
        view.getClass();
        int i = kqvVar.a.g(519).d;
        int i2 = ualVar.e;
        int i3 = this.b + i;
        if (i2 < i3 && view2 != null && !ualVar.f) {
            ualVar.a(i3);
        }
        return kqvVar;
    }

    @Override // defpackage.rth
    public void a(wrh wrhVar) {
        sth sthVar = (sth) this.c;
        pmh pmhVar = (pmh) this.d;
        if (TextUtils.isEmpty(pmhVar.a)) {
            vq1.n0("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        lcg m = sthVar.h.m(wrhVar, yde.y(rwf.h(pmhVar)));
        m.a(new pv7(m, new x0(sthVar, wrhVar, this.b), false, 9), e48.a);
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 2:
                ulh ulhVar = (ulh) this.c;
                List list = (List) this.d;
                gmh gmhVar = ulhVar.c;
                tde u = yde.u();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    u.a(((onh) list.get(i2)).e(true));
                }
                c9eVar.r0(gmhVar, i, this.b, new vk3(u.f()));
                break;
            default:
                ulh ulhVar2 = (ulh) this.c;
                onh onhVar = (onh) this.d;
                bnp bnpVar = ulhVar2.l;
                bnpVar.getClass();
                int v = bnpVar.a.v();
                gmh gmhVar2 = ulhVar2.c;
                int i3 = this.b;
                if (v >= 2) {
                    c9eVar.J0(gmhVar2, i, i3, onhVar.e(true));
                    break;
                } else {
                    c9eVar.s(gmhVar2, i, i3 + 1, onhVar.e(true));
                    c9eVar.w(gmhVar2, i, i3);
                    break;
                }
        }
    }

    @Override // defpackage.iyr
    public Object execute() {
        hgp hgpVar = (hgp) this.c;
        ((ime) hgpVar.e).K((de2) this.d, this.b + 1, false);
        return null;
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d80) obj).v((c80) this.c, (onh) this.d, this.b);
                break;
            default:
                g8l g8lVar = (g8l) this.c;
                g8l g8lVar2 = (g8l) this.d;
                f8l f8lVar = (f8l) obj;
                int i = this.b;
                f8lVar.B(i);
                f8lVar.u(i, g8lVar, g8lVar2);
                break;
        }
    }

    public /* synthetic */ nj7(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ nj7(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
