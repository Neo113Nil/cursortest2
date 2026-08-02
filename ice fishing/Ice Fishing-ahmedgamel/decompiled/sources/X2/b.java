package X2;

import A1.C0266h;
import android.content.Context;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3762b;

    /* renamed from: a, reason: collision with root package name */
    public C0266h f3763a;

    static {
        b bVar = new b();
        bVar.f3763a = null;
        f3762b = bVar;
    }

    public static C0266h a(Context context) {
        C0266h c0266h;
        b bVar = f3762b;
        synchronized (bVar) {
            try {
                if (bVar.f3763a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f3763a = new C0266h(context, 2);
                }
                c0266h = bVar.f3763a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0266h;
    }
}
