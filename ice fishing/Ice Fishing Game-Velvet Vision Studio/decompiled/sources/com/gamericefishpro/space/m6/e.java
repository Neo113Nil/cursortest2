package com.gamericefishpro.space.m6;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.d0;
import com.gamericefishpro.space.i9.l0;
import com.gamericefishpro.space.i9.p0;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.n9.d2;
import com.gamericefishpro.space.n9.f1;
import com.gamericefishpro.space.n9.f2;
import com.gamericefishpro.space.n9.h0;
import com.gamericefishpro.space.n9.l1;
import com.gamericefishpro.space.n9.l4;
import com.gamericefishpro.space.n9.m4;
import com.gamericefishpro.space.n9.n4;
import com.gamericefishpro.space.n9.o3;
import com.gamericefishpro.space.n9.o4;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.r3;
import com.gamericefishpro.space.n9.r4;
import com.gamericefishpro.space.n9.t;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.t4;
import com.gamericefishpro.space.n9.u;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.y1;
import com.gamericefishpro.space.n9.z0;
import com.gamericefishpro.space.v8.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int d;
    public Object e;
    public Object i;
    public Object v;

    public /* synthetic */ e(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:152:0x03de  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x0404  */
    /* JADX WARN: Code duplicated, block: B:160:0x045a A[Catch: SQLiteException -> 0x0465, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0465, blocks: (B:158:0x043b, B:160:0x045a), top: B:253:0x043b }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0489  */
    /* JADX WARN: Code duplicated, block: B:168:0x048b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0493  */
    /* JADX WARN: Code duplicated, block: B:171:0x049c  */
    /* JADX WARN: Code duplicated, block: B:176:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zBooleanValue;
        t tVar;
        Cursor cursorQuery;
        long j;
        int i;
        n4 n4Var;
        String str;
        int i2;
        l4 l4Var;
        com.gamericefishpro.space.n9.m mVar;
        Long lValueOf;
        ContentValues contentValues;
        v0 v0Var;
        AtomicReference atomicReference;
        r4 r4Var;
        int i3;
        com.gamericefishpro.space.r9.o oVarG;
        int i4 = 0;
        String strC = null;
        Object objCall = null;
        strC = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    zBooleanValue = ((Boolean) ((com.gamericefishpro.space.va.b) this.v).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                ((f) this.e).f((com.gamericefishpro.space.u6.j) this.i, zBooleanValue);
                return;
            case 1:
                t4 t4Var = (t4) this.i;
                m4 m4Var = ((y1) this.v).d;
                m4Var.B();
                com.gamericefishpro.space.n9.e eVar = (com.gamericefishpro.space.n9.e) this.e;
                if (eVar.i.b() == null) {
                    m4Var.Z(eVar, t4Var);
                    return;
                } else {
                    m4Var.Y(eVar, t4Var);
                    return;
                }
            case 2:
                u uVar = (u) this.e;
                t4 t4Var2 = (t4) this.i;
                y1 y1Var = (y1) this.v;
                y1Var.getClass();
                m4 m4Var2 = y1Var.d;
                if ("_cmp".equals(uVar.d) && (tVar = uVar.e) != null) {
                    Bundle bundle = tVar.d;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            m4Var2.a().E.b(uVar.toString(), "Event has been filtered ");
                            uVar = new u("_cmpx", tVar, uVar.i, uVar.v);
                        }
                    }
                }
                String str2 = uVar.d;
                l1 l1Var = m4Var2.d;
                z0 z0Var = m4Var2.z;
                m4.T(l1Var);
                String str3 = t4Var2.d;
                d0 d0Var = TextUtils.isEmpty(str3) ? null : (d0) l1Var.C.d(str3);
                if (d0Var == null) {
                    m4Var2.a().G.b(t4Var2.d, "EES not loaded for");
                    m4Var2.B();
                    m4Var2.j(uVar, t4Var2);
                    return;
                }
                try {
                    com.gamericefishpro.space.a8.c cVar = d0Var.c;
                    m4.T(z0Var);
                    HashMap mapH0 = z0.h0(uVar.e.f(), true);
                    String strG = f2.g(str2, f2.c, f2.a);
                    if (strG == null) {
                        strG = str2;
                    }
                    if (d0Var.a(new com.gamericefishpro.space.i9.b(strG, uVar.v, mapH0))) {
                        if (((com.gamericefishpro.space.i9.b) cVar.i).equals((com.gamericefishpro.space.i9.b) cVar.e)) {
                            m4Var2.B();
                            m4Var2.j(uVar, t4Var2);
                        } else {
                            m4Var2.a().G.b(str2, "EES edited event");
                            m4.T(z0Var);
                            u uVarV = z0.v((com.gamericefishpro.space.i9.b) cVar.i);
                            m4Var2.B();
                            m4Var2.j(uVarV, t4Var2);
                        }
                        if (((ArrayList) cVar.v).isEmpty()) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) cVar.v;
                        int size = arrayList.size();
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            com.gamericefishpro.space.i9.b bVar = (com.gamericefishpro.space.i9.b) obj;
                            m4Var2.a().G.b(bVar.a, "EES logging created event");
                            m4.T(z0Var);
                            u uVarV2 = z0.v(bVar);
                            m4Var2.B();
                            m4Var2.j(uVarV2, t4Var2);
                        }
                        return;
                    }
                } catch (p0 unused2) {
                    m4Var2.a().y.c("EES error. appId, eventName", t4Var2.e, str2);
                }
                m4Var2.a().G.b(str2, "EES was not applied to event");
                m4Var2.B();
                m4Var2.j(uVar, t4Var2);
                return;
            case 3:
                y1 y1Var2 = (y1) this.v;
                y1Var2.d.B();
                y1Var2.d.h((u) this.e, (String) this.i);
                return;
            case 4:
                t4 t4Var3 = (t4) this.i;
                m4 m4Var3 = ((y1) this.v).d;
                m4Var3.B();
                o4 o4Var = (o4) this.e;
                if (o4Var.b() == null) {
                    m4Var3.W(o4Var.e, t4Var3);
                    return;
                } else {
                    m4Var3.V(o4Var, t4Var3);
                    return;
                }
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                y1 y1Var3 = (y1) this.e;
                t4 t4Var4 = (t4) this.i;
                com.gamericefishpro.space.n9.d dVar = (com.gamericefishpro.space.n9.d) this.v;
                m4 m4Var4 = y1Var3.d;
                m4Var4.B();
                String str4 = t4Var4.d;
                c0.g(str4);
                HashMap map = m4Var4.X;
                m4Var4.c().r();
                m4Var4.k0();
                com.gamericefishpro.space.n9.m mVar2 = m4Var4.i;
                m4.T(mVar2);
                long j2 = dVar.d;
                long j3 = dVar.i;
                mVar2.r();
                mVar2.s();
                int i5 = 4;
                try {
                    cursorQuery = mVar2.g0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(1);
                                c0.g(string2);
                                j = j3;
                                try {
                                    try {
                                        try {
                                            try {
                                                i5 = 4;
                                                j = j;
                                                i = 3;
                                                try {
                                                    n4 n4VarS = mVar2.S(string2, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                    cursorQuery.close();
                                                    n4Var = n4VarS;
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    v0 v0Var2 = ((r1) mVar2.d).y;
                                                    r1.l(v0Var2);
                                                    v0Var2.y.c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    n4Var = null;
                                                }
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                i = 3;
                                                i5 = 4;
                                                v0 v0Var3 = ((r1) mVar2.d).y;
                                                r1.l(v0Var3);
                                                v0Var3.y.c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                n4Var = null;
                                                if (n4Var == null) {
                                                    m4Var4.a().B.c("[sgtm] Queued batch doesn't exist. appId, rowId", str4, Long.valueOf(j2));
                                                    return;
                                                }
                                                str = n4Var.c;
                                                i2 = dVar.e;
                                                if (i2 != 1) {
                                                    if (i2 == i) {
                                                        l4Var = (l4) map.get(str);
                                                        if (l4Var == null) {
                                                            l4Var = new l4(m4Var4);
                                                            map.put(str, l4Var);
                                                        } else {
                                                            l4Var.b++;
                                                            l4Var.c = l4Var.a();
                                                        }
                                                        m4Var4.e().getClass();
                                                        m4Var4.a().G.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((l4Var.c - System.currentTimeMillis()) / 1000));
                                                    }
                                                    com.gamericefishpro.space.n9.m mVar3 = m4Var4.i;
                                                    m4.T(mVar3);
                                                    Long lValueOf2 = Long.valueOf(dVar.d);
                                                    mVar3.D(lValueOf2);
                                                    m4Var4.a().G.c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str4, lValueOf2);
                                                    return;
                                                }
                                                if (map.containsKey(str)) {
                                                    map.remove(str);
                                                }
                                                com.gamericefishpro.space.n9.m mVar4 = m4Var4.i;
                                                m4.T(mVar4);
                                                Long lValueOf3 = Long.valueOf(j2);
                                                mVar4.y(lValueOf3);
                                                m4Var4.a().G.c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str4, lValueOf3);
                                                if (j > 0) {
                                                    mVar = m4Var4.i;
                                                    m4.T(mVar);
                                                    r1 r1Var = (r1) mVar.d;
                                                    mVar.r();
                                                    mVar.s();
                                                    lValueOf = Long.valueOf(j);
                                                    contentValues = new ContentValues();
                                                    contentValues.put("upload_type", (Integer) 1);
                                                    com.gamericefishpro.space.z8.a aVar = r1Var.D;
                                                    v0Var = r1Var.y;
                                                    aVar.getClass();
                                                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                    try {
                                                        if (mVar.g0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i5)}) != 1) {
                                                            r1.l(v0Var);
                                                            v0Var.B.c("Google Signal pending batch not updated. appId, rowId", str4, lValueOf);
                                                            break;
                                                        }
                                                        m4Var4.a().G.c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str4, Long.valueOf(j));
                                                        m4Var4.t(str4);
                                                        return;
                                                    } catch (SQLiteException e3) {
                                                        r1.l(v0Var);
                                                        v0Var.y.d("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e3);
                                                        throw e3;
                                                    }
                                                }
                                                return;
                                            }
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            i = 3;
                                        }
                                    } catch (SQLiteException e5) {
                                        e = e5;
                                        i = 3;
                                        j = j;
                                        v0 v0Var4 = ((r1) mVar2.d).y;
                                        r1.l(v0Var4);
                                        v0Var4.y.c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        n4Var = null;
                                        if (n4Var == null) {
                                            m4Var4.a().B.c("[sgtm] Queued batch doesn't exist. appId, rowId", str4, Long.valueOf(j2));
                                            return;
                                        }
                                        str = n4Var.c;
                                        i2 = dVar.e;
                                        if (i2 != 1) {
                                            if (i2 == i) {
                                                l4Var = (l4) map.get(str);
                                                if (l4Var == null) {
                                                    l4Var = new l4(m4Var4);
                                                    map.put(str, l4Var);
                                                } else {
                                                    l4Var.b++;
                                                    l4Var.c = l4Var.a();
                                                }
                                                m4Var4.e().getClass();
                                                m4Var4.a().G.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((l4Var.c - System.currentTimeMillis()) / 1000));
                                            }
                                            com.gamericefishpro.space.n9.m mVar5 = m4Var4.i;
                                            m4.T(mVar5);
                                            Long lValueOf4 = Long.valueOf(dVar.d);
                                            mVar5.D(lValueOf4);
                                            m4Var4.a().G.c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str4, lValueOf4);
                                            return;
                                        }
                                        if (map.containsKey(str)) {
                                            map.remove(str);
                                        }
                                        com.gamericefishpro.space.n9.m mVar6 = m4Var4.i;
                                        m4.T(mVar6);
                                        Long lValueOf5 = Long.valueOf(j2);
                                        mVar6.y(lValueOf5);
                                        m4Var4.a().G.c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str4, lValueOf5);
                                        if (j > 0) {
                                            mVar = m4Var4.i;
                                            m4.T(mVar);
                                            r1 r1Var2 = (r1) mVar.d;
                                            mVar.r();
                                            mVar.s();
                                            lValueOf = Long.valueOf(j);
                                            contentValues = new ContentValues();
                                            contentValues.put("upload_type", (Integer) 1);
                                            com.gamericefishpro.space.z8.a aVar2 = r1Var2.D;
                                            v0Var = r1Var2.y;
                                            aVar2.getClass();
                                            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                            if (mVar.g0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i5)}) != 1) {
                                                r1.l(v0Var);
                                                v0Var.B.c("Google Signal pending batch not updated. appId, rowId", str4, lValueOf);
                                                break;
                                            }
                                            m4Var4.a().G.c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str4, Long.valueOf(j));
                                            m4Var4.t(str4);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    i = 3;
                                }
                            } else {
                                i5 = 4;
                                j = j3;
                                i = 3;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                n4Var = null;
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            i5 = 4;
                            j = j3;
                            i = 3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    i5 = 4;
                    j = j3;
                    i = 3;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursorQuery = null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
                if (n4Var == null) {
                    m4Var4.a().B.c("[sgtm] Queued batch doesn't exist. appId, rowId", str4, Long.valueOf(j2));
                    return;
                }
                str = n4Var.c;
                i2 = dVar.e;
                if (i2 != 1) {
                    if (i2 == i) {
                        l4Var = (l4) map.get(str);
                        if (l4Var == null) {
                            l4Var = new l4(m4Var4);
                            map.put(str, l4Var);
                        } else {
                            l4Var.b++;
                            l4Var.c = l4Var.a();
                        }
                        m4Var4.e().getClass();
                        m4Var4.a().G.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((l4Var.c - System.currentTimeMillis()) / 1000));
                    }
                    com.gamericefishpro.space.n9.m mVar7 = m4Var4.i;
                    m4.T(mVar7);
                    Long lValueOf6 = Long.valueOf(dVar.d);
                    mVar7.D(lValueOf6);
                    m4Var4.a().G.c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str4, lValueOf6);
                    return;
                }
                if (map.containsKey(str)) {
                    map.remove(str);
                }
                com.gamericefishpro.space.n9.m mVar8 = m4Var4.i;
                m4.T(mVar8);
                Long lValueOf7 = Long.valueOf(j2);
                mVar8.y(lValueOf7);
                m4Var4.a().G.c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str4, lValueOf7);
                if (j > 0) {
                    mVar = m4Var4.i;
                    m4.T(mVar);
                    r1 r1Var3 = (r1) mVar.d;
                    mVar.r();
                    mVar.s();
                    lValueOf = Long.valueOf(j);
                    contentValues = new ContentValues();
                    contentValues.put("upload_type", (Integer) 1);
                    com.gamericefishpro.space.z8.a aVar3 = r1Var3.D;
                    v0Var = r1Var3.y;
                    aVar3.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    if (mVar.g0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i5)}) != 1) {
                        r1.l(v0Var);
                        v0Var.B.c("Google Signal pending batch not updated. appId, rowId", str4, lValueOf);
                        break;
                    }
                    m4Var4.a().G.c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str4, Long.valueOf(j));
                    m4Var4.t(str4);
                    return;
                }
                return;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                AtomicReference atomicReference2 = (AtomicReference) this.e;
                synchronized (atomicReference2) {
                    try {
                        try {
                            o3 o3Var = (o3) this.v;
                            r1 r1Var4 = (r1) o3Var.d;
                            f1 f1Var = r1Var4.w;
                            r1.j(f1Var);
                            if (f1Var.y().i(d2.ANALYTICS_STORAGE)) {
                                h0 h0Var = o3Var.v;
                                if (h0Var != null) {
                                    atomicReference2.set(h0Var.C((t4) this.i));
                                    String str5 = (String) atomicReference2.get();
                                    if (str5 != null) {
                                        t2 t2Var = ((r1) o3Var.d).F;
                                        r1.k(t2Var);
                                        t2Var.z.set(str5);
                                        f1 f1Var2 = r1Var4.w;
                                        r1.j(f1Var2);
                                        f1Var2.z.e(str5);
                                    }
                                    o3Var.E();
                                    atomicReference = (AtomicReference) this.e;
                                    atomicReference.notify();
                                    return;
                                }
                                v0 v0Var5 = r1Var4.y;
                                r1.l(v0Var5);
                                v0Var5.y.a("Failed to get app instance id");
                            } else {
                                v0 v0Var6 = r1Var4.y;
                                r1.l(v0Var6);
                                v0Var6.D.a("Analytics storage consent denied; will not get app instance id");
                                t2 t2Var2 = ((r1) o3Var.d).F;
                                r1.k(t2Var2);
                                t2Var2.z.set(null);
                                f1 f1Var3 = r1Var4.w;
                                r1.j(f1Var3);
                                f1Var3.z.e(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e9) {
                            v0 v0Var7 = ((r1) ((o3) this.v).d).y;
                            r1.l(v0Var7);
                            v0Var7.y.b(e9, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.e;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.e).notify();
                        throw th3;
                    }
                }
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                l0 l0Var = (l0) this.i;
                o3 o3Var2 = (o3) this.v;
                try {
                    try {
                        r1 r1Var5 = (r1) o3Var2.d;
                        f1 f1Var4 = r1Var5.w;
                        v0 v0Var8 = r1Var5.y;
                        r1.j(f1Var4);
                        if (f1Var4.y().i(d2.ANALYTICS_STORAGE)) {
                            h0 h0Var2 = o3Var2.v;
                            if (h0Var2 != null) {
                                strC = h0Var2.C((t4) this.e);
                                if (strC != null) {
                                    t2 t2Var3 = r1Var5.F;
                                    r1.k(t2Var3);
                                    t2Var3.z.set(strC);
                                    r1.j(f1Var4);
                                    f1Var4.z.e(strC);
                                }
                                o3Var2.E();
                                r4Var = ((r1) o3Var2.d).B;
                                r1.j(r4Var);
                                r4Var.Z(strC, l0Var);
                                return;
                            }
                            r1.l(v0Var8);
                            v0Var8.y.a("Failed to get app instance id");
                        } else {
                            r1.l(v0Var8);
                            v0Var8.D.a("Analytics storage consent denied; will not get app instance id");
                            t2 t2Var4 = r1Var5.F;
                            r1.k(t2Var4);
                            t2Var4.z.set(null);
                            r1.j(f1Var4);
                            f1Var4.z.e(null);
                        }
                        r4Var = r1Var5.B;
                    } catch (Throwable th4) {
                        r4 r4Var2 = ((r1) o3Var2.d).B;
                        r1.j(r4Var2);
                        r4Var2.Z(null, l0Var);
                        throw th4;
                    }
                } catch (RemoteException e10) {
                    v0 v0Var9 = ((r1) o3Var2.d).y;
                    r1.l(v0Var9);
                    v0Var9.y.b(e10, "Failed to get app instance id");
                }
                r1.j(r4Var);
                r4Var.Z(strC, l0Var);
                return;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                o3 o3Var3 = (o3) this.e;
                t4 t4Var5 = (t4) this.i;
                com.gamericefishpro.space.n9.d dVar2 = (com.gamericefishpro.space.n9.d) this.v;
                r1 r1Var6 = (r1) o3Var3.d;
                h0 h0Var3 = o3Var3.v;
                if (h0Var3 == null) {
                    v0 v0Var10 = r1Var6.y;
                    r1.l(v0Var10);
                    v0Var10.y.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    h0Var3.q(t4Var5, dVar2);
                    o3Var3.E();
                    return;
                } catch (RemoteException e11) {
                    v0 v0Var11 = r1Var6.y;
                    r1.l(v0Var11);
                    v0Var11.y.c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(dVar2.d), e11);
                    return;
                }
            case 9:
                com.gamericefishpro.space.m.d dVar3 = (com.gamericefishpro.space.m.d) this.e;
                v0 v0Var12 = (v0) this.i;
                JobParameters jobParameters = (JobParameters) this.v;
                v0Var12.G.a("AppMeasurementJobService processed last upload request.");
                ((r3) ((Service) dVar3.e)).c(jobParameters);
                return;
            case 10:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.v;
                Context context = (Context) this.i;
                Intent intent = (Intent) this.e;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    q qVarC = q.c();
                    int i6 = ConstraintProxyUpdateReceiver.a;
                    qVarC.getClass();
                    com.gamericefishpro.space.v6.j.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    com.gamericefishpro.space.v6.j.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    com.gamericefishpro.space.v6.j.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    com.gamericefishpro.space.v6.j.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.r8.a aVar4 = (com.gamericefishpro.space.r8.a) this.i;
                Intent intent2 = aVar4.d;
                String stringExtra = intent2.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    oVarG = com.gamericefishpro.space.d9.h.w(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent3 = aVar4.d;
                    String stringExtra2 = intent3.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent3.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent4 = aVar4.d;
                    Integer numValueOf = intent4.hasExtra("google.product_id") ? Integer.valueOf(intent4.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle2.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context2 = (Context) this.e;
                    bundle2.putBoolean("supports_message_handled", true);
                    com.gamericefishpro.space.r8.m mVarF = com.gamericefishpro.space.r8.m.f(context2);
                    synchronized (mVarF) {
                        i3 = mVarF.a;
                        mVarF.a = i3 + 1;
                    }
                    oVarG = mVarF.g(new com.gamericefishpro.space.r8.l(i3, 2, bundle2, 0));
                }
                oVarG.b(com.gamericefishpro.space.r8.h.e, new com.gamericefishpro.space.r8.i((CountDownLatch) this.v));
                return;
            case 12:
                ((o) this.e).f.h((j) this.i, (com.gamericefishpro.space.a8.c) this.v);
                return;
            default:
                try {
                    objCall = ((com.gamericefishpro.space.z3.d) this.e).call();
                    break;
                } catch (Exception unused3) {
                }
                ((Handler) this.v).post(new com.gamericefishpro.space.r9.l(11, (com.gamericefishpro.space.z3.e) this.i, objCall, null == true ? 1 : 0));
                return;
        }
    }

    public /* synthetic */ e(Object obj, com.gamericefishpro.space.w8.a aVar, Object obj2, int i) {
        this.d = i;
        this.e = aVar;
        this.i = obj2;
        this.v = obj;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }

    public e(o3 o3Var, AtomicReference atomicReference, t4 t4Var) {
        this.d = 6;
        this.e = atomicReference;
        this.i = t4Var;
        Objects.requireNonNull(o3Var);
        this.v = o3Var;
    }
}
