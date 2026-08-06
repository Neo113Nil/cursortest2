package u0;

import android.content.Context;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051b {

    /* renamed from: b, reason: collision with root package name */
    public static final C1051b f8478b;

    /* renamed from: a, reason: collision with root package name */
    public G0.b f8479a;

    static {
        C1051b c1051b = new C1051b();
        c1051b.f8479a = null;
        f8478b = c1051b;
    }

    public static G0.b a(Context context) {
        G0.b bVar;
        C1051b c1051b = f8478b;
        synchronized (c1051b) {
            try {
                if (c1051b.f8479a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c1051b.f8479a = new G0.b(context);
                }
                bVar = c1051b.f8479a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
