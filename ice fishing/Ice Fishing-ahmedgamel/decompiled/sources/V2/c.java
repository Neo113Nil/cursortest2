package V2;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f3274b;

    /* renamed from: a, reason: collision with root package name */
    public b f3275a;

    static {
        c cVar = new c();
        cVar.f3275a = null;
        f3274b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f3274b;
        synchronized (cVar) {
            try {
                if (cVar.f3275a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f3275a = new b(context, 0);
                }
                bVar = cVar.f3275a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
