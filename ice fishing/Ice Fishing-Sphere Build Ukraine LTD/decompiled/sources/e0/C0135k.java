package e0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: e0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135k implements InterfaceC0129e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1880a;

    public C0135k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f1880a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // e0.InterfaceC0129e
    public final void a(RunnableC0127c runnableC0127c) {
        this.f1880a.post(runnableC0127c);
    }
}
