package com.squareup.cash.mooncake.components;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.util.android.coroutines.ViewKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MooncakeProgress$$ExternalSyntheticLambda0 implements LottieListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LottieAnimationView f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MooncakeProgress$$ExternalSyntheticLambda0(LottieAnimationView lottieAnimationView, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = lottieAnimationView;
        this.f$1 = obj;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        LottieAnimationView lottieAnimationView = this.f$0;
        switch (i) {
            case 0:
                CashLottieAnimationView cashLottieAnimationView = (CashLottieAnimationView) lottieAnimationView;
                MooncakeProgress mooncakeProgress = (MooncakeProgress) obj2;
                LottieComposition lottieComposition = (LottieComposition) obj;
                int i2 = MooncakeProgress.$r8$clinit;
                cashLottieAnimationView.setComposition(lottieComposition);
                cashLottieAnimationView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                cashLottieAnimationView.setRepeatMode(1);
                cashLottieAnimationView.setRepeatCount(-1);
                cashLottieAnimationView.addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR_FILTER, (SimpleLottieValueCallback<KeyPath>) new MaterialButton$$ExternalSyntheticLambda3(mooncakeProgress, 21));
                if (mooncakeProgress.runInOverlay) {
                    lottieComposition.getClass();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
                    ofFloat.setDuration((long) lottieComposition.getDuration());
                    ofFloat.setRepeatCount(-1);
                    ofFloat.setRepeatMode(1);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(cashLottieAnimationView, 15));
                    ViewKt.whileEachAttached(cashLottieAnimationView, EmptyCoroutineContext.INSTANCE, new MusicPresenter$models$3$1(ofFloat, null, 3));
                    break;
                }
                break;
            default:
                lottieAnimationView.setComposition((LottieComposition) obj);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.playAnimation();
                ((Function1) obj2).invoke(Boolean.TRUE);
                break;
        }
    }
}
