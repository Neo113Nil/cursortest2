package D0;

import android.widget.FrameLayout;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C0300a f610a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f611b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f612c;

    static {
        C0300a c0300a = new C0300a();
        c0300a.f541T = new ArrayList();
        c0300a.f544W = false;
        c0300a.f545X = 0;
        c0300a.f542U = false;
        c0300a.N(new C0307h(2));
        c0300a.N(new C0305f());
        c0300a.N(new C0307h(1));
        f610a = c0300a;
        f611b = new ThreadLocal();
        f612c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, o oVar) {
        ArrayList arrayList = f612c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (oVar == null) {
            oVar = f610a;
        }
        o clone = oVar.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((o) it.next()).B(frameLayout);
            }
        }
        clone.m(frameLayout, true);
        if (frameLayout.getTag(C5275R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(C5275R.id.transition_current_scene, null);
        r rVar = new r();
        rVar.f608n = clone;
        rVar.f609u = frameLayout;
        frameLayout.addOnAttachStateChangeListener(rVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(rVar);
    }

    public static s.b b() {
        s.b bVar;
        ThreadLocal threadLocal = f611b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (s.b) weakReference.get()) != null) {
            return bVar;
        }
        s.b bVar2 = new s.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
