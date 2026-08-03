package h3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public a1 f2804a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f2806c;

    public p(View view, h hVar) {
        this.f2805b = view;
        this.f2806c = hVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        a1 c3 = a1.c(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        h hVar = this.f2806c;
        if (i10 < 30) {
            q.a(windowInsets, this.f2805b);
            if (c3.equals(this.f2804a)) {
                return hVar.a(view, c3).b();
            }
        }
        this.f2804a = c3;
        a1 a6 = hVar.a(view, c3);
        if (i10 >= 30) {
            return a6.b();
        }
        Field field = w.f2829a;
        o.b(view);
        return a6.b();
    }
}
