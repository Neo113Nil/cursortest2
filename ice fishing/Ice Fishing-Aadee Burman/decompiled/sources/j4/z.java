package j4;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import n.ExecutorC4742a;

/* loaded from: classes2.dex */
public final class z extends Binder {

    /* renamed from: n, reason: collision with root package name */
    public final I0.j f38475n;

    public z(I0.j jVar) {
        this.f38475n = jVar;
    }

    public final void a(C4605A c4605a) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c4605a.f38375a;
        h hVar = (h) this.f38475n.f1264u;
        j3.h hVar2 = new j3.h();
        hVar.f38407n.execute(new androidx.emoji2.text.k(8, hVar, intent, hVar2));
        hVar2.f38358a.a(new ExecutorC4742a(1), new H3.l(12, c4605a));
    }
}
