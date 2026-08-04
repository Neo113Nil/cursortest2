package com.gamericefishpro.space.d4;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends WindowInsetsAnimation$Callback {
    public final o0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public u0(o0 o0Var) {
        super(o0Var.d);
        this.d = new HashMap();
        this.a = o0Var;
    }

    public final x0 a(WindowInsetsAnimation windowInsetsAnimation) {
        x0 x0Var = (x0) this.d.get(windowInsetsAnimation);
        if (x0Var == null) {
            x0Var = new x0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                x0Var.a = new v0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, x0Var);
        }
        return x0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.e();
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
            WindowInsetsAnimation windowInsetsAnimationK = com.appsflyer.internal.o.k(list.get(size));
            x0 x0VarA = a(windowInsetsAnimationK);
            x0VarA.a.e(windowInsetsAnimationK.getFraction());
            this.c.add(x0VarA);
        }
        return this.a.f(o1.d(null, windowInsets), this.b).c();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        com.gamericefishpro.space.u6.e eVarG = this.a.g(a(windowInsetsAnimation), new com.gamericefishpro.space.u6.e(bounds));
        eVarG.getClass();
        com.appsflyer.internal.o.m();
        return com.appsflyer.internal.o.i(((com.gamericefishpro.space.u3.b) eVarG.b).d(), ((com.gamericefishpro.space.u3.b) eVarG.c).d());
    }
}
