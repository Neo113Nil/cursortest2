package com.squareup.cash.profile.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
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
import androidx.compose.ui.window.DialogProperties;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePasswordDialogViewModel$MessageDialog;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$CashMeSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewModel;
import com.squareup.cash.account.settings.viewmodels.RatePlanButtonTreatment;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.TaxesPasswordViewModel;
import com.squareup.cash.account.settings.viewmodels.UnsupportedSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.InvestingContactViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.AdjustableThresholdViewModel;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.CategoryListViewModel;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ChannelListViewModel;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewModel;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.profile.views.notifications.AdjustableThresholdView;
import com.squareup.cash.profile.views.notifications.CATEGORIES;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.profile.views.notifications.ContactMethodDetailsView;
import com.squareup.cash.profile.views.personal.AutoFillSettingsDetailViewKt;
import com.squareup.cash.profile.views.personal.PersonalInfoConfirmationDialog;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.personal.RatePlanSectionKt;
import com.squareup.cash.profile.views.security.ProfilePrivacyView;
import com.squareup.cash.profile.views.security.ProfileSecurityView;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.profile.views.trustedcontact.InvestingContactView;
import com.squareup.cash.profile.views.trustedcontact.InvestingContactViewKt;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.autofill.viewmodels.DialogViewModel;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.util.cash.Countries;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class SecurityLockView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ SecurityLockView$$ExternalSyntheticLambda1(ArcadeAutofillSettingsDetailViewModel arcadeAutofillSettingsDetailViewModel, Function1 function1, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        this.$r8$classId = 18;
        this.f$0 = arcadeAutofillSettingsDetailViewModel;
        this.f$2 = function1;
        this.f$1 = delegatingSoftwareKeyboardController;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GapComposer gapComposer;
        GapComposer gapComposer2;
        int i = this.$r8$classId;
        boolean z = true;
        boolean z2 = true;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = SecurityLockView.$r8$clinit;
                ((SecurityLockView) obj5).Content((ProfilePasscodeSectionViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                BadgeNameKt.SearchVisibility((ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                BadgeNameKt.SearchVisibilityToggle((ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.Content.PrivacySetting) obj5, (SearchPrivacySectionViewEvent.SearchSettingType) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i3 = TaxesPasswordDialog.$r8$clinit;
                ((TaxesPasswordDialog) obj5).Content((ProfilePasswordDialogViewModel$MessageDialog) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                BadgeNameKt.TaxesPassword((ProfilePasswordDialogViewModel$MessageDialog) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int i4 = TaxesPasswordView.$r8$clinit;
                ((TaxesPasswordView) obj5).Content((TaxesPasswordViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                BadgeNameKt.TaxesPassword((TaxesPasswordViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                int i5 = UnsupportedSettingView.$r8$clinit;
                ((UnsupportedSettingView) obj5).Content((UnsupportedSettingViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                BadgeNameKt.UnsupportedSettingContent((Function1) obj4, (UnsupportedSettingViewModel) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int i6 = AdjustableThresholdView.$r8$clinit;
                ((AdjustableThresholdView) obj5).Content((AdjustableThresholdViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ChannelListViewKt.CategorySection((Function1) obj4, (CATEGORIES) obj5, (List) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ChannelListViewKt.CategoryList((CategoryListViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((ChannelListViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ChannelListViewKt.AdjustableThresholdCellItem((Function1) obj4, (Category.AdjustableThreshold) obj5, (NotificationCategory) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ChannelListViewKt.ToggleCellItem((Function1) obj4, (Channel) obj5, (Accessory.Toggle) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ChannelListViewKt.ChannelList((ChannelListViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                int i7 = ContactMethodDetailsView.$r8$clinit;
                ((ContactMethodDetailsView) obj5).Content(Updater.updateChangedFlags(1), (Composer) obj, (ContactMethodDetailsViewModel) obj3, (Function1) obj4);
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ChannelListViewKt.PhoneContactAlias((Modifier) obj5, (UtilsKt$$ExternalSyntheticLambda0) obj3, (ContactMethodType) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ArcadeAutofillSettingsDetailViewModel arcadeAutofillSettingsDetailViewModel = (ArcadeAutofillSettingsDetailViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2);
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
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    boolean z3 = arcadeAutofillSettingsDetailViewModel instanceof ArcadeAutofillSettingsDetailViewModel.Content;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z3) {
                        gapComposer3.startReplaceGroup(1194876251);
                        ArcadeAutofillSettingsDetailViewModel.Content content = (ArcadeAutofillSettingsDetailViewModel.Content) arcadeAutofillSettingsDetailViewModel;
                        AutoFillSettingsDetailViewKt.BodyContent(function1, content, gapComposer3, 0);
                        DialogViewModel dialogViewModel = content.dialogViewModel;
                        if (dialogViewModel == null) {
                            gapComposer3.startReplaceGroup(1194946093);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(1194946094);
                            boolean changed = gapComposer3.changed(function1) | gapComposer3.changedInstance(dialogViewModel);
                            Object rememberedValue = gapComposer3.rememberedValue();
                            Object obj6 = rememberedValue;
                            if (changed || rememberedValue == neverEqualPolicy) {
                                EditAutofillViewKt$$ExternalSyntheticLambda2 editAutofillViewKt$$ExternalSyntheticLambda2 = new EditAutofillViewKt$$ExternalSyntheticLambda2(2, dialogViewModel, function1);
                                gapComposer3.updateRememberedValue(editAutofillViewKt$$ExternalSyntheticLambda2);
                                obj6 = editAutofillViewKt$$ExternalSyntheticLambda2;
                            }
                            AliasFormatter.Dialog((Function0) obj6, new DialogProperties(4), Expect_jvmKt.rememberComposableLambda(183293832, new EditAutofillViewKt$$ExternalSyntheticLambda3(z2 ? 1 : 0, dialogViewModel, function1), gapComposer3), gapComposer3, 432);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(false);
                        gapComposer2 = gapComposer3;
                    } else {
                        if (arcadeAutofillSettingsDetailViewModel instanceof ArcadeAutofillSettingsDetailViewModel.ErrorViewModel) {
                            gapComposer3.startReplaceGroup(1195897918);
                            Modifier fillMaxHeight = SizeKt.fillMaxHeight(companion, 1.0f);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxHeight);
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            NavigationType navigationType = NavigationType.CLOSE;
                            boolean changed2 = gapComposer3.changed(delegatingSoftwareKeyboardController) | gapComposer3.changed(function1);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            Object obj7 = rememberedValue2;
                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                SetNameViewKt$$ExternalSyntheticLambda6 setNameViewKt$$ExternalSyntheticLambda6 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 20);
                                gapComposer3.updateRememberedValue(setNameViewKt$$ExternalSyntheticLambda6);
                                obj7 = setNameViewKt$$ExternalSyntheticLambda6;
                            }
                            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj7, (Modifier) null, (Function3) null, gapComposer3, 54, 108);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                            ArcadeAutofillSettingsDetailViewModel.ErrorViewModel errorViewModel = (ArcadeAutofillSettingsDetailViewModel.ErrorViewModel) arcadeAutofillSettingsDetailViewModel;
                            Countries.PageHeader(errorViewModel.title, (Modifier) null, RatePlanSectionKt.f615lambda$490427156, errorViewModel.subtitle, gapComposer3, MLKEMEngine.KyberPolyBytes, 2);
                            SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f, true));
                            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, ButtonCtaGroupOrientation.VERTICAL, null, Expect_jvmKt.rememberComposableLambda(-451374763, new ShareSheetViewKt$$ExternalSyntheticLambda1(7, (Object) arcadeAutofillSettingsDetailViewModel, function1), gapComposer3), gapComposer3, 24966, 10);
                            GapComposer gapComposer4 = gapComposer3;
                            gapComposer4.end(true);
                            gapComposer4.end(false);
                            gapComposer = gapComposer4;
                        } else if (arcadeAutofillSettingsDetailViewModel instanceof ArcadeAutofillSettingsDetailViewModel.SuccessViewModel) {
                            gapComposer3.startReplaceGroup(1197325964);
                            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer3, 54);
                            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                            Context context = (Context) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalContext);
                            boolean changed3 = gapComposer3.changed(function1);
                            Object rememberedValue3 = gapComposer3.rememberedValue();
                            Object obj8 = rememberedValue3;
                            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                PersonalInfoView$$ExternalSyntheticLambda0 personalInfoView$$ExternalSyntheticLambda0 = new PersonalInfoView$$ExternalSyntheticLambda0(14, function1);
                                gapComposer3.updateRememberedValue(personalInfoView$$ExternalSyntheticLambda0);
                                obj8 = personalInfoView$$ExternalSyntheticLambda0;
                            }
                            VisibleKt.m3491IconAnimationViewJXYZCY(fillMaxWidth, context, null, 0, 0L, 0L, false, (Function0) obj8, false, gapComposer3, 100663686, 120);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, ((ArcadeAutofillSettingsDetailViewModel.SuccessViewModel) arcadeAutofillSettingsDetailViewModel).title, (Map) null, (Function1) null, false);
                            GapComposer gapComposer5 = gapComposer3;
                            gapComposer5.end(true);
                            gapComposer5.end(false);
                            gapComposer = gapComposer5;
                        } else {
                            if (!(arcadeAutofillSettingsDetailViewModel instanceof ArcadeAutofillSettingsDetailViewModel.LoadingViewModel)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -100001727, false);
                            }
                            gapComposer3.startReplaceGroup(1198016582);
                            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                            int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize2);
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                            z = true;
                            ProgressCircularKt.ProgressCircular(0, 1, gapComposer3, null);
                            gapComposer3.end(true);
                            gapComposer3.end(false);
                            gapComposer2 = gapComposer3;
                        }
                        z = true;
                        gapComposer2 = gapComposer;
                    }
                    gapComposer2.end(z);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                int i8 = PersonalInfoConfirmationDialog.$r8$clinit;
                ((PersonalInfoConfirmationDialog) obj5).Content((Unit) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((PersonalScreenViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                RatePlanSectionKt.PersonalInfo((PersonalScreenViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                RatePlanSectionKt.RatePlanSection((RatePlanButtonTreatment) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                int i9 = ProfilePrivacyView.$r8$clinit;
                ((ProfilePrivacyView) obj5).Content((ProfilePrivacyViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                WebSectionKt.ProfilePrivacy((ProfilePrivacyViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                int i10 = ProfileSecurityView.$r8$clinit;
                ((ProfileSecurityView) obj5).Content((ProfileSecurityViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                WebSectionKt.ProfileSecurity((ProfileSecurityViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                WebSectionKt.WebSection((ProfilePrivacyReadyViewModel$CashMeSettingViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                int i11 = InvestingContactView.$r8$clinit;
                ((InvestingContactView) obj5).Content((InvestingContactViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                InvestingContactViewKt.InvestingContact((InvestingContactViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SecurityLockView$$ExternalSyntheticLambda1(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = modifier;
    }

    public /* synthetic */ SecurityLockView$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ SecurityLockView$$ExternalSyntheticLambda1(Function1 function1, Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = function1;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
