package k0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class D extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((T) ((Observable) this).mObservers.get(size)).f3414a;
            recyclerView.k(null);
            recyclerView.f2151g0.f3426f = true;
            recyclerView.X(true);
            if (!recyclerView.e.j()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((T) ((Observable) this).mObservers.get(size)).f3414a;
            recyclerView.k(null);
            C0188b c0188b = recyclerView.e;
            ArrayList arrayList = (ArrayList) c0188b.f3445c;
            arrayList.add(c0188b.l(null, 4, i, 1));
            c0188b.f3443a |= 4;
            if (arrayList.size() == 1) {
                if (RecyclerView.f2113E0 && recyclerView.f2173t && recyclerView.f2172s) {
                    WeakHashMap weakHashMap = O.K.f747a;
                    recyclerView.postOnAnimation(recyclerView.i);
                } else {
                    recyclerView.f2117A = true;
                    recyclerView.requestLayout();
                }
            }
        }
    }
}
