package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIRealm {
    public final boolean CatchingFishParcelableFAB;
    public final Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishStripeAPIRealm(Object obj, boolean z) {
        this.CatchingFishSnackbar = obj;
        this.CatchingFishParcelableFAB = z;
    }

    public boolean CatchingFishParcelableFAB() {
        return this.CatchingFishParcelableFAB;
    }

    public boolean CatchingFishSnackbar(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = (CatchingFishMoshiFluxMoshi) this.CatchingFishSnackbar;
        if (catchingFishMoshiFluxMoshi == null) {
            return CatchingFishParcelableFAB();
        }
        catchingFishMoshiFluxMoshi.getClass();
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            CatchingFishStripeAPIRealm catchingFishStripeAPIRealm = CatchingFishLifecyclePayPal.CatchingFishParcelableFAB;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return CatchingFishParcelableFAB();
        }
        return false;
    }

    public CatchingFishStripeAPIRealm(CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi, boolean z) {
        this.CatchingFishSnackbar = catchingFishMoshiFluxMoshi;
        this.CatchingFishParcelableFAB = z;
    }
}
