package a0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0423a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z3 = false;
        boolean z6 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f4747Q = windowInsets;
        drawerLayout.f4748R = z6;
        if (!z6 && drawerLayout.getBackground() == null) {
            z3 = true;
        }
        drawerLayout.setWillNotDraw(z3);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
