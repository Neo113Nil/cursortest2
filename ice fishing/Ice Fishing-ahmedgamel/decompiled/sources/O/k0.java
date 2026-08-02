package O;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.internal.ads.C2582Fo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C2582Fo f2185a;

    /* renamed from: b, reason: collision with root package name */
    public List f2186b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2187c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2188d;

    public k0(C2582Fo c2582Fo) {
        super(0);
        this.f2188d = new HashMap();
        this.f2185a = c2582Fo;
    }

    public final n0 a(WindowInsetsAnimation windowInsetsAnimation) {
        n0 n0Var = (n0) this.f2188d.get(windowInsetsAnimation);
        if (n0Var == null) {
            n0Var = new n0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                n0Var.f2202a = new l0(windowInsetsAnimation);
            }
            this.f2188d.put(windowInsetsAnimation, n0Var);
        }
        return n0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C2582Fo c2582Fo = this.f2185a;
        a(windowInsetsAnimation);
        ((View) c2582Fo.f25637w).setTranslationY(0.0f);
        this.f2188d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C2582Fo c2582Fo = this.f2185a;
        a(windowInsetsAnimation);
        View view = (View) c2582Fo.f25637w;
        int[] iArr = (int[]) c2582Fo.f25638x;
        view.getLocationOnScreen(iArr);
        c2582Fo.f25634n = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f2187c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2187c = arrayList2;
            this.f2186b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j6 = AbstractC0355z.j(list.get(size));
            n0 a9 = a(j6);
            fraction = j6.getFraction();
            a9.f2202a.d(fraction);
            this.f2187c.add(a9);
        }
        C2582Fo c2582Fo = this.f2185a;
        A0 h3 = A0.h(null, windowInsets);
        c2582Fo.f(h3, this.f2186b);
        return h3.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C2582Fo c2582Fo = this.f2185a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        G.e c9 = G.e.c(lowerBound);
        upperBound = bounds.getUpperBound();
        G.e c10 = G.e.c(upperBound);
        View view = (View) c2582Fo.f25637w;
        int[] iArr = (int[]) c2582Fo.f25638x;
        view.getLocationOnScreen(iArr);
        int i = c2582Fo.f25634n - iArr[1];
        c2582Fo.f25635u = i;
        view.setTranslationY(i);
        AbstractC0355z.m();
        return AbstractC0355z.h(c9.d(), c10.d());
    }
}
