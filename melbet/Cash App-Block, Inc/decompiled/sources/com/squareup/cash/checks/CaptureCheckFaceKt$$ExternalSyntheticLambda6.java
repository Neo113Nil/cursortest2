package com.squareup.cash.checks;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt$WhenMappings;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.widget.EdgeEffectCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.local.worker.LocalActivitySetupTeardown;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.google.mlkit.vision.common.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.ProductDetailsPageSection;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.spendinginsights.viewmodels.RecurringPaymentInfoViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.card.spendinginsights.views.RecurringPaymentInfoSheet;
import com.squareup.cash.cashapplite.presenters.ActivityAppletTilePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.KycAppletTilePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.viewmodels.CashInRowViewModel;
import com.squareup.cash.cashapplite.viewmodels.KycAppletTileModel;
import com.squareup.cash.cashapplite.viewmodels.LiteAddMoneyViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteBalanceHomeViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewModel;
import com.squareup.cash.cashapplite.viewmodels.PasskeySignatureBlockerViewModel;
import com.squareup.cash.cashapplite.views.ActivityAppletTile;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessViewModel;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultViewKt;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.checks.CaptureCheckFaceViewModel;
import com.squareup.cash.checks.VerifyCheckDepositViewModel;
import com.squareup.cash.common.composeui.InfoUpsellCtaButtonScope;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageDialogViewModel;
import com.squareup.cash.common.messaging.viewmodels.FailureMessageFullScreenViewModel;
import com.squareup.cash.common.messaging.views.FailureMessageDialogView;
import com.squareup.cash.common.messaging.views.FailureMessageDialogView$$ExternalSyntheticLambda2;
import com.squareup.cash.common.messaging.views.FailureMessageFullScreenViewKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.payments.presenters.RecipientMapper;
import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cash.scrubbing.MoneyScrubber;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda6(Function1 function1, FailureMessageFullScreenViewModel failureMessageFullScreenViewModel) {
        this.$r8$classId = 29;
        this.f$1 = function1;
        this.f$0 = failureMessageFullScreenViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x016e, code lost:
    
        if (r2 == r0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invoke$com$squareup$cash$checks$VerifyCheckDepositKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        NeverEqualPolicy neverEqualPolicy;
        Function1 function1 = (Function1) this.f$1;
        VerifyCheckDepositViewModel verifyCheckDepositViewModel = (VerifyCheckDepositViewModel) this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            NavigationType navigationType = NavigationType.BACK;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-441542651, new BookletGridKt$$ExternalSyntheticLambda1(21, function1), gapComposer), gapComposer, 1572918, 44);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(verifyCheckDepositViewModel.title, (Modifier) null, CheckDepositAmountKt.f354lambda$324719997, verifyCheckDepositViewModel.description, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(-733805750);
            VerifyCheckDepositViewModel.CheckFaceCellViewModel checkFaceCellViewModel = verifyCheckDepositViewModel.checkFrontCellViewModel;
            String str = checkFaceCellViewModel.label;
            String str2 = checkFaceCellViewModel.buttonLabel;
            VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState captureState = checkFaceCellViewModel.state;
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
            }
            rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(11, function1);
            gapComposer.updateRememberedValue(rememberedValue2);
            CheckDepositAmountKt.FaceOfCheckCell(str, str2, captureState, (Function0) rememberedValue2, gapComposer, 0);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-733797400);
            VerifyCheckDepositViewModel.CheckFaceCellViewModel checkFaceCellViewModel2 = verifyCheckDepositViewModel.checkBackCellViewModel;
            String str3 = checkFaceCellViewModel2.label;
            String str4 = checkFaceCellViewModel2.buttonLabel;
            VerifyCheckDepositViewModel.CheckFaceCellViewModel.CaptureState captureState2 = checkFaceCellViewModel2.state;
            boolean changed3 = gapComposer.changed(function1);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(12, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CheckDepositAmountKt.FaceOfCheckCell(str3, str4, captureState2, (Function0) rememberedValue3, gapComposer, 0);
            gapComposer.end(false);
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(null, false, null, Expect_jvmKt.rememberComposableLambda(1949046851, new VerifyCheckDepositKt$$ExternalSyntheticLambda6(verifyCheckDepositViewModel, 0), gapComposer), Expect_jvmKt.rememberComposableLambda(525626466, new CheckDepositAmountKt$$ExternalSyntheticLambda6(23, (Object) verifyCheckDepositViewModel, (Object) function1), gapComposer), gapComposer, 27648, 7);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$checks$VerifyCheckDialogView$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ComposableLambdaImpl rememberComposableLambda;
        VerifyCheckDialogViewModel verifyCheckDialogViewModel = (VerifyCheckDialogViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = VerifyCheckDialogView.$r8$clinit;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            String str = verifyCheckDialogViewModel.title;
            String str2 = verifyCheckDialogViewModel.message;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1719853069, new CheckDepositAmountKt$$ExternalSyntheticLambda6(24, (Object) verifyCheckDialogViewModel, function1), gapComposer);
            String str3 = verifyCheckDialogViewModel.negativeLabel;
            if (str3 == null) {
                gapComposer.startReplaceGroup(1070461488);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(1070461489);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1951494632, new TabContentViewKt$$ExternalSyntheticLambda11(function1, str3, 17), gapComposer);
                gapComposer.end(false);
            }
            ModalKt.Modal((Modifier) null, str, str2, rememberComposableLambda2, rememberComposableLambda, (Function3) null, gapComposer, 3072, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$common$composeui$ClusteredAvatarsKt$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        VisibleKt.ScalableAvatar((AvatarEntry) this.f$0, (Modifier) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$common$composeui$ClusteredAvatarsKt$$ExternalSyntheticLambda4(Object obj, Object obj2) {
        Painter painter;
        AvatarImage avatarImage = (AvatarImage) this.f$0;
        String str = (String) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            AvatarImage.Local placeholder$1 = avatarImage instanceof AvatarImage.Remote ? ((AvatarImage.Remote) avatarImage).getPlaceholder$1() : null;
            if (placeholder$1 == null) {
                gapComposer.startReplaceGroup(-1910191116);
                gapComposer.end(false);
                painter = null;
            } else {
                gapComposer.startReplaceGroup(1323854253);
                Painter painter2 = placeholder$1.painter(null, gapComposer);
                gapComposer.end(false);
                painter = painter2;
            }
            if (painter != null) {
                gapComposer.startReplaceGroup(-1910100998);
                ImageKt.Image(painter, null, SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, VisibleKt.ScalableAvatarImage$imageScale(placeholder$1)), null, null, RecyclerView.DECELERATION_RATE, placeholder$1.colorFilter(gapComposer), gapComposer, Painter.$stable | 48, 56);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1909891624);
                VisibleKt.ScalableMonogram(0, gapComposer, null, str);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$common$composeui$InfoUpsellCtaButtonScope$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((InfoUpsellCtaButtonScope) this.f$0).ShowCtaButton$compose_ui((ScrollState) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$common$messaging$views$FailureMessageDialogView$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        FailureMessageDialogViewModel failureMessageDialogViewModel = (FailureMessageDialogViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = FailureMessageDialogView.$r8$clinit;
        int i2 = 0;
        int i3 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            ModalKt.Modal((Modifier) null, Expect_jvmKt.rememberComposableLambda(-1784172366, new FailureMessageDialogView$$ExternalSyntheticLambda2(failureMessageDialogViewModel, i2), gapComposer), Expect_jvmKt.rememberComposableLambda(-311893773, new FailureMessageDialogView$$ExternalSyntheticLambda2(failureMessageDialogViewModel, i3), gapComposer), Expect_jvmKt.rememberComposableLambda(-647496761, new CheckDepositAmountKt$$ExternalSyntheticLambda6(25, (Object) failureMessageDialogViewModel, function1), gapComposer), (Function3) null, (Function3) null, gapComposer, 3504, 49);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AvatarImage.Remote.Icon icon;
        AvatarOverlay.LocalIcon localIcon;
        boolean z;
        int i;
        int i2;
        String format2;
        ColorFilter colorFilter;
        ColorFilter colorFilter2;
        ColorFilter colorFilter3;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        int i3 = this.$r8$classId;
        int i4 = 18;
        Object obj3 = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                CaptureCheckFaceKt.ViewPort((CaptureCheckFaceViewModel.Loaded.ShowMiSnap) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                HeroSectionKt.ProductDetailsPage((ProductDetailsPageViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                HeroSectionKt.SpacerBetweenSections((ProductDetailsPageSection) obj4, (ProductDetailsPageSection) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                RecurringPaymentInfoViewModel recurringPaymentInfoViewModel = (RecurringPaymentInfoViewModel) obj4;
                Function1 function1 = (Function1) obj5;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = RecurringPaymentInfoSheet.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (recurringPaymentInfoViewModel instanceof RecurringPaymentInfoViewModel.Content) {
                    gapComposer.startReplaceGroup(-1937527309);
                    FontWeightKt.RecurringPaymentInfoSheetContent((RecurringPaymentInfoViewModel.Content) recurringPaymentInfoViewModel, function1, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1937446585);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                FontWeightKt.RecurringPaymentInfoSheetContent((RecurringPaymentInfoViewModel.Content) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                Function1 function12 = (Function1) obj5;
                SpendingInsightDetailViewModel spendingInsightDetailViewModel = (SpendingInsightDetailViewModel) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function12);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda1(23, function12);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer2, 0);
                    zzaho.SpendingInsightDetail(spendingInsightDetailViewModel, function12, null, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                RecipientMapper.OverviewSection((SpendingInsightsHomeViewModel.Content.OverviewSection) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                RecipientMapper.ActivitySection((SpendingInsightsHomeViewModel.Content.ActivitySection) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                LocalActivitySetupTeardown.MetroFactory metroFactory = ((ActivityAppletTilePresenter$Factory$Impl) obj4).delegateFactory;
                SessionManager sessionManager = (SessionManager) metroFactory.appForegroundStateProvider.invoke();
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory.sessionManager.invoke();
                RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) metroFactory.syncValueReader.invoke();
                DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) metroFactory.shortlinkHandler.invoke();
                RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory.ioDispatcher.invoke();
                sessionManager.getClass();
                realActivityEmbeddedPresenter$Factory$Impl.getClass();
                realActivitiesCacheManager.getClass();
                defaultActivityItemEventHandler$Factory$Impl.getClass();
                realBalanceSnapshotManager.getClass();
                return new ActivityAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) Presenter.start$default(MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(sessionManager, realActivityEmbeddedPresenter$Factory$Impl, realActivitiesCacheManager, defaultActivityItemEventHandler$Factory$Impl, realBalanceSnapshotManager, navigator)), coroutineScope, (LifecycleOwner) obj5)).getModels());
            case 9:
                PasskeySignatureBlockerViewModel passkeySignatureBlockerViewModel = (PasskeySignatureBlockerViewModel) obj4;
                Function1 function13 = (Function1) obj5;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    KycAppletTileKt.PasskeySignatureBlockerView(passkeySignatureBlockerViewModel, function13, null, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                LiteAddMoneyViewModel liteAddMoneyViewModel = (LiteAddMoneyViewModel) obj4;
                Function1 function14 = (Function1) obj5;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    KycAppletTileKt.LiteAddMoneyView(liteAddMoneyViewModel, function14, null, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                LiteCashInViewModel liteCashInViewModel = (LiteCashInViewModel) obj4;
                Function1 function15 = (Function1) obj5;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    KycAppletTileKt.LiteCashInView(liteCashInViewModel, function15, null, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                KycAppletTileKt.KycAppletTileUI((KycAppletTileModel) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                Navigator navigator2 = (Navigator) obj;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                navigator2.getClass();
                coroutineScope2.getClass();
                FlowStarter flowStarter = (FlowStarter) ((KycAppletTilePresenter$Factory$Impl) obj4).delegateFactory.sandboxer.invoke();
                flowStarter.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new ErrorPresenter(flowStarter, navigator2)), coroutineScope2, (LifecycleOwner) obj5);
                return new KycAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 8), (byte) 0);
            case 14:
                ((Integer) obj2).getClass();
                KycAppletTileKt.AccountDetailRowItem((LiteBalanceHomeViewModel.AccountDetailRow) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                KycAppletTileKt.CashInDetailRow((CashInRowViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                UnlinkResultViewKt.ConfirmRemoveLinkedBusinessContent((RemoveLinkedBusinessViewModel) obj4, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel = (LinkedBusinessDetailsViewModel) obj4;
                Function1 function16 = (Function1) obj5;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion2, Strings.getColors(gapComposer6).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer6, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    SpacerKt.Spacer(gapComposer6, SizeKt.m277height3ABfNKs(companion2, 27.0f));
                    Strings.getSizes(gapComposer6).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    AvatarSize avatarSize = AvatarSize.Size64;
                    long j = Strings.getColors(gapComposer6).semantic.background.subtle;
                    Image image = linkedBusinessDetailsViewModel.image;
                    SyncBusinessGrant.RenderingBehavior renderingBehavior = linkedBusinessDetailsViewModel.renderingBehavior;
                    if (image == null) {
                        gapComposer6.startReplaceGroup(-641633099);
                        gapComposer6.end(false);
                        icon = null;
                    } else {
                        gapComposer6.startReplaceGroup(-641633098);
                        AvatarImage.Remote.Icon icon2 = new AvatarImage.Remote.Icon(ThemablesKt.urlForTheme(image, gapComposer6), false, new AvatarImage.LocalIcon(Icons.Business32, Strings.getColors(gapComposer6).semantic.icon.standard, 4), new RealAppConfigManager$$ExternalSyntheticLambda7(3), 26);
                        gapComposer6.end(false);
                        icon = icon2;
                    }
                    SyncBusinessGrant.RenderingBehavior renderingBehavior2 = SyncBusinessGrant.RenderingBehavior.AFTERPAY;
                    if (renderingBehavior == renderingBehavior2) {
                        gapComposer6.startReplaceGroup(-641099588);
                        AvatarOverlay.LocalIcon localIcon2 = new AvatarOverlay.LocalIcon(12, Strings.getColors(gapComposer6).semantic.background.subtle, 0L, Icons.LogoAfterpay16);
                        gapComposer6.end(false);
                        localIcon = localIcon2;
                    } else {
                        gapComposer6.startReplaceGroup(-640884758);
                        gapComposer6.end(false);
                        localIcon = null;
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry("", j, null, icon, null, localIcon, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), m300paddingVpY3zN4$default, false, gapComposer6, 6, 24);
                    SpacerKt.Spacer(gapComposer6, SizeKt.m277height3ABfNKs(companion2, 12.0f));
                    Strings.getSizes(gapComposer6).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer6).semantic.text.standard, (Composer) gapComposer6, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer6).header, (TextLineBalancing) null, linkedBusinessDetailsViewModel.title, (Map) null, (Function1) null, false);
                    Strings.getSizes(gapComposer6).getClass();
                    SpacerKt.Spacer(gapComposer6, SizeKt.m277height3ABfNKs(companion2, 4.0f));
                    Strings.getSizes(gapComposer6).getClass();
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    SyncBusinessGrant.ActionType actionType = linkedBusinessDetailsViewModel.actionType;
                    if (renderingBehavior == renderingBehavior2) {
                        i = 1546229075;
                        i2 = R.string.business_details_afterpay_description;
                        z = false;
                    } else if (actionType == SyncBusinessGrant.ActionType.LINK_ACCOUNT) {
                        gapComposer6.startReplaceGroup(1546232444);
                        String str = linkedBusinessDetailsViewModel.title;
                        str.getClass();
                        format2 = new MessageFormat(Room.stringResource(gapComposer6, R.string.business_details_description_linked_account)).format(new Object[]{str});
                        format2.getClass();
                        gapComposer6.end(false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer6).semantic.text.subtle, (Composer) gapComposer6, m300paddingVpY3zN4$default2, Strings.getTypography(gapComposer6).bodyMedium, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                        Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer6), companion2, 32.0f, gapComposer6);
                        DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion2, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(1223635504, new CheckDepositAmountKt$$ExternalSyntheticLambda6(19, (Object) linkedBusinessDetailsViewModel, function16), gapComposer6), gapComposer6, 24582, 14);
                        gapComposer6.end(true);
                    } else {
                        z = false;
                        if (actionType == SyncBusinessGrant.ActionType.RECURRING_DEPOSITS) {
                            i = 1546238205;
                            i2 = R.string.business_details_description_sq_btc_conversions;
                        } else {
                            i = 1546241066;
                            i2 = R.string.business_details_description;
                        }
                    }
                    format2 = re$$ExternalSyntheticOutline0.m(gapComposer6, i, i2, gapComposer6, z);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer6).semantic.text.subtle, (Composer) gapComposer6, m300paddingVpY3zN4$default2, Strings.getTypography(gapComposer6).bodyMedium, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                    Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer6), companion2, 32.0f, gapComposer6);
                    DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion2, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(1223635504, new CheckDepositAmountKt$$ExternalSyntheticLambda6(19, (Object) linkedBusinessDetailsViewModel, function16), gapComposer6), gapComposer6, 24582, 14);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                int i6 = 27;
                AvatarBadgeViewModel avatarBadgeViewModel = (AvatarBadgeViewModel) obj4;
                ThemeInfo themeInfo = (ThemeInfo) obj5;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier clip = ClipKt.clip(companion2, RoundedCornerShapeKt.CircleShape);
                    AvatarBadgeViewModel.IconRes iconRes = (AvatarBadgeViewModel.IconRes) avatarBadgeViewModel;
                    Color forThemeComposable = PagerMeasureKt.forThemeComposable(iconRes.backgroundColor, themeInfo, gapComposer7);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, forThemeComposable != null ? forThemeComposable.value : Color.Green, rectangleShapeKt$RectangleShape$1), 26.0f);
                    Painter painterResource = Countries.painterResource(iconRes.resId, 0, gapComposer7);
                    android.graphics.ColorFilter colorFilter4 = iconRes.colorFilter;
                    if (colorFilter4 != null) {
                        if (colorFilter4 instanceof BlendModeColorFilter) {
                            BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter4;
                            long Color = ColorKt.Color(blendModeColorFilter.getColor());
                            switch (AndroidBlendMode_androidKt$WhenMappings.$EnumSwitchMapping$0[blendModeColorFilter.getMode().ordinal()]) {
                                case 1:
                                    i6 = 0;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 2:
                                    i6 = 1;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 3:
                                    i6 = 2;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 4:
                                    i6 = 3;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 5:
                                    i6 = 4;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 6:
                                    i6 = 5;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 7:
                                    i6 = 6;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 8:
                                    i6 = 7;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 9:
                                    i6 = 8;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 10:
                                    i6 = 9;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 11:
                                    i6 = 10;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 12:
                                    i6 = 11;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 13:
                                    i6 = 12;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 14:
                                    i6 = 13;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 15:
                                    i6 = 14;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 16:
                                    i6 = 15;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 17:
                                    i6 = 16;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 18:
                                    i6 = 17;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 19:
                                    i6 = 18;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 20:
                                    i6 = 19;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 21:
                                    i6 = 20;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 22:
                                    i6 = 21;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 23:
                                    i6 = 22;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 24:
                                    i6 = 23;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 25:
                                    i6 = 24;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 26:
                                    i6 = 25;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 27:
                                    i6 = 26;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 28:
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                case 29:
                                    i6 = 28;
                                    colorFilter3 = new androidx.compose.ui.graphics.BlendModeColorFilter(Color, i6, blendModeColorFilter);
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                        } else if (colorFilter4 instanceof LightingColorFilter) {
                            LightingColorFilter lightingColorFilter = (LightingColorFilter) colorFilter4;
                            colorFilter3 = new androidx.compose.ui.graphics.LightingColorFilter(ColorKt.Color(lightingColorFilter.getColorMultiply()), ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter4);
                        } else {
                            if (colorFilter4 instanceof ColorMatrixColorFilter) {
                                androidx.compose.ui.graphics.ColorMatrixColorFilter colorMatrixColorFilter = new androidx.compose.ui.graphics.ColorMatrixColorFilter(colorFilter4);
                                colorMatrixColorFilter.colorMatrix = null;
                                colorFilter2 = colorMatrixColorFilter;
                            } else {
                                colorFilter2 = new ColorFilter(colorFilter4);
                            }
                            colorFilter3 = colorFilter2;
                        }
                        colorFilter = colorFilter3;
                    } else {
                        colorFilter = null;
                    }
                    ImageKt.Image(painterResource, null, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, colorFilter, gapComposer7, Painter.$stable | 48, 56);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                SegmentedBarChartKt.Legend((SegmentedBarChartViewModel.Legend) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                Function1 function17 = (Function1) obj5;
                CheckDepositAmountViewModel checkDepositAmountViewModel = (CheckDepositAmountViewModel) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                boolean shouldExecute = gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2);
                Applier applier = gapComposer8.applier;
                if (shouldExecute) {
                    boolean changed2 = gapComposer8.changed(function17);
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (changed2 || rememberedValue2 == obj3) {
                        rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(3, function17);
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer8, 0, 1);
                    UiScopeKt.UiScope(CheckDepositAmountKt.lambda$1873405880, gapComposer8, 6);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                    Colors colors = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier imePadding = SpacerKt.imePadding(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer8, 0);
                    int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, imePadding);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(function0);
                    } else {
                        gapComposer8.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer8, valueOf, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer8, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        companion = companion2;
                        rememberedValue3 = Updater.mutableStateOf$default(new TextFieldValue("", 0L, 6));
                        gapComposer8.updateRememberedValue(rememberedValue3);
                    } else {
                        companion = companion2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    }
                    MutableState mutableState = (MutableState) rememberedValue3;
                    Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer8, 1);
                    Object rememberedValue4 = gapComposer8.rememberedValue();
                    Object obj6 = rememberedValue4;
                    if (rememberedValue4 == obj3) {
                        MoneyScrubber moneyScrubber = new MoneyScrubber(CurrencyCode.USD, Integer.valueOf(checkDepositAmountViewModel.maxWholeDigits));
                        moneyScrubber.onInvalidContentListener = new CheckDepositAmountKt$$ExternalSyntheticLambda3(0, rememberShaker);
                        gapComposer8.updateRememberedValue(moneyScrubber);
                        obj6 = moneyScrubber;
                    }
                    Object obj7 = (MoneyScrubber) obj6;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed3 = gapComposer8.changed(function17);
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (changed3 || rememberedValue5 == obj3) {
                        rememberedValue5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(4, function17);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, gapComposer8, 54, 108);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer8), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer8, 0);
                    int hashCode3 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer8, verticalScroll$default);
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(function0);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer8, composeUiNode$Companion$SetModifier$14, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer8, materializeModifier3, composeUiNode$Companion$SetModifier$1);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer8, null);
                    Countries.PageHeader(checkDepositAmountViewModel.title, (Modifier) null, (Function2) null, checkDepositAmountViewModel.body, gapComposer8, 0, 6);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer8, null);
                    ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier focusRequester = FocusTraversalKt.focusRequester(SharedViewEventsKt.shakeWith(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), rememberShaker), DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer8));
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 9, 0, (Boolean) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                    String stringResource = Room.stringResource(gapComposer8, R.string.arcade_check_deposit_amount_input_placeholder);
                    boolean changed4 = gapComposer8.changed((TextFieldValue) mutableState.getValue());
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    if (changed4 || rememberedValue6 == obj3) {
                        CurrencyCode currencyCode = CurrencyCode.USD;
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        CurrencyConfig currencyConfig = CurrencyConfig.Companion.toCurrencyConfig(currencyCode, locale);
                        rememberedValue6 = new MaskVisualTransformation(EdgeEffectCompat.moneyFormatMask(currencyConfig, ((TextFieldValue) mutableState.getValue()).annotatedString.text), new zzb(currencyConfig));
                        gapComposer8.updateRememberedValue(rememberedValue6);
                    }
                    MaskVisualTransformation maskVisualTransformation = (MaskVisualTransformation) rememberedValue6;
                    boolean changedInstance = gapComposer8.changedInstance(obj7) | gapComposer8.changed(function17);
                    Object rememberedValue7 = gapComposer8.rememberedValue();
                    if (changedInstance || rememberedValue7 == obj3) {
                        rememberedValue7 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(obj7, function17, mutableState, 14);
                        gapComposer8.updateRememberedValue(rememberedValue7);
                    }
                    InputFieldKt.InputField(textFieldValue, (Function1) rememberedValue7, focusRequester, (InputState) null, (Function2) null, (Function2) null, (Function2) null, (Function3) null, stringResource, keyboardOptions, (KeyboardActions) null, maskVisualTransformation, gapComposer8, 805306368, 0, 1272);
                    gapComposer8.end(true);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-2045793085, new CheckDepositAmountKt$$ExternalSyntheticLambda6(0, (Object) checkDepositAmountViewModel, (Object) function17), gapComposer8), gapComposer8, 24576, 15);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Function1 function18 = (Function1) obj5;
                ConfirmBackOfCheckViewModel confirmBackOfCheckViewModel = (ConfirmBackOfCheckViewModel) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                boolean shouldExecute2 = gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2);
                Applier applier2 = gapComposer9.applier;
                if (shouldExecute2) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                    Colors colors2 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer9, 0);
                    int hashCode4 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer9, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer9.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$16);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$17);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer9, valueOf2, composeUiNode$Companion$SetModifier$18);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer9, materializeModifier4, composeUiNode$Companion$SetModifier$19);
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed5 = gapComposer9.changed(function18);
                    Object rememberedValue8 = gapComposer9.rememberedValue();
                    if (changed5 || rememberedValue8 == obj3) {
                        rememberedValue8 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(6, function18);
                        gapComposer9.updateRememberedValue(rememberedValue8);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, gapComposer9, 54, 108);
                    Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer9), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer9, 0);
                    int hashCode5 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer9, verticalScroll$default2);
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$16);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$17);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer9, composeUiNode$Companion$SetModifier$18, gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer9, materializeModifier5, composeUiNode$Companion$SetModifier$19);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer9, null);
                    Countries.PageHeader(confirmBackOfCheckViewModel.title, (Modifier) null, (Function2) null, confirmBackOfCheckViewModel.description, gapComposer9, 0, 6);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer9, null);
                    CheckDepositAmountKt.ArcadeAnnotatedBackOfCheck(confirmBackOfCheckViewModel.endorsementInstructions, gapComposer9, 0);
                    gapComposer9.end(true);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2113664891, new BulletinTileKt$$ExternalSyntheticLambda6(confirmBackOfCheckViewModel, 28), gapComposer9);
                    boolean changed6 = gapComposer9.changed(function18) | gapComposer9.changedInstance(confirmBackOfCheckViewModel);
                    Object rememberedValue9 = gapComposer9.rememberedValue();
                    if (changed6 || rememberedValue9 == obj3) {
                        rememberedValue9 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(27, (Object) confirmBackOfCheckViewModel, function18);
                        gapComposer9.updateRememberedValue(rememberedValue9);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue9, false, false, null, null, 0L, new CellDefaultAccessory.Checkbox(confirmBackOfCheckViewModel.isConfirmationChecked), null, gapComposer9, 6, 1530);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer9, null);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(537853575, new CheckDepositAmountKt$$ExternalSyntheticLambda6(21, (Object) confirmBackOfCheckViewModel, (Object) function18), gapComposer9), gapComposer9, 24576, 15);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Function1 function19 = (Function1) obj5;
                ConfirmFrontOfCheckViewModel confirmFrontOfCheckViewModel = (ConfirmFrontOfCheckViewModel) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                boolean shouldExecute3 = gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2);
                Applier applier3 = gapComposer10.applier;
                if (shouldExecute3) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion2, 1.0f);
                    Colors colors3 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Modifier systemBarsPadding2 = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$13 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal3 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal3, gapComposer10, 0);
                    int hashCode6 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer10, systemBarsPadding2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier3 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer10.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy6, composeUiNode$Companion$SetModifier$110);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$111);
                    Integer valueOf3 = Integer.valueOf(hashCode6);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer10, valueOf3, composeUiNode$Companion$SetModifier$112);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$113 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer10, materializeModifier6, composeUiNode$Companion$SetModifier$113);
                    NavigationType navigationType3 = NavigationType.BACK;
                    boolean changed7 = gapComposer10.changed(function19);
                    Object rememberedValue10 = gapComposer10.rememberedValue();
                    if (changed7 || rememberedValue10 == obj3) {
                        rememberedValue10 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(8, function19);
                        gapComposer10.updateRememberedValue(rememberedValue10);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue10, (Modifier) null, (Function3) null, gapComposer10, 54, 108);
                    Modifier verticalScroll$default3 = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer10), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal3, gapComposer10, 0);
                    int hashCode7 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer10, verticalScroll$default3);
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy7, composeUiNode$Companion$SetModifier$110);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$111);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode7, gapComposer10, composeUiNode$Companion$SetModifier$112, gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    Updater.m576setimpl(gapComposer10, materializeModifier7, composeUiNode$Companion$SetModifier$113);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                    Countries.PageHeader(confirmFrontOfCheckViewModel.title, (Modifier) null, (Function2) null, confirmFrontOfCheckViewModel.description, gapComposer10, 0, 6);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer10, null);
                    CheckDepositAmountKt.ArcadeAnnotatedFrontOfCheck(confirmFrontOfCheckViewModel.nameConfirmation, confirmFrontOfCheckViewModel.amountConfirmation, gapComposer10, 0);
                    gapComposer10.end(true);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-261657247, new BulletinTileKt$$ExternalSyntheticLambda6(confirmFrontOfCheckViewModel, 29), gapComposer10);
                    boolean changed8 = gapComposer10.changed(function19) | gapComposer10.changedInstance(confirmFrontOfCheckViewModel);
                    Object rememberedValue11 = gapComposer10.rememberedValue();
                    if (changed8 || rememberedValue11 == obj3) {
                        rememberedValue11 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(28, (Object) confirmFrontOfCheckViewModel, function19);
                        gapComposer10.updateRememberedValue(rememberedValue11);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda2, null, (Function0) rememberedValue11, false, false, null, null, 0L, new CellDefaultAccessory.Checkbox(confirmFrontOfCheckViewModel.isConfirmationChecked), null, gapComposer10, 6, 1530);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer10, null);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1264026923, new CheckDepositAmountKt$$ExternalSyntheticLambda6(22, (Object) confirmFrontOfCheckViewModel, (Object) function19), gapComposer10), gapComposer10, 24576, 15);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$checks$VerifyCheckDepositKt$$ExternalSyntheticLambda0(obj, obj2);
            case 24:
                return invoke$com$squareup$cash$checks$VerifyCheckDialogView$$ExternalSyntheticLambda0(obj, obj2);
            case 25:
                return invoke$com$squareup$cash$common$composeui$ClusteredAvatarsKt$$ExternalSyntheticLambda2(obj, obj2);
            case 26:
                return invoke$com$squareup$cash$common$composeui$ClusteredAvatarsKt$$ExternalSyntheticLambda4(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$common$composeui$InfoUpsellCtaButtonScope$$ExternalSyntheticLambda2(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$common$messaging$views$FailureMessageDialogView$$ExternalSyntheticLambda0(obj, obj2);
            default:
                Function1 function110 = (Function1) obj5;
                FailureMessageFullScreenViewModel failureMessageFullScreenViewModel = (FailureMessageFullScreenViewModel) obj4;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Modifier fillMaxSize4 = SizeKt.fillMaxSize(companion2, 1.0f);
                    Colors colors4 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Modifier systemBarsPadding3 = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize4, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer11, 0);
                    int hashCode8 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer11, systemBarsPadding3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy8, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                    NavigationType navigationType4 = NavigationType.CLOSE;
                    boolean changed9 = gapComposer11.changed(function110);
                    Object rememberedValue12 = gapComposer11.rememberedValue();
                    if (changed9 || rememberedValue12 == obj3) {
                        rememberedValue12 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(i4, function110);
                        gapComposer11.updateRememberedValue(rememberedValue12);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType4, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue12, (Modifier) null, (Function3) null, gapComposer11, 54, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer11, null);
                    Countries.PageHeader(failureMessageFullScreenViewModel.title, (Modifier) null, FailureMessageFullScreenViewKt.f361lambda$1145824084, failureMessageFullScreenViewModel.message, gapComposer11, MLKEMEngine.KyberPolyBytes, 2);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer11, null);
                    SpacerKt.Spacer(gapComposer11, new LayoutWeightElement(1.0f, true));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(785883875, new BookletGridKt$$ExternalSyntheticLambda1(22, function110), gapComposer11), gapComposer11, 24576, 15);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda6(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda6(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
