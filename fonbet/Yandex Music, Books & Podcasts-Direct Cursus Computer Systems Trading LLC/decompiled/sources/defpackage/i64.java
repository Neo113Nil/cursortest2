package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.t;
import com.google.android.gms.cast.CastDevice;
import com.yandex.pulse.metrics.o;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class i64 implements rjc {
    public final /* synthetic */ int a;
    public final Object b;

    public i64(fgp fgpVar) {
        this.a = 1;
        fgpVar.getClass();
        this.b = fgpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        if (defpackage.fk0.c(r2, r3, r4, null, r6, 12) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r11 != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(mv5 mv5Var, Continuation continuation) {
        ou5 ou5Var;
        int i;
        boolean z;
        qu5 qu5Var = (qu5) this.b;
        if (continuation instanceof ou5) {
            ou5Var = (ou5) continuation;
            int i2 = ou5Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ou5Var.l = i2 - Integer.MIN_VALUE;
                ou5 ou5Var2 = ou5Var;
                Object obj = ou5Var2.j;
                nm6 nm6Var = nm6.a;
                i = ou5Var2.l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d85 d85Var = (d85) obj;
                    if (d85Var != null) {
                        long j = d85Var.a;
                        fk0 fk0Var = qu5Var.f;
                        d85 d85Var2 = new d85(j);
                        act S = weo.S(300, 0, null, 6);
                        ou5Var2.l = 2;
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
                if (!Intrinsics.d(mv5Var, kv5.a)) {
                    if (mv5Var instanceof lv5) {
                        x6k x6kVar = qu5Var.e;
                        if (((Boolean) x6kVar.getValue()).booleanValue()) {
                            lv5 lv5Var = (lv5) mv5Var;
                            if (lv5Var.b == lv5Var.a) {
                                z = true;
                                x6kVar.setValue(Boolean.valueOf(z));
                                lv5 lv5Var2 = (lv5) mv5Var;
                                ou5Var2.l = 1;
                                List list = lv5Var2.e;
                                int i3 = lv5Var2.b;
                                zu5 zu5Var = (zu5) CollectionsKt.S(list, i3);
                                obj = zu5Var != null ? null : i3 == lv5Var2.a ? new d85(qu5Var.a.b()) : h4a.t(zu5Var.a.a, qu5Var.b, qu5Var.c, false, ou5Var2);
                            }
                        }
                        z = false;
                        x6kVar.setValue(Boolean.valueOf(z));
                        lv5 lv5Var22 = (lv5) mv5Var;
                        ou5Var2.l = 1;
                        List list2 = lv5Var22.e;
                        int i32 = lv5Var22.b;
                        zu5 zu5Var2 = (zu5) CollectionsKt.S(list2, i32);
                        if (zu5Var2 != null) {
                        }
                    } else if (!Intrinsics.d(mv5Var, jv5.a)) {
                        b6e.s();
                        return null;
                    }
                }
                return Unit.a;
            }
        }
        ou5Var = new ou5(this, continuation);
        ou5 ou5Var22 = ou5Var;
        Object obj2 = ou5Var22.j;
        nm6 nm6Var2 = nm6.a;
        i = ou5Var22.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3, (android.widget.LinearLayout) r5.b) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0224, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3, (android.widget.LinearLayout) r5.a) == false) goto L101;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v17 */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CastDevice d;
        String queryParameter;
        Object obj2;
        int i = 3;
        int i2 = 2;
        boolean z = true;
        boolean z2 = true;
        int i3 = 0;
        xun xunVar = 0;
        r10 = null;
        String str = null;
        switch (this.a) {
            case 0:
                p84 p84Var = (p84) obj;
                m64 m64Var = (m64) this.b;
                m64Var.d = p84Var;
                if (p84Var != null) {
                    y1g.B("Must be called from the main thread.");
                    xunVar = p84Var.j;
                }
                m64Var.c(xunVar);
                return Unit.a;
            case 1:
                Object m = ((fgp) this.b).m(obj, continuation);
                return m == nm6.a ? m : Unit.a;
            case 2:
                bw1 bw1Var = (bw1) this.b;
                bw1Var.j = (t2i) obj;
                bw1Var.j();
                return Unit.a;
            case 3:
                p84 p84Var2 = (p84) obj;
                lk4 lk4Var = (lk4) this.b;
                if (p84Var2 != null && (d = p84Var2.d()) != null) {
                    str = d.d;
                }
                lk4Var.a = str;
                return Unit.a;
            case 4:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                xdr xdrVar = ((nk4) this.b).b;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                if (booleanValue) {
                    nmb nmbVar = j74.a;
                    j74.b(okb.Chromecast, slb.Chromecast);
                }
                return Unit.a;
            case 5:
                long longValue = ((Number) obj).longValue();
                xdr xdrVar2 = ((zm4) this.b).k;
                opp oppVar = new opp(longValue);
                xdrVar2.getClass();
                xdrVar2.m(null, oppVar);
                return Unit.a;
            case 6:
                xu4 xu4Var = (xu4) obj;
                ru4 ru4Var = (ru4) this.b;
                ru4Var.l.l(xu4Var);
                if (!ru4Var.t) {
                    wu4 wu4Var = xu4Var instanceof wu4 ? (wu4) xu4Var : null;
                    if (wu4Var != null) {
                        int size = wu4Var.a.size();
                        ru4Var.t = true;
                        rmb.h(ru4Var.k, size, 2);
                    }
                }
                return Unit.a;
            case 7:
                ((xv4) this.b).k.l(((uv4) obj).b);
                return Unit.a;
            case 8:
                jz4 jz4Var = (jz4) this.b;
                yy4 yy4Var = jz4Var.b;
                ub4 ub4Var = new ub4(0, jz4Var.a, yz4.class, "onArtistsTopOnboardingActionClicked", "onArtistsTopOnboardingActionClicked()V", 0, 20);
                yy4Var.getClass();
                t tVar = yy4Var.a;
                cvo cvoVar = cvo.i;
                fxf.P(tVar, o6m.b(wjb.FeatureOnboardingScreen, null, 6), null, pd.t(new qzm[0]), null, new wn5(new t31(i2, ub4Var), -1089096945, true), 22);
                return Unit.a;
            case 9:
                cwl cwlVar = (cwl) obj;
                d35 d35Var = (d35) this.b;
                List list = cwlVar.a;
                List list2 = cwlVar.b;
                xdr xdrVar3 = d35Var.n;
                if (list.isEmpty() && list2.isEmpty() && ((Boolean) d35Var.v.a.getValue()).booleanValue()) {
                    x25 x25Var = x25.a;
                    xdrVar3.getClass();
                    xdrVar3.m(null, x25Var);
                } else {
                    y25 y25Var = new y25(u75.h(new q0s(R.string.you_collected, o0s.a, d35Var.J(list)), new q0s(R.string.you_liked, o0s.b, d35Var.J(list2))));
                    xdrVar3.getClass();
                    xdrVar3.m(null, y25Var);
                }
                return Unit.a;
            case 10:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                jyr jyrVar = ((t35) this.b).i;
                if (booleanValue2) {
                    n14 n14Var = (n14) jyrVar.getValue();
                    if (!n14Var.b.d.a()) {
                        n14Var.b.g();
                        j34 j34Var = n14Var.a;
                        if (!j34Var.a.d.a()) {
                            j34Var.a.g();
                            ox6.B(new cz(((t3g) j34Var.c.getValue()).c, j34Var, 17), j34Var.b, new i34(j34Var, i3));
                            ox6.B(new ez(((xjm) j34Var.d.getValue()).f, 25), j34Var.b, new i34(j34Var, z2 ? 1 : 0));
                            ox6.B(((taa) ((raa) j34Var.e.getValue())).i, j34Var.b, new i34(j34Var, i2));
                            ox6.B(((kul) j34Var.f.getValue()).a, j34Var.b, new i34(j34Var, i));
                        }
                        ((i44) n14Var.e.getValue()).b("prefetch");
                        j34 j34Var2 = n14Var.a;
                        x0q x0qVar = j34Var2.g;
                        um6 um6Var = n14Var.c;
                        ox6.B(x0qVar, um6Var, new m14(n14Var, i3));
                        ox6.B(j34Var2.h, um6Var, new m14(n14Var, z ? 1 : 0));
                        ox6.B(j34Var2.i, um6Var, new m14(n14Var, i2));
                    }
                } else {
                    n14 n14Var2 = (n14) jyrVar.getValue();
                    n14Var2.b.V();
                    n14Var2.a.a.V();
                }
                return Unit.a;
            case 11:
                sdl sdlVar = (sdl) obj;
                xdl xdlVar = (xdl) ((od5) this.b).f.getValue();
                String str2 = sdlVar.c;
                rr5 rr5Var = sdlVar.b.a;
                if (str2 == null) {
                    str2 = "";
                }
                xdlVar.a(new avo(pkb.Concert, rr5Var.a), new avo(pkb.Artist, rr5Var.a), str2);
                return Unit.a;
            case 12:
                ((rd5) this.b).d.l((xd5) obj);
                return Unit.a;
            case 13:
                m1g m1gVar = (m1g) obj;
                j1g j1gVar = m1gVar.a;
                int i4 = m1gVar.b;
                ie5 ie5Var = (ie5) this.b;
                v3w.n(j1gVar == j1g.a, (xdr) ie5Var.b, null);
                xdr xdrVar4 = (xdr) ie5Var.c;
                Integer num = new Integer(i4);
                xdrVar4.getClass();
                xdrVar4.m(null, num);
                return Unit.a;
            case 14:
                ei5 ei5Var = (ei5) this.b;
                xdr xdrVar5 = ei5Var.e;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                xdrVar5.getClass();
                xdrVar5.m(null, e5bVar);
                xdr xdrVar6 = ei5Var.f;
                Boolean bool2 = Boolean.FALSE;
                xdrVar6.getClass();
                xdrVar6.m(null, bool2);
                x97.y(ei5Var.d, null, null, new di5(ei5Var, null), 3);
                return Unit.a;
            case 15:
                xdr xdrVar7 = ((oi5) this.b).e;
                e5b e5bVar2 = e5b.a;
                e5bVar2.getClass();
                xdrVar7.getClass();
                xdrVar7.m(null, e5bVar2);
                return Unit.a;
            case 16:
                return b((mv5) obj, continuation);
            case 17:
                xiu xiuVar = ((iv5) this.b).a.n;
                if (xiuVar != null) {
                    rar rarVar = (rar) xiuVar.c;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    xiuVar.c = null;
                }
                return Unit.a;
            case 18:
                ((e65) ((xiu) this.b).b).invoke();
                return Unit.a;
            case 19:
                ((ww5) this.b).a.a.finish();
                return Unit.a;
            case 20:
                d06 d06Var = (d06) this.b;
                d06Var.G(false);
                x97.y(ot0.F(d06Var), null, null, new b06(d06Var, xunVar, i3), 3);
                return Unit.a;
            case 21:
                l06 l06Var = (l06) this.b;
                xdr xdrVar8 = l06Var.l;
                bpq bpqVar = new bpq((List) obj, l06Var.o.f());
                xdrVar8.getClass();
                xdrVar8.m(null, bpqVar);
                return Unit.a;
            case 22:
                ((c26) this.b).l();
                return Unit.a;
            case 23:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                m76 m76Var = (m76) this.b;
                xdr xdrVar9 = m76Var.g;
                xdrVar9.getClass();
                xdrVar9.m(null, bool3);
                m76Var.d = true;
                return Unit.a;
            case 24:
                String uri = ((Uri) obj).toString();
                uri.getClass();
                boolean M = StringsKt.M(uri, "apply_cvv", false);
                Boolean valueOf = Boolean.valueOf(M);
                if (!M) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    cz6 cz6Var = (cz6) this.b;
                    cz6Var.p.m(vy6.c);
                    hz6 hz6Var = cz6Var.v;
                    if (hz6Var == null) {
                        Intrinsics.j("arguments");
                        throw null;
                    }
                    if (hz6Var instanceof fz6) {
                        f2a f2aVar = cz6Var.x;
                        if (f2aVar != null) {
                            f2aVar.setPaymentApi(cz6Var.m);
                        }
                        f2a f2aVar2 = cz6Var.x;
                        if (f2aVar2 != null) {
                            f2aVar2.d();
                        }
                    } else if (hz6Var instanceof gz6) {
                        cz6Var.l.d(((gz6) hz6Var).a, new az6(i3, cz6Var), null, new sld(23, cz6Var));
                    }
                }
                return Unit.a;
            case 25:
                hw8 hw8Var = (hw8) obj;
                o17 o17Var = (o17) this.b;
                gc8 gc8Var = o17Var.i;
                if (gc8Var != null) {
                    ViewParent parent = gc8Var.getParent();
                    h4b h4bVar = o17Var.j;
                    if (h4bVar == null) {
                        xq0.q("Required value was null.");
                        return null;
                    }
                    break;
                }
                gc8 gc8Var2 = new gc8((vb8) o17Var.p.getValue(), null, 0, 6, null);
                gc8Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                gc8Var2.setId(View.generateViewId());
                o17Var.i = gc8Var2;
                h4b h4bVar2 = o17Var.j;
                if (h4bVar2 == null) {
                    xq0.q("Required value was null.");
                    return null;
                }
                if (((LinearLayout) h4bVar2.a).getChildCount() == 0) {
                    h4b h4bVar3 = o17Var.j;
                    if (h4bVar3 == null) {
                        xq0.q("Required value was null.");
                        return null;
                    }
                    ((LinearLayout) h4bVar3.a).addView(o17Var.i);
                }
                gc8 gc8Var3 = o17Var.i;
                if (gc8Var3 != null) {
                    rv8 rv8Var = hw8Var.a;
                    gc8Var3.M(rv8Var, new dw8(rv8Var.b));
                }
                gc8 gc8Var4 = o17Var.i;
                if (gc8Var4 != null) {
                    gc8Var4.post(new jt6(7, hw8Var, o17Var));
                }
                return Unit.a;
            case 26:
                hw8 hw8Var2 = (hw8) obj;
                i27 i27Var = (i27) this.b;
                gc8 gc8Var5 = i27Var.k;
                if (gc8Var5 == null || !Intrinsics.d(gc8Var5.getParent(), (LinearLayout) i27Var.x().c)) {
                    gc8 gc8Var6 = new gc8((vb8) i27Var.r.getValue(), null, 0, 6, null);
                    gc8Var6.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    gc8Var6.setId(View.generateViewId());
                    i27Var.k = gc8Var6;
                }
                if (((LinearLayout) i27Var.x().c).getChildCount() == 0) {
                    ((LinearLayout) i27Var.x().c).addView(i27Var.k);
                }
                gc8 gc8Var7 = i27Var.k;
                if (gc8Var7 != null) {
                    rv8 rv8Var2 = hw8Var2.a;
                    gc8Var7.M(rv8Var2, new dw8(rv8Var2.b));
                }
                gc8 gc8Var8 = i27Var.k;
                if (gc8Var8 != null) {
                    gc8Var8.post(new jt6(9, hw8Var2, i27Var));
                }
                return Unit.a;
            case 27:
                hw8 hw8Var3 = (hw8) obj;
                l37 l37Var = (l37) this.b;
                gc8 gc8Var9 = l37Var.i;
                if (gc8Var9 != null) {
                    ViewParent parent2 = gc8Var9.getParent();
                    cib cibVar = l37Var.j;
                    if (cibVar == null) {
                        xq0.q("Required value was null.");
                        return null;
                    }
                    break;
                }
                gc8 gc8Var10 = new gc8((vb8) l37Var.q.getValue(), null, 0, 6, null);
                gc8Var10.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                gc8Var10.setId(View.generateViewId());
                l37Var.i = gc8Var10;
                cib cibVar2 = l37Var.j;
                if (cibVar2 == null) {
                    xq0.q("Required value was null.");
                    return null;
                }
                if (((LinearLayout) cibVar2.b).getChildCount() == 0) {
                    cib cibVar3 = l37Var.j;
                    if (cibVar3 == null) {
                        xq0.q("Required value was null.");
                        return null;
                    }
                    ((LinearLayout) cibVar3.b).addView(l37Var.i);
                }
                gc8 gc8Var11 = l37Var.i;
                if (gc8Var11 != null) {
                    rv8 rv8Var3 = hw8Var3.a;
                    gc8Var11.M(rv8Var3, new dw8(rv8Var3.b));
                }
                gc8 gc8Var12 = l37Var.i;
                if (gc8Var12 != null) {
                    gc8Var12.post(new jt6(12, hw8Var3, l37Var));
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Uri uri2 = (Uri) obj;
                if (!Intrinsics.d(uri2.getScheme(), "payment-sdk")) {
                    uri2 = null;
                }
                if (uri2 != null) {
                    t37 t37Var = (t37) this.b;
                    jyr jyrVar2 = t37Var.i;
                    String host = uri2.getHost();
                    if (host != null) {
                        switch (host.hashCode()) {
                            case 3015911:
                                if (host.equals("back")) {
                                    t37Var.requireActivity().onBackPressed();
                                    break;
                                }
                                break;
                            case 94756344:
                                if (host.equals("close")) {
                                    ((tu2) jyrVar2.getValue()).K();
                                    break;
                                }
                                break;
                            case 214910879:
                                if (host.equals("select_bank") && (queryParameter = uri2.getQueryParameter("scheme")) != null) {
                                    g47 x = t37Var.x();
                                    g0c g0cVar = x.r;
                                    x.x = queryParameter;
                                    Iterator it = x.u.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (((zl2) obj2).c.equals(queryParameter)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    zl2 zl2Var = (zl2) obj2;
                                    Boolean valueOf2 = zl2Var != null ? Boolean.valueOf(zl2Var.e) : null;
                                    if (Intrinsics.d(valueOf2, Boolean.TRUE)) {
                                        qne e1 = gut.e1(queryParameter);
                                        x60 x60Var = (x60) g0cVar;
                                        x60Var.getClass();
                                        x60Var.a(e1);
                                    } else if (Intrinsics.d(valueOf2, Boolean.FALSE)) {
                                        qne f1 = gut.f1(queryParameter);
                                        x60 x60Var2 = (x60) g0cVar;
                                        x60Var2.getClass();
                                        x60Var2.a(f1);
                                    }
                                    x.H(queryParameter);
                                    break;
                                }
                                break;
                            case 1118875383:
                                if (host.equals("show_legal")) {
                                    tu2 tu2Var = (tu2) jyrVar2.getValue();
                                    g0c g0cVar2 = tu2Var.k;
                                    qne m1 = gut.m1(d0n.LEGAL_AGREEMENT);
                                    x60 x60Var3 = (x60) g0cVar2;
                                    x60Var3.getClass();
                                    x60Var3.a(m1);
                                    tu2Var.l.l(nxi.e);
                                    break;
                                }
                                break;
                        }
                    }
                }
                return Unit.a;
            default:
                ((Activity) this.b).finish();
                return Unit.a;
        }
    }

    public /* synthetic */ i64(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
