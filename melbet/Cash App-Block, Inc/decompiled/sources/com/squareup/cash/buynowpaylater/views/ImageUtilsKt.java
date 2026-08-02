package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.size.Scale;
import coil3.transform.CircleCropTransformation;
import coil3.transform.Transformation;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDocumentViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubLoadingStatus;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda47;
import com.squareup.cash.card.onboarding.DisclosureView$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.contacts.components.SyncContactsCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.protos.cash.cashapproxy.api.SemanticColor;
import com.squareup.protos.cash.cashapproxy.api.TextStyle;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InputEventTrigger;

/* loaded from: classes5.dex */
public abstract class ImageUtilsKt {

    /* renamed from: lambda$-937612682, reason: not valid java name */
    public static final ComposableLambdaImpl f333lambda$937612682 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(10), false, -937612682);
    public static final ComposableLambdaImpl lambda$1389457593 = new ComposableLambdaImpl(new CardStudioViewV2Kt$$ExternalSyntheticLambda47(11), false, 1389457593);

    public static final void AfterPayErrorLoadingContent(int i, int i2, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        String str4;
        String str5;
        int i5;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-819857325);
        Applier applier = gapComposer.applier;
        int i6 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i6 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i3 | 3072;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i3 | (gapComposer.changed(str3) ? 2048 : 1024);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier3 = i7 != 0 ? companion : modifier2;
            String str6 = i8 != 0 ? "" : str3;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            int i9 = i4;
            long j = Strings.getColors(gapComposer).semantic.background.prominent;
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth2, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 16.0f, 32.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Modifier modifier4 = modifier3;
            Room.m1165Text25TpFw(0, 0, 0, 3, i9 & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            if (str6.length() > 0) {
                gapComposer.startReplaceGroup(170098926);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                str5 = str6;
                Room.m1165Text25TpFw(0, 0, 0, 3, (i9 >> 9) & 14, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                i5 = 0;
                gapComposer.end(false);
            } else {
                str5 = str6;
                i5 = 0;
                gapComposer.startReplaceGroup(170334371);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            DBUtil.SpacerBetweenSectionLarge(i5, 1, gapComposer, null);
            coil3.size.SizeKt.Button(function0, null, null, false, false, null, f333lambda$937612682, gapComposer, ((i9 >> 3) & 14) | 1572864, 62);
            gapComposer = gapComposer;
            gapComposer.end(true);
            str4 = str5;
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            str4 = str3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SyncContactsCardKt$$ExternalSyntheticLambda0(str, function0, modifier2, str4, i, i2);
        }
    }

    public static final void DocumentView(AfterPayOrderDocumentViewModel afterPayOrderDocumentViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1957600174);
        int i2 = (gapComposer.changedInstance(afterPayOrderDocumentViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1676127993, new AfterPayOrderDocumentViewKt$$ExternalSyntheticLambda0(function1, afterPayOrderDocumentViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterPayOrderDocumentViewKt$$ExternalSyntheticLambda0(afterPayOrderDocumentViewModel, function1, i);
        }
    }

    public static final void OrderHubContent(AfterPayOrderHubViewModel afterPayOrderHubViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        RealImageLoader realImageLoader2;
        AfterPayOrderHubViewModel afterPayOrderHubViewModel2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1183794280);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(afterPayOrderHubViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            AfterPayOrderHubViewModel.LoadingViewModel loadingViewModel = afterPayOrderHubViewModel.loadingViewModel;
            AfterPayOrderHubLoadingStatus.InitialLoadStatus initialLoadStatus = loadingViewModel.initialLoadStatus;
            AfterPayOrderHubLoadingStatus.PaginatedLoadStatus paginatedLoadStatus = loadingViewModel.paginatedLoadStatus;
            boolean changedInstance = gapComposer.changedInstance(afterPayOrderHubViewModel) | gapComposer.changedInstance(context);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Continuation continuation = null;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new InteractiveCardView$flingTo$1.AnonymousClass2(afterPayOrderHubViewModel, context, continuation, 22);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, paginatedLoadStatus, (Function2) rememberedValue);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            String stringResource = Room.stringResource(gapComposer, R.string.afterpay_activity_title);
            NavigationType navigationType = NavigationType.BACK;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DisclosureView$$ExternalSyntheticLambda1(3, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub(stringResource, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            Modifier fillMaxSize = SizeKt.fillMaxSize(new LayoutWeightElement(1.0f, true), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (initialLoadStatus instanceof AfterPayOrderHubLoadingStatus.InitialLoadStatus.Loading) {
                gapComposer.startReplaceGroup(-1737127944);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(true);
                gapComposer.end(false);
            } else if (initialLoadStatus instanceof AfterPayOrderHubLoadingStatus.InitialLoadStatus.Failure) {
                gapComposer.startReplaceGroup(-1736943370);
                String stringResource2 = Room.stringResource(gapComposer, R.string.afterpay_order_hub_failed_to_load_title);
                String str = ((AfterPayOrderHubLoadingStatus.InitialLoadStatus.Failure) initialLoadStatus).message;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 32.0f);
                boolean z2 = i3 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new DisclosureView$$ExternalSyntheticLambda1(4, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                AfterPayErrorLoadingContent(0, 0, gapComposer, m299paddingVpY3zN4, stringResource2, str, (Function0) rememberedValue3);
                gapComposer.end(false);
            } else {
                if (!(initialLoadStatus instanceof AfterPayOrderHubLoadingStatus.InitialLoadStatus.Success)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -748773994, false);
                }
                gapComposer.startReplaceGroup(-1736493529);
                int i4 = i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO;
                afterPayOrderHubViewModel2 = afterPayOrderHubViewModel;
                realImageLoader2 = realImageLoader;
                OrderHubList(afterPayOrderHubViewModel2, function1, realImageLoader2, gapComposer, i4);
                gapComposer.end(false);
                gapComposer.end(true);
                gapComposer.end(true);
            }
            afterPayOrderHubViewModel2 = afterPayOrderHubViewModel;
            realImageLoader2 = realImageLoader;
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            realImageLoader2 = realImageLoader;
            afterPayOrderHubViewModel2 = afterPayOrderHubViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterPayOrderHubViewKt$$ExternalSyntheticLambda2(afterPayOrderHubViewModel2, function1, realImageLoader2, i, 0);
        }
    }

    public static final void OrderHubList(AfterPayOrderHubViewModel afterPayOrderHubViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1773821833);
        int i2 = i | (gapComposer.changedInstance(afterPayOrderHubViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changed = gapComposer.changed(afterPayOrderHubViewModel.pagingData);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AppLockMonitor$special$$inlined$map$2(afterPayOrderHubViewModel.pagingData, 19);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyPagingItems collectAsLazyPagingItems = LazyPagingItemsKt.collectAsLazyPagingItems((Flow) rememberedValue, gapComposer);
            boolean z = afterPayOrderHubViewModel.loadingViewModel.paginatedLoadStatus instanceof AfterPayOrderHubLoadingStatus.PaginatedLoadStatus.Loading;
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changedInstance = gapComposer.changedInstance(collectAsLazyPagingItems) | ((i2 & 112) == 32) | gapComposer.changedInstance(realImageLoader) | gapComposer.changed(z);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                UserJavascriptInterfaceBase$$ExternalSyntheticLambda25 userJavascriptInterfaceBase$$ExternalSyntheticLambda25 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(collectAsLazyPagingItems, z, function1, realImageLoader, 6);
                gapComposer.updateRememberedValue(userJavascriptInterfaceBase$$ExternalSyntheticLambda25);
                rememberedValue2 = userJavascriptInterfaceBase$$ExternalSyntheticLambda25;
            }
            LazyDslKt.LazyColumn(fillMaxSize, null, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 6, 510);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterPayOrderHubViewKt$$ExternalSyntheticLambda2(afterPayOrderHubViewModel, function1, realImageLoader, i, 1);
        }
    }

    public static final void applyTextModel(TextView textView, TextModel textModel, Function1 function1) {
        TextThemeInfo textThemeInfo;
        int i;
        textView.getClass();
        textModel.getClass();
        TextStyle textStyle = textModel.style;
        textStyle.getClass();
        switch (textStyle) {
            case TEXT_STYLE_BIG_MONEY:
                textThemeInfo = TextStyles.bigMoney;
                break;
            case TEXT_STYLE_HEADER_1:
                textThemeInfo = TextStyles.header1;
                break;
            case TEXT_STYLE_HEADER_2:
                textThemeInfo = TextStyles.header2;
                break;
            case TEXT_STYLE_HEADER_3:
                textThemeInfo = TextStyles.header3;
                break;
            case TEXT_STYLE_HEADER_4:
                textThemeInfo = TextStyles.header4;
                break;
            case TEXT_STYLE_MAIN_TITLE:
                textThemeInfo = TextStyles.mainTitle;
                break;
            case TEXT_STYLE_MAIN_BODY:
                textThemeInfo = TextStyles.mainBody;
                break;
            case TEXT_STYLE_SMALL_TITLE:
                textThemeInfo = TextStyles.smallTitle;
                break;
            case TEXT_STYLE_SMALL_BODY:
                textThemeInfo = TextStyles.smallBody;
                break;
            case TEXT_STYLE_STRONG_CAPTION:
                textThemeInfo = TextStyles.strongCaption;
                break;
            case TEXT_STYLE_CAPTION:
                textThemeInfo = TextStyles.caption;
                break;
            case TEXT_STYLE_IDENTIFIER:
                textThemeInfo = TextStyles.identifier;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
        Strings.applyStyle(textView, textThemeInfo);
        SemanticColor semanticColor = textModel.color;
        if (semanticColor != null) {
            Context context = textView.getContext();
            context.getClass();
            ColorPalette colorPalette = ThemeHelpersKt.findThemeInfo(context).colorPalette;
            int ordinal = semanticColor.ordinal();
            if (ordinal == 0) {
                i = colorPalette.label;
            } else if (ordinal == 1) {
                i = colorPalette.secondaryLabel;
            } else if (ordinal == 2) {
                i = colorPalette.error;
            } else {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        throw new NotImplementedError(null, 1, null);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                i = colorPalette.tertiaryLabel;
            }
            textView.setTextColor(i);
        }
        String str = textModel.text;
        if (str != null) {
            CharSequence charSequence = str;
            if (textModel.useMarkdown) {
                Context context2 = textView.getContext();
                context2.getClass();
                charSequence = InputEventTrigger.Companion.markdownToSpanned$default(str, context2, function1, 6);
            }
            textView.setText(charSequence);
        }
        com.squareup.cash.buynowpaylater.viewmodels.Alignment alignment = textModel.alignment;
        int i2 = alignment == null ? -1 : CommonViewFactoriesKt$WhenMappings.$EnumSwitchMapping$1[alignment.ordinal()];
        int i3 = 8388611;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 17;
            } else if (i2 == 3) {
                i3 = 8388613;
            }
        }
        textView.setGravity(i3);
    }

    public static final void loadMerchantImage(AppCompatImageView appCompatImageView, RealImageLoader realImageLoader, Image image, Drawable drawable) {
        appCompatImageView.getClass();
        realImageLoader.getClass();
        drawable.getClass();
        if (image == null) {
            appCompatImageView.setImageDrawable(drawable);
            return;
        }
        Context context = appCompatImageView.getContext();
        context.getClass();
        ImageRequest.Builder builder = new ImageRequest.Builder(context);
        builder.data = ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo(appCompatImageView));
        ImageRequests_androidKt.target(builder, appCompatImageView);
        Transformation[] transformationArr = {new CircleCropTransformation()};
        Extras.Key key = ImageRequestsKt.transformationsKey;
        ImageRequestsKt.transformations(builder, ArraysKt___ArraysKt.toList(transformationArr));
        ImageRequests_androidKt.placeholder(builder, drawable);
        builder.scale = Scale.FILL;
        realImageLoader.enqueue(builder.build());
    }
}
