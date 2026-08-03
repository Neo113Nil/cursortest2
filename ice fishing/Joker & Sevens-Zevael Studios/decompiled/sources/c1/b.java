package c1;

import ac.o;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.lifecycle.w;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d1.r;
import e2.n;
import g5.j;
import pc.k;
import pc.s;
import v1.h0;
import w.c0;
import x1.c1;
import x1.e0;
import x1.g0;
import x1.k0;
import x1.p0;
import x1.t0;
import x1.u1;
import y0.m;
import y1.j1;
import y1.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1198h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1199i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        super(0);
        this.f1197g = i10;
        this.f1198h = obj;
        this.f1199i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r0v56, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v29, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v20, types: [oc.a, pc.k] */
    @Override // oc.a
    public final Object invoke() {
        i4.c t3;
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        n nVar;
        g0 g0Var;
        switch (this.f1197g) {
            case 0:
                ((c) this.f1198h).f1202w.invoke((d) this.f1199i);
                return o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((s) this.f1198h).f5683g = ((r) this.f1199i).s0();
                return o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                h4.d dVar = ((j) this.f1198h).f2530g;
                if (dVar != null && (t3 = dVar.t()) != null) {
                    return t3;
                }
                i4.c cVar = (i4.c) this.f1199i;
                pc.j.b(cVar);
                return cVar;
            case 3:
                return new g5.b(((i4.c) ((j) this.f1198h).f2532i.getValue()).d((String) this.f1199i));
            case 4:
                ((w) this.f1198h).f((h5.c) this.f1199i);
                return o.f277a;
            case 5:
                ((r1.c) this.f1198h).d((m) this.f1199i);
                return o.f277a;
            case 6:
                ((s) this.f1198h).f5683g = x1.f.i((c0) this.f1199i, h0.f7079a);
                return o.f277a;
            case 7:
                c1 c1Var = ((g0) this.f1198h).I;
                s sVar = (s) this.f1199i;
                if ((c1Var.f7991f.f8446j & 8) != 0) {
                    for (m mVar = c1Var.f7990e; mVar != null; mVar = mVar.f8447k) {
                        if ((mVar.f8445i & 8) != 0) {
                            x1.m mVar2 = mVar;
                            ?? r42 = 0;
                            while (mVar2 != 0) {
                                if (mVar2 instanceof u1) {
                                    u1 u1Var = (u1) mVar2;
                                    if (u1Var.Q()) {
                                        e2.j jVar = new e2.j();
                                        sVar.f5683g = jVar;
                                        jVar.f1988j = true;
                                    }
                                    if (u1Var.T()) {
                                        ((e2.j) sVar.f5683g).f1987i = true;
                                    }
                                    u1Var.I((e2.j) sVar.f5683g);
                                } else if ((mVar2.f8445i & 8) != 0 && (mVar2 instanceof x1.m)) {
                                    m mVar3 = mVar2.f8110v;
                                    int i10 = 0;
                                    mVar2 = mVar2;
                                    r42 = r42;
                                    while (mVar3 != null) {
                                        if ((mVar3.f8445i & 8) != 0) {
                                            i10++;
                                            r42 = r42;
                                            if (i10 == 1) {
                                                mVar2 = mVar3;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new o0.e(new m[16]);
                                                }
                                                if (mVar2 != 0) {
                                                    r42.b(mVar2);
                                                    mVar2 = 0;
                                                }
                                                r42.b(mVar3);
                                            }
                                        }
                                        mVar3 = mVar3.f8448l;
                                        mVar2 = mVar2;
                                        r42 = r42;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mVar2 = x1.f.f(r42);
                            }
                        }
                    }
                }
                return o.f277a;
            case 8:
                t0 t0Var = (t0) this.f1198h;
                k0 k0Var = t0Var.f8166l;
                k0Var.f8095h = 0;
                o0.e w3 = k0Var.f8088a.w();
                Object[] objArr = w3.f5134g;
                int i11 = w3.f5136i;
                for (int i12 = 0; i12 < i11; i12++) {
                    t0 t0Var2 = ((g0) objArr[i12]).J.f8104q;
                    pc.j.b(t0Var2);
                    t0Var2.f8168n = t0Var2.f8169o;
                    t0Var2.f8169o = Integer.MAX_VALUE;
                    if (t0Var2.f8170p == e0.f8020h) {
                        t0Var2.f8170p = e0.f8021i;
                    }
                }
                g0 g0Var2 = k0Var.f8088a;
                g0 g0Var3 = k0Var.f8088a;
                o0.e w10 = g0Var2.w();
                Object[] objArr2 = w10.f5134g;
                int i13 = w10.f5136i;
                for (int i14 = 0; i14 < i13; i14++) {
                    t0 t0Var3 = ((g0) objArr2[i14]).J.f8104q;
                    pc.j.b(t0Var3);
                    t0Var3.f8177w.getClass();
                }
                x1.r rVar = t0Var.k().U;
                if (rVar != null) {
                    boolean z10 = rVar.f8126q;
                    o0.b bVar = (o0.b) g0Var3.m();
                    int i15 = bVar.f5128g.f5136i;
                    for (int i16 = 0; i16 < i15; i16++) {
                        p0 z02 = ((g0) bVar.get(i16)).I.f7989d.z0();
                        if (z02 != null) {
                            z02.f8126q = z10;
                        }
                    }
                }
                ((p0) this.f1199i).j0().b();
                if (t0Var.k().U != null) {
                    o0.b bVar2 = (o0.b) g0Var3.m();
                    int i17 = bVar2.f5128g.f5136i;
                    for (int i18 = 0; i18 < i17; i18++) {
                        p0 z03 = ((g0) bVar2.get(i18)).I.f7989d.z0();
                        if (z03 != null) {
                            z03.f8126q = false;
                        }
                    }
                }
                o0.e w11 = g0Var3.w();
                Object[] objArr3 = w11.f5134g;
                int i19 = w11.f5136i;
                for (int i20 = 0; i20 < i19; i20++) {
                    t0 t0Var4 = ((g0) objArr3[i20]).J.f8104q;
                    pc.j.b(t0Var4);
                    int i21 = t0Var4.f8168n;
                    int i22 = t0Var4.f8169o;
                    if (i21 != i22 && i22 == Integer.MAX_VALUE) {
                        t0Var4.T(true);
                    }
                }
                o0.e w12 = g0Var3.w();
                Object[] objArr4 = w12.f5134g;
                int i23 = w12.f5136i;
                for (int i24 = 0; i24 < i23; i24++) {
                    t0 t0Var5 = ((g0) objArr4[i24]).J.f8104q;
                    pc.j.b(t0Var5);
                    x1.h0 h0Var = t0Var5.f8177w;
                    h0Var.getClass();
                    h0Var.f8069c = false;
                }
                return o.f277a;
            case 9:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f1199i);
                return Boolean.valueOf(dispatchKeyEvent);
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) this.f1199i);
                return Boolean.valueOf(dispatchGenericMotionEvent);
            default:
                y yVar = (y) this.f1199i;
                j1 j1Var = (j1) this.f1198h;
                e2.h hVar = j1Var.f8574k;
                e2.h hVar2 = j1Var.f8575l;
                Float f10 = j1Var.f8572i;
                Float f11 = j1Var.f8573j;
                float floatValue = (hVar == null || f10 == null) ? 0.0f : ((Number) hVar.f1957a.invoke()).floatValue() - f10.floatValue();
                float floatValue2 = (hVar2 == null || f11 == null) ? 0.0f : ((Number) hVar2.f1957a.invoke()).floatValue() - f11.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int v10 = yVar.v(j1Var.f8570g);
                    e2.o oVar = (e2.o) yVar.o().b(yVar.f8689n);
                    if (oVar != null) {
                        try {
                            i3.d dVar2 = yVar.f8691p;
                            if (dVar2 != null) {
                                dVar2.f3164a.setBoundsInScreen(yVar.f(oVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    e2.o oVar2 = (e2.o) yVar.o().b(yVar.f8690o);
                    if (oVar2 != null) {
                        try {
                            i3.d dVar3 = yVar.f8692q;
                            if (dVar3 != null) {
                                dVar3.f3164a.setBoundsInScreen(yVar.f(oVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    yVar.f8679d.invalidate();
                    e2.o oVar3 = (e2.o) yVar.o().b(v10);
                    if (oVar3 != null && (nVar = oVar3.f2000a) != null && (g0Var = nVar.f1995c) != null) {
                        if (hVar != null) {
                            yVar.f8694s.h(v10, hVar);
                        }
                        if (hVar2 != null) {
                            yVar.f8695t.h(v10, hVar2);
                        }
                        yVar.r(g0Var);
                    }
                }
                if (hVar != null) {
                    j1Var.f8572i = (Float) hVar.f1957a.invoke();
                }
                if (hVar2 != null) {
                    j1Var.f8573j = (Float) hVar2.f1957a.invoke();
                }
                return o.f277a;
        }
    }
}
