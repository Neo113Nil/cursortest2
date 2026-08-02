package com.knotapi.knot.utilities;

import android.widget.ImageView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieListener;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda12;
import com.squareup.cash.lottie.CashLottieAnimationView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class LoaderView$$ExternalSyntheticLambda1 implements LottieListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ LoaderView$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((LoaderView) obj2).setupLottieDrawable((LottieComposition) obj);
                break;
            case 1:
                ((Function1) obj2).invoke(Boolean.FALSE);
                break;
            case 2:
                FormView formView = (FormView) obj2;
                formView.getAnimationView().setVisibility(0);
                formView.getAnimationView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                formView.getAnimationView().animate().alpha(1.0f).setDuration(2000L).withEndAction(new FormView$$ExternalSyntheticLambda12(formView, 1)).start();
                formView.getAnimationView().setComposition((LottieComposition) obj);
                formView.getAnimationView().playAnimation();
                break;
            default:
                CashLottieAnimationView cashLottieAnimationView = (CashLottieAnimationView) obj2;
                cashLottieAnimationView.setComposition((LottieComposition) obj);
                cashLottieAnimationView.setRepeatCount(0);
                cashLottieAnimationView.playAnimation();
                break;
        }
    }
}
