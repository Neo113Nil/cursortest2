package com.squareup.cash.profile.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewModel;
import com.squareup.cash.account.settings.viewmodels.ErrorViewModel;
import com.squareup.cash.account.settings.viewmodels.IncomingRequestsViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePasswordDialogViewModel$MessageDialog;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewModel;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.TaxesPasswordViewModel;
import com.squareup.cash.account.settings.viewmodels.Toggle;
import com.squareup.cash.account.settings.viewmodels.UnsupportedSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.InvestingContactViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.viewmodels.AccountSelectorSectionViewModel;
import com.squareup.cash.profile.viewmodels.AccountSwitchInfoDialogViewModel;
import com.squareup.cash.profile.viewmodels.AdjustableThresholdViewModel;
import com.squareup.cash.profile.viewmodels.CategoryGroupSectionViewModel;
import com.squareup.cash.profile.viewmodels.CategoryListViewModel;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ContactMethodSectionViewModel;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.profile.views.KonfettiState;
import com.squareup.cash.profile.views.notifications.AdjustableThresholdView;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.profile.views.notifications.EnableAliasSheetViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.personal.AutoFillSettingsDetailViewKt;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import nl.dionsegijn.konfetti.compose.KonfettiViewKt;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Rotation;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.core.models.Size;
import okhttp3.internal.Tags;

/* loaded from: classes7.dex */
public final /* synthetic */ class ErrorView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(ProfilePasswordDialogViewModel$MessageDialog profilePasswordDialogViewModel$MessageDialog, Function1 function1) {
        this.$r8$classId = 14;
        this.f$0 = profilePasswordDialogViewModel$MessageDialog;
        this.f$1 = function1;
    }

    private final Object invoke$com$squareup$cash$profile$views$TaxesPasswordViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.f$1;
        TaxesPasswordViewModel taxesPasswordViewModel = (TaxesPasswordViewModel) this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
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
            String stringResource = Room.stringResource(gapComposer, R.string.profile_taxes_password);
            NavigationType navigationType = NavigationType.BACK;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(taxesPasswordViewModel.enabled);
            ComposableLambdaImpl composableLambdaImpl = BadgeNameKt.f589lambda$1790826007;
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(taxesPasswordViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda11(18, function1, taxesPasswordViewModel);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl, null, (Function0) rememberedValue2, false, false, BadgeNameKt.lambda$403942179, null, 0L, toggle, null, gapComposer, 1572870, 1466);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1299556957, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(i, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$notifications$ChannelListViewKt$$ExternalSyntheticLambda17(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ChannelListViewKt.AddButtonCellItem((Function1) this.f$1, (Channel) this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$notifications$ContactMethodsSectionKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ChannelListViewKt.ContactMethodsSection((ContactMethodSectionViewModel) this.f$0, (Modifier) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$notifications$EnableAliasSheetViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.f$1;
        EnableAliasSheetViewModel enableAliasSheetViewModel = (EnableAliasSheetViewModel) this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, Modifier.Companion.$$INSTANCE, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(266837185, new EnableAliasSheetViewKt$$ExternalSyntheticLambda3(enableAliasSheetViewModel, function1, i), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$notifications$NotificationSectionViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ChannelListViewKt.AccountSelectorSection((AccountSelectorSectionViewModel) this.f$0, (Modifier) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$notifications$ProfileNotificationsViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ChannelListViewKt.NotificationMessageSection((ProfileNotificationsViewModel.Loaded.NotificationMessage) this.f$0, (Function0) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$personal$AutoFillSettingsDetailViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        AutoFillSettingsDetailViewKt.BodyContent((Function1) this.f$1, (ArcadeAutofillSettingsDetailViewModel.Content) this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$security$PersonalizedAdsSectionKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Eligible eligible = (ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Eligible) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            String str = eligible.description;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, z, 15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, null, null, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2044);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$security$ProfilePrivacyViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.f$1;
        ProfilePrivacyViewModel profilePrivacyViewModel = (ProfilePrivacyViewModel) this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            String stringResource = Room.stringResource(gapComposer, R.string.profile_privacy_title);
            NavigationType navigationType = NavigationType.BACK;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(2, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            boolean z2 = profilePrivacyViewModel instanceof ProfilePrivacyViewModel.Loading;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda8(17);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Strings.LoadableFullScreenContent(profilePrivacyViewModel, z2, null, (Function1) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(-866375041, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, 21), gapComposer), gapComposer, 199680, 20);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$views$security$ProfileSecurityViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.f$1;
        ProfileSecurityViewModel profileSecurityViewModel = (ProfileSecurityViewModel) this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            String stringResource = Room.stringResource(gapComposer, R.string.profile_security_title);
            NavigationType navigationType = NavigationType.BACK;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(4, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            boolean z2 = profileSecurityViewModel instanceof ProfileSecurityViewModel.Loading;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda8(18);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Strings.LoadableFullScreenContent(profileSecurityViewModel, z2, null, (Function1) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(1447847883, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, 22), gapComposer), gapComposer, 199680, 20);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        int i3 = this.$r8$classId;
        int i4 = 17;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$0;
        Object obj4 = this.f$1;
        int i5 = 1;
        switch (i3) {
            case 0:
                ErrorViewModel errorViewModel = (ErrorViewModel) obj3;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i6 = ErrorView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BadgeNameKt.ErrorDialog(errorViewModel, function1, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PrepurchaseCardFAQViewModel prepurchaseCardFAQViewModel = (PrepurchaseCardFAQViewModel) obj3;
                Function1 function12 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    LocaleToggleKt.PrepurchaseCashCardFaqView(prepurchaseCardFAQViewModel, function12, null, null, null, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                PrepurchaseCashCardPlanningViewModel.LoadableText loadableText = (PrepurchaseCashCardPlanningViewModel.LoadableText) obj3;
                Function1 function13 = (Function1) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    CrossfadeKt.Crossfade(loadableText, (Modifier) null, (FiniteAnimationSpec) null, "PrepurchaseCardLoadableSubtitle", Expect_jvmKt.rememberComposableLambda(1281406994, new PdfPreviewViewKt$$ExternalSyntheticLambda4(i4, function13), gapComposer3), gapComposer3, 27648, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                DeviceManagerConfirmRemoveDevicesScreen deviceManagerConfirmRemoveDevicesScreen = (DeviceManagerConfirmRemoveDevicesScreen) obj3;
                Function1 function14 = (Function1) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, DeviceManagerListViewKt.f582lambda$724835155, Expect_jvmKt.rememberComposableLambda(-2104620468, new PoolListSectionKt$$ExternalSyntheticLambda2(deviceManagerConfirmRemoveDevicesScreen, 22), gapComposer4), Expect_jvmKt.rememberComposableLambda(-704418568, new PdfPreviewViewKt$$ExternalSyntheticLambda4(18, function14), gapComposer4), Expect_jvmKt.rememberComposableLambda(-2084203881, new PdfPreviewViewKt$$ExternalSyntheticLambda4(19, function14), gapComposer4), (Function3) null, gapComposer4, 28080, 32);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                BadgeNameKt.AccountSwitchInfoDialog((AccountSwitchInfoDialogViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ProfileConfirmSignOutViewModel profileConfirmSignOutViewModel = (ProfileConfirmSignOutViewModel) obj3;
                Function1 function15 = (Function1) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i7 = ConfirmSignOutDialog.$r8$clinit;
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    BadgeNameKt.SignOutDialog(profileConfirmSignOutViewModel, function15, null, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                BadgeNameKt.TextWidgetView((Modifier) obj3, (GenericProfileElementViewModel.TextWidget) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                BadgeNameKt.BlankDividerView((Modifier) obj3, (GenericProfileElementViewModel.BlankDivider) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                final Function1 function16 = (Function1) obj4;
                final IncomingRequestPolicy incomingRequestPolicy = (IncomingRequestPolicy) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        i = 0;
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        i = 0;
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, i);
                    int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer6, m);
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
                    String stringResource = Room.stringResource(gapComposer6, R.string.incoming_requests_title);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer6.changed(function16);
                    Object rememberedValue = gapComposer6.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(3, function16);
                        gapComposer6.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer6, 48, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer6, null);
                    CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(incomingRequestPolicy == IncomingRequestPolicy.ALLOW_ALL);
                    ComposableLambdaImpl composableLambdaImpl = BadgeNameKt.f597lambda$845025819;
                    boolean changed2 = gapComposer6.changed(function16) | gapComposer6.changed(incomingRequestPolicy == null ? -1 : incomingRequestPolicy.ordinal());
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                        final int i8 = 0;
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.profile.views.IncomingRequestsViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i9 = i8;
                                IncomingRequestPolicy incomingRequestPolicy2 = incomingRequestPolicy;
                                Function1 function17 = function16;
                                switch (i9) {
                                    case 0:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.ALLOW_ALL));
                                        break;
                                    case 1:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.ALLOW_CONTACTS));
                                        break;
                                    default:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.DENY_ALL));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl, null, (Function0) rememberedValue2, false, true, null, null, 0L, radio, null, gapComposer6, 196614, 1498);
                    CellDefaultAccessory.Radio radio2 = new CellDefaultAccessory.Radio(incomingRequestPolicy == IncomingRequestPolicy.ALLOW_CONTACTS);
                    ComposableLambdaImpl composableLambdaImpl2 = BadgeNameKt.f590lambda$2047310898;
                    boolean changed3 = gapComposer6.changed(function16) | gapComposer6.changed(incomingRequestPolicy == null ? -1 : incomingRequestPolicy.ordinal());
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy2) {
                        final int i9 = 1;
                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.profile.views.IncomingRequestsViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i92 = i9;
                                IncomingRequestPolicy incomingRequestPolicy2 = incomingRequestPolicy;
                                Function1 function17 = function16;
                                switch (i92) {
                                    case 0:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.ALLOW_ALL));
                                        break;
                                    case 1:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.ALLOW_CONTACTS));
                                        break;
                                    default:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.DENY_ALL));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl2, null, (Function0) rememberedValue3, false, true, null, null, 0L, radio2, null, gapComposer6, 196614, 1498);
                    CellDefaultAccessory.Radio radio3 = new CellDefaultAccessory.Radio(incomingRequestPolicy == IncomingRequestPolicy.DENY_ALL);
                    ComposableLambdaImpl composableLambdaImpl3 = BadgeNameKt.f584lambda$1095479059;
                    boolean changed4 = gapComposer6.changed(function16) | gapComposer6.changed(incomingRequestPolicy != null ? incomingRequestPolicy.ordinal() : -1);
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy2) {
                        final int i10 = 2;
                        rememberedValue4 = new Function0() { // from class: com.squareup.cash.profile.views.IncomingRequestsViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i92 = i10;
                                IncomingRequestPolicy incomingRequestPolicy2 = incomingRequestPolicy;
                                Function1 function17 = function16;
                                switch (i92) {
                                    case 0:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.ALLOW_ALL));
                                        break;
                                    case 1:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.ALLOW_CONTACTS));
                                        break;
                                    default:
                                        function17.invoke(new IncomingRequestsViewEvent.NewPolicy(incomingRequestPolicy2, IncomingRequestPolicy.DENY_ALL));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer6.updateRememberedValue(rememberedValue4);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(composableLambdaImpl3, null, (Function0) rememberedValue4, false, true, null, null, 0L, radio3, null, gapComposer6, 196614, 1498);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function17 = (Function1) obj4;
                OpenSourceViewModel openSourceViewModel = (OpenSourceViewModel) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                boolean shouldExecute = gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2);
                Applier applier = gapComposer7.applier;
                if (shouldExecute) {
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy2) {
                        rememberedValue5 = Updater.mutableStateOf$default(KonfettiState.Idle.INSTANCE);
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    MutableState mutableState = (MutableState) rememberedValue5;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Object rememberedValue6 = gapComposer7.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy2) {
                        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-1690062, -1224370});
                        TimeUnit.MILLISECONDS.getClass();
                        EmitterConfig emitterConfig = new EmitterConfig();
                        emitterConfig.emittingTime = 100L;
                        emitterConfig.amountPerMs = 0.001f;
                        rememberedValue6 = new Party(CollectionsKt__CollectionsKt.listOf((Object[]) new Size[]{new Size(RecyclerView.DECELERATION_RATE, 20, 6), new Size(6.0f, 16, 4)}), listOf, CollectionsKt__CollectionsKt.listOf((Object[]) new Shape[]{Shape.Circle.INSTANCE$1, Shape.Circle.INSTANCE}), new Position.Relative(), new Rotation(), emitterConfig);
                        gapComposer7.updateRememberedValue(rememberedValue6);
                    }
                    ref$ObjectRef.element = (Party) rememberedValue6;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer7, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer7, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode3 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer7, m177backgroundbw27NRU);
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer7, composeUiNode$Companion$SetModifier$13, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer7, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    String stringResource2 = Room.stringResource(gapComposer7, R.string.open_source_title2);
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed5 = gapComposer7.changed(function17);
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (changed5 || rememberedValue7 == neverEqualPolicy2) {
                        rememberedValue7 = new ProfileKt$$ExternalSyntheticLambda0(4, function17);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    DBUtil.TitleBarSub(stringResource2, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue7, (Modifier) null, (Function3) null, gapComposer7, 48, 108);
                    LazyDslKt.LazyColumn(null, LazyListStateKt.rememberLazyListState(0, 3, gapComposer7), null, null, null, null, false, null, new OverlayKt$$ExternalSyntheticLambda3(openSourceViewModel, ref$ObjectRef, mutableState, (Context) gapComposer7.consume(AndroidCompositionLocals_androidKt.LocalContext), function17), gapComposer7, 0, 509);
                    gapComposer7.end(true);
                    KonfettiState konfettiState = (KonfettiState) mutableState.getValue();
                    if (konfettiState instanceof KonfettiState.Started) {
                        gapComposer7.startReplaceGroup(-1362873685);
                        KonfettiViewKt.KonfettiView(SizeKt.fillMaxSize(companion, 1.0f), CollectionsKt__CollectionsJVMKt.listOf(((KonfettiState.Started) konfettiState).party), new OpenSourceKt$OpenSource$1$1$2(mutableState), gapComposer7, 6);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-1362434508);
                        gapComposer7.end(false);
                    }
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                BadgeNameKt.IconWidgetView((Modifier) obj3, (GenericProfileElementViewModel.IconTextWidget) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                Function1 function18 = (Function1) obj4;
                ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content content = (ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode4 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer8, m2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    String stringResource3 = Room.stringResource(gapComposer8, R.string.search_visibility_title);
                    NavigationType navigationType3 = NavigationType.BACK;
                    boolean changed6 = gapComposer8.changed(function18);
                    Object rememberedValue8 = gapComposer8.rememberedValue();
                    if (changed6 || rememberedValue8 == neverEqualPolicy2) {
                        rememberedValue8 = new ProfileKt$$ExternalSyntheticLambda0(15, function18);
                        gapComposer8.updateRememberedValue(rememberedValue8);
                    }
                    DBUtil.TitleBarSub(stringResource3, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue8, (Modifier) null, (Function3) null, gapComposer8, 48, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer8, null);
                    BadgeNameKt.SearchVisibilityToggle(content.searchByName, SearchPrivacySectionViewEvent.SearchSettingType.NAME, function18, gapComposer8, 48);
                    BadgeNameKt.SearchVisibilityToggle(content.searchByPhone, SearchPrivacySectionViewEvent.SearchSettingType.PHONE_NUMBER, function18, gapComposer8, 48);
                    BadgeNameKt.SearchVisibilityToggle(content.searchByEmail, SearchPrivacySectionViewEvent.SearchSettingType.EMAIL, function18, gapComposer8, 48);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting privacySetting = (ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting) obj3;
                SearchPrivacySectionViewEvent.SearchSettingType searchSettingType = (SearchPrivacySectionViewEvent.SearchSettingType) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    List list = privacySetting.aliases;
                    if (list.isEmpty()) {
                        gapComposer9.startReplaceGroup(1378712592);
                        int ordinal = searchSettingType.ordinal();
                        if (ordinal == 0) {
                            i2 = R.string.search_visibility_no_name;
                        } else if (ordinal == 1) {
                            i2 = R.string.search_visibility_no_phone;
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            i2 = R.string.search_visibility_no_email;
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, i2), (Map) null, (Function1) null, false);
                        gapComposer9.end(false);
                    } else {
                        gapComposer9.startReplaceGroup(1378780606);
                        gapComposer9.startReplaceGroup(-1756637233);
                        int i11 = 0;
                        for (Object obj5 : CollectionsKt.take(list, 3)) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            String str = (String) obj5;
                            if (i11 > 0) {
                                gapComposer9.startReplaceGroup(1980925143);
                                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer9, null);
                                gapComposer9.end(false);
                            } else {
                                gapComposer9.startReplaceGroup(1980975115);
                                gapComposer9.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            i11 = i12;
                        }
                        boolean z = false;
                        gapComposer9.end(false);
                        if (list.size() > 3) {
                            gapComposer9.startReplaceGroup(1379019647);
                            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer9, null);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(R.string.search_visibility_and_more, new Object[]{Integer.valueOf(list.size() - 3)}, gapComposer9), (Map) null, (Function1) null, false);
                            z = false;
                            gapComposer9.end(false);
                        } else {
                            gapComposer9.startReplaceGroup(1379236833);
                            gapComposer9.end(false);
                        }
                        gapComposer9.end(z);
                    }
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                final Function1 function19 = (Function1) obj4;
                ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel = (ProfilePasscodeSectionViewModel) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                boolean shouldExecute2 = gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2);
                Applier applier2 = gapComposer10.applier;
                if (shouldExecute2) {
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer10).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer10, 0);
                    int hashCode5 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer10, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer10.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer10, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer10, materializeModifier5, composeUiNode$Companion$SetModifier$18);
                    String stringResource4 = Room.stringResource(gapComposer10, R.string.profile_passcode_title);
                    NavigationType navigationType4 = NavigationType.BACK;
                    boolean changed7 = gapComposer10.changed(function19);
                    Object rememberedValue9 = gapComposer10.rememberedValue();
                    Object obj6 = rememberedValue9;
                    if (changed7 || rememberedValue9 == neverEqualPolicy2) {
                        ProfileKt$$ExternalSyntheticLambda0 profileKt$$ExternalSyntheticLambda0 = new ProfileKt$$ExternalSyntheticLambda0(17, function19);
                        gapComposer10.updateRememberedValue(profileKt$$ExternalSyntheticLambda0);
                        obj6 = profileKt$$ExternalSyntheticLambda0;
                    }
                    DBUtil.TitleBarSub(stringResource4, navigationType4, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj6, (Modifier) null, (Function3) null, gapComposer10, 48, 108);
                    Modifier m3 = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer10), false, 14), true);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer10, 0);
                    int hashCode6 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer10, m3);
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer10, composeUiNode$Companion$SetModifier$17, gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer10, materializeModifier6, composeUiNode$Companion$SetModifier$18);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                    Strings.getSizes(gapComposer10).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer10).semantic.text.subtle, (Composer) gapComposer10, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer10).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.profile_security_lock_section_description), (Map) null, (Function1) null, false);
                    boolean z2 = false;
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                    final Toggle toggle = profilePasscodeSectionViewModel.biometricsToggle;
                    if (toggle == null) {
                        gapComposer10.startReplaceGroup(427984028);
                        gapComposer10.end(false);
                        neverEqualPolicy = neverEqualPolicy2;
                    } else {
                        gapComposer10.startReplaceGroup(427984029);
                        boolean z3 = toggle.enabled;
                        CellDefaultAccessory.Toggle toggle2 = new CellDefaultAccessory.Toggle(toggle.checked);
                        final boolean z4 = false ? 1 : 0;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1749212984, new Function2() { // from class: com.squareup.cash.profile.views.SecurityLockViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                int i13 = z4;
                                Toggle toggle3 = toggle;
                                switch (i13) {
                                    case 0:
                                        Composer composer11 = (Composer) obj7;
                                        int intValue11 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle3.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer11.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer12 = (Composer) obj7;
                                        int intValue12 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer12 = (GapComposer) composer12;
                                        if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle3.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer12.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer13 = (Composer) obj7;
                                        int intValue13 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer13;
                                        if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle3.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer10);
                        boolean changed8 = gapComposer10.changed(function19) | gapComposer10.changedInstance(toggle);
                        Object rememberedValue10 = gapComposer10.rememberedValue();
                        neverEqualPolicy = neverEqualPolicy2;
                        Object obj7 = rememberedValue10;
                        if (changed8 || rememberedValue10 == neverEqualPolicy) {
                            final int i13 = 0;
                            Function0 function0 = new Function0() { // from class: com.squareup.cash.profile.views.SecurityLockViewKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i13) {
                                        case 0:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.ToggleUseBiometricsForPasscode(!toggle.checked));
                                            break;
                                        case 1:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.TogglePasscode(!toggle.checked));
                                            break;
                                        default:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.ToggleAppLock(!toggle.checked));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer10.updateRememberedValue(function0);
                            obj7 = function0;
                        }
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) obj7, z3, false, null, null, 0L, toggle2, null, gapComposer10, 6, 1514);
                        z2 = false;
                        gapComposer10.end(false);
                    }
                    final Toggle toggle3 = profilePasscodeSectionViewModel.transferToggle;
                    if (toggle3 == null) {
                        gapComposer10.startReplaceGroup(428321804);
                        gapComposer10.end(z2);
                    } else {
                        gapComposer10.startReplaceGroup(428321805);
                        boolean z5 = toggle3.enabled;
                        CellDefaultAccessory.Toggle toggle4 = new CellDefaultAccessory.Toggle(toggle3.checked);
                        final int i14 = 1;
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1793550559, new Function2() { // from class: com.squareup.cash.profile.views.SecurityLockViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj72, Object obj8) {
                                int i132 = i14;
                                Toggle toggle32 = toggle3;
                                switch (i132) {
                                    case 0:
                                        Composer composer11 = (Composer) obj72;
                                        int intValue11 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle32.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer11.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer12 = (Composer) obj72;
                                        int intValue12 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer12 = (GapComposer) composer12;
                                        if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle32.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer12.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer13 = (Composer) obj72;
                                        int intValue13 = ((Integer) obj8).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer13;
                                        if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle32.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer10);
                        boolean changed9 = gapComposer10.changed(function19) | gapComposer10.changedInstance(toggle3);
                        Object rememberedValue11 = gapComposer10.rememberedValue();
                        Object obj8 = rememberedValue11;
                        if (changed9 || rememberedValue11 == neverEqualPolicy) {
                            final int i15 = 1;
                            Function0 function02 = new Function0() { // from class: com.squareup.cash.profile.views.SecurityLockViewKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.ToggleUseBiometricsForPasscode(!toggle3.checked));
                                            break;
                                        case 1:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.TogglePasscode(!toggle3.checked));
                                            break;
                                        default:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.ToggleAppLock(!toggle3.checked));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer10.updateRememberedValue(function02);
                            obj8 = function02;
                        }
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda2, null, (Function0) obj8, z5, false, null, null, 0L, toggle4, null, gapComposer10, 6, 1514);
                        z2 = false;
                        gapComposer10.end(false);
                    }
                    final Toggle toggle5 = profilePasscodeSectionViewModel.appLockToggle;
                    if (toggle5 == null) {
                        gapComposer10.startReplaceGroup(428643181);
                        gapComposer10.end(z2);
                    } else {
                        gapComposer10.startReplaceGroup(428643182);
                        boolean z6 = toggle5.enabled;
                        CellDefaultAccessory.Toggle toggle6 = new CellDefaultAccessory.Toggle(toggle5.checked);
                        final int i16 = 2;
                        ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(499105408, new Function2() { // from class: com.squareup.cash.profile.views.SecurityLockViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj72, Object obj82) {
                                int i132 = i16;
                                Toggle toggle32 = toggle5;
                                switch (i132) {
                                    case 0:
                                        Composer composer11 = (Composer) obj72;
                                        int intValue11 = ((Integer) obj82).intValue();
                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle32.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer11.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer12 = (Composer) obj72;
                                        int intValue12 = ((Integer) obj82).intValue();
                                        GapComposer gapComposer12 = (GapComposer) composer12;
                                        if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle32.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer12.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer13 = (Composer) obj72;
                                        int intValue13 = ((Integer) obj82).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer13;
                                        if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, toggle32.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer10);
                        boolean changed10 = gapComposer10.changed(function19) | gapComposer10.changedInstance(toggle5);
                        Object rememberedValue12 = gapComposer10.rememberedValue();
                        Object obj9 = rememberedValue12;
                        if (changed10 || rememberedValue12 == neverEqualPolicy) {
                            final int i17 = 2;
                            Function0 function03 = new Function0() { // from class: com.squareup.cash.profile.views.SecurityLockViewKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.ToggleUseBiometricsForPasscode(!toggle5.checked));
                                            break;
                                        case 1:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.TogglePasscode(!toggle5.checked));
                                            break;
                                        default:
                                            function19.invoke(new ProfilePasscodeSectionViewEvent.ToggleAppLock(!toggle5.checked));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer10.updateRememberedValue(function03);
                            obj9 = function03;
                        }
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda3, null, (Function0) obj9, z6, false, null, null, 0L, toggle6, null, gapComposer10, 6, 1514);
                        gapComposer10.end(false);
                    }
                    gapComposer10.end(true);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ProfilePasswordDialogViewModel$MessageDialog profilePasswordDialogViewModel$MessageDialog = (ProfilePasswordDialogViewModel$MessageDialog) obj3;
                Function1 function110 = (Function1) obj4;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, BadgeNameKt.lambda$1549296059, Expect_jvmKt.rememberComposableLambda(-634979878, new PoolListSectionKt$$ExternalSyntheticLambda2(profilePasswordDialogViewModel$MessageDialog, 28), gapComposer11), Expect_jvmKt.rememberComposableLambda(-1999131002, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(i5, function110), gapComposer11), (Function3) null, (Function3) null, gapComposer11, 3504, 48);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                return invoke$com$squareup$cash$profile$views$TaxesPasswordViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 16:
                Function1 function111 = (Function1) obj4;
                UnsupportedSettingViewModel unsupportedSettingViewModel = (UnsupportedSettingViewModel) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                int i18 = UnsupportedSettingView.$r8$clinit;
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    BadgeNameKt.UnsupportedSettingContent(function111, unsupportedSettingViewModel, null, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                AdjustableThresholdViewModel adjustableThresholdViewModel = (AdjustableThresholdViewModel) obj3;
                Function1 function112 = (Function1) obj4;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                int i19 = AdjustableThresholdView.$r8$clinit;
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    ChannelListViewKt.AdjustableThresholdComponent(null, adjustableThresholdViewModel.currentValue, adjustableThresholdViewModel.minValue, adjustableThresholdViewModel.maxValue, adjustableThresholdViewModel.isLoading, function112, gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ChannelListViewKt.CategoryGroupSection((CategoryGroupSectionViewModel) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                CategoryListViewModel categoryListViewModel = (CategoryListViewModel) obj3;
                Function1 function113 = (Function1) obj4;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    ChannelListViewKt.CategoryList(categoryListViewModel, function113, null, gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                return invoke$com$squareup$cash$profile$views$notifications$ChannelListViewKt$$ExternalSyntheticLambda17(obj, obj2);
            case 21:
                return invoke$com$squareup$cash$profile$views$notifications$ContactMethodsSectionKt$$ExternalSyntheticLambda0(obj, obj2);
            case 22:
                return invoke$com$squareup$cash$profile$views$notifications$EnableAliasSheetViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 23:
                return invoke$com$squareup$cash$profile$views$notifications$NotificationSectionViewKt$$ExternalSyntheticLambda1(obj, obj2);
            case 24:
                return invoke$com$squareup$cash$profile$views$notifications$ProfileNotificationsViewKt$$ExternalSyntheticLambda8(obj, obj2);
            case 25:
                return invoke$com$squareup$cash$profile$views$personal$AutoFillSettingsDetailViewKt$$ExternalSyntheticLambda8(obj, obj2);
            case 26:
                return invoke$com$squareup$cash$profile$views$security$PersonalizedAdsSectionKt$$ExternalSyntheticLambda1(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$profile$views$security$ProfilePrivacyViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$profile$views$security$ProfileSecurityViewKt$$ExternalSyntheticLambda0(obj, obj2);
            default:
                Function1 function114 = (Function1) obj4;
                InvestingContactViewModel investingContactViewModel = (InvestingContactViewModel) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Colors colors4 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer15, 0);
                    int hashCode7 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer15.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer15, fillMaxSize3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer15.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer15.startReusableNode();
                    if (gapComposer15.inserting) {
                        gapComposer15.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer15.useNode();
                    }
                    Updater.m576setimpl(gapComposer15, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer15, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer15, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer15, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    String stringResource5 = Room.stringResource(gapComposer15, R.string.profile_investing_contact);
                    NavigationType navigationType5 = NavigationType.BACK;
                    boolean changed11 = gapComposer15.changed(function114);
                    Object rememberedValue13 = gapComposer15.rememberedValue();
                    if (changed11 || rememberedValue13 == neverEqualPolicy2) {
                        rememberedValue13 = new CashtagQrScanView$$ExternalSyntheticLambda0(10, function114);
                        gapComposer15.updateRememberedValue(rememberedValue13);
                    }
                    DBUtil.TitleBarSub(stringResource5, navigationType5, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue13, (Modifier) null, (Function3) null, gapComposer15, 48, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer15, null);
                    String str2 = investingContactViewModel.name;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ViewfinderDefaults.SectionHeader(str2, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer15, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer15, null);
                    gapComposer15.startReplaceGroup(2053331755);
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (investingContactViewModel.phone != null) {
                        gapComposer15.startReplaceGroup(-886765713);
                        createListBuilder.add(new ListUnorderedItem(Room.stringResource(gapComposer15, R.string.profile_investing_contact_phone), Icons.DeviceMobile24, null, investingContactViewModel.phone, 4));
                        gapComposer15.end(false);
                    } else {
                        gapComposer15.startReplaceGroup(-886488945);
                        gapComposer15.end(false);
                    }
                    if (investingContactViewModel.email != null) {
                        gapComposer15.startReplaceGroup(-886439438);
                        createListBuilder.add(new ListUnorderedItem(Room.stringResource(gapComposer15, R.string.profile_investing_contact_email), Icons.CommEmail24, null, investingContactViewModel.email, 4));
                        gapComposer15.end(false);
                    } else {
                        gapComposer15.startReplaceGroup(-886165553);
                        gapComposer15.end(false);
                    }
                    if (investingContactViewModel.address != null) {
                        gapComposer15.startReplaceGroup(-886113969);
                        createListBuilder.add(new ListUnorderedItem(Room.stringResource(gapComposer15, R.string.profile_investing_contact_address), Icons.Location24, null, investingContactViewModel.address, 4));
                        gapComposer15.end(false);
                    } else {
                        gapComposer15.startReplaceGroup(-885837201);
                        gapComposer15.end(false);
                    }
                    ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                    gapComposer15.end(false);
                    ListUnorderedKt.ListUnordered(Tags.toPersistentList(build), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Standard, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer15, 3072, 54);
                    SpacerKt.Spacer(gapComposer15, new LayoutWeightElement(1.0f, true));
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1157732197, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(9, function114), gapComposer15), gapComposer15, 24576, 15);
                    gapComposer15.end(true);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(int i, int i2, Object obj, Function1 function1) {
        this.$r8$classId = i2;
        this.f$1 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(DeviceManagerConfirmRemoveDevicesScreen deviceManagerConfirmRemoveDevicesScreen, Function1 function1) {
        this.$r8$classId = 3;
        this.f$0 = deviceManagerConfirmRemoveDevicesScreen;
        this.f$1 = function1;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Function1 function1, ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel) {
        this.$r8$classId = 13;
        this.f$1 = function1;
        this.f$0 = profilePasscodeSectionViewModel;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Function1 function1, ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content content) {
        this.$r8$classId = 11;
        this.f$1 = function1;
        this.f$0 = content;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Function1 function1, ProfilePrivacyViewModel profilePrivacyViewModel) {
        this.$r8$classId = 27;
        this.f$1 = function1;
        this.f$0 = profilePrivacyViewModel;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Function1 function1, ProfileSecurityViewModel profileSecurityViewModel) {
        this.$r8$classId = 28;
        this.f$1 = function1;
        this.f$0 = profileSecurityViewModel;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Function1 function1, TaxesPasswordViewModel taxesPasswordViewModel) {
        this.$r8$classId = 15;
        this.f$1 = function1;
        this.f$0 = taxesPasswordViewModel;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Function1 function1, InvestingContactViewModel investingContactViewModel) {
        this.$r8$classId = 29;
        this.f$1 = function1;
        this.f$0 = investingContactViewModel;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Function1 function1, EnableAliasSheetViewModel enableAliasSheetViewModel) {
        this.$r8$classId = 22;
        this.f$1 = function1;
        this.f$0 = enableAliasSheetViewModel;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Function1 function1, IncomingRequestPolicy incomingRequestPolicy) {
        this.$r8$classId = 8;
        this.f$1 = function1;
        this.f$0 = incomingRequestPolicy;
    }
}
