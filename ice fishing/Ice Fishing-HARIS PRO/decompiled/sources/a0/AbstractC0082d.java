package a0;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import android.util.Log;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0082d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0081c f1667a = C0081c.f1666a;

    public static C0081c a(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        while (abstractComponentCallbacksC0070s != null) {
            if (abstractComponentCallbacksC0070s.n()) {
                abstractComponentCallbacksC0070s.j();
            }
            abstractComponentCallbacksC0070s = abstractComponentCallbacksC0070s.f1617v;
        }
        return f1667a;
    }

    public static void b(C0079a c0079a) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0079a.f1661a.getClass().getName()), c0079a);
        }
    }

    public static final void c(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, String str) {
        i.e(abstractComponentCallbacksC0070s, "fragment");
        i.e(str, "previousFragmentId");
        b(new C0079a(abstractComponentCallbacksC0070s, "Attempting to reuse fragment " + abstractComponentCallbacksC0070s + " with previous ID " + str));
        a(abstractComponentCallbacksC0070s).getClass();
    }
}
