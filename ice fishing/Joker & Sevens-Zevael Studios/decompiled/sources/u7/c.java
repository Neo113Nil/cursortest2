package u7;

import android.content.Context;
import android.os.UserManager;
import g7.o;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements e, f {

    /* renamed from: a, reason: collision with root package name */
    public final i7.c f6718a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6719b;

    /* renamed from: c, reason: collision with root package name */
    public final w7.a f6720c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f6721d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f6722e;

    public c(Context context, String str, Set set, w7.a aVar, Executor executor) {
        this.f6718a = new i7.c(context, str);
        this.f6721d = set;
        this.f6722e = executor;
        this.f6720c = aVar;
        this.f6719b = context;
    }

    public final o a() {
        if (!((UserManager) this.f6719b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return i7.b.u("");
        }
        return i7.b.o(this.f6722e, new b(0, this));
    }

    public final void b() {
        if (this.f6721d.size() <= 0) {
            i7.b.u(null);
        } else if (!((UserManager) this.f6719b.getSystemService(UserManager.class)).isUserUnlocked()) {
            i7.b.u(null);
        } else {
            i7.b.o(this.f6722e, new b(1, this));
        }
    }
}
