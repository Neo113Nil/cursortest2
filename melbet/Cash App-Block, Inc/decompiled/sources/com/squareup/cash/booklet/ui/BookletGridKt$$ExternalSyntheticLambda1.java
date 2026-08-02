package com.squareup.cash.booklet.ui;

import android.icu.text.MessageFormat;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import coil3.size.SizeKt;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.viewmodels.ConfirmableOptionViewModel;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.blockers.views.ConfirmableOptionView;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.blockers.views.components.VerifyAliasViewKt;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.DisclosureView$$ExternalSyntheticLambda1;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultViewKt;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.CheckDepositAmountKt;
import com.squareup.cash.common.messaging.views.FailureMessageFullScreenViewKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.deposits.physical.view.map.ComposableSingletons$LimitReachedModalArcadeKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes5.dex */
public final /* synthetic */ class BookletGridKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BookletGridKt$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositEditPaycheckAllocationKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(Modifier.Companion.$$INSTANCE, 1.0f);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda2(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, buttonProminence, false, false, null, DirectDepositFormErrorKt.lambda$55952063, gapComposer, 1573248, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositManualFormCompletionKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            NavigationType navigationType = NavigationType.CLOSE;
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda2(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositManualFormCompletionKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj4) {
                rememberedValue = new EarningsHeaderKt$$ExternalSyntheticLambda2(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCta((Function0) rememberedValue, null, ButtonProminence.STANDARD, false, false, null, DirectDepositFormErrorKt.lambda$354236672, gapComposer, 1573248, 58);
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj4) {
                rememberedValue2 = new EarningsHeaderKt$$ExternalSyntheticLambda2(9, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SizeKt.ButtonCta((Function0) rememberedValue2, null, ButtonProminence.PROMINENT, false, false, null, DirectDepositFormErrorKt.lambda$801532791, gapComposer, 1573248, 58);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl rememberComposableLambda;
        int i = this.$r8$classId;
        int i2 = 20;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 12;
        int i4 = 18;
        int i5 = 17;
        Object obj4 = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                FlowRowScope flowRowScope = (FlowRowScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                flowRowScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(flowRowScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    RealBookletGridScope realBookletGridScope = new RealBookletGridScope(flowRowScope);
                    function1.invoke(realBookletGridScope);
                    realBookletGridScope.Content(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Icons icons = Icons.NavigationHelp;
                    String stringResource = Room.stringResource(gapComposer2, R.string.stablecoin_deposit_help);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(29, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer2, (intValue2 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean changed2 = gapComposer3.changed(function1);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(22, function1);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue2, null, false, AmountBlockerViewKt.f295lambda$405498555, gapComposer3, ((intValue3 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean changed3 = gapComposer4.changed(function1);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(24, function1);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue3, null, false, AmountBlockerViewKt.lambda$1826286098, gapComposer4, ((intValue4 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    NavigationType navigationType = NavigationType.CLOSE;
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    ComposableLambdaImpl composableLambdaImpl = AmountBlockerViewKt.lambda$1172722176;
                    boolean changed4 = gapComposer5.changed(function1);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue4 == obj4) {
                        rememberedValue4 = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(26, function1);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    DBUtil.TitleBarSub(composableLambdaImpl, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer5, 438, 104);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ConfirmableOptionViewModel confirmableOptionViewModel = (ConfirmableOptionViewModel) obj;
                Composer composer6 = (Composer) obj2;
                ((Integer) obj3).getClass();
                int i6 = ConfirmableOptionView.$r8$clinit;
                confirmableOptionViewModel.getClass();
                String str = confirmableOptionViewModel.title;
                String str2 = confirmableOptionViewModel.message;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(581065037, new BorrowHomeKt$$ExternalSyntheticLambda0(function1, confirmableOptionViewModel, false, i5), composer6);
                String str3 = confirmableOptionViewModel.negativeButtonText;
                if (str3 == null) {
                    GapComposer gapComposer6 = (GapComposer) composer6;
                    gapComposer6.startReplaceGroup(-2080764843);
                    gapComposer6.end(false);
                    rememberComposableLambda = null;
                } else {
                    GapComposer gapComposer7 = (GapComposer) composer6;
                    gapComposer7.startReplaceGroup(-2080764842);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1024186584, new TabContentViewKt$$ExternalSyntheticLambda11(function1, str3, i3), gapComposer7);
                    gapComposer7.end(false);
                }
                ModalKt.Modal((Modifier) null, str, str2, rememberComposableLambda2, rememberComposableLambda, (Function3) null, composer6, 3072, 33);
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed5 = gapComposer8.changed(function1);
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (changed5 || rememberedValue5 == obj4) {
                        rememberedValue5 = new CashtagViewKt$$ExternalSyntheticLambda6(9, function1);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, gapComposer8, 54, 108);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    NavigationType navigationType3 = NavigationType.CLOSE;
                    boolean changed6 = gapComposer9.changed(function1);
                    Object rememberedValue6 = gapComposer9.rememberedValue();
                    if (changed6 || rememberedValue6 == obj4) {
                        rememberedValue6 = new CashtagViewKt$$ExternalSyntheticLambda6(19, function1);
                        gapComposer9.updateRememberedValue(rememberedValue6);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue6, (Modifier) null, (Function3) null, gapComposer9, 54, 108);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed7 = gapComposer10.changed(function1);
                    Object rememberedValue7 = gapComposer10.rememberedValue();
                    if (changed7 || rememberedValue7 == obj4) {
                        rememberedValue7 = new CashtagViewKt$$ExternalSyntheticLambda6(20, function1);
                        gapComposer10.updateRememberedValue(rememberedValue7);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue7, fillMaxWidth2, buttonProminence, false, false, null, AmountBlockerViewKt.f282lambda$1632918206, gapComposer10, 1573296, 56);
                    Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed8 = gapComposer10.changed(function1);
                    Object rememberedValue8 = gapComposer10.rememberedValue();
                    if (changed8 || rememberedValue8 == obj4) {
                        rememberedValue8 = new CashtagViewKt$$ExternalSyntheticLambda6(21, function1);
                        gapComposer10.updateRememberedValue(rememberedValue8);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth3, buttonProminence, false, false, null, AmountBlockerViewKt.f277lambda$1326994823, gapComposer10, 1573296, 56);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer10).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    boolean changed9 = gapComposer11.changed(function1);
                    Object rememberedValue9 = gapComposer11.rememberedValue();
                    if (changed9 || rememberedValue9 == obj4) {
                        rememberedValue9 = new SsnViewKt$$ExternalSyntheticLambda14(15, function1);
                        gapComposer11.updateRememberedValue(rememberedValue9);
                    }
                    modalButtonScope3.PrimaryModalButton((Function0) rememberedValue9, null, false, AmountBlockerViewKt.lambda$1774753957, gapComposer11, ((intValue9 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    String format2 = new MessageFormat(Room.stringResource(gapComposer12, R.string.contacts_permissions_explanation_disclaimer)).format(zzel$EnumUnboxingLocalUtility.m(1, "privacy", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", Room.stringResource(gapComposer12, R.string.contacts_permissions_explanation_privacy_notice), "](ignored)")));
                    format2.getClass();
                    boolean changed10 = gapComposer12.changed(function1);
                    Object rememberedValue10 = gapComposer12.rememberedValue();
                    if (changed10 || rememberedValue10 == obj4) {
                        rememberedValue10 = new SsnViewKt$$ExternalSyntheticLambda12(6, function1);
                        gapComposer12.updateRememberedValue(rememberedValue10);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(format2, (Function2) rememberedValue10, null, null, 0L, null, null, null, 0, 0, 0, gapComposer12, 0, 2044);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed11 = gapComposer13.changed(function1);
                    Object rememberedValue11 = gapComposer13.rememberedValue();
                    if (changed11 || rememberedValue11 == obj4) {
                        rememberedValue11 = new SsnViewKt$$ExternalSyntheticLambda14(23, function1);
                        gapComposer13.updateRememberedValue(rememberedValue11);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue11, fillMaxWidth4, buttonProminence2, false, false, null, VerifyAliasViewKt.lambda$1482357128, gapComposer13, 1573296, 56);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer13).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    Icons icons2 = Icons.NavigationHelp;
                    String stringResource2 = Room.stringResource(gapComposer14, R.string.borrow_first_time_borrow_help);
                    boolean changed12 = gapComposer14.changed(function1);
                    Object rememberedValue12 = gapComposer14.rememberedValue();
                    if (changed12 || rememberedValue12 == obj4) {
                        rememberedValue12 = new BorrowHomeKt$$ExternalSyntheticLambda3(15, function1);
                        gapComposer14.updateRememberedValue(rememberedValue12);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons2, stringResource2, (Function0) rememberedValue12, null, null, null, null, null, null, false, gapComposer14, (intValue12 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    boolean changed13 = gapComposer15.changed(function1);
                    Object rememberedValue13 = gapComposer15.rememberedValue();
                    if (changed13 || rememberedValue13 == obj4) {
                        rememberedValue13 = new DisclosureView$$ExternalSyntheticLambda1(8, function1);
                        gapComposer15.updateRememberedValue(rememberedValue13);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue13, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), null, true, false, null, CanvasKt.f338lambda$452100298, gapComposer15, 1575984, 52);
                    boolean changed14 = gapComposer15.changed(function1);
                    Object rememberedValue14 = gapComposer15.rememberedValue();
                    if (changed14 || rememberedValue14 == obj4) {
                        rememberedValue14 = new DisclosureView$$ExternalSyntheticLambda1(9, function1);
                        gapComposer15.updateRememberedValue(rememberedValue14);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue14, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, CanvasKt.f341lambda$792430241, gapComposer15, 1572912, 60);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    NavigationType navigationType4 = NavigationType.BACK;
                    boolean changed15 = gapComposer16.changed(function1);
                    Object rememberedValue15 = gapComposer16.rememberedValue();
                    if (changed15 || rememberedValue15 == obj4) {
                        rememberedValue15 = new GrantSheetKt$$ExternalSyntheticLambda4(12, function1);
                        gapComposer16.updateRememberedValue(rememberedValue15);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType4, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue15, (Modifier) null, (Function3) null, gapComposer16, 54, 108);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    NavigationType navigationType5 = NavigationType.BACK;
                    boolean changed16 = gapComposer17.changed(function1);
                    Object rememberedValue16 = gapComposer17.rememberedValue();
                    if (changed16 || rememberedValue16 == obj4) {
                        rememberedValue16 = new GrantSheetKt$$ExternalSyntheticLambda4(14, function1);
                        gapComposer17.updateRememberedValue(rememberedValue16);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType5, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue16, (Modifier) null, (Function3) null, gapComposer17, 54, 108);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer17).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    boolean changed17 = gapComposer18.changed(function1);
                    Object rememberedValue17 = gapComposer18.rememberedValue();
                    if (changed17 || rememberedValue17 == obj4) {
                        rememberedValue17 = new GrantSheetKt$$ExternalSyntheticLambda4(17, function1);
                        gapComposer18.updateRememberedValue(rememberedValue17);
                    }
                    modalButtonScope4.SecondaryModalButton((Function0) rememberedValue17, null, false, UnlinkResultViewKt.f350lambda$864064098, gapComposer18, ((intValue16 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ModalButtonScope modalButtonScope5 = (ModalButtonScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                modalButtonScope5.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer18).changed(modalButtonScope5) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    boolean changed18 = gapComposer19.changed(function1);
                    Object rememberedValue18 = gapComposer19.rememberedValue();
                    if (changed18 || rememberedValue18 == obj4) {
                        rememberedValue18 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(2, function1);
                        gapComposer19.updateRememberedValue(rememberedValue18);
                    }
                    modalButtonScope5.PrimaryModalButton((Function0) rememberedValue18, null, false, CheckDepositAmountKt.lambda$1942677034, gapComposer19, ((intValue17 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ModalButtonScope modalButtonScope6 = (ModalButtonScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                modalButtonScope6.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer19).changed(modalButtonScope6) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    boolean changed19 = gapComposer20.changed(function1);
                    Object rememberedValue19 = gapComposer20.rememberedValue();
                    if (changed19 || rememberedValue19 == obj4) {
                        rememberedValue19 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(1, function1);
                        gapComposer20.updateRememberedValue(rememberedValue19);
                    }
                    modalButtonScope6.SecondaryModalButton((Function0) rememberedValue19, null, false, CheckDepositAmountKt.lambda$652528663, gapComposer20, ((intValue18 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer20 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1943734599, new BookletGridKt$$ExternalSyntheticLambda1(i2, function1), gapComposer21), (Composer) gapComposer21, 196614, 30);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer21 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ModalKt.Modal((Modifier) null, Room.stringResource(composer21, R.string.capture_check_face_permission_dialog_title), Room.stringResource(composer21, R.string.capture_check_face_permission_dialog_body), Expect_jvmKt.rememberComposableLambda(528681493, new BookletGridKt$$ExternalSyntheticLambda1(i5, function1), composer21), Expect_jvmKt.rememberComposableLambda(357842036, new BookletGridKt$$ExternalSyntheticLambda1(i4, function1), composer21), (Function3) null, composer21, 27648, 33);
                return Unit.INSTANCE;
            case 21:
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer22 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer22).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    Icons icons3 = Icons.NavigationClose;
                    String stringResource3 = Room.stringResource(gapComposer22, R.string.close);
                    boolean changed20 = gapComposer22.changed(function1);
                    Object rememberedValue20 = gapComposer22.rememberedValue();
                    if (changed20 || rememberedValue20 == obj4) {
                        rememberedValue20 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(13, function1);
                        gapComposer22.updateRememberedValue(rememberedValue20);
                    }
                    TransactorKt.IconAction(titleBarActionScope3, icons3, stringResource3, (Function0) rememberedValue20, null, null, null, null, null, null, false, gapComposer22, (intValue20 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer23 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed21 = gapComposer23.changed(function1);
                    Object rememberedValue21 = gapComposer23.rememberedValue();
                    if (changed21 || rememberedValue21 == obj4) {
                        rememberedValue21 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(19, function1);
                        gapComposer23.updateRememberedValue(rememberedValue21);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue21, fillMaxWidth5, buttonProminence3, false, false, null, FailureMessageFullScreenViewKt.f362lambda$743144674, gapComposer23, 1573296, 56);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                TitleBarActionScope titleBarActionScope4 = (TitleBarActionScope) obj;
                Composer composer24 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                titleBarActionScope4.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((GapComposer) composer24).changed(titleBarActionScope4) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                    String stringResource4 = Room.stringResource(gapComposer24, R.string.withdrawal_search_description);
                    Icons icons4 = Icons.Search24;
                    boolean changed22 = gapComposer24.changed(function1);
                    Object rememberedValue22 = gapComposer24.rememberedValue();
                    if (changed22 || rememberedValue22 == obj4) {
                        rememberedValue22 = new ComposeDialogKt$$ExternalSyntheticLambda4(16, function1);
                        gapComposer24.updateRememberedValue(rememberedValue22);
                    }
                    TransactorKt.IconAction(titleBarActionScope4, icons4, stringResource4, (Function0) rememberedValue22, null, null, null, null, null, null, false, gapComposer24, (intValue22 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ModalButtonScope modalButtonScope7 = (ModalButtonScope) obj;
                Composer composer25 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                modalButtonScope7.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((GapComposer) composer25).changed(modalButtonScope7) ? 4 : 2;
                }
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue23 & 1, (intValue23 & 19) != 18)) {
                    boolean changed23 = gapComposer25.changed(function1);
                    Object rememberedValue23 = gapComposer25.rememberedValue();
                    if (changed23 || rememberedValue23 == obj4) {
                        rememberedValue23 = new ComposeDialogKt$$ExternalSyntheticLambda4(20, function1);
                        gapComposer25.updateRememberedValue(rememberedValue23);
                    }
                    modalButtonScope7.SecondaryModalButton((Function0) rememberedValue23, null, false, ComposableSingletons$LimitReachedModalArcadeKt.lambda$957657640, gapComposer25, ((intValue23 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer26 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    NavigationType navigationType6 = NavigationType.CLOSE;
                    boolean changed24 = gapComposer26.changed(function1);
                    Object rememberedValue24 = gapComposer26.rememberedValue();
                    if (changed24 || rememberedValue24 == obj4) {
                        rememberedValue24 = new EarningsHeaderKt$$ExternalSyntheticLambda2(7, function1);
                        gapComposer26.updateRememberedValue(rememberedValue24);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType6, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue24, (Modifier) null, (Function3) null, gapComposer26, 54, 108);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositEditPaycheckAllocationKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositManualFormCompletionKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$directdeposit$views$directdeposit$DirectDepositManualFormCompletionKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            default:
                Composer composer27 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    NavigationType navigationType7 = NavigationType.CLOSE;
                    boolean changed25 = gapComposer27.changed(function1);
                    Object rememberedValue25 = gapComposer27.rememberedValue();
                    if (changed25 || rememberedValue25 == obj4) {
                        rememberedValue25 = new EarningsHeaderKt$$ExternalSyntheticLambda2(18, function1);
                        gapComposer27.updateRememberedValue(rememberedValue25);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType7, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue25, (Modifier) null, (Function3) null, gapComposer27, 54, 108);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
