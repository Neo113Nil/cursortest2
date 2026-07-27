package O;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.internal.ads.C2561Fo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C2561Fo f2283a;

    /* renamed from: b, reason: collision with root package name */
    public List f2284b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2285c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2286d;

    public k0(C2561Fo c2561Fo) {
        super(0);
        this.f2286d = new HashMap();
        this.f2283a = c2561Fo;
    }

    public final n0 a(WindowInsetsAnimation windowInsetsAnimation) {
        n0 n0Var = (n0) this.f2286d.get(windowInsetsAnimation);
        if (n0Var == null) {
            n0Var = new n0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                n0Var.f2300a = new l0(windowInsetsAnimation);
            }
            this.f2286d.put(windowInsetsAnimation, n0Var);
        }
        return n0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C2561Fo c2561Fo = this.f2283a;
        a(windowInsetsAnimation);
        ((View) c2561Fo.f25020w).setTranslationY(0.0f);
        this.f2286d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C2561Fo c2561Fo = this.f2283a;
        a(windowInsetsAnimation);
        View view = (View) c2561Fo.f25020w;
        int[] iArr = (int[]) c2561Fo.f25021x;
        view.getLocationOnScreen(iArr);
        c2561Fo.f25017n = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f2285c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2285c = arrayList2;
            this.f2284b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j9 = AbstractC0363z.j(list.get(size));
            n0 a9 = a(j9);
            fraction = j9.getFraction();
            a9.f2300a.d(fraction);
            this.f2285c.add(a9);
        }
        C2561Fo c2561Fo = this.f2283a;
        A0 h9 = A0.h(null, windowInsets);
        c2561Fo.f(h9, this.f2284b);
        return h9.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C2561Fo c2561Fo = this.f2283a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        G.e c4 = G.e.c(lowerBound);
        upperBound = bounds.getUpperBound();
        G.e c9 = G.e.c(upperBound);
        View view = (View) c2561Fo.f25020w;
        int[] iArr = (int[]) c2561Fo.f25021x;
        view.getLocationOnScreen(iArr);
        int i = c2561Fo.f25017n - iArr[1];
        c2561Fo.f25018u = i;
        view.setTranslationY(i);
        AbstractC0363z.m();
        return AbstractC0363z.h(c4.d(), c9.d());
    }
}
