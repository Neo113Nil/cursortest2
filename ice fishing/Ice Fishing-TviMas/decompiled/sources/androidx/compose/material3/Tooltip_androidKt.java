package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tooltip.android.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aq\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"PlainTooltip", "", "Landroidx/compose/material3/CaretScope;", "modifier", "Landroidx/compose/ui/Modifier;", "caretProperties", "Landroidx/compose/material3/CaretProperties;", "shape", "Landroidx/compose/ui/graphics/Shape;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PlainTooltip-Fg7CxbU", "(Landroidx/compose/material3/CaretScope;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CaretProperties;Landroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "drawCaretWithPath", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "density", "Landroidx/compose/ui/unit/Density;", "configuration", "Landroid/content/res/Configuration;", "anchorLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "drawCaretWithPath-Bx497Mc", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JLandroidx/compose/material3/CaretProperties;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Tooltip_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027b  */
    /* renamed from: PlainTooltip-Fg7CxbU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2269PlainTooltipFg7CxbU(final CaretScope caretScope, Modifier modifier, CaretProperties caretProperties, Shape shape, long j, long j2, float f, float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Shape shape2;
        long j3;
        final long j4;
        int i5;
        float f3;
        int i6;
        Modifier.Companion companion;
        CaretProperties caretProperties2;
        Shape shape3;
        float m5734constructorimpl;
        long j5;
        int i7;
        float f4;
        float f5;
        Shape shape4;
        Modifier modifier2;
        Modifier modifier3;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(419109811);
        ComposerKt.sourceInformation(startRestartGroup, "C(PlainTooltip)P(4!1,6,3:c#ui.graphics.Color,1:c#ui.graphics.Color,7:c#ui.unit.Dp,5:c#ui.unit.Dp)184@7877L26,184@7947L24,184@8017L26,83@3344L784:Tooltip.android.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(caretScope) : startRestartGroup.changedInstance(caretScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(caretProperties) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 4) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    j3 = j;
                    i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                } else {
                    j3 = j;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    j4 = j2;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                        caretProperties2 = i4 != 0 ? null : caretProperties;
                        if ((i2 & 4) != 0) {
                            shape3 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 8) != 0) {
                            j3 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                            i3 &= -458753;
                        }
                        float m5734constructorimpl2 = i5 != 0 ? Dp.m5734constructorimpl(0) : f3;
                        m5734constructorimpl = i6 != 0 ? Dp.m5734constructorimpl(0) : f2;
                        j5 = j3;
                        i7 = i3;
                        f4 = m5734constructorimpl2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -458753;
                        }
                        companion = modifier;
                        caretProperties2 = caretProperties;
                        m5734constructorimpl = f2;
                        shape3 = shape2;
                        j5 = j3;
                        i7 = i3;
                        f4 = f3;
                    }
                    final long j7 = j4;
                    final long j8 = j5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(419109811, i7, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)");
                    }
                    startRestartGroup.startReplaceableGroup(2067440203);
                    ComposerKt.sourceInformation(startRestartGroup, "70@2893L7,71@2952L7,72@2991L308");
                    if (caretProperties2 != null) {
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density = (Density) consume;
                        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Configuration configuration = (Configuration) consume2;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceableGroup(2067440371);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Tooltip.android.kt#9igjgp");
                        f5 = f4;
                        shape4 = shape3;
                        boolean changed = ((((i7 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && startRestartGroup.changed(j7)) || (i7 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(configuration) | ((i7 & 896) == 256);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            final CaretProperties caretProperties3 = caretProperties2;
                            rememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                    DrawResult m2271drawCaretWithPathBx497Mc;
                                    m2271drawCaretWithPathBx497Mc = Tooltip_androidKt.m2271drawCaretWithPathBx497Mc(cacheDrawScope, Density.this, configuration, j7, caretProperties3, layoutCoordinates);
                                    return m2271drawCaretWithPathBx497Mc;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        modifier2 = caretScope.drawCaret(companion2, (Function2) rememberedValue).then(companion);
                    } else {
                        f5 = f4;
                        shape4 = shape3;
                        modifier2 = companion;
                    }
                    startRestartGroup.endReplaceableGroup();
                    int i10 = i7 >> 6;
                    SurfaceKt.m1977SurfaceT9BRK9s(modifier2, shape4, j7, 0L, f5, m5734constructorimpl, null, ComposableLambdaKt.composableLambda(startRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
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

                        public final void invoke(Composer composer2, int i11) {
                            ComposerKt.sourceInformation(composer2, "C90@3542L580:Tooltip.android.kt#uh7d8r");
                            if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-705895688, i11, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                            }
                            Modifier padding = PaddingKt.padding(SizeKt.m615sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                            long j9 = j8;
                            Function2<Composer, Integer, Unit> function22 = function2;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 64550122, "C99@3858L10,101@3931L181:Tooltip.android.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(j9)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function22, composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), startRestartGroup, (i10 & 112) | 12582912 | ((i7 >> 9) & 896) | (57344 & i10) | (i10 & 458752), 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = companion;
                    j6 = j8;
                    j4 = j7;
                    f3 = f5;
                    shape2 = shape4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    caretProperties2 = caretProperties;
                    m5734constructorimpl = f2;
                    j6 = j3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final CaretProperties caretProperties4 = caretProperties2;
                    final Shape shape5 = shape2;
                    final float f6 = f3;
                    final float f7 = m5734constructorimpl;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$2
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

                        public final void invoke(Composer composer2, int i11) {
                            Tooltip_androidKt.m2269PlainTooltipFg7CxbU(CaretScope.this, modifier4, caretProperties4, shape5, j6, j4, f6, f7, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            j5 = j3;
            i7 = i3;
            f4 = m5734constructorimpl2;
            final long j72 = j4;
            final long j82 = j5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(2067440203);
            ComposerKt.sourceInformation(startRestartGroup, "70@2893L7,71@2952L7,72@2991L308");
            if (caretProperties2 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            int i102 = i7 >> 6;
            SurfaceKt.m1977SurfaceT9BRK9s(modifier2, shape4, j72, 0L, f5, m5734constructorimpl, null, ComposableLambdaKt.composableLambda(startRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
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

                public final void invoke(Composer composer2, int i11) {
                    ComposerKt.sourceInformation(composer2, "C90@3542L580:Tooltip.android.kt#uh7d8r");
                    if ((i11 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-705895688, i11, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                    }
                    Modifier padding = PaddingKt.padding(SizeKt.m615sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                    long j9 = j82;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 64550122, "C99@3858L10,101@3931L181:Tooltip.android.kt#uh7d8r");
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(j9)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function22, composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, (i102 & 112) | 12582912 | ((i7 >> 9) & 896) | (57344 & i102) | (i102 & 458752), 72);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            j6 = j82;
            j4 = j72;
            f3 = f5;
            shape2 = shape4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        j5 = j3;
        i7 = i3;
        f4 = m5734constructorimpl2;
        final long j722 = j4;
        final long j822 = j5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(2067440203);
        ComposerKt.sourceInformation(startRestartGroup, "70@2893L7,71@2952L7,72@2991L308");
        if (caretProperties2 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        int i1022 = i7 >> 6;
        SurfaceKt.m1977SurfaceT9BRK9s(modifier2, shape4, j722, 0L, f5, m5734constructorimpl, null, ComposableLambdaKt.composableLambda(startRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
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

            public final void invoke(Composer composer2, int i11) {
                ComposerKt.sourceInformation(composer2, "C90@3542L580:Tooltip.android.kt#uh7d8r");
                if ((i11 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-705895688, i11, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                }
                Modifier padding = PaddingKt.padding(SizeKt.m615sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                long j9 = j822;
                Function2<Composer, Integer, Unit> function22 = function2;
                composer2.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 64550122, "C99@3858L10,101@3931L181:Tooltip.android.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3397boximpl(j9)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function22, composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), startRestartGroup, (i1022 & 112) | 12582912 | ((i7 >> 9) & 896) | (57344 & i1022) | (i1022 & 458752), 72);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        j6 = j822;
        j4 = j722;
        f3 = f5;
        shape2 = shape4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCaretWithPath-Bx497Mc, reason: not valid java name */
    public static final DrawResult m2271drawCaretWithPathBx497Mc(CacheDrawScope cacheDrawScope, Density density, Configuration configuration, final long j, CaretProperties caretProperties, final LayoutCoordinates layoutCoordinates) {
        long Offset;
        final Path Path = AndroidPath_androidKt.Path();
        if (layoutCoordinates != null) {
            int mo307roundToPx0680j_4 = density.mo307roundToPx0680j_4(caretProperties.m1299getCaretHeightD9Ej5fM());
            int mo307roundToPx0680j_42 = density.mo307roundToPx0680j_4(caretProperties.m1300getCaretWidthD9Ej5fM());
            int mo307roundToPx0680j_43 = density.mo307roundToPx0680j_4(Dp.m5734constructorimpl(configuration.screenWidthDp));
            int mo307roundToPx0680j_44 = density.mo307roundToPx0680j_4(TooltipKt.getSpacingBetweenTooltipAndAnchor());
            Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
            float left = boundsInWindow.getLeft();
            float right = boundsInWindow.getRight();
            float top = boundsInWindow.getTop();
            float f = 2;
            float f2 = (right + left) / f;
            float f3 = right - left;
            float m3235getWidthimpl = Size.m3235getWidthimpl(cacheDrawScope.m3073getSizeNHjbRc());
            float m3232getHeightimpl = Size.m3232getHeightimpl(cacheDrawScope.m3073getSizeNHjbRc());
            boolean z = (top - m3232getHeightimpl) - ((float) mo307roundToPx0680j_44) < 0.0f;
            if (z) {
                m3232getHeightimpl = 0.0f;
            }
            float f4 = mo307roundToPx0680j_43;
            if ((m3235getWidthimpl / f) + f2 > f4) {
                Offset = OffsetKt.Offset(m3235getWidthimpl - (f4 - f2), m3232getHeightimpl);
            } else {
                Offset = OffsetKt.Offset(f2 - Math.max(left - ((Size.m3235getWidthimpl(cacheDrawScope.m3073getSizeNHjbRc()) / f) - (f3 / f)), 0.0f), m3232getHeightimpl);
            }
            if (z) {
                Path.moveTo(Offset.m3166getXimpl(Offset), Offset.m3167getYimpl(Offset));
                float f5 = mo307roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m3166getXimpl(Offset) + f5, Offset.m3167getYimpl(Offset));
                Path.lineTo(Offset.m3166getXimpl(Offset), Offset.m3167getYimpl(Offset) - mo307roundToPx0680j_4);
                Path.lineTo(Offset.m3166getXimpl(Offset) - f5, Offset.m3167getYimpl(Offset));
                Path.close();
            } else {
                Path.moveTo(Offset.m3166getXimpl(Offset), Offset.m3167getYimpl(Offset));
                float f6 = mo307roundToPx0680j_42 / 2;
                Path.lineTo(Offset.m3166getXimpl(Offset) + f6, Offset.m3167getYimpl(Offset));
                Path.lineTo(Offset.m3166getXimpl(Offset), Offset.m3167getYimpl(Offset) + mo307roundToPx0680j_4);
                Path.lineTo(Offset.m3166getXimpl(Offset) - f6, Offset.m3167getYimpl(Offset));
                Path.close();
            }
        }
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$drawCaretWithPath$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                if (LayoutCoordinates.this != null) {
                    contentDrawScope.drawContent();
                    DrawScope.m3948drawPathLG529CI$default(contentDrawScope, Path, j, 0.0f, null, null, 0, 60, null);
                }
            }
        });
    }
}
