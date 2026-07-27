package a0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0416a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z8 = false;
        boolean z9 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f4862Q = windowInsets;
        drawerLayout.f4863R = z9;
        if (!z9 && drawerLayout.getBackground() == null) {
            z8 = true;
        }
        drawerLayout.setWillNotDraw(z8);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
