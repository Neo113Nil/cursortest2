package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3878sD extends AbstractRunnableC3986uD {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3986uD
    public final /* synthetic */ void t(Object obj) {
        n((N3.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC3986uD
    public final Object u(Object obj, Object obj2) {
        BD bd = (BD) obj;
        N3.a a9 = bd.a(obj2);
        if (a9 != null) {
            return a9;
        }
        throw new NullPointerException(AbstractC2639Kg.x("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", bd));
    }
}
