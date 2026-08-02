package com.squareup.cash.buynowpaylater.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class AfterPayOrderDetailsRemainingView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState viewModel$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderDetailsRemainingView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.viewModel$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1367770931);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TextModel textModel = (TextModel) this.viewModel$delegate.getValue();
            if (textModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, i, i3) { // from class: com.squareup.cash.buynowpaylater.components.AfterPayOrderDetailsRemainingView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ AfterPayOrderDetailsRemainingView f$0;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            AfterPayOrderDetailsRemainingView afterPayOrderDetailsRemainingView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = AfterPayOrderDetailsRemainingView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    afterPayOrderDetailsRemainingView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    afterPayOrderDetailsRemainingView.Content(composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1859978984, new BulletinTileKt$$ExternalSyntheticLambda6(textModel, 9), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, i, i4) { // from class: com.squareup.cash.buynowpaylater.components.AfterPayOrderDetailsRemainingView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ AfterPayOrderDetailsRemainingView f$0;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    AfterPayOrderDetailsRemainingView afterPayOrderDetailsRemainingView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i6 = AfterPayOrderDetailsRemainingView.$r8$clinit;
                    switch (i5) {
                        case 0:
                            afterPayOrderDetailsRemainingView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            afterPayOrderDetailsRemainingView.Content(composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void setModel(TextModel textModel) {
        textModel.getClass();
        this.viewModel$delegate.setValue(textModel);
    }
}
