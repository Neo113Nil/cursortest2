package com.squareup.cash.savings.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoConfirmationViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.components.text.InlineIconPosition;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.cash.reactions.views.ChooseReactionOverlay$animateReactionToTop$lambda$0$$inlined$doOnEnd$1;
import com.squareup.cash.reactions.views.ReactionView;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt;
import com.squareup.cash.savings.viewmodels.CellDefaultViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.securityhub.viewmodels.BookletViewModel;
import com.squareup.cash.securityhub.viewmodels.EducationCardUiModel;
import com.squareup.cash.securityhub.viewmodels.RecoveryGuideViewModel;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewModel;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCancelPlanDialogViewModel;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastViewModel;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.workflow1.Worker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class ButtonGroupKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ButtonGroupKt$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final Object invoke$com$squareup$cash$securityhub$views$RecoveryGuideViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        RecoveryGuideViewModel recoveryGuideViewModel = (RecoveryGuideViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            String str = recoveryGuideViewModel.pageHeaderTitle;
            TextStyle textStyle = Strings.getTypography(gapComposer).pageTitle;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            String str2 = recoveryGuideViewModel.pageHeaderBody;
            TextStyle textStyle2 = Strings.getTypography(gapComposer).bodyMedium;
            long j2 = Strings.getColors(gapComposer).semantic.text.standard;
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$autofill$views$EditAutofillViewKt$$ExternalSyntheticLambda28(Object obj, Object obj2, Object obj3) {
        EditAutofillViewModel.Content content = (EditAutofillViewModel.Content) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.buttonText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$autofill$views$content$LoadedContentKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        AutofillViewModel.Loaded loaded = (AutofillViewModel.Loaded) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded.ctaText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$sup$views$SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        SingleUsePaymentCancelPlanDialogViewModel singleUsePaymentCancelPlanDialogViewModel = (SingleUsePaymentCancelPlanDialogViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, singleUsePaymentCancelPlanDialogViewModel.primaryButtonText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v23, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        Modifier.Companion companion;
        ComposableLambdaImpl composableLambdaImpl;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup buttonGroup = (SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonGroup.primaryButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                EnableAliasSheetViewModel enableAliasSheetViewModel = (EnableAliasSheetViewModel) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, (enableAliasSheetViewModel.phoneAliases.size() > 1 || enableAliasSheetViewModel.emailAliases.size() > 1) ? R.string.enable_alias_cta_multiple : R.string.enable_alias_cta_single), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ProfileNotificationsViewModel.Loaded.NotificationMessage notificationMessage = (ProfileNotificationsViewModel.Loaded.NotificationMessage) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.LinkOut16, notificationMessage.buttonText, (Modifier) null, 0L, gapComposer3, 6, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, notificationMessage.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ArcadeAutofillSettingsDetailViewModel arcadeAutofillSettingsDetailViewModel = (ArcadeAutofillSettingsDetailViewModel) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ArcadeAutofillSettingsDetailViewModel.ErrorViewModel) arcadeAutofillSettingsDetailViewModel).ctaButton, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ArcadeAutofillSettingsDetailViewModel.Content content = (ArcadeAutofillSettingsDetailViewModel.Content) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                PersonalInfoConfirmationViewModel personalInfoConfirmationViewModel = (PersonalInfoConfirmationViewModel) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, personalInfoConfirmationViewModel.primaryButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel = (ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Integer num = profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel.numAllowedAccounts;
                    if (num == null || (str = String.valueOf(num.intValue())) == null) {
                        str = "";
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, qrAddressScannerViewModel.pasteButtonTitle, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ChooseReactionOverlay chooseReactionOverlay = (ChooseReactionOverlay) obj4;
                Reaction reaction = (Reaction) obj;
                View view = (View) obj2;
                View view2 = (View) obj3;
                reaction.getClass();
                view.getClass();
                view2.getClass();
                chooseReactionOverlay.goToStateAnimator(ChooseReactionOverlay.State.AcceptingInput).start();
                chooseReactionOverlay.activeReactionAnimations++;
                PointF positionRelativeTo = Views.positionRelativeTo(view, view2);
                Context context = chooseReactionOverlay.getContext();
                context.getClass();
                ReactionView reactionView = new ReactionView(context, reaction);
                reactionView.setHasBackgroundOutline(true);
                float width = (view.getWidth() / 2.0f) + positionRelativeTo.x;
                int i3 = chooseReactionOverlay.reactionViewSize;
                float f = i3 / 2;
                reactionView.setX(width - f);
                reactionView.setY(((view.getHeight() / 2.0f) + positionRelativeTo.y) - f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(reactionView, "y", (view2.getY() - i3) - chooseReactionOverlay.reactionHoverOffset);
                ofFloat.setInterpolator(new OvershootInterpolator(3.0f));
                ofFloat.setDuration(250L);
                ofFloat.addListener(new ChooseReactionOverlay$animateReactionToTop$lambda$0$$inlined$doOnEnd$1(chooseReactionOverlay, reactionView, 1));
                ofFloat.start();
                chooseReactionOverlay.reactionViews.add(reactionView);
                chooseReactionOverlay.addView(reactionView);
                chooseReactionOverlay.vibrator.vibrate(50L);
                return Unit.INSTANCE;
            case 9:
                PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData = (PaymentPlanSummaryViewModel.BottomSheetData) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    PaymentPlanSummaryKt.PaymentPlanSummaryBottomSheetContent(bottomSheetData, SpacerKt.padding(companion2, paddingValues), gapComposer9, 0, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                PaymentPlanSummaryViewModel.SubmitButton submitButton = (PaymentPlanSummaryViewModel.SubmitButton) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, submitButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                PaymentPlanSummaryViewModel.SummarySection summarySection = (PaymentPlanSummaryViewModel.SummarySection) obj4;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    for (final PaymentPlanSummaryViewModel.SummarySection.DetailItem detailItem : summarySection.detailItems) {
                        final int i4 = r13 ? 1 : 0;
                        final int i5 = 1;
                        listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(1692401602, new Function2() { // from class: com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i6 = i4;
                                PaymentPlanSummaryViewModel.SummarySection.DetailItem detailItem2 = detailItem;
                                switch (i6) {
                                    case 0:
                                        Composer composer12 = (Composer) obj5;
                                        int intValue12 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer12 = (GapComposer) composer12;
                                        if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                            Worker.DefaultImpls.appendMarkdown$default(builder, detailItem2.label, null, 6);
                                            Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer12.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer13 = (Composer) obj5;
                                        int intValue13 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer13;
                                        if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                            AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                                            Worker.DefaultImpls.appendMarkdown$default(builder2, detailItem2.value, null, 6);
                                            Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer13, (Modifier) null, builder2.toAnnotatedString(), ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer11), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(371783711, new Function2() { // from class: com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda40
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i6 = i5;
                                PaymentPlanSummaryViewModel.SummarySection.DetailItem detailItem2 = detailItem;
                                switch (i6) {
                                    case 0:
                                        Composer composer12 = (Composer) obj5;
                                        int intValue12 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer12 = (GapComposer) composer12;
                                        if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                            Worker.DefaultImpls.appendMarkdown$default(builder, detailItem2.label, null, 6);
                                            Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer12.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer13 = (Composer) obj5;
                                        int intValue13 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer13;
                                        if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                            AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                                            Worker.DefaultImpls.appendMarkdown$default(builder2, detailItem2.value, null, 6);
                                            Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer13, (Modifier) null, builder2.toAnnotatedString(), ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer11), (Function2) null, gapComposer11, ((intValue11 << 15) & 458752) | 3078, 22);
                    }
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                PaymentPlanSummaryViewModel.PurchasesSection.ActionButton actionButton = (PaymentPlanSummaryViewModel.PurchasesSection.ActionButton) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Image image = actionButton.icon;
                    if (image == null) {
                        gapComposer12.startReplaceGroup(-1030613309);
                        gapComposer12.end(false);
                    } else {
                        gapComposer12.startReplaceGroup(-1030613308);
                        gapComposer12.startReplaceGroup(659492410);
                        float mo231toDpGaN1DYA = ((Density) gapComposer12.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Strings.getCurrentTextStyle(gapComposer12).spanStyle.fontSize);
                        gapComposer12.end(false);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, mo231toDpGaN1DYA);
                        Object rememberedValue = gapComposer12.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda8(29);
                            gapComposer12.updateRememberedValue(rememberedValue);
                        }
                        Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m285size3ABfNKs, (Function1) rememberedValue);
                        AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer12, ThemablesKt.urlForTheme(image, gapComposer12));
                        long currentTextColor = Strings.getCurrentTextColor(gapComposer12);
                        ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, null, clearAndSetSemantics, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(currentTextColor, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(currentTextColor), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer12, 48, 56);
                        gapComposer12.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, actionButton.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                SelectPaymentPlanViewModel.TimelineEvent timelineEvent = (SelectPaymentPlanViewModel.TimelineEvent) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, timelineEvent.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet infoHalfSheet = (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.InfoHalfSheet) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoHalfSheet.dismissButtonTitle, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                CellDefaultViewModel.Accessory accessory = (CellDefaultViewModel.Accessory) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((CellDefaultViewModel.Accessory.CompactButton) accessory).text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer footer = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalMet) footer).button.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement = (SavingsScreenViewModel.Content.SavingsScreenElement) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((SavingsScreenViewModel.Content.SavingsScreenElement.CompactCard) savingsScreenElement).button.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                TransferringViewModel.Error error = (TransferringViewModel.Error) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, error.actionText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ScoreAppletTileViewModel.Installed installed = (ScoreAppletTileViewModel.Installed) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                boolean shouldExecute = gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16);
                Applier applier = gapComposer19.applier;
                if (shouldExecute) {
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    BiasAlignment.Vertical vertical = Alignment.Companion.Bottom;
                    Strings.getSizes(gapComposer19).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer19, 54);
                    int hashCode = Long.hashCode(gapComposer19.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer19.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer19, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer19.startReusableNode();
                    if (gapComposer19.inserting) {
                        gapComposer19.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer19.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer19, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer19, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer19, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer19, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer19, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer19, 0);
                    int hashCode2 = Long.hashCode(gapComposer19.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer19.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer19, m);
                    gapComposer19.startReusableNode();
                    if (gapComposer19.inserting) {
                        gapComposer19.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer19.useNode();
                    }
                    Updater.m576setimpl(gapComposer19, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer19, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer19, composeUiNode$Companion$SetModifier$13, gapComposer19, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer19, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    String str2 = installed.scoreText;
                    List list = installed.graphItems;
                    ScoreAppletTileViewModel.Installed.Subtitle subtitle = installed.subtitle;
                    String str3 = subtitle.emphasis;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer19, (Modifier) null, Strings.getTypography(gapComposer19).numeralSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    long j = Strings.getColors(gapComposer19).semantic.text.standard;
                    long j2 = Strings.getColors(gapComposer19).semantic.text.placeholder;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    String str4 = subtitle.brief;
                    if (str3 != null) {
                        int pushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                        try {
                            builder.append((CharSequence) str3);
                            builder.pop(pushStyle);
                            if (str4 != null) {
                                builder.append(" ");
                            }
                        } finally {
                        }
                    }
                    if (str4 != null) {
                        int pushStyle2 = builder.pushStyle(new SpanStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                        try {
                            builder.append((CharSequence) str4);
                        } finally {
                        }
                    }
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    TextStyle textStyle = Strings.getTypography(gapComposer19).helpText;
                    gapComposer19.startReplaceGroup(-2141077728);
                    String str5 = subtitle.accessibilityDescription;
                    if (str5 != null) {
                        boolean changed = gapComposer19.changed(str5);
                        Object rememberedValue2 = gapComposer19.rememberedValue();
                        Object obj5 = rememberedValue2;
                        if (changed || rememberedValue2 == neverEqualPolicy) {
                            RealSandboxer$$ExternalSyntheticLambda1 realSandboxer$$ExternalSyntheticLambda1 = new RealSandboxer$$ExternalSyntheticLambda1(str5, 9);
                            gapComposer19.updateRememberedValue(realSandboxer$$ExternalSyntheticLambda1);
                            obj5 = realSandboxer$$ExternalSyntheticLambda1;
                        }
                        companion = SemanticsModifierKt.clearAndSetSemantics(companion3, (Function1) obj5);
                    } else {
                        companion = companion3;
                    }
                    gapComposer19.end(false);
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer19, (Modifier) companion, annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                    gapComposer19.end(true);
                    if (list.isEmpty()) {
                        gapComposer19.startReplaceGroup(1642163033);
                        ViewPropertyAnimatorListenerAdapter.ScoreAppletLemon(gapComposer19, 0);
                        gapComposer19.end(false);
                    } else {
                        gapComposer19.startReplaceGroup(1642212881);
                        ViewPropertyAnimatorListenerAdapter.HistoricalScoreGraph(48, gapComposer19, SizeKt.wrapContentWidth$default(SizeKt.m277height3ABfNKs(companion3, 64.0f), null, 3), list);
                        gapComposer19.end(false);
                    }
                    gapComposer19.end(true);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData = (CashCreditScoreHomeData.ScoreSummaryOverlayData) obj4;
                ListUnorderedScope listUnorderedScope2 = (ListUnorderedScope) obj;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                listUnorderedScope2.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer20).changed(listUnorderedScope2) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    for (final CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem listItem : scoreSummaryOverlayData.list) {
                        LocalizedString localizedString = listItem.body_text;
                        String str6 = localizedString != null ? localizedString.translated_value : null;
                        if (str6 == null) {
                            gapComposer20.startReplaceGroup(442815193);
                            gapComposer20.end(false);
                            composableLambdaImpl = null;
                        } else {
                            gapComposer20.startReplaceGroup(442815194);
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-424027593, new InfoSectionKt$$ExternalSyntheticLambda7(str6, 21), gapComposer20);
                            gapComposer20.end(false);
                            composableLambdaImpl = rememberComposableLambda;
                        }
                        final int i6 = r13 ? 1 : 0;
                        listUnorderedScope2.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(-178140782, new Function2() { // from class: com.squareup.cash.score.views.ScoreSummarySheetKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Color m2;
                                Icons icons;
                                String str7;
                                int i7 = i6;
                                CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem listItem2 = listItem;
                                switch (i7) {
                                    case 0:
                                        Composer composer21 = (Composer) obj6;
                                        int intValue21 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer21 = (GapComposer) composer21;
                                        if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                                            LocalizedString localizedString2 = listItem2.text;
                                            localizedString2.getClass();
                                            String str8 = localizedString2.translated_value;
                                            str8.getClass();
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer21.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer22 = (Composer) obj6;
                                        int intValue22 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer22 = (GapComposer) composer22;
                                        if (gapComposer22.shouldExecute(1 & intValue22, (intValue22 & 3) != 2)) {
                                            com.squareup.protos.cash.ui.Color color = listItem2.accessory_color;
                                            if (color == null) {
                                                gapComposer22.startReplaceGroup(1310033287);
                                                gapComposer22.end(false);
                                                m2 = null;
                                            } else {
                                                m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer22, -234835526, color, gapComposer22, false);
                                            }
                                            long j3 = m2 != null ? m2.value : Color.Unspecified;
                                            Icon icon = listItem2.accessory_icon;
                                            if (icon == null || (str7 = icon.arcade_id) == null) {
                                                icons = null;
                                            } else {
                                                Icons.Companion.getClass();
                                                icons = zzd.get(str7);
                                            }
                                            LocalizedString localizedString3 = listItem2.accessory_text;
                                            String str9 = localizedString3 != null ? localizedString3.translated_value : null;
                                            LocalizedString localizedString4 = listItem2.accessory_accessibility_description;
                                            String str10 = localizedString4 != null ? localizedString4.translated_value : null;
                                            Modifier modifier = Modifier.Companion.$$INSTANCE;
                                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                            if (icons != null && str9 != null) {
                                                gapComposer22.startReplaceGroup(1310481269);
                                                Painter painter = icons.painter(gapComposer22);
                                                InlineIconPosition inlineIconPosition = InlineIconPosition.START;
                                                gapComposer22.startReplaceGroup(-234810897);
                                                if (str10 != null) {
                                                    boolean changed2 = gapComposer22.changed(str10);
                                                    Object rememberedValue3 = gapComposer22.rememberedValue();
                                                    if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                                                        rememberedValue3 = new RealSandboxer$$ExternalSyntheticLambda1(str10, 13);
                                                        gapComposer22.updateRememberedValue(rememberedValue3);
                                                    }
                                                    modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue3);
                                                }
                                                gapComposer22.end(false);
                                                zzacp.m2014InlineIconTextQqsJerU(str9, painter, modifier, j3, inlineIconPosition, null, j3, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer22, (Painter.$stable << 3) | 24576, 0, 32672);
                                                gapComposer22.end(false);
                                            } else if (str9 != null) {
                                                gapComposer22.startReplaceGroup(1311061124);
                                                gapComposer22.startReplaceGroup(-234797617);
                                                if (str10 != null) {
                                                    boolean changed3 = gapComposer22.changed(str10);
                                                    Object rememberedValue4 = gapComposer22.rememberedValue();
                                                    if (changed3 || rememberedValue4 == neverEqualPolicy2) {
                                                        rememberedValue4 = new RealSandboxer$$ExternalSyntheticLambda1(str10, 14);
                                                        gapComposer22.updateRememberedValue(rememberedValue4);
                                                    }
                                                    modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue4);
                                                }
                                                gapComposer22.end(false);
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, j3, (Composer) gapComposer22, modifier, (TextStyle) null, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                                                gapComposer22.end(false);
                                            } else if (icons != null) {
                                                gapComposer22.startReplaceGroup(1311449585);
                                                Trace.m1191Iconww6aTOc(icons, str10, (Modifier) null, j3, gapComposer22, 0, 4);
                                                gapComposer22.end(false);
                                            } else {
                                                gapComposer22.startReplaceGroup(1311681682);
                                                gapComposer22.end(false);
                                            }
                                        } else {
                                            gapComposer22.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer20), (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1631527472, new Function2() { // from class: com.squareup.cash.score.views.ScoreSummarySheetKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Color m2;
                                Icons icons;
                                String str7;
                                int i7 = i2;
                                CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem listItem2 = listItem;
                                switch (i7) {
                                    case 0:
                                        Composer composer21 = (Composer) obj6;
                                        int intValue21 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer21 = (GapComposer) composer21;
                                        if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                                            LocalizedString localizedString2 = listItem2.text;
                                            localizedString2.getClass();
                                            String str8 = localizedString2.translated_value;
                                            str8.getClass();
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer21.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer22 = (Composer) obj6;
                                        int intValue22 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer22 = (GapComposer) composer22;
                                        if (gapComposer22.shouldExecute(1 & intValue22, (intValue22 & 3) != 2)) {
                                            com.squareup.protos.cash.ui.Color color = listItem2.accessory_color;
                                            if (color == null) {
                                                gapComposer22.startReplaceGroup(1310033287);
                                                gapComposer22.end(false);
                                                m2 = null;
                                            } else {
                                                m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer22, -234835526, color, gapComposer22, false);
                                            }
                                            long j3 = m2 != null ? m2.value : Color.Unspecified;
                                            Icon icon = listItem2.accessory_icon;
                                            if (icon == null || (str7 = icon.arcade_id) == null) {
                                                icons = null;
                                            } else {
                                                Icons.Companion.getClass();
                                                icons = zzd.get(str7);
                                            }
                                            LocalizedString localizedString3 = listItem2.accessory_text;
                                            String str9 = localizedString3 != null ? localizedString3.translated_value : null;
                                            LocalizedString localizedString4 = listItem2.accessory_accessibility_description;
                                            String str10 = localizedString4 != null ? localizedString4.translated_value : null;
                                            Modifier modifier = Modifier.Companion.$$INSTANCE;
                                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                            if (icons != null && str9 != null) {
                                                gapComposer22.startReplaceGroup(1310481269);
                                                Painter painter = icons.painter(gapComposer22);
                                                InlineIconPosition inlineIconPosition = InlineIconPosition.START;
                                                gapComposer22.startReplaceGroup(-234810897);
                                                if (str10 != null) {
                                                    boolean changed2 = gapComposer22.changed(str10);
                                                    Object rememberedValue3 = gapComposer22.rememberedValue();
                                                    if (changed2 || rememberedValue3 == neverEqualPolicy2) {
                                                        rememberedValue3 = new RealSandboxer$$ExternalSyntheticLambda1(str10, 13);
                                                        gapComposer22.updateRememberedValue(rememberedValue3);
                                                    }
                                                    modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue3);
                                                }
                                                gapComposer22.end(false);
                                                zzacp.m2014InlineIconTextQqsJerU(str9, painter, modifier, j3, inlineIconPosition, null, j3, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer22, (Painter.$stable << 3) | 24576, 0, 32672);
                                                gapComposer22.end(false);
                                            } else if (str9 != null) {
                                                gapComposer22.startReplaceGroup(1311061124);
                                                gapComposer22.startReplaceGroup(-234797617);
                                                if (str10 != null) {
                                                    boolean changed3 = gapComposer22.changed(str10);
                                                    Object rememberedValue4 = gapComposer22.rememberedValue();
                                                    if (changed3 || rememberedValue4 == neverEqualPolicy2) {
                                                        rememberedValue4 = new RealSandboxer$$ExternalSyntheticLambda1(str10, 14);
                                                        gapComposer22.updateRememberedValue(rememberedValue4);
                                                    }
                                                    modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue4);
                                                }
                                                gapComposer22.end(false);
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, j3, (Composer) gapComposer22, modifier, (TextStyle) null, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                                                gapComposer22.end(false);
                                            } else if (icons != null) {
                                                gapComposer22.startReplaceGroup(1311449585);
                                                Trace.m1191Iconww6aTOc(icons, str10, (Modifier) null, j3, gapComposer22, 0, 4);
                                                gapComposer22.end(false);
                                            } else {
                                                gapComposer22.startReplaceGroup(1311681682);
                                                gapComposer22.end(false);
                                            }
                                        } else {
                                            gapComposer22.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer20), (Function2) null, composableLambdaImpl, gapComposer20, ((intValue20 << 15) & 458752) | 390, 10);
                    }
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                BookletViewModel bookletViewModel = (BookletViewModel) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer21, 0);
                    int hashCode3 = Long.hashCode(gapComposer21.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer21.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer21, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer21.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer21.startReusableNode();
                    if (gapComposer21.inserting) {
                        gapComposer21.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer21.useNode();
                    }
                    Updater.m576setimpl(gapComposer21, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer21, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer21, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer21, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer21, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer21, null);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer21, null);
                    ViewfinderKt.HeroHeader(bookletViewModel.pageHeaderTitle, (Modifier) null, (String) null, (TextStyle) null, gapComposer21, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer21, null);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer21, null);
                    String str7 = bookletViewModel.pageHeaderBody;
                    TextStyle textStyle2 = ((Typography) gapComposer21.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                    } else {
                        gapComposer21.startReplaceGroup(-1762997739);
                        gapComposer21.end(false);
                    }
                    long j3 = colors.semantic.text.standard;
                    ((DefaultSizes) gapComposer21.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j3, (Composer) gapComposer21, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle2, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer21, null);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer21, null);
                    gapComposer21.end(true);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                EducationCardUiModel educationCardUiModel = (EducationCardUiModel) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    AsyncImageKt.m1438AsyncImage10Xjiaw(educationCardUiModel.imageUrl, null, SizeKt.fillMaxSize(companion2, 1.0f), null, ContentScale.Companion.Crop, null, gapComposer22, 1573296, 1976);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$securityhub$views$RecoveryGuideViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 24:
                EditAutofillViewModel editAutofillViewModel = (EditAutofillViewModel) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((EditAutofillViewModel.ErrorViewModel) editAutofillViewModel).ctaButton, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                return invoke$com$squareup$cash$shopping$autofill$views$EditAutofillViewKt$$ExternalSyntheticLambda28(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$shopping$autofill$views$content$LoadedContentKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$shopping$sup$views$SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 28:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ShopErrorKt.CashAppPayInfoToast(SpacerKt.m298padding3ABfNKs(companion2, 10.0f), (PaykitInfoToastViewModel) obj4, (Composer) obj2, 6, 0);
                return Unit.INSTANCE;
            default:
                BasicShieetScope$$ExternalSyntheticLambda10 basicShieetScope$$ExternalSyntheticLambda10 = (BasicShieetScope$$ExternalSyntheticLambda10) obj4;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer24).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    Icons icons = Icons.Refresh24;
                    String stringResource = Room.stringResource(gapComposer24, R.string.refresh_content_description);
                    boolean changed2 = gapComposer24.changed(basicShieetScope$$ExternalSyntheticLambda10);
                    Object rememberedValue3 = gapComposer24.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BottomSheet$$ExternalSyntheticLambda2(basicShieetScope$$ExternalSyntheticLambda10, 23);
                        gapComposer24.updateRememberedValue(rememberedValue3);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue3, null, null, null, null, null, null, false, gapComposer24, (intValue24 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
