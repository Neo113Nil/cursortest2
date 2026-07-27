package com.zennvvarroo.pealkkk.ui.screens.overview;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShelfPreview.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"ShelfPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShelfPreviewKt {
    public static final void ShelfPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1850308732);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1850308732, i, -1, "com.zennvvarroo.pealkkk.ui.screens.overview.ShelfPreview (ShelfPreview.kt:24)");
            }
            CanvasKt.Canvas(SizeKt.m597height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m5734constructorimpl(160)), new Function1<DrawScope, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.overview.ShelfPreviewKt$ShelfPreview$1
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
                    int i2 = 3;
                    float f = m3232getHeightimpl / 3;
                    int i3 = 0;
                    while (i3 < i2) {
                        float f2 = i3;
                        float f3 = (f2 * f) + (0.75f * f);
                        float f4 = 6.0f;
                        int i4 = i3;
                        DrawScope.m3952drawRectnJ9OG0$default(Canvas, ColorKt.getShelfWood(), OffsetKt.Offset(0.0f, f3), androidx.compose.ui.geometry.SizeKt.Size(m3235getWidthimpl, 6.0f), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        DrawScope.m3952drawRectnJ9OG0$default(Canvas, Color.m3406copywmQWz5c$default(ColorKt.getShelfWood(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(0.0f, f3 + 6.0f), androidx.compose.ui.geometry.SizeKt.Size(m3235getWidthimpl, 4.0f), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        i2 = 3;
                        int i5 = 4;
                        List listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3397boximpl(ColorKt.getPeakCyan()), Color.m3397boximpl(ColorKt.getPeakBlue()), Color.m3397boximpl(ColorKt.getPeakGreen()), Color.m3397boximpl(ColorKt.getPeakOrange()), Color.m3397boximpl(ColorKt.getPeakYellow())});
                        float f5 = f * 0.55f;
                        float f6 = 12.0f;
                        int i6 = 0;
                        while (i6 < i5) {
                            float f7 = (i6 * 8.0f) + 40.0f + (f2 * f4);
                            DrawScope.m3954drawRoundRectuAw5IA$default(Canvas, Color.m3406copywmQWz5c$default(((Color) listOf.get(((i4 * 4) + i6) % listOf.size())).m3417unboximpl(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(f6, f3 - f5), androidx.compose.ui.geometry.SizeKt.Size(f7, f5), CornerRadiusKt.CornerRadius(f4, f4), null, 0.0f, null, 0, 240, null);
                            f6 += f7 + 10.0f;
                            i6++;
                            f4 = f4;
                            f5 = f5;
                            listOf = listOf;
                            i5 = i5;
                            i2 = i2;
                        }
                        i3 = i4 + 1;
                    }
                    float f8 = m3235getWidthimpl * 0.5f;
                    float f9 = m3232getHeightimpl * 0.5f;
                    float f10 = m3235getWidthimpl * 0.4f;
                    DrawScope.m3938drawCircleV9BoPsw$default(Canvas, Brush.Companion.m3360radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3397boximpl(Color.m3406copywmQWz5c$default(ColorKt.getPeakCyan(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3397boximpl(Color.INSTANCE.m3442getTransparent0d7_KjU())}), OffsetKt.Offset(f8, f9), f10, 0, 8, (Object) null), f10, OffsetKt.Offset(f8, f9), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                }
            }, startRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.overview.ShelfPreviewKt$ShelfPreview$2
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
                    ShelfPreviewKt.ShelfPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
