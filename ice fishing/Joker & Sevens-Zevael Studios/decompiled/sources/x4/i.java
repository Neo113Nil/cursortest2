package x4;

import android.database.Cursor;
import androidx.lifecycle.m0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w;
import androidx.lifecycle.x0;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import u.i0;
import u.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Object f8303a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8304b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8305c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8306d;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(long j3, long j6, hc.c cVar) {
        q1.a aVar;
        int i10;
        long j10;
        if (cVar instanceof q1.a) {
            aVar = (q1.a) cVar;
            int i11 = aVar.f5727i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f5727i = i11 - Integer.MIN_VALUE;
                q1.a aVar2 = aVar;
                Object obj = aVar2.f5725g;
                i10 = aVar2.f5727i;
                if (i10 != 0) {
                    v6.a.W(obj);
                    q1.e eVar = (q1.e) this.f8303a;
                    q1.e eVar2 = null;
                    q1.e eVar3 = (eVar == null || !eVar.f8456t) ? null : (q1.e) x1.f.k(eVar);
                    j10 = 0;
                    gc.a aVar3 = gc.a.f2559g;
                    if (eVar3 == null) {
                        q1.e eVar4 = (q1.e) this.f8304b;
                        if (eVar4 != null) {
                            aVar2.f5727i = 1;
                            obj = eVar4.s0(j3, j6, aVar2);
                        }
                    } else {
                        q1.e eVar5 = (q1.e) this.f8303a;
                        if (eVar5 != null && eVar5.f8456t) {
                            eVar2 = (q1.e) x1.f.k(eVar5);
                        }
                        if (eVar2 != null) {
                            aVar2.f5727i = 2;
                            obj = eVar2.s0(j3, j6, aVar2);
                        } else {
                            j10 = 0;
                        }
                    }
                } else if (i10 == 1) {
                    v6.a.W(obj);
                    j10 = ((s2.p) obj).f6404a;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    j10 = ((s2.p) obj).f6404a;
                }
                return new s2.p(j10);
            }
        }
        aVar = new q1.a(this, cVar);
        q1.a aVar22 = aVar;
        Object obj2 = aVar22.f5725g;
        i10 = aVar22.f5727i;
        if (i10 != 0) {
        }
        return new s2.p(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(long j3, hc.c cVar) {
        q1.b bVar;
        int i10;
        long j6;
        if (cVar instanceof q1.b) {
            bVar = (q1.b) cVar;
            int i11 = bVar.f5730i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f5730i = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f5728g;
                i10 = bVar.f5730i;
                if (i10 != 0) {
                    v6.a.W(obj);
                    q1.e eVar = (q1.e) this.f8303a;
                    q1.e eVar2 = null;
                    if (eVar != null && eVar.f8456t) {
                        eVar2 = (q1.e) x1.f.k(eVar);
                    }
                    if (eVar2 == null) {
                        j6 = 0;
                        return new s2.p(j6);
                    }
                    bVar.f5730i = 1;
                    obj = eVar2.u0(j3, bVar);
                    gc.a aVar = gc.a.f2559g;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                j6 = ((s2.p) obj).f6404a;
                return new s2.p(j6);
            }
        }
        bVar = new q1.b(this, cVar);
        Object obj2 = bVar.f5728g;
        i10 = bVar.f5730i;
        if (i10 != 0) {
        }
        j6 = ((s2.p) obj2).f6404a;
        return new s2.p(j6);
    }

    public g c(j jVar) {
        String str = jVar.f8307a;
        int i10 = jVar.f8308b;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8303a;
        b4.o a6 = b4.o.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            a6.h(1);
        } else {
            a6.c(str, 1);
        }
        a6.n(2, i10);
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            int w3 = a.a.w(m10, "work_spec_id");
            int w10 = a.a.w(m10, "generation");
            int w11 = a.a.w(m10, "system_id");
            g gVar = null;
            String string = null;
            if (m10.moveToFirst()) {
                if (!m10.isNull(w3)) {
                    string = m10.getString(w3);
                }
                gVar = new g(string, m10.getInt(w10), m10.getInt(w11));
            }
            return gVar;
        } finally {
            m10.close();
            a6.f();
        }
    }

    public v.n d(long j3, v.n nVar, v.n nVar2) {
        if (((v.n) this.f8305c) == null) {
            this.f8305c = nVar.c();
        }
        v.n nVar3 = (v.n) this.f8305c;
        if (nVar3 == null) {
            pc.j.k("velocityVector");
            throw null;
        }
        int b2 = nVar3.b();
        for (int i10 = 0; i10 < b2; i10++) {
            v.n nVar4 = (v.n) this.f8305c;
            if (nVar4 == null) {
                pc.j.k("velocityVector");
                throw null;
            }
            m7.g gVar = (m7.g) this.f8303a;
            nVar.getClass();
            long j6 = j3 / 1000000;
            i0 a6 = ((j0) gVar.f4957h).a(nVar2.a(i10));
            long j10 = a6.f6607c;
            nVar4.e(i10, (((Math.signum(a6.f6605a) * u.b.a(j10 > 0 ? j6 / j10 : 1.0f).f6562b) * a6.f6606b) / j10) * 1000.0f);
        }
        v.n nVar5 = (v.n) this.f8305c;
        if (nVar5 != null) {
            return nVar5;
        }
        pc.j.k("velocityVector");
        throw null;
    }

    public t0 e(pc.e eVar, String str) {
        t0 t0Var;
        t0 a6;
        pc.j.e(str, "key");
        synchronized (((z3.c) this.f8306d)) {
            try {
                x0 x0Var = (x0) this.f8303a;
                x0Var.getClass();
                t0Var = (t0) ((LinkedHashMap) x0Var.f733a).get(str);
                if (eVar.d(t0Var)) {
                    v0 v0Var = (v0) this.f8304b;
                    if (v0Var instanceof q0) {
                        q0 q0Var = (q0) v0Var;
                        pc.j.b(t0Var);
                        w wVar = q0Var.f707d;
                        if (wVar != null) {
                            l lVar = q0Var.f708e;
                            pc.j.b(lVar);
                            m0.a(t0Var, lVar, wVar);
                        }
                    }
                    pc.j.c(t0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    x3.c cVar = new x3.c((x3.b) this.f8305c);
                    cVar.f8286a.put(x0.f732b, str);
                    v0 v0Var2 = (v0) this.f8304b;
                    try {
                        try {
                            a6 = v0Var2.c(eVar, cVar);
                        } catch (AbstractMethodError unused) {
                            Class a8 = eVar.a();
                            pc.j.c(a8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                            a6 = v0Var2.b(a8, cVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class a10 = eVar.a();
                        pc.j.c(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                        a6 = v0Var2.a(a10);
                    }
                    t0Var = a6;
                    x0 x0Var2 = (x0) this.f8303a;
                    x0Var2.getClass();
                    pc.j.e(t0Var, "viewModel");
                    t0 t0Var2 = (t0) ((LinkedHashMap) x0Var2.f733a).put(str, t0Var);
                    if (t0Var2 != null) {
                        t0Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t0Var;
    }

    public void f(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8303a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f8304b).f(gVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }
}
