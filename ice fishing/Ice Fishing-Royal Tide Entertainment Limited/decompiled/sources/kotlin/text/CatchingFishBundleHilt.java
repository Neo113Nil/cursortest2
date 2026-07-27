package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishBundleHilt extends CatchingFishFirebaseDagger {
    public final /* synthetic */ int CatchingFishCoroutineFlow;

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final int CatchingFishMutableLiveData(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.CatchingFishCoroutineFlow) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final int CatchingFishPayPalService() {
        switch (this.CatchingFishCoroutineFlow) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // kotlin.text.CatchingFishFirebaseDagger
    public final ViewPropertyAnimator CatchingFishSensorManager(View view, int i) {
        switch (this.CatchingFishCoroutineFlow) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
