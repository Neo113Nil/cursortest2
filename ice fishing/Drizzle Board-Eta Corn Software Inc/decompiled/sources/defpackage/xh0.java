package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xh0 extends f50 {
    public final /* synthetic */ zh0 P7K7Inc8;
    public final /* synthetic */ int VgvYg0wo;

    public /* synthetic */ xh0(zh0 zh0Var, int i) {
        this.VgvYg0wo = i;
        this.P7K7Inc8 = zh0Var;
    }

    @Override // defpackage.zg0
    public final void qoPGr6Ce() {
        View view;
        int i = this.VgvYg0wo;
        zh0 zh0Var = this.P7K7Inc8;
        switch (i) {
            case 0:
                if (zh0Var.lDXGDhIF && (view = zh0Var.b2ZJblxo) != null) {
                    view.setTranslationY(0.0f);
                    zh0Var.wxUZMvaN.setTranslationY(0.0f);
                }
                zh0Var.wxUZMvaN.setVisibility(8);
                zh0Var.wxUZMvaN.setTransitioning(false);
                zh0Var.KlHjfFWx = null;
                mcXgUFR8 mcxgufr8 = zh0Var.k3x7lurq;
                if (mcxgufr8 != null) {
                    mcxgufr8.Mq3SeTnW(zh0Var.eVhOlqcC);
                    zh0Var.eVhOlqcC = null;
                    zh0Var.k3x7lurq = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = zh0Var.MdtA4re8;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                zh0Var.KlHjfFWx = null;
                zh0Var.wxUZMvaN.requestLayout();
                break;
        }
    }
}
