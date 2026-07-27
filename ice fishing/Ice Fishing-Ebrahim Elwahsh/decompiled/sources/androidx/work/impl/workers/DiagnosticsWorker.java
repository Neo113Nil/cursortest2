package androidx.work.impl.workers;

import J0.d;
import J0.q;
import K0.p;
import S0.i;
import S0.l;
import S0.s;
import W0.b;
import W2.e;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.anythink.core.express.b.a;
import com.bumptech.glide.f;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import u0.C5098i;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        h.e(context, "context");
        h.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final q doWork() {
        C5098i c5098i;
        i iVar;
        l lVar;
        s sVar;
        WorkDatabase workDatabase = p.b(getApplicationContext()).f1532c;
        h.d(workDatabase, "workManager.workDatabase");
        S0.q t9 = workDatabase.t();
        l r9 = workDatabase.r();
        s u7 = workDatabase.u();
        i p6 = workDatabase.p();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        t9.getClass();
        C5098i a9 = C5098i.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a9.h(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t9.f2939a;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            int g9 = f.g(m8, "id");
            int g10 = f.g(m8, a.f17684b);
            int g11 = f.g(m8, "worker_class_name");
            int g12 = f.g(m8, "input_merger_class_name");
            int g13 = f.g(m8, "input");
            int g14 = f.g(m8, "output");
            int g15 = f.g(m8, "initial_delay");
            int g16 = f.g(m8, "interval_duration");
            int g17 = f.g(m8, "flex_duration");
            int g18 = f.g(m8, "run_attempt_count");
            int g19 = f.g(m8, "backoff_policy");
            c5098i = a9;
            try {
                int g20 = f.g(m8, "backoff_delay_duration");
                int g21 = f.g(m8, "last_enqueue_time");
                int g22 = f.g(m8, "minimum_retention_duration");
                int g23 = f.g(m8, "schedule_requested_at");
                int g24 = f.g(m8, "run_in_foreground");
                int g25 = f.g(m8, "out_of_quota_policy");
                int g26 = f.g(m8, "period_count");
                int g27 = f.g(m8, "generation");
                int g28 = f.g(m8, "required_network_type");
                int g29 = f.g(m8, "requires_charging");
                int g30 = f.g(m8, "requires_device_idle");
                int g31 = f.g(m8, "requires_battery_not_low");
                int g32 = f.g(m8, "requires_storage_not_low");
                int g33 = f.g(m8, "trigger_content_update_delay");
                int g34 = f.g(m8, "trigger_max_content_delay");
                int g35 = f.g(m8, "content_uri_triggers");
                int i = g22;
                ArrayList arrayList = new ArrayList(m8.getCount());
                while (m8.moveToNext()) {
                    byte[] bArr = null;
                    String string = m8.isNull(g9) ? null : m8.getString(g9);
                    int k6 = e.k(m8.getInt(g10));
                    String string2 = m8.isNull(g11) ? null : m8.getString(g11);
                    String string3 = m8.isNull(g12) ? null : m8.getString(g12);
                    J0.h a10 = J0.h.a(m8.isNull(g13) ? null : m8.getBlob(g13));
                    J0.h a11 = J0.h.a(m8.isNull(g14) ? null : m8.getBlob(g14));
                    long j9 = m8.getLong(g15);
                    long j10 = m8.getLong(g16);
                    long j11 = m8.getLong(g17);
                    int i4 = m8.getInt(g18);
                    int h9 = e.h(m8.getInt(g19));
                    long j12 = m8.getLong(g20);
                    long j13 = m8.getLong(g21);
                    int i9 = i;
                    long j14 = m8.getLong(i9);
                    int i10 = g21;
                    int i11 = g23;
                    long j15 = m8.getLong(i11);
                    g23 = i11;
                    int i12 = g24;
                    boolean z8 = m8.getInt(i12) != 0;
                    g24 = i12;
                    int i13 = g25;
                    int j16 = e.j(m8.getInt(i13));
                    g25 = i13;
                    int i14 = g26;
                    int i15 = m8.getInt(i14);
                    g26 = i14;
                    int i16 = g27;
                    int i17 = m8.getInt(i16);
                    g27 = i16;
                    int i18 = g28;
                    int i19 = e.i(m8.getInt(i18));
                    g28 = i18;
                    int i20 = g29;
                    boolean z9 = m8.getInt(i20) != 0;
                    g29 = i20;
                    int i21 = g30;
                    boolean z10 = m8.getInt(i21) != 0;
                    g30 = i21;
                    int i22 = g31;
                    boolean z11 = m8.getInt(i22) != 0;
                    g31 = i22;
                    int i23 = g32;
                    boolean z12 = m8.getInt(i23) != 0;
                    g32 = i23;
                    int i24 = g33;
                    long j17 = m8.getLong(i24);
                    g33 = i24;
                    int i25 = g34;
                    long j18 = m8.getLong(i25);
                    g34 = i25;
                    int i26 = g35;
                    if (!m8.isNull(i26)) {
                        bArr = m8.getBlob(i26);
                    }
                    g35 = i26;
                    arrayList.add(new S0.p(string, k6, string2, string3, a10, a11, j9, j10, j11, new d(i19, z9, z10, z11, z12, j17, j18, e.a(bArr)), i4, h9, j12, j13, j14, j15, z8, j16, i15, i17));
                    g21 = i10;
                    i = i9;
                }
                m8.close();
                c5098i.j();
                ArrayList c4 = t9.c();
                ArrayList a12 = t9.a();
                if (arrayList.isEmpty()) {
                    iVar = p6;
                    lVar = r9;
                    sVar = u7;
                } else {
                    J0.s d2 = J0.s.d();
                    String str = b.f3414a;
                    d2.e(str, "Recently completed work:\n\n");
                    iVar = p6;
                    lVar = r9;
                    sVar = u7;
                    J0.s.d().e(str, b.a(lVar, sVar, iVar, arrayList));
                }
                if (!c4.isEmpty()) {
                    J0.s d3 = J0.s.d();
                    String str2 = b.f3414a;
                    d3.e(str2, "Running work:\n\n");
                    J0.s.d().e(str2, b.a(lVar, sVar, iVar, c4));
                }
                if (!a12.isEmpty()) {
                    J0.s d9 = J0.s.d();
                    String str3 = b.f3414a;
                    d9.e(str3, "Enqueued work:\n\n");
                    J0.s.d().e(str3, b.a(lVar, sVar, iVar, a12));
                }
                return q.a();
            } catch (Throwable th) {
                th = th;
                m8.close();
                c5098i.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c5098i = a9;
        }
    }
}
