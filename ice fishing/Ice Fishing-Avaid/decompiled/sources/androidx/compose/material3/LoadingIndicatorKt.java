package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.ShapeUtilKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import androidx.graphics.shapes.Morph;
import androidx.graphics.shapes.RoundedPolygon;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoadingIndicator.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aU\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aG\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aK\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a=\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010!\u001a\u00020\"H\u0002\u001a\u0016\u0010#\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002\u001a\f\u0010$\u001a\u00020\u0004*\u00020%H\u0002\u001a\f\u0010&\u001a\u00020\u0004*\u00020%H\u0002\u001a1\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100\"\u000e\u00101\u001a\u000202X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u000204X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u00067²\u0006\n\u00108\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u000202X\u008a\u008e\u0002"}, d2 = {"LoadingIndicator", "", NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "polygons", "", "Landroidx/graphics/shapes/RoundedPolygon;", "LoadingIndicator-cf5BqRc", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLjava/util/List;Landroidx/compose/runtime/Composer;II)V", "LoadingIndicator-3IgeMak", "(Landroidx/compose/ui/Modifier;JLjava/util/List;Landroidx/compose/runtime/Composer;II)V", "ContainedLoadingIndicator", "containerColor", "indicatorColor", "containerShape", "Landroidx/compose/ui/graphics/Shape;", "ContainedLoadingIndicator-Y0xEhic", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "ContainedLoadingIndicator-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "LoadingIndicatorImpl", "indicatorPolygons", "LoadingIndicatorImpl-t6yy7ic", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "LoadingIndicatorImpl-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "morphSequence", "Landroidx/graphics/shapes/Morph;", "circularSequence", "", "calculateScaleFactor", "width", "", "height", "processPath", "Landroidx/compose/ui/graphics/Path;", "path", "size", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "scaleMatrix", "Landroidx/compose/ui/graphics/Matrix;", "processPath-3rZdNqA", "(Landroidx/compose/ui/graphics/Path;JF[F)Landroidx/compose/ui/graphics/Path;", "GlobalRotationDurationMillis", "", "MorphIntervalMillis", "", "FullRotation", "QuarterRotation", "material3", "morphRotationTargetAngle", "currentMorphIndex"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class LoadingIndicatorKt {
    private static final float FullRotation = 360.0f;
    private static final int GlobalRotationDurationMillis = 4666;
    private static final long MorphIntervalMillis = 650;
    private static final float QuarterRotation = 90.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContainedLoadingIndicator_DTcfvLk$lambda$0(Modifier modifier, long j, long j2, Shape shape, List list, int i, int i2, Composer composer, int i3) {
        m3499ContainedLoadingIndicatorDTcfvLk(modifier, j, j2, shape, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContainedLoadingIndicator_Y0xEhic$lambda$0(Function0 function0, Modifier modifier, long j, long j2, Shape shape, List list, int i, int i2, Composer composer, int i3) {
        m3500ContainedLoadingIndicatorY0xEhic(function0, modifier, j, j2, shape, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicatorImpl_eopBjH0$lambda$15(Modifier modifier, long j, long j2, Shape shape, List list, int i, Composer composer, int i2) {
        m3503LoadingIndicatorImpleopBjH0(modifier, j, j2, shape, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicatorImpl_t6yy7ic$lambda$8(Function0 function0, Modifier modifier, long j, long j2, Shape shape, List list, int i, Composer composer, int i2) {
        m3504LoadingIndicatorImplt6yy7ic(function0, modifier, j, j2, shape, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicator_3IgeMak$lambda$0(Modifier modifier, long j, List list, int i, int i2, Composer composer, int i3) {
        m3501LoadingIndicator3IgeMak(modifier, j, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicator_cf5BqRc$lambda$0(Function0 function0, Modifier modifier, long j, List list, int i, int i2, Composer composer, int i3) {
        m3502LoadingIndicatorcf5BqRc(function0, modifier, j, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0057  */
    /* renamed from: LoadingIndicator-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3502LoadingIndicatorcf5BqRc(final Function0<Float> function0, Modifier modifier, long j, List<RoundedPolygon> list, Composer composer, final int i, final int i2) {
        Function0<Float> function02;
        int i3;
        Modifier modifier2;
        long j2;
        final List<RoundedPolygon> list2;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        List<RoundedPolygon> list3;
        Modifier modifier4;
        long j4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1086049965);
        ComposerKt.sourceInformation(startRestartGroup, "C(LoadingIndicator)N(progress,modifier,color:c#ui.graphics.Color,polygons)105@4611L14,100@4405L265:LoadingIndicator.kt#uh7d8r");
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    list2 = list;
                    if (startRestartGroup.changedInstance(list2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    list2 = list;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                list2 = list;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "97@4289L14");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    Modifier modifier5 = modifier2;
                    i4 = i3;
                    j4 = j2;
                    modifier4 = modifier5;
                    list3 = list2;
                } else {
                    Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        j2 = LoadingIndicatorDefaults.INSTANCE.getIndicatorColor(startRestartGroup, 0);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        list3 = LoadingIndicatorDefaults.INSTANCE.getDeterminateIndicatorPolygons();
                        i4 = i3 & (-7169);
                    } else {
                        i4 = i3;
                        list3 = list2;
                    }
                    modifier4 = companion;
                    j4 = j2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1086049965, i4, -1, "androidx.compose.material3.LoadingIndicator (LoadingIndicator.kt:100)");
                }
                long j5 = j4;
                m3504LoadingIndicatorImplt6yy7ic(function02, modifier4, Color.INSTANCE.m6822getUnspecified0d7_KjU(), j5, LoadingIndicatorDefaults.INSTANCE.getContainerShape(startRestartGroup, 0), list3, startRestartGroup, (i4 & 14) | 384 | (i4 & 112) | ((i4 << 3) & 7168) | ((i4 << 6) & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j3 = j5;
                list2 = list3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit LoadingIndicator_cf5BqRc$lambda$0;
                        LoadingIndicator_cf5BqRc$lambda$0 = LoadingIndicatorKt.LoadingIndicator_cf5BqRc$lambda$0(Function0.this, modifier3, j3, list2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return LoadingIndicator_cf5BqRc$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* renamed from: LoadingIndicator-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3501LoadingIndicator3IgeMak(Modifier modifier, long j, List<RoundedPolygon> list, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        final List<RoundedPolygon> list2;
        final Modifier modifier3;
        final long j3;
        long j4;
        Modifier modifier4;
        List<RoundedPolygon> indeterminateIndicatorPolygons;
        long j5;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(387862047);
        ComposerKt.sourceInformation(startRestartGroup, "C(LoadingIndicator)N(modifier,color:c#ui.graphics.Color,polygons)138@5959L14,134@5782L236:LoadingIndicator.kt#uh7d8r");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                list2 = list;
                if (startRestartGroup.changedInstance(list2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                list2 = list;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            list2 = list;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "131@5664L14");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                j4 = j2;
                modifier4 = modifier2;
            } else {
                Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    j2 = LoadingIndicatorDefaults.INSTANCE.getIndicatorColor(startRestartGroup, 0);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    indeterminateIndicatorPolygons = LoadingIndicatorDefaults.INSTANCE.getIndeterminateIndicatorPolygons();
                    long j6 = j2;
                    modifier4 = companion;
                    j5 = j6;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(387862047, i3, -1, "androidx.compose.material3.LoadingIndicator (LoadingIndicator.kt:134)");
                    }
                    long j7 = j5;
                    m3503LoadingIndicatorImpleopBjH0(modifier4, Color.INSTANCE.m6822getUnspecified0d7_KjU(), j7, LoadingIndicatorDefaults.INSTANCE.getContainerShape(startRestartGroup, 0), indeterminateIndicatorPolygons, startRestartGroup, (i3 & 14) | 48 | ((i3 << 3) & 896) | ((i3 << 6) & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j3 = j7;
                    list2 = indeterminateIndicatorPolygons;
                } else {
                    j4 = j2;
                    modifier4 = companion;
                }
            }
            j5 = j4;
            indeterminateIndicatorPolygons = list2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            long j72 = j5;
            m3503LoadingIndicatorImpleopBjH0(modifier4, Color.INSTANCE.m6822getUnspecified0d7_KjU(), j72, LoadingIndicatorDefaults.INSTANCE.getContainerShape(startRestartGroup, 0), indeterminateIndicatorPolygons, startRestartGroup, (i3 & 14) | 48 | ((i3 << 3) & 896) | ((i3 << 6) & 57344));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            j3 = j72;
            list2 = indeterminateIndicatorPolygons;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = j2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LoadingIndicator_3IgeMak$lambda$0;
                    LoadingIndicator_3IgeMak$lambda$0 = LoadingIndicatorKt.LoadingIndicator_3IgeMak$lambda$0(Modifier.this, j3, list2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return LoadingIndicator_3IgeMak$lambda$0;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a9  */
    /* renamed from: ContainedLoadingIndicator-Y0xEhic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3500ContainedLoadingIndicatorY0xEhic(final Function0<Float> function0, Modifier modifier, long j, long j2, Shape shape, List<RoundedPolygon> list, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        Shape shape2;
        List<RoundedPolygon> list2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final Shape shape3;
        final List<RoundedPolygon> list3;
        ScopeUpdateScope endRestartGroup;
        long j7;
        Shape shape4;
        List<RoundedPolygon> list4;
        Modifier modifier4;
        long j8;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1484812328);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContainedLoadingIndicator)N(progress,modifier,containerColor:c#ui.graphics.Color,indicatorColor:c#ui.graphics.Color,containerShape,polygons)182@8127L246:LoadingIndicator.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i5 = 16384;
                        i3 |= i5;
                    }
                } else {
                    shape2 = shape;
                }
                i5 = 8192;
                i3 |= i5;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    list2 = list;
                    if (startRestartGroup.changedInstance(list2)) {
                        i4 = 131072;
                        i3 |= i4;
                    }
                } else {
                    list2 = list;
                }
                i4 = 65536;
                i3 |= i4;
            } else {
                list2 = list;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "177@7855L23,178@7933L23,179@8011L14");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    j7 = j4;
                    shape4 = shape2;
                    list4 = list2;
                    modifier4 = modifier2;
                } else {
                    Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j3 = LoadingIndicatorDefaults.INSTANCE.getContainedContainerColor(startRestartGroup, 0);
                    }
                    if ((i2 & 8) != 0) {
                        j4 = LoadingIndicatorDefaults.INSTANCE.getContainedIndicatorColor(startRestartGroup, 0);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        shape2 = LoadingIndicatorDefaults.INSTANCE.getContainerShape(startRestartGroup, 0);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        list4 = LoadingIndicatorDefaults.INSTANCE.getDeterminateIndicatorPolygons();
                        j8 = j3;
                        j7 = j4;
                        shape4 = shape2;
                        modifier4 = companion;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1484812328, i3, -1, "androidx.compose.material3.ContainedLoadingIndicator (LoadingIndicator.kt:182)");
                        }
                        composer2 = startRestartGroup;
                        m3504LoadingIndicatorImplt6yy7ic(function0, modifier4, j8, j7, shape4, list4, composer2, i3 & 524286);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j5 = j8;
                        j6 = j7;
                        shape3 = shape4;
                        list3 = list4;
                    } else {
                        j7 = j4;
                        shape4 = shape2;
                        list4 = list2;
                        modifier4 = companion;
                    }
                }
                j8 = j3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                m3504LoadingIndicatorImplt6yy7ic(function0, modifier4, j8, j7, shape4, list4, composer2, i3 & 524286);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                j5 = j8;
                j6 = j7;
                shape3 = shape4;
                list3 = list4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
                shape3 = shape2;
                list3 = list2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ContainedLoadingIndicator_Y0xEhic$lambda$0;
                        ContainedLoadingIndicator_Y0xEhic$lambda$0 = LoadingIndicatorKt.ContainedLoadingIndicator_Y0xEhic$lambda$0(Function0.this, modifier3, j5, j6, shape3, list3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ContainedLoadingIndicator_Y0xEhic$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: ContainedLoadingIndicator-DTcfvLk, reason: not valid java name */
    public static final void m3499ContainedLoadingIndicatorDTcfvLk(Modifier modifier, long j, long j2, Shape shape, List<RoundedPolygon> list, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        Shape shape2;
        List<RoundedPolygon> list2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final Shape shape3;
        final long j6;
        final List<RoundedPolygon> list3;
        Shape shape4;
        long j7;
        List<RoundedPolygon> list4;
        Modifier modifier4;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(663218740);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContainedLoadingIndicator)N(modifier,containerColor:c#ui.graphics.Color,indicatorColor:c#ui.graphics.Color,containerShape,polygons)221@9918L217:LoadingIndicator.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                shape2 = shape;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            shape2 = shape;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                list2 = list;
                if (startRestartGroup.changedInstance(list2)) {
                    i4 = 16384;
                    i3 |= i4;
                }
            } else {
                list2 = list;
            }
            i4 = 8192;
            i3 |= i4;
        } else {
            list2 = list;
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "216@9644L23,217@9722L23,218@9800L14");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                shape4 = shape2;
                j7 = j4;
                list4 = list2;
                modifier4 = modifier2;
            } else {
                Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    j3 = LoadingIndicatorDefaults.INSTANCE.getContainedContainerColor(startRestartGroup, 0);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = LoadingIndicatorDefaults.INSTANCE.getContainedIndicatorColor(startRestartGroup, 0);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    shape2 = LoadingIndicatorDefaults.INSTANCE.getContainerShape(startRestartGroup, 0);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    list4 = LoadingIndicatorDefaults.INSTANCE.getIndeterminateIndicatorPolygons();
                    shape4 = shape2;
                    j7 = j4;
                } else {
                    shape4 = shape2;
                    j7 = j4;
                    list4 = list2;
                }
                modifier4 = companion;
            }
            long j8 = j3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(663218740, i3, -1, "androidx.compose.material3.ContainedLoadingIndicator (LoadingIndicator.kt:221)");
            }
            composer2 = startRestartGroup;
            m3503LoadingIndicatorImpleopBjH0(modifier4, j8, j7, shape4, list4, composer2, i3 & 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j5 = j8;
            j6 = j7;
            shape3 = shape4;
            list3 = list4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            j5 = j3;
            shape3 = shape2;
            j6 = j4;
            list3 = list2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ContainedLoadingIndicator_DTcfvLk$lambda$0;
                    ContainedLoadingIndicator_DTcfvLk$lambda$0 = LoadingIndicatorKt.ContainedLoadingIndicator_DTcfvLk$lambda$0(Modifier.this, j5, j6, shape3, list3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ContainedLoadingIndicator_DTcfvLk$lambda$0;
                }
            });
        }
    }

    /* renamed from: LoadingIndicatorImpl-t6yy7ic, reason: not valid java name */
    private static final void m3504LoadingIndicatorImplt6yy7ic(final Function0<Float> function0, final Modifier modifier, final long j, final long j2, final Shape shape, final List<RoundedPolygon> list, Composer composer, final int i) {
        int i2;
        Object morphSequence;
        Composer startRestartGroup = composer.startRestartGroup(-227757249);
        ComposerKt.sourceInformation(startRestartGroup, "C(LoadingIndicatorImpl)N(progress,modifier,containerColor:c#ui.graphics.Color,indicatorColor:c#ui.graphics.Color,containerShape,indicatorPolygons)257@11471L35,258@11522L19,259@11564L21,261@11618L121,265@11775L567,276@12444L340,273@12347L3214:LoadingIndicator.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227757249, i2, -1, "androidx.compose.material3.LoadingIndicatorImpl (LoadingIndicator.kt:253)");
            }
            if (list.size() <= 1) {
                throw new IllegalArgumentException("indicatorPolygons should have, at least, two RoundedPolygons".toString());
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 168627106, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float LoadingIndicatorImpl_t6yy7ic$lambda$1$0;
                        LoadingIndicatorImpl_t6yy7ic$lambda$1$0 = LoadingIndicatorKt.LoadingIndicatorImpl_t6yy7ic$lambda$1$0(Function0.this);
                        return Float.valueOf(LoadingIndicatorImpl_t6yy7ic$lambda$1$0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Function0 function02 = (Function0) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 168628722, "CC(remember):LoadingIndicator.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = AndroidPath_androidKt.Path();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final Path path = (Path) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 168630068, "CC(remember):LoadingIndicator.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = Matrix.m7039boximpl(Matrix.m7041constructorimpl$default(null, 1, null));
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final float[] m7064unboximpl = ((Matrix) rememberedValue3).m7064unboximpl();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 168631896, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changed = startRestartGroup.changed(list);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                morphSequence = morphSequence(list, false);
                startRestartGroup.updateRememberedValue(morphSequence);
            } else {
                morphSequence = rememberedValue4;
            }
            final List list2 = (List) morphSequence;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 168637366, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(list2);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = Float.valueOf(calculateScaleFactor(list) * LoadingIndicatorDefaults.INSTANCE.getActiveIndicatorScale$material3());
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final float floatValue = ((Number) rememberedValue5).floatValue();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 168658547, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(function02);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LoadingIndicatorImpl_t6yy7ic$lambda$6$0;
                        LoadingIndicatorImpl_t6yy7ic$lambda$6$0 = LoadingIndicatorKt.LoadingIndicatorImpl_t6yy7ic$lambda$6$0(Function0.this, (SemanticsPropertyReceiver) obj);
                        return LoadingIndicatorImpl_t6yy7ic$lambda$6$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m353backgroundbw27NRU$default = BackgroundKt.m353backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxSize$default(SizeKt.m1273sizeVpY3zN4(SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue6), LoadingIndicatorDefaults.INSTANCE.m3494getContainerWidthD9Ej5fM(), LoadingIndicatorDefaults.INSTANCE.m3493getContainerHeightD9Ej5fM()), 0.0f, 1, null), shape), j, null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m353backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1102839029, "C298@13449L2096,295@13296L2259:LoadingIndicator.kt#uh7d8r");
            Modifier aspectRatio = AspectRatioKt.aspectRatio(Modifier.INSTANCE, 1.0f, true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 657165941, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changed4 = startRestartGroup.changed(function02) | startRestartGroup.changedInstance(list2) | startRestartGroup.changedInstance(path) | startRestartGroup.changed(floatValue) | startRestartGroup.changedInstance(m7064unboximpl) | ((i2 & 7168) == 2048);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LoadingIndicatorImpl_t6yy7ic$lambda$7$0$0;
                        LoadingIndicatorImpl_t6yy7ic$lambda$7$0$0 = LoadingIndicatorKt.LoadingIndicatorImpl_t6yy7ic$lambda$7$0$0(Function0.this, list2, path, floatValue, m7064unboximpl, j2, (ContentDrawScope) obj);
                        return LoadingIndicatorImpl_t6yy7ic$lambda$7$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue7 = function1;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(DrawModifierKt.drawWithContent(aspectRatio, (Function1) rememberedValue7), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LoadingIndicatorImpl_t6yy7ic$lambda$8;
                    LoadingIndicatorImpl_t6yy7ic$lambda$8 = LoadingIndicatorKt.LoadingIndicatorImpl_t6yy7ic$lambda$8(Function0.this, modifier, j, j2, shape, list, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LoadingIndicatorImpl_t6yy7ic$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadingIndicatorImpl_t6yy7ic$lambda$1$0(Function0 function0) {
        float floatValue = ((Number) function0.invoke()).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            return 1.0f;
        }
        return floatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicatorImpl_t6yy7ic$lambda$6$0(Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object invoke = function0.invoke();
        if (Float.isNaN(((Number) invoke).floatValue())) {
            invoke = null;
        }
        Float f = (Float) invoke;
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(f != null ? f.floatValue() : 0.0f, RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicatorImpl_t6yy7ic$lambda$7$0$0(Function0 function0, List list, Path path, float f, float[] fArr, long j, ContentDrawScope contentDrawScope) {
        long j2;
        Path path2;
        float floatValue = ((Number) function0.invoke()).floatValue();
        int coerceAtMost = RangesKt.coerceAtMost((int) (list.size() * floatValue), list.size() - 1);
        float size = (floatValue == 1.0f && coerceAtMost == list.size() + (-1)) ? 1.0f : (list.size() * floatValue) % 1.0f;
        float f2 = (-floatValue) * 180;
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        long mo7293getCenterF1C5BW0 = contentDrawScope2.mo7293getCenterF1C5BW0();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo7307rotateUv8p0NA(f2, mo7293getCenterF1C5BW0);
            path2 = ShapeUtilKt.toPath((Morph) list.get(coerceAtMost), size, (r15 & 2) != 0 ? AndroidPath_androidKt.Path() : path, (r15 & 4) != 0 ? 270 : 0, (r15 & 8) != 0 ? false : false, (r15 & 16) != 0, (r15 & 32) != 0 ? 0.0f : 0.0f, (r15 & 64) != 0 ? 0.0f : 0.0f);
            j2 = mo7301getSizeNHjbRc;
            try {
                DrawScope.CC.m7375drawPathLG529CI$default(contentDrawScope2, m3505processPath3rZdNqA(path2, contentDrawScope2.mo7294getSizeNHjbRc(), f, fArr), j, 0.0f, Fill.INSTANCE, null, 0, 52, null);
                drawContext.getCanvas().restore();
                drawContext.mo7302setSizeuvyYCjk(j2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                drawContext.getCanvas().restore();
                drawContext.mo7302setSizeuvyYCjk(j2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j2 = mo7301getSizeNHjbRc;
        }
    }

    /* renamed from: LoadingIndicatorImpl-eopBjH0, reason: not valid java name */
    private static final void m3503LoadingIndicatorImpleopBjH0(final Modifier modifier, final long j, final long j2, final Shape shape, final List<RoundedPolygon> list, Composer composer, final int i) {
        int i2;
        Animatable animatable;
        List list2;
        MutableIntState mutableIntState;
        Animatable animatable2;
        LoadingIndicatorKt$LoadingIndicatorImpl$6$1 loadingIndicatorKt$LoadingIndicatorImpl$6$1;
        MutableIntState mutableIntState2;
        Composer startRestartGroup = composer.startRestartGroup(-1776169461);
        ComposerKt.sourceInformation(startRestartGroup, "C(LoadingIndicatorImpl)N(modifier,containerColor:c#ui.graphics.Color,indicatorColor:c#ui.graphics.Color,containerShape,indicatorPolygons)364@16528L120,368@16685L571,376@17281L27,377@17345L49,378@17420L27,379@17477L52,380@17568L2412,380@17534L2446,438@19997L19,439@20039L21,440@20065L1882:LoadingIndicator.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1776169461, i2, -1, "androidx.compose.material3.LoadingIndicatorImpl (LoadingIndicator.kt:359)");
            }
            if (list.size() <= 1) {
                throw new IllegalArgumentException("indicatorPolygons should have, at least, two RoundedPolygons".toString());
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796824797, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changed = startRestartGroup.changed(list);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = morphSequence(list, true);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            List list3 = (List) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796819322, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(list);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = Float.valueOf(calculateScaleFactor(list) * LoadingIndicatorDefaults.INSTANCE.getActiveIndicatorScale$material3());
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final float floatValue = ((Number) rememberedValue2).floatValue();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796800794, "CC(remember):LoadingIndicator.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable3 = (Animatable) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796798724, "CC(remember):LoadingIndicator.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(QuarterRotation);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796796346, "CC(remember):LoadingIndicator.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Animatable Animatable$default = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                startRestartGroup.updateRememberedValue(Animatable$default);
                rememberedValue5 = Animatable$default;
            }
            Animatable animatable4 = (Animatable) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796794497, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(list);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MutableIntState mutableIntState3 = (MutableIntState) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796789225, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(animatable3) | startRestartGroup.changed(mutableIntState3) | startRestartGroup.changedInstance(list3) | startRestartGroup.changedInstance(animatable4);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                LoadingIndicatorKt$LoadingIndicatorImpl$6$1 loadingIndicatorKt$LoadingIndicatorImpl$6$12 = new LoadingIndicatorKt$LoadingIndicatorImpl$6$1(animatable3, list3, mutableIntState3, mutableFloatState, animatable4, null);
                animatable = animatable3;
                list2 = list3;
                mutableIntState = mutableIntState3;
                mutableFloatState = mutableFloatState;
                animatable2 = animatable4;
                loadingIndicatorKt$LoadingIndicatorImpl$6$1 = loadingIndicatorKt$LoadingIndicatorImpl$6$12;
                startRestartGroup.updateRememberedValue(loadingIndicatorKt$LoadingIndicatorImpl$6$1);
            } else {
                loadingIndicatorKt$LoadingIndicatorImpl$6$1 = rememberedValue7;
                list2 = list3;
                mutableIntState = mutableIntState3;
                animatable = animatable3;
                animatable2 = animatable4;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(list, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) loadingIndicatorKt$LoadingIndicatorImpl$6$1, startRestartGroup, (i2 >> 12) & 14);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796713890, "CC(remember):LoadingIndicator.kt#9igjgp");
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = AndroidPath_androidKt.Path();
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            final Path path = (Path) rememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1796712544, "CC(remember):LoadingIndicator.kt#9igjgp");
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                mutableIntState2 = mutableIntState;
                rememberedValue9 = Matrix.m7039boximpl(Matrix.m7041constructorimpl$default(null, 1, null));
                startRestartGroup.updateRememberedValue(rememberedValue9);
            } else {
                mutableIntState2 = mutableIntState;
            }
            final float[] m7064unboximpl = ((Matrix) rememberedValue9).m7064unboximpl();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableIntState mutableIntState4 = mutableIntState2;
            Modifier m353backgroundbw27NRU$default = BackgroundKt.m353backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxSize$default(SizeKt.m1273sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier), LoadingIndicatorDefaults.INSTANCE.m3494getContainerWidthD9Ej5fM(), LoadingIndicatorDefaults.INSTANCE.m3493getContainerHeightD9Ej5fM()), 0.0f, 1, null), shape), j, null, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m353backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 706521396, "C455@20627L1304,453@20503L1438:LoadingIndicator.kt#uh7d8r");
            Modifier aspectRatio = AspectRatioKt.aspectRatio(Modifier.INSTANCE, 1.0f, true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1778320471, "CC(remember):LoadingIndicator.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(animatable) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(list2) | startRestartGroup.changed(mutableIntState4) | startRestartGroup.changedInstance(path) | startRestartGroup.changed(floatValue) | startRestartGroup.changedInstance(m7064unboximpl) | ((i2 & 896) == 256);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                final List list4 = list2;
                final Animatable animatable5 = animatable;
                final Animatable animatable6 = animatable2;
                rememberedValue10 = new Function1() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LoadingIndicatorImpl_eopBjH0$lambda$14$0$0;
                        LoadingIndicatorImpl_eopBjH0$lambda$14$0$0 = LoadingIndicatorKt.LoadingIndicatorImpl_eopBjH0$lambda$14$0$0(Animatable.this, animatable6, mutableFloatState, list4, path, floatValue, m7064unboximpl, j2, mutableIntState4, (ContentDrawScope) obj);
                        return LoadingIndicatorImpl_eopBjH0$lambda$14$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(DrawModifierKt.drawWithContent(aspectRatio, (Function1) rememberedValue10), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LoadingIndicatorImpl_eopBjH0$lambda$15;
                    LoadingIndicatorImpl_eopBjH0$lambda$15 = LoadingIndicatorKt.LoadingIndicatorImpl_eopBjH0$lambda$15(Modifier.this, j, j2, shape, list, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LoadingIndicatorImpl_eopBjH0$lambda$15;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadingIndicatorImpl_eopBjH0$lambda$5(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LoadingIndicatorImpl_eopBjH0$lambda$9(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingIndicatorImpl_eopBjH0$lambda$14$0$0(Animatable animatable, Animatable animatable2, MutableFloatState mutableFloatState, List list, Path path, float f, float[] fArr, long j, MutableIntState mutableIntState, ContentDrawScope contentDrawScope) {
        Path path2;
        float floatValue = ((Number) animatable.getValue()).floatValue();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float LoadingIndicatorImpl_eopBjH0$lambda$5 = (90 * floatValue) + LoadingIndicatorImpl_eopBjH0$lambda$5(mutableFloatState) + ((Number) animatable2.getValue()).floatValue();
        long mo7293getCenterF1C5BW0 = contentDrawScope2.mo7293getCenterF1C5BW0();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo7307rotateUv8p0NA(LoadingIndicatorImpl_eopBjH0$lambda$5, mo7293getCenterF1C5BW0);
            path2 = ShapeUtilKt.toPath((Morph) list.get(LoadingIndicatorImpl_eopBjH0$lambda$9(mutableIntState)), floatValue, (r15 & 2) != 0 ? AndroidPath_androidKt.Path() : path, (r15 & 4) != 0 ? 270 : 0, (r15 & 8) != 0 ? false : false, (r15 & 16) != 0, (r15 & 32) != 0 ? 0.0f : 0.0f, (r15 & 64) != 0 ? 0.0f : 0.0f);
            DrawScope.CC.m7375drawPathLG529CI$default(contentDrawScope2, m3505processPath3rZdNqA(path2, contentDrawScope2.mo7294getSizeNHjbRc(), f, fArr), j, 0.0f, Fill.INSTANCE, null, 0, 52, null);
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            throw th;
        }
    }

    private static final List<Morph> morphSequence(List<RoundedPolygon> list, boolean z) {
        List createListBuilder = CollectionsKt.createListBuilder();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i2 < list.size()) {
                createListBuilder.add(new Morph(list.get(i).normalized(), list.get(i2).normalized()));
            } else if (z) {
                createListBuilder.add(new Morph(list.get(i).normalized(), list.get(0).normalized()));
            }
            i = i2;
        }
        return CollectionsKt.build(createListBuilder);
    }

    private static final float calculateScaleFactor(List<RoundedPolygon> list) {
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        int size = list.size();
        float f = 1.0f;
        for (int i = 0; i < size; i++) {
            RoundedPolygon roundedPolygon = list.get(i);
            RoundedPolygon.calculateBounds$default(roundedPolygon, fArr, false, 2, null);
            roundedPolygon.calculateMaxBounds(fArr2);
            f = Math.min(f, Math.max(width(fArr) / width(fArr2), height(fArr) / height(fArr2)));
        }
        return f;
    }

    private static final float width(float[] fArr) {
        return fArr[2] - fArr[0];
    }

    private static final float height(float[] fArr) {
        return fArr[3] - fArr[1];
    }

    /* renamed from: processPath-3rZdNqA$default, reason: not valid java name */
    static /* synthetic */ Path m3506processPath3rZdNqA$default(Path path, long j, float f, float[] fArr, int i, Object obj) {
        if ((i & 8) != 0) {
            fArr = Matrix.m7041constructorimpl$default(null, 1, null);
        }
        return m3505processPath3rZdNqA(path, j, f, fArr);
    }

    /* renamed from: processPath-3rZdNqA, reason: not valid java name */
    private static final Path m3505processPath3rZdNqA(Path path, long j, float f, float[] fArr) {
        Matrix.m7050resetimpl(fArr);
        Matrix.m7057scaleimpl$default(fArr, Float.intBitsToFloat((int) (j >> 32)) * f, Float.intBitsToFloat((int) (4294967295L & j)) * f, 0.0f, 4, null);
        path.mo6656transform58bKbWc(fArr);
        path.mo6657translatek4lQ0M(Offset.m6523minusMKHz9U(androidx.compose.ui.geometry.SizeKt.m6598getCenteruvyYCjk(j), path.getBounds().m6549getCenterF1C5BW0()));
        return path;
    }
}
