package kotlin.text;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class CatchingFishViewModelJUnit extends ViewOutlineProvider {
    public final /* synthetic */ Chip CatchingFishParcelableFAB;

    public CatchingFishViewModelJUnit(Chip chip) {
        this.CatchingFishParcelableFAB = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        CatchingFishLayoutEspresso catchingFishLayoutEspresso = this.CatchingFishParcelableFAB.CatchingFishViewModelFAB;
        if (catchingFishLayoutEspresso != null) {
            catchingFishLayoutEspresso.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
