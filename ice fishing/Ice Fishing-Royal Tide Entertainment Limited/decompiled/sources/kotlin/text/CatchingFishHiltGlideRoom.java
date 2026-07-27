package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishHiltGlideRoom {
    public final CatchingFishMVPMotionLayout CatchingFishParcelableFAB;
    public final CatchingFishMVIWidget CatchingFishSnackbar;

    public CatchingFishHiltGlideRoom(CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt, CatchingFishReduxLifecycle catchingFishReduxLifecycle) {
        this.CatchingFishParcelableFAB = catchingFishMVIGraphQLHilt.CatchingFishReduxKtor;
        this.CatchingFishSnackbar = new CatchingFishMVIWidget(CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt).size());
        List CatchingFishFragmentHandler = CatchingFishMVIGraphQLHilt.CatchingFishFragmentHandler(4, catchingFishMVIGraphQLHilt);
        int size = CatchingFishFragmentHandler.size();
        for (int i = 0; i < size; i++) {
            CatchingFishMVIGraphQLHilt catchingFishMVIGraphQLHilt2 = (CatchingFishMVIGraphQLHilt) CatchingFishFragmentHandler.get(i);
            if (catchingFishReduxLifecycle.CatchingFishParcelableFAB(catchingFishMVIGraphQLHilt2.CatchingFishViewModelScope)) {
                this.CatchingFishSnackbar.CatchingFishParcelableFAB(catchingFishMVIGraphQLHilt2.CatchingFishViewModelScope);
            }
        }
    }
}
