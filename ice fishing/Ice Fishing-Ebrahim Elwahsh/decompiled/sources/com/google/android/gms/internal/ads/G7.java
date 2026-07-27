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
public final class G7 extends P7 {

    /* renamed from: k, reason: collision with root package name */
    public static final Vx f25100k = new Vx();

    /* renamed from: h, reason: collision with root package name */
    public final C3615n6 f25101h;
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public final C4017ue f25102j;

    public G7(C4101w7 c4101w7, C3830r6 c3830r6, int i, Context context, C3615n6 c3615n6, C4017ue c4017ue) {
        super(c4101w7, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", c3830r6, i, 27);
        this.i = context;
        this.f25101h = c3615n6;
        this.f25102j = c4017ue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:4:0x000e, B:6:0x0018, B:8:0x001e, B:13:0x002a, B:15:0x0034, B:18:0x00eb, B:19:0x00f1, B:35:0x0042, B:37:0x0048, B:38:0x00e8, B:39:0x004e, B:41:0x0075, B:42:0x007b, B:44:0x0081, B:47:0x0089, B:52:0x0095, B:54:0x009b, B:57:0x00a6, B:58:0x00ad, B:59:0x00ab, B:60:0x00b0, B:62:0x00b6, B:64:0x00bc, B:68:0x00a0, B:71:0x00c3, B:73:0x00d8, B:76:0x00e1), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.P7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        R6 r62;
        R6 r63;
        boolean z8;
        Vx vx = f25100k;
        Context context = this.i;
        AtomicReference m8 = vx.m(context.getPackageName());
        synchronized (m8) {
            try {
                R6 r64 = (R6) m8.get();
                if (r64 != null) {
                    String str = r64.f27309I;
                    char[] cArr = AbstractC4263z7.f35480a;
                    if (str != null && !str.isEmpty()) {
                        z8 = false;
                        if (!z8) {
                            if (!r64.f27309I.equals("E")) {
                                if (!r64.f27309I.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                                }
                                r63 = (R6) m8.get();
                            }
                        }
                    }
                    z8 = true;
                    if (!z8) {
                    }
                }
                char[] cArr2 = AbstractC4263z7.f35480a;
                if (this.f25102j != null) {
                    r62 = c();
                } else {
                    Boolean valueOf = Boolean.valueOf(!this.f25101h.A());
                    C3151ea c3151ea = AbstractC3368ia.f31728m3;
                    q2.r rVar = q2.r.f40116e;
                    Boolean bool = (Boolean) rVar.f40119c.a(c3151ea);
                    String b9 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31719l3)).booleanValue() ? b() : null;
                    if (bool.booleanValue() && this.f26841a.f34939l) {
                        if (b9 == null || b9.isEmpty()) {
                            try {
                                C4101w7 c4101w7 = this.f26841a;
                                C3761pr c3761pr = c4101w7.f34937j;
                                if ((c3761pr != null ? (RunnableFutureC3083dE) c3761pr.f33523u : c4101w7.i) != null) {
                                    (c3761pr != null ? (RunnableFutureC3083dE) c3761pr.f33523u : c4101w7.i).get();
                                }
                                D6 b10 = c4101w7.b();
                                if (b10 != null && b10.a0()) {
                                    b9 = b10.v0();
                                }
                            } catch (InterruptedException | ExecutionException unused) {
                            }
                            b9 = null;
                        }
                    }
                    R6 r65 = new R6((String) this.f26845e.invoke(null, context, valueOf, b9));
                    String str2 = r65.f27309I;
                    if (!(str2 == null || str2.isEmpty())) {
                        str2.equals("E");
                    }
                    r62 = r65;
                }
                m8.set(r62);
                r63 = (R6) m8.get();
            } finally {
            }
        }
        C3830r6 c3830r6 = this.f26844d;
        synchronized (c3830r6) {
            if (r63 != null) {
                try {
                    String str3 = r63.f27309I;
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).S0(str3);
                    long j9 = r63.J;
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).F(j9);
                    String str4 = r63.f27310K;
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).E(str4);
                    String str5 = r63.f27311L;
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).O(str5);
                    String str6 = r63.f27312M;
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).P(str6);
                } finally {
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            C3151ea c3151ea = AbstractC3368ia.f31736n3;
            q2.r rVar = q2.r.f40116e;
            byte[] a9 = AbstractC4263z7.a((String) rVar.f40119c.a(c3151ea));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(a9)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(AbstractC4263z7.a((String) rVar.f40119c.a(AbstractC3368ia.f31746o3)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f26841a.f34930b;
            return AbstractC2655Lg.f(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final R6 c() {
        int B8;
        C4017ue c4017ue;
        String str;
        RunnableFutureC3083dE runnableFutureC3083dE;
        C3151ea c3151ea = AbstractC3368ia.f31395A3;
        q2.r rVar = q2.r.f40116e;
        int intValue = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
        C3615n6 c3615n6 = this.f25101h;
        if (intValue > 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).intValue() < c3615n6.B()) {
                B8 = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).intValue();
                R6 r62 = new R6((String) this.f26845e.invoke(null, this.i, Boolean.FALSE, ""));
                c4017ue = this.f25102j;
                if (c4017ue != null && (runnableFutureC3083dE = (RunnableFutureC3083dE) c4017ue.f34630u) != null) {
                    try {
                        str = (String) runnableFutureC3083dE.get(B8, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    }
                    r62.f27309I = str;
                    return r62;
                }
                str = "E";
                r62.f27309I = str;
                return r62;
            }
        }
        B8 = c3615n6.B();
        R6 r622 = new R6((String) this.f26845e.invoke(null, this.i, Boolean.FALSE, ""));
        c4017ue = this.f25102j;
        if (c4017ue != null) {
            str = (String) runnableFutureC3083dE.get(B8, TimeUnit.MILLISECONDS);
            r622.f27309I = str;
            return r622;
        }
        str = "E";
        r622.f27309I = str;
        return r622;
    }
}
