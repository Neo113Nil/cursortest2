package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tf0 implements yn7, View.OnAttachStateChangeListener {
    public final AndroidComposeView a;
    public final zy b;
    public qb6 c;
    public final ArrayList d = new ArrayList();
    public final long e = 100;
    public pf0 f = pf0.a;
    public boolean g = true;
    public final zi3 h = men.g(1, 6, null);
    public final Handler i = new Handler(Looper.getMainLooper());
    public soi j;
    public long k;
    public final soi l;
    public rfp m;
    public boolean n;
    public final he0 o;

    public tf0(AndroidComposeView androidComposeView, zy zyVar) {
        this.a = androidComposeView;
        this.b = zyVar;
        soi soiVar = vpe.a;
        soiVar.getClass();
        this.j = soiVar;
        this.l = new soi();
        this.m = new rfp(androidComposeView.getSemanticsOwner().a(), soiVar);
        this.o = new he0(2, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (defpackage.y2x.o(r6, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        sf0 sf0Var;
        int i;
        si3 si3Var;
        tf0 tf0Var;
        tf0 tf0Var2;
        Object c;
        if (cg6Var instanceof sf0) {
            sf0Var = (sf0) cg6Var;
            int i2 = sf0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sf0Var.n = i2 - Integer.MIN_VALUE;
                Object obj = sf0Var.l;
                nm6 nm6Var = nm6.a;
                i = sf0Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = this.h;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                    tf0Var = this;
                    sf0Var.j = tf0Var;
                    sf0Var.k = si3Var;
                    sf0Var.n = 1;
                    c = si3Var.c(sf0Var);
                    if (c != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    si3Var = sf0Var.k;
                    tf0Var2 = sf0Var.j;
                    qgg.h0(obj);
                    tf0Var = tf0Var2;
                    sf0Var.j = tf0Var;
                    sf0Var.k = si3Var;
                    sf0Var.n = 1;
                    c = si3Var.c(sf0Var);
                    if (c != nm6Var) {
                        tf0Var2 = tf0Var;
                        obj = c;
                        if (((Boolean) obj).booleanValue()) {
                            return Unit.a;
                        }
                        si3Var.d();
                        if (tf0Var2.f()) {
                            tf0Var2.h();
                        }
                        if (!tf0Var2.n) {
                            tf0Var2.n = true;
                            tf0Var2.i.post(tf0Var2.o);
                        }
                        long j = tf0Var2.e;
                        sf0Var.j = tf0Var2;
                        sf0Var.k = si3Var;
                        sf0Var.n = 2;
                    }
                    return nm6Var;
                }
                si3Var = sf0Var.k;
                tf0Var2 = sf0Var.j;
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            }
        }
        sf0Var = new sf0(this, cg6Var);
        Object obj2 = sf0Var.l;
        nm6 nm6Var2 = nm6.a;
        i = sf0Var.n;
        if (i != 0) {
        }
    }

    public final void d(qfp qfpVar, Function2 function2) {
        qfpVar.getClass();
        List h = qfp.h(4, qfpVar);
        int size = h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = h.get(i2);
            if (e().a(((qfp) obj).g)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final upe e() {
        if (this.g) {
            this.g = false;
            this.j = bkp.e0(this.a.getSemanticsOwner());
            this.k = System.currentTimeMillis();
        }
        return this.j;
    }

    public final boolean f() {
        return this.c != null;
    }

    public final void h() {
        AutofillId b;
        qb6 qb6Var = this.c;
        if (qb6Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ob6 ob6Var = (ob6) arrayList.get(i);
                int ordinal = ob6Var.c.ordinal();
                if (ordinal == 0) {
                    vtm vtmVar = ob6Var.d;
                    if (vtmVar != null) {
                        qb6Var.d((ViewStructure) vtmVar.a);
                    }
                } else if (ordinal == 1 && (b = qb6Var.b(ob6Var.a)) != null) {
                    qb6Var.e(b);
                }
            }
            qb6Var.a();
            arrayList.clear();
        }
    }

    public final void i(qfp qfpVar, rfp rfpVar) {
        d(qfpVar, new s30(4, rfpVar, this));
        List h = qfp.h(4, qfpVar);
        int size = h.size();
        for (int i = 0; i < size; i++) {
            qfp qfpVar2 = (qfp) h.get(i);
            upe e = e();
            int i2 = qfpVar2.g;
            if (e.a(i2)) {
                soi soiVar = this.l;
                if (soiVar.a(i2)) {
                    Object b = soiVar.b(i2);
                    if (b == null) {
                        throw ouj.f("node not present in pruned tree before this change");
                    }
                    i(qfpVar2, (rfp) b);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(int i, String str) {
        qb6 qb6Var;
        if (Build.VERSION.SDK_INT >= 29 && (qb6Var = this.c) != null) {
            AutofillId b = qb6Var.b(i);
            if (b == null) {
                throw ouj.f("Invalid content capture ID");
            }
            qb6Var.f(b, str);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v24 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r1v24 android.view.autofill.AutofillId) from 0x0092: IF  (r1v24 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0070 A[HIDDEN] (LINE:147)
          (r1v24 android.view.autofill.AutofillId) from 0x0099: PHI (r1v11 android.view.autofill.AutofillId) = (r1v10 android.view.autofill.AutofillId), (r1v24 android.view.autofill.AutofillId) binds: [B:93:0x0095, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int r14, defpackage.qfp r15) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf0.k(int, qfp):void");
    }

    public final void l(qfp qfpVar) {
        if (f()) {
            this.d.add(new ob6(qfpVar.g, this.k, pb6.b, null));
            List h = qfp.h(4, qfpVar);
            int size = h.size();
            for (int i = 0; i < size; i++) {
                l((qfp) h.get(i));
            }
        }
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        this.c = (qb6) this.b.invoke();
        k(-1, this.a.getSemanticsOwner().a());
        h();
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        l(this.a.getSemanticsOwner().a());
        h();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.i.removeCallbacks(this.o);
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
