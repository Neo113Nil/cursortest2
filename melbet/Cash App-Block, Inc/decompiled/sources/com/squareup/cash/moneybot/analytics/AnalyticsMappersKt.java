package com.squareup.cash.moneybot.analytics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.afterpayapplet.views.search.AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.afterpayapplet.views.search.AfterpayAppletUpsellCardViewKt$WhenMappings;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import okhttp3.internal.Tags;

/* loaded from: classes5.dex */
public abstract class AnalyticsMappersKt {
    public static final void AfterpayAppletUpsellCard(AfterpayAppletUpsellCardViewModel afterpayAppletUpsellCardViewModel, Modifier modifier, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1221891011);
        int i2 = i | (gapComposer.changedInstance(afterpayAppletUpsellCardViewModel) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function02) ? 2048 : 1024);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            AfterpayAppletUpsellCardViewModel.TrailingContent trailingContent = afterpayAppletUpsellCardViewModel.trailingContent;
            ComposableLambdaImpl composableLambdaImpl = null;
            AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage trailingImage = trailingContent instanceof AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage ? (AfterpayAppletUpsellCardViewModel.TrailingContent.TrailingImage) trailingContent : null;
            if (trailingImage == null || trailingImage.showsBackground) {
                gapComposer.startReplaceGroup(1508096045);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1507717628);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(294045249, new BalanceFeedKt$$ExternalSyntheticLambda9(trailingImage, 23), gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            MoneybotTheme.m3623Cardjb40ds(SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, 0L, RecyclerView.DECELERATION_RATE, function0, composableLambdaImpl2, Expect_jvmKt.rememberComposableLambda(803781501, new AfterpayAppletUpsellCardViewKt$$ExternalSyntheticLambda1(trailingContent, afterpayAppletUpsellCardViewModel, function02, i3), gapComposer), gapComposer, ((i2 << 6) & 57344) | 1572864, 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(modifier, afterpayAppletUpsellCardViewModel, function0, function02, i, 22);
        }
    }

    public static final void CallToActionView(AfterpayAppletUpsellCardViewModel.CallToAction callToAction, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2081023597);
        int i2 = (gapComposer.changedInstance(callToAction) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        } else if (callToAction instanceof AfterpayAppletUpsellCardViewModel.CallToAction.Button) {
            gapComposer.startReplaceGroup(2079080461);
            int i3 = AfterpayAppletUpsellCardViewKt$WhenMappings.$EnumSwitchMapping$0[((AfterpayAppletUpsellCardViewModel.CallToAction.Button) callToAction).button.prominence.ordinal()];
            SizeKt.ButtonCompact(function0, null, i3 != 1 ? i3 != 2 ? i3 != 3 ? ButtonProminence.STANDARD : ButtonProminence.SUBTLE : ButtonProminence.PROMINENT : ButtonProminence.STANDARD, false, false, null, Expect_jvmKt.rememberComposableLambda(2146142723, new BalanceFeedKt$$ExternalSyntheticLambda9(callToAction, 24), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1572864, 58);
            function02 = function0;
            gapComposer = gapComposer;
            gapComposer.end(false);
        } else {
            function02 = function0;
            if (!(callToAction instanceof AfterpayAppletUpsellCardViewModel.CallToAction.Text)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1591086758, false);
            }
            gapComposer.startReplaceGroup(2079313395);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, false), Strings.getTypography(gapComposer).buttonCompact, (TextLineBalancing) null, ((AfterpayAppletUpsellCardViewModel.CallToAction.Text) callToAction).text, (Map) null, (Function1) null, false);
            Icons icons = Icons.SubtlePush16;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            gapComposer = gapComposer;
            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, j, gapComposer, 54, 4);
            gapComposer.end(true);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(callToAction, function02, i, 25);
        }
    }

    public static final void LogoStackContent(AfterpayAppletUpsellCardViewModel.TrailingContent.LogoStack logoStack, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2056225105);
        int i2 = (gapComposer.changedInstance(logoStack) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            AvatarSize avatarSize = AvatarSize.Size48;
            gapComposer.startReplaceGroup(347375392);
            ArrayList arrayList = logoStack.avatars;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(AvatarsKt.toAvatarEntry(((StackedAvatarViewModel.Single) it.next()).avatar, null, null, gapComposer, 8, 3));
            }
            gapComposer.end(false);
            zzabw.HorizontalStackedAvatars(avatarSize, Tags.toImmutableList(arrayList2), null, gapComposer, 6, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(logoStack, i, 12);
        }
    }

    public static final void TrailingContentBackground(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1788502125);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 104.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape);
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
            composableLambdaImpl.invoke(BoxScopeInstance.INSTANCE, (Object) gapComposer, (Object) 54);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppBarKt$$ExternalSyntheticLambda4(i, 18, composableLambdaImpl);
        }
    }

    public static final String toErrorName(ApiResult.Failure failure) {
        failure.getClass();
        if (failure instanceof ApiResult.Failure.NetworkFailure) {
            return "NetworkFailure";
        }
        String simpleName = Reflection.factory.getOrCreateKotlinClass(failure.getClass()).getSimpleName();
        return simpleName == null ? "Unknown" : simpleName;
    }
}
