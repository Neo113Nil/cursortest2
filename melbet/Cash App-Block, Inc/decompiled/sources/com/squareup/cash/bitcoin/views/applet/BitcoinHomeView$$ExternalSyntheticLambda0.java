package com.squareup.cash.bitcoin.views.applet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.account.components.AccountUiView;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinHomeView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccountUiView f$0;
    public final /* synthetic */ BitcoinHomeViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ BitcoinHomeView$$ExternalSyntheticLambda0(BitcoinHomeViewModel bitcoinHomeViewModel, Function1 function1, AccountUiView accountUiView) {
        this.$r8$classId = 1;
        this.f$1 = bitcoinHomeViewModel;
        this.f$2 = function1;
        this.f$0 = accountUiView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        BitcoinHomeViewModel bitcoinHomeViewModel = this.f$1;
        AccountUiView accountUiView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                accountUiView.Content(bitcoinHomeViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BitcoinHomeViewKt.BitcoinHomeContent(bitcoinHomeViewModel, function1, (zzc) accountUiView.elementBoundsRegistry, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                accountUiView.Content(bitcoinHomeViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinHomeView$$ExternalSyntheticLambda0(AccountUiView accountUiView, BitcoinHomeViewModel bitcoinHomeViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = accountUiView;
        this.f$1 = bitcoinHomeViewModel;
        this.f$2 = function1;
    }
}
