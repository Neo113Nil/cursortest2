package com.squareup.cash.qrcodes.views;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class QrAddressScannerView extends ComposeUiView {
    public PaddingValues extraContentPadding;
    public final RealCashVibrator vibrator;

    public QrAddressScannerView(Context context, RealCashVibrator realCashVibrator) {
        super(context);
        this.vibrator = realCashVibrator;
        this.extraContentPadding = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3);
    }

    public final void Content(final QrAddressScannerViewModel qrAddressScannerViewModel, final Function1 function1, Composer composer, final int i) {
        QrAddressScannerViewModel qrAddressScannerViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1280725746);
        int i3 = (gapComposer.changedInstance(qrAddressScannerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            qrAddressScannerViewModel2 = qrAddressScannerViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (qrAddressScannerViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, qrAddressScannerViewModel, function1, i, i4) { // from class: com.squareup.cash.qrcodes.views.QrAddressScannerView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ QrAddressScannerView f$0;
                        public final /* synthetic */ QrAddressScannerViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            QrAddressScannerViewModel qrAddressScannerViewModel3 = this.f$1;
                            QrAddressScannerView qrAddressScannerView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    qrAddressScannerView.Content(qrAddressScannerViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    qrAddressScannerView.Content(qrAddressScannerViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            qrAddressScannerViewModel2 = qrAddressScannerViewModel;
            function12 = function1;
            i2 = i;
            CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel2, function12, this.vibrator, null, this.extraContentPadding, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 8);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Function1 function13 = function12;
            final int i5 = 1;
            final int i6 = i2;
            final QrAddressScannerViewModel qrAddressScannerViewModel3 = qrAddressScannerViewModel2;
            endRestartGroup2.block = new Function2(this, qrAddressScannerViewModel3, function13, i6, i5) { // from class: com.squareup.cash.qrcodes.views.QrAddressScannerView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ QrAddressScannerView f$0;
                public final /* synthetic */ QrAddressScannerViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    QrAddressScannerViewModel qrAddressScannerViewModel32 = this.f$1;
                    QrAddressScannerView qrAddressScannerView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            qrAddressScannerView.Content(qrAddressScannerViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            qrAddressScannerView.Content(qrAddressScannerViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void setExtraContentPadding(PaddingValues paddingValues) {
        paddingValues.getClass();
        this.extraContentPadding = paddingValues;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((QrAddressScannerViewModel) obj, function1, gapComposer, 0);
    }
}
