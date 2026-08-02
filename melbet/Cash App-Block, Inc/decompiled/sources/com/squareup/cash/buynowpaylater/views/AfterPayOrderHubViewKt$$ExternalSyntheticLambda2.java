package com.squareup.cash.buynowpaylater.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import coil3.RealImageLoader;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterPayOrderHubViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterPayOrderHubViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ RealImageLoader f$2;

    public /* synthetic */ AfterPayOrderHubViewKt$$ExternalSyntheticLambda2(AfterPayOrderHubViewModel afterPayOrderHubViewModel, Function1 function1, RealImageLoader realImageLoader, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = afterPayOrderHubViewModel;
        this.f$1 = function1;
        this.f$2 = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ImageUtilsKt.OrderHubContent(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                ImageUtilsKt.OrderHubList(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
