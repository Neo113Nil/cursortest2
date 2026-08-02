package com.squareup.cash.profile.views.notifications;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.g6$$ExternalSyntheticLambda11;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.ArcadeBannerCardKt$$ExternalSyntheticLambda4;
import com.squareup.cash.common.composeui.ArcadeBannerCardKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackOrientation;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.formview.components.CardFormElementView$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda15;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.AccountSelectorSectionViewModel;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.Category$CategoryListHeader$ToggleHeader;
import com.squareup.cash.profile.viewmodels.CategoryGroupSectionViewModel;
import com.squareup.cash.profile.viewmodels.CategoryListViewModel;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ChannelListViewModel;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewModel;
import com.squareup.cash.profile.viewmodels.ContactMethodSectionViewModel;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.profile.viewmodels.NotificationPageHeaderViewModel;
import com.squareup.cash.profile.viewmodels.NotificationSectionViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.profile.viewmodels.SponsoredFamilyMember;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.views.ProfileHeaderKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda10;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ChannelListViewKt {
    public static final ComposableLambdaImpl lambda$707346640 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(15), false, 707346640);
    public static final ComposableLambdaImpl lambda$1966509241 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(16), false, 1966509241);

    /* renamed from: lambda$-366887297, reason: not valid java name */
    public static final ComposableLambdaImpl f608lambda$366887297 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(17), false, -366887297);

    /* renamed from: lambda$-1965822122, reason: not valid java name */
    public static final ComposableLambdaImpl f606lambda$1965822122 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(18), false, -1965822122);

    /* renamed from: lambda$-1343165653, reason: not valid java name */
    public static final ComposableLambdaImpl f602lambda$1343165653 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(19), false, -1343165653);
    public static final ComposableLambdaImpl lambda$1517185506 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(20), false, 1517185506);

    /* renamed from: lambda$-912185467, reason: not valid java name */
    public static final ComposableLambdaImpl f611lambda$912185467 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(21), false, -912185467);

    /* renamed from: lambda$-808789771, reason: not valid java name */
    public static final ComposableLambdaImpl f609lambda$808789771 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(24), false, -808789771);

    /* renamed from: lambda$-1190206209, reason: not valid java name */
    public static final ComposableLambdaImpl f599lambda$1190206209 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(22), false, -1190206209);

    /* renamed from: lambda$-1453615924, reason: not valid java name */
    public static final ComposableLambdaImpl f604lambda$1453615924 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(23), false, -1453615924);
    public static final ComposableLambdaImpl lambda$345557978 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(24), false, 345557978);
    public static final ComposableLambdaImpl lambda$1139943975 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(25), false, 1139943975);

    /* renamed from: lambda$-80892794, reason: not valid java name */
    public static final ComposableLambdaImpl f610lambda$80892794 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(26), false, -80892794);

    /* renamed from: lambda$-1294967537, reason: not valid java name */
    public static final ComposableLambdaImpl f601lambda$1294967537 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(27), false, -1294967537);

    /* renamed from: lambda$-2050448896, reason: not valid java name */
    public static final ComposableLambdaImpl f607lambda$2050448896 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(28), false, -2050448896);

    /* renamed from: lambda$-1733172301, reason: not valid java name */
    public static final ComposableLambdaImpl f605lambda$1733172301 = new ComposableLambdaImpl(new ProfileHeaderKt$$ExternalSyntheticLambda0(29), false, -1733172301);

    /* renamed from: lambda$-11937495, reason: not valid java name */
    public static final ComposableLambdaImpl f600lambda$11937495 = new ComposableLambdaImpl(new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(25), false, -11937495);

    /* renamed from: lambda$-1347529426, reason: not valid java name */
    public static final ComposableLambdaImpl f603lambda$1347529426 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(1), false, -1347529426);
    public static final ComposableLambdaImpl lambda$1280348759 = new ComposableLambdaImpl(new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(2), false, 1280348759);

    public static final void AccountRow(AccountSelectorSectionViewModel.AccountViewModel accountViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-497897852);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(accountViewModel) ? 4 : 2) | i;
        byte b = 0;
        int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.notification_category_enabled);
            String stringResource2 = Room.stringResource(gapComposer, R.string.notification_category_disabled);
            if (!accountViewModel.isOn) {
                stringResource = stringResource2;
            }
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(stringResource, 2);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1116728354, new NotificationSectionViewKt$$ExternalSyntheticLambda2(accountViewModel, b, b), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(455138881, new NotificationSectionViewKt$$ExternalSyntheticLambda2(accountViewModel, i4, b), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(accountViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BottomSheet$$ExternalSyntheticLambda2(accountViewModel, 14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(780569339, new NotificationSectionViewKt$$ExternalSyntheticLambda2(accountViewModel, i2, b), gapComposer), null, label, 0L, null, gapComposer, 12582966, 0, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NotificationSectionViewKt$$ExternalSyntheticLambda2(accountViewModel, i);
        }
    }

    public static final void AccountSelectorSection(AccountSelectorSectionViewModel accountSelectorSectionViewModel, Modifier modifier, Composer composer, int i) {
        AccountSelectorSectionViewModel accountSelectorSectionViewModel2;
        Modifier modifier2;
        accountSelectorSectionViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(379032271);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(accountSelectorSectionViewModel) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            ViewfinderDefaults.SectionHeader(accountSelectorSectionViewModel.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier2);
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
            gapComposer.startReplaceGroup(-673873299);
            accountSelectorSectionViewModel2 = accountSelectorSectionViewModel;
            Iterator it = accountSelectorSectionViewModel2.accounts.iterator();
            while (it.hasNext()) {
                AccountRow((AccountSelectorSectionViewModel.AccountViewModel) it.next(), gapComposer, 0);
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, true);
        } else {
            accountSelectorSectionViewModel2 = accountSelectorSectionViewModel;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(accountSelectorSectionViewModel2, modifier2, i, 23);
        }
    }

    public static final void AddButtonCellItem(Function1 function1, Channel channel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1028561215);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i | (gapComposer.changedInstance(channel) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, f599lambda$1190206209, 15);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(708552817, new ChannelListViewKt$$ExternalSyntheticLambda15(channel, r7), gapComposer);
            int i3 = (gapComposer.changedInstance(channel) ? 1 : 0) | ((i2 & 14) == 4 ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (i3 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(21, function1, channel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, false, true, null, null, 0L, buttonCompact, null, gapComposer, 196614, 1498);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(i, 20, channel, function1);
        }
    }

    public static final void AdjustableThresholdCellItem(Function1 function1, Category.AdjustableThreshold adjustableThreshold, NotificationCategory notificationCategory, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2079543652);
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2) | (gapComposer.changedInstance(adjustableThreshold) ? 32 : 16) | (gapComposer.changed(notificationCategory.ordinal()) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String stringResource = Room.stringResource(R.string.adjustable_threshold_row_title, new Object[]{Integer.valueOf(adjustableThreshold.currentValue)}, gapComposer);
            String stringResource2 = Room.stringResource(gapComposer, R.string.customize_adjustable_threshold_label);
            boolean changedInstance = ((i2 & 14) == 4) | gapComposer.changedInstance(adjustableThreshold) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda10(13, function1, adjustableThreshold, notificationCategory);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, Expect_jvmKt.rememberComposableLambda(-1535472932, new SheetKt$$ExternalSyntheticLambda8(stringResource2, 22), gapComposer), 15);
            boolean changed = gapComposer.changed(stringResource) | gapComposer.changed(stringResource2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(stringResource, stringResource2, 25);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-1856449494, new InfoSectionKt$$ExternalSyntheticLambda7(stringResource, 3), gapComposer), ImageKt.m183clickableoSLSa3U$default(SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue2), false, null, null, function0, 15), function0, false, true, null, null, 0L, buttonCompact, null, gapComposer, 196614, 1496);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(function1, (Object) adjustableThreshold, (Object) notificationCategory, i, 13);
        }
    }

    public static final void AdjustableThresholdComponent(Modifier modifier, final int i, final int i2, final int i3, final boolean z, Function1 function1, Composer composer, final int i4) {
        Function1 function12;
        final Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1919209688);
        Applier applier = gapComposer.applier;
        int i5 = i4 | 6 | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changed(i2) ? 256 : 128) | (gapComposer.changed(i3) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(i, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            String stringResource = Room.stringResource(R.string.adjustable_threshold_percentage, new Object[]{Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue())}, gapComposer);
            String stringResource2 = Room.stringResource(gapComposer, R.string.adjustable_threshold_add_description);
            String stringResource3 = Room.stringResource(gapComposer, R.string.adjustable_threshold_subtract_description);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, 3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentSize$default);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier statusBarsPadding = SpacerKt.statusBarsPadding(SizeKt.fillMaxWidth(companion, 1.0f));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(statusBarsPadding, j, rectangleShapeKt$RectangleShape$1);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            int i6 = 1;
            EmptyChatKt.ProfileHeader(Room.stringResource(gapComposer, R.string.adjustable_threshold_sheet_title), (Modifier) null, (Function2) null, Room.stringResource(gapComposer, R.string.adjustable_threshold_description), gapComposer, 0, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 16.0f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            coil3.size.SizeKt.AdaptiveStack(null, null, null, new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, AdaptiveStackOrientation.Auto, Expect_jvmKt.rememberComposableLambda(1095752277, new CardFormElementView$$ExternalSyntheticLambda0(stringResource3, i2, stringResource, stringResource2, i3, parcelableSnapshotMutableIntState), gapComposer), gapComposer, 1772544, 23);
            gapComposer.end(true);
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(863493402, new ShareSheetViewKt$$ExternalSyntheticLambda1(i6, (Object) parcelableSnapshotMutableIntState, function12), gapComposer), gapComposer, 24960, 11);
            gapComposer.end(true);
            AnimatedContentKt.AnimatedVisibility(z, BoxScopeInstance.INSTANCE.matchParentSize(), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(545872826, new ProfileHeaderKt$$ExternalSyntheticLambda0(13), gapComposer), (Composer) gapComposer, ((i5 >> 12) & 14) | 200064, 16);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1 function13 = function12;
            endRestartGroup.block = new Function2(i, i2, i3, z, function13, i4) { // from class: com.squareup.cash.profile.views.notifications.AdjustableThresholdViewKt$$ExternalSyntheticLambda3
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ Function1 f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ChannelListViewKt.AdjustableThresholdComponent(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void CategoryGroupSection(CategoryGroupSectionViewModel categoryGroupSectionViewModel, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        char c;
        char c2;
        long j;
        categoryGroupSectionViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(949612220);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(categoryGroupSectionViewModel) ? 4 : 2) | 48;
        int i3 = 1;
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            GapComposer gapComposer2 = gapComposer;
            Modifier.Companion companion2 = companion;
            ViewfinderDefaults.SectionHeader(categoryGroupSectionViewModel.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion2);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            gapComposer2.startReplaceGroup(-1312747126);
            CategoryGroupSectionViewModel categoryGroupSectionViewModel2 = categoryGroupSectionViewModel;
            for (Iterator it = categoryGroupSectionViewModel2.categories.iterator(); it.hasNext(); it = it) {
                Category category = (Category) it.next();
                String stringResource = Room.stringResource(gapComposer2, category.isCategoryTurnedOn ? R.string.notification_category_enabled : R.string.notification_category_disabled);
                if (category.isCategoryTurnedOn) {
                    gapComposer2.startReplaceGroup(-939644270);
                    gapComposer2.end(z);
                    j = Color.Unspecified;
                    c = 52446;
                    c2 = 51733;
                } else {
                    gapComposer2.startReplaceGroup(-939594701);
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    c = 52446;
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z);
                        c2 = 51733;
                    } else {
                        c2 = 51733;
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(z);
                    }
                    j = colors2.component.cell.label.disabled;
                    gapComposer2.end(z);
                }
                Modifier.Companion companion3 = companion2;
                CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-1542687903, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(stringResource, j, 4), gapComposer2), 2);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-316320649, new CategoryListViewKt$$ExternalSyntheticLambda16(category, i3), gapComposer2);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(915810646, new CategoryListViewKt$$ExternalSyntheticLambda16(category, 2), gapComposer2);
                boolean changedInstance = gapComposer2.changedInstance(categoryGroupSectionViewModel2) | gapComposer2.changedInstance(category);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(19, categoryGroupSectionViewModel2, category);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer3 = gapComposer2;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(-281336176, new CategoryListViewKt$$ExternalSyntheticLambda16(category, 3), gapComposer2), null, label, 0L, gapComposer3, 12582966, 3444);
                z = z;
                i3 = i3;
                gapComposer2 = gapComposer3;
                companion2 = companion3;
                categoryGroupSectionViewModel2 = categoryGroupSectionViewModel;
            }
            gapComposer = gapComposer2;
            boolean z2 = i3;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, z, z2, z2);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(categoryGroupSectionViewModel, modifier2, i, 18);
        }
    }

    public static final void CategoryList(CategoryListViewModel categoryListViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        categoryListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1235865166);
        int i2 = 4;
        int i3 = i | (gapComposer.changedInstance(categoryListViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CrossfadeKt.Crossfade(categoryListViewModel, SizeKt.fillMaxSize(companion, 1.0f), (FiniteAnimationSpec) null, "CategoryListCrossFade", Expect_jvmKt.rememberComposableLambda(1413156599, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(3, function1), gapComposer), gapComposer, (i3 & 14) | 27648, 4);
            CategoryListViewModel.Loaded loaded = categoryListViewModel instanceof CategoryListViewModel.Loaded ? (CategoryListViewModel.Loaded) categoryListViewModel : null;
            if (loaded == null) {
                gapComposer.startReplaceGroup(738185117);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(738185118);
                AnimatedContentKt.AnimatedVisibility(((CategoryListViewModel.Loaded) categoryListViewModel).isLoading, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) f606lambda$1965822122, (Composer) gapComposer, 200064, 18);
                gapComposer = gapComposer;
                if (loaded.showPermissionsDialog) {
                    gapComposer.startReplaceGroup(1437582326);
                    int i4 = i3 & 112;
                    boolean z = i4 == 32;
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ProfileKt$$ExternalSyntheticLambda0(25, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean z2 = i4 == 32;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda0(26, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    ArcadeModal2Kt.Modal(null, categoryListViewModel, function0, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(432067698, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(i2, function1), gapComposer), gapComposer, ((i3 << 3) & 112) | 1572864, 49);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1437918676);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) categoryListViewModel, function1, i, 11);
        }
    }

    public static final void CategoryListHeader(Function1 function1, Category$CategoryListHeader$ToggleHeader category$CategoryListHeader$ToggleHeader, String str, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1632396719);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(function1) ? 4 : 2) | (gapComposer2.changedInstance(category$CategoryListHeader$ToggleHeader) ? 32 : 16) | (gapComposer2.changed(str) ? 256 : 128) | 3072;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            m3728NotificationSectionHeadereopBjH0(str, 0L, 0L, null, gapComposer2, (i2 >> 6) & 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 0, 15);
            boolean z = category$CategoryListHeader$ToggleHeader.isToggledOn;
            Role role = new Role(2);
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(20, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m336toggleableO2vRcR0 = SelectableKt.m336toggleableO2vRcR0(fillMaxWidth, z, null, m3400rippleYJYuY3k, true, role, (Function1) rememberedValue);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m336toggleableO2vRcR0, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            String str2 = category$CategoryListHeader$ToggleHeader.description;
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer2, (Modifier) m, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            ModalKt.Toggle(0, 6, gapComposer, null, category$CategoryListHeader$ToggleHeader.isToggledOn, false);
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(function1, category$CategoryListHeader$ToggleHeader, str, modifier2, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    public static final void CategorySection(Function1 function1, CATEGORIES categories, List list, Composer composer, int i) {
        GapComposer gapComposer;
        Object obj;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(703825810);
        int i2 = 2;
        int i3 = i | (gapComposer2.changedInstance(function1) ? 4 : 2) | (gapComposer2.changed(categories.ordinal()) ? 32 : 16) | (gapComposer2.changedInstance(list) ? 256 : 128);
        boolean z = 0;
        boolean z2 = true;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (categories == CATEGORIES.STOCK_I_OWN) {
                gapComposer2.startReplaceGroup(-355466518);
                obj = null;
                m3728NotificationSectionHeadereopBjH0(Room.stringResource(gapComposer2, R.string.notification_category_stocks_i_own), 0L, 0L, null, gapComposer2, 0);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            } else {
                obj = null;
                if (categories == CATEGORIES.STOCK_I_FOLLOW) {
                    gapComposer2.startReplaceGroup(-355284889);
                    m3728NotificationSectionHeadereopBjH0(Room.stringResource(gapComposer2, R.string.notification_category_stocks_i_follow), 0L, 0L, null, gapComposer2, 0);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-355153232);
                    gapComposer2.end(false);
                }
            }
            gapComposer2.startReplaceGroup(2066755026);
            Iterator it = list.iterator();
            GapComposer gapComposer3 = gapComposer2;
            while (it.hasNext()) {
                Category category = (Category) it.next();
                String stringResource = Room.stringResource(gapComposer3, category.isCategoryTurnedOn ? R.string.notification_category_enabled : R.string.notification_category_disabled);
                if (category.isCategoryTurnedOn) {
                    gapComposer3.startReplaceGroup(-594386544);
                    gapComposer3.end(z);
                    j = Color.Unspecified;
                } else {
                    gapComposer3.startReplaceGroup(-594344911);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(z);
                    }
                    j = colors.component.cell.label.disabled;
                    gapComposer3.end(z);
                }
                int i4 = 5;
                CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(1426074891, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(stringResource, j, i4), gapComposer3), i2);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1582006111, new CategoryListViewKt$$ExternalSyntheticLambda16(category, z), gapComposer3);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(129272256, new CategoryListViewKt$$ExternalSyntheticLambda16(category, 4), gapComposer3);
                boolean changedInstance = ((i3 & 14) == 4 ? z2 : z) | gapComposer3.changedInstance(category);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(20, function1, category);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer4 = gapComposer3;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(1807007866, new CategoryListViewKt$$ExternalSyntheticLambda16(category, i4), gapComposer3), null, label, 0L, gapComposer4, 12582966, 3444);
                z = z;
                gapComposer3 = gapComposer4;
                i2 = i2;
                obj = null;
                z2 = true;
                i3 = i3;
            }
            boolean z3 = z;
            gapComposer3.end(z3);
            if (categories == CATEGORIES.STOCK_I_OWN) {
                gapComposer3.startReplaceGroup(-354167711);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(z3 ? 1 : 0, 1, gapComposer3, null);
                gapComposer3.end(z3);
                gapComposer = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-354122544);
                gapComposer3.end(z3);
                gapComposer = gapComposer3;
            }
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(function1, (Object) categories, (Object) list, i, 10);
        }
    }

    public static final void ChannelList(ChannelListViewModel channelListViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier.Companion companion;
        channelListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(593251299);
        int i2 = i | (gapComposer.changedInstance(channelListViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            CrossfadeKt.Crossfade(channelListViewModel, SizeKt.fillMaxSize(companion2, 1.0f), (FiniteAnimationSpec) null, "ChannelListCrossFade", Expect_jvmKt.rememberComposableLambda(2064077165, new ShareSheetViewKt$$ExternalSyntheticLambda1(function1, rememberLazyListState), gapComposer), gapComposer, (i2 & 14) | 27696, 4);
            gapComposer.end(true);
            ChannelListViewModel.Loaded loaded = channelListViewModel instanceof ChannelListViewModel.Loaded ? (ChannelListViewModel.Loaded) channelListViewModel : null;
            if (loaded == null) {
                gapComposer.startReplaceGroup(-237718414);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-237718413);
                companion = companion2;
                AnimatedContentKt.AnimatedVisibility(((ChannelListViewModel.Loaded) channelListViewModel).isLoading, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) f611lambda$912185467, (Composer) gapComposer, 200064, 18);
                gapComposer = gapComposer;
                if (loaded.showPermissionsDialog) {
                    gapComposer.startReplaceGroup(-944445331);
                    int i3 = i2 & 112;
                    boolean z = i3 == 32;
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(1, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean z2 = i3 == 32;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new PersonalInfoView$$ExternalSyntheticLambda0(2, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    ArcadeModal2Kt.Modal(null, channelListViewModel, function0, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(-330365207, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(5, function1), gapComposer), gapComposer, ((i2 << 3) & 112) | 1572864, 49);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-944130123);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, (Object) channelListViewModel, function1, i, 15);
        }
    }

    public static final void ContactAliasBase(Function1 function1, ContactMethodType contactMethodType, AliasItem aliasItem, String str, Icons icons, String str2, List list, boolean z, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ComposableLambdaImpl rememberComposableLambda;
        CellDefaultAccessory buttonCompact;
        Function0 function0;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-68108577);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(contactMethodType) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(aliasItem.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(icons.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(list) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changed(z) ? 8388608 : 4194304;
        }
        int i3 = 100663296 & i;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer2.changed(companion) ? 67108864 : 33554432;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            gapComposer2.startReplaceGroup(-1797637859);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-327713751, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 23), gapComposer2);
            gapComposer2.end(false);
            if (str2 == null) {
                gapComposer2.startReplaceGroup(-1797563955);
                gapComposer2.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer2.startReplaceGroup(-1797535435);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-641169423, new InfoSectionKt$$ExternalSyntheticLambda7(str2, 5), gapComposer2);
                gapComposer2.end(false);
            }
            if (z) {
                buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, lambda$1139943975, 15);
            } else {
                int size = list.size();
                buttonCompact = size != 0 ? size != 1 ? CellDefaultAccessory.Push.INSTANCE : null : new CellDefaultAccessory.ButtonCompact(null, null, false, f610lambda$80892794, 15);
            }
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer2.startReplaceGroup(-1796720228);
                boolean changedInstance = ((i2 & 14) == 4) | gapComposer2.changedInstance(list) | ((i2 & 896) == 256);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda10(15, function1, list, aliasItem);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                function0 = (Function0) rememberedValue;
                gapComposer2.end(false);
            } else if (list.size() > 1) {
                gapComposer2.startReplaceGroup(-1796622268);
                boolean changedInstance2 = ((i2 & 14) == 4) | gapComposer2.changedInstance(contactMethodType);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda11(22, function1, contactMethodType);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                function0 = (Function0) rememberedValue2;
                gapComposer2.end(false);
            } else if (list.isEmpty()) {
                gapComposer2.startReplaceGroup(-1796531190);
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ProfileKt$$ExternalSyntheticLambda11(23, function1, aliasItem);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                gapComposer2.end(false);
                function0 = (Function0) rememberedValue3;
            } else {
                gapComposer2.startReplaceGroup(-1796469779);
                gapComposer2.end(false);
                function0 = null;
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda2, Expect_jvmKt.rememberComposableLambda(-2098053426, new InfoSectionKt$$ExternalSyntheticLambda7(str, 4), gapComposer2), companion, function0, false, false, rememberComposableLambda, null, buttonCompact, 0L, gapComposer, ((i2 >> 18) & 896) | 48, 3440);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda3(function1, contactMethodType, aliasItem, str, icons, str2, list, z, i);
        }
    }

    public static final void ContactMethodDetails(int i, Composer composer, ContactMethodDetailsViewModel contactMethodDetailsViewModel, Function1 function1) {
        GapComposer gapComposer;
        function1.getClass();
        contactMethodDetailsViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-117313672);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(function1) ? 4 : 2) | (gapComposer2.changedInstance(contactMethodDetailsViewModel) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.BACK;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(6, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            boolean changedInstance = gapComposer2.changedInstance(contactMethodDetailsViewModel) | (i3 == 4);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda11(16, contactMethodDetailsViewModel, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(null, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer2, 0, 511);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            AnimatedContentKt.AnimatedVisibility(contactMethodDetailsViewModel.isLoading, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) lambda$345557978, (Composer) gapComposer, 200064, 18);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ContactMethodDetailsView$$ExternalSyntheticLambda0(function1, contactMethodDetailsViewModel, i);
        }
    }

    public static final void ContactMethodsSection(ContactMethodSectionViewModel contactMethodSectionViewModel, Modifier modifier, Composer composer, int i) {
        contactMethodSectionViewModel.getClass();
        UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda0 = contactMethodSectionViewModel.onEvent;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(440103182);
        int i2 = (gapComposer.changedInstance(contactMethodSectionViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            ViewfinderDefaults.SectionHeader(contactMethodSectionViewModel.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            PhoneContactAlias(null, utilsKt$$ExternalSyntheticLambda0, contactMethodSectionViewModel.phoneAliases, gapComposer, 0);
            EmailContactAlias(null, utilsKt$$ExternalSyntheticLambda0, contactMethodSectionViewModel.emailAliases, gapComposer, 0);
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(contactMethodSectionViewModel, modifier, i, 21);
        }
    }

    public static final void EmailContactAlias(Modifier modifier, Function1 function1, ContactMethodType contactMethodType, Composer composer, int i) {
        Modifier modifier2;
        AliasItem aliasItem = contactMethodType.aliasType;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(470981047);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | (gapComposer.changedInstance(contactMethodType) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            String stringResource = Room.stringResource(gapComposer, aliasItem.title);
            Icons notificationIcon = ProfileNotificationsUiMapperKt.getNotificationIcon(aliasItem.icon);
            List list = contactMethodType.aliases;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Alias) obj).isChecked) {
                    arrayList.add(obj);
                }
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda8(11);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            String joinToString$default = CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, (Function1) rememberedValue, 31);
            if (joinToString$default.length() <= 0) {
                joinToString$default = null;
            }
            ContactAliasBase(function1, contactMethodType, aliasItem, stringResource, notificationIcon, joinToString$default, contactMethodType.aliases, contactMethodType.hasNoEnabledAlias, gapComposer, 100663296 | ((i3 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(modifier2, function1, (Object) contactMethodType, i, 16);
        }
    }

    public static final void EnablePushDialog(Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1932267183);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ModalKt.Modal((Modifier) null, Room.stringResource(gapComposer, R.string.push_notifications_open_settings_title), Room.stringResource(gapComposer, R.string.push_notifications_open_settings_message), Expect_jvmKt.rememberComposableLambda(2140258677, new ActionPillKt$$ExternalSyntheticLambda0(3, function0), gapComposer), Expect_jvmKt.rememberComposableLambda(-1972975370, new ActionPillKt$$ExternalSyntheticLambda0(i3, function02), gapComposer), (Function3) null, gapComposer, 27648, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftNoteViewKt$$ExternalSyntheticLambda10(function0, function02, i, 2);
        }
    }

    public static final void LoadingIndicator(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(695862946);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        int i2 = (gapComposer.changed(boxScopeInstance) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.loading_spinner_content_description);
            Modifier matchParentSize = boxScopeInstance.matchParentSize();
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(matchParentSize, (Function1) rememberedValue);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clearAndSetSemantics, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(i, 21);
        }
    }

    public static final void LoadingIndicator$1(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(400661997);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            String stringResource = Room.stringResource(gapComposer, R.string.loading_spinner_content_description);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(fillMaxSize, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = new DateScrubber$$ExternalSyntheticLambda0(18);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clearAndSetSemantics, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue3, 28);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m182clickableO2vRcR0$default, Color.m675copywmQWz5c$default(0.75f, colors.semantic.background.f1047app, 14), ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(i, 22);
        }
    }

    public static final void LoadingIndicator$2(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2053429242);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            String stringResource = Room.stringResource(gapComposer, R.string.loading_spinner_content_description);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(fillMaxSize, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = new DateScrubber$$ExternalSyntheticLambda0(19);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clearAndSetSemantics, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue3, 28);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m182clickableO2vRcR0$default, Color.m675copywmQWz5c$default(0.75f, colors.semantic.background.f1047app, 14), ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(i, 23);
        }
    }

    public static final void LoadingIndicator$3(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(50633768);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            String stringResource = Room.stringResource(gapComposer, R.string.loading_spinner_content_description);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(fillMaxSize, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = new DateScrubber$$ExternalSyntheticLambda0(20);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clearAndSetSemantics, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue3, 28);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m182clickableO2vRcR0$default, Color.m675copywmQWz5c$default(0.75f, colors.semantic.background.f1047app, 14), ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposableSingletons$ProfileKt$$ExternalSyntheticLambda0(i, 26);
        }
    }

    public static final void NotificationMessageSection(final ProfileNotificationsViewModel.Loaded.NotificationMessage notificationMessage, Function0 function0, Composer composer, int i) {
        notificationMessage.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1651565978);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(notificationMessage) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(1808847180, new Function2() { // from class: com.squareup.cash.profile.views.notifications.ProfileNotificationsViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    ProfileNotificationsViewModel.Loaded.NotificationMessage notificationMessage2 = notificationMessage;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, notificationMessage2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, notificationMessage2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, function0, false, false, Expect_jvmKt.rememberComposableLambda(-903937966, new Function2() { // from class: com.squareup.cash.profile.views.notifications.ProfileNotificationsViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    ProfileNotificationsViewModel.Loaded.NotificationMessage notificationMessage2 = notificationMessage;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, notificationMessage2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, notificationMessage2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, 0L, new CellDefaultAccessory.ButtonCompact(null, null, false, Expect_jvmKt.rememberComposableLambda(-983602077, new ButtonGroupKt$$ExternalSyntheticLambda11(notificationMessage, i2), gapComposer), 15), null, gapComposer, ((i3 << 3) & 896) | 1572870, 1466);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda0(notificationMessage, function0, i, 24);
        }
    }

    public static final void NotificationPageHeader(final NotificationPageHeaderViewModel notificationPageHeaderViewModel, final Modifier modifier, Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        notificationPageHeaderViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1981953415);
        final int i2 = 2;
        int i3 = (gapComposer.changedInstance(notificationPageHeaderViewModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        final int i4 = 0;
        final int i5 = 1;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (notificationPageHeaderViewModel instanceof NotificationPageHeaderViewModel.EmptyHeader) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(notificationPageHeaderViewModel, modifier, i, i4) { // from class: com.squareup.cash.profile.views.notifications.NotificationPageHeaderKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ NotificationPageHeaderViewModel f$0;
                        public final /* synthetic */ Modifier f$1;

                        {
                            this.$r8$classId = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    ChannelListViewKt.NotificationPageHeader(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    ChannelListViewKt.NotificationPageHeader(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            if (notificationPageHeaderViewModel instanceof NotificationPageHeaderViewModel.AccountHeader) {
                gapComposer.startReplaceGroup(-1458505240);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
                EmptyChatKt.ProfileHeader(Expect_jvmKt.rememberComposableLambda(971050860, new Function2() { // from class: com.squareup.cash.profile.views.notifications.NotificationPageHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i4;
                        NotificationPageHeaderViewModel notificationPageHeaderViewModel2 = notificationPageHeaderViewModel;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    NotificationPageHeaderViewModel.AccountHeader accountHeader = (NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2;
                                    String str = accountHeader.title;
                                    boolean z = accountHeader.isBusinessAccount;
                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    BadgeNameKt.m3727BadgeTitlefjcvTT8(null, str, z, 0L, null, 0L, colors.semantic.text.brand, gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    AvatarsKt.HorizontalStackedAvatars(AvatarSize.Size64, ((NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2).avatar, null, null, gapComposer3, 6, 28);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2).subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1788519766, new Function2() { // from class: com.squareup.cash.profile.views.notifications.NotificationPageHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        NotificationPageHeaderViewModel notificationPageHeaderViewModel2 = notificationPageHeaderViewModel;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    NotificationPageHeaderViewModel.AccountHeader accountHeader = (NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2;
                                    String str = accountHeader.title;
                                    boolean z = accountHeader.isBusinessAccount;
                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    BadgeNameKt.m3727BadgeTitlefjcvTT8(null, str, z, 0L, null, 0L, colors.semantic.text.brand, gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    AvatarsKt.HorizontalStackedAvatars(AvatarSize.Size64, ((NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2).avatar, null, null, gapComposer3, 6, 28);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2).subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(1126662217, new Function2() { // from class: com.squareup.cash.profile.views.notifications.NotificationPageHeaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i2;
                        NotificationPageHeaderViewModel notificationPageHeaderViewModel2 = notificationPageHeaderViewModel;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    NotificationPageHeaderViewModel.AccountHeader accountHeader = (NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2;
                                    String str = accountHeader.title;
                                    boolean z = accountHeader.isBusinessAccount;
                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    BadgeNameKt.m3727BadgeTitlefjcvTT8(null, str, z, 0L, null, 0L, colors.semantic.text.brand, gapComposer2, 0);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    AvatarsKt.HorizontalStackedAvatars(AvatarSize.Size64, ((NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2).avatar, null, null, gapComposer3, 6, 28);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((NotificationPageHeaderViewModel.AccountHeader) notificationPageHeaderViewModel2).subtitle, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 3462, 2);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1458012247);
                gapComposer.end(false);
            }
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(notificationPageHeaderViewModel, modifier, i, i5) { // from class: com.squareup.cash.profile.views.notifications.NotificationPageHeaderKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ NotificationPageHeaderViewModel f$0;
                public final /* synthetic */ Modifier f$1;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            ChannelListViewKt.NotificationPageHeader(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            ChannelListViewKt.NotificationPageHeader(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* renamed from: NotificationSectionHeader-eopBjH0, reason: not valid java name */
    public static final void m3728NotificationSectionHeadereopBjH0(String str, long j, long j2, PaddingValues paddingValues, Composer composer, int i) {
        String str2;
        int i2;
        long j3;
        long j4;
        PaddingValues paddingValues2;
        long j5;
        int i3;
        long j6;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1095032427);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= 128;
        }
        int i4 = i2 | 3072;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                long j7 = MooncakeTheme.getColors(gapComposer).secondaryLabel;
                long j8 = MooncakeTheme.getColors(gapComposer).behindBackground;
                paddingValues2 = new PaddingValuesImpl(20.0f, 26.0f, 16.0f, 14.0f);
                j5 = j7;
                i3 = i4 & (-1009);
                j6 = j8;
            } else {
                gapComposer.skipToGroupEnd();
                j5 = j;
                paddingValues2 = paddingValues;
                i3 = i4 & (-1009);
                j6 = j2;
            }
            gapComposer.endDefaults();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier padding = SpacerKt.padding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), j6, ColorKt.RectangleShape), paddingValues2);
            MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography == null) {
                mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, i3 & 14, 0, 4080, j5, (Composer) gapComposer, padding, mooncakeTypography.identifier, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            j4 = j6;
            j3 = j5;
        } else {
            gapComposer.skipToGroupEnd();
            j3 = j;
            j4 = j2;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBannerCardKt$$ExternalSyntheticLambda5(str, j3, j4, paddingValues2, i, 3);
        }
    }

    public static final void NotificationSectionView(NotificationSectionViewModel notificationSectionViewModel, Composer composer, int i) {
        notificationSectionViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1838765689);
        int i2 = (gapComposer.changedInstance(notificationSectionViewModel) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (notificationSectionViewModel instanceof ContactMethodSectionViewModel) {
            gapComposer.startReplaceGroup(-1822264335);
            ContactMethodsSection((ContactMethodSectionViewModel) notificationSectionViewModel, null, gapComposer, i2 & 14);
            gapComposer.end(false);
        } else if (notificationSectionViewModel instanceof CategoryGroupSectionViewModel) {
            gapComposer.startReplaceGroup(-1822261648);
            CategoryGroupSection((CategoryGroupSectionViewModel) notificationSectionViewModel, null, gapComposer, i2 & 14);
            gapComposer.end(false);
        } else {
            if (!(notificationSectionViewModel instanceof AccountSelectorSectionViewModel)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1822265928, false);
            }
            gapComposer.startReplaceGroup(-1822258926);
            AccountSelectorSection((AccountSelectorSectionViewModel) notificationSectionViewModel, null, gapComposer, i2 & 14);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda2(notificationSectionViewModel, i, 23);
        }
    }

    public static final void PhoneContactAlias(Modifier modifier, UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda0, ContactMethodType contactMethodType, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-944224759);
        int i2 = i | 6 | (gapComposer.changedInstance(utilsKt$$ExternalSyntheticLambda0) ? 32 : 16) | (gapComposer.changedInstance(contactMethodType) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            List list = contactMethodType.aliases;
            AliasItem aliasItem = contactMethodType.aliasType;
            StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 asSequence = CollectionsKt.asSequence(list);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda8(12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            FilteringSequence filter = SequencesKt___SequencesKt.filter(asSequence, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda8(13);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            FilteringSequence mapNotNull = SequencesKt___SequencesKt.mapNotNull(filter, (Function1) rememberedValue2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new OpenSourceKt$$ExternalSyntheticLambda8(14);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            FilteringSequence mapNotNull2 = SequencesKt___SequencesKt.mapNotNull(mapNotNull, (Function1) rememberedValue3);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new OpenSourceKt$$ExternalSyntheticLambda8(15);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            ContactAliasBase(utilsKt$$ExternalSyntheticLambda0, contactMethodType, contactMethodType.aliasType, Room.stringResource(gapComposer, aliasItem.title), ProfileNotificationsUiMapperKt.getNotificationIcon(aliasItem.icon), SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.filter(mapNotNull2, (Function1) rememberedValue4), null, 63), contactMethodType.aliases, contactMethodType.hasNoEnabledAlias, gapComposer, 100663296 | ((i2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(modifier2, utilsKt$$ExternalSyntheticLambda0, contactMethodType, i, 17);
        }
    }

    public static final void ProfileNotifications(int i, Composer composer, ProfileNotificationsViewModel profileNotificationsViewModel, Function1 function1) {
        GapComposer gapComposer;
        function1.getClass();
        profileNotificationsViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(835711386);
        Applier applier = gapComposer2.applier;
        int i2 = (gapComposer2.changedInstance(function1) ? 4 : 2) | i | (gapComposer2.changedInstance(profileNotificationsViewModel) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (profileNotificationsViewModel instanceof ProfileNotificationsViewModel.Loading) {
                gapComposer2.startReplaceGroup(-474253482);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize2);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer2, SpacerKt.m298padding3ABfNKs(companion, 24.0f));
                gapComposer2.end(true);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            } else {
                if (!(profileNotificationsViewModel instanceof ProfileNotificationsViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -569487903, false);
                }
                gapComposer2.startReplaceGroup(-474040729);
                NavigationType navigationType = NavigationType.BACK;
                int i3 = i2 & 14;
                boolean z = i3 == 4;
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(9, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                DBUtil.TitleBarSub(f600lambda$11937495, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                InsetsPaddingValues asPaddingValues = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer2).navigationBars, gapComposer2);
                boolean changedInstance = gapComposer2.changedInstance(profileNotificationsViewModel) | (i3 == 4);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda11(17, profileNotificationsViewModel, function1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                LazyDslKt.LazyColumn(null, null, asPaddingValues, null, null, null, false, null, (Function1) rememberedValue2, gapComposer2, 0, 507);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProfileNotificationsView$$ExternalSyntheticLambda2(function1, profileNotificationsViewModel, i);
        }
    }

    public static final void SponsoredAccountCellItem(Function1 function1, final SponsoredFamilyMember sponsoredFamilyMember, boolean z, boolean z2, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1508579434);
        final int i2 = 2;
        int i3 = i | (gapComposer2.changedInstance(function1) ? 4 : 2) | (gapComposer2.changedInstance(sponsoredFamilyMember) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128);
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            CellDefaultAccessory.Checkbox checkbox = z2 ? new CellDefaultAccessory.Checkbox(sponsoredFamilyMember.notificationsTurnedOn) : null;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1481012408, new Function2() { // from class: com.squareup.cash.profile.views.notifications.ChannelListViewKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AvatarImage.Remote.Image image;
                    int i5 = r2;
                    SponsoredFamilyMember sponsoredFamilyMember2 = sponsoredFamilyMember;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                String str = sponsoredFamilyMember2.displayName;
                                String valueOf = String.valueOf(str != null ? Character.valueOf(StringsKt___StringsKt.first(str)) : null);
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                long j = colors.semantic.background.extraProminent;
                                Image image2 = sponsoredFamilyMember2.profilePicture;
                                if (image2 == null) {
                                    gapComposer3.startReplaceGroup(-1358096996);
                                    gapComposer3.end(false);
                                    image = null;
                                } else {
                                    gapComposer3.startReplaceGroup(-1358096995);
                                    AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer3), false, null, 0L, new ProfileHeaderKt$$ExternalSyntheticLambda0(14), 62);
                                    gapComposer3.end(false);
                                    image = image3;
                                }
                                TextViewKt.Avatar(AvatarSize.Size48, new AvatarEntry(valueOf, j, null, image, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str2 = sponsoredFamilyMember2.displayName;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str3 = sponsoredFamilyMember2.cashtag;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3 != null ? "$".concat(str3) : "", (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2059778553, new Function2() { // from class: com.squareup.cash.profile.views.notifications.ChannelListViewKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AvatarImage.Remote.Image image;
                    int i5 = i4;
                    SponsoredFamilyMember sponsoredFamilyMember2 = sponsoredFamilyMember;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                String str = sponsoredFamilyMember2.displayName;
                                String valueOf = String.valueOf(str != null ? Character.valueOf(StringsKt___StringsKt.first(str)) : null);
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                long j = colors.semantic.background.extraProminent;
                                Image image2 = sponsoredFamilyMember2.profilePicture;
                                if (image2 == null) {
                                    gapComposer3.startReplaceGroup(-1358096996);
                                    gapComposer3.end(false);
                                    image = null;
                                } else {
                                    gapComposer3.startReplaceGroup(-1358096995);
                                    AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer3), false, null, 0L, new ProfileHeaderKt$$ExternalSyntheticLambda0(14), 62);
                                    gapComposer3.end(false);
                                    image = image3;
                                }
                                TextViewKt.Avatar(AvatarSize.Size48, new AvatarEntry(valueOf, j, null, image, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str2 = sponsoredFamilyMember2.displayName;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str3 = sponsoredFamilyMember2.cashtag;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3 != null ? "$".concat(str3) : "", (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i5 = (gapComposer2.changedInstance(sponsoredFamilyMember) ? 1 : 0) | ((i3 & 14) == 4 ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i5 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new g6$$ExternalSyntheticLambda11(z2, function1, sponsoredFamilyMember, 12);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, z, true, Expect_jvmKt.rememberComposableLambda(1237408127, new Function2() { // from class: com.squareup.cash.profile.views.notifications.ChannelListViewKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AvatarImage.Remote.Image image;
                    int i52 = i2;
                    SponsoredFamilyMember sponsoredFamilyMember2 = sponsoredFamilyMember;
                    switch (i52) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                String str = sponsoredFamilyMember2.displayName;
                                String valueOf = String.valueOf(str != null ? Character.valueOf(StringsKt___StringsKt.first(str)) : null);
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                long j = colors.semantic.background.extraProminent;
                                Image image2 = sponsoredFamilyMember2.profilePicture;
                                if (image2 == null) {
                                    gapComposer3.startReplaceGroup(-1358096996);
                                    gapComposer3.end(false);
                                    image = null;
                                } else {
                                    gapComposer3.startReplaceGroup(-1358096995);
                                    AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer3), false, null, 0L, new ProfileHeaderKt$$ExternalSyntheticLambda0(14), 62);
                                    gapComposer3.end(false);
                                    image = image3;
                                }
                                TextViewKt.Avatar(AvatarSize.Size48, new AvatarEntry(valueOf, j, null, image, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str2 = sponsoredFamilyMember2.displayName;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str3 = sponsoredFamilyMember2.cashtag;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3 != null ? "$".concat(str3) : "", (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, checkbox, 0L, null, gapComposer, ((i3 << 9) & 458752) | 14155830, 0, 3348);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotMessageUiKt$$ExternalSyntheticLambda15(function1, sponsoredFamilyMember, z, z2, i, 2);
        }
    }

    public static final void ToggleCellItem(Function1 function1, Channel channel, Accessory.Toggle toggle, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(163676192);
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2) | (gapComposer.changedInstance(channel) ? 32 : 16) | (gapComposer.changedInstance(toggle) ? 256 : 128);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposableLambdaImpl composableLambdaImpl = toggle.isRequired ? f609lambda$808789771 : null;
            CellDefaultAccessory.Toggle toggle2 = new CellDefaultAccessory.Toggle(toggle.isToggledOn);
            boolean z = false;
            boolean z2 = toggle.isEnabled;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1907382702, new ChannelListViewKt$$ExternalSyntheticLambda15(channel, i3), gapComposer);
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean changedInstance = gapComposer.changedInstance(channel) | z | gapComposer.changedInstance(toggle);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda10(14, function1, channel, toggle);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, z2, true, composableLambdaImpl, null, 0L, toggle2, null, gapComposer, 196614, 1418);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(function1, (Object) channel, (Object) toggle, i, 14);
        }
    }
}
