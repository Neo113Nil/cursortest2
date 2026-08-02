package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final /* synthetic */ class r70 implements a80 {
    public final /* synthetic */ s70 a;

    public /* synthetic */ r70(s70 s70Var) {
        this.a = s70Var;
    }

    @Override // defpackage.a80
    public void a(Bundle bundle) {
        ((wul) this.a.a).a(bundle);
    }

    public void b(jj4 jj4Var) {
        s70 s70Var = this.a;
        synchronized (s70Var) {
            ((ArrayList) s70Var.b).add(jj4Var);
            ((ehv) s70Var.c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
