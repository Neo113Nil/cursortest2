package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class l8t {
    public static final jb2 a = new jb2();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, b8t b8tVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (b8tVar == null) {
            b8tVar = a;
        }
        b8t clone = b8tVar.clone();
        e(viewGroup, clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        d(viewGroup, clone);
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((b8t) arrayList2.get(size)).r(viewGroup);
        }
    }

    public static xy0 c() {
        xy0 xy0Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (xy0Var = (xy0) weakReference.get()) != null) {
            return xy0Var;
        }
        xy0 xy0Var2 = new xy0(0);
        threadLocal.set(new WeakReference(xy0Var2));
        return xy0Var2;
    }

    public static void d(ViewGroup viewGroup, b8t b8tVar) {
        if (b8tVar == null || viewGroup == null) {
            return;
        }
        k8t k8tVar = new k8t();
        k8tVar.a = b8tVar;
        k8tVar.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(k8tVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(k8tVar);
    }

    public static void e(ViewGroup viewGroup, b8t b8tVar) {
        sr7 sr7Var;
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b8t) it.next()).F(viewGroup);
            }
        }
        if (b8tVar != null) {
            b8tVar.k(viewGroup, true);
        }
        ato atoVar = (ato) viewGroup.getTag(R.id.transition_current_scene);
        if (atoVar == null || ((ato) atoVar.a.getTag(R.id.transition_current_scene)) != atoVar || (sr7Var = atoVar.c) == null) {
            return;
        }
        sr7Var.run();
    }
}
