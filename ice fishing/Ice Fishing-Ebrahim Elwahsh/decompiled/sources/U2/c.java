package U2;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f3281b;

    /* renamed from: a, reason: collision with root package name */
    public b f3282a;

    static {
        c cVar = new c();
        cVar.f3282a = null;
        f3281b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f3281b;
        synchronized (cVar) {
            try {
                if (cVar.f3282a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f3282a = new b(context);
                }
                bVar = cVar.f3282a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
