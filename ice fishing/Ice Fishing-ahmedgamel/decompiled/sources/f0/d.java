package f0;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0479s;
import androidx.fragment.app.N;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4514c f37421a = C4514c.f37420a;

    public static C4514c a(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        while (abstractComponentCallbacksC0479s != null) {
            if (abstractComponentCallbacksC0479s.i()) {
                abstractComponentCallbacksC0479s.f();
            }
            abstractComponentCallbacksC0479s = abstractComponentCallbacksC0479s.f5008N;
        }
        return f37421a;
    }

    public static void b(f fVar) {
        if (N.E(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(fVar.f37423n.getClass().getName()), fVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s, String previousFragmentId) {
        h.e(previousFragmentId, "previousFragmentId");
        b(new C4512a(abstractComponentCallbacksC0479s, "Attempting to reuse fragment " + abstractComponentCallbacksC0479s + " with previous ID " + previousFragmentId));
        a(abstractComponentCallbacksC0479s).getClass();
    }
}
