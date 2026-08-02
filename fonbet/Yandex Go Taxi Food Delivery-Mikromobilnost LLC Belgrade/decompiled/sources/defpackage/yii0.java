package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yii0 implements q {
    public final j2m0 a;

    public yii0(j2m0 j2m0Var) {
        this.a = j2m0Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            ny61.f("Next event must be ON_CREATE");
            return;
        }
        peyVar.getLifecycle().d(this);
        j2m0 j2m0Var = this.a;
        Bundle a = j2m0Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            ny61.r("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, yii0.class.getClassLoader()).asSubclass(e2m0.class);
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((eay) ((e2m0) declaredConstructor.newInstance(null))).a(j2m0Var);
                    } catch (Exception e) {
                        ny61.n(g8e.o("Failed to instantiate ", str), e);
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                ny61.n(oyr.p("Class ", str, " wasn't found"), e3);
                return;
            }
        }
    }
}
