package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3945tD extends AbstractRunnableC4053vD {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC4053vD
    public final /* synthetic */ void t(Object obj) {
        n((J3.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC4053vD
    public final Object u(Object obj, Object obj2) {
        CD cd = (CD) obj;
        J3.a b9 = cd.b(obj2);
        if (b9 != null) {
            return b9;
        }
        throw new NullPointerException(AbstractC3194fG.u("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", cd));
    }
}
