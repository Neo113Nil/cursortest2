package v6;

import android.content.Context;
import q3.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f7303b;

    /* renamed from: a, reason: collision with root package name */
    public l f7304a;

    static {
        b bVar = new b();
        bVar.f7304a = null;
        f7303b = bVar;
    }

    public static l a(Context context) {
        l lVar;
        b bVar = f7303b;
        synchronized (bVar) {
            try {
                if (bVar.f7304a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f7304a = new l(context, false);
                }
                lVar = bVar.f7304a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}
