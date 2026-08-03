package a1;

import a0.a0;
import ac.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.n0;
import b0.o0;
import b0.s;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import e2.n;
import f1.e0;
import h2.h0;
import j0.r0;
import j0.s0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m0.l;
import m0.r;
import m0.r1;
import m0.v1;
import m0.z;
import m0.z0;
import pc.k;
import v1.t;
import x1.f1;
import x1.o1;
import y1.k1;
import z.c0;
import z.g0;
import z.i0;
import z.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f166h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f167i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        super(2);
        this.f165g = i10;
        this.f166h = obj;
        this.f167i = obj2;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f165g;
        z0 z0Var = l.f4646a;
        byte b2 = 0;
        int i11 = 1;
        o oVar = o.f277a;
        Object obj3 = this.f167i;
        Object obj4 = this.f166h;
        switch (i10) {
            case 0:
                int intValue = ((Number) obj).intValue();
                n nVar = (n) obj2;
                h hVar = (h) obj3;
                if (!((k1) obj4).f8580b.b(nVar.f1999g)) {
                    hVar.n(intValue, nVar);
                    hVar.f177n.s(oVar);
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                r rVar = (r) obj;
                int intValue2 = ((Number) obj2).intValue();
                s sVar = (s) obj4;
                b0.r rVar2 = (b0.r) obj3;
                Object obj5 = rVar2.f876a;
                if ((intValue2 & 3) != 2 || !rVar.B()) {
                    a0.i iVar = (a0.i) sVar.f886b.invoke();
                    int i12 = rVar2.f878c;
                    if ((i12 >= iVar.c() || !iVar.d(i12).equals(obj5)) && (i12 = iVar.f55d.b(obj5)) != -1) {
                        rVar2.f878c = i12;
                    }
                    int i13 = i12;
                    boolean z10 = i13 != -1;
                    rVar.a0(Boolean.valueOf(z10));
                    boolean g8 = rVar.g(z10);
                    rVar.X(-869707859);
                    if (z10) {
                        rVar.X(-2120167269);
                        i7.b.h(iVar, sVar.f885a, i13, obj5, rVar, 0);
                        rVar.q(false);
                    } else {
                        rVar.n(g8);
                    }
                    rVar.q(false);
                    rVar.t();
                    boolean h10 = rVar.h(rVar2);
                    Object M = rVar.M();
                    if (h10 || M == z0Var) {
                        M = new a0(i11, rVar2);
                        rVar.i0(M);
                    }
                    z.d(obj5, (oc.c) M, rVar);
                    break;
                } else {
                    rVar.S();
                    break;
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                break;
            case 3:
                r rVar3 = (r) obj;
                n0 n0Var = (n0) obj4;
                if ((((Number) obj2).intValue() & 3) != 2 || !rVar3.B()) {
                    n0Var.f861h.setValue(v0.k.c(rVar3));
                    ((u0.d) obj3).b(n0Var, rVar3, 0);
                    break;
                } else {
                    rVar3.S();
                    break;
                }
            case 4:
                r rVar4 = (r) obj;
                h5.d dVar = (h5.d) obj4;
                if ((((Number) obj2).intValue() & 11) != 2 || !rVar4.B()) {
                    h5.d.i(dVar, rVar4, 8);
                    rVar4.Y(-1197173186);
                    AtomicReference atomicReference = dVar.f2859i;
                    Context applicationContext = ((Context) rVar4.j(AndroidCompositionLocals_androidKt.f603b)).getApplicationContext();
                    while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                    }
                    AtomicReference atomicReference2 = dVar.f2860j;
                    Object j3 = rVar4.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    while (!atomicReference2.compareAndSet(null, j3) && atomicReference2.get() == null) {
                    }
                    rVar4.Y(1157296644);
                    boolean f10 = rVar4.f(dVar);
                    Object M2 = rVar4.M();
                    if (f10 || M2 == z0Var) {
                        M2 = bc.n.L(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().a(dVar), y3.a.f8732a.a(dVar), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().a(dVar));
                        rVar4.i0(M2);
                    }
                    rVar4.q(false);
                    rVar4.q(false);
                    v1[] v1VarArr = (v1[]) ((List) M2).toArray(new v1[0]);
                    z.b((v1[]) Arrays.copyOf(v1VarArr, v1VarArr.length), u0.e.b(rVar4, 149857323, new o0((u0.d) obj3, i11, b2)), rVar4, 56);
                    break;
                } else {
                    rVar4.S();
                    break;
                }
                break;
            case 5:
                r rVar5 = (r) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !rVar5.B()) {
                    y0.n e10 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.b.a(j0.b.f3291a, j0.b.f3292b), (c0) obj4);
                    u0.d dVar2 = (u0.d) obj3;
                    i0 a6 = g0.a(z.i.f8961c, y0.c.f8429q, rVar5, 54);
                    int o7 = z.o(rVar5);
                    r1 l10 = rVar5.l();
                    y0.n o10 = uc.e.o(rVar5, e10);
                    x1.j.f8084f.getClass();
                    x1.z zVar = x1.i.f8076b;
                    rVar5.b0();
                    if (rVar5.S) {
                        rVar5.k(zVar);
                    } else {
                        rVar5.l0();
                    }
                    z.w(a6, rVar5, x1.i.f8079e);
                    z.w(l10, rVar5, x1.i.f8078d);
                    x1.h hVar2 = x1.i.f8080f;
                    if (rVar5.S || !pc.j.a(rVar5.M(), Integer.valueOf(o7))) {
                        a4.d.p(o7, rVar5, o7, hVar2);
                    }
                    z.w(o10, rVar5, x1.i.f8077c);
                    dVar2.b(j0.f8967a, rVar5, 6);
                    rVar5.q(true);
                    break;
                } else {
                    rVar5.S();
                    break;
                }
            case 6:
                r rVar6 = (r) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !rVar6.B()) {
                    r0.a(((s0) obj4).f3472j, (u0.d) obj3, rVar6, 0);
                    break;
                } else {
                    rVar6.S();
                    break;
                }
            case 7:
                ((Number) obj2).intValue();
                r0.a((h0) obj4, (u0.d) obj3, (r) obj, z.y(1));
                break;
            case 8:
                r rVar7 = (r) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (!rVar7.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    rVar7.S();
                    break;
                } else {
                    Boolean bool = (Boolean) ((t) obj4).f7133f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    oc.e eVar = (oc.e) obj3;
                    rVar7.a0(bool);
                    boolean g10 = rVar7.g(booleanValue);
                    if (booleanValue) {
                        eVar.invoke(rVar7, 0);
                    } else {
                        rVar7.n(g10);
                    }
                    rVar7.t();
                    break;
                }
            case 9:
                ((Number) obj2).intValue();
                uc.e.a((y0.n) obj4, (oc.c) obj3, (r) obj, z.y(1));
                break;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                long j6 = ((e1.b) obj2).f1929a;
                a.a.i((s1.c) obj4, (r1.n) obj);
                ad.e eVar2 = ((x.s0) obj3).A;
                if (eVar2 != null) {
                    eVar2.s(new x.n(j6));
                    break;
                }
                break;
            case 11:
                f1.o oVar2 = (f1.o) obj;
                i1.b bVar = (i1.b) obj2;
                f1 f1Var = (f1) obj4;
                x1.g0 g0Var = f1Var.f8033u;
                if (!g0Var.H()) {
                    f1Var.N = true;
                    break;
                } else {
                    f1Var.K = oVar2;
                    f1Var.J = bVar;
                    o1 snapshotObserver = ((y1.r) x1.j0.a(g0Var)).getSnapshotObserver();
                    e0 e0Var = f1.P;
                    snapshotObserver.a(f1Var, x1.e.f8008j, (c0.h) obj3);
                    f1Var.N = false;
                    break;
                }
            default:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((y1.r) obj4, (oc.e) obj3, (r) obj, z.y(1));
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, ac.c cVar, int i10, int i11) {
        super(2);
        this.f165g = i11;
        this.f166h = obj;
        this.f167i = cVar;
    }
}
