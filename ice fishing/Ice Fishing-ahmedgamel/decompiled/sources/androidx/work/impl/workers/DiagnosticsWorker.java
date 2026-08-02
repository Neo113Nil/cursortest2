package androidx.work.impl.workers;

import J0.d;
import J0.g;
import J0.p;
import J0.r;
import S0.i;
import S0.l;
import S0.q;
import S0.s;
import W0.b;
import a.AbstractC0426a;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.anythink.core.express.b.a;
import com.bumptech.glide.e;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import u0.C5060i;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        h.e(context, "context");
        h.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final p doWork() {
        C5060i c5060i;
        i iVar;
        l lVar;
        s sVar;
        WorkDatabase workDatabase = K0.p.b(getApplicationContext()).f1643c;
        h.d(workDatabase, "workManager.workDatabase");
        q t6 = workDatabase.t();
        l r9 = workDatabase.r();
        s u6 = workDatabase.u();
        i p9 = workDatabase.p();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        t6.getClass();
        C5060i a9 = C5060i.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a9.g(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t6.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            int c9 = e.c(m9, "id");
            int c10 = e.c(m9, a.f18313b);
            int c11 = e.c(m9, "worker_class_name");
            int c12 = e.c(m9, "input_merger_class_name");
            int c13 = e.c(m9, "input");
            int c14 = e.c(m9, "output");
            int c15 = e.c(m9, "initial_delay");
            int c16 = e.c(m9, "interval_duration");
            int c17 = e.c(m9, "flex_duration");
            int c18 = e.c(m9, "run_attempt_count");
            int c19 = e.c(m9, "backoff_policy");
            c5060i = a9;
            try {
                int c20 = e.c(m9, "backoff_delay_duration");
                int c21 = e.c(m9, "last_enqueue_time");
                int c22 = e.c(m9, "minimum_retention_duration");
                int c23 = e.c(m9, "schedule_requested_at");
                int c24 = e.c(m9, "run_in_foreground");
                int c25 = e.c(m9, "out_of_quota_policy");
                int c26 = e.c(m9, "period_count");
                int c27 = e.c(m9, "generation");
                int c28 = e.c(m9, "required_network_type");
                int c29 = e.c(m9, "requires_charging");
                int c30 = e.c(m9, "requires_device_idle");
                int c31 = e.c(m9, "requires_battery_not_low");
                int c32 = e.c(m9, "requires_storage_not_low");
                int c33 = e.c(m9, "trigger_content_update_delay");
                int c34 = e.c(m9, "trigger_max_content_delay");
                int c35 = e.c(m9, "content_uri_triggers");
                int i = c22;
                ArrayList arrayList = new ArrayList(m9.getCount());
                while (m9.moveToNext()) {
                    byte[] bArr = null;
                    String string = m9.isNull(c9) ? null : m9.getString(c9);
                    int i4 = AbstractC0426a.i(m9.getInt(c10));
                    String string2 = m9.isNull(c11) ? null : m9.getString(c11);
                    String string3 = m9.isNull(c12) ? null : m9.getString(c12);
                    g a10 = g.a(m9.isNull(c13) ? null : m9.getBlob(c13));
                    g a11 = g.a(m9.isNull(c14) ? null : m9.getBlob(c14));
                    long j6 = m9.getLong(c15);
                    long j9 = m9.getLong(c16);
                    long j10 = m9.getLong(c17);
                    int i6 = m9.getInt(c18);
                    int f2 = AbstractC0426a.f(m9.getInt(c19));
                    long j11 = m9.getLong(c20);
                    long j12 = m9.getLong(c21);
                    int i9 = i;
                    long j13 = m9.getLong(i9);
                    int i10 = c21;
                    int i11 = c23;
                    long j14 = m9.getLong(i11);
                    c23 = i11;
                    int i12 = c24;
                    boolean z6 = m9.getInt(i12) != 0;
                    c24 = i12;
                    int i13 = c25;
                    int h3 = AbstractC0426a.h(m9.getInt(i13));
                    c25 = i13;
                    int i14 = c26;
                    int i15 = m9.getInt(i14);
                    c26 = i14;
                    int i16 = c27;
                    int i17 = m9.getInt(i16);
                    c27 = i16;
                    int i18 = c28;
                    int g9 = AbstractC0426a.g(m9.getInt(i18));
                    c28 = i18;
                    int i19 = c29;
                    boolean z9 = m9.getInt(i19) != 0;
                    c29 = i19;
                    int i20 = c30;
                    boolean z10 = m9.getInt(i20) != 0;
                    c30 = i20;
                    int i21 = c31;
                    boolean z11 = m9.getInt(i21) != 0;
                    c31 = i21;
                    int i22 = c32;
                    boolean z12 = m9.getInt(i22) != 0;
                    c32 = i22;
                    int i23 = c33;
                    long j15 = m9.getLong(i23);
                    c33 = i23;
                    int i24 = c34;
                    long j16 = m9.getLong(i24);
                    c34 = i24;
                    int i25 = c35;
                    if (!m9.isNull(i25)) {
                        bArr = m9.getBlob(i25);
                    }
                    c35 = i25;
                    arrayList.add(new S0.p(string, i4, string2, string3, a10, a11, j6, j9, j10, new d(g9, z9, z10, z11, z12, j15, j16, AbstractC0426a.c(bArr)), i6, f2, j11, j12, j13, j14, z6, h3, i15, i17));
                    c21 = i10;
                    i = i9;
                }
                m9.close();
                c5060i.j();
                ArrayList c36 = t6.c();
                ArrayList a12 = t6.a();
                if (arrayList.isEmpty()) {
                    iVar = p9;
                    lVar = r9;
                    sVar = u6;
                } else {
                    r d9 = r.d();
                    String str = b.f3532a;
                    d9.e(str, "Recently completed work:\n\n");
                    iVar = p9;
                    lVar = r9;
                    sVar = u6;
                    r.d().e(str, b.a(lVar, sVar, iVar, arrayList));
                }
                if (!c36.isEmpty()) {
                    r d10 = r.d();
                    String str2 = b.f3532a;
                    d10.e(str2, "Running work:\n\n");
                    r.d().e(str2, b.a(lVar, sVar, iVar, c36));
                }
                if (!a12.isEmpty()) {
                    r d11 = r.d();
                    String str3 = b.f3532a;
                    d11.e(str3, "Enqueued work:\n\n");
                    r.d().e(str3, b.a(lVar, sVar, iVar, a12));
                }
                return p.a();
            } catch (Throwable th) {
                th = th;
                m9.close();
                c5060i.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c5060i = a9;
        }
    }
}
