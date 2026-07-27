package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class H7 extends Q7 {

    /* renamed from: k, reason: collision with root package name */
    public static final Ux f25236k = new Ux();

    /* renamed from: h, reason: collision with root package name */
    public final C3764q6 f25237h;
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public final C4274ze f25238j;

    public H7(C4196y7 c4196y7, C3979u6 c3979u6, int i, Context context, C3764q6 c3764q6, C4274ze c4274ze) {
        super(c4196y7, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", c3979u6, i, 27);
        this.i = context;
        this.f25237h = c3764q6;
        this.f25238j = c4274ze;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:4:0x000e, B:6:0x0018, B:8:0x001e, B:13:0x002a, B:15:0x0034, B:18:0x00eb, B:19:0x00f1, B:35:0x0042, B:37:0x0048, B:38:0x00e8, B:39:0x004e, B:41:0x0075, B:42:0x007b, B:44:0x0081, B:47:0x0089, B:52:0x0095, B:54:0x009b, B:57:0x00a6, B:58:0x00ad, B:59:0x00ab, B:60:0x00b0, B:62:0x00b6, B:64:0x00bc, B:68:0x00a0, B:71:0x00c3, B:73:0x00d8, B:76:0x00e1), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.Q7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        U6 u6;
        U6 u62;
        boolean z3;
        Ux ux = f25236k;
        Context context = this.i;
        AtomicReference f3 = ux.f(context.getPackageName());
        synchronized (f3) {
            try {
                U6 u63 = (U6) f3.get();
                if (u63 != null) {
                    String str = u63.J;
                    char[] cArr = A7.f23634a;
                    if (str != null && !str.isEmpty()) {
                        z3 = false;
                        if (!z3) {
                            if (!u63.J.equals("E")) {
                                if (!u63.J.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                                }
                                u62 = (U6) f3.get();
                            }
                        }
                    }
                    z3 = true;
                    if (!z3) {
                    }
                }
                char[] cArr2 = A7.f23634a;
                if (this.f25238j != null) {
                    u6 = c();
                } else {
                    Boolean valueOf = Boolean.valueOf(!this.f25237h.A());
                    C3301ha c3301ha = AbstractC3569ma.f32309m3;
                    q2.r rVar = q2.r.f40204e;
                    Boolean bool = (Boolean) rVar.f40207c.a(c3301ha);
                    String b9 = ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32300l3)).booleanValue() ? b() : null;
                    if (bool.booleanValue() && this.f26979a.f35105l) {
                        if (b9 == null || b9.isEmpty()) {
                            try {
                                C4196y7 c4196y7 = this.f26979a;
                                C3694or c3694or = c4196y7.f35103j;
                                if ((c3694or != null ? (RunnableFutureC2966bE) c3694or.f32954u : c4196y7.i) != null) {
                                    (c3694or != null ? (RunnableFutureC2966bE) c3694or.f32954u : c4196y7.i).get();
                                }
                                H6 b10 = c4196y7.b();
                                if (b10 != null && b10.a0()) {
                                    b9 = b10.v0();
                                }
                            } catch (InterruptedException | ExecutionException unused) {
                            }
                            b9 = null;
                        }
                    }
                    U6 u64 = new U6((String) this.f26983e.invoke(null, context, valueOf, b9));
                    String str2 = u64.J;
                    if (!(str2 == null || str2.isEmpty())) {
                        str2.equals("E");
                    }
                    u6 = u64;
                }
                f3.set(u6);
                u62 = (U6) f3.get();
            } finally {
            }
        }
        C3979u6 c3979u6 = this.f26982d;
        synchronized (c3979u6) {
            if (u62 != null) {
                try {
                    String str3 = u62.J;
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).S0(str3);
                    long j6 = u62.f27887K;
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).F(j6);
                    String str4 = u62.f27888L;
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).E(str4);
                    String str5 = u62.f27889M;
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).O(str5);
                    String str6 = u62.f27890N;
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).P(str6);
                } finally {
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            C3301ha c3301ha = AbstractC3569ma.f32317n3;
            q2.r rVar = q2.r.f40204e;
            byte[] a9 = A7.a((String) rVar.f40207c.a(c3301ha));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(a9)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(A7.a((String) rVar.f40207c.a(AbstractC3569ma.f32327o3)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f26979a.f35096b;
            return AbstractC2968bG.f(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final U6 c() {
        int B9;
        C4274ze c4274ze;
        String str;
        RunnableFutureC2966bE runnableFutureC2966bE;
        C3301ha c3301ha = AbstractC3569ma.f31972A3;
        q2.r rVar = q2.r.f40204e;
        int intValue = ((Integer) rVar.f40207c.a(c3301ha)).intValue();
        C3764q6 c3764q6 = this.f25237h;
        if (intValue > 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
            if (((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).intValue() < c3764q6.B()) {
                B9 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).intValue();
                U6 u6 = new U6((String) this.f26983e.invoke(null, this.i, Boolean.FALSE, ""));
                c4274ze = this.f25238j;
                if (c4274ze != null && (runnableFutureC2966bE = (RunnableFutureC2966bE) c4274ze.f35360u) != null) {
                    try {
                        str = (String) runnableFutureC2966bE.get(B9, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    }
                    u6.J = str;
                    return u6;
                }
                str = "E";
                u6.J = str;
                return u6;
            }
        }
        B9 = c3764q6.B();
        U6 u62 = new U6((String) this.f26983e.invoke(null, this.i, Boolean.FALSE, ""));
        c4274ze = this.f25238j;
        if (c4274ze != null) {
            str = (String) runnableFutureC2966bE.get(B9, TimeUnit.MILLISECONDS);
            u62.J = str;
            return u62;
        }
        str = "E";
        u62.J = str;
        return u62;
    }
}
