package com.gamericefishpro.space.d4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements View.OnApplyWindowInsetsListener {
    public o1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ p c;

    public c0(View view, p pVar) {
        this.b = view;
        this.c = pVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o1 o1VarD = o1.d(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        p pVar = this.c;
        if (i < 30) {
            d0.a(windowInsets, this.b);
            if (o1VarD.equals(this.a)) {
                return pVar.l(view, o1VarD).c();
            }
        }
        this.a = o1VarD;
        o1 o1VarL = pVar.l(view, o1VarD);
        if (i >= 30) {
            return o1VarL.c();
        }
        Field field = l0.a;
        b0.c(view);
        return o1VarL.c();
    }
}
