package d8;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends Binder {

    /* renamed from: d, reason: collision with root package name */
    public final f8.c f1771d;

    public f0(f8.c cVar) {
        this.f1771d = cVar;
    }

    public final void a(g0 g0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = g0Var.f1777a;
        g gVar = (g) this.f1771d.f2340h;
        g7.h hVar = new g7.h();
        gVar.f1772g.execute(new b6.a(gVar, intent, hVar, 2));
        hVar.f2537a.a(new a4.e(0), new c6.f(6, g0Var));
    }
}
