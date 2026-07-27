package kotlin.text;

import android.animation.ValueAnimator;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class CatchingFishSharedFlowToast implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishSharedFlowToast(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CatchingFishContextGraphQL catchingFishContextGraphQL = ((BottomSheetBehavior) this.CatchingFishSnackbar).CatchingFishLayout;
                if (catchingFishContextGraphQL != null) {
                    CatchingFishMVPEspressoRoom catchingFishMVPEspressoRoom = catchingFishContextGraphQL.CatchingFishDaggerWebsocket;
                    if (catchingFishMVPEspressoRoom.CatchingFishFragmentHandler != floatValue) {
                        catchingFishMVPEspressoRoom.CatchingFishFragmentHandler = floatValue;
                        catchingFishContextGraphQL.CatchingFishLayout = true;
                        catchingFishContextGraphQL.CatchingFishFragmentHandler = true;
                        catchingFishContextGraphQL.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                CatchingFishGsonNavigation catchingFishGsonNavigation = (CatchingFishGsonNavigation) this.CatchingFishSnackbar;
                catchingFishGsonNavigation.CatchingFishCoroutine.setAlpha(floatValue2);
                catchingFishGsonNavigation.CatchingFishReduxKtor.setAlpha(floatValue2);
                catchingFishGsonNavigation.CatchingFish.invalidate();
                break;
            default:
                ((TextInputLayout) this.CatchingFishSnackbar).CatchingFishMVPReduxContext.CatchingFishOkHttp(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
