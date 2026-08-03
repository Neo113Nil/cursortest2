package e4;

import android.os.Bundle;
import androidx.lifecycle.m0;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.fortheloss.st.MainActivity;
import pc.j;
import x4.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2105g;

    /* renamed from: h, reason: collision with root package name */
    public final e f2106h;

    public /* synthetic */ b(e eVar, int i10) {
        this.f2105g = i10;
        this.f2106h = eVar;
    }

    @Override // androidx.lifecycle.s
    public final void b(u uVar, o oVar) {
        switch (this.f2105g) {
            case 0:
                if (oVar != o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                uVar.h().f(this);
                e eVar = this.f2106h;
                Bundle b2 = eVar.b().b("androidx.savedstate.Restarter");
                if (b2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = b2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    String str = stringArrayList.get(i10);
                    i10++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        j.b(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                j.b(newInstance);
                                if (!(eVar instanceof y0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
                                }
                                x0 g8 = ((y0) eVar).g();
                                l b10 = eVar.b();
                                g8.getClass();
                                LinkedHashMap linkedHashMap = (LinkedHashMap) g8.f733a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    j.e(str3, "key");
                                    t0 t0Var = (t0) linkedHashMap.get(str3);
                                    if (t0Var != null) {
                                        m0.a(t0Var, b10, eVar.h());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b10.n();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException("Failed to instantiate " + str2, e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(a4.d.j("Class ", str2, " wasn't found"), e12);
                    }
                }
                return;
            default:
                MainActivity mainActivity = (MainActivity) this.f2106h;
                if (mainActivity.f1514k == null) {
                    d.l lVar = (d.l) mainActivity.getLastNonConfigurationInstance();
                    if (lVar != null) {
                        mainActivity.f1514k = lVar.f1497a;
                    }
                    if (mainActivity.f1514k == null) {
                        mainActivity.f1514k = new x0();
                    }
                }
                mainActivity.f1510g.f(this);
                return;
        }
    }
}
