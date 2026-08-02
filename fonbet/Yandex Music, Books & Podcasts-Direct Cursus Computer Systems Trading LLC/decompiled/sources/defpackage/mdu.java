package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mdu implements View.OnApplyWindowInsetsListener {
    public kqv a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ jpj c;

    public mdu(View view, jpj jpjVar) {
        this.b = view;
        this.c = jpjVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        kqv h = kqv.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        jpj jpjVar = this.c;
        if (i < 30) {
            ndu.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return jpjVar.G(view, h).g();
            }
        }
        this.a = h;
        kqv G = jpjVar.G(view, h);
        if (i >= 30) {
            return G.g();
        }
        WeakHashMap weakHashMap = wdu.a;
        ldu.c(view);
        return G.g();
    }
}
