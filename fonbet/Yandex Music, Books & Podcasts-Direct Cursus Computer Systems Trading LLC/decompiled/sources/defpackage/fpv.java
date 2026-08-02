package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class fpv extends zgu {
    public final /* synthetic */ int a;
    public final /* synthetic */ hpv b;

    public /* synthetic */ fpv(hpv hpvVar, int i) {
        this.a = i;
        this.b = hpvVar;
    }

    @Override // defpackage.ygu
    public final void c() {
        View view;
        int i = this.a;
        hpv hpvVar = this.b;
        switch (i) {
            case 0:
                if (hpvVar.o && (view = hpvVar.g) != null) {
                    view.setTranslationY(0.0f);
                    hpvVar.d.setTranslationY(0.0f);
                }
                hpvVar.d.setVisibility(8);
                hpvVar.d.setTransitioning(false);
                hpvVar.t = null;
                nnk nnkVar = hpvVar.k;
                if (nnkVar != null) {
                    nnkVar.r(hpvVar.j);
                    hpvVar.j = null;
                    hpvVar.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = hpvVar.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = wdu.a;
                    ldu.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                hpvVar.t = null;
                hpvVar.d.requestLayout();
                break;
        }
    }
}
