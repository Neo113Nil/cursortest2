package h;

import O.X;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class K extends com.bumptech.glide.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f38047e;

    public /* synthetic */ K(M m8, int i) {
        this.f38046d = i;
        this.f38047e = m8;
    }

    @Override // O.f0
    public final void c() {
        View view;
        M m8 = this.f38047e;
        switch (this.f38046d) {
            case 0:
                if (m8.f38068o && (view = m8.f38061g) != null) {
                    view.setTranslationY(0.0f);
                    m8.f38058d.setTranslationY(0.0f);
                }
                m8.f38058d.setVisibility(8);
                m8.f38058d.setTransitioning(false);
                m8.f38072s = null;
                S0.l lVar = m8.f38064k;
                if (lVar != null) {
                    lVar.i(m8.f38063j);
                    m8.f38063j = null;
                    m8.f38064k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m8.f38057c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = X.f2240a;
                    O.J.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                m8.f38072s = null;
                m8.f38058d.requestLayout();
                break;
        }
    }
}
