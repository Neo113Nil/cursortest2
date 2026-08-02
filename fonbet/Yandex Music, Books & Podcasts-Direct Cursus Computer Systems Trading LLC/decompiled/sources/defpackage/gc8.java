package defpackage;

import android.animation.Animator;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class gc8 extends kvc implements w0a {
    public static final /* synthetic */ int D0 = 0;
    public ylq A;
    public final Div2ViewComponent A0;
    public ylq B;
    public final fdu B0;
    public long C;
    public final one C0;
    public n0a D;
    public kln E;
    public final cc8 F;
    public final Object G;
    public final GestureDetector H;
    public dw8 I;
    public dw8 J;
    public rv8 K;
    public eg8 L;
    public final vb8 l;
    public final Div2Component m;
    public final boolean n;
    public final tb8 o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;
    public final ckj s;
    public final WeakHashMap t;
    public qjo u;
    public qjo v;
    public long v0;
    public boolean w;
    public boolean w0;
    public bu9 x;
    public final lw9 x0;
    public boolean y;
    public final wvo y0;
    public ylq z;
    public e23 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc8(@NotNull vb8 vb8Var, AttributeSet attributeSet, int i) {
        super(vb8Var, attributeSet, i);
        vp4.a();
        this.l = vb8Var;
        this.m = getContext$div_release().b;
        this.n = getDiv2Component$div_release().a();
        this.o = getContext$div_release().b.e();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ckj();
        this.t = new WeakHashMap();
        qjo.a.getClass();
        this.v = pjo.b;
        int i2 = rv8.i;
        this.C = -1L;
        this.D = n0a.d0;
        this.F = new cc8(this, 2);
        int i3 = 1;
        this.G = btf.a(bwf.a, new cc8(this, i3));
        this.H = new GestureDetector(getContext$div_release(), new bf3(i3, this), new Handler(Looper.getMainLooper()));
        dw8 dw8Var = dw8.b;
        this.I = dw8Var;
        this.J = dw8Var;
        this.v0 = -1L;
        if (getDiv2Component$div_release().d().c.compareAndSet(true, false)) {
            su8.e.compareAndSet(true, false);
        }
        this.w0 = true;
        this.x0 = new lw9(this);
        this.y0 = new wvo(15);
        this.z0 = new e23(this, xzb.a);
        Div2ViewComponent.Builder y = getDiv2Component$div_release().y();
        y.a(this);
        this.A0 = y.build();
        this.B0 = getViewComponent$div_release().p();
        this.C0 = getViewComponent$div_release().b();
        AtomicBoolean atomicBoolean = su8.d;
        this.v0 = vp4.a();
        stn l = getDiv2Component$div_release().l();
        l.getClass();
        dzf dzfVar = getContext$div_release().c;
        if (dzfVar != null) {
            l.a(dzfVar, this);
            return;
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new u0a(i3, this, this, l));
            return;
        }
        dzf E = swf.E(this);
        if (E != null) {
            l.a(E, this);
        }
    }

    public static gx9 W(rv8 rv8Var, jc8 jc8Var, xzb xzbVar, boolean z) {
        mw9 mw9Var;
        szb szbVar;
        zx0 zx0Var = new zx0();
        if (rv8Var == null || (szbVar = rv8Var.e) == null || (mw9Var = (mw9) szbVar.a(xzbVar)) == null) {
            mw9Var = mw9.NONE;
        }
        zx0Var.addLast(mw9Var);
        int i = 16;
        return new gx9(jc8Var, xzbVar, new sv4(i, zx0Var, xzbVar), new az6(i, zx0Var), new en7(z, zx0Var, 1));
    }

    public static final kln f(gc8 gc8Var, j23 j23Var) {
        if (!gc8Var.getDiv2Component$div_release().u()) {
            kln.n0.getClass();
            return iln.b;
        }
        hp8 v = gc8Var.getDiv2Component$div_release().v();
        xzb oldExpressionResolver$div_release = gc8Var.getOldExpressionResolver$div_release();
        xzb expressionResolver = gc8Var.getExpressionResolver();
        nwh nwhVar = new nwh();
        nwhVar.b = gc8Var;
        nwhVar.d = v;
        nwhVar.e = oldExpressionResolver$div_release;
        nwhVar.f = expressionResolver;
        nwhVar.g = j23Var;
        nwhVar.h = new LinkedHashSet();
        nwhVar.c = new ArrayList();
        nwhVar.i = new ArrayList();
        nwhVar.j = new ArrayList();
        nwhVar.k = new LinkedHashMap();
        nwhVar.l = new ado();
        return nwhVar;
    }

    private h23 getBindingDispatcher() {
        return getViewComponent$div_release().n();
    }

    private qz9 getDivVideoActionHandler() {
        return getDiv2Component$div_release().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public ic8 getHistogramReporter() {
        return (ic8) this.G.getValue();
    }

    private y79 getLayoutProviderBinder() {
        return getViewComponent$div_release().f();
    }

    private doh getMediaLoadViewVisitor() {
        return getViewComponent$div_release().j();
    }

    private qu9 getTooltipController() {
        return getDiv2Component$div_release().B();
    }

    public static final void j(gc8 gc8Var) {
        Map b0;
        xzb xzbVar;
        w1a A = gc8Var.getDiv2Component$div_release().A();
        synchronized (gc8Var.t) {
            b0 = leu.b0(gc8Var.t);
        }
        for (Map.Entry entry : b0.entrySet()) {
            View view = (View) entry.getKey();
            jc8 jc8Var = (jc8) entry.getValue();
            e23 G = bg3.G(view);
            if (G != null && (xzbVar = G.b) != null) {
                w1a.i(A, gc8Var, xzbVar, null, jc8Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void set_divData(rv8 rv8Var) {
        bu9 divTimerEventDispatcher$div_release;
        this.K = rv8Var;
        rv8 divData = getDivData();
        if (divData != null) {
            cu9 g = getDiv2Component$div_release().g();
            dw8 dataTag = getDataTag();
            xzb expressionResolver = getExpressionResolver();
            g.getClass();
            qg8 qg8Var = g.a;
            List<au9> list = divData.d;
            bu9 bu9Var = null;
            if (list != null) {
                dfb a = g.b.a(divData, dataTag);
                Map map = g.c;
                String str = dataTag.a;
                Object obj = map.get(str);
                Object obj2 = obj;
                if (obj == null) {
                    bu9 bu9Var2 = new bu9(a);
                    for (au9 au9Var : list) {
                        cjs cjsVar = new cjs(au9Var, qg8Var, a, expressionResolver);
                        String str2 = au9Var.c;
                        LinkedHashMap linkedHashMap = bu9Var2.b;
                        if (!linkedHashMap.containsKey(str2)) {
                            linkedHashMap.put(str2, cjsVar);
                        }
                    }
                    map.put(str, bu9Var2);
                    obj2 = bu9Var2;
                }
                bu9 bu9Var3 = (bu9) obj2;
                LinkedHashSet linkedHashSet = bu9Var3.c;
                LinkedHashMap linkedHashMap2 = bu9Var3.b;
                List<au9> list2 = list;
                for (au9 au9Var2 : list2) {
                    String str3 = au9Var2.c;
                    if ((linkedHashSet.contains(str3) ? (cjs) linkedHashMap2.get(str3) : null) == null) {
                        cjs cjsVar2 = new cjs(au9Var2, qg8Var, a, expressionResolver);
                        String str4 = au9Var2.c;
                        if (!linkedHashMap2.containsKey(str4)) {
                            linkedHashMap2.put(str4, cjsVar2);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((au9) it.next()).c);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                for (cjs cjsVar3 : linkedHashMap3.values()) {
                    cjsVar3.e = null;
                    cjsVar3.j.h();
                    cjsVar3.i = true;
                }
                linkedHashSet.clear();
                linkedHashSet.addAll(arrayList);
                bu9Var = bu9Var3;
            }
            if (!Intrinsics.d(getDivTimerEventDispatcher$div_release(), bu9Var) && (divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release()) != null) {
                divTimerEventDispatcher$div_release.c(this);
            }
            setDivTimerEventDispatcher$div_release(bu9Var);
            if (bu9Var != null) {
                bu9Var.b(this);
            }
        }
        this.B0.a(this.K, getDataTag());
    }

    public final void A(qv8 qv8Var) {
        w1a.i(getDiv2Component$div_release().A(), this, getExpressionResolver(), null, qv8Var.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        List list;
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                try {
                    bindingDispatcher.b.c(bindingDispatcher.c.a());
                    bindingDispatcher.c.execute(new bc8(bindingDispatcher, this, 1));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        rv8 divData = getDivData();
        qv8 qv8Var = null;
        if (divData != null && (list = divData.c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((qv8) next).b == getStateId$div_release()) {
                    qv8Var = next;
                    break;
                }
            }
            qv8Var = qv8Var;
        }
        if (qv8Var != null) {
            A(qv8Var);
        }
        j(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(long j, boolean z) {
        Object obj;
        qv8 qv8Var;
        boolean z2;
        String id;
        View view;
        setStateId$div_release(j);
        b1a currentState = getCurrentState();
        Long valueOf = currentState != null ? Long.valueOf(currentState.a) : null;
        rv8 divData = getDivData();
        if (divData == null) {
            return;
        }
        List list = divData.c;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long j2 = ((qv8) obj).b;
            if (valueOf != null && j2 == valueOf.longValue()) {
                break;
            }
        }
        qv8 qv8Var2 = (qv8) obj;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                qv8Var = 0;
                break;
            } else {
                qv8Var = it2.next();
                if (((qv8) qv8Var).b == j) {
                    break;
                }
            }
        }
        qv8 qv8Var3 = qv8Var;
        if (qv8Var3 == null) {
            return;
        }
        jc8 jc8Var = qv8Var3.a;
        if (qv8Var2 != null) {
            A(qv8Var2);
        }
        V(qv8Var3);
        View childAt = getChildAt(0);
        if (childAt != null) {
            wyf.w(childAt);
        }
        if (childAt != null) {
            if (h1b.B(qv8Var2 != null ? qv8Var2.a : null, jc8Var, getExpressionResolver(), getExpressionResolver())) {
                z2 = true;
                if (z2) {
                    getDiv2Component$div_release().n().c(getDataTag(), j, z);
                    e23 bindingContext$div_release = getBindingContext$div_release();
                    long j3 = qv8Var3.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j3);
                    dp8 d = jc8Var.d();
                    if (d instanceof dm9) {
                        dm9 dm9Var = (dm9) d;
                        id = dm9Var.p;
                        if (id == null && (id = dm9Var.x) == null) {
                            id = "";
                        }
                    } else {
                        id = d.getId();
                    }
                    sb.append(id != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(id) : "");
                    pm9 pm9Var = new pm9(c5b.a, 8, t75.c(sb.toString()), j3);
                    tb8 tb8Var = this.o;
                    tb8Var.getClass();
                    xzb xzbVar = bindingContext$div_release.b;
                    wh9 wh9Var = tb8Var.c;
                    gc8 gc8Var = bindingContext$div_release.a;
                    wh9Var.getClass();
                    d0c a = gc8Var.getRuntimeStore$div_release().a();
                    rdk rdkVar = a.c;
                    if (rdkVar != null) {
                        rdkVar.O(gc8Var);
                    }
                    wh9Var.b(jc8Var, gc8Var, pm9Var, a);
                    View W = tb8Var.a.W(jc8Var, xzbVar);
                    W.setLayoutParams(new u79(-1, -2));
                    tb8Var.b.b(bindingContext$div_release, W, jc8Var, pm9Var);
                    getDiv2Component$div_release().v().a(this);
                    view = W;
                } else {
                    View childAt2 = getView().getChildAt(0);
                    getDiv2Component$div_release().n().c(getDataTag(), j, z);
                    getDiv2Component$div_release().v().a(this);
                    view = childAt2;
                }
                jc8 jc8Var2 = qv8Var2 == null ? qv8Var2.a : null;
                int ordinal = ((mw9) divData.e.a(getExpressionResolver())).ordinal();
                q(divData, divData, jc8Var2, qv8Var3, view, ordinal != 1 || ordinal == 3, z2);
            }
        }
        z2 = false;
        if (z2) {
        }
        if (qv8Var2 == null) {
        }
        int ordinal2 = ((mw9) divData.e.a(getExpressionResolver())).ordinal();
        q(divData, divData, jc8Var2, qv8Var3, view, ordinal2 != 1 || ordinal2 == 3, z2);
    }

    public final qv8 D(rv8 rv8Var) {
        Object obj;
        Iterator it = rv8Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((qv8) obj).b == getStateId$div_release()) {
                break;
            }
        }
        qv8 qv8Var = (qv8) obj;
        return qv8Var == null ? (qv8) CollectionsKt.firstOrNull(rv8Var.c) : qv8Var;
    }

    public final void E(bd8 bd8Var, String str, xzb xzbVar) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            F(bd8Var, str, xzbVar);
            a.close();
        } finally {
        }
    }

    public final void F(bd8 bd8Var, String str, xzb xzbVar) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            getDiv2Component$div_release().x().a(this, xzbVar, bd8Var, str, getActionHandler());
            a.close();
        } finally {
        }
    }

    public final void G(String str) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            getTooltipController().c(str);
            a.close();
        } finally {
        }
    }

    public final void H() {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                try {
                    bindingDispatcher.b.c(bindingDispatcher.c.a());
                    bindingDispatcher.c.execute(new q9(bindingDispatcher, this));
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    public final void I(Throwable th) {
        getViewComponent$div_release().i().a(getDivData(), getDataTag()).d(th);
    }

    public final void J(rv8 rv8Var, j23 j23Var) {
        rv8 rv8Var2;
        j23 j23Var2;
        try {
            if (getChildCount() == 0) {
                j23Var.getClass();
                Z(rv8Var, getDataTag(), j23Var);
                return;
            }
            qv8 D = D(rv8Var);
            if (D == null) {
                j23Var.getClass();
                return;
            }
            d51 d51Var = d51.l;
            synchronized (d51Var) {
            }
            if (qht.a.a()) {
                ic8 histogramReporter = getHistogramReporter();
                histogramReporter.getClass();
                histogramReporter.h = Long.valueOf(vp4.a());
                dfb b = getViewComponent$div_release().i().b(getDivData(), getDataTag());
                if (b != null) {
                    b.c();
                }
                set_divData(rv8Var);
                getDiv2Component$div_release().n().c(getDataTag(), D.b, true);
                hp8 v = getDiv2Component$div_release().v();
                e23 bindingContext$div_release = getBindingContext$div_release();
                View childAt = getChildAt(0);
                jc8 jc8Var = D.a;
                long j = D.b;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                dp8 d = jc8Var.d();
                String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
                sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
                v.b(bindingContext$div_release, childAt, jc8Var, new pm9(c5b.a, 8, t75.c(sb.toString()), j));
                requestLayout();
                X(rv8Var);
                getHistogramReporter().d();
                j23Var.getClass();
                return;
            }
            g23 d2 = getViewComponent$div_release().d();
            f23 a = d2.a();
            try {
                rv8Var2 = rv8Var;
                j23Var2 = j23Var;
                try {
                    d51Var.p(new ec8(d2, a, this, rv8Var2, D, j23Var2, 0));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        g23.b(a);
                        throw th2;
                    } catch (Exception unused) {
                        j23Var2.getClass();
                        Z(rv8Var2, getDataTag(), j23Var2);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                rv8Var2 = rv8Var;
                j23Var2 = j23Var;
            }
        } catch (Exception unused2) {
            rv8Var2 = rv8Var;
            j23Var2 = j23Var;
        }
    }

    public final void K(rlk rlkVar) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                try {
                    bindingDispatcher.b.c(bindingDispatcher.c.a());
                    bindingDispatcher.c.execute(new zb8(bindingDispatcher, this, rlkVar, 1));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.s.g(rlkVar);
    }

    public final void L() {
        long j;
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            b1a currentState = getCurrentState();
            if (currentState != null) {
                currentState.b.clear();
            }
            w8s r = getDiv2Component$div_release().r();
            String str = getDivTag().a;
            synchronized (r.a) {
            }
            rv8 divData = getDivData();
            if (divData != null) {
                if (divData.c.isEmpty()) {
                    int i = rv8.i;
                    j = -1;
                } else {
                    j = ((qv8) divData.c.get(0)).b;
                }
                b1a currentState2 = getCurrentState();
                if (currentState2 != null) {
                    j = currentState2.a;
                }
                S(j, true);
            }
            a.close();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185 A[Catch: all -> 0x0040, LOOP:1: B:55:0x017f->B:57:0x0185, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x002b, B:15:0x0039, B:18:0x0044, B:20:0x004a, B:23:0x0054, B:25:0x005a, B:26:0x0064, B:27:0x0072, B:29:0x0078, B:31:0x0082, B:33:0x0089, B:34:0x008b, B:37:0x009a, B:39:0x00ab, B:40:0x00ae, B:42:0x00e6, B:50:0x0103, B:51:0x0127, B:54:0x0172, B:55:0x017f, B:57:0x0185, B:61:0x013b, B:64:0x0170, B:65:0x0157, B:67:0x0164, B:70:0x016b, B:71:0x0107, B:73:0x0111, B:75:0x0119, B:78:0x0120, B:80:0x0124), top: B:12:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x002b, B:15:0x0039, B:18:0x0044, B:20:0x004a, B:23:0x0054, B:25:0x005a, B:26:0x0064, B:27:0x0072, B:29:0x0078, B:31:0x0082, B:33:0x0089, B:34:0x008b, B:37:0x009a, B:39:0x00ab, B:40:0x00ae, B:42:0x00e6, B:50:0x0103, B:51:0x0127, B:54:0x0172, B:55:0x017f, B:57:0x0185, B:61:0x013b, B:64:0x0170, B:65:0x0157, B:67:0x0164, B:70:0x016b, B:71:0x0107, B:73:0x0111, B:75:0x0119, B:78:0x0120, B:80:0x0124), top: B:12:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(rv8 rv8Var, dw8 dw8Var) {
        akj akjVar;
        rv8 divData = getDivData();
        dw8 dw8Var2 = new dw8(dw8Var.a);
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            this.y0.getClass();
            j23.Q.getClass();
            kjn kjnVar = i23.b;
            if (rv8Var == null) {
                kjnVar.getClass();
                a.close();
                return;
            }
            if (getDivData() == rv8Var) {
                kjnVar.getClass();
                H();
                a.close();
                return;
            }
            if (getInMiddleOfBind$div_release()) {
                I(new RuntimeException("New binding started when previous not ended!"));
            }
            setInMiddleOfBind$div_release(true);
            ckj ckjVar = this.s;
            ckjVar.getClass();
            akj akjVar2 = new akj(ckjVar);
            while (akjVar2.hasNext()) {
                ((rlk) akjVar2.next()).b();
            }
            ylq bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
            if (bindOnAttachRunnable$div_release != null) {
                bindOnAttachRunnable$div_release.a = null;
            }
            getHistogramReporter().d = true;
            rv8 divData2 = getDivData();
            rv8 rv8Var2 = divData2 == null ? divData : divData2;
            a0(rv8Var, dw8Var2);
            c89 c89Var = (c89) getLayoutProviderBinder().d.get(rv8Var2);
            if (c89Var != null) {
                c89Var.l();
            }
            setDataTag$div_release(dw8Var2);
            r0a w = getDiv2Component$div_release().w();
            e23 bindingContext$div_release = getBindingContext$div_release();
            y19 y19Var = mf9.e;
            w.getClass();
            hf9 hf9Var = new hf9(y19Var);
            new q0a(w, hf9Var, y19Var).X(rv8Var, bindingContext$div_release);
            hf9Var.j0();
            boolean P = h1b.P(rv8Var2, rv8Var, getStateId$div_release(), getOldExpressionResolver$div_release(), getExpressionResolver());
            if (rv8Var2 != null) {
                int ordinal = ((mw9) rv8Var.e.a(getExpressionResolver())).ordinal();
                if (!(ordinal == 1 || ordinal == 3)) {
                    if (P) {
                        J(rv8Var, kjnVar);
                    } else if (!getDiv2Component$div_release().u() || !(getChildAt(0) instanceof ViewGroup) || !z(rv8Var, rv8Var2, kjnVar)) {
                        Z(rv8Var, dw8Var2, kjnVar);
                    }
                    getDiv2Component$div_release().v().a(this);
                    if (this.v0 < 0) {
                        su8 d = getDiv2Component$div_release().d();
                        long j = this.v0;
                        vyd p = getDiv2Component$div_release().p();
                        d.getClass();
                        if (j >= 0) {
                            vyd.a(p, null, null, 20);
                            if (d.b.compareAndSet(false, true) && d.a >= 0) {
                                vyd.a(p, null, null, 20);
                                d.a = -1L;
                            }
                        }
                        this.v0 = -1L;
                    }
                    setInMiddleOfBind$div_release(false);
                    ckj ckjVar2 = this.s;
                    ckjVar2.getClass();
                    akjVar = new akj(ckjVar2);
                    while (akjVar.hasNext()) {
                        ((rlk) akjVar.next()).a();
                    }
                    a.close();
                }
            }
            Z(rv8Var, dw8Var2, kjnVar);
            getDiv2Component$div_release().v().a(this);
            if (this.v0 < 0) {
            }
            setInMiddleOfBind$div_release(false);
            ckj ckjVar22 = this.s;
            ckjVar22.getClass();
            akjVar = new akj(ckjVar22);
            while (akjVar.hasNext()) {
            }
            a.close();
        } finally {
        }
    }

    public final wxt N(String str, String str2) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return null;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            wxt K = hyf.K(this, str, str2, getExpressionResolver());
            a.close();
            return K;
        } finally {
        }
    }

    public final void O(String str) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            getTooltipController().d(str, getBindingContext$div_release(), false);
            a.close();
        } finally {
        }
    }

    public final void P(String str, boolean z) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            getTooltipController().d(str, getBindingContext$div_release(), z);
            a.close();
        } finally {
        }
    }

    public final qv8 Q(rv8 rv8Var) {
        long j;
        Object obj;
        b1a currentState = getCurrentState();
        if (currentState != null) {
            j = currentState.a;
        } else if (rv8Var.c.isEmpty()) {
            int i = rv8.i;
            j = -1;
        } else {
            j = ((qv8) rv8Var.c.get(0)).b;
        }
        Iterator it = rv8Var.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((qv8) obj).b == j) {
                break;
            }
        }
        return (qv8) obj;
    }

    public final void R(y9w y9wVar) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            this.q.add(y9wVar);
            a.close();
        } finally {
        }
    }

    public final void S(long j, boolean z) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            int i = rv8.i;
            if (j != -1) {
                ylq bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
                if (bindOnAttachRunnable$div_release != null) {
                    bindOnAttachRunnable$div_release.a = null;
                }
                C(j, z);
            }
            a.close();
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(pm9 pm9Var, boolean z) {
        List list;
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            rv8 divData = getDivData();
            qv8 qv8Var = null;
            if (divData != null && (list = divData.c) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((qv8) next).b == pm9Var.a) {
                        qv8Var = next;
                        break;
                    }
                }
                qv8Var = qv8Var;
            }
            getViewComponent$div_release().r().b(qv8Var, pm9Var, z);
            a.close();
        } finally {
        }
    }

    public final void U() {
        Map b0;
        xzb xzbVar;
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                try {
                    bindingDispatcher.b.c(bindingDispatcher.c.a());
                    bindingDispatcher.c.execute(new bc8(bindingDispatcher, this, 2));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        w1a A = getDiv2Component$div_release().A();
        synchronized (this.t) {
            b0 = leu.b0(this.t);
        }
        for (Map.Entry entry : b0.entrySet()) {
            View view = (View) entry.getKey();
            jc8 jc8Var = (jc8) entry.getValue();
            e23 G = bg3.G(view);
            if (G != null && (xzbVar = G.b) != null) {
                if (view.isAttachedToWindow()) {
                    w1a.i(A, this, xzbVar, view, jc8Var);
                } else {
                    w1a.i(A, this, xzbVar, null, jc8Var);
                }
            }
        }
    }

    public final void V(qv8 qv8Var) {
        w1a.i(getDiv2Component$div_release().A(), this, getExpressionResolver(), getView(), qv8Var.a);
    }

    public final void X(rv8 rv8Var) {
        qv8 Q;
        if ((this.n && !getView().isAttachedToWindow()) || rv8Var == null || (Q = Q(rv8Var)) == null) {
            return;
        }
        wh9 c = getViewComponent$div_release().c();
        jc8 jc8Var = Q.a;
        long j = Q.b;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        dp8 d = jc8Var.d();
        String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
        sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
        pm9 pm9Var = new pm9(c5b.a, 8, t75.c(sb.toString()), j);
        c.getClass();
        d0c a = getRuntimeStore$div_release().a();
        rdk rdkVar = a.c;
        if (rdkVar != null) {
            rdkVar.O(this);
        }
        c.b(jc8Var, this, pm9Var, a);
    }

    public final jc8 Y(View view) {
        jc8 jc8Var;
        synchronized (this.t) {
            jc8Var = (jc8) this.t.remove(view);
        }
        return jc8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x015b, code lost:
    
        if (r2 != 3) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(rv8 rv8Var, dw8 dw8Var, j23 j23Var) {
        long j;
        boolean z;
        d51 d51Var;
        f23 f23Var;
        rv8 rv8Var2;
        gc8 gc8Var = this;
        rv8 divData = gc8Var.getDivData();
        if (divData == null) {
            ic8 histogramReporter = gc8Var.getHistogramReporter();
            histogramReporter.getClass();
            histogramReporter.e = Long.valueOf(vp4.a());
        } else {
            ic8 histogramReporter2 = gc8Var.getHistogramReporter();
            histogramReporter2.getClass();
            histogramReporter2.h = Long.valueOf(vp4.a());
        }
        boolean z2 = false;
        Object[] objArr = 0;
        gc8Var.x(false);
        gc8Var.setDataTag$div_release(dw8Var);
        set_divData(rv8Var);
        qv8 Q = divData != null ? gc8Var.Q(divData) : null;
        qv8 Q2 = Q(rv8Var);
        b1a currentState = gc8Var.getCurrentState();
        if (currentState != null) {
            j = currentState.a;
        } else if (rv8Var.c.isEmpty()) {
            int i = rv8.i;
            j = -1;
        } else {
            j = ((qv8) rv8Var.c.get(0)).b;
        }
        gc8Var.setStateId$div_release(j);
        int i2 = 3;
        if (Q2 == null) {
            j23Var.getClass();
            rv8Var2 = divData;
        } else {
            gc8Var.getDiv2Component$div_release().n().c(gc8Var.getDataTag(), gc8Var.getStateId$div_release(), true);
            long j2 = Q2.b;
            jc8 jc8Var = Q2.a;
            StringBuilder sb = new StringBuilder();
            sb.append(j2);
            dp8 d = jc8Var.d();
            String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
            sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
            pm9 pm9Var = new pm9(c5b.a, 8, t75.c(sb.toString()), j2);
            tb8 tb8Var = gc8Var.o;
            jc8 jc8Var2 = Q2.a;
            e23 bindingContext$div_release = gc8Var.getBindingContext$div_release();
            tb8Var.getClass();
            xzb xzbVar = bindingContext$div_release.b;
            wh9 wh9Var = tb8Var.c;
            gc8 gc8Var2 = bindingContext$div_release.a;
            wh9Var.getClass();
            d0c a = gc8Var2.getRuntimeStore$div_release().a();
            rdk rdkVar = a.c;
            if (rdkVar != null) {
                rdkVar.O(gc8Var2);
            }
            wh9Var.b(jc8Var2, gc8Var2, pm9Var, a);
            View W = tb8Var.a.W(jc8Var2, xzbVar);
            W.setLayoutParams(new u79(-1, -2));
            if (gc8Var.n) {
                zg zgVar = new zg(gc8Var, W, Q2, pm9Var, 5);
                W = W;
                gc8Var.setBindOnAttachRunnable$div_release(new ylq(gc8Var, zgVar));
            } else {
                gc8Var.getDiv2Component$div_release().v().b(gc8Var.getBindingContext$div_release(), W, jc8Var2, pm9Var);
                if (gc8Var.isAttachedToWindow()) {
                    gc8Var.getDiv2Component$div_release().v().a(gc8Var);
                } else {
                    gc8Var.addOnAttachStateChangeListener(new ac8(gc8Var, gc8Var, objArr == true ? 1 : 0));
                }
            }
            if (Q != null) {
                gc8Var.A(Q);
            }
            gc8Var.V(Q2);
            if (divData != null) {
                int ordinal = ((mw9) divData.e.a(gc8Var.getOldExpressionResolver$div_release())).ordinal();
                if (ordinal != 1) {
                }
                z = true;
                d51Var = d51.l;
                synchronized (d51Var) {
                }
                if (qht.a.a()) {
                    rv8Var2 = divData;
                    gc8Var.q(rv8Var2, rv8Var, Q != null ? Q.a : null, Q2, W, z, false);
                    gc8Var = this;
                } else {
                    boolean z3 = z;
                    g23 d2 = getViewComponent$div_release().d();
                    f23 a2 = d2.a();
                    try {
                        try {
                            fc8 fc8Var = new fc8(d2, a2, this, divData, rv8Var, Q, Q2, W, z3);
                            gc8Var = this;
                            f23Var = a2;
                            rv8Var2 = divData;
                            try {
                                d51Var.p(fc8Var);
                            } catch (Throwable th) {
                                th = th;
                                g23.b(f23Var);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            f23Var = a2;
                            g23.b(f23Var);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (rv8Var2 != null) {
                    j23Var.getClass();
                } else {
                    j23Var.getClass();
                }
                z2 = true;
            }
            int ordinal2 = ((mw9) rv8Var.e.a(gc8Var.getExpressionResolver())).ordinal();
            if (ordinal2 != 1 && ordinal2 != 3) {
                z = false;
                d51Var = d51.l;
                synchronized (d51Var) {
                }
            }
            z = true;
            d51Var = d51.l;
            synchronized (d51Var) {
            }
        }
        X(rv8Var);
        if (rv8Var2 != null) {
            gc8Var.getHistogramReporter().d();
            return z2;
        }
        if (!gc8Var.n) {
            gc8Var.getHistogramReporter().b();
            return z2;
        }
        ic8 histogramReporter3 = gc8Var.getHistogramReporter();
        histogramReporter3.getClass();
        histogramReporter3.f = Long.valueOf(vp4.a());
        gc8Var.A = new ylq(gc8Var, new cc8(gc8Var, i2));
        gc8Var.B = new ylq(gc8Var, new cc8(gc8Var, 4));
        return z2;
    }

    public final void a0(rv8 rv8Var, dw8 dw8Var) {
        qjo qjoVar;
        boolean z;
        this.u = getRuntimeStore$div_release();
        sjo b = getDiv2Component$div_release().b();
        WeakHashMap weakHashMap = b.d;
        Object obj = weakHashMap.get(this);
        if (obj == null) {
            obj = new LinkedHashSet();
            weakHashMap.put(this, obj);
        }
        ((Set) obj).add(dw8Var.a);
        dfb a = b.b.a(rv8Var, dw8Var);
        rjo rjoVar = (rjo) b.c.get(dw8Var.a);
        if (rjoVar != null) {
            rjoVar.j = new WeakReference(this);
            d0c d0cVar = rjoVar.l;
            zzb zzbVar = d0cVar.a;
            oxt oxtVar = zzbVar.d;
            eym eymVar = d0cVar.b;
            if (eymVar == null) {
                eymVar = dym.a;
            }
            eym eymVar2 = eymVar;
            List<zy9> list = rv8Var.g;
            if (list != null) {
                for (zy9 zy9Var : list) {
                    kxt x = oxtVar.x(bg3.H(zy9Var));
                    if (x == null) {
                        try {
                            kxt k0 = bg3.k0(zy9Var, zzbVar, eymVar2, a);
                            if (k0 != null) {
                                oxtVar.l(k0);
                            }
                        } catch (sxt e) {
                            a.d(e);
                        }
                    } else {
                        if (zy9Var instanceof ry9) {
                            z = x instanceof axt;
                        } else if (zy9Var instanceof uy9) {
                            z = x instanceof ext;
                        } else if (zy9Var instanceof vy9) {
                            z = x instanceof dxt;
                        } else if (zy9Var instanceof xy9) {
                            z = x instanceof hxt;
                        } else if (zy9Var instanceof sy9) {
                            z = x instanceof bxt;
                        } else if (zy9Var instanceof yy9) {
                            z = x instanceof ixt;
                        } else if (zy9Var instanceof ty9) {
                            z = x instanceof cxt;
                        } else if (zy9Var instanceof qy9) {
                            z = x instanceof zwt;
                        } else {
                            if (!(zy9Var instanceof wy9)) {
                                b6e.s();
                                return;
                            }
                            z = (x instanceof gxt) && ((wy9) zy9Var).b.e == ((gxt) x).c;
                        }
                        if (!z) {
                            a.d(new IllegalArgumentException(hlr.d("\n                           Variable inconsistency detected!\n                           at DivData: " + bg3.H(zy9Var) + " (" + zy9Var + ")\n                           at VariableController: " + x + "\n                        ")));
                        } else if ((zy9Var instanceof wy9) && (x instanceof gxt)) {
                            wy9 wy9Var = (wy9) zy9Var;
                            szb U = bg3.U(wy9Var.b, zzbVar, a);
                            if (U == null) {
                                continue;
                            } else {
                                gxt gxtVar = (gxt) x;
                                jac jacVar = gxtVar.d;
                                cym cymVar = wy9Var.b;
                                jac jacVar2 = new jac((String) jacVar.a, (nx8) jacVar.b, U, cymVar.d, cymVar.c, (eym) jacVar.f);
                                synchronized (gxtVar) {
                                    jac jacVar3 = gxtVar.d;
                                    ja8 ja8Var = (ja8) jacVar3.g;
                                    if (ja8Var != null) {
                                        ja8Var.close();
                                    }
                                    jacVar3.g = null;
                                    gxtVar.d = jacVar2;
                                    if (!(gxtVar.a.c == 0)) {
                                        jac jacVar4 = gxtVar.d;
                                        jacVar4.g = ((eym) jacVar4.f).a((szb) jacVar4.c, new fxt(gxtVar, 1));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            rdk rdkVar = rjoVar.l.c;
            if (rdkVar != null) {
                List list2 = rv8Var.f;
                if (list2 == null) {
                    list2 = c5b.a;
                }
                rdkVar.x(list2);
            }
        } else {
            rjoVar = new rjo(rv8Var, dw8Var, b.a, a);
            b.c.put(dw8Var.a, rjoVar);
            rjoVar.j = new WeakReference(this);
        }
        setRuntimeStore$div_release(rjoVar);
        getRuntimeStore$div_release().b();
        if (!Intrinsics.d(this.u, getRuntimeStore$div_release()) && (qjoVar = this.u) != null) {
            qjoVar.e(this);
        }
        setBindingContext$div_release(new e23(this, getExpressionResolver()));
        nm9 n = getDiv2Component$div_release().n();
        e23 bindingContext$div_release = getBindingContext$div_release();
        LinkedHashMap linkedHashMap = n.d;
        String str = dw8Var.a;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            obj2 = new LinkedHashMap();
            linkedHashMap.put(str, obj2);
        }
        new ser((Map) obj2).X(rv8Var, bindingContext$div_release);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.w0) {
            ic8 histogramReporter = getHistogramReporter();
            histogramReporter.getClass();
            histogramReporter.k = Long.valueOf(vp4.a());
        }
        super.dispatchDraw(canvas);
        if (this.w0) {
            getHistogramReporter().c();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.w0 = false;
        ic8 histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.k = Long.valueOf(vp4.a());
        super.draw(canvas);
        getHistogramReporter().c();
        this.w0 = true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            bg3.z(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public eg8 getActionHandler() {
        return this.L;
    }

    public ylq getBindOnAttachRunnable$div_release() {
        return this.z;
    }

    @NotNull
    public e23 getBindingContext$div_release() {
        return this.z0;
    }

    public boolean getComplexRebindInProgress$div_release() {
        kln klnVar;
        return getDiv2Component$div_release().u() && (klnVar = this.E) != null && klnVar.m();
    }

    public String getComponentName() {
        return getHistogramReporter().c;
    }

    @NotNull
    public n0a getConfig() {
        return this.D;
    }

    @NotNull
    public vb8 getContext$div_release() {
        return this.l;
    }

    public ado getCurrentRebindReusableList$div_release() {
        kln klnVar;
        if (!getDiv2Component$div_release().u() || (klnVar = this.E) == null || !klnVar.m() || klnVar == null) {
            return null;
        }
        return klnVar.i();
    }

    @NotNull
    public pm9 getCurrentRootPath$div_release() {
        List list;
        Object obj;
        rv8 divData = getDivData();
        if (divData != null && (list = divData.c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((qv8) obj).b == getStateId$div_release()) {
                    break;
                }
            }
            qv8 qv8Var = (qv8) obj;
            if (qv8Var != null) {
                long j = qv8Var.b;
                jc8 jc8Var = qv8Var.a;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                dp8 d = jc8Var.d();
                String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
                sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
                return new pm9(c5b.a, 8, t75.c(sb.toString()), j);
            }
        }
        return new pm9(new ArrayList(), 12, (List) null, getStateId$div_release());
    }

    public b1a getCurrentState() {
        rv8 divData = getDivData();
        if (divData == null) {
            return null;
        }
        b1a a = getDiv2Component$div_release().n().a(getDataTag());
        List<qv8> list = divData.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        for (qv8 qv8Var : list) {
            if (a != null && qv8Var.b == a.a) {
                return a;
            }
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId$div_release();
    }

    @NotNull
    public bv8 getCustomContainerChildFactory$div_release() {
        return getDiv2Component$div_release().k();
    }

    @NotNull
    public dw8 getDataTag() {
        return this.I;
    }

    @NotNull
    public Div2Component getDiv2Component$div_release() {
        return this.m;
    }

    public rv8 getDivData() {
        return this.K;
    }

    @NotNull
    public dw8 getDivTag() {
        return getDataTag();
    }

    public bu9 getDivTimerEventDispatcher$div_release() {
        return this.x;
    }

    @NotNull
    public lw9 getDivTransitionHandler$div_release() {
        return this.x0;
    }

    @NotNull
    public xzb getExpressionResolver() {
        d0c d0cVar;
        zzb zzbVar;
        qjo runtimeStore$div_release = getRuntimeStore$div_release();
        rjo rjoVar = runtimeStore$div_release instanceof rjo ? (rjo) runtimeStore$div_release : null;
        return (rjoVar == null || (d0cVar = rjoVar.l) == null || (zzbVar = d0cVar.a) == null) ? xzb.a : zzbVar;
    }

    public boolean getForceCanvasClipping() {
        return this.y;
    }

    public boolean getInMiddleOfBind$div_release() {
        return this.w;
    }

    @NotNull
    public one getInputFocusTracker$div_release() {
        return this.C0;
    }

    @NotNull
    public String getLogId() {
        String str;
        rv8 divData = getDivData();
        return (divData == null || (str = divData.b) == null) ? "" : str;
    }

    @NotNull
    public dph getMediaReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().q();
    }

    @NotNull
    public xzb getOldExpressionResolver$div_release() {
        d0c d0cVar;
        zzb zzbVar;
        qjo qjoVar = this.u;
        rjo rjoVar = qjoVar instanceof rjo ? (rjo) qjoVar : null;
        return (rjoVar == null || (d0cVar = rjoVar.l) == null || (zzbVar = d0cVar.a) == null) ? xzb.a : zzbVar;
    }

    @NotNull
    public dw8 getPrevDataTag() {
        return this.J;
    }

    @NotNull
    public ttn getReleaseViewVisitor$div_release() {
        return getViewComponent$div_release().o();
    }

    @NotNull
    public qjo getRuntimeStore$div_release() {
        return this.v;
    }

    public long getStateId$div_release() {
        return this.C;
    }

    @NotNull
    public Div2ViewComponent getViewComponent$div_release() {
        return this.A0;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent$div_release().a().f;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ylq ylqVar = this.A;
        if (ylqVar != null) {
            ?? r2 = ylqVar.a;
            if (r2 != 0) {
                r2.invoke();
            }
            ylqVar.a = null;
        }
        X(getDivData());
        ylq bindOnAttachRunnable$div_release = getBindOnAttachRunnable$div_release();
        if (bindOnAttachRunnable$div_release != null) {
            ?? r22 = bindOnAttachRunnable$div_release.a;
            if (r22 != 0) {
                r22.invoke();
            }
            bindOnAttachRunnable$div_release.a = null;
        }
        ylq ylqVar2 = this.B;
        if (ylqVar2 != null) {
            ?? r23 = ylqVar2.a;
            if (r23 != 0) {
                r23.invoke();
            }
            ylqVar2.a = null;
        }
        bu9 divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.b(this);
        }
        y79 layoutProviderBinder = getLayoutProviderBinder();
        LinkedHashMap linkedHashMap = layoutProviderBinder.e;
        gc8 gc8Var = layoutProviderBinder.b;
        Collection collection = (Collection) linkedHashMap.get(gc8Var.getDivData());
        if (collection == null || collection.isEmpty() || layoutProviderBinder.f != null) {
            return;
        }
        gzj gzjVar = new gzj(new oqj(new rs6(23, layoutProviderBinder)), jqa.g);
        layoutProviderBinder.f = gzjVar;
        gc8Var.getViewTreeObserver().addOnPreDrawListener(gzjVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
        bu9 divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
        if (divTimerEventDispatcher$div_release != null) {
            divTimerEventDispatcher$div_release.c(this);
        }
        en8 m = getViewComponent$div_release().m();
        m.getClass();
        LinkedHashMap linkedHashMap = m.b;
        Iterator it = new ArrayList(linkedHashMap.values()).iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        linkedHashMap.clear();
        getRuntimeStore$div_release().c(this);
        y79 layoutProviderBinder = getLayoutProviderBinder();
        layoutProviderBinder.b.getViewTreeObserver().removeOnPreDrawListener(layoutProviderBinder.f);
        layoutProviderBinder.f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kvc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List list;
        ic8 histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.j = Long.valueOf(vp4.a());
        super.onLayout(z, i, i2, i3, i4);
        rv8 divData = getDivData();
        qv8 qv8Var = null;
        if (divData != null && (list = divData.c) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((qv8) next).b == getStateId$div_release()) {
                    qv8Var = next;
                    break;
                }
            }
            qv8Var = qv8Var;
        }
        if (qv8Var != null) {
            V(qv8Var);
        }
        U();
        ic8 histogramReporter2 = getHistogramReporter();
        Long l = histogramReporter2.j;
        if (l != null) {
            histogramReporter2.a().d += vp4.a() - l.longValue();
        }
    }

    @Override // defpackage.kvc, android.view.View
    public final void onMeasure(int i, int i2) {
        ic8 histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.i = Long.valueOf(vp4.a());
        super.onMeasure(i, i2);
        ic8 histogramReporter2 = getHistogramReporter();
        Long l = histogramReporter2.i;
        if (l != null) {
            histogramReporter2.a().c += vp4.a() - l.longValue();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getInputFocusTracker$div_release().a != null) {
            this.H.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 0) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(ffg ffgVar) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                try {
                    bindingDispatcher.b.c(bindingDispatcher.c.a());
                    bindingDispatcher.c.execute(new nud(bindingDispatcher, this, ffgVar, false, 5));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.p.add(ffgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(rv8 rv8Var, rv8 rv8Var2, jc8 jc8Var, qv8 qv8Var, View view, boolean z, boolean z2) {
        n8t n8tVar;
        jc8 jc8Var2;
        int i = 0;
        Continuation continuation = null;
        if (z && jc8Var != (jc8Var2 = qv8Var.a)) {
            n8tVar = getViewComponent$div_release().k().b(jc8Var != null ? W(rv8Var, jc8Var, getOldExpressionResolver$div_release(), false) : null, jc8Var2 != null ? W(rv8Var2, jc8Var2, getExpressionResolver(), true) : null);
            if (n8tVar.H.size() != 0) {
                n8tVar.b(new dc8(n8tVar, getDiv2Component$div_release().o(), this, rv8Var2));
                if (n8tVar == null) {
                    ato atoVar = (ato) getTag(R.id.transition_current_scene);
                    if (atoVar != null) {
                        atoVar.c = new sr7(5, this);
                    }
                } else {
                    synchronized (d51.l) {
                    }
                    if (qht.a.a()) {
                        p1g.J(this, this);
                        removeAllViews();
                    } else {
                        dq7 dq7Var = ca8.a;
                        x97.D(j5h.a, new seg(continuation, this, this, 23));
                    }
                }
                if (z2) {
                    hp8 v = getDiv2Component$div_release().v();
                    e23 bindingContext$div_release = getBindingContext$div_release();
                    jc8 jc8Var3 = qv8Var.a;
                    long j = qv8Var.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    dp8 d = jc8Var3.d();
                    String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
                    sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
                    v.b(bindingContext$div_release, view, jc8Var3, new pm9(c5b.a, 8, t75.c(sb.toString()), j));
                }
                if (n8tVar != null) {
                    addView(view);
                    getViewComponent$div_release().a().b(this);
                    return;
                }
                l8t.b(this);
                ato atoVar2 = new ato();
                atoVar2.a = this;
                atoVar2.b = view;
                View.OnAttachStateChangeListener jbVar = new jb(10, this);
                addOnAttachStateChangeListener(jbVar);
                n8tVar.b(new eto(i, n8tVar, this, jbVar));
                ArrayList arrayList = l8t.c;
                if (arrayList.contains(this)) {
                    return;
                }
                arrayList.add(this);
                b8t clone = n8tVar.clone();
                l8t.e(this, clone);
                if (view != null) {
                    removeAllViews();
                    addView(view);
                }
                setTag(R.id.transition_current_scene, atoVar2);
                l8t.d(this, clone);
                return;
            }
        }
        n8tVar = null;
        if (n8tVar == null) {
        }
        if (z2) {
        }
        if (n8tVar != null) {
        }
    }

    public final void r(rlk rlkVar) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                try {
                    bindingDispatcher.b.c(bindingDispatcher.c.a());
                    bindingDispatcher.c.execute(new zb8(bindingDispatcher, this, rlkVar, 0));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        this.s.a(rlkVar);
    }

    public final void s(String str, String str2) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            bu9 divTimerEventDispatcher$div_release = getDivTimerEventDispatcher$div_release();
            if (divTimerEventDispatcher$div_release != null) {
                divTimerEventDispatcher$div_release.a(str, str2);
            }
            a.close();
        } finally {
        }
    }

    public void setActionHandler(eg8 eg8Var) {
        this.L = eg8Var;
    }

    public void setBindOnAttachRunnable$div_release(ylq ylqVar) {
        this.z = ylqVar;
    }

    public void setBindingContext$div_release(@NotNull e23 e23Var) {
        this.z0 = e23Var;
    }

    public void setComponentName(String str) {
        getHistogramReporter().c = str;
    }

    public void setConfig(@NotNull n0a n0aVar) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            this.D = n0aVar;
            a.close();
        } finally {
        }
    }

    public void setDataTag$div_release(@NotNull dw8 dw8Var) {
        setPrevDataTag$div_release(this.I);
        this.I = dw8Var;
        this.B0.a(getDivData(), dw8Var);
    }

    public void setDivTimerEventDispatcher$div_release(bu9 bu9Var) {
        this.x = bu9Var;
    }

    public void setForceCanvasClipping(boolean z) {
        this.y = z;
    }

    public void setInMiddleOfBind$div_release(boolean z) {
        this.w = z;
    }

    public void setPrevDataTag$div_release(@NotNull dw8 dw8Var) {
        this.J = dw8Var;
    }

    public void setRuntimeStore$div_release(@NotNull qjo qjoVar) {
        this.v = qjoVar;
    }

    public void setStateId$div_release(long j) {
        this.C = j;
    }

    public void setVisualErrorsEnabled(boolean z) {
        ygb a = getViewComponent$div_release().a();
        a.f = z;
        a.c();
    }

    public final boolean t(String str, String str2, xzb xzbVar) {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return false;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            boolean b = getDivVideoActionHandler().b(this, str, str2, xzbVar);
            a.close();
            return b;
        } finally {
        }
    }

    public final void u(View view, jc8 jc8Var) {
        synchronized (this.t) {
            this.t.put(view, jc8Var);
        }
    }

    public final void v(Function0 function0) {
        sj3 r = getViewComponent$div_release().r();
        r.b++;
        function0.invoke();
        int i = r.b - 1;
        r.b = i;
        if (i == 0) {
            r.a();
        }
    }

    public final void w() {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                try {
                    bindingDispatcher.b.c(bindingDispatcher.c.a());
                    bindingDispatcher.c.execute(new bc8(bindingDispatcher, this, 0));
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            }
        }
        x(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(boolean z) {
        f23 a;
        dfb b;
        c89 c89Var;
        kln klnVar = this.E;
        Continuation continuation = null;
        if (klnVar != null) {
            klnVar.clear();
            this.E = null;
        }
        B();
        ArrayList arrayList = this.p;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ffg) it.next()).cancel();
        }
        arrayList.clear();
        int i = 0;
        while (i < getChildCount()) {
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            } else {
                yd5.R(getMediaReleaseViewVisitor$div_release(), childAt);
                i = i2;
            }
        }
        synchronized (this.t) {
            this.t.clear();
        }
        h23 bindingDispatcher = getBindingDispatcher();
        try {
            if (bindingDispatcher.b()) {
                synchronized (d51.l) {
                }
                if (qht.a.a()) {
                    h23.a(bindingDispatcher);
                    y();
                    this.r.clear();
                    if (z) {
                        synchronized (d51.l) {
                        }
                        if (qht.a.a()) {
                            p1g.J(this, this);
                            removeAllViews();
                        } else {
                            dq7 dq7Var = ca8.a;
                            x97.D(j5h.a, new seg(continuation, this, this, 23));
                        }
                    }
                    b = getViewComponent$div_release().i().b(getDivData(), getDataTag());
                    if (b != null) {
                        b.c();
                    }
                    y79 layoutProviderBinder = getLayoutProviderBinder();
                    c89Var = (c89) layoutProviderBinder.d.get(getDivData());
                    if (c89Var != null) {
                        c89Var.l();
                    }
                    set_divData(null);
                    setDataTag$div_release(dw8.b);
                    return;
                }
            }
            qu9 tooltipController = getTooltipController();
            tooltipController.getClass();
            tooltipController.b(this);
            a.close();
            y();
            this.r.clear();
            if (z) {
            }
            b = getViewComponent$div_release().i().b(getDivData(), getDataTag());
            if (b != null) {
            }
            y79 layoutProviderBinder2 = getLayoutProviderBinder();
            c89Var = (c89) layoutProviderBinder2.d.get(getDivData());
            if (c89Var != null) {
            }
            set_divData(null);
            setDataTag$div_release(dw8.b);
            return;
        } finally {
        }
        a = bindingDispatcher.b.a();
    }

    public final void y() {
        h23 bindingDispatcher = getBindingDispatcher();
        if (bindingDispatcher.b()) {
            synchronized (d51.l) {
            }
            if (qht.a.a()) {
                h23.a(bindingDispatcher);
                return;
            }
        }
        f23 a = bindingDispatcher.b.a();
        try {
            this.q.clear();
            a.close();
        } finally {
        }
    }

    public final boolean z(rv8 rv8Var, rv8 rv8Var2, j23 j23Var) {
        Object D;
        synchronized (d51.l) {
        }
        if (qht.a.a()) {
            qv8 D2 = D(rv8Var);
            boolean z = false;
            if (D2 == null) {
                j23Var.getClass();
            } else {
                ic8 histogramReporter = getHistogramReporter();
                histogramReporter.getClass();
                histogramReporter.h = Long.valueOf(vp4.a());
                set_divData(rv8Var);
                kln klnVar = this.E;
                if (klnVar == null) {
                    klnVar = f(this, j23Var);
                    this.E = klnVar;
                }
                getDiv2Component$div_release().n().c(getDataTag(), D2.b, false);
                View childAt = getView().getChildAt(0);
                childAt.getClass();
                ViewGroup viewGroup = (ViewGroup) childAt;
                long j = D2.b;
                jc8 jc8Var = D2.a;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                dp8 d = jc8Var.d();
                String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
                sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
                if (klnVar.b(rv8Var2, rv8Var, viewGroup, new pm9(c5b.a, 8, t75.c(sb.toString()), j))) {
                    requestLayout();
                    getHistogramReporter().d();
                    z = true;
                }
            }
            D = Boolean.valueOf(z);
        } else {
            dq7 dq7Var = ca8.a;
            D = x97.D(j5h.a, new v24((Continuation) null, this, rv8Var, j23Var, rv8Var2, 3));
        }
        return ((Boolean) D).booleanValue();
    }

    @Override // defpackage.w0a
    @NotNull
    public gc8 getView() {
        return this;
    }

    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    public gc8(@NotNull vb8 vb8Var, AttributeSet attributeSet) {
        this(vb8Var, attributeSet, 0, 4, null);
    }

    public gc8(@NotNull vb8 vb8Var) {
        this(vb8Var, null, 0, 6, null);
    }

    public /* synthetic */ gc8(vb8 vb8Var, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vb8Var, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
