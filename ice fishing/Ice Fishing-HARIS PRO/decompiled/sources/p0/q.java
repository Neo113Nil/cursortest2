package p0;

import android.view.ViewGroup;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import r.C0338f;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0323a f4207a = new C0323a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f4208b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f4209c = new ArrayList();

    public static void a(ViewGroup viewGroup, m mVar) {
        ArrayList arrayList = f4209c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (mVar == null) {
            mVar = f4207a;
        }
        m clone = mVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((m) it.next()).w(viewGroup);
            }
        }
        clone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        p pVar = new p();
        pVar.f4205a = clone;
        pVar.f4206b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(pVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static C0338f b() {
        C0338f c0338f;
        ThreadLocal threadLocal = f4208b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0338f = (C0338f) weakReference.get()) != null) {
            return c0338f;
        }
        C0338f c0338f2 = new C0338f(0);
        threadLocal.set(new WeakReference(c0338f2));
        return c0338f2;
    }
}
