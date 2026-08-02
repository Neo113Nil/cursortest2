package com.squareup.cash.bitcoin.views.performance.details;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class BitcoinPerformanceDetailsView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinPerformanceDetailsView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final BitcoinPerformanceDetailsViewModel bitcoinPerformanceDetailsViewModel, final Function1 function1, Composer composer, final int i) {
        BitcoinPerformanceDetailsView bitcoinPerformanceDetailsView;
        BitcoinPerformanceDetailsViewModel bitcoinPerformanceDetailsViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(632830038);
        int i3 = (gapComposer.changed(bitcoinPerformanceDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            bitcoinPerformanceDetailsView = this;
            bitcoinPerformanceDetailsViewModel2 = bitcoinPerformanceDetailsViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (bitcoinPerformanceDetailsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, bitcoinPerformanceDetailsViewModel, function1, i, i4) { // from class: com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ BitcoinPerformanceDetailsView f$0;
                        public final /* synthetic */ BitcoinPerformanceDetailsViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            BitcoinPerformanceDetailsViewModel bitcoinPerformanceDetailsViewModel3 = this.f$1;
                            BitcoinPerformanceDetailsView bitcoinPerformanceDetailsView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = BitcoinPerformanceDetailsView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    bitcoinPerformanceDetailsView2.Content(bitcoinPerformanceDetailsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    bitcoinPerformanceDetailsView2.Content(bitcoinPerformanceDetailsViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            bitcoinPerformanceDetailsView = this;
            bitcoinPerformanceDetailsViewModel2 = bitcoinPerformanceDetailsViewModel;
            function12 = function1;
            i2 = i;
            BitcoinPerformanceDetailsViewKt.BitcoinPerformanceDetailsContent(function12, bitcoinPerformanceDetailsViewModel2, null, gapComposer, ((i3 >> 3) & 14) | ((i3 << 3) & 112));
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final BitcoinPerformanceDetailsViewModel bitcoinPerformanceDetailsViewModel3 = bitcoinPerformanceDetailsViewModel2;
            final BitcoinPerformanceDetailsView bitcoinPerformanceDetailsView2 = bitcoinPerformanceDetailsView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(bitcoinPerformanceDetailsView2, bitcoinPerformanceDetailsViewModel3, function13, i5, i6) { // from class: com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ BitcoinPerformanceDetailsView f$0;
                public final /* synthetic */ BitcoinPerformanceDetailsViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = bitcoinPerformanceDetailsView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    BitcoinPerformanceDetailsViewModel bitcoinPerformanceDetailsViewModel32 = this.f$1;
                    BitcoinPerformanceDetailsView bitcoinPerformanceDetailsView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = BitcoinPerformanceDetailsView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            bitcoinPerformanceDetailsView22.Content(bitcoinPerformanceDetailsViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            bitcoinPerformanceDetailsView22.Content(bitcoinPerformanceDetailsViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BitcoinPerformanceDetailsViewModel) obj, function1, gapComposer, 0);
    }
}
