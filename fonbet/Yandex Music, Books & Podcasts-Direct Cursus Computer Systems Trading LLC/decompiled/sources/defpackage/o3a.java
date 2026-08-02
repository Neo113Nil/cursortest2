package defpackage;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.util.Property;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.bdui.o;
import com.yandex.plus.core.locale.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class o3a implements tqg {
    public static final nnk Q = new nnk(24);
    public final cir A;
    public final jyr B;
    public final ArrayList C;
    public oy7 D;
    public ly7 E;
    public tro F;
    public ub6 G;
    public ViewGroup H;
    public View I;
    public boolean J;
    public ViewGroup K;
    public l6a L;
    public final c5p M;
    public final ib9 N;
    public boolean O;
    public boolean P;
    public final apo a;
    public final h b;
    public final efo c;
    public final b3a d;
    public final boolean e;
    public final j0j f;
    public final List g;
    public final m3a h;
    public final String i;
    public final ldi j;
    public final tqv k;
    public final l3a l;

    @NotNull
    private final dzf m;
    public dno n;
    public final mvn o;
    public final jzi p;
    public final g06 q;
    public final i3a r;
    public final r7b s;
    public final ArrayList t;
    public final aq7 u;
    public final k3a v;
    public dzf w;
    public final ano x;
    public final pt0 y;
    public final tf6 z;

    public o3a(t4a t4aVar, kkp kkpVar, oy7 oy7Var, ly7 ly7Var, apo apoVar, h hVar, efo efoVar, b bVar) {
        b3a b3aVar = new b3a(a3a.a);
        c5b c5bVar = c5b.a;
        j0j j0jVar = new j0j();
        b2c b2cVar = new b2c();
        this.a = apoVar;
        this.b = hVar;
        this.c = efoVar;
        this.d = b3aVar;
        int i = 1;
        this.e = true;
        this.f = j0jVar;
        this.g = c5bVar;
        this.h = new m3a(b2cVar);
        this.i = UUID.randomUUID().toString();
        int i2 = 0;
        g3a g3aVar = new g3a(i2, this);
        h3a h3aVar = new h3a(this, i2);
        int i3 = 2;
        pz0 pz0Var = new pz0(2);
        pz0Var.b((jy7) kkpVar.b);
        pz0Var.c(((LinkedHashMap) kkpVar.e).values().toArray(new ef[0]));
        ArrayList arrayList = pz0Var.a;
        ldi ldiVar = new ldi(new qq5((ef[]) arrayList.toArray(new ef[arrayList.size()])), (o) kkpVar.c, g3aVar, h3aVar, (s2) kkpVar.d);
        this.j = ldiVar;
        this.k = new tqv();
        l3a l3aVar = new l3a(0);
        this.l = l3aVar;
        n3a n3aVar = new n3a(this);
        this.m = n3aVar;
        btf.b(new h3a(this, i));
        hic hicVar = hic.c;
        Object obj = hicVar.a.get(ern.a(xhc.class));
        Object obj2 = hicVar.a.get(ern.a(siu.class));
        this.o = Boolean.FALSE.booleanValue() ? new mvn(27) : null;
        this.p = new jzi();
        this.q = new g06(fsg.b(o3a.class.getSimpleName()));
        i3a i3aVar = new i3a(this);
        this.r = i3aVar;
        xz0.X(new h4a[0]);
        r7b r7bVar = new r7b(ldiVar, g3aVar, l3aVar, n3aVar, new mdi(), new j3a(this));
        this.s = r7bVar;
        this.t = new ArrayList();
        this.u = new aq7(i, this);
        this.v = new k3a(this);
        ano anoVar = new ano(c5bVar);
        this.x = anoVar;
        pt0 pt0Var = new pt0();
        pt0Var.a = r7bVar;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(c5bVar);
        pt0Var.b = arrayList2;
        this.y = pt0Var;
        dq7 dq7Var = ca8.a;
        osh oshVar = sm6.a;
        tf6 e = gld.e(((bsd) ((y4h) oshVar.a)).g.plus(a4g.n()));
        this.z = e;
        this.A = new cir(new i6a(null, null, 6), new xsg(new t44(t75.c(new y5a()))), u75.h(new wsg(), new utr(xz0.w(new ttr[]{new b5a(r7bVar, t4aVar, apoVar, e, (a) oshVar.c, c5bVar, j0jVar, bVar), new m2t(r7bVar, anoVar, apoVar, pt0Var), bVar != null ? new p4a(bVar) : null}), e)));
        this.B = btf.b(new h3a(this, i3));
        this.C = new ArrayList();
        this.D = oy7Var;
        this.E = ly7Var;
        this.M = new c5p(9);
        this.N = new ib9(i, this);
        ((CopyOnWriteArrayList) apoVar.c).add(i3aVar);
        i3aVar.a(apoVar.m());
    }

    public static void i(o3a o3aVar, t5a t5aVar, q2a q2aVar) {
        if (o3aVar.J) {
            xq0.q("Can't load or show preview of document after destroy");
        } else {
            o3aVar.d(new r5a(new p6n(t5aVar, q2aVar, o3aVar.g)));
        }
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f9  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(l6a l6aVar, ViewGroup viewGroup) {
        StackTraceElement stackTraceElement;
        ?? r28;
        String str;
        vhc vhcVar;
        apo apoVar;
        boolean z;
        Boolean bool;
        ViewGroup viewGroup2;
        View view;
        m4a m4aVar;
        String message;
        StackTraceElement stackTraceElement2;
        String fileName;
        int lineNumber;
        Integer valueOf;
        ArrayList m;
        Iterator it;
        r7b r7bVar;
        StackTraceElement stackTraceElement3;
        String str2;
        vhc vhcVar2;
        Long l;
        apo apoVar2 = this.a;
        ano anoVar = this.x;
        pt0 pt0Var = this.y;
        this.P = true;
        if (this.e && (l = l6aVar.b.c.a) != null && l.longValue() < System.currentTimeMillis()) {
            n(false);
        }
        View view2 = this.I;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        m4a m4aVar2 = l6aVar.b;
        t5a t5aVar = l6aVar.c;
        boolean z2 = m4aVar2.e;
        Pair pair = new Pair("documentQuery", t5aVar);
        Pair pair2 = new Pair("screenIsBroken", Boolean.valueOf(z2));
        Boolean bool2 = Boolean.FALSE;
        jyr a = fsg.a(pair, pair2, new Pair("isPreload", bool2));
        c5b c5bVar = c5b.a;
        g06 g06Var = this.q;
        thc thcVar = (thc) g06Var.c;
        thc thcVar2 = (thc) g06Var.c;
        htb htbVar = thcVar.a;
        boolean booleanValue = bool2.booleanValue();
        vhc vhcVar3 = vhc.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
            String fileName2 = stackTraceElement.getFileName();
            r28 = 0;
            String str3 = fileName2 == null ? "No file info" : fileName2;
            String methodName = stackTraceElement.getMethodName();
            int lineNumber2 = stackTraceElement.getLineNumber();
            Integer valueOf2 = Integer.valueOf(lineNumber2);
            if (lineNumber2 <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 == null || (str = valueOf2.toString()) == null) {
                str = "No line info";
            }
            vhcVar = new vhc(str3, methodName, str);
        } else {
            r28 = 0;
            vhcVar = vhcVar3;
        }
        g06Var.N(yhc.DEBUG, "Applying rendered document state", a, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
        if (z2) {
            xgb xgbVar = xgb.ACTION_SERVICE_REQUEST_ERROR;
            htb htbVar2 = thcVar2.a;
            if (bool2.booleanValue() && (stackTraceElement3 = (StackTraceElement) hrg.k(r28)) != null) {
                String fileName3 = stackTraceElement3.getFileName();
                if (fileName3 == null) {
                    fileName3 = "No file info";
                }
                String methodName2 = stackTraceElement3.getMethodName();
                int lineNumber3 = stackTraceElement3.getLineNumber();
                Integer valueOf3 = Integer.valueOf(lineNumber3);
                if (lineNumber3 <= 0) {
                    valueOf3 = null;
                }
                if (valueOf3 == null || (str2 = valueOf3.toString()) == null) {
                    str2 = "No line info";
                }
                vhcVar2 = new vhc(fileName3, methodName2, str2);
            } else {
                vhcVar2 = vhcVar3;
            }
            g06Var.N(yhc.FAULT, "Document processing warning: content is fallback or contains errors", fsg.c(a, fsg.a(new Pair("errorType", "Document.Content.Failed"))), c5bVar, vhcVar2.a, vhcVar2.b, vhcVar2.c);
        }
        l6a l6aVar2 = this.L;
        m4a m4aVar3 = l6aVar2 != null ? l6aVar2.b : null;
        boolean d = Intrinsics.d(l6aVar2 != null ? y5g.i0(l6aVar2) : null, t5aVar);
        ldi ldiVar = this.j;
        if (m4aVar3 == null || (d && !l6aVar.e.a)) {
            apoVar = apoVar2;
            z = d;
        } else {
            q2a q2aVar = m4aVar3.a;
            apoVar = apoVar2;
            l2a l2aVar = q2aVar.d;
            z = d;
            xv.F(ldiVar, l2aVar != null ? l2aVar.e : null, new z2a(q2aVar.c));
        }
        this.L = l6aVar;
        q2a q2aVar2 = m4aVar2.a;
        q2a q2aVar3 = m4aVar2.a;
        tro m2 = m(q2aVar2.b, viewGroup);
        if (m2 != null) {
            view = m2.o(viewGroup);
            bool = bool2;
            viewGroup2 = m2.G(view);
        } else {
            bool = bool2;
            viewGroup2 = null;
            view = null;
        }
        if (view != null) {
            m4aVar = m4aVar3;
            if (viewGroup.indexOfChild(view) == -1) {
                ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(view);
                }
                viewGroup.addView(view);
            }
        } else {
            m4aVar = m4aVar3;
        }
        kb6 kb6Var = q2aVar3.a;
        ViewGroup viewGroup4 = this.H;
        if (viewGroup4 == null) {
            viewGroup4 = viewGroup;
        }
        ub6 j = j(kb6Var, viewGroup4, l6aVar2, (m4aVar == null || !z) ? r28 : true);
        k(j, viewGroup2 == null ? viewGroup : viewGroup2, (m4aVar == null || !z) ? r28 : true);
        Object obj = hic.c.a.get(ern.a(siu.class));
        if (obj == null) {
            obj = null;
        }
        if (bool.booleanValue() && this.o != null) {
            Intrinsics.d(null, viewGroup);
        }
        this.H = viewGroup2;
        try {
            pt0Var.D(new c5a(q2aVar3));
            m = apoVar.m();
            it = anoVar.a.iterator();
        } catch (Throwable th) {
            message = th.getMessage();
            if (message == null) {
            }
            efo.i(this.c, "Engine.DocumentRenderingFailed", message, "DocumentEngine.applyRenderedState", th, null, lxe.I(t5aVar), 161);
            jyr a2 = fsg.a(new Pair("query", t5aVar == null ? t5aVar.a : null));
            c5b c5bVar2 = c5b.a;
            htb htbVar3 = thcVar2.a;
            if (Boolean.FALSE.booleanValue()) {
                fileName = stackTraceElement2.getFileName();
                if (fileName == null) {
                }
                String methodName3 = stackTraceElement2.getMethodName();
                lineNumber = stackTraceElement2.getLineNumber();
                valueOf = Integer.valueOf(lineNumber);
                if (lineNumber <= 0) {
                }
                if (valueOf != null) {
                }
                String str4 = "No line info";
                vhcVar3 = new vhc(fileName, methodName3, str4);
            }
            vhc vhcVar4 = vhcVar3;
            g06Var.N(yhc.DEBUG, "Failed to render document state", a2, c5bVar2, vhcVar4.a, vhcVar4.b, vhcVar4.c);
            return r28;
        }
        while (true) {
            boolean hasNext = it.hasNext();
            r7bVar = this.s;
            if (!hasNext) {
                break;
            }
            try {
                ((ano) ((o6a) it.next())).b(r7bVar, m4aVar2, m);
            } catch (Throwable th2) {
                Timber.INSTANCE.e(th2);
            }
            message = th.getMessage();
            if (message == null) {
                message = "Document state rendering failed";
            }
            efo.i(this.c, "Engine.DocumentRenderingFailed", message, "DocumentEngine.applyRenderedState", th, null, lxe.I(t5aVar), 161);
            jyr a22 = fsg.a(new Pair("query", t5aVar == null ? t5aVar.a : null));
            c5b c5bVar22 = c5b.a;
            htb htbVar32 = thcVar2.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) hrg.k(r28)) != null) {
                fileName = stackTraceElement2.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName32 = stackTraceElement2.getMethodName();
                lineNumber = stackTraceElement2.getLineNumber();
                valueOf = Integer.valueOf(lineNumber);
                if (lineNumber <= 0) {
                    valueOf = null;
                }
                if (valueOf != null || (str4 = valueOf.toString()) == null) {
                    String str42 = "No line info";
                }
                vhcVar3 = new vhc(fileName, methodName32, str42);
            }
            vhc vhcVar42 = vhcVar3;
            g06Var.N(yhc.DEBUG, "Failed to render document state", a22, c5bVar22, vhcVar42.a, vhcVar42.b, vhcVar42.c);
            return r28;
        }
        ArrayList m3 = apoVar.m();
        Iterator it2 = anoVar.a.iterator();
        while (it2.hasNext()) {
            try {
                ((ano) ((o6a) it2.next())).k(r7bVar, t5aVar, m4aVar2, m3);
            } catch (Throwable th3) {
                Timber.INSTANCE.e(th3);
            }
        }
        pt0Var.D(new d4a(m4aVar2));
        sro sroVar = q2aVar3.b;
        if (sroVar != null && m2 != null) {
            m2.B(new jso(l6aVar.a, l6aVar.c, sroVar, q2aVar3.c, false));
        }
        j.B(new ee6(l6aVar.a, l6aVar.c, q2aVar3.a, q2aVar3.c, false));
        if (!z || l6aVar.d.b) {
            l2a l2aVar2 = q2aVar3.d;
            xv.F(ldiVar, l2aVar2 != null ? l2aVar2.a : null, new z2a(q2aVar3.c));
        }
        l2a l2aVar3 = q2aVar3.d;
        xv.F(ldiVar, l2aVar3 != null ? l2aVar3.b : null, new z2a(q2aVar3.c));
        Choreographer.getInstance().postFrameCallback(new f3a(1, this, l6aVar));
        viewGroup.post(new cy1(15, j, this, l6aVar));
        return true;
    }

    public final void c(ViewGroup viewGroup, dzf dzfVar) {
        if (this.J) {
            xq0.q("Can't attach engine after destroy");
            return;
        }
        if (Intrinsics.d(this.K, viewGroup)) {
            return;
        }
        this.P = false;
        f();
        this.K = viewGroup;
        hic hicVar = hic.c;
        Integer valueOf = Integer.valueOf(viewGroup.hashCode());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hicVar.b.computeIfAbsent(ern.a(tqv.class), new so6(1, new qxb(28)));
        tqv tqvVar = this.k;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(valueOf, tqvVar);
        }
        viewGroup.setTag(R.id.containerTag, Boolean.TRUE);
        this.n = new dno(this.m);
        this.w = dzfVar;
        dzfVar.getLifecycle().a(this.u);
        h().i(dzfVar.getLifecycle().b());
        ctm.i.f.a(this.v);
        viewGroup.getContext();
        this.f.getClass();
        jb jbVar = tqvVar.b;
        viewGroup.addOnAttachStateChangeListener(jbVar);
        if (viewGroup.isAttachedToWindow()) {
            jbVar.onViewAttachedToWindow(viewGroup);
        }
        ArrayList arrayList = this.t;
        ib9 ib9Var = this.N;
        if (!arrayList.contains(ib9Var)) {
            arrayList.add(ib9Var);
        }
        ej6 ej6Var = new ej6(0, this, o3a.class, "handleTrimMemory", "handleTrimMemory()V", 0, 27);
        jzi jziVar = this.p;
        jziVar.n(viewGroup);
        Context context = viewGroup.getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            jn5 jn5Var = new jn5(ej6Var);
            jziVar.a = jn5Var;
            ((Application) applicationContext).registerComponentCallbacks(jn5Var);
        }
        int i = 15;
        g3 g3Var = new g3(23, new xqn(), new tqn(), new ny2(i, this, viewGroup));
        cir cirVar = this.A;
        cirVar.e.add(g3Var);
        g3Var.invoke(cirVar.a);
        this.C.add(new yg6(i, new suh(22, cirVar, g3Var)));
    }

    public final void d(r5a r5aVar) {
        bwm bwmVar;
        q5a q5aVar = r5aVar.a;
        if (q5aVar instanceof p6n) {
            p6n p6nVar = (p6n) q5aVar;
            bwmVar = new bwm(p6nVar.b, p6nVar.a);
        } else if (!(q5aVar instanceof fxn)) {
            b6e.s();
            return;
        } else {
            fxn fxnVar = (fxn) q5aVar;
            bwmVar = new bwm(fxnVar.a.a, fxnVar.b);
        }
        if (!this.O) {
            nnk nnkVar = Q;
            o3a o3aVar = (o3a) ((LinkedHashMap) nnkVar.b).remove(bwmVar);
            i8b i8bVar = new i8b(this);
            HashMap hashMap = (HashMap) nnkVar.a;
            if (hashMap.containsKey(i8bVar)) {
                xq0.q(hrg.q("Engine with key: ", hrg.q("DocumentEngineId(value=", this.i, ")"), " already exists in tree"));
                return;
            } else if (equals(o3aVar)) {
                xq0.q("Engine cannot be its own parent");
                return;
            } else {
                if (o3aVar != null) {
                    hashMap.put(i8bVar, new i8b(o3aVar));
                }
                this.O = true;
            }
        }
        cir cirVar = this.A;
        ywf.E(this, cirVar);
        cirVar.b(r5aVar);
    }

    public final void e() {
        q2a q2aVar;
        StackTraceElement stackTraceElement;
        String str;
        if (this.J) {
            xq0.q("DocumentEngine already destroyed");
            return;
        }
        ViewGroup viewGroup = this.K;
        Pair pair = new Pair("containerId", viewGroup != null ? Integer.valueOf(viewGroup.getId()) : null);
        cir cirVar = this.A;
        jyr a = fsg.a(pair, new Pair("lastDocumentState", cirVar.a.getClass()));
        c5b c5bVar = c5b.a;
        g06 g06Var = this.q;
        htb htbVar = ((thc) g06Var.c).a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        vhc vhcVar = vhc.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
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
            vhcVar = new vhc(fileName, methodName, str);
        }
        g06Var.N(yhc.DEBUG, "DocumentEngine is destroyed", a, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
        l6a l6aVar = this.L;
        m4a m4aVar = l6aVar != null ? l6aVar.b : null;
        if (m4aVar != null) {
            q2a q2aVar2 = m4aVar.a;
            l2a l2aVar = q2aVar2.d;
            xv.F(this.j, l2aVar != null ? l2aVar.e : null, new z2a(q2aVar2.c));
        }
        nnk nnkVar = Q;
        HashMap hashMap = (HashMap) nnkVar.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) nnkVar.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.d(this.i, ((o3a) entry.getValue()).i)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove(it.next());
        }
        i8b i8bVar = new i8b(this);
        i8b i8bVar2 = (i8b) hashMap.remove(i8bVar);
        boolean z = i8bVar2 != null;
        for (Map.Entry entry2 : CollectionsKt.w0(hashMap.entrySet())) {
            i8b i8bVar3 = (i8b) entry2.getKey();
            if (Intrinsics.d((i8b) entry2.getValue(), i8bVar)) {
                if (i8bVar2 == null) {
                    z = z || ((i8b) hashMap.remove(i8bVar3)) != null;
                } else {
                    hashMap.put(i8bVar3, i8bVar2);
                }
            }
        }
        ywf.E(this, cirVar);
        cirVar.b(a6a.a);
        if (m4aVar != null && (q2aVar = m4aVar.a) != null) {
            kb6 kb6Var = q2aVar.a;
        }
        this.E = null;
        this.D = null;
        this.L = null;
        f();
        this.G = null;
        this.F = null;
        String str2 = (String) g06Var.d;
        if (str2 != null) {
            g06Var.G(str2);
            fsg.a.remove(new aic(str2));
        }
        ((CopyOnWriteArrayList) this.a.c).remove(this.r);
        gld.L(this.z, null);
        ArrayList arrayList = this.x.a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((ano) ((o6a) it2.next())).a();
            } catch (Throwable th) {
                Timber.INSTANCE.e(th);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) this.y.b;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((com.yandex.plus.bdui.flex.b) it3.next()).b.p();
        }
        arrayList2.clear();
        this.t.clear();
        this.J = true;
    }

    public final void f() {
        nyf lifecycle;
        ViewGroup viewGroup = this.K;
        if (viewGroup == null) {
            return;
        }
        this.p.n(viewGroup);
        ArrayList arrayList = this.C;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        arrayList.clear();
        tro troVar = this.F;
        if (troVar != null) {
            troVar.p();
        }
        ub6 ub6Var = this.G;
        if (ub6Var != null) {
            ub6Var.p();
        }
        com.yandex.plus.bdui.flex.ui.error.a aVar = (com.yandex.plus.bdui.flex.ui.error.a) this.B.getValue();
        if (aVar != null) {
            this.I = null;
            aVar.p();
        }
        ViewGroup viewGroup2 = this.K;
        if (viewGroup2 != null) {
            if (this.o != null) {
                viewGroup2.removeView(null);
            }
            viewGroup2.removeOnAttachStateChangeListener(this.k.b);
            hic hicVar = hic.c;
            Integer valueOf = Integer.valueOf(viewGroup2.hashCode());
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hicVar.b.get(ern.a(tqv.class));
            Object remove = concurrentHashMap != null ? concurrentHashMap.remove(valueOf) : null;
            if (remove == null) {
                remove = null;
            }
        }
        ViewGroup viewGroup3 = this.K;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        ViewGroup viewGroup4 = this.K;
        if (viewGroup4 != null) {
            viewGroup4.setTag(R.id.containerTag, null);
        }
        this.K = null;
        dzf dzfVar = this.w;
        if (dzfVar != null && (lifecycle = dzfVar.getLifecycle()) != null) {
            lifecycle.d(this.u);
        }
        ctm.i.f.d(this.v);
        this.f.getClass();
        this.H = null;
        this.I = null;
        this.w = null;
        h().g(kyf.ON_DESTROY);
    }

    public final void g(md mdVar) {
        StackTraceElement stackTraceElement;
        String str;
        m6a m6aVar = (m6a) this.A.a;
        m4a a = m6aVar.a();
        q2a q2aVar = a != null ? a.a : null;
        if (q2aVar != null) {
            ldi ldiVar = (ldi) ywf.L(this, this.j);
            z2a z2aVar = new z2a(q2aVar.c);
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            ldiVar.b(mdVar, z2aVar, e5bVar);
            return;
        }
        jyr a2 = fsg.a(new Pair("actionType", mdVar.getClass().getSimpleName()), new Pair("documentState", m6aVar.getClass().getSimpleName()));
        c5b c5bVar = c5b.a;
        g06 g06Var = this.q;
        htb htbVar = ((thc) g06Var.c).a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        vhc vhcVar = vhc.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
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
            vhcVar = new vhc(fileName, methodName, str);
        }
        g06Var.N(yhc.DEBUG, "Action is not dispatched because of illegal state", a2, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
    }

    public final gzf h() {
        dno dnoVar = this.n;
        if (dnoVar != null) {
            return dnoVar;
        }
        xq0.x("DocumentEngine is not attached to container yet.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ub6 j(kb6 kb6Var, ViewGroup viewGroup, l6a l6aVar, boolean z) {
        StackTraceElement stackTraceElement;
        String str;
        ub6 ub6Var;
        ub6 ub6Var2;
        m4a m4aVar;
        q2a q2aVar;
        o2a o2aVar;
        ly7 ly7Var;
        int i = 0;
        try {
            ly7Var = this.E;
        } catch (Exception e) {
            jyr a = fsg.a(new Pair("contentType", kb6Var.getClass().getSimpleName()), new Pair("cause", e));
            c5b c5bVar = c5b.a;
            g06 g06Var = this.q;
            htb htbVar = ((thc) g06Var.c).a;
            boolean booleanValue = Boolean.FALSE.booleanValue();
            vhc vhcVar = vhc.d;
            if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
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
                vhcVar = new vhc(fileName, methodName, str);
            }
            g06Var.N(yhc.DEBUG, "Content controller not found", a, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
        }
        if (ly7Var != null) {
            ub6Var = ly7Var.a(this.s, kb6Var);
            if (!Intrinsics.d(this.G, ub6Var)) {
                ub6 ub6Var3 = this.G;
                ArrayList arrayList = this.t;
                if (ub6Var3 != null) {
                    if (l6aVar != null && (m4aVar = l6aVar.b) != null && (q2aVar = m4aVar.a) != null) {
                        if (z) {
                            q2aVar = null;
                        }
                        if (q2aVar != null) {
                            View o = ub6Var3.o(viewGroup);
                            vd vdVar = new vd(17, this, ub6Var3, viewGroup);
                            p2a p2aVar = q2aVar.f;
                            if (p2aVar == null || (o2aVar = p2aVar.b) == null) {
                                vdVar.invoke();
                            } else {
                                n2a n2aVar = o2aVar.c;
                                c5p c5pVar = this.M;
                                c5pVar.getClass();
                                cib cibVar = (n2aVar == null ? -1 : e8t.a[n2aVar.ordinal()]) == 1 ? new cib((h1b) c5pVar.b) : null;
                                if (cibVar != null) {
                                    i4a i4aVar = new i4a(i, vdVar);
                                    ObjectAnimator objectAnimator = (ObjectAnimator) cibVar.b;
                                    if (objectAnimator != null) {
                                        objectAnimator.cancel();
                                    }
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                                    ofFloat.setDuration((long) o2aVar.a);
                                    m2a m2aVar = o2aVar.b;
                                    if (m2aVar != null) {
                                        ofFloat.setInterpolator(h1b.F(m2aVar));
                                    }
                                    ofFloat.addListener(i4aVar);
                                    cibVar.b = ofFloat;
                                    ofFloat.start();
                                }
                            }
                        }
                    }
                    viewGroup.removeView(ub6Var3.o(viewGroup));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    ub6Var3.p();
                }
                this.G = ub6Var;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                }
            }
            ub6Var2 = this.G;
            if (ub6Var2 == null) {
                return ub6Var2;
            }
            xq0.x("Required value was null.");
            return null;
        }
        ub6Var = null;
        if (!Intrinsics.d(this.G, ub6Var)) {
        }
        ub6Var2 = this.G;
        if (ub6Var2 == null) {
        }
    }

    public final void k(ub6 ub6Var, ViewGroup viewGroup, boolean z) {
        m4a m4aVar;
        q2a q2aVar;
        o2a o2aVar;
        View o = ub6Var.o(viewGroup);
        if (viewGroup.indexOfChild(o) == -1) {
            ViewGroup viewGroup2 = (ViewGroup) o.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(o);
            }
            viewGroup.addView(o);
        }
        l6a l6aVar = this.L;
        if (l6aVar == null || (m4aVar = l6aVar.b) == null || (q2aVar = m4aVar.a) == null) {
            return;
        }
        if (z) {
            q2aVar = null;
        }
        if (q2aVar != null) {
            bv7 bv7Var = new bv7(14);
            p2a p2aVar = q2aVar.f;
            if (p2aVar == null || (o2aVar = p2aVar.a) == null) {
                return;
            }
            n2a n2aVar = o2aVar.c;
            c5p c5pVar = this.M;
            c5pVar.getClass();
            cib cibVar = (n2aVar != null ? e8t.a[n2aVar.ordinal()] : -1) == 1 ? new cib((h1b) c5pVar.b) : null;
            if (cibVar != null) {
                i4a i4aVar = new i4a(0, bv7Var);
                ObjectAnimator objectAnimator = (ObjectAnimator) cibVar.b;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                ofFloat.setDuration((long) o2aVar.a);
                m2a m2aVar = o2aVar.b;
                if (m2aVar != null) {
                    ofFloat.setInterpolator(h1b.F(m2aVar));
                }
                ofFloat.addListener(i4aVar);
                cibVar.b = ofFloat;
                ofFloat.start();
            }
        }
    }

    public final q2a l(q2a q2aVar) {
        m4a m4aVar;
        q2a q2aVar2;
        l6a l6aVar = this.L;
        l2a l2aVar = (l6aVar == null || (m4aVar = l6aVar.b) == null || (q2aVar2 = m4aVar.a) == null) ? null : q2aVar2.d;
        l2a l2aVar2 = q2aVar.d;
        if (l2aVar != null) {
            md mdVar = l2aVar.c;
            md mdVar2 = l2aVar.f;
            l2aVar2 = l2aVar2 != null ? new l2a(l2aVar2.a, l2aVar2.b, mdVar, l2aVar2.d, l2aVar2.e, mdVar2) : new l2a(null, null, mdVar, null, null, mdVar2);
        }
        return l2aVar2 == null ? q2aVar : q2a.a(q2aVar, null, null, l2aVar2, 55);
    }

    public final tro m(sro sroVar, ViewGroup viewGroup) {
        StackTraceElement stackTraceElement;
        String str;
        tro troVar = null;
        if (sroVar != null) {
            try {
                oy7 oy7Var = this.D;
                if (oy7Var != null) {
                    troVar = oy7Var.a(this.s, sroVar);
                }
            } catch (Exception e) {
                jyr a = fsg.a(new Pair("contentType", sroVar.getClass().getSimpleName()), new Pair("cause", e));
                c5b c5bVar = c5b.a;
                g06 g06Var = this.q;
                htb htbVar = ((thc) g06Var.c).a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                vhc vhcVar = vhc.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
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
                    vhcVar = new vhc(fileName, methodName, str);
                }
                g06Var.N(yhc.DEBUG, "Scaffold controller not found", a, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
            }
        }
        if (!Intrinsics.d(this.F, troVar)) {
            tro troVar2 = this.F;
            if (troVar2 != null) {
                viewGroup.removeView(troVar2.o(viewGroup));
                troVar2.p();
            }
            this.F = troVar;
        }
        return this.F;
    }

    public final void n(boolean z) {
        if (this.J) {
            xq0.q("Can't reload document after destroy");
            return;
        }
        cir cirVar = this.A;
        m4a a = ((m6a) cirVar.a).a();
        q2a q2aVar = a != null ? a.a : null;
        if (q2aVar != null) {
            l2a l2aVar = q2aVar.d;
            xv.F(this.j, l2aVar != null ? l2aVar.d : null, new z2a(q2aVar.c));
        }
        ywf.E(this, cirVar);
        cirVar.b(new z5a(this.g, z));
    }

    public final void o(q2a q2aVar) {
        if (this.J) {
            xq0.q("Can't show document after destroy");
            return;
        }
        m4a m4aVar = (m4a) this.d.a.invoke(q2aVar);
        t5a t5aVar = m4aVar.b;
        r2a r2aVar = r2a.d;
        d(new r5a(new fxn(m4aVar, t5aVar, r2aVar, r2aVar)));
    }
}
