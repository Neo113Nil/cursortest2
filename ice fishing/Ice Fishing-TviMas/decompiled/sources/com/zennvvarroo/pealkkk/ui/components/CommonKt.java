package com.zennvvarroo.pealkkk.ui.components;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Common.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aD\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0012\u001a<\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aD\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a-\u0010\"\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010#\u001a\u001d\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006(²\u0006\n\u0010)\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"Chip", "", "text", "", "accent", "Landroidx/compose/ui/graphics/Color;", "Chip-RPmYEkk", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "EnumChips", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "", "selectedIndex", "", "onSelect", "Lkotlin/Function1;", "EnumChips-FNF3uiM", "(Ljava/util/List;IJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "FieldLabel", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "GhostButton", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "GhostButton-ww6aTOc", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "GlassCard", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "GlassCard-3IgeMak", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PrimaryButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ScreenHeader", "title", "subtitle", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_release", "bg"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonKt {
    public static final void ScreenHeader(final String title, final String subtitle, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Composer startRestartGroup = composer.startRestartGroup(-1772340400);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(subtitle) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1772340400, i3, -1, "com.zennvvarroo.pealkkk.ui.components.ScreenHeader (Common.kt:40)");
            }
            Modifier m563paddingVpY3zN4 = PaddingKt.m563paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m5734constructorimpl(20), Dp.m5734constructorimpl(14));
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m563paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2125Text4IGK_g(title, (Modifier) null, ColorKt.getPeakWhite(), TextUnitKt.getSp(28), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 200064, 0, 131026);
            SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(4)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m2125Text4IGK_g(subtitle, (Modifier) null, ColorKt.getPeakMuted(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i3 >> 3) & 14) | 3456, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$ScreenHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    CommonKt.ScreenHeader(title, subtitle, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055  */
    /* renamed from: GlassCard-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6206GlassCard3IgeMak(Modifier modifier, long j, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m2937constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1665878762);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    j2 = ColorKt.getPeakCyan();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1665878762, i3, -1, "com.zennvvarroo.pealkkk.ui.components.GlassCard (Common.kt:53)");
                }
                float f = 20;
                Modifier m562padding3ABfNKs = PaddingKt.m562padding3ABfNKs(BorderKt.m221borderxT4_qwU(BackgroundKt.background$default(ClipKt.clip(companion, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f))), Brush.Companion.m3364verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3397boximpl(Color.m3406copywmQWz5c$default(ColorKt.getPeakPanelLight(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3397boximpl(Color.m3406copywmQWz5c$default(ColorKt.getPeakPanel(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m5734constructorimpl(1), Color.m3406copywmQWz5c$default(j2, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f))), Dp.m5734constructorimpl(16));
                int i6 = (i3 << 3) & 7168;
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m562padding3ABfNKs);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                content.invoke(ColumnScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                final long j3 = j2;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$GlassCard$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        CommonKt.m6206GlassCard3IgeMak(Modifier.this, j3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        j2 = j;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f2 = 20;
        Modifier m562padding3ABfNKs2 = PaddingKt.m562padding3ABfNKs(BorderKt.m221borderxT4_qwU(BackgroundKt.background$default(ClipKt.clip(companion, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2))), Brush.Companion.m3364verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3397boximpl(Color.m3406copywmQWz5c$default(ColorKt.getPeakPanelLight(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3397boximpl(Color.m3406copywmQWz5c$default(ColorKt.getPeakPanel(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m5734constructorimpl(1), Color.m3406copywmQWz5c$default(j2, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2))), Dp.m5734constructorimpl(16));
        int i62 = (i3 << 3) & 7168;
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m562padding3ABfNKs2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl.getInserting()) {
        }
        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
        content.invoke(ColumnScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i62 >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrimaryButton(final String text, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(364488873);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if ((i4 & 731) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(364488873, i4, -1, "com.zennvvarroo.pealkkk.ui.components.PrimaryButton (Common.kt:69)");
                }
                Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                ButtonKt.Button(onClick, SizeKt.m597height3ABfNKs(modifier4, Dp.m5734constructorimpl(48)), false, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(14)), ButtonDefaults.INSTANCE.m1267buttonColorsro_MJ88(ColorKt.getPeakCyan(), ColorKt.getPeakBlack(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1113084057, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$PrimaryButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i6 & 81) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1113084057, i6, -1, "com.zennvvarroo.pealkkk.ui.components.PrimaryButton.<anonymous> (Common.kt:76)");
                        }
                        TextKt.m2125Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, ((i4 >> 3) & 14) | 805306368, 484);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$PrimaryButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        CommonKt.PrimaryButton(text, onClick, modifier3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 731) == 146) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier52 = modifier4;
        composer2 = startRestartGroup;
        ButtonKt.Button(onClick, SizeKt.m597height3ABfNKs(modifier4, Dp.m5734constructorimpl(48)), false, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(14)), ButtonDefaults.INSTANCE.m1267buttonColorsro_MJ88(ColorKt.getPeakCyan(), ColorKt.getPeakBlack(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1113084057, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$PrimaryButton$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer3, int i6) {
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i6 & 81) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1113084057, i6, -1, "com.zennvvarroo.pealkkk.ui.components.PrimaryButton.<anonymous> (Common.kt:76)");
                }
                TextKt.m2125Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer2, ((i4 >> 3) & 14) | 805306368, 484);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* renamed from: GhostButton-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6205GhostButtonww6aTOc(final String text, final Function0<Unit> onClick, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        int i5;
        Composer composer2;
        final long j3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1872191347);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                i5 = i3;
                if ((i5 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    long peakWhite = i4 != 0 ? ColorKt.getPeakWhite() : j2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1872191347, i5, -1, "com.zennvvarroo.pealkkk.ui.components.GhostButton (Common.kt:81)");
                    }
                    Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    ButtonKt.OutlinedButton(onClick, SizeKt.m597height3ABfNKs(modifier4, Dp.m5734constructorimpl(44)), false, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(12)), ButtonDefaults.INSTANCE.m1277outlinedButtonColorsro_MJ88(0L, peakWhite, 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | ((i5 >> 6) & 112), 13), null, BorderStrokeKt.m237BorderStrokecXLIe8U(Dp.m5734constructorimpl(1), Color.m3406copywmQWz5c$default(peakWhite, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1501301503, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$GhostButton$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope OutlinedButton, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                            if ((i7 & 81) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1501301503, i7, -1, "com.zennvvarroo.pealkkk.ui.components.GhostButton.<anonymous> (Common.kt:89)");
                            }
                            TextKt.m2125Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, ((i5 >> 3) & 14) | 805306368, 420);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = peakWhite;
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j3 = j2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$GhostButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            CommonKt.m6205GhostButtonww6aTOc(text, onClick, modifier3, j3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            j2 = j;
            i5 = i3;
            if ((i5 & 5851) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            composer2 = startRestartGroup;
            ButtonKt.OutlinedButton(onClick, SizeKt.m597height3ABfNKs(modifier4, Dp.m5734constructorimpl(44)), false, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(12)), ButtonDefaults.INSTANCE.m1277outlinedButtonColorsro_MJ88(0L, peakWhite, 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | ((i5 >> 6) & 112), 13), null, BorderStrokeKt.m237BorderStrokecXLIe8U(Dp.m5734constructorimpl(1), Color.m3406copywmQWz5c$default(peakWhite, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1501301503, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$GhostButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope OutlinedButton, Composer composer3, int i7) {
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i7 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1501301503, i7, -1, "com.zennvvarroo.pealkkk.ui.components.GhostButton.<anonymous> (Common.kt:89)");
                    }
                    TextKt.m2125Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i5 >> 3) & 14) | 805306368, 420);
            if (ComposerKt.isTraceInProgress()) {
            }
            j3 = peakWhite;
            modifier3 = modifier52;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j2 = j;
        i5 = i3;
        if ((i5 & 5851) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier522 = modifier4;
        composer2 = startRestartGroup;
        ButtonKt.OutlinedButton(onClick, SizeKt.m597height3ABfNKs(modifier4, Dp.m5734constructorimpl(44)), false, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(12)), ButtonDefaults.INSTANCE.m1277outlinedButtonColorsro_MJ88(0L, peakWhite, 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | ((i5 >> 6) & 112), 13), null, BorderStrokeKt.m237BorderStrokecXLIe8U(Dp.m5734constructorimpl(1), Color.m3406copywmQWz5c$default(peakWhite, 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1501301503, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$GhostButton$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope OutlinedButton, Composer composer3, int i7) {
                Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                if ((i7 & 81) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1501301503, i7, -1, "com.zennvvarroo.pealkkk.ui.components.GhostButton.<anonymous> (Common.kt:89)");
                }
                TextKt.m2125Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composer2, ((i5 >> 3) & 14) | 805306368, 420);
        if (ComposerKt.isTraceInProgress()) {
        }
        j3 = peakWhite;
        modifier3 = modifier522;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: Chip-RPmYEkk, reason: not valid java name */
    public static final void m6203ChipRPmYEkk(final String text, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-106340325);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-106340325, i3, -1, "com.zennvvarroo.pealkkk.ui.components.Chip (Common.kt:94)");
            }
            float f = 10;
            Modifier m563paddingVpY3zN4 = PaddingKt.m563paddingVpY3zN4(BorderKt.m221borderxT4_qwU(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f))), Color.m3406copywmQWz5c$default(j, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m5734constructorimpl(1), Color.m3406copywmQWz5c$default(j, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f))), Dp.m5734constructorimpl(f), Dp.m5734constructorimpl(4));
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m563paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m2125Text4IGK_g(text, (Modifier) null, j, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680 | (i3 & 14) | ((i3 << 3) & 896), 0, 131026);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$Chip$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    CommonKt.m6203ChipRPmYEkk(text, j, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* renamed from: EnumChips-FNF3uiM, reason: not valid java name */
    public static final void m6204EnumChipsFNF3uiM(final List<String> options, final int i, final long j, final Function1<? super Integer, Unit> onSelect, Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer startRestartGroup = composer.startRestartGroup(1462582938);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1462582938, i2, -1, "com.zennvvarroo.pealkkk.ui.components.EnumChips (Common.kt:112)");
        }
        boolean z = 1;
        Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
        Arrangement.HorizontalOrVertical m471spacedBy0680j_4 = Arrangement.INSTANCE.m471spacedBy0680j_4(Dp.m5734constructorimpl(6));
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m471spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        String str = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(horizontalScroll$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326681643, "C92@4661L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1559066244);
        int i3 = 0;
        for (Object obj : options) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            boolean z2 = i3 == i ? z : false;
            final int i5 = i3;
            String str3 = str;
            float f = 12;
            Modifier m221borderxT4_qwU = BorderKt.m221borderxT4_qwU(BackgroundKt.m210backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f))), EnumChips_FNF3uiM$lambda$6$lambda$5$lambda$2(SingleValueAnimationKt.m104animateColorAsStateeuL9pac(z2 ? Color.m3406copywmQWz5c$default(j, 0.25f, 0.0f, 0.0f, 0.0f, 14, null) : ColorKt.getPeakPanelLight(), null, "chipBg", null, startRestartGroup, 384, 10)), null, 2, null), Dp.m5734constructorimpl((float) z), z2 ? j : Color.m3406copywmQWz5c$default(Color.INSTANCE.m3444getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f)));
            startRestartGroup.startReplaceableGroup(1803573711);
            boolean changed = (((((i2 & 7168) ^ 3072) <= 2048 || !startRestartGroup.changed(onSelect)) && (i2 & 3072) != 2048) ? false : z) | startRestartGroup.changed(i5);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$EnumChips$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        onSelect.invoke(Integer.valueOf(i5));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m563paddingVpY3zN4 = PaddingKt.m563paddingVpY3zN4(ClickableKt.m244clickableXHw0xAI$default(m221borderxT4_qwU, false, null, null, (Function0) rememberedValue, 7, null), Dp.m5734constructorimpl(f), Dp.m5734constructorimpl(8));
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, str3);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m563paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl2 = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m2125Text4IGK_g(str2, (Modifier) null, z2 ? j : ColorKt.getPeakWhite(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            i3 = i4;
            str = str3;
            z = z;
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$EnumChips$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    CommonKt.m6204EnumChipsFNF3uiM(options, i, j, onSelect, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final void FieldLabel(final String text, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(2026450038);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2026450038, i2, -1, "com.zennvvarroo.pealkkk.ui.components.FieldLabel (Common.kt:137)");
            }
            TextKt.m2125Text4IGK_g(text, (Modifier) null, ColorKt.getPeakMuted(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i2 & 14) | 200064, 0, 131026);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(4)), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.CommonKt$FieldLabel$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    CommonKt.FieldLabel(text, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final long EnumChips_FNF3uiM$lambda$6$lambda$5$lambda$2(State<Color> state) {
        return state.getValue().m3417unboximpl();
    }
}
