package com.squareup.cash.sheet;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.DialogProperties;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.TransactionCallbacks;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.securityhub.viewmodels.BookletFeatureCardViewModel;
import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.ProtectionsSectionUiModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideSectionViewModel;
import com.squareup.cash.securityhub.views.EducationCardKt;
import com.squareup.cash.securityhub.views.ProtectionsSectionKt;
import com.squareup.cash.securityhub.views.RecoveryGuideViewKt;
import com.squareup.cash.session.backend.DbSessionManager;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.session.backend.Session;
import com.squareup.cash.session.backend.UnexpectedSessionStatusDowngradeError;
import com.squareup.cash.sharesheet.ShareSheetViewKt;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.DialogViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewModel;
import com.squareup.cash.shopping.autofill.views.AutofillSheetView;
import com.squareup.cash.shopping.autofill.views.AutofillSheetViewKt;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.shopping.autofill.views.content.ErrorContentKt;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentAddCardViewModel;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCancelPlanDialogViewModel;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCheckoutViewModel;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentPlanDetailsViewModel;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheet;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentCancelPlanDialog;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentCardDetailsSheet;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentPlanDetailsSheet;
import com.squareup.cash.shopping.viewmodels.AutofillFooterViewModel;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel;
import com.squareup.cash.shopping.viewmodels.CashAppPayIncentiveSheetViewModel;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.viewmodels.WebNavigationHeaderModel;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.views.CashAppPayIncentivePromptSheetView;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.shopping.views.RestrictedItemWarningSheetView;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.shopping.views.ShoppingWebContainerViewKt;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatErrorViewModel;
import com.squareup.cash.support.chat.views.ChatErrorDialogView;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.franklin.common.SessionStatus;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.StableHolder;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class BasicShieetScope$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda1(Function1 function1, StablecoinHomeDisclosuresWidgetViewModel stablecoinHomeDisclosuresWidgetViewModel, PaddingValues paddingValues) {
        this.$r8$classId = 28;
        this.f$0 = function1;
        this.f$1 = stablecoinHomeDisclosuresWidgetViewModel;
        this.f$2 = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.$r8$classId;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        Object obj3 = Composer.Companion.Empty;
        int i2 = 2;
        int i3 = 0;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                Function3 function3 = (Function3) obj6;
                BasicShieetScope basicShieetScope = (BasicShieetScope) obj5;
                InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (function3 != null) {
                    gapComposer.startReplaceGroup(177440512);
                    boolean changed = gapComposer.changed(basicShieetScope);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda3(basicShieetScope, i2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier graphicsLayer = ColorKt.graphicsLayer(modifier, (Function1) rememberedValue);
                    if (basicShieetScope.state.getSettledPosition() != SheetPosition.Collapsed) {
                        gapComposer.startReplaceGroup(177614484);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == obj3) {
                            rememberedValue2 = new RealSheetState$$ExternalSyntheticLambda0(5);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue2);
                        z = false;
                        gapComposer.end(false);
                    } else {
                        z = false;
                        gapComposer.startReplaceGroup(177689132);
                        gapComposer.end(false);
                    }
                    Modifier then = graphicsLayer.then(modifier);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    function3.invoke(insetsPaddingValues, gapComposer, 0);
                    gapComposer.end(true);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(177834522);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                SavingsScreenViewModel savingsScreenViewModel = (SavingsScreenViewModel) obj6;
                Function1 function1 = (Function1) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean z3 = savingsScreenViewModel instanceof SavingsScreenViewModel.Loading;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = new CalloutKt$$ExternalSyntheticLambda1(2);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Strings.LoadableFullScreenContent(savingsScreenViewModel, z3, fillMaxSize, (Function1) rememberedValue3, null, Expect_jvmKt.rememberComposableLambda(-1736108381, new CashtagViewKt$$ExternalSyntheticLambda5(function1, mutableState, 3), gapComposer2), gapComposer2, 200064, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                SavingsScreenViewKt.UpsellCard((SavingsScreenViewModel.Content.SavingsScreenElement.Card) obj6, (Modifier) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                CalloutKt.ScoreSummarySheetContent((CashCreditScoreHomeData.ScoreSummaryOverlayData) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                EducationCardKt.BookletFeatureCard((BookletFeatureCardViewModel) obj6, (Modifier) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                EducationCardKt.EducationCard((EducationCardUiModel) obj6, (Function0) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ProtectionsSectionKt.ProtectionsSection((Function1) obj6, (Modifier) obj5, (ProtectionsSectionUiModel) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                RecoveryGuideViewKt.RecoveryGuideSection((RecoveryGuideSectionViewModel) obj6, (Function1) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                DbSessionManager dbSessionManager = (DbSessionManager) obj6;
                Session session = (Session) obj5;
                SessionStatus sessionStatus = session.status;
                String str = (String) obj4;
                com.squareup.cash.db.Session session2 = (com.squareup.cash.db.Session) obj2;
                ((TransactionCallbacks) obj).getClass();
                session2.getClass();
                Session session3 = DbSessionManagerKt.getSession(session2);
                if (session3 != null) {
                    SessionStatus sessionStatus2 = session3.status;
                    Exception exc = new Exception();
                    SessionStatus sessionStatus3 = SessionStatus.FULL;
                    if (sessionStatus2 == sessionStatus3 && sessionStatus != null && sessionStatus != sessionStatus3) {
                        dbSessionManager.errorReporter.report(new UnexpectedSessionStatusDowngradeError(sessionStatus, str, exc), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                }
                return com.squareup.cash.db.Session.copy$default(session2, null, null, null, session.token, Long.valueOf(sessionStatus.value), false, 103);
            case 9:
                ((Integer) obj2).getClass();
                ShareSheetViewKt.ShareSheet((ShareSheetViewModel) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ((AutofillSheetView) obj6).Content((AutofillViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                EditAutofillViewModel editAutofillViewModel = (EditAutofillViewModel) obj6;
                Function1 function12 = (Function1) obj5;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxWidth(companion, 1.0f));
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (editAutofillViewModel instanceof EditAutofillViewModel.Content) {
                        gapComposer3.startReplaceGroup(-1240923738);
                        EditAutofillViewModel.Content content = (EditAutofillViewModel.Content) editAutofillViewModel;
                        EditAutofillViewKt.BodyContent(function12, content, gapComposer3, 0);
                        DialogViewModel dialogViewModel = content.dialogViewModel;
                        if (dialogViewModel == null) {
                            gapComposer3.startReplaceGroup(-1240853896);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-1240853895);
                            boolean changed2 = gapComposer3.changed(function12) | gapComposer3.changedInstance(dialogViewModel);
                            Object rememberedValue4 = gapComposer3.rememberedValue();
                            if (changed2 || rememberedValue4 == obj3) {
                                rememberedValue4 = new EditAutofillViewKt$$ExternalSyntheticLambda2(0, dialogViewModel, function12);
                                gapComposer3.updateRememberedValue(rememberedValue4);
                            }
                            AliasFormatter.Dialog((Function0) rememberedValue4, new DialogProperties(4), Expect_jvmKt.rememberComposableLambda(237876585, new EditAutofillViewKt$$ExternalSyntheticLambda3(i3, dialogViewModel, function12), gapComposer3), gapComposer3, 432);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(false);
                        z2 = true;
                    } else {
                        if (editAutofillViewModel instanceof EditAutofillViewModel.ErrorViewModel) {
                            gapComposer3.startReplaceGroup(-1239904055);
                            Modifier fillMaxHeight = SizeKt.fillMaxHeight(companion, 1.0f);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxHeight);
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                            NavigationType navigationType = NavigationType.CLOSE;
                            boolean changed3 = gapComposer3.changed(delegatingSoftwareKeyboardController) | gapComposer3.changed(function12);
                            Object rememberedValue5 = gapComposer3.rememberedValue();
                            if (changed3 || rememberedValue5 == obj3) {
                                rememberedValue5 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function12, 22);
                                gapComposer3.updateRememberedValue(rememberedValue5);
                            }
                            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, gapComposer3, 54, 108);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                            EditAutofillViewModel.ErrorViewModel errorViewModel = (EditAutofillViewModel.ErrorViewModel) editAutofillViewModel;
                            Countries.PageHeader(errorViewModel.title, (Modifier) null, AutofillSheetViewKt.lambda$1932257925, errorViewModel.subtitle, gapComposer3, MLKEMEngine.KyberPolyBytes, 2);
                            SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f, true));
                            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(2130846396, new ShareSheetViewKt$$ExternalSyntheticLambda1(26, (Object) editAutofillViewModel, function12), gapComposer3), gapComposer3, 24582, 14);
                            gapComposer3 = gapComposer3;
                            gapComposer3.end(true);
                            gapComposer3.end(false);
                        } else if (editAutofillViewModel instanceof EditAutofillViewModel.SuccessViewModel) {
                            gapComposer3.startReplaceGroup(-1238537513);
                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer3, 54);
                            int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize2);
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                            Context context = (Context) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalContext);
                            boolean changed4 = gapComposer3.changed(function12);
                            Object rememberedValue6 = gapComposer3.rememberedValue();
                            if (changed4 || rememberedValue6 == obj3) {
                                rememberedValue6 = new ScoreHomeKt$$ExternalSyntheticLambda0(16, function12);
                                gapComposer3.updateRememberedValue(rememberedValue6);
                            }
                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth, context, null, 0, 0L, 0L, false, (Function0) rememberedValue6, false, gapComposer3, 100663686, 120);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, ((EditAutofillViewModel.SuccessViewModel) editAutofillViewModel).title, (Map) null, (Function1) null, false);
                            gapComposer3 = gapComposer3;
                            gapComposer3.end(true);
                            gapComposer3.end(false);
                        } else {
                            if (!(editAutofillViewModel instanceof EditAutofillViewModel.LoadingViewModel)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -2118238634, false);
                            }
                            gapComposer3.startReplaceGroup(-1237846895);
                            Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            int hashCode5 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize3);
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                            z2 = true;
                            ProgressCircularKt.ProgressCircular(0, 1, gapComposer3, null);
                            gapComposer3.end(true);
                            gapComposer3.end(false);
                        }
                        z2 = true;
                    }
                    gapComposer3.end(z2);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ErrorContentKt.MooncakeLoadedContent((Modifier) obj6, (AutofillViewModel.Loaded) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                int i4 = SingleUsePaymentAddCardSheet.$r8$clinit;
                ((SingleUsePaymentAddCardSheet) obj6).Content((SingleUsePaymentAddCardViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                int i5 = SingleUsePaymentCancelPlanDialog.$r8$clinit;
                ((SingleUsePaymentCancelPlanDialog) obj6).Content((SingleUsePaymentCancelPlanDialogViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i6 = SingleUsePaymentCardDetailsSheet.$r8$clinit;
                ((SingleUsePaymentCardDetailsSheet) obj6).Content((Unit) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                int i7 = SingleUsePaymentPlanDetailsSheet.$r8$clinit;
                ((SingleUsePaymentPlanDetailsSheet) obj6).Content((SingleUsePaymentPlanDetailsViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj6).Content((SingleUsePaymentCheckoutViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                Function1 function13 = (Function1) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode6 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, MooncakeTheme.getColors(gapComposer4).secondaryLabel, (Composer) gapComposer4, SpacerKt.m299paddingVpY3zN4(modifier, 20.0f, 24.0f), MooncakeTheme.getTypography(gapComposer4).smallBody, (TextLineBalancing) null, Room.stringResource(R.string.sup_contextual_explainer_message_cash_app_card, new Object[]{str2, str3}, gapComposer4), (Map) null, (Function1) null, false);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(modifier, 20.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 48.0f, 7), 1.0f);
                    String stringResource = Room.stringResource(gapComposer4, R.string.sup_contextual_explainer_confirm_button);
                    MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
                    boolean changed5 = gapComposer4.changed(function13);
                    Object rememberedValue7 = gapComposer4.rememberedValue();
                    if (changed5 || rememberedValue7 == obj3) {
                        rememberedValue7 = new BrandsSearchView$$ExternalSyntheticLambda6(14, function13);
                        gapComposer4.updateRememberedValue(rememberedValue7);
                    }
                    KeypadKt.m3640ButtonGFipHI0(stringResource, (Function0) rememberedValue7, fillMaxWidth3, null, null, style, null, false, 0, null, null, gapComposer4, 196992, 0, 4056);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ShopErrorKt.AutofillFooter((Modifier) obj6, (AutofillFooterViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((P2PListView) obj6).Content((BrandsSearchViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj6).AvatarBadge((StableHolder) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj6).SheetContent((ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                int i8 = CashAppPayIncentivePromptSheetView.$r8$clinit;
                ((CashAppPayIncentivePromptSheetView) obj6).Content((CashAppPayIncentiveSheetViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                ((ProductSearchView) obj6).Content((ProductSearchViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                int i9 = RestrictedItemWarningSheetView.$r8$clinit;
                ((RestrictedItemWarningSheetView) obj6).Content((RestrictedItemWarningSheetViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ShoppingWebContainerViewKt.Footer((ShoppingViewModel) obj6, (Function1) obj5, (WebAppBridge) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                ShopErrorKt.WebNavigationHeader((WebNavigationHeaderModel) obj6, (Function1) obj5, (BasicShieetScope$$ExternalSyntheticLambda10) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                Function1 function14 = (Function1) obj6;
                StablecoinHomeDisclosuresWidgetViewModel stablecoinHomeDisclosuresWidgetViewModel = (StablecoinHomeDisclosuresWidgetViewModel) obj5;
                PaddingValues paddingValues = (PaddingValues) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(modifier, 1.0f);
                    boolean changed6 = gapComposer5.changed(function14) | gapComposer5.changedInstance(stablecoinHomeDisclosuresWidgetViewModel);
                    Object rememberedValue8 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue8 == obj3) {
                        rememberedValue8 = new ShareSheetViewKt$$ExternalSyntheticLambda5(25, function14, stablecoinHomeDisclosuresWidgetViewModel);
                        gapComposer5.updateRememberedValue(rememberedValue8);
                    }
                    Modifier padding = SpacerKt.padding(ImageKt.m183clickableoSLSa3U$default(fillMaxWidth4, false, null, null, (Function0) rememberedValue8, 15), paddingValues);
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode7 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer5, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    Modifier align = BoxScopeInstance.INSTANCE.align(modifier, Alignment.Companion.Center);
                    String str4 = stablecoinHomeDisclosuresWidgetViewModel.formattedText;
                    TextStyle textStyle = Strings.getTypography(gapComposer5).bodyXSmall;
                    long j = Strings.getColors(gapComposer5).semantic.text.subtle;
                    MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer5).linkXSmall.spanStyle, Strings.getColors(gapComposer5).semantic.text.link, null, 0L, JpegConstants.COM_MARKER), 2);
                    boolean changed7 = gapComposer5.changed(function14) | gapComposer5.changedInstance(stablecoinHomeDisclosuresWidgetViewModel);
                    Object rememberedValue9 = gapComposer5.rememberedValue();
                    if (changed7 || rememberedValue9 == obj3) {
                        rememberedValue9 = new ActionPillKt$$ExternalSyntheticLambda1(9, function14, stablecoinHomeDisclosuresWidgetViewModel);
                        gapComposer5.updateRememberedValue(rememberedValue9);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str4, (Function2) rememberedValue9, align, textStyle, j, markdownSpanValues, null, null, 0, 0, 3, gapComposer5, 0, 960);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int i10 = ChatErrorDialogView.$r8$clinit;
                ((ChatErrorDialogView) obj6).Content((ChatErrorViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
