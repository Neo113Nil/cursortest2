package com.squareup.cash.bitcoin.views;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class BitcoinDisplayCurrencyView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinDisplayCurrencyView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final BitcoinDisplayCurrencyViewModel bitcoinDisplayCurrencyViewModel, final Function1 function1, Composer composer, final int i) {
        BitcoinDisplayCurrencyViewModel bitcoinDisplayCurrencyViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1814230799);
        int i3 = (gapComposer.changedInstance(bitcoinDisplayCurrencyViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            bitcoinDisplayCurrencyViewModel2 = bitcoinDisplayCurrencyViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (bitcoinDisplayCurrencyViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, bitcoinDisplayCurrencyViewModel, function1, i, i4) { // from class: com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ BitcoinDisplayCurrencyView f$0;
                        public final /* synthetic */ BitcoinDisplayCurrencyViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            BitcoinDisplayCurrencyViewModel bitcoinDisplayCurrencyViewModel3 = this.f$1;
                            BitcoinDisplayCurrencyView bitcoinDisplayCurrencyView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = BitcoinDisplayCurrencyView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    bitcoinDisplayCurrencyView.Content(bitcoinDisplayCurrencyViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    bitcoinDisplayCurrencyView.Content(bitcoinDisplayCurrencyViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            bitcoinDisplayCurrencyViewModel2 = bitcoinDisplayCurrencyViewModel;
            function12 = function1;
            i2 = i;
            BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyContent(bitcoinDisplayCurrencyViewModel2, function12, SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | (i3 & 112), 0);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final Function1 function13 = function12;
            final int i5 = 1;
            final int i6 = i2;
            final BitcoinDisplayCurrencyViewModel bitcoinDisplayCurrencyViewModel3 = bitcoinDisplayCurrencyViewModel2;
            endRestartGroup2.block = new Function2(this, bitcoinDisplayCurrencyViewModel3, function13, i6, i5) { // from class: com.squareup.cash.bitcoin.views.BitcoinDisplayCurrencyView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ BitcoinDisplayCurrencyView f$0;
                public final /* synthetic */ BitcoinDisplayCurrencyViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i5;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    BitcoinDisplayCurrencyViewModel bitcoinDisplayCurrencyViewModel32 = this.f$1;
                    BitcoinDisplayCurrencyView bitcoinDisplayCurrencyView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = BitcoinDisplayCurrencyView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            bitcoinDisplayCurrencyView.Content(bitcoinDisplayCurrencyViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            bitcoinDisplayCurrencyView.Content(bitcoinDisplayCurrencyViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BitcoinDisplayCurrencyViewModel) obj, function1, gapComposer, 0);
    }
}
