package com.gamericefishpro.space.d4;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static o1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        o1 o1VarD = o1.d(null, rootWindowInsets);
        l1 l1Var = o1VarD.a;
        l1Var.t(o1VarD);
        l1Var.d(view.getRootView());
        return o1VarD;
    }
}
