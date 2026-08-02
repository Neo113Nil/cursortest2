package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class d1b extends vnj {
    @Override // defpackage.vnj
    public void Q(@NotNull zyr zyrVar, @NotNull zyr zyrVar2, @NotNull Window window, @NotNull View view, boolean z, boolean z2) {
        zyrVar.getClass();
        zyrVar2.getClass();
        window.getClass();
        view.getClass();
        q5g.I(window, false);
        window.setStatusBarColor(z ? zyrVar.b : zyrVar.a);
        window.setNavigationBarColor(z2 ? zyrVar2.b : zyrVar2.a);
        knn knnVar = new knn(view);
        int i = Build.VERSION.SDK_INT;
        y5g oqvVar = i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar);
        oqvVar.k0(!z);
        oqvVar.j0(!z2);
    }
}
