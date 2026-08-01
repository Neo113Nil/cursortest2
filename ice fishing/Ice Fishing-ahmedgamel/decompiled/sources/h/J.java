package h;

import O.X;
import a.AbstractC0422a;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J extends AbstractC0422a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37833c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L f37834d;

    public /* synthetic */ J(L l9, int i) {
        this.f37833c = i;
        this.f37834d = l9;
    }

    @Override // O.f0
    public final void c() {
        View view;
        L l9 = this.f37834d;
        switch (this.f37833c) {
            case 0:
                if (l9.f37855o && (view = l9.f37848g) != null) {
                    view.setTranslationY(0.0f);
                    l9.f37845d.setTranslationY(0.0f);
                }
                l9.f37845d.setVisibility(8);
                l9.f37845d.setTransitioning(false);
                l9.f37859s = null;
                S0.e eVar = l9.f37851k;
                if (eVar != null) {
                    eVar.i(l9.f37850j);
                    l9.f37850j = null;
                    l9.f37851k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = l9.f37844c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = X.f2054a;
                    O.J.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                l9.f37859s = null;
                l9.f37845d.requestLayout();
                break;
        }
    }
}
