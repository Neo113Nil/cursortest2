package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishStripeAPILayout {
    public final CatchingFishOkHttpBundle CatchingFishParcelableFAB;

    public CatchingFishStripeAPILayout(CatchingFishJUnitGlide catchingFishJUnitGlide) {
        this.CatchingFishParcelableFAB = new CatchingFishOkHttpBundle(catchingFishJUnitGlide);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CatchingFishPayPalView CatchingFishCoroutine(CatchingFishServiceGraphQL catchingFishServiceGraphQL, CatchingFishPayPalView catchingFishPayPalView) {
        CatchingFishAnimationDagger catchingFishAnimationDagger = null;
        if (catchingFishPayPalView instanceof CatchingFishAnimationDagger) {
            if (catchingFishServiceGraphQL.CatchingFishReduxKtor) {
                catchingFishAnimationDagger = (CatchingFishAnimationDagger) catchingFishPayPalView;
                catchingFishAnimationDagger.CatchingFishParcelableFAB.setValue(catchingFishServiceGraphQL.CatchingFishCoroutine());
            }
        } else if (catchingFishPayPalView instanceof CatchingFishHiltEspresso) {
            if ((catchingFishServiceGraphQL.CatchingFishCoroutine || catchingFishServiceGraphQL.CatchingFishSnackbar != null) && !catchingFishServiceGraphQL.CatchingFishReduxKtor) {
                CatchingFishHiltEspresso catchingFishHiltEspresso = (CatchingFishHiltEspresso) catchingFishPayPalView;
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishServiceGraphQL.CatchingFishCoroutine(), catchingFishHiltEspresso.CatchingFishParcelableFAB)) {
                    catchingFishAnimationDagger = catchingFishHiltEspresso;
                }
            }
        } else if (catchingFishPayPalView instanceof CatchingFishKtorDaggerHilt) {
            catchingFishServiceGraphQL.getClass();
            ((CatchingFishKtorDaggerHilt) catchingFishPayPalView).getClass();
        }
        if (catchingFishAnimationDagger != null) {
            return catchingFishAnimationDagger;
        }
        if (!catchingFishServiceGraphQL.CatchingFishReduxKtor) {
            return new CatchingFishHiltEspresso(catchingFishServiceGraphQL.CatchingFishCoroutine());
        }
        Object obj = catchingFishServiceGraphQL.CatchingFishSnackbar;
        CatchingFishWidgetViewPager catchingFishWidgetViewPager = (CatchingFishWidgetViewPager) catchingFishServiceGraphQL.CatchingFishParcelableFAB;
        if (catchingFishWidgetViewPager == null) {
            catchingFishWidgetViewPager = CatchingFishGradleMVVM.CatchingFishJetpackCompose;
        }
        return new CatchingFishAnimationDagger(new CatchingFishAsyncTaskIntent(obj, catchingFishWidgetViewPager));
    }

    public abstract CatchingFishServiceGraphQL CatchingFishParcelableFAB(Object obj);

    public CatchingFishPayPalView CatchingFishSnackbar() {
        return this.CatchingFishParcelableFAB;
    }
}
