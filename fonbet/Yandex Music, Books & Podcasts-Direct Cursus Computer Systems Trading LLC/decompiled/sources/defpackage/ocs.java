package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ocs implements muk {
    public final View a;
    public final ime b;
    public final xkh c;
    public boolean d;
    public uif e;
    public Function1 f;
    public ybs g;
    public ide h;
    public final ArrayList i;
    public final Object j;
    public Rect k;
    public final jw6 l;
    public final eqi m;
    public bhp n;

    public ocs(View view, AndroidComposeView androidComposeView) {
        ime imeVar = new ime(view);
        xkh xkhVar = new xkh(3, Choreographer.getInstance());
        this.a = view;
        this.b = imeVar;
        this.c = xkhVar;
        this.e = rvr.F;
        this.f = rvr.G;
        this.g = new ybs("", rds.b, 4);
        this.h = ide.g;
        this.i = new ArrayList();
        this.j = btf.a(bwf.c, new ncs(0, this));
        this.l = new jw6(androidComposeView, imeVar);
        this.m = new eqi(new mcs[16]);
    }

    @Override // defpackage.muk
    public final void a() {
        i(mcs.a);
    }

    @Override // defpackage.muk
    public final void b() {
        this.d = false;
        this.e = rvr.H;
        this.f = rvr.I;
        this.k = null;
        i(mcs.b);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v22, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [arf, java.lang.Object] */
    @Override // defpackage.muk
    public final void c(ybs ybsVar, ybs ybsVar2) {
        boolean z = (rds.a(this.g.b, ybsVar2.b) && Intrinsics.d(this.g.c, ybsVar2.c)) ? false : true;
        this.g = ybsVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            pnn pnnVar = (pnn) ((WeakReference) this.i.get(i)).get();
            if (pnnVar != null) {
                pnnVar.d = ybsVar2;
            }
        }
        jw6 jw6Var = this.l;
        synchronized (jw6Var.c) {
            jw6Var.j = null;
            jw6Var.l = null;
            jw6Var.k = null;
            jw6Var.m = gx3.Z;
            jw6Var.n = null;
            jw6Var.o = null;
        }
        if (Intrinsics.d(ybsVar, ybsVar2)) {
            if (z) {
                ime imeVar = this.b;
                int e = rds.e(ybsVar2.b);
                int d = rds.d(ybsVar2.b);
                rds rdsVar = this.g.c;
                int e2 = rdsVar != null ? rds.e(rdsVar.a) : -1;
                rds rdsVar2 = this.g.c;
                ((InputMethodManager) imeVar.c.getValue()).updateSelection((View) imeVar.b, e, d, e2, rdsVar2 != null ? rds.d(rdsVar2.a) : -1);
                return;
            }
            return;
        }
        if (ybsVar != null && (!Intrinsics.d(ybsVar.a.b, ybsVar2.a.b) || (rds.a(ybsVar.b, ybsVar2.b) && !Intrinsics.d(ybsVar.c, ybsVar2.c)))) {
            ime imeVar2 = this.b;
            ((InputMethodManager) imeVar2.c.getValue()).restartInput((View) imeVar2.b);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            pnn pnnVar2 = (pnn) ((WeakReference) this.i.get(i2)).get();
            if (pnnVar2 != null) {
                ybs ybsVar3 = this.g;
                ime imeVar3 = this.b;
                if (pnnVar2.h) {
                    pnnVar2.d = ybsVar3;
                    if (pnnVar2.f) {
                        ((InputMethodManager) imeVar3.c.getValue()).updateExtractedText((View) imeVar3.b, pnnVar2.e, y2x.d0(ybsVar3));
                    }
                    rds rdsVar3 = ybsVar3.c;
                    long j = ybsVar3.b;
                    int e3 = rdsVar3 != null ? rds.e(rdsVar3.a) : -1;
                    rds rdsVar4 = ybsVar3.c;
                    ((InputMethodManager) imeVar3.c.getValue()).updateSelection((View) imeVar3.b, rds.e(j), rds.d(j), e3, rdsVar4 != null ? rds.d(rdsVar4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.muk
    public final void d() {
        i(mcs.d);
    }

    @Override // defpackage.muk
    public final void e(ynn ynnVar) {
        Rect rect;
        this.k = new Rect(eeh.b(ynnVar.a), eeh.b(ynnVar.b), eeh.b(ynnVar.c), eeh.b(ynnVar.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.muk
    public final void f(ybs ybsVar, ide ideVar, lma lmaVar, nl6 nl6Var) {
        this.d = true;
        this.g = ybsVar;
        this.h = ideVar;
        this.e = lmaVar;
        this.f = nl6Var;
        i(mcs.a);
    }

    @Override // defpackage.muk
    public final void g() {
        i(mcs.c);
    }

    @Override // defpackage.muk
    public final void h(ybs ybsVar, mnj mnjVar, cds cdsVar, hxo hxoVar, ynn ynnVar, ynn ynnVar2) {
        jw6 jw6Var = this.l;
        synchronized (jw6Var.c) {
            try {
                jw6Var.j = ybsVar;
                jw6Var.l = mnjVar;
                jw6Var.k = cdsVar;
                jw6Var.m = hxoVar;
                jw6Var.n = ynnVar;
                jw6Var.o = ynnVar2;
                if (!jw6Var.e) {
                    if (jw6Var.d) {
                    }
                }
                jw6Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(mcs mcsVar) {
        this.m.d(mcsVar);
        if (this.n == null) {
            bhp bhpVar = new bhp(12, this);
            this.c.execute(bhpVar);
            this.n = bhpVar;
        }
    }
}
