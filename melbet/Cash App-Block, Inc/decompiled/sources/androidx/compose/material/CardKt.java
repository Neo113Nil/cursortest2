package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.SliderDefaults$Thumb$1$1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidAccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation$Companion$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ModalKt$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda1;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class CardKt {

    /* renamed from: lambda$-1341284559, reason: not valid java name */
    public static final ComposableLambdaImpl f7lambda$1341284559;

    /* renamed from: lambda$-1624772335, reason: not valid java name */
    public static final ComposableLambdaImpl f8lambda$1624772335;
    public static final ComposableLambdaImpl lambda$1890101041;
    public static final ComposableLambdaImpl lambda$566090785;
    public static final ComposableLambdaImpl lambda$939725476;

    static {
        new ComposableLambdaImpl(new SnackbarHostKt$$ExternalSyntheticLambda2(8), false, 866784315);
        new ComposableLambdaImpl(new SnackbarHostKt$$ExternalSyntheticLambda2(9), false, 1714259275);
        new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(4), false, -1836397928);
        new ComposableLambdaImpl(new SnackbarHostKt$$ExternalSyntheticLambda2(10), false, -1406416085);
        lambda$566090785 = new ComposableLambdaImpl(new SnackbarHostKt$$ExternalSyntheticLambda2(11), false, 566090785);
        f8lambda$1624772335 = new ComposableLambdaImpl(new SnackbarHostKt$$ExternalSyntheticLambda2(12), false, -1624772335);
        lambda$939725476 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(5), false, 939725476);
        f7lambda$1341284559 = new ComposableLambdaImpl(new SnackbarHostKt$$ExternalSyntheticLambda2(13), false, -1341284559);
        lambda$1890101041 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(6), false, 1890101041);
    }

    public static final void Button(Function0 function0, Modifier modifier, boolean z, DefaultButtonElevation defaultButtonElevation, Shape shape, DefaultButtonColors defaultButtonColors, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        int i4;
        MutableState mutableState;
        AnimationState animationState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1084573925);
        int i5 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if ((i2 & 8) != 0) {
            i3 = i5 | 3072;
        } else {
            i3 = i5 | (gapComposer.changed((Object) null) ? 2048 : 1024);
        }
        int i6 = i3 | (gapComposer.changed(defaultButtonElevation) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(shape) ? PKIFailureInfo.unsupportedVersion : 65536) | ((i2 & 64) != 0 ? 1572864 : gapComposer.changed((Object) null) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(defaultButtonColors) ? 8388608 : 4194304);
        if ((i & 100663296) == 0) {
            i6 |= gapComposer.changed(paddingValues) ? 67108864 : 33554432;
        }
        int i7 = i6;
        int i8 = 0;
        if (gapComposer.shouldExecute(i7 & 1, (306783379 & i7) != 306783378)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            gapComposer.startReplaceGroup(497721888);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
            gapComposer.end(false);
            int i9 = i7 >> 6;
            int i10 = i9 & 14;
            defaultButtonColors.getClass();
            gapComposer.startReplaceGroup(-2133647540);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(z ? defaultButtonColors.contentColor : defaultButtonColors.disabledContentColor), gapComposer);
            gapComposer.end(false);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new ButtonKt$$ExternalSyntheticLambda2(i8);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue2);
            gapComposer.startReplaceGroup(-655254499);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(new Color(z ? defaultButtonColors.backgroundColor : defaultButtonColors.disabledBackgroundColor), gapComposer);
            gapComposer.end(false);
            long j = ((Color) rememberUpdatedState2.getValue()).value;
            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(1.0f, ((Color) rememberUpdatedState.getValue()).value, 14);
            if (defaultButtonElevation == null) {
                gapComposer.startReplaceGroup(498128545);
                gapComposer.end(false);
                mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                i4 = i9;
                mutableState = rememberUpdatedState;
                animationState = null;
            } else {
                gapComposer.startReplaceGroup(1401541984);
                gapComposer.startReplaceGroup(-1588756907);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == obj) {
                    rememberedValue3 = new SnapshotStateList();
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue3;
                boolean changed = gapComposer.changed(mutableInteractionSourceImpl2);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed || rememberedValue4 == obj) {
                    rememberedValue4 = new SliderDefaults$Thumb$1$1(mutableInteractionSourceImpl2, snapshotStateList, null, 1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect(gapComposer, mutableInteractionSourceImpl2, (Function2) rememberedValue4);
                Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
                float f = !z ? defaultButtonElevation.disabledElevation : interaction instanceof PressInteraction.Press ? defaultButtonElevation.pressedElevation : interaction instanceof HoverInteraction$Enter ? defaultButtonElevation.hoveredElevation : interaction instanceof FocusInteraction$Focus ? defaultButtonElevation.focusedElevation : defaultButtonElevation.defaultElevation;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == obj) {
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                    rememberedValue5 = new Animatable(new Dp(f), AnimatableKt.DpToVector, (Object) null, 12);
                    gapComposer.updateRememberedValue(rememberedValue5);
                } else {
                    mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                }
                Animatable animatable = (Animatable) rememberedValue5;
                Dp dp = new Dp(f);
                boolean changedInstance = gapComposer.changedInstance(animatable) | gapComposer.changed(f) | (((i10 ^ 6) > 4 && gapComposer.changed(z)) || (i9 & 6) == 4) | ((((i9 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(defaultButtonElevation)) || (i9 & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer.changedInstance(interaction);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue6 == obj) {
                    i4 = i9;
                    mutableState = rememberUpdatedState;
                    rememberedValue6 = new DefaultButtonElevation$elevation$2$1(animatable, f, z, defaultButtonElevation, interaction, null, 0);
                    gapComposer.updateRememberedValue(rememberedValue6);
                } else {
                    i4 = i9;
                    mutableState = rememberUpdatedState;
                }
                Updater.LaunchedEffect(gapComposer, dp, (Function2) rememberedValue6);
                animationState = animatable.internalState;
                gapComposer.end(false);
                gapComposer.end(false);
            }
            m473SurfaceLPr_se0(function0, semantics, z, shape, j, m675copywmQWz5c$default, animationState != null ? ((Dp) animationState.value$delegate.getValue()).value : RecyclerView.DECELERATION_RATE, mutableInteractionSourceImpl, Expect_jvmKt.rememberComposableLambda(-20345758, new MenuKt$$ExternalSyntheticLambda1(5, mutableState, paddingValues, composableLambdaImpl), gapComposer), gapComposer, (i4 & 7168) | (i7 & 14) | 805306368 | (i7 & 896) | (3670016 & i7));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda1(function0, modifier, z, defaultButtonElevation, shape, defaultButtonColors, paddingValues, composableLambdaImpl, i, i2);
        }
    }

    /* renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m466CardFjzlyU(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            shape = ((Shapes) ((GapComposer) composer).consume(ShapesKt.LocalShapes)).medium;
        }
        Shape shape2 = shape;
        if ((i2 & 4) != 0) {
            j = ((Colors) ((GapComposer) composer).consume(ColorsKt.LocalColors)).m486getSurface0d7_KjU();
        }
        long j2 = j;
        m472SurfaceFjzlyU(modifier, shape2, j2, ColorsKt.m488contentColorForek8zF_U(j2, composer), (i2 & 16) != 0 ? null : borderStroke, f, composableLambdaImpl, composer, i & 4194302, 0);
    }

    public static final void CommonDecorationBox(final TextFieldType textFieldType, String str, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final boolean z, final boolean z2, final boolean z3, final MutableInteractionSourceImpl mutableInteractionSourceImpl, PaddingValues paddingValues, final Shape shape, final TextFieldColors textFieldColors, final Function2 function25, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z4;
        int i5;
        PaddingValues paddingValues2;
        GapComposer gapComposer;
        boolean z5;
        long j;
        boolean z6;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(418608794);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function2) ? 256 : 128;
        }
        int i6 = i & 3072;
        VisualTransformation$Companion$$ExternalSyntheticLambda0 visualTransformation$Companion$$ExternalSyntheticLambda0 = VisualTransformation.Companion.None;
        if (i6 == 0) {
            i3 |= gapComposer2.changed(visualTransformation$Companion$$ExternalSyntheticLambda0) ? 2048 : 1024;
        }
        int i7 = i & 24576;
        int i8 = PKIFailureInfo.certRevoked;
        if (i7 == 0) {
            i3 |= gapComposer2.changedInstance(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changedInstance(function22) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changedInstance(function23) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changedInstance(function24) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changed(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 = 196608;
            z4 = z2;
            i3 |= gapComposer2.changed(z4) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            i4 = 196608;
            z4 = z2;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (gapComposer2.changed(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= gapComposer2.changed(mutableInteractionSourceImpl) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            paddingValues2 = paddingValues;
            i5 |= gapComposer2.changed(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i2 & 3072) == 0) {
            i5 |= gapComposer2.changed(shape) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (gapComposer2.changed(textFieldColors)) {
                i8 = 16384;
            }
            i5 |= i8;
        }
        if ((i2 & i4) == 0) {
            i5 |= gapComposer2.changedInstance(function25) ? 131072 : 65536;
        }
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            boolean z7 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z7 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = visualTransformation$Companion$$ExternalSyntheticLambda0.filter(new AnnotatedString(str));
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final String str2 = ((TransformedText) rememberedValue).text.text;
            InputPhase inputPhase = ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer2, (i5 >> 3) & 14).getValue()).booleanValue() ? InputPhase.Focused : str2.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(textFieldColors, z4, z3, mutableInteractionSourceImpl, 0);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = TypographyKt.LocalTypography;
            Typography typography = (Typography) gapComposer2.consume(staticProvidableCompositionLocal);
            TextStyle textStyle = typography.subtitle1;
            TextStyle textStyle2 = typography.caption;
            long m996getColor0d7_KjU = textStyle.m996getColor0d7_KjU();
            long j2 = Color.Unspecified;
            final boolean z8 = (Color.m676equalsimpl0(m996getColor0d7_KjU, j2) && !Color.m676equalsimpl0(textStyle2.m996getColor0d7_KjU(), j2)) || (!Color.m676equalsimpl0(textStyle.m996getColor0d7_KjU(), j2) && Color.m676equalsimpl0(textStyle2.m996getColor0d7_KjU(), j2));
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE$1;
            gapComposer2.startReplaceGroup(-1443813555);
            long m996getColor0d7_KjU2 = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).caption.m996getColor0d7_KjU();
            if (z8) {
                j = 16;
                gapComposer2.startReplaceGroup(-887928539);
                if (m996getColor0d7_KjU2 == 16) {
                    m996getColor0d7_KjU2 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase, gapComposer2, 0)).value;
                }
                z5 = false;
                gapComposer2.end(false);
            } else {
                z5 = false;
                j = 16;
                gapComposer2.startReplaceGroup(1218284988);
                gapComposer2.end(false);
            }
            long j3 = m996getColor0d7_KjU2;
            gapComposer2.end(z5);
            gapComposer2.startReplaceGroup(-1443806289);
            long m996getColor0d7_KjU3 = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).subtitle1.m996getColor0d7_KjU();
            if (z8) {
                gapComposer2.startReplaceGroup(-1026713946);
                if (m996getColor0d7_KjU3 == j) {
                    m996getColor0d7_KjU3 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase, gapComposer2, 0)).value;
                }
                z6 = false;
                gapComposer2.end(false);
            } else {
                z6 = false;
                gapComposer2.startReplaceGroup(798166043);
                gapComposer2.end(false);
            }
            long j4 = m996getColor0d7_KjU3;
            gapComposer2.end(z6);
            gapComposer = gapComposer2;
            final PaddingValues paddingValues3 = paddingValues2;
            textFieldDefaults.m508TransitionDTcfvLk(inputPhase, j3, j4, textFieldImplKt$CommonDecorationBox$labelColor$1, z6, Expect_jvmKt.rememberComposableLambda(33336375, new Function6(str2, textFieldColors, z2, z3, mutableInteractionSourceImpl, function23, function24, shape, textFieldType, function2, z, paddingValues3, z8, function25) { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3
                public final /* synthetic */ Function2 $border;
                public final /* synthetic */ TextFieldColors $colors;
                public final /* synthetic */ PaddingValues $contentPadding;
                public final /* synthetic */ boolean $enabled;
                public final /* synthetic */ Function2 $innerTextField;
                public final /* synthetic */ MutableInteractionSourceImpl $interactionSource;
                public final /* synthetic */ boolean $isError;
                public final /* synthetic */ Function2 $leadingIcon;
                public final /* synthetic */ Shape $shape;
                public final /* synthetic */ boolean $singleLine;
                public final /* synthetic */ Function2 $trailingIcon;
                public final /* synthetic */ String $transformedText;
                public final /* synthetic */ TextFieldType $type;

                {
                    this.$border = function25;
                }

                @Override // kotlin.jvm.functions.Function6
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i9;
                    TextFieldColors textFieldColors2;
                    boolean z9;
                    ComposableLambdaImpl composableLambdaImpl;
                    ComposableLambdaImpl rememberComposableLambda;
                    ComposableLambdaImpl rememberComposableLambda2;
                    Modifier modifier;
                    float floatValue = ((Number) obj).floatValue();
                    long j5 = ((Color) obj2).value;
                    long j6 = ((Color) obj3).value;
                    float floatValue2 = ((Number) obj4).floatValue();
                    Composer composer2 = (Composer) obj5;
                    int intValue = ((Number) obj6).intValue();
                    if ((intValue & 6) == 0) {
                        i9 = (((GapComposer) composer2).changed(floatValue) ? 4 : 2) | intValue;
                    } else {
                        i9 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i9 |= ((GapComposer) composer2).changed(j5) ? 32 : 16;
                    }
                    if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                        i9 |= ((GapComposer) composer2).changed(j6) ? 256 : 128;
                    }
                    if ((intValue & 3072) == 0) {
                        i9 |= ((GapComposer) composer2).changed(floatValue2) ? 2048 : 1024;
                    }
                    int i10 = 1;
                    int i11 = 0;
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(i9 & 1, (i9 & 9363) != 9362)) {
                        gapComposer3.startReplaceGroup(986681709);
                        gapComposer3.end(false);
                        boolean z10 = this.$enabled;
                        TextFieldColors textFieldColors3 = this.$colors;
                        Function2 function26 = Function2.this;
                        if (function26 == null || this.$transformedText.length() != 0 || floatValue2 <= RecyclerView.DECELERATION_RATE) {
                            textFieldColors2 = textFieldColors3;
                            z9 = z10;
                            gapComposer3.startReplaceGroup(988093542);
                            gapComposer3.end(false);
                            composableLambdaImpl = null;
                        } else {
                            gapComposer3.startReplaceGroup(987666549);
                            TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0 textFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0 = new TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0(floatValue2, textFieldColors3, z10, function26, 0);
                            textFieldColors2 = textFieldColors3;
                            z9 = z10;
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-426706263, textFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0, gapComposer3);
                            gapComposer3.end(false);
                        }
                        boolean z11 = this.$isError;
                        long j7 = ((Color) textFieldColors2.mo491leadingIconColor(z9, z11, gapComposer3).getValue()).value;
                        Function2 function27 = this.$leadingIcon;
                        if (function27 == null) {
                            gapComposer3.startReplaceGroup(988282301);
                            gapComposer3.end(false);
                            rememberComposableLambda = null;
                        } else {
                            gapComposer3.startReplaceGroup(988282302);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-317090443, new TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1(j7, function27, i11), gapComposer3);
                            gapComposer3.end(false);
                        }
                        long j8 = ((Color) textFieldColors2.trailingIconColor(z9, z11, this.$interactionSource, gapComposer3).getValue()).value;
                        Function2 function28 = this.$trailingIcon;
                        if (function28 == null) {
                            gapComposer3.startReplaceGroup(988575964);
                            gapComposer3.end(false);
                            rememberComposableLambda2 = null;
                        } else {
                            gapComposer3.startReplaceGroup(988575965);
                            rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(262889693, new TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1(j8, function28, i10), gapComposer3);
                            gapComposer3.end(false);
                        }
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, ((Color) textFieldColors2.backgroundColor(gapComposer3).getValue()).value, this.$shape);
                        int ordinal = this.$type.ordinal();
                        if (ordinal == 0) {
                            gapComposer3.startReplaceGroup(988856360);
                            CardKt.TextFieldLayout(m177backgroundbw27NRU, this.$innerTextField, null, composableLambdaImpl, rememberComposableLambda, rememberComposableLambda2, this.$singleLine, floatValue, this.$contentPadding, gapComposer3, 29360128 & (i9 << 21));
                            gapComposer3.end(false);
                        } else {
                            if (ordinal != 1) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1971561250, false);
                            }
                            gapComposer3.startReplaceGroup(989436742);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            if (rememberedValue2 == neverEqualPolicy) {
                                modifier = m177backgroundbw27NRU;
                                rememberedValue2 = Updater.mutableStateOf$default(new Size(0L));
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            } else {
                                modifier = m177backgroundbw27NRU;
                            }
                            MutableState mutableState = (MutableState) rememberedValue2;
                            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1107746014, new MenuKt$$ExternalSyntheticLambda1(7, mutableState, this.$contentPadding, this.$border), gapComposer3);
                            boolean z12 = (i9 & 14) == 4;
                            Object rememberedValue3 = gapComposer3.rememberedValue();
                            if (z12 || rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = new TextFieldKt$$ExternalSyntheticLambda0(floatValue, mutableState, 1);
                                gapComposer3.updateRememberedValue(rememberedValue3);
                            }
                            ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                            ComposableLambdaImpl composableLambdaImpl3 = rememberComposableLambda;
                            ComposableLambdaImpl composableLambdaImpl4 = rememberComposableLambda2;
                            Modifier modifier2 = modifier;
                            OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier2, this.$innerTextField, composableLambdaImpl2, null, composableLambdaImpl3, composableLambdaImpl4, this.$singleLine, floatValue, (Function1) rememberedValue3, rememberComposableLambda3, this.$contentPadding, gapComposer3, ((i9 << 21) & 29360128) | 805306368);
                            gapComposer3.end(false);
                        }
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1769472);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldImplKt$$ExternalSyntheticLambda1(textFieldType, str, function2, function22, function23, function24, z, z2, z3, mutableInteractionSourceImpl, paddingValues, shape, textFieldColors, function25, i, i2);
        }
    }

    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m467DecorationeuL9pac(long j, TextStyle textStyle, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2064632657);
        int i4 = (gapComposer.changed(j) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (gapComposer.changed(textStyle) ? 32 : 16);
        }
        Float f = null;
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed((Object) null) ? 256 : 128;
        }
        int i6 = i3 | (gapComposer.changedInstance(function2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                textStyle = null;
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-650790565, new TextFieldImplKt$$ExternalSyntheticLambda2(j, f, function2, 0), gapComposer);
            if (textStyle != null) {
                gapComposer.startReplaceGroup(-162880673);
                TextKt.ProvideTextStyle(textStyle, rememberComposableLambda, gapComposer, ((i6 >> 3) & 14) | 48);
            } else {
                gapComposer.startReplaceGroup(-162879037);
                rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        TextStyle textStyle2 = textStyle;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldImplKt$$ExternalSyntheticLambda3(j, textStyle2, function2, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0041  */
    /* renamed from: Divider-oMI9zvI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m468DivideroMI9zvI(Modifier modifier, long j, float f, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        int i4;
        int i5;
        float f2;
        long j3;
        RecomposeScopeImpl endRestartGroup;
        long m675copywmQWz5c$default;
        float f3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1249392198);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        }
        if ((i2 & 2) == 0) {
            j2 = j;
            if (gapComposer.changed(j2)) {
                i4 = 32;
                i5 = i3 | i4 | 3072;
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) == 1170)) {
                    f2 = f;
                    gapComposer.skipToGroupEnd();
                    j3 = j2;
                } else {
                    gapComposer.startDefaults();
                    int i7 = i & 1;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i7 == 0 || gapComposer.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier2 = companion;
                        }
                        if ((i2 & 2) != 0) {
                            m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.12f, ((Colors) gapComposer.consume(ColorsKt.LocalColors)).m484getOnSurface0d7_KjU(), 14);
                            gapComposer.endDefaults();
                            f2 = f;
                            if (Dp.m1037equalsimpl0(f2, RecyclerView.DECELERATION_RATE)) {
                                gapComposer.startReplaceGroup(-455913241);
                                gapComposer.end(false);
                                f3 = f2;
                            } else {
                                gapComposer.startReplaceGroup(-455979798);
                                f3 = 1.0f / ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getDensity();
                                gapComposer.end(false);
                            }
                            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier2.then(companion), 1.0f), f3), m675copywmQWz5c$default, ColorKt.RectangleShape), gapComposer, 0);
                            j3 = m675copywmQWz5c$default;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                    m675copywmQWz5c$default = j2;
                    gapComposer.endDefaults();
                    f2 = f;
                    if (Dp.m1037equalsimpl0(f2, RecyclerView.DECELERATION_RATE)) {
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier2.then(companion), 1.0f), f3), m675copywmQWz5c$default, ColorKt.RectangleShape), gapComposer, 0);
                    j3 = m675copywmQWz5c$default;
                }
                Modifier modifier3 = modifier2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda0(modifier3, j3, f2, i, i2);
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i4 = 16;
        i5 = i3 | i4 | 3072;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) == 1170)) {
        }
        Modifier modifier32 = modifier2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void DropdownMenuContent(MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        MutableState mutableState2;
        Easing easing;
        TweenSpec tween$default;
        boolean z;
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1077393800);
        int i3 = i | (gapComposer.changed(mutableTransitionState) ? 4 : 2) | (gapComposer.changed(scrollState) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024) | (gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Transition rememberTransition = AnimatableKt.rememberTransition(mutableTransitionState, "DropDownMenu", gapComposer, (i3 & 14) | 48, 0);
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
            InteractionResult interactionResult = rememberTransition.transitionState;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = rememberTransition.targetState$delegate;
            boolean booleanValue = ((Boolean) interactionResult.getCurrentState()).booleanValue();
            gapComposer.startReplaceGroup(-1833869404);
            float f = booleanValue ? 1.0f : 0.8f;
            gapComposer.end(false);
            Float valueOf = Float.valueOf(f);
            boolean booleanValue2 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            gapComposer.startReplaceGroup(-1833869404);
            float f2 = booleanValue2 ? 1.0f : 0.8f;
            gapComposer.end(false);
            Float valueOf2 = Float.valueOf(f2);
            Transition.Segment segment = rememberTransition.getSegment();
            gapComposer.startReplaceGroup(445475263);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (segment.isTransitioningTo(bool, bool2)) {
                tween$default = AnimatableKt.tween$default(120, 0, EasingKt.LinearOutSlowInEasing, 2);
                z = false;
                easing = null;
            } else {
                easing = null;
                tween$default = AnimatableKt.tween$default(1, 74, null, 4);
                z = false;
            }
            gapComposer.end(z);
            Easing easing2 = easing;
            Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(rememberTransition, valueOf, valueOf2, tween$default, twoWayConverterImpl, gapComposer, 0);
            boolean booleanValue3 = ((Boolean) rememberTransition.transitionState.getCurrentState()).booleanValue();
            gapComposer.startReplaceGroup(-1578341192);
            float f3 = booleanValue3 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf3 = Float.valueOf(f3);
            boolean booleanValue4 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            gapComposer.startReplaceGroup(-1578341192);
            float f4 = booleanValue4 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf4 = Float.valueOf(f4);
            Transition.Segment segment2 = rememberTransition.getSegment();
            gapComposer.startReplaceGroup(701003475);
            TweenSpec tween$default2 = segment2.isTransitioningTo(bool, bool2) ? AnimatableKt.tween$default(30, 0, easing2, 6) : AnimatableKt.tween$default(75, 0, easing2, 6);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(rememberTransition, valueOf3, valueOf4, tween$default2, twoWayConverterImpl, gapComposer, 0);
            boolean changed = gapComposer.changed(createTransitionAnimation) | gapComposer.changed(createTransitionAnimation2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                mutableState2 = mutableState;
                i2 = 0;
                rememberedValue = new MenuKt$$ExternalSyntheticLambda0(i2, mutableState2, createTransitionAnimation, createTransitionAnimation2);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                mutableState2 = mutableState;
                i2 = 0;
            }
            m466CardFjzlyU(ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), null, 0L, null, 8.0f, Expect_jvmKt.rememberComposableLambda(-707086267, new MenuKt$$ExternalSyntheticLambda1(i2, modifier, scrollState, composableLambdaImpl), gapComposer), gapComposer, 1769472, 30);
            gapComposer = gapComposer;
        } else {
            mutableState2 = mutableState;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda2(mutableTransitionState, mutableState2, scrollState, modifier, composableLambdaImpl, i);
        }
    }

    public static final void FadeInFadeOutWithScale(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1354335728);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? gapComposer.changed((Object) null) : gapComposer.changedInstance(null) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(lambda$1890101041) ? 256 : 128;
        }
        int i3 = 1;
        byte b = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = rememberedValue;
            if (rememberedValue == Composer.Companion.Empty) {
                FadeInFadeOutState fadeInFadeOutState = new FadeInFadeOutState();
                fadeInFadeOutState.current = new Object();
                fadeInFadeOutState.items = new ArrayList();
                gapComposer.updateRememberedValue(fadeInFadeOutState);
                obj = fadeInFadeOutState;
            }
            FadeInFadeOutState fadeInFadeOutState2 = (FadeInFadeOutState) obj;
            String m478getString4foXLRw = m478getString4foXLRw(gapComposer, 7);
            Object obj2 = fadeInFadeOutState2.current;
            ArrayList arrayList = fadeInFadeOutState2.items;
            if (Intrinsics.areEqual((Object) null, obj2)) {
                gapComposer.startReplaceGroup(95881138);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(93279711);
                fadeInFadeOutState2.current = null;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((FadeInFadeOutAnimationItem) arrayList.get(i4)).getClass();
                    arrayList2.add(null);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(null)) {
                    arrayList3.add(null);
                }
                arrayList.clear();
                ArrayList fastFilterNotNull = ListUtilsKt.fastFilterNotNull(arrayList3);
                int size2 = fastFilterNotNull.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    if (fastFilterNotNull.get(i5) != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return;
                    }
                    arrayList.add(new FadeInFadeOutAnimationItem(Expect_jvmKt.rememberComposableLambda(-1032415134, new LocalViewFactory$$ExternalSyntheticLambda6(i3, arrayList3, fadeInFadeOutState2, m478getString4foXLRw), gapComposer)));
                }
                gapComposer.end(false);
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            RecomposeScopeImpl currentRecomposeScope$runtime = gapComposer.getCurrentRecomposeScope$runtime();
            if (currentRecomposeScope$runtime == null) {
                a$$ExternalSyntheticBUOutline0.m$1("no recompose scope found");
                return;
            }
            currentRecomposeScope$runtime.flags |= 1;
            fadeInFadeOutState2.scope = currentRecomposeScope$runtime;
            gapComposer.startReplaceGroup(-1757732554);
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) arrayList.get(i6);
                fadeInFadeOutAnimationItem.getClass();
                ComposableLambdaImpl composableLambdaImpl = fadeInFadeOutAnimationItem.transition;
                gapComposer.startMovableGroup(-1515535286, null);
                composableLambdaImpl.invoke((Object) Expect_jvmKt.rememberComposableLambda(2017516783, new SnackbarHostKt$$ExternalSyntheticLambda2(b), gapComposer), (Object) gapComposer, (Object) 6);
                gapComposer.end(false);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier, i, (int) b, b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(int i, int i2, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0, boolean z) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1316660641);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i3 | 3456;
            if ((i & 24576) == 0) {
                i4 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                z2 = z;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement;
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(modifier4.then(MinimumInteractiveModifier.INSTANCE), null, RippleKt.m500rippleH2RKhps$default(24.0f, 4, 0L, false), true, null, new Role(0), function0, 8);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                }
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(-1874697310);
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentAlphaKt.LocalContentAlpha;
                float floatValue = ((Number) gapComposer.consume(dynamicProvidableCompositionLocal)).floatValue();
                gapComposer.end(false);
                Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Float.valueOf(floatValue)), composableLambdaImpl, gapComposer, ((i4 >> 9) & 112) | 8);
                gapComposer.end(true);
                modifier3 = modifier4;
                z2 = true;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(function0, modifier3, z2, composableLambdaImpl, i, i2, 0);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3 | 3456;
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(Colors colors, Typography typography, Shapes shapes, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Typography typography2;
        int i3;
        Shapes shapes2;
        int i4;
        int i5;
        ComposableLambdaImpl composableLambdaImpl2;
        RecomposeScopeImpl endRestartGroup;
        Typography typography3;
        Shapes shapes3;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        long m485getPrimary0d7_KjU;
        long m482getBackground0d7_KjU;
        long m487contentColorFor4WTKRHQ;
        float f;
        long j;
        long m675copywmQWz5c$default;
        boolean changed;
        Object rememberedValue2;
        float f2;
        float m476calculateContrastRationb2GgbA;
        int i6;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(53836214);
        int i7 = i | (gapComposer.changed(colors) ? 4 : 2);
        if ((i2 & 2) == 0) {
            typography2 = typography;
            if (gapComposer.changed(typography2)) {
                i3 = 32;
                int i8 = i7 | i3;
                if ((i2 & 4) != 0) {
                    shapes2 = shapes;
                    if (gapComposer.changed(shapes2)) {
                        i4 = 256;
                        i5 = i8 | i4;
                        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
                            gapComposer.startDefaults();
                            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                                Typography typography4 = (i2 & 2) != 0 ? (Typography) gapComposer.consume(TypographyKt.LocalTypography) : typography2;
                                if ((i2 & 4) != 0) {
                                    typography3 = typography4;
                                    shapes3 = (Shapes) gapComposer.consume(ShapesKt.LocalShapes);
                                    gapComposer.endDefaults();
                                    rememberedValue = gapComposer.rememberedValue();
                                    neverEqualPolicy = Composer.Companion.Empty;
                                    if (rememberedValue == neverEqualPolicy) {
                                        rememberedValue = Colors.m481copypvPzIIM$default(colors, 0L, 0L, 8191);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    Colors colors2 = (Colors) rememberedValue;
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ColorsKt.LocalColors;
                                    colors2.primary$delegate.setValue(new Color(colors.m485getPrimary0d7_KjU()));
                                    colors2.primaryVariant$delegate.setValue(new Color(((Color) colors.primaryVariant$delegate.getValue()).value));
                                    colors2.secondary$delegate.setValue(new Color(((Color) colors.secondary$delegate.getValue()).value));
                                    colors2.secondaryVariant$delegate.setValue(new Color(((Color) colors.secondaryVariant$delegate.getValue()).value));
                                    colors2.background$delegate.setValue(new Color(colors.m482getBackground0d7_KjU()));
                                    colors2.surface$delegate.setValue(new Color(colors.m486getSurface0d7_KjU()));
                                    colors2.error$delegate.setValue(new Color(colors.m483getError0d7_KjU()));
                                    colors2.onPrimary$delegate.setValue(new Color(((Color) colors.onPrimary$delegate.getValue()).value));
                                    colors2.onSecondary$delegate.setValue(new Color(((Color) colors.onSecondary$delegate.getValue()).value));
                                    colors2.onBackground$delegate.setValue(new Color(((Color) colors.onBackground$delegate.getValue()).value));
                                    colors2.onSurface$delegate.setValue(new Color(colors.m484getOnSurface0d7_KjU()));
                                    colors2.onError$delegate.setValue(new Color(((Color) colors.onError$delegate.getValue()).value));
                                    colors2.isLight$delegate.setValue(Boolean.valueOf(colors.isLight()));
                                    RippleNodeFactory m500rippleH2RKhps$default = RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 7, 0L, false);
                                    m485getPrimary0d7_KjU = colors2.m485getPrimary0d7_KjU();
                                    m482getBackground0d7_KjU = colors2.m482getBackground0d7_KjU();
                                    gapComposer.startReplaceGroup(-2060762245);
                                    m487contentColorFor4WTKRHQ = ColorsKt.m487contentColorFor4WTKRHQ(colors2, m482getBackground0d7_KjU);
                                    if (m487contentColorFor4WTKRHQ == 16) {
                                        f = 0.0f;
                                        j = m487contentColorFor4WTKRHQ;
                                    } else {
                                        f = 0.0f;
                                        j = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                                    }
                                    gapComposer.end(false);
                                    Typography typography5 = typography3;
                                    long j2 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                                    m675copywmQWz5c$default = Color.m675copywmQWz5c$default((((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight() ? ((double) ColorKt.m690luminance8_81llA(j2)) >= 0.5d : ((double) ColorKt.m690luminance8_81llA(j2)) <= 0.5d) ? 0.6f : 0.74f, j, 14);
                                    changed = gapComposer.changed(m485getPrimary0d7_KjU) | gapComposer.changed(m482getBackground0d7_KjU) | gapComposer.changed(m675copywmQWz5c$default);
                                    rememberedValue2 = gapComposer.rememberedValue();
                                    f2 = 1.0f;
                                    if (!changed || rememberedValue2 == neverEqualPolicy) {
                                        long m485getPrimary0d7_KjU2 = colors2.m485getPrimary0d7_KjU();
                                        m476calculateContrastRationb2GgbA = m476calculateContrastRationb2GgbA(0.4f, m485getPrimary0d7_KjU, m675copywmQWz5c$default, m482getBackground0d7_KjU);
                                        float m476calculateContrastRationb2GgbA2 = m476calculateContrastRationb2GgbA(0.2f, m485getPrimary0d7_KjU, m675copywmQWz5c$default, m482getBackground0d7_KjU);
                                        float f3 = 0.4f;
                                        if (m476calculateContrastRationb2GgbA < 4.5f) {
                                            i6 = 14;
                                        } else {
                                            float f4 = 0.2f;
                                            if (m476calculateContrastRationb2GgbA2 < 4.5f) {
                                                i6 = 14;
                                                f3 = 0.2f;
                                            } else {
                                                float f5 = 0.4f;
                                                for (int i9 = 0; i9 < 7; i9++) {
                                                    float m476calculateContrastRationb2GgbA3 = (m476calculateContrastRationb2GgbA(f3, m485getPrimary0d7_KjU, m675copywmQWz5c$default, m482getBackground0d7_KjU) / 4.5f) - 1.0f;
                                                    if (f <= m476calculateContrastRationb2GgbA3 && m476calculateContrastRationb2GgbA3 <= 0.01f) {
                                                        break;
                                                    }
                                                    if (m476calculateContrastRationb2GgbA3 < f) {
                                                        f5 = f3;
                                                    } else {
                                                        f4 = f3;
                                                    }
                                                    f3 = (f5 + f4) / 2.0f;
                                                }
                                                i6 = 14;
                                            }
                                        }
                                        rememberedValue2 = new TextSelectionColors(m485getPrimary0d7_KjU2, Color.m675copywmQWz5c$default(f3, m485getPrimary0d7_KjU, i6));
                                        gapComposer.updateRememberedValue(rememberedValue2);
                                    }
                                    TextSelectionColors textSelectionColors = (TextSelectionColors) rememberedValue2;
                                    staticProvidableCompositionLocal = ColorsKt.LocalColors;
                                    ProvidedValue defaultProvidedValue$runtime = staticProvidableCompositionLocal.defaultProvidedValue$runtime(colors2);
                                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentAlphaKt.LocalContentAlpha;
                                    long j3 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                                    if (((Colors) gapComposer.consume(staticProvidableCompositionLocal)).isLight() ? ColorKt.m690luminance8_81llA(j3) >= 0.5d : ColorKt.m690luminance8_81llA(j3) <= 0.5d) {
                                        f2 = 0.87f;
                                    }
                                    typography2 = typography5;
                                    composableLambdaImpl2 = composableLambdaImpl;
                                    Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Float.valueOf(f2)), IndicationKt.LocalIndication.defaultProvidedValue$runtime(m500rippleH2RKhps$default), ShapesKt.LocalShapes.defaultProvidedValue$runtime(shapes3), TextSelectionColorsKt.LocalTextSelectionColors.defaultProvidedValue$runtime(textSelectionColors), TypographyKt.LocalTypography.defaultProvidedValue$runtime(typography2)}, Expect_jvmKt.rememberComposableLambda(496803446, new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(17, typography2, composableLambdaImpl2), gapComposer), gapComposer, 56);
                                    shapes2 = shapes3;
                                } else {
                                    typography3 = typography4;
                                }
                            } else {
                                gapComposer.skipToGroupEnd();
                                typography3 = typography2;
                            }
                            shapes3 = shapes2;
                            gapComposer.endDefaults();
                            rememberedValue = gapComposer.rememberedValue();
                            neverEqualPolicy = Composer.Companion.Empty;
                            if (rememberedValue == neverEqualPolicy) {
                            }
                            Colors colors22 = (Colors) rememberedValue;
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal22 = ColorsKt.LocalColors;
                            colors22.primary$delegate.setValue(new Color(colors.m485getPrimary0d7_KjU()));
                            colors22.primaryVariant$delegate.setValue(new Color(((Color) colors.primaryVariant$delegate.getValue()).value));
                            colors22.secondary$delegate.setValue(new Color(((Color) colors.secondary$delegate.getValue()).value));
                            colors22.secondaryVariant$delegate.setValue(new Color(((Color) colors.secondaryVariant$delegate.getValue()).value));
                            colors22.background$delegate.setValue(new Color(colors.m482getBackground0d7_KjU()));
                            colors22.surface$delegate.setValue(new Color(colors.m486getSurface0d7_KjU()));
                            colors22.error$delegate.setValue(new Color(colors.m483getError0d7_KjU()));
                            colors22.onPrimary$delegate.setValue(new Color(((Color) colors.onPrimary$delegate.getValue()).value));
                            colors22.onSecondary$delegate.setValue(new Color(((Color) colors.onSecondary$delegate.getValue()).value));
                            colors22.onBackground$delegate.setValue(new Color(((Color) colors.onBackground$delegate.getValue()).value));
                            colors22.onSurface$delegate.setValue(new Color(colors.m484getOnSurface0d7_KjU()));
                            colors22.onError$delegate.setValue(new Color(((Color) colors.onError$delegate.getValue()).value));
                            colors22.isLight$delegate.setValue(Boolean.valueOf(colors.isLight()));
                            RippleNodeFactory m500rippleH2RKhps$default2 = RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 7, 0L, false);
                            m485getPrimary0d7_KjU = colors22.m485getPrimary0d7_KjU();
                            m482getBackground0d7_KjU = colors22.m482getBackground0d7_KjU();
                            gapComposer.startReplaceGroup(-2060762245);
                            m487contentColorFor4WTKRHQ = ColorsKt.m487contentColorFor4WTKRHQ(colors22, m482getBackground0d7_KjU);
                            if (m487contentColorFor4WTKRHQ == 16) {
                            }
                            gapComposer.end(false);
                            Typography typography52 = typography3;
                            long j22 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                            m675copywmQWz5c$default = Color.m675copywmQWz5c$default((((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight() ? ((double) ColorKt.m690luminance8_81llA(j22)) >= 0.5d : ((double) ColorKt.m690luminance8_81llA(j22)) <= 0.5d) ? 0.6f : 0.74f, j, 14);
                            changed = gapComposer.changed(m485getPrimary0d7_KjU) | gapComposer.changed(m482getBackground0d7_KjU) | gapComposer.changed(m675copywmQWz5c$default);
                            rememberedValue2 = gapComposer.rememberedValue();
                            f2 = 1.0f;
                            if (!changed) {
                            }
                            long m485getPrimary0d7_KjU22 = colors22.m485getPrimary0d7_KjU();
                            m476calculateContrastRationb2GgbA = m476calculateContrastRationb2GgbA(0.4f, m485getPrimary0d7_KjU, m675copywmQWz5c$default, m482getBackground0d7_KjU);
                            float m476calculateContrastRationb2GgbA22 = m476calculateContrastRationb2GgbA(0.2f, m485getPrimary0d7_KjU, m675copywmQWz5c$default, m482getBackground0d7_KjU);
                            float f32 = 0.4f;
                            if (m476calculateContrastRationb2GgbA < 4.5f) {
                            }
                            rememberedValue2 = new TextSelectionColors(m485getPrimary0d7_KjU22, Color.m675copywmQWz5c$default(f32, m485getPrimary0d7_KjU, i6));
                            gapComposer.updateRememberedValue(rememberedValue2);
                            TextSelectionColors textSelectionColors2 = (TextSelectionColors) rememberedValue2;
                            staticProvidableCompositionLocal = ColorsKt.LocalColors;
                            ProvidedValue defaultProvidedValue$runtime2 = staticProvidableCompositionLocal.defaultProvidedValue$runtime(colors22);
                            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ContentAlphaKt.LocalContentAlpha;
                            long j32 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                            if (((Colors) gapComposer.consume(staticProvidableCompositionLocal)).isLight()) {
                                f2 = 0.87f;
                                typography2 = typography52;
                                composableLambdaImpl2 = composableLambdaImpl;
                                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime2, dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Float.valueOf(f2)), IndicationKt.LocalIndication.defaultProvidedValue$runtime(m500rippleH2RKhps$default2), ShapesKt.LocalShapes.defaultProvidedValue$runtime(shapes3), TextSelectionColorsKt.LocalTextSelectionColors.defaultProvidedValue$runtime(textSelectionColors2), TypographyKt.LocalTypography.defaultProvidedValue$runtime(typography2)}, Expect_jvmKt.rememberComposableLambda(496803446, new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(17, typography2, composableLambdaImpl2), gapComposer), gapComposer, 56);
                                shapes2 = shapes3;
                            } else {
                                f2 = 0.87f;
                                typography2 = typography52;
                                composableLambdaImpl2 = composableLambdaImpl;
                                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime2, dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Float.valueOf(f2)), IndicationKt.LocalIndication.defaultProvidedValue$runtime(m500rippleH2RKhps$default2), ShapesKt.LocalShapes.defaultProvidedValue$runtime(shapes3), TextSelectionColorsKt.LocalTextSelectionColors.defaultProvidedValue$runtime(textSelectionColors2), TypographyKt.LocalTypography.defaultProvidedValue$runtime(typography2)}, Expect_jvmKt.rememberComposableLambda(496803446, new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(17, typography2, composableLambdaImpl2), gapComposer), gapComposer, 56);
                                shapes2 = shapes3;
                            }
                        } else {
                            composableLambdaImpl2 = composableLambdaImpl;
                            gapComposer.skipToGroupEnd();
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(colors, typography2, shapes2, composableLambdaImpl2, i, i2, 3);
                            return;
                        }
                        return;
                    }
                } else {
                    shapes2 = shapes;
                }
                i4 = 128;
                i5 = i8 | i4;
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
        } else {
            typography2 = typography;
        }
        i3 = 16;
        int i82 = i7 | i3;
        if ((i2 & 4) != 0) {
        }
        i4 = 128;
        i5 = i82 | i4;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0197, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r12.rememberedValue(), java.lang.Integer.valueOf(r9)) == false) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    /* renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m469ModalBottomSheetLayoutGs3lGvM(Function3 function3, final Modifier modifier, final ModalBottomSheetState modalBottomSheetState, boolean z, final Shape shape, final float f, final long j, long j2, final long j3, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Applier applier;
        int i4;
        Function3 function32;
        final long j4;
        final boolean z3;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        long j5;
        long j6;
        Applier applier2;
        int i5;
        Object obj;
        Modifier modifier2;
        int i6;
        int i7;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-336264970);
        Applier applier3 = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(modalBottomSheetState) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= gapComposer2.changed(shape) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) == 0) {
                i3 |= gapComposer2.changed(f) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if ((i & 1572864) == 0) {
                i3 |= gapComposer2.changed(j) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    applier = applier3;
                    i6 = i3;
                    if (gapComposer2.changed(j2)) {
                        i7 = 8388608;
                        i4 = i6 | i7;
                    }
                } else {
                    applier = applier3;
                    i6 = i3;
                }
                i7 = 4194304;
                i4 = i6 | i7;
            } else {
                applier = applier3;
                i4 = i3;
            }
            if ((i & 100663296) == 0) {
                i4 |= gapComposer2.changed(j3) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i4 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378)) {
                function32 = function3;
                gapComposer2.skipToGroupEnd();
                j4 = j2;
                z3 = z2;
                gapComposer = gapComposer2;
            } else {
                gapComposer2.startDefaults();
                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 128) != 0) {
                        j5 = ColorsKt.m488contentColorForek8zF_U(j, gapComposer2);
                        i4 &= -29360129;
                    } else {
                        j5 = j2;
                    }
                    j6 = j5;
                } else {
                    gapComposer2.skipToGroupEnd();
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    j6 = j2;
                }
                int i9 = i4;
                boolean z4 = z2;
                gapComposer2.endDefaults();
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj2 = Composer.Companion.Empty;
                Object obj3 = rememberedValue;
                if (rememberedValue == obj2) {
                    Object createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                    gapComposer2.updateRememberedValue(createCompositionCoroutineScope);
                    obj3 = createCompositionCoroutineScope;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                Orientation orientation = Orientation.Vertical;
                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer2);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
                ComposeUiNode.Companion.getClass();
                Function0 function0 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                if (gapComposer2.inserting) {
                    applier2 = applier;
                } else {
                    applier2 = applier;
                }
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer2, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                Modifier modifier3 = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxSize = SizeKt.fillMaxSize(modifier3, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer2);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
                if (applier2 == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer2, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                composableLambdaImpl.invoke(gapComposer2, Integer.valueOf((i9 >> 27) & 14));
                boolean changedInstance = gapComposer2.changedInstance(modalBottomSheetState) | gapComposer2.changedInstance(coroutineScope);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue2 == obj2) {
                    i5 = 0;
                    Object modalBottomSheetKt$$ExternalSyntheticLambda2 = new ModalBottomSheetKt$$ExternalSyntheticLambda2(modalBottomSheetState, coroutineScope, i5);
                    gapComposer2.updateRememberedValue(modalBottomSheetKt$$ExternalSyntheticLambda2);
                    obj = modalBottomSheetKt$$ExternalSyntheticLambda2;
                } else {
                    i5 = 0;
                    obj = rememberedValue2;
                }
                Function0 function02 = (Function0) obj;
                AnchoredDraggableState anchoredDraggableState = modalBottomSheetState.anchoredDraggableState;
                Object value = ((DerivedSnapshotState) anchoredDraggableState.targetValue$delegate).getValue();
                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                boolean z5 = i5;
                m470Scrim3JVO9M(j3, function02, value != modalBottomSheetValue ? 1 : i5, gapComposer2, (i9 >> 24) & 14);
                gapComposer2.end(true);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m292widthInVpY3zN4$default(BoxScopeInstance.INSTANCE.align(modifier3, Alignment.Companion.TopCenter), RecyclerView.DECELERATION_RATE, 640.0f, 1), 1.0f);
                if (z4) {
                    gapComposer2.startReplaceGroup(351375666);
                    boolean changed = gapComposer2.changed(anchoredDraggableState);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    Object obj4 = rememberedValue3;
                    if (changed || rememberedValue3 == obj2) {
                        Object modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
                        gapComposer2.updateRememberedValue(modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1);
                        obj4 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
                    }
                    modifier2 = NestedScrollModifierKt.nestedScroll(modifier3, (NestedScrollConnection) obj4, null);
                    gapComposer2.end(z5);
                } else {
                    gapComposer2.startReplaceGroup(1258275768);
                    gapComposer2.end(z5);
                    modifier2 = modifier3;
                }
                Modifier then = fillMaxWidth.then(modifier2).then(new DraggableAnchorsElement(anchoredDraggableState, new HintHandler$$ExternalSyntheticLambda0(modalBottomSheetState, 13)));
                AnchoredDraggableState anchoredDraggableState2 = modalBottomSheetState.anchoredDraggableState;
                Modifier draggable$default = DraggableKt.draggable$default(then, (AnchoredDraggableState$draggableState$1) anchoredDraggableState2.draggableState, orientation, (!z4 || ((ParcelableSnapshotMutableState) anchoredDraggableState2.currentValue$delegate).getValue() == modalBottomSheetValue) ? z5 ? 1 : 0 : true, null, ((ParcelableSnapshotMutableState) anchoredDraggableState2.dragTarget$delegate).getValue() != null ? true : z5 ? 1 : 0, null, new SwipeableKt$swipeable$3$4$1(anchoredDraggableState2, null, 1), z5, 32);
                if (z4) {
                    gapComposer2.startReplaceGroup(352377090);
                    boolean changedInstance2 = gapComposer2.changedInstance(modalBottomSheetState) | gapComposer2.changedInstance(coroutineScope);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    Object obj5 = rememberedValue4;
                    if (changedInstance2 || rememberedValue4 == obj2) {
                        Object navigator$$ExternalSyntheticLambda0 = new Navigator$$ExternalSyntheticLambda0(10, modalBottomSheetState, coroutineScope);
                        gapComposer2.updateRememberedValue(navigator$$ExternalSyntheticLambda0);
                        obj5 = navigator$$ExternalSyntheticLambda0;
                    }
                    modifier3 = SemanticsModifierKt.semantics(modifier3, z5, (Function1) obj5);
                    gapComposer2.end(z5);
                } else {
                    gapComposer2.startReplaceGroup(1258354200);
                    gapComposer2.end(z5);
                }
                function32 = function3;
                int i10 = i9 >> 12;
                long j7 = j6;
                m472SurfaceFjzlyU(draggable$default.then(modifier3), shape, j, j7, null, f, Expect_jvmKt.rememberComposableLambda(-1557535116, new ModalKt$$ExternalSyntheticLambda3(function32, 1), gapComposer2), gapComposer2, ((i9 >> 9) & 112) | 1572864 | (i10 & 896) | (i10 & 7168) | (i9 & 458752), 16);
                GapComposer gapComposer3 = gapComposer2;
                gapComposer3.end(true);
                j4 = j7;
                z3 = z4;
                gapComposer = gapComposer3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                final Function3 function33 = function32;
                endRestartGroup.block = new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                        CardKt.m469ModalBottomSheetLayoutGs3lGvM(Function3.this, modifier, modalBottomSheetState, z3, shape, f, j, j4, j3, composableLambdaImpl, (Composer) obj6, updateChangedFlags, i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PlatformMaterialTheme(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1677843913);
        int i2 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf(i2 & 14));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AppBarKt$$ExternalSyntheticLambda4(i, 5, composableLambdaImpl);
        }
    }

    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m470Scrim3JVO9M(final long j, final Function0 function0, final boolean z, Composer composer, final int i) {
        int i2;
        boolean z2;
        Modifier modifier;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-526532668);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (j != 16) {
            gapComposer.startReplaceGroup(-714029408);
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : RecyclerView.DECELERATION_RATE, new TweenSpec(0, (Easing) null, 7), null, null, gapComposer, 48, 28);
            String m478getString4foXLRw = m478getString4foXLRw(gapComposer, 2);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-713811509);
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z3 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(i3, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (PointerInputEventHandler) rememberedValue);
                boolean changed = (i4 == 32) | gapComposer.changed(m478getString4foXLRw);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ModalBottomSheetKt$$ExternalSyntheticLambda6(m478getString4foXLRw, function0, i3);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                z2 = true;
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                gapComposer.end(false);
            } else {
                z2 = true;
                gapComposer.startReplaceGroup(-713447786);
                gapComposer.end(false);
                modifier = companion;
            }
            Modifier then = SizeKt.fillMaxSize(companion, 1.0f).then(modifier);
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            boolean changed2 = gapComposer.changed(animateFloatAsState) | z2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ModalBottomSheetKt$$ExternalSyntheticLambda7(j, animateFloatAsState, i3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CanvasKt.Canvas(0, gapComposer, then, (Function1) rememberedValue3);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-713262530);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    CardKt.m470Scrim3JVO9M(j, function0, z, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    public static final void m471SnackbarsPrSdHI(final Modifier modifier, final Shape shape, final long j, final long j2, final long j3, final float f, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(258660814);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed((Object) null) : gapComposer.changedInstance(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i & 3072) == 0) {
            i3 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i3 |= PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= PKIFailureInfo.signerNotTrusted;
        }
        int i4 = 12582912 | i3;
        if (!gapComposer.shouldExecute(i4 & 1, (4793491 & i4) != 4793490)) {
            gapComposer.skipToGroupEnd();
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new Function2() { // from class: androidx.compose.material.SnackbarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        CardKt.m471SnackbarsPrSdHI(Modifier.this, shape, j, j2, j3, f, (Composer) obj, Updater.updateChangedFlags(i | 1));
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        gapComposer.startDefaults();
        if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
            CornerBasedShape cornerBasedShape = ((Shapes) gapComposer.consume(ShapesKt.LocalShapes)).small;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorsKt.LocalColors;
            ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(0.8f, ((Colors) gapComposer.consume(staticProvidableCompositionLocal)).m484getOnSurface0d7_KjU(), 14), ((Colors) gapComposer.consume(staticProvidableCompositionLocal)).m486getSurface0d7_KjU());
            ((Colors) gapComposer.consume(staticProvidableCompositionLocal)).m486getSurface0d7_KjU();
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors.isLight()) {
                ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(0.6f, colors.m486getSurface0d7_KjU(), 14), colors.m485getPrimary0d7_KjU());
            } else {
                long j4 = ((Color) colors.primaryVariant$delegate.getValue()).value;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        gapComposer.endDefaults();
        throw null;
    }

    public static final void SnackbarHost(SnackbarHostState snackbarHostState, Modifier modifier, Function3 function3, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Function3 function32;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1351125615);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(snackbarHostState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            function32 = function3;
        } else {
            if (snackbarHostState.currentSnackbarData$delegate.getValue() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            AndroidAccessibilityManager androidAccessibilityManager = (AndroidAccessibilityManager) gapComposer.consume(CompositionLocalsKt.LocalAccessibilityManager);
            Continuation continuation = null;
            boolean changedInstance = gapComposer.changedInstance(null) | gapComposer.changedInstance(androidAccessibilityManager);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DiskLruCache$launchCleanup$1(androidAccessibilityManager, continuation, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, (Object) null, (Function2) rememberedValue);
            if (snackbarHostState.currentSnackbarData$delegate.getValue() != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            int i4 = i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            FadeInFadeOutWithScale(companion, gapComposer, i4);
            function32 = lambda$1890101041;
            modifier2 = companion;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) snackbarHostState, modifier2, function32, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0070  */
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m472SurfaceFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        long j3;
        int i4;
        BorderStroke borderStroke2;
        int i5;
        float f2;
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        Shape shape3;
        long j4;
        BorderStroke borderStroke3;
        float f3;
        RecomposeScopeImpl endRestartGroup;
        BorderStroke borderStroke4;
        long j5;
        float f4;
        int i6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(174096871);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= gapComposer.changed(shape2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(j) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j2;
                    if (gapComposer.changed(j3)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    j3 = j2;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                j3 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                borderStroke2 = borderStroke;
                i3 |= gapComposer.changed(borderStroke2) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= gapComposer.changed(f2) ? PKIFailureInfo.unsupportedVersion : 65536;
                    if ((1572864 & i) != 0) {
                        composableLambdaImpl2 = composableLambdaImpl;
                        i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    } else {
                        composableLambdaImpl2 = composableLambdaImpl;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 599187) == 599186)) {
                        gapComposer.skipToGroupEnd();
                        modifier2 = modifier;
                        shape3 = shape2;
                        j4 = j3;
                        borderStroke3 = borderStroke2;
                        f3 = f2;
                    } else {
                        gapComposer.startDefaults();
                        if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            Modifier modifier3 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                            if (i8 != 0) {
                                shape2 = ColorKt.RectangleShape;
                            }
                            if ((i2 & 8) != 0) {
                                j3 = ColorsKt.m488contentColorForek8zF_U(j, gapComposer);
                            }
                            if (i4 != 0) {
                                borderStroke2 = null;
                            }
                            if (i5 != 0) {
                                shape3 = shape2;
                                borderStroke4 = borderStroke2;
                                j5 = j3;
                                f4 = 0.0f;
                                modifier2 = modifier3;
                                gapComposer.endDefaults();
                                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ElevationOverlayKt.LocalAbsoluteElevation;
                                float f5 = ((Dp) gapComposer.consume(dynamicProvidableCompositionLocal)).value + f4;
                                Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(j5, ContentColorKt.LocalContentColor), dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(new Dp(f5))}, Expect_jvmKt.rememberComposableLambda(-2004281689, new SurfaceKt$$ExternalSyntheticLambda3(modifier2, shape3, j, f5, borderStroke4, f4, composableLambdaImpl2), gapComposer), gapComposer, 56);
                                f3 = f4;
                                borderStroke3 = borderStroke4;
                                j4 = j5;
                            } else {
                                modifier2 = modifier3;
                            }
                        } else {
                            gapComposer.skipToGroupEnd();
                            modifier2 = modifier;
                        }
                        shape3 = shape2;
                        borderStroke4 = borderStroke2;
                        j5 = j3;
                        f4 = f2;
                        gapComposer.endDefaults();
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ElevationOverlayKt.LocalAbsoluteElevation;
                        float f52 = ((Dp) gapComposer.consume(dynamicProvidableCompositionLocal2)).value + f4;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(j5, ContentColorKt.LocalContentColor), dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(new Dp(f52))}, Expect_jvmKt.rememberComposableLambda(-2004281689, new SurfaceKt$$ExternalSyntheticLambda3(modifier2, shape3, j, f52, borderStroke4, f4, composableLambdaImpl2), gapComposer), gapComposer, 56);
                        f3 = f4;
                        borderStroke3 = borderStroke4;
                        j4 = j5;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SurfaceKt$$ExternalSyntheticLambda4(modifier2, shape3, j, j4, borderStroke3, f3, composableLambdaImpl, i, i2);
                        return;
                    }
                    return;
                }
                f2 = f;
                if ((1572864 & i) != 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 599187) == 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            borderStroke2 = borderStroke;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((1572864 & i) != 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 599187) == 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        shape2 = shape;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        borderStroke2 = borderStroke;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((1572864 & i) != 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 599187) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    public static final void m473SurfaceLPr_se0(final Function0 function0, final Modifier modifier, final boolean z, final Shape shape, final long j, final long j2, final float f, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        Function0 function02;
        int i2;
        boolean z2;
        long j3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2141308794);
        if ((i & 6) == 0) {
            function02 = function0;
            i2 = (gapComposer.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i2 |= gapComposer.changed(j3) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(j2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed((Object) null) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            i2 |= gapComposer.changed(mutableInteractionSourceImpl2) ? 67108864 : 33554432;
        } else {
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        if ((805306368 & i) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        if (gapComposer.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ElevationOverlayKt.LocalAbsoluteElevation;
            final float f2 = ((Dp) gapComposer.consume(dynamicProvidableCompositionLocal)).value + f;
            final Function0 function03 = function02;
            final boolean z3 = z2;
            final MutableInteractionSourceImpl mutableInteractionSourceImpl3 = mutableInteractionSourceImpl2;
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            final long j4 = j3;
            Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(j2, ContentColorKt.LocalContentColor), dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(new Dp(f2))}, Expect_jvmKt.rememberComposableLambda(-1766606150, new Function2() { // from class: androidx.compose.material.SurfaceKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement;
                        Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(CardKt.m479surface8ww4TTg(Modifier.this.then(MinimumInteractiveModifier.INSTANCE), shape, CardKt.m480surfaceColorAtElevationcq6XJ1M(j4, (DefaultElevationOverlay) gapComposer2.consume(ElevationOverlayKt.LocalElevationOverlay), f2, gapComposer2), null, f), mutableInteractionSourceImpl3, RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 7, 0L, false), z3, null, null, function03, 24);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                        int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer2);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m182clickableO2vRcR0$default);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer2.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer2, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                        }
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl3, gapComposer2, true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.SurfaceKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    CardKt.m473SurfaceLPr_se0(Function0.this, modifier, z, shape, j, j2, f, mutableInteractionSourceImpl, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void SwipeToDismiss(DismissState dismissState, Modifier modifier, Set set, Function1 function1, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        Modifier modifier2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-9746411);
        int i2 = i | (gapComposer.changed(dismissState) ? 4 : 2) | 3120;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ButtonKt$$ExternalSyntheticLambda2(14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function13 = (Function1) rememberedValue;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1281726977, new SwipeToDismissKt$$ExternalSyntheticLambda2(set, function13, dismissState, composableLambdaImpl, composableLambdaImpl2, 0), gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            OffsetKt.BoxWithConstraints(companion, null, false, rememberComposableLambda, gapComposer, 3078, 6);
            function12 = function13;
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            function12 = function1;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(dismissState, modifier2, set, function12, composableLambdaImpl, composableLambdaImpl2, i, 0);
        }
    }

    public static final void TextFieldLayout(Modifier modifier, Function2 function2, Function2 function22, Function3 function3, Function2 function23, Function2 function24, boolean z, float f, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Function2 function25;
        Function3 function32;
        BiasAlignment biasAlignment;
        LayoutDirection layoutDirection;
        boolean z2;
        boolean z3;
        BiasAlignment biasAlignment2;
        boolean z4;
        Function2 function26 = function2;
        PaddingValues paddingValues2 = paddingValues;
        BiasAlignment biasAlignment3 = Alignment.Companion.TopStart;
        BiasAlignment biasAlignment4 = Alignment.Companion.Center;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1595074580);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function26) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function23) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function24) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer.changed(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= gapComposer.changed(paddingValues2) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean z5 = ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection2 = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            int i3 = i2;
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, textFieldMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            MinimumInteractiveModifier minimumInteractiveModifier = MinimumInteractiveModifier.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (function23 != null) {
                gapComposer.startReplaceGroup(-1444611617);
                Modifier layoutId = RulerKt.layoutId(companion, "Leading");
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement;
                Modifier then = layoutId.then(minimumInteractiveModifier);
                biasAlignment = biasAlignment3;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, false);
                int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
                gapComposer.startReusableNode();
                layoutDirection = layoutDirection2;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z2 = false;
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 12) & 14, function23, gapComposer, true, false);
            } else {
                biasAlignment = biasAlignment3;
                layoutDirection = layoutDirection2;
                z2 = false;
                gapComposer.startReplaceGroup(-1444365601);
                gapComposer.end(false);
            }
            if (function24 != null) {
                gapComposer.startReplaceGroup(-1444322883);
                Modifier layoutId2 = RulerKt.layoutId(companion, "Trailing");
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement;
                Modifier then2 = layoutId2.then(minimumInteractiveModifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, z2);
                int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, then2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 15) & 14, function24, gapComposer, true, false);
            } else {
                gapComposer.startReplaceGroup(-1444074945);
                gapComposer.end(z2);
            }
            paddingValues2 = paddingValues;
            LayoutDirection layoutDirection3 = layoutDirection;
            float calculateStartPadding = SpacerKt.calculateStartPadding(paddingValues2, layoutDirection3);
            float calculateEndPadding = SpacerKt.calculateEndPadding(paddingValues2, layoutDirection3);
            if (function23 != null) {
                calculateStartPadding -= 12.0f;
                if (calculateStartPadding < RecyclerView.DECELERATION_RATE) {
                    calculateStartPadding = 0.0f;
                }
            }
            float f2 = calculateStartPadding;
            if (function24 != null) {
                calculateEndPadding -= 12.0f;
                if (calculateEndPadding < RecyclerView.DECELERATION_RATE) {
                    calculateEndPadding = 0.0f;
                }
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, f2, RecyclerView.DECELERATION_RATE, calculateEndPadding, RecyclerView.DECELERATION_RATE, 10);
            if (function3 != null) {
                gapComposer.startReplaceGroup(-1443222972);
                function32 = function3;
                function32.invoke(RulerKt.layoutId(companion, "Hint").then(m302paddingqDBjuR0$default), gapComposer, Integer.valueOf((i3 >> 6) & 112));
                z3 = false;
                gapComposer.end(false);
            } else {
                function32 = function3;
                z3 = false;
                gapComposer.startReplaceGroup(-1443135521);
                gapComposer.end(false);
            }
            if (function22 != null) {
                gapComposer.startReplaceGroup(-1443101018);
                Modifier then3 = RulerKt.layoutId(companion, "Label").then(m302paddingqDBjuR0$default);
                biasAlignment2 = biasAlignment;
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, z3);
                int currentCompositeKeyHash4 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, then3);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash4, gapComposer, currentCompositeKeyHash4, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                function25 = function22;
                z4 = true;
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 6) & 14, function25, gapComposer, true, false);
            } else {
                function25 = function22;
                biasAlignment2 = biasAlignment;
                z4 = true;
                gapComposer.startReplaceGroup(-1443015489);
                gapComposer.end(z3);
            }
            Modifier then4 = RulerKt.layoutId(companion, "TextField").then(m302paddingqDBjuR0$default);
            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, z4);
            int currentCompositeKeyHash5 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, then4);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash5, gapComposer, currentCompositeKeyHash5, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$14);
            function26 = function2;
            Recorder$$ExternalSyntheticOutline2.m((i3 >> 3) & 14, function26, gapComposer, true, true);
        } else {
            function25 = function22;
            function32 = function3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldKt$$ExternalSyntheticLambda1(modifier, function26, function25, function32, function23, function24, z, f, paddingValues2, i);
        }
    }

    /* renamed from: access$animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final MutableState m474access$animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        State state;
        MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, composer, (i >> 6) & 14);
        State indicatorColor = textFieldColors.indicatorColor(z, z2, mutableInteractionSourceImpl, composer, i & 8190);
        float f3 = ((Boolean) collectIsFocusedAsState.getValue()).booleanValue() ? f : f2;
        if (z) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1361082574);
            state = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(f3, AnimatableKt.tween$default(150, 0, null, 6), null, null, gapComposer, 48, 12);
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(1361186796);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Dp(f2), gapComposer2);
            gapComposer2.end(false);
            state = rememberUpdatedState;
        }
        return Updater.rememberUpdatedState(new BorderStroke(((Dp) state.getValue()).value, new SolidColor(((Color) indicatorColor.getValue()).value)), composer);
    }

    /* renamed from: access$calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m475access$calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2 = 2.0f * f;
        float mo267calculateTopPaddingD9Ej5fM = paddingValues.mo267calculateTopPaddingD9Ej5fM() * f;
        float mo264calculateBottomPaddingD9Ej5fM = paddingValues.mo264calculateBottomPaddingD9Ej5fM() * f;
        int max = Math.max(i, i5);
        return ConstraintsKt.m1032constrainHeightK40F9xA(Math.max(MathKt__MathJVMKt.roundToInt(z ? i2 + f2 + max + mo264calculateBottomPaddingD9Ej5fM : mo267calculateTopPaddingD9Ej5fM + max + mo264calculateBottomPaddingD9Ej5fM), Math.max(i3, i4)), j);
    }

    public static final Float access$getOffset(Map map, Object obj) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$restartable(Function0 function0, Function2 function2, ContinuationImpl continuationImpl) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        int i;
        if (continuationImpl instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuationImpl;
            int i2 = anchoredDraggableKt$restartable$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                anchoredDraggableKt$restartable$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = anchoredDraggableKt$restartable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredDraggableKt$restartable$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(function0, function2, continuation, 0);
                    anchoredDraggableKt$restartable$1.label = 1;
                    if (JobKt.coroutineScope(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
        Object obj2 = anchoredDraggableKt$restartable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableKt$restartable$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public static final Object animateTo(AnchoredDraggableState anchoredDraggableState, Object obj, float f, ContinuationImpl continuationImpl) {
        Object anchoredDrag = anchoredDraggableState.anchoredDrag(obj, MutatePriority.Default, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f, null), continuationImpl);
        return anchoredDrag == CoroutineSingletons.COROUTINE_SUSPENDED ? anchoredDrag : Unit.INSTANCE;
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    public static final float m476calculateContrastRationb2GgbA(float f, long j, long j2, long j3) {
        long m684compositeOverOWjLjI = ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(f, j, 14), j3);
        float m690luminance8_81llA = ColorKt.m690luminance8_81llA(ColorKt.m684compositeOverOWjLjI(j2, m684compositeOverOWjLjI)) + 0.05f;
        float m690luminance8_81llA2 = ColorKt.m690luminance8_81llA(m684compositeOverOWjLjI) + 0.05f;
        return Math.max(m690luminance8_81llA, m690luminance8_81llA2) / Math.min(m690luminance8_81llA, m690luminance8_81llA2);
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public static DefaultSliderColors m477colorsq0g_0yA(long j, long j2, long j3, Composer composer, int i, int i2) {
        long m485getPrimary0d7_KjU = (i2 & 1) != 0 ? ((Colors) ((GapComposer) composer).consume(ColorsKt.LocalColors)).m485getPrimary0d7_KjU() : j;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorsKt.LocalColors;
        GapComposer gapComposer = (GapComposer) composer;
        long m484getOnSurface0d7_KjU = ((Colors) gapComposer.consume(staticProvidableCompositionLocal)).m484getOnSurface0d7_KjU();
        long j4 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
        if (((Colors) gapComposer.consume(staticProvidableCompositionLocal)).isLight()) {
            ColorKt.m690luminance8_81llA(j4);
        } else {
            ColorKt.m690luminance8_81llA(j4);
        }
        long m684compositeOverOWjLjI = ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(0.38f, m484getOnSurface0d7_KjU, 14), ((Colors) gapComposer.consume(staticProvidableCompositionLocal)).m486getSurface0d7_KjU());
        long m485getPrimary0d7_KjU2 = (i2 & 4) != 0 ? ((Colors) ((GapComposer) composer).consume(staticProvidableCompositionLocal)).m485getPrimary0d7_KjU() : j2;
        long m675copywmQWz5c$default = (i2 & 8) != 0 ? Color.m675copywmQWz5c$default(0.24f, m485getPrimary0d7_KjU2, 14) : j3;
        long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(0.32f, ((Colors) ((GapComposer) composer).consume(staticProvidableCompositionLocal)).m484getOnSurface0d7_KjU(), 14);
        long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(0.12f, m675copywmQWz5c$default2, 14);
        long j5 = m485getPrimary0d7_KjU;
        long m675copywmQWz5c$default4 = Color.m675copywmQWz5c$default(0.54f, ColorsKt.m488contentColorForek8zF_U(m485getPrimary0d7_KjU2, composer), 14);
        return new DefaultSliderColors(j5, m684compositeOverOWjLjI, m485getPrimary0d7_KjU2, m675copywmQWz5c$default, m675copywmQWz5c$default2, m675copywmQWz5c$default3, m675copywmQWz5c$default4, Color.m675copywmQWz5c$default(0.54f, m485getPrimary0d7_KjU2, 14), Color.m675copywmQWz5c$default(0.12f, m675copywmQWz5c$default4, 14), Color.m675copywmQWz5c$default(0.12f, m675copywmQWz5c$default3, 14));
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m478getString4foXLRw(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration);
        Resources resources = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getResources();
        return i == 0 ? resources.getString(R.string.navigation_menu) : i == 1 ? resources.getString(R.string.close_drawer) : i == 2 ? resources.getString(R.string.close_sheet) : i == 3 ? resources.getString(R.string.default_error_message) : i == 4 ? resources.getString(R.string.dropdown_menu) : i == 5 ? resources.getString(R.string.range_start) : i == 6 ? resources.getString(R.string.range_end) : i == 7 ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
    }

    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, TweenSpec tweenSpec, Function1 function1, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            tweenSpec = ModalBottomSheetDefaults.AnimationSpec;
        }
        TweenSpec tweenSpec2 = tweenSpec;
        int i3 = i2 & 4;
        int i4 = 8;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (i3 != 0) {
            GapComposer gapComposer = (GapComposer) composer;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new ButtonKt$$ExternalSyntheticLambda2(i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
        }
        Function1 function12 = function1;
        boolean z = true;
        boolean z2 = (i2 & 8) == 0;
        GapComposer gapComposer2 = (GapComposer) composer;
        Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
        gapComposer2.startMovableGroup(-1222944377, modalBottomSheetValue);
        Object[] objArr = {modalBottomSheetValue, tweenSpec2, Boolean.valueOf(z2), function12, density};
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(i4, new SnackbarHostKt$$ExternalSyntheticLambda2(16), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(density, function12, tweenSpec2, z2, 4));
        boolean changed = ((((i & 14) ^ 6) > 4 && gapComposer2.changed(modalBottomSheetValue.ordinal())) || (i & 6) == 4) | gapComposer2.changed(density) | ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer2.changed(function12)) || (i & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer2.changedInstance(tweenSpec2);
        if ((((i & 7168) ^ 3072) <= 2048 || !gapComposer2.changed(z2)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z3 = z | changed;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (z3 || rememberedValue2 == neverEqualPolicy) {
            ModalBottomSheetKt$$ExternalSyntheticLambda1 modalBottomSheetKt$$ExternalSyntheticLambda1 = new ModalBottomSheetKt$$ExternalSyntheticLambda1(modalBottomSheetValue, density, function12, tweenSpec2, z2);
            gapComposer2.updateRememberedValue(modalBottomSheetKt$$ExternalSyntheticLambda1);
            rememberedValue2 = modalBottomSheetKt$$ExternalSyntheticLambda1;
        }
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue2, (Composer) gapComposer2, 0);
        gapComposer2.end(false);
        return modalBottomSheetState;
    }

    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m479surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Modifier m591shadows4CzXII$default = ShadowKt.m591shadows4CzXII$default(modifier, f, shape, false, 24);
        Modifier modifier2 = Modifier.Companion.$$INSTANCE;
        if (borderStroke != null) {
            modifier2 = ImageKt.m179borderziNgDLE(modifier2, borderStroke.width, borderStroke.brush, shape);
        }
        return ClipKt.clip(ImageKt.m177backgroundbw27NRU(m591shadows4CzXII$default.then(modifier2), j, shape), shape);
    }

    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m480surfaceColorAtElevationcq6XJ1M(long j, DefaultElevationOverlay defaultElevationOverlay, float f, GapComposer gapComposer) {
        if (!Color.m676equalsimpl0(j, ((Colors) gapComposer.consume(ColorsKt.LocalColors)).m486getSurface0d7_KjU()) || defaultElevationOverlay == null) {
            gapComposer.startReplaceGroup(-1124546347);
            gapComposer.end(false);
            return j;
        }
        gapComposer.startReplaceGroup(-1124614454);
        long m490apply7g2Lkgo = DefaultElevationOverlay.m490apply7g2Lkgo(j, f, gapComposer, 0);
        gapComposer.end(false);
        return m490apply7g2Lkgo;
    }
}
