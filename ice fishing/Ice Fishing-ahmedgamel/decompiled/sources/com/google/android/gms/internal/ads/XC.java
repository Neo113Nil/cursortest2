package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class XC extends ZC {
    @Override // com.google.android.gms.internal.ads.ZC
    public final /* synthetic */ void t(Object obj) {
        n((P3.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.ZC
    public final Object u(Object obj, Throwable th) {
        BD bd = (BD) obj;
        P3.a a9 = bd.a(th);
        if (a9 != null) {
            return a9;
        }
        throw new NullPointerException(AbstractC2659Kg.x("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", bd));
    }
}
