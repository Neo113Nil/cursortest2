package b0;

import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m0.i1;
import x1.f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p0 extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f870h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i10, Object obj) {
        super(0);
        this.f869g = i10;
        this.f870h = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x012e, code lost:
    
        continue;
     */
    @Override // oc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        i4.f fVar;
        m0.y yVar;
        boolean z10;
        switch (this.f869g) {
            case 0:
                return new n0((v0.e) this.f870h, bc.w.f1068g);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ((b4.q) this.f870h).b();
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((d1.r) this.f870h).s0();
                return ac.o.f277a;
            case 3:
                f0.g gVar = (f0.g) this.f870h;
                gVar.E = null;
                x1.f.o(gVar);
                x1.f.n(gVar);
                x1.f.m(gVar);
                return Boolean.TRUE;
            case 4:
                f2.a aVar = (f2.a) this.f870h;
                aVar.f2299g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.a();
                    Trace.endSection();
                    return ac.o.f277a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 5:
                ((i0.a) this.f870h).f2940p.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return ac.o.f277a;
            case 6:
                x1.f.m((i0.b) this.f870h);
                return ac.o.f277a;
            case 7:
                i4.g gVar2 = (i4.g) this.f870h;
                Context context = gVar2.f3186g;
                String str = gVar2.f3187h;
                if (str == null || !gVar2.f3189j) {
                    fVar = new i4.f(context, gVar2.f3187h, new f8.c(16), gVar2.f3188i, gVar2.f3190k);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    pc.j.d(noBackupFilesDir, "context.noBackupFilesDir");
                    fVar = new i4.f(context, new File(noBackupFilesDir, str).getAbsolutePath(), new f8.c(16), gVar2.f3188i, gVar2.f3190k);
                }
                fVar.setWriteAheadLoggingEnabled(gVar2.f3192m);
                return fVar;
            case 8:
                ArrayList arrayList = (ArrayList) this.f870h;
                return (j5.j) (arrayList.isEmpty() ? null : arrayList.remove(0));
            case 9:
                l1.j0 j0Var = (l1.j0) this.f870h;
                int i10 = j0Var.f4049k;
                i1 i1Var = j0Var.f4046h;
                if (i10 == i1Var.g()) {
                    i1Var.h(i1Var.g() + 1);
                }
                return ac.o.f277a;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                Object systemService = ((View) ((x4.l) this.f870h).f8312h).getContext().getSystemService("input_method");
                pc.j.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 11:
                return new BaseInputConnection((View) ((x4.s) this.f870h).f8356h, false);
            case 12:
                return (yc.y) ((x4.i) this.f870h).f8306d;
            case 13:
                return ((q1.e) this.f870h).r0();
            case 14:
                return Float.valueOf(v.d.g(((yc.y) this.f870h).f()));
            case 15:
                v1.t tVar = (v1.t) this.f870h;
                if (!((Boolean) tVar.f7133f.getValue()).booleanValue() && (yVar = tVar.f7130c) != null) {
                    yVar.k();
                }
                return ac.o.f277a;
            case 16:
                v1.a0 a6 = ((v1.s0) this.f870h).a();
                x1.g0 g0Var = a6.f7052g;
                if (a6.f7065t != ((o0.b) g0Var.n()).f5128g.f5136i) {
                    s.g0 g0Var2 = a6.f7057l;
                    Object[] objArr = g0Var2.f6268c;
                    long[] jArr = g0Var2.f6266a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j3 = jArr[i11];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j3) < 128) {
                                        ((v1.t) objArr[(i11 << 3) + i13]).f7131d = true;
                                    }
                                    j3 >>= 8;
                                }
                                if (i12 != 8) {
                                }
                            }
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                    if (g0Var.f8047m != null) {
                        if (!g0Var.J.f8092e) {
                            x1.g0.R(g0Var, false, 7);
                        }
                    } else if (!g0Var.p()) {
                        x1.g0.T(g0Var, false, 7);
                    }
                }
                return ac.o.f277a;
            case 17:
                ((w.q) this.f870h).A.invoke();
                return Boolean.TRUE;
            case 18:
                w.b0 b0Var = (w.b0) this.f870h;
                d1.k kVar = d1.k.f1586j;
                y0.m mVar = b0Var.f8443g;
                o0.e eVar = null;
                while (true) {
                    z10 = false;
                    int i14 = 0;
                    if (mVar == null) {
                        if (!b0Var.f8443g.f8456t) {
                            u1.a.b("visitChildren called on an unattached node");
                        }
                        o0.e eVar2 = new o0.e(new y0.m[16]);
                        y0.m mVar2 = b0Var.f8443g;
                        y0.m mVar3 = mVar2.f8448l;
                        if (mVar3 == null) {
                            x1.f.b(eVar2, mVar2);
                        } else {
                            eVar2.b(mVar3);
                        }
                        while (true) {
                            int i15 = eVar2.f5136i;
                            if (i15 != 0) {
                                y0.m mVar4 = (y0.m) eVar2.k(i15 - 1);
                                if ((mVar4.f8446j & 1024) == 0) {
                                    x1.f.b(eVar2, mVar4);
                                } else {
                                    while (true) {
                                        if (mVar4 == null) {
                                            break;
                                        }
                                        if ((mVar4.f8445i & 1024) != 0) {
                                            o0.e eVar3 = null;
                                            while (mVar4 != null) {
                                                if (mVar4 instanceof d1.r) {
                                                    d1.r rVar = (d1.r) mVar4;
                                                    z10 = rVar.s0().f1588a ? rVar.v0(7) : d1.e.i(rVar, 7, kVar);
                                                } else {
                                                    if ((mVar4.f8445i & 1024) != 0 && (mVar4 instanceof x1.m)) {
                                                        int i16 = 0;
                                                        for (y0.m mVar5 = ((x1.m) mVar4).f8110v; mVar5 != null; mVar5 = mVar5.f8448l) {
                                                            if ((mVar5.f8445i & 1024) != 0) {
                                                                i16++;
                                                                if (i16 == 1) {
                                                                    mVar4 = mVar5;
                                                                } else {
                                                                    if (eVar3 == null) {
                                                                        eVar3 = new o0.e(new y0.m[16]);
                                                                    }
                                                                    if (mVar4 != null) {
                                                                        eVar3.b(mVar4);
                                                                        mVar4 = null;
                                                                    }
                                                                    eVar3.b(mVar5);
                                                                }
                                                            }
                                                        }
                                                        if (i16 == 1) {
                                                        }
                                                    }
                                                    mVar4 = x1.f.f(eVar3);
                                                }
                                            }
                                        } else {
                                            mVar4 = mVar4.f8448l;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (mVar instanceof d1.r) {
                        d1.r rVar2 = (d1.r) mVar;
                        z10 = rVar2.s0().f1588a ? rVar2.v0(7) : d1.e.i(rVar2, 7, kVar);
                    } else {
                        if ((mVar.f8445i & 1024) != 0 && (mVar instanceof x1.m)) {
                            for (y0.m mVar6 = ((x1.m) mVar).f8110v; mVar6 != null; mVar6 = mVar6.f8448l) {
                                if ((mVar6.f8445i & 1024) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        mVar = mVar6;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o0.e(new y0.m[16]);
                                        }
                                        if (mVar != null) {
                                            eVar.b(mVar);
                                            mVar = null;
                                        }
                                        eVar.b(mVar6);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        mVar = x1.f.f(eVar);
                    }
                }
                return Boolean.valueOf(z10);
            case 19:
                w1.c cVar = (w1.c) this.f870h;
                o0.e eVar4 = cVar.f7636c;
                o0.e eVar5 = cVar.f7635b;
                o0.e eVar6 = cVar.f7638e;
                cVar.f7639f = false;
                HashSet hashSet = new HashSet();
                o0.e eVar7 = cVar.f7637d;
                Object[] objArr2 = eVar7.f5134g;
                int i17 = eVar7.f5136i;
                for (int i18 = 0; i18 < i17; i18++) {
                    x1.g0 g0Var3 = (x1.g0) objArr2[i18];
                    w1.g gVar3 = (w1.g) eVar6.f5134g[i18];
                    y0.m mVar7 = g0Var3.I.f7991f;
                    if (mVar7.f8456t) {
                        w1.c.b(mVar7, gVar3, hashSet);
                    }
                }
                eVar7.g();
                eVar6.g();
                Object[] objArr3 = eVar5.f5134g;
                int i19 = eVar5.f5136i;
                for (int i20 = 0; i20 < i19; i20++) {
                    x1.c cVar2 = (x1.c) objArr3[i20];
                    w1.g gVar4 = (w1.g) eVar4.f5134g[i20];
                    if (cVar2.f8456t) {
                        w1.c.b(cVar2, gVar4, hashSet);
                    }
                }
                eVar5.g();
                eVar4.g();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((x1.c) it.next()).t0();
                }
                return ac.o.f277a;
            case 20:
                return (ViewParent) this.f870h;
            case 21:
                x1.k0 k0Var = ((x1.g0) this.f870h).J;
                k0Var.f8103p.E = true;
                x1.t0 t0Var = k0Var.f8104q;
                if (t0Var != null) {
                    t0Var.f8179y = true;
                }
                return ac.o.f277a;
            default:
                oc.c cVar3 = (oc.c) this.f870h;
                f1.e0 e0Var = f1.P;
                cVar3.invoke(e0Var);
                e0Var.f2241w = e0Var.f2235q.a(e0Var.f2237s, e0Var.f2239u, e0Var.f2238t);
                return ac.o.f277a;
        }
    }
}
