package n;

import h0.f;
import java.util.concurrent.Executors;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306a extends f {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C0306a f4107h;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4108g;

    public C0306a(int i) {
        switch (i) {
            case 1:
                this.f4108g = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0307b());
                break;
            default:
                this.f4108g = new C0306a(1);
                break;
        }
    }

    public static C0306a E() {
        if (f4107h != null) {
            return f4107h;
        }
        synchronized (C0306a.class) {
            try {
                if (f4107h == null) {
                    f4107h = new C0306a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4107h;
    }
}
