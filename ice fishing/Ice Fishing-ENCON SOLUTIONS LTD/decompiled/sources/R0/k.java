package R0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1740a;

    public k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f1740a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // R0.e
    public final void a(c cVar) {
        this.f1740a.post(cVar);
    }
}
