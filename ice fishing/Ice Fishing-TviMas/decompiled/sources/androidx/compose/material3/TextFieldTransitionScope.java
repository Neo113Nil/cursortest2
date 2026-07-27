package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÇ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2z\u0010\u000f\u001av\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b²\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material3/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material3/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0236, code lost:
    
        if (r31 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01ee, code lost:
    
        if (r31 != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0217  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2123TransitionDTcfvLk(final InputPhase inputPhase, final long j, final long j2, final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> function3, final boolean z, final Function7<? super Float, ? super Color, ? super Color, ? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function7, Composer composer, final int i) {
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        float f5;
        int i9;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        Composer startRestartGroup = composer.startRestartGroup(-995111872);
        ComposerKt.sourceInformation(startRestartGroup, "C(Transition)P(3,2:c#ui.graphics.Color,5:c#ui.graphics.Color,1,4)313@12767L59,315@12868L325,326@13240L1101,354@14389L354,365@14791L299,375@15136L186,381@15332L174:TextFieldImpl.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(inputPhase) ? 4 : 2) | i;
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
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function7) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-995111872, i2, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition (TextFieldImpl.kt:309)");
            }
            Transition updateTransition = TransitionKt.updateTransition(inputPhase, "TextFieldInputState", startRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i10) {
                    composer2.startReplaceableGroup(-4765522);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-4765522, i10, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:317)");
                    }
                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
            InputPhase inputPhase2 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(240378898);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240378898, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:319)");
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
            float f6 = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase3 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(240378898);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (!ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(240378898, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:319)");
                    }
                    i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase3.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f2 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i11) {
                                    TweenSpec tween;
                                    composer2.startReplaceableGroup(-1635067817);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1635067817, i11, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
                                    }
                                    if (segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                        tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                                    } else if (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                        tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                                    } else {
                                        tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceableGroup();
                                    return tween;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-1338768149);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                            InputPhase inputPhase4 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(2067512179);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                i4 = -1;
                                i5 = 0;
                                ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:347)");
                            } else {
                                i4 = -1;
                                i5 = 0;
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase4.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                f3 = 0.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceableGroup();
                                Float valueOf2 = Float.valueOf(f3);
                                InputPhase inputPhase5 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(2067512179);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2067512179, i5, i4, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:347)");
                                }
                                i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase5.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    f4 = 0.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    Float valueOf3 = Float.valueOf(f4);
                                    FiniteAnimationSpec<Float> invoke = textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i5));
                                    int i11 = i5;
                                    State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, valueOf3, invoke, vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i12) {
                                            composer2.startReplaceableGroup(1189967029);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1189967029, i12, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
                                            }
                                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(-1338768149);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                    startRestartGroup.startReplaceableGroup(-142660079);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase6 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceableGroup(5829913);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(5829913, i11, i4, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:358)");
                                    }
                                    i8 = WhenMappings.$EnumSwitchMapping$0[inputPhase6.ordinal()];
                                    if (i8 != 1) {
                                        if (i8 != 2) {
                                            if (i8 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else if (z) {
                                            f5 = 0.0f;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            Float valueOf4 = Float.valueOf(f5);
                                            InputPhase inputPhase7 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceableGroup(5829913);
                                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(5829913, i11, i4, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:358)");
                                            }
                                            i9 = WhenMappings.$EnumSwitchMapping$0[inputPhase7.ordinal()];
                                            if (i9 != 1) {
                                                if (i9 != 2) {
                                                    if (i9 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                } else if (z) {
                                                    f6 = 0.0f;
                                                }
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf4, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i11)), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endReplaceableGroup();
                                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                    return invoke(segment, composer2, num.intValue());
                                                }

                                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i12) {
                                                    composer2.startReplaceableGroup(2041936647);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2041936647, i12, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                                                    }
                                                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    return tween$default;
                                                }
                                            };
                                            startRestartGroup.startReplaceableGroup(-1939694975);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                            InputPhase inputPhase8 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceableGroup(-1468066062);
                                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, i11, i4, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:369)");
                                            }
                                            long j3 = WhenMappings.$EnumSwitchMapping$0[inputPhase8.ordinal()] != 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            ColorSpace m3411getColorSpaceimpl = Color.m3411getColorSpaceimpl(j3);
                                            startRestartGroup.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                            changed = startRestartGroup.changed(m3411getColorSpaceimpl);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                            startRestartGroup.startReplaceableGroup(-142660079);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                                            InputPhase inputPhase9 = (InputPhase) updateTransition.getCurrentState();
                                            startRestartGroup.startReplaceableGroup(-1468066062);
                                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, 0, i4, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:369)");
                                            }
                                            long j4 = WhenMappings.$EnumSwitchMapping$0[inputPhase9.ordinal()] != 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            Color m3397boximpl = Color.m3397boximpl(j4);
                                            InputPhase inputPhase10 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceableGroup(-1468066062);
                                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, 0, i4, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:369)");
                                            }
                                            long j5 = WhenMappings.$EnumSwitchMapping$0[inputPhase10.ordinal()] != 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, m3397boximpl, Color.m3397boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, 229376);
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endReplaceableGroup();
                                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                                    return invoke(segment, composer2, num.intValue());
                                                }

                                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i12) {
                                                    composer2.startReplaceableGroup(766065458);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(766065458, i12, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
                                                    }
                                                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer2.endReplaceableGroup();
                                                    return tween$default;
                                                }
                                            };
                                            int i12 = (i2 & 7168) | 384;
                                            startRestartGroup.startReplaceableGroup(-1939694975);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                            ColorSpace m3411getColorSpaceimpl2 = Color.m3411getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i12 >> 6) & 112)).m3417unboximpl());
                                            startRestartGroup.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                            changed2 = startRestartGroup.changed(m3411getColorSpaceimpl2);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl2);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.startReplaceableGroup(-142660079);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                                            int i13 = ((((i12 << 3) & 57344) | 3136) >> 9) & 112;
                                            State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i13)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i13)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endReplaceableGroup();
                                            function7.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3397boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation4)), Color.m3397boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation5)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation3)), startRestartGroup, Integer.valueOf(458752 & i2));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }
                                    f5 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    Float valueOf42 = Float.valueOf(f5);
                                    InputPhase inputPhase72 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(5829913);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i9 = WhenMappings.$EnumSwitchMapping$0[inputPhase72.ordinal()];
                                    if (i9 != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf42, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i11)), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i122) {
                                            composer2.startReplaceableGroup(2041936647);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2041936647, i122, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                                            }
                                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(-1939694975);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                    InputPhase inputPhase82 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1468066062);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase82.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    ColorSpace m3411getColorSpaceimpl3 = Color.m3411getColorSpaceimpl(j3);
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    changed = startRestartGroup.changed(m3411getColorSpaceimpl3);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl3);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    startRestartGroup.endReplaceableGroup();
                                    TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue;
                                    startRestartGroup.startReplaceableGroup(-142660079);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase92 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceableGroup(-1468066062);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase92.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    Color m3397boximpl2 = Color.m3397boximpl(j4);
                                    InputPhase inputPhase102 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1468066062);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase102.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, m3397boximpl2, Color.m3397boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i122) {
                                            composer2.startReplaceableGroup(766065458);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(766065458, i122, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
                                            }
                                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    int i122 = (i2 & 7168) | 384;
                                    startRestartGroup.startReplaceableGroup(-1939694975);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                    ColorSpace m3411getColorSpaceimpl22 = Color.m3411getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i122 >> 6) & 112)).m3417unboximpl());
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(m3411getColorSpaceimpl22);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed2) {
                                    }
                                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl22);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.startReplaceableGroup(-142660079);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                                    int i132 = ((((i122 << 3) & 57344) | 3136) >> 9) & 112;
                                    State createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i132)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i132)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    function7.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3397boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation42)), Color.m3397boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation52)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation32)), startRestartGroup, Integer.valueOf(458752 & i2));
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                                f4 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Float valueOf32 = Float.valueOf(f4);
                                FiniteAnimationSpec<Float> invoke2 = textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i5));
                                int i112 = i5;
                                State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, valueOf32, invoke2, vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                        return invoke(segment, composer2, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i123) {
                                        composer2.startReplaceableGroup(1189967029);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1189967029, i123, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
                                        }
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                startRestartGroup.startReplaceableGroup(-1338768149);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
                                TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                startRestartGroup.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                                InputPhase inputPhase62 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceableGroup(5829913);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i8 = WhenMappings.$EnumSwitchMapping$0[inputPhase62.ordinal()];
                                if (i8 != 1) {
                                }
                                f5 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Float valueOf422 = Float.valueOf(f5);
                                InputPhase inputPhase722 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(5829913);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i9 = WhenMappings.$EnumSwitchMapping$0[inputPhase722.ordinal()];
                                if (i9 != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, valueOf422, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$22.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i112)), vectorConverter32, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                        return invoke(segment, composer2, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i1222) {
                                        composer2.startReplaceableGroup(2041936647);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2041936647, i1222, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                                        }
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                startRestartGroup.startReplaceableGroup(-1939694975);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                InputPhase inputPhase822 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1468066062);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase822.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                ColorSpace m3411getColorSpaceimpl32 = Color.m3411getColorSpaceimpl(j3);
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(m3411getColorSpaceimpl32);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl32);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceableGroup();
                                TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue;
                                startRestartGroup.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                                InputPhase inputPhase922 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceableGroup(-1468066062);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase922.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Color m3397boximpl22 = Color.m3397boximpl(j4);
                                InputPhase inputPhase1022 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1468066062);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase1022.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, m3397boximpl22, Color.m3397boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter22, "LabelTextStyleColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                        return invoke(segment, composer2, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i1222) {
                                        composer2.startReplaceableGroup(766065458);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(766065458, i1222, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
                                        }
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                int i1222 = (i2 & 7168) | 384;
                                startRestartGroup.startReplaceableGroup(-1939694975);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                ColorSpace m3411getColorSpaceimpl222 = Color.m3411getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i1222 >> 6) & 112)).m3417unboximpl());
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(m3411getColorSpaceimpl222);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl222);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                                int i1322 = ((((i1222 << 3) & 57344) | 3136) >> 9) & 112;
                                State createTransitionAnimation522 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i1322)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i1322)), textFieldTransitionScope$Transition$labelContentColor$222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                function7.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3397boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation422)), Color.m3397boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation522)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation22)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation322)), startRestartGroup, Integer.valueOf(458752 & i2));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                            f3 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase52 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(2067512179);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase52.ordinal()];
                            if (i7 != 1) {
                            }
                            f4 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf322 = Float.valueOf(f4);
                            FiniteAnimationSpec<Float> invoke22 = textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i5));
                            int i1122 = i5;
                            State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, valueOf322, invoke22, vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i123) {
                                    composer2.startReplaceableGroup(1189967029);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1189967029, i123, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
                                    }
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-1338768149);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                            InputPhase inputPhase622 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(5829913);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i8 = WhenMappings.$EnumSwitchMapping$0[inputPhase622.ordinal()];
                            if (i8 != 1) {
                            }
                            f5 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf4222 = Float.valueOf(f5);
                            InputPhase inputPhase7222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(5829913);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i9 = WhenMappings.$EnumSwitchMapping$0[inputPhase7222.ordinal()];
                            if (i9 != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf4222, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$222.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i1122)), vectorConverter322, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i12222) {
                                    composer2.startReplaceableGroup(2041936647);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2041936647, i12222, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                                    }
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-1939694975);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            InputPhase inputPhase8222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1468066062);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase8222.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            ColorSpace m3411getColorSpaceimpl322 = Color.m3411getColorSpaceimpl(j3);
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(m3411getColorSpaceimpl322);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl322);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue;
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                            InputPhase inputPhase9222 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1468066062);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase9222.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Color m3397boximpl222 = Color.m3397boximpl(j4);
                            InputPhase inputPhase10222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1468066062);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase10222.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, m3397boximpl222, Color.m3397boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter222, "LabelTextStyleColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i12222) {
                                    composer2.startReplaceableGroup(766065458);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(766065458, i12222, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
                                    }
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            int i12222 = (i2 & 7168) | 384;
                            startRestartGroup.startReplaceableGroup(-1939694975);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            ColorSpace m3411getColorSpaceimpl2222 = Color.m3411getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i12222 >> 6) & 112)).m3417unboximpl());
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(m3411getColorSpaceimpl2222);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl2222);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                            int i13222 = ((((i12222 << 3) & 57344) | 3136) >> 9) & 112;
                            State createTransitionAnimation5222 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i13222)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i13222)), textFieldTransitionScope$Transition$labelContentColor$2222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            function7.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3397boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation4222)), Color.m3397boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation5222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation222)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation3222)), startRestartGroup, Integer.valueOf(458752 & i2));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation6 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i113) {
                            TweenSpec tween;
                            composer2.startReplaceableGroup(-1635067817);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1635067817, i113, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
                            }
                            if (segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                            } else if (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                            } else {
                                tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return tween;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1338768149);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                    InputPhase inputPhase42 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(2067512179);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase42.ordinal()];
                    if (i6 != 1) {
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf222 = Float.valueOf(f3);
                    InputPhase inputPhase522 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(2067512179);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase522.ordinal()];
                    if (i7 != 1) {
                    }
                    f4 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf3222 = Float.valueOf(f4);
                    FiniteAnimationSpec<Float> invoke222 = textFieldTransitionScope$Transition$placeholderOpacity$22.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i5));
                    int i11222 = i5;
                    State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, valueOf3222, invoke222, vectorConverter22, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i123) {
                            composer2.startReplaceableGroup(1189967029);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1189967029, i123, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
                            }
                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1338768149);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                    InputPhase inputPhase6222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(5829913);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i8 = WhenMappings.$EnumSwitchMapping$0[inputPhase6222.ordinal()];
                    if (i8 != 1) {
                    }
                    f5 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf42222 = Float.valueOf(f5);
                    InputPhase inputPhase72222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(5829913);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i9 = WhenMappings.$EnumSwitchMapping$0[inputPhase72222.ordinal()];
                    if (i9 != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf42222, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2222.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i11222)), vectorConverter3222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i122222) {
                            composer2.startReplaceableGroup(2041936647);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2041936647, i122222, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                            }
                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1939694975);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                    InputPhase inputPhase82222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1468066062);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase82222.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ColorSpace m3411getColorSpaceimpl3222 = Color.m3411getColorSpaceimpl(j3);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m3411getColorSpaceimpl3222);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl3222);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                    InputPhase inputPhase92222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1468066062);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase92222.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Color m3397boximpl2222 = Color.m3397boximpl(j4);
                    InputPhase inputPhase102222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1468066062);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase102222.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, m3397boximpl2222, Color.m3397boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2222, "LabelTextStyleColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i122222) {
                            composer2.startReplaceableGroup(766065458);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(766065458, i122222, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
                            }
                            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    int i122222 = (i2 & 7168) | 384;
                    startRestartGroup.startReplaceableGroup(-1939694975);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                    ColorSpace m3411getColorSpaceimpl22222 = Color.m3411getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i122222 >> 6) & 112)).m3417unboximpl());
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(m3411getColorSpaceimpl22222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl22222);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
                    int i132222 = ((((i122222 << 3) & 57344) | 3136) >> 9) & 112;
                    State createTransitionAnimation52222 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i132222)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i132222)), textFieldTransitionScope$Transition$labelContentColor$22222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    function7.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation6)), Color.m3397boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation42222)), Color.m3397boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation52222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2222)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation32222)), startRestartGroup, Integer.valueOf(458752 & i2));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf5 = Float.valueOf(f);
            InputPhase inputPhase32 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(240378898);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (!ComposerKt.isTraceInProgress()) {
            }
            i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase32.ordinal()];
            if (i3 != 1) {
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation62 = TransitionKt.createTransitionAnimation(updateTransition, valueOf5, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$placeholderOpacity$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i113) {
                    TweenSpec tween;
                    composer2.startReplaceableGroup(-1635067817);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1635067817, i113, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:329)");
                    }
                    if (segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                        tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                    } else if (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                        tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                    } else {
                        tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tween;
                }
            };
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
            InputPhase inputPhase422 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(2067512179);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase422.ordinal()];
            if (i6 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf2222 = Float.valueOf(f3);
            InputPhase inputPhase5222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(2067512179);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase5222.ordinal()];
            if (i7 != 1) {
            }
            f4 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf32222 = Float.valueOf(f4);
            FiniteAnimationSpec<Float> invoke2222 = textFieldTransitionScope$Transition$placeholderOpacity$222.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i5));
            int i112222 = i5;
            State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, valueOf32222, invoke2222, vectorConverter222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$22222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$prefixSuffixOpacity$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i123) {
                    composer2.startReplaceableGroup(1189967029);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1189967029, i123, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:356)");
                    }
                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)1165@46369L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter32222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
            InputPhase inputPhase62222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(5829913);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i8 = WhenMappings.$EnumSwitchMapping$0[inputPhase62222.ordinal()];
            if (i8 != 1) {
            }
            f5 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf422222 = Float.valueOf(f5);
            InputPhase inputPhase722222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(5829913);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i9 = WhenMappings.$EnumSwitchMapping$0[inputPhase722222.ordinal()];
            if (i9 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation322222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf422222, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$22222.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf(i112222)), vectorConverter32222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i1222222) {
                    composer2.startReplaceableGroup(2041936647);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2041936647, i1222222, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:366)");
                    }
                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1939694975);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            InputPhase inputPhase822222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1468066062);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase822222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m3411getColorSpaceimpl32222 = Color.m3411getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m3411getColorSpaceimpl32222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl32222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter22222 = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
            InputPhase inputPhase922222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1468066062);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase922222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Color m3397boximpl22222 = Color.m3397boximpl(j4);
            InputPhase inputPhase1022222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1468066062);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase1022222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation422222 = TransitionKt.createTransitionAnimation(updateTransition, m3397boximpl22222, Color.m3397boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$222222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter22222, "LabelTextStyleColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$labelContentColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, int i1222222) {
                    composer2.startReplaceableGroup(766065458);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(766065458, i1222222, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:376)");
                    }
                    TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            int i1222222 = (i2 & 7168) | 384;
            startRestartGroup.startReplaceableGroup(-1939694975);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            ColorSpace m3411getColorSpaceimpl222222 = Color.m3411getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i1222222 >> 6) & 112)).m3417unboximpl());
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(m3411getColorSpaceimpl222222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m3411getColorSpaceimpl222222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)1082@42932L32,1083@42987L31,1084@43043L23,1086@43079L89:Transition.kt#pdpnli");
            int i1322222 = ((((i1222222 << 3) & 57344) | 3136) >> 9) & 112;
            State createTransitionAnimation522222 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i1322222)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i1322222)), textFieldTransitionScope$Transition$labelContentColor$222222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            function7.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation62)), Color.m3397boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation422222)), Color.m3397boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation522222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation22222)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation322222)), startRestartGroup, Integer.valueOf(458752 & i2));
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldTransitionScope$Transition$1
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

                public final void invoke(Composer composer2, int i14) {
                    TextFieldTransitionScope.this.m2123TransitionDTcfvLk(inputPhase, j, j2, function3, z, function7, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$7(State<Color> state) {
        return state.getValue().m3417unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$8(State<Color> state) {
        return state.getValue().m3417unboximpl();
    }
}
