package com.gamericefishpro.space.i6;

import android.widget.FrameLayout;
import com.gamericefishpro.space.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final a a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        a aVar = new a();
        aVar.V = new ArrayList();
        aVar.Y = false;
        aVar.Z = 0;
        aVar.W = false;
        aVar.L(new h(2));
        aVar.L(new f());
        aVar.L(new h(1));
        a = aVar;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, o oVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (oVar == null) {
            oVar = a;
        }
        o oVarClone = oVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((o) obj).x(frameLayout);
            }
        }
        oVarClone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        r rVar = new r();
        rVar.d = oVarClone;
        rVar.e = frameLayout;
        frameLayout.addOnAttachStateChangeListener(rVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(rVar);
    }

    public static com.gamericefishpro.space.t.e b() {
        com.gamericefishpro.space.t.e eVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (com.gamericefishpro.space.t.e) weakReference.get()) != null) {
            return eVar;
        }
        com.gamericefishpro.space.t.e eVar2 = new com.gamericefishpro.space.t.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
