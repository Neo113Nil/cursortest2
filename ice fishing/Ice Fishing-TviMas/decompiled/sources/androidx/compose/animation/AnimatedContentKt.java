package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aP\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0086\u0004\u001a\u0015\u0010'\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0087\u0004¨\u0006("}, d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", Constants.ScionAnalytics.PARAM_LABEL, "", "contentKey", "Lkotlin/ParameterName;", "name", "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final S s, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment alignment2;
        int i6;
        String str2;
        int i7;
        Function1<? super S, ? extends Object> function14;
        final Alignment topStart;
        final String str3;
        final AnimatedContentKt$AnimatedContent$2 animatedContentKt$AnimatedContent$2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2132720749);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(5,4,6,1,3,2)139@7459L58,140@7533L136:AnimatedContent.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function14 = function12;
                        } else {
                            function14 = function12;
                            if ((i & 458752) == 0) {
                                i3 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            }
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                function13 = new Function1<AnimatedContentTransitionScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m73scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                            }
                            topStart = i5 != 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                            str3 = i6 != 0 ? "AnimatedContent" : str2;
                            animatedContentKt$AnimatedContent$2 = i7 != 0 ? new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
                                @Override // kotlin.jvm.functions.Function1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            } : function14;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2132720749, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:138)");
                            }
                            Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i9 = i3 & 8176;
                            int i10 = i3 >> 3;
                            AnimatedContent(updateTransition, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i9 | (57344 & i10) | (i10 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            topStart = alignment2;
                            str3 = str2;
                            animatedContentKt$AnimatedContent$2 = function14;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15 = function13;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
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
                                    AnimatedContentKt.AnimatedContent(s, modifier3, function15, topStart, str3, animatedContentKt$AnimatedContent$2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i3 & 2995931) == 599186) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Transition updateTransition2 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i92 = i3 & 8176;
                    int i102 = i3 >> 3;
                    AnimatedContent(updateTransition2, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i92 | (57344 & i102) | (i102 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i3 & 2995931) == 599186) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Transition updateTransition22 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i922 = i3 & 8176;
                int i1022 = i3 >> 3;
                AnimatedContent(updateTransition22, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i922 | (57344 & i1022) | (i1022 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Transition updateTransition222 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
            int i9222 = i3 & 8176;
            int i10222 = i3 >> 3;
            AnimatedContent(updateTransition222, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i9222 | (57344 & i10222) | (i10222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Transition updateTransition2222 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
        int i92222 = i3 & 8176;
        int i102222 = i3 >> 3;
        AnimatedContent(updateTransition2222, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i92222 | (57344 & i102222) | (i102222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m37invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m37invokeTemP2vQ(long j, long j2) {
                    return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5896boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    public static final SizeTransform SizeTransform(boolean z, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> function2) {
        return new SizeTransformImpl(z, function2);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026f A[LOOP:2: B:129:0x026d->B:130:0x026f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment alignment2;
        int i6;
        Function1<? super S, ? extends Object> function14;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15;
        LayoutDirection layoutDirection;
        boolean changed;
        Object rememberedValue;
        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        boolean changed2;
        Object rememberedValue2;
        SnapshotStateList snapshotStateList;
        boolean changed3;
        LinkedHashMap rememberedValue3;
        Map map;
        int size;
        int i7;
        boolean changed4;
        ContentTransform rememberedValue4;
        Object rememberedValue5;
        int currentCompositeKeyHash;
        Composer m2937constructorimpl;
        int size2;
        int i8;
        final Alignment alignment3;
        final Function1<? super S, ? extends Object> function16;
        final Modifier modifier3;
        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function17;
        Iterator<T> it;
        int i9;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-114689412);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(3,4,1,2)666@34009L7,667@34037L106,671@34231L51,672@34304L62,760@38852L58,761@38944L45,771@39263L52,762@38994L327:AnimatedContent.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        function14 = function12;
                        i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        if ((i2 & 16) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((458752 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? 131072 : 65536;
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                function15 = i4 == 0 ? new Function1<AnimatedContentTransitionScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m73scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                } : function13;
                                if (i5 != 0) {
                                    alignment2 = Alignment.INSTANCE.getTopStart();
                                }
                                if (i6 != 0) {
                                    function14 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final S invoke(S s) {
                                            return s;
                                        }
                                    };
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-114689412, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:665)");
                                }
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                layoutDirection = (LayoutDirection) consume;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(transition);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                animatedContentTransitionScopeImpl = rememberedValue;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(transition);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                snapshotStateList = (SnapshotStateList) rememberedValue2;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed3 = startRestartGroup.changed(transition);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new LinkedHashMap();
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceableGroup();
                                map = (Map) rememberedValue3;
                                if (!snapshotStateList.contains(transition.getCurrentState())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(transition.getCurrentState());
                                }
                                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                                    if (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(transition.getCurrentState());
                                    }
                                    if (map.size() != 1 || map.containsKey(transition.getCurrentState())) {
                                        map.clear();
                                    }
                                    animatedContentTransitionScopeImpl.setContentAlignment(alignment2);
                                    animatedContentTransitionScopeImpl.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                                    it = snapshotStateList.iterator();
                                    i9 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i9 = -1;
                                            break;
                                        } else if (Intrinsics.areEqual(function14.invoke((Object) it.next()), function14.invoke(transition.getTargetState()))) {
                                            break;
                                        } else {
                                            i9++;
                                        }
                                    }
                                    if (i9 != -1) {
                                        snapshotStateList.add(transition.getTargetState());
                                    } else {
                                        snapshotStateList.set(i9, transition.getTargetState());
                                    }
                                }
                                if (map.containsKey(transition.getTargetState()) || !map.containsKey(transition.getCurrentState())) {
                                    map.clear();
                                    SnapshotStateList snapshotStateList2 = snapshotStateList;
                                    size = snapshotStateList2.size();
                                    for (i7 = 0; i7 < size; i7++) {
                                        final T t = snapshotStateList2.get(i7);
                                        int i11 = size;
                                        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function18 = function15;
                                        Map map2 = map;
                                        final SnapshotStateList snapshotStateList3 = snapshotStateList;
                                        map2.put(t, ComposableLambdaKt.composableLambda(startRestartGroup, 885640742, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
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

                                            public final void invoke(Composer composer2, int i12) {
                                                ComposerKt.sourceInformation(composer2, "C709@36279L38,713@36493L323,720@36849L125,725@37157L1637:AnimatedContent.kt#xbi5r1");
                                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(885640742, i12, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:709)");
                                                }
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function19 = function18;
                                                Object obj = animatedContentTransitionScopeImpl;
                                                composer2.startReplaceableGroup(-492369756);
                                                ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                                                ContentTransform rememberedValue6 = composer2.rememberedValue();
                                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue6 = function19.invoke(obj);
                                                    composer2.updateRememberedValue(rememberedValue6);
                                                }
                                                composer2.endReplaceableGroup();
                                                final ContentTransform contentTransform = (ContentTransform) rememberedValue6;
                                                Object valueOf = Boolean.valueOf(Intrinsics.areEqual(transition.getSegment().getTargetState(), t));
                                                Transition<S> transition2 = transition;
                                                S s = t;
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function110 = function18;
                                                Object obj2 = animatedContentTransitionScopeImpl;
                                                composer2.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed5 = composer2.changed(valueOf);
                                                Object rememberedValue7 = composer2.rememberedValue();
                                                if (changed5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue7 = Intrinsics.areEqual(transition2.getSegment().getTargetState(), s) ? ExitTransition.INSTANCE.getNone() : function110.invoke(obj2).getInitialContentExit();
                                                    composer2.updateRememberedValue(rememberedValue7);
                                                }
                                                composer2.endReplaceableGroup();
                                                final ExitTransition exitTransition = (ExitTransition) rememberedValue7;
                                                S s2 = t;
                                                Transition<S> transition3 = transition;
                                                composer2.startReplaceableGroup(-492369756);
                                                ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                                                Object rememberedValue8 = composer2.rememberedValue();
                                                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue8 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(s2, transition3.getTargetState()));
                                                    composer2.updateRememberedValue(rememberedValue8);
                                                }
                                                composer2.endReplaceableGroup();
                                                AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) rememberedValue8;
                                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                Modifier layout = LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.1
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                                        return m36invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                                    public final MeasureResult m36invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                                                        final Placeable mo4678measureBRTryo0 = measurable.mo4678measureBRTryo0(j);
                                                        int width = mo4678measureBRTryo0.getWidth();
                                                        int height = mo4678measureBRTryo0.getHeight();
                                                        final ContentTransform contentTransform2 = ContentTransform.this;
                                                        return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.1.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                placementScope.place(Placeable.this, 0, 0, contentTransform2.getTargetContentZIndex());
                                                            }
                                                        }, 4, null);
                                                    }
                                                });
                                                childData.setTarget(Intrinsics.areEqual(t, transition.getTargetState()));
                                                Modifier then = layout.then(childData);
                                                Transition<S> transition4 = transition;
                                                final S s3 = t;
                                                Function1 function111 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj3) {
                                                        return invoke((AnonymousClass3<S>) obj3);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Boolean invoke(S s4) {
                                                        return Boolean.valueOf(Intrinsics.areEqual(s4, s3));
                                                    }
                                                };
                                                composer2.startReplaceableGroup(841088387);
                                                boolean changed6 = composer2.changed(exitTransition);
                                                Object rememberedValue9 = composer2.rememberedValue();
                                                if (changed6 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue9 = (Function2) new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                            return Boolean.valueOf(enterExitState == EnterExitState.PostExit && enterExitState2 == EnterExitState.PostExit && !ExitTransition.this.getData().getHold());
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue9);
                                                }
                                                composer2.endReplaceableGroup();
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                                final S s4 = t;
                                                final SnapshotStateList<S> snapshotStateList4 = snapshotStateList3;
                                                final Function4<AnimatedContentScope, S, Composer, Integer, Unit> function42 = function4;
                                                AnimatedVisibilityKt.AnimatedEnterExitImpl(transition4, function111, then, targetContentEnter, exitTransition, (Function2) rememberedValue9, null, ComposableLambdaKt.composableLambda(composer2, -616195562, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i13) {
                                                        ComposerKt.sourceInformation(composer3, "C745@38244L253,*753@38659L43,754@38730L24:AnimatedContent.kt#xbi5r1");
                                                        if ((i13 & 14) == 0) {
                                                            i13 |= composer3.changed(animatedVisibilityScope) ? 4 : 2;
                                                        }
                                                        if ((i13 & 91) == 18 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-616195562, i13, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:745)");
                                                        }
                                                        final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                        final S s5 = s4;
                                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                                        EffectsKt.DisposableEffect(animatedVisibilityScope, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.1.5.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                final SnapshotStateList<S> snapshotStateList6 = snapshotStateList5;
                                                                final S s6 = s5;
                                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                                                return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$invoke$$inlined$onDispose$1
                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                    public void dispose() {
                                                                        SnapshotStateList.this.remove(s6);
                                                                        animatedContentTransitionScopeImpl4.getTargetSizeMap$animation_release().remove(s6);
                                                                    }
                                                                };
                                                            }
                                                        }, composer3, i13 & 14);
                                                        Map targetSizeMap$animation_release = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation_release();
                                                        S s6 = s4;
                                                        Intrinsics.checkNotNull(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                        targetSizeMap$animation_release.put(s6, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                                                        composer3.startReplaceableGroup(-492369756);
                                                        ComposerKt.sourceInformation(composer3, "CC(remember):Composables.kt#9igjgp");
                                                        Object rememberedValue10 = composer3.rememberedValue();
                                                        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue10 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                                            composer3.updateRememberedValue(rememberedValue10);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        function42.invoke((AnimatedContentScopeImpl) rememberedValue10, s4, composer3, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }), composer2, 12582912, 64);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        map = map2;
                                        size = i11;
                                        snapshotStateList2 = snapshotStateList2;
                                        snapshotStateList = snapshotStateList;
                                    }
                                }
                                Map map3 = map;
                                SnapshotStateList snapshotStateList4 = snapshotStateList;
                                Transition.Segment<S> segment = transition.getSegment();
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                changed4 = startRestartGroup.changed(segment) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceableGroup();
                                Modifier then = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                startRestartGroup.endReplaceableGroup();
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) rememberedValue5;
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
                                Updater.m2944setimpl(m2937constructorimpl, animatedContentMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
                                startRestartGroup.startReplaceableGroup(-441506448);
                                ComposerKt.sourceInformation(startRestartGroup, "");
                                SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                size2 = snapshotStateList5.size();
                                for (i8 = 0; i8 < size2; i8++) {
                                    Object obj = snapshotStateList5.get(i8);
                                    startRestartGroup.startMovableGroup(-1739558576, function14.invoke(obj));
                                    ComposerKt.sourceInformation(startRestartGroup, "767@39187L8");
                                    Function2 function2 = (Function2) map3.get(obj);
                                    if (function2 != null) {
                                        function2.invoke(startRestartGroup, 0);
                                    }
                                    startRestartGroup.endMovableGroup();
                                }
                                startRestartGroup.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                alignment3 = alignment2;
                                function16 = function14;
                                modifier3 = modifier4;
                                function17 = function15;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                function17 = function13;
                                alignment3 = alignment2;
                                function16 = function14;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
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

                                    public final void invoke(Composer composer2, int i12) {
                                        AnimatedContentKt.AnimatedContent(transition, modifier3, function17, alignment3, function16, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((374491 & i3) == 74898) {
                        }
                        if (i10 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        layoutDirection = (LayoutDirection) consume2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(transition);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        animatedContentTransitionScopeImpl = rememberedValue;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed2 = startRestartGroup.changed(transition);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) rememberedValue2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed3 = startRestartGroup.changed(transition);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue3 = new LinkedHashMap();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        map = (Map) rememberedValue3;
                        if (!snapshotStateList.contains(transition.getCurrentState())) {
                        }
                        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                        }
                        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                            it = snapshotStateList.iterator();
                            i9 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                }
                                i9++;
                            }
                            if (i9 != -1) {
                            }
                        }
                        if (map.containsKey(transition.getTargetState())) {
                        }
                        map.clear();
                        SnapshotStateList snapshotStateList22 = snapshotStateList;
                        size = snapshotStateList22.size();
                        while (i7 < size) {
                        }
                        Map map32 = map;
                        SnapshotStateList snapshotStateList42 = snapshotStateList;
                        Transition.Segment<S> segment2 = transition.getSegment();
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed4 = startRestartGroup.changed(segment2) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceableGroup();
                        Modifier then2 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (AnimatedContentMeasurePolicy) rememberedValue5;
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then2);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                        Updater.m2944setimpl(m2937constructorimpl, animatedContentMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m2937constructorimpl.getInserting()) {
                        }
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
                        startRestartGroup.startReplaceableGroup(-441506448);
                        ComposerKt.sourceInformation(startRestartGroup, "");
                        SnapshotStateList snapshotStateList52 = snapshotStateList42;
                        size2 = snapshotStateList52.size();
                        while (i8 < size2) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        alignment3 = alignment2;
                        function16 = function14;
                        modifier3 = modifier4;
                        function17 = function15;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function14 = function12;
                    if ((i2 & 16) != 0) {
                    }
                    if ((374491 & i3) == 74898) {
                    }
                    if (i10 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localLayoutDirection22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    layoutDirection = (LayoutDirection) consume22;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(transition);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    animatedContentTransitionScopeImpl = rememberedValue;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(transition);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(transition);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = new LinkedHashMap();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    map = (Map) rememberedValue3;
                    if (!snapshotStateList.contains(transition.getCurrentState())) {
                    }
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (map.containsKey(transition.getTargetState())) {
                    }
                    map.clear();
                    SnapshotStateList snapshotStateList222 = snapshotStateList;
                    size = snapshotStateList222.size();
                    while (i7 < size) {
                    }
                    Map map322 = map;
                    SnapshotStateList snapshotStateList422 = snapshotStateList;
                    Transition.Segment<S> segment22 = transition.getSegment();
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed4 = startRestartGroup.changed(segment22) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    Modifier then22 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy22 = (AnimatedContentMeasurePolicy) rememberedValue5;
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(then22);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                    Updater.m2944setimpl(m2937constructorimpl, animatedContentMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m2937constructorimpl.getInserting()) {
                    }
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    modifierMaterializerOf22.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
                    startRestartGroup.startReplaceableGroup(-441506448);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    SnapshotStateList snapshotStateList522 = snapshotStateList422;
                    size2 = snapshotStateList522.size();
                    while (i8 < size2) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    alignment3 = alignment2;
                    function16 = function14;
                    modifier3 = modifier4;
                    function17 = function15;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i2 & 16) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                if (i10 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localLayoutDirection222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                layoutDirection = (LayoutDirection) consume222;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(transition);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                animatedContentTransitionScopeImpl = rememberedValue;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(transition);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) rememberedValue2;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(transition);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = new LinkedHashMap();
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                map = (Map) rememberedValue3;
                if (!snapshotStateList.contains(transition.getCurrentState())) {
                }
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (map.containsKey(transition.getTargetState())) {
                }
                map.clear();
                SnapshotStateList snapshotStateList2222 = snapshotStateList;
                size = snapshotStateList2222.size();
                while (i7 < size) {
                }
                Map map3222 = map;
                SnapshotStateList snapshotStateList4222 = snapshotStateList;
                Transition.Segment<S> segment222 = transition.getSegment();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed4 = startRestartGroup.changed(segment222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                Modifier then222 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy222 = (AnimatedContentMeasurePolicy) rememberedValue5;
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(then222);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, animatedContentMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl.getInserting()) {
                }
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                modifierMaterializerOf222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
                startRestartGroup.startReplaceableGroup(-441506448);
                ComposerKt.sourceInformation(startRestartGroup, "");
                SnapshotStateList snapshotStateList5222 = snapshotStateList4222;
                size2 = snapshotStateList5222.size();
                while (i8 < size2) {
                }
                startRestartGroup.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                alignment3 = alignment2;
                function16 = function14;
                modifier3 = modifier4;
                function17 = function15;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            function14 = function12;
            if ((i2 & 16) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            if (i10 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localLayoutDirection2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            layoutDirection = (LayoutDirection) consume2222;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(transition);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            animatedContentTransitionScopeImpl = rememberedValue;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(transition);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) rememberedValue2;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(transition);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = new LinkedHashMap();
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            map = (Map) rememberedValue3;
            if (!snapshotStateList.contains(transition.getCurrentState())) {
            }
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (map.containsKey(transition.getTargetState())) {
            }
            map.clear();
            SnapshotStateList snapshotStateList22222 = snapshotStateList;
            size = snapshotStateList22222.size();
            while (i7 < size) {
            }
            Map map32222 = map;
            SnapshotStateList snapshotStateList42222 = snapshotStateList;
            Transition.Segment<S> segment2222 = transition.getSegment();
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed4 = startRestartGroup.changed(segment2222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            Modifier then2222 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy2222 = (AnimatedContentMeasurePolicy) rememberedValue5;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(then2222);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, animatedContentMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m2937constructorimpl.getInserting()) {
            }
            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            modifierMaterializerOf2222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
            startRestartGroup.startReplaceableGroup(-441506448);
            ComposerKt.sourceInformation(startRestartGroup, "");
            SnapshotStateList snapshotStateList52222 = snapshotStateList42222;
            size2 = snapshotStateList52222.size();
            while (i8 < size2) {
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            alignment3 = alignment2;
            function16 = function14;
            modifier3 = modifier4;
            function17 = function15;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        function14 = function12;
        if ((i2 & 16) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localLayoutDirection22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        layoutDirection = (LayoutDirection) consume22222;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(transition);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        animatedContentTransitionScopeImpl = rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(transition);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        snapshotStateList = (SnapshotStateList) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(transition);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new LinkedHashMap();
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        map = (Map) rememberedValue3;
        if (!snapshotStateList.contains(transition.getCurrentState())) {
        }
        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (map.containsKey(transition.getTargetState())) {
        }
        map.clear();
        SnapshotStateList snapshotStateList222222 = snapshotStateList;
        size = snapshotStateList222222.size();
        while (i7 < size) {
        }
        Map map322222 = map;
        SnapshotStateList snapshotStateList422222 = snapshotStateList;
        Transition.Segment<S> segment22222 = transition.getSegment();
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed4 = startRestartGroup.changed(segment22222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        Modifier then22222 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy22222 = (AnimatedContentMeasurePolicy) rememberedValue5;
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22222 = LayoutKt.modifierMaterializerOf(then22222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, animatedContentMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl.getInserting()) {
        }
        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        modifierMaterializerOf22222.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
        startRestartGroup.startReplaceableGroup(-441506448);
        ComposerKt.sourceInformation(startRestartGroup, "");
        SnapshotStateList snapshotStateList522222 = snapshotStateList422222;
        size2 = snapshotStateList522222.size();
        while (i8 < size2) {
        }
        startRestartGroup.endReplaceableGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        alignment3 = alignment2;
        function16 = function14;
        modifier3 = modifier4;
        function17 = function15;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
