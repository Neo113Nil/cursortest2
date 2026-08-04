package com.gamericefishpro.space.u6;

import android.database.Cursor;
import android.os.Trace;
import androidx.work.impl.WorkDatabase_Impl;
import com.gamericefishpro.space.l6.x;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.s5.v;
import com.gamericefishpro.space.t.i0;
import com.gamericefishpro.space.t.q0;
import com.gamericefishpro.space.t0.x1;
import com.gamericefishpro.space.t0.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public Object a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public q() {
        com.gamericefishpro.space.v0.e eVar = new com.gamericefishpro.space.v0.e(new y1[16]);
        this.c = eVar;
        i0 i0Var = q0.a;
        this.d = new i0();
        this.e = eVar;
        this.f = new com.gamericefishpro.space.v0.e(new Object[16]);
        this.g = new com.gamericefishpro.space.v0.e(new Function0[16]);
    }

    public static final boolean f(y1 y1Var, com.gamericefishpro.space.v0.e eVar) {
        Object[] objArr = eVar.d;
        int i = eVar.i;
        for (int i2 = 0; i2 < i; i2++) {
            x1 x1Var = ((y1) objArr[i2]).a;
            if (x1Var instanceof com.gamericefishpro.space.b1.j) {
                com.gamericefishpro.space.v0.e eVar2 = ((com.gamericefishpro.space.b1.j) x1Var).e;
                if (eVar2.k(y1Var) || f(y1Var, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a() {
        this.a = null;
        this.b = null;
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) this.c;
        eVar.g();
        ((i0) this.d).b();
        this.e = eVar;
        ((com.gamericefishpro.space.v0.e) this.f).g();
        ((com.gamericefishpro.space.v0.e) this.g).g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public void b() {
        Set set = (Set) this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                x1 x1Var = (x1) it.next();
                it.remove();
                x1Var.d();
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    public void c() {
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) this.c;
        com.gamericefishpro.space.v0.e eVar2 = (com.gamericefishpro.space.v0.e) this.f;
        Set set = (Set) this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        int i = 3;
        if (eVar2.i != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                i0 i0Var = (i0) this.h;
                int i2 = eVar2.i;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = eVar2.d[i2];
                    try {
                        if (obj instanceof y1) {
                            x1 x1Var = ((y1) obj).a;
                            set.remove(x1Var);
                            x1Var.e();
                        }
                        if (obj instanceof com.gamericefishpro.space.t0.j) {
                            if (i0Var == null || !i0Var.c(obj)) {
                                ((com.gamericefishpro.space.t0.j) obj).e();
                            } else {
                                ((com.gamericefishpro.space.t0.j) obj).d();
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        com.gamericefishpro.space.g1.e eVar3 = (com.gamericefishpro.space.g1.e) this.b;
                        if (eVar3 != null) {
                            com.gamericefishpro.space.wa.b.R(th, new com.gamericefishpro.space.e.e(i, (com.gamericefishpro.space.g1.f) eVar3, obj));
                        }
                        throw th;
                    }
                }
                Unit unit2 = Unit.a;
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (eVar.i != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.a;
                if (set2 != null) {
                    Object[] objArr = eVar.d;
                    int i3 = eVar.i;
                    for (int i4 = 0; i4 < i3; i4++) {
                        y1 y1Var = (y1) objArr[i4];
                        x1 x1Var2 = y1Var.a;
                        set2.remove(x1Var2);
                        try {
                            x1Var2.a();
                            Unit unit3 = Unit.a;
                        } catch (Throwable th3) {
                            com.gamericefishpro.space.g1.e eVar4 = (com.gamericefishpro.space.g1.e) this.b;
                            if (eVar4 != null) {
                                com.gamericefishpro.space.wa.b.R(th3, new com.gamericefishpro.space.e.e(i, (com.gamericefishpro.space.g1.f) eVar4, y1Var));
                            }
                            throw th3;
                        }
                    }
                }
                Unit unit4 = Unit.a;
                Trace.endSection();
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    public void d() {
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) this.g;
        if (eVar.i != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.d;
                int i = eVar.i;
                for (int i2 = 0; i2 < i; i2++) {
                    ((Function0) objArr[i2]).invoke();
                }
                eVar.g();
                Unit unit = Unit.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public void e(y1 y1Var) {
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) this.c;
        if (!((i0) this.d).c(y1Var)) {
            i0 i0Var = (i0) this.k;
            if (i0Var == null || !i0Var.c(y1Var)) {
                ((com.gamericefishpro.space.v0.e) this.f).b(y1Var);
                return;
            }
            return;
        }
        ((i0) this.d).l(y1Var);
        if (!((com.gamericefishpro.space.v0.e) this.e).k(y1Var) && !eVar.k(y1Var)) {
            f(y1Var, eVar);
        }
        Set set = (Set) this.a;
        if (set == null) {
            return;
        }
        set.add(y1Var.a);
    }

    public ArrayList g() throws Throwable {
        v vVar;
        v vVarB = v.b(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        vVarB.a(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            int iY = com.gamericefishpro.space.d9.h.y(cursorL, "id");
            int iY2 = com.gamericefishpro.space.d9.h.y(cursorL, "state");
            int iY3 = com.gamericefishpro.space.d9.h.y(cursorL, "worker_class_name");
            int iY4 = com.gamericefishpro.space.d9.h.y(cursorL, "input_merger_class_name");
            int iY5 = com.gamericefishpro.space.d9.h.y(cursorL, "input");
            int iY6 = com.gamericefishpro.space.d9.h.y(cursorL, "output");
            int iY7 = com.gamericefishpro.space.d9.h.y(cursorL, "initial_delay");
            int iY8 = com.gamericefishpro.space.d9.h.y(cursorL, "interval_duration");
            int iY9 = com.gamericefishpro.space.d9.h.y(cursorL, "flex_duration");
            int iY10 = com.gamericefishpro.space.d9.h.y(cursorL, "run_attempt_count");
            int iY11 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_policy");
            int iY12 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_delay_duration");
            int iY13 = com.gamericefishpro.space.d9.h.y(cursorL, "last_enqueue_time");
            vVar = vVarB;
            try {
                int iY14 = com.gamericefishpro.space.d9.h.y(cursorL, "minimum_retention_duration");
                int iY15 = com.gamericefishpro.space.d9.h.y(cursorL, "schedule_requested_at");
                int iY16 = com.gamericefishpro.space.d9.h.y(cursorL, "run_in_foreground");
                int iY17 = com.gamericefishpro.space.d9.h.y(cursorL, "out_of_quota_policy");
                int iY18 = com.gamericefishpro.space.d9.h.y(cursorL, "period_count");
                int iY19 = com.gamericefishpro.space.d9.h.y(cursorL, "generation");
                int iY20 = com.gamericefishpro.space.d9.h.y(cursorL, "required_network_type");
                int iY21 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_charging");
                int iY22 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_device_idle");
                int iY23 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_battery_not_low");
                int iY24 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_storage_not_low");
                int iY25 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_content_update_delay");
                int iY26 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_max_content_delay");
                int iY27 = com.gamericefishpro.space.d9.h.y(cursorL, "content_uri_triggers");
                int i = iY14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iY) ? null : cursorL.getString(iY);
                    y yVarC = com.gamericefishpro.space.i.a.C(cursorL.getInt(iY2));
                    String string2 = cursorL.isNull(iY3) ? null : cursorL.getString(iY3);
                    String string3 = cursorL.isNull(iY4) ? null : cursorL.getString(iY4);
                    com.gamericefishpro.space.l6.g gVarA = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY5) ? null : cursorL.getBlob(iY5));
                    com.gamericefishpro.space.l6.g gVarA2 = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY6) ? null : cursorL.getBlob(iY6));
                    long j = cursorL.getLong(iY7);
                    long j2 = cursorL.getLong(iY8);
                    long j3 = cursorL.getLong(iY9);
                    int i2 = cursorL.getInt(iY10);
                    com.gamericefishpro.space.l6.a aVarZ = com.gamericefishpro.space.i.a.z(cursorL.getInt(iY11));
                    long j4 = cursorL.getLong(iY12);
                    long j5 = cursorL.getLong(iY13);
                    int i3 = i;
                    long j6 = cursorL.getLong(i3);
                    int i4 = iY13;
                    int i5 = iY15;
                    long j7 = cursorL.getLong(i5);
                    iY15 = i5;
                    int i6 = iY16;
                    boolean z = cursorL.getInt(i6) != 0;
                    iY16 = i6;
                    int i7 = iY17;
                    x xVarB = com.gamericefishpro.space.i.a.B(cursorL.getInt(i7));
                    iY17 = i7;
                    int i8 = iY18;
                    int i9 = cursorL.getInt(i8);
                    iY18 = i8;
                    int i10 = iY19;
                    int i11 = cursorL.getInt(i10);
                    iY19 = i10;
                    int i12 = iY20;
                    com.gamericefishpro.space.l6.r rVarA = com.gamericefishpro.space.i.a.A(cursorL.getInt(i12));
                    iY20 = i12;
                    int i13 = iY21;
                    boolean z2 = cursorL.getInt(i13) != 0;
                    iY21 = i13;
                    int i14 = iY22;
                    boolean z3 = cursorL.getInt(i14) != 0;
                    iY22 = i14;
                    int i15 = iY23;
                    boolean z4 = cursorL.getInt(i15) != 0;
                    iY23 = i15;
                    int i16 = iY24;
                    boolean z5 = cursorL.getInt(i16) != 0;
                    iY24 = i16;
                    int i17 = iY25;
                    long j8 = cursorL.getLong(i17);
                    iY25 = i17;
                    int i18 = iY26;
                    long j9 = cursorL.getLong(i18);
                    iY26 = i18;
                    int i19 = iY27;
                    if (!cursorL.isNull(i19)) {
                        blob = cursorL.getBlob(i19);
                    }
                    iY27 = i19;
                    arrayList.add(new p(string, yVarC, string2, string3, gVarA, gVarA2, j, j2, j3, new com.gamericefishpro.space.l6.e(rVarA, z2, z3, z4, z5, j8, j9, com.gamericefishpro.space.i.a.m(blob)), i2, aVarZ, j4, j5, j6, j7, z, xVarB, i9, i11));
                    iY13 = i4;
                    i = i3;
                }
                cursorL.close();
                vVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = vVarB;
        }
    }

    public ArrayList h(int i) throws Throwable {
        v vVar;
        v vVarB = v.b(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        vVarB.a(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            int iY = com.gamericefishpro.space.d9.h.y(cursorL, "id");
            int iY2 = com.gamericefishpro.space.d9.h.y(cursorL, "state");
            int iY3 = com.gamericefishpro.space.d9.h.y(cursorL, "worker_class_name");
            int iY4 = com.gamericefishpro.space.d9.h.y(cursorL, "input_merger_class_name");
            int iY5 = com.gamericefishpro.space.d9.h.y(cursorL, "input");
            int iY6 = com.gamericefishpro.space.d9.h.y(cursorL, "output");
            int iY7 = com.gamericefishpro.space.d9.h.y(cursorL, "initial_delay");
            int iY8 = com.gamericefishpro.space.d9.h.y(cursorL, "interval_duration");
            int iY9 = com.gamericefishpro.space.d9.h.y(cursorL, "flex_duration");
            int iY10 = com.gamericefishpro.space.d9.h.y(cursorL, "run_attempt_count");
            int iY11 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_policy");
            int iY12 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_delay_duration");
            int iY13 = com.gamericefishpro.space.d9.h.y(cursorL, "last_enqueue_time");
            vVar = vVarB;
            try {
                int iY14 = com.gamericefishpro.space.d9.h.y(cursorL, "minimum_retention_duration");
                int iY15 = com.gamericefishpro.space.d9.h.y(cursorL, "schedule_requested_at");
                int iY16 = com.gamericefishpro.space.d9.h.y(cursorL, "run_in_foreground");
                int iY17 = com.gamericefishpro.space.d9.h.y(cursorL, "out_of_quota_policy");
                int iY18 = com.gamericefishpro.space.d9.h.y(cursorL, "period_count");
                int iY19 = com.gamericefishpro.space.d9.h.y(cursorL, "generation");
                int iY20 = com.gamericefishpro.space.d9.h.y(cursorL, "required_network_type");
                int iY21 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_charging");
                int iY22 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_device_idle");
                int iY23 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_battery_not_low");
                int iY24 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_storage_not_low");
                int iY25 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_content_update_delay");
                int iY26 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_max_content_delay");
                int iY27 = com.gamericefishpro.space.d9.h.y(cursorL, "content_uri_triggers");
                int i2 = iY14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iY) ? null : cursorL.getString(iY);
                    y yVarC = com.gamericefishpro.space.i.a.C(cursorL.getInt(iY2));
                    String string2 = cursorL.isNull(iY3) ? null : cursorL.getString(iY3);
                    String string3 = cursorL.isNull(iY4) ? null : cursorL.getString(iY4);
                    com.gamericefishpro.space.l6.g gVarA = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY5) ? null : cursorL.getBlob(iY5));
                    com.gamericefishpro.space.l6.g gVarA2 = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY6) ? null : cursorL.getBlob(iY6));
                    long j = cursorL.getLong(iY7);
                    long j2 = cursorL.getLong(iY8);
                    long j3 = cursorL.getLong(iY9);
                    int i3 = cursorL.getInt(iY10);
                    com.gamericefishpro.space.l6.a aVarZ = com.gamericefishpro.space.i.a.z(cursorL.getInt(iY11));
                    long j4 = cursorL.getLong(iY12);
                    long j5 = cursorL.getLong(iY13);
                    int i4 = i2;
                    long j6 = cursorL.getLong(i4);
                    int i5 = iY13;
                    int i6 = iY15;
                    long j7 = cursorL.getLong(i6);
                    iY15 = i6;
                    int i7 = iY16;
                    boolean z = cursorL.getInt(i7) != 0;
                    iY16 = i7;
                    int i8 = iY17;
                    x xVarB = com.gamericefishpro.space.i.a.B(cursorL.getInt(i8));
                    iY17 = i8;
                    int i9 = iY18;
                    int i10 = cursorL.getInt(i9);
                    iY18 = i9;
                    int i11 = iY19;
                    int i12 = cursorL.getInt(i11);
                    iY19 = i11;
                    int i13 = iY20;
                    com.gamericefishpro.space.l6.r rVarA = com.gamericefishpro.space.i.a.A(cursorL.getInt(i13));
                    iY20 = i13;
                    int i14 = iY21;
                    boolean z2 = cursorL.getInt(i14) != 0;
                    iY21 = i14;
                    int i15 = iY22;
                    boolean z3 = cursorL.getInt(i15) != 0;
                    iY22 = i15;
                    int i16 = iY23;
                    boolean z4 = cursorL.getInt(i16) != 0;
                    iY23 = i16;
                    int i17 = iY24;
                    boolean z5 = cursorL.getInt(i17) != 0;
                    iY24 = i17;
                    int i18 = iY25;
                    long j8 = cursorL.getLong(i18);
                    iY25 = i18;
                    int i19 = iY26;
                    long j9 = cursorL.getLong(i19);
                    iY26 = i19;
                    int i20 = iY27;
                    if (!cursorL.isNull(i20)) {
                        blob = cursorL.getBlob(i20);
                    }
                    iY27 = i20;
                    arrayList.add(new p(string, yVarC, string2, string3, gVarA, gVarA2, j, j2, j3, new com.gamericefishpro.space.l6.e(rVarA, z2, z3, z4, z5, j8, j9, com.gamericefishpro.space.i.a.m(blob)), i3, aVarZ, j4, j5, j6, j7, z, xVarB, i10, i12));
                    iY13 = i5;
                    i2 = i4;
                }
                cursorL.close();
                vVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = vVarB;
        }
    }

    public ArrayList i() throws Throwable {
        v vVar;
        v vVarB = v.b(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            int iY = com.gamericefishpro.space.d9.h.y(cursorL, "id");
            int iY2 = com.gamericefishpro.space.d9.h.y(cursorL, "state");
            int iY3 = com.gamericefishpro.space.d9.h.y(cursorL, "worker_class_name");
            int iY4 = com.gamericefishpro.space.d9.h.y(cursorL, "input_merger_class_name");
            int iY5 = com.gamericefishpro.space.d9.h.y(cursorL, "input");
            int iY6 = com.gamericefishpro.space.d9.h.y(cursorL, "output");
            int iY7 = com.gamericefishpro.space.d9.h.y(cursorL, "initial_delay");
            int iY8 = com.gamericefishpro.space.d9.h.y(cursorL, "interval_duration");
            int iY9 = com.gamericefishpro.space.d9.h.y(cursorL, "flex_duration");
            int iY10 = com.gamericefishpro.space.d9.h.y(cursorL, "run_attempt_count");
            int iY11 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_policy");
            int iY12 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_delay_duration");
            int iY13 = com.gamericefishpro.space.d9.h.y(cursorL, "last_enqueue_time");
            vVar = vVarB;
            try {
                int iY14 = com.gamericefishpro.space.d9.h.y(cursorL, "minimum_retention_duration");
                int iY15 = com.gamericefishpro.space.d9.h.y(cursorL, "schedule_requested_at");
                int iY16 = com.gamericefishpro.space.d9.h.y(cursorL, "run_in_foreground");
                int iY17 = com.gamericefishpro.space.d9.h.y(cursorL, "out_of_quota_policy");
                int iY18 = com.gamericefishpro.space.d9.h.y(cursorL, "period_count");
                int iY19 = com.gamericefishpro.space.d9.h.y(cursorL, "generation");
                int iY20 = com.gamericefishpro.space.d9.h.y(cursorL, "required_network_type");
                int iY21 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_charging");
                int iY22 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_device_idle");
                int iY23 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_battery_not_low");
                int iY24 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_storage_not_low");
                int iY25 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_content_update_delay");
                int iY26 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_max_content_delay");
                int iY27 = com.gamericefishpro.space.d9.h.y(cursorL, "content_uri_triggers");
                int i = iY14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iY) ? null : cursorL.getString(iY);
                    y yVarC = com.gamericefishpro.space.i.a.C(cursorL.getInt(iY2));
                    String string2 = cursorL.isNull(iY3) ? null : cursorL.getString(iY3);
                    String string3 = cursorL.isNull(iY4) ? null : cursorL.getString(iY4);
                    com.gamericefishpro.space.l6.g gVarA = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY5) ? null : cursorL.getBlob(iY5));
                    com.gamericefishpro.space.l6.g gVarA2 = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY6) ? null : cursorL.getBlob(iY6));
                    long j = cursorL.getLong(iY7);
                    long j2 = cursorL.getLong(iY8);
                    long j3 = cursorL.getLong(iY9);
                    int i2 = cursorL.getInt(iY10);
                    com.gamericefishpro.space.l6.a aVarZ = com.gamericefishpro.space.i.a.z(cursorL.getInt(iY11));
                    long j4 = cursorL.getLong(iY12);
                    long j5 = cursorL.getLong(iY13);
                    int i3 = i;
                    long j6 = cursorL.getLong(i3);
                    int i4 = iY13;
                    int i5 = iY15;
                    long j7 = cursorL.getLong(i5);
                    iY15 = i5;
                    int i6 = iY16;
                    boolean z = cursorL.getInt(i6) != 0;
                    iY16 = i6;
                    int i7 = iY17;
                    x xVarB = com.gamericefishpro.space.i.a.B(cursorL.getInt(i7));
                    iY17 = i7;
                    int i8 = iY18;
                    int i9 = cursorL.getInt(i8);
                    iY18 = i8;
                    int i10 = iY19;
                    int i11 = cursorL.getInt(i10);
                    iY19 = i10;
                    int i12 = iY20;
                    com.gamericefishpro.space.l6.r rVarA = com.gamericefishpro.space.i.a.A(cursorL.getInt(i12));
                    iY20 = i12;
                    int i13 = iY21;
                    boolean z2 = cursorL.getInt(i13) != 0;
                    iY21 = i13;
                    int i14 = iY22;
                    boolean z3 = cursorL.getInt(i14) != 0;
                    iY22 = i14;
                    int i15 = iY23;
                    boolean z4 = cursorL.getInt(i15) != 0;
                    iY23 = i15;
                    int i16 = iY24;
                    boolean z5 = cursorL.getInt(i16) != 0;
                    iY24 = i16;
                    int i17 = iY25;
                    long j8 = cursorL.getLong(i17);
                    iY25 = i17;
                    int i18 = iY26;
                    long j9 = cursorL.getLong(i18);
                    iY26 = i18;
                    int i19 = iY27;
                    if (!cursorL.isNull(i19)) {
                        blob = cursorL.getBlob(i19);
                    }
                    iY27 = i19;
                    arrayList.add(new p(string, yVarC, string2, string3, gVarA, gVarA2, j, j2, j3, new com.gamericefishpro.space.l6.e(rVarA, z2, z3, z4, z5, j8, j9, com.gamericefishpro.space.i.a.m(blob)), i2, aVarZ, j4, j5, j6, j7, z, xVarB, i9, i11));
                    iY13 = i4;
                    i = i3;
                }
                cursorL.close();
                vVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = vVarB;
        }
    }

    public ArrayList j() {
        v vVar;
        v vVarB = v.b(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            int iY = com.gamericefishpro.space.d9.h.y(cursorL, "id");
            int iY2 = com.gamericefishpro.space.d9.h.y(cursorL, "state");
            int iY3 = com.gamericefishpro.space.d9.h.y(cursorL, "worker_class_name");
            int iY4 = com.gamericefishpro.space.d9.h.y(cursorL, "input_merger_class_name");
            int iY5 = com.gamericefishpro.space.d9.h.y(cursorL, "input");
            int iY6 = com.gamericefishpro.space.d9.h.y(cursorL, "output");
            int iY7 = com.gamericefishpro.space.d9.h.y(cursorL, "initial_delay");
            int iY8 = com.gamericefishpro.space.d9.h.y(cursorL, "interval_duration");
            int iY9 = com.gamericefishpro.space.d9.h.y(cursorL, "flex_duration");
            int iY10 = com.gamericefishpro.space.d9.h.y(cursorL, "run_attempt_count");
            int iY11 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_policy");
            int iY12 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_delay_duration");
            int iY13 = com.gamericefishpro.space.d9.h.y(cursorL, "last_enqueue_time");
            vVar = vVarB;
            try {
                int iY14 = com.gamericefishpro.space.d9.h.y(cursorL, "minimum_retention_duration");
                int iY15 = com.gamericefishpro.space.d9.h.y(cursorL, "schedule_requested_at");
                int iY16 = com.gamericefishpro.space.d9.h.y(cursorL, "run_in_foreground");
                int iY17 = com.gamericefishpro.space.d9.h.y(cursorL, "out_of_quota_policy");
                int iY18 = com.gamericefishpro.space.d9.h.y(cursorL, "period_count");
                int iY19 = com.gamericefishpro.space.d9.h.y(cursorL, "generation");
                int iY20 = com.gamericefishpro.space.d9.h.y(cursorL, "required_network_type");
                int iY21 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_charging");
                int iY22 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_device_idle");
                int iY23 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_battery_not_low");
                int iY24 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_storage_not_low");
                int iY25 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_content_update_delay");
                int iY26 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_max_content_delay");
                int iY27 = com.gamericefishpro.space.d9.h.y(cursorL, "content_uri_triggers");
                int i = iY14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iY) ? null : cursorL.getString(iY);
                    y yVarC = com.gamericefishpro.space.i.a.C(cursorL.getInt(iY2));
                    String string2 = cursorL.isNull(iY3) ? null : cursorL.getString(iY3);
                    String string3 = cursorL.isNull(iY4) ? null : cursorL.getString(iY4);
                    com.gamericefishpro.space.l6.g gVarA = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY5) ? null : cursorL.getBlob(iY5));
                    com.gamericefishpro.space.l6.g gVarA2 = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY6) ? null : cursorL.getBlob(iY6));
                    long j = cursorL.getLong(iY7);
                    long j2 = cursorL.getLong(iY8);
                    long j3 = cursorL.getLong(iY9);
                    int i2 = cursorL.getInt(iY10);
                    com.gamericefishpro.space.l6.a aVarZ = com.gamericefishpro.space.i.a.z(cursorL.getInt(iY11));
                    long j4 = cursorL.getLong(iY12);
                    long j5 = cursorL.getLong(iY13);
                    int i3 = i;
                    long j6 = cursorL.getLong(i3);
                    int i4 = iY13;
                    int i5 = iY15;
                    long j7 = cursorL.getLong(i5);
                    iY15 = i5;
                    int i6 = iY16;
                    boolean z = cursorL.getInt(i6) != 0;
                    iY16 = i6;
                    int i7 = iY17;
                    x xVarB = com.gamericefishpro.space.i.a.B(cursorL.getInt(i7));
                    iY17 = i7;
                    int i8 = iY18;
                    int i9 = cursorL.getInt(i8);
                    iY18 = i8;
                    int i10 = iY19;
                    int i11 = cursorL.getInt(i10);
                    iY19 = i10;
                    int i12 = iY20;
                    com.gamericefishpro.space.l6.r rVarA = com.gamericefishpro.space.i.a.A(cursorL.getInt(i12));
                    iY20 = i12;
                    int i13 = iY21;
                    boolean z2 = cursorL.getInt(i13) != 0;
                    iY21 = i13;
                    int i14 = iY22;
                    boolean z3 = cursorL.getInt(i14) != 0;
                    iY22 = i14;
                    int i15 = iY23;
                    boolean z4 = cursorL.getInt(i15) != 0;
                    iY23 = i15;
                    int i16 = iY24;
                    boolean z5 = cursorL.getInt(i16) != 0;
                    iY24 = i16;
                    int i17 = iY25;
                    long j8 = cursorL.getLong(i17);
                    iY25 = i17;
                    int i18 = iY26;
                    long j9 = cursorL.getLong(i18);
                    iY26 = i18;
                    int i19 = iY27;
                    if (!cursorL.isNull(i19)) {
                        blob = cursorL.getBlob(i19);
                    }
                    iY27 = i19;
                    arrayList.add(new p(string, yVarC, string2, string3, gVarA, gVarA2, j, j2, j3, new com.gamericefishpro.space.l6.e(rVarA, z2, z3, z4, z5, j8, j9, com.gamericefishpro.space.i.a.m(blob)), i2, aVarZ, j4, j5, j6, j7, z, xVarB, i9, i11));
                    iY13 = i4;
                    i = i3;
                }
                cursorL.close();
                vVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = vVarB;
        }
    }

    public y k(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        v vVarB = v.b(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            vVarB.p(1);
        } else {
            vVarB.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            y yVarC = null;
            if (cursorL.moveToFirst()) {
                Integer numValueOf = cursorL.isNull(0) ? null : Integer.valueOf(cursorL.getInt(0));
                if (numValueOf != null) {
                    yVarC = com.gamericefishpro.space.i.a.C(numValueOf.intValue());
                }
            }
            return yVarC;
        } finally {
            cursorL.close();
            vVarB.c();
        }
    }

    public ArrayList l(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        v vVarB = v.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            vVarB.p(1);
        } else {
            vVarB.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.isNull(0) ? null : cursorL.getString(0));
            }
            return arrayList;
        } finally {
            cursorL.close();
            vVarB.c();
        }
    }

    public p m(String str) {
        v vVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        v vVarB = v.b(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            vVarB.p(1);
        } else {
            vVarB.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            int iY = com.gamericefishpro.space.d9.h.y(cursorL, "id");
            int iY2 = com.gamericefishpro.space.d9.h.y(cursorL, "state");
            int iY3 = com.gamericefishpro.space.d9.h.y(cursorL, "worker_class_name");
            int iY4 = com.gamericefishpro.space.d9.h.y(cursorL, "input_merger_class_name");
            int iY5 = com.gamericefishpro.space.d9.h.y(cursorL, "input");
            int iY6 = com.gamericefishpro.space.d9.h.y(cursorL, "output");
            int iY7 = com.gamericefishpro.space.d9.h.y(cursorL, "initial_delay");
            int iY8 = com.gamericefishpro.space.d9.h.y(cursorL, "interval_duration");
            int iY9 = com.gamericefishpro.space.d9.h.y(cursorL, "flex_duration");
            int iY10 = com.gamericefishpro.space.d9.h.y(cursorL, "run_attempt_count");
            int iY11 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_policy");
            int iY12 = com.gamericefishpro.space.d9.h.y(cursorL, "backoff_delay_duration");
            int iY13 = com.gamericefishpro.space.d9.h.y(cursorL, "last_enqueue_time");
            int iY14 = com.gamericefishpro.space.d9.h.y(cursorL, "minimum_retention_duration");
            vVar = vVarB;
            try {
                int iY15 = com.gamericefishpro.space.d9.h.y(cursorL, "schedule_requested_at");
                int iY16 = com.gamericefishpro.space.d9.h.y(cursorL, "run_in_foreground");
                int iY17 = com.gamericefishpro.space.d9.h.y(cursorL, "out_of_quota_policy");
                int iY18 = com.gamericefishpro.space.d9.h.y(cursorL, "period_count");
                int iY19 = com.gamericefishpro.space.d9.h.y(cursorL, "generation");
                int iY20 = com.gamericefishpro.space.d9.h.y(cursorL, "required_network_type");
                int iY21 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_charging");
                int iY22 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_device_idle");
                int iY23 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_battery_not_low");
                int iY24 = com.gamericefishpro.space.d9.h.y(cursorL, "requires_storage_not_low");
                int iY25 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_content_update_delay");
                int iY26 = com.gamericefishpro.space.d9.h.y(cursorL, "trigger_max_content_delay");
                int iY27 = com.gamericefishpro.space.d9.h.y(cursorL, "content_uri_triggers");
                p pVar = null;
                byte[] blob = null;
                if (cursorL.moveToFirst()) {
                    String string = cursorL.isNull(iY) ? null : cursorL.getString(iY);
                    y yVarC = com.gamericefishpro.space.i.a.C(cursorL.getInt(iY2));
                    String string2 = cursorL.isNull(iY3) ? null : cursorL.getString(iY3);
                    String string3 = cursorL.isNull(iY4) ? null : cursorL.getString(iY4);
                    com.gamericefishpro.space.l6.g gVarA = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY5) ? null : cursorL.getBlob(iY5));
                    com.gamericefishpro.space.l6.g gVarA2 = com.gamericefishpro.space.l6.g.a(cursorL.isNull(iY6) ? null : cursorL.getBlob(iY6));
                    long j = cursorL.getLong(iY7);
                    long j2 = cursorL.getLong(iY8);
                    long j3 = cursorL.getLong(iY9);
                    int i = cursorL.getInt(iY10);
                    com.gamericefishpro.space.l6.a aVarZ = com.gamericefishpro.space.i.a.z(cursorL.getInt(iY11));
                    long j4 = cursorL.getLong(iY12);
                    long j5 = cursorL.getLong(iY13);
                    long j6 = cursorL.getLong(iY14);
                    long j7 = cursorL.getLong(iY15);
                    boolean z = cursorL.getInt(iY16) != 0;
                    x xVarB = com.gamericefishpro.space.i.a.B(cursorL.getInt(iY17));
                    int i2 = cursorL.getInt(iY18);
                    int i3 = cursorL.getInt(iY19);
                    com.gamericefishpro.space.l6.r rVarA = com.gamericefishpro.space.i.a.A(cursorL.getInt(iY20));
                    boolean z2 = cursorL.getInt(iY21) != 0;
                    boolean z3 = cursorL.getInt(iY22) != 0;
                    boolean z4 = cursorL.getInt(iY23) != 0;
                    boolean z5 = cursorL.getInt(iY24) != 0;
                    long j8 = cursorL.getLong(iY25);
                    long j9 = cursorL.getLong(iY26);
                    if (!cursorL.isNull(iY27)) {
                        blob = cursorL.getBlob(iY27);
                    }
                    pVar = new p(string, yVarC, string2, string3, gVarA, gVarA2, j, j2, j3, new com.gamericefishpro.space.l6.e(rVarA, z2, z3, z4, z5, j8, j9, com.gamericefishpro.space.i.a.m(blob)), i, aVarZ, j4, j5, j6, j7, z, xVarB, i2, i3);
                }
                cursorL.close();
                vVar.c();
                return pVar;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = vVarB;
        }
    }

    public void n(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        h hVar = (h) this.j;
        com.gamericefishpro.space.e6.j jVarA = hVar.a();
        jVarA.a(1, j);
        if (str == null) {
            jVarA.p(2);
        } else {
            jVarA.i(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.q();
            hVar.d(jVarA);
        }
    }

    public void o(Set set, com.gamericefishpro.space.g1.f fVar) {
        a();
        this.a = set;
        this.b = fVar;
    }

    public void p(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        h hVar = (h) this.g;
        com.gamericefishpro.space.e6.j jVarA = hVar.a();
        jVarA.a(1, j);
        if (str == null) {
            jVarA.p(2);
        } else {
            jVarA.i(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.q();
            hVar.d(jVarA);
        }
    }

    public void q(String str, com.gamericefishpro.space.l6.g gVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        h hVar = (h) this.f;
        com.gamericefishpro.space.e6.j jVarA = hVar.a();
        byte[] bArrC = com.gamericefishpro.space.l6.g.c(gVar);
        if (bArrC == null) {
            jVarA.p(1);
        } else {
            jVarA.G(1, bArrC);
        }
        if (str == null) {
            jVarA.p(2);
        } else {
            jVarA.i(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.q();
            hVar.d(jVarA);
        }
    }

    public void r(y yVar, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        h hVar = (h) this.d;
        com.gamericefishpro.space.e6.j jVarA = hVar.a();
        jVarA.a(1, com.gamericefishpro.space.i.a.P(yVar));
        if (str == null) {
            jVarA.p(2);
        } else {
            jVarA.i(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.q();
            hVar.d(jVarA);
        }
    }

    public q(WorkDatabase_Impl database) {
        this.a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.b = new b(database, 5);
        Intrinsics.checkNotNullParameter(database, "database");
        new h(database, 8);
        this.c = new h(database, 9);
        this.d = new h(database, 10);
        this.e = new h(database, 11);
        this.f = new h(database, 12);
        this.g = new h(database, 13);
        this.h = new h(database, 14);
        this.i = new h(database, 15);
        this.j = new h(database, 4);
        this.k = new h(database, 5);
        new h(database, 6);
        new h(database, 7);
    }
}
