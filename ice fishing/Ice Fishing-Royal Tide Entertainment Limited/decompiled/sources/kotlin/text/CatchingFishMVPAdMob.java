package kotlin.text;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class CatchingFishMVPAdMob extends CatchingFishViewWebsocket implements CatchingFishCameraXGlide {
    public final /* synthetic */ CatchingFishDataStoreMVVM CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishMVPAdMob(CatchingFishDataStoreMVVM catchingFishDataStoreMVVM, int i) {
        super(4);
        this.CatchingFishDaggerWebsocket = catchingFishDataStoreMVVM;
        this.CatchingFishWorkManager = i;
    }

    @Override // kotlin.text.CatchingFishCameraXGlide
    public final Object CatchingFishCoroutine(Integer num, Integer num2, Object obj, Integer num3) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int intValue3 = ((Number) obj).intValue();
        int intValue4 = num3.intValue();
        CatchingFishDataStoreMVVM catchingFishDataStoreMVVM = this.CatchingFishDaggerWebsocket;
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = catchingFishDataStoreMVVM.CatchingFishParcelableFAB;
        ((AutofillManager) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).notifyViewEntered(catchingFishDataStoreMVVM.CatchingFishCoroutine, this.CatchingFishWorkManager, new Rect(intValue, intValue2, intValue3, intValue4));
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
