package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltFragmentMVI {
    public final CatchingFishMockkMVI CatchingFishParcelableFAB;
    public final CatchingFishFABSharedFlow CatchingFishSnackbar;

    public CatchingFishHiltFragmentMVI(CatchingFishMockkMVI catchingFishMockkMVI, CatchingFishFABSharedFlow catchingFishFABSharedFlow) {
        this.CatchingFishParcelableFAB = catchingFishMockkMVI;
        this.CatchingFishSnackbar = catchingFishFABSharedFlow;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishHiltFragmentMVI)) {
            return false;
        }
        CatchingFishHiltFragmentMVI catchingFishHiltFragmentMVI = (CatchingFishHiltFragmentMVI) obj;
        catchingFishHiltFragmentMVI.getClass();
        CatchingFishMockkMVI catchingFishMockkMVI = catchingFishHiltFragmentMVI.CatchingFishParcelableFAB;
        CatchingFishFABSharedFlow catchingFishFABSharedFlow = catchingFishHiltFragmentMVI.CatchingFishSnackbar;
        if (!this.CatchingFishParcelableFAB.equals(catchingFishMockkMVI)) {
            return false;
        }
        Object obj2 = CatchingFishContextMVI.CatchingFishReduxKtor;
        return obj2.equals(obj2) && this.CatchingFishSnackbar.equals(catchingFishFABSharedFlow);
    }

    public final int hashCode() {
        return this.CatchingFishSnackbar.hashCode() ^ (((((1000003 * 1000003) ^ this.CatchingFishParcelableFAB.hashCode()) * 1000003) ^ CatchingFishContextMVI.CatchingFishReduxKtor.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.CatchingFishParcelableFAB + ", priority=" + CatchingFishContextMVI.CatchingFishReduxKtor + ", productData=" + this.CatchingFishSnackbar + "}";
    }
}
