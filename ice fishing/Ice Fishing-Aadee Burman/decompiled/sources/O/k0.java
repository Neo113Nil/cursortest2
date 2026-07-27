package O;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.internal.ads.C2545Eo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C2545Eo f2097a;

    /* renamed from: b, reason: collision with root package name */
    public List f2098b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2099c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2100d;

    public k0(C2545Eo c2545Eo) {
        super(0);
        this.f2100d = new HashMap();
        this.f2097a = c2545Eo;
    }

    public final n0 a(WindowInsetsAnimation windowInsetsAnimation) {
        n0 n0Var = (n0) this.f2100d.get(windowInsetsAnimation);
        if (n0Var == null) {
            n0Var = new n0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                n0Var.f2114a = new l0(windowInsetsAnimation);
            }
            this.f2100d.put(windowInsetsAnimation, n0Var);
        }
        return n0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C2545Eo c2545Eo = this.f2097a;
        a(windowInsetsAnimation);
        ((View) c2545Eo.f24652w).setTranslationY(0.0f);
        this.f2100d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C2545Eo c2545Eo = this.f2097a;
        a(windowInsetsAnimation);
        View view = (View) c2545Eo.f24652w;
        int[] iArr = (int[]) c2545Eo.f24653x;
        view.getLocationOnScreen(iArr);
        c2545Eo.f24649n = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f2099c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2099c = arrayList2;
            this.f2098b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j6 = AbstractC0350z.j(list.get(size));
            n0 a9 = a(j6);
            fraction = j6.getFraction();
            a9.f2114a.d(fraction);
            this.f2099c.add(a9);
        }
        C2545Eo c2545Eo = this.f2097a;
        A0 h9 = A0.h(null, windowInsets);
        c2545Eo.e(h9, this.f2098b);
        return h9.g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C2545Eo c2545Eo = this.f2097a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        G.e c9 = G.e.c(lowerBound);
        upperBound = bounds.getUpperBound();
        G.e c10 = G.e.c(upperBound);
        View view = (View) c2545Eo.f24652w;
        int[] iArr = (int[]) c2545Eo.f24653x;
        view.getLocationOnScreen(iArr);
        int i = c2545Eo.f24649n - iArr[1];
        c2545Eo.f24650u = i;
        view.setTranslationY(i);
        AbstractC0350z.m();
        return AbstractC0350z.h(c9.d(), c10.d());
    }
}
