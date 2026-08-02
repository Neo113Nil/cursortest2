package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;

/* loaded from: classes3.dex */
public final class zr implements f14 {
    public final kxi b;
    public final rmb c;
    public final xdr d;
    public final Object f;
    public final /* synthetic */ int a = 0;
    public final xdr e = ydr.a(Boolean.FALSE);

    public zr(ygt ygtVar, kxi kxiVar, rmb rmbVar, qf1 qf1Var) {
        this.b = kxiVar;
        this.c = rmbVar;
        this.f = qf1Var;
        this.d = ydr.a(ygtVar);
    }

    @Override // defpackage.f14
    public final xdr a() {
        switch (this.a) {
        }
        return this.e;
    }

    @Override // defpackage.f14
    public final void c() {
        int i = this.a;
    }

    @Override // defpackage.f14
    public final void d(c24 c24Var, int i) {
        Intent j;
        Integer d;
        Intent j2;
        Integer d2;
        int i2 = this.a;
        dud dudVar = cud.a;
        Object obj = this.f;
        c24Var.getClass();
        switch (i2) {
            case 0:
                t tVar = (t) ((pt0) obj).a;
                aab a = c24Var.a();
                if (a != null) {
                    if (!(a instanceof lt)) {
                        if (!(a instanceof u51)) {
                            if (!(a instanceof eul)) {
                                b6e.s();
                                break;
                            } else {
                                eul eulVar = (eul) a;
                                u9b u9bVar = eulVar.d;
                                if (u9bVar != null && (d = u9bVar.d()) != null) {
                                    dudVar = new bud(d.intValue());
                                }
                                int i3 = PlaylistScreenActivity.B0;
                                j = dxl.j(tVar, new jxl(eulVar.a, eulVar.b), dudVar, null, null, 112);
                            }
                        } else {
                            int i4 = ArtistScreenActivity.w0;
                            j = l48.p(tVar, (u51) a, null, null, 24);
                        }
                    } else {
                        j = quj.V(tVar, (lt) a, null);
                    }
                    tVar.startActivity(j);
                    break;
                }
                break;
            default:
                qf1 qf1Var = (qf1) obj;
                Context context = qf1Var.a;
                aab a2 = c24Var.a();
                if (a2 != null) {
                    if (!(a2 instanceof lt)) {
                        if (!(a2 instanceof u51)) {
                            if (!(a2 instanceof eul)) {
                                b6e.s();
                                break;
                            } else {
                                eul eulVar2 = (eul) a2;
                                u9b u9bVar2 = eulVar2.d;
                                dud budVar = (u9bVar2 == null || (d2 = u9bVar2.d()) == null) ? dudVar : new bud(d2.intValue());
                                int i5 = PlaylistScreenActivity.B0;
                                j2 = dxl.j(qf1Var.a, new jxl(eulVar2.a, eulVar2.b), budVar, null, null, 112);
                            }
                        } else {
                            int i6 = ArtistScreenActivity.w0;
                            j2 = l48.p(context, (u51) a2, null, null, 24);
                        }
                    } else {
                        j2 = quj.V(context, (lt) a2, null);
                    }
                    context.startActivity(j2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f14
    public final owu e(dou douVar, mm6 mm6Var, k6l k6lVar, uwu uwuVar, qwu qwuVar, int i, zy7 zy7Var) {
        int i2 = this.a;
        mm6Var.getClass();
        switch (i2) {
            case 0:
                return wyf.S(mm6Var, this.b, k6lVar, null, null, qwuVar, uwuVar, o8g.R(douVar.b), new de(this, douVar, i, 1), null);
            default:
                return wyf.S(mm6Var, this.b, k6lVar, null, null, qwuVar, uwuVar, o8g.R(douVar.b), new hsl(this, douVar, i, 0), null);
        }
    }

    @Override // defpackage.f14
    public final void f(boolean z, aab aabVar, int i, String str) {
        int i2 = this.a;
        str.getClass();
    }

    @Override // defpackage.f14
    public final void g(c24 c24Var, int i) {
        lwg H;
        lwg H2;
        int i2 = this.a;
        c24Var.getClass();
        switch (i2) {
            case 0:
                pt0 pt0Var = (pt0) this.f;
                if (!(c24Var instanceof t14)) {
                    if (!(c24Var instanceof v14)) {
                        if (!(c24Var instanceof y14)) {
                            if (!(c24Var instanceof w14)) {
                                if (!(c24Var instanceof u14)) {
                                    if (!(c24Var instanceof x14)) {
                                        if (!(c24Var instanceof z14)) {
                                            if (!(c24Var instanceof a24)) {
                                                if (!(c24Var instanceof b24)) {
                                                    b6e.s();
                                                    break;
                                                }
                                            } else {
                                                a24 a24Var = (a24) c24Var;
                                                H = g0g.H(a24Var.b, a24Var.a.g);
                                            }
                                        } else {
                                            z14 z14Var = (z14) c24Var;
                                            H = g0g.H(z14Var.b.a, z14Var.a.d);
                                        }
                                    } else {
                                        x14 x14Var = (x14) c24Var;
                                        H = g0g.H(x14Var.d, x14Var.c);
                                    }
                                } else {
                                    u14 u14Var = (u14) c24Var;
                                    H = g0g.F(u14Var.b, u14Var.a.c);
                                }
                            } else {
                                w14 w14Var = (w14) c24Var;
                                H = g0g.D(w14Var.d, null, w14Var.c);
                            }
                        } else {
                            H = g0g.D(((y14) c24Var).b, null, false);
                        }
                    } else {
                        v14 v14Var = (v14) c24Var;
                        H = g0g.D(v14Var.d, null, v14Var.c);
                    }
                } else {
                    t14 t14Var = (t14) c24Var;
                    H = g0g.D(t14Var.b, t14Var.c, t14Var.a.g);
                }
                szf.R((y) pt0Var.b, new qvg(H), null);
                break;
            default:
                qf1 qf1Var = (qf1) this.f;
                if (!(c24Var instanceof t14)) {
                    if (!(c24Var instanceof v14)) {
                        if (!(c24Var instanceof y14)) {
                            if (!(c24Var instanceof w14)) {
                                if (!(c24Var instanceof u14)) {
                                    if (!(c24Var instanceof x14)) {
                                        if (!(c24Var instanceof z14)) {
                                            if (!(c24Var instanceof a24)) {
                                                if (!(c24Var instanceof b24)) {
                                                    b6e.s();
                                                    break;
                                                }
                                            } else {
                                                a24 a24Var2 = (a24) c24Var;
                                                H2 = g0g.H(a24Var2.b, a24Var2.a.g);
                                            }
                                        } else {
                                            z14 z14Var2 = (z14) c24Var;
                                            H2 = g0g.H(z14Var2.b.a, z14Var2.a.d);
                                        }
                                    } else {
                                        x14 x14Var2 = (x14) c24Var;
                                        H2 = g0g.H(x14Var2.d, x14Var2.c);
                                    }
                                } else {
                                    u14 u14Var2 = (u14) c24Var;
                                    H2 = g0g.F(u14Var2.b, u14Var2.a.c);
                                }
                            } else {
                                w14 w14Var2 = (w14) c24Var;
                                H2 = g0g.D(w14Var2.d, null, w14Var2.c);
                            }
                        } else {
                            H2 = g0g.D(((y14) c24Var).b, null, false);
                        }
                    } else {
                        v14 v14Var2 = (v14) c24Var;
                        H2 = g0g.D(v14Var2.d, null, v14Var2.c);
                    }
                } else {
                    t14 t14Var2 = (t14) c24Var;
                    H2 = g0g.D(t14Var2.b, t14Var2.c, t14Var2.a.g);
                }
                szf.R(qf1Var.b, new qvg(H2), null);
                break;
        }
    }

    @Override // defpackage.f14
    public final vdr getState() {
        switch (this.a) {
        }
        return this.d;
    }

    private final void b() {
    }

    private final void h() {
    }

    public zr(ygt ygtVar, kxi kxiVar, pt0 pt0Var, rmb rmbVar) {
        this.b = kxiVar;
        this.f = pt0Var;
        this.c = rmbVar;
        this.d = ydr.a(ygtVar);
    }
}
