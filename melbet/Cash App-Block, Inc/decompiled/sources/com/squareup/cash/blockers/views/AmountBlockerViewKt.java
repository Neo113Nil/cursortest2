package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.CanvasKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.AuthorizeGooglePayViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.paychecks.views.EditDistributionViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes5.dex */
public abstract class AmountBlockerViewKt {

    /* renamed from: lambda$-405498555, reason: not valid java name */
    public static final ComposableLambdaImpl f295lambda$405498555 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(20), false, -405498555);

    /* renamed from: lambda$-993416860, reason: not valid java name */
    public static final ComposableLambdaImpl f308lambda$993416860 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(21), false, -993416860);
    public static final ComposableLambdaImpl lambda$1260875331 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(22), false, 1260875331);
    public static final ComposableLambdaImpl lambda$1826286098 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(23), false, 1826286098);

    /* renamed from: lambda$-566182688, reason: not valid java name */
    public static final ComposableLambdaImpl f302lambda$566182688 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(24), false, -566182688);
    public static final ComposableLambdaImpl lambda$1172722176 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(13), false, 1172722176);

    /* renamed from: lambda$-733370204, reason: not valid java name */
    public static final ComposableLambdaImpl f305lambda$733370204 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(14), false, -733370204);

    /* renamed from: lambda$-993692317, reason: not valid java name */
    public static final ComposableLambdaImpl f309lambda$993692317 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(25), false, -993692317);

    /* renamed from: lambda$-1427996988, reason: not valid java name */
    public static final ComposableLambdaImpl f278lambda$1427996988 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(26), false, -1427996988);

    /* renamed from: lambda$-2090056210, reason: not valid java name */
    public static final ComposableLambdaImpl f289lambda$2090056210 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(27), false, -2090056210);

    /* renamed from: lambda$-558046914, reason: not valid java name */
    public static final ComposableLambdaImpl f301lambda$558046914 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(28), false, -558046914);

    /* renamed from: lambda$-1952757406, reason: not valid java name */
    public static final ComposableLambdaImpl f287lambda$1952757406 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(15), false, -1952757406);
    public static final ComposableLambdaImpl lambda$1542495501 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(12), false, 1542495501);
    public static final ComposableLambdaImpl lambda$782992106 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(13), false, 782992106);
    public static final ComposableLambdaImpl lambda$452613526 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(14), false, 452613526);

    /* renamed from: lambda$-193527189, reason: not valid java name */
    public static final ComposableLambdaImpl f286lambda$193527189 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(15), false, -193527189);
    public static final ComposableLambdaImpl lambda$1092003529 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(3), false, 1092003529);
    public static final ComposableLambdaImpl lambda$1544419907 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(4), false, 1544419907);

    /* renamed from: lambda$-756629901, reason: not valid java name */
    public static final ComposableLambdaImpl f306lambda$756629901 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(5), false, -756629901);
    public static final ComposableLambdaImpl lambda$792315763 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda2(2), false, 792315763);

    /* renamed from: lambda$-1905264569, reason: not valid java name */
    public static final ComposableLambdaImpl f285lambda$1905264569 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(6), false, -1905264569);
    public static final ComposableLambdaImpl lambda$116971903 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(7), false, 116971903);
    public static final ComposableLambdaImpl lambda$1878529234 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(8), false, 1878529234);

    /* renamed from: lambda$-225288961, reason: not valid java name */
    public static final ComposableLambdaImpl f290lambda$225288961 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(9), false, -225288961);

    /* renamed from: lambda$-263663744, reason: not valid java name */
    public static final ComposableLambdaImpl f291lambda$263663744 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(10), false, -263663744);
    public static final ComposableLambdaImpl lambda$308346880 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(11), false, 308346880);

    /* renamed from: lambda$-327473385, reason: not valid java name */
    public static final ComposableLambdaImpl f292lambda$327473385 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(29), false, -327473385);

    /* renamed from: lambda$-548370955, reason: not valid java name */
    public static final ComposableLambdaImpl f299lambda$548370955 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(1), false, -548370955);
    public static final ComposableLambdaImpl lambda$526628579 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(2), false, 526628579);

    /* renamed from: lambda$-1674819175, reason: not valid java name */
    public static final ComposableLambdaImpl f283lambda$1674819175 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(3), false, -1674819175);
    public static final ComposableLambdaImpl lambda$768193632 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(4), false, 768193632);

    /* renamed from: lambda$-1439395119, reason: not valid java name */
    public static final ComposableLambdaImpl f279lambda$1439395119 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(5), false, -1439395119);

    /* renamed from: lambda$-1632918206, reason: not valid java name */
    public static final ComposableLambdaImpl f282lambda$1632918206 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(6), false, -1632918206);

    /* renamed from: lambda$-1326994823, reason: not valid java name */
    public static final ComposableLambdaImpl f277lambda$1326994823 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(7), false, -1326994823);

    /* renamed from: lambda$-147201544, reason: not valid java name */
    public static final ComposableLambdaImpl f281lambda$147201544 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(16), false, -147201544);

    /* renamed from: lambda$-55648866, reason: not valid java name */
    public static final ComposableLambdaImpl f300lambda$55648866 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(16), false, -55648866);

    /* renamed from: lambda$-438748398, reason: not valid java name */
    public static final ComposableLambdaImpl f296lambda$438748398 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(17), false, -438748398);

    /* renamed from: lambda$-455801754, reason: not valid java name */
    public static final ComposableLambdaImpl f297lambda$455801754 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(17), false, -455801754);

    /* renamed from: lambda$-145200446, reason: not valid java name */
    public static final ComposableLambdaImpl f280lambda$145200446 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(18), false, -145200446);

    /* renamed from: lambda$-1061895605, reason: not valid java name */
    public static final ComposableLambdaImpl f275lambda$1061895605 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(19), false, -1061895605);

    /* renamed from: lambda$-69483518, reason: not valid java name */
    public static final ComposableLambdaImpl f303lambda$69483518 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(20), false, -69483518);

    /* renamed from: lambda$-732949431, reason: not valid java name */
    public static final ComposableLambdaImpl f304lambda$732949431 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(21), false, -732949431);

    /* renamed from: lambda$-182588796, reason: not valid java name */
    public static final ComposableLambdaImpl f284lambda$182588796 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(8), false, -182588796);

    /* renamed from: lambda$-1955443415, reason: not valid java name */
    public static final ComposableLambdaImpl f288lambda$1955443415 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(9), false, -1955443415);
    public static final ComposableLambdaImpl lambda$665671972 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(10), false, 665671972);
    public static final ComposableLambdaImpl lambda$1465834798 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(11), false, 1465834798);
    public static final ComposableLambdaImpl lambda$1964991230 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(12), false, 1964991230);
    public static final ComposableLambdaImpl lambda$487618745 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(13), false, 487618745);
    public static final ComposableLambdaImpl lambda$1667681200 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(14), false, 1667681200);

    /* renamed from: lambda$-368426836, reason: not valid java name */
    public static final ComposableLambdaImpl f294lambda$368426836 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(15), false, -368426836);

    /* renamed from: lambda$-45792793, reason: not valid java name */
    public static final ComposableLambdaImpl f298lambda$45792793 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(16), false, -45792793);
    public static final ComposableLambdaImpl lambda$167891077 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(17), false, 167891077);
    public static final ComposableLambdaImpl lambda$1774753957 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(18), false, 1774753957);
    public static final ComposableLambdaImpl lambda$1495298163 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(19), false, 1495298163);

    /* renamed from: lambda$-1243213586, reason: not valid java name */
    public static final ComposableLambdaImpl f276lambda$1243213586 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(20), false, -1243213586);

    /* renamed from: lambda$-908864422, reason: not valid java name */
    public static final ComposableLambdaImpl f307lambda$908864422 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(22), false, -908864422);
    public static final ComposableLambdaImpl lambda$475824451 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(21), false, 475824451);

    /* renamed from: lambda$-348468184, reason: not valid java name */
    public static final ComposableLambdaImpl f293lambda$348468184 = new ComposableLambdaImpl(new ReferralCodeViewKt$$ExternalSyntheticLambda12(22), false, -348468184);

    public static final void AddMoneyBlockerView(final AddMoneyViewModel.Keypad keypad, final Function1 function1, final LocalizedMoneyFormatter.Factory factory, final RealCashVibrator realCashVibrator, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1901301142);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(keypad) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(factory) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else {
            if (keypad == null) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.blockers.views.AddMoneyBlockerViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    AmountBlockerViewKt.AddMoneyBlockerView(keypad, function1, factory, realCashVibrator, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    AmountBlockerViewKt.AddMoneyBlockerView(keypad, function1, factory, realCashVibrator, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = factory.createNoSymbolCompact();
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1380384949, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(keypad, function1, (MoneyFormatter) rememberedValue, realCashVibrator, 3), gapComposer2), gapComposer, 3072, 7);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            function2 = new Function2() { // from class: com.squareup.cash.blockers.views.AddMoneyBlockerViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    int i5 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            AmountBlockerViewKt.AddMoneyBlockerView(keypad, function1, factory, realCashVibrator, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            AmountBlockerViewKt.AddMoneyBlockerView(keypad, function1, factory, realCashVibrator, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void AmountBlocker(AmountPickerViewModel amountPickerViewModel, Function1 function1, RealCashVibrator realCashVibrator, AmountConfig amountConfig, Composer composer, int i) {
        int i2;
        amountPickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(347675205);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(amountPickerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer.changed(amountConfig) : gapComposer.changedInstance(amountConfig) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator), Expect_jvmKt.rememberComposableLambda(422444805, new BirthdayView$$ExternalSyntheticLambda0(amountPickerViewModel, amountConfig, function1, 4), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(amountPickerViewModel, function1, realCashVibrator, amountConfig, i, 18);
        }
    }

    public static final void ArcadeFilesetUploadErrorDialog(FilesetUploadErrorViewModel filesetUploadErrorViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        filesetUploadErrorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-23534603);
        int i2 = (gapComposer.changedInstance(filesetUploadErrorViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        boolean z = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-25849872, new BookletGridKt$$ExternalSyntheticLambda1(2, function1), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1632792174, new BorrowHomeKt$$ExternalSyntheticLambda0(function1, filesetUploadErrorViewModel, z, 10), gapComposer);
            Pair pair = filesetUploadErrorViewModel.showRetryButton ? new Pair(rememberComposableLambda, rememberComposableLambda2) : new Pair(rememberComposableLambda2, null);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1686706634, new BirthdayView$$ExternalSyntheticLambda0((Function3) pair.first, (Function3) pair.second, filesetUploadErrorViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) filesetUploadErrorViewModel, function1, (Object) modifier2, i, 20);
        }
    }

    public static final void ArcadeFilesetUploadLoadingDialog(int i, Composer composer, Modifier modifier, Function1 function1) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2103631938);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(629752979, new BalanceHomeViewKt$$ExternalSyntheticLambda12(27, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CanvasKt$$ExternalSyntheticLambda0(function1, modifier, i, 2);
        }
    }

    public static final void AtmPicker(AtmPickerAmountBlockerViewModel.AtmPicker atmPicker, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1442461265);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(atmPicker) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Transformations.SheetHeader(atmPicker.title, (Modifier) null, (Function2) null, atmPicker.subtitle, gapComposer2, 0, 6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            InputChipKt.InputChipGrid(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), 0, Expect_jvmKt.rememberComposableLambda(730429456, new BorrowHomeKt$$ExternalSyntheticLambda0(15, atmPicker, function1), gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Iterator it = atmPicker.options.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((AtmPickerAmountBlockerViewModel.AtmPicker.Option) it.next()).isSelected()) {
                    break;
                } else {
                    i3++;
                }
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth2, 16.0f, 16.0f);
            boolean z = i3 >= 0;
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean changed = gapComposer2.changed(i3) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i3, 5, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, m299paddingVpY3zN4, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-1113783508, new SsnViewKt$$ExternalSyntheticLambda2(atmPicker, 10), gapComposer2), gapComposer2, 1573248, 40);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) atmPicker, function1, (Object) modifier, i, 23);
        }
    }

    public static final void AtmPickerAmountBlocker(final AtmPickerAmountBlockerViewModel atmPickerAmountBlockerViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1861678282);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(atmPickerAmountBlockerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (atmPickerAmountBlockerViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2() { // from class: com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    AmountBlockerViewKt.AtmPickerAmountBlocker(atmPickerAmountBlockerViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    AmountBlockerViewKt.AtmPickerAmountBlocker(atmPickerAmountBlockerViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1773504575, new SetPinViewKt$$ExternalSyntheticLambda2(9, (Object) atmPickerAmountBlockerViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2() { // from class: com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            AmountBlockerViewKt.AtmPickerAmountBlocker(atmPickerAmountBlockerViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            AmountBlockerViewKt.AtmPickerAmountBlocker(atmPickerAmountBlockerViewModel, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void AuthorizeGooglePayView(AuthorizeGooglePayViewModel authorizeGooglePayViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        authorizeGooglePayViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1216862656);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(authorizeGooglePayViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1527561269, new SetPinViewKt$$ExternalSyntheticLambda2(10, (Object) authorizeGooglePayViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(authorizeGooglePayViewModel, function1, i, 3);
        }
    }

    public static final void Content(AtmPickerAmountBlockerViewModel atmPickerAmountBlockerViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(253252804);
        int i2 = (gapComposer.changedInstance(atmPickerAmountBlockerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i3 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (atmPickerAmountBlockerViewModel instanceof AtmPickerAmountBlockerViewModel.AtmPicker) {
            gapComposer.startReplaceGroup(-1603066998);
            Strings.m3984LoadableSheetContentosbwsH8(atmPickerAmountBlockerViewModel, ((AtmPickerAmountBlockerViewModel.AtmPicker) atmPickerAmountBlockerViewModel).isLoading, 400.0f, null, null, Expect_jvmKt.rememberComposableLambda(-1355392950, new EditDistributionViewKt$$ExternalSyntheticLambda0(i3, modifier, function1), gapComposer), gapComposer, (i2 & 14) | 196992, 24);
            gapComposer.end(false);
        } else {
            if (!(atmPickerAmountBlockerViewModel instanceof AtmPickerAmountBlockerViewModel.KeypadPicker)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1437186156, false);
            }
            gapComposer.startReplaceGroup(-1602836606);
            KeypadPicker((AtmPickerAmountBlockerViewModel.KeypadPicker) atmPickerAmountBlockerViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(modifier, atmPickerAmountBlockerViewModel, function1, i, 9);
        }
    }

    public static final void FilesetUpload(FilesetUploadViewModel filesetUploadViewModel, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        filesetUploadViewModel.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1071303344);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(filesetUploadViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-637983814, new BookletGridKt$$ExternalSyntheticLambda1(4, function1), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1670396631, new ArcadeFilesetUploadViewKt$$ExternalSyntheticLambda5(filesetUploadViewModel, function1, i3), gapComposer);
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(filesetUploadViewModel) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(4, filesetUploadViewModel, function0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScreenScaffoldKt.ScreenScaffoldLazy(m177backgroundbw27NRU, null, null, rememberComposableLambda, rememberComposableLambda2, (Function1) rememberedValue, gapComposer, 27648, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) filesetUploadViewModel, function1, (Object) function0, i, 21);
        }
    }

    public static final void FilesetUploadScreen(FilesetUploadViewModel filesetUploadViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        filesetUploadViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1072222874);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(filesetUploadViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(25, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            FilePickerContract filePickerContract = new FilePickerContract();
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AvatarsKt$$ExternalSyntheticLambda1(21, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ManagedActivityResultLauncher rememberLauncherForActivityResult = LinkScanner.rememberLauncherForActivityResult(filePickerContract, (Function1) rememberedValue2, gapComposer);
            boolean changedInstance = gapComposer.changedInstance(rememberLauncherForActivityResult) | (i3 == 32) | gapComposer.changedInstance(context);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(5, function1, rememberLauncherForActivityResult, context);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue3, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-489359505, new BirthdayView$$ExternalSyntheticLambda0(realImageLoader, filesetUploadViewModel, function1, 8), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) filesetUploadViewModel, function1, (Object) realImageLoader, i, 22);
        }
    }

    public static final void KeypadPicker(AtmPickerAmountBlockerViewModel.KeypadPicker keypadPicker, Function1 function1, Composer composer, int i) {
        int i2;
        AmountPickerViewModel ready;
        AmountPickerViewModel.Loading.AnimationDirection animationDirection;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-220857306);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(keypadPicker) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (keypadPicker.isLoading) {
                int ordinal = keypadPicker.animationDirection.ordinal();
                if (ordinal == 0) {
                    animationDirection = AmountPickerViewModel.Loading.AnimationDirection.FORWARD;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    animationDirection = AmountPickerViewModel.Loading.AnimationDirection.BACKWARD;
                }
                ready = new AmountPickerViewModel.Loading(animationDirection);
            } else {
                String str = keypadPicker.title;
                String str2 = keypadPicker.subtitle;
                String str3 = keypadPicker.buttonLabel;
                Money money = keypadPicker.minAmount;
                AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = money != null ? new AmountPickerViewModel.Ready.Amount.MoneyAmount(money) : null;
                Money money2 = keypadPicker.maxAmount;
                ready = new AmountPickerViewModel.Ready(str, str2, str3, moneyAmount, money2 != null ? new AmountPickerViewModel.Ready.Amount.MoneyAmount(money2) : null, false, null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), null, null, false, false, null, keypadPicker.hasRetreatAction ? AmountPickerViewModel.Ready.CloseAction.Back : AmountPickerViewModel.Ready.CloseAction.Close, 8032);
            }
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(CurrencyCode.USD, null, false, 0, 14);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AvatarsKt$$ExternalSyntheticLambda1(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TickersAmountCaptionKt.FullscreenAmountPicker(ready, moneyConfig, (Function1) rememberedValue, null, null, gapComposer, 64, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(keypadPicker, function1, i, 2);
        }
    }

    public static final void Thumbnail(String str, Composer composer, int i) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-178225242);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            str2 = str;
            AsyncImageKt.m1443SubcomposeAsyncImageQgsmV_s(str2, null, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), Alignment.Companion.Center, null, f278lambda$1427996988, gapComposer, (i2 & 14) | 1575984, 4016);
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str2, i, 9);
        }
    }

    public static final AmountConfig toAmountConfig(BlockersScreens.AmountScreen.Config config) {
        config.getClass();
        if (config instanceof BlockersScreens.AmountScreen.Config.MoneyConfig) {
            CurrencyCode currencyCode = ((BlockersScreens.AmountScreen.Config.MoneyConfig) config).minimumAmount.currency_code;
            currencyCode.getClass();
            return new AmountConfig.MoneyConfig(currencyCode, null, false, 6, 6);
        }
        if (config instanceof BlockersScreens.AmountScreen.Config.PercentConfig) {
            return new AmountConfig.PercentConfig(127);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
