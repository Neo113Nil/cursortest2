package Q;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.v;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1514a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1515b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f1514a = i2;
        this.f1515b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [Q.d, java.lang.Object] */
    @Override // androidx.lifecycle.i
    public final void a(j jVar, androidx.lifecycle.d dVar) {
        switch (this.f1514a) {
            case 0:
                if (dVar != androidx.lifecycle.d.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                l b2 = jVar.b();
                b2.c("removeObserver");
                b2.f2475b.b(this);
                Bundle d2 = this.f1515b.a().d("androidx.savedstate.Restarter");
                if (d2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = d2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                Iterator<String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> asSubclass = Class.forName(next, false, a.class.getClassLoader()).asSubclass(c.class);
                        kotlin.jvm.internal.i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                kotlin.jvm.internal.i.d(declaredConstructor.newInstance(null), "{\n                constr…wInstance()\n            }");
                                throw new ClassCastException();
                            } catch (Exception e2) {
                                throw new RuntimeException(C1.a.i("Failed to instantiate ", next), e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException("Class " + next + " wasn't found", e4);
                    }
                }
                return;
            default:
                if (dVar != androidx.lifecycle.d.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + dVar).toString());
                }
                l b3 = jVar.b();
                b3.c("removeObserver");
                b3.f2475b.b(this);
                v vVar = (v) this.f1515b;
                if (vVar.f2500b) {
                    return;
                }
                Bundle d3 = vVar.f2499a.d("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = vVar.f2501c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (d3 != null) {
                    bundle.putAll(d3);
                }
                vVar.f2501c = bundle;
                vVar.f2500b = true;
                return;
        }
    }
}
