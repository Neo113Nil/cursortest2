package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.qD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3794qD extends AbstractC3042cE implements P3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f34000w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final QD f34001x = new QD(AbstractC3310hD.class);

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f34002y;

    /* renamed from: z, reason: collision with root package name */
    public static final AbstractC3364iD f34003z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f34004n;

    /* renamed from: u, reason: collision with root package name */
    public volatile C3148eD f34005u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C3740pD f34006v;

    static {
        boolean z6;
        AbstractC3364iD c3470kD;
        Throwable th;
        Throwable th2;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        f34002y = z6;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                c3470kD = new C3686oD();
            } catch (Error | Exception e9) {
                try {
                    c3470kD = new C3416jD();
                } catch (Error | Exception e10) {
                    th3 = e10;
                    c3470kD = new C3470kD();
                }
                th = th3;
                th2 = e9;
            }
        } else {
            try {
                c3470kD = new C3416jD();
            } catch (NoClassDefFoundError unused2) {
                c3470kD = new C3470kD();
            }
        }
        th = null;
        th2 = null;
        f34003z = c3470kD;
        if (th != null) {
            QD qd = f34001x;
            Logger a9 = qd.a();
            Level level = Level.SEVERE;
            a9.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            qd.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(C3740pD c3740pD) {
        c3740pD.f33833a = null;
        while (true) {
            C3740pD c3740pD2 = this.f34006v;
            if (c3740pD2 != C3740pD.f33832c) {
                C3740pD c3740pD3 = null;
                while (c3740pD2 != null) {
                    C3740pD c3740pD4 = c3740pD2.f33834b;
                    if (c3740pD2.f33833a != null) {
                        c3740pD3 = c3740pD2;
                    } else if (c3740pD3 != null) {
                        c3740pD3.f33834b = c3740pD4;
                        if (c3740pD3.f33833a == null) {
                            break;
                        }
                    } else if (!f34003z.m(this, c3740pD2, c3740pD4)) {
                        break;
                    }
                    c3740pD2 = c3740pD4;
                }
                return;
            }
            return;
        }
    }
}
