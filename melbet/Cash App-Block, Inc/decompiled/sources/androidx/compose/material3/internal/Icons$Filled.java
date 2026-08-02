package androidx.compose.material3.internal;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.animation.CrossfadeKt$Crossfade$3$1;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldLabelPosition$Attached;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.material3.Typography;
import androidx.compose.material3.TypographyKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.os.BundleKt;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.compose.HostFocusDirectorKt$depthFirst$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.ConvertFromMetadataKt$$Lambda$2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class Icons$Filled {
    public static final StackTraceElement[] EmptyStackTraceElements = new StackTraceElement[0];
    public static ImageVector _arrowDropDown;
    public static ImageVector _dateRange;
    public static ImageVector _edit;
    public static ImageVector _keyboardArrowLeft;
    public static ImageVector _keyboardArrowRight;

    public static final void BasicTooltipBox(PopupPositionProvider popupPositionProvider, ComposableLambdaImpl composableLambdaImpl, TooltipStateImpl tooltipStateImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        PopupPositionProvider popupPositionProvider2;
        int i2;
        MutableState mutableState;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1221877520);
        if ((i & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i2 = (gapComposer.changed(popupPositionProvider2) ? 4 : 2) | i;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(tooltipStateImpl) : gapComposer.changedInstance(tooltipStateImpl) ? 256 : 128;
        }
        int i3 = i & 3072;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 |= gapComposer.changed(companion) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(null) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i2 |= gapComposer.changed(false) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(true) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (38347923 & i4) != 38347922)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            if (tooltipStateImpl.isVisible()) {
                gapComposer.startReplaceGroup(-1891243071);
                mutableState = mutableState2;
                TooltipPopup(popupPositionProvider2, tooltipStateImpl, coroutineScope, false, mutableState, composableLambdaImpl, gapComposer, (i4 & 14) | 196608 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896) | ((i4 << 15) & 3670016));
                z = false;
                gapComposer.end(false);
            } else {
                mutableState = mutableState2;
                z = false;
                gapComposer.startReplaceGroup(-1890863476);
                gapComposer.end(false);
            }
            WrappedAnchor(tooltipStateImpl, mutableState, composableLambdaImpl2, gapComposer, ((i4 >> 18) & 14) | MLKEMEngine.KyberPolyBytes | ((i4 >> 3) & 112) | ((i4 >> 12) & 7168) | (57344 & (i4 << 3)) | ((i4 >> 9) & 458752));
            gapComposer.end(true);
            boolean z2 = ((i4 & 896) == 256 || ((i4 & 512) != 0 && gapComposer.changedInstance(tooltipStateImpl))) ? true : z;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CachedPageEventFlow$$ExternalSyntheticLambda0(tooltipStateImpl, 6);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.DisposableEffect(tooltipStateImpl, (Function1) rememberedValue3, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(popupPositionProvider, composableLambdaImpl, tooltipStateImpl, composableLambdaImpl2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x03b5, code lost:
    
        if (r5 != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0329, code lost:
    
        if (r5 != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x02f9, code lost:
    
        if (r5 != false) goto L206;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x02ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(CharSequence charSequence, Function2 function2, TextFieldLabelPosition$Attached textFieldLabelPosition$Attached, final Function3 function3, final Function2 function22, Function2 function23, boolean z, boolean z2, boolean z3, MutableInteractionSourceImpl mutableInteractionSourceImpl, PaddingValues paddingValues, TextFieldColors textFieldColors, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        int i4;
        GapComposer gapComposer;
        int i5;
        boolean z4;
        float f;
        int ordinal;
        float f2;
        SpringSpec value;
        SpringSpec value2;
        int ordinal2;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        float f3;
        int ordinal3;
        float f4;
        int ordinal4;
        float f5;
        int ordinal5;
        int[] iArr;
        boolean changed;
        Object rememberedValue;
        Object obj;
        int i6;
        InputPhase inputPhase;
        boolean z5;
        long j;
        boolean changed2;
        int i7;
        Object twoWayConverterImpl;
        Object rememberedValue2;
        int i8;
        final TextStyle textStyle;
        int i9;
        ComposableLambdaImpl composableLambdaImpl2;
        ComposableLambdaImpl composableLambdaImpl3;
        Object rememberedValue3;
        ComposableLambdaImpl composableLambdaImpl4;
        Object rememberedValue4;
        int i10;
        ComposableLambdaImpl composableLambdaImpl5;
        Object rememberedValue5;
        int i11;
        Object rememberedValue6;
        CrossfadeKt$Crossfade$3$1 crossfadeKt$Crossfade$3$1 = CrossfadeKt$Crossfade$3$1.INSTANCE$9;
        TextFieldType[] textFieldTypeArr = TextFieldType.$VALUES;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(546805032);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(charSequence) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function2) ? 256 : 128;
        }
        int i12 = i3;
        if ((i & 3072) == 0) {
            i12 |= gapComposer2.changed(textFieldLabelPosition$Attached) ? 2048 : 1024;
        }
        int i13 = i & 24576;
        int i14 = PKIFailureInfo.certRevoked;
        if (i13 == 0) {
            i12 |= gapComposer2.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i12 |= gapComposer2.changedInstance(function22) ? 131072 : 65536;
        }
        int i15 = i & 1572864;
        int i16 = PKIFailureInfo.signerNotTrusted;
        if (i15 == 0) {
            i12 |= gapComposer2.changedInstance(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i12 |= gapComposer2.changedInstance(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i12 |= gapComposer2.changedInstance(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i12 |= gapComposer2.changedInstance(null) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i17 = i12;
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changedInstance(function23) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changed(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (gapComposer2.changed(mutableInteractionSourceImpl)) {
                i14 = 16384;
            }
            i4 |= i14;
        }
        if ((i2 & 196608) == 0) {
            i4 |= gapComposer2.changed(paddingValues) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            if (gapComposer2.changed(textFieldColors)) {
                i16 = 1048576;
            }
            i4 |= i16;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= gapComposer2.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        int i18 = i4;
        if (gapComposer2.shouldExecute(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 4793491) == 4793490) ? false : true)) {
            boolean booleanValue = ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer2, (i18 >> 12) & 14).getValue()).booleanValue();
            InputPhase inputPhase2 = booleanValue ? InputPhase.Focused : charSequence.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            long j2 = !z2 ? textFieldColors.disabledLabelColor : z3 ? textFieldColors.errorLabelColor : booleanValue ? textFieldColors.focusedLabelColor : textFieldColors.unfocusedLabelColor;
            Typography typography = (Typography) gapComposer2.consume(TypographyKt.LocalTypography);
            TextStyle textStyle2 = typography.bodyLarge;
            final TextStyle textStyle3 = typography.bodySmall;
            long m996getColor0d7_KjU = textStyle2.m996getColor0d7_KjU();
            int i19 = Color.$r8$clinit;
            long j3 = Color.Unspecified;
            if ((!Color.m676equalsimpl0(m996getColor0d7_KjU, j3) || Color.m676equalsimpl0(textStyle3.m996getColor0d7_KjU(), j3)) && (Color.m676equalsimpl0(textStyle2.m996getColor0d7_KjU(), j3) || !Color.m676equalsimpl0(textStyle3.m996getColor0d7_KjU(), j3))) {
                i5 = i17;
                z4 = false;
            } else {
                i5 = i17;
                z4 = true;
            }
            long m996getColor0d7_KjU2 = textStyle3.m996getColor0d7_KjU();
            if (z4 && m996getColor0d7_KjU2 == 16) {
                m996getColor0d7_KjU2 = j2;
            }
            long m996getColor0d7_KjU3 = textStyle2.m996getColor0d7_KjU();
            long j4 = (z4 && m996getColor0d7_KjU3 == 16) ? j2 : m996getColor0d7_KjU3;
            boolean z6 = function3 != null;
            int i20 = i5;
            long j5 = m996getColor0d7_KjU2;
            Transition updateTransition = AnimatableKt.updateTransition(inputPhase2, "TextFieldInputState", gapComposer2, 48, 0);
            InteractionResult interactionResult = updateTransition.transitionState;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = updateTransition.targetState$delegate;
            SpringSpec value3 = MenuKt.value(MotionSchemeKeyTokens.FastSpatial, gapComposer2);
            TwoWayConverterImpl twoWayConverterImpl2 = AnimatableKt.FloatToVector;
            InputPhase inputPhase3 = (InputPhase) interactionResult.getCurrentState();
            gapComposer2.startReplaceGroup(-1436405362);
            int ordinal6 = inputPhase3.ordinal();
            float f6 = RecyclerView.DECELERATION_RATE;
            if (ordinal6 != 0) {
                if (ordinal6 != 1) {
                    if (ordinal6 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                } else if (z6) {
                    f = 0.0f;
                    gapComposer2.end(false);
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase4 = (InputPhase) parcelableSnapshotMutableState2.getValue();
                    gapComposer2.startReplaceGroup(-1436405362);
                    ordinal = inputPhase4.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                        } else if (z6) {
                            f2 = 0.0f;
                            gapComposer2.end(false);
                            Float valueOf2 = Float.valueOf(f2);
                            updateTransition.getSegment();
                            gapComposer2.startReplaceGroup(-709912974);
                            gapComposer2.end(false);
                            final Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, value3, twoWayConverterImpl2, gapComposer2, 196608);
                            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastEffects;
                            value = MenuKt.value(motionSchemeKeyTokens, gapComposer2);
                            value2 = MenuKt.value(MotionSchemeKeyTokens.SlowEffects, gapComposer2);
                            InputPhase inputPhase5 = (InputPhase) interactionResult.getCurrentState();
                            gapComposer2.startReplaceGroup(-1093194547);
                            ordinal2 = inputPhase5.ordinal();
                            if (ordinal2 != 0) {
                                parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                gapComposer2.end(false);
                                Float valueOf3 = Float.valueOf(f3);
                                InputPhase inputPhase6 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                gapComposer2.startReplaceGroup(-1093194547);
                                ordinal3 = inputPhase6.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return;
                                        }
                                    }
                                    f4 = 0.0f;
                                    gapComposer2.end(false);
                                    Float valueOf4 = Float.valueOf(f4);
                                    Transition.Segment segment = updateTransition.getSegment();
                                    gapComposer2.startReplaceGroup(-984009111);
                                    InputPhase inputPhase7 = InputPhase.Focused;
                                    InputPhase inputPhase8 = InputPhase.UnfocusedEmpty;
                                    SpringSpec springSpec = (!segment.isTransitioningTo(inputPhase7, inputPhase8) && (segment.isTransitioningTo(inputPhase8, inputPhase7) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase8))) ? value2 : value;
                                    gapComposer2.end(false);
                                    final Transition.TransitionAnimationState createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, springSpec, twoWayConverterImpl2, gapComposer2, 196608);
                                    InputPhase inputPhase9 = (InputPhase) interactionResult.getCurrentState();
                                    gapComposer2.startReplaceGroup(-1258455321);
                                    ordinal4 = inputPhase9.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return;
                                            }
                                        } else if (z6) {
                                            f5 = 0.0f;
                                            gapComposer2.end(false);
                                            Float valueOf5 = Float.valueOf(f5);
                                            InputPhase inputPhase10 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                            gapComposer2.startReplaceGroup(-1258455321);
                                            ordinal5 = inputPhase10.ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return;
                                                    }
                                                }
                                            }
                                            f6 = 1.0f;
                                            gapComposer2.end(false);
                                            Float valueOf6 = Float.valueOf(f6);
                                            updateTransition.getSegment();
                                            gapComposer2.startReplaceGroup(2126293195);
                                            gapComposer2.end(false);
                                            Transition.TransitionAnimationState createTransitionAnimation3 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf5, valueOf6, value, twoWayConverterImpl2, gapComposer2, 196608);
                                            SpringSpec value4 = MenuKt.value(motionSchemeKeyTokens, gapComposer2);
                                            InputPhase inputPhase11 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                            gapComposer2.startReplaceGroup(-12973394);
                                            iArr = TextFieldImplKt$WhenMappings.$EnumSwitchMapping$1;
                                            long j6 = iArr[inputPhase11.ordinal()] == 1 ? j5 : j4;
                                            gapComposer2.end(false);
                                            Object m679getColorSpaceimpl = Color.m679getColorSpaceimpl(j6);
                                            changed = gapComposer2.changed(m679getColorSpaceimpl);
                                            rememberedValue = gapComposer2.rememberedValue();
                                            obj = Composer.Companion.Empty;
                                            if (!changed || rememberedValue == obj) {
                                                i6 = 1;
                                                Object twoWayConverterImpl3 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl, i6));
                                                gapComposer2.updateRememberedValue(twoWayConverterImpl3);
                                                rememberedValue = twoWayConverterImpl3;
                                            } else {
                                                i6 = 1;
                                            }
                                            TwoWayConverterImpl twoWayConverterImpl4 = (TwoWayConverterImpl) rememberedValue;
                                            inputPhase = (InputPhase) interactionResult.getCurrentState();
                                            gapComposer2.startReplaceGroup(-12973394);
                                            if (iArr[inputPhase.ordinal()] == i6) {
                                                z5 = z4;
                                                j = j5;
                                            } else {
                                                z5 = z4;
                                                j = j4;
                                            }
                                            Color m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, j);
                                            InputPhase inputPhase12 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                            gapComposer2.startReplaceGroup(-12973394);
                                            long j7 = iArr[inputPhase12.ordinal()] == 1 ? j5 : j4;
                                            gapComposer2.end(false);
                                            Color color = new Color(j7);
                                            updateTransition.getSegment();
                                            gapComposer2.startReplaceGroup(1954111929);
                                            gapComposer2.end(false);
                                            final Transition.TransitionAnimationState createTransitionAnimation4 = AnimatableKt.createTransitionAnimation(updateTransition, m, color, value4, twoWayConverterImpl4, gapComposer2, 196608);
                                            gapComposer2.startReplaceGroup(-464752477);
                                            gapComposer2.end(false);
                                            Object m679getColorSpaceimpl2 = Color.m679getColorSpaceimpl(j2);
                                            changed2 = gapComposer2.changed(m679getColorSpaceimpl2);
                                            Object rememberedValue7 = gapComposer2.rememberedValue();
                                            if (!changed2 || rememberedValue7 == obj) {
                                                i7 = 1;
                                                twoWayConverterImpl = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl2, i7));
                                                gapComposer2.updateRememberedValue(twoWayConverterImpl);
                                            } else {
                                                twoWayConverterImpl = rememberedValue7;
                                                i7 = 1;
                                            }
                                            TwoWayConverterImpl twoWayConverterImpl5 = (TwoWayConverterImpl) twoWayConverterImpl;
                                            gapComposer2.startReplaceGroup(-464752477);
                                            gapComposer2.end(false);
                                            Color color2 = new Color(j2);
                                            gapComposer2.startReplaceGroup(-464752477);
                                            gapComposer2.end(false);
                                            Color color3 = new Color(j2);
                                            updateTransition.getSegment();
                                            gapComposer2.startReplaceGroup(1190923886);
                                            gapComposer2.end(false);
                                            final Transition.TransitionAnimationState createTransitionAnimation5 = AnimatableKt.createTransitionAnimation(updateTransition, color2, color3, value4, twoWayConverterImpl5, gapComposer2, 196608);
                                            rememberedValue2 = gapComposer2.rememberedValue();
                                            if (rememberedValue2 == obj) {
                                                rememberedValue2 = new TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1();
                                                gapComposer2.updateRememberedValue(rememberedValue2);
                                            }
                                            final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue2;
                                            if (function3 == null) {
                                                gapComposer2.startReplaceGroup(-1891724857);
                                                gapComposer2.end(false);
                                                i8 = i7;
                                                textStyle = textStyle2;
                                                composableLambdaImpl2 = null;
                                                i9 = 4;
                                                composableLambdaImpl3 = null;
                                            } else {
                                                gapComposer2.startReplaceGroup(-1891724856);
                                                i8 = i7;
                                                textStyle = textStyle2;
                                                i9 = 4;
                                                final boolean z7 = z5;
                                                composableLambdaImpl2 = null;
                                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1076580032, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj2, Object obj3) {
                                                        Composer composer2 = (Composer) obj2;
                                                        int intValue = ((Number) obj3).intValue();
                                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                            TextStyle lerp = BundleKt.lerp(TextStyle.this, textStyle3, ((Number) createTransitionAnimation.getValue()).floatValue());
                                                            if (z7) {
                                                                lerp = TextStyle.m994copyp1EtxEg$default(lerp, ((Color) createTransitionAnimation4.getValue()).value, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                                                            }
                                                            Icons$Filled.m566Decoration3JVO9M(((Color) createTransitionAnimation5.getValue()).value, lerp, Expect_jvmKt.rememberComposableLambda(1157484991, new ButtonKt$Button$2.AnonymousClass1(7, function3, textFieldImplKt$CommonDecorationBox$3$labelScope$1$1), gapComposer3), gapComposer3, MLKEMEngine.KyberPolyBytes);
                                                        } else {
                                                            gapComposer3.skipToGroupEnd();
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }, gapComposer2);
                                                gapComposer2.end(false);
                                                composableLambdaImpl3 = rememberComposableLambda;
                                            }
                                            final long j8 = !z2 ? textFieldColors.disabledPlaceholderColor : z3 ? textFieldColors.errorPlaceholderColor : booleanValue ? textFieldColors.focusedPlaceholderColor : textFieldColors.unfocusedPlaceholderColor;
                                            rememberedValue3 = gapComposer2.rememberedValue();
                                            int i21 = 3;
                                            if (rememberedValue3 == obj) {
                                                rememberedValue3 = Updater.derivedStateOf(NeverEqualPolicy.INSTANCE$3, new NavHostKt$$ExternalSyntheticLambda8(createTransitionAnimation2, i21));
                                                gapComposer2.updateRememberedValue(rememberedValue3);
                                            }
                                            State state = (State) rememberedValue3;
                                            if (function22 == null && charSequence.length() == 0 && ((Boolean) state.getValue()).booleanValue()) {
                                                gapComposer2.startReplaceGroup(-1890614312);
                                                final TextStyle textStyle4 = textStyle;
                                                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1405547205, new Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        Modifier modifier = (Modifier) obj2;
                                                        Composer composer2 = (Composer) obj3;
                                                        int intValue = ((Number) obj4).intValue();
                                                        if ((intValue & 6) == 0) {
                                                            intValue |= ((GapComposer) composer2).changed(modifier) ? 4 : 2;
                                                        }
                                                        int i22 = 1;
                                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                                            State state2 = createTransitionAnimation2;
                                                            boolean changed3 = gapComposer3.changed(state2);
                                                            Object rememberedValue8 = gapComposer3.rememberedValue();
                                                            if (changed3 || rememberedValue8 == Composer.Companion.Empty) {
                                                                rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda10(state2, i22);
                                                                gapComposer3.updateRememberedValue(rememberedValue8);
                                                            }
                                                            Modifier graphicsLayer = ColorKt.graphicsLayer(modifier, (Function1) rememberedValue8);
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                                            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer3);
                                                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                                                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, graphicsLayer);
                                                            ComposeUiNode.Companion.getClass();
                                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                                            if (gapComposer3.applier == null) {
                                                                Updater.invalidApplier();
                                                                throw null;
                                                            }
                                                            gapComposer3.startReusableNode();
                                                            if (gapComposer3.inserting) {
                                                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                                                            } else {
                                                                gapComposer3.useNode();
                                                            }
                                                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                                            if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer3, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                                                            }
                                                            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                                            Icons$Filled.m566Decoration3JVO9M(j8, textStyle4, function22, gapComposer3, 0);
                                                            gapComposer3.end(true);
                                                        } else {
                                                            gapComposer3.skipToGroupEnd();
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }, gapComposer2);
                                                gapComposer2.end(false);
                                                composableLambdaImpl4 = rememberComposableLambda2;
                                            } else {
                                                gapComposer2.startReplaceGroup(-1890217110);
                                                gapComposer2.end(false);
                                                composableLambdaImpl4 = composableLambdaImpl2;
                                            }
                                            rememberedValue4 = gapComposer2.rememberedValue();
                                            if (rememberedValue4 == obj) {
                                                rememberedValue4 = Updater.derivedStateOf(NeverEqualPolicy.INSTANCE$3, new NavHostKt$$ExternalSyntheticLambda8(createTransitionAnimation3, i9));
                                                gapComposer2.updateRememberedValue(rememberedValue4);
                                            }
                                            gapComposer2.startReplaceGroup(-1889500886);
                                            gapComposer2.end(false);
                                            gapComposer2.startReplaceGroup(-1888924534);
                                            gapComposer2.end(false);
                                            gapComposer2.startReplaceGroup(-1888749663);
                                            gapComposer2.end(false);
                                            gapComposer2.startReplaceGroup(-1888469888);
                                            gapComposer2.end(false);
                                            long j9 = !z2 ? textFieldColors.disabledSupportingTextColor : z3 ? textFieldColors.errorSupportingTextColor : booleanValue ? textFieldColors.focusedSupportingTextColor : textFieldColors.unfocusedSupportingTextColor;
                                            if (function23 == null) {
                                                gapComposer2.startReplaceGroup(-1888176380);
                                                i10 = 0;
                                                gapComposer2.end(false);
                                                composableLambdaImpl5 = composableLambdaImpl2;
                                            } else {
                                                i10 = 0;
                                                gapComposer2.startReplaceGroup(-1888176379);
                                                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(837168720, new ButtonKt$Button$2(j9, textStyle3, function23, 1), gapComposer2);
                                                gapComposer2.end(false);
                                                composableLambdaImpl5 = rememberComposableLambda3;
                                            }
                                            gapComposer2.startReplaceGroup(-1886778186);
                                            rememberedValue5 = gapComposer2.rememberedValue();
                                            if (rememberedValue5 == obj) {
                                                rememberedValue5 = Updater.mutableStateOf$default(new Size(0L));
                                                gapComposer2.updateRememberedValue(rememberedValue5);
                                            }
                                            MutableState mutableState = (MutableState) rememberedValue5;
                                            ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(528115858, new ConvertFromMetadataKt$$Lambda$2(mutableState, textFieldLabelPosition$Attached, paddingValues, composableLambdaImpl, 1), gapComposer2);
                                            TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new LockFreeLinkedListNode$toString$1(0, 5, State.class, createTransitionAnimation, "value", "getValue()Ljava/lang/Object;"));
                                            if ((i20 & 7168) != 2048) {
                                                i8 = i10;
                                            }
                                            i11 = i8 | (gapComposer2.changed(createTransitionAnimation) ? 1 : 0);
                                            rememberedValue6 = gapComposer2.rememberedValue();
                                            if (i11 == 0 || rememberedValue6 == obj) {
                                                rememberedValue6 = new Navigator$$ExternalSyntheticLambda0(15, textFieldLabelPosition$Attached, createTransitionAnimation, mutableState);
                                                gapComposer2.updateRememberedValue(rememberedValue6);
                                            }
                                            MenuKt.OutlinedTextFieldLayout(function2, composableLambdaImpl4, composableLambdaImpl3, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, z, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, (Function1) rememberedValue6, rememberComposableLambda4, composableLambdaImpl5, paddingValues, gapComposer2, ((i20 >> 3) & 112) | 6 | ((i18 << 21) & 234881024) | ((i20 << 18) & 1879048192), (57344 & (i18 >> 3)) | MLKEMEngine.KyberPolyBytes);
                                            gapComposer = gapComposer2;
                                            gapComposer.end(false);
                                        }
                                    }
                                    f5 = 1.0f;
                                    gapComposer2.end(false);
                                    Float valueOf52 = Float.valueOf(f5);
                                    InputPhase inputPhase102 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer2.startReplaceGroup(-1258455321);
                                    ordinal5 = inputPhase102.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f6 = 1.0f;
                                    gapComposer2.end(false);
                                    Float valueOf62 = Float.valueOf(f6);
                                    updateTransition.getSegment();
                                    gapComposer2.startReplaceGroup(2126293195);
                                    gapComposer2.end(false);
                                    Transition.TransitionAnimationState createTransitionAnimation32 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf52, valueOf62, value, twoWayConverterImpl2, gapComposer2, 196608);
                                    SpringSpec value42 = MenuKt.value(motionSchemeKeyTokens, gapComposer2);
                                    InputPhase inputPhase112 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer2.startReplaceGroup(-12973394);
                                    iArr = TextFieldImplKt$WhenMappings.$EnumSwitchMapping$1;
                                    if (iArr[inputPhase112.ordinal()] == 1) {
                                    }
                                    gapComposer2.end(false);
                                    Object m679getColorSpaceimpl3 = Color.m679getColorSpaceimpl(j6);
                                    changed = gapComposer2.changed(m679getColorSpaceimpl3);
                                    rememberedValue = gapComposer2.rememberedValue();
                                    obj = Composer.Companion.Empty;
                                    if (changed) {
                                    }
                                    i6 = 1;
                                    Object twoWayConverterImpl32 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl3, i6));
                                    gapComposer2.updateRememberedValue(twoWayConverterImpl32);
                                    rememberedValue = twoWayConverterImpl32;
                                    TwoWayConverterImpl twoWayConverterImpl42 = (TwoWayConverterImpl) rememberedValue;
                                    inputPhase = (InputPhase) interactionResult.getCurrentState();
                                    gapComposer2.startReplaceGroup(-12973394);
                                    if (iArr[inputPhase.ordinal()] == i6) {
                                    }
                                    Color m2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, j);
                                    InputPhase inputPhase122 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer2.startReplaceGroup(-12973394);
                                    if (iArr[inputPhase122.ordinal()] == 1) {
                                    }
                                    gapComposer2.end(false);
                                    Color color4 = new Color(j7);
                                    updateTransition.getSegment();
                                    gapComposer2.startReplaceGroup(1954111929);
                                    gapComposer2.end(false);
                                    final Transition.TransitionAnimationState createTransitionAnimation42 = AnimatableKt.createTransitionAnimation(updateTransition, m2, color4, value42, twoWayConverterImpl42, gapComposer2, 196608);
                                    gapComposer2.startReplaceGroup(-464752477);
                                    gapComposer2.end(false);
                                    Object m679getColorSpaceimpl22 = Color.m679getColorSpaceimpl(j2);
                                    changed2 = gapComposer2.changed(m679getColorSpaceimpl22);
                                    Object rememberedValue72 = gapComposer2.rememberedValue();
                                    if (changed2) {
                                    }
                                    i7 = 1;
                                    twoWayConverterImpl = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl22, i7));
                                    gapComposer2.updateRememberedValue(twoWayConverterImpl);
                                    TwoWayConverterImpl twoWayConverterImpl52 = (TwoWayConverterImpl) twoWayConverterImpl;
                                    gapComposer2.startReplaceGroup(-464752477);
                                    gapComposer2.end(false);
                                    Color color22 = new Color(j2);
                                    gapComposer2.startReplaceGroup(-464752477);
                                    gapComposer2.end(false);
                                    Color color32 = new Color(j2);
                                    updateTransition.getSegment();
                                    gapComposer2.startReplaceGroup(1190923886);
                                    gapComposer2.end(false);
                                    final Transition.TransitionAnimationState createTransitionAnimation52 = AnimatableKt.createTransitionAnimation(updateTransition, color22, color32, value42, twoWayConverterImpl52, gapComposer2, 196608);
                                    rememberedValue2 = gapComposer2.rememberedValue();
                                    if (rememberedValue2 == obj) {
                                    }
                                    final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$12 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue2;
                                    if (function3 == null) {
                                    }
                                    if (!z2) {
                                    }
                                    rememberedValue3 = gapComposer2.rememberedValue();
                                    int i212 = 3;
                                    if (rememberedValue3 == obj) {
                                    }
                                    State state2 = (State) rememberedValue3;
                                    if (function22 == null) {
                                    }
                                    gapComposer2.startReplaceGroup(-1890217110);
                                    gapComposer2.end(false);
                                    composableLambdaImpl4 = composableLambdaImpl2;
                                    rememberedValue4 = gapComposer2.rememberedValue();
                                    if (rememberedValue4 == obj) {
                                    }
                                    gapComposer2.startReplaceGroup(-1889500886);
                                    gapComposer2.end(false);
                                    gapComposer2.startReplaceGroup(-1888924534);
                                    gapComposer2.end(false);
                                    gapComposer2.startReplaceGroup(-1888749663);
                                    gapComposer2.end(false);
                                    gapComposer2.startReplaceGroup(-1888469888);
                                    gapComposer2.end(false);
                                    long j92 = !z2 ? textFieldColors.disabledSupportingTextColor : z3 ? textFieldColors.errorSupportingTextColor : booleanValue ? textFieldColors.focusedSupportingTextColor : textFieldColors.unfocusedSupportingTextColor;
                                    if (function23 == null) {
                                    }
                                    gapComposer2.startReplaceGroup(-1886778186);
                                    rememberedValue5 = gapComposer2.rememberedValue();
                                    if (rememberedValue5 == obj) {
                                    }
                                    MutableState mutableState2 = (MutableState) rememberedValue5;
                                    ComposableLambdaImpl rememberComposableLambda42 = Expect_jvmKt.rememberComposableLambda(528115858, new ConvertFromMetadataKt$$Lambda$2(mutableState2, textFieldLabelPosition$Attached, paddingValues, composableLambdaImpl, 1), gapComposer2);
                                    TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new LockFreeLinkedListNode$toString$1(0, 5, State.class, createTransitionAnimation, "value", "getValue()Ljava/lang/Object;"));
                                    if ((i20 & 7168) != 2048) {
                                    }
                                    i11 = i8 | (gapComposer2.changed(createTransitionAnimation) ? 1 : 0);
                                    rememberedValue6 = gapComposer2.rememberedValue();
                                    if (i11 == 0) {
                                    }
                                    rememberedValue6 = new Navigator$$ExternalSyntheticLambda0(15, textFieldLabelPosition$Attached, createTransitionAnimation, mutableState2);
                                    gapComposer2.updateRememberedValue(rememberedValue6);
                                    MenuKt.OutlinedTextFieldLayout(function2, composableLambdaImpl4, composableLambdaImpl3, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, z, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02, (Function1) rememberedValue6, rememberComposableLambda42, composableLambdaImpl5, paddingValues, gapComposer2, ((i20 >> 3) & 112) | 6 | ((i18 << 21) & 234881024) | ((i20 << 18) & 1879048192), (57344 & (i18 >> 3)) | MLKEMEngine.KyberPolyBytes);
                                    gapComposer = gapComposer2;
                                    gapComposer.end(false);
                                }
                                f4 = 1.0f;
                                gapComposer2.end(false);
                                Float valueOf42 = Float.valueOf(f4);
                                Transition.Segment segment2 = updateTransition.getSegment();
                                gapComposer2.startReplaceGroup(-984009111);
                                InputPhase inputPhase72 = InputPhase.Focused;
                                InputPhase inputPhase82 = InputPhase.UnfocusedEmpty;
                                if (segment2.isTransitioningTo(inputPhase72, inputPhase82)) {
                                    gapComposer2.end(false);
                                    final Transition.TransitionAnimationState createTransitionAnimation22 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf42, springSpec, twoWayConverterImpl2, gapComposer2, 196608);
                                    InputPhase inputPhase92 = (InputPhase) interactionResult.getCurrentState();
                                    gapComposer2.startReplaceGroup(-1258455321);
                                    ordinal4 = inputPhase92.ordinal();
                                    if (ordinal4 != 0) {
                                    }
                                    f5 = 1.0f;
                                    gapComposer2.end(false);
                                    Float valueOf522 = Float.valueOf(f5);
                                    InputPhase inputPhase1022 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer2.startReplaceGroup(-1258455321);
                                    ordinal5 = inputPhase1022.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f6 = 1.0f;
                                    gapComposer2.end(false);
                                    Float valueOf622 = Float.valueOf(f6);
                                    updateTransition.getSegment();
                                    gapComposer2.startReplaceGroup(2126293195);
                                    gapComposer2.end(false);
                                    Transition.TransitionAnimationState createTransitionAnimation322 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf522, valueOf622, value, twoWayConverterImpl2, gapComposer2, 196608);
                                    SpringSpec value422 = MenuKt.value(motionSchemeKeyTokens, gapComposer2);
                                    InputPhase inputPhase1122 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer2.startReplaceGroup(-12973394);
                                    iArr = TextFieldImplKt$WhenMappings.$EnumSwitchMapping$1;
                                    if (iArr[inputPhase1122.ordinal()] == 1) {
                                    }
                                    gapComposer2.end(false);
                                    Object m679getColorSpaceimpl32 = Color.m679getColorSpaceimpl(j6);
                                    changed = gapComposer2.changed(m679getColorSpaceimpl32);
                                    rememberedValue = gapComposer2.rememberedValue();
                                    obj = Composer.Companion.Empty;
                                    if (changed) {
                                    }
                                    i6 = 1;
                                    Object twoWayConverterImpl322 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl32, i6));
                                    gapComposer2.updateRememberedValue(twoWayConverterImpl322);
                                    rememberedValue = twoWayConverterImpl322;
                                    TwoWayConverterImpl twoWayConverterImpl422 = (TwoWayConverterImpl) rememberedValue;
                                    inputPhase = (InputPhase) interactionResult.getCurrentState();
                                    gapComposer2.startReplaceGroup(-12973394);
                                    if (iArr[inputPhase.ordinal()] == i6) {
                                    }
                                    Color m22 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, j);
                                    InputPhase inputPhase1222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer2.startReplaceGroup(-12973394);
                                    if (iArr[inputPhase1222.ordinal()] == 1) {
                                    }
                                    gapComposer2.end(false);
                                    Color color42 = new Color(j7);
                                    updateTransition.getSegment();
                                    gapComposer2.startReplaceGroup(1954111929);
                                    gapComposer2.end(false);
                                    final Transition.TransitionAnimationState createTransitionAnimation422 = AnimatableKt.createTransitionAnimation(updateTransition, m22, color42, value422, twoWayConverterImpl422, gapComposer2, 196608);
                                    gapComposer2.startReplaceGroup(-464752477);
                                    gapComposer2.end(false);
                                    Object m679getColorSpaceimpl222 = Color.m679getColorSpaceimpl(j2);
                                    changed2 = gapComposer2.changed(m679getColorSpaceimpl222);
                                    Object rememberedValue722 = gapComposer2.rememberedValue();
                                    if (changed2) {
                                    }
                                    i7 = 1;
                                    twoWayConverterImpl = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl222, i7));
                                    gapComposer2.updateRememberedValue(twoWayConverterImpl);
                                    TwoWayConverterImpl twoWayConverterImpl522 = (TwoWayConverterImpl) twoWayConverterImpl;
                                    gapComposer2.startReplaceGroup(-464752477);
                                    gapComposer2.end(false);
                                    Color color222 = new Color(j2);
                                    gapComposer2.startReplaceGroup(-464752477);
                                    gapComposer2.end(false);
                                    Color color322 = new Color(j2);
                                    updateTransition.getSegment();
                                    gapComposer2.startReplaceGroup(1190923886);
                                    gapComposer2.end(false);
                                    final Transition.TransitionAnimationState createTransitionAnimation522 = AnimatableKt.createTransitionAnimation(updateTransition, color222, color322, value422, twoWayConverterImpl522, gapComposer2, 196608);
                                    rememberedValue2 = gapComposer2.rememberedValue();
                                    if (rememberedValue2 == obj) {
                                    }
                                    final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$122 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue2;
                                    if (function3 == null) {
                                    }
                                    if (!z2) {
                                    }
                                    rememberedValue3 = gapComposer2.rememberedValue();
                                    int i2122 = 3;
                                    if (rememberedValue3 == obj) {
                                    }
                                    State state22 = (State) rememberedValue3;
                                    if (function22 == null) {
                                    }
                                    gapComposer2.startReplaceGroup(-1890217110);
                                    gapComposer2.end(false);
                                    composableLambdaImpl4 = composableLambdaImpl2;
                                    rememberedValue4 = gapComposer2.rememberedValue();
                                    if (rememberedValue4 == obj) {
                                    }
                                    gapComposer2.startReplaceGroup(-1889500886);
                                    gapComposer2.end(false);
                                    gapComposer2.startReplaceGroup(-1888924534);
                                    gapComposer2.end(false);
                                    gapComposer2.startReplaceGroup(-1888749663);
                                    gapComposer2.end(false);
                                    gapComposer2.startReplaceGroup(-1888469888);
                                    gapComposer2.end(false);
                                    long j922 = !z2 ? textFieldColors.disabledSupportingTextColor : z3 ? textFieldColors.errorSupportingTextColor : booleanValue ? textFieldColors.focusedSupportingTextColor : textFieldColors.unfocusedSupportingTextColor;
                                    if (function23 == null) {
                                    }
                                    gapComposer2.startReplaceGroup(-1886778186);
                                    rememberedValue5 = gapComposer2.rememberedValue();
                                    if (rememberedValue5 == obj) {
                                    }
                                    MutableState mutableState22 = (MutableState) rememberedValue5;
                                    ComposableLambdaImpl rememberComposableLambda422 = Expect_jvmKt.rememberComposableLambda(528115858, new ConvertFromMetadataKt$$Lambda$2(mutableState22, textFieldLabelPosition$Attached, paddingValues, composableLambdaImpl, 1), gapComposer2);
                                    TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$022 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new LockFreeLinkedListNode$toString$1(0, 5, State.class, createTransitionAnimation, "value", "getValue()Ljava/lang/Object;"));
                                    if ((i20 & 7168) != 2048) {
                                    }
                                    i11 = i8 | (gapComposer2.changed(createTransitionAnimation) ? 1 : 0);
                                    rememberedValue6 = gapComposer2.rememberedValue();
                                    if (i11 == 0) {
                                    }
                                    rememberedValue6 = new Navigator$$ExternalSyntheticLambda0(15, textFieldLabelPosition$Attached, createTransitionAnimation, mutableState22);
                                    gapComposer2.updateRememberedValue(rememberedValue6);
                                    MenuKt.OutlinedTextFieldLayout(function2, composableLambdaImpl4, composableLambdaImpl3, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, z, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$022, (Function1) rememberedValue6, rememberComposableLambda422, composableLambdaImpl5, paddingValues, gapComposer2, ((i20 >> 3) & 112) | 6 | ((i18 << 21) & 234881024) | ((i20 << 18) & 1879048192), (57344 & (i18 >> 3)) | MLKEMEngine.KyberPolyBytes);
                                    gapComposer = gapComposer2;
                                    gapComposer.end(false);
                                }
                                gapComposer2.end(false);
                                final Transition.TransitionAnimationState createTransitionAnimation222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf42, springSpec, twoWayConverterImpl2, gapComposer2, 196608);
                                InputPhase inputPhase922 = (InputPhase) interactionResult.getCurrentState();
                                gapComposer2.startReplaceGroup(-1258455321);
                                ordinal4 = inputPhase922.ordinal();
                                if (ordinal4 != 0) {
                                }
                                f5 = 1.0f;
                                gapComposer2.end(false);
                                Float valueOf5222 = Float.valueOf(f5);
                                InputPhase inputPhase10222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                gapComposer2.startReplaceGroup(-1258455321);
                                ordinal5 = inputPhase10222.ordinal();
                                if (ordinal5 != 0) {
                                }
                                f6 = 1.0f;
                                gapComposer2.end(false);
                                Float valueOf6222 = Float.valueOf(f6);
                                updateTransition.getSegment();
                                gapComposer2.startReplaceGroup(2126293195);
                                gapComposer2.end(false);
                                Transition.TransitionAnimationState createTransitionAnimation3222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf5222, valueOf6222, value, twoWayConverterImpl2, gapComposer2, 196608);
                                SpringSpec value4222 = MenuKt.value(motionSchemeKeyTokens, gapComposer2);
                                InputPhase inputPhase11222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                gapComposer2.startReplaceGroup(-12973394);
                                iArr = TextFieldImplKt$WhenMappings.$EnumSwitchMapping$1;
                                if (iArr[inputPhase11222.ordinal()] == 1) {
                                }
                                gapComposer2.end(false);
                                Object m679getColorSpaceimpl322 = Color.m679getColorSpaceimpl(j6);
                                changed = gapComposer2.changed(m679getColorSpaceimpl322);
                                rememberedValue = gapComposer2.rememberedValue();
                                obj = Composer.Companion.Empty;
                                if (changed) {
                                }
                                i6 = 1;
                                Object twoWayConverterImpl3222 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl322, i6));
                                gapComposer2.updateRememberedValue(twoWayConverterImpl3222);
                                rememberedValue = twoWayConverterImpl3222;
                                TwoWayConverterImpl twoWayConverterImpl4222 = (TwoWayConverterImpl) rememberedValue;
                                inputPhase = (InputPhase) interactionResult.getCurrentState();
                                gapComposer2.startReplaceGroup(-12973394);
                                if (iArr[inputPhase.ordinal()] == i6) {
                                }
                                Color m222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, j);
                                InputPhase inputPhase12222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                gapComposer2.startReplaceGroup(-12973394);
                                if (iArr[inputPhase12222.ordinal()] == 1) {
                                }
                                gapComposer2.end(false);
                                Color color422 = new Color(j7);
                                updateTransition.getSegment();
                                gapComposer2.startReplaceGroup(1954111929);
                                gapComposer2.end(false);
                                final Transition.TransitionAnimationState createTransitionAnimation4222 = AnimatableKt.createTransitionAnimation(updateTransition, m222, color422, value4222, twoWayConverterImpl4222, gapComposer2, 196608);
                                gapComposer2.startReplaceGroup(-464752477);
                                gapComposer2.end(false);
                                Object m679getColorSpaceimpl2222 = Color.m679getColorSpaceimpl(j2);
                                changed2 = gapComposer2.changed(m679getColorSpaceimpl2222);
                                Object rememberedValue7222 = gapComposer2.rememberedValue();
                                if (changed2) {
                                }
                                i7 = 1;
                                twoWayConverterImpl = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl2222, i7));
                                gapComposer2.updateRememberedValue(twoWayConverterImpl);
                                TwoWayConverterImpl twoWayConverterImpl5222 = (TwoWayConverterImpl) twoWayConverterImpl;
                                gapComposer2.startReplaceGroup(-464752477);
                                gapComposer2.end(false);
                                Color color2222 = new Color(j2);
                                gapComposer2.startReplaceGroup(-464752477);
                                gapComposer2.end(false);
                                Color color3222 = new Color(j2);
                                updateTransition.getSegment();
                                gapComposer2.startReplaceGroup(1190923886);
                                gapComposer2.end(false);
                                final Transition.TransitionAnimationState createTransitionAnimation5222 = AnimatableKt.createTransitionAnimation(updateTransition, color2222, color3222, value4222, twoWayConverterImpl5222, gapComposer2, 196608);
                                rememberedValue2 = gapComposer2.rememberedValue();
                                if (rememberedValue2 == obj) {
                                }
                                final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1222 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue2;
                                if (function3 == null) {
                                }
                                if (!z2) {
                                }
                                rememberedValue3 = gapComposer2.rememberedValue();
                                int i21222 = 3;
                                if (rememberedValue3 == obj) {
                                }
                                State state222 = (State) rememberedValue3;
                                if (function22 == null) {
                                }
                                gapComposer2.startReplaceGroup(-1890217110);
                                gapComposer2.end(false);
                                composableLambdaImpl4 = composableLambdaImpl2;
                                rememberedValue4 = gapComposer2.rememberedValue();
                                if (rememberedValue4 == obj) {
                                }
                                gapComposer2.startReplaceGroup(-1889500886);
                                gapComposer2.end(false);
                                gapComposer2.startReplaceGroup(-1888924534);
                                gapComposer2.end(false);
                                gapComposer2.startReplaceGroup(-1888749663);
                                gapComposer2.end(false);
                                gapComposer2.startReplaceGroup(-1888469888);
                                gapComposer2.end(false);
                                long j9222 = !z2 ? textFieldColors.disabledSupportingTextColor : z3 ? textFieldColors.errorSupportingTextColor : booleanValue ? textFieldColors.focusedSupportingTextColor : textFieldColors.unfocusedSupportingTextColor;
                                if (function23 == null) {
                                }
                                gapComposer2.startReplaceGroup(-1886778186);
                                rememberedValue5 = gapComposer2.rememberedValue();
                                if (rememberedValue5 == obj) {
                                }
                                MutableState mutableState222 = (MutableState) rememberedValue5;
                                ComposableLambdaImpl rememberComposableLambda4222 = Expect_jvmKt.rememberComposableLambda(528115858, new ConvertFromMetadataKt$$Lambda$2(mutableState222, textFieldLabelPosition$Attached, paddingValues, composableLambdaImpl, 1), gapComposer2);
                                TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0222 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new LockFreeLinkedListNode$toString$1(0, 5, State.class, createTransitionAnimation, "value", "getValue()Ljava/lang/Object;"));
                                if ((i20 & 7168) != 2048) {
                                }
                                i11 = i8 | (gapComposer2.changed(createTransitionAnimation) ? 1 : 0);
                                rememberedValue6 = gapComposer2.rememberedValue();
                                if (i11 == 0) {
                                }
                                rememberedValue6 = new Navigator$$ExternalSyntheticLambda0(15, textFieldLabelPosition$Attached, createTransitionAnimation, mutableState222);
                                gapComposer2.updateRememberedValue(rememberedValue6);
                                MenuKt.OutlinedTextFieldLayout(function2, composableLambdaImpl4, composableLambdaImpl3, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, z, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0222, (Function1) rememberedValue6, rememberComposableLambda4222, composableLambdaImpl5, paddingValues, gapComposer2, ((i20 >> 3) & 112) | 6 | ((i18 << 21) & 234881024) | ((i20 << 18) & 1879048192), (57344 & (i18 >> 3)) | MLKEMEngine.KyberPolyBytes);
                                gapComposer = gapComposer2;
                                gapComposer.end(false);
                            } else {
                                parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                            }
                            f3 = 1.0f;
                            gapComposer2.end(false);
                            Float valueOf32 = Float.valueOf(f3);
                            InputPhase inputPhase62 = (InputPhase) parcelableSnapshotMutableState.getValue();
                            gapComposer2.startReplaceGroup(-1093194547);
                            ordinal3 = inputPhase62.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f4 = 1.0f;
                            gapComposer2.end(false);
                            Float valueOf422 = Float.valueOf(f4);
                            Transition.Segment segment22 = updateTransition.getSegment();
                            gapComposer2.startReplaceGroup(-984009111);
                            InputPhase inputPhase722 = InputPhase.Focused;
                            InputPhase inputPhase822 = InputPhase.UnfocusedEmpty;
                            if (segment22.isTransitioningTo(inputPhase722, inputPhase822)) {
                            }
                            gapComposer2.end(false);
                            final Transition.TransitionAnimationState createTransitionAnimation2222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf32, valueOf422, springSpec, twoWayConverterImpl2, gapComposer2, 196608);
                            InputPhase inputPhase9222 = (InputPhase) interactionResult.getCurrentState();
                            gapComposer2.startReplaceGroup(-1258455321);
                            ordinal4 = inputPhase9222.ordinal();
                            if (ordinal4 != 0) {
                            }
                            f5 = 1.0f;
                            gapComposer2.end(false);
                            Float valueOf52222 = Float.valueOf(f5);
                            InputPhase inputPhase102222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                            gapComposer2.startReplaceGroup(-1258455321);
                            ordinal5 = inputPhase102222.ordinal();
                            if (ordinal5 != 0) {
                            }
                            f6 = 1.0f;
                            gapComposer2.end(false);
                            Float valueOf62222 = Float.valueOf(f6);
                            updateTransition.getSegment();
                            gapComposer2.startReplaceGroup(2126293195);
                            gapComposer2.end(false);
                            Transition.TransitionAnimationState createTransitionAnimation32222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf52222, valueOf62222, value, twoWayConverterImpl2, gapComposer2, 196608);
                            SpringSpec value42222 = MenuKt.value(motionSchemeKeyTokens, gapComposer2);
                            InputPhase inputPhase112222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                            gapComposer2.startReplaceGroup(-12973394);
                            iArr = TextFieldImplKt$WhenMappings.$EnumSwitchMapping$1;
                            if (iArr[inputPhase112222.ordinal()] == 1) {
                            }
                            gapComposer2.end(false);
                            Object m679getColorSpaceimpl3222 = Color.m679getColorSpaceimpl(j6);
                            changed = gapComposer2.changed(m679getColorSpaceimpl3222);
                            rememberedValue = gapComposer2.rememberedValue();
                            obj = Composer.Companion.Empty;
                            if (changed) {
                            }
                            i6 = 1;
                            Object twoWayConverterImpl32222 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl3222, i6));
                            gapComposer2.updateRememberedValue(twoWayConverterImpl32222);
                            rememberedValue = twoWayConverterImpl32222;
                            TwoWayConverterImpl twoWayConverterImpl42222 = (TwoWayConverterImpl) rememberedValue;
                            inputPhase = (InputPhase) interactionResult.getCurrentState();
                            gapComposer2.startReplaceGroup(-12973394);
                            if (iArr[inputPhase.ordinal()] == i6) {
                            }
                            Color m2222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, j);
                            InputPhase inputPhase122222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                            gapComposer2.startReplaceGroup(-12973394);
                            if (iArr[inputPhase122222.ordinal()] == 1) {
                            }
                            gapComposer2.end(false);
                            Color color4222 = new Color(j7);
                            updateTransition.getSegment();
                            gapComposer2.startReplaceGroup(1954111929);
                            gapComposer2.end(false);
                            final Transition.TransitionAnimationState createTransitionAnimation42222 = AnimatableKt.createTransitionAnimation(updateTransition, m2222, color4222, value42222, twoWayConverterImpl42222, gapComposer2, 196608);
                            gapComposer2.startReplaceGroup(-464752477);
                            gapComposer2.end(false);
                            Object m679getColorSpaceimpl22222 = Color.m679getColorSpaceimpl(j2);
                            changed2 = gapComposer2.changed(m679getColorSpaceimpl22222);
                            Object rememberedValue72222 = gapComposer2.rememberedValue();
                            if (changed2) {
                            }
                            i7 = 1;
                            twoWayConverterImpl = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl22222, i7));
                            gapComposer2.updateRememberedValue(twoWayConverterImpl);
                            TwoWayConverterImpl twoWayConverterImpl52222 = (TwoWayConverterImpl) twoWayConverterImpl;
                            gapComposer2.startReplaceGroup(-464752477);
                            gapComposer2.end(false);
                            Color color22222 = new Color(j2);
                            gapComposer2.startReplaceGroup(-464752477);
                            gapComposer2.end(false);
                            Color color32222 = new Color(j2);
                            updateTransition.getSegment();
                            gapComposer2.startReplaceGroup(1190923886);
                            gapComposer2.end(false);
                            final Transition.TransitionAnimationState createTransitionAnimation52222 = AnimatableKt.createTransitionAnimation(updateTransition, color22222, color32222, value42222, twoWayConverterImpl52222, gapComposer2, 196608);
                            rememberedValue2 = gapComposer2.rememberedValue();
                            if (rememberedValue2 == obj) {
                            }
                            final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$12222 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue2;
                            if (function3 == null) {
                            }
                            if (!z2) {
                            }
                            rememberedValue3 = gapComposer2.rememberedValue();
                            int i212222 = 3;
                            if (rememberedValue3 == obj) {
                            }
                            State state2222 = (State) rememberedValue3;
                            if (function22 == null) {
                            }
                            gapComposer2.startReplaceGroup(-1890217110);
                            gapComposer2.end(false);
                            composableLambdaImpl4 = composableLambdaImpl2;
                            rememberedValue4 = gapComposer2.rememberedValue();
                            if (rememberedValue4 == obj) {
                            }
                            gapComposer2.startReplaceGroup(-1889500886);
                            gapComposer2.end(false);
                            gapComposer2.startReplaceGroup(-1888924534);
                            gapComposer2.end(false);
                            gapComposer2.startReplaceGroup(-1888749663);
                            gapComposer2.end(false);
                            gapComposer2.startReplaceGroup(-1888469888);
                            gapComposer2.end(false);
                            long j92222 = !z2 ? textFieldColors.disabledSupportingTextColor : z3 ? textFieldColors.errorSupportingTextColor : booleanValue ? textFieldColors.focusedSupportingTextColor : textFieldColors.unfocusedSupportingTextColor;
                            if (function23 == null) {
                            }
                            gapComposer2.startReplaceGroup(-1886778186);
                            rememberedValue5 = gapComposer2.rememberedValue();
                            if (rememberedValue5 == obj) {
                            }
                            MutableState mutableState2222 = (MutableState) rememberedValue5;
                            ComposableLambdaImpl rememberComposableLambda42222 = Expect_jvmKt.rememberComposableLambda(528115858, new ConvertFromMetadataKt$$Lambda$2(mutableState2222, textFieldLabelPosition$Attached, paddingValues, composableLambdaImpl, 1), gapComposer2);
                            TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02222 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new LockFreeLinkedListNode$toString$1(0, 5, State.class, createTransitionAnimation, "value", "getValue()Ljava/lang/Object;"));
                            if ((i20 & 7168) != 2048) {
                            }
                            i11 = i8 | (gapComposer2.changed(createTransitionAnimation) ? 1 : 0);
                            rememberedValue6 = gapComposer2.rememberedValue();
                            if (i11 == 0) {
                            }
                            rememberedValue6 = new Navigator$$ExternalSyntheticLambda0(15, textFieldLabelPosition$Attached, createTransitionAnimation, mutableState2222);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                            MenuKt.OutlinedTextFieldLayout(function2, composableLambdaImpl4, composableLambdaImpl3, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, z, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02222, (Function1) rememberedValue6, rememberComposableLambda42222, composableLambdaImpl5, paddingValues, gapComposer2, ((i20 >> 3) & 112) | 6 | ((i18 << 21) & 234881024) | ((i20 << 18) & 1879048192), (57344 & (i18 >> 3)) | MLKEMEngine.KyberPolyBytes);
                            gapComposer = gapComposer2;
                            gapComposer.end(false);
                        }
                    }
                    f2 = 1.0f;
                    gapComposer2.end(false);
                    Float valueOf22 = Float.valueOf(f2);
                    updateTransition.getSegment();
                    gapComposer2.startReplaceGroup(-709912974);
                    gapComposer2.end(false);
                    final Transition.TransitionAnimationState createTransitionAnimation6 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf22, value3, twoWayConverterImpl2, gapComposer2, 196608);
                    MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.FastEffects;
                    value = MenuKt.value(motionSchemeKeyTokens2, gapComposer2);
                    value2 = MenuKt.value(MotionSchemeKeyTokens.SlowEffects, gapComposer2);
                    InputPhase inputPhase52 = (InputPhase) interactionResult.getCurrentState();
                    gapComposer2.startReplaceGroup(-1093194547);
                    ordinal2 = inputPhase52.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f3 = 1.0f;
                    gapComposer2.end(false);
                    Float valueOf322 = Float.valueOf(f3);
                    InputPhase inputPhase622 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer2.startReplaceGroup(-1093194547);
                    ordinal3 = inputPhase622.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f4 = 1.0f;
                    gapComposer2.end(false);
                    Float valueOf4222 = Float.valueOf(f4);
                    Transition.Segment segment222 = updateTransition.getSegment();
                    gapComposer2.startReplaceGroup(-984009111);
                    InputPhase inputPhase7222 = InputPhase.Focused;
                    InputPhase inputPhase8222 = InputPhase.UnfocusedEmpty;
                    if (segment222.isTransitioningTo(inputPhase7222, inputPhase8222)) {
                    }
                    gapComposer2.end(false);
                    final Transition.TransitionAnimationState createTransitionAnimation22222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf322, valueOf4222, springSpec, twoWayConverterImpl2, gapComposer2, 196608);
                    InputPhase inputPhase92222 = (InputPhase) interactionResult.getCurrentState();
                    gapComposer2.startReplaceGroup(-1258455321);
                    ordinal4 = inputPhase92222.ordinal();
                    if (ordinal4 != 0) {
                    }
                    f5 = 1.0f;
                    gapComposer2.end(false);
                    Float valueOf522222 = Float.valueOf(f5);
                    InputPhase inputPhase1022222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer2.startReplaceGroup(-1258455321);
                    ordinal5 = inputPhase1022222.ordinal();
                    if (ordinal5 != 0) {
                    }
                    f6 = 1.0f;
                    gapComposer2.end(false);
                    Float valueOf622222 = Float.valueOf(f6);
                    updateTransition.getSegment();
                    gapComposer2.startReplaceGroup(2126293195);
                    gapComposer2.end(false);
                    Transition.TransitionAnimationState createTransitionAnimation322222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf522222, valueOf622222, value, twoWayConverterImpl2, gapComposer2, 196608);
                    SpringSpec value422222 = MenuKt.value(motionSchemeKeyTokens2, gapComposer2);
                    InputPhase inputPhase1122222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer2.startReplaceGroup(-12973394);
                    iArr = TextFieldImplKt$WhenMappings.$EnumSwitchMapping$1;
                    if (iArr[inputPhase1122222.ordinal()] == 1) {
                    }
                    gapComposer2.end(false);
                    Object m679getColorSpaceimpl32222 = Color.m679getColorSpaceimpl(j6);
                    changed = gapComposer2.changed(m679getColorSpaceimpl32222);
                    rememberedValue = gapComposer2.rememberedValue();
                    obj = Composer.Companion.Empty;
                    if (changed) {
                    }
                    i6 = 1;
                    Object twoWayConverterImpl322222 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl32222, i6));
                    gapComposer2.updateRememberedValue(twoWayConverterImpl322222);
                    rememberedValue = twoWayConverterImpl322222;
                    TwoWayConverterImpl twoWayConverterImpl422222 = (TwoWayConverterImpl) rememberedValue;
                    inputPhase = (InputPhase) interactionResult.getCurrentState();
                    gapComposer2.startReplaceGroup(-12973394);
                    if (iArr[inputPhase.ordinal()] == i6) {
                    }
                    Color m22222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, j);
                    InputPhase inputPhase1222222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer2.startReplaceGroup(-12973394);
                    if (iArr[inputPhase1222222.ordinal()] == 1) {
                    }
                    gapComposer2.end(false);
                    Color color42222 = new Color(j7);
                    updateTransition.getSegment();
                    gapComposer2.startReplaceGroup(1954111929);
                    gapComposer2.end(false);
                    final Transition.TransitionAnimationState createTransitionAnimation422222 = AnimatableKt.createTransitionAnimation(updateTransition, m22222, color42222, value422222, twoWayConverterImpl422222, gapComposer2, 196608);
                    gapComposer2.startReplaceGroup(-464752477);
                    gapComposer2.end(false);
                    Object m679getColorSpaceimpl222222 = Color.m679getColorSpaceimpl(j2);
                    changed2 = gapComposer2.changed(m679getColorSpaceimpl222222);
                    Object rememberedValue722222 = gapComposer2.rememberedValue();
                    if (changed2) {
                    }
                    i7 = 1;
                    twoWayConverterImpl = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl222222, i7));
                    gapComposer2.updateRememberedValue(twoWayConverterImpl);
                    TwoWayConverterImpl twoWayConverterImpl522222 = (TwoWayConverterImpl) twoWayConverterImpl;
                    gapComposer2.startReplaceGroup(-464752477);
                    gapComposer2.end(false);
                    Color color222222 = new Color(j2);
                    gapComposer2.startReplaceGroup(-464752477);
                    gapComposer2.end(false);
                    Color color322222 = new Color(j2);
                    updateTransition.getSegment();
                    gapComposer2.startReplaceGroup(1190923886);
                    gapComposer2.end(false);
                    final Transition.TransitionAnimationState createTransitionAnimation522222 = AnimatableKt.createTransitionAnimation(updateTransition, color222222, color322222, value422222, twoWayConverterImpl522222, gapComposer2, 196608);
                    rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj) {
                    }
                    final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$122222 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue2;
                    if (function3 == null) {
                    }
                    if (!z2) {
                    }
                    rememberedValue3 = gapComposer2.rememberedValue();
                    int i2122222 = 3;
                    if (rememberedValue3 == obj) {
                    }
                    State state22222 = (State) rememberedValue3;
                    if (function22 == null) {
                    }
                    gapComposer2.startReplaceGroup(-1890217110);
                    gapComposer2.end(false);
                    composableLambdaImpl4 = composableLambdaImpl2;
                    rememberedValue4 = gapComposer2.rememberedValue();
                    if (rememberedValue4 == obj) {
                    }
                    gapComposer2.startReplaceGroup(-1889500886);
                    gapComposer2.end(false);
                    gapComposer2.startReplaceGroup(-1888924534);
                    gapComposer2.end(false);
                    gapComposer2.startReplaceGroup(-1888749663);
                    gapComposer2.end(false);
                    gapComposer2.startReplaceGroup(-1888469888);
                    gapComposer2.end(false);
                    long j922222 = !z2 ? textFieldColors.disabledSupportingTextColor : z3 ? textFieldColors.errorSupportingTextColor : booleanValue ? textFieldColors.focusedSupportingTextColor : textFieldColors.unfocusedSupportingTextColor;
                    if (function23 == null) {
                    }
                    gapComposer2.startReplaceGroup(-1886778186);
                    rememberedValue5 = gapComposer2.rememberedValue();
                    if (rememberedValue5 == obj) {
                    }
                    MutableState mutableState22222 = (MutableState) rememberedValue5;
                    ComposableLambdaImpl rememberComposableLambda422222 = Expect_jvmKt.rememberComposableLambda(528115858, new ConvertFromMetadataKt$$Lambda$2(mutableState22222, textFieldLabelPosition$Attached, paddingValues, composableLambdaImpl, 1), gapComposer2);
                    TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$022222 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new LockFreeLinkedListNode$toString$1(0, 5, State.class, createTransitionAnimation6, "value", "getValue()Ljava/lang/Object;"));
                    if ((i20 & 7168) != 2048) {
                    }
                    i11 = i8 | (gapComposer2.changed(createTransitionAnimation6) ? 1 : 0);
                    rememberedValue6 = gapComposer2.rememberedValue();
                    if (i11 == 0) {
                    }
                    rememberedValue6 = new Navigator$$ExternalSyntheticLambda0(15, textFieldLabelPosition$Attached, createTransitionAnimation6, mutableState22222);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                    MenuKt.OutlinedTextFieldLayout(function2, composableLambdaImpl4, composableLambdaImpl3, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, z, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$022222, (Function1) rememberedValue6, rememberComposableLambda422222, composableLambdaImpl5, paddingValues, gapComposer2, ((i20 >> 3) & 112) | 6 | ((i18 << 21) & 234881024) | ((i20 << 18) & 1879048192), (57344 & (i18 >> 3)) | MLKEMEngine.KyberPolyBytes);
                    gapComposer = gapComposer2;
                    gapComposer.end(false);
                }
            }
            f = 1.0f;
            gapComposer2.end(false);
            Float valueOf7 = Float.valueOf(f);
            InputPhase inputPhase42 = (InputPhase) parcelableSnapshotMutableState2.getValue();
            gapComposer2.startReplaceGroup(-1436405362);
            ordinal = inputPhase42.ordinal();
            if (ordinal != 0) {
            }
            f2 = 1.0f;
            gapComposer2.end(false);
            Float valueOf222 = Float.valueOf(f2);
            updateTransition.getSegment();
            gapComposer2.startReplaceGroup(-709912974);
            gapComposer2.end(false);
            final Transition.TransitionAnimationState createTransitionAnimation62 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf7, valueOf222, value3, twoWayConverterImpl2, gapComposer2, 196608);
            MotionSchemeKeyTokens motionSchemeKeyTokens22 = MotionSchemeKeyTokens.FastEffects;
            value = MenuKt.value(motionSchemeKeyTokens22, gapComposer2);
            value2 = MenuKt.value(MotionSchemeKeyTokens.SlowEffects, gapComposer2);
            InputPhase inputPhase522 = (InputPhase) interactionResult.getCurrentState();
            gapComposer2.startReplaceGroup(-1093194547);
            ordinal2 = inputPhase522.ordinal();
            if (ordinal2 != 0) {
            }
            f3 = 1.0f;
            gapComposer2.end(false);
            Float valueOf3222 = Float.valueOf(f3);
            InputPhase inputPhase6222 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer2.startReplaceGroup(-1093194547);
            ordinal3 = inputPhase6222.ordinal();
            if (ordinal3 != 0) {
            }
            f4 = 1.0f;
            gapComposer2.end(false);
            Float valueOf42222 = Float.valueOf(f4);
            Transition.Segment segment2222 = updateTransition.getSegment();
            gapComposer2.startReplaceGroup(-984009111);
            InputPhase inputPhase72222 = InputPhase.Focused;
            InputPhase inputPhase82222 = InputPhase.UnfocusedEmpty;
            if (segment2222.isTransitioningTo(inputPhase72222, inputPhase82222)) {
            }
            gapComposer2.end(false);
            final Transition.TransitionAnimationState createTransitionAnimation222222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3222, valueOf42222, springSpec, twoWayConverterImpl2, gapComposer2, 196608);
            InputPhase inputPhase922222 = (InputPhase) interactionResult.getCurrentState();
            gapComposer2.startReplaceGroup(-1258455321);
            ordinal4 = inputPhase922222.ordinal();
            if (ordinal4 != 0) {
            }
            f5 = 1.0f;
            gapComposer2.end(false);
            Float valueOf5222222 = Float.valueOf(f5);
            InputPhase inputPhase10222222 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer2.startReplaceGroup(-1258455321);
            ordinal5 = inputPhase10222222.ordinal();
            if (ordinal5 != 0) {
            }
            f6 = 1.0f;
            gapComposer2.end(false);
            Float valueOf6222222 = Float.valueOf(f6);
            updateTransition.getSegment();
            gapComposer2.startReplaceGroup(2126293195);
            gapComposer2.end(false);
            Transition.TransitionAnimationState createTransitionAnimation3222222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf5222222, valueOf6222222, value, twoWayConverterImpl2, gapComposer2, 196608);
            SpringSpec value4222222 = MenuKt.value(motionSchemeKeyTokens22, gapComposer2);
            InputPhase inputPhase11222222 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer2.startReplaceGroup(-12973394);
            iArr = TextFieldImplKt$WhenMappings.$EnumSwitchMapping$1;
            if (iArr[inputPhase11222222.ordinal()] == 1) {
            }
            gapComposer2.end(false);
            Object m679getColorSpaceimpl322222 = Color.m679getColorSpaceimpl(j6);
            changed = gapComposer2.changed(m679getColorSpaceimpl322222);
            rememberedValue = gapComposer2.rememberedValue();
            obj = Composer.Companion.Empty;
            if (changed) {
            }
            i6 = 1;
            Object twoWayConverterImpl3222222 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl322222, i6));
            gapComposer2.updateRememberedValue(twoWayConverterImpl3222222);
            rememberedValue = twoWayConverterImpl3222222;
            TwoWayConverterImpl twoWayConverterImpl4222222 = (TwoWayConverterImpl) rememberedValue;
            inputPhase = (InputPhase) interactionResult.getCurrentState();
            gapComposer2.startReplaceGroup(-12973394);
            if (iArr[inputPhase.ordinal()] == i6) {
            }
            Color m222222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, j);
            InputPhase inputPhase12222222 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer2.startReplaceGroup(-12973394);
            if (iArr[inputPhase12222222.ordinal()] == 1) {
            }
            gapComposer2.end(false);
            Color color422222 = new Color(j7);
            updateTransition.getSegment();
            gapComposer2.startReplaceGroup(1954111929);
            gapComposer2.end(false);
            final Transition.TransitionAnimationState createTransitionAnimation4222222 = AnimatableKt.createTransitionAnimation(updateTransition, m222222, color422222, value4222222, twoWayConverterImpl4222222, gapComposer2, 196608);
            gapComposer2.startReplaceGroup(-464752477);
            gapComposer2.end(false);
            Object m679getColorSpaceimpl2222222 = Color.m679getColorSpaceimpl(j2);
            changed2 = gapComposer2.changed(m679getColorSpaceimpl2222222);
            Object rememberedValue7222222 = gapComposer2.rememberedValue();
            if (changed2) {
            }
            i7 = 1;
            twoWayConverterImpl = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl2222222, i7));
            gapComposer2.updateRememberedValue(twoWayConverterImpl);
            TwoWayConverterImpl twoWayConverterImpl5222222 = (TwoWayConverterImpl) twoWayConverterImpl;
            gapComposer2.startReplaceGroup(-464752477);
            gapComposer2.end(false);
            Color color2222222 = new Color(j2);
            gapComposer2.startReplaceGroup(-464752477);
            gapComposer2.end(false);
            Color color3222222 = new Color(j2);
            updateTransition.getSegment();
            gapComposer2.startReplaceGroup(1190923886);
            gapComposer2.end(false);
            final Transition.TransitionAnimationState createTransitionAnimation5222222 = AnimatableKt.createTransitionAnimation(updateTransition, color2222222, color3222222, value4222222, twoWayConverterImpl5222222, gapComposer2, 196608);
            rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
            }
            final TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 textFieldImplKt$CommonDecorationBox$3$labelScope$1$1222222 = (TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) rememberedValue2;
            if (function3 == null) {
            }
            if (!z2) {
            }
            rememberedValue3 = gapComposer2.rememberedValue();
            int i21222222 = 3;
            if (rememberedValue3 == obj) {
            }
            State state222222 = (State) rememberedValue3;
            if (function22 == null) {
            }
            gapComposer2.startReplaceGroup(-1890217110);
            gapComposer2.end(false);
            composableLambdaImpl4 = composableLambdaImpl2;
            rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
            }
            gapComposer2.startReplaceGroup(-1889500886);
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(-1888924534);
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(-1888749663);
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(-1888469888);
            gapComposer2.end(false);
            long j9222222 = !z2 ? textFieldColors.disabledSupportingTextColor : z3 ? textFieldColors.errorSupportingTextColor : booleanValue ? textFieldColors.focusedSupportingTextColor : textFieldColors.unfocusedSupportingTextColor;
            if (function23 == null) {
            }
            gapComposer2.startReplaceGroup(-1886778186);
            rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj) {
            }
            MutableState mutableState222222 = (MutableState) rememberedValue5;
            ComposableLambdaImpl rememberComposableLambda4222222 = Expect_jvmKt.rememberComposableLambda(528115858, new ConvertFromMetadataKt$$Lambda$2(mutableState222222, textFieldLabelPosition$Attached, paddingValues, composableLambdaImpl, 1), gapComposer2);
            TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0222222 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(new LockFreeLinkedListNode$toString$1(0, 5, State.class, createTransitionAnimation62, "value", "getValue()Ljava/lang/Object;"));
            if ((i20 & 7168) != 2048) {
            }
            i11 = i8 | (gapComposer2.changed(createTransitionAnimation62) ? 1 : 0);
            rememberedValue6 = gapComposer2.rememberedValue();
            if (i11 == 0) {
            }
            rememberedValue6 = new Navigator$$ExternalSyntheticLambda0(15, textFieldLabelPosition$Attached, createTransitionAnimation62, mutableState222222);
            gapComposer2.updateRememberedValue(rememberedValue6);
            MenuKt.OutlinedTextFieldLayout(function2, composableLambdaImpl4, composableLambdaImpl3, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, composableLambdaImpl2, z, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0222222, (Function1) rememberedValue6, rememberComposableLambda4222222, composableLambdaImpl5, paddingValues, gapComposer2, ((i20 >> 3) & 112) | 6 | ((i18 << 21) & 234881024) | ((i20 << 18) & 1879048192), (57344 & (i18 >> 3)) | MLKEMEngine.KyberPolyBytes);
            gapComposer = gapComposer2;
            gapComposer.end(false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldImplKt$$ExternalSyntheticLambda4(charSequence, function2, textFieldLabelPosition$Attached, function3, function22, function23, z, z2, z3, mutableInteractionSourceImpl, paddingValues, textFieldColors, composableLambdaImpl, i, i2);
        }
    }

    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m566Decoration3JVO9M(long j, TextStyle textStyle, Function2 function2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(396611577);
        int i2 = (gapComposer.changed(j) ? 4 : 2) | i | (gapComposer.changed(textStyle) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            m567ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldImplKt$$ExternalSyntheticLambda7(j, textStyle, function2, i, 0);
        }
    }

    /* renamed from: ProvideContentColorTextStyle-3J-VO9M, reason: not valid java name */
    public static final void m567ProvideContentColorTextStyle3JVO9M(long j, TextStyle textStyle, Function2 function2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-684938728);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(textStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = TextKt.LocalTextStyle;
            Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(j, ContentColorKt.LocalContentColor), dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((TextStyle) gapComposer.consume(dynamicProvidableCompositionLocal)).merge(textStyle))}, function2, gapComposer, ((i2 >> 3) & 112) | 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldImplKt$$ExternalSyntheticLambda7(j, textStyle, function2, i, 1);
        }
    }

    public static final void TooltipPopup(PopupPositionProvider popupPositionProvider, TooltipStateImpl tooltipStateImpl, CoroutineScope coroutineScope, boolean z, MutableState mutableState, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1413720282);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(tooltipStateImpl) : gapComposer.changedInstance(tooltipStateImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(coroutineScope) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(mutableState) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            String stringResource = Room.stringResource(gapComposer, R.string.tooltip_description);
            boolean changedInstance = ((i2 & 112) == 32 || ((i2 & 64) != 0 && gapComposer.changedInstance(tooltipStateImpl))) | ((i2 & 896) == 256) | gapComposer.changedInstance(coroutineScope) | ((458752 & i2) == 131072);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new n$$ExternalSyntheticLambda1(i3, tooltipStateImpl, coroutineScope, mutableState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider, (Function0) rememberedValue, new PopupProperties(z), Expect_jvmKt.rememberComposableLambda(-1287705660, new ButtonKt$Button$2.AnonymousClass1(6, stringResource, composableLambdaImpl), gapComposer), gapComposer, (i2 & 14) | 3072, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(popupPositionProvider, tooltipStateImpl, coroutineScope, z, mutableState, composableLambdaImpl, i);
        }
    }

    public static final void WrappedAnchor(final TooltipStateImpl tooltipStateImpl, MutableState mutableState, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1873232064);
        final int i3 = 1;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(tooltipStateImpl) : gapComposer.changedInstance(tooltipStateImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(mutableState) ? 256 : 128;
        }
        final int i5 = 0;
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(false) ? 2048 : 1024;
        }
        int i6 = i & 24576;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i6 == 0) {
            i2 |= gapComposer.changed(companion) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Modifier onPreviewKeyEvent = KeyEventType.onPreviewKeyEvent(FocusOwnerImplKt.onFocusChanged(SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(companion, tooltipStateImpl, new PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1

                /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
                public final class AnonymousClass1 extends SuspendLambda implements Function2 {
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ TooltipStateImpl $state;
                    public final /* synthetic */ PointerInputScope $this_pointerInput;
                    public /* synthetic */ Object L$0;
                    public int label;

                    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C00011 extends RestrictedSuspendLambda implements Function2 {
                        public final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        public final /* synthetic */ TooltipStateImpl $state;
                        public long J$0;
                        public /* synthetic */ Object L$0;
                        public MutableStateFlow L$1;
                        public PointerEventPass L$2;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00011(CoroutineScope coroutineScope, TooltipStateImpl tooltipStateImpl, Continuation continuation) {
                            super(2, continuation);
                            this.$$this$coroutineScope = coroutineScope;
                            this.$state = tooltipStateImpl;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C00011 c00011 = new C00011(this.$$this$coroutineScope, this.$state, continuation);
                            c00011.L$0 = obj;
                            return c00011;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ((C00011) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x00c2 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:9:0x00be, B:11:0x00c2), top: B:7:0x0014 }] */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
                        /* JADX WARN: Type inference failed for: r6v8, types: [kotlinx.coroutines.flow.MutableStateFlow] */
                        /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.flow.MutableStateFlow] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            StateFlowImpl MutableStateFlow;
                            long longPressTimeoutMillis;
                            PointerEventPass pointerEventPass;
                            SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine;
                            SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
                            StateFlowImpl stateFlowImpl;
                            MutableStateFlow mutableStateFlow;
                            PointerInputChange pointerInputChange;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                SafeTrace.throwOnFailure(obj);
                                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                                MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
                                longPressTimeoutMillis = pointerEventHandlerCoroutine3.getViewConfiguration().getLongPressTimeoutMillis();
                                pointerEventPass = PointerEventPass.Initial;
                                this.L$0 = pointerEventHandlerCoroutine3;
                                this.L$1 = MutableStateFlow;
                                this.L$2 = pointerEventPass;
                                this.J$0 = longPressTimeoutMillis;
                                this.label = 1;
                                Object awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine3, this, 1);
                                if (awaitFirstDown$default != coroutineSingletons) {
                                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine3;
                                    obj = awaitFirstDown$default;
                                }
                                return coroutineSingletons;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    mutableStateFlow = (MutableStateFlow) this.L$0;
                                    try {
                                        SafeTrace.throwOnFailure(obj);
                                        pointerInputChange = (PointerInputChange) obj;
                                        if (pointerInputChange != null) {
                                            pointerInputChange.consume();
                                        }
                                        Boolean bool = Boolean.FALSE;
                                        StateFlowImpl stateFlowImpl2 = (StateFlowImpl) mutableStateFlow;
                                        stateFlowImpl2.getClass();
                                        stateFlowImpl2.updateState(null, bool);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        th = th;
                                        Boolean bool2 = Boolean.FALSE;
                                        StateFlowImpl stateFlowImpl3 = (StateFlowImpl) mutableStateFlow;
                                        stateFlowImpl3.getClass();
                                        stateFlowImpl3.updateState(null, bool2);
                                        throw th;
                                    }
                                }
                                PointerEventPass pointerEventPass2 = this.L$2;
                                ?? r6 = this.L$1;
                                pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                                try {
                                    SafeTrace.throwOnFailure(obj);
                                    stateFlowImpl = r6;
                                    Boolean bool3 = Boolean.FALSE;
                                    StateFlowImpl stateFlowImpl4 = stateFlowImpl;
                                    stateFlowImpl4.getClass();
                                    stateFlowImpl4.updateState(null, bool3);
                                } catch (PointerEventTimeoutCancellationException unused) {
                                    pointerEventPass = pointerEventPass2;
                                    MutableStateFlow = r6;
                                    JobKt.launch$default(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new SliderState$drag$2(MutableStateFlow, this.$state, (Continuation) null, 2), 1);
                                    this.L$0 = MutableStateFlow;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 3;
                                    obj = TapGestureDetectorKt.waitForUpOrCancellation(pointerEventHandlerCoroutine2, pointerEventPass, this);
                                    if (obj != coroutineSingletons) {
                                    }
                                    return coroutineSingletons;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mutableStateFlow = r6;
                                    Boolean bool22 = Boolean.FALSE;
                                    StateFlowImpl stateFlowImpl32 = (StateFlowImpl) mutableStateFlow;
                                    stateFlowImpl32.getClass();
                                    stateFlowImpl32.updateState(null, bool22);
                                    throw th;
                                }
                                return Unit.INSTANCE;
                            }
                            longPressTimeoutMillis = this.J$0;
                            PointerEventPass pointerEventPass3 = this.L$2;
                            ?? r8 = this.L$1;
                            pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            pointerEventPass = pointerEventPass3;
                            MutableStateFlow = r8;
                            int i2 = ((PointerInputChange) obj).f859type;
                            if (i2 == 1 || i2 == 3) {
                                try {
                                    try {
                                        HostFocusDirectorKt$depthFirst$1 hostFocusDirectorKt$depthFirst$1 = new HostFocusDirectorKt$depthFirst$1(pointerEventPass, null, 3);
                                        this.L$0 = pointerEventHandlerCoroutine;
                                        this.L$1 = MutableStateFlow;
                                        this.L$2 = pointerEventPass;
                                        this.label = 2;
                                        if (pointerEventHandlerCoroutine.withTimeout(longPressTimeoutMillis, hostFocusDirectorKt$depthFirst$1, this) != coroutineSingletons) {
                                            stateFlowImpl = MutableStateFlow;
                                            Boolean bool32 = Boolean.FALSE;
                                            StateFlowImpl stateFlowImpl42 = stateFlowImpl;
                                            stateFlowImpl42.getClass();
                                            stateFlowImpl42.updateState(null, bool32);
                                        }
                                    } catch (PointerEventTimeoutCancellationException unused2) {
                                        pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                                        JobKt.launch$default(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new SliderState$drag$2(MutableStateFlow, this.$state, (Continuation) null, 2), 1);
                                        this.L$0 = MutableStateFlow;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 3;
                                        obj = TapGestureDetectorKt.waitForUpOrCancellation(pointerEventHandlerCoroutine2, pointerEventPass, this);
                                        if (obj != coroutineSingletons) {
                                            mutableStateFlow = MutableStateFlow;
                                            pointerInputChange = (PointerInputChange) obj;
                                            if (pointerInputChange != null) {
                                            }
                                            Boolean bool4 = Boolean.FALSE;
                                            StateFlowImpl stateFlowImpl22 = (StateFlowImpl) mutableStateFlow;
                                            stateFlowImpl22.getClass();
                                            stateFlowImpl22.updateState(null, bool4);
                                            return Unit.INSTANCE;
                                        }
                                        return coroutineSingletons;
                                    }
                                    return coroutineSingletons;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mutableStateFlow = MutableStateFlow;
                                    Boolean bool222 = Boolean.FALSE;
                                    StateFlowImpl stateFlowImpl322 = (StateFlowImpl) mutableStateFlow;
                                    stateFlowImpl322.getClass();
                                    stateFlowImpl322.updateState(null, bool222);
                                    throw th;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public /* synthetic */ AnonymousClass1(PointerInputScope pointerInputScope, TooltipStateImpl tooltipStateImpl, Continuation continuation, int i) {
                        super(2, continuation);
                        this.$r8$classId = i;
                        this.$this_pointerInput = pointerInputScope;
                        this.$state = tooltipStateImpl;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        switch (this.$r8$classId) {
                            case 0:
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, continuation, 0);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            default:
                                AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$this_pointerInput, this.$state, continuation, 1);
                                anonymousClass12.L$0 = obj;
                                return anonymousClass12;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        CoroutineScope coroutineScope = (CoroutineScope) obj;
                        Continuation continuation = (Continuation) obj2;
                        switch (this.$r8$classId) {
                        }
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i = this.$r8$classId;
                        TooltipStateImpl tooltipStateImpl = this.$state;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        switch (i) {
                            case 0:
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    SafeTrace.throwOnFailure(obj);
                                    C00011 c00011 = new C00011((CoroutineScope) this.L$0, tooltipStateImpl, null);
                                    this.label = 1;
                                    if (Draggable2DKt.awaitEachGesture(pointerInputScope, c00011, this) == coroutineSingletons) {
                                        break;
                                    }
                                } else if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj);
                                }
                                break;
                            default:
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i3 = this.label;
                                if (i3 == 0) {
                                    SafeTrace.throwOnFailure(obj);
                                    LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1 anonymousClass1 = new LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1((CoroutineScope) this.L$0, tooltipStateImpl, null, 5);
                                    this.label = 1;
                                    if (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(anonymousClass1, this) == coroutineSingletons2) {
                                        break;
                                    }
                                } else if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                    int i7 = i5;
                    Continuation continuation2 = null;
                    TooltipStateImpl tooltipStateImpl2 = tooltipStateImpl;
                    switch (i7) {
                        case 0:
                            Object coroutineScope2 = JobKt.coroutineScope(new AnonymousClass1(pointerInputScope, tooltipStateImpl2, continuation2, 0), continuation);
                            if (coroutineScope2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        default:
                            Object coroutineScope3 = JobKt.coroutineScope(new AnonymousClass1(pointerInputScope, tooltipStateImpl2, continuation2, 1), continuation);
                            if (coroutineScope3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }), tooltipStateImpl, new PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1

                /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
                public final class AnonymousClass1 extends SuspendLambda implements Function2 {
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ TooltipStateImpl $state;
                    public final /* synthetic */ PointerInputScope $this_pointerInput;
                    public /* synthetic */ Object L$0;
                    public int label;

                    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C00011 extends RestrictedSuspendLambda implements Function2 {
                        public final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        public final /* synthetic */ TooltipStateImpl $state;
                        public long J$0;
                        public /* synthetic */ Object L$0;
                        public MutableStateFlow L$1;
                        public PointerEventPass L$2;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00011(CoroutineScope coroutineScope, TooltipStateImpl tooltipStateImpl, Continuation continuation) {
                            super(2, continuation);
                            this.$$this$coroutineScope = coroutineScope;
                            this.$state = tooltipStateImpl;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C00011 c00011 = new C00011(this.$$this$coroutineScope, this.$state, continuation);
                            c00011.L$0 = obj;
                            return c00011;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ((C00011) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x00c2 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:9:0x00be, B:11:0x00c2), top: B:7:0x0014 }] */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
                        /* JADX WARN: Type inference failed for: r6v8, types: [kotlinx.coroutines.flow.MutableStateFlow] */
                        /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.flow.MutableStateFlow] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            StateFlowImpl MutableStateFlow;
                            long longPressTimeoutMillis;
                            PointerEventPass pointerEventPass;
                            SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine;
                            SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
                            StateFlowImpl stateFlowImpl;
                            MutableStateFlow mutableStateFlow;
                            PointerInputChange pointerInputChange;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                SafeTrace.throwOnFailure(obj);
                                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                                MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
                                longPressTimeoutMillis = pointerEventHandlerCoroutine3.getViewConfiguration().getLongPressTimeoutMillis();
                                pointerEventPass = PointerEventPass.Initial;
                                this.L$0 = pointerEventHandlerCoroutine3;
                                this.L$1 = MutableStateFlow;
                                this.L$2 = pointerEventPass;
                                this.J$0 = longPressTimeoutMillis;
                                this.label = 1;
                                Object awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine3, this, 1);
                                if (awaitFirstDown$default != coroutineSingletons) {
                                    pointerEventHandlerCoroutine = pointerEventHandlerCoroutine3;
                                    obj = awaitFirstDown$default;
                                }
                                return coroutineSingletons;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    mutableStateFlow = (MutableStateFlow) this.L$0;
                                    try {
                                        SafeTrace.throwOnFailure(obj);
                                        pointerInputChange = (PointerInputChange) obj;
                                        if (pointerInputChange != null) {
                                            pointerInputChange.consume();
                                        }
                                        Boolean bool4 = Boolean.FALSE;
                                        StateFlowImpl stateFlowImpl22 = (StateFlowImpl) mutableStateFlow;
                                        stateFlowImpl22.getClass();
                                        stateFlowImpl22.updateState(null, bool4);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        th = th;
                                        Boolean bool222 = Boolean.FALSE;
                                        StateFlowImpl stateFlowImpl322 = (StateFlowImpl) mutableStateFlow;
                                        stateFlowImpl322.getClass();
                                        stateFlowImpl322.updateState(null, bool222);
                                        throw th;
                                    }
                                }
                                PointerEventPass pointerEventPass2 = this.L$2;
                                ?? r6 = this.L$1;
                                pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                                try {
                                    SafeTrace.throwOnFailure(obj);
                                    stateFlowImpl = r6;
                                    Boolean bool32 = Boolean.FALSE;
                                    StateFlowImpl stateFlowImpl42 = stateFlowImpl;
                                    stateFlowImpl42.getClass();
                                    stateFlowImpl42.updateState(null, bool32);
                                } catch (PointerEventTimeoutCancellationException unused) {
                                    pointerEventPass = pointerEventPass2;
                                    MutableStateFlow = r6;
                                    JobKt.launch$default(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new SliderState$drag$2(MutableStateFlow, this.$state, (Continuation) null, 2), 1);
                                    this.L$0 = MutableStateFlow;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 3;
                                    obj = TapGestureDetectorKt.waitForUpOrCancellation(pointerEventHandlerCoroutine2, pointerEventPass, this);
                                    if (obj != coroutineSingletons) {
                                    }
                                    return coroutineSingletons;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mutableStateFlow = r6;
                                    Boolean bool2222 = Boolean.FALSE;
                                    StateFlowImpl stateFlowImpl3222 = (StateFlowImpl) mutableStateFlow;
                                    stateFlowImpl3222.getClass();
                                    stateFlowImpl3222.updateState(null, bool2222);
                                    throw th;
                                }
                                return Unit.INSTANCE;
                            }
                            longPressTimeoutMillis = this.J$0;
                            PointerEventPass pointerEventPass3 = this.L$2;
                            ?? r8 = this.L$1;
                            pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            pointerEventPass = pointerEventPass3;
                            MutableStateFlow = r8;
                            int i2 = ((PointerInputChange) obj).f859type;
                            if (i2 == 1 || i2 == 3) {
                                try {
                                    try {
                                        HostFocusDirectorKt$depthFirst$1 hostFocusDirectorKt$depthFirst$1 = new HostFocusDirectorKt$depthFirst$1(pointerEventPass, null, 3);
                                        this.L$0 = pointerEventHandlerCoroutine;
                                        this.L$1 = MutableStateFlow;
                                        this.L$2 = pointerEventPass;
                                        this.label = 2;
                                        if (pointerEventHandlerCoroutine.withTimeout(longPressTimeoutMillis, hostFocusDirectorKt$depthFirst$1, this) != coroutineSingletons) {
                                            stateFlowImpl = MutableStateFlow;
                                            Boolean bool322 = Boolean.FALSE;
                                            StateFlowImpl stateFlowImpl422 = stateFlowImpl;
                                            stateFlowImpl422.getClass();
                                            stateFlowImpl422.updateState(null, bool322);
                                        }
                                    } catch (PointerEventTimeoutCancellationException unused2) {
                                        pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                                        JobKt.launch$default(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new SliderState$drag$2(MutableStateFlow, this.$state, (Continuation) null, 2), 1);
                                        this.L$0 = MutableStateFlow;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 3;
                                        obj = TapGestureDetectorKt.waitForUpOrCancellation(pointerEventHandlerCoroutine2, pointerEventPass, this);
                                        if (obj != coroutineSingletons) {
                                            mutableStateFlow = MutableStateFlow;
                                            pointerInputChange = (PointerInputChange) obj;
                                            if (pointerInputChange != null) {
                                            }
                                            Boolean bool42 = Boolean.FALSE;
                                            StateFlowImpl stateFlowImpl222 = (StateFlowImpl) mutableStateFlow;
                                            stateFlowImpl222.getClass();
                                            stateFlowImpl222.updateState(null, bool42);
                                            return Unit.INSTANCE;
                                        }
                                        return coroutineSingletons;
                                    }
                                    return coroutineSingletons;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mutableStateFlow = MutableStateFlow;
                                    Boolean bool22222 = Boolean.FALSE;
                                    StateFlowImpl stateFlowImpl32222 = (StateFlowImpl) mutableStateFlow;
                                    stateFlowImpl32222.getClass();
                                    stateFlowImpl32222.updateState(null, bool22222);
                                    throw th;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public /* synthetic */ AnonymousClass1(PointerInputScope pointerInputScope, TooltipStateImpl tooltipStateImpl, Continuation continuation, int i) {
                        super(2, continuation);
                        this.$r8$classId = i;
                        this.$this_pointerInput = pointerInputScope;
                        this.$state = tooltipStateImpl;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        switch (this.$r8$classId) {
                            case 0:
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, continuation, 0);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            default:
                                AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$this_pointerInput, this.$state, continuation, 1);
                                anonymousClass12.L$0 = obj;
                                return anonymousClass12;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        CoroutineScope coroutineScope = (CoroutineScope) obj;
                        Continuation continuation = (Continuation) obj2;
                        switch (this.$r8$classId) {
                        }
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i = this.$r8$classId;
                        TooltipStateImpl tooltipStateImpl = this.$state;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        switch (i) {
                            case 0:
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    SafeTrace.throwOnFailure(obj);
                                    C00011 c00011 = new C00011((CoroutineScope) this.L$0, tooltipStateImpl, null);
                                    this.label = 1;
                                    if (Draggable2DKt.awaitEachGesture(pointerInputScope, c00011, this) == coroutineSingletons) {
                                        break;
                                    }
                                } else if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj);
                                }
                                break;
                            default:
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i3 = this.label;
                                if (i3 == 0) {
                                    SafeTrace.throwOnFailure(obj);
                                    LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1 anonymousClass1 = new LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1((CoroutineScope) this.L$0, tooltipStateImpl, null, 5);
                                    this.label = 1;
                                    if (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(anonymousClass1, this) == coroutineSingletons2) {
                                        break;
                                    }
                                } else if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
                                    SafeTrace.throwOnFailure(obj);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                    int i7 = i3;
                    Continuation continuation2 = null;
                    TooltipStateImpl tooltipStateImpl2 = tooltipStateImpl;
                    switch (i7) {
                        case 0:
                            Object coroutineScope2 = JobKt.coroutineScope(new AnonymousClass1(pointerInputScope, tooltipStateImpl2, continuation2, 0), continuation);
                            if (coroutineScope2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                        default:
                            Object coroutineScope3 = JobKt.coroutineScope(new AnonymousClass1(pointerInputScope, tooltipStateImpl2, continuation2, 1), continuation);
                            if (coroutineScope3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }).then(new ParentSemanticsNodeElement(new MenuKt$$ExternalSyntheticLambda0(20, Room.stringResource(gapComposer, R.string.tooltip_label), coroutineScope, tooltipStateImpl))), new Navigator$$ExternalSyntheticLambda0(14, coroutineScope, tooltipStateImpl)), new Latch$await$2$2(i4, tooltipStateImpl, mutableState));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onPreviewKeyEvent);
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
            Recorder$$ExternalSyntheticOutline2.m((i2 >> 15) & 14, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(tooltipStateImpl, mutableState, composableLambdaImpl, i);
        }
    }

    public static final Modifier draggableAnchorsV2(AnchoredDraggableState anchoredDraggableState, Function2 function2) {
        Orientation orientation = Orientation.Vertical;
        return new DraggableAnchorsElementV2(anchoredDraggableState, function2);
    }

    public static final String formatWithSkeleton(long j, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j));
    }

    public static DateTimeFormatter getCachedDateTimeFormatter(String str, Locale locale, Map map) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object obj = map.get(str2);
        if (obj == null) {
            obj = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(str2, obj);
        }
        obj.getClass();
        return (DateTimeFormatter) obj;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final Alignment.Horizontal getMinimizedAlignment(TextFieldLabelPosition$Attached textFieldLabelPosition$Attached) {
        if (textFieldLabelPosition$Attached instanceof TextFieldLabelPosition$Attached) {
            return textFieldLabelPosition$Attached.minimizedAlignment;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) textFieldLabelPosition$Attached, "Unknown position: ");
        return null;
    }

    /* renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final String m568getString2EP1pXo(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration);
        return ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getResources().getString(i);
    }

    public static final float minimizedLabelHalfHeight(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        long j = ((Typography) gapComposer.consume(TypographyKt.LocalTypography)).bodySmall.paragraphStyle.lineHeight;
        long j2 = TypeScaleTokens.BodySmallLineHeight;
        if (!TextUnit.m1060isSpimpl(j)) {
            j = j2;
        }
        return ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(j) / 2.0f;
    }

    public static final int subtractConstraintSafely(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }
}
