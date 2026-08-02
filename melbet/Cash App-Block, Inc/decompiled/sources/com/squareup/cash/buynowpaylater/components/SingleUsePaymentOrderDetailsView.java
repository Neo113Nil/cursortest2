package com.squareup.cash.buynowpaylater.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderDetailsViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class SingleUsePaymentOrderDetailsView extends AbstractComposeView {
    public final RealImageLoader imageLoader;
    public final ParcelableSnapshotMutableState viewModel$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleUsePaymentOrderDetailsView(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.viewModel$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1771754483);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            SUPOrderDetailsViewModel sUPOrderDetailsViewModel = (SUPOrderDetailsViewModel) this.viewModel$delegate.getValue();
            if (sUPOrderDetailsViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, i3) { // from class: com.squareup.cash.buynowpaylater.components.SingleUsePaymentOrderDetailsView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ SingleUsePaymentOrderDetailsView f$0;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    singleUsePaymentOrderDetailsView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    singleUsePaymentOrderDetailsView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-586908904, new BulletinTileKt$$ExternalSyntheticLambda2(15, sUPOrderDetailsViewModel, this), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i4) { // from class: com.squareup.cash.buynowpaylater.components.SingleUsePaymentOrderDetailsView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ SingleUsePaymentOrderDetailsView f$0;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            singleUsePaymentOrderDetailsView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            singleUsePaymentOrderDetailsView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void setModel(SUPOrderDetailsViewModel sUPOrderDetailsViewModel) {
        sUPOrderDetailsViewModel.getClass();
        this.viewModel$delegate.setValue(sUPOrderDetailsViewModel);
    }
}
