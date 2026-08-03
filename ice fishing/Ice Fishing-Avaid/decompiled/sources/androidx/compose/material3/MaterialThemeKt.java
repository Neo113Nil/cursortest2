package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: MaterialTheme.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aH\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000e\u001aP\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0017\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u000e\u0010\u0018\u001a\u00020\u0019X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"MaterialTheme", "", "colorScheme", "Landroidx/compose/material3/ColorScheme;", "shapes", "Landroidx/compose/material3/Shapes;", "typography", "Landroidx/compose/material3/Typography;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "motionScheme", "Landroidx/compose/material3/MotionScheme;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/MotionScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "MaterialExpressiveTheme", "LocalUsingExpressiveTheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalUsingExpressiveTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "TextSelectionBackgroundOpacity", "", "_localMaterialTheme", "Landroidx/compose/material3/MaterialTheme$Values;", "get_localMaterialTheme$annotations", "()V", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class MaterialThemeKt {
    public static final float TextSelectionBackgroundOpacity = 0.4f;
    private static final ProvidableCompositionLocal<Boolean> LocalUsingExpressiveTheme = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            boolean LocalUsingExpressiveTheme$lambda$0;
            LocalUsingExpressiveTheme$lambda$0 = MaterialThemeKt.LocalUsingExpressiveTheme$lambda$0();
            return Boolean.valueOf(LocalUsingExpressiveTheme$lambda$0);
        }
    });
    private static final ProvidableCompositionLocal<MaterialTheme.Values> _localMaterialTheme = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            MaterialTheme.Values _localMaterialTheme$lambda$0;
            _localMaterialTheme$lambda$0 = MaterialThemeKt._localMaterialTheme$lambda$0();
            return _localMaterialTheme$lambda$0;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalUsingExpressiveTheme$lambda$0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaterialExpressiveTheme$lambda$1(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, Function2 function2, int i, int i2, Composer composer, int i3) {
        MaterialExpressiveTheme(colorScheme, motionScheme, shapes, typography, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaterialTheme$lambda$0(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2 function2, int i, int i2, Composer composer, int i3) {
        MaterialTheme(colorScheme, shapes, typography, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaterialTheme$lambda$2(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, Function2 function2, int i, int i2, Composer composer, int i3) {
        MaterialTheme(colorScheme, motionScheme, shapes, typography, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void get_localMaterialTheme$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
    
        if ((r15 & 4) != 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final Typography typography2;
        final Shapes shapes2;
        final ColorScheme colorScheme2;
        Composer startRestartGroup = composer.startRestartGroup(-449719819);
        ComposerKt.sourceInformation(startRestartGroup, "C(MaterialTheme)N(colorScheme,shapes,typography,content)63@2942L12,61@2855L191:MaterialTheme.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(colorScheme)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(shapes)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(typography)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "56@2699L11,57@2747L6,58@2798L10");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    shapes = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    i3 &= -897;
                }
                ColorScheme colorScheme3 = colorScheme;
                Shapes shapes3 = shapes;
                Typography typography3 = typography;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-449719819, i3, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:61)");
                }
                int i4 = i3 << 3;
                MaterialTheme(colorScheme3, MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6), shapes3, typography3, function2, startRestartGroup, (i3 & 14) | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 0);
                function22 = function2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                colorScheme2 = colorScheme3;
                shapes2 = shapes3;
                typography2 = typography3;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
        } else {
            function22 = function2;
            startRestartGroup.skipToGroupEnd();
            typography2 = typography;
            shapes2 = shapes;
            colorScheme2 = colorScheme;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MaterialTheme$lambda$0;
                    MaterialTheme$lambda$0 = MaterialThemeKt.MaterialTheme$lambda$0(ColorScheme.this, shapes2, typography2, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MaterialTheme$lambda$0;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        if ((r27 & 8) != 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        ColorScheme colorScheme2;
        int i3;
        MotionScheme motionScheme2;
        Shapes shapes2;
        final Typography typography2;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(904511636);
        ComposerKt.sourceInformation(startRestartGroup, "C(MaterialTheme)N(colorScheme,motionScheme,shapes,typography,content)106@4794L40,111@5025L147,107@4839L333:MaterialTheme.kt#uh7d8r");
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colorScheme2 = colorScheme;
                if (startRestartGroup.changed(colorScheme2)) {
                    i7 = 4;
                    i3 = i7 | i;
                }
            } else {
                colorScheme2 = colorScheme;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            colorScheme2 = colorScheme;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                motionScheme2 = motionScheme;
                if (startRestartGroup.changed(motionScheme2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                motionScheme2 = motionScheme;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            motionScheme2 = motionScheme;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shapes2 = shapes;
                if (startRestartGroup.changed(shapes2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                shapes2 = shapes;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            shapes2 = shapes;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                typography2 = typography;
                if (startRestartGroup.changed(typography2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                typography2 = typography;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            typography2 = typography;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "92@4317L11,93@4377L12,94@4426L6,95@4477L10");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    motionScheme2 = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    i3 &= -7169;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(904511636, i3, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:97)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{_localMaterialTheme.provides(new MaterialTheme.Values(colorScheme2, typography2, shapes2, motionScheme2)), IndicationKt.getLocalIndication().provides(RippleKt.m3792rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), TextSelectionColorsKt.getLocalTextSelectionColors().provides(rememberTextSelectionColors(colorScheme2, startRestartGroup, i3 & 14))}, ComposableLambdaKt.rememberComposableLambda(-1750539308, true, new Function2() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MaterialTheme$lambda$1;
                        MaterialTheme$lambda$1 = MaterialThemeKt.MaterialTheme$lambda$1(Typography.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                        return MaterialTheme$lambda$1;
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Shapes shapes3 = shapes2;
        final Typography typography3 = typography2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final ColorScheme colorScheme3 = colorScheme2;
            final MotionScheme motionScheme3 = motionScheme2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MaterialTheme$lambda$2;
                    MaterialTheme$lambda$2 = MaterialThemeKt.MaterialTheme$lambda$2(ColorScheme.this, motionScheme3, shapes3, typography3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MaterialTheme$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaterialTheme$lambda$1(final Typography typography, final Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C112@5077L89,112@5035L131:MaterialTheme.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1750539308, i, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:112)");
            }
            PrecisionPointer_androidKt.EnsurePrecisionPointerListenersRegistered(ComposableLambdaKt.rememberComposableLambda(-241536773, true, new Function2() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MaterialTheme$lambda$1$0;
                    MaterialTheme$lambda$1$0 = MaterialThemeKt.MaterialTheme$lambda$1$0(Typography.this, function2, (Composer) obj, ((Integer) obj2).intValue());
                    return MaterialTheme$lambda$1$0;
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaterialTheme$lambda$1$0(Typography typography, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C113@5091L65:MaterialTheme.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-241536773, i, -1, "androidx.compose.material3.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:113)");
            }
            TextKt.ProvideTextStyle(typography.getBodyLarge(), function2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialExpressiveTheme(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        ColorScheme colorScheme2;
        int i3;
        MotionScheme motionScheme2;
        int i4;
        Shapes shapes2;
        int i5;
        Typography typography2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final ColorScheme colorScheme3;
        final MotionScheme motionScheme3;
        final Shapes shapes3;
        final Typography typography3;
        ScopeUpdateScope endRestartGroup;
        final ColorScheme colorScheme4;
        ColorScheme colorScheme5;
        MotionScheme motionScheme4;
        Typography typography4;
        Shapes shapes4;
        Composer startRestartGroup = composer.startRestartGroup(1317329884);
        ComposerKt.sourceInformation(startRestartGroup, "C(MaterialExpressiveTheme)N(colorScheme,motionScheme,shapes,typography,content)267@11488L7:MaterialTheme.kt#uh7d8r");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            colorScheme2 = colorScheme;
        } else if ((i & 6) == 0) {
            colorScheme2 = colorScheme;
            i3 = (startRestartGroup.changed(colorScheme2) ? 4 : 2) | i;
        } else {
            colorScheme2 = colorScheme;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            motionScheme2 = motionScheme;
            i3 |= startRestartGroup.changed(motionScheme2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shapes2 = shapes;
                i3 |= startRestartGroup.changed(shapes2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    typography2 = typography;
                    i3 |= startRestartGroup.changed(typography2) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        function22 = function2;
                        i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    } else {
                        function22 = function2;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        colorScheme3 = colorScheme2;
                        motionScheme3 = motionScheme2;
                        shapes3 = shapes2;
                        typography3 = typography2;
                    } else {
                        if (i6 != 0) {
                            colorScheme2 = null;
                        }
                        final MotionScheme motionScheme5 = i7 != 0 ? null : motionScheme2;
                        final Shapes shapes5 = i4 != 0 ? null : shapes2;
                        final Typography typography5 = i5 != 0 ? null : typography2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1317329884, i3, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:266)");
                        }
                        ProvidableCompositionLocal<Boolean> providableCompositionLocal = LocalUsingExpressiveTheme;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(providableCompositionLocal);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (((Boolean) consume).booleanValue()) {
                            startRestartGroup.startReplaceGroup(1458663246);
                            ComposerKt.sourceInformation(startRestartGroup, "268@11507L312");
                            if (colorScheme2 == null) {
                                startRestartGroup.startReplaceGroup(-1061323065);
                                ComposerKt.sourceInformation(startRestartGroup, "269@11577L11");
                                ColorScheme colorScheme6 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6);
                                startRestartGroup.endReplaceGroup();
                                colorScheme5 = colorScheme6;
                            } else {
                                startRestartGroup.startReplaceGroup(-1061323964);
                                startRestartGroup.endReplaceGroup();
                                colorScheme5 = colorScheme2;
                            }
                            if (motionScheme5 == null) {
                                startRestartGroup.startReplaceGroup(-1061320824);
                                ComposerKt.sourceInformation(startRestartGroup, "270@11647L12");
                                MotionScheme motionScheme6 = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6);
                                startRestartGroup.endReplaceGroup();
                                motionScheme4 = motionScheme6;
                            } else {
                                startRestartGroup.startReplaceGroup(-1061321754);
                                startRestartGroup.endReplaceGroup();
                                motionScheme4 = motionScheme5;
                            }
                            if (typography5 == null) {
                                startRestartGroup.startReplaceGroup(-1061318682);
                                ComposerKt.sourceInformation(startRestartGroup, "271@11714L10");
                                Typography typography6 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                startRestartGroup.endReplaceGroup();
                                typography4 = typography6;
                            } else {
                                startRestartGroup.startReplaceGroup(-1061319550);
                                startRestartGroup.endReplaceGroup();
                                typography4 = typography5;
                            }
                            if (shapes5 == null) {
                                startRestartGroup.startReplaceGroup(-1061316862);
                                ComposerKt.sourceInformation(startRestartGroup, "272@11771L6");
                                Shapes shapes6 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                                startRestartGroup.endReplaceGroup();
                                shapes4 = shapes6;
                            } else {
                                startRestartGroup.startReplaceGroup(-1061317606);
                                startRestartGroup.endReplaceGroup();
                                shapes4 = shapes5;
                            }
                            MaterialTheme(colorScheme5, motionScheme4, shapes4, typography4, function22, startRestartGroup, i3 & 57344, 0);
                            startRestartGroup.endReplaceGroup();
                            colorScheme4 = colorScheme2;
                        } else {
                            startRestartGroup.startReplaceGroup(1458990389);
                            ComposerKt.sourceInformation(startRestartGroup, "276@11907L415,276@11841L481");
                            colorScheme4 = colorScheme2;
                            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(true), ComposableLambdaKt.rememberComposableLambda(1535649272, true, new Function2() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit MaterialExpressiveTheme$lambda$0;
                                    MaterialExpressiveTheme$lambda$0 = MaterialThemeKt.MaterialExpressiveTheme$lambda$0(ColorScheme.this, motionScheme5, shapes5, typography5, function2, (Composer) obj, ((Integer) obj2).intValue());
                                    return MaterialExpressiveTheme$lambda$0;
                                }
                            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        colorScheme3 = colorScheme4;
                        motionScheme3 = motionScheme5;
                        shapes3 = shapes5;
                        typography3 = typography5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit MaterialExpressiveTheme$lambda$1;
                                MaterialExpressiveTheme$lambda$1 = MaterialThemeKt.MaterialExpressiveTheme$lambda$1(ColorScheme.this, motionScheme3, shapes3, typography3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return MaterialExpressiveTheme$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                typography2 = typography;
                if ((i & 24576) != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            shapes2 = shapes;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            typography2 = typography;
            if ((i & 24576) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        motionScheme2 = motionScheme;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        shapes2 = shapes;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        typography2 = typography;
        if ((i & 24576) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaterialExpressiveTheme$lambda$0(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C277@11921L391:MaterialTheme.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1535649272, i, -1, "androidx.compose.material3.MaterialExpressiveTheme.<anonymous> (MaterialTheme.kt:277)");
            }
            MaterialTheme(colorScheme == null ? ColorSchemeKt.expressiveLightColorScheme() : colorScheme, motionScheme == null ? MotionScheme.INSTANCE.expressive() : motionScheme, shapes == null ? new Shapes(null, null, null, null, null, 31, null) : shapes, typography == null ? new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null) : typography, function2, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalUsingExpressiveTheme() {
        return LocalUsingExpressiveTheme;
    }

    public static final TextSelectionColors rememberTextSelectionColors(ColorScheme colorScheme, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1866455512, "C(rememberTextSelectionColors)N(colorScheme)295@12588L198:MaterialTheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1866455512, i, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:293)");
        }
        long primary = colorScheme.getPrimary();
        ComposerKt.sourceInformationMarkerStart(composer, -1632578178, "CC(remember):MaterialTheme.kt#9igjgp");
        boolean changed = composer.changed(primary);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            TextSelectionColors textSelectionColors = new TextSelectionColors(primary, Color.m6785copywmQWz5c$default(primary, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            composer.updateRememberedValue(textSelectionColors);
            rememberedValue = textSelectionColors;
        }
        TextSelectionColors textSelectionColors2 = (TextSelectionColors) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textSelectionColors2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialTheme.Values _localMaterialTheme$lambda$0() {
        return new MaterialTheme.Values(null, null, null, null, 15, null);
    }
}
