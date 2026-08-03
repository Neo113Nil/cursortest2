package n;

import a4.e;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends v6.a {

    /* renamed from: e, reason: collision with root package name */
    public static volatile a f4971e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f4972f = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public final c f4973d = new c();

    public static a a0() {
        if (f4971e != null) {
            return f4971e;
        }
        synchronized (a.class) {
            try {
                if (f4971e == null) {
                    f4971e = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4971e;
    }
}
