package kotlin.text;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIGson extends CatchingFishViewHiltWidget {
    @Override // kotlin.text.CatchingFishViewHiltWidget
    public final void CatchingFishParcelableFAB(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof CatchingFishMVVMSnackbar) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw null;
        }
    }
}
