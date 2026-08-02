package com.squareup.cash.pdf.view;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.viewmodels.PaymentClaimViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.pools.viewmodels.FailureDialogViewModel;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.ErrorViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class PdfPreviewViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ PdfPreviewViewKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$profile$devicemanager$views$DeviceRemovalFailedViewKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj4) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, DeviceManagerListViewKt.lambda$1076069360, gapComposer, 1572912, 60);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj4) {
                rememberedValue2 = new ErrorViewKt$$ExternalSyntheticLambda4(19, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence, false, false, null, DeviceManagerListViewKt.lambda$821332313, gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$ConfirmSignOutDialogKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, BadgeNameKt.lambda$1614831592, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$ConfirmSignOutDialogKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.SecondaryModalButton((Function0) rememberedValue, null, false, BadgeNameKt.f595lambda$656254315, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$ErrorViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, BadgeNameKt.lambda$808694203, gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$ProfileConfirmRemoveAliasDialogKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButtonDestructive(((intValue << 12) & 57344) | 3072, 6, gapComposer, BadgeNameKt.f592lambda$261596534, null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 15;
        int i3 = 13;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i4 = 2;
        Object obj4 = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Icons icons = Icons.Download24;
                    String stringResource = Room.stringResource(gapComposer, R.string.download);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(6, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    int i5 = (intValue & 14) | 48;
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, i5, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    Icons icons2 = Icons.NavigationShareAndroid;
                    String stringResource2 = Room.stringResource(gapComposer, R.string.share);
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new PdfPreviewView$$ExternalSyntheticLambda0(7, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons2, stringResource2, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer, i5, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PaymentClaimViewModel paymentClaimViewModel = (PaymentClaimViewModel) obj;
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                paymentClaimViewModel.getClass();
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                GapComposer gapComposer2 = (GapComposer) composer2;
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer2, fillMaxSize);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(composer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                boolean z = paymentClaimViewModel instanceof PaymentClaimViewModel.Initial;
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (z) {
                    gapComposer3.startReplaceGroup(-1127152557);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2808, 0L, composer2, boxScopeInstance.align(companion, biasAlignment), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, new TextLineBalancing(1), ((PaymentClaimViewModel.Initial) paymentClaimViewModel).messageText, (Map) null, (Function1) null, false);
                    DimensionKt.ButtonCtaGroup(boxScopeInstance.align(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.BottomCenter), true, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(1138443191, new PdfPreviewViewKt$$ExternalSyntheticLambda4(i4, function1), composer2), composer2, 25008, 8);
                    gapComposer3.end(false);
                } else {
                    if (!paymentClaimViewModel.equals(PaymentClaimViewModel.Loading.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1144739453, false);
                    }
                    gapComposer3.startReplaceGroup(-1126086498);
                    ProgressCircularKt.ProgressCircular(0, 0, composer2, boxScopeInstance.align(companion, biasAlignment));
                    gapComposer3.end(false);
                }
                gapComposer3.end(true);
                return Unit.INSTANCE;
            case 2:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer3).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed3 = gapComposer4.changed(function1);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new HomeViewKt$$ExternalSyntheticLambda8(27, function1);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, horizontalWeight, buttonProminence, false, false, null, QuickPayViewKt.lambda$1801957212, gapComposer4, 1573248, 56);
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue4 == obj4) {
                        rememberedValue4 = new HomeViewKt$$ExternalSyntheticLambda8(28, function1);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, horizontalWeight2, buttonProminence, false, false, null, QuickPayViewKt.lambda$1123264211, gapComposer4, 1573248, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed5 = gapComposer5.changed(function1);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue5 == obj4) {
                        rememberedValue5 = new WarningDialogViewKt$$ExternalSyntheticLambda5(22, function1);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, gapComposer5, 54, 108);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                AdaptiveStackScope adaptiveStackScope2 = (AdaptiveStackScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                adaptiveStackScope2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer5).changed(adaptiveStackScope2) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier horizontalWeight3 = adaptiveStackScope2.horizontalWeight(companion, 1.0f);
                    boolean changed6 = gapComposer6.changed(function1);
                    Object rememberedValue6 = gapComposer6.rememberedValue();
                    if (changed6 || rememberedValue6 == obj4) {
                        rememberedValue6 = new ActionMenuKt$$ExternalSyntheticLambda0(2, function1);
                        gapComposer6.updateRememberedValue(rememberedValue6);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue6, horizontalWeight3, buttonProminence2, false, false, null, NearbyPayRequestViewKt.f561lambda$986712738, gapComposer6, 1573248, 56);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer6).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    String stringResource3 = Room.stringResource(gapComposer7, R.string.nearby_pay_request_info);
                    Object stringResource4 = Room.stringResource(gapComposer7, R.string.nearby_pay_request_info_click_label);
                    Icons icons3 = Icons.InformationOutline24;
                    boolean changed7 = gapComposer7.changed(function1);
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (changed7 || rememberedValue7 == obj4) {
                        rememberedValue7 = new ActionMenuKt$$ExternalSyntheticLambda0(3, function1);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function0 = (Function0) rememberedValue7;
                    Modifier testTag = TestTagKt.testTag(companion, "nearby_payment_info_button");
                    boolean changed8 = gapComposer7.changed(stringResource3) | gapComposer7.changed(stringResource4) | gapComposer7.changed(function1);
                    Object rememberedValue8 = gapComposer7.rememberedValue();
                    if (changed8 || rememberedValue8 == obj4) {
                        rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda39(26, stringResource3, stringResource4, function1);
                        gapComposer7.updateRememberedValue(rememberedValue8);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons3, stringResource3, function0, SemanticsModifierKt.clearAndSetSemantics(testTag, (Function1) rememberedValue8), null, null, null, null, null, false, gapComposer7, (intValue5 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer7).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    Icons icons4 = Icons.InformationOutline24;
                    String stringResource5 = Room.stringResource(gapComposer8, R.string.nearby_pay_request_info);
                    boolean changed9 = gapComposer8.changed(function1);
                    Object rememberedValue9 = gapComposer8.rememberedValue();
                    if (changed9 || rememberedValue9 == obj4) {
                        rememberedValue9 = new ActionMenuKt$$ExternalSyntheticLambda0(9, function1);
                        gapComposer8.updateRememberedValue(rememberedValue9);
                    }
                    TransactorKt.IconAction(titleBarActionScope3, icons4, stringResource5, (Function0) rememberedValue9, null, null, null, null, null, null, false, gapComposer8, (intValue6 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
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
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed10 = gapComposer9.changed(function1);
                    Object rememberedValue10 = gapComposer9.rememberedValue();
                    if (changed10 || rememberedValue10 == obj4) {
                        rememberedValue10 = new ActionMenuKt$$ExternalSyntheticLambda0(13, function1);
                        gapComposer9.updateRememberedValue(rememberedValue10);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue10, (Modifier) null, (Function3) null, gapComposer9, 54, 108);
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
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    boolean changed11 = gapComposer10.changed(function1);
                    Object rememberedValue11 = gapComposer10.rememberedValue();
                    if (changed11 || rememberedValue11 == obj4) {
                        rememberedValue11 = new PdfPreviewView$$ExternalSyntheticLambda0(15, function1);
                        gapComposer10.updateRememberedValue(rememberedValue11);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue11, null, buttonProminence3, false, false, null, PhonePlansHomeViewKt.f566lambda$893743236, gapComposer10, 1573248, 58);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                TitleBarActionScope titleBarActionScope4 = (TitleBarActionScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                titleBarActionScope4.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer10).changed(titleBarActionScope4) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    Icons icons5 = Icons.NavigationHelp;
                    String stringResource6 = Room.stringResource(gapComposer11, R.string.blockers_help);
                    boolean changed12 = gapComposer11.changed(function1);
                    Object rememberedValue12 = gapComposer11.rememberedValue();
                    if (changed12 || rememberedValue12 == obj4) {
                        rememberedValue12 = new PdfPreviewView$$ExternalSyntheticLambda0(17, function1);
                        gapComposer11.updateRememberedValue(rememberedValue12);
                    }
                    TransactorKt.IconAction(titleBarActionScope4, icons5, stringResource6, (Function0) rememberedValue12, null, null, null, null, null, null, false, gapComposer11, (intValue9 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    boolean changed13 = gapComposer12.changed(function1);
                    Object rememberedValue13 = gapComposer12.rememberedValue();
                    if (changed13 || rememberedValue13 == obj4) {
                        rememberedValue13 = new PdfPreviewView$$ExternalSyntheticLambda0(27, function1);
                        gapComposer12.updateRememberedValue(rememberedValue13);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue13, null, null, false, false, null, PoolToastKt.lambda$1799357971, gapComposer12, 1572864, 62);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    boolean changed14 = gapComposer13.changed(function1);
                    Object rememberedValue14 = gapComposer13.rememberedValue();
                    if (changed14 || rememberedValue14 == obj4) {
                        rememberedValue14 = new PoolsListViewKt$$ExternalSyntheticLambda3(12, function1);
                        gapComposer13.updateRememberedValue(rememberedValue14);
                    }
                    SyncContactsRowKt.SyncContactsCard(0, 14, gapComposer13, null, null, null, (Function0) rememberedValue14);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    boolean changed15 = gapComposer14.changed(function1);
                    Object rememberedValue15 = gapComposer14.rememberedValue();
                    if (changed15 || rememberedValue15 == obj4) {
                        rememberedValue15 = new PoolsListViewKt$$ExternalSyntheticLambda3(13, function1);
                        gapComposer14.updateRememberedValue(rememberedValue15);
                    }
                    Function0 function02 = (Function0) rememberedValue15;
                    boolean changed16 = gapComposer14.changed(function1);
                    Object rememberedValue16 = gapComposer14.rememberedValue();
                    if (changed16 || rememberedValue16 == obj4) {
                        rememberedValue16 = new PoolsListViewKt$$ExternalSyntheticLambda3(14, function1);
                        gapComposer14.updateRememberedValue(rememberedValue16);
                    }
                    PoolToastKt.SharePoolSection(0, gapComposer14, null, function02, (Function0) rememberedValue16);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer14).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    boolean changed17 = gapComposer15.changed(function1);
                    Object rememberedValue17 = gapComposer15.rememberedValue();
                    if (changed17 || rememberedValue17 == obj4) {
                        rememberedValue17 = new PoolsListViewKt$$ExternalSyntheticLambda3(17, function1);
                        gapComposer15.updateRememberedValue(rememberedValue17);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue17, null, false, PoolToastKt.f573lambda$2095411590, gapComposer15, ((intValue13 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                FailureDialogViewModel failureDialogViewModel = (FailureDialogViewModel) obj;
                Composer composer15 = (Composer) obj2;
                ((Integer) obj3).getClass();
                failureDialogViewModel.getClass();
                ModalKt.Modal((Modifier) null, failureDialogViewModel.title, failureDialogViewModel.subtitle, Expect_jvmKt.rememberComposableLambda(-1890271387, new PdfPreviewViewKt$$ExternalSyntheticLambda4(i3, function1), composer15), (Function3) null, (Function3) null, composer15, 3072, 49);
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    boolean changed18 = gapComposer16.changed(function1);
                    Object rememberedValue18 = gapComposer16.rememberedValue();
                    if (changed18 || rememberedValue18 == obj4) {
                        rememberedValue18 = new PoolsListViewKt$$ExternalSyntheticLambda3(23, function1);
                        gapComposer16.updateRememberedValue(rememberedValue18);
                    }
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue18, null, buttonProminence4, false, false, null, PoolToastKt.lambda$1800749899, gapComposer16, 1573248, 58);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                TitleBarActionScope titleBarActionScope5 = (TitleBarActionScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                titleBarActionScope5.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer17).changed(titleBarActionScope5) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    TransactorKt.CustomAction(titleBarActionScope5, null, null, Expect_jvmKt.rememberComposableLambda(53054275, new PdfPreviewViewKt$$ExternalSyntheticLambda4(i2, function1), gapComposer17), gapComposer17, (intValue15 & 14) | 3072, 3);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                PrepurchaseCashCardPlanningViewModel.LoadableText loadableText = (PrepurchaseCashCardPlanningViewModel.LoadableText) obj;
                Composer composer18 = (Composer) obj2;
                ((Integer) obj3).getClass();
                loadableText.getClass();
                if (loadableText instanceof PrepurchaseCashCardPlanningViewModel.LoadableText.Loaded) {
                    GapComposer gapComposer18 = (GapComposer) composer18;
                    gapComposer18.startReplaceGroup(-1223488133);
                    String str = ((PrepurchaseCashCardPlanningViewModel.LoadableText.Loaded) loadableText).text;
                    boolean changed19 = gapComposer18.changed(function1);
                    Object rememberedValue19 = gapComposer18.rememberedValue();
                    if (changed19 || rememberedValue19 == obj4) {
                        rememberedValue19 = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, r7, i3);
                        gapComposer18.updateRememberedValue(rememberedValue19);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue19, null, null, 0L, null, null, null, 0, 0, 0, gapComposer18, 0, 2044);
                    gapComposer18.end(false);
                } else {
                    if (!(loadableText instanceof PrepurchaseCashCardPlanningViewModel.LoadableText.Loading)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer18, -1223490700, false);
                    }
                    GapComposer gapComposer19 = (GapComposer) composer18;
                    gapComposer19.startReplaceGroup(-1223479432);
                    LocaleToggleKt.LoadingTextShimmerBox(30, null, null, gapComposer19, 6, 6);
                    gapComposer19.end(false);
                }
                return Unit.INSTANCE;
            case 18:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer19).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    boolean changed20 = gapComposer20.changed(function1);
                    Object rememberedValue20 = gapComposer20.rememberedValue();
                    if (changed20 || rememberedValue20 == obj4) {
                        rememberedValue20 = new ErrorViewKt$$ExternalSyntheticLambda4(2, function1);
                        gapComposer20.updateRememberedValue(rememberedValue20);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue20, null, false, DeviceManagerListViewKt.lambda$68369613, gapComposer20, ((intValue16 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer20 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer20).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    boolean changed21 = gapComposer21.changed(function1);
                    Object rememberedValue21 = gapComposer21.rememberedValue();
                    if (changed21 || rememberedValue21 == obj4) {
                        rememberedValue21 = new ErrorViewKt$$ExternalSyntheticLambda4(3, function1);
                        gapComposer21.updateRememberedValue(rememberedValue21);
                    }
                    modalButtonScope3.SecondaryModalButton((Function0) rememberedValue21, null, false, DeviceManagerListViewKt.lambda$1918326906, gapComposer21, ((intValue17 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer21 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    ButtonProminence buttonProminence5 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed22 = gapComposer22.changed(function1);
                    Object rememberedValue22 = gapComposer22.rememberedValue();
                    if (changed22 || rememberedValue22 == obj4) {
                        rememberedValue22 = new ErrorViewKt$$ExternalSyntheticLambda4(4, function1);
                        gapComposer22.updateRememberedValue(rememberedValue22);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue22, fillMaxWidth, buttonProminence5, true, false, null, DeviceManagerListViewKt.lambda$1700539183, gapComposer22, 1576368, 48);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer22 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    ButtonProminence buttonProminence6 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed23 = gapComposer23.changed(function1);
                    Object rememberedValue23 = gapComposer23.rememberedValue();
                    if (changed23 || rememberedValue23 == obj4) {
                        rememberedValue23 = new ErrorViewKt$$ExternalSyntheticLambda4(10, function1);
                        gapComposer23.updateRememberedValue(rememberedValue23);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue23, fillMaxWidth2, buttonProminence6, false, false, null, DeviceManagerListViewKt.lambda$1951658004, gapComposer23, 1573296, 56);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer23 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    ButtonProminence buttonProminence7 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed24 = gapComposer24.changed(function1);
                    Object rememberedValue24 = gapComposer24.rememberedValue();
                    if (changed24 || rememberedValue24 == obj4) {
                        rememberedValue24 = new ErrorViewKt$$ExternalSyntheticLambda4(12, function1);
                        gapComposer24.updateRememberedValue(rememberedValue24);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue24, fillMaxWidth3, buttonProminence7, false, false, null, DeviceManagerListViewKt.lambda$1685271335, gapComposer24, 1573296, 56);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer24 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer24;
                if (gapComposer25.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed25 = gapComposer25.changed(function1);
                    Object rememberedValue25 = gapComposer25.rememberedValue();
                    if (changed25 || rememberedValue25 == obj4) {
                        rememberedValue25 = new ErrorViewKt$$ExternalSyntheticLambda4(20, function1);
                        gapComposer25.updateRememberedValue(rememberedValue25);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue25, fillMaxWidth4, null, false, false, null, DeviceManagerListViewKt.f580lambda$1468153828, gapComposer25, 1572912, 60);
                    ButtonProminence buttonProminence8 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed26 = gapComposer25.changed(function1);
                    Object rememberedValue26 = gapComposer25.rememberedValue();
                    if (changed26 || rememberedValue26 == obj4) {
                        rememberedValue26 = new ErrorViewKt$$ExternalSyntheticLambda4(21, function1);
                        gapComposer25.updateRememberedValue(rememberedValue26);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue26, fillMaxWidth5, buttonProminence8, false, false, null, DeviceManagerListViewKt.f579lambda$1192175341, gapComposer25, 1573296, 56);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                return invoke$com$squareup$cash$profile$devicemanager$views$DeviceRemovalFailedViewKt$$ExternalSyntheticLambda9(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$profile$views$ConfirmSignOutDialogKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$profile$views$ConfirmSignOutDialogKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$profile$views$ErrorViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$profile$views$ProfileConfirmRemoveAliasDialogKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer25 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((GapComposer) composer25).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer26 = (GapComposer) composer25;
                if (gapComposer26.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                    boolean changed27 = gapComposer26.changed(function1);
                    Object rememberedValue27 = gapComposer26.rememberedValue();
                    if (changed27 || rememberedValue27 == obj4) {
                        rememberedValue27 = new ProfileKt$$ExternalSyntheticLambda0(6, function1);
                        gapComposer26.updateRememberedValue(rememberedValue27);
                    }
                    modalButtonScope4.SecondaryModalButton((Function0) rememberedValue27, null, false, BadgeNameKt.f598lambda$911593955, gapComposer26, ((intValue22 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
