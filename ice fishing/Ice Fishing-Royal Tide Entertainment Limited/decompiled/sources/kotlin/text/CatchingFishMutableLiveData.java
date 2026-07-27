package kotlin.text;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class CatchingFishMutableLiveData implements CatchingFishCoroutineJUnit {
    public final /* synthetic */ ActionBarContextView CatchingFishCoroutine;
    public boolean CatchingFishParcelableFAB = false;
    public int CatchingFishSnackbar;

    public CatchingFishMutableLiveData(ActionBarContextView actionBarContextView) {
        this.CatchingFishCoroutine = actionBarContextView;
    }

    @Override // kotlin.text.CatchingFishCoroutineJUnit
    public final void CatchingFishCoroutine() {
        super/*android.view.View*/.setVisibility(0);
        this.CatchingFishParcelableFAB = false;
    }

    @Override // kotlin.text.CatchingFishCoroutineJUnit
    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishParcelableFAB) {
            return;
        }
        ActionBarContextView actionBarContextView = this.CatchingFishCoroutine;
        actionBarContextView.CatchingFishLayout = null;
        super/*android.view.View*/.setVisibility(this.CatchingFishSnackbar);
    }

    @Override // kotlin.text.CatchingFishCoroutineJUnit
    public final void CatchingFishSnackbar() {
        this.CatchingFishParcelableFAB = true;
    }
}
