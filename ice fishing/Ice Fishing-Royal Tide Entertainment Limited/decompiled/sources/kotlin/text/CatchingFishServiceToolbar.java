package kotlin.text;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishServiceToolbar extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ Context CatchingFishDaggerWebsocket;
    public final /* synthetic */ View CatchingFishFragmentHandler;
    public final /* synthetic */ int CatchingFishLayout;
    public final /* synthetic */ CatchingFishFirebaseHilt CatchingFishViewModelFAB;
    public final /* synthetic */ CatchingFishBundlePicasso CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishServiceHandler CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishServiceToolbar(Context context, CatchingFishServiceHandler catchingFishServiceHandler, CatchingFishBundlePicasso catchingFishBundlePicasso, CatchingFishFirebaseHilt catchingFishFirebaseHilt, int i, View view) {
        super(0);
        this.CatchingFishDaggerWebsocket = context;
        this.CatchingFishWorkManager = catchingFishServiceHandler;
        this.CatchingFishViewModelScope = catchingFishBundlePicasso;
        this.CatchingFishViewModelFAB = catchingFishFirebaseHilt;
        this.CatchingFishLayout = i;
        this.CatchingFishFragmentHandler = view;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        KeyEvent.Callback callback = this.CatchingFishFragmentHandler;
        CatchingFishFirebaseDagger.CatchingFishStateLiveData(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new CatchingFishReduxRetrofit(this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishViewModelScope, this.CatchingFishViewModelFAB, this.CatchingFishLayout, (CatchingFishAdMobJUnit) callback).getLayoutNode();
    }
}
