package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishServiceToast implements CatchingFishToastToast {
    public final long CatchingFishReduxKtor;

    public CatchingFishServiceToast(long j) {
        this.CatchingFishReduxKtor = j;
        if (j != 16) {
            return;
        }
        CatchingFishReduxAsyncTask.CatchingFishParcelableFAB("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // kotlin.text.CatchingFishToastToast
    public final long CatchingFishCoroutine() {
        return this.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishToastToast
    public final float CatchingFishParcelableFAB() {
        return CatchingFishToastFragment.CatchingFishReduxKtor(this.CatchingFishReduxKtor);
    }

    @Override // kotlin.text.CatchingFishToastToast
    public final CatchingFishRobolectricHilt CatchingFishViewModelScope() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishServiceToast) && CatchingFishToastFragment.CatchingFishCoroutine(this.CatchingFishReduxKtor, ((CatchingFishServiceToast) obj).CatchingFishReduxKtor);
    }

    public final int hashCode() {
        int i = CatchingFishToastFragment.CatchingFishViewModelScope;
        return Long.hashCode(this.CatchingFishReduxKtor);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) CatchingFishToastFragment.CatchingFishViewModelFAB(this.CatchingFishReduxKtor)) + ')';
    }
}
