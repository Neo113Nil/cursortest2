package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishParcelableRoom {
    public int CatchingFishCoroutine = -1;
    public final CatchingFishViewPagerMockk CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishGraphQLHilt CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;

    public CatchingFishParcelableRoom(CatchingFishGraphQLHilt catchingFishGraphQLHilt, CatchingFishViewPagerMockk catchingFishViewPagerMockk) {
        this.CatchingFishReduxKtor = catchingFishGraphQLHilt;
        this.CatchingFishParcelableFAB = catchingFishViewPagerMockk;
    }

    public final void CatchingFishParcelableFAB(boolean z) {
        if (z == this.CatchingFishSnackbar) {
            return;
        }
        this.CatchingFishSnackbar = z;
        int i = z ? 1 : -1;
        CatchingFishGraphQLHilt catchingFishGraphQLHilt = this.CatchingFishReduxKtor;
        int i2 = catchingFishGraphQLHilt.CatchingFishCoroutine;
        catchingFishGraphQLHilt.CatchingFishCoroutine = i + i2;
        if (!catchingFishGraphQLHilt.CatchingFishReduxKtor) {
            catchingFishGraphQLHilt.CatchingFishReduxKtor = true;
            while (true) {
                try {
                    int i3 = catchingFishGraphQLHilt.CatchingFishCoroutine;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    catchingFishGraphQLHilt.CatchingFishReduxKtor = false;
                }
            }
        }
        if (this.CatchingFishSnackbar) {
            catchingFishGraphQLHilt.CatchingFishCoroutine(this);
        }
    }
}
