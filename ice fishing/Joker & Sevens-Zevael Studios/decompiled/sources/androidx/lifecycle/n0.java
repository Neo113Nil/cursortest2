package androidx.lifecycle;

import android.os.Bundle;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import m0.d2;
import m0.l1;
import m0.z1;
import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f692h;

    public /* synthetic */ n0(int i10, Object obj) {
        this.f691g = i10;
        this.f692h = obj;
    }

    @Override // oc.a
    public final Object invoke() {
        yc.f t3;
        Object[] objArr;
        int i10;
        switch (this.f691g) {
            case 0:
                return m0.g((y0) this.f692h);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                e4.e eVar = (e4.e) this.f692h;
                eVar.h().a(new e4.b(eVar, 0));
                return ac.o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                d2 d2Var = (d2) this.f692h;
                synchronized (d2Var.f4550b) {
                    t3 = d2Var.t();
                    if (((z1) d2Var.f4568t.getValue()).compareTo(z1.f4847h) <= 0) {
                        Throwable th = d2Var.f4552d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (t3 != null) {
                    ((yc.g) t3).resumeWith(ac.o.f277a);
                }
                return ac.o.f277a;
            case 3:
                return ((f1.n) ((f1.d0) this.f692h)).f2275g;
            case 4:
                q2.b bVar = (q2.b) this.f692h;
                l1 l1Var = bVar.f5747i;
                if (((e1.e) l1Var.getValue()).f1943a == 9205357640488583168L || e1.e.e(((e1.e) l1Var.getValue()).f1943a)) {
                    return null;
                }
                f1.n nVar = bVar.f5745g;
                long j3 = ((e1.e) l1Var.getValue()).f1943a;
                return nVar.f2275g;
            case 5:
                rd.d0 d0Var = (rd.d0) this.f692h;
                pd.a aVar = d0Var.f6130c;
                bd.e0 e0Var = aVar.f5687b;
                qd.h hVar = new qd.h();
                e0Var.getClass();
                fc.d dVar = null;
                e0Var.h(null, hVar);
                bd.e0 e0Var2 = aVar.f5689d;
                bc.v vVar = bc.v.f1067g;
                e0Var2.getClass();
                e0Var2.h(null, vVar);
                aVar.f5691f = System.currentTimeMillis();
                bd.e0 e0Var3 = d0Var.f6131d;
                e0Var3.h(null, rd.y.a((rd.y) e0Var3.getValue(), null, null, null, null, false, false, false, null, null, 15));
                r1 r1Var = d0Var.f6133f;
                if (r1Var != null) {
                    r1Var.a(null);
                }
                d0Var.f6133f = yc.a0.q(m0.h(d0Var), null, new rd.z(d0Var, dVar, 5), 3);
                return ac.o.f277a;
            case 6:
                v0.b bVar2 = (v0.b) this.f692h;
                v0.i iVar = bVar2.f7028g;
                Object obj = bVar2.f7031j;
                if (obj != null) {
                    return iVar.a(bVar2, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 7:
                v0.h hVar2 = (v0.h) this.f692h;
                Bundle e10 = bc.a0.e((ac.i[]) Arrays.copyOf(new ac.i[0], 0));
                hVar2.f7045h.i(e10);
                if (e10.isEmpty()) {
                    return null;
                }
                return e10;
            default:
                w0.t tVar = (w0.t) this.f692h;
                do {
                    synchronized (tVar.f7612g) {
                        try {
                            if (!tVar.f7608c) {
                                tVar.f7608c = true;
                                try {
                                    o0.e eVar2 = tVar.f7611f;
                                    Object[] objArr2 = eVar2.f5134g;
                                    int i11 = eVar2.f5136i;
                                    int i12 = 0;
                                    while (i12 < i11) {
                                        w0.s sVar = (w0.s) objArr2[i12];
                                        s.h0 h0Var = sVar.f7600g;
                                        oc.c cVar = sVar.f7594a;
                                        Object[] objArr3 = h0Var.f6275b;
                                        long[] jArr = h0Var.f6274a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i13 = 0;
                                            while (true) {
                                                long j6 = jArr[i13];
                                                objArr = objArr2;
                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i14 = 8;
                                                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                                                    int i16 = 0;
                                                    while (i16 < i15) {
                                                        if ((j6 & 255) < 128) {
                                                            i10 = i14;
                                                            cVar.invoke(objArr3[(i13 << 3) + i16]);
                                                        } else {
                                                            i10 = i14;
                                                        }
                                                        j6 >>= i10;
                                                        i16++;
                                                        i14 = i10;
                                                    }
                                                    if (i15 != i14) {
                                                    }
                                                }
                                                if (i13 != length) {
                                                    i13++;
                                                    objArr2 = objArr;
                                                }
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        h0Var.b();
                                        i12++;
                                        objArr2 = objArr;
                                    }
                                    tVar.f7608c = false;
                                } catch (Throwable th2) {
                                    tVar.f7608c = false;
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } while (tVar.a());
                return ac.o.f277a;
        }
    }

    public /* synthetic */ n0(f1.d0 d0Var, long j3) {
        this.f691g = 3;
        this.f692h = d0Var;
    }
}
