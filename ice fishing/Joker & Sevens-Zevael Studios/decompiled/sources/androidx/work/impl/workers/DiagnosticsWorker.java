package androidx.work.impl.workers;

import a.a;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import b4.o;
import b5.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import o4.d;
import o4.e;
import o4.l;
import o4.m;
import p4.n;
import pc.j;
import u.l0;
import x4.i;
import x4.p;
import x4.q;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.e(context, "context");
        j.e(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final l a() {
        o oVar;
        i iVar;
        x4.l lVar;
        s sVar;
        WorkDatabase workDatabase = n.a(getApplicationContext()).f5495c;
        j.d(workDatabase, "workManager.workDatabase");
        q t3 = workDatabase.t();
        x4.l r5 = workDatabase.r();
        s u10 = workDatabase.u();
        i p8 = workDatabase.p();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        t3.getClass();
        o a6 = o.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        a6.n(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t3.f8342a;
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            int w3 = a.w(m10, "id");
            int w10 = a.w(m10, "state");
            int w11 = a.w(m10, "worker_class_name");
            int w12 = a.w(m10, "input_merger_class_name");
            int w13 = a.w(m10, "input");
            int w14 = a.w(m10, "output");
            int w15 = a.w(m10, "initial_delay");
            int w16 = a.w(m10, "interval_duration");
            int w17 = a.w(m10, "flex_duration");
            int w18 = a.w(m10, "run_attempt_count");
            int w19 = a.w(m10, "backoff_policy");
            oVar = a6;
            try {
                int w20 = a.w(m10, "backoff_delay_duration");
                int w21 = a.w(m10, "last_enqueue_time");
                int w22 = a.w(m10, "minimum_retention_duration");
                int w23 = a.w(m10, "schedule_requested_at");
                int w24 = a.w(m10, "run_in_foreground");
                int w25 = a.w(m10, "out_of_quota_policy");
                int w26 = a.w(m10, "period_count");
                int w27 = a.w(m10, "generation");
                int w28 = a.w(m10, "required_network_type");
                int w29 = a.w(m10, "requires_charging");
                int w30 = a.w(m10, "requires_device_idle");
                int w31 = a.w(m10, "requires_battery_not_low");
                int w32 = a.w(m10, "requires_storage_not_low");
                int w33 = a.w(m10, "trigger_content_update_delay");
                int w34 = a.w(m10, "trigger_max_content_delay");
                int w35 = a.w(m10, "content_uri_triggers");
                int i10 = w22;
                ArrayList arrayList = new ArrayList(m10.getCount());
                while (m10.moveToNext()) {
                    byte[] bArr = null;
                    String string = m10.isNull(w3) ? null : m10.getString(w3);
                    int l10 = l0.l(m10.getInt(w10));
                    String string2 = m10.isNull(w11) ? null : m10.getString(w11);
                    String string3 = m10.isNull(w12) ? null : m10.getString(w12);
                    e a8 = e.a(m10.isNull(w13) ? null : m10.getBlob(w13));
                    e a10 = e.a(m10.isNull(w14) ? null : m10.getBlob(w14));
                    long j3 = m10.getLong(w15);
                    long j6 = m10.getLong(w16);
                    long j10 = m10.getLong(w17);
                    int i11 = m10.getInt(w18);
                    int i12 = l0.i(m10.getInt(w19));
                    long j11 = m10.getLong(w20);
                    long j12 = m10.getLong(w21);
                    int i13 = i10;
                    long j13 = m10.getLong(i13);
                    int i14 = w21;
                    int i15 = w23;
                    long j14 = m10.getLong(i15);
                    w23 = i15;
                    int i16 = w24;
                    boolean z10 = m10.getInt(i16) != 0;
                    w24 = i16;
                    int i17 = w25;
                    int k3 = l0.k(m10.getInt(i17));
                    w25 = i17;
                    int i18 = w26;
                    int i19 = m10.getInt(i18);
                    w26 = i18;
                    int i20 = w27;
                    int i21 = m10.getInt(i20);
                    w27 = i20;
                    int i22 = w28;
                    int j15 = l0.j(m10.getInt(i22));
                    w28 = i22;
                    int i23 = w29;
                    boolean z11 = m10.getInt(i23) != 0;
                    w29 = i23;
                    int i24 = w30;
                    boolean z12 = m10.getInt(i24) != 0;
                    w30 = i24;
                    int i25 = w31;
                    boolean z13 = m10.getInt(i25) != 0;
                    w31 = i25;
                    int i26 = w32;
                    boolean z14 = m10.getInt(i26) != 0;
                    w32 = i26;
                    int i27 = w33;
                    long j16 = m10.getLong(i27);
                    w33 = i27;
                    int i28 = w34;
                    long j17 = m10.getLong(i28);
                    w34 = i28;
                    int i29 = w35;
                    if (!m10.isNull(i29)) {
                        bArr = m10.getBlob(i29);
                    }
                    w35 = i29;
                    arrayList.add(new p(string, l10, string2, string3, a8, a10, j3, j6, j10, new d(j15, z11, z12, z13, z14, j16, j17, l0.d(bArr)), i11, i12, j11, j12, j13, j14, z10, k3, i19, i21));
                    w21 = i14;
                    i10 = i13;
                }
                m10.close();
                oVar.f();
                ArrayList g8 = t3.g();
                ArrayList e10 = t3.e();
                if (arrayList.isEmpty()) {
                    iVar = p8;
                    lVar = r5;
                    sVar = u10;
                } else {
                    o4.o d10 = o4.o.d();
                    String str = b.f1016a;
                    d10.e(str, "Recently completed work:\n\n");
                    iVar = p8;
                    lVar = r5;
                    sVar = u10;
                    o4.o.d().e(str, b.a(lVar, sVar, iVar, arrayList));
                }
                if (!g8.isEmpty()) {
                    o4.o d11 = o4.o.d();
                    String str2 = b.f1016a;
                    d11.e(str2, "Running work:\n\n");
                    o4.o.d().e(str2, b.a(lVar, sVar, iVar, g8));
                }
                if (!e10.isEmpty()) {
                    o4.o d12 = o4.o.d();
                    String str3 = b.f1016a;
                    d12.e(str3, "Enqueued work:\n\n");
                    o4.o.d().e(str3, b.a(lVar, sVar, iVar, e10));
                }
                return m.a();
            } catch (Throwable th) {
                th = th;
                m10.close();
                oVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = a6;
        }
    }
}
