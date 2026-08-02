package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sj3 {
    public final gc8 a;
    public int b;
    public qv8 c;
    public boolean d = true;
    public final ArrayList e = new ArrayList();

    public sj3(gc8 gc8Var) {
        this.a = gc8Var;
    }

    public final void a() {
        qv8 qv8Var = this.c;
        if (qv8Var == null) {
            return;
        }
        long j = qv8Var.b;
        gc8 gc8Var = this.a;
        long currentStateId = gc8Var.getCurrentStateId();
        ArrayList arrayList = this.e;
        if (j != currentStateId) {
            gc8Var.S(j, this.d);
        } else if (gc8Var.getChildCount() != 0) {
            try {
                gc8Var.getViewComponent$div_release().h().a(gc8Var.getBindingContext$div_release(), qv8Var, arrayList != null && (!(arrayList instanceof j9f) || (arrayList instanceof l9f)) ? Collections.unmodifiableList(new ArrayList(arrayList)) : arrayList);
            } catch (tdr e) {
                gc8Var.I(e);
                gc8Var.L();
            }
        }
        this.c = null;
        this.d = true;
        arrayList.clear();
    }

    public final void b(qv8 qv8Var, pm9 pm9Var, boolean z) {
        ter terVar;
        Unit unit;
        Function1 function1;
        List c = t75.c(pm9Var);
        qv8 qv8Var2 = this.c;
        if (qv8Var2 != null && !Intrinsics.d(qv8Var, qv8Var2)) {
            this.c = null;
            this.d = true;
            this.e.clear();
        }
        this.c = qv8Var;
        this.d = this.d && z;
        List<pm9> list = c;
        z75.t(this.e, list);
        for (pm9 pm9Var2 : list) {
            nm9 n = this.a.getDiv2Component$div_release().n();
            String str = this.a.getDivTag().a;
            n.getClass();
            String e = pm9Var2.e();
            String d = pm9Var2.d();
            if (e != null && d != null) {
                synchronized (n.c) {
                    try {
                        n.b.b(str, e, d);
                        if (!z) {
                            ((Map) n.a.b).put(new Pair(str, e), d);
                        }
                        Map map = (Map) n.d.get(str);
                        if (map != null && (terVar = (ter) map.get(e)) != null) {
                            WeakReference weakReference = terVar.b;
                            if (weakReference == null || (function1 = (Function1) weakReference.get()) == null) {
                                unit = null;
                            } else {
                                function1.invoke(d);
                                unit = Unit.a;
                            }
                            if (unit == null) {
                                terVar.a.g(d);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.b == 0) {
            a();
        }
    }
}
