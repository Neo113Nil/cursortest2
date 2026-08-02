package com.squareup.cash.merchant.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.CanvasKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewModel;
import com.squareup.cash.history.payments.views.PaymentHistoryWidgetKt;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantBodyViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantHeaderViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantProfileContentViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import com.squareup.cash.merchant.views.components.ActionNoticeKt;
import com.squareup.cash.merchant.views.components.ButtonConfig;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda42;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class MerchantProfileViewKt {
    public static final ComposableLambdaImpl lambda$1010190552 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(3), false, 1010190552);

    /* renamed from: lambda$-1218660455, reason: not valid java name */
    public static final ComposableLambdaImpl f465lambda$1218660455 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(7), false, -1218660455);
    public static final ComposableLambdaImpl lambda$604497614 = new ComposableLambdaImpl(new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(4), false, 604497614);

    /* renamed from: lambda$-482020288, reason: not valid java name */
    public static final ComposableLambdaImpl f466lambda$482020288 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(8), false, -482020288);
    public static final ComposableLambdaImpl lambda$147008659 = new ComposableLambdaImpl(new ComposableSingletons$CashMapViewKt$$ExternalSyntheticLambda0(9), false, 147008659);

    public static final void GenericTreeElementsWidget(Modifier modifier, GenericTreeElementsViewModel genericTreeElementsViewModel, RealImageLoader realImageLoader, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1003702146);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(genericTreeElementsViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 1;
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 131072 : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(realImageLoader) | ((458752 & i2) == 131072) | ((i2 & 57344) == 16384);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(i3, realImageLoader, composableLambdaImpl, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda0(22);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function13 = (Function1) rememberedValue2;
            boolean changedInstance2 = gapComposer.changedInstance(genericTreeElementsViewModel);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new TooltipBoxKt$$ExternalSyntheticLambda2(genericTreeElementsViewModel, 26);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView(function12, wrapContentHeight, null, function13, (Function1) rememberedValue3, gapComposer, 3072, 4);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17((Object) modifier2, (Object) genericTreeElementsViewModel, (Object) realImageLoader, function1, (Object) composableLambdaImpl, i, 3);
        }
    }

    public static final void LoadingContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(854076029);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ArcadeThemeKt.ArcadeTheme(null, null, null, lambda$604497614, gapComposer, 3072, 7);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(i, 5);
        }
    }

    public static final void MerchantBlocking(MerchantBlockingViewModel merchantBlockingViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        merchantBlockingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(215099370);
        int i2 = i | (gapComposer.changedInstance(merchantBlockingViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(modifier, 1.0f));
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
            String str = merchantBlockingViewModel.header;
            Loadable loadable = merchantBlockingViewModel.content;
            NavigationType navigationType = NavigationType.BACK;
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1820480427, new MoneyTabBookletKt$$ExternalSyntheticLambda4(26, (Object) merchantBlockingViewModel, function1), gapComposer), gapComposer, 1572912, 44);
            gapComposer = gapComposer;
            Object invoke = loadable.invoke();
            boolean z3 = loadable.invoke() == null;
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda0(19);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Strings.LoadableFullScreenContent(invoke, z3, fillMaxSize, (Function1) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(-1843858230, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, 5), gapComposer), gapComposer, 200064, 16);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(i, 24, modifier, merchantBlockingViewModel, function1);
        }
    }

    public static final void MerchantBlockingEmptySection(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(288605690);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
            Trace.m1191Iconww6aTOc(Icons.AlertOutline24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 4.0f));
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.merchant_blocking_empty_title), (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 4.0f));
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.merchant_blocking_empty_description), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier, i, 21);
        }
    }

    public static final void MerchantBlockingList(MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList sectionList, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(81525284);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sectionList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, colors.component.cell.background.f171default, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1676502696);
            Iterator it = sectionList.list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded sectionLoaded = (MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded) it.next();
                if (sectionLoaded instanceof MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionTitle) {
                    gapComposer.startReplaceGroup(432050178);
                    if (z) {
                        gapComposer.startReplaceGroup(432082325);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(432151672);
                        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f));
                        gapComposer.end(false);
                    }
                    ViewfinderDefaults.SectionHeader(((MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionTitle) sectionLoaded).title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(false);
                    z = true;
                } else {
                    if (!(sectionLoaded instanceof MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1676503806, false);
                    }
                    gapComposer.startReplaceGroup(1676516477);
                    SectionTile((MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow) sectionLoaded, function1, gapComposer, i2 & 112);
                    gapComposer.end(false);
                }
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier, (Object) sectionList, function1, i, 21);
        }
    }

    public static final void MerchantBlockingSection(MerchantBlockingViewModel.MerchantBlockingSectionViewModel merchantBlockingSectionViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1894317706);
        int i2 = (gapComposer.changedInstance(merchantBlockingSectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (merchantBlockingSectionViewModel instanceof MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionEmpty) {
            gapComposer.startReplaceGroup(2043676851);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            MerchantBlockingEmptySection(SpacerKt.m300paddingVpY3zN4$default(modifier, 32.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 0);
            gapComposer.end(false);
        } else {
            if (!(merchantBlockingSectionViewModel instanceof MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -626812591, false);
            }
            gapComposer.startReplaceGroup(2043840934);
            MerchantBlockingList((MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList) merchantBlockingSectionViewModel, function1, ImageKt.verticalScroll$default(modifier, ImageKt.rememberScrollState(gapComposer), false, 14), gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(i, 25, modifier, merchantBlockingSectionViewModel, function1);
        }
    }

    public static final void MerchantBlockingView(RealImageLoader realImageLoader, MerchantBlockingViewModel merchantBlockingViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        merchantBlockingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(471623672);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(merchantBlockingViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-692789821, new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(23, realImageLoader, merchantBlockingViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(realImageLoader, merchantBlockingViewModel, function1, i, 22);
        }
    }

    public static final void MerchantInfoConfirmation(MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Confirmation confirmation, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-655547881);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(confirmation) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            Transformations.SheetHeader(confirmation.header, (Modifier) null, lambda$1010190552, confirmation.description, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            int i3 = 13;
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(308993298, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(confirmation, i3), gapComposer), gapComposer, 1573248, 56);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(confirmation, function1, i, 4);
        }
    }

    public static final void MerchantInfoFeedback(RealImageLoader realImageLoader, MerchantInfoFeedbackViewModel merchantInfoFeedbackViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        merchantInfoFeedbackViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1640427457);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(merchantInfoFeedbackViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(350041343, new MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda0(function1, merchantInfoFeedbackViewModel, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(realImageLoader, merchantInfoFeedbackViewModel, function1, i, 24);
        }
    }

    public static final void MerchantInfoFeedbackLoaded(MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel merchantInfoFeedbackContentViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        merchantInfoFeedbackContentViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1716707720);
        int i2 = (gapComposer.changedInstance(merchantInfoFeedbackContentViewModel) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
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
            if (merchantInfoFeedbackContentViewModel instanceof MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection) {
                gapComposer.startReplaceGroup(2130092803);
                MerchantInfoSelection((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection) merchantInfoFeedbackContentViewModel, function1, gapComposer, (i2 & 896) | 6 | ((i2 << 3) & 112));
                gapComposer.end(false);
            } else {
                if (!(merchantInfoFeedbackContentViewModel instanceof MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Confirmation)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2130091728, false);
                }
                gapComposer.startReplaceGroup(2130094822);
                MerchantInfoConfirmation((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Confirmation) merchantInfoFeedbackContentViewModel, function1, gapComposer, (i2 & 896) | 6 | ((i2 << 3) & 112));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(merchantInfoFeedbackContentViewModel, modifier, function1, false, i, 26);
        }
    }

    public static final void MerchantInfoRow(final MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow merchantInfoRow, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        merchantInfoRow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1688163834);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(merchantInfoRow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        final int i5 = 1;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            CellDefaultAccessory.Checkbox checkbox = new CellDefaultAccessory.Checkbox(merchantInfoRow.selected);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2142369380, new Function2() { // from class: com.squareup.cash.merchant.views.MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AvatarEntry avatarEntry;
                    int i6 = r2;
                    MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow merchantInfoRow2 = merchantInfoRow;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon merchantInfoIcon = merchantInfoRow2.icon;
                                if (merchantInfoIcon instanceof MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local) {
                                    gapComposer3.startReplaceGroup(-112042355);
                                    zzd zzdVar = Icons.Companion;
                                    String str = ((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local) merchantInfoIcon).icon.arcade_id;
                                    str.getClass();
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str);
                                    if (icons == null) {
                                        gapComposer3.startReplaceGroup(-112042356);
                                        gapComposer3.end(false);
                                        avatarEntry = null;
                                    } else {
                                        gapComposer3.startReplaceGroup(-112042355);
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                        Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        long j = colors.semantic.background.subtle;
                                        Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        AvatarEntry avatarEntry2 = new AvatarEntry("", j, null, new AvatarImage.LocalIcon(icons, colors2.semantic.icon.subtle, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                        gapComposer3.end(false);
                                        avatarEntry = avatarEntry2;
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    if (!(merchantInfoIcon instanceof MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Remote)) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1527637800, false);
                                    }
                                    gapComposer3.startReplaceGroup(-1527622837);
                                    avatarEntry = AvatarsKt.toAvatarEntry(((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Remote) merchantInfoIcon).avatar.avatar, null, null, gapComposer3, 8, 3);
                                    gapComposer3.end(false);
                                }
                                AvatarEntry avatarEntry3 = avatarEntry;
                                if (avatarEntry3 == null) {
                                    gapComposer3.startReplaceGroup(-111621593);
                                } else {
                                    gapComposer3.startReplaceGroup(-111621592);
                                    TextViewKt.Avatar(AvatarSize.Size48, avatarEntry3, null, false, gapComposer3, 6, 28);
                                    gapComposer3 = gapComposer3;
                                }
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, merchantInfoRow2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String str2 = merchantInfoRow2.description;
                                if (str2 == null) {
                                    gapComposer5.startReplaceGroup(1431814990);
                                } else {
                                    gapComposer5.startReplaceGroup(1431814991);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                }
                                gapComposer5.end(false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1969955299, new Function2() { // from class: com.squareup.cash.merchant.views.MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AvatarEntry avatarEntry;
                    int i6 = i5;
                    MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow merchantInfoRow2 = merchantInfoRow;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon merchantInfoIcon = merchantInfoRow2.icon;
                                if (merchantInfoIcon instanceof MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local) {
                                    gapComposer3.startReplaceGroup(-112042355);
                                    zzd zzdVar = Icons.Companion;
                                    String str = ((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local) merchantInfoIcon).icon.arcade_id;
                                    str.getClass();
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str);
                                    if (icons == null) {
                                        gapComposer3.startReplaceGroup(-112042356);
                                        gapComposer3.end(false);
                                        avatarEntry = null;
                                    } else {
                                        gapComposer3.startReplaceGroup(-112042355);
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                        Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        long j = colors.semantic.background.subtle;
                                        Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        AvatarEntry avatarEntry2 = new AvatarEntry("", j, null, new AvatarImage.LocalIcon(icons, colors2.semantic.icon.subtle, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                        gapComposer3.end(false);
                                        avatarEntry = avatarEntry2;
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    if (!(merchantInfoIcon instanceof MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Remote)) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1527637800, false);
                                    }
                                    gapComposer3.startReplaceGroup(-1527622837);
                                    avatarEntry = AvatarsKt.toAvatarEntry(((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Remote) merchantInfoIcon).avatar.avatar, null, null, gapComposer3, 8, 3);
                                    gapComposer3.end(false);
                                }
                                AvatarEntry avatarEntry3 = avatarEntry;
                                if (avatarEntry3 == null) {
                                    gapComposer3.startReplaceGroup(-111621593);
                                } else {
                                    gapComposer3.startReplaceGroup(-111621592);
                                    TextViewKt.Avatar(AvatarSize.Size48, avatarEntry3, null, false, gapComposer3, 6, 28);
                                    gapComposer3 = gapComposer3;
                                }
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, merchantInfoRow2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String str2 = merchantInfoRow2.description;
                                if (str2 == null) {
                                    gapComposer5.startReplaceGroup(1431814990);
                                } else {
                                    gapComposer5.startReplaceGroup(1431814991);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                }
                                gapComposer5.end(false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2);
            int i6 = (gapComposer2.changedInstance(merchantInfoRow) ? 1 : 0) | ((i4 & 896) == 256 ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i6 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(26, function1, merchantInfoRow);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, companion, (Function0) rememberedValue, null, false, true, Expect_jvmKt.rememberComposableLambda(-935470813, new Function2() { // from class: com.squareup.cash.merchant.views.MerchantInfoFeedbackViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AvatarEntry avatarEntry;
                    int i62 = i3;
                    MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow merchantInfoRow2 = merchantInfoRow;
                    switch (i62) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon merchantInfoIcon = merchantInfoRow2.icon;
                                if (merchantInfoIcon instanceof MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local) {
                                    gapComposer3.startReplaceGroup(-112042355);
                                    zzd zzdVar = Icons.Companion;
                                    String str = ((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Local) merchantInfoIcon).icon.arcade_id;
                                    str.getClass();
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str);
                                    if (icons == null) {
                                        gapComposer3.startReplaceGroup(-112042356);
                                        gapComposer3.end(false);
                                        avatarEntry = null;
                                    } else {
                                        gapComposer3.startReplaceGroup(-112042355);
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                                        Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        long j = colors.semantic.background.subtle;
                                        Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                                        if (colors2 == null) {
                                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        AvatarEntry avatarEntry2 = new AvatarEntry("", j, null, new AvatarImage.LocalIcon(icons, colors2.semantic.icon.subtle, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
                                        gapComposer3.end(false);
                                        avatarEntry = avatarEntry2;
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    if (!(merchantInfoIcon instanceof MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Remote)) {
                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1527637800, false);
                                    }
                                    gapComposer3.startReplaceGroup(-1527622837);
                                    avatarEntry = AvatarsKt.toAvatarEntry(((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow.MerchantInfoIcon.Remote) merchantInfoIcon).avatar.avatar, null, null, gapComposer3, 8, 3);
                                    gapComposer3.end(false);
                                }
                                AvatarEntry avatarEntry3 = avatarEntry;
                                if (avatarEntry3 == null) {
                                    gapComposer3.startReplaceGroup(-111621593);
                                } else {
                                    gapComposer3.startReplaceGroup(-111621592);
                                    TextViewKt.Avatar(AvatarSize.Size48, avatarEntry3, null, false, gapComposer3, 6, 28);
                                    gapComposer3 = gapComposer3;
                                }
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, merchantInfoRow2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String str2 = merchantInfoRow2.description;
                                if (str2 == null) {
                                    gapComposer5.startReplaceGroup(1431814990);
                                } else {
                                    gapComposer5.startReplaceGroup(1431814991);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                }
                                gapComposer5.end(false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2), null, checkbox, 0L, null, gapComposer, ((i4 << 3) & 896) | 14155830, 0, 3376);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(i, 23, modifier2, merchantInfoRow, function1);
        }
    }

    public static final void MerchantInfoSelection(MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection selection, Function1 function1, Composer composer, int i) {
        int i2;
        selection.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(855132079);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(selection) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            String str = selection.header;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Transformations.SheetHeader(str, SizeKt.fillMaxWidth(companion, 1.0f), (Function2) null, selection.description, gapComposer, 48, 4);
            gapComposer.startReplaceGroup(1443181969);
            Iterator<E> it = selection.section.iterator();
            while (it.hasNext()) {
                MerchantInfoRow((MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection.MerchantInfoRow) it.next(), null, function1, gapComposer, i2 & 896);
            }
            gapComposer.end(false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            coil3.size.SizeKt.ButtonCta(function0, SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f), ButtonProminence.PROMINENT, false, selection.buttonEnabled, null, Expect_jvmKt.rememberComposableLambda(1613798122, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(selection, 12), gapComposer), gapComposer, 1573248, 40);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(selection, function1, i, 3);
        }
    }

    public static final void MerchantProfileContent(Modifier modifier, MerchantProfileViewModel merchantProfileViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        NavigationType navigationType;
        boolean z;
        Function1 function12 = function1;
        merchantProfileViewModel.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(734086197);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(merchantProfileViewModel) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128) | (gapComposer.changedInstance(realImageLoader) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            int ordinal = merchantProfileViewModel.navigationIcon.ordinal();
            if (ordinal == 0) {
                navigationType = NavigationType.BACK;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                navigationType = NavigationType.CLOSE;
            }
            boolean z2 = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(17, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 390, 104);
            Loadable loadable = merchantProfileViewModel.content;
            if (loadable instanceof Loadable.Loaded) {
                gapComposer.startReplaceGroup(552961399);
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer), false, 14);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                z = true;
                Modifier then = verticalScroll$default.then(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                MerchantProfileContentViewModel merchantProfileContentViewModel = (MerchantProfileContentViewModel) ((Loadable.Loaded) loadable).value;
                MerchantProfileLoaded(then, merchantProfileContentViewModel.header, merchantProfileContentViewModel.body, function12, realImageLoader, gapComposer, (i2 << 3) & 64512);
                function12 = function12;
                gapComposer.end(false);
            } else {
                z = true;
                if (loadable.equals(Loadable.Loading.INSTANCE)) {
                    gapComposer.startReplaceGroup(552969679);
                    LoadingContent(gapComposer, 6);
                    gapComposer.end(false);
                } else {
                    if (!(loadable instanceof Loadable.Failed)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 552959571, false);
                    }
                    gapComposer.startReplaceGroup(552971190);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    MerchantProfileFailed((i2 >> 3) & 112, gapComposer, SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f), function12);
                    gapComposer.end(false);
                }
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(modifier, i, merchantProfileViewModel, function12, realImageLoader, 21);
        }
    }

    public static final void MerchantProfileFailed(int i, Composer composer, Modifier modifier, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1354857068);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
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
            ActionNoticeKt.ActionNotice(SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 16.0f, 1), Room.stringResource(gapComposer, R.string.merchant_loading_error_title), Room.stringResource(gapComposer, R.string.merchant_error_description), null, gapComposer, 6, 8);
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(235059700, new MusicViewKt$$ExternalSyntheticLambda7(10, function1), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CanvasKt$$ExternalSyntheticLambda0(modifier, function1, i, 4);
        }
    }

    public static final void MerchantProfileHeaderArcade(Modifier modifier, MerchantHeaderViewModel merchantHeaderViewModel, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2098066554);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(merchantHeaderViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            String str = merchantHeaderViewModel.name;
            String str2 = str == null ? "" : str;
            String str3 = merchantHeaderViewModel.subtitle;
            EmptyChatKt.ProfileHeader(str2, modifier, Expect_jvmKt.rememberComposableLambda(1309568189, new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(27, merchantHeaderViewModel, mutableInteractionSourceImpl, function0), gapComposer), str3 == null ? "" : str3, gapComposer, ((i2 << 3) & 112) | MLKEMEngine.KyberPolyBytes, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier, merchantHeaderViewModel, function0, i, 25);
        }
    }

    public static final void MerchantProfileLoaded(Modifier modifier, MerchantHeaderViewModel merchantHeaderViewModel, Loadable loadable, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        RealImageLoader realImageLoader2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2020494239);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(merchantHeaderViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(loadable) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            realImageLoader2 = realImageLoader;
            i2 |= gapComposer.changedInstance(realImageLoader2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            realImageLoader2 = realImageLoader;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(18, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MerchantProfileHeaderArcade(fillMaxWidth, merchantHeaderViewModel, (Function0) rememberedValue, gapComposer, (i3 & 112) | 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (loadable instanceof Loadable.Loaded) {
                gapComposer.startReplaceGroup(367632671);
                MerchantBodyViewModel merchantBodyViewModel = (MerchantBodyViewModel) ((Loadable.Loaded) loadable).value;
                boolean changed = gapComposer.changed(merchantBodyViewModel.genericTreeElements);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    List list = merchantBodyViewModel.genericTreeElements.containers;
                    GenericProfileElement.ActivityElement activityElement = new GenericProfileElement.ActivityElement(ByteString.EMPTY);
                    GenericContainerViewModel.ContainerMargin containerMargin = GenericContainerViewModel.ContainerMargin.NONE;
                    rememberedValue2 = Boolean.valueOf(list.contains(new GenericContainerViewModel.PlaceholderContainerViewModel(activityElement, new Pair(containerMargin, containerMargin))));
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                boolean booleanValue = ((Boolean) rememberedValue2).booleanValue();
                GenericTreeElementsWidget(null, merchantBodyViewModel.genericTreeElements, realImageLoader2, function1, Expect_jvmKt.rememberComposableLambda(-867616529, new MoneyTabBookletKt$$ExternalSyntheticLambda4(28, (Object) loadable, function1), gapComposer), gapComposer, ((i3 << 3) & 57344) | ((i3 >> 6) & 896) | 199680);
                if (booleanValue) {
                    z = false;
                    gapComposer.startReplaceGroup(368374315);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(368271488);
                    PaymentHistory(merchantBodyViewModel.paymentHistory, function1, gapComposer, ((i3 >> 3) & 896) | 6);
                    z = false;
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else if (loadable instanceof Loadable.Failed) {
                gapComposer.startReplaceGroup(368418583);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                String stringResource = Room.stringResource(gapComposer, R.string.merchant_activity_loading_error_title);
                String stringResource2 = Room.stringResource(gapComposer, R.string.merchant_error_description);
                String stringResource3 = Room.stringResource(gapComposer, R.string.try_again);
                boolean z3 = i4 == 2048;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda4(14, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                ActionNoticeKt.ActionNotice(m300paddingVpY3zN4$default, stringResource, stringResource2, new ButtonConfig(stringResource3, (Function0) rememberedValue3), gapComposer, 6, 0);
                gapComposer = gapComposer;
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                if (!loadable.equals(Loadable.Loading.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 704595413, false);
                }
                gapComposer.startReplaceGroup(368951163);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                LoadingContent(gapComposer, 6);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17((Object) modifier, (Object) merchantHeaderViewModel, (Object) loadable, function1, (Object) realImageLoader, i, 2);
        }
    }

    public static final void MerchantProfileView(MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen, RealImageLoader realImageLoader, MerchantProfileViewModel merchantProfileViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        merchantProfileViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(617233357);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(merchantProfileViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1169) != 1168)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(394306594, new MerchantProfileViewKt$$ExternalSyntheticLambda0(realImageLoader, merchantProfileViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(merchantScreen$MerchantProfileScreen, realImageLoader, merchantProfileViewModel, function1, i);
        }
    }

    public static final void PaymentHistory(ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        ProfilePaymentHistoryViewModel profilePaymentHistoryViewModel2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(403076467);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(profilePaymentHistoryViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            profilePaymentHistoryViewModel2 = profilePaymentHistoryViewModel;
            PaymentHistoryWidgetKt.PaymentHistoryWidgetView(profilePaymentHistoryViewModel2, (Function1) rememberedValue, companion, gapComposer, ((i2 >> 3) & 14) | ((i2 << 6) & 896), 0);
        } else {
            profilePaymentHistoryViewModel2 = profilePaymentHistoryViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(profilePaymentHistoryViewModel2, function1, i);
        }
    }

    public static final void ProfilePhotoOverlay(Modifier modifier, MerchantProfileViewModel.ProfilePhoto profilePhoto, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1749994196);
        int i2 = i | 6 | (gapComposer.changedInstance(profilePhoto) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda0(24);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedContent(profilePhoto, null, (Function1) rememberedValue, null, "PhotoOverlayAnimatedContent", null, Expect_jvmKt.rememberComposableLambda(-1573768690, new HeroCardViewKt$$ExternalSyntheticLambda1(6, function1), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1597824, 42);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(modifier2, profilePhoto, function1, i, 28);
        }
    }

    public static final void SectionTile(MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow sectionRow, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(974712433);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sectionRow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            StackedAvatarViewModel.Single single = sectionRow.avatar;
            String str = sectionRow.title;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1078388325, new PaymentPlanSummaryKt$$ExternalSyntheticLambda42(single, 3, b), gapComposer);
            int i3 = i2 & 112;
            boolean changedInstance = (i3 == 32) | gapComposer.changedInstance(sectionRow);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MerchantBlockingViewKt$$ExternalSyntheticLambda14(function1, sectionRow, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean changedInstance2 = gapComposer.changedInstance(sectionRow) | (i3 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MerchantBlockingViewKt$$ExternalSyntheticLambda15(0, function1, sectionRow);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.CellSearchResult(rememberComposableLambda, str, (Modifier) null, function0, (String) null, (Function1) rememberedValue2, gapComposer, 6, 20);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(sectionRow, function1, i, 2);
        }
    }
}
