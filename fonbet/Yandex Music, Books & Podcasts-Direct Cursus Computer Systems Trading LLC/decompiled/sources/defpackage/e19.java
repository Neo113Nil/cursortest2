package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e19 extends dpn {
    public final e23 a;
    public final hh9 b;
    public final yon c;
    public final s09 d;
    public final gc8 e;
    public int f;
    public boolean g;
    public String h;

    /* JADX WARN: Multi-variable type inference failed */
    public e19(e23 e23Var, hh9 hh9Var, y09 y09Var, s09 s09Var) {
        this.a = e23Var;
        this.b = hh9Var;
        this.c = (yon) y09Var;
        this.d = s09Var;
        gc8 gc8Var = e23Var.a;
        this.e = gc8Var;
        gc8Var.getConfig().getClass();
        this.h = "next";
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [y09, yon] */
    @Override // defpackage.dpn
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.g = false;
        }
        if (i == 0) {
            gc8 gc8Var = this.e;
            yb8 i2 = gc8Var.getDiv2Component$div_release().i();
            xzb xzbVar = this.a.b;
            ?? r8 = this.c;
            i2.k(gc8Var, xzbVar, this.d, r8.o(), r8.l(), this.h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [c5b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [y09, yon] */
    @Override // defpackage.dpn
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ?? r0;
        int q = this.c.q() / 20;
        int abs = Math.abs(i2) + Math.abs(i) + this.f;
        this.f = abs;
        if (abs <= q) {
            return;
        }
        this.f = 0;
        boolean z = this.g;
        gc8 gc8Var = this.e;
        if (!z) {
            this.g = true;
            gc8Var.getDiv2Component$div_release().i().u();
            this.h = (i > 0 || i2 > 0) ? "next" : "back";
        }
        w1a A = gc8Var.getDiv2Component$div_release().A();
        hh9 hh9Var = this.b;
        if (hh9Var.getChildCount() > 0) {
            View childAt = hh9Var.getChildAt(0);
            if (childAt == null) {
                rj7.m();
                return;
            }
            if (1 < hh9Var.getChildCount()) {
                r0 = new ArrayList();
                r0.add(childAt);
                int i3 = 1;
                while (i3 < hh9Var.getChildCount()) {
                    int i4 = i3 + 1;
                    View childAt2 = hh9Var.getChildAt(i3);
                    if (childAt2 == null) {
                        rj7.m();
                        return;
                    } else {
                        r0.add(childAt2);
                        i3 = i4;
                    }
                }
            } else {
                r0 = t75.c(childAt);
            }
        } else {
            r0 = c5b.a;
        }
        Iterator it = A.g.entrySet().iterator();
        while (it.hasNext()) {
            if (!r0.contains(((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
        if (!A.l) {
            A.l = true;
            A.c.post(A.m);
        }
        int i5 = 0;
        while (true) {
            int childCount = hh9Var.getChildCount();
            e23 e23Var = this.a;
            if (i5 >= childCount) {
                LinkedHashMap d = A.d();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : d.entrySet()) {
                    Object key = entry.getKey();
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= hh9Var.getChildCount()) {
                            i6 = -1;
                            break;
                        }
                        int i8 = i7 + 1;
                        View childAt3 = hh9Var.getChildAt(i7);
                        if (childAt3 == null) {
                            rj7.m();
                            return;
                        } else {
                            if (i6 < 0) {
                                u75.n();
                                throw null;
                            }
                            if (Intrinsics.d(key, childAt3)) {
                                break;
                            }
                            i6++;
                            i7 = i8;
                        }
                    }
                    if (!(i6 >= 0)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    View view = (View) entry2.getKey();
                    jc8 jc8Var = (jc8) entry2.getValue();
                    List e = jc8Var.d().e();
                    if (e != null) {
                        xzb xzbVar = e23Var.b;
                        A.g(e23Var.a, xzbVar, view, jc8Var, c5b.a, w1a.c(e, xzbVar));
                    }
                }
                return;
            }
            int i9 = i5 + 1;
            View childAt4 = hh9Var.getChildAt(i5);
            if (childAt4 == null) {
                rj7.m();
                return;
            }
            int Y = RecyclerView.Y(childAt4);
            if (Y != -1) {
                qon adapter = hh9Var.getAdapter();
                adapter.getClass();
                jc8 jc8Var2 = ((k79) ((u09) adapter).u().get(Y)).a;
                e23 G = bg3.G(childAt4);
                if (G != null) {
                    e23Var = G;
                }
                w1a.f(e23Var, childAt4, jc8Var2, new r1a(A, e23Var, 1));
            }
            i5 = i9;
        }
    }
}
