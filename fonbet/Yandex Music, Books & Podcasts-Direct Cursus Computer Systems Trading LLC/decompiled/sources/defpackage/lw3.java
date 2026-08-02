package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes4.dex */
public final class lw3 implements gek {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lw3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gek
    public final void a(Uri uri, List list) {
        int i = this.a;
        uri.getClass();
        list.getClass();
        switch (i) {
            case 0:
                cdv cdvVar = (cdv) ((mw3) this.b).e;
                if (cdvVar != null) {
                    cdvVar.C(new adv(uri, list));
                    break;
                }
                break;
            case 1:
                eg6 eg6Var = ((ki6) this.b).k;
                String uri2 = uri.toString();
                uri2.getClass();
                eg6Var.getClass();
                eg6Var.a.k(uri2, list);
                break;
            case 2:
                ((z07) this.b).E.l(new adv(uri, list));
                break;
            case 3:
                ((f3j) this.b).o.l(new adv(uri, list));
                break;
            default:
                voi voiVar = ((lpm) this.b).t;
                String uri3 = uri.toString();
                uri3.getClass();
                voiVar.l(new ipm(uri3, list));
                break;
        }
    }

    @Override // defpackage.gek
    public final void b() {
        switch (this.a) {
            case 0:
                kw3 kw3Var = (kw3) ((mw3) this.b).c;
                if (kw3Var != null) {
                    kw3Var.h();
                    break;
                }
                break;
            case 1:
            case 2:
            case 3:
                break;
            default:
                xw3 xw3Var = (xw3) ((lpm) this.b).m.a;
                if (xw3Var != null) {
                    xw3Var.h();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gek
    public final void c() {
        switch (this.a) {
            case 0:
                cdv cdvVar = (cdv) ((mw3) this.b).e;
                if (cdvVar != null) {
                    cdvVar.C(ycv.a);
                    break;
                }
                break;
            case 1:
                ((ki6) this.b).k.a.t();
                break;
            case 2:
                ((z07) this.b).E.l(ycv.a);
                break;
            case 3:
                ((f3j) this.b).o.l(ycv.a);
                break;
            default:
                ((lpm) this.b).t.l(hpm.a);
                break;
        }
    }

    @Override // defpackage.gek
    public final void d(Uri uri) {
        int i = this.a;
        uri.getClass();
        switch (i) {
            case 0:
                cdv cdvVar = (cdv) ((mw3) this.b).e;
                if (cdvVar != null) {
                    cdvVar.C(new zcv(uri));
                    break;
                }
                break;
            case 1:
                a(uri, c5b.a);
                break;
            case 2:
                ((z07) this.b).E.l(new zcv(uri));
                break;
            case 3:
                ((f3j) this.b).o.l(new zcv(uri));
                break;
            default:
                a(uri, c5b.a);
                break;
        }
    }

    @Override // defpackage.gek
    public final void e() {
        int i = this.a;
    }

    @Override // defpackage.gek
    public final void l(String str) {
        int i = this.a;
        str.getClass();
        switch (i) {
            case 1:
                ((ki6) this.b).k.a.h();
                break;
        }
    }

    @Override // defpackage.gek
    public final void p(t9i t9iVar) {
        int i = this.a;
        t9iVar.getClass();
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void m() {
    }

    private final void n() {
    }
}
