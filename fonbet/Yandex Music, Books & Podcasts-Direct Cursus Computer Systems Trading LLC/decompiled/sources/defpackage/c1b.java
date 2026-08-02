package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c1b extends vnj {
    @Override // defpackage.vnj
    public void Q(@NotNull zyr zyrVar, @NotNull zyr zyrVar2, @NotNull Window window, @NotNull View view, boolean z, boolean z2) {
        zyrVar.getClass();
        zyrVar2.getClass();
        window.getClass();
        view.getClass();
        q5g.I(window, false);
        window.setStatusBarColor(z ? zyrVar.b : zyrVar.a);
        window.setNavigationBarColor(zyrVar2.b);
        knn knnVar = new knn(view);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar)).k0(!z);
    }
}
