package flex.engine;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2m;
import defpackage.a2o;
import defpackage.a3m;
import defpackage.amr;
import defpackage.ay01;
import defpackage.ayl;
import defpackage.b0m;
import defpackage.b2m;
import defpackage.b301;
import defpackage.bhz;
import defpackage.bvf0;
import defpackage.by31;
import defpackage.byl;
import defpackage.bzl;
import defpackage.cjg0;
import defpackage.cnr0;
import defpackage.cwl;
import defpackage.cy01;
import defpackage.cyl;
import defpackage.d3m;
import defpackage.dez;
import defpackage.dhz;
import defpackage.dsg;
import defpackage.dxd;
import defpackage.dyi0;
import defpackage.e3m;
import defpackage.e89;
import defpackage.elf0;
import defpackage.ew2;
import defpackage.g2m;
import defpackage.g3m;
import defpackage.g8e;
import defpackage.ga1;
import defpackage.gfe;
import defpackage.hh5;
import defpackage.i3m;
import defpackage.i3y;
import defpackage.i7x0;
import defpackage.ik91;
import defpackage.ike;
import defpackage.in2;
import defpackage.izl;
import defpackage.j400;
import defpackage.j73;
import defpackage.jaa1;
import defpackage.jah;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.jol0;
import defpackage.jse;
import defpackage.k3k;
import defpackage.kn2;
import defpackage.kr;
import defpackage.ks31;
import defpackage.l1o;
import defpackage.lb7;
import defpackage.lfe;
import defpackage.ls31;
import defpackage.m0m;
import defpackage.m631;
import defpackage.mch0;
import defpackage.mjm0;
import defpackage.n1m;
import defpackage.n1o;
import defpackage.n530;
import defpackage.nfh;
import defpackage.nie;
import defpackage.njd;
import defpackage.nx31;
import defpackage.ny61;
import defpackage.o1m;
import defpackage.o1o;
import defpackage.o530;
import defpackage.oju0;
import defpackage.ow50;
import defpackage.oyr;
import defpackage.pey;
import defpackage.pjm0;
import defpackage.pol0;
import defpackage.pxl;
import defpackage.qi2;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.qxl;
import defpackage.r631;
import defpackage.r94;
import defpackage.ri2;
import defpackage.rjr;
import defpackage.rms;
import defpackage.rs31;
import defpackage.rzo;
import defpackage.s0m;
import defpackage.s6o;
import defpackage.s7s0;
import defpackage.s8o;
import defpackage.sbc;
import defpackage.scc;
import defpackage.see;
import defpackage.seu;
import defpackage.sjh;
import defpackage.sls;
import defpackage.szl;
import defpackage.tjr;
import defpackage.tww0;
import defpackage.txl;
import defpackage.u1m;
import defpackage.u6o;
import defpackage.ujm0;
import defpackage.unr0;
import defpackage.uwl;
import defpackage.uxl;
import defpackage.uyj;
import defpackage.vez0;
import defpackage.vwl;
import defpackage.vxl;
import defpackage.w0j;
import defpackage.w511;
import defpackage.wjr;
import defpackage.wu;
import defpackage.wwl;
import defpackage.wxl;
import defpackage.wyl;
import defpackage.x0d;
import defpackage.xfz;
import defpackage.xxl;
import defpackage.xzl;
import defpackage.yjr;
import defpackage.yu;
import defpackage.ywl;
import defpackage.yxl;
import defpackage.yyl;
import defpackage.z1o;
import defpackage.z2m;
import defpackage.zjr;
import defpackage.zmi0;
import defpackage.zse;
import defpackage.zwl;
import defpackage.zxl;
import defpackage.zyl;
import flex.health.ErrorTypes;
import flex.loader.DocumentFetchOrigin;
import flex.logger.FlexLogLevel;
import flex.logger.view.LoggerOverlayView;
import flex.utils.android.WindowInsetsProvider;
import flex.utils.android.WindowInsetsProvider$containerAttachListener$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class a implements dez {
    public static final xxl s0 = new xxl();
    public final List A;
    public final r631 B;
    public final ayl C;
    public final yyl D;
    public wyl E;
    public final String F;
    public final n530 G;
    public final WindowInsetsProvider H;
    public final cyl I;
    private final pey J;
    public pol0 K;
    public final nfh L;
    public final x0d M;
    public final zjr N;
    public final wxl O;
    public final lb7 P;
    public final l1o Q;
    public final ArrayList R;
    public final cwl S;
    public final zxl T;
    public pey U;
    public final jol0 V;
    public final ike W;
    public final oju0 Z;
    public final i7x0 a;
    public final i3y a0;
    public final u6o b;
    public final ArrayList b0;
    public final seu c;
    public ujm0 c0;
    public lfe d0;
    public pjm0 e0;
    public gfe f0;
    public ViewGroup g0;
    public View h0;
    public View i0;
    public boolean j0;
    public boolean k0;
    public ViewGroup l0;
    public d3m m0;
    public final cy01 n0;
    public final byl o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public final bzl w;
    public final qxl x;
    public final boolean y;
    public final ow50 z;

    /* JADX WARN: Multi-variable type inference failed */
    public a(m0m m0mVar, yu yuVar, ujm0 ujm0Var, lfe lfeVar, i7x0 i7x0Var, u6o u6oVar, seu seuVar, bzl bzlVar, qxl qxlVar, List list, List list2, jah jahVar, List list3, ri2 ri2Var, ow50 ow50Var, List list4, z1o z1oVar, r631 r631Var, int i) {
        nfh nfhVar;
        seu seuVar2 = (i & 64) != 0 ? seu.A : seuVar;
        qxl a = (i & 1024) != 0 ? flex.engine.document.a.a() : qxlVar;
        jah jahVar2 = (i & 8192) != 0 ? null : jahVar;
        List list5 = (262144 & i) != 0 ? EmptyList.a : list4;
        r631 r631Var2 = (i & 2097152) != 0 ? null : r631Var;
        this.a = i7x0Var;
        this.b = u6oVar;
        this.c = seuVar2;
        this.w = bzlVar;
        this.x = a;
        this.y = true;
        this.z = ow50Var;
        this.A = list5;
        this.B = r631Var2;
        this.C = new ayl(z1oVar);
        this.D = new yyl();
        this.F = UUID.randomUUID().toString();
        txl txlVar = new txl(this);
        n530 a2 = yuVar.a(txlVar, new vxl(this, 0));
        this.G = a2;
        this.H = new WindowInsetsProvider();
        cyl cylVar = new cyl();
        this.I = cylVar;
        w0j w0jVar = new w0j(this);
        this.J = w0jVar;
        new vxl(this, 1);
        amr amrVar = amr.c;
        wjr wjrVar = (wjr) amrVar.a(qoi0.a(wjr.class));
        if (Boolean.FALSE.booleanValue()) {
            by31 by31Var = wjrVar instanceof by31 ? (by31) wjrVar : null;
            nfhVar = new nfh();
            nfhVar.a = by31Var;
        } else {
            nfhVar = null;
        }
        this.L = nfhVar;
        this.M = new x0d();
        this.N = new zjr(xfz.b(a.class.getSimpleName()));
        wxl wxlVar = new wxl(this);
        this.O = wxlVar;
        lb7 lb7Var = new lb7(new vxl(this, 2), list2);
        this.P = lb7Var;
        jb7 provide = ri2Var.provide();
        l1o l1oVar = new l1o(a2, txlVar, cylVar, w0jVar, new o530((njd) provide.b, (qi2) provide.c, (seu) provide.w), new yxl(this), lb7Var);
        this.Q = l1oVar;
        this.R = new ArrayList();
        this.S = new cwl(1, this);
        this.T = new zxl(this);
        jol0 jol0Var = new jol0(list);
        this.V = jol0Var;
        sjh sjhVar = uyj.a;
        jb7 jb7Var = zse.a;
        ike f = g8e.f(((j400) jb7Var.b).R());
        this.W = f;
        this.Z = new oju0(new a3m((zyl) null, (u1m) (0 == true ? 1 : 0), 6), new dhz(new zmi0(Collections.singletonList(new a2m(jahVar2)), 0)), scc.g(new bhz(), new unicorn.actors.a(j73.A(new tww0[]{new flex.engine.state.actor.a(l1oVar, m0mVar, i7x0Var, f, (jse) jb7Var.w, list3, ow50Var, r631Var2, bzlVar), new b301(l1oVar, jol0Var, i7x0Var, lb7Var), bzlVar != null ? new b0m(bzlVar) : null}), f)));
        this.a0 = kotlin.a.a(new vxl(this, 3));
        this.b0 = new ArrayList();
        this.c0 = ujm0Var;
        this.d0 = lfeVar;
        this.n0 = new cy01();
        this.o0 = new byl(this);
        i7x0Var.b.add(wxlVar);
        wxlVar.a(i7x0Var.c());
    }

    public static void e(View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.addView(view);
    }

    public static /* synthetic */ void q(a aVar, u1m u1mVar, ywl ywlVar, boolean z, int i) {
        if ((i & 2) != 0) {
            ywlVar = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.p(u1mVar, ywlVar, z);
    }

    public final Bundle A() {
        Bundle bundle = new Bundle();
        ik91.f((e3m) this.Z.a, new hh5(8, bundle));
        return bundle;
    }

    public final void B(ywl ywlVar, u1m u1mVar) {
        if (this.j0) {
            ny61.r("Can't show document after destroy");
            return;
        }
        xzl xzlVar = (xzl) this.x.a.invoke(ywlVar);
        if (u1mVar == null) {
            u1mVar = xzlVar.b;
        }
        h(new o1m(new dyi0(xzlVar, u1mVar)));
    }

    public final void C(xzl xzlVar) {
        if (this.j0) {
            ny61.r("Can't show document after destroy");
        } else {
            h(new o1m(new dyi0(xzlVar, xzlVar.b)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(ywl ywlVar, zwl zwlVar) {
        if (this.j0) {
            ny61.r("Can't update document after destroy");
            return;
        }
        xzl xzlVar = new xzl(ywlVar, null, 0 == true ? 1 : 0, 30);
        oju0 oju0Var = this.Z;
        dyi0 dyi0Var = new dyi0(xzlVar, qje.V((e3m) oju0Var.a), zwl.c, zwlVar);
        s8o.S(this, oju0Var);
        oju0Var.b(new o1m(dyi0Var));
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.N;
    }

    public final void b(szl szlVar) {
        ((ArrayList) this.P.c).add(szlVar);
    }

    public final void c(i3m i3mVar) {
        this.V.a.add(i3mVar);
    }

    public final void d(RecyclerView.g gVar) {
        this.R.add(gVar);
        gfe gfeVar = this.f0;
        if (gfeVar != null) {
            gfeVar.a(gVar);
        }
    }

    public final boolean f(d3m d3mVar, ViewGroup viewGroup) {
        StackTraceElement stackTraceElement;
        i7x0 i7x0Var;
        String str;
        zjr zjrVar;
        tjr tjrVar;
        Boolean bool;
        xzl xzlVar;
        boolean z;
        ViewGroup viewGroup2;
        View view;
        StackTraceElement stackTraceElement2;
        String num;
        nfh nfhVar;
        LoggerOverlayView loggerOverlayView;
        ViewGroup viewGroup3;
        StackTraceElement stackTraceElement3;
        String str2;
        tjr tjrVar2;
        Long l;
        i7x0 i7x0Var2 = this.a;
        l1o l1oVar = this.Q;
        jol0 jol0Var = this.V;
        lb7 lb7Var = this.P;
        this.r0 = true;
        boolean z2 = false;
        if (this.y && (l = d3mVar.b.c.a) != null && l.longValue() < System.currentTimeMillis()) {
            w(false);
        }
        View view2 = this.h0;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        View view3 = this.i0;
        if (view3 != null) {
            viewGroup.removeView(view3);
        }
        boolean z3 = this.q0;
        xzl xzlVar2 = d3mVar.b;
        u1m u1mVar = d3mVar.c;
        boolean z4 = xzlVar2.e;
        i3y a = xfz.a(new Pair("documentQuery", u1mVar), new Pair("screenIsBroken", Boolean.valueOf(z4)), new Pair("isPreload", Boolean.valueOf(z3)));
        zjr zjrVar2 = this.N;
        rjr rjrVar = zjrVar2.c;
        rjr rjrVar2 = zjrVar2.c;
        s7s0 s7s0Var = rjrVar.a;
        Boolean bool2 = Boolean.FALSE;
        boolean booleanValue = bool2.booleanValue();
        tjr tjrVar3 = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            String str3 = fileName == null ? "No file info" : fileName;
            i7x0Var = i7x0Var2;
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            zjrVar = zjrVar2;
            tjrVar = new tjr(str3, methodName, str);
        } else {
            i7x0Var = i7x0Var2;
            zjrVar = zjrVar2;
            tjrVar = tjrVar3;
        }
        FlexLogLevel flexLogLevel = FlexLogLevel.DEBUG;
        String str4 = tjrVar.a;
        String str5 = tjrVar.c;
        String str6 = tjrVar.b;
        EmptyList emptyList = EmptyList.a;
        zjrVar.d(flexLogLevel, "Applying rendered document state", a, emptyList, str4, str6, str5);
        if (z4) {
            String type = ErrorTypes.DOCUMENT_CONTENT_ERROR.getType();
            s7s0 s7s0Var2 = rjrVar2.a;
            if (bool2.booleanValue() && (stackTraceElement3 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName2 = stackTraceElement3.getFileName();
                if (fileName2 == null) {
                    fileName2 = "No file info";
                }
                String methodName2 = stackTraceElement3.getMethodName();
                int lineNumber2 = stackTraceElement3.getLineNumber();
                Integer valueOf2 = Integer.valueOf(lineNumber2);
                if (lineNumber2 <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 == null || (str2 = valueOf2.toString()) == null) {
                    str2 = "No line info";
                }
                bool = bool2;
                tjrVar2 = new tjr(fileName2, methodName2, str2);
            } else {
                bool = bool2;
                tjrVar2 = tjrVar3;
            }
            zjrVar.d(FlexLogLevel.FAULT, "Document processing warning: content is fallback or contains errors", xfz.c(a, xfz.a(new Pair("errorType", type))), emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        } else {
            bool = bool2;
        }
        d3m d3mVar2 = this.m0;
        xzl xzlVar3 = d3mVar2 != null ? d3mVar2.b : null;
        boolean l2 = jl40.l(d3mVar2 != null ? qje.V(d3mVar2) : null, u1mVar);
        n530 n530Var = this.G;
        if (xzlVar3 == null || ((l2 && !d3mVar.e.a) || d3mVar.f)) {
            xzlVar = xzlVar3;
        } else {
            ywl ywlVar = xzlVar3.a;
            uwl uwlVar = ywlVar.d;
            xzlVar = xzlVar3;
            rzo.p(n530Var, uwlVar != null ? uwlVar.e : null, new pxl(ywlVar.c));
        }
        this.m0 = d3mVar;
        ywl ywlVar2 = xzlVar2.a;
        ywl ywlVar3 = xzlVar2.a;
        pjm0 v = v(ywlVar2.b, viewGroup);
        if (v != null) {
            view = v.ensureCreatedView(viewGroup);
            z = l2;
            viewGroup2 = v.a(view);
        } else {
            z = l2;
            viewGroup2 = null;
            view = null;
        }
        if (view != null && viewGroup.indexOfChild(view) == -1) {
            e(view, viewGroup);
        }
        see seeVar = ywlVar3.a;
        ViewGroup viewGroup4 = this.g0;
        if (viewGroup4 == null) {
            viewGroup4 = viewGroup;
        }
        gfe s = s(seeVar, viewGroup4, d3mVar2, xzlVar != null && z);
        t(s, viewGroup2 == null ? viewGroup : viewGroup2, xzlVar != null && z);
        if (bool.booleanValue() && (nfhVar = this.L) != null && ((loggerOverlayView = (LoggerOverlayView) nfhVar.b) == null || (viewGroup3 = (ViewGroup) nfhVar.c) == null || viewGroup3.indexOfChild(loggerOverlayView) == -1)) {
            if (!jl40.l((ViewGroup) nfhVar.c, viewGroup)) {
                ViewGroup viewGroup5 = (ViewGroup) nfhVar.c;
                if (viewGroup5 != null) {
                    viewGroup5.removeView((LoggerOverlayView) nfhVar.b);
                }
                nfhVar.b = null;
                nfhVar.c = null;
            }
            by31 by31Var = (by31) nfhVar.a;
            if (by31Var != null) {
                nfhVar.c = viewGroup;
                if (((LoggerOverlayView) nfhVar.b) == null) {
                    LoggerOverlayView loggerOverlayView2 = new LoggerOverlayView(viewGroup);
                    loggerOverlayView2.setRepo(by31Var);
                    loggerOverlayView2.setElevation(20.0f);
                    nfhVar.b = loggerOverlayView2;
                }
                viewGroup.addView((LoggerOverlayView) nfhVar.b, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        if (v != null) {
            wwl wwlVar = ywlVar3.f;
        }
        this.g0 = viewGroup2;
        try {
            lb7Var.z(new s0m(ywlVar3));
            jol0Var.onDocumentApplied(l1oVar, xzlVar2, i7x0Var.c());
            jol0Var.onRenderingStarted(l1oVar, u1mVar, xzlVar2, i7x0Var.c());
            lb7Var.z(new izl(xzlVar2));
            mjm0 mjm0Var = ywlVar3.b;
            if (mjm0Var != null && v != null) {
                v.onUpdateState(new ew2(mjm0Var, ywlVar3.c, z2));
            }
            wyl wylVar = this.E;
            Bundle bundle = wylVar != null ? (Bundle) wylVar.w("content_controller_state") : null;
            wyl wylVar2 = this.E;
            Bundle bundle2 = wylVar2 != null ? (Bundle) wylVar2.w("scaffold_controller_state") : null;
            s.onUpdateState(new nie(d3mVar.a, d3mVar.c, ywlVar3.a, ywlVar3.c, false));
            if (bundle != null) {
                s.onRestoreState(bundle);
            }
            if (bundle2 != null && v != null) {
                v.onRestoreState(bundle2);
            }
            if ((!z || d3mVar.d.b) && !d3mVar.f) {
                uwl uwlVar2 = ywlVar3.d;
                rzo.p(n530Var, uwlVar2 != null ? uwlVar2.a : null, new pxl(ywlVar3.c));
            }
            if (!d3mVar.f) {
                uwl uwlVar3 = ywlVar3.d;
                rzo.p(n530Var, uwlVar3 != null ? uwlVar3.b : null, new pxl(ywlVar3.c));
            }
            Choreographer.getInstance().postFrameCallback(new uxl(this, d3mVar, 0));
            viewGroup.post(new r94(4, this, d3mVar, s));
            return true;
        } catch (Throwable th) {
            bzl bzlVar = this.w;
            if (bzlVar != null) {
                bzlVar.a.w(u1mVar, th);
            }
            jaa1.b(u1mVar);
            this.c.getClass();
            i3y a2 = xfz.a(new Pair("query", u1mVar != null ? u1mVar.a : null));
            s7s0 s7s0Var3 = rjrVar2.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName3 = stackTraceElement2.getFileName();
                if (fileName3 == null) {
                    fileName3 = "No file info";
                }
                String methodName3 = stackTraceElement2.getMethodName();
                int lineNumber3 = stackTraceElement2.getLineNumber();
                Integer valueOf3 = lineNumber3 > 0 ? Integer.valueOf(lineNumber3) : null;
                tjrVar3 = new tjr(fileName3, methodName3, (valueOf3 == null || (num = valueOf3.toString()) == null) ? "No line info" : num);
            }
            tjr tjrVar4 = tjrVar3;
            zjrVar.d(FlexLogLevel.DEBUG, "Failed to render document state", a2, emptyList, tjrVar4.a, tjrVar4.b, tjrVar4.c);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.content.ComponentCallbacks, flex.trim.memory.ComponentCallbacks2Handler$attach$1] */
    public final void g(ViewGroup viewGroup, pey peyVar) {
        if (this.j0) {
            ny61.r("Can't attach engine after destroy");
            return;
        }
        this.r0 = false;
        j();
        this.l0 = viewGroup;
        amr amrVar = amr.c;
        Integer valueOf = Integer.valueOf(viewGroup.hashCode());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) amrVar.b.computeIfAbsent(qoi0.a(WindowInsetsProvider.class), new dxd(3, new dsg(22)));
        WindowInsetsProvider windowInsetsProvider = this.H;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(valueOf, windowInsetsProvider);
        }
        viewGroup.setTag(mch0.containerTag, Boolean.TRUE);
        this.K = new pol0(this.J);
        this.U = peyVar;
        peyVar.getLifecycle().a(this.S);
        m().i(peyVar.getLifecycle().b());
        y.A.y.a(this.T);
        viewGroup.getContext();
        this.z.getClass();
        WindowInsetsProvider$containerAttachListener$1 windowInsetsProvider$containerAttachListener$1 = windowInsetsProvider.b;
        viewGroup.addOnAttachStateChangeListener(windowInsetsProvider$containerAttachListener$1);
        if (viewGroup.isAttachedToWindow()) {
            windowInsetsProvider$containerAttachListener$1.onViewAttachedToWindow(viewGroup);
        }
        ArrayList arrayList = this.R;
        byl bylVar = this.o0;
        if (!arrayList.contains(bylVar)) {
            arrayList.add(bylVar);
        }
        final DocumentEngine$attachToContainer$2 documentEngine$attachToContainer$2 = new DocumentEngine$attachToContainer$2(0, this, a.class, "handleTrimMemory", "handleTrimMemory()V", 0);
        x0d x0dVar = this.M;
        x0dVar.a(viewGroup);
        Context context = viewGroup.getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            ?? r0 = new ComponentCallbacks2() { // from class: flex.trim.memory.ComponentCallbacks2Handler$attach$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration newConfig) {
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    sls.this.invoke();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int level) {
                    if (level >= 40) {
                        sls.this.invoke();
                    }
                }
            };
            x0dVar.a = r0;
            ((Application) applicationContext).registerComponentCallbacks(r0);
        }
        ga1 ga1Var = new ga1(new Ref$ObjectRef(), new Ref$BooleanRef(), new kn2(6, this, viewGroup), 4);
        oju0 oju0Var = this.Z;
        oju0Var.x.add(ga1Var);
        ga1Var.invoke(oju0Var.a);
        int i = 12;
        this.b0.add(new sbc(i, new e89(i, oju0Var, ga1Var)));
    }

    public final void h(o1m o1mVar) {
        elf0 elf0Var;
        n1m n1mVar = o1mVar.a;
        if (n1mVar instanceof cjg0) {
            cjg0 cjg0Var = (cjg0) n1mVar;
            elf0Var = new elf0(cjg0Var.b, cjg0Var.a);
        } else if (!(n1mVar instanceof dyi0)) {
            w511.b();
            return;
        } else {
            dyi0 dyi0Var = (dyi0) n1mVar;
            elf0Var = new elf0(dyi0Var.a.a, dyi0Var.b);
        }
        if (!this.p0) {
            xxl xxlVar = s0;
            a aVar = (a) xxlVar.b.remove(elf0Var);
            if (aVar == null) {
                xxlVar.c.put(elf0Var, this);
            }
            a2o a2oVar = new a2o(this);
            HashMap hashMap = xxlVar.a;
            if (hashMap.containsKey(a2oVar)) {
                ny61.r(oyr.p("Engine with key: ", oyr.p("DocumentEngineId(value=", this.F, Extension.C_BRAKE), " already exists in tree"));
                return;
            } else if (this == aVar) {
                ny61.r("Engine cannot be its own parent");
                return;
            } else {
                if (aVar != null) {
                    hashMap.put(a2oVar, new a2o(aVar));
                }
                this.p0 = true;
            }
        }
        oju0 oju0Var = this.Z;
        s8o.S(this, oju0Var);
        oju0Var.b(o1mVar);
    }

    public final void i() {
        String str;
        ywl ywlVar;
        see seeVar;
        lfe lfeVar;
        StackTraceElement stackTraceElement;
        String str2;
        if (this.j0) {
            ny61.r("DocumentEngine already destroyed");
            return;
        }
        o1o o1oVar = o1o.a;
        lb7 lb7Var = this.P;
        lb7Var.z(o1oVar);
        ViewGroup viewGroup = this.l0;
        Pair pair = new Pair("containerId", viewGroup != null ? Integer.valueOf(viewGroup.getId()) : null);
        oju0 oju0Var = this.Z;
        i3y a = xfz.a(pair, new Pair("lastDocumentState", oju0Var.a.getClass()));
        zjr zjrVar = this.N;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str2);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "DocumentEngine is destroyed", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        d3m d3mVar = this.m0;
        xzl xzlVar = d3mVar != null ? d3mVar.b : null;
        if (xzlVar != null) {
            ywl ywlVar2 = xzlVar.a;
            uwl uwlVar = ywlVar2.d;
            rzo.p(this.G, uwlVar != null ? uwlVar.e : null, new pxl(ywlVar2.c));
        }
        xxl xxlVar = s0;
        LinkedHashMap linkedHashMap = xxlVar.c;
        HashMap hashMap = xxlVar.a;
        LinkedHashMap linkedHashMap2 = xxlVar.b;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = this.F;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (jl40.l(str, ((a) entry.getValue()).F)) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap3.keySet().iterator();
        while (it2.hasNext()) {
            linkedHashMap2.remove(it2.next());
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (jl40.l(str, ((a) entry2.getValue()).F)) {
                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            }
        }
        Iterator it3 = linkedHashMap4.keySet().iterator();
        while (it3.hasNext()) {
            linkedHashMap.remove(it3.next());
        }
        a2o a2oVar = new a2o(this);
        a2o a2oVar2 = (a2o) hashMap.remove(a2oVar);
        boolean z = a2oVar2 != null;
        for (Map.Entry entry3 : kotlin.collections.a.J0(hashMap.entrySet())) {
            a2o a2oVar3 = (a2o) entry3.getKey();
            if (jl40.l((a2o) entry3.getValue(), a2oVar)) {
                if (a2oVar2 == null) {
                    z = z || ((a2o) hashMap.remove(a2oVar3)) != null;
                } else {
                    hashMap.put(a2oVar3, a2oVar2);
                }
            }
        }
        s8o.S(this, oju0Var);
        oju0Var.b(g2m.a);
        if (xzlVar != null && (ywlVar = xzlVar.a) != null && (seeVar = ywlVar.a) != null && (lfeVar = this.d0) != null) {
            lfeVar.dispose(this.Q, seeVar);
        }
        this.d0 = null;
        this.c0 = null;
        this.m0 = null;
        j();
        gfe gfeVar = this.f0;
        if (gfeVar != null) {
            gfeVar.onDestroy();
        }
        s6o s6oVar = (s6o) this.a0.getValue();
        if (s6oVar != null) {
            s6oVar.onDestroy();
        }
        this.f0 = null;
        this.e0 = null;
        String str3 = zjrVar.d;
        if (str3 != null) {
            zjrVar.c(str3);
            xfz.a.remove(new yjr(str3));
        }
        this.a.b.remove(this.O);
        bvf0.j(this.W, null);
        this.V.dispose();
        ArrayList arrayList = (ArrayList) lb7Var.c;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((szl) it4.next()).dispose();
        }
        arrayList.clear();
        this.R.clear();
        this.E = null;
        this.j0 = true;
    }

    public final void j() {
        Lifecycle lifecycle;
        ViewGroup viewGroup = this.l0;
        if (viewGroup == null) {
            return;
        }
        this.M.a(viewGroup);
        ArrayList arrayList = this.b0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sls) it.next()).invoke();
        }
        arrayList.clear();
        pjm0 pjm0Var = this.e0;
        if (pjm0Var != null) {
            pjm0Var.ensureDestroyedView();
        }
        gfe gfeVar = this.f0;
        if (gfeVar != null) {
            gfeVar.ensureDestroyedView();
        }
        s6o s6oVar = (s6o) this.a0.getValue();
        if (s6oVar != null) {
            s6oVar.onDetach();
        }
        ViewGroup viewGroup2 = this.l0;
        if (viewGroup2 != null) {
            nfh nfhVar = this.L;
            if (nfhVar != null) {
                viewGroup2.removeView((LoggerOverlayView) nfhVar.b);
                nfhVar.b = null;
                nfhVar.c = null;
            }
            viewGroup2.removeOnAttachStateChangeListener(this.H.b);
            amr amrVar = amr.c;
            Integer valueOf = Integer.valueOf(viewGroup2.hashCode());
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) amrVar.b.get(qoi0.a(WindowInsetsProvider.class));
            Object remove = concurrentHashMap != null ? concurrentHashMap.remove(valueOf) : null;
            if (remove == null) {
                remove = null;
            }
        }
        ViewGroup viewGroup3 = this.l0;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        ViewGroup viewGroup4 = this.l0;
        if (viewGroup4 != null) {
            viewGroup4.setTag(mch0.containerTag, null);
        }
        this.l0 = null;
        pey peyVar = this.U;
        if (peyVar != null && (lifecycle = peyVar.getLifecycle()) != null) {
            lifecycle.d(this.S);
        }
        y.A.y.d(this.T);
        this.z.getClass();
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.U = null;
        m().g(Lifecycle.Event.ON_DESTROY);
    }

    public final void k(kr krVar) {
        StackTraceElement stackTraceElement;
        String str;
        e3m e3mVar = (e3m) this.Z.a;
        xzl b = e3mVar.b();
        ywl ywlVar = b != null ? b.a : null;
        if (ywlVar != null) {
            ((wu) s8o.W(this, this.G)).b(krVar, new pxl(ywlVar.c), b.f());
            return;
        }
        i3y a = xfz.a(new Pair("actionType", krVar.getClass().getSimpleName()), new Pair("documentState", e3mVar.getClass().getSimpleName()));
        zjr zjrVar = this.N;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Action is not dispatched because of illegal state", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    public final void l(gfe gfeVar, ViewGroup viewGroup) {
        viewGroup.removeView(gfeVar.ensureCreatedView(viewGroup));
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            gfeVar.g((RecyclerView.g) it.next());
        }
        gfeVar.ensureDestroyedView();
        gfeVar.onDestroy();
    }

    public final t m() {
        pol0 pol0Var = this.K;
        if (pol0Var != null) {
            return pol0Var;
        }
        ny61.g("DocumentEngine is not attached to container yet.");
        return null;
    }

    public final void n() {
        Iterator it = this.I.a.iterator();
        while (it.hasNext()) {
            ((k3k) ((nx31) it.next())).a.tryLogVisibility();
        }
    }

    public final boolean o() {
        e3m e3mVar = (e3m) this.Z.a;
        return (e3mVar instanceof d3m) || (e3mVar instanceof z2m);
    }

    public final void p(u1m u1mVar, ywl ywlVar, boolean z) {
        if (this.j0) {
            ny61.r("Can't load or show preview of document after destroy");
        } else {
            h(new o1m(new cjg0(u1mVar, ywlVar, z, this.A)));
        }
    }

    public final void r(rs31 rs31Var, boolean z, String str) {
        if (str == null) {
            str = "documentEngineViewModel";
        }
        if (rs31Var != null) {
            yyl yylVar = this.D;
            yylVar.getClass();
            ks31 ks31Var = ls31.b;
            ls31 j = rms.j(rs31Var, yylVar.a, 4);
            this.E = (wyl) j.a.B(qoi0.a(wyl.class), str);
            if (z) {
                this.P.z(n1o.a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gfe s(see seeVar, ViewGroup viewGroup, d3m d3mVar, boolean z) {
        StackTraceElement stackTraceElement;
        String str;
        gfe gfeVar;
        gfe gfeVar2;
        xzl xzlVar;
        ywl ywlVar;
        vwl vwlVar;
        lfe lfeVar;
        try {
            lfeVar = this.d0;
        } catch (Exception e) {
            i3y a = xfz.a(new Pair("contentType", seeVar.getClass().getSimpleName()), new Pair("cause", e));
            zjr zjrVar = this.N;
            s7s0 s7s0Var = zjrVar.c.a;
            boolean booleanValue = Boolean.FALSE.booleanValue();
            tjr tjrVar = tjr.d;
            if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                Integer valueOf = Integer.valueOf(lineNumber);
                if (lineNumber <= 0) {
                    valueOf = null;
                }
                if (valueOf == null || (str = valueOf.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "Content controller not found", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        }
        if (lfeVar != null) {
            gfeVar = lfeVar.get(this.Q, seeVar);
            if (!jl40.l(this.f0, gfeVar)) {
                gfe gfeVar3 = this.f0;
                if (gfeVar3 != null) {
                    if (d3mVar != null && (xzlVar = d3mVar.b) != null && (ywlVar = xzlVar.a) != null) {
                        if (z) {
                            ywlVar = null;
                        }
                        if (ywlVar != null) {
                            View ensureCreatedView = gfeVar3.ensureCreatedView(viewGroup);
                            in2 in2Var = new in2(4, this, gfeVar3, viewGroup);
                            wwl wwlVar = ywlVar.f;
                            if (wwlVar == null || (vwlVar = wwlVar.b) == null) {
                                in2Var.invoke();
                            } else {
                                ay01 a2 = this.n0.a(vwlVar.a());
                                if (a2 != null) {
                                    a2.j(ensureCreatedView, vwlVar, s8o.h(in2Var));
                                }
                            }
                        }
                    }
                    l(gfeVar3, viewGroup);
                }
                this.f0 = gfeVar;
                Iterator it = this.R.iterator();
                while (it.hasNext()) {
                    RecyclerView.g gVar = (RecyclerView.g) it.next();
                    gfe gfeVar4 = this.f0;
                    if (gfeVar4 != null) {
                        gfeVar4.a(gVar);
                    }
                }
            }
            gfeVar2 = this.f0;
            if (gfeVar2 == null) {
                return gfeVar2;
            }
            ny61.g("Required value was null.");
            return null;
        }
        gfeVar = null;
        if (!jl40.l(this.f0, gfeVar)) {
        }
        gfeVar2 = this.f0;
        if (gfeVar2 == null) {
        }
    }

    public final void t(gfe gfeVar, ViewGroup viewGroup, boolean z) {
        xzl xzlVar;
        final ywl ywlVar;
        final View ensureCreatedView = gfeVar.ensureCreatedView(viewGroup);
        if (ensureCreatedView == null) {
            viewGroup.removeAllViews();
            return;
        }
        if (viewGroup.indexOfChild(ensureCreatedView) == -1) {
            e(ensureCreatedView, viewGroup);
        }
        d3m d3mVar = this.m0;
        if (d3mVar == null || (xzlVar = d3mVar.b) == null || (ywlVar = xzlVar.a) == null) {
            return;
        }
        if (z) {
            ywlVar = null;
        }
        if (ywlVar != null) {
            if (!ensureCreatedView.isLaidOut() || ensureCreatedView.isLayoutRequested()) {
                ensureCreatedView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: flex.engine.DocumentEngine$prepareContentView$lambda$40$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        s8o.T(ywl.this, ensureCreatedView, this.n0);
                    }
                });
            } else {
                s8o.T(ywlVar, ensureCreatedView, this.n0);
            }
        }
    }

    public final ywl u(ywl ywlVar) {
        uwl uwlVar;
        xzl xzlVar;
        ywl ywlVar2;
        d3m d3mVar = this.m0;
        uwl uwlVar2 = (d3mVar == null || (xzlVar = d3mVar.b) == null || (ywlVar2 = xzlVar.a) == null) ? null : ywlVar2.d;
        m631 m631Var = new m631(g8e.z("sourceType", DocumentFetchOrigin.Preview.getValue()));
        cnr0 cnr0Var = ywlVar.c;
        cnr0 cnr0Var2 = cnr0.b;
        cnr0 a = cnr0Var.a(vez0.f(Collections.singletonList(m631Var)));
        uwl uwlVar3 = ywlVar.d;
        if (uwlVar2 != null) {
            kr krVar = uwlVar2.c;
            kr krVar2 = uwlVar2.f;
            if (uwlVar3 == null) {
                uwlVar = new uwl(null, null, krVar, null, null, krVar2);
                return ywl.a(ywlVar, null, null, a, uwlVar, 51);
            }
            uwlVar3 = uwl.a(uwlVar3, null, krVar, krVar2, 27);
        }
        uwlVar = uwlVar3;
        return ywl.a(ywlVar, null, null, a, uwlVar, 51);
    }

    public final pjm0 v(mjm0 mjm0Var, ViewGroup viewGroup) {
        StackTraceElement stackTraceElement;
        String str;
        pjm0 pjm0Var = null;
        if (mjm0Var != null) {
            try {
                ujm0 ujm0Var = this.c0;
                if (ujm0Var != null) {
                    pjm0Var = ujm0Var.get(this.Q, mjm0Var, this.P);
                }
            } catch (Exception e) {
                i3y a = xfz.a(new Pair("contentType", mjm0Var.getClass().getSimpleName()), new Pair("cause", e));
                zjr zjrVar = this.N;
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = Integer.valueOf(lineNumber);
                    if (lineNumber <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "Scaffold controller not found", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
            }
        }
        if (!jl40.l(this.e0, pjm0Var)) {
            pjm0 pjm0Var2 = this.e0;
            if (pjm0Var2 != null) {
                viewGroup.removeView(pjm0Var2.ensureCreatedView(viewGroup));
                pjm0Var2.ensureDestroyedView();
            }
            this.e0 = pjm0Var;
        }
        return this.e0;
    }

    public final void w(boolean z) {
        if (this.j0) {
            ny61.r("Can't reload document after destroy");
            return;
        }
        oju0 oju0Var = this.Z;
        xzl b = ((e3m) oju0Var.a).b();
        ywl ywlVar = b != null ? b.a : null;
        if (ywlVar != null) {
            uwl uwlVar = ywlVar.d;
            rzo.p(this.G, uwlVar != null ? uwlVar.d : null, new pxl(ywlVar.c));
        }
        s8o.S(this, oju0Var);
        oju0Var.b(new b2m(z, this.A));
    }

    public final void x(i3m i3mVar) {
        this.V.a.remove(i3mVar);
    }

    public final void y(RecyclerView.g gVar) {
        gfe gfeVar = this.f0;
        if (gfeVar != null) {
            gfeVar.g(gVar);
        }
        this.R.remove(gVar);
    }

    public final void z(Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("document_state_bundle");
            int i = 8;
            e3m d = ik91.d(bundle2 != null ? new hh5(i, bundle2) : new hh5(i, bundle));
            if (d != null) {
                oju0 oju0Var = this.Z;
                s8o.S(this, oju0Var);
                oju0Var.b(new g3m(d));
            }
        }
    }
}
