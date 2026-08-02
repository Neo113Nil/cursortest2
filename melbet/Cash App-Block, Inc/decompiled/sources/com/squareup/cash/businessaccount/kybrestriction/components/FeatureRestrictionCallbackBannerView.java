package com.squareup.cash.businessaccount.kybrestriction.components;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.res.ColorResources_androidKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class FeatureRestrictionCallbackBannerView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState callbackModel$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureRestrictionCallbackBannerView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.callbackModel$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2046330826);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            UiCallbackModel uiCallbackModel = (UiCallbackModel) this.callbackModel$delegate.getValue();
            if (uiCallbackModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, i3) { // from class: com.squareup.cash.businessaccount.kybrestriction.components.FeatureRestrictionCallbackBannerView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ FeatureRestrictionCallbackBannerView f$0;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            FeatureRestrictionCallbackBannerView featureRestrictionCallbackBannerView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = FeatureRestrictionCallbackBannerView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    featureRestrictionCallbackBannerView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    featureRestrictionCallbackBannerView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ColorResources_androidKt.FeatureRestrictionCallbackBanner(uiCallbackModel, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), false, false, gapComposer, 432, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i4) { // from class: com.squareup.cash.businessaccount.kybrestriction.components.FeatureRestrictionCallbackBannerView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ FeatureRestrictionCallbackBannerView f$0;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    FeatureRestrictionCallbackBannerView featureRestrictionCallbackBannerView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i6 = FeatureRestrictionCallbackBannerView.$r8$clinit;
                    switch (i5) {
                        case 0:
                            featureRestrictionCallbackBannerView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            featureRestrictionCallbackBannerView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void setModel(UiCallbackModel uiCallbackModel) {
        uiCallbackModel.getClass();
        this.callbackModel$delegate.setValue(uiCallbackModel);
    }
}
