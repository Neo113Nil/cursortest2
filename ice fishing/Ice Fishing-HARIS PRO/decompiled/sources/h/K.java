package h;

import O.AbstractC0049z;
import a.AbstractC0078a;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class K extends AbstractC0078a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f3149f;

    public /* synthetic */ K(M m2, int i) {
        this.e = i;
        this.f3149f = m2;
    }

    @Override // O.O
    public final void a() {
        View view;
        M m2 = this.f3149f;
        switch (this.e) {
            case 0:
                if (m2.f3167o && (view = m2.f3161g) != null) {
                    view.setTranslationY(RecyclerView.f2111C0);
                    m2.f3159d.setTranslationY(RecyclerView.f2111C0);
                }
                m2.f3159d.setVisibility(8);
                m2.f3159d.setTransitioning(false);
                m2.f3171s = null;
                F.i iVar = m2.f3163k;
                if (iVar != null) {
                    iVar.B(m2.j);
                    m2.j = null;
                    m2.f3163k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m2.f3158c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = O.K.f747a;
                    AbstractC0049z.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                m2.f3171s = null;
                m2.f3159d.requestLayout();
                break;
        }
    }
}
