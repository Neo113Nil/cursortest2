package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o2.C4783a;
import p2.C4835j;
import q2.C4900p;

/* loaded from: classes2.dex */
public final class Xs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28591a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f28592b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f28593c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28594d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28595e;

    /* renamed from: f, reason: collision with root package name */
    public final C2866Yb f28596f;

    public Xs(C2866Yb c2866Yb, Context context, ScheduledExecutorService scheduledExecutorService, RD rd, int i, boolean z3, boolean z6) {
        this.f28596f = c2866Yb;
        this.f28591a = context;
        this.f28592b = scheduledExecutorService;
        this.f28593c = rd;
        this.f28594d = z3;
        this.f28595e = z6;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        C2866Yb c2866Yb = this.f28596f;
        C3467kg c3467kg = new C3467kg();
        v2.d dVar = C4900p.f40196g.f40197a;
        Context context = this.f28591a;
        int c9 = M2.f.f1844b.c(context, 12451000);
        if (c9 == 0 || c9 == 2) {
            AbstractC3413jg.f31268a.execute(new RunnableC3973u0(c2866Yb, context, c3467kg));
        }
        ID s9 = ID.s(c3467kg);
        final int i = 1;
        UA ua = new UA(this) { // from class: com.google.android.gms.internal.ads.Ws

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Xs f28425b;

            {
                this.f28425b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
            
                if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32197a4)).booleanValue() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            
                if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32187Z3)).booleanValue() == false) goto L24;
             */
            @Override // com.google.android.gms.internal.ads.UA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                C3381j1 a9;
                switch (i) {
                    case 0:
                        Xs xs = this.f28425b;
                        xs.getClass();
                        v2.d dVar2 = C4900p.f40196g.f40197a;
                        ContentResolver contentResolver = xs.f28591a.getContentResolver();
                        return new Pr(2, null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C3381j1(5));
                    default:
                        Xs xs2 = this.f28425b;
                        C4783a c4783a = (C4783a) obj;
                        xs2.getClass();
                        C3381j1 c3381j1 = new C3381j1(5);
                        if (!xs2.f28594d) {
                            break;
                        } else {
                            break;
                        }
                        try {
                            Context context2 = xs2.f28591a;
                            Sx f3 = Sx.f(context2);
                            Objects.requireNonNull(c4783a);
                            String str = c4783a.f39556a;
                            Objects.requireNonNull(str);
                            String packageName = context2.getPackageName();
                            long longValue = ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32245f4)).longValue();
                            boolean z3 = xs2.f28595e;
                            f3.getClass();
                            synchronized (Sx.class) {
                                a9 = f3.a(str, longValue, packageName, z3);
                            }
                            c3381j1 = a9;
                        } catch (IOException | IllegalArgumentException e9) {
                            C4835j.f39730C.f39740h.d("AdIdInfoSignalSource.getPaidV1", e9);
                            c3381j1 = new C3381j1(5);
                        }
                        return new Pr(2, c4783a, null, c3381j1);
                }
            }
        };
        RD rd = this.f28593c;
        final int i6 = 0;
        return QC.q((ID) QC.s(QC.u(s9, ua, rd), ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31998D1)).longValue(), TimeUnit.MILLISECONDS, this.f28592b), Throwable.class, new UA(this) { // from class: com.google.android.gms.internal.ads.Ws

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Xs f28425b;

            {
                this.f28425b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
            
                if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32197a4)).booleanValue() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            
                if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32187Z3)).booleanValue() == false) goto L24;
             */
            @Override // com.google.android.gms.internal.ads.UA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                C3381j1 a9;
                switch (i6) {
                    case 0:
                        Xs xs = this.f28425b;
                        xs.getClass();
                        v2.d dVar2 = C4900p.f40196g.f40197a;
                        ContentResolver contentResolver = xs.f28591a.getContentResolver();
                        return new Pr(2, null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C3381j1(5));
                    default:
                        Xs xs2 = this.f28425b;
                        C4783a c4783a = (C4783a) obj;
                        xs2.getClass();
                        C3381j1 c3381j1 = new C3381j1(5);
                        if (!xs2.f28594d) {
                            break;
                        } else {
                            break;
                        }
                        try {
                            Context context2 = xs2.f28591a;
                            Sx f3 = Sx.f(context2);
                            Objects.requireNonNull(c4783a);
                            String str = c4783a.f39556a;
                            Objects.requireNonNull(str);
                            String packageName = context2.getPackageName();
                            long longValue = ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32245f4)).longValue();
                            boolean z3 = xs2.f28595e;
                            f3.getClass();
                            synchronized (Sx.class) {
                                a9 = f3.a(str, longValue, packageName, z3);
                            }
                            c3381j1 = a9;
                        } catch (IOException | IllegalArgumentException e9) {
                            C4835j.f39730C.f39740h.d("AdIdInfoSignalSource.getPaidV1", e9);
                            c3381j1 = new C3381j1(5);
                        }
                        return new Pr(2, c4783a, null, c3381j1);
                }
            }
        }, rd);
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 40;
    }
}
