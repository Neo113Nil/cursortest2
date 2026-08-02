package com.squareup.cash.bitcoin.views.stablecoin;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda13;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.GetFlowLoadingViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda7;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda4;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class SendStablecoinViewKt {
    public static final ComposableLambdaImpl lambda$48401528 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(8), false, 48401528);
    public static final ComposableLambdaImpl lambda$1410083836 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(18), false, 1410083836);
    public static final ComposableLambdaImpl lambda$353661859 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(9), false, 353661859);
    public static final ComposableLambdaImpl lambda$1305933410 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(10), false, 1305933410);

    /* renamed from: lambda$-878268899, reason: not valid java name */
    public static final ComposableLambdaImpl f273lambda$878268899 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(19), false, -878268899);

    public static final void CopyButton(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-547110927);
        int i4 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        int i5 = 3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(419404448);
                Unit unit = Unit.INSTANCE;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 3);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(419482289);
                gapComposer.end(false);
            }
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                i2 = 419529285;
                i3 = R.string.stablecoin_deposit_copied_button;
            } else {
                i2 = 419610567;
                i3 = R.string.stablecoin_deposit_copy_button;
            }
            String m = re$$ExternalSyntheticOutline0.m(gapComposer, i2, i3, gapComposer, false);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = (i4 & 14) == 4;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda7(function0, mutableState, 2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            modifier2 = modifier;
            SizeKt.ButtonCta((Function0) rememberedValue3, modifier2, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-697826474, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(m, 23), gapComposer), gapComposer, (i4 & 112) | 1573248, 56);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function0, modifier2, i, i5);
        }
    }

    public static final void NetworkRowItem(final StablecoinDepositOptionsViewModel.NetworkRow networkRow, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1549684673);
        final int i2 = 2;
        int i3 = (gapComposer2.changedInstance(networkRow) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-10682275, new Function2() { // from class: com.squareup.cash.bitcoin.views.stablecoin.StablecoinDepositOptionsViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = r2;
                    StablecoinDepositOptionsViewModel.NetworkRow networkRow2 = networkRow;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(networkRow2.avatar, null, null, gapComposer3, 8, 3), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, networkRow2.network.truncatedAddress, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, networkRow2.network.chainName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1667688516, new Function2() { // from class: com.squareup.cash.bitcoin.views.stablecoin.StablecoinDepositOptionsViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i2;
                    StablecoinDepositOptionsViewModel.NetworkRow networkRow2 = networkRow;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(networkRow2.avatar, null, null, gapComposer3, 8, 3), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, networkRow2.network.truncatedAddress, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, networkRow2.network.chainName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i5 = (gapComposer2.changedInstance(networkRow) ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i5 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(7, function1, networkRow);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(1275175926, new Function2() { // from class: com.squareup.cash.bitcoin.views.stablecoin.StablecoinDepositOptionsViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i4;
                    StablecoinDepositOptionsViewModel.NetworkRow networkRow2 = networkRow;
                    switch (i52) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(networkRow2.avatar, null, null, gapComposer3, 8, 3), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, networkRow2.network.truncatedAddress, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, networkRow2.network.chainName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, null, 0L, null, gapComposer, 12582966, 0, 3956);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(networkRow, function1, i, 28);
        }
    }

    public static final void SendStablecoinContent(SendStablecoinModel.Content content, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1227626845);
        int i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = i2 | (gapComposer.changed(companion) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
            Money money = content.maxAmount;
            CurrencyCode currencyCode = money.currency_code;
            currencyCode.getClass();
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, Moneys.wholeDigits(money), 6);
            int i4 = i3 & 112;
            boolean changedInstance = (i4 == 32) | gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(rememberShaker);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new StartPoolAmountKt$$ExternalSyntheticLambda4(function1, realCashVibrator, rememberShaker, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, null, (Function1) rememberedValue, gapComposer, 2);
            boolean changed = gapComposer.changed(rememberAmountDisplayState) | gapComposer.changedInstance(content);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new SendStablecoinViewKt$SendStablecoinContent$1$1(rememberAmountDisplayState, content, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, money, (Function2) rememberedValue2);
            String str = content.restoreKeypadAmount;
            boolean changedInstance2 = gapComposer.changedInstance(content) | gapComposer.changed(rememberAmountDisplayState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj) {
                rememberedValue3 = new SendStablecoinViewKt$SendStablecoinContent$1$1(content, rememberAmountDisplayState, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue3);
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.send_stablecoin_title);
            BitcoinTransferViewModel.Content.Subtitle subtitle = new BitcoinTransferViewModel.Content.Subtitle(content.subtitle, null);
            BitcoinTransferViewModel.Content.FullScreenContent.NavigationIconType navigationIconType = BitcoinTransferViewModel.Content.FullScreenContent.NavigationIconType.CLOSE;
            BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent = new BitcoinTransferViewModel.Content.FullScreenContent(stringResource, subtitle, false, content.restoreKeypadAmount, content.maxAmount, "Send", content.buttonEnabled, content.hasInvalidAmount, BitcoinTransferViewModel.Content.FullScreenContent.NavigationIconType.CLOSE, null, (3328 & 2048) == 0);
            boolean z = i4 == 32;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z || rememberedValue4 == obj) {
                rememberedValue4 = new AvatarsKt$$ExternalSyntheticLambda1(20, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function1 function12 = (Function1) rememberedValue4;
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            if (content.showQrScannerButton) {
                gapComposer.startReplaceGroup(822670150);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1831190450, new SendStablecoinViewKt$$ExternalSyntheticLambda7(content, function1, 0), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda;
            } else {
                gapComposer.startReplaceGroup(823515861);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            BitcoinExchangeViewKt.BitcoinExchangeKeypadAmountPicker(fullScreenContent, rememberAmountDisplayState, rememberShaker, function12, layoutWeightElement, composableLambdaImpl, true, gapComposer, 1572864, 0);
            zzabx.ButtonDefaultGroupVertical(null, Expect_jvmKt.rememberComposableLambda(1292249111, new SendStablecoinViewKt$$ExternalSyntheticLambda7(content, function1, 2), gapComposer), gapComposer, 48, 1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(content, function1, i, 26);
        }
    }

    public static final void SendStablecoinView(SendStablecoinModel sendStablecoinModel, Function1 function1, RealCashVibrator realCashVibrator, Modifier modifier, Composer composer, int i) {
        int i2;
        sendStablecoinModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1577407297);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sendStablecoinModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Updater.CompositionLocalProvider(LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator), Expect_jvmKt.rememberComposableLambda(2662783, new SendStablecoinViewKt$$ExternalSyntheticLambda0(sendStablecoinModel, function1, i4), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2((Object) sendStablecoinModel, function1, (Object) realCashVibrator, modifier2, i, 15);
        }
    }

    public static final void StablecoinDepositContent(StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-159249532);
        int i4 = i | (gapComposer.changedInstance(stablecoinDepositViewModel$Loaded) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i6 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(modifier4, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.stablecoin_deposit_title);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1674433425, new BookletGridKt$$ExternalSyntheticLambda1(i6, function1), gapComposer), gapComposer, 1572912, 44);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z2 = stablecoinDepositViewModel$Loaded == null;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoveBitcoinViewKt$$ExternalSyntheticLambda3(6);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            int i7 = 199680 | (i3 & 14);
            Strings.LoadableFullScreenContent(stablecoinDepositViewModel$Loaded, z2, null, (Function1) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(-1723311302, new SetPinViewKt$$ExternalSyntheticLambda4(15, function1), gapComposer), gapComposer, i7, 20);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(stablecoinDepositViewModel$Loaded, function1, modifier3, i, i2, 22);
        }
    }

    public static final void StablecoinDepositCopyView(StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1688187570);
        int i2 = (gapComposer.changedInstance(stablecoinDepositCopyViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(420232903, new BitcoinUiFactory$$ExternalSyntheticLambda12(27, (Object) stablecoinDepositCopyViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(stablecoinDepositCopyViewModel, function1, i, 12);
        }
    }

    public static final void StablecoinDepositOptionsContent(Modifier modifier, StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Modifier modifier4;
        boolean z;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-13053638);
        Applier applier = gapComposer.applier;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        }
        int i5 = i3 | (gapComposer.changedInstance(stablecoinDepositOptionsViewModel) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i5;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier5 = i4 != 0 ? companion : modifier2;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier5, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (stablecoinDepositOptionsViewModel instanceof StablecoinDepositOptionsViewModel.Loading) {
                gapComposer.startReplaceGroup(1750602453);
                Modifier m279heightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m279heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 200.0f, RecyclerView.DECELERATION_RATE, 2);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z = true;
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
                modifier4 = modifier5;
            } else if (stablecoinDepositOptionsViewModel instanceof StablecoinDepositOptionsViewModel.Error) {
                gapComposer.startReplaceGroup(1750862977);
                Modifier m279heightInVpY3zN4$default2 = androidx.compose.foundation.layout.SizeKt.m279heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 200.0f, RecyclerView.DECELERATION_RATE, 2);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                modifier4 = modifier5;
                z = true;
                Countries.PageHeader(Room.stringResource(gapComposer, R.string.stablecoin_deposit_options_loading_error_title), (Modifier) null, lambda$1305933410, Room.stringResource(gapComposer, R.string.stablecoin_deposit_options_loading_error_subtitle), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
                gapComposer.end(true);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 32.0f));
                gapComposer.end(false);
            } else {
                modifier4 = modifier5;
                if (!(stablecoinDepositOptionsViewModel instanceof StablecoinDepositOptionsViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1883191884, false);
                }
                gapComposer.startReplaceGroup(1751730419);
                Transformations.SheetHeader(Room.stringResource(gapComposer, R.string.stablecoin_deposit_network_selection_title), (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
                Strings.getSizes(gapComposer).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 8.0f, gapComposer);
                Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                boolean changedInstance = gapComposer.changedInstance(stablecoinDepositOptionsViewModel) | ((i6 & 896) == 256);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BadgeQueries$$ExternalSyntheticLambda0(20, stablecoinDepositOptionsViewModel, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.LazyColumn(fillMaxWidth2, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 6, 510);
                String stringResource = Room.stringResource(gapComposer, R.string.stablecoin_deposit_network_selection_disclaimer);
                TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
                long j = Strings.getColors(gapComposer).semantic.text.subtle;
                Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                Strings.getSizes(gapComposer).getClass();
                Strings.getSizes(gapComposer).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(fillMaxWidth3, 16.0f, 16.0f), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                gapComposer.end(false);
                z = true;
            }
            gapComposer.end(z);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier3, stablecoinDepositOptionsViewModel, function1, i, i2, 21);
        }
    }

    public static final void StablecoinDepositOptionsView(StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel, Function1 function1, Composer composer, int i) {
        stablecoinDepositOptionsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1913268151);
        int i2 = (gapComposer.changedInstance(stablecoinDepositOptionsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(721511234, new BitcoinUiFactory$$ExternalSyntheticLambda13(function1, stablecoinDepositOptionsViewModel), gapComposer), gapComposer, 3072, 7);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function1, i);
        }
    }

    public static final void StablecoinDepositQrContent(StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Function1 function12;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(120907760);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(stablecoinDepositViewModel$Loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i4 = i3 & 112;
            StablecoinDepositsQrCode(stablecoinDepositViewModel$Loaded, function1, null, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            TextStyle textStyle = Strings.getTypography(gapComposer).helpText;
            String str = stablecoinDepositViewModel$Loaded.descriptionText;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3832, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonDropdown((Function0) rememberedValue, null, false, null, Expect_jvmKt.rememberComposableLambda(-526873570, new SsnViewKt$$ExternalSyntheticLambda2(stablecoinDepositViewModel$Loaded, 6), gapComposer), gapComposer, 24576, 14);
            DBUtil.SpacerWithinSectionMedium(0, 0, gapComposer, new LayoutWeightElement(1.0f, true));
            String str2 = stablecoinDepositViewModel$Loaded.disclaimerText;
            TextStyle textStyle2 = Strings.getTypography(gapComposer).bodyXSmall;
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f), textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(1846677368, new BrandSheetViewKt$$ExternalSyntheticLambda6(29, function12), gapComposer), gapComposer, 24960, 11);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StablecoinDepositViewKt$$ExternalSyntheticLambda13(stablecoinDepositViewModel$Loaded, function12, modifier2, i, 0);
        }
    }

    public static final void StablecoinDepositView(StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded, Function1 function1, RealCashScreenBrightness realCashScreenBrightness, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        stablecoinDepositViewModel$Loaded.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-908211080);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(stablecoinDepositViewModel$Loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realCashScreenBrightness) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean changedInstance = gapComposer.changedInstance(realCashScreenBrightness);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda0(realCashScreenBrightness, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(realCashScreenBrightness, (Function1) rememberedValue, gapComposer);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(27, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, ColorKt.Color(4280776138L)), null, null, Expect_jvmKt.rememberComposableLambda(-944153267, new BitcoinUiFactory$$ExternalSyntheticLambda12(stablecoinDepositViewModel$Loaded, function1), gapComposer), gapComposer, 3072, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2((Object) stablecoinDepositViewModel$Loaded, function1, (Object) realCashScreenBrightness, modifier2, i, 16);
        }
    }

    public static final void StablecoinDepositsQrCode(StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(703123577);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(stablecoinDepositViewModel$Loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), ColorsLightKt.colorsLight.semantic.background.f1047app, ColorKt.RectangleShape);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 2.0f, colors.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            QrCodeModel qrCodeModel = stablecoinDepositViewModel$Loaded.qrCodeModel;
            if (qrCodeModel.errorMessage != null) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
            long Color = ColorKt.Color(4280776138L);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32 ? true : z;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(23, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            if (i4 == 32) {
                z = true;
            }
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(24, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            BitcoinDepositsViewKt.m3415BitcoinDepositQrCodeRFMEUTM(qrCodeModel, function0, null, (Function0) rememberedValue2, z2, paddingValuesImpl, Color, gapComposer, 1572864, 4);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StablecoinDepositViewKt$$ExternalSyntheticLambda13(stablecoinDepositViewModel$Loaded, function1, modifier2, i, 1);
        }
    }

    public static final void StablecoinOnboardingView(StablecoinOnboardingViewModel stablecoinOnboardingViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        stablecoinOnboardingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1569263217);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(stablecoinOnboardingViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1346336454, new SetPinViewKt$$ExternalSyntheticLambda2(function1, stablecoinOnboardingViewModel), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) stablecoinOnboardingViewModel, function1, (Object) modifier2, i, 17);
        }
    }
}
