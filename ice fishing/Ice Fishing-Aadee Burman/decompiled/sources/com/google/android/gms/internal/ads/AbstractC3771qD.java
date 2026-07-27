package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.qD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3771qD extends AbstractC3019cE implements N3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f33216w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final QD f33217x = new QD(AbstractC3287hD.class);

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f33218y;

    /* renamed from: z, reason: collision with root package name */
    public static final AbstractC3341iD f33219z;

    /* renamed from: n, reason: collision with root package name */
    public volatile Object f33220n;

    /* renamed from: u, reason: collision with root package name */
    public volatile C3125eD f33221u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C3717pD f33222v;

    static {
        boolean z3;
        AbstractC3341iD c3447kD;
        Throwable th;
        Throwable th2;
        try {
            z3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z3 = false;
        }
        f33218y = z3;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                c3447kD = new C3663oD();
            } catch (Error | Exception e9) {
                try {
                    c3447kD = new C3393jD();
                } catch (Error | Exception e10) {
                    th3 = e10;
                    c3447kD = new C3447kD();
                }
                th = th3;
                th2 = e9;
            }
        } else {
            try {
                c3447kD = new C3393jD();
            } catch (NoClassDefFoundError unused2) {
                c3447kD = new C3447kD();
            }
        }
        th = null;
        th2 = null;
        f33219z = c3447kD;
        if (th != null) {
            QD qd = f33217x;
            Logger a9 = qd.a();
            Level level = Level.SEVERE;
            a9.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            qd.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(C3717pD c3717pD) {
        c3717pD.f33043a = null;
        while (true) {
            C3717pD c3717pD2 = this.f33222v;
            if (c3717pD2 != C3717pD.f33042c) {
                C3717pD c3717pD3 = null;
                while (c3717pD2 != null) {
                    C3717pD c3717pD4 = c3717pD2.f33044b;
                    if (c3717pD2.f33043a != null) {
                        c3717pD3 = c3717pD2;
                    } else if (c3717pD3 != null) {
                        c3717pD3.f33044b = c3717pD4;
                        if (c3717pD3.f33043a == null) {
                            break;
                        }
                    } else if (!f33219z.m(this, c3717pD2, c3717pD4)) {
                        break;
                    }
                    c3717pD2 = c3717pD4;
                }
                return;
            }
            return;
        }
    }
}
