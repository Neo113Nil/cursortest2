package com.gamericefishpro.space.n;

import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends i1 implements j1 {
    public static final Method S;
    public com.gamericefishpro.space.m.d R;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                S = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // com.gamericefishpro.space.n.j1
    public final void f(com.gamericefishpro.space.m.i iVar, com.gamericefishpro.space.m.j jVar) {
        com.gamericefishpro.space.m.d dVar = this.R;
        if (dVar != null) {
            dVar.f(iVar, jVar);
        }
    }

    @Override // com.gamericefishpro.space.n.j1
    public final void k(com.gamericefishpro.space.m.i iVar, MenuItem menuItem) {
        com.gamericefishpro.space.m.d dVar = this.R;
        if (dVar != null) {
            dVar.k(iVar, menuItem);
        }
    }
}
