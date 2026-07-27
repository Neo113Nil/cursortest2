package kotlin.text;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLMVVMMVP extends Property {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishGraphQLMVVMMVP(Class cls, String str, int i) {
        super(cls, str);
        this.CatchingFishParcelableFAB = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return Float.valueOf(CatchingFishMockkFragment.CatchingFishParcelableFAB.CatchingFishDaggerHiltFAB((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABStripeAPI catchingFishFABStripeAPI = (CatchingFishFABStripeAPI) obj;
                PointF pointF = (PointF) obj2;
                catchingFishFABStripeAPI.getClass();
                catchingFishFABStripeAPI.CatchingFishParcelableFAB = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                catchingFishFABStripeAPI.CatchingFishSnackbar = round;
                int i = catchingFishFABStripeAPI.CatchingFishWorkManager + 1;
                catchingFishFABStripeAPI.CatchingFishWorkManager = i;
                if (i == catchingFishFABStripeAPI.CatchingFishViewModelScope) {
                    CatchingFishMockkFragment.CatchingFishParcelableFAB(catchingFishFABStripeAPI.CatchingFishDaggerWebsocket, catchingFishFABStripeAPI.CatchingFishParcelableFAB, round, catchingFishFABStripeAPI.CatchingFishCoroutine, catchingFishFABStripeAPI.CatchingFishReduxKtor);
                    catchingFishFABStripeAPI.CatchingFishWorkManager = 0;
                    catchingFishFABStripeAPI.CatchingFishViewModelScope = 0;
                    break;
                }
                break;
            case 1:
                CatchingFishFABStripeAPI catchingFishFABStripeAPI2 = (CatchingFishFABStripeAPI) obj;
                PointF pointF2 = (PointF) obj2;
                catchingFishFABStripeAPI2.getClass();
                catchingFishFABStripeAPI2.CatchingFishCoroutine = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                catchingFishFABStripeAPI2.CatchingFishReduxKtor = round2;
                int i2 = catchingFishFABStripeAPI2.CatchingFishViewModelScope + 1;
                catchingFishFABStripeAPI2.CatchingFishViewModelScope = i2;
                if (catchingFishFABStripeAPI2.CatchingFishWorkManager == i2) {
                    CatchingFishMockkFragment.CatchingFishParcelableFAB(catchingFishFABStripeAPI2.CatchingFishDaggerWebsocket, catchingFishFABStripeAPI2.CatchingFishParcelableFAB, catchingFishFABStripeAPI2.CatchingFishSnackbar, catchingFishFABStripeAPI2.CatchingFishCoroutine, round2);
                    catchingFishFABStripeAPI2.CatchingFishWorkManager = 0;
                    catchingFishFABStripeAPI2.CatchingFishViewModelScope = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                CatchingFishMockkFragment.CatchingFishParcelableFAB(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                CatchingFishMockkFragment.CatchingFishParcelableFAB(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                CatchingFishMockkFragment.CatchingFishParcelableFAB(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                float floatValue = ((Float) obj2).floatValue();
                CatchingFishMockkFragment.CatchingFishParcelableFAB.CatchingFishHandler((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
