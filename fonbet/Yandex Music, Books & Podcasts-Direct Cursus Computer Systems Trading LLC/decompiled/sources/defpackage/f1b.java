package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class f1b extends e1b {
    @Override // defpackage.d1b, defpackage.vnj
    public void Q(@NotNull zyr zyrVar, @NotNull zyr zyrVar2, @NotNull Window window, @NotNull View view, boolean z, boolean z2) {
        zyrVar.getClass();
        zyrVar2.getClass();
        int i = zyrVar2.c;
        window.getClass();
        view.getClass();
        q5g.I(window, false);
        window.setStatusBarColor(zyrVar.c == 0 ? 0 : z ? zyrVar.b : zyrVar.a);
        window.setNavigationBarColor(i == 0 ? 0 : z2 ? zyrVar2.b : zyrVar2.a);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(i == 0);
        knn knnVar = new knn(view);
        int i2 = Build.VERSION.SDK_INT;
        y5g oqvVar = i2 >= 35 ? new oqv(window, knnVar) : i2 >= 30 ? new nqv(window, knnVar) : i2 >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar);
        oqvVar.k0(!z);
        oqvVar.j0(true ^ z2);
    }
}
