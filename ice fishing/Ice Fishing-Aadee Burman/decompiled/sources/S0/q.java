package S0;

import L3.F;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC3171f5;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC3848rk;
import com.google.android.gms.internal.ads.C2558Fk;
import com.google.android.gms.internal.ads.C2626Jk;
import com.google.android.gms.internal.ads.C2660Lk;
import com.google.android.gms.internal.ads.C2957b5;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C3097dl;
import com.google.android.gms.internal.ads.C3208fp;
import com.google.android.gms.internal.ads.C3266gt;
import com.google.android.gms.internal.ads.C3364ik;
import com.google.android.gms.internal.ads.C3691oo;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.ads.C4183xv;
import com.google.android.gms.internal.ads.C4281zl;
import com.google.android.gms.internal.ads.InterfaceC2591Hj;
import com.google.android.gms.internal.ads.InterfaceC3317hq;
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
import g1.C4523c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m1.C4726a;
import u0.C5059i;
import z0.C5253i;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2827a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2828b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2829c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2830d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2831e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2832f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2833g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2834h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2835j;

    /* renamed from: k, reason: collision with root package name */
    public Object f2836k;

    public q(Yt yt, St st, C2558Fk c2558Fk, C2626Jk c2626Jk, C3266gt c3266gt, BinderC3848rk binderC3848rk, C3097dl c3097dl, C2660Lk c2660Lk, C4281zl c4281zl, C3364ik c3364ik, C3691oo c3691oo) {
        this.f2827a = yt;
        this.f2828b = st;
        this.f2829c = c2558Fk;
        this.f2830d = c2626Jk;
        this.f2831e = c3266gt;
        this.f2832f = binderC3848rk;
        this.f2833g = c3097dl;
        this.f2834h = c2660Lk;
        this.i = c4281zl;
        this.f2835j = c3364ik;
        this.f2836k = c3691oo;
    }

    public ArrayList a() {
        C5059i c5059i;
        C5059i a9 = C5059i.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a9.g(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            int m9 = F.m(m4, "id");
            int m10 = F.m(m4, com.anythink.core.express.b.a.f17526b);
            int m11 = F.m(m4, "worker_class_name");
            int m12 = F.m(m4, "input_merger_class_name");
            int m13 = F.m(m4, "input");
            int m14 = F.m(m4, "output");
            int m15 = F.m(m4, "initial_delay");
            int m16 = F.m(m4, "interval_duration");
            int m17 = F.m(m4, "flex_duration");
            int m18 = F.m(m4, "run_attempt_count");
            int m19 = F.m(m4, "backoff_policy");
            int m20 = F.m(m4, "backoff_delay_duration");
            int m21 = F.m(m4, "last_enqueue_time");
            c5059i = a9;
            try {
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
                    int n9 = com.bumptech.glide.f.n(m4.getInt(m10));
                    String string2 = m4.isNull(m11) ? null : m4.getString(m11);
                    String string3 = m4.isNull(m12) ? null : m4.getString(m12);
                    J0.h a10 = J0.h.a(m4.isNull(m13) ? null : m4.getBlob(m13));
                    J0.h a11 = J0.h.a(m4.isNull(m14) ? null : m4.getBlob(m14));
                    long j6 = m4.getLong(m15);
                    long j9 = m4.getLong(m16);
                    long j10 = m4.getLong(m17);
                    int i6 = m4.getInt(m18);
                    int k9 = com.bumptech.glide.f.k(m4.getInt(m19));
                    long j11 = m4.getLong(m20);
                    long j12 = m4.getLong(m21);
                    int i9 = i;
                    long j13 = m4.getLong(i9);
                    int i10 = m9;
                    int i11 = m23;
                    long j14 = m4.getLong(i11);
                    m23 = i11;
                    int i12 = m24;
                    boolean z3 = m4.getInt(i12) != 0;
                    m24 = i12;
                    int i13 = m25;
                    int m36 = com.bumptech.glide.f.m(m4.getInt(i13));
                    m25 = i13;
                    int i14 = m26;
                    int i15 = m4.getInt(i14);
                    m26 = i14;
                    int i16 = m27;
                    int i17 = m4.getInt(i16);
                    m27 = i16;
                    int i18 = m28;
                    int l9 = com.bumptech.glide.f.l(m4.getInt(i18));
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
                    arrayList.add(new p(string, n9, string2, string3, a10, a11, j6, j9, j10, new J0.d(l9, z6, z9, z10, z11, j15, j16, com.bumptech.glide.f.b(bArr)), i6, k9, j11, j12, j13, j14, z3, m36, i15, i17));
                    m9 = i10;
                    i = i9;
                }
                m4.close();
                c5059i.j();
                return arrayList;
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

    public ArrayList b(int i) {
        C5059i c5059i;
        C5059i a9 = C5059i.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a9.g(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            int m9 = F.m(m4, "id");
            int m10 = F.m(m4, com.anythink.core.express.b.a.f17526b);
            int m11 = F.m(m4, "worker_class_name");
            int m12 = F.m(m4, "input_merger_class_name");
            int m13 = F.m(m4, "input");
            int m14 = F.m(m4, "output");
            int m15 = F.m(m4, "initial_delay");
            int m16 = F.m(m4, "interval_duration");
            int m17 = F.m(m4, "flex_duration");
            int m18 = F.m(m4, "run_attempt_count");
            int m19 = F.m(m4, "backoff_policy");
            int m20 = F.m(m4, "backoff_delay_duration");
            int m21 = F.m(m4, "last_enqueue_time");
            c5059i = a9;
            try {
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
                int i6 = m22;
                ArrayList arrayList = new ArrayList(m4.getCount());
                while (m4.moveToNext()) {
                    byte[] bArr = null;
                    String string = m4.isNull(m9) ? null : m4.getString(m9);
                    int n9 = com.bumptech.glide.f.n(m4.getInt(m10));
                    String string2 = m4.isNull(m11) ? null : m4.getString(m11);
                    String string3 = m4.isNull(m12) ? null : m4.getString(m12);
                    J0.h a10 = J0.h.a(m4.isNull(m13) ? null : m4.getBlob(m13));
                    J0.h a11 = J0.h.a(m4.isNull(m14) ? null : m4.getBlob(m14));
                    long j6 = m4.getLong(m15);
                    long j9 = m4.getLong(m16);
                    long j10 = m4.getLong(m17);
                    int i9 = m4.getInt(m18);
                    int k9 = com.bumptech.glide.f.k(m4.getInt(m19));
                    long j11 = m4.getLong(m20);
                    long j12 = m4.getLong(m21);
                    int i10 = i6;
                    long j13 = m4.getLong(i10);
                    int i11 = m9;
                    int i12 = m23;
                    long j14 = m4.getLong(i12);
                    m23 = i12;
                    int i13 = m24;
                    boolean z3 = m4.getInt(i13) != 0;
                    m24 = i13;
                    int i14 = m25;
                    int m36 = com.bumptech.glide.f.m(m4.getInt(i14));
                    m25 = i14;
                    int i15 = m26;
                    int i16 = m4.getInt(i15);
                    m26 = i15;
                    int i17 = m27;
                    int i18 = m4.getInt(i17);
                    m27 = i17;
                    int i19 = m28;
                    int l9 = com.bumptech.glide.f.l(m4.getInt(i19));
                    m28 = i19;
                    int i20 = m29;
                    boolean z6 = m4.getInt(i20) != 0;
                    m29 = i20;
                    int i21 = m30;
                    boolean z9 = m4.getInt(i21) != 0;
                    m30 = i21;
                    int i22 = m31;
                    boolean z10 = m4.getInt(i22) != 0;
                    m31 = i22;
                    int i23 = m32;
                    boolean z11 = m4.getInt(i23) != 0;
                    m32 = i23;
                    int i24 = m33;
                    long j15 = m4.getLong(i24);
                    m33 = i24;
                    int i25 = m34;
                    long j16 = m4.getLong(i25);
                    m34 = i25;
                    int i26 = m35;
                    if (!m4.isNull(i26)) {
                        bArr = m4.getBlob(i26);
                    }
                    m35 = i26;
                    arrayList.add(new p(string, n9, string2, string3, a10, a11, j6, j9, j10, new J0.d(l9, z6, z9, z10, z11, j15, j16, com.bumptech.glide.f.b(bArr)), i9, k9, j11, j12, j13, j14, z3, m36, i16, i18));
                    m9 = i11;
                    i6 = i10;
                }
                m4.close();
                c5059i.j();
                return arrayList;
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

    public ArrayList c() {
        C5059i c5059i;
        C5059i a9 = C5059i.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            int m9 = F.m(m4, "id");
            int m10 = F.m(m4, com.anythink.core.express.b.a.f17526b);
            int m11 = F.m(m4, "worker_class_name");
            int m12 = F.m(m4, "input_merger_class_name");
            int m13 = F.m(m4, "input");
            int m14 = F.m(m4, "output");
            int m15 = F.m(m4, "initial_delay");
            int m16 = F.m(m4, "interval_duration");
            int m17 = F.m(m4, "flex_duration");
            int m18 = F.m(m4, "run_attempt_count");
            int m19 = F.m(m4, "backoff_policy");
            int m20 = F.m(m4, "backoff_delay_duration");
            int m21 = F.m(m4, "last_enqueue_time");
            c5059i = a9;
            try {
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
                    int n9 = com.bumptech.glide.f.n(m4.getInt(m10));
                    String string2 = m4.isNull(m11) ? null : m4.getString(m11);
                    String string3 = m4.isNull(m12) ? null : m4.getString(m12);
                    J0.h a10 = J0.h.a(m4.isNull(m13) ? null : m4.getBlob(m13));
                    J0.h a11 = J0.h.a(m4.isNull(m14) ? null : m4.getBlob(m14));
                    long j6 = m4.getLong(m15);
                    long j9 = m4.getLong(m16);
                    long j10 = m4.getLong(m17);
                    int i6 = m4.getInt(m18);
                    int k9 = com.bumptech.glide.f.k(m4.getInt(m19));
                    long j11 = m4.getLong(m20);
                    long j12 = m4.getLong(m21);
                    int i9 = i;
                    long j13 = m4.getLong(i9);
                    int i10 = m9;
                    int i11 = m23;
                    long j14 = m4.getLong(i11);
                    m23 = i11;
                    int i12 = m24;
                    boolean z3 = m4.getInt(i12) != 0;
                    m24 = i12;
                    int i13 = m25;
                    int m36 = com.bumptech.glide.f.m(m4.getInt(i13));
                    m25 = i13;
                    int i14 = m26;
                    int i15 = m4.getInt(i14);
                    m26 = i14;
                    int i16 = m27;
                    int i17 = m4.getInt(i16);
                    m27 = i16;
                    int i18 = m28;
                    int l9 = com.bumptech.glide.f.l(m4.getInt(i18));
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
                    arrayList.add(new p(string, n9, string2, string3, a10, a11, j6, j9, j10, new J0.d(l9, z6, z9, z10, z11, j15, j16, com.bumptech.glide.f.b(bArr)), i6, k9, j11, j12, j13, j14, z3, m36, i15, i17));
                    m9 = i10;
                    i = i9;
                }
                m4.close();
                c5059i.j();
                return arrayList;
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

    public ArrayList d() {
        C5059i c5059i;
        C5059i a9 = C5059i.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            int m9 = F.m(m4, "id");
            int m10 = F.m(m4, com.anythink.core.express.b.a.f17526b);
            int m11 = F.m(m4, "worker_class_name");
            int m12 = F.m(m4, "input_merger_class_name");
            int m13 = F.m(m4, "input");
            int m14 = F.m(m4, "output");
            int m15 = F.m(m4, "initial_delay");
            int m16 = F.m(m4, "interval_duration");
            int m17 = F.m(m4, "flex_duration");
            int m18 = F.m(m4, "run_attempt_count");
            int m19 = F.m(m4, "backoff_policy");
            int m20 = F.m(m4, "backoff_delay_duration");
            int m21 = F.m(m4, "last_enqueue_time");
            c5059i = a9;
            try {
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
                    int n9 = com.bumptech.glide.f.n(m4.getInt(m10));
                    String string2 = m4.isNull(m11) ? null : m4.getString(m11);
                    String string3 = m4.isNull(m12) ? null : m4.getString(m12);
                    J0.h a10 = J0.h.a(m4.isNull(m13) ? null : m4.getBlob(m13));
                    J0.h a11 = J0.h.a(m4.isNull(m14) ? null : m4.getBlob(m14));
                    long j6 = m4.getLong(m15);
                    long j9 = m4.getLong(m16);
                    long j10 = m4.getLong(m17);
                    int i6 = m4.getInt(m18);
                    int k9 = com.bumptech.glide.f.k(m4.getInt(m19));
                    long j11 = m4.getLong(m20);
                    long j12 = m4.getLong(m21);
                    int i9 = i;
                    long j13 = m4.getLong(i9);
                    int i10 = m9;
                    int i11 = m23;
                    long j14 = m4.getLong(i11);
                    m23 = i11;
                    int i12 = m24;
                    boolean z3 = m4.getInt(i12) != 0;
                    m24 = i12;
                    int i13 = m25;
                    int m36 = com.bumptech.glide.f.m(m4.getInt(i13));
                    m25 = i13;
                    int i14 = m26;
                    int i15 = m4.getInt(i14);
                    m26 = i14;
                    int i16 = m27;
                    int i17 = m4.getInt(i16);
                    m27 = i16;
                    int i18 = m28;
                    int l9 = com.bumptech.glide.f.l(m4.getInt(i18));
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
                    arrayList.add(new p(string, n9, string2, string3, a10, a11, j6, j9, j10, new J0.d(l9, z6, z9, z10, z11, j15, j16, com.bumptech.glide.f.b(bArr)), i6, k9, j11, j12, j13, j14, z3, m36, i15, i17));
                    m9 = i10;
                    i = i9;
                }
                m4.close();
                c5059i.j();
                return arrayList;
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

    public int e(String str) {
        C5059i a9 = C5059i.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            int i = 0;
            if (m4.moveToFirst()) {
                Integer valueOf = m4.isNull(0) ? null : Integer.valueOf(m4.getInt(0));
                if (valueOf != null) {
                    i = com.bumptech.glide.f.n(valueOf.intValue());
                }
            }
            return i;
        } finally {
            m4.close();
            a9.j();
        }
    }

    public ArrayList f(String str) {
        C5059i a9 = C5059i.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m4.getCount());
            while (m4.moveToNext()) {
                arrayList.add(m4.isNull(0) ? null : m4.getString(0));
            }
            return arrayList;
        } finally {
            m4.close();
            a9.j();
        }
    }

    public ArrayList g() {
        C5059i a9 = C5059i.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        a9.c(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m4.getCount());
            while (m4.moveToNext()) {
                arrayList.add(m4.isNull(0) ? null : m4.getString(0));
            }
            return arrayList;
        } finally {
            m4.close();
            a9.j();
        }
    }

    public p h(String str) {
        C5059i c5059i;
        int m4;
        int m9;
        int m10;
        int m11;
        int m12;
        int m13;
        int m14;
        int m15;
        int m16;
        int m17;
        int m18;
        int m19;
        int m20;
        C5059i a9 = C5059i.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        Cursor m21 = workDatabase_Impl.m(a9);
        try {
            m4 = F.m(m21, "id");
            m9 = F.m(m21, com.anythink.core.express.b.a.f17526b);
            m10 = F.m(m21, "worker_class_name");
            m11 = F.m(m21, "input_merger_class_name");
            m12 = F.m(m21, "input");
            m13 = F.m(m21, "output");
            m14 = F.m(m21, "initial_delay");
            m15 = F.m(m21, "interval_duration");
            m16 = F.m(m21, "flex_duration");
            m17 = F.m(m21, "run_attempt_count");
            m18 = F.m(m21, "backoff_policy");
            m19 = F.m(m21, "backoff_delay_duration");
            m20 = F.m(m21, "last_enqueue_time");
            c5059i = a9;
        } catch (Throwable th) {
            th = th;
            c5059i = a9;
        }
        try {
            int m22 = F.m(m21, "minimum_retention_duration");
            int m23 = F.m(m21, "schedule_requested_at");
            int m24 = F.m(m21, "run_in_foreground");
            int m25 = F.m(m21, "out_of_quota_policy");
            int m26 = F.m(m21, "period_count");
            int m27 = F.m(m21, "generation");
            int m28 = F.m(m21, "required_network_type");
            int m29 = F.m(m21, "requires_charging");
            int m30 = F.m(m21, "requires_device_idle");
            int m31 = F.m(m21, "requires_battery_not_low");
            int m32 = F.m(m21, "requires_storage_not_low");
            int m33 = F.m(m21, "trigger_content_update_delay");
            int m34 = F.m(m21, "trigger_max_content_delay");
            int m35 = F.m(m21, "content_uri_triggers");
            p pVar = null;
            byte[] blob = null;
            if (m21.moveToFirst()) {
                String string = m21.isNull(m4) ? null : m21.getString(m4);
                int n9 = com.bumptech.glide.f.n(m21.getInt(m9));
                String string2 = m21.isNull(m10) ? null : m21.getString(m10);
                String string3 = m21.isNull(m11) ? null : m21.getString(m11);
                J0.h a10 = J0.h.a(m21.isNull(m12) ? null : m21.getBlob(m12));
                J0.h a11 = J0.h.a(m21.isNull(m13) ? null : m21.getBlob(m13));
                long j6 = m21.getLong(m14);
                long j9 = m21.getLong(m15);
                long j10 = m21.getLong(m16);
                int i = m21.getInt(m17);
                int k9 = com.bumptech.glide.f.k(m21.getInt(m18));
                long j11 = m21.getLong(m19);
                long j12 = m21.getLong(m20);
                long j13 = m21.getLong(m22);
                long j14 = m21.getLong(m23);
                boolean z3 = m21.getInt(m24) != 0;
                int m36 = com.bumptech.glide.f.m(m21.getInt(m25));
                int i6 = m21.getInt(m26);
                int i9 = m21.getInt(m27);
                int l9 = com.bumptech.glide.f.l(m21.getInt(m28));
                boolean z6 = m21.getInt(m29) != 0;
                boolean z9 = m21.getInt(m30) != 0;
                boolean z10 = m21.getInt(m31) != 0;
                boolean z11 = m21.getInt(m32) != 0;
                long j15 = m21.getLong(m33);
                long j16 = m21.getLong(m34);
                if (!m21.isNull(m35)) {
                    blob = m21.getBlob(m35);
                }
                pVar = new p(string, n9, string2, string3, a10, a11, j6, j9, j10, new J0.d(l9, z6, z9, z10, z11, j15, j16, com.bumptech.glide.f.b(blob)), i, k9, j11, j12, j13, j14, z3, m36, i6, i9);
            }
            m21.close();
            c5059i.j();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            m21.close();
            c5059i.j();
            throw th;
        }
    }

    public void i(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2835j;
        C5253i a9 = hVar.a();
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
        synchronized (((ArrayList) this.f2836k)) {
            try {
                Iterator it = ((ArrayList) this.f2836k).iterator();
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
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2833g;
        C5253i a9 = hVar.a();
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

    public void l(String str, J0.h hVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        h hVar2 = (h) this.f2832f;
        C5253i a9 = hVar2.a();
        byte[] c9 = J0.h.c(hVar);
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
            hVar2.n(a9);
        }
    }

    public void m(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2827a;
        workDatabase_Impl.b();
        h hVar = (h) this.f2830d;
        C5253i a9 = hVar.a();
        a9.g(1, com.bumptech.glide.f.A(i));
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
        X4 x42 = (X4) this.f2834h;
        if (x42 != null) {
            x42.f28482w = true;
            x42.interrupt();
        }
        C2957b5[] c2957b5Arr = (C2957b5[]) this.f2833g;
        for (int i = 0; i < 4; i++) {
            C2957b5 c2957b5 = c2957b5Arr[i];
            if (c2957b5 != null) {
                c2957b5.f29212w = true;
                c2957b5.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.f2829c;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.f2830d;
        C3709p5 c3709p5 = (C3709p5) this.f2831e;
        Ux ux = (Ux) this.f2836k;
        X4 x43 = new X4(priorityBlockingQueue, priorityBlockingQueue2, c3709p5, ux);
        this.f2834h = x43;
        x43.start();
        for (int i6 = 0; i6 < 4; i6++) {
            C2957b5 c2957b52 = new C2957b5(priorityBlockingQueue2, (C2991bm) this.f2832f, c3709p5, ux);
            c2957b5Arr[i6] = c2957b52;
            c2957b52.start();
        }
    }

    public void o(AbstractC3171f5 abstractC3171f5) {
        abstractC3171f5.f30037A = this;
        HashSet hashSet = (HashSet) this.f2828b;
        synchronized (hashSet) {
            hashSet.add(abstractC3171f5);
        }
        abstractC3171f5.f30048z = Integer.valueOf(((AtomicInteger) this.f2827a).incrementAndGet());
        abstractC3171f5.a("add-to-queue");
        p();
        ((PriorityBlockingQueue) this.f2829c).add(abstractC3171f5);
    }

    public void p() {
        ArrayList arrayList = (ArrayList) this.f2835j;
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
        N3.a k9;
        synchronized (this) {
            Iterator it = st.f27606a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    k9 = QC.k(new C3208fp(3));
                    break;
                }
                InterfaceC3317hq a9 = ((InterfaceC2591Hj) this.f2831e).a(st.f27608b, (String) it.next());
                if (a9 != null && a9.b((Yt) this.f2836k, st)) {
                    k9 = QC.s(a9.a((Yt) this.f2836k, st), st.f27598R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f2830d);
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ga)).booleanValue()) {
                        Su g4 = Su.g((Context) this.f2827a, 12);
                        g4.m(st.f27581E);
                        g4.c();
                        AbstractC2772Sd.G(k9, (Vu) this.f2828b, g4, false);
                    }
                }
            }
        }
        ((Xq) this.f2832f).b((Yt) this.f2836k, st, k9, (C4183xv) this.f2833g);
        k9.a(new LD(0, k9, new c(this, st)), (RD) this.f2829c);
    }

    public q(Context context, Vu vu, RD rd, ScheduledExecutorService scheduledExecutorService, InterfaceC2591Hj interfaceC2591Hj, Xq xq, C4183xv c4183xv) {
        this.f2834h = new XD();
        this.i = new AtomicBoolean();
        this.f2827a = context;
        this.f2828b = vu;
        this.f2829c = rd;
        this.f2830d = scheduledExecutorService;
        this.f2831e = interfaceC2591Hj;
        this.f2832f = xq;
        this.f2833g = c4183xv;
    }

    public q(C3709p5 c3709p5, C2991bm c2991bm) {
        Ux ux = new Ux(new Handler(Looper.getMainLooper()));
        this.f2827a = new AtomicInteger();
        this.f2828b = new HashSet();
        this.f2829c = new PriorityBlockingQueue();
        this.f2830d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.f2835j = new ArrayList();
        this.f2831e = c3709p5;
        this.f2832f = c2991bm;
        this.f2833g = new C2957b5[4];
        this.f2836k = ux;
    }

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f2827a = workDatabase_Impl;
        this.f2828b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 8);
        this.f2829c = new h(workDatabase_Impl, 9);
        this.f2830d = new h(workDatabase_Impl, 10);
        this.f2831e = new h(workDatabase_Impl, 11);
        this.f2832f = new h(workDatabase_Impl, 12);
        this.f2833g = new h(workDatabase_Impl, 13);
        this.f2834h = new h(workDatabase_Impl, 14);
        this.i = new h(workDatabase_Impl, 15);
        this.f2835j = new h(workDatabase_Impl, 4);
        this.f2836k = new h(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 7);
    }

    public q(C3709p5 c3709p5, C4726a c4726a) {
        C4523c c4523c = new C4523c(new Handler(Looper.getMainLooper()));
        this.f2827a = new AtomicInteger();
        this.f2828b = new HashSet();
        this.f2829c = new PriorityBlockingQueue();
        this.f2830d = new PriorityBlockingQueue();
        this.f2835j = new ArrayList();
        this.f2836k = new ArrayList();
        this.f2831e = c3709p5;
        this.f2832f = c4726a;
        this.f2834h = new l1.e[4];
        this.f2833g = c4523c;
    }
}
