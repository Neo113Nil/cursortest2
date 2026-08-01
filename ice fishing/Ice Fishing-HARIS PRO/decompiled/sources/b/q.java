package b;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f2313a = new q();

    public final OnBackInvokedCallback a(C1.l lVar, C1.l lVar2, C1.a aVar, C1.a aVar2) {
        D1.i.e(lVar, "onBackStarted");
        D1.i.e(lVar2, "onBackProgressed");
        D1.i.e(aVar, "onBackInvoked");
        D1.i.e(aVar2, "onBackCancelled");
        return new p(lVar, lVar2, aVar, aVar2);
    }
}
