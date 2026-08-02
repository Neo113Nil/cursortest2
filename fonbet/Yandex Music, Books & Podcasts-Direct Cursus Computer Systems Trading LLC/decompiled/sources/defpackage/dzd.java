package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dzd {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;

    public dzd(View view) {
        this.e = view;
        this.f = new ArrayList();
        this.g = new Rect();
        this.h = new Rect();
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public void a(boolean z, long j, List list) {
        int i;
        y7j y7jVar;
        y7j y7jVar2;
        k8j k8jVar = (k8j) this.g;
        yoi yoiVar = (yoi) this.h;
        yoiVar.a();
        int size = list.size();
        k8j k8jVar2 = k8jVar;
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            xci xciVar = (xci) list.get(i2);
            if (xciVar.n) {
                xciVar.m = new ssb(4, this, xciVar);
                if (z2) {
                    eqi eqiVar = k8jVar2.a;
                    ?? r14 = eqiVar.a;
                    int i3 = eqiVar.c;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            y7jVar2 = 0;
                            break;
                        }
                        y7jVar2 = r14[i4];
                        if (Intrinsics.d(((y7j) y7jVar2).c, xciVar)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    y7jVar = y7jVar2;
                    if (y7jVar != null) {
                        y7jVar.i = true;
                        y7jVar.d.a(j);
                        Object e = yoiVar.e(j);
                        if (e == null) {
                            e = new gpi();
                            yoiVar.h(j, e);
                        }
                        ((gpi) e).a(y7jVar);
                        k8jVar2 = y7jVar;
                    } else {
                        z2 = false;
                    }
                }
                y7jVar = new y7j(xciVar);
                y7jVar.d.a(j);
                Object e2 = yoiVar.e(j);
                if (e2 == null) {
                    e2 = new gpi();
                    yoiVar.h(j, e2);
                }
                ((gpi) e2).a(y7jVar);
                k8jVar2.a.d(y7jVar);
                k8jVar2 = y7jVar;
            }
        }
        if (!z) {
            return;
        }
        long[] jArr = yoiVar.b;
        Object[] objArr = yoiVar.c;
        long[] jArr2 = yoiVar.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr2[i5];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j2) < 128) {
                        int i9 = (i5 << 3) + i8;
                        long j3 = jArr[i9];
                        gpi gpiVar = (gpi) objArr[i9];
                        eqi eqiVar2 = k8jVar.a;
                        i = i6;
                        Object[] objArr2 = eqiVar2.a;
                        int i10 = eqiVar2.c;
                        for (int i11 = 0; i11 < i10; i11++) {
                            ((y7j) objArr2[i11]).f(j3, gpiVar);
                        }
                    } else {
                        i = i6;
                    }
                    j2 >>= i;
                    i8++;
                    i6 = i;
                }
                if (i7 != i6) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public float[] b(Object obj) {
        float[] fArr = (float[]) this.h;
        if (this.b) {
            this.c = yd5.z(c(obj), fArr);
            this.b = false;
        }
        if (this.c) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, uif] */
    public float[] c(Object obj) {
        float[] fArr = (float[]) this.g;
        if (!this.a) {
            return fArr;
        }
        Matrix matrix = (Matrix) this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        ((uif) this.e).invoke(obj, matrix);
        cxb.j0(matrix, fArr);
        this.a = false;
        this.d = tyf.B(fArr);
        return fArr;
    }

    public boolean d(fmq fmqVar, boolean z) {
        gpi gpiVar = (gpi) this.f;
        k8j k8jVar = (k8j) this.g;
        boolean a = k8jVar.a((ovg) fmqVar.c, (wof) this.e, fmqVar, z);
        eqi eqiVar = k8jVar.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.a = true;
        Object[] objArr = eqiVar.a;
        int i = eqiVar.c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((y7j) objArr[i2]).e(fmqVar, z) || z3;
        }
        Object[] objArr2 = eqiVar.a;
        int i3 = eqiVar.c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((y7j) objArr2[i4]).d(fmqVar) || z4;
        }
        k8jVar.b(fmqVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.a = false;
        if (this.d) {
            this.d = false;
            int i5 = gpiVar.b;
            for (int i6 = 0; i6 < i5; i6++) {
                g((xci) gpiVar.e(i6));
            }
            gpiVar.c();
        }
        if (this.b) {
            this.b = false;
            f();
        }
        if (this.c) {
            this.c = false;
            k8jVar.a.i();
        }
        return z2;
    }

    public void e() {
        this.a = true;
        this.b = true;
    }

    public void f() {
        k8j k8jVar = (k8j) this.g;
        if (this.a) {
            this.b = true;
            return;
        }
        eqi eqiVar = k8jVar.a;
        Object[] objArr = eqiVar.a;
        int i = eqiVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((y7j) objArr[i2]).c();
        }
        if (this.c) {
            this.c = true;
        } else {
            k8jVar.a.i();
        }
    }

    public void g(xci xciVar) {
        if (this.a) {
            this.d = true;
            ((gpi) this.f).a(xciVar);
            return;
        }
        k8j k8jVar = (k8j) this.g;
        gpi gpiVar = k8jVar.b;
        gpiVar.c();
        gpiVar.a(k8jVar);
        while (true) {
            int i = gpiVar.b;
            if (i == 0) {
                return;
            }
            k8j k8jVar2 = (k8j) gpiVar.i(i - 1);
            int i2 = 0;
            while (true) {
                eqi eqiVar = k8jVar2.a;
                if (i2 < eqiVar.c) {
                    y7j y7jVar = (y7j) eqiVar.a[i2];
                    if (Intrinsics.d(y7jVar.c, xciVar)) {
                        k8jVar2.a.l(y7jVar);
                        y7jVar.c();
                    } else {
                        gpiVar.a(y7jVar);
                        i2++;
                    }
                }
            }
        }
    }

    public void h() {
        boolean z;
        View view = (View) this.e;
        boolean z2 = false;
        if (this.c && view.isShown() && this.b && this.d) {
            Rect rect = (Rect) this.h;
            Rect rect2 = (Rect) this.g;
            if (view.getWidth() == 0 || view.getHeight() == 0 || view.willNotDraw()) {
                z = false;
            } else {
                view.getGlobalVisibleRect(rect2);
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                z = rect.intersect(rect2);
            }
            if (z) {
                z2 = true;
            }
        }
        if (this.a == z2) {
            return;
        }
        this.a = z2;
        Iterator it = CollectionsKt.w0((ArrayList) this.f).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.valueOf(z2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dzd(Function2 function2) {
        this.e = (uif) function2;
        this.g = feh.a();
        this.h = feh.a();
        this.c = true;
        this.d = true;
    }

    public dzd(wof wofVar) {
        this.e = wofVar;
        this.f = new gpi();
        this.g = new k8j();
        this.h = new yoi(10);
    }
}
