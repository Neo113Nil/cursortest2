package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLMoshi {
    public boolean CatchingFishCoroutine;
    public boolean CatchingFishParcelableFAB;
    public CatchingFishMockkDaggerHilt CatchingFishSnackbar;

    public final void CatchingFishParcelableFAB(CatchingFishMockkDaggerHilt catchingFishMockkDaggerHilt) {
        synchronized (this) {
            while (this.CatchingFishCoroutine) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.CatchingFishSnackbar == catchingFishMockkDaggerHilt) {
                return;
            }
            this.CatchingFishSnackbar = catchingFishMockkDaggerHilt;
            if (this.CatchingFishParcelableFAB) {
                catchingFishMockkDaggerHilt.onCancel();
            }
        }
    }
}
