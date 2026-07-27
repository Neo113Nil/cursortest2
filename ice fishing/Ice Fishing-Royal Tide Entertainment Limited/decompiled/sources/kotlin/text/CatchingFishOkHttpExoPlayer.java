package kotlin.text;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpExoPlayer extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishReduxRetrofit CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishOkHttpExoPlayer(CatchingFishReduxRetrofit catchingFishReduxRetrofit, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishReduxRetrofit;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        boolean dispatchTouchEvent;
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishAdMobJUnit catchingFishAdMobJUnit = (CatchingFishAdMobJUnit) obj;
                CatchingFishGradleCameraX catchingFishGradleCameraX = catchingFishAdMobJUnit instanceof CatchingFishGradleCameraX ? (CatchingFishGradleCameraX) catchingFishAdMobJUnit : null;
                CatchingFishReduxRetrofit catchingFishReduxRetrofit = this.CatchingFishWorkManager;
                if (catchingFishGradleCameraX != null) {
                    catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().removeViewInLayout(catchingFishReduxRetrofit);
                    CatchingFishLayoutRoomFAB.CatchingFishLayout(catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(catchingFishGradleCameraX.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(catchingFishReduxRetrofit));
                    catchingFishReduxRetrofit.setImportantForAccessibility(0);
                }
                catchingFishReduxRetrofit.removeAllViewsInLayout();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                CatchingFishReduxRetrofit catchingFishReduxRetrofit2 = this.CatchingFishWorkManager;
                switch (actionMasked) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        dispatchTouchEvent = catchingFishReduxRetrofit2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = catchingFishReduxRetrofit2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
