package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C4869a;
import r2.C4906k;
import s2.C4949p;

/* loaded from: classes2.dex */
public final class Xs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29372a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f29373b;

    /* renamed from: c, reason: collision with root package name */
    public final RD f29374c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29375d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29376e;

    /* renamed from: f, reason: collision with root package name */
    public final C2889Yb f29377f;

    public Xs(C2889Yb c2889Yb, Context context, ScheduledExecutorService scheduledExecutorService, RD rd, int i, boolean z6, boolean z9) {
        this.f29377f = c2889Yb;
        this.f29372a = context;
        this.f29373b = scheduledExecutorService;
        this.f29374c = rd;
        this.f29375d = z6;
        this.f29376e = z9;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        C2889Yb c2889Yb = this.f29377f;
        C3490kg c3490kg = new C3490kg();
        x2.d dVar = C4949p.f40498g.f40499a;
        Context context = this.f29372a;
        int c9 = O2.f.f2270b.c(context, 12451000);
        if (c9 == 0 || c9 == 2) {
            AbstractC3436jg.f32055a.execute(new RunnableC3996u0(c2889Yb, context, c3490kg));
        }
        ID s9 = ID.s(c3490kg);
        final int i = 1;
        UA ua = new UA(this) { // from class: com.google.android.gms.internal.ads.Ws

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Xs f29207b;

            {
                this.f29207b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
            
                if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32976a4)).booleanValue() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            
                if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32966Z3)).booleanValue() == false) goto L24;
             */
            @Override // com.google.android.gms.internal.ads.UA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                C3404j1 a9;
                switch (i) {
                    case 0:
                        Xs xs = this.f29207b;
                        xs.getClass();
                        x2.d dVar2 = C4949p.f40498g.f40499a;
                        ContentResolver contentResolver = xs.f29372a.getContentResolver();
                        return new Pr(2, null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C3404j1(5));
                    default:
                        Xs xs2 = this.f29207b;
                        C4869a c4869a = (C4869a) obj;
                        xs2.getClass();
                        C3404j1 c3404j1 = new C3404j1(5);
                        if (!xs2.f29375d) {
                            break;
                        } else {
                            break;
                        }
                        try {
                            Context context2 = xs2.f29372a;
                            Sx f2 = Sx.f(context2);
                            Objects.requireNonNull(c4869a);
                            String str = c4869a.f40039a;
                            Objects.requireNonNull(str);
                            String packageName = context2.getPackageName();
                            long longValue = ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33025f4)).longValue();
                            boolean z6 = xs2.f29376e;
                            f2.getClass();
                            synchronized (Sx.class) {
                                a9 = f2.a(str, longValue, packageName, z6);
                            }
                            c3404j1 = a9;
                        } catch (IOException | IllegalArgumentException e9) {
                            C4906k.f40186C.f40196h.d("AdIdInfoSignalSource.getPaidV1", e9);
                            c3404j1 = new C3404j1(5);
                        }
                        return new Pr(2, c4869a, null, c3404j1);
                }
            }
        };
        RD rd = this.f29374c;
        final int i4 = 0;
        return QC.q((ID) QC.s(QC.u(s9, ua, rd), ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32778D1)).longValue(), TimeUnit.MILLISECONDS, this.f29373b), Throwable.class, new UA(this) { // from class: com.google.android.gms.internal.ads.Ws

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Xs f29207b;

            {
                this.f29207b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
            
                if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32976a4)).booleanValue() == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            
                if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32966Z3)).booleanValue() == false) goto L24;
             */
            @Override // com.google.android.gms.internal.ads.UA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                C3404j1 a9;
                switch (i4) {
                    case 0:
                        Xs xs = this.f29207b;
                        xs.getClass();
                        x2.d dVar2 = C4949p.f40498g.f40499a;
                        ContentResolver contentResolver = xs.f29372a.getContentResolver();
                        return new Pr(2, null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C3404j1(5));
                    default:
                        Xs xs2 = this.f29207b;
                        C4869a c4869a = (C4869a) obj;
                        xs2.getClass();
                        C3404j1 c3404j1 = new C3404j1(5);
                        if (!xs2.f29375d) {
                            break;
                        } else {
                            break;
                        }
                        try {
                            Context context2 = xs2.f29372a;
                            Sx f2 = Sx.f(context2);
                            Objects.requireNonNull(c4869a);
                            String str = c4869a.f40039a;
                            Objects.requireNonNull(str);
                            String packageName = context2.getPackageName();
                            long longValue = ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33025f4)).longValue();
                            boolean z6 = xs2.f29376e;
                            f2.getClass();
                            synchronized (Sx.class) {
                                a9 = f2.a(str, longValue, packageName, z6);
                            }
                            c3404j1 = a9;
                        } catch (IOException | IllegalArgumentException e9) {
                            C4906k.f40186C.f40196h.d("AdIdInfoSignalSource.getPaidV1", e9);
                            c3404j1 = new C3404j1(5);
                        }
                        return new Pr(2, c4869a, null, c3404j1);
                }
            }
        }, rd);
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 40;
    }
}
