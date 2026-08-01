package G3;

import F1.g;
import android.os.Handler;
import android.os.Looper;
import b2.InterfaceC0515b;

/* loaded from: classes2.dex */
public final class e implements InterfaceC0515b {

    /* renamed from: u, reason: collision with root package name */
    public static e f1071u;

    /* renamed from: n, reason: collision with root package name */
    public final Object f1072n;

    public e() {
        this.f1072n = new Object();
        new Handler(Looper.getMainLooper(), new g(1, this));
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        return this.f1072n;
    }

    public e(Object obj) {
        this.f1072n = obj;
    }
}
