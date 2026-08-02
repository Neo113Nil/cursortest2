package flex.engine.section;

import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import core.flex.ui.OrientationAwareRecyclerView;
import core.flex.ui.contentaware.ContentAwareSwipeRefreshLayout;
import defpackage.a1q0;
import defpackage.a6q0;
import defpackage.amr;
import defpackage.azp0;
import defpackage.b64;
import defpackage.b6q0;
import defpackage.b990;
import defpackage.bi91;
import defpackage.bki0;
import defpackage.bvf0;
import defpackage.c4q0;
import defpackage.c6q0;
import defpackage.c990;
import defpackage.chp0;
import defpackage.cip0;
import defpackage.cki0;
import defpackage.cnr0;
import defpackage.csf0;
import defpackage.cxq0;
import defpackage.czp0;
import defpackage.d3q0;
import defpackage.d6q0;
import defpackage.dhp0;
import defpackage.dzp0;
import defpackage.e6q0;
import defpackage.e89;
import defpackage.efx;
import defpackage.ehp0;
import defpackage.elc;
import defpackage.exg;
import defpackage.exy0;
import defpackage.f0q0;
import defpackage.ffx;
import defpackage.g0q0;
import defpackage.g6q0;
import defpackage.g89;
import defpackage.g8e;
import defpackage.gfe;
import defpackage.gw00;
import defpackage.h6q0;
import defpackage.h73;
import defpackage.h89;
import defpackage.htk;
import defpackage.hzk;
import defpackage.i0y;
import defpackage.i1u;
import defpackage.i3x;
import defpackage.i6q0;
import defpackage.i89;
import defpackage.ike;
import defpackage.in2;
import defpackage.int0;
import defpackage.ixl;
import defpackage.izp0;
import defpackage.j1u;
import defpackage.j2q0;
import defpackage.j6q0;
import defpackage.j89;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k0z;
import defpackage.k6q0;
import defpackage.kki0;
import defpackage.kn2;
import defpackage.kr;
import defpackage.l070;
import defpackage.l0z;
import defpackage.l2z;
import defpackage.l5q0;
import defpackage.l6q0;
import defpackage.l70;
import defpackage.lxl;
import defpackage.m1x;
import defpackage.m3q0;
import defpackage.m5q0;
import defpackage.m631;
import defpackage.mas;
import defpackage.mch0;
import defpackage.mhp0;
import defpackage.mvd;
import defpackage.n2q0;
import defpackage.n530;
import defpackage.n5q0;
import defpackage.n751;
import defpackage.nch0;
import defpackage.nfh;
import defpackage.nie;
import defpackage.nix;
import defpackage.nke;
import defpackage.nvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.o530;
import defpackage.o5q0;
import defpackage.ofa0;
import defpackage.okx;
import defpackage.ou;
import defpackage.p5q0;
import defpackage.p6q0;
import defpackage.peu0;
import defpackage.pvy0;
import defpackage.pxl;
import defpackage.pyp0;
import defpackage.q2m0;
import defpackage.q2q0;
import defpackage.q5q0;
import defpackage.q7o;
import defpackage.qoi0;
import defpackage.r2q0;
import defpackage.r3r;
import defpackage.r5q0;
import defpackage.r7o;
import defpackage.rke;
import defpackage.rzo;
import defpackage.s3r;
import defpackage.s5q0;
import defpackage.s5r;
import defpackage.s7s0;
import defpackage.scc;
import defpackage.see;
import defpackage.seu;
import defpackage.seu0;
import defpackage.sjh;
import defpackage.ske;
import defpackage.sls;
import defpackage.t3r;
import defpackage.t5q0;
import defpackage.tav;
import defpackage.tcc;
import defpackage.tg2;
import defpackage.tke;
import defpackage.txl;
import defpackage.u1m;
import defpackage.u1w;
import defpackage.u2q0;
import defpackage.u5q0;
import defpackage.uke;
import defpackage.uvn;
import defpackage.uyj;
import defpackage.uyp0;
import defpackage.v0x;
import defpackage.v2q0;
import defpackage.v5q0;
import defpackage.vke;
import defpackage.w511;
import defpackage.w5q0;
import defpackage.wbe0;
import defpackage.wyi0;
import defpackage.wyp0;
import defpackage.x5q0;
import defpackage.xke;
import defpackage.xxw0;
import defpackage.xyp0;
import defpackage.y5q0;
import defpackage.ycc;
import defpackage.ymp0;
import defpackage.yo40;
import defpackage.yw01;
import defpackage.yyp0;
import defpackage.z2x;
import defpackage.z5q0;
import defpackage.zlt0;
import defpackage.zyl;
import defpackage.zyp0;
import flex.engine.section.c;
import flex.engine.section.model.ReusePolicy;
import flex.engine.section.model.Side;
import flex.engine.section.ui.StickyHostLayout;
import flex.utils.android.WindowInsetsProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import just.adapter.scroll.ScrollControlGridLayoutManager;
import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;
import just.adapter.sticky.StickyGravity;
import just.adapter.sticky.StickyViewController$RecyclerViewOnLayoutListener;
import just.adapter.sticky.a;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes9.dex */
public final class c extends gfe {
    public final c990 A;
    public final wyi0 B;
    public final pvy0 C;
    public final exy0 D;
    public final o530 E;
    public final mas F;
    public final yo40 G;
    public final just.adapter.snapping.b H;
    public final j89 I;
    public final efx J;
    public final mvd K;
    public final ArrayList L;
    public nfh M;
    public b6q0 N;
    public just.adapter.sticky.a O;
    public t3r P;
    public just.adapter.snapping.c Q;
    public final ArrayList R;
    public Float S;
    public Boolean T;
    public boolean U;
    public final ArrayList V;
    public final ArrayList W;
    public final ArrayList Z;
    public final izp0 a;
    public final ike a0;
    public final n530 b;
    public final n0 b0;
    public final txl c;
    public j6q0 c0;
    public nie d0;
    public vke e0;
    public RecyclerView.c f0;
    public WindowInsetsProvider g0;
    public OptimizedPaginationTriggerFeatureConfig h0;
    public Parcelable i0;
    public final l6q0 j0;
    public azp0 k0;
    public final l0z l0;
    public final xxw0 w;
    public final bki0 x;
    public final xke y;
    public final q7o z;

    /* JADX WARN: Multi-variable type inference failed */
    public c(izp0 izp0Var, n530 n530Var, txl txlVar, g0q0 g0q0Var, okx okxVar, xxw0 xxw0Var, bki0 bki0Var, xke xkeVar, r7o r7oVar, c990 c990Var, yo40 yo40Var, wyi0 wyi0Var, pvy0 pvy0Var, exy0 exy0Var, o530 o530Var, mas masVar, int i) {
        z2x z2xVar;
        hzk hzkVar;
        boolean z = izp0Var.a;
        r7o r7oVar2 = (i & 256) != 0 ? null : r7oVar;
        c990 c990Var2 = (i & 512) != 0 ? new c990() : c990Var;
        wyi0 wyi0Var2 = (i & 2048) != 0 ? null : wyi0Var;
        mas masVar2 = (i & 65536) != 0 ? null : masVar;
        yo40 yo40Var2 = new yo40(new s7s0(23));
        this.a = izp0Var;
        this.b = n530Var;
        this.c = txlVar;
        this.w = xxw0Var;
        this.x = bki0Var;
        this.y = xkeVar;
        this.z = r7oVar2;
        this.A = c990Var2;
        this.B = wyi0Var2;
        this.C = pvy0Var;
        this.D = exy0Var;
        this.E = o530Var;
        this.F = masVar2;
        this.G = yo40Var2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        okx exgVar = z ? new exg(0, okxVar) : okxVar;
        v0x v0xVar = z ? nvg.c : uvn.c;
        just.adapter.snapping.b bVar = new just.adapter.snapping.b(n530Var, new a6q0(this, objArr2 == true ? 1 : 0));
        this.H = bVar;
        int i2 = 1;
        if (wyi0Var2 != null) {
            m3q0 m3q0Var = (m3q0) amr.c.a(qoi0.a(m3q0.class));
            z2xVar = m3q0Var != null ? ((Boolean) m3q0Var.a.invoke()).booleanValue() : false ? new z2x(wyi0Var2, SectionsContentController$renderingMetricsPlugin$1$1.b, new a6q0(this, i2)) : null;
        } else {
            z2xVar = null;
        }
        hzk hzkVar2 = new hzk();
        hzkVar2.a = bVar;
        hzkVar2.b = new cip0();
        this.I = new j89(new i89(8), txlVar, n530Var, g0q0Var, z ? seu.x : null, yo40Var, hzkVar2);
        List h = scc.h(z2xVar);
        m1x m1xVar = new m1x(0);
        new nix();
        this.J = new efx(new cxq0(exgVar, v0xVar), h, m1xVar.b, m1xVar.a);
        int i3 = 5;
        if (masVar2 != null) {
            a6q0 a6q0Var = new a6q0(this, i3);
            new a6q0(this, 7);
            hzkVar = new hzk();
            hzkVar.a = masVar2;
            hzkVar.b = a6q0Var;
        } else {
            hzkVar = null;
        }
        mvd mvdVar = new mvd(hzkVar);
        mvdVar.b.add(new i0y(new e6q0(this, i2), new e6q0(this, 2)));
        this.K = mvdVar;
        this.L = new ArrayList();
        this.R = new ArrayList();
        this.U = true;
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.Z = new ArrayList();
        sjh sjhVar = uyj.a;
        ike f = g8e.f(o400.a);
        this.a0 = f;
        n0 c = ffx.c(0, 1, null, 5);
        this.b0 = c;
        this.c0 = new j6q0(objArr == true ? 1 : 0, 15);
        this.e0 = new rke(null);
        this.h0 = OptimizedPaginationTriggerFeatureConfig.DISABLED;
        this.j0 = new l6q0(this);
        this.l0 = new l0z();
        e.H(f, new jqr(e.t(c), new SectionsContentController$1(this, null), 3));
    }

    public static int i(azp0 azp0Var, OrientationAwareRecyclerView orientationAwareRecyclerView, n751 n751Var, Side side) {
        List list = azp0Var.c;
        int i = 0;
        boolean z = list != null && list.contains(side);
        u1w g = n751Var != null ? n751Var.a.g(16) : null;
        int i2 = k6q0.a[side.ordinal()];
        if (i2 == 1) {
            Float f = azp0Var.a;
            if (f == null) {
                return orientationAwareRecyclerView.getPaddingTop();
            }
            int s = rzo.s(f.floatValue(), orientationAwareRecyclerView);
            if (z && g != null) {
                i = g.b;
            }
            return s + i;
        }
        if (i2 != 2) {
            w511.b();
            return 0;
        }
        Float f2 = azp0Var.b;
        if (f2 == null) {
            return orientationAwareRecyclerView.getPaddingBottom();
        }
        int s2 = rzo.s(f2.floatValue(), orientationAwareRecyclerView);
        if (z && g != null) {
            i = g.d;
        }
        return s2 + i;
    }

    public static wbe0 k(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return new wbe0(1, null, gw00.e(new Pair("sections", list)));
    }

    public static kotlinx.serialization.json.c l(cnr0 cnr0Var, String str, kotlinx.serialization.json.c cVar) {
        p6q0 p6q0Var;
        Map map;
        Object obj = (cnr0Var == null || (p6q0Var = (p6q0) cnr0Var.b(qoi0.a(p6q0.class))) == null || (map = p6q0Var.a) == null) ? null : (kotlinx.serialization.json.c) map.get(str);
        if (obj == null) {
            obj = JsonNull.INSTANCE;
        }
        Pair pair = new Pair("raw", obj);
        kotlinx.serialization.json.b bVar = cVar;
        if (cVar == null) {
            bVar = JsonNull.INSTANCE;
        }
        return new kotlinx.serialization.json.c(kotlin.collections.b.i(pair, new Pair("refreshParams", bVar)));
    }

    public static String m(nie nieVar) {
        String str;
        m631 m631Var = (m631) nieVar.d.b(qoi0.a(m631.class));
        if (m631Var != null && (str = (String) m631Var.a.get("documentQueryPath")) != null) {
            return str;
        }
        u1m u1mVar = nieVar.b;
        if (u1mVar != null) {
            return u1mVar.a;
        }
        return null;
    }

    @Override // defpackage.gfe
    public final void a(RecyclerView.g gVar) {
        this.K.b.add(gVar);
    }

    @Override // defpackage.gfe
    public final boolean b(elc elcVar) {
        List list;
        Object obj;
        List list2;
        Object obj2;
        List list3;
        Object obj3;
        if (elcVar instanceof z5q0) {
            z5q0 z5q0Var = (z5q0) elcVar;
            if (z5q0Var instanceof r5q0) {
                r5q0 r5q0Var = (r5q0) elcVar;
                p(r5q0Var.a, r5q0Var.b);
                return true;
            }
            boolean z = z5q0Var instanceof s5q0;
            txl txlVar = this.c;
            dzp0 dzp0Var = null;
            String str = null;
            if (z) {
                List a = ((s5q0) elcVar).a();
                nie nieVar = this.d0;
                dzp0 dzp0Var2 = nieVar != null ? (dzp0) nieVar.c : null;
                if (dzp0Var2 != null) {
                    List list4 = dzp0Var2.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list4) {
                        if (!a.contains(((pyp0) obj4).getA())) {
                            arrayList.add(obj4);
                        }
                    }
                    dzp0Var = dzp0.a(dzp0Var2, null, arrayList, null, null, dzp0Var2.f, 29);
                }
                if (dzp0Var != null) {
                    txlVar.a(new lxl(dzp0Var));
                    return true;
                }
            } else {
                if (z5q0Var instanceof q5q0) {
                    q5q0 q5q0Var = (q5q0) elcVar;
                    String str2 = q5q0Var.a;
                    kotlinx.serialization.json.c cVar = q5q0Var.b;
                    String str3 = q5q0Var.c;
                    nie nieVar2 = this.d0;
                    if (nieVar2 != null && (list3 = ((dzp0) nieVar2.c).b) != null) {
                        Iterator it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it.next();
                            if (jl40.l(((pyp0) obj3).getA(), str2)) {
                                break;
                            }
                        }
                        pyp0 pyp0Var = (pyp0) obj3;
                        if (pyp0Var != null) {
                            nie nieVar3 = this.d0;
                            kotlinx.serialization.json.c l = l(nieVar3 != null ? nieVar3.d : null, pyp0Var.getA(), cVar);
                            wbe0 k = k(Collections.singletonList(l));
                            if (!l.a.isEmpty() && k != null) {
                                txlVar.a(new ixl(new d3q0(new q2q0(str2, str3)), k));
                            }
                        }
                    }
                    return true;
                }
                if (z5q0Var instanceof x5q0) {
                    x5q0 x5q0Var = (x5q0) elcVar;
                    String b = x5q0Var.b();
                    kotlinx.serialization.json.c a2 = x5q0Var.a();
                    nie nieVar4 = this.d0;
                    if (nieVar4 != null && (list2 = ((dzp0) nieVar4.c).b) != null) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (jl40.l(((pyp0) obj2).getA(), b)) {
                                break;
                            }
                        }
                        pyp0 pyp0Var2 = (pyp0) obj2;
                        if (pyp0Var2 != null) {
                            nie nieVar5 = this.d0;
                            kotlinx.serialization.json.c l2 = l(nieVar5 != null ? nieVar5.d : null, pyp0Var2.getA(), a2);
                            wbe0 k2 = k(Collections.singletonList(l2));
                            if (!l2.a.isEmpty() && k2 != null) {
                                txlVar.a(new ixl(new d3q0(v2q0.INSTANCE), k2));
                            }
                        }
                    }
                    return true;
                }
                if (!(z5q0Var instanceof l5q0)) {
                    if (z5q0Var instanceof v5q0) {
                        h(((v5q0) elcVar).a() ? dhp0.c : ehp0.c);
                        return true;
                    }
                    if (z5q0Var instanceof t5q0) {
                        t5q0 t5q0Var = (t5q0) elcVar;
                        String b2 = t5q0Var.b();
                        String c = t5q0Var.c();
                        kotlinx.serialization.json.c a3 = t5q0Var.a();
                        nie nieVar6 = this.d0;
                        if (nieVar6 != null && (list = ((dzp0) nieVar6.c).b) != null) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it3.next();
                                if (jl40.l(((pyp0) obj).getA(), c)) {
                                    break;
                                }
                            }
                            pyp0 pyp0Var3 = (pyp0) obj;
                            if (pyp0Var3 != null) {
                                nie nieVar7 = this.d0;
                                kotlinx.serialization.json.c l3 = l(nieVar7 != null ? nieVar7.d : null, b2, a3);
                                wbe0 k3 = k(Collections.singletonList(l3));
                                if (!l3.a.isEmpty() && k3 != null) {
                                    txlVar.a(new ixl(new d3q0(new u2q0(pyp0Var3.getA())), k3));
                                }
                            }
                        }
                        return true;
                    }
                    boolean z2 = z5q0Var instanceof w5q0;
                    c990 c990Var = this.A;
                    if (z2) {
                        c990Var.b = ((w5q0) elcVar).a();
                        o();
                        Iterator it4 = c990Var.d.iterator();
                        if (it4.hasNext()) {
                            b64.D(it4.next());
                            throw null;
                        }
                    } else if (z5q0Var instanceof m5q0) {
                        m5q0 m5q0Var = (m5q0) elcVar;
                        if (m5q0Var.a() == null) {
                            c990Var.a = false;
                            return true;
                        }
                        c990Var.c.add(m5q0Var.a());
                        Iterator it5 = c990Var.d.iterator();
                        if (it5.hasNext()) {
                            b64.D(it5.next());
                            throw null;
                        }
                    } else {
                        boolean z3 = z5q0Var instanceof o5q0;
                        j89 j89Var = this.I;
                        if (z3) {
                            o5q0 o5q0Var = (o5q0) elcVar;
                            if (o5q0Var.a() == null) {
                                c990Var.a = true;
                                o();
                            } else {
                                c990Var.c.remove(o5q0Var.a());
                                o();
                                Iterator it6 = c990Var.d.iterator();
                                if (it6.hasNext()) {
                                    b64.D(it6.next());
                                    throw null;
                                }
                            }
                            j89Var.e();
                            return true;
                        }
                        if (z5q0Var instanceof p5q0) {
                            s(null, true);
                            return true;
                        }
                        if (z5q0Var instanceof n5q0) {
                            s(((n5q0) elcVar).a(), false);
                            return true;
                        }
                        if (z5q0Var instanceof u5q0) {
                            u5q0 u5q0Var = (u5q0) elcVar;
                            tav tavVar = new tav(this, u5q0Var.b(), u5q0Var.d(), u5q0Var.c(), u5q0Var.a());
                            if (this.d0 != null) {
                                tavVar.invoke();
                                return true;
                            }
                            this.R.add(tavVar);
                            return true;
                        }
                        if (z5q0Var instanceof y5q0) {
                            Iterator it7 = j89Var.g.iterator();
                            while (it7.hasNext()) {
                                f0q0 f0q0Var = ((g89) it7.next()).b;
                                if (f0q0Var.b) {
                                    f0q0Var.a(z5q0Var);
                                }
                            }
                        } else {
                            w511.b();
                        }
                    }
                } else if (!(this.e0 instanceof ske)) {
                    String a4 = ((l5q0) elcVar).a();
                    if (a4 == null) {
                        vke vkeVar = this.e0;
                        uke ukeVar = vkeVar instanceof uke ? (uke) vkeVar : null;
                        if (ukeVar != null) {
                            str = ukeVar.a;
                        }
                    } else {
                        str = a4;
                    }
                    if (str != null) {
                        j(str);
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gfe
    public final void c() {
        xyp0 xyp0Var;
        cnr0 cnr0Var;
        nie nieVar = this.d0;
        kr krVar = null;
        pxl pxlVar = (nieVar == null || (cnr0Var = nieVar.d) == null) ? null : new pxl(cnr0Var);
        if (pxlVar != null) {
            if (nieVar != null && (xyp0Var = ((dzp0) nieVar.c).d) != null) {
                krVar = xyp0Var.d;
            }
            rzo.p(this.b, krVar, pxlVar);
        }
    }

    @Override // defpackage.gfe
    public final void d() {
        nfh nfhVar = this.M;
        if (nfhVar != null) {
            OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) nfhVar.b;
            int childCount = orientationAwareRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                orientationAwareRecyclerView.getChildViewHolder(orientationAwareRecyclerView.getChildAt(i));
            }
        }
    }

    @Override // defpackage.gfe
    public final void e(ou ouVar) {
        RecyclerView.c itemAnimator;
        l2z l2zVar = new l2z(26, ouVar, this);
        nfh nfhVar = this.M;
        if (nfhVar == null || (itemAnimator = ((OrientationAwareRecyclerView) nfhVar.b).getItemAnimator()) == null) {
            l2zVar.invoke();
            return;
        }
        g6q0 g6q0Var = new g6q0(l2zVar);
        if (itemAnimator.m()) {
            itemAnimator.b.add(g6q0Var);
        } else {
            l2zVar.invoke();
        }
    }

    @Override // defpackage.gfe
    public final void f() {
        nie nieVar = this.d0;
        u1m u1mVar = nieVar != null ? nieVar.b : null;
        if (u1mVar != null) {
            List s = kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new h73(1, ((dzp0) nieVar.c).b), new q2m0(19)), new q2m0(20)));
            Map map = u1mVar.c;
            if (map == null) {
                map = kotlin.collections.b.f();
            }
            p(s, map);
        }
        nfh nfhVar = this.M;
        if (nfhVar != null) {
            OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) nfhVar.b;
            int childCount = orientationAwareRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                orientationAwareRecyclerView.getChildViewHolder(orientationAwareRecyclerView.getChildAt(i));
            }
        }
    }

    @Override // defpackage.gfe
    public final void g(RecyclerView.g gVar) {
        this.K.b.remove(gVar);
    }

    @Override // defpackage.gfe
    public final boolean h(chp0 chp0Var) {
        nfh nfhVar = this.M;
        OrientationAwareRecyclerView orientationAwareRecyclerView = nfhVar != null ? (OrientationAwareRecyclerView) nfhVar.b : null;
        if (orientationAwareRecyclerView == null || !orientationAwareRecyclerView.canScrollVertically(-1)) {
            return false;
        }
        if (chp0Var.a) {
            kki0.c(orientationAwareRecyclerView, chp0Var.b, 0);
            return true;
        }
        orientationAwareRecyclerView.scrollToPosition(0);
        return true;
    }

    public final void j(String str) {
        this.e0 = ske.a;
        this.c.a(new ixl(new d3q0(new n2q0()), new wbe0(2, gw00.e(new Pair("pageToken", Collections.singletonList(str))), null)));
    }

    public final boolean n(ArrayList arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            if (!(kotlin.collections.a.b0(arrayList) instanceof i3x) && !z) {
                c990 c990Var = this.A;
                if (!((c990Var.b != null || c990Var.c.isEmpty()) ? !kotlin.collections.a.G(r2, c990Var.b) : false) || (this.e0 instanceof rke)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void o() {
        String m;
        nie nieVar = this.d0;
        if (nieVar == null || (m = m(nieVar)) == null) {
            return;
        }
        this.e0 = r((dzp0) nieVar.c, m, UUID.randomUUID().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, android.view.View, core.flex.ui.contentaware.ContentAwareFrameLayout, flex.engine.section.ui.StickyHostLayout] */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, android.view.View, core.flex.ui.contentaware.ContentAwareSwipeRefreshLayout] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, android.view.View, androidx.recyclerview.widget.RecyclerView, core.flex.ui.OrientationAwareRecyclerView, java.lang.Object] */
    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        StickyHostLayout stickyHostLayout;
        SwipeRefreshLayout swipeRefreshLayout;
        final just.adapter.sticky.a aVar;
        final int i = 0;
        final int i2 = 1;
        boolean z = this.w != null;
        izp0 izp0Var = this.a;
        boolean z2 = izp0Var.c;
        ?? orientationAwareRecyclerView = new OrientationAwareRecyclerView(viewGroup.getContext(), null, 0, 6, null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = orientationAwareRecyclerView;
        orientationAwareRecyclerView.setId(nch0.flexsdk_recycler_view_id);
        orientationAwareRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AttributeSet attributeSet = null;
        boolean z3 = false;
        if (z2) {
            ?? stickyHostLayout2 = new StickyHostLayout(viewGroup.getContext(), null, 0, 6, null);
            stickyHostLayout2.setId(nch0.flexsdk_recycler_container_id);
            stickyHostLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            stickyHostLayout2.setContentView(orientationAwareRecyclerView);
            ref$ObjectRef.element = stickyHostLayout2;
            stickyHostLayout = stickyHostLayout2;
        } else {
            stickyHostLayout = null;
        }
        int i3 = 2;
        if (z) {
            ?? contentAwareSwipeRefreshLayout = new ContentAwareSwipeRefreshLayout(viewGroup.getContext(), attributeSet, i3, z3 ? 1 : 0);
            contentAwareSwipeRefreshLayout.setId(nch0.flexsdk_swipe_refresh_layout_id);
            contentAwareSwipeRefreshLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            contentAwareSwipeRefreshLayout.setContentView((View) ref$ObjectRef.element);
            ref$ObjectRef.element = contentAwareSwipeRefreshLayout;
            swipeRefreshLayout = contentAwareSwipeRefreshLayout;
        } else {
            swipeRefreshLayout = null;
        }
        nfh nfhVar = new nfh();
        nfhVar.a = (View) ref$ObjectRef.element;
        nfhVar.b = orientationAwareRecyclerView;
        nfhVar.c = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new h6q0(this));
        }
        efx efxVar = this.J;
        orientationAwareRecyclerView.setAdapter(efxVar);
        int i4 = orientationAwareRecyclerView.getContext().getResources().getDisplayMetrics().heightPixels;
        int i5 = 3;
        ScrollControlGridLayoutManager scrollControlGridLayoutManager = new ScrollControlGridLayoutManager(viewGroup.getContext(), new d6q0(this, i4, 0), new d6q0(this, i4, 1), new e6q0(this, i), new a6q0(this, i3), new a6q0(this, 3), new a6q0(this, 4), efxVar);
        zlt0 zlt0Var = new zlt0(efxVar);
        scrollControlGridLayoutManager.h0 = zlt0Var;
        zlt0Var.c = true;
        orientationAwareRecyclerView.setLayoutManager(scrollControlGridLayoutManager);
        orientationAwareRecyclerView.addOnScrollListener(new i6q0());
        orientationAwareRecyclerView.setClipToPadding(false);
        bki0 bki0Var = this.x;
        if (bki0Var != 0) {
            bki0Var.a(orientationAwareRecyclerView);
        }
        Parcelable parcelable = this.i0;
        if (parcelable != null) {
            RecyclerView.e layoutManager = orientationAwareRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.W0(parcelable);
            }
            this.i0 = null;
        }
        if (izp0Var.b) {
            cki0.a(orientationAwareRecyclerView);
        }
        Object layoutManager2 = orientationAwareRecyclerView.getLayoutManager();
        if (layoutManager2 != null) {
            j1u i1uVar = layoutManager2 instanceof j1u ? (j1u) layoutManager2 : layoutManager2 instanceof GridLayoutManager ? new i1u((GridLayoutManager) layoutManager2) : null;
            if (i1uVar != null) {
                orientationAwareRecyclerView.addItemDecoration(new c4q0(i1uVar, efxVar));
            }
        }
        orientationAwareRecyclerView.addItemDecoration(new wyp0(efxVar, this.D));
        orientationAwareRecyclerView.addOnScrollListener(this.K);
        if (!izp0Var.c || stickyHostLayout == null) {
            aVar = null;
        } else {
            e6q0 e6q0Var = new e6q0(this, i5);
            h6q0 h6q0Var = new h6q0(this);
            aVar = new just.adapter.sticky.a(stickyHostLayout, e6q0Var, h6q0Var);
            OrientationAwareRecyclerView orientationAwareRecyclerView2 = aVar.b;
            StickyViewController$RecyclerViewOnLayoutListener stickyViewController$RecyclerViewOnLayoutListener = aVar.h;
            peu0 peu0Var = aVar.g;
            if (orientationAwareRecyclerView2 != null) {
                orientationAwareRecyclerView2.removeOnScrollListener(peu0Var);
                orientationAwareRecyclerView2.removeOnLayoutChangeListener(stickyViewController$RecyclerViewOnLayoutListener);
                uyp0 uyp0Var = aVar.i;
                if (uyp0Var != null) {
                    orientationAwareRecyclerView2.removeOnChildAttachStateChangeListener(uyp0Var);
                }
                aVar.i = null;
            }
            aVar.b = orientationAwareRecyclerView;
            ofa0 ofa0Var = new ofa0(stickyHostLayout, (Object) orientationAwareRecyclerView, e6q0Var, h6q0Var);
            just.adapter.sticky.b A = ofa0Var.A(StickyGravity.START, new sls() { // from class: meu0
                @Override // defpackage.sls
                public final Object invoke() {
                    int i6;
                    int i7 = i;
                    a aVar2 = aVar;
                    switch (i7) {
                        case 0:
                            i6 = aVar2.k;
                            break;
                        default:
                            i6 = aVar2.l;
                            break;
                    }
                    return Integer.valueOf(i6);
                }
            });
            ArrayList arrayList = aVar.c;
            arrayList.add(A);
            arrayList.add(ofa0Var.A(StickyGravity.END, new sls() { // from class: meu0
                @Override // defpackage.sls
                public final Object invoke() {
                    int i6;
                    int i7 = i2;
                    a aVar2 = aVar;
                    switch (i7) {
                        case 0:
                            i6 = aVar2.k;
                            break;
                        default:
                            i6 = aVar2.l;
                            break;
                    }
                    return Integer.valueOf(i6);
                }
            }));
            aVar.f = seu0.a;
            aVar.b();
            orientationAwareRecyclerView.addOnScrollListener(peu0Var);
            orientationAwareRecyclerView.addOnLayoutChangeListener(stickyViewController$RecyclerViewOnLayoutListener);
            uyp0 uyp0Var2 = new uyp0(aVar, orientationAwareRecyclerView, i2);
            orientationAwareRecyclerView.addOnChildAttachStateChangeListener(uyp0Var2);
            aVar.i = uyp0Var2;
        }
        this.O = aVar;
        if (izp0Var.d) {
            just.adapter.snapping.c cVar = new just.adapter.snapping.c(new kn2(25, nfhVar, efxVar), new kn2(26, efxVar, (Object) orientationAwareRecyclerView), this.H);
            cVar.b(orientationAwareRecyclerView);
            this.Q = cVar;
        }
        int i6 = 27;
        t3r t3rVar = new t3r(new kn2(i6, nfhVar, this));
        this.P = t3rVar;
        if (!jl40.l(t3rVar.e, orientationAwareRecyclerView)) {
            OrientationAwareRecyclerView orientationAwareRecyclerView3 = t3rVar.e;
            s3r s3rVar = t3rVar.b;
            r3r r3rVar = t3rVar.c;
            if (orientationAwareRecyclerView3 != null) {
                orientationAwareRecyclerView3.removeItemDecoration(r3rVar);
                orientationAwareRecyclerView3.removeOnScrollListener(s3rVar);
            }
            t3rVar.e = orientationAwareRecyclerView;
            orientationAwareRecyclerView.addOnScrollListener(s3rVar);
            orientationAwareRecyclerView.addItemDecoration(r3rVar);
        }
        this.f0 = orientationAwareRecyclerView.getItemAnimator();
        j89 j89Var = this.I;
        j89Var.getClass();
        j89Var.q = new WeakReference(orientationAwareRecyclerView);
        b6q0 b6q0Var = new b6q0(i, nfhVar);
        this.C.b.add(b6q0Var);
        this.N = b6q0Var;
        View view = viewGroup;
        while (view != null && !jl40.l(view.getTag(mch0.containerTag), Boolean.TRUE)) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (view == null) {
            w511.g(view, " is not in container attached to DocumentEngine");
            return null;
        }
        int hashCode = view.hashCode();
        amr amrVar = amr.c;
        Integer valueOf = Integer.valueOf(hashCode);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) amrVar.b.get(qoi0.a(WindowInsetsProvider.class));
        Object obj = concurrentHashMap != null ? concurrentHashMap.get(valueOf) : null;
        WindowInsetsProvider windowInsetsProvider = (WindowInsetsProvider) (obj == null ? null : obj);
        this.g0 = windowInsetsProvider;
        if (windowInsetsProvider != null) {
            windowInsetsProvider.a.add(this.j0);
        }
        OrientationAwareRecyclerView orientationAwareRecyclerView4 = (OrientationAwareRecyclerView) nfhVar.b;
        htk htkVar = new htk(i2, this, nfhVar);
        l070 l070Var = new l070(htkVar);
        l70 l70Var = new l70(orientationAwareRecyclerView4, htkVar);
        orientationAwareRecyclerView4.addOnScrollListener(l070Var);
        efxVar.registerAdapterDataObserver(l70Var);
        csf0 csf0Var = new csf0(i6, new int0(orientationAwareRecyclerView4, l070Var, efxVar, l70Var));
        ArrayList arrayList2 = this.L;
        arrayList2.add(csf0Var);
        c6q0 c6q0Var = new c6q0(this);
        j89Var.h.add(c6q0Var);
        c6q0Var.a(j89Var.i, j89Var.j);
        arrayList2.add(new csf0(28, new e89(i, j89Var, c6q0Var)));
        mas masVar = this.F;
        if (masVar != null) {
            masVar.j(viewGroup.getContext());
        }
        this.M = nfhVar;
        return (View) nfhVar.a;
    }

    @Override // defpackage.ws11
    public final void onDestroy() {
        this.i0 = null;
        bvf0.j(this.a0, null);
        j89 j89Var = this.I;
        ArrayList arrayList = j89Var.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f0q0 f0q0Var = ((g89) it.next()).b;
            if (f0q0Var.b && !f0q0Var.c) {
                f0q0Var.c();
                cnr0 cnr0Var = cnr0.b;
                f0q0Var.d.a = null;
                f0q0Var.c = true;
            }
        }
        arrayList.clear();
        j89Var.q.clear();
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        OrientationAwareRecyclerView orientationAwareRecyclerView;
        ContentAwareSwipeRefreshLayout contentAwareSwipeRefreshLayout;
        b6q0 b6q0Var = this.N;
        if (b6q0Var != null) {
            this.C.b.remove(b6q0Var);
            this.N = null;
        }
        nfh nfhVar = this.M;
        if (nfhVar != null) {
            OrientationAwareRecyclerView orientationAwareRecyclerView2 = (OrientationAwareRecyclerView) nfhVar.b;
            RecyclerView.e layoutManager = orientationAwareRecyclerView2.getLayoutManager();
            if (layoutManager != null) {
                this.i0 = layoutManager.X0();
            }
            orientationAwareRecyclerView2.clearOnScrollListeners();
            orientationAwareRecyclerView2.setAdapter(null);
        }
        nfh nfhVar2 = this.M;
        if (nfhVar2 != null && (contentAwareSwipeRefreshLayout = (ContentAwareSwipeRefreshLayout) nfhVar2.c) != null) {
            contentAwareSwipeRefreshLayout.setOnRefreshListener(null);
        }
        this.J.g(EmptyList.a);
        ArrayList arrayList = this.L;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sls) it.next()).invoke();
        }
        arrayList.clear();
        this.I.l = null;
        this.M = null;
        just.adapter.sticky.a aVar = this.O;
        if (aVar != null) {
            aVar.c.clear();
            RecyclerView.Adapter adapter = aVar.d;
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(aVar.e);
            }
            OrientationAwareRecyclerView orientationAwareRecyclerView3 = aVar.b;
            if (orientationAwareRecyclerView3 != null) {
                orientationAwareRecyclerView3.removeOnScrollListener(aVar.g);
            }
            OrientationAwareRecyclerView orientationAwareRecyclerView4 = aVar.b;
            if (orientationAwareRecyclerView4 != null) {
                orientationAwareRecyclerView4.removeOnLayoutChangeListener(aVar.h);
            }
            uyp0 uyp0Var = aVar.i;
            if (uyp0Var != null && (orientationAwareRecyclerView = aVar.b) != null) {
                orientationAwareRecyclerView.removeOnChildAttachStateChangeListener(uyp0Var);
            }
            aVar.i = null;
            OrientationAwareRecyclerView orientationAwareRecyclerView5 = aVar.b;
            if (orientationAwareRecyclerView5 != null) {
                orientationAwareRecyclerView5.removeCallbacks(aVar.j);
            }
            aVar.d = null;
            aVar.b = null;
        }
        this.O = null;
        t3r t3rVar = this.P;
        if (t3rVar != null) {
            t3rVar.e = null;
        }
        just.adapter.snapping.c cVar = this.Q;
        if (cVar != null) {
            cVar.b(null);
        }
        this.Q = null;
        this.f0 = null;
        this.c0 = new j6q0(this.c0.d, 7);
        WindowInsetsProvider windowInsetsProvider = this.g0;
        if (windowInsetsProvider != null) {
            windowInsetsProvider.a.remove(this.j0);
        }
        this.P = null;
        this.d0 = null;
        this.e0 = new rke(null);
        this.V.clear();
        this.W.clear();
        this.Z.clear();
        this.R.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x040b, code lost:
    
        if (defpackage.jl40.l(r0 != null ? r0.a : r9, r8 != null ? r8.a : r9) == false) goto L264;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020b A[LOOP:0: B:134:0x0205->B:136:0x020b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0385 A[LOOP:4: B:230:0x037f->B:232:0x0385, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ef  */
    @Override // defpackage.ws11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpdateState(Object obj) {
        boolean z;
        j89 j89Var;
        String m;
        boolean z2;
        zyl zylVar;
        vke r;
        nie nieVar;
        vke ukeVar;
        Boolean bool;
        nfh nfhVar;
        zyl zylVar2;
        boolean z3;
        zyp0 zyp0Var;
        ReusePolicy reusePolicy;
        Iterator it;
        nfh nfhVar2;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int size;
        kr krVar;
        Iterator it2;
        ArrayList arrayList3;
        seu seuVar;
        f0q0 e;
        pyp0 pyp0Var;
        pyp0 pyp0Var2;
        nie nieVar2;
        nfh nfhVar3;
        kr krVar2;
        nie nieVar3;
        tg2 tg2Var;
        tg2 tg2Var2;
        final c cVar = this;
        nie nieVar4 = (nie) obj;
        see seeVar = nieVar4.c;
        int i2 = nieVar4.a;
        final cnr0 cnr0Var = nieVar4.d;
        u1m u1mVar = nieVar4.b;
        dzp0 dzp0Var = (dzp0) seeVar;
        xyp0 xyp0Var = dzp0Var.d;
        yyp0 yyp0Var = dzp0Var.e;
        czp0 czp0Var = dzp0Var.a;
        boolean z4 = nieVar4.e;
        o530 o530Var = cVar.E;
        if (z4) {
            nfh nfhVar4 = cVar.M;
            if (nfhVar4 != null) {
                OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) nfhVar4.b;
                if (yyp0Var == null || (tg2Var2 = yyp0Var.b) == null) {
                    return;
                }
                o530Var.p(tg2Var2, bi91.h(orientationAwareRecyclerView));
                return;
            }
            return;
        }
        nie nieVar5 = cVar.d0;
        if (nieVar5 != null) {
            u1m u1mVar2 = nieVar5.b;
            if (jl40.l(u1mVar2 != null ? u1mVar2.a : null, u1mVar != null ? u1mVar.a : null)) {
                z = true;
                e89 e89Var = new e89(10, cVar, nieVar4);
                j89Var = cVar.I;
                j89Var.l = e89Var;
                dzp0 dzp0Var2 = (dzp0) seeVar;
                m = m(nieVar4);
                if (m != null) {
                    String uuid = UUID.randomUUID().toString();
                    wyi0 wyi0Var = cVar.B;
                    if (wyi0Var != null) {
                        wyi0Var.u(m, uuid);
                    }
                    nie nieVar6 = cVar.d0;
                    if (nieVar6 != null) {
                        z2 = z;
                        zylVar = new zyl(nieVar6.a);
                    } else {
                        z2 = z;
                        zylVar = null;
                    }
                    if (zylVar != null && zylVar.a == i2) {
                        r = cVar.e0;
                        if (r instanceof rke) {
                            r = new rke(new Pair(m, uuid));
                        } else if (!jl40.l(r, ske.a)) {
                            if (r instanceof tke) {
                                ukeVar = new tke(((tke) r).a, new Pair(m, uuid));
                            } else {
                                if (!(r instanceof uke)) {
                                    w511.b();
                                    return;
                                }
                                ukeVar = new uke(((uke) r).a, new Pair(m, uuid));
                            }
                            r = ukeVar;
                        }
                    } else {
                        r = cVar.r(dzp0Var2, m, uuid);
                    }
                    cVar.e0 = r;
                    ArrayList arrayList4 = cVar.V;
                    ArrayList arrayList5 = cVar.W;
                    if (z2) {
                        ycc.r(arrayList5, arrayList4);
                    }
                    arrayList5.clear();
                    Pair a = cVar.e0.a();
                    if (a != null) {
                        final String str = (String) a.getFirst();
                        final String str2 = (String) a.getSecond();
                        final int i3 = 0;
                        nieVar = nieVar4;
                        arrayList4.add(new sls(cVar) { // from class: f6q0
                            public final /* synthetic */ c b;

                            {
                                this.b = cVar;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = i3;
                                zy11 zy11Var = zy11.a;
                                cnr0 cnr0Var2 = cnr0Var;
                                String str3 = str2;
                                String str4 = str;
                                c cVar2 = this.b;
                                switch (i4) {
                                    case 0:
                                        wyi0 wyi0Var2 = cVar2.B;
                                        if (wyi0Var2 != null) {
                                            wyi0Var2.m(str4, str3, kotlin.a.a(new csf0(29, cnr0Var2)));
                                            break;
                                        }
                                        break;
                                    default:
                                        wyi0 wyi0Var3 = cVar2.B;
                                        if (wyi0Var3 != null) {
                                            wyi0Var3.l(str4, str3, kotlin.a.a(new csf0(29, cnr0Var2)));
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        });
                        final int i4 = 1;
                        cVar = this;
                        arrayList5.add(new sls(cVar) { // from class: f6q0
                            public final /* synthetic */ c b;

                            {
                                this.b = cVar;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i42 = i4;
                                zy11 zy11Var = zy11.a;
                                cnr0 cnr0Var2 = cnr0Var;
                                String str3 = str2;
                                String str4 = str;
                                c cVar2 = this.b;
                                switch (i42) {
                                    case 0:
                                        wyi0 wyi0Var2 = cVar2.B;
                                        if (wyi0Var2 != null) {
                                            wyi0Var2.m(str4, str3, kotlin.a.a(new csf0(29, cnr0Var2)));
                                            break;
                                        }
                                        break;
                                    default:
                                        wyi0 wyi0Var3 = cVar2.B;
                                        if (wyi0Var3 != null) {
                                            wyi0Var3.l(str4, str3, kotlin.a.a(new csf0(29, cnr0Var2)));
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var;
                            }
                        });
                        cVar.U = true;
                        cVar.S = czp0Var.c.a;
                        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig = czp0Var.h;
                        Object obj2 = cVar.G.a;
                        bool = Boolean.FALSE;
                        if (bool.booleanValue()) {
                            optimizedPaginationTriggerFeatureConfig = OptimizedPaginationTriggerFeatureConfig.ENABLED_AUTOMATIC_TRIGGER;
                        }
                        cVar.h0 = optimizedPaginationTriggerFeatureConfig;
                        cVar.T = czp0Var.d;
                        nfhVar = cVar.M;
                        if (nfhVar != null) {
                            j6q0 a2 = j6q0.a(cVar.c0, czp0Var.a, czp0Var.b, true, false, 8);
                            cVar.c0 = a2;
                            cVar.q(!a2.d && a2.b && a2.c);
                            ContentAwareSwipeRefreshLayout contentAwareSwipeRefreshLayout = (ContentAwareSwipeRefreshLayout) nfhVar.c;
                            OrientationAwareRecyclerView orientationAwareRecyclerView2 = (OrientationAwareRecyclerView) nfhVar.b;
                            if (contentAwareSwipeRefreshLayout != null) {
                                j6q0 j6q0Var = cVar.c0;
                                contentAwareSwipeRefreshLayout.setEnabled(j6q0Var.a && !j6q0Var.d && j6q0Var.b && j6q0Var.c);
                                contentAwareSwipeRefreshLayout.setRefreshing(false);
                            }
                            cVar.k0 = czp0Var.e;
                            WindowInsetsProvider windowInsetsProvider = cVar.g0;
                            cVar.t(windowInsetsProvider != null ? windowInsetsProvider.c : null, orientationAwareRecyclerView2, contentAwareSwipeRefreshLayout);
                            orientationAwareRecyclerView2.setItemAnimator(jl40.l(czp0Var.f, bool) ? null : cVar.f0);
                            Boolean bool2 = czp0Var.g;
                            if (bool2 != null) {
                                orientationAwareRecyclerView2.setOverScrollMode(bool2.booleanValue() ? 0 : 2);
                            }
                        }
                        nie nieVar7 = cVar.d0;
                        zylVar2 = nieVar7 != null ? new zyl(nieVar7.a) : null;
                        if (zylVar2 != null && zylVar2.a == i2) {
                            krVar = null;
                        } else {
                            z3 = dzp0Var.c == null && cVar.A.a;
                            zyp0Var = dzp0Var.f;
                            if (zyp0Var != null || (reusePolicy = zyp0Var.b) == null) {
                                reusePolicy = ReusePolicy.USE_STORED;
                            }
                            pyp0 pyp0Var3 = zyp0Var != null ? zyp0Var.a : null;
                            List list = dzp0Var.b;
                            ArrayList arrayList6 = new ArrayList(tcc.n(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList6.add(new nke(u1mVar, (pyp0) it.next(), new pxl(cnr0Var)));
                            }
                            if (z3) {
                                l0z l0zVar = cVar.l0;
                                l0zVar.getClass();
                                int i5 = k0z.a[reusePolicy.ordinal()];
                                if (i5 == 1) {
                                    l0zVar.a = false;
                                    l0zVar.b = pyp0Var3;
                                } else if (i5 == 2) {
                                    l0zVar.a = false;
                                    pyp0Var3 = l0zVar.b;
                                } else {
                                    if (i5 != 3) {
                                        w511.b();
                                        return;
                                    }
                                    l0zVar.a = true;
                                    pyp0Var2 = null;
                                    if (pyp0Var2 != null) {
                                        arrayList6 = kotlin.collections.a.o0(arrayList6, new nke(u1mVar, pyp0Var2, new pxl(cnr0Var)));
                                    }
                                }
                                pyp0Var2 = pyp0Var3;
                                if (pyp0Var2 != null) {
                                }
                            }
                            nfhVar2 = cVar.M;
                            ArrayList arrayList7 = j89Var.g;
                            j89Var.m = true;
                            if (j89Var.k != z3) {
                                j89Var.n = true;
                                j89Var.k = z3;
                            }
                            arrayList = new ArrayList(arrayList6);
                            i = 0;
                            while (i < arrayList.size()) {
                                nke nkeVar = (nke) arrayList.get(i);
                                int size2 = arrayList7.size();
                                int i6 = i;
                                while (true) {
                                    if (i6 >= size2) {
                                        i6 = -1;
                                        break;
                                    }
                                    int i7 = size2;
                                    if (jl40.l(((g89) arrayList7.get(i6)).a.b, nkeVar.b)) {
                                        break;
                                    }
                                    i6++;
                                    size2 = i7;
                                }
                                if (i6 != -1) {
                                    if (i != i6) {
                                        arrayList7.add(i, (g89) arrayList7.remove(i6));
                                        j89Var.n = true;
                                    }
                                    arrayList3 = arrayList6;
                                } else {
                                    seu seuVar2 = j89Var.d;
                                    try {
                                        g0q0 g0q0Var = j89Var.c;
                                        pyp0Var = nkeVar.b;
                                        arrayList3 = arrayList6;
                                        try {
                                            e = g0q0Var.a(pyp0Var, nkeVar.c);
                                        } catch (Exception e2) {
                                            e = e2;
                                            if (e.getMessage() == null) {
                                                nkeVar.b.getA();
                                            }
                                            a1q0 a1q0Var = j89Var.e;
                                            if (a1q0Var != null) {
                                                seuVar = seuVar2;
                                                a1q0Var.g(nkeVar.a, nkeVar.b, e);
                                            } else {
                                                seuVar = seuVar2;
                                            }
                                            if (seuVar != null) {
                                                e = seu.e(nkeVar.b, e);
                                                if (e == null) {
                                                }
                                            }
                                            e = null;
                                            if (e == null) {
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        arrayList3 = arrayList6;
                                    }
                                    if (e == null) {
                                        e = seuVar2 != null ? seu.e(pyp0Var, null) : null;
                                        if (e == null) {
                                            pyp0Var.getA();
                                            e = null;
                                        }
                                    }
                                    if (e == null) {
                                        arrayList.remove(i);
                                        arrayList6 = arrayList3;
                                    } else {
                                        g89 g89Var = new g89(nkeVar, e, EmptyList.a, false);
                                        arrayList7.add(i, g89Var);
                                        e.a.add(new h89(j89Var, g89Var));
                                        j89Var.n = true;
                                    }
                                }
                                i++;
                                arrayList6 = arrayList3;
                            }
                            arrayList2 = arrayList6;
                            size = arrayList7.size() - arrayList.size();
                            if (size > 0) {
                                for (int i8 = 0; i8 < size; i8++) {
                                    f0q0 f0q0Var = ((g89) ycc.z(arrayList7)).b;
                                    if (f0q0Var.b && !f0q0Var.c) {
                                        f0q0Var.c();
                                        cnr0 cnr0Var2 = cnr0.b;
                                        f0q0Var.d.a = null;
                                        f0q0Var.c = true;
                                    }
                                }
                                krVar = null;
                                j89Var.n = true;
                            } else {
                                krVar = null;
                            }
                            j89Var.b();
                            j89Var.m = false;
                            if (!j89Var.n || arrayList2.isEmpty()) {
                                j89Var.d();
                            }
                            if (arrayList2.isEmpty()) {
                                j89Var.e();
                            }
                            ArrayList arrayList8 = cVar.R;
                            it2 = arrayList8.iterator();
                            while (it2.hasNext()) {
                                ((sls) it2.next()).invoke();
                            }
                            arrayList8.clear();
                            if (nfhVar2 != null) {
                                ((OrientationAwareRecyclerView) nfhVar2.b).post(new ymp0(1, cVar));
                            }
                        }
                        kr krVar3 = xyp0Var == null ? xyp0Var.a : krVar;
                        kr krVar4 = xyp0Var == null ? xyp0Var.c : krVar;
                        nieVar2 = cVar.d0;
                        n530 n530Var = cVar.b;
                        if (nieVar2 != null) {
                            u1m u1mVar3 = nieVar2.b;
                            if (jl40.l(u1mVar3 != null ? u1mVar3.a : krVar, u1mVar != null ? u1mVar.a : krVar)) {
                                rzo.p(n530Var, krVar4, new pxl(cnr0Var));
                                nfhVar3 = cVar.M;
                                if (nfhVar3 != null) {
                                    OrientationAwareRecyclerView orientationAwareRecyclerView3 = (OrientationAwareRecyclerView) nfhVar3.b;
                                    if (yyp0Var != null && (tg2Var = yyp0Var.a) != null) {
                                        o530Var.p(tg2Var, bi91.h(orientationAwareRecyclerView3));
                                    }
                                }
                                krVar2 = xyp0Var != null ? xyp0Var.b : krVar;
                                if (krVar2 != null) {
                                    nie nieVar8 = cVar.d0;
                                    if (nieVar8 != null) {
                                        u1m u1mVar4 = nieVar8.b;
                                    }
                                    nieVar3 = nieVar;
                                    cVar.Z.add(new in2(21, cVar, krVar2, nieVar3));
                                    cVar.d0 = nieVar3;
                                }
                                nieVar3 = nieVar;
                                cVar.d0 = nieVar3;
                            }
                        }
                        rzo.p(n530Var, krVar3, new pxl(cnr0Var));
                        nfhVar3 = cVar.M;
                        if (nfhVar3 != null) {
                        }
                        if (xyp0Var != null) {
                        }
                        if (krVar2 != null) {
                        }
                        nieVar3 = nieVar;
                        cVar.d0 = nieVar3;
                    }
                }
                nieVar = nieVar4;
                cVar.U = true;
                cVar.S = czp0Var.c.a;
                OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig2 = czp0Var.h;
                Object obj22 = cVar.G.a;
                bool = Boolean.FALSE;
                if (bool.booleanValue()) {
                }
                cVar.h0 = optimizedPaginationTriggerFeatureConfig2;
                cVar.T = czp0Var.d;
                nfhVar = cVar.M;
                if (nfhVar != null) {
                }
                nie nieVar72 = cVar.d0;
                if (nieVar72 != null) {
                }
                if (zylVar2 != null) {
                    krVar = null;
                    if (xyp0Var == null) {
                    }
                    if (xyp0Var == null) {
                    }
                    nieVar2 = cVar.d0;
                    n530 n530Var2 = cVar.b;
                    if (nieVar2 != null) {
                    }
                    rzo.p(n530Var2, krVar3, new pxl(cnr0Var));
                    nfhVar3 = cVar.M;
                    if (nfhVar3 != null) {
                    }
                    if (xyp0Var != null) {
                    }
                    if (krVar2 != null) {
                    }
                    nieVar3 = nieVar;
                    cVar.d0 = nieVar3;
                }
                if (dzp0Var.c == null) {
                }
                zyp0Var = dzp0Var.f;
                if (zyp0Var != null) {
                }
                reusePolicy = ReusePolicy.USE_STORED;
                if (zyp0Var != null) {
                }
                List list2 = dzp0Var.b;
                ArrayList arrayList62 = new ArrayList(tcc.n(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                }
                if (z3) {
                }
                nfhVar2 = cVar.M;
                ArrayList arrayList72 = j89Var.g;
                j89Var.m = true;
                if (j89Var.k != z3) {
                }
                arrayList = new ArrayList(arrayList62);
                i = 0;
                while (i < arrayList.size()) {
                }
                arrayList2 = arrayList62;
                size = arrayList72.size() - arrayList.size();
                if (size > 0) {
                }
                j89Var.b();
                j89Var.m = false;
                if (!j89Var.n) {
                }
                j89Var.d();
                if (arrayList2.isEmpty()) {
                }
                ArrayList arrayList82 = cVar.R;
                it2 = arrayList82.iterator();
                while (it2.hasNext()) {
                }
                arrayList82.clear();
                if (nfhVar2 != null) {
                }
                if (xyp0Var == null) {
                }
                if (xyp0Var == null) {
                }
                nieVar2 = cVar.d0;
                n530 n530Var22 = cVar.b;
                if (nieVar2 != null) {
                }
                rzo.p(n530Var22, krVar3, new pxl(cnr0Var));
                nfhVar3 = cVar.M;
                if (nfhVar3 != null) {
                }
                if (xyp0Var != null) {
                }
                if (krVar2 != null) {
                }
                nieVar3 = nieVar;
                cVar.d0 = nieVar3;
            }
        }
        z = false;
        e89 e89Var2 = new e89(10, cVar, nieVar4);
        j89Var = cVar.I;
        j89Var.l = e89Var2;
        dzp0 dzp0Var22 = (dzp0) seeVar;
        m = m(nieVar4);
        if (m != null) {
        }
        nieVar = nieVar4;
        cVar.U = true;
        cVar.S = czp0Var.c.a;
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig22 = czp0Var.h;
        Object obj222 = cVar.G.a;
        bool = Boolean.FALSE;
        if (bool.booleanValue()) {
        }
        cVar.h0 = optimizedPaginationTriggerFeatureConfig22;
        cVar.T = czp0Var.d;
        nfhVar = cVar.M;
        if (nfhVar != null) {
        }
        nie nieVar722 = cVar.d0;
        if (nieVar722 != null) {
        }
        if (zylVar2 != null) {
        }
        if (dzp0Var.c == null) {
        }
        zyp0Var = dzp0Var.f;
        if (zyp0Var != null) {
        }
        reusePolicy = ReusePolicy.USE_STORED;
        if (zyp0Var != null) {
        }
        List list22 = dzp0Var.b;
        ArrayList arrayList622 = new ArrayList(tcc.n(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        if (z3) {
        }
        nfhVar2 = cVar.M;
        ArrayList arrayList722 = j89Var.g;
        j89Var.m = true;
        if (j89Var.k != z3) {
        }
        arrayList = new ArrayList(arrayList622);
        i = 0;
        while (i < arrayList.size()) {
        }
        arrayList2 = arrayList622;
        size = arrayList722.size() - arrayList.size();
        if (size > 0) {
        }
        j89Var.b();
        j89Var.m = false;
        if (!j89Var.n) {
        }
        j89Var.d();
        if (arrayList2.isEmpty()) {
        }
        ArrayList arrayList822 = cVar.R;
        it2 = arrayList822.iterator();
        while (it2.hasNext()) {
        }
        arrayList822.clear();
        if (nfhVar2 != null) {
        }
        if (xyp0Var == null) {
        }
        if (xyp0Var == null) {
        }
        nieVar2 = cVar.d0;
        n530 n530Var222 = cVar.b;
        if (nieVar2 != null) {
        }
        rzo.p(n530Var222, krVar3, new pxl(cnr0Var));
        nfhVar3 = cVar.M;
        if (nfhVar3 != null) {
        }
        if (xyp0Var != null) {
        }
        if (krVar2 != null) {
        }
        nieVar3 = nieVar;
        cVar.d0 = nieVar3;
    }

    public final void p(List list, Map map) {
        ArrayList<pyp0> arrayList;
        ArrayList arrayList2;
        wbe0 k;
        List list2;
        nie nieVar = this.d0;
        if (nieVar == null || (list2 = ((dzp0) nieVar.c).b) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list2) {
                if (list.contains(((pyp0) obj).getA())) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (pyp0 pyp0Var : arrayList) {
                nie nieVar2 = this.d0;
                arrayList2.add(l(nieVar2 != null ? nieVar2.d : null, pyp0Var.getA(), null));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null || arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 == null || (k = k(arrayList2)) == null) {
            return;
        }
        wbe0 wbe0Var = new wbe0(1, null, gw00.e(new Pair("request", map)));
        this.c.a(new ixl(new d3q0(r2q0.INSTANCE), new wbe0(kotlin.collections.b.n(wbe0Var.a, k.a), kotlin.collections.b.n(wbe0Var.b, k.b))));
    }

    public final void q(boolean z) {
        ContentAwareSwipeRefreshLayout contentAwareSwipeRefreshLayout;
        Object layoutManager;
        nfh nfhVar = this.M;
        if (nfhVar != null && (layoutManager = ((OrientationAwareRecyclerView) nfhVar.b).getLayoutManager()) != null && (layoutManager instanceof mhp0)) {
            mhp0 mhp0Var = (mhp0) layoutManager;
            mhp0Var.w(z);
            mhp0Var.A(z);
        }
        nfh nfhVar2 = this.M;
        if (nfhVar2 == null || (contentAwareSwipeRefreshLayout = (ContentAwareSwipeRefreshLayout) nfhVar2.c) == null) {
            return;
        }
        j6q0 j6q0Var = this.c0;
        contentAwareSwipeRefreshLayout.setEnabled(j6q0Var.a && !j6q0Var.d && j6q0Var.b && j6q0Var.c);
    }

    public final vke r(dzp0 dzp0Var, String str, String str2) {
        j2q0 j2q0Var;
        Map map;
        c990 c990Var = this.A;
        String str3 = c990Var.b;
        if (str3 == null) {
            s5r s5rVar = new s5r(kotlin.sequences.b.g(new h73(1, dzp0Var.b), b990.a));
            if (s5rVar.hasNext()) {
                s5rVar.next().getClass();
                ny61.u();
                return null;
            }
            str3 = null;
        }
        xyp0 xyp0Var = dzp0Var.d;
        if (xyp0Var == null || (map = xyp0Var.g) == null || (j2q0Var = (j2q0) map.get(str3)) == null || j2q0Var.c()) {
            j2q0Var = null;
        }
        if ((j2q0Var != null ? j2q0Var.a() : null) != null && !kotlin.collections.a.G(c990Var.c, str3)) {
            return new tke(j2q0Var.a(), new Pair(str, str2));
        }
        String str4 = dzp0Var.c;
        if (str4 != null && c990Var.a) {
            return new uke(str4, new Pair(str, str2));
        }
        xyp0 xyp0Var2 = dzp0Var.d;
        return (xyp0Var2 != null ? xyp0Var2.f : null) != null ? new tke(xyp0Var2.f, new Pair(str, str2)) : new rke(new Pair(str, str2));
    }

    public final void s(Boolean bool, boolean z) {
        this.c0 = j6q0.a(this.c0, false, false, z, !z && jl40.l(bool, Boolean.TRUE), 3);
        q(z);
    }

    public final void t(n751 n751Var, OrientationAwareRecyclerView orientationAwareRecyclerView, ContentAwareSwipeRefreshLayout contentAwareSwipeRefreshLayout) {
        azp0 azp0Var = this.k0;
        if (azp0Var == null) {
            return;
        }
        int i = i(azp0Var, orientationAwareRecyclerView, n751Var, Side.TOP);
        orientationAwareRecyclerView.setPadding(orientationAwareRecyclerView.getPaddingLeft(), i, orientationAwareRecyclerView.getPaddingRight(), i(azp0Var, orientationAwareRecyclerView, n751Var, Side.BOTTOM));
        if (azp0Var.a != null) {
            u1w g = n751Var != null ? n751Var.a.g(16) : null;
            if (contentAwareSwipeRefreshLayout != null) {
                contentAwareSwipeRefreshLayout.setProgressViewEndTarget(false, i + (g != null ? g.b : 0));
            }
        }
    }
}
