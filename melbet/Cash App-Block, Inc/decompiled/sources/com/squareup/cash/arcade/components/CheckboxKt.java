package com.squareup.cash.arcade.components;

import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.local.views.internal.LocalCheckboxKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimatableKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.ViewStateRenderers$$ExternalSyntheticLambda5;

/* loaded from: classes5.dex */
public abstract class CheckboxKt {
    public static final void Checkmark(final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1127833910);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        }
        int i3 = i2;
        final int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(colors.isLight ? R.raw.checkbox_check_mark_light : R.raw.checkbox_check_mark_dark)), null, null, null, null, null, gapComposer, 0, 62);
            gapComposer = gapComposer;
            LottieAnimatable rememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(gapComposer, 0);
            if (UtilsKt.isInScreenshotTest(gapComposer)) {
                gapComposer.startReplaceGroup(-228749445);
                if (!z) {
                    gapComposer.end(false);
                    RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = i4;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).intValue();
                                switch (i5) {
                                    case 0:
                                        CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                                        break;
                                    case 1:
                                        CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                                        break;
                                    default:
                                        CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                StaticCheckmark(z2, gapComposer, (i3 >> 3) & 14);
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = r2;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                case 1:
                                    CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            gapComposer.startReplaceGroup(-228671604);
            gapComposer.end(false);
            Boolean valueOf = Boolean.valueOf(z);
            LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
            int i5 = (gapComposer.changed(rememberLottieComposition) ? 1 : 0) | ((i3 & 14) != 4 ? 0 : 1) | (gapComposer.changed(rememberLottieAnimatable) ? 1 : 0);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i5 != 0 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CheckboxKt$Checkmark$3$1(z, rememberLottieAnimatable, rememberLottieComposition, null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(valueOf, lottieComposition, (Function2) rememberedValue, gapComposer);
            float f = z ? 1.0f : RecyclerView.DECELERATION_RATE;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = MotionKt.LocalMotion;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, TargetUtils.sharp$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text), "CheckboxCheckmarkAlpha", null, gapComposer, 3072, 20);
            State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.75f, TargetUtils.sharp$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text), "CheckboxCheckmarkScale", null, gapComposer, 3072, 20);
            if (((LottieComposition) rememberLottieComposition.getValue()) != null) {
                gapComposer.startReplaceGroup(-227978196);
                LottieComposition lottieComposition2 = (LottieComposition) rememberLottieComposition.getValue();
                boolean changed = gapComposer.changed(rememberLottieAnimatable);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CheckboxKt$$ExternalSyntheticLambda5(rememberLottieAnimatable, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function0 function0 = (Function0) rememberedValue2;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f);
                boolean changed2 = gapComposer.changed(animateFloatAsState) | gapComposer.changed(animateFloatAsState2);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CheckboxKt$$ExternalSyntheticLambda6(animateFloatAsState, animateFloatAsState2, 0);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                LottieAnimationKt.LottieAnimation(lottieComposition2, function0, ColorKt.graphicsLayer(m285size3ABfNKs, (Function1) rememberedValue3), false, false, false, false, null, false, null, null, null, false, false, null, null, false, gapComposer, 0, 0, 131064);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-227694112);
                StaticCheckmark(z2, gapComposer, (i3 >> 3) & 14);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup3 = gapComposer.endRestartGroup();
        if (endRestartGroup3 != null) {
            final int i6 = 2;
            endRestartGroup3.block = new Function2() { // from class: com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        case 1:
                            CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            CheckboxKt.Checkmark(z, z2, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void StaticCheckmark(boolean z, Composer composer, int i) {
        int i2;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1450602228);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 5;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            if (z) {
                gapComposer.startReplaceGroup(1835634739);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.component.checkbox.active.background.f176default;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1835637076);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.component.checkbox.active.background.disabled;
                gapComposer.end(false);
            }
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
            Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors3.component.checkbox.active.icon, m340RoundedCornerShape0680j_4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ImageKt.Image(Countries.painterResource(R.drawable.checkbox_check_mark, 0, gapComposer), Room.stringResource(gapComposer, R.string.checkbox_component), SizeKt.m285size3ABfNKs(companion, 24.0f), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | MLKEMEngine.KyberPolyBytes, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ViewStateRenderers$$ExternalSyntheticLambda5(i, i3, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnlabeledCheckbox(boolean z, Function1 function1, Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        Modifier modifier3;
        boolean z4;
        RecomposeScopeImpl endRestartGroup;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        int i5;
        boolean z5;
        Modifier.Companion companion;
        long j;
        long j2;
        long j3;
        Object anonymousClass1;
        NeverEqualPolicy neverEqualPolicy;
        int i6;
        RoundedCornerShape roundedCornerShape;
        Function0 function0;
        ArrayMap arrayMap;
        Function1 function12;
        Modifier modifier4;
        MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        long j4;
        int i7;
        boolean z6;
        Modifier modifier5;
        MutableInteractionSourceImpl mutableInteractionSourceImpl5;
        State state;
        Modifier.Companion companion2;
        long j5;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z7;
        Modifier modifier6;
        Modifier modifier7;
        int i8;
        boolean z8 = z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-167675141);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z8) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    z3 = z2;
                    if (gapComposer.changed(z3)) {
                        i8 = 16384;
                        i4 |= i8;
                    }
                } else {
                    z3 = z2;
                }
                i8 = PKIFailureInfo.certRevoked;
                i4 |= i8;
            } else {
                z3 = z2;
            }
            boolean z9 = false;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                modifier3 = modifier2;
                z4 = z3;
            } else {
                gapComposer.startDefaults();
                int i10 = i & 1;
                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
                if (i10 == 0 || gapComposer.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier2 = companion3;
                    }
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy3) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                    if ((i2 & 16) != 0) {
                        z3 = ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue();
                        i4 &= -57345;
                    }
                    boolean z10 = z3;
                    i5 = i4;
                    z5 = z10;
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    boolean z11 = z3;
                    i5 = i4;
                    z5 = z11;
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                }
                gapComposer.endDefaults();
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy3) {
                    rememberedValue2 = new ArrayMap(1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ArrayMap arrayMap2 = (ArrayMap) rememberedValue2;
                Strings.getSizes(gapComposer).getClass();
                Object obj = DefaultSizes.border.entries;
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
                Strings.getSizes(gapComposer).getClass();
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = HapticsKt.LocalHaptics;
                Function0 rememberHapticTrigger = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(staticProvidableCompositionLocal)).input.subtle, gapComposer, 0);
                Function0 rememberHapticTrigger2 = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(staticProvidableCompositionLocal)).success, gapComposer, 0);
                Function0 rememberHapticTrigger3 = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(staticProvidableCompositionLocal)).input.subtle, gapComposer, 0);
                if (z5) {
                    gapComposer.startReplaceGroup(-162393124);
                    companion = companion3;
                    j = Strings.getColors(gapComposer).component.checkbox.inactive.border.f179default;
                    z9 = false;
                    gapComposer.end(false);
                } else {
                    companion = companion3;
                    if (z) {
                        gapComposer.startReplaceGroup(-162299721);
                        j = Strings.getColors(gapComposer).component.checkbox.inactive.background.disabled;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-162214533);
                        j = Strings.getColors(gapComposer).component.checkbox.inactive.border.disabled;
                        gapComposer.end(false);
                    }
                }
                if (z5) {
                    gapComposer.startReplaceGroup(-162097446);
                    j2 = j;
                    j3 = Strings.getColors(gapComposer).component.checkbox.active.background.f176default;
                    z9 = false;
                    gapComposer.end(false);
                } else {
                    j2 = j;
                    gapComposer.startReplaceGroup(-162015079);
                    j3 = Strings.getColors(gapComposer).component.checkbox.active.background.disabled;
                    gapComposer.end(z9);
                }
                Modifier modifier8 = modifier2;
                boolean z12 = z9;
                long j6 = j3;
                State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : RecyclerView.DECELERATION_RATE, TargetUtils.sharp$default((zzb) ((Motion) gapComposer.consume(MotionKt.getLocalMotion())).springs.text), "CheckboxActiveAlpha", null, gapComposer, 3072, 20);
                Boolean valueOf = Boolean.valueOf(z5);
                int i11 = (57344 & i5) ^ 24576;
                int i12 = i5 & 112;
                boolean changed = ((i5 & 7168) == 2048) | (((i11 <= 16384 || !gapComposer.changed(z5)) && (i5 & 24576) != 16384) ? z12 : true) | (i12 == 32) | gapComposer.changed(rememberHapticTrigger);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy3) {
                    neverEqualPolicy = neverEqualPolicy3;
                    i6 = i5;
                    roundedCornerShape = m340RoundedCornerShape0680j_4;
                    function0 = rememberHapticTrigger2;
                    arrayMap = arrayMap2;
                    function12 = function1;
                    modifier4 = modifier8;
                    anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(z5, function12, mutableInteractionSourceImpl3, rememberHapticTrigger, (Continuation) null, 4);
                    mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                    gapComposer.updateRememberedValue(anonymousClass1);
                } else {
                    roundedCornerShape = m340RoundedCornerShape0680j_4;
                    neverEqualPolicy = neverEqualPolicy3;
                    i6 = i5;
                    function0 = rememberHapticTrigger2;
                    arrayMap = arrayMap2;
                    function12 = function1;
                    mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                    anonymousClass1 = rememberedValue3;
                    modifier4 = modifier8;
                }
                int i13 = (i6 >> 9) & 112;
                Updater.LaunchedEffect(mutableInteractionSourceImpl4, valueOf, function12, (Function2) anonymousClass1, gapComposer);
                Modifier recordVerticalCenter = AlignmentLinesKt.recordVerticalCenter(SizeKt.m285size3ABfNKs(modifier4, 24.0f), AlignmentLinesKt.FirstLineCenter, arrayMap);
                if (function12 != null) {
                    gapComposer.startReplaceGroup(-161240048);
                    RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9);
                    gapComposer = gapComposer;
                    Role role = new Role(1);
                    Function0 function02 = function0;
                    boolean changed2 = (i12 == 32) | gapComposer.changed(function02) | ((i11 > 16384 && gapComposer.changed(z5)) || (i6 & 24576) == 16384) | gapComposer.changed(rememberHapticTrigger3);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    neverEqualPolicy2 = neverEqualPolicy;
                    if (changed2 || rememberedValue4 == neverEqualPolicy2) {
                        modifier5 = recordVerticalCenter;
                        mutableInteractionSourceImpl5 = mutableInteractionSourceImpl4;
                        state = animateFloatAsState;
                        UserJavascriptInterfaceBase$$ExternalSyntheticLambda25 userJavascriptInterfaceBase$$ExternalSyntheticLambda25 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(z5, function02, rememberHapticTrigger3, function1, 5);
                        gapComposer.updateRememberedValue(userJavascriptInterfaceBase$$ExternalSyntheticLambda25);
                        rememberedValue4 = userJavascriptInterfaceBase$$ExternalSyntheticLambda25;
                    } else {
                        modifier5 = recordVerticalCenter;
                        state = animateFloatAsState;
                        mutableInteractionSourceImpl5 = mutableInteractionSourceImpl4;
                    }
                    Function1 function13 = (Function1) rememberedValue4;
                    j4 = j2;
                    i7 = i6;
                    z6 = z5;
                    companion2 = companion;
                    j5 = j6;
                    z7 = false;
                    modifier6 = modifier4;
                    z8 = z;
                    modifier7 = SelectableKt.m336toggleableO2vRcR0(companion2, z8, mutableInteractionSourceImpl5, m3400rippleYJYuY3k, z6, role, function13);
                    gapComposer.end(false);
                } else {
                    j4 = j2;
                    i7 = i6;
                    z6 = z5;
                    modifier5 = recordVerticalCenter;
                    mutableInteractionSourceImpl5 = mutableInteractionSourceImpl4;
                    state = animateFloatAsState;
                    companion2 = companion;
                    j5 = j6;
                    neverEqualPolicy2 = neverEqualPolicy;
                    z7 = false;
                    modifier6 = modifier4;
                    z8 = z;
                    gapComposer.startReplaceGroup(-160768507);
                    gapComposer.end(false);
                    modifier7 = companion2;
                }
                Modifier then = modifier5.then(modifier7);
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z7);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf2 = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                int i14 = i7;
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                Modifier modifier9 = modifier6;
                RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                BoxKt.Box(ImageKt.m178borderxT4_qwU(SizeKt.m285size3ABfNKs(companion2, 24.0f), 1.0f, j4, roundedCornerShape2), gapComposer, 0);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, 24.0f);
                boolean changed3 = gapComposer.changed(state);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue5 == neverEqualPolicy2) {
                    rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda10(state, 2);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ColorKt.graphicsLayer(m285size3ABfNKs, (Function1) rememberedValue5), j5, roundedCornerShape2);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Checkmark(z8, z6, gapComposer, (i14 & 14) | i13);
                gapComposer.end(true);
                gapComposer.end(true);
                z4 = z6;
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl5;
                modifier3 = modifier9;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalCheckboxKt$$ExternalSyntheticLambda1(z8, function1, modifier3, mutableInteractionSourceImpl2, z4, i, i2, 1);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        boolean z92 = false;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
