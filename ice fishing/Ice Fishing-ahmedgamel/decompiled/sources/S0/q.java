package S0;

import a.AbstractC0426a;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC3194f5;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC3871rk;
import com.google.android.gms.internal.ads.C2494Al;
import com.google.android.gms.internal.ads.C2578Fk;
import com.google.android.gms.internal.ads.C2646Jk;
import com.google.android.gms.internal.ads.C2680Lk;
import com.google.android.gms.internal.ads.C2980b5;
import com.google.android.gms.internal.ads.C3067cm;
import com.google.android.gms.internal.ads.C3120dl;
import com.google.android.gms.internal.ads.C3231fp;
import com.google.android.gms.internal.ads.C3289gt;
import com.google.android.gms.internal.ads.C3387ik;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.ads.C3768po;
import com.google.android.gms.internal.ads.C4206xv;
import com.google.android.gms.internal.ads.InterfaceC2611Hj;
import com.google.android.gms.internal.ads.InterfaceC3340hq;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.X4;
import com.google.android.gms.internal.ads.XD;
import com.google.android.gms.internal.ads.Xq;
import com.google.android.gms.internal.ads.Yt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m.R0;
import o1.C4797a;
import u0.C5060i;
import z0.C5220i;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2956a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2957b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2958c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2959d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2960e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2961f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2962g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2963h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2964j;

    /* renamed from: k, reason: collision with root package name */
    public Object f2965k;

    public q(Yt yt, St st, C2578Fk c2578Fk, C2646Jk c2646Jk, C3289gt c3289gt, BinderC3871rk binderC3871rk, C3120dl c3120dl, C2680Lk c2680Lk, C2494Al c2494Al, C3387ik c3387ik, C3768po c3768po) {
        this.f2956a = yt;
        this.f2957b = st;
        this.f2958c = c2578Fk;
        this.f2959d = c2646Jk;
        this.f2960e = c3289gt;
        this.f2961f = binderC3871rk;
        this.f2962g = c3120dl;
        this.f2963h = c2680Lk;
        this.i = c2494Al;
        this.f2964j = c3387ik;
        this.f2965k = c3768po;
    }

    public ArrayList a() {
        C5060i c5060i;
        C5060i a9 = C5060i.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a9.g(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            int c9 = com.bumptech.glide.e.c(m9, "id");
            int c10 = com.bumptech.glide.e.c(m9, com.anythink.core.express.b.a.f18313b);
            int c11 = com.bumptech.glide.e.c(m9, "worker_class_name");
            int c12 = com.bumptech.glide.e.c(m9, "input_merger_class_name");
            int c13 = com.bumptech.glide.e.c(m9, "input");
            int c14 = com.bumptech.glide.e.c(m9, "output");
            int c15 = com.bumptech.glide.e.c(m9, "initial_delay");
            int c16 = com.bumptech.glide.e.c(m9, "interval_duration");
            int c17 = com.bumptech.glide.e.c(m9, "flex_duration");
            int c18 = com.bumptech.glide.e.c(m9, "run_attempt_count");
            int c19 = com.bumptech.glide.e.c(m9, "backoff_policy");
            int c20 = com.bumptech.glide.e.c(m9, "backoff_delay_duration");
            int c21 = com.bumptech.glide.e.c(m9, "last_enqueue_time");
            c5060i = a9;
            try {
                int c22 = com.bumptech.glide.e.c(m9, "minimum_retention_duration");
                int c23 = com.bumptech.glide.e.c(m9, "schedule_requested_at");
                int c24 = com.bumptech.glide.e.c(m9, "run_in_foreground");
                int c25 = com.bumptech.glide.e.c(m9, "out_of_quota_policy");
                int c26 = com.bumptech.glide.e.c(m9, "period_count");
                int c27 = com.bumptech.glide.e.c(m9, "generation");
                int c28 = com.bumptech.glide.e.c(m9, "required_network_type");
                int c29 = com.bumptech.glide.e.c(m9, "requires_charging");
                int c30 = com.bumptech.glide.e.c(m9, "requires_device_idle");
                int c31 = com.bumptech.glide.e.c(m9, "requires_battery_not_low");
                int c32 = com.bumptech.glide.e.c(m9, "requires_storage_not_low");
                int c33 = com.bumptech.glide.e.c(m9, "trigger_content_update_delay");
                int c34 = com.bumptech.glide.e.c(m9, "trigger_max_content_delay");
                int c35 = com.bumptech.glide.e.c(m9, "content_uri_triggers");
                int i = c22;
                ArrayList arrayList = new ArrayList(m9.getCount());
                while (m9.moveToNext()) {
                    byte[] bArr = null;
                    String string = m9.isNull(c9) ? null : m9.getString(c9);
                    int i4 = AbstractC0426a.i(m9.getInt(c10));
                    String string2 = m9.isNull(c11) ? null : m9.getString(c11);
                    String string3 = m9.isNull(c12) ? null : m9.getString(c12);
                    J0.g a10 = J0.g.a(m9.isNull(c13) ? null : m9.getBlob(c13));
                    J0.g a11 = J0.g.a(m9.isNull(c14) ? null : m9.getBlob(c14));
                    long j6 = m9.getLong(c15);
                    long j9 = m9.getLong(c16);
                    long j10 = m9.getLong(c17);
                    int i6 = m9.getInt(c18);
                    int f2 = AbstractC0426a.f(m9.getInt(c19));
                    long j11 = m9.getLong(c20);
                    long j12 = m9.getLong(c21);
                    int i9 = i;
                    long j13 = m9.getLong(i9);
                    int i10 = c9;
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
                    arrayList.add(new p(string, i4, string2, string3, a10, a11, j6, j9, j10, new J0.d(g9, z9, z10, z11, z12, j15, j16, AbstractC0426a.c(bArr)), i6, f2, j11, j12, j13, j14, z6, h3, i15, i17));
                    c9 = i10;
                    i = i9;
                }
                m9.close();
                c5060i.j();
                return arrayList;
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

    public ArrayList b(int i) {
        C5060i c5060i;
        C5060i a9 = C5060i.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a9.g(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            int c9 = com.bumptech.glide.e.c(m9, "id");
            int c10 = com.bumptech.glide.e.c(m9, com.anythink.core.express.b.a.f18313b);
            int c11 = com.bumptech.glide.e.c(m9, "worker_class_name");
            int c12 = com.bumptech.glide.e.c(m9, "input_merger_class_name");
            int c13 = com.bumptech.glide.e.c(m9, "input");
            int c14 = com.bumptech.glide.e.c(m9, "output");
            int c15 = com.bumptech.glide.e.c(m9, "initial_delay");
            int c16 = com.bumptech.glide.e.c(m9, "interval_duration");
            int c17 = com.bumptech.glide.e.c(m9, "flex_duration");
            int c18 = com.bumptech.glide.e.c(m9, "run_attempt_count");
            int c19 = com.bumptech.glide.e.c(m9, "backoff_policy");
            int c20 = com.bumptech.glide.e.c(m9, "backoff_delay_duration");
            int c21 = com.bumptech.glide.e.c(m9, "last_enqueue_time");
            c5060i = a9;
            try {
                int c22 = com.bumptech.glide.e.c(m9, "minimum_retention_duration");
                int c23 = com.bumptech.glide.e.c(m9, "schedule_requested_at");
                int c24 = com.bumptech.glide.e.c(m9, "run_in_foreground");
                int c25 = com.bumptech.glide.e.c(m9, "out_of_quota_policy");
                int c26 = com.bumptech.glide.e.c(m9, "period_count");
                int c27 = com.bumptech.glide.e.c(m9, "generation");
                int c28 = com.bumptech.glide.e.c(m9, "required_network_type");
                int c29 = com.bumptech.glide.e.c(m9, "requires_charging");
                int c30 = com.bumptech.glide.e.c(m9, "requires_device_idle");
                int c31 = com.bumptech.glide.e.c(m9, "requires_battery_not_low");
                int c32 = com.bumptech.glide.e.c(m9, "requires_storage_not_low");
                int c33 = com.bumptech.glide.e.c(m9, "trigger_content_update_delay");
                int c34 = com.bumptech.glide.e.c(m9, "trigger_max_content_delay");
                int c35 = com.bumptech.glide.e.c(m9, "content_uri_triggers");
                int i4 = c22;
                ArrayList arrayList = new ArrayList(m9.getCount());
                while (m9.moveToNext()) {
                    byte[] bArr = null;
                    String string = m9.isNull(c9) ? null : m9.getString(c9);
                    int i6 = AbstractC0426a.i(m9.getInt(c10));
                    String string2 = m9.isNull(c11) ? null : m9.getString(c11);
                    String string3 = m9.isNull(c12) ? null : m9.getString(c12);
                    J0.g a10 = J0.g.a(m9.isNull(c13) ? null : m9.getBlob(c13));
                    J0.g a11 = J0.g.a(m9.isNull(c14) ? null : m9.getBlob(c14));
                    long j6 = m9.getLong(c15);
                    long j9 = m9.getLong(c16);
                    long j10 = m9.getLong(c17);
                    int i9 = m9.getInt(c18);
                    int f2 = AbstractC0426a.f(m9.getInt(c19));
                    long j11 = m9.getLong(c20);
                    long j12 = m9.getLong(c21);
                    int i10 = i4;
                    long j13 = m9.getLong(i10);
                    int i11 = c9;
                    int i12 = c23;
                    long j14 = m9.getLong(i12);
                    c23 = i12;
                    int i13 = c24;
                    boolean z6 = m9.getInt(i13) != 0;
                    c24 = i13;
                    int i14 = c25;
                    int h3 = AbstractC0426a.h(m9.getInt(i14));
                    c25 = i14;
                    int i15 = c26;
                    int i16 = m9.getInt(i15);
                    c26 = i15;
                    int i17 = c27;
                    int i18 = m9.getInt(i17);
                    c27 = i17;
                    int i19 = c28;
                    int g9 = AbstractC0426a.g(m9.getInt(i19));
                    c28 = i19;
                    int i20 = c29;
                    boolean z9 = m9.getInt(i20) != 0;
                    c29 = i20;
                    int i21 = c30;
                    boolean z10 = m9.getInt(i21) != 0;
                    c30 = i21;
                    int i22 = c31;
                    boolean z11 = m9.getInt(i22) != 0;
                    c31 = i22;
                    int i23 = c32;
                    boolean z12 = m9.getInt(i23) != 0;
                    c32 = i23;
                    int i24 = c33;
                    long j15 = m9.getLong(i24);
                    c33 = i24;
                    int i25 = c34;
                    long j16 = m9.getLong(i25);
                    c34 = i25;
                    int i26 = c35;
                    if (!m9.isNull(i26)) {
                        bArr = m9.getBlob(i26);
                    }
                    c35 = i26;
                    arrayList.add(new p(string, i6, string2, string3, a10, a11, j6, j9, j10, new J0.d(g9, z9, z10, z11, z12, j15, j16, AbstractC0426a.c(bArr)), i9, f2, j11, j12, j13, j14, z6, h3, i16, i18));
                    c9 = i11;
                    i4 = i10;
                }
                m9.close();
                c5060i.j();
                return arrayList;
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

    public ArrayList c() {
        C5060i c5060i;
        C5060i a9 = C5060i.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            int c9 = com.bumptech.glide.e.c(m9, "id");
            int c10 = com.bumptech.glide.e.c(m9, com.anythink.core.express.b.a.f18313b);
            int c11 = com.bumptech.glide.e.c(m9, "worker_class_name");
            int c12 = com.bumptech.glide.e.c(m9, "input_merger_class_name");
            int c13 = com.bumptech.glide.e.c(m9, "input");
            int c14 = com.bumptech.glide.e.c(m9, "output");
            int c15 = com.bumptech.glide.e.c(m9, "initial_delay");
            int c16 = com.bumptech.glide.e.c(m9, "interval_duration");
            int c17 = com.bumptech.glide.e.c(m9, "flex_duration");
            int c18 = com.bumptech.glide.e.c(m9, "run_attempt_count");
            int c19 = com.bumptech.glide.e.c(m9, "backoff_policy");
            int c20 = com.bumptech.glide.e.c(m9, "backoff_delay_duration");
            int c21 = com.bumptech.glide.e.c(m9, "last_enqueue_time");
            c5060i = a9;
            try {
                int c22 = com.bumptech.glide.e.c(m9, "minimum_retention_duration");
                int c23 = com.bumptech.glide.e.c(m9, "schedule_requested_at");
                int c24 = com.bumptech.glide.e.c(m9, "run_in_foreground");
                int c25 = com.bumptech.glide.e.c(m9, "out_of_quota_policy");
                int c26 = com.bumptech.glide.e.c(m9, "period_count");
                int c27 = com.bumptech.glide.e.c(m9, "generation");
                int c28 = com.bumptech.glide.e.c(m9, "required_network_type");
                int c29 = com.bumptech.glide.e.c(m9, "requires_charging");
                int c30 = com.bumptech.glide.e.c(m9, "requires_device_idle");
                int c31 = com.bumptech.glide.e.c(m9, "requires_battery_not_low");
                int c32 = com.bumptech.glide.e.c(m9, "requires_storage_not_low");
                int c33 = com.bumptech.glide.e.c(m9, "trigger_content_update_delay");
                int c34 = com.bumptech.glide.e.c(m9, "trigger_max_content_delay");
                int c35 = com.bumptech.glide.e.c(m9, "content_uri_triggers");
                int i = c22;
                ArrayList arrayList = new ArrayList(m9.getCount());
                while (m9.moveToNext()) {
                    byte[] bArr = null;
                    String string = m9.isNull(c9) ? null : m9.getString(c9);
                    int i4 = AbstractC0426a.i(m9.getInt(c10));
                    String string2 = m9.isNull(c11) ? null : m9.getString(c11);
                    String string3 = m9.isNull(c12) ? null : m9.getString(c12);
                    J0.g a10 = J0.g.a(m9.isNull(c13) ? null : m9.getBlob(c13));
                    J0.g a11 = J0.g.a(m9.isNull(c14) ? null : m9.getBlob(c14));
                    long j6 = m9.getLong(c15);
                    long j9 = m9.getLong(c16);
                    long j10 = m9.getLong(c17);
                    int i6 = m9.getInt(c18);
                    int f2 = AbstractC0426a.f(m9.getInt(c19));
                    long j11 = m9.getLong(c20);
                    long j12 = m9.getLong(c21);
                    int i9 = i;
                    long j13 = m9.getLong(i9);
                    int i10 = c9;
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
                    arrayList.add(new p(string, i4, string2, string3, a10, a11, j6, j9, j10, new J0.d(g9, z9, z10, z11, z12, j15, j16, AbstractC0426a.c(bArr)), i6, f2, j11, j12, j13, j14, z6, h3, i15, i17));
                    c9 = i10;
                    i = i9;
                }
                m9.close();
                c5060i.j();
                return arrayList;
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

    public ArrayList d() {
        C5060i c5060i;
        C5060i a9 = C5060i.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            int c9 = com.bumptech.glide.e.c(m9, "id");
            int c10 = com.bumptech.glide.e.c(m9, com.anythink.core.express.b.a.f18313b);
            int c11 = com.bumptech.glide.e.c(m9, "worker_class_name");
            int c12 = com.bumptech.glide.e.c(m9, "input_merger_class_name");
            int c13 = com.bumptech.glide.e.c(m9, "input");
            int c14 = com.bumptech.glide.e.c(m9, "output");
            int c15 = com.bumptech.glide.e.c(m9, "initial_delay");
            int c16 = com.bumptech.glide.e.c(m9, "interval_duration");
            int c17 = com.bumptech.glide.e.c(m9, "flex_duration");
            int c18 = com.bumptech.glide.e.c(m9, "run_attempt_count");
            int c19 = com.bumptech.glide.e.c(m9, "backoff_policy");
            int c20 = com.bumptech.glide.e.c(m9, "backoff_delay_duration");
            int c21 = com.bumptech.glide.e.c(m9, "last_enqueue_time");
            c5060i = a9;
            try {
                int c22 = com.bumptech.glide.e.c(m9, "minimum_retention_duration");
                int c23 = com.bumptech.glide.e.c(m9, "schedule_requested_at");
                int c24 = com.bumptech.glide.e.c(m9, "run_in_foreground");
                int c25 = com.bumptech.glide.e.c(m9, "out_of_quota_policy");
                int c26 = com.bumptech.glide.e.c(m9, "period_count");
                int c27 = com.bumptech.glide.e.c(m9, "generation");
                int c28 = com.bumptech.glide.e.c(m9, "required_network_type");
                int c29 = com.bumptech.glide.e.c(m9, "requires_charging");
                int c30 = com.bumptech.glide.e.c(m9, "requires_device_idle");
                int c31 = com.bumptech.glide.e.c(m9, "requires_battery_not_low");
                int c32 = com.bumptech.glide.e.c(m9, "requires_storage_not_low");
                int c33 = com.bumptech.glide.e.c(m9, "trigger_content_update_delay");
                int c34 = com.bumptech.glide.e.c(m9, "trigger_max_content_delay");
                int c35 = com.bumptech.glide.e.c(m9, "content_uri_triggers");
                int i = c22;
                ArrayList arrayList = new ArrayList(m9.getCount());
                while (m9.moveToNext()) {
                    byte[] bArr = null;
                    String string = m9.isNull(c9) ? null : m9.getString(c9);
                    int i4 = AbstractC0426a.i(m9.getInt(c10));
                    String string2 = m9.isNull(c11) ? null : m9.getString(c11);
                    String string3 = m9.isNull(c12) ? null : m9.getString(c12);
                    J0.g a10 = J0.g.a(m9.isNull(c13) ? null : m9.getBlob(c13));
                    J0.g a11 = J0.g.a(m9.isNull(c14) ? null : m9.getBlob(c14));
                    long j6 = m9.getLong(c15);
                    long j9 = m9.getLong(c16);
                    long j10 = m9.getLong(c17);
                    int i6 = m9.getInt(c18);
                    int f2 = AbstractC0426a.f(m9.getInt(c19));
                    long j11 = m9.getLong(c20);
                    long j12 = m9.getLong(c21);
                    int i9 = i;
                    long j13 = m9.getLong(i9);
                    int i10 = c9;
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
                    arrayList.add(new p(string, i4, string2, string3, a10, a11, j6, j9, j10, new J0.d(g9, z9, z10, z11, z12, j15, j16, AbstractC0426a.c(bArr)), i6, f2, j11, j12, j13, j14, z6, h3, i15, i17));
                    c9 = i10;
                    i = i9;
                }
                m9.close();
                c5060i.j();
                return arrayList;
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

    public int e(String str) {
        C5060i a9 = C5060i.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            int i = 0;
            if (m9.moveToFirst()) {
                Integer valueOf = m9.isNull(0) ? null : Integer.valueOf(m9.getInt(0));
                if (valueOf != null) {
                    i = AbstractC0426a.i(valueOf.intValue());
                }
            }
            return i;
        } finally {
            m9.close();
            a9.j();
        }
    }

    public ArrayList f(String str) {
        C5060i a9 = C5060i.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m9.getCount());
            while (m9.moveToNext()) {
                arrayList.add(m9.isNull(0) ? null : m9.getString(0));
            }
            return arrayList;
        } finally {
            m9.close();
            a9.j();
        }
    }

    public ArrayList g() {
        C5060i a9 = C5060i.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        a9.c(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m9.getCount());
            while (m9.moveToNext()) {
                arrayList.add(m9.isNull(0) ? null : m9.getString(0));
            }
            return arrayList;
        } finally {
            m9.close();
            a9.j();
        }
    }

    public p h(String str) {
        C5060i c5060i;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        int c16;
        int c17;
        int c18;
        int c19;
        int c20;
        int c21;
        C5060i a9 = C5060i.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            c9 = com.bumptech.glide.e.c(m9, "id");
            c10 = com.bumptech.glide.e.c(m9, com.anythink.core.express.b.a.f18313b);
            c11 = com.bumptech.glide.e.c(m9, "worker_class_name");
            c12 = com.bumptech.glide.e.c(m9, "input_merger_class_name");
            c13 = com.bumptech.glide.e.c(m9, "input");
            c14 = com.bumptech.glide.e.c(m9, "output");
            c15 = com.bumptech.glide.e.c(m9, "initial_delay");
            c16 = com.bumptech.glide.e.c(m9, "interval_duration");
            c17 = com.bumptech.glide.e.c(m9, "flex_duration");
            c18 = com.bumptech.glide.e.c(m9, "run_attempt_count");
            c19 = com.bumptech.glide.e.c(m9, "backoff_policy");
            c20 = com.bumptech.glide.e.c(m9, "backoff_delay_duration");
            c21 = com.bumptech.glide.e.c(m9, "last_enqueue_time");
            c5060i = a9;
        } catch (Throwable th) {
            th = th;
            c5060i = a9;
        }
        try {
            int c22 = com.bumptech.glide.e.c(m9, "minimum_retention_duration");
            int c23 = com.bumptech.glide.e.c(m9, "schedule_requested_at");
            int c24 = com.bumptech.glide.e.c(m9, "run_in_foreground");
            int c25 = com.bumptech.glide.e.c(m9, "out_of_quota_policy");
            int c26 = com.bumptech.glide.e.c(m9, "period_count");
            int c27 = com.bumptech.glide.e.c(m9, "generation");
            int c28 = com.bumptech.glide.e.c(m9, "required_network_type");
            int c29 = com.bumptech.glide.e.c(m9, "requires_charging");
            int c30 = com.bumptech.glide.e.c(m9, "requires_device_idle");
            int c31 = com.bumptech.glide.e.c(m9, "requires_battery_not_low");
            int c32 = com.bumptech.glide.e.c(m9, "requires_storage_not_low");
            int c33 = com.bumptech.glide.e.c(m9, "trigger_content_update_delay");
            int c34 = com.bumptech.glide.e.c(m9, "trigger_max_content_delay");
            int c35 = com.bumptech.glide.e.c(m9, "content_uri_triggers");
            p pVar = null;
            byte[] blob = null;
            if (m9.moveToFirst()) {
                String string = m9.isNull(c9) ? null : m9.getString(c9);
                int i = AbstractC0426a.i(m9.getInt(c10));
                String string2 = m9.isNull(c11) ? null : m9.getString(c11);
                String string3 = m9.isNull(c12) ? null : m9.getString(c12);
                J0.g a10 = J0.g.a(m9.isNull(c13) ? null : m9.getBlob(c13));
                J0.g a11 = J0.g.a(m9.isNull(c14) ? null : m9.getBlob(c14));
                long j6 = m9.getLong(c15);
                long j9 = m9.getLong(c16);
                long j10 = m9.getLong(c17);
                int i4 = m9.getInt(c18);
                int f2 = AbstractC0426a.f(m9.getInt(c19));
                long j11 = m9.getLong(c20);
                long j12 = m9.getLong(c21);
                long j13 = m9.getLong(c22);
                long j14 = m9.getLong(c23);
                boolean z6 = m9.getInt(c24) != 0;
                int h3 = AbstractC0426a.h(m9.getInt(c25));
                int i6 = m9.getInt(c26);
                int i9 = m9.getInt(c27);
                int g9 = AbstractC0426a.g(m9.getInt(c28));
                boolean z9 = m9.getInt(c29) != 0;
                boolean z10 = m9.getInt(c30) != 0;
                boolean z11 = m9.getInt(c31) != 0;
                boolean z12 = m9.getInt(c32) != 0;
                long j15 = m9.getLong(c33);
                long j16 = m9.getLong(c34);
                if (!m9.isNull(c35)) {
                    blob = m9.getBlob(c35);
                }
                pVar = new p(string, i, string2, string3, a10, a11, j6, j9, j10, new J0.d(g9, z9, z10, z11, z12, j15, j16, AbstractC0426a.c(blob)), i4, f2, j11, j12, j13, j14, z6, h3, i6, i9);
            }
            m9.close();
            c5060i.j();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            m9.close();
            c5060i.j();
            throw th;
        }
    }

    public void i(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2964j;
        C5220i a9 = hVar.a();
        a9.g(1, j6);
        if (str == null) {
            a9.o(2);
        } else {
            a9.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a9);
        }
    }

    public void j() {
        synchronized (((ArrayList) this.f2965k)) {
            try {
                Iterator it = ((ArrayList) this.f2965k).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2962g;
        C5220i a9 = hVar.a();
        a9.g(1, j6);
        if (str == null) {
            a9.o(2);
        } else {
            a9.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a9);
        }
    }

    public void l(String str, J0.g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2961f;
        C5220i a9 = hVar.a();
        byte[] c9 = J0.g.c(gVar);
        if (c9 == null) {
            a9.o(1);
        } else {
            a9.h(1, c9);
        }
        if (str == null) {
            a9.o(2);
        } else {
            a9.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a9);
        }
    }

    public void m(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2956a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2959d;
        C5220i a9 = hVar.a();
        a9.g(1, AbstractC0426a.o(i));
        if (str == null) {
            a9.o(2);
        } else {
            a9.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a9);
        }
    }

    public void n() {
        X4 x42 = (X4) this.f2963h;
        if (x42 != null) {
            x42.f29262w = true;
            x42.interrupt();
        }
        C2980b5[] c2980b5Arr = (C2980b5[]) this.f2962g;
        for (int i = 0; i < 4; i++) {
            C2980b5 c2980b5 = c2980b5Arr[i];
            if (c2980b5 != null) {
                c2980b5.f30000w = true;
                c2980b5.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.f2958c;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.f2959d;
        C3732p5 c3732p5 = (C3732p5) this.f2960e;
        Ux ux = (Ux) this.f2965k;
        X4 x43 = new X4(priorityBlockingQueue, priorityBlockingQueue2, c3732p5, ux);
        this.f2963h = x43;
        x43.start();
        for (int i4 = 0; i4 < 4; i4++) {
            C2980b5 c2980b52 = new C2980b5(priorityBlockingQueue2, (C3067cm) this.f2961f, c3732p5, ux);
            c2980b5Arr[i4] = c2980b52;
            c2980b52.start();
        }
    }

    public void o(AbstractC3194f5 abstractC3194f5) {
        abstractC3194f5.f30824A = this;
        HashSet hashSet = (HashSet) this.f2957b;
        synchronized (hashSet) {
            hashSet.add(abstractC3194f5);
        }
        abstractC3194f5.f30835z = Integer.valueOf(((AtomicInteger) this.f2956a).incrementAndGet());
        abstractC3194f5.a("add-to-queue");
        p();
        ((PriorityBlockingQueue) this.f2958c).add(abstractC3194f5);
    }

    public void p() {
        ArrayList arrayList = (ArrayList) this.f2964j;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(St st) {
        P3.a k9;
        synchronized (this) {
            Iterator it = st.f28389a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    k9 = QC.k(new C3231fp(3));
                    break;
                }
                InterfaceC3340hq a9 = ((InterfaceC2611Hj) this.f2960e).a(st.f28391b, (String) it.next());
                if (a9 != null && a9.b((Yt) this.f2965k, st)) {
                    k9 = QC.s(a9.a((Yt) this.f2965k, st), st.f28381R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f2959d);
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ga)).booleanValue()) {
                        Su e9 = Su.e((Context) this.f2956a, 12);
                        e9.m(st.f28364E);
                        e9.c();
                        AbstractC2792Sd.G(k9, (Vu) this.f2957b, e9, false);
                    }
                }
            }
        }
        ((Xq) this.f2961f).b((Yt) this.f2965k, st, k9, (C4206xv) this.f2962g);
        k9.a(new LD(0, k9, new c(this, st)), (RD) this.f2958c);
    }

    public q(Context context, Vu vu, RD rd, ScheduledExecutorService scheduledExecutorService, InterfaceC2611Hj interfaceC2611Hj, Xq xq, C4206xv c4206xv) {
        this.f2963h = new XD();
        this.i = new AtomicBoolean();
        this.f2956a = context;
        this.f2957b = vu;
        this.f2958c = rd;
        this.f2959d = scheduledExecutorService;
        this.f2960e = interfaceC2611Hj;
        this.f2961f = xq;
        this.f2962g = c4206xv;
    }

    public q(C3732p5 c3732p5, C3067cm c3067cm) {
        Ux ux = new Ux(new Handler(Looper.getMainLooper()));
        this.f2956a = new AtomicInteger();
        this.f2957b = new HashSet();
        this.f2958c = new PriorityBlockingQueue();
        this.f2959d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.f2964j = new ArrayList();
        this.f2960e = c3732p5;
        this.f2961f = c3067cm;
        this.f2962g = new C2980b5[4];
        this.f2965k = ux;
    }

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f2956a = workDatabase_Impl;
        this.f2957b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 8);
        this.f2958c = new h(workDatabase_Impl, 9);
        this.f2959d = new h(workDatabase_Impl, 10);
        this.f2960e = new h(workDatabase_Impl, 11);
        this.f2961f = new h(workDatabase_Impl, 12);
        this.f2962g = new h(workDatabase_Impl, 13);
        this.f2963h = new h(workDatabase_Impl, 14);
        this.i = new h(workDatabase_Impl, 15);
        this.f2964j = new h(workDatabase_Impl, 4);
        this.f2965k = new h(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 7);
    }

    public q(C3732p5 c3732p5, C4797a c4797a) {
        R0 r02 = new R0(new Handler(Looper.getMainLooper()));
        this.f2956a = new AtomicInteger();
        this.f2957b = new HashSet();
        this.f2958c = new PriorityBlockingQueue();
        this.f2959d = new PriorityBlockingQueue();
        this.f2964j = new ArrayList();
        this.f2965k = new ArrayList();
        this.f2960e = c3732p5;
        this.f2961f = c4797a;
        this.f2963h = new n1.e[4];
        this.f2962g = r02;
    }
}
