package x4;

import android.database.Cursor;
import android.os.Trace;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m0.e2;
import m0.f2;
import m0.y1;
import s.h0;
import s.p0;
import u.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public Object f8342a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8343b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8344c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8345d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8346e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8347f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8348g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8349h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8350i;

    /* renamed from: j, reason: collision with root package name */
    public Object f8351j;

    /* renamed from: k, reason: collision with root package name */
    public Object f8352k;

    public q() {
        o0.e eVar = new o0.e(new f2[16]);
        this.f8344c = eVar;
        int i10 = p0.f6316a;
        this.f8345d = new h0();
        this.f8346e = eVar;
        this.f8347f = new o0.e(new Object[16]);
        this.f8348g = new o0.e(new oc.a[16]);
    }

    public void a() {
        this.f8342a = null;
        this.f8343b = null;
        o0.e eVar = (o0.e) this.f8344c;
        eVar.g();
        ((h0) this.f8345d).b();
        this.f8346e = eVar;
        ((o0.e) this.f8347f).g();
        ((o0.e) this.f8348g).g();
        this.f8349h = null;
        this.f8350i = null;
        this.f8351j = null;
    }

    public void b() {
        Set set = (Set) this.f8342a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                e2 e2Var = (e2) it.next();
                it.remove();
                e2Var.e();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void c() {
        o0.e eVar = (o0.e) this.f8344c;
        o0.e eVar2 = (o0.e) this.f8347f;
        Set set = (Set) this.f8342a;
        if (set == null) {
            return;
        }
        this.f8352k = null;
        if (eVar2.f5136i != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                h0 h0Var = (h0) this.f8349h;
                int i10 = eVar2.f5136i;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    Object obj = eVar2.f5134g[i10];
                    try {
                        if (obj instanceof f2) {
                            e2 e2Var = ((f2) obj).f4585a;
                            set.remove(e2Var);
                            e2Var.h();
                        }
                        if (obj instanceof m0.j) {
                            if (h0Var == null || !h0Var.c(obj)) {
                                ((m0.j) obj).b();
                            } else {
                                ((m0.j) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        x0.b bVar = (x0.b) this.f8343b;
                        if (bVar != null) {
                            u5.d.l(th, new y1(5, bVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (eVar.f5136i != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f8342a;
                if (set2 != null) {
                    Object[] objArr = eVar.f5134g;
                    int i11 = eVar.f5136i;
                    for (int i12 = 0; i12 < i11; i12++) {
                        f2 f2Var = (f2) objArr[i12];
                        e2 e2Var2 = f2Var.f4585a;
                        set2.remove(e2Var2);
                        try {
                            e2Var2.c();
                        } catch (Throwable th2) {
                            x0.b bVar2 = (x0.b) this.f8343b;
                            if (bVar2 != null) {
                                u5.d.l(th2, new y1(5, bVar2, f2Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void d(f2 f2Var) {
        o0.e eVar = (o0.e) this.f8344c;
        if (((h0) this.f8345d).c(f2Var)) {
            ((h0) this.f8345d).k(f2Var);
            if (!((o0.e) this.f8346e).j(f2Var) && !eVar.j(f2Var)) {
                Object[] objArr = eVar.f5134g;
                int i10 = eVar.f5136i;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (((f2) objArr[i11]).f4585a instanceof u0.g) {
                        throw null;
                    }
                }
            }
            Set set = (Set) this.f8342a;
            if (set == null) {
                return;
            } else {
                set.add(f2Var.f4585a);
            }
        }
        h0 h0Var = (h0) this.f8352k;
        if (h0Var == null || !h0Var.c(f2Var)) {
            ((o0.e) this.f8347f).b(f2Var);
        }
    }

    public ArrayList e() {
        b4.o oVar;
        b4.o a6 = b4.o.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        a6.n(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            int w3 = a.a.w(m10, "id");
            int w10 = a.a.w(m10, "state");
            int w11 = a.a.w(m10, "worker_class_name");
            int w12 = a.a.w(m10, "input_merger_class_name");
            int w13 = a.a.w(m10, "input");
            int w14 = a.a.w(m10, "output");
            int w15 = a.a.w(m10, "initial_delay");
            int w16 = a.a.w(m10, "interval_duration");
            int w17 = a.a.w(m10, "flex_duration");
            int w18 = a.a.w(m10, "run_attempt_count");
            int w19 = a.a.w(m10, "backoff_policy");
            int w20 = a.a.w(m10, "backoff_delay_duration");
            int w21 = a.a.w(m10, "last_enqueue_time");
            oVar = a6;
            try {
                int w22 = a.a.w(m10, "minimum_retention_duration");
                int w23 = a.a.w(m10, "schedule_requested_at");
                int w24 = a.a.w(m10, "run_in_foreground");
                int w25 = a.a.w(m10, "out_of_quota_policy");
                int w26 = a.a.w(m10, "period_count");
                int w27 = a.a.w(m10, "generation");
                int w28 = a.a.w(m10, "required_network_type");
                int w29 = a.a.w(m10, "requires_charging");
                int w30 = a.a.w(m10, "requires_device_idle");
                int w31 = a.a.w(m10, "requires_battery_not_low");
                int w32 = a.a.w(m10, "requires_storage_not_low");
                int w33 = a.a.w(m10, "trigger_content_update_delay");
                int w34 = a.a.w(m10, "trigger_max_content_delay");
                int w35 = a.a.w(m10, "content_uri_triggers");
                int i10 = w22;
                ArrayList arrayList = new ArrayList(m10.getCount());
                while (m10.moveToNext()) {
                    byte[] bArr = null;
                    String string = m10.isNull(w3) ? null : m10.getString(w3);
                    int l10 = l0.l(m10.getInt(w10));
                    String string2 = m10.isNull(w11) ? null : m10.getString(w11);
                    String string3 = m10.isNull(w12) ? null : m10.getString(w12);
                    o4.e a8 = o4.e.a(m10.isNull(w13) ? null : m10.getBlob(w13));
                    o4.e a10 = o4.e.a(m10.isNull(w14) ? null : m10.getBlob(w14));
                    long j3 = m10.getLong(w15);
                    long j6 = m10.getLong(w16);
                    long j10 = m10.getLong(w17);
                    int i11 = m10.getInt(w18);
                    int i12 = l0.i(m10.getInt(w19));
                    long j11 = m10.getLong(w20);
                    long j12 = m10.getLong(w21);
                    int i13 = i10;
                    long j13 = m10.getLong(i13);
                    int i14 = w3;
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
                    arrayList.add(new p(string, l10, string2, string3, a8, a10, j3, j6, j10, new o4.d(j15, z11, z12, z13, z14, j16, j17, l0.d(bArr)), i11, i12, j11, j12, j13, j14, z10, k3, i19, i21));
                    w3 = i14;
                    i10 = i13;
                }
                m10.close();
                oVar.f();
                return arrayList;
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

    public ArrayList f(int i10) {
        b4.o oVar;
        b4.o a6 = b4.o.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a6.n(1, i10);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            int w3 = a.a.w(m10, "id");
            int w10 = a.a.w(m10, "state");
            int w11 = a.a.w(m10, "worker_class_name");
            int w12 = a.a.w(m10, "input_merger_class_name");
            int w13 = a.a.w(m10, "input");
            int w14 = a.a.w(m10, "output");
            int w15 = a.a.w(m10, "initial_delay");
            int w16 = a.a.w(m10, "interval_duration");
            int w17 = a.a.w(m10, "flex_duration");
            int w18 = a.a.w(m10, "run_attempt_count");
            int w19 = a.a.w(m10, "backoff_policy");
            int w20 = a.a.w(m10, "backoff_delay_duration");
            int w21 = a.a.w(m10, "last_enqueue_time");
            oVar = a6;
            try {
                int w22 = a.a.w(m10, "minimum_retention_duration");
                int w23 = a.a.w(m10, "schedule_requested_at");
                int w24 = a.a.w(m10, "run_in_foreground");
                int w25 = a.a.w(m10, "out_of_quota_policy");
                int w26 = a.a.w(m10, "period_count");
                int w27 = a.a.w(m10, "generation");
                int w28 = a.a.w(m10, "required_network_type");
                int w29 = a.a.w(m10, "requires_charging");
                int w30 = a.a.w(m10, "requires_device_idle");
                int w31 = a.a.w(m10, "requires_battery_not_low");
                int w32 = a.a.w(m10, "requires_storage_not_low");
                int w33 = a.a.w(m10, "trigger_content_update_delay");
                int w34 = a.a.w(m10, "trigger_max_content_delay");
                int w35 = a.a.w(m10, "content_uri_triggers");
                int i11 = w22;
                ArrayList arrayList = new ArrayList(m10.getCount());
                while (m10.moveToNext()) {
                    byte[] bArr = null;
                    String string = m10.isNull(w3) ? null : m10.getString(w3);
                    int l10 = l0.l(m10.getInt(w10));
                    String string2 = m10.isNull(w11) ? null : m10.getString(w11);
                    String string3 = m10.isNull(w12) ? null : m10.getString(w12);
                    o4.e a8 = o4.e.a(m10.isNull(w13) ? null : m10.getBlob(w13));
                    o4.e a10 = o4.e.a(m10.isNull(w14) ? null : m10.getBlob(w14));
                    long j3 = m10.getLong(w15);
                    long j6 = m10.getLong(w16);
                    long j10 = m10.getLong(w17);
                    int i12 = m10.getInt(w18);
                    int i13 = l0.i(m10.getInt(w19));
                    long j11 = m10.getLong(w20);
                    long j12 = m10.getLong(w21);
                    int i14 = i11;
                    long j13 = m10.getLong(i14);
                    int i15 = w3;
                    int i16 = w23;
                    long j14 = m10.getLong(i16);
                    w23 = i16;
                    int i17 = w24;
                    boolean z10 = m10.getInt(i17) != 0;
                    w24 = i17;
                    int i18 = w25;
                    int k3 = l0.k(m10.getInt(i18));
                    w25 = i18;
                    int i19 = w26;
                    int i20 = m10.getInt(i19);
                    w26 = i19;
                    int i21 = w27;
                    int i22 = m10.getInt(i21);
                    w27 = i21;
                    int i23 = w28;
                    int j15 = l0.j(m10.getInt(i23));
                    w28 = i23;
                    int i24 = w29;
                    boolean z11 = m10.getInt(i24) != 0;
                    w29 = i24;
                    int i25 = w30;
                    boolean z12 = m10.getInt(i25) != 0;
                    w30 = i25;
                    int i26 = w31;
                    boolean z13 = m10.getInt(i26) != 0;
                    w31 = i26;
                    int i27 = w32;
                    boolean z14 = m10.getInt(i27) != 0;
                    w32 = i27;
                    int i28 = w33;
                    long j16 = m10.getLong(i28);
                    w33 = i28;
                    int i29 = w34;
                    long j17 = m10.getLong(i29);
                    w34 = i29;
                    int i30 = w35;
                    if (!m10.isNull(i30)) {
                        bArr = m10.getBlob(i30);
                    }
                    w35 = i30;
                    arrayList.add(new p(string, l10, string2, string3, a8, a10, j3, j6, j10, new o4.d(j15, z11, z12, z13, z14, j16, j17, l0.d(bArr)), i12, i13, j11, j12, j13, j14, z10, k3, i20, i22));
                    w3 = i15;
                    i11 = i14;
                }
                m10.close();
                oVar.f();
                return arrayList;
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

    public ArrayList g() {
        b4.o oVar;
        b4.o a6 = b4.o.a("SELECT * FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            int w3 = a.a.w(m10, "id");
            int w10 = a.a.w(m10, "state");
            int w11 = a.a.w(m10, "worker_class_name");
            int w12 = a.a.w(m10, "input_merger_class_name");
            int w13 = a.a.w(m10, "input");
            int w14 = a.a.w(m10, "output");
            int w15 = a.a.w(m10, "initial_delay");
            int w16 = a.a.w(m10, "interval_duration");
            int w17 = a.a.w(m10, "flex_duration");
            int w18 = a.a.w(m10, "run_attempt_count");
            int w19 = a.a.w(m10, "backoff_policy");
            int w20 = a.a.w(m10, "backoff_delay_duration");
            int w21 = a.a.w(m10, "last_enqueue_time");
            oVar = a6;
            try {
                int w22 = a.a.w(m10, "minimum_retention_duration");
                int w23 = a.a.w(m10, "schedule_requested_at");
                int w24 = a.a.w(m10, "run_in_foreground");
                int w25 = a.a.w(m10, "out_of_quota_policy");
                int w26 = a.a.w(m10, "period_count");
                int w27 = a.a.w(m10, "generation");
                int w28 = a.a.w(m10, "required_network_type");
                int w29 = a.a.w(m10, "requires_charging");
                int w30 = a.a.w(m10, "requires_device_idle");
                int w31 = a.a.w(m10, "requires_battery_not_low");
                int w32 = a.a.w(m10, "requires_storage_not_low");
                int w33 = a.a.w(m10, "trigger_content_update_delay");
                int w34 = a.a.w(m10, "trigger_max_content_delay");
                int w35 = a.a.w(m10, "content_uri_triggers");
                int i10 = w22;
                ArrayList arrayList = new ArrayList(m10.getCount());
                while (m10.moveToNext()) {
                    byte[] bArr = null;
                    String string = m10.isNull(w3) ? null : m10.getString(w3);
                    int l10 = l0.l(m10.getInt(w10));
                    String string2 = m10.isNull(w11) ? null : m10.getString(w11);
                    String string3 = m10.isNull(w12) ? null : m10.getString(w12);
                    o4.e a8 = o4.e.a(m10.isNull(w13) ? null : m10.getBlob(w13));
                    o4.e a10 = o4.e.a(m10.isNull(w14) ? null : m10.getBlob(w14));
                    long j3 = m10.getLong(w15);
                    long j6 = m10.getLong(w16);
                    long j10 = m10.getLong(w17);
                    int i11 = m10.getInt(w18);
                    int i12 = l0.i(m10.getInt(w19));
                    long j11 = m10.getLong(w20);
                    long j12 = m10.getLong(w21);
                    int i13 = i10;
                    long j13 = m10.getLong(i13);
                    int i14 = w3;
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
                    arrayList.add(new p(string, l10, string2, string3, a8, a10, j3, j6, j10, new o4.d(j15, z11, z12, z13, z14, j16, j17, l0.d(bArr)), i11, i12, j11, j12, j13, j14, z10, k3, i19, i21));
                    w3 = i14;
                    i10 = i13;
                }
                m10.close();
                oVar.f();
                return arrayList;
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

    public ArrayList h() {
        b4.o oVar;
        b4.o a6 = b4.o.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            int w3 = a.a.w(m10, "id");
            int w10 = a.a.w(m10, "state");
            int w11 = a.a.w(m10, "worker_class_name");
            int w12 = a.a.w(m10, "input_merger_class_name");
            int w13 = a.a.w(m10, "input");
            int w14 = a.a.w(m10, "output");
            int w15 = a.a.w(m10, "initial_delay");
            int w16 = a.a.w(m10, "interval_duration");
            int w17 = a.a.w(m10, "flex_duration");
            int w18 = a.a.w(m10, "run_attempt_count");
            int w19 = a.a.w(m10, "backoff_policy");
            int w20 = a.a.w(m10, "backoff_delay_duration");
            int w21 = a.a.w(m10, "last_enqueue_time");
            oVar = a6;
            try {
                int w22 = a.a.w(m10, "minimum_retention_duration");
                int w23 = a.a.w(m10, "schedule_requested_at");
                int w24 = a.a.w(m10, "run_in_foreground");
                int w25 = a.a.w(m10, "out_of_quota_policy");
                int w26 = a.a.w(m10, "period_count");
                int w27 = a.a.w(m10, "generation");
                int w28 = a.a.w(m10, "required_network_type");
                int w29 = a.a.w(m10, "requires_charging");
                int w30 = a.a.w(m10, "requires_device_idle");
                int w31 = a.a.w(m10, "requires_battery_not_low");
                int w32 = a.a.w(m10, "requires_storage_not_low");
                int w33 = a.a.w(m10, "trigger_content_update_delay");
                int w34 = a.a.w(m10, "trigger_max_content_delay");
                int w35 = a.a.w(m10, "content_uri_triggers");
                int i10 = w22;
                ArrayList arrayList = new ArrayList(m10.getCount());
                while (m10.moveToNext()) {
                    byte[] bArr = null;
                    String string = m10.isNull(w3) ? null : m10.getString(w3);
                    int l10 = l0.l(m10.getInt(w10));
                    String string2 = m10.isNull(w11) ? null : m10.getString(w11);
                    String string3 = m10.isNull(w12) ? null : m10.getString(w12);
                    o4.e a8 = o4.e.a(m10.isNull(w13) ? null : m10.getBlob(w13));
                    o4.e a10 = o4.e.a(m10.isNull(w14) ? null : m10.getBlob(w14));
                    long j3 = m10.getLong(w15);
                    long j6 = m10.getLong(w16);
                    long j10 = m10.getLong(w17);
                    int i11 = m10.getInt(w18);
                    int i12 = l0.i(m10.getInt(w19));
                    long j11 = m10.getLong(w20);
                    long j12 = m10.getLong(w21);
                    int i13 = i10;
                    long j13 = m10.getLong(i13);
                    int i14 = w3;
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
                    arrayList.add(new p(string, l10, string2, string3, a8, a10, j3, j6, j10, new o4.d(j15, z11, z12, z13, z14, j16, j17, l0.d(bArr)), i11, i12, j11, j12, j13, j14, z10, k3, i19, i21));
                    w3 = i14;
                    i10 = i13;
                }
                m10.close();
                oVar.f();
                return arrayList;
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

    public int i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        b4.o a6 = b4.o.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a6.h(1);
        } else {
            a6.c(str, 1);
        }
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            int i10 = 0;
            if (m10.moveToFirst()) {
                Integer valueOf = m10.isNull(0) ? null : Integer.valueOf(m10.getInt(0));
                if (valueOf != null) {
                    i10 = l0.l(valueOf.intValue());
                }
            }
            return i10;
        } finally {
            m10.close();
            a6.f();
        }
    }

    public ArrayList j(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        b4.o a6 = b4.o.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a6.h(1);
        } else {
            a6.c(str, 1);
        }
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            ArrayList arrayList = new ArrayList(m10.getCount());
            while (m10.moveToNext()) {
                arrayList.add(m10.isNull(0) ? null : m10.getString(0));
            }
            return arrayList;
        } finally {
            m10.close();
            a6.f();
        }
    }

    public p k(String str) {
        b4.o oVar;
        int w3;
        int w10;
        int w11;
        int w12;
        int w13;
        int w14;
        int w15;
        int w16;
        int w17;
        int w18;
        int w19;
        int w20;
        int w21;
        int w22;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        b4.o a6 = b4.o.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            a6.h(1);
        } else {
            a6.c(str, 1);
        }
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            w3 = a.a.w(m10, "id");
            w10 = a.a.w(m10, "state");
            w11 = a.a.w(m10, "worker_class_name");
            w12 = a.a.w(m10, "input_merger_class_name");
            w13 = a.a.w(m10, "input");
            w14 = a.a.w(m10, "output");
            w15 = a.a.w(m10, "initial_delay");
            w16 = a.a.w(m10, "interval_duration");
            w17 = a.a.w(m10, "flex_duration");
            w18 = a.a.w(m10, "run_attempt_count");
            w19 = a.a.w(m10, "backoff_policy");
            w20 = a.a.w(m10, "backoff_delay_duration");
            w21 = a.a.w(m10, "last_enqueue_time");
            w22 = a.a.w(m10, "minimum_retention_duration");
            oVar = a6;
        } catch (Throwable th) {
            th = th;
            oVar = a6;
        }
        try {
            int w23 = a.a.w(m10, "schedule_requested_at");
            int w24 = a.a.w(m10, "run_in_foreground");
            int w25 = a.a.w(m10, "out_of_quota_policy");
            int w26 = a.a.w(m10, "period_count");
            int w27 = a.a.w(m10, "generation");
            int w28 = a.a.w(m10, "required_network_type");
            int w29 = a.a.w(m10, "requires_charging");
            int w30 = a.a.w(m10, "requires_device_idle");
            int w31 = a.a.w(m10, "requires_battery_not_low");
            int w32 = a.a.w(m10, "requires_storage_not_low");
            int w33 = a.a.w(m10, "trigger_content_update_delay");
            int w34 = a.a.w(m10, "trigger_max_content_delay");
            int w35 = a.a.w(m10, "content_uri_triggers");
            p pVar = null;
            byte[] blob = null;
            if (m10.moveToFirst()) {
                String string = m10.isNull(w3) ? null : m10.getString(w3);
                int l10 = l0.l(m10.getInt(w10));
                String string2 = m10.isNull(w11) ? null : m10.getString(w11);
                String string3 = m10.isNull(w12) ? null : m10.getString(w12);
                o4.e a8 = o4.e.a(m10.isNull(w13) ? null : m10.getBlob(w13));
                o4.e a10 = o4.e.a(m10.isNull(w14) ? null : m10.getBlob(w14));
                long j3 = m10.getLong(w15);
                long j6 = m10.getLong(w16);
                long j10 = m10.getLong(w17);
                int i10 = m10.getInt(w18);
                int i11 = l0.i(m10.getInt(w19));
                long j11 = m10.getLong(w20);
                long j12 = m10.getLong(w21);
                long j13 = m10.getLong(w22);
                long j14 = m10.getLong(w23);
                boolean z10 = m10.getInt(w24) != 0;
                int k3 = l0.k(m10.getInt(w25));
                int i12 = m10.getInt(w26);
                int i13 = m10.getInt(w27);
                int j15 = l0.j(m10.getInt(w28));
                boolean z11 = m10.getInt(w29) != 0;
                boolean z12 = m10.getInt(w30) != 0;
                boolean z13 = m10.getInt(w31) != 0;
                boolean z14 = m10.getInt(w32) != 0;
                long j16 = m10.getLong(w33);
                long j17 = m10.getLong(w34);
                if (!m10.isNull(w35)) {
                    blob = m10.getBlob(w35);
                }
                pVar = new p(string, l10, string2, string3, a8, a10, j3, j6, j10, new o4.d(j15, z11, z12, z13, z14, j16, j17, l0.d(blob)), i10, i11, j11, j12, j13, j14, z10, k3, i12, i13);
            }
            m10.close();
            oVar.f();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            m10.close();
            oVar.f();
            throw th;
        }
    }

    public void l(long j3, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8351j;
        i4.i a6 = hVar.a();
        a6.n(1, j3);
        if (str == null) {
            a6.h(2);
        } else {
            a6.c(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a6);
        }
    }

    public void m(Set set, x0.b bVar) {
        a();
        this.f8342a = set;
        this.f8343b = bVar;
    }

    public void n(long j3, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8348g;
        i4.i a6 = hVar.a();
        a6.n(1, j3);
        if (str == null) {
            a6.h(2);
        } else {
            a6.c(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a6);
        }
    }

    public void o(String str, o4.e eVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8347f;
        i4.i a6 = hVar.a();
        byte[] c3 = o4.e.c(eVar);
        if (c3 == null) {
            a6.h(1);
        } else {
            a6.p(1, c3);
        }
        if (str == null) {
            a6.h(2);
        } else {
            a6.c(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a6);
        }
    }

    public void p(String str, int i10) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8342a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8345d;
        i4.i a6 = hVar.a();
        a6.n(1, l0.r(i10));
        if (str == null) {
            a6.h(2);
        } else {
            a6.c(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a6);
        }
    }

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f8342a = workDatabase_Impl;
        this.f8343b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 8);
        this.f8344c = new h(workDatabase_Impl, 9);
        this.f8345d = new h(workDatabase_Impl, 10);
        this.f8346e = new h(workDatabase_Impl, 11);
        this.f8347f = new h(workDatabase_Impl, 12);
        this.f8348g = new h(workDatabase_Impl, 13);
        this.f8349h = new h(workDatabase_Impl, 14);
        this.f8350i = new h(workDatabase_Impl, 15);
        this.f8351j = new h(workDatabase_Impl, 4);
        this.f8352k = new h(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 7);
    }
}
