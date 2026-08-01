package m0;

import O.K;
import P.o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298f implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4074a;

    public /* synthetic */ C0298f(Object obj) {
        this.f4074a = obj;
    }

    @Override // P.o
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f4074a;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.f747a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f2363d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(RecyclerView.f2111C0);
        return true;
    }

    public C0298f() {
        this.f4074a = new LinkedHashMap(0, 0.75f, true);
    }
}
