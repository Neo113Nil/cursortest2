package androidx.compose.material3;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* compiled from: Scrim.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Scrim", "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "alpha", "", "color", "Landroidx/compose/ui/graphics/Color;", "Scrim-yrwZFoE", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ScrimKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_yrwZFoE$lambda$1$0() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_yrwZFoE$lambda$5(String str, Modifier modifier, Function0 function0, Function0 function02, long j, int i, int i2, Composer composer, int i3) {
        m3803ScrimyrwZFoE(str, modifier, function0, function02, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: Scrim-yrwZFoE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3803ScrimyrwZFoE(final String str, Modifier modifier, Function0<Unit> function0, Function0<Float> function02, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function0<Unit> function03;
        int i5;
        final long j2;
        final Function0<Float> function04;
        Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        final Function0<Float> function05;
        Modifier.Companion companion2;
        Composer startRestartGroup = composer.startRestartGroup(-2078815310);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)N(contentDescription,modifier,onClick,alpha,color:c#ui.graphics.Color):Scrim.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        j2 = j;
                        i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
                    } else {
                        j2 = j;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "52@2272L2,53@2301L6,54@2342L5");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            companion = modifier2;
                            function05 = function02;
                        } else {
                            companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -581716812, "CC(remember):Scrim.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: androidx.compose.material3.ScrimKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                function03 = (Function0) rememberedValue;
                            }
                            if (i5 != 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -581715880, "CC(remember):Scrim.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function0() { // from class: androidx.compose.material3.ScrimKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            float Scrim_yrwZFoE$lambda$1$0;
                                            Scrim_yrwZFoE$lambda$1$0 = ScrimKt.Scrim_yrwZFoE$lambda$1$0();
                                            return Float.valueOf(Scrim_yrwZFoE$lambda$1$0);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function05 = (Function0) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            } else {
                                function05 = function02;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                j2 = ScrimDefaults.INSTANCE.getColor(startRestartGroup, 6);
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2078815310, i3, -1, "androidx.compose.material3.Scrim (Scrim.kt:55)");
                        }
                        if (j2 != 16) {
                            startRestartGroup.startReplaceGroup(-853219337);
                            ComposerKt.sourceInformation(startRestartGroup, "74@3118L81,74@3054L145");
                            if (function03 != null) {
                                startRestartGroup.startReplaceGroup(-853120974);
                                ComposerKt.sourceInformation(startRestartGroup, "60@2538L35,61@2630L355");
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -581708267, "CC(remember):Scrim.kt#9igjgp");
                                int i7 = i3 & 896;
                                boolean z = i7 == 256;
                                ScrimKt$Scrim$dismissModifier$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                                if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new ScrimKt$Scrim$dismissModifier$1$1(function03);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion3, function03, (PointerInputEventHandler) rememberedValue3);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -581705003, "CC(remember):Scrim.kt#9igjgp");
                                boolean z2 = (i7 == 256) | ((i3 & 14) == 4);
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function1() { // from class: androidx.compose.material3.ScrimKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit Scrim_yrwZFoE$lambda$3$0;
                                            Scrim_yrwZFoE$lambda$3$0 = ScrimKt.Scrim_yrwZFoE$lambda$3$0(str, function03, (SemanticsPropertyReceiver) obj);
                                            return Scrim_yrwZFoE$lambda$3$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                companion2 = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue4);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-852623672);
                                startRestartGroup.endReplaceGroup();
                                companion2 = Modifier.INSTANCE;
                            }
                            Modifier then = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null).then(companion2);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -581689661, "CC(remember):Scrim.kt#9igjgp");
                            boolean z3 = ((((57344 & i3) ^ 24576) > 16384 && startRestartGroup.changed(j2)) || (i3 & 24576) == 16384) | ((i3 & 7168) == 2048);
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new Function1() { // from class: androidx.compose.material3.ScrimKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit Scrim_yrwZFoE$lambda$4$0;
                                        Scrim_yrwZFoE$lambda$4$0 = ScrimKt.Scrim_yrwZFoE$lambda$4$0(j2, function05, (DrawScope) obj);
                                        return Scrim_yrwZFoE$lambda$4$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            CanvasKt.Canvas(then, (Function1) rememberedValue5, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-852426512);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function05;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function04 = function02;
                        companion = modifier2;
                    }
                    final Function0<Unit> function06 = function03;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = companion;
                        final long j3 = j2;
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ScrimKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Scrim_yrwZFoE$lambda$5;
                                Scrim_yrwZFoE$lambda$5 = ScrimKt.Scrim_yrwZFoE$lambda$5(str, modifier3, function06, function04, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Scrim_yrwZFoE$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i & 24576) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                final Function0 function062 = function03;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((i & 24576) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            final Function0 function0622 = function03;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        final Function0 function06222 = function03;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_yrwZFoE$lambda$3$0(String str, final Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        }
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material3.ScrimKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean Scrim_yrwZFoE$lambda$3$0$0;
                Scrim_yrwZFoE$lambda$3$0$0 = ScrimKt.Scrim_yrwZFoE$lambda$3$0$0(Function0.this);
                return Boolean.valueOf(Scrim_yrwZFoE$lambda$3$0$0);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Scrim_yrwZFoE$lambda$3$0$0(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_yrwZFoE$lambda$4$0(long j, Function0 function0, DrawScope drawScope) {
        DrawScope.CC.m7379drawRectnJ9OG0$default(drawScope, j, 0L, 0L, RangesKt.coerceIn(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f), null, null, 0, 118, null);
        return Unit.INSTANCE;
    }
}
