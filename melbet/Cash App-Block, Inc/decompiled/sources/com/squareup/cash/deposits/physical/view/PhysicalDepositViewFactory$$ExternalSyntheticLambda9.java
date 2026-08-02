package com.squareup.cash.deposits.physical.view;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import com.fillr.s;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhysicalDepositViewFactory$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaperMoneyDepositBarcodeViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PhysicalDepositViewFactory$$ExternalSyntheticLambda9(PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = paperMoneyDepositBarcodeViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel;
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel2 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    s.PaperMoneyDepositBarcodeView(paperMoneyDepositBarcodeViewModel2, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                    int mo230roundToPx0680j_4 = ((Density) gapComposer2.consume(staticProvidableCompositionLocal)).mo230roundToPx0680j_4(50.0f);
                    gapComposer2.startReplaceGroup(-506224596);
                    int mo230roundToPx0680j_42 = ((Density) gapComposer2.consume(staticProvidableCompositionLocal)).mo230roundToPx0680j_4(((Configuration) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp * 0.75f);
                    gapComposer2.end(false);
                    Unit unit = Unit.INSTANCE;
                    PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel3 = this.f$0;
                    boolean changedInstance = gapComposer2.changedInstance(paperMoneyDepositBarcodeViewModel3);
                    Function1 function12 = this.f$1;
                    boolean changed = gapComposer2.changed(function12) | changedInstance | gapComposer2.changed(mo230roundToPx0680j_42) | gapComposer2.changed(mo230roundToPx0680j_4);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        paperMoneyDepositBarcodeViewModel = paperMoneyDepositBarcodeViewModel3;
                        MoneyTabUIKt$MoneyTabLoaded$1$1 moneyTabUIKt$MoneyTabLoaded$1$1 = new MoneyTabUIKt$MoneyTabLoaded$1$1(paperMoneyDepositBarcodeViewModel, function12, mo230roundToPx0680j_42, mo230roundToPx0680j_4, (Continuation) null);
                        gapComposer2.updateRememberedValue(moneyTabUIKt$MoneyTabLoaded$1$1);
                        rememberedValue = moneyTabUIKt$MoneyTabLoaded$1$1;
                    } else {
                        paperMoneyDepositBarcodeViewModel = paperMoneyDepositBarcodeViewModel3;
                    }
                    Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
                    SecureScreenKt.SecureScreen(true, gapComposer2, 6);
                    boolean z = paperMoneyDepositBarcodeViewModel instanceof PaperMoneyDepositBarcodeViewModel.Loading;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PasswordInfoQueries$$ExternalSyntheticLambda0(28);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Strings.LoadableFullScreenContent(paperMoneyDepositBarcodeViewModel, z, null, (Function1) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(-1467886163, new LocalViewFactory$$ExternalSyntheticLambda4(22, paperMoneyDepositBarcodeViewModel, function12), gapComposer2), gapComposer2, 199680, 20);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                s.PaperMoneyDepositBarcodeView(paperMoneyDepositBarcodeViewModel2, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                s.BarcodeSection(paperMoneyDepositBarcodeViewModel2, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PhysicalDepositViewFactory$$ExternalSyntheticLambda9(PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = paperMoneyDepositBarcodeViewModel;
        this.f$1 = function1;
    }
}
