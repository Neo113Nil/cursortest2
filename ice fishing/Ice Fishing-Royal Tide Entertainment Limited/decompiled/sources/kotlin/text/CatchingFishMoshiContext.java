package kotlin.text;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishMoshiContext extends View {
    public final /* synthetic */ CatchingFishFluxMVPToast CatchingFishReduxKtor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMoshiContext(CatchingFishFluxMVPToast catchingFishFluxMVPToast, Context context) {
        super(context);
        this.CatchingFishReduxKtor = catchingFishFluxMVPToast;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(configuration, "newConfig");
        this.CatchingFishReduxKtor.run();
    }
}
