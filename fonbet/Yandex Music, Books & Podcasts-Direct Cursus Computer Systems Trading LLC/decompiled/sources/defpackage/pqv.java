package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class pqv {
    public final y5g a;

    public pqv(Window window, View view) {
        knn knnVar = new knn(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new oqv(window, knnVar);
            return;
        }
        if (i >= 30) {
            this.a = new nqv(window, knnVar);
        } else if (i >= 26) {
            this.a = new mqv(window, knnVar);
        } else {
            this.a = new lqv(window, knnVar);
        }
    }

    public pqv(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new oqv(windowInsetsController, new knn(windowInsetsController));
        } else {
            this.a = new nqv(windowInsetsController, new knn(windowInsetsController));
        }
    }
}
