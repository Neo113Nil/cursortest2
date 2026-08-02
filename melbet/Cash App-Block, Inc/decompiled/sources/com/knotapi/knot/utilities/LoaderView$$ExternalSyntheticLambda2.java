package com.knotapi.knot.utilities;

import app.cash.arcade.values.StandardInputModes;
import com.airbnb.lottie.LottieListener;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final /* synthetic */ class LoaderView$$ExternalSyntheticLambda2 implements LottieListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LoaderView$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.$r8$classId) {
            case 0:
                LoaderView.lambda$init$0(th);
                break;
            default:
                Timber.Forest.e(new Exception("Failed to load animation: " + StandardInputModes.url));
                break;
        }
    }
}
