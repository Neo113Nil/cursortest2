package a0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0427a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z6 = false;
        boolean z9 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f4715Q = windowInsets;
        drawerLayout.f4716R = z9;
        if (!z9 && drawerLayout.getBackground() == null) {
            z6 = true;
        }
        drawerLayout.setWillNotDraw(z6);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
