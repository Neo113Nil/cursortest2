package com.squareup.cash.afterpayapplet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletActivityListEmbeddedViewModel;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.p2pblocking.views.P2PListView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletActivityListEmbeddedView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ P2PListView f$0;
    public final /* synthetic */ AfterpayAppletActivityListEmbeddedViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ AfterpayAppletActivityListEmbeddedView$$ExternalSyntheticLambda0(P2PListView p2PListView, AfterpayAppletActivityListEmbeddedViewModel afterpayAppletActivityListEmbeddedViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = p2PListView;
        this.f$1 = afterpayAppletActivityListEmbeddedViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        AfterpayAppletActivityListEmbeddedViewModel afterpayAppletActivityListEmbeddedViewModel = this.f$1;
        P2PListView p2PListView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                p2PListView.Content(afterpayAppletActivityListEmbeddedViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(p2PListView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1147760762, new AtmPickerGridKt$$ExternalSyntheticLambda4(4, afterpayAppletActivityListEmbeddedViewModel, function1), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                p2PListView.Content(afterpayAppletActivityListEmbeddedViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AfterpayAppletActivityListEmbeddedView$$ExternalSyntheticLambda0(P2PListView p2PListView, AfterpayAppletActivityListEmbeddedViewModel afterpayAppletActivityListEmbeddedViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = p2PListView;
        this.f$1 = afterpayAppletActivityListEmbeddedViewModel;
        this.f$2 = function1;
    }
}
