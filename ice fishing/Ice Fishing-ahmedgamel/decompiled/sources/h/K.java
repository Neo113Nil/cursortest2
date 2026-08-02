package h;

import O.X;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.internal.ads.LP;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class K extends Z2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f37860f;

    public /* synthetic */ K(M m9, int i) {
        this.f37859e = i;
        this.f37860f = m9;
    }

    @Override // O.f0
    public final void c() {
        View view;
        M m9 = this.f37860f;
        switch (this.f37859e) {
            case 0:
                if (m9.f37881o && (view = m9.f37874g) != null) {
                    view.setTranslationY(0.0f);
                    m9.f37871d.setTranslationY(0.0f);
                }
                m9.f37871d.setVisibility(8);
                m9.f37871d.setTransitioning(false);
                m9.f37885s = null;
                LP lp = m9.f37877k;
                if (lp != null) {
                    lp.h(m9.f37876j);
                    m9.f37876j = null;
                    m9.f37877k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m9.f37870c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = X.f2142a;
                    O.J.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                m9.f37885s = null;
                m9.f37871d.requestLayout();
                break;
        }
    }
}
