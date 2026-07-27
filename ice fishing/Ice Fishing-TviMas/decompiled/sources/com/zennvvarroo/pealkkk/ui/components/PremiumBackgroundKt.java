package com.zennvvarroo.pealkkk.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PremiumBackground.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"PremiumBackground", "", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PremiumBackgroundKt {
    public static final void PremiumBackground(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1280862120);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1280862120, i, -1, "com.zennvvarroo.pealkkk.ui.components.PremiumBackground (PremiumBackground.kt:21)");
            }
            Modifier background$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.Companion.m3364verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3397boximpl(ColorKt.getPeakBlack()), Color.m3397boximpl(ColorKt.getPeakNavy()), Color.m3397boximpl(ColorKt.getPeakBlack())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(background$default);
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
            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.PremiumBackgroundKt$PremiumBackground$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    float m3235getWidthimpl = Size.m3235getWidthimpl(Canvas.mo3957getSizeNHjbRc());
                    float m3232getHeightimpl = Size.m3232getHeightimpl(Canvas.mo3957getSizeNHjbRc());
                    long m3406copywmQWz5c$default = Color.m3406copywmQWz5c$default(Color.INSTANCE.m3444getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null);
                    float f = 0.0f;
                    float f2 = 0.0f;
                    while (f2 < m3232getHeightimpl) {
                        DrawScope.m3944drawLineNGM6Ib0$default(Canvas, m3406copywmQWz5c$default, OffsetKt.Offset(f, f2), OffsetKt.Offset(m3235getWidthimpl, f2), 1.0f, 0, null, 0.0f, null, 0, 496, null);
                        f2 += 60.0f;
                        m3232getHeightimpl = m3232getHeightimpl;
                        f = 0.0f;
                    }
                    float f3 = m3232getHeightimpl;
                    float f4 = 0.0f;
                    while (f4 < m3235getWidthimpl) {
                        float f5 = f3;
                        DrawScope.m3944drawLineNGM6Ib0$default(Canvas, m3406copywmQWz5c$default, OffsetKt.Offset(f4, 0.0f), OffsetKt.Offset(f4, f5), 1.0f, 0, null, 0.0f, null, 0, 496, null);
                        f4 += 60.0f;
                        f3 = f5;
                    }
                    float f6 = f3;
                    float f7 = m3235getWidthimpl * 0.15f;
                    float f8 = f6 * 0.15f;
                    float f9 = m3235getWidthimpl * 0.55f;
                    DrawScope.m3938drawCircleV9BoPsw$default(Canvas, Brush.Companion.m3360radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3397boximpl(Color.m3406copywmQWz5c$default(ColorKt.getPeakCyan(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())}), OffsetKt.Offset(f7, f8), f9, 0, 8, (Object) null), f9, OffsetKt.Offset(f7, f8), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                    float f10 = m3235getWidthimpl * 0.85f;
                    float f11 = f6 * 0.8f;
                    DrawScope.m3938drawCircleV9BoPsw$default(Canvas, Brush.Companion.m3360radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3397boximpl(Color.m3406copywmQWz5c$default(ColorKt.getPeakBlue(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())}), OffsetKt.Offset(f10, f11), f9, 0, 8, (Object) null), f9, OffsetKt.Offset(f10, f11), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                }
            }, startRestartGroup, 54);
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
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.components.PremiumBackgroundKt$PremiumBackground$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    PremiumBackgroundKt.PremiumBackground(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
