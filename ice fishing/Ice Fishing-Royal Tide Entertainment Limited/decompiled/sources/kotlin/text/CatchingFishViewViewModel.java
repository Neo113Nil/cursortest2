package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishViewViewModel extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ CatchingFishPicassoMVI[] CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishJUnitMoshi CatchingFishFragmentHandler;
    public final /* synthetic */ CatchingFishAdMobRoom CatchingFishLayout;
    public final /* synthetic */ CatchingFishAdMobRoom CatchingFishViewModelFAB;
    public final /* synthetic */ CatchingFishWidgetXMLLayout CatchingFishViewModelScope;
    public final /* synthetic */ List CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishViewViewModel(CatchingFishPicassoMVI[] catchingFishPicassoMVIArr, List list, CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, CatchingFishAdMobRoom catchingFishAdMobRoom, CatchingFishAdMobRoom catchingFishAdMobRoom2, CatchingFishJUnitMoshi catchingFishJUnitMoshi) {
        super(1);
        this.CatchingFishDaggerWebsocket = catchingFishPicassoMVIArr;
        this.CatchingFishWorkManager = list;
        this.CatchingFishViewModelScope = catchingFishWidgetXMLLayout;
        this.CatchingFishViewModelFAB = catchingFishAdMobRoom;
        this.CatchingFishLayout = catchingFishAdMobRoom2;
        this.CatchingFishFragmentHandler = catchingFishJUnitMoshi;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishEspressoViewFAB catchingFishEspressoViewFAB = (CatchingFishEspressoViewFAB) obj;
        CatchingFishPicassoMVI[] catchingFishPicassoMVIArr = this.CatchingFishDaggerWebsocket;
        int length = catchingFishPicassoMVIArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i;
            CatchingFishPicassoMVI catchingFishPicassoMVI = catchingFishPicassoMVIArr[i2];
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(catchingFishPicassoMVI, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            CatchingFishParcelableAdMob.CatchingFishParcelableFAB(catchingFishEspressoViewFAB, catchingFishPicassoMVI, (CatchingFishWidgetDagger) this.CatchingFishWorkManager.get(i3), this.CatchingFishViewModelScope.getLayoutDirection(), this.CatchingFishViewModelFAB.CatchingFishReduxKtor, this.CatchingFishLayout.CatchingFishReduxKtor, this.CatchingFishFragmentHandler.CatchingFishParcelableFAB);
            i2++;
            i = i3 + 1;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
