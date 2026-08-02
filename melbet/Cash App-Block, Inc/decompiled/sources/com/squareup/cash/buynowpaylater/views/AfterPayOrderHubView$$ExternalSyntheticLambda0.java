package com.squareup.cash.buynowpaylater.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewModel;
import com.squareup.cash.p2pblocking.views.P2PListView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterPayOrderHubView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ P2PListView f$0;
    public final /* synthetic */ AfterPayOrderHubViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ AfterPayOrderHubView$$ExternalSyntheticLambda0(AfterPayOrderHubViewModel afterPayOrderHubViewModel, Function1 function1, P2PListView p2PListView) {
        this.$r8$classId = 1;
        this.f$1 = afterPayOrderHubViewModel;
        this.f$2 = function1;
        this.f$0 = p2PListView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        AfterPayOrderHubViewModel afterPayOrderHubViewModel = this.f$1;
        P2PListView p2PListView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                p2PListView.Content(afterPayOrderHubViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ImageUtilsKt.OrderHubContent(afterPayOrderHubViewModel, function1, p2PListView.imageLoader, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                p2PListView.Content(afterPayOrderHubViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AfterPayOrderHubView$$ExternalSyntheticLambda0(P2PListView p2PListView, AfterPayOrderHubViewModel afterPayOrderHubViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = p2PListView;
        this.f$1 = afterPayOrderHubViewModel;
        this.f$2 = function1;
    }
}
