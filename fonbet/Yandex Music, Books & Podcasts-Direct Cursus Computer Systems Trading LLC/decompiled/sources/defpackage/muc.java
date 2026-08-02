package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class muc {
    public static final luc a = luc.c;

    public static luc a(o oVar) {
        while (oVar != null) {
            if (oVar.isAdded()) {
                oVar.getParentFragmentManager().getClass();
            }
            oVar = oVar.getParentFragment();
        }
        return a;
    }

    public static void b(luc lucVar, iiu iiuVar) {
        o oVar = iiuVar.a;
        String name = oVar.getClass().getName();
        Set set = lucVar.a;
        if (set.contains(kuc.a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), iiuVar);
        }
        if (set.contains(kuc.b)) {
            juc jucVar = new juc(0, name, iiuVar);
            if (!oVar.isAdded()) {
                jucVar.run();
                throw null;
            }
            Handler handler = oVar.getParentFragmentManager().x.c;
            if (Intrinsics.d(handler.getLooper(), Looper.myLooper())) {
                jucVar.run();
                throw null;
            }
            handler.post(jucVar);
        }
    }

    public static void c(iiu iiuVar) {
        if (y.M(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(iiuVar.a.getClass().getName()), iiuVar);
        }
    }

    public static final void d(o oVar, String str) {
        oVar.getClass();
        str.getClass();
        guc gucVar = new guc(oVar, "Attempting to reuse fragment " + oVar + " with previous ID " + str);
        c(gucVar);
        luc a2 = a(oVar);
        if (a2.a.contains(kuc.c) && e(a2, oVar.getClass(), guc.class)) {
            b(a2, gucVar);
        }
    }

    public static boolean e(luc lucVar, Class cls, Class cls2) {
        Set set = (Set) lucVar.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.d(cls2.getSuperclass(), iiu.class) || !CollectionsKt.I(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
