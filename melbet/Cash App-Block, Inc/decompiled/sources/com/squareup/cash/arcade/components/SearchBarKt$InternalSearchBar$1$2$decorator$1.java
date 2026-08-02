package com.squareup.cash.arcade.components;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SharedBoundsNode$$ExternalSyntheticLambda0;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.emoji2.text.MetadataRepo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda9;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class SearchBarKt$InternalSearchBar$1$2$decorator$1 implements TextFieldDecorator {
    public final /* synthetic */ Function0 $clearQuery;
    public final /* synthetic */ Function0 $isQueryEmpty;
    public final /* synthetic */ Function0 $onClearQueryClick;
    public final /* synthetic */ Function0 $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ String $placeholder;
    public final /* synthetic */ MetadataRepo $sharedElementConfig;

    public SearchBarKt$InternalSearchBar$1$2$decorator$1(Function0 function0, String str, MetadataRepo metadataRepo, Function0 function02, String str2, Function0 function03, Function0 function04) {
        this.$onClick = function0;
        this.$onClickLabel = str;
        this.$sharedElementConfig = metadataRepo;
        this.$isQueryEmpty = function02;
        this.$placeholder = str2;
        this.$clearQuery = function03;
        this.$onClearQueryClick = function04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.runtime.internal.ComposableLambdaImpl, java.lang.Object] */
    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2142502588);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changed(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Function0 function0 = this.$onClick;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth.then(function0 != null ? ImageKt.m183clickableoSLSa3U$default(companion2, false, this.$onClickLabel, new Role(0), function0, 9) : companion2), 8.0f, 4.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1779396327);
            MetadataRepo metadataRepo = this.$sharedElementConfig;
            if (metadataRepo == null) {
                gapComposer.end(false);
                companion = companion2;
            } else {
                Modifier.Companion companion3 = companion2;
                for (Object obj : (ArrayList) metadataRepo.mTypeface) {
                    gapComposer.startReplaceGroup(-602879977);
                    SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) metadataRepo.mEmojiCharArray;
                    SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState(obj, gapComposer, 0);
                    AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) metadataRepo.mMetadataList;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new SharedBoundsNode$$ExternalSyntheticLambda0(5);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ?? sharedBounds$default = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, companion3, rememberSharedContentState, animatedVisibilityScope, null, null, (BoundsTransform) rememberedValue, null, null, 1004);
                    gapComposer.end(false);
                    companion3 = sharedBounds$default;
                }
                gapComposer.end(false);
                companion = companion3;
            }
            Trace.m1191Iconww6aTOc(Icons.Search24, (String) null, companion, 0L, gapComposer, 54, 8);
            BiasAlignment biasAlignment = Alignment.Companion.CenterStart;
            if (!(((double) 1.0f) > 0.0d)) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            gapComposer = gapComposer;
            i2 = 1;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4084, colors.component.searchField.placeholder, (Composer) gapComposer, AlphaKt.alpha(companion2, ((Boolean) this.$isQueryEmpty.invoke()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE), (TextStyle) null, (TextLineBalancing) null, this.$placeholder, (Map) null, (Function1) null, false);
            composableLambdaImpl.invoke(gapComposer, 6);
            gapComposer.end(true);
            AnimatedContentKt.AnimatedVisibility(!((Boolean) r3.invoke()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, Expect_jvmKt.rememberComposableLambda(-1676942720, new ShiftNoteViewKt$$ExternalSyntheticLambda9(this.$clearQuery, this.$onClearQueryClick, 2), gapComposer), (Composer) gapComposer, 1600518, 18);
            gapComposer.end(true);
        } else {
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(this, (Object) composableLambdaImpl, i, i2);
        }
    }
}
