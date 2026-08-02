package defpackage;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.appbar.AppBarLayout;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class zcu implements wp0 {
    public final View a;
    public boolean b;
    public final float c;

    public zcu(View view) {
        this.a = view;
        float dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.edge_margin);
        this.c = dimensionPixelSize;
        if (view.getAlpha() != 0.0f) {
            this.b = true;
        } else {
            view.setTranslationY(dimensionPixelSize);
            this.b = false;
        }
    }

    @Override // defpackage.wp0
    public final void a(AppBarLayout appBarLayout, int i) {
        double d = 1.0d;
        double abs = 1.0d - Math.abs(i / appBarLayout.getTotalScrollRange());
        if (abs < 0.0d) {
            d = 0.0d;
        } else if (abs <= 1.0d) {
            d = abs;
        }
        boolean z = ((double) ((float) d)) <= 0.0d;
        if (z == this.b) {
            return;
        }
        this.b = z;
        View view = this.a;
        (z ? view.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new DecelerateInterpolator()) : view.animate().alpha(0.0f).translationY(this.c).setInterpolator(new AccelerateInterpolator())).setDuration(180L).start();
    }
}
