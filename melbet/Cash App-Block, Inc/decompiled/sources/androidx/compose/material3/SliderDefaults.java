package androidx.compose.material3;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class SliderDefaults {
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float TickSize;
    public static final float TrackStopIndicatorSize;
    public static final AndroidPath trackPath;

    static {
        float f = SliderTokens.StopIndicatorSize;
        TrackStopIndicatorSize = f;
        TickSize = f;
        trackPath = AndroidPath_androidKt.Path();
    }

    public static SliderColors colors(Composer composer) {
        return getDefaultSliderColors$material3((ColorScheme) ((GapComposer) composer).consume(ColorSchemeKt.LocalColorScheme));
    }

    /* renamed from: drawTrackPath-zXTsYAs, reason: not valid java name */
    public static void m550drawTrackPathzXTsYAs(DrawScope drawScope, Orientation orientation, long j, long j2, long j3, float f, float f2) {
        RoundRect m3986RoundRectZAM2FJo;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax);
        if (orientation == Orientation.Vertical) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
            m3986RoundRectZAM2FJo = Strings.m3986RoundRectZAM2FJo(DBUtil.m1180Recttz77jQw(j, (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), floatToRawIntBits, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2);
        } else {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
            m3986RoundRectZAM2FJo = Strings.m3986RoundRectZAM2FJo(DBUtil.m1180Recttz77jQw(j, (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits);
        }
        AndroidPath androidPath = trackPath;
        AndroidPath.addRoundRect$default(androidPath, m3986RoundRectZAM2FJo);
        DrawScope.m745drawPathLG529CI$default(drawScope, androidPath, j3, RecyclerView.DECELERATION_RATE, null, 60);
        androidPath.rewind();
    }

    public static SliderColors getDefaultSliderColors$material3(ColorScheme colorScheme) {
        SliderColors sliderColors = colorScheme.defaultSliderColorsCached;
        if (sliderColors != null) {
            return sliderColors;
        }
        long fromToken = ColorSchemeKt.fromToken(colorScheme, SliderTokens.HandleColor);
        ColorSchemeKeyTokens colorSchemeKeyTokens = SliderTokens.ActiveTrackColor;
        long fromToken2 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = SliderTokens.InactiveTrackColor;
        long fromToken3 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens2);
        long fromToken4 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens2);
        long fromToken5 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens);
        long m684compositeOverOWjLjI = ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(SliderTokens.DisabledHandleOpacity, ColorSchemeKt.fromToken(colorScheme, SliderTokens.DisabledHandleColor), 14), colorScheme.surface);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = SliderTokens.DisabledActiveTrackColor;
        long fromToken6 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens3);
        float f = SliderTokens.DisabledActiveTrackOpacity;
        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(f, fromToken6, 14);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = SliderTokens.DisabledInactiveTrackColor;
        long fromToken7 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens4);
        float f2 = SliderTokens.DisabledInactiveTrackOpacity;
        SliderColors sliderColors2 = new SliderColors(fromToken, fromToken2, fromToken3, fromToken4, fromToken5, m684compositeOverOWjLjI, m675copywmQWz5c$default, Color.m675copywmQWz5c$default(f2, fromToken7, 14), Color.m675copywmQWz5c$default(f2, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens4), 14), Color.m675copywmQWz5c$default(f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens3), 14));
        colorScheme.defaultSliderColorsCached = sliderColors2;
        return sliderColors2;
    }

    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    public final void m551Thumb9LiSoMs(final MutableInteractionSourceImpl mutableInteractionSourceImpl, Modifier modifier, final SliderColors sliderColors, final boolean z, long j, Composer composer, final int i) {
        final Modifier modifier2;
        final long j2;
        Modifier modifier3;
        Modifier then;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-290277409);
        int i2 = i | (gapComposer.changed(mutableInteractionSourceImpl) ? 4 : 2) | 48 | (gapComposer.changed(sliderColors) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024) | 24576;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                j2 = SliderKt.ThumbSize;
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                j2 = j;
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new SnapshotStateList();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            boolean z2 = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSourceImpl, snapshotStateList, null, i3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, mutableInteractionSourceImpl, (Function2) rememberedValue2);
            then = SizeKt.m286size6HolHcs(!snapshotStateList.isEmpty() ? (Float.floatToRawIntBits(DpSize.m1044getWidthD9Ej5fM(j2) / 2.0f) << 32) | (Float.floatToRawIntBits(DpSize.m1043getHeightD9Ej5fM(j2)) & BodyPartID.bodyIdMax) : j2, modifier3).then(new HoverableElement(mutableInteractionSourceImpl));
            SpacerKt.Spacer(gapComposer, ImageKt.m177backgroundbw27NRU(then, z ? sliderColors.thumbColor : sliderColors.disabledThumbColor, ShapesKt.getValue(SliderTokens.HandleShape, gapComposer)));
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            j2 = j;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(mutableInteractionSourceImpl, modifier2, sliderColors, z, j2, i) { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda2
                public final /* synthetic */ MutableInteractionSourceImpl f$1;
                public final /* synthetic */ Modifier f$2;
                public final /* synthetic */ SliderColors f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ long f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(196609);
                    SliderDefaults.this.m551Thumb9LiSoMs(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: Track-4EFweAY, reason: not valid java name */
    public final void m552Track4EFweAY(final SliderState sliderState, Modifier modifier, final boolean z, final SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        final Function2 function22;
        final Function3 function32;
        final float f3;
        GapComposer gapComposer;
        final float f4;
        int i3;
        Function2 function23;
        float f5;
        Function3 function33;
        Modifier modifier3;
        float f6;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(49984771);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= gapComposer2.changed(sliderColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= PKIFailureInfo.certRevoked;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= gapComposer2.changed(this) ? 67108864 : 33554432;
        }
        int i6 = 0;
        if (gapComposer2.shouldExecute(i5 & 1, (38347923 & i5) != 38347922)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && gapComposer2.changed(sliderColors)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (z2 || rememberedValue == obj) {
                    rememberedValue = new SliderDefaults$$ExternalSyntheticLambda0(sliderColors, z, i6);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Function2 function24 = (Function2) rememberedValue;
                i3 = i5 & (-57345);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = SliderDefaults$Track$5$1.INSTANCE;
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                float f7 = SliderKt.ThumbTrackGapSize;
                function23 = function24;
                f5 = SliderKt.TrackInsideCornerSize;
                function33 = (Function3) rememberedValue2;
                modifier3 = Modifier.Companion.$$INSTANCE;
                f6 = f7;
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i5 & (-57345);
                modifier3 = modifier;
                function23 = function2;
                function33 = function3;
                f6 = f;
                f5 = f2;
            }
            gapComposer2.endDefaults();
            int i7 = i3 << 3;
            m553TrackImplVvwgllI(sliderState, modifier3, z, sliderColors, function23, function33, f6, f5, gapComposer2, 805306416 | (i3 & 14) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024), ((i3 >> 21) & 112) | 6);
            modifier2 = modifier3;
            gapComposer = gapComposer2;
            f4 = f5;
            f3 = f6;
            function32 = function33;
            function22 = function23;
        } else {
            gapComposer2.skipToGroupEnd();
            modifier2 = modifier;
            function22 = function2;
            function32 = function3;
            f3 = f;
            gapComposer = gapComposer2;
            f4 = f2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    SliderDefaults.this.m552Track4EFweAY(sliderState, modifier2, z, sliderColors, function22, function32, f3, f4, (Composer) obj2, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: TrackImpl-VvwgllI, reason: not valid java name */
    public final void m553TrackImplVvwgllI(final SliderState sliderState, final Modifier modifier, final boolean z, final SliderColors sliderColors, final Function2 function2, final Function3 function3, final float f, final float f2, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        GapComposer gapComposer;
        long j;
        long j2;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(133396521);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(Float.NaN) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changed(sliderColors) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer2.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer2.changedInstance(function3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            f3 = f;
            i3 |= gapComposer2.changed(f3) ? 8388608 : 4194304;
        } else {
            f3 = f;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changed(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changed(false) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long m549trackColorWaAFU9c$material3 = sliderColors.m549trackColorWaAFU9c$material3(z, false);
            long m549trackColorWaAFU9c$material32 = sliderColors.m549trackColorWaAFU9c$material3(z, true);
            if (z) {
                j = m549trackColorWaAFU9c$material32;
                j2 = sliderColors.inactiveTickColor;
            } else {
                j = m549trackColorWaAFU9c$material32;
                j2 = sliderColors.disabledInactiveTickColor;
            }
            long j3 = z ? sliderColors.activeTickColor : sliderColors.disabledActiveTickColor;
            Modifier fillMaxHeight = sliderState.orientation == Orientation.Vertical ? SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(modifier, SliderKt.TrackHeight), 1.0f) : SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier, 1.0f), SliderKt.TrackHeight);
            int i5 = i3 & 112;
            int i6 = i3;
            boolean changedInstance = (i5 == 32) | gapComposer2.changedInstance(sliderState);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SliderDefaults$$ExternalSyntheticLambda3(sliderState, 0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier then = fillMaxHeight.then(ValueInsets.layout(Modifier.Companion.$$INSTANCE, (Function3) rememberedValue));
            boolean changedInstance2 = gapComposer2.changedInstance(sliderState) | (i5 == 32) | gapComposer2.changed(m549trackColorWaAFU9c$material3) | gapComposer2.changed(j) | gapComposer2.changed(j2) | gapComposer2.changed(j3) | ((i6 & 29360128) == 8388608) | ((i6 & 234881024) == 67108864) | ((i6 & 458752) == 131072) | ((i6 & 3670016) == 1048576) | ((i6 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                final long j4 = j3;
                gapComposer = gapComposer2;
                final long j5 = j2;
                modifier2 = then;
                final float f4 = f3;
                final long j6 = j;
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda4
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0253  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        float mo236toPx0680j_4;
                        long j7;
                        int mo753getSizeNHjbRc;
                        float f5;
                        Orientation orientation;
                        float f6;
                        char c;
                        Function2 function22;
                        float f7;
                        float f8;
                        long floatToRawIntBits;
                        int floatToRawIntBits2;
                        long j8;
                        long floatToRawIntBits3;
                        int floatToRawIntBits4;
                        DrawScope drawScope;
                        Orientation orientation2;
                        long floatToRawIntBits5;
                        int floatToRawIntBits6;
                        long j9;
                        long floatToRawIntBits7;
                        int floatToRawIntBits8;
                        DrawScope drawScope2;
                        long floatToRawIntBits9;
                        int floatToRawIntBits10;
                        long j10;
                        long floatToRawIntBits11;
                        int floatToRawIntBits12;
                        long floatToRawIntBits13;
                        float mo236toPx0680j_42;
                        float mo236toPx0680j_43;
                        DrawScope drawScope3 = (DrawScope) obj;
                        boolean m1037equalsimpl0 = Dp.m1037equalsimpl0(Float.NaN, Float.NaN);
                        SliderState sliderState2 = SliderState.this;
                        if (m1037equalsimpl0) {
                            mo236toPx0680j_4 = (sliderState2.orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (drawScope3.mo753getSizeNHjbRc() >> 32)) : Float.intBitsToFloat((int) (drawScope3.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) / 2.0f;
                        } else {
                            mo236toPx0680j_4 = drawScope3.mo236toPx0680j_4(Float.NaN);
                        }
                        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                        float[] fArr = sliderState2.tickFractions;
                        float coercedValueAsFraction = sliderState2.getCoercedValueAsFraction();
                        int i7 = 0;
                        float mo233toDpu2uoSUM = drawScope3.mo233toDpu2uoSUM(0);
                        float mo233toDpu2uoSUM2 = drawScope3.mo233toDpu2uoSUM(0);
                        float mo233toDpu2uoSUM3 = drawScope3.mo233toDpu2uoSUM(sliderState2.thumbWidth$delegate.getIntValue());
                        float mo233toDpu2uoSUM4 = drawScope3.mo233toDpu2uoSUM(sliderState2.thumbHeight$delegate.getIntValue());
                        float mo232toDpu2uoSUM = drawScope3.mo232toDpu2uoSUM(mo236toPx0680j_4);
                        Orientation orientation3 = sliderState2.orientation;
                        boolean z2 = orientation3 == Orientation.Vertical;
                        boolean z3 = drawScope3.getLayoutDirection() == LayoutDirection.Rtl;
                        boolean z4 = z3 && !z2;
                        float mo236toPx0680j_44 = drawScope3.mo236toPx0680j_4(mo232toDpu2uoSUM);
                        if (z2) {
                            j7 = 4294967295L;
                            mo753getSizeNHjbRc = (int) (drawScope3.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax);
                        } else {
                            j7 = 4294967295L;
                            mo753getSizeNHjbRc = (int) (drawScope3.mo753getSizeNHjbRc() >> 32);
                        }
                        float intBitsToFloat = Float.intBitsToFloat(mo753getSizeNHjbRc);
                        fArr.getClass();
                        if (Intrinsics.areEqual(RecyclerView.DECELERATION_RATE, fArr.length == 0 ? null : Float.valueOf(fArr[0])) || Intrinsics.areEqual(RecyclerView.DECELERATION_RATE, ArraysKt___ArraysKt.lastOrNull(fArr))) {
                        }
                        float m = (fArr.length == 0 || (Intrinsics.areEqual(coercedValueAsFraction, fArr.length != 0 ? Float.valueOf(fArr[0]) : null) || Intrinsics.areEqual(coercedValueAsFraction, ArraysKt___ArraysKt.lastOrNull(fArr)))) ? CameraState$Type$EnumUnboxingLocalUtility.m(intBitsToFloat, RecyclerView.DECELERATION_RATE, coercedValueAsFraction, RecyclerView.DECELERATION_RATE) : (((intBitsToFloat - RecyclerView.DECELERATION_RATE) - (mo236toPx0680j_44 * 2.0f)) * coercedValueAsFraction) + RecyclerView.DECELERATION_RATE + mo236toPx0680j_44;
                        int length = fArr.length;
                        float mo236toPx0680j_45 = drawScope3.mo236toPx0680j_4(f2);
                        float f9 = f4;
                        if (Dp.m1036compareTo0680j_4(f9, RecyclerView.DECELERATION_RATE) > 0) {
                            if (z2) {
                                drawScope3.mo236toPx0680j_4(mo233toDpu2uoSUM2);
                                drawScope3.mo236toPx0680j_4(f9);
                                mo236toPx0680j_42 = drawScope3.mo236toPx0680j_4(mo233toDpu2uoSUM4) / 2.0f;
                                mo236toPx0680j_43 = drawScope3.mo236toPx0680j_4(f9);
                            } else {
                                drawScope3.mo236toPx0680j_4(mo233toDpu2uoSUM);
                                drawScope3.mo236toPx0680j_4(f9);
                                mo236toPx0680j_42 = drawScope3.mo236toPx0680j_4(mo233toDpu2uoSUM3) / 2.0f;
                                mo236toPx0680j_43 = drawScope3.mo236toPx0680j_4(f9);
                            }
                            f5 = mo236toPx0680j_43 + mo236toPx0680j_42;
                        } else {
                            f5 = 0.0f;
                        }
                        long mo752getCenterF1C5BW0 = drawScope3.mo752getCenterF1C5BW0();
                        Float.intBitsToFloat((int) (z2 ? mo752getCenterF1C5BW0 & j7 : mo752getCenterF1C5BW0 >> 32));
                        float f10 = (intBitsToFloat - f5) - mo236toPx0680j_44;
                        Function2 function23 = function2;
                        if (m < f10) {
                            float f11 = z4 ? mo236toPx0680j_44 : mo236toPx0680j_45;
                            float f12 = z4 ? mo236toPx0680j_45 : mo236toPx0680j_44;
                            float f13 = m + f5;
                            float f14 = intBitsToFloat - f13;
                            if (z2) {
                                floatToRawIntBits7 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                                floatToRawIntBits8 = Float.floatToRawIntBits(f13);
                                f6 = 0.0f;
                                c = ' ';
                            } else {
                                f6 = 0.0f;
                                c = ' ';
                                if (z3) {
                                    floatToRawIntBits7 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                                    floatToRawIntBits8 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                                } else {
                                    floatToRawIntBits7 = Float.floatToRawIntBits(f13);
                                    floatToRawIntBits8 = Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE);
                                }
                            }
                            long j11 = (floatToRawIntBits7 << c) | (floatToRawIntBits8 & j7);
                            if (z2) {
                                floatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.mo753getSizeNHjbRc() >> c)));
                                drawScope2 = drawScope3;
                                j10 = Float.floatToRawIntBits(f14);
                            } else {
                                drawScope2 = drawScope3;
                                if (z3) {
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> c)) - f13;
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & j7));
                                    floatToRawIntBits9 = Float.floatToRawIntBits(intBitsToFloat2);
                                    floatToRawIntBits10 = Float.floatToRawIntBits(intBitsToFloat3);
                                } else {
                                    float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & j7));
                                    floatToRawIntBits9 = Float.floatToRawIntBits(f14);
                                    floatToRawIntBits10 = Float.floatToRawIntBits(intBitsToFloat4);
                                }
                                j10 = floatToRawIntBits10;
                            }
                            long j12 = (j10 & j7) | (floatToRawIntBits9 << c);
                            function22 = function23;
                            drawScope3 = drawScope2;
                            orientation = orientation3;
                            SliderDefaults.m550drawTrackPathzXTsYAs(drawScope3, orientation, j11, j12, m549trackColorWaAFU9c$material3, f11, f12);
                            if (z2) {
                                floatToRawIntBits11 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.mo752getCenterF1C5BW0() >> c)));
                                floatToRawIntBits12 = Float.floatToRawIntBits(intBitsToFloat - mo236toPx0680j_44);
                            } else if (z3) {
                                floatToRawIntBits13 = (Float.floatToRawIntBits(mo236toPx0680j_44) << c) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.mo752getCenterF1C5BW0() & j7))) & j7);
                                if (function22 != null) {
                                    function22.invoke(drawScope3, new Offset(floatToRawIntBits13));
                                }
                            } else {
                                float intBitsToFloat5 = Float.intBitsToFloat((int) (drawScope3.mo752getCenterF1C5BW0() & j7));
                                floatToRawIntBits11 = Float.floatToRawIntBits(intBitsToFloat - mo236toPx0680j_44);
                                floatToRawIntBits12 = Float.floatToRawIntBits(intBitsToFloat5);
                            }
                            floatToRawIntBits13 = (floatToRawIntBits12 & j7) | (floatToRawIntBits11 << c);
                            if (function22 != null) {
                            }
                        } else {
                            orientation = orientation3;
                            f6 = 0.0f;
                            c = ' ';
                            function22 = function23;
                        }
                        float f15 = m - f5;
                        float f16 = !z4 ? mo236toPx0680j_44 : mo236toPx0680j_45;
                        float f17 = z4 ? mo236toPx0680j_44 : mo236toPx0680j_45;
                        float f18 = z4 ? f15 : f15 - f6;
                        if (f18 > f16) {
                            if (z2) {
                                floatToRawIntBits3 = Float.floatToRawIntBits(f6);
                                floatToRawIntBits4 = Float.floatToRawIntBits(f6);
                            } else if (z3) {
                                floatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.mo753getSizeNHjbRc() >> c)) - f15);
                                floatToRawIntBits4 = Float.floatToRawIntBits(f6);
                            } else {
                                floatToRawIntBits3 = Float.floatToRawIntBits(f6);
                                floatToRawIntBits4 = Float.floatToRawIntBits(f6);
                            }
                            long j13 = (floatToRawIntBits3 << c) | (floatToRawIntBits4 & j7);
                            if (z2) {
                                drawScope = drawScope3;
                                orientation2 = orientation;
                                j9 = (Float.floatToRawIntBits(f18) & j7) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.mo753getSizeNHjbRc() >> c))) << c);
                            } else {
                                drawScope = drawScope3;
                                orientation2 = orientation;
                                if (z3) {
                                    float intBitsToFloat6 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & j7));
                                    floatToRawIntBits5 = Float.floatToRawIntBits(f15);
                                    floatToRawIntBits6 = Float.floatToRawIntBits(intBitsToFloat6);
                                } else {
                                    float intBitsToFloat7 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & j7));
                                    floatToRawIntBits5 = Float.floatToRawIntBits(f18);
                                    floatToRawIntBits6 = Float.floatToRawIntBits(intBitsToFloat7);
                                }
                                j9 = (floatToRawIntBits5 << c) | (floatToRawIntBits6 & j7);
                            }
                            long j14 = j9;
                            drawScope3 = drawScope;
                            SliderDefaults.m550drawTrackPathzXTsYAs(drawScope3, orientation2, j13, j14, j6, f16, f17);
                        }
                        float f19 = f6 + mo236toPx0680j_44;
                        float f20 = intBitsToFloat - mo236toPx0680j_44;
                        float f21 = m - f5;
                        float f22 = m + f5;
                        int length2 = fArr.length;
                        int i8 = 0;
                        while (i7 < length2) {
                            float f23 = fArr[i7];
                            int i9 = i8 + 1;
                            if (function22 == null || i8 != fArr.length - 1) {
                                float lerp = TransactorKt.lerp(f19, f20, f23);
                                if (lerp < f21 || lerp > f22) {
                                    if (z2) {
                                        floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.mo752getCenterF1C5BW0() >> c)));
                                        f7 = f19;
                                        f8 = f21;
                                        j8 = Float.floatToRawIntBits(lerp);
                                    } else {
                                        f7 = f19;
                                        f8 = f21;
                                        if (z3) {
                                            float intBitsToFloat8 = Float.intBitsToFloat((int) (drawScope3.mo753getSizeNHjbRc() >> c)) - lerp;
                                            float intBitsToFloat9 = Float.intBitsToFloat((int) (drawScope3.mo752getCenterF1C5BW0() & j7));
                                            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat8);
                                            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat9);
                                        } else {
                                            float intBitsToFloat10 = Float.intBitsToFloat((int) (drawScope3.mo752getCenterF1C5BW0() & j7));
                                            floatToRawIntBits = Float.floatToRawIntBits(lerp);
                                            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat10);
                                        }
                                        j8 = floatToRawIntBits2;
                                    }
                                    function3.invoke(drawScope3, new Offset((j8 & j7) | (floatToRawIntBits << c)), new Color((lerp < f6 || lerp > f15) ? j5 : j4));
                                    i7++;
                                    i8 = i9;
                                    f19 = f7;
                                    f21 = f8;
                                }
                            }
                            f7 = f19;
                            f8 = f21;
                            i7++;
                            i8 = i9;
                            f19 = f7;
                            f21 = f8;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(function1);
                rememberedValue2 = function1;
            } else {
                gapComposer = gapComposer2;
                modifier2 = then;
            }
            CanvasKt.Canvas(0, gapComposer, modifier2, (Function1) rememberedValue2);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SliderDefaults.this.m553TrackImplVvwgllI(sliderState, modifier, z, sliderColors, function2, function3, f, f2, (Composer) obj, Updater.updateChangedFlags(i | 1), Updater.updateChangedFlags(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
