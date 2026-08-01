package O;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class U extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0028d f768a;

    /* renamed from: b, reason: collision with root package name */
    public List f769b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f770c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f771d;

    public U(C0028d c0028d) {
        super(0);
        this.f771d = new HashMap();
        this.f768a = c0028d;
    }

    public final X a(WindowInsetsAnimation windowInsetsAnimation) {
        X x2 = (X) this.f771d.get(windowInsetsAnimation);
        if (x2 == null) {
            x2 = new X(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                x2.f776a = new V(windowInsetsAnimation);
            }
            this.f771d.put(windowInsetsAnimation, x2);
        }
        return x2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0028d c0028d = this.f768a;
        a(windowInsetsAnimation);
        ((View) c0028d.e).setTranslationY(RecyclerView.f2111C0);
        this.f771d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0028d c0028d = this.f768a;
        a(windowInsetsAnimation);
        View view = (View) c0028d.e;
        int[] iArr = (int[]) c0028d.f800f;
        view.getLocationOnScreen(iArr);
        c0028d.f798c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f770c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f770c = arrayList2;
            this.f769b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation k2 = J0.b.k(list.get(size));
            X a2 = a(k2);
            fraction = k2.getFraction();
            a2.f776a.d(fraction);
            this.f770c.add(a2);
        }
        C0028d c0028d = this.f768a;
        j0 g2 = j0.g(null, windowInsets);
        c0028d.b(g2, this.f769b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0028d c0028d = this.f768a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        G.c c2 = G.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        G.c c3 = G.c.c(upperBound);
        View view = (View) c0028d.e;
        int[] iArr = (int[]) c0028d.f800f;
        view.getLocationOnScreen(iArr);
        int i = c0028d.f798c - iArr[1];
        c0028d.f799d = i;
        view.setTranslationY(i);
        J0.b.m();
        return J0.b.i(c2.d(), c3.d());
    }
}
