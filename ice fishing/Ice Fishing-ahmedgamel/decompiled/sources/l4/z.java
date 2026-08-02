package l4;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import n.ExecutorC4756a;

/* loaded from: classes2.dex */
public final class z extends Binder {

    /* renamed from: n, reason: collision with root package name */
    public final I0.j f38987n;

    public z(I0.j jVar) {
        this.f38987n = jVar;
    }

    public final void a(C4674A c4674a) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c4674a.f38887a;
        h hVar = (h) this.f38987n.f1291u;
        l3.h hVar2 = new l3.h();
        hVar.f38919n.execute(new androidx.emoji2.text.k(8, hVar, intent, hVar2));
        hVar2.f38870a.a(new ExecutorC4756a(1), new J3.l(12, c4674a));
    }
}
