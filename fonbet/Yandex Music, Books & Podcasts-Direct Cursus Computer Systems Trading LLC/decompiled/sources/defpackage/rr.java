package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j00 b;
    public final /* synthetic */ jab c;
    public final /* synthetic */ thj d;

    public /* synthetic */ rr(j00 j00Var, jab jabVar, thj thjVar, int i) {
        this.a = i;
        this.b = j00Var;
        this.c = jabVar;
        this.d = thjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ezd ezdVar;
        boolean z = true;
        switch (this.a) {
            case 0:
                j00 j00Var = this.b;
                jab jabVar = this.c;
                thj thjVar = this.d;
                sjb D = irf.D((laa) j00Var.n.getValue());
                if (D != null) {
                    rmb.a(j00Var.h.a(jabVar, null), D, thjVar, null, 10);
                }
                e10 e10Var = j00Var.c;
                zy zyVar = new zy(0, j00Var.d, dy.class, "openPaywall", "openPaywall()V", 0, 1);
                e10Var.getClass();
                e10Var.v.F(zyVar);
                return Unit.a;
            case 1:
                j00 j00Var2 = this.b;
                rmb.a(j00Var2.h.a(this.c, null), ((Boolean) j00Var2.l.getValue()).booleanValue() ? sjb.Unlike : sjb.Like, this.d, null, 10);
                e10 e10Var2 = j00Var2.c;
                boolean booleanValue = ((Boolean) e10Var2.z0.getValue()).booleanValue();
                gj gjVar = e10Var2.k.b;
                if (gjVar != null && !booleanValue) {
                    e10Var2.q.a(fx.a, null, gjVar);
                }
                e10Var2.t.c();
                return Unit.a;
            case 2:
                j00 j00Var3 = this.b;
                rmb.j(j00Var3.h.a(this.c, null), wjb.TrailerScreen, this.d, null, 12);
                j00Var3.g.a(new nz(j00Var3.f.a));
                return Unit.a;
            case 3:
                j00 j00Var4 = this.b;
                jab jabVar2 = this.c;
                thj thjVar2 = this.d;
                dy dyVar = j00Var4.d;
                oq oqVar = j00Var4.f.a;
                rr rrVar = new rr(j00Var4, jabVar2, thjVar2, 11);
                dyVar.getClass();
                oqVar.getClass();
                AlbumScreenActivity albumScreenActivity = dyVar.a;
                ea eaVar = ea.a;
                n8g b = t75.b();
                b.add(st.b);
                b.add(st.d);
                n8g a = t75.a(b);
                l18 l18Var = l18.b;
                bdt I = hag.I(qqs.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if ((oqVar.d ? eaVar : new fa(new IllegalStateException("Album is not available"))).equals(eaVar)) {
                    if (a == null || !a.isEmpty()) {
                        ListIterator listIterator = a.listIterator(0);
                        do {
                            ezdVar = (ezd) listIterator;
                            if (ezdVar.hasNext()) {
                            }
                        } while (((nlm) ezdVar.next()).apply(oqVar));
                    }
                    rrVar.invoke();
                    return Unit.a;
                }
                ayk aykVar = new ayk(albumScreenActivity);
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                if (!((i4j) ((byb) qdcVar2.C(I2)).b(i4j.class)).h()) {
                    z = true ^ oqVar.g().contains(h94.c);
                } else if (lxe.o(oqVar.h()) != null) {
                    z = false;
                }
                if (z) {
                    if (!f8w.a.apply(oqVar)) {
                        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                    } else if (frc.a.a()) {
                        t a2 = aykVar.a();
                        if (a2 != null) {
                            lik likVar = new lik(vik.c, oqVar.a, oqVar.b);
                            y supportFragmentManager = a2.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            p8w p8wVar = new p8w();
                            p8wVar.setArguments(cxb.K(new Pair("navigation_source_info", likVar)));
                            x7f.B(p8wVar, supportFragmentManager, "BOOKMATE_UNAVAILABLE_BOTTOM_SHEET");
                        } else {
                            ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
                            hag.x(albumScreenActivity, R.string.bottom_sheet_track_no_rights_title, 0);
                        }
                    } else {
                        hag.x(albumScreenActivity, R.string.bottom_sheet_track_no_rights_title, 0);
                    }
                } else if (frc.a.a()) {
                    t a3 = aykVar.a();
                    if (a3 != null) {
                        j58 J = ild.J(oqVar);
                        if (J != null) {
                            i58 i58Var = new i58();
                            i58Var.l = J;
                            i58Var.m = rrVar;
                            i58Var.n = null;
                            i58Var.o = null;
                            y supportFragmentManager2 = a3.getSupportFragmentManager();
                            supportFragmentManager2.getClass();
                            x7f.B(i58Var, supportFragmentManager2, "DISCLAIMER_DIALOG");
                        }
                    } else {
                        ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
                        hag.x(albumScreenActivity, R.string.bottom_sheet_track_no_rights_title, 0);
                    }
                } else {
                    hag.x(albumScreenActivity, R.string.bottom_sheet_track_no_rights_title, 0);
                }
                return Unit.a;
            case 4:
                j00 j00Var5 = this.b;
                rmb.j(j00Var5.h.a(this.c, null), wjb.CoverScreen, this.d, null, 12);
                dy dyVar2 = j00Var5.d;
                oq oqVar2 = j00Var5.f.a;
                dyVar2.getClass();
                oqVar2.getClass();
                dyVar2.d.B(oqVar2);
                return Unit.a;
            case 5:
                this.b.c(this.c, this.d);
                return Unit.a;
            case 6:
                j00 j00Var6 = this.b;
                rmb.j(j00Var6.h.a(this.c, null), wjb.SummaryScreen, this.d, null, 12);
                j00Var6.g.a(new kz(j00Var6.f.a));
                return Unit.a;
            case 7:
                j00 j00Var7 = this.b;
                rmb.j(j00Var7.h.a(this.c, null), wjb.ArtistScreen, this.d, null, 12);
                f00 f00Var = j00Var7.g;
                mt mtVar = j00Var7.f;
                f00Var.a(new jz(mtVar.b, mtVar.a.d()));
                return Unit.a;
            case 8:
                j00 j00Var8 = this.b;
                rmb.a(j00Var8.h.a(this.c, null), sjb.Ok, this.d, null, 10);
                j00Var8.c.v.E();
                return Unit.a;
            case 9:
                j00 j00Var9 = this.b;
                rmb.j(j00Var9.h.a(this.c, null), wjb.SearchScreen, this.d, null, 12);
                f00 f00Var2 = j00Var9.g;
                oq oqVar3 = j00Var9.f.a;
                f00Var2.a(new lz(oqVar3, oqVar3.F));
                return Unit.a;
            case 10:
                this.b.c(this.c, this.d);
                return Unit.a;
            case 11:
                j00 j00Var10 = this.b;
                jab jabVar3 = this.c;
                thj thjVar3 = this.d;
                g0l g0lVar = j00Var10.i;
                oq oqVar4 = j00Var10.f.a;
                hcr hcrVar = hcr.a;
                LinkedList linkedList = oqVar4.F;
                kxi kxiVar = j00Var10.b;
                u5l b2 = j00Var10.h.a(jabVar3, null).b(thjVar3);
                String str = j00Var10.e.g;
                if (str == null) {
                    str = "mobile-album-album-default";
                }
                g0l.f(g0lVar, oqVar4, hcrVar, linkedList, kxiVar, b2, str);
                return Unit.a;
            default:
                return this.b.h.a(this.c, null).b(this.d);
        }
    }
}
