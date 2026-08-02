package defpackage;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes3.dex */
public final class srv extends Binder {
    public final mka a;

    public srv(mka mkaVar) {
        this.a = mkaVar;
    }

    public final void a(trv trvVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        m8b.access$000((m8b) this.a.a, trvVar.a).b(new gx0(1), new tot(6, trvVar));
    }
}
