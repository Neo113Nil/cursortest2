package D0;

import android.widget.FrameLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C0288a f506a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f507b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f508c;

    static {
        C0288a c0288a = new C0288a();
        c0288a.f436T = new ArrayList();
        c0288a.f439W = false;
        c0288a.f440X = 0;
        c0288a.f437U = false;
        c0288a.N(new C0295h(2));
        c0288a.N(new C0293f());
        c0288a.N(new C0295h(1));
        f506a = c0288a;
        f507b = new ThreadLocal();
        f508c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, o oVar) {
        ArrayList arrayList = f508c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (oVar == null) {
            oVar = f506a;
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
        if (frameLayout.getTag(C5248R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(C5248R.id.transition_current_scene, null);
        r rVar = new r();
        rVar.f504n = clone;
        rVar.f505u = frameLayout;
        frameLayout.addOnAttachStateChangeListener(rVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(rVar);
    }

    public static s.b b() {
        s.b bVar;
        ThreadLocal threadLocal = f507b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (s.b) weakReference.get()) != null) {
            return bVar;
        }
        s.b bVar2 = new s.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
