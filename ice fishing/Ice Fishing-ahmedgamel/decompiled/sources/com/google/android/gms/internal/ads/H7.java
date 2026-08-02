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
    public static final Ux f26008k = new Ux();

    /* renamed from: h, reason: collision with root package name */
    public final C3787q6 f26009h;
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public final C4297ze f26010j;

    public H7(C4219y7 c4219y7, C4002u6 c4002u6, int i, Context context, C3787q6 c3787q6, C4297ze c4297ze) {
        super(c4219y7, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", c4002u6, i, 27);
        this.i = context;
        this.f26009h = c3787q6;
        this.f26010j = c4297ze;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:4:0x000e, B:6:0x0018, B:8:0x001e, B:13:0x002a, B:15:0x0034, B:18:0x00eb, B:19:0x00f1, B:35:0x0042, B:37:0x0048, B:38:0x00e8, B:39:0x004e, B:41:0x0075, B:42:0x007b, B:44:0x0081, B:47:0x0089, B:52:0x0095, B:54:0x009b, B:57:0x00a6, B:58:0x00ad, B:59:0x00ab, B:60:0x00b0, B:62:0x00b6, B:64:0x00bc, B:68:0x00a0, B:71:0x00c3, B:73:0x00d8, B:76:0x00e1), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.Q7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        U6 u6;
        U6 u62;
        boolean z6;
        Ux ux = f26008k;
        Context context = this.i;
        AtomicReference l9 = ux.l(context.getPackageName());
        synchronized (l9) {
            try {
                U6 u63 = (U6) l9.get();
                if (u63 != null) {
                    String str = u63.J;
                    char[] cArr = A7.f24414a;
                    if (str != null && !str.isEmpty()) {
                        z6 = false;
                        if (!z6) {
                            if (!u63.J.equals("E")) {
                                if (!u63.J.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                                }
                                u62 = (U6) l9.get();
                            }
                        }
                    }
                    z6 = true;
                    if (!z6) {
                    }
                }
                char[] cArr2 = A7.f24414a;
                if (this.f26010j != null) {
                    u6 = c();
                } else {
                    Boolean valueOf = Boolean.valueOf(!this.f26009h.A());
                    C3324ha c3324ha = AbstractC3592ma.f33088m3;
                    s2.r rVar = s2.r.f40506e;
                    Boolean bool = (Boolean) rVar.f40509c.a(c3324ha);
                    String b9 = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33079l3)).booleanValue() ? b() : null;
                    if (bool.booleanValue() && this.f27766a.f35891l) {
                        if (b9 == null || b9.isEmpty()) {
                            try {
                                C4219y7 c4219y7 = this.f27766a;
                                C3717or c3717or = c4219y7.f35889j;
                                if ((c3717or != null ? (RunnableFutureC2989bE) c3717or.f33740u : c4219y7.i) != null) {
                                    (c3717or != null ? (RunnableFutureC2989bE) c3717or.f33740u : c4219y7.i).get();
                                }
                                H6 b10 = c4219y7.b();
                                if (b10 != null && b10.a0()) {
                                    b9 = b10.v0();
                                }
                            } catch (InterruptedException | ExecutionException unused) {
                            }
                            b9 = null;
                        }
                    }
                    U6 u64 = new U6((String) this.f27770e.invoke(null, context, valueOf, b9));
                    String str2 = u64.J;
                    if (!(str2 == null || str2.isEmpty())) {
                        str2.equals("E");
                    }
                    u6 = u64;
                }
                l9.set(u6);
                u62 = (U6) l9.get();
            } finally {
            }
        }
        C4002u6 c4002u6 = this.f27769d;
        synchronized (c4002u6) {
            if (u62 != null) {
                try {
                    String str3 = u62.J;
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).S0(str3);
                    long j6 = u62.f28684K;
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).F(j6);
                    String str4 = u62.f28685L;
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).E(str4);
                    String str5 = u62.f28686M;
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).O(str5);
                    String str6 = u62.f28687N;
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).P(str6);
                } finally {
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            C3324ha c3324ha = AbstractC3592ma.f33098n3;
            s2.r rVar = s2.r.f40506e;
            byte[] a9 = A7.a((String) rVar.f40509c.a(c3324ha));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(a9)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(A7.a((String) rVar.f40509c.a(AbstractC3592ma.f33108o3)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f27766a.f35882b;
            return AbstractC2991bG.f(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final U6 c() {
        int B3;
        C4297ze c4297ze;
        String str;
        RunnableFutureC2989bE runnableFutureC2989bE;
        C3324ha c3324ha = AbstractC3592ma.f32753A3;
        s2.r rVar = s2.r.f40506e;
        int intValue = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
        C3787q6 c3787q6 = this.f26009h;
        if (intValue > 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).intValue() < c3787q6.B()) {
                B3 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).intValue();
                U6 u6 = new U6((String) this.f27770e.invoke(null, this.i, Boolean.FALSE, ""));
                c4297ze = this.f26010j;
                if (c4297ze != null && (runnableFutureC2989bE = (RunnableFutureC2989bE) c4297ze.f36133u) != null) {
                    try {
                        str = (String) runnableFutureC2989bE.get(B3, TimeUnit.MILLISECONDS);
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
        B3 = c3787q6.B();
        U6 u62 = new U6((String) this.f27770e.invoke(null, this.i, Boolean.FALSE, ""));
        c4297ze = this.f26010j;
        if (c4297ze != null) {
            str = (String) runnableFutureC2989bE.get(B3, TimeUnit.MILLISECONDS);
            u62.J = str;
            return u62;
        }
        str = "E";
        u62.J = str;
        return u62;
    }
}
