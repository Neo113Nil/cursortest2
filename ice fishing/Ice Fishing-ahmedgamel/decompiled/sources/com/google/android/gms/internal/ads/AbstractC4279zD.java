package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.zD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4279zD extends AbstractC3256gD {

    /* renamed from: C, reason: collision with root package name */
    public static final AbstractC4117wD f36093C;

    /* renamed from: D, reason: collision with root package name */
    public static final QD f36094D = new QD(AbstractC4279zD.class);

    /* renamed from: A, reason: collision with root package name */
    public volatile Set f36095A;

    /* renamed from: B, reason: collision with root package name */
    public volatile int f36096B;

    static {
        Throwable th;
        AbstractC4117wD c4225yD;
        try {
            c4225yD = new C4171xD();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c4225yD = new C4225yD();
        }
        Throwable th3 = th;
        f36093C = c4225yD;
        if (th3 != null) {
            f36094D.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
