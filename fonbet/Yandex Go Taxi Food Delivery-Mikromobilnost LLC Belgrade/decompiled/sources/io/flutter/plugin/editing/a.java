package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillValue;
import defpackage.cpy0;
import defpackage.dpy0;
import defpackage.hwo0;
import defpackage.tis0;
import io.flutter.embedding.android.FlutterView;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class a {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        c cVar = this.a;
        if (cVar.f.a == TextInputPlugin$InputTarget$Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        cVar.i.removeEditingStateListener(cVar);
        cVar.f();
        cVar.g = null;
        cVar.h = null;
        cVar.f = new b(TextInputPlugin$InputTarget$Type.NO_TARGET, 0);
        cVar.g();
        cVar.n = null;
    }

    public final void b() {
        c cVar = this.a;
        if (cVar.f.a == TextInputPlugin$InputTarget$Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            cVar.f();
            return;
        }
        FlutterView flutterView = cVar.a;
        cVar.f();
        cVar.b.hideSoftInputFromWindow(flutterView.getApplicationWindowToken(), 0);
    }

    public final void c(int i, cpy0 cpy0Var) {
        c cVar = this.a;
        FlutterView flutterView = cVar.a;
        cVar.f();
        cVar.g = cpy0Var;
        cVar.f = new b(TextInputPlugin$InputTarget$Type.FRAMEWORK_CLIENT, i);
        cVar.i.removeEditingStateListener(cVar);
        hwo0 hwo0Var = cpy0Var.j;
        cVar.i = new ListenableEditingState(hwo0Var != null ? (dpy0) hwo0Var.w : null, flutterView);
        if (hwo0Var == null) {
            cVar.h = null;
        } else {
            cpy0[] cpy0VarArr = cpy0Var.l;
            SparseArray sparseArray = new SparseArray();
            cVar.h = sparseArray;
            if (cpy0VarArr == null) {
                sparseArray.put(((String) hwo0Var.b).hashCode(), cpy0Var);
            } else {
                for (cpy0 cpy0Var2 : cpy0VarArr) {
                    hwo0 hwo0Var2 = cpy0Var2.j;
                    if (hwo0Var2 != null) {
                        String str = (String) hwo0Var2.b;
                        cVar.h.put(str.hashCode(), cpy0Var2);
                        cVar.c.notifyValueChanged(flutterView, str.hashCode(), AutofillValue.forText(((dpy0) hwo0Var2.w).a));
                    }
                }
            }
        }
        cVar.j = true;
        cVar.g();
        cVar.n = null;
        cVar.i.addEditingStateListener(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [double[], java.io.Serializable] */
    public final void d(double d, double d2, double[] dArr) {
        ?? r5 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d3 = dArr[12];
        double d4 = dArr[15];
        double d5 = d3 / d4;
        r5[1] = d5;
        r5[0] = d5;
        double d6 = dArr[13] / d4;
        r5[3] = d6;
        r5[2] = d6;
        tis0 tis0Var = new tis0(z, (Serializable) dArr, (Serializable) r5, 22);
        tis0Var.T(d, 0.0d);
        tis0Var.T(d, d2);
        tis0Var.T(0.0d, d2);
        c cVar = this.a;
        double d7 = cVar.a.getContext().getResources().getDisplayMetrics().density;
        cVar.n = new Rect((int) (r5[0] * d7), (int) (r5[2] * d7), (int) Math.ceil(r5[1] * d7), (int) Math.ceil(r5[3] * d7));
    }

    public final void e(dpy0 dpy0Var) {
        dpy0 dpy0Var2;
        int i;
        int i2;
        c cVar = this.a;
        FlutterView flutterView = cVar.a;
        if (!cVar.j && (dpy0Var2 = cVar.p) != null && (i = dpy0Var2.d) >= 0 && (i2 = dpy0Var2.e) > i) {
            int i3 = i2 - i;
            int i4 = dpy0Var.e;
            int i5 = dpy0Var.d;
            boolean z = true;
            if (i3 == i4 - i5) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i3) {
                        z = false;
                        break;
                    } else if (dpy0Var2.a.charAt(i6 + i) != dpy0Var.a.charAt(i6 + i5)) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            cVar.j = z;
        }
        cVar.p = dpy0Var;
        cVar.i.setEditingState(dpy0Var);
        if (cVar.j) {
            cVar.b.restartInput(flutterView);
            cVar.j = false;
        }
    }

    public final void f(int i, boolean z) {
        c cVar = this.a;
        FlutterView flutterView = cVar.a;
        if (!z) {
            cVar.f = new b(TextInputPlugin$InputTarget$Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i);
            cVar.k = null;
        } else {
            flutterView.requestFocus();
            cVar.f = new b(TextInputPlugin$InputTarget$Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i);
            cVar.b.restartInput(flutterView);
            cVar.j = false;
        }
    }
}
