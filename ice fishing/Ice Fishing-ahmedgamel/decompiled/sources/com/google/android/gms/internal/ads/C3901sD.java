package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3901sD extends AbstractRunnableC4009uD {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC4009uD
    public final /* synthetic */ void t(Object obj) {
        n((P3.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC4009uD
    public final Object u(Object obj, Object obj2) {
        BD bd = (BD) obj;
        P3.a a9 = bd.a(obj2);
        if (a9 != null) {
            return a9;
        }
        throw new NullPointerException(AbstractC2659Kg.x("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", bd));
    }
}
