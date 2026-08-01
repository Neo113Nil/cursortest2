package androidx.work.impl.workers;

import J0.d;
import J0.q;
import K0.p;
import L3.F;
import S0.i;
import S0.l;
import S0.s;
import W0.b;
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
import u0.C5059i;

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
        C5059i c5059i;
        i iVar;
        l lVar;
        s sVar;
        WorkDatabase workDatabase = p.b(getApplicationContext()).f1534c;
        h.d(workDatabase, "workManager.workDatabase");
        S0.q t6 = workDatabase.t();
        l r9 = workDatabase.r();
        s u3 = workDatabase.u();
        i p9 = workDatabase.p();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        t6.getClass();
        C5059i a9 = C5059i.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a9.g(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t6.f2827a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            int m9 = F.m(m4, "id");
            int m10 = F.m(m4, a.f17526b);
            int m11 = F.m(m4, "worker_class_name");
            int m12 = F.m(m4, "input_merger_class_name");
            int m13 = F.m(m4, "input");
            int m14 = F.m(m4, "output");
            int m15 = F.m(m4, "initial_delay");
            int m16 = F.m(m4, "interval_duration");
            int m17 = F.m(m4, "flex_duration");
            int m18 = F.m(m4, "run_attempt_count");
            int m19 = F.m(m4, "backoff_policy");
            c5059i = a9;
            try {
                int m20 = F.m(m4, "backoff_delay_duration");
                int m21 = F.m(m4, "last_enqueue_time");
                int m22 = F.m(m4, "minimum_retention_duration");
                int m23 = F.m(m4, "schedule_requested_at");
                int m24 = F.m(m4, "run_in_foreground");
                int m25 = F.m(m4, "out_of_quota_policy");
                int m26 = F.m(m4, "period_count");
                int m27 = F.m(m4, "generation");
                int m28 = F.m(m4, "required_network_type");
                int m29 = F.m(m4, "requires_charging");
                int m30 = F.m(m4, "requires_device_idle");
                int m31 = F.m(m4, "requires_battery_not_low");
                int m32 = F.m(m4, "requires_storage_not_low");
                int m33 = F.m(m4, "trigger_content_update_delay");
                int m34 = F.m(m4, "trigger_max_content_delay");
                int m35 = F.m(m4, "content_uri_triggers");
                int i = m22;
                ArrayList arrayList = new ArrayList(m4.getCount());
                while (m4.moveToNext()) {
                    byte[] bArr = null;
                    String string = m4.isNull(m9) ? null : m4.getString(m9);
                    int n9 = f.n(m4.getInt(m10));
                    String string2 = m4.isNull(m11) ? null : m4.getString(m11);
                    String string3 = m4.isNull(m12) ? null : m4.getString(m12);
                    J0.h a10 = J0.h.a(m4.isNull(m13) ? null : m4.getBlob(m13));
                    J0.h a11 = J0.h.a(m4.isNull(m14) ? null : m4.getBlob(m14));
                    long j6 = m4.getLong(m15);
                    long j9 = m4.getLong(m16);
                    long j10 = m4.getLong(m17);
                    int i6 = m4.getInt(m18);
                    int k9 = f.k(m4.getInt(m19));
                    long j11 = m4.getLong(m20);
                    long j12 = m4.getLong(m21);
                    int i9 = i;
                    long j13 = m4.getLong(i9);
                    int i10 = m21;
                    int i11 = m23;
                    long j14 = m4.getLong(i11);
                    m23 = i11;
                    int i12 = m24;
                    boolean z3 = m4.getInt(i12) != 0;
                    m24 = i12;
                    int i13 = m25;
                    int m36 = f.m(m4.getInt(i13));
                    m25 = i13;
                    int i14 = m26;
                    int i15 = m4.getInt(i14);
                    m26 = i14;
                    int i16 = m27;
                    int i17 = m4.getInt(i16);
                    m27 = i16;
                    int i18 = m28;
                    int l9 = f.l(m4.getInt(i18));
                    m28 = i18;
                    int i19 = m29;
                    boolean z6 = m4.getInt(i19) != 0;
                    m29 = i19;
                    int i20 = m30;
                    boolean z9 = m4.getInt(i20) != 0;
                    m30 = i20;
                    int i21 = m31;
                    boolean z10 = m4.getInt(i21) != 0;
                    m31 = i21;
                    int i22 = m32;
                    boolean z11 = m4.getInt(i22) != 0;
                    m32 = i22;
                    int i23 = m33;
                    long j15 = m4.getLong(i23);
                    m33 = i23;
                    int i24 = m34;
                    long j16 = m4.getLong(i24);
                    m34 = i24;
                    int i25 = m35;
                    if (!m4.isNull(i25)) {
                        bArr = m4.getBlob(i25);
                    }
                    m35 = i25;
                    arrayList.add(new S0.p(string, n9, string2, string3, a10, a11, j6, j9, j10, new d(l9, z6, z9, z10, z11, j15, j16, f.b(bArr)), i6, k9, j11, j12, j13, j14, z3, m36, i15, i17));
                    m21 = i10;
                    i = i9;
                }
                m4.close();
                c5059i.j();
                ArrayList c9 = t6.c();
                ArrayList a12 = t6.a();
                if (arrayList.isEmpty()) {
                    iVar = p9;
                    lVar = r9;
                    sVar = u3;
                } else {
                    J0.s d2 = J0.s.d();
                    String str = b.f3402a;
                    d2.e(str, "Recently completed work:\n\n");
                    iVar = p9;
                    lVar = r9;
                    sVar = u3;
                    J0.s.d().e(str, b.a(lVar, sVar, iVar, arrayList));
                }
                if (!c9.isEmpty()) {
                    J0.s d9 = J0.s.d();
                    String str2 = b.f3402a;
                    d9.e(str2, "Running work:\n\n");
                    J0.s.d().e(str2, b.a(lVar, sVar, iVar, c9));
                }
                if (!a12.isEmpty()) {
                    J0.s d10 = J0.s.d();
                    String str3 = b.f3402a;
                    d10.e(str3, "Enqueued work:\n\n");
                    J0.s.d().e(str3, b.a(lVar, sVar, iVar, a12));
                }
                return q.a();
            } catch (Throwable th) {
                th = th;
                m4.close();
                c5059i.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c5059i = a9;
        }
    }
}
