package com.gamericefishpro.space.d4;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.f3;
import com.gamericefishpro.space.i9.g3;
import com.gamericefishpro.space.i9.h3;
import com.gamericefishpro.space.i9.i3;
import com.gamericefishpro.space.i9.p5;
import com.gamericefishpro.space.n9.d4;
import com.gamericefishpro.space.n9.e4;
import com.gamericefishpro.space.n9.f4;
import com.gamericefishpro.space.n9.j4;
import com.gamericefishpro.space.n9.m4;
import com.gamericefishpro.space.n9.n4;
import com.gamericefishpro.space.n9.o3;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.r4;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.t4;
import com.gamericefishpro.space.n9.x1;
import com.gamericefishpro.space.n9.y1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
        this.w = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0469  */
    /* JADX WARN: Code duplicated, block: B:133:0x047e A[LOOP:1: B:131:0x0478->B:133:0x047e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x04ce A[Catch: p5 -> 0x0536, LOOP:2: B:136:0x04c4->B:138:0x04ce, LOOP_END, TryCatch #7 {p5 -> 0x0536, blocks: (B:135:0x04b7, B:136:0x04c4, B:138:0x04ce, B:139:0x0504, B:141:0x051f), top: B:173:0x04b7 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x051f A[Catch: p5 -> 0x0536, TRY_LEAVE, TryCatch #7 {p5 -> 0x0536, blocks: (B:135:0x04b7, B:136:0x04c4, B:138:0x04ce, B:139:0x0504, B:141:0x051f), top: B:173:0x04b7 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        d4 d4Var;
        f3 f3Var;
        int i;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t0.i((View) this.e, (x0) this.i, (com.gamericefishpro.space.u6.e) this.v);
                ((ValueAnimator) this.w).start();
                return;
            case 1:
                com.gamericefishpro.space.m.f fVar = (com.gamericefishpro.space.m.f) ((com.gamericefishpro.space.m.d) this.w).e;
                com.gamericefishpro.space.m.j jVar = (com.gamericefishpro.space.m.j) this.i;
                com.gamericefishpro.space.m.e eVar = (com.gamericefishpro.space.m.e) this.e;
                if (eVar != null) {
                    fVar.S = true;
                    eVar.b.c(false);
                    fVar.S = false;
                }
                if (jVar.isEnabled() && jVar.hasSubMenu()) {
                    ((com.gamericefishpro.space.m.i) this.v).p(jVar, null, 4);
                    return;
                }
                return;
            case 2:
                y1 y1Var = (y1) this.e;
                String str = (String) this.i;
                e4 e4Var = (e4) this.v;
                com.gamericefishpro.space.n9.l0 l0Var = (com.gamericefishpro.space.n9.l0) this.w;
                m4 m4Var = y1Var.d;
                m4Var.B();
                m4Var.c().r();
                m4Var.k0();
                com.gamericefishpro.space.n9.m mVar = m4Var.i;
                m4.T(mVar);
                Object obj = null;
                List<n4> listW = mVar.w(str, e4Var, ((Integer) com.gamericefishpro.space.n9.e0.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (n4 n4Var : listW) {
                    String str2 = n4Var.c;
                    long j = n4Var.h;
                    long j2 = n4Var.a;
                    if (m4Var.s(str, str2)) {
                        int i2 = n4Var.i;
                        if (i2 > 0) {
                            if (i2 <= ((Integer) com.gamericefishpro.space.n9.e0.z.a(obj)).intValue()) {
                                long jMin = Math.min(((Long) com.gamericefishpro.space.n9.e0.x.a(obj)).longValue() * (1 << (i2 - 1)), ((Long) com.gamericefishpro.space.n9.e0.y.a(obj)).longValue());
                                m4Var.e().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : n4Var.d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    long j3 = n4Var.a;
                                    g3 g3Var = n4Var.b;
                                    d4Var = new d4(j3, g3Var.a(), n4Var.c, bundle, n4Var.e.d, n4Var.g, "");
                                    try {
                                        f3Var = (f3) com.gamericefishpro.space.n9.z0.e0(g3.w(), d4Var.e);
                                        for (i = 0; i < ((g3) f3Var.e).q(); i++) {
                                            h3 h3Var = (h3) ((g3) f3Var.e).r(i).i();
                                            m4Var.e().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            h3Var.b();
                                            ((i3) h3Var.e).f0(jCurrentTimeMillis);
                                            f3Var.b();
                                            ((g3) f3Var.e).y(i, (i3) h3Var.e());
                                        }
                                        d4Var.e = ((g3) f3Var.e()).a();
                                        if (Log.isLoggable(m4Var.a().B(), 2)) {
                                            com.gamericefishpro.space.n9.z0 z0Var = m4Var.z;
                                            m4.T(z0Var);
                                            d4Var.z = z0Var.U((g3) f3Var.e());
                                        }
                                        arrayList.add(d4Var);
                                    } catch (p5 unused) {
                                        m4Var.a().B.b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            m4Var.a().G.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r8.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            long j4 = n4Var.a;
                            g3 g3Var2 = n4Var.b;
                            d4Var = new d4(j4, g3Var2.a(), n4Var.c, bundle, n4Var.e.d, n4Var.g, "");
                            f3Var = (f3) com.gamericefishpro.space.n9.z0.e0(g3.w(), d4Var.e);
                            while (i < ((g3) f3Var.e).q()) {
                                h3 h3Var2 = (h3) ((g3) f3Var.e).r(i).i();
                                m4Var.e().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                h3Var2.b();
                                ((i3) h3Var2.e).f0(jCurrentTimeMillis2);
                                f3Var.b();
                                ((g3) f3Var.e).y(i, (i3) h3Var2.e());
                            }
                            d4Var.e = ((g3) f3Var.e()).a();
                            if (Log.isLoggable(m4Var.a().B(), 2)) {
                                com.gamericefishpro.space.n9.z0 z0Var2 = m4Var.z;
                                m4.T(z0Var2);
                                d4Var.z = z0Var2.U((g3) f3Var.e());
                            }
                            arrayList.add(d4Var);
                        }
                        obj = null;
                    } else {
                        m4Var.a().G.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), n4Var.c);
                    }
                }
                try {
                    l0Var.x(new f4(arrayList));
                    m4Var.a().G.c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(arrayList.size()));
                    return;
                } catch (RemoteException e) {
                    m4Var.a().y.c("[sgtm] Failed to return upload batches for app", str, e);
                    return;
                }
            case 3:
                o3 o3VarO = ((AppMeasurementDynamiteService) this.w).d.o();
                com.gamericefishpro.space.i9.l0 l0Var2 = (com.gamericefishpro.space.i9.l0) this.e;
                com.gamericefishpro.space.n9.u uVar = (com.gamericefishpro.space.n9.u) this.i;
                String str3 = (String) this.v;
                o3VarO.r();
                o3VarO.s();
                r1 r1Var = (r1) o3VarO.d;
                r4 r4Var = r1Var.B;
                r1.j(r4Var);
                if (com.gamericefishpro.space.s8.f.b.b(((r1) r4Var.d).d, 12451000) == 0) {
                    o3VarO.F(new r0(o3VarO, uVar, str3, l0Var2, 7, false));
                    return;
                }
                com.gamericefishpro.space.n9.v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.B.a("Not bundling data. Service unavailable or out of date");
                r4 r4Var2 = r1Var.B;
                r1.j(r4Var2);
                r4Var2.c0(l0Var2, new byte[0]);
                return;
            case 4:
                y1 y1Var2 = (y1) this.e;
                Bundle bundle2 = (Bundle) this.i;
                String str4 = (String) this.v;
                t4 t4Var = (t4) this.w;
                m4 m4Var2 = y1Var2.d;
                boolean zB = m4Var2.d0().B(null, com.gamericefishpro.space.n9.e0.V0);
                if (bundle2.isEmpty() && zB) {
                    com.gamericefishpro.space.n9.m mVar2 = m4Var2.i;
                    m4.T(mVar2);
                    mVar2.r();
                    mVar2.s();
                    try {
                        mVar2.g0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        com.gamericefishpro.space.n9.v0 v0Var2 = ((r1) mVar2.d).y;
                        r1.l(v0Var2);
                        v0Var2.y.b(e2, "Error clearing default event params");
                        return;
                    }
                }
                com.gamericefishpro.space.n9.m mVar3 = m4Var2.i;
                m4.T(mVar3);
                r1 r1Var2 = (r1) mVar3.d;
                mVar3.r();
                mVar3.s();
                com.gamericefishpro.space.n9.q qVar = new com.gamericefishpro.space.n9.q((r1) mVar3.d, "", str4, "dep", 0L, 0L, bundle2);
                com.gamericefishpro.space.n9.z0 z0Var3 = mVar3.e.z;
                m4.T(z0Var3);
                byte[] bArrA = z0Var3.T(qVar).a();
                com.gamericefishpro.space.n9.v0 v0Var3 = r1Var2.y;
                r1.l(v0Var3);
                v0Var3.G.c("Saving default event parameters, appId, data size", str4, Integer.valueOf(bArrA.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrA);
                try {
                    if (mVar3.g0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        r1.l(v0Var3);
                        v0Var3.y.b(com.gamericefishpro.space.n9.v0.z(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    r1.l(v0Var3);
                    v0Var3.y.c("Error storing default event parameters. appId", com.gamericefishpro.space.n9.v0.z(str4), e3);
                }
                com.gamericefishpro.space.n9.m mVar4 = m4Var2.i;
                m4.T(mVar4);
                long j5 = t4Var.W;
                try {
                    if (mVar4.c0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) <= 0 && mVar4.c0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) > 0) {
                        com.gamericefishpro.space.n9.m mVar5 = m4Var2.i;
                        m4.T(mVar5);
                        mVar5.J(str4, Long.valueOf(j5), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    com.gamericefishpro.space.n9.v0 v0Var4 = ((r1) mVar4.d).y;
                    r1.l(v0Var4);
                    v0Var4.y.b(e4, "Error checking backfill conditions");
                    return;
                }
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                String str5 = (String) this.i;
                String str6 = (String) this.v;
                o3 o3VarO2 = ((r1) ((t2) this.w).d).o();
                AtomicReference atomicReference = (AtomicReference) this.e;
                o3VarO2.r();
                o3VarO2.s();
                o3VarO2.F(new x1(o3VarO2, atomicReference, str5, str6, o3VarO2.H(false)));
                return;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                o3 o3VarO3 = ((AppMeasurementDynamiteService) this.w).d.o();
                com.gamericefishpro.space.i9.l0 l0Var3 = (com.gamericefishpro.space.i9.l0) this.e;
                String str7 = (String) this.i;
                String str8 = (String) this.v;
                o3VarO3.r();
                o3VarO3.s();
                o3VarO3.F(new x1(o3VarO3, str7, str8, o3VarO3.H(false), l0Var3));
                return;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.i9.l0 l0Var4 = (com.gamericefishpro.space.i9.l0) this.v;
                o3 o3Var = (o3) this.w;
                byte[] bArrG = null;
                try {
                    try {
                        com.gamericefishpro.space.n9.h0 h0Var = o3Var.v;
                        if (h0Var != null) {
                            bArrG = h0Var.g((com.gamericefishpro.space.n9.u) this.e, (String) this.i);
                            o3Var.E();
                            r4 r4Var3 = ((r1) o3Var.d).B;
                            r1.j(r4Var3);
                            r4Var3.c0(l0Var4, bArrG);
                            return;
                        }
                        r1 r1Var3 = (r1) o3Var.d;
                        com.gamericefishpro.space.n9.v0 v0Var5 = r1Var3.y;
                        r1.l(v0Var5);
                        v0Var5.y.a("Discarding data. Failed to send event to service to bundle");
                        r4 r4Var4 = r1Var3.B;
                        r1.j(r4Var4);
                        r4Var4.c0(l0Var4, null);
                        return;
                    } catch (Throwable th) {
                        r4 r4Var5 = ((r1) o3Var.d).B;
                        r1.j(r4Var5);
                        r4Var5.c0(l0Var4, null);
                        throw th;
                    }
                } catch (RemoteException e5) {
                    com.gamericefishpro.space.n9.v0 v0Var6 = ((r1) o3Var.d).y;
                    r1.l(v0Var6);
                    v0Var6.y.b(e5, "Failed to send event to the service to bundle");
                }
                break;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                o3 o3Var2 = (o3) this.e;
                AtomicReference atomicReference2 = (AtomicReference) this.i;
                t4 t4Var2 = (t4) this.v;
                Bundle bundle3 = (Bundle) this.w;
                synchronized (atomicReference2) {
                    try {
                        com.gamericefishpro.space.n9.h0 h0Var2 = o3Var2.v;
                        if (h0Var2 != null) {
                            h0Var2.s(t4Var2, bundle3, new com.gamericefishpro.space.n9.g3(o3Var2, atomicReference2));
                            o3Var2.E();
                            return;
                        } else {
                            com.gamericefishpro.space.n9.v0 v0Var7 = ((r1) o3Var2.d).y;
                            r1.l(v0Var7);
                            v0Var7.y.a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e6) {
                        com.gamericefishpro.space.n9.v0 v0Var8 = ((r1) o3Var2.d).y;
                        r1.l(v0Var8);
                        v0Var8.y.b(e6, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 9:
                o3 o3Var3 = (o3) this.e;
                AtomicReference atomicReference3 = (AtomicReference) this.i;
                t4 t4Var3 = (t4) this.v;
                e4 e4Var2 = (e4) this.w;
                synchronized (atomicReference3) {
                    try {
                        com.gamericefishpro.space.n9.h0 h0Var3 = o3Var3.v;
                        if (h0Var3 != null) {
                            h0Var3.k(t4Var3, e4Var2, new com.gamericefishpro.space.n9.h3(o3Var3, atomicReference3));
                            o3Var3.E();
                            return;
                        } else {
                            com.gamericefishpro.space.n9.v0 v0Var9 = ((r1) o3Var3.d).y;
                            r1.l(v0Var9);
                            v0Var9.y.a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        com.gamericefishpro.space.n9.v0 v0Var10 = ((r1) o3Var3.d).y;
                        r1.l(v0Var10);
                        v0Var10.y.b(e7, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            case 10:
                m4 m4Var3 = ((j4) this.w).d;
                r4 r4VarJ0 = m4Var3.j0();
                m4Var3.e().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String str9 = (String) this.e;
                com.gamericefishpro.space.n9.u uVarT = r4VarJ0.T((String) this.i, (Bundle) this.v, "auto", jCurrentTimeMillis3, false);
                com.gamericefishpro.space.v8.c0.g(uVarT);
                m4Var3.h(uVarT, str9);
                return;
            default:
                com.gamericefishpro.space.w6.j jVar2 = (com.gamericefishpro.space.w6.j) this.v;
                UUID uuid = (UUID) this.e;
                String string = uuid.toString();
                com.gamericefishpro.space.l6.q qVarC = com.gamericefishpro.space.l6.q.c();
                String str10 = com.gamericefishpro.space.v6.q.c;
                Objects.toString(uuid);
                com.gamericefishpro.space.l6.g gVar = (com.gamericefishpro.space.l6.g) this.i;
                Objects.toString(gVar);
                qVarC.getClass();
                com.gamericefishpro.space.v6.q qVar2 = (com.gamericefishpro.space.v6.q) this.w;
                WorkDatabase workDatabase = qVar2.a;
                WorkDatabase workDatabase2 = qVar2.a;
                workDatabase.c();
                try {
                    com.gamericefishpro.space.u6.p pVarM = workDatabase2.B().m(string);
                    if (pVarM == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (pVarM.b == com.gamericefishpro.space.l6.y.e) {
                        com.gamericefishpro.space.u6.m mVar6 = new com.gamericefishpro.space.u6.m(string, gVar);
                        com.gamericefishpro.space.u6.n nVarA = workDatabase2.A();
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVarA.d;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                        try {
                            ((com.gamericefishpro.space.u6.b) nVarA.e).f(mVar6);
                            workDatabase_Impl.u();
                            workDatabase_Impl.q();
                        } catch (Throwable th2) {
                            workDatabase_Impl.q();
                            throw th2;
                        }
                    } else {
                        com.gamericefishpro.space.l6.q.c().e(str10, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    jVar2.i(null);
                    workDatabase2.u();
                } catch (Throwable th3) {
                    try {
                        com.gamericefishpro.space.l6.q.c().b(com.gamericefishpro.space.v6.q.c, "Error updating Worker progress", th3);
                        jVar2.j(th3);
                    } finally {
                        workDatabase2.q();
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.d = i;
        this.w = obj;
        this.e = obj2;
        this.i = obj3;
        this.v = obj4;
    }

    public r0(t2 t2Var, AtomicReference atomicReference, String str, String str2) {
        this.d = 5;
        this.e = atomicReference;
        this.i = str;
        this.v = str2;
        Objects.requireNonNull(t2Var);
        this.w = t2Var;
    }
}
