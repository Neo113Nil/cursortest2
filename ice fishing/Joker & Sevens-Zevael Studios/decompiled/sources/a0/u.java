package a0;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import m0.i1;
import v.h1;
import x1.g0;
import x1.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f135a;

    /* renamed from: b, reason: collision with root package name */
    public Object f136b;

    /* renamed from: c, reason: collision with root package name */
    public Object f137c = v.d.a(0.0f);

    /* renamed from: d, reason: collision with root package name */
    public Object f138d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f139e;

    /* JADX WARN: Multi-variable type inference failed */
    public u(boolean z10, oc.a aVar) {
        this.f135a = z10;
        this.f136b = (pc.k) aVar;
    }

    public boolean a(float f10, float f11) {
        ViewParent e10;
        if (this.f135a && (e10 = e(0)) != null) {
            try {
                return e10.onNestedPreFling((NestedScrollView) this.f138d, f10, f11);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedPreFling", e11);
            }
        }
        return false;
    }

    public boolean b(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent e10;
        int i13;
        int i14;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f138d;
        if (!this.f135a || (e10 = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (((int[]) this.f139e) == null) {
                this.f139e = new int[2];
            }
            iArr = (int[]) this.f139e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e10 instanceof h3.e) {
            ((h3.e) e10).d(i10, i11, iArr, i12);
        } else if (i12 == 0) {
            try {
                e10.onNestedPreScroll(nestedScrollView, i10, i11, iArr);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedPreScroll", e11);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean c(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent e10;
        int i15;
        int i16;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f138d;
        if (this.f135a && (e10 = e(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.f139e) == null) {
                        this.f139e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.f139e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e10 instanceof h3.f) {
                    ((h3.f) e10).c(nestedScrollView, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (e10 instanceof h3.e) {
                        ((h3.e) e10).e(nestedScrollView, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            e10.onNestedScroll(nestedScrollView, i10, i11, i12, i13);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedScroll", e11);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public void d(i0 i0Var, float f10, long j3) {
        h1.b bVar = i0Var.f8081g;
        float floatValue = ((Number) ((v.c) this.f137c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b2 = f1.q.b(j3, floatValue);
            if (!this.f135a) {
                h1.d.c0(i0Var, b2, f10, 0L, 124);
                return;
            }
            float d10 = e1.e.d(bVar.d());
            float b10 = e1.e.b(bVar.d());
            a5.c cVar = bVar.f2596h;
            long x10 = cVar.x();
            cVar.t().k();
            ((a5.c) ((f8.c) cVar.f262h).f2340h).t().d(0.0f, 0.0f, d10, b10, 1);
            h1.d.c0(i0Var, b2, f10, 0L, 124);
            cVar.t().g();
            cVar.Q(x10);
        }
    }

    public ViewParent e(int i10) {
        if (i10 == 0) {
            return (ViewParent) this.f136b;
        }
        if (i10 != 1) {
            return null;
        }
        return (ViewParent) this.f137c;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [oc.a, pc.k] */
    public void f(y.h hVar, yc.y yVar) {
        ArrayList arrayList = (ArrayList) this.f138d;
        boolean z10 = hVar instanceof y.f;
        if (z10) {
            arrayList.add(hVar);
        } else if (hVar instanceof y.g) {
            arrayList.remove(((y.g) hVar).f8411a);
        } else if (hVar instanceof y.d) {
            arrayList.add(hVar);
        } else if (hVar instanceof y.e) {
            arrayList.remove(((y.e) hVar).f8410a);
        } else if (hVar instanceof y.b) {
            arrayList.add(hVar);
        } else if (hVar instanceof y.c) {
            arrayList.remove(((y.c) hVar).f8409a);
        } else if (!(hVar instanceof y.a)) {
            return;
        } else {
            arrayList.remove(((y.a) hVar).f8408a);
        }
        y.h hVar2 = (y.h) bc.m.Y(arrayList);
        if (pc.j.a((y.h) this.f139e, hVar2)) {
            return;
        }
        fc.d dVar = null;
        if (hVar2 != null) {
            i0.f fVar = (i0.f) ((pc.k) this.f136b).invoke();
            float f10 = z10 ? fVar.f2950c : hVar instanceof y.d ? fVar.f2949b : hVar instanceof y.b ? fVar.f2948a : 0.0f;
            h1 h1Var = i0.o.f2986a;
            if (!(hVar2 instanceof y.f)) {
                if (hVar2 instanceof y.d) {
                    h1Var = new h1(45, 0, v.w.f7003b);
                } else if (hVar2 instanceof y.b) {
                    h1Var = new h1(45, 0, v.w.f7003b);
                }
            }
            yc.a0.q(yVar, null, new i0.u(this, f10, h1Var, null), 3);
        } else {
            y.h hVar3 = (y.h) this.f139e;
            h1 h1Var2 = i0.o.f2986a;
            if (!(hVar3 instanceof y.f) && !(hVar3 instanceof y.d) && (hVar3 instanceof y.b)) {
                h1Var2 = new h1(150, 0, v.w.f7003b);
            }
            yc.a0.q(yVar, null, new c0.d(this, h1Var2, dVar, 4), 3);
        }
        this.f139e = hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int g(x4.e eVar, y1.r rVar, boolean z10) {
        Object[] objArr;
        int i10;
        int i11;
        r1.c cVar = (r1.c) this.f137c;
        x1.q qVar = (x1.q) this.f139e;
        if (this.f135a) {
            return 0;
        }
        try {
            this.f135a = true;
            x4.c s10 = ((m7.g) this.f138d).s(eVar, rVar);
            s.o oVar = (s.o) s10.f8290g;
            int d10 = oVar.d();
            for (int i12 = 0; i12 < d10; i12++) {
                r1.n nVar = (r1.n) oVar.e(i12);
                if (!nVar.f5966d && !nVar.f5970h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int d11 = oVar.d();
            for (int i13 = 0; i13 < d11; i13++) {
                r1.n nVar2 = (r1.n) oVar.e(i13);
                if (objArr != false || r1.v.a(nVar2)) {
                    ((g0) this.f136b).x(nVar2.f5965c, (x1.q) this.f139e, nVar2.f5971i, true);
                    if (!qVar.f8147g.g()) {
                        cVar.a(nVar2.f5963a, qVar, r1.v.a(nVar2));
                        qVar.clear();
                    }
                }
            }
            boolean b2 = cVar.b(s10, z10);
            int d12 = oVar.d();
            int i14 = 0;
            while (true) {
                if (i14 >= d12) {
                    i10 = 0;
                    break;
                }
                r1.n nVar3 = (r1.n) oVar.e(i14);
                if (!e1.b.b(r1.v.c(nVar3, true), 0L) && nVar3.b()) {
                    i10 = 1;
                    break;
                }
                i14++;
            }
            int d13 = oVar.d();
            int i15 = 0;
            while (true) {
                if (i15 >= d13) {
                    i11 = 0;
                    break;
                }
                if (((r1.n) oVar.e(i15)).b()) {
                    i11 = 1;
                    break;
                }
                i15++;
            }
            int i16 = (b2 ? 1 : 0) | (i10 << 1) | (i11 << 2);
            this.f135a = false;
            return i16;
        } catch (Throwable th) {
            this.f135a = false;
            throw th;
        }
    }

    public void h(int i10, int i11) {
        if (i10 < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
        }
        ((i1) this.f136b).h(i10);
        b0.y yVar = (b0.y) this.f139e;
        if (i10 != yVar.f931h) {
            yVar.f931h = i10;
            int i12 = (i10 / 30) * 30;
            yVar.f930g.setValue(uc.e.q(Math.max(i12 - 100, 0), i12 + 130));
        }
        ((i1) this.f137c).h(i11);
    }
}
