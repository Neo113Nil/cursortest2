package com.squareup.cash.checks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda5;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.borrow.views.ExpandedLoanHistoryListKt$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.views.LoanDetailsSheetState;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewModel;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.SUPCardInfo;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetViewModel;
import com.squareup.cash.card.onboarding.CtaAction;
import com.squareup.cash.card.onboarding.DisclosureView$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.DisclosureViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.DisclosureViewModel;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.PdpPanelState;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.TagOrderConfirmationViewModel;
import com.squareup.cash.card.onboarding.graphics.HoloEffectState;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.cashapplite.viewmodels.CashInRowViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteAddMoneyViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewModel;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageDialogViewModel;
import com.squareup.cash.common.messaging.views.FailureMessageDialogView;
import com.squareup.cash.common.messaging.views.FailureMessageDialogView$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt$$ExternalSyntheticLambda30;
import com.squareup.cash.deposits.physical.viewmodels.details.LocationDetailsViewModel;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.graphics.backend.engine.EntityStateImpl;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public final /* synthetic */ class CheckDepositAmountKt$$ExternalSyntheticLambda6 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda6(SUPCardInfo sUPCardInfo, RealImageLoader realImageLoader) {
        this.$r8$classId = 7;
        this.f$0 = sUPCardInfo;
        this.f$1 = realImageLoader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object invoke$com$squareup$cash$card$onboarding$pdp$ProductDetailsPageKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        final ProductDetailsPageViewModel productDetailsPageViewModel = (ProductDetailsPageViewModel) this.f$0;
        final Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        final int i = 0;
        final int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = productDetailsPageViewModel.personalizeLabel;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (str != null) {
                gapComposer.startReplaceGroup(-1826338705);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(productDetailsPageViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new Function0() { // from class: com.squareup.cash.card.onboarding.pdp.ProductDetailsPageKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = i;
                            ProductDetailsPageViewModel productDetailsPageViewModel2 = productDetailsPageViewModel;
                            Function1 function12 = function1;
                            switch (i3) {
                                case 0:
                                    function12.invoke(new PaymentDeviceCustomizationViewEvent.PersonalizeCard(productDetailsPageViewModel2.paymentDeviceId));
                                    break;
                                default:
                                    function12.invoke(new PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton(productDetailsPageViewModel2.paymentDeviceId, productDetailsPageViewModel2.ctaAction));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1354055010, new SetPinViewKt$$ExternalSyntheticLambda7(str, 17), gapComposer), gapComposer, 1572912, 60);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1826129920);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            CtaAction ctaAction = productDetailsPageViewModel.ctaAction;
            if (Intrinsics.areEqual(ctaAction, CtaAction.Disabled.INSTANCE) || (Intrinsics.areEqual(ctaAction, CtaAction.Notify.INSTANCE) && productDetailsPageViewModel.notified)) {
                i = 1;
            }
            boolean z = i ^ 1;
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(productDetailsPageViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.card.onboarding.pdp.ProductDetailsPageKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        ProductDetailsPageViewModel productDetailsPageViewModel2 = productDetailsPageViewModel;
                        Function1 function12 = function1;
                        switch (i3) {
                            case 0:
                                function12.invoke(new PaymentDeviceCustomizationViewEvent.PersonalizeCard(productDetailsPageViewModel2.paymentDeviceId));
                                break;
                            default:
                                function12.invoke(new PaymentDeviceCustomizationViewEvent.TapProductDetailsPageButton(productDetailsPageViewModel2.paymentDeviceId, productDetailsPageViewModel2.ctaAction));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            HeroSectionKt.OpaqueDisabledButtonCta(3120, gapComposer, Expect_jvmKt.rememberComposableLambda(-923887187, new CheckDepositAmountKt$$ExternalSyntheticLambda8(productDetailsPageViewModel, 14), gapComposer), fillMaxWidth2, (Function0) rememberedValue2, z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$card$spendinginsights$views$SpendingInsightsHomeViewKt$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3) {
        SpendingInsightsHomeViewModel.Content.ActivitySection activitySection = (SpendingInsightsHomeViewModel.Content.ActivitySection) this.f$0;
        String str = (String) this.f$1;
        EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        embeddedHeaderScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(embeddedHeaderScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            String str2 = activitySection.title;
            gapComposer.startReplaceGroup(-2100148414);
            str2.getClass();
            boolean changedInstance = gapComposer.changedInstance(activitySection);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda4(activitySection, 19);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            embeddedHeaderScope.DefaultHeader((intValue << 9) & 7168, 0, gapComposer, str2, str, (Function0) rememberedValue);
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$cashapplite$views$LiteCashInViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        LiteCashInViewModel.Loaded loaded = (LiteCashInViewModel.Loaded) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ScrollingScaffoldContentScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.lite_cash_in_title), (Modifier) null, (Function2) null, Room.stringResource(gapComposer, R.string.lite_cash_in_subtitle), gapComposer, 0, 6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Iterator it = loaded.rows.iterator();
            while (it.hasNext()) {
                KycAppletTileKt.CashInDetailRow((CashInRowViewModel) it.next(), function1, gapComposer, 0);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$cashapppay$settings$views$ConfirmRemoveLinkedBusinessDialogKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel = (RemoveLinkedBusinessViewModel) this.f$0;
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        int i = 18;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButtonDestructive(((intValue << 12) & 57344) | 3072, 6, gapComposer, Expect_jvmKt.rememberComposableLambda(1144376459, new CheckDepositAmountKt$$ExternalSyntheticLambda8(removeLinkedBusinessViewModel, i), gapComposer), null, (Function0) rememberedValue, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$cashapppay$settings$views$LinkedBusinessDetailsSheetViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel = (LinkedBusinessDetailsViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            int i = 19;
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(19, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, null, true, false, null, Expect_jvmKt.rememberComposableLambda(-2115192213, new CheckDepositAmountKt$$ExternalSyntheticLambda8(linkedBusinessDetailsViewModel, i), gapComposer), gapComposer, 1575984, 52);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$cashapppay$settings$views$UnlinkResultViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        UnlinkResultViewModel unlinkResultViewModel = (UnlinkResultViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1345237501, new CheckDepositAmountKt$$ExternalSyntheticLambda8(unlinkResultViewModel, 20), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$checks$ConfirmBackOfCheckKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        ConfirmBackOfCheckViewModel confirmBackOfCheckViewModel = (ConfirmBackOfCheckViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = confirmBackOfCheckViewModel.isCallToActionEnabled;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(120120236, new CheckDepositAmountKt$$ExternalSyntheticLambda8(confirmBackOfCheckViewModel, 23), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$checks$ConfirmFrontOfCheckKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        ConfirmFrontOfCheckViewModel confirmFrontOfCheckViewModel = (ConfirmFrontOfCheckViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = confirmFrontOfCheckViewModel.isCallToActionEnabled;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(857294736, new CheckDepositAmountKt$$ExternalSyntheticLambda8(confirmFrontOfCheckViewModel, 24), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$checks$VerifyCheckDepositKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        VerifyCheckDepositViewModel verifyCheckDepositViewModel = (VerifyCheckDepositViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = verifyCheckDepositViewModel.continueEnabled;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(107893127, new VerifyCheckDepositKt$$ExternalSyntheticLambda6(verifyCheckDepositViewModel, i), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$checks$VerifyCheckDialogView$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        VerifyCheckDialogViewModel verifyCheckDialogViewModel = (VerifyCheckDialogViewModel) this.f$0;
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = VerifyCheckDialogView.$r8$clinit;
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(368503010, new CheckDepositAmountKt$$ExternalSyntheticLambda8(verifyCheckDialogViewModel, 25), gapComposer), gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$common$messaging$views$FailureMessageDialogView$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        FailureMessageDialogViewModel failureMessageDialogViewModel = (FailureMessageDialogViewModel) this.f$0;
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = FailureMessageDialogView.$r8$clinit;
        modalButtonScope.getClass();
        int i2 = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(17, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(148839570, new FailureMessageDialogView$$ExternalSyntheticLambda2(failureMessageDialogViewModel, i2), gapComposer), gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$core$navigationcontainer$UiContainerKt$$ExternalSyntheticLambda56(Object obj, Object obj2, Object obj3) {
        ToolbarConfig toolbarConfig = (ToolbarConfig) this.f$0;
        SharedToolbarSwipeScope sharedToolbarSwipeScope = (SharedToolbarSwipeScope) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = toolbarConfig.title;
            if (str == null) {
                gapComposer.startReplaceGroup(-1921111727);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1921111726);
                TabToolbarsKt.m3756SwipeRecoloredControl3IgeMak(sharedToolbarSwipeScope, 0L, Expect_jvmKt.rememberComposableLambda(545528338, new LocalViewFactory$$ExternalSyntheticLambda4(21, str, sharedToolbarSwipeScope), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$deposits$physical$view$details$LocationDetailSheetViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        final LocationDetailsViewModel locationDetailsViewModel = (LocationDetailsViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        final int i = 0;
        final int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1685372629, new Function3() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    int i3 = i;
                    LocationDetailsViewModel locationDetailsViewModel2 = locationDetailsViewModel;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, locationDetailsViewModel2.getSecondaryButtonText(), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, locationDetailsViewModel2.getPrimaryButtonText(), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1572864, 62);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(5, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1885183628, new Function3() { // from class: com.squareup.cash.deposits.physical.view.details.LocationDetailSheetViewKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    int i3 = i2;
                    LocationDetailsViewModel locationDetailsViewModel2 = locationDetailsViewModel;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, locationDetailsViewModel2.getSecondaryButtonText(), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, locationDetailsViewModel2.getPrimaryButtonText(), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1573248, 58);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$deposits$physical$view$location$LocationDeniedModalKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        LocationDeniedScreen locationDeniedScreen = (LocationDeniedScreen) this.f$0;
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        modalButtonScope.getClass();
        int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(265719519, new ArcadeModal$$ExternalSyntheticLambda3(locationDeniedScreen, i), gapComposer), gapComposer, (57344 & (intValue << 12)) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i;
        float f;
        Function2 function2;
        Function2 function22;
        Function2 function23;
        int i2 = this.$r8$classId;
        int i3 = 28;
        int i4 = 3;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i5 = 15;
        int i6 = 2;
        int i7 = 9;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        int i8 = 0;
        char c = 1;
        switch (i2) {
            case 0:
                CheckDepositAmountViewModel checkDepositAmountViewModel = (CheckDepositAmountViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z = checkDepositAmountViewModel.primaryButtonEnabled;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(5, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(1831440872, new CheckDepositAmountKt$$ExternalSyntheticLambda8(checkDepositAmountViewModel, 0), gapComposer), gapComposer, 1573296, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj5;
                BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 = (BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean changed2 = gapComposer2.changed(borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda6(borrowHomeOverlayKt$BorrowHomeOverlay$1$1$3, 5);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue2, null, null, 0L, null, null, null, 0, 0, 0, gapComposer2, 0, 2044);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Function0 function0 = (QuickPayViewKt$QuickPay$1$1$1$2$2$1$1) obj5;
                String str3 = (String) obj4;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    modalButtonScope.SecondaryModalButton(function0, null, false, Expect_jvmKt.rememberComposableLambda(-976691288, new SetPinViewKt$$ExternalSyntheticLambda7(str3, i5), gapComposer3), gapComposer3, ((intValue3 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function0 function02 = (Function0) obj5;
                ExpandedLoanHistoryListModel expandedLoanHistoryListModel = (ExpandedLoanHistoryListModel) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean changed3 = gapComposer4.changed(function02);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ComposeDialogKt$$ExternalSyntheticLambda10(i7, function02);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue3, SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1209928819, new ExpandedLoanHistoryListKt$$ExternalSyntheticLambda4(expandedLoanHistoryListModel, 1), gapComposer4), gapComposer4, 1572912, 60);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                FirstTimeBorrowViewModel.Content content = (FirstTimeBorrowViewModel.Content) obj5;
                Function1 function12 = (Function1) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    FirstTimeBorrowViewModel.Content.BorrowButton borrowButton = content.borrowButton;
                    boolean changed4 = gapComposer5.changed(function12);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new BorrowHomeKt$$ExternalSyntheticLambda3(13, function12);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue4, fillMaxWidth2, buttonProminence2, false, true, null, Expect_jvmKt.rememberComposableLambda(1006454626, new CheckDepositAmountKt$$ExternalSyntheticLambda8(content, 1), gapComposer5), gapComposer5, 1573296, 40);
                    FirstTimeBorrowViewModel.Content.SecondaryButton secondaryButton = content.secondaryButton;
                    if (secondaryButton == null) {
                        gapComposer5.startReplaceGroup(-441517738);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-441517737);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed5 = gapComposer5.changed(function12) | gapComposer5.changedInstance(secondaryButton);
                        Object rememberedValue5 = gapComposer5.rememberedValue();
                        if (changed5 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(i4, (Object) secondaryButton, function12);
                            gapComposer5.updateRememberedValue(rememberedValue5);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue5, fillMaxWidth3, null, false, true, null, Expect_jvmKt.rememberComposableLambda(-1896727007, new CheckDepositAmountKt$$ExternalSyntheticLambda8(secondaryButton, 2), gapComposer5), gapComposer5, 1597488, 44);
                        gapComposer5.end(false);
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                BorrowHomeOverlayViewModel.LoanDetails loanDetails = (BorrowHomeOverlayViewModel.LoanDetails) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    int ordinal = ((LoanDetailsSheetState) mutableState.getValue()).ordinal();
                    if (ordinal == 0) {
                        str = loanDetails.timelineButtonTitle;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        str = loanDetails.detailsButtonTitle;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                BugReportingViewModel.Ready ready = (BugReportingViewModel.Ready) obj5;
                Function1 function13 = (Function1) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(companion, paddingValues);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String stringResource = Room.stringResource(gapComposer7, R.string.bug_reporting_diagnostic_attachments_sheet_title);
                    TextStyle textStyle = ((Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).headlineSmall;
                    Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    long j = colors.semantic.text.standard;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer7.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer7.consume(staticProvidableCompositionLocal)).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer7, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    BugReportingViewKt.DiagnosticAttachmentsContent(ready, function13, gapComposer7, 0);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                SUPCardInfo sUPCardInfo = (SUPCardInfo) obj5;
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                boolean shouldExecute = gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16);
                Applier applier = gapComposer8.applier;
                if (shouldExecute) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer8.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer8, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer8, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer8, (Modifier) null, MooncakeTheme.getTypography(gapComposer8).smallTitle, (TextLineBalancing) null, sUPCardInfo.title, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer8, SizeKt.m277height3ABfNKs(companion, 12.0f));
                    Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                    BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer8, 0);
                    int hashCode3 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer8, companion);
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer8, composeUiNode$Companion$SetModifier$13, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer8, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer8, (Modifier) null, MooncakeTheme.getTypography(gapComposer8).header2, (TextLineBalancing) null, sUPCardInfo.amount, (Map) null, (Function1) null, false);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer8).secondaryLabel, (Composer) gapComposer8, (Modifier) null, MooncakeTheme.getTypography(gapComposer8).header2, (TextLineBalancing) null, " / ".concat(sUPCardInfo.limit), (Map) null, (Function1) null, false);
                    Request$Priority$EnumUnboxingLocalUtility.m(gapComposer8, true, companion, 16.0f, gapComposer8);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer8, (Modifier) null, MooncakeTheme.getTypography(gapComposer8).smallBody, (TextLineBalancing) null, sUPCardInfo.subTitle, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer8, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer8, 0);
                    int hashCode4 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer8, companion);
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer8, composeUiNode$Companion$SetModifier$13, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer8, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer8, (Modifier) null, MooncakeTheme.getTypography(gapComposer8).smallBody, (TextLineBalancing) null, sUPCardInfo.footer, (Map) null, (Function1) null, false);
                    AsyncImageKt.m1441AsyncImagesKDTAoQ(ThemablesKt.urlForTheme(sUPCardInfo.paymentNetworkImg, ThemeHelpersKt.themeInfo((Context) gapComposer8.consume(AndroidCompositionLocals_androidKt.LocalContext))), null, realImageLoader, null, null, null, null, gapComposer8, 48, 0, 4088);
                    gapComposer8.end(true);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                AfterPayOrderDetailsViewModel afterPayOrderDetailsViewModel = (AfterPayOrderDetailsViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (!gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    gapComposer9.skipToGroupEnd();
                } else if (afterPayOrderDetailsViewModel instanceof AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel) {
                    gapComposer9.startReplaceGroup(-1600419437);
                    Icons icons = Icons.NavigationMore;
                    String stringResource2 = Room.stringResource(gapComposer9, R.string.afterpay_order_details_overflow_icon);
                    boolean changed6 = gapComposer9.changed(function14) | gapComposer9.changedInstance(afterPayOrderDetailsViewModel);
                    Object rememberedValue6 = gapComposer9.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(12, (Object) afterPayOrderDetailsViewModel, function14);
                        gapComposer9.updateRememberedValue(rememberedValue6);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource2, (Function0) rememberedValue6, null, null, null, null, null, null, false, gapComposer9, (intValue9 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer9.end(false);
                } else {
                    gapComposer9.startReplaceGroup(-1600169577);
                    gapComposer9.end(false);
                }
                return Unit.INSTANCE;
            case 9:
                CardStudioMoreSheetViewModel cardStudioMoreSheetViewModel = (CardStudioMoreSheetViewModel) obj5;
                Function1 function15 = (Function1) obj4;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                boolean shouldExecute2 = gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18);
                Applier applier2 = gapComposer10.applier;
                if (shouldExecute2) {
                    Modifier padding2 = SpacerKt.padding(companion, paddingValues2);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer10, 0);
                    int hashCode5 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer10, padding2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer10.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer10, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer10, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    if (cardStudioMoreSheetViewModel.isShowingCashtagToggle) {
                        gapComposer10.startReplaceGroup(-1878534623);
                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                        ((DefaultSizes) gapComposer10.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(fillMaxWidth4, 16.0f);
                        RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer10, 54);
                        int hashCode6 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer10.currentCompositionLocalScope();
                        Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer10, m298padding3ABfNKs2);
                        gapComposer10.startReusableNode();
                        if (gapComposer10.inserting) {
                            gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer10.useNode();
                        }
                        Updater.m576setimpl(gapComposer10, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                        Updater.m576setimpl(gapComposer10, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer10, composeUiNode$Companion$SetModifier$17, gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$12);
                        Updater.m576setimpl(gapComposer10, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                        String stringResource3 = Room.stringResource(R.string.card_studio_more_show_cashtag, new Object[]{cardStudioMoreSheetViewModel.cashtag}, gapComposer10);
                        TextStyle textStyle2 = ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        Colors colors2 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                        } else {
                            gapComposer10.startReplaceGroup(-1762997739);
                            gapComposer10.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, (Composer) gapComposer10, (Modifier) null, textStyle2, (TextLineBalancing) null, stringResource3, (Map) null, (Function1) null, false);
                        boolean z2 = cardStudioMoreSheetViewModel.isShowingCashtag;
                        boolean changed7 = gapComposer10.changed(function15);
                        Object rememberedValue7 = gapComposer10.rememberedValue();
                        if (changed7 || rememberedValue7 == neverEqualPolicy) {
                            rememberedValue7 = new SsnViewKt$$ExternalSyntheticLambda1(17, function15);
                            gapComposer10.updateRememberedValue(rememberedValue7);
                        }
                        ModalKt.Toggle(z2, null, (Function1) rememberedValue7, false, null, gapComposer10, 0, 26);
                        gapComposer10.end(true);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-1877973399);
                        gapComposer10.end(false);
                    }
                    DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.VERTICAL, null, Expect_jvmKt.rememberComposableLambda(-415277573, new BookletGridKt$$ExternalSyntheticLambda1(13, function15), gapComposer10), gapComposer10, 24960, 11);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                DisclosureViewModel disclosureViewModel = (DisclosureViewModel) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean z3 = disclosureViewModel.hasFullyScrolled;
                    boolean changed8 = gapComposer11.changed(function16);
                    Object rememberedValue8 = gapComposer11.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new DisclosureView$$ExternalSyntheticLambda1(28, function16);
                        gapComposer11.updateRememberedValue(rememberedValue8);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth5, buttonProminence3, false, z3, null, Expect_jvmKt.rememberComposableLambda(301531433, new DisclosureViewKt$$ExternalSyntheticLambda4(disclosureViewModel, c == true ? 1 : 0), gapComposer11), gapComposer11, 1573296, 40);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                PdpPanelState pdpPanelState = (PdpPanelState) obj5;
                Function1 function17 = (Function1) obj4;
                Composer composer12 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ProductDetailsPageViewModel productDetailsPageViewModel = (ProductDetailsPageViewModel) pdpPanelState.displayedModel$delegate.getValue();
                if (productDetailsPageViewModel == null) {
                    GapComposer gapComposer12 = (GapComposer) composer12;
                    gapComposer12.startReplaceGroup(1511684797);
                    gapComposer12.end(false);
                } else {
                    GapComposer gapComposer13 = (GapComposer) composer12;
                    gapComposer13.startReplaceGroup(1511684798);
                    boolean changed9 = gapComposer13.changed(pdpPanelState);
                    Object rememberedValue9 = gapComposer13.rememberedValue();
                    if (changed9 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new CaptureCheckFaceKt$$ExternalSyntheticLambda12(pdpPanelState, i6);
                        gapComposer13.updateRememberedValue(rememberedValue9);
                    }
                    HeroSectionKt.ProductDetailsPageOverlay(productDetailsPageViewModel, function17, null, (Function1) rememberedValue9, gapComposer13, 0);
                    gapComposer13.end(false);
                }
                return Unit.INSTANCE;
            case 12:
                Function1 function18 = (Function1) obj4;
                TagOrderConfirmationViewModel tagOrderConfirmationViewModel = (TagOrderConfirmationViewModel) obj5;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Modifier fillMaxWidth6 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    boolean changed10 = gapComposer14.changed(function18);
                    Object rememberedValue10 = gapComposer14.rememberedValue();
                    if (changed10 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new GrantSheetKt$$ExternalSyntheticLambda4(5, function18);
                        gapComposer14.updateRememberedValue(rememberedValue10);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth6, buttonProminence4, false, false, null, Expect_jvmKt.rememberComposableLambda(-1822410963, new CheckDepositAmountKt$$ExternalSyntheticLambda8(tagOrderConfirmationViewModel, 11), gapComposer14), gapComposer14, 1573296, 56);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                HoloEffectState holoEffectState = (HoloEffectState) obj5;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = holoEffectState.holoReflectTexture$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = holoEffectState.holoBaseTexture$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = holoEffectState.forwardDirection$delegate;
                Context context = (Context) obj4;
                GLSceneScope gLSceneScope = (GLSceneScope) obj;
                int intValue13 = ((Integer) obj3).intValue();
                gLSceneScope.getClass();
                GapComposer gapComposer15 = (GapComposer) ((Composer) obj2);
                Object rememberedValue11 = gapComposer15.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    i = 6;
                    f = 1.0f;
                    rememberedValue11 = Updater.mutableStateOf$default(new Quat((float) Math.toRadians(-90.0d), new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE}));
                    gapComposer15.updateRememberedValue(rememberedValue11);
                } else {
                    i = 6;
                    f = 1.0f;
                }
                EntityStateImpl rememberEntityState = AbstractHashFunction.rememberEntityState((MutableState) rememberedValue11, null, Updater.rememberUpdatedState(Float.valueOf(f), gapComposer15), gapComposer15, 2);
                int i9 = (intValue13 << 3) & 112;
                MutableState rememberMaterialInstance = gLSceneScope.rememberMaterialInstance(gLSceneScope.rememberMaterial("holo", gapComposer15, i9 | 6), gapComposer15);
                TextureType textureType = TextureType.COLOR;
                Object rememberedValue12 = gapComposer15.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    Bitmap bitmap = (Bitmap) parcelableSnapshotMutableState2.getValue();
                    if (bitmap == null) {
                        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.holo_base_gradient);
                        parcelableSnapshotMutableState2.setValue(bitmap);
                    }
                    AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(bitmap, 19);
                    gapComposer15.updateRememberedValue(appLockMonitor$special$$inlined$map$2);
                    rememberedValue12 = appLockMonitor$special$$inlined$map$2;
                }
                int i10 = ((intValue13 << 6) & 896) | 6;
                MutableState produceTexture = gLSceneScope.produceTexture(textureType, (Flow) rememberedValue12, gapComposer15, i10);
                Object rememberedValue13 = gapComposer15.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    Bitmap bitmap2 = (Bitmap) parcelableSnapshotMutableState.getValue();
                    if (bitmap2 == null) {
                        bitmap2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.holo_reflect_env);
                        parcelableSnapshotMutableState.setValue(bitmap2);
                    }
                    rememberedValue13 = new AppLockMonitor$special$$inlined$map$2(bitmap2, 19);
                    gapComposer15.updateRememberedValue(rememberedValue13);
                }
                MutableState produceTexture2 = gLSceneScope.produceTexture(textureType, (Flow) rememberedValue13, gapComposer15, i10);
                PBRMaterial.PBRMaterialInstance pBRMaterialInstance = (PBRMaterial.PBRMaterialInstance) rememberMaterialInstance.getValue();
                if (pBRMaterialInstance == null) {
                    gapComposer15.startReplaceGroup(899126029);
                    gapComposer15.end(false);
                } else {
                    gapComposer15.startReplaceGroup(899126030);
                    int i11 = i;
                    pBRMaterialInstance.bindTexture("holoBase", produceTexture, gapComposer15, i11);
                    pBRMaterialInstance.bindTexture("holoReflect", produceTexture2, gapComposer15, i11);
                    pBRMaterialInstance.bindFloat("roughness", Updater.rememberUpdatedState(Float.valueOf(holoEffectState.roughness$delegate.getFloatValue()), gapComposer15), gapComposer15, i11);
                    pBRMaterialInstance.bindFloat("metallic", Updater.rememberUpdatedState(Float.valueOf(holoEffectState.metallic$delegate.getFloatValue()), gapComposer15), gapComposer15, i11);
                    pBRMaterialInstance.bindFloat("ao", Updater.rememberUpdatedState(Float.valueOf(holoEffectState.ao$delegate.getFloatValue()), gapComposer15), gapComposer15, i11);
                    pBRMaterialInstance.bindFloat("roughnessScale", Updater.rememberUpdatedState(Float.valueOf(holoEffectState.roughnessScale$delegate.getFloatValue()), gapComposer15), gapComposer15, i11);
                    pBRMaterialInstance.bindFloat("holoOffsetScale", Updater.rememberUpdatedState(Float.valueOf(holoEffectState.holoOffsetScale$delegate.getFloatValue()), gapComposer15), gapComposer15, i11);
                    pBRMaterialInstance.bindFloat("holoOffsetX", Updater.rememberUpdatedState(Float.valueOf(holoEffectState.holoOffsetX$delegate.getFloatValue()), gapComposer15), gapComposer15, i11);
                    pBRMaterialInstance.bindFloat("holoOffsetY", Updater.rememberUpdatedState(Float.valueOf(holoEffectState.holoOffsetY$delegate.getFloatValue()), gapComposer15), gapComposer15, i11);
                    pBRMaterialInstance.bindFloat("vibrance", Updater.rememberUpdatedState(Float.valueOf(holoEffectState.vibrance$delegate.getFloatValue()), gapComposer15), gapComposer15, i11);
                    pBRMaterialInstance.bindFloat3(Updater.rememberUpdatedState(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(((Vector4) parcelableSnapshotMutableState3.getValue()).vector[0]), Float.valueOf(((Vector4) parcelableSnapshotMutableState3.getValue()).vector[1]), Float.valueOf(((Vector4) parcelableSnapshotMutableState3.getValue()).vector[2])}), gapComposer15), gapComposer15, 6);
                    gapComposer15.end(false);
                }
                gapComposer15.startReplaceGroup(-1494979953);
                Iterator it = ((List) holoEffectState.lights$delegate.getValue()).iterator();
                while (it.hasNext()) {
                    gLSceneScope.Light((LightStateImpl) it.next(), gapComposer15, i9);
                }
                gapComposer15.end(false);
                gLSceneScope.rememberMesh(rememberMaterialInstance, rememberEntityState, gapComposer15, ((intValue13 << 9) & 7168) | 6);
                return Unit.INSTANCE;
            case 14:
                return invoke$com$squareup$cash$card$onboarding$pdp$ProductDetailsPageKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 15:
                return invoke$com$squareup$cash$card$spendinginsights$views$SpendingInsightsHomeViewKt$$ExternalSyntheticLambda11(obj, obj2, obj3);
            case 16:
                LiteAddMoneyViewModel liteAddMoneyViewModel = (LiteAddMoneyViewModel) obj5;
                Function1 function19 = (Function1) obj4;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer14).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    KycAppletTileKt.LiteAddMoneyContent(liteAddMoneyViewModel, function19, SpacerKt.padding(companion, paddingValues3), gapComposer16, 0);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                return invoke$com$squareup$cash$cashapplite$views$LiteCashInViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 18:
                return invoke$com$squareup$cash$cashapppay$settings$views$ConfirmRemoveLinkedBusinessDialogKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 19:
                return invoke$com$squareup$cash$cashapppay$settings$views$LinkedBusinessDetailsSheetViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$cashapppay$settings$views$UnlinkResultViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$checks$ConfirmBackOfCheckKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$checks$ConfirmFrontOfCheckKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$checks$VerifyCheckDepositKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$checks$VerifyCheckDialogView$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$common$messaging$views$FailureMessageDialogView$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$core$navigationcontainer$UiContainerKt$$ExternalSyntheticLambda56(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$deposits$physical$view$details$LocationDetailSheetViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$deposits$physical$view$location$LocationDeniedModalKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                ListUnordered listUnordered = (ListUnordered) obj5;
                Function1 function110 = (Function1) obj4;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer15).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    for (ListUnordered.ListItem listItem : listUnordered.items) {
                        Icon icon = listItem.icon;
                        String str4 = icon != null ? icon.arcade_id : null;
                        if (str4 == null) {
                            gapComposer17.startReplaceGroup(-1119382119);
                            gapComposer17.end(false);
                            function2 = null;
                        } else {
                            gapComposer17.startReplaceGroup(-1119382118);
                            Function2 rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(880156269, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str4, i3), gapComposer17);
                            gapComposer17.end(false);
                            function2 = rememberComposableLambda;
                        }
                        LocalizedString localizedString = listItem.body;
                        if (localizedString == null) {
                            gapComposer17.startReplaceGroup(-1119280470);
                            gapComposer17.end(false);
                            function22 = null;
                        } else {
                            gapComposer17.startReplaceGroup(-1119280469);
                            Function2 rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2017151141, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(10, localizedString, function110), gapComposer17);
                            gapComposer17.end(false);
                            function22 = rememberComposableLambda2;
                        }
                        LocalizedString localizedString2 = listItem.value;
                        if (localizedString2 == null) {
                            gapComposer17.startReplaceGroup(-1118935440);
                            gapComposer17.end(false);
                            function23 = null;
                        } else {
                            gapComposer17.startReplaceGroup(-1118935439);
                            Function2 rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-71386545, new BulletinTileKt$$ExternalSyntheticLambda5(localizedString2, i6), gapComposer17);
                            gapComposer17.end(false);
                            function23 = rememberComposableLambda3;
                        }
                        listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(-1628838670, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda30(listItem, i8), gapComposer17), (Modifier) null, function2, function23, function22, gapComposer17, (458752 & (intValue15 << 15)) | 6, 2);
                    }
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda6(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
