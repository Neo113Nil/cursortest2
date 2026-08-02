package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class spv extends WindowInsetsAnimation$Callback {
    public final rr4 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public spv(rr4 rr4Var) {
        super(rr4Var.a);
        this.d = new HashMap();
        this.a = rr4Var;
    }

    public final vpv a(WindowInsetsAnimation windowInsetsAnimation) {
        vpv vpvVar = (vpv) this.d.get(windowInsetsAnimation);
        if (vpvVar == null) {
            vpvVar = new vpv(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                vpvVar.a = new tpv(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, vpvVar);
        }
        return vpvVar;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.f(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.g(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            vpv a = a(windowInsetsAnimation);
            a.a.e(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        return this.a.h(kqv.h(null, windowInsets), this.b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        nur i = this.a.i(a(windowInsetsAnimation), new nur(bounds));
        i.getClass();
        bb.f();
        return bb.a(((zne) i.b).e(), ((zne) i.c).e());
    }
}
