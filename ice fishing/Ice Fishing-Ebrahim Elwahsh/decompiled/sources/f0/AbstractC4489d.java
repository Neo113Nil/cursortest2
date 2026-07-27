package f0;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0485s;
import androidx.fragment.app.N;
import kotlin.jvm.internal.h;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4489d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4488c f37549a = C4488c.f37548a;

    public static C4488c a(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        while (abstractComponentCallbacksC0485s != null) {
            if (abstractComponentCallbacksC0485s.i()) {
                abstractComponentCallbacksC0485s.f();
            }
            abstractComponentCallbacksC0485s = abstractComponentCallbacksC0485s.f5152N;
        }
        return f37549a;
    }

    public static void b(f fVar) {
        if (N.E(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(fVar.f37551n.getClass().getName()), fVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, String previousFragmentId) {
        h.e(previousFragmentId, "previousFragmentId");
        b(new C4486a(abstractComponentCallbacksC0485s, "Attempting to reuse fragment " + abstractComponentCallbacksC0485s + " with previous ID " + previousFragmentId));
        a(abstractComponentCallbacksC0485s).getClass();
    }
}
