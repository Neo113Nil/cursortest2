package com.squareup.cash.bitcoin.views.applet.stackingtools;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinStackingToolsInfoViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BitcoinStackingToolsInfoViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ BitcoinStackingToolsInfoViewKt$$ExternalSyntheticLambda1(BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = bitcoinStackingToolsInfoViewModel;
        this.f$1 = function1;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$2;
        Function1 function1 = this.f$1;
        BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BitmapPainterKt.BitcoinStackingToolsInfoViewContent(bitcoinStackingToolsInfoViewModel, function1, modifier, composer, Updater.updateChangedFlags(1));
                break;
            default:
                BitmapPainterKt.StackingToolsInfoContent(bitcoinStackingToolsInfoViewModel, function1, modifier, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
