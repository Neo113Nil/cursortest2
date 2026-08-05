package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class d5 extends ViewOutlineProvider {
    public final /* synthetic */ Chip qoPGr6Ce;

    public d5(Chip chip) {
        this.qoPGr6Ce = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        g5 g5Var = this.qoPGr6Ce.P7K7Inc8;
        if (g5Var != null) {
            g5Var.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
