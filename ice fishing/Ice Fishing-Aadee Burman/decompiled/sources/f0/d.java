package f0;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0475s;
import androidx.fragment.app.N;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4497c f37345a = C4497c.f37344a;

    public static C4497c a(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        while (abstractComponentCallbacksC0475s != null) {
            if (abstractComponentCallbacksC0475s.i()) {
                abstractComponentCallbacksC0475s.f();
            }
            abstractComponentCallbacksC0475s = abstractComponentCallbacksC0475s.f5040N;
        }
        return f37345a;
    }

    public static void b(f fVar) {
        if (N.E(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(fVar.f37347n.getClass().getName()), fVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, String previousFragmentId) {
        h.e(previousFragmentId, "previousFragmentId");
        b(new C4495a(abstractComponentCallbacksC0475s, "Attempting to reuse fragment " + abstractComponentCallbacksC0475s + " with previous ID " + previousFragmentId));
        a(abstractComponentCallbacksC0475s).getClass();
    }
}
