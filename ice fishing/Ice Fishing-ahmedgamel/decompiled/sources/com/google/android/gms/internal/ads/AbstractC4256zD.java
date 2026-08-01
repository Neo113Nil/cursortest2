package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.zD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4256zD extends AbstractC3233gD {

    /* renamed from: C, reason: collision with root package name */
    public static final AbstractC4094wD f35309C;

    /* renamed from: D, reason: collision with root package name */
    public static final QD f35310D = new QD(AbstractC4256zD.class);

    /* renamed from: A, reason: collision with root package name */
    public volatile Set f35311A;

    /* renamed from: B, reason: collision with root package name */
    public volatile int f35312B;

    static {
        Throwable th;
        AbstractC4094wD c4202yD;
        try {
            c4202yD = new C4148xD();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c4202yD = new C4202yD();
        }
        Throwable th3 = th;
        f35309C = c4202yD;
        if (th3 != null) {
            f35310D.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
