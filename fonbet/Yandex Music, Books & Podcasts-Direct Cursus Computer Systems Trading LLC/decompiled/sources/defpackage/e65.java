package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class e65 extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e65(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v2, types: [rf3] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object obj;
        String str;
        String str2;
        String str3;
        Object value2;
        l26 l26Var;
        t16 t16Var;
        o16 o16Var;
        c h;
        int i = 28;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        se5 se5Var = null;
        switch (this.a) {
            case 0:
                ((k65) this.receiver).b.a.getOnBackPressedDispatcher().d();
                break;
            case 1:
                t tVar = ((k65) this.receiver).b.a;
                np2 np2Var = tVar instanceof np2 ? (np2) tVar : null;
                r8 = np2Var != null ? np2Var.l().J() : 0;
                int i6 = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, rvf.x(r8), p0p.y));
                break;
            case 2:
                u65 u65Var = ((k65) this.receiver).a;
                x97.y(ot0.F(u65Var), null, null, new s65(u65Var, r8, i3), 3);
                break;
            case 3:
                ((osj) this.receiver).d();
                break;
            case 4:
                ((ut5) this.receiver).a.a.finish();
                break;
            case 5:
                ((ut5) this.receiver).c.L();
                break;
            case 6:
                xdr xdrVar = ((nv5) this.receiver).o;
                do {
                    value = xdrVar.getValue();
                    obj = (mv5) value;
                    if (!Intrinsics.d(obj, kv5.a) && !Intrinsics.d(obj, jv5.a)) {
                        if (!(obj instanceof lv5)) {
                            b6e.s();
                            break;
                        } else {
                            lv5 lv5Var = (lv5) obj;
                            int i7 = lv5Var.b;
                            int i8 = i7 == lv5Var.e.size() - 1 ? 0 : i7 + 1;
                            obj = lv5.a(lv5Var, i8, i8, null, 57);
                        }
                    }
                } while (!xdrVar.k(value, obj));
                break;
            case 7:
                ((h31) this.receiver).a.invoke();
                break;
            case 8:
                ((nw5) this.receiver).a();
                break;
            case 9:
                ((h31) this.receiver).b.invoke();
                break;
            case 10:
                ((nw5) this.receiver).c();
                break;
            case 11:
                ((ww5) this.receiver).a.a.finish();
                break;
            case 12:
                ((gy5) this.receiver).b();
                break;
            case 13:
                tz5 tz5Var = (tz5) this.receiver;
                pv5 pv5Var = tz5Var.c.v;
                if (pv5Var != null) {
                    rmb.j(tz5Var.p, wjb.CoverScreen, tz5Var.q, null, 12);
                    qxp qxpVar = tz5Var.d;
                    qxpVar.getClass();
                    u9b u9bVar = (u9b) CollectionsKt.firstOrNull(pv5Var.c);
                    if (u9bVar != null) {
                        int i9 = FullInfoActivity.g;
                        bz5 bz5Var = (bz5) qxpVar.a;
                        np2 np2Var2 = bz5Var.c;
                        String str4 = bz5Var.a;
                        CoverPath M = kg5.M(u9bVar, WebPath$Storage.AFISHA);
                        str4.getClass();
                        np2Var2.startActivity(wdp.l0(np2Var2, new ixc(null, str4, M, qo6.f, null, null, null, null, null), false));
                    }
                }
                break;
            case 14:
                d06 d06Var = ((tz5) this.receiver).c;
                xdr xdrVar2 = d06Var.s;
                Boolean bool = Boolean.TRUE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool);
                d06Var.G(true);
                break;
            case 15:
                tz5 tz5Var2 = (tz5) this.receiver;
                d06 d06Var2 = tz5Var2.c;
                pv5 pv5Var2 = d06Var2.v;
                if (pv5Var2 != null && (str = pv5Var2.e) != null) {
                    rmb.j(tz5Var2.p, wjb.ArtistScreen, tz5Var2.q, null, 12);
                    qxp qxpVar2 = tz5Var2.d;
                    pv5 pv5Var3 = d06Var2.v;
                    if (pv5Var3 == null || (str2 = pv5Var3.a.c) == null) {
                        str2 = "";
                    }
                    String str5 = str2;
                    qxpVar2.getClass();
                    np2 np2Var3 = ((bz5) qxpVar2.a).c;
                    int i10 = ArtistScreenActivity.w0;
                    np2Var3.startActivity(l48.p(np2Var3, new u51(str, str5, null, null, null), null, null, 24));
                }
                break;
            case 16:
                tz5 tz5Var3 = (tz5) this.receiver;
                pv5 pv5Var4 = tz5Var3.c.v;
                if (pv5Var4 != null) {
                    vv5 vv5Var = (vv5) tz5Var3.f.getValue();
                    vv5Var.getClass();
                    qv5 qv5Var = pv5Var4.d;
                    mu5 mu5Var = pv5Var4.a;
                    ew5 ew5Var = (qv5Var == null || (str3 = mu5Var.b) == null) ? null : new ew5(mu5Var.a, qv5Var.a, qv5Var.c, qv5Var.b, mu5Var.g, vv5Var.a.i(pv5Var4.b), mu5Var.i, str3, mu5Var.l);
                    if (ew5Var != null) {
                        rmb rmbVar = tz5Var3.p;
                        thj thjVar = tz5Var3.q;
                        wjb wjbVar = wjb.ConcertSummaryScreen;
                        rmb.j(rmbVar, wjbVar, thjVar, null, 12);
                        qxp qxpVar3 = tz5Var3.d;
                        qxpVar3.getClass();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(xy5.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        bz5 bz5Var2 = (bz5) qxpVar3.a;
                        y supportFragmentManager = bz5Var2.c.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        pu0 t = pd.t(ypg.a);
                        nsh nshVar = new nsh(i, qxpVar3, bz5Var2, ew5Var);
                        boolean a = bz5.a();
                        cvo cvoVar = cvo.i;
                        e3s.X(o6m.b(wjbVar, new avo(pkb.Concert, ew5Var.a), 2), supportFragmentManager, "CONCERT_INFO_DIALOG", null, null, new wn5(new pu(t, ew5Var, nshVar, a, 3), 1331583448, true), 56);
                    }
                }
                break;
            case 17:
                ((bz5) ((tz5) this.receiver).d.a).c.finish();
                break;
            case 18:
                ((bz5) ((tz5) this.receiver).d.a).c.finish();
                break;
            case 19:
                ((bz5) ((tz5) this.receiver).d.a).c.finish();
                break;
            case 20:
                ((c26) this.receiver).o();
                break;
            case 21:
                ((c26) this.receiver).i();
                break;
            case 22:
                ((c26) this.receiver).a();
                break;
            case 23:
                xdr xdrVar3 = ((i26) this.receiver).r;
                do {
                    value2 = xdrVar3.getValue();
                    l26Var = (l26) value2;
                    t16Var = l26Var.a;
                    o16Var = l26Var.b;
                    if (!(o16Var instanceof m16)) {
                        if (!Intrinsics.d(o16Var, l16.a) && !Intrinsics.d(o16Var, n16.a)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        m16 m16Var = (m16) o16Var;
                        int i11 = m16Var.a;
                        o16Var = m16.a(m16Var, i11 == m16Var.b.size() - 1 ? 0 : i11 + 1);
                    }
                } while (!xdrVar3.k(value2, new l26(t16Var, o16Var, l26Var.c)));
                break;
            case 24:
                ((j56) this.receiver).a.a.finish();
                break;
            case 25:
                zg6 zg6Var = (zg6) this.receiver;
                xh6 xh6Var = (xh6) zg6Var.a.r.getValue();
                if (xh6Var != null) {
                    mmo mmoVar = zg6Var.b;
                    nrf nrfVar = (nrf) mmoVar.d;
                    hn5 hn5Var = (hn5) mmoVar.g;
                    if (!(xh6Var instanceof sh6)) {
                        if (!(xh6Var instanceof uh6)) {
                            if (!(xh6Var instanceof vh6)) {
                                if (!(xh6Var instanceof wh6)) {
                                    if (!xh6Var.equals(th6.a)) {
                                        b6e.s();
                                        break;
                                    }
                                } else {
                                    mmoVar.z0(((wh6) xh6Var).a);
                                }
                            } else {
                                mmoVar.z0(((vh6) xh6Var).b);
                            }
                        } else {
                            cvl cvlVar = ((uh6) xh6Var).a;
                            int i12 = PlaylistScreenActivity.B0;
                            hn5Var.startActivity(dxl.i(hn5Var, cvlVar, d.p(nrfVar), 28));
                        }
                    } else {
                        hn5Var.startActivity(quj.T(hn5Var, ((sh6) xh6Var).a, d.p(nrfVar)));
                    }
                }
                break;
            case 26:
                ((zg6) this.receiver).a();
                break;
            case 27:
                ((zg6) this.receiver).a();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                zg6 zg6Var2 = (zg6) this.receiver;
                zg6Var2.getClass();
                String t2 = weo.t();
                oh6 oh6Var = zg6Var2.a;
                g06 g06Var = oh6Var.c;
                t2.getClass();
                d70 d70Var = (d70) g06Var.d;
                if (d70Var != null) {
                    ((q43) g06Var.a).g(d70Var, t2);
                }
                xh6 xh6Var2 = (xh6) oh6Var.r.getValue();
                if (((Boolean) zg6Var2.g.invoke()).booleanValue() && xh6Var2 != null) {
                    fp5 fp5Var = zg6Var2.f;
                    if (!(xh6Var2 instanceof sh6)) {
                        if (!(xh6Var2 instanceof uh6)) {
                            if (!(xh6Var2 instanceof vh6)) {
                                if (!(xh6Var2 instanceof wh6)) {
                                    if (!xh6Var2.equals(th6.a)) {
                                        b6e.s();
                                        break;
                                    }
                                } else {
                                    fp5Var.invoke(((wh6) xh6Var2).a, new xg6(zg6Var2, xh6Var2, i2));
                                }
                            } else {
                                fp5Var.invoke(((vh6) xh6Var2).b, new xg6(zg6Var2, xh6Var2, i3));
                            }
                        } else {
                            fp5Var.invoke(((uh6) xh6Var2).b, new xg6(zg6Var2, xh6Var2, i4));
                        }
                    } else {
                        xg6 xg6Var = new xg6(zg6Var2, xh6Var2, i5);
                        mqs mqsVar = ((sh6) xh6Var2).b;
                        if (mqsVar != null) {
                            fp5Var.invoke(mqsVar, new yg6(0, xg6Var));
                        } else {
                            xg6Var.invoke();
                        }
                    }
                } else {
                    xzi xziVar = oh6Var.q;
                    if (xziVar != null) {
                        zri zriVar = (zri) xziVar.a;
                        pbj pbjVar = (pbj) zriVar.f.a.getValue();
                        if (pbjVar != null) {
                            d6l x = p6g.x((e6l) zriVar.b.a.c.getValue());
                            n7q n7qVar = x != null ? x.a : null;
                            if (n7qVar == null || !gut.Y(n7qVar, pbjVar)) {
                                dn9 dn9Var = zriVar.a;
                                a6l a2 = ((kxi) dn9Var.d).a(t2);
                                if (!pbjVar.equals(nbj.a)) {
                                    if (!(pbjVar instanceof lbj)) {
                                        if (!(pbjVar instanceof obj)) {
                                            if (!(pbjVar instanceof mbj)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                mbj mbjVar = (mbj) pbjVar;
                                                ArrayList arrayList = mbjVar.d;
                                                u3q u3qVar = mbjVar.c;
                                                r3q r3qVar = u3qVar instanceof r3q ? (r3q) u3qVar : null;
                                                if (!(r3qVar instanceof j3q)) {
                                                    if (!(r3qVar instanceof l3q)) {
                                                        if (!(r3qVar instanceof p3q)) {
                                                            if (!(r3qVar instanceof m3q) && r3qVar != null) {
                                                                b6e.s();
                                                                break;
                                                            } else {
                                                                a aVar = PlaybackScope.a;
                                                                aVar.getClass();
                                                                h = aVar.h();
                                                            }
                                                        } else {
                                                            h = e.g(d.t(), (p3q) r3qVar);
                                                        }
                                                    } else {
                                                        h = e.b(d.c(), (l3q) r3qVar);
                                                    }
                                                } else {
                                                    j3q j3qVar = (j3q) r3qVar;
                                                    h = d.a().a(oyk.a(j3qVar.a.a, j3qVar.b.a));
                                                }
                                                qe5 h2 = l3l.h(h, arrayList, a2);
                                                mqs mqsVar2 = mbjVar.b;
                                                int indexOf = arrayList.indexOf(mqsVar2);
                                                h2.g = mqsVar2;
                                                h2.e = indexOf;
                                                se5Var = h2.b();
                                            }
                                        } else {
                                            PlaybackScope t3 = d.t();
                                            obj objVar = (obj) pbjVar;
                                            cvl cvlVar2 = objVar.a;
                                            qe5 f = l3l.f(e.f(t3, cvlVar2), new n3m(cvlVar2), a2);
                                            f.c(cvlVar2);
                                            f.g = objVar.b;
                                            f.e = -1;
                                            se5Var = f.b();
                                        }
                                    } else {
                                        PlaybackScope a3 = d.a();
                                        oq oqVar = ((lbj) pbjVar).a;
                                        oqVar.getClass();
                                        qe5 f2 = l3l.f(a3.b(oqVar), new qxp(oqVar), a2);
                                        f2.a(oqVar);
                                        se5Var = f2.b();
                                    }
                                }
                                if (se5Var != null) {
                                    ((z5l) dn9Var.c).d(se5Var, true, uyk.a).k(new uvg(17, dn9Var));
                                }
                            } else {
                                zriVar.c.a(new ToggleCommand(false), new b3t("start_queue"));
                            }
                        }
                    }
                }
                break;
            default:
                ((eg6) this.receiver).a.a().K();
                break;
        }
        return Unit.a;
    }
}
