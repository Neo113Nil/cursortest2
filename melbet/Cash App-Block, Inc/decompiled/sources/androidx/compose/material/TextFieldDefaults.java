package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.animation.CrossfadeKt$Crossfade$3$1;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;
import app.cash.trifle.Trifle;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public final class TextFieldDefaults {
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    public static final TextFieldDefaults INSTANCE$1 = new TextFieldDefaults();

    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public static DefaultTextFieldColors m506textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i) {
        long j14;
        long j15;
        long j16;
        double d;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        if ((i & 1) != 0) {
            GapComposer gapComposer = (GapComposer) composer;
            j14 = Color.m675copywmQWz5c$default(((Number) gapComposer.consume(ContentAlphaKt.LocalContentAlpha)).floatValue(), ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value, 14);
        } else {
            j14 = j;
        }
        if ((i & 2) != 0) {
            GapComposer gapComposer2 = (GapComposer) composer;
            long j25 = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
            if (((Colors) gapComposer2.consume(ColorsKt.LocalColors)).isLight()) {
                ColorKt.m690luminance8_81llA(j25);
            } else {
                ColorKt.m690luminance8_81llA(j25);
            }
            j15 = Color.m675copywmQWz5c$default(0.38f, j14, 14);
        } else {
            j15 = j2;
        }
        long m675copywmQWz5c$default = (i & 4) != 0 ? Color.m675copywmQWz5c$default(0.12f, ((Colors) ((GapComposer) composer).consume(ColorsKt.LocalColors)).m484getOnSurface0d7_KjU(), 14) : j3;
        long m485getPrimary0d7_KjU = (i & 8) != 0 ? ((Colors) ((GapComposer) composer).consume(ColorsKt.LocalColors)).m485getPrimary0d7_KjU() : j4;
        long m483getError0d7_KjU = (i & 16) != 0 ? ((Colors) ((GapComposer) composer).consume(ColorsKt.LocalColors)).m483getError0d7_KjU() : j5;
        if ((i & 32) != 0) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorsKt.LocalColors;
            GapComposer gapComposer3 = (GapComposer) composer;
            j16 = j14;
            long m485getPrimary0d7_KjU2 = ((Colors) gapComposer3.consume(staticProvidableCompositionLocal)).m485getPrimary0d7_KjU();
            d = 0.5d;
            long j26 = ((Color) gapComposer3.consume(ContentColorKt.LocalContentColor)).value;
            j17 = Color.m675copywmQWz5c$default((!((Colors) gapComposer3.consume(staticProvidableCompositionLocal)).isLight() ? ((double) ColorKt.m690luminance8_81llA(j26)) < 0.5d : ((double) ColorKt.m690luminance8_81llA(j26)) > 0.5d) ? 0.87f : 1.0f, m485getPrimary0d7_KjU2, 14);
        } else {
            j16 = j14;
            d = 0.5d;
            j17 = j6;
        }
        long m675copywmQWz5c$default2 = (i & 64) != 0 ? Color.m675copywmQWz5c$default(0.42f, ((Colors) ((GapComposer) composer).consume(ColorsKt.LocalColors)).m484getOnSurface0d7_KjU(), 14) : j7;
        if ((i & 128) != 0) {
            GapComposer gapComposer4 = (GapComposer) composer;
            long j27 = ((Color) gapComposer4.consume(ContentColorKt.LocalContentColor)).value;
            if (((Colors) gapComposer4.consume(ColorsKt.LocalColors)).isLight()) {
                ColorKt.m690luminance8_81llA(j27);
            } else {
                ColorKt.m690luminance8_81llA(j27);
            }
            j18 = Color.m675copywmQWz5c$default(0.38f, m675copywmQWz5c$default2, 14);
        } else {
            j18 = j8;
        }
        long m483getError0d7_KjU2 = (i & 256) != 0 ? ((Colors) ((GapComposer) composer).consume(ColorsKt.LocalColors)).m483getError0d7_KjU() : j9;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ColorsKt.LocalColors;
        long j28 = j15;
        long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(0.54f, ((Colors) ((GapComposer) composer).consume(staticProvidableCompositionLocal2)).m484getOnSurface0d7_KjU(), 14);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.LocalContentColor;
        GapComposer gapComposer5 = (GapComposer) composer;
        long j29 = m483getError0d7_KjU2;
        long j30 = ((Color) gapComposer5.consume(dynamicProvidableCompositionLocal)).value;
        if (((Colors) gapComposer5.consume(staticProvidableCompositionLocal2)).isLight()) {
            ColorKt.m690luminance8_81llA(j30);
        } else {
            ColorKt.m690luminance8_81llA(j30);
        }
        long m675copywmQWz5c$default4 = Color.m675copywmQWz5c$default(0.38f, m675copywmQWz5c$default3, 14);
        long m675copywmQWz5c$default5 = Color.m675copywmQWz5c$default(0.54f, ((Colors) ((GapComposer) composer).consume(staticProvidableCompositionLocal2)).m484getOnSurface0d7_KjU(), 14);
        GapComposer gapComposer6 = (GapComposer) composer;
        long j31 = m675copywmQWz5c$default2;
        long j32 = ((Color) gapComposer6.consume(dynamicProvidableCompositionLocal)).value;
        if (((Colors) gapComposer6.consume(staticProvidableCompositionLocal2)).isLight()) {
            ColorKt.m690luminance8_81llA(j32);
        } else {
            ColorKt.m690luminance8_81llA(j32);
        }
        long m675copywmQWz5c$default6 = Color.m675copywmQWz5c$default(0.38f, m675copywmQWz5c$default5, 14);
        long m483getError0d7_KjU3 = ((Colors) ((GapComposer) composer).consume(staticProvidableCompositionLocal2)).m483getError0d7_KjU();
        if ((i & 32768) != 0) {
            GapComposer gapComposer7 = (GapComposer) composer;
            long m485getPrimary0d7_KjU3 = ((Colors) gapComposer7.consume(staticProvidableCompositionLocal2)).m485getPrimary0d7_KjU();
            j19 = m675copywmQWz5c$default5;
            long j33 = ((Color) gapComposer7.consume(dynamicProvidableCompositionLocal)).value;
            j20 = Color.m675copywmQWz5c$default((!((Colors) gapComposer7.consume(staticProvidableCompositionLocal2)).isLight() ? ((double) ColorKt.m690luminance8_81llA(j33)) < d : ((double) ColorKt.m690luminance8_81llA(j33)) > d) ? 0.87f : 1.0f, m485getPrimary0d7_KjU3, 14);
        } else {
            j19 = m675copywmQWz5c$default5;
            j20 = j10;
        }
        float f = 0.6f;
        if ((i & 65536) != 0) {
            GapComposer gapComposer8 = (GapComposer) composer;
            long m484getOnSurface0d7_KjU = ((Colors) gapComposer8.consume(staticProvidableCompositionLocal2)).m484getOnSurface0d7_KjU();
            long j34 = ((Color) gapComposer8.consume(dynamicProvidableCompositionLocal)).value;
            j21 = Color.m675copywmQWz5c$default((!((Colors) gapComposer8.consume(staticProvidableCompositionLocal2)).isLight() ? ((double) ColorKt.m690luminance8_81llA(j34)) < d : ((double) ColorKt.m690luminance8_81llA(j34)) > d) ? 0.6f : 0.74f, m484getOnSurface0d7_KjU, 14);
        } else {
            j21 = j11;
        }
        GapComposer gapComposer9 = (GapComposer) composer;
        long j35 = ((Color) gapComposer9.consume(dynamicProvidableCompositionLocal)).value;
        if (((Colors) gapComposer9.consume(staticProvidableCompositionLocal2)).isLight()) {
            ColorKt.m690luminance8_81llA(j35);
        } else {
            ColorKt.m690luminance8_81llA(j35);
        }
        long m675copywmQWz5c$default7 = Color.m675copywmQWz5c$default(0.38f, j21, 14);
        long m483getError0d7_KjU4 = ((Colors) ((GapComposer) composer).consume(staticProvidableCompositionLocal2)).m483getError0d7_KjU();
        if ((i & PKIFailureInfo.signerNotTrusted) != 0) {
            GapComposer gapComposer10 = (GapComposer) composer;
            long m484getOnSurface0d7_KjU2 = ((Colors) gapComposer10.consume(staticProvidableCompositionLocal2)).m484getOnSurface0d7_KjU();
            j22 = j21;
            long j36 = ((Color) gapComposer10.consume(dynamicProvidableCompositionLocal)).value;
            if (!((Colors) gapComposer10.consume(staticProvidableCompositionLocal2)).isLight() ? ColorKt.m690luminance8_81llA(j36) < d : ColorKt.m690luminance8_81llA(j36) > d) {
                f = 0.74f;
            }
            j23 = Color.m675copywmQWz5c$default(f, m484getOnSurface0d7_KjU2, 14);
        } else {
            j22 = j21;
            j23 = j12;
        }
        if ((i & PKIFailureInfo.badCertTemplate) != 0) {
            GapComposer gapComposer11 = (GapComposer) composer;
            long j37 = ((Color) gapComposer11.consume(dynamicProvidableCompositionLocal)).value;
            if (((Colors) gapComposer11.consume(staticProvidableCompositionLocal2)).isLight()) {
                ColorKt.m690luminance8_81llA(j37);
            } else {
                ColorKt.m690luminance8_81llA(j37);
            }
            j24 = Color.m675copywmQWz5c$default(0.38f, j23, 14);
        } else {
            j24 = j13;
        }
        return new DefaultTextFieldColors(j16, j28, m485getPrimary0d7_KjU, m483getError0d7_KjU, j17, j31, j29, j18, m675copywmQWz5c$default3, m675copywmQWz5c$default4, m675copywmQWz5c$default3, j19, m675copywmQWz5c$default6, m483getError0d7_KjU3, m675copywmQWz5c$default, j20, j22, m675copywmQWz5c$default7, m483getError0d7_KjU4, j23, j24);
    }

    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    public void m507BorderBoxnbWgWpA(final boolean z, final boolean z2, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final TextFieldColors textFieldColors, final Shape shape, float f, float f2, Composer composer, final int i) {
        final float f3;
        final float f4;
        int i2;
        float f5;
        float f6;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(943754022);
        int i3 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(z2) ? 32 : 16) | (gapComposer.changed(mutableInteractionSourceImpl) ? 256 : 128) | (gapComposer.changed(textFieldColors) ? 2048 : 1024) | (gapComposer.changed(shape) ? 16384 : PKIFailureInfo.certRevoked) | 589824;
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i2 = i3 & (-4128769);
                f5 = 2.0f;
                f6 = 1.0f;
            } else {
                gapComposer.skipToGroupEnd();
                i2 = i3 & (-4128769);
                f5 = f;
                f6 = f2;
            }
            gapComposer.endDefaults();
            BorderStroke borderStroke = (BorderStroke) CardKt.m474access$animateBorderStrokeAsStateNuRrP5Q(z, z2, mutableInteractionSourceImpl, textFieldColors, f5, f6, gapComposer, i2 & 8190).getValue();
            BoxKt.Box(ImageKt.m179borderziNgDLE(Modifier.Companion.$$INSTANCE, borderStroke.m172getWidthD9Ej5fM(), borderStroke.getBrush(), shape), gapComposer, 0);
            f3 = f5;
            f4 = f6;
        } else {
            gapComposer.skipToGroupEnd();
            f3 = f;
            f4 = f2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(z, z2, mutableInteractionSourceImpl, textFieldColors, shape, f3, f4, i) { // from class: androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda1
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ MutableInteractionSourceImpl f$3;
                public final /* synthetic */ TextFieldColors f$4;
                public final /* synthetic */ Shape f$5;
                public final /* synthetic */ float f$6;
                public final /* synthetic */ float f$7;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(12582913);
                    TextFieldDefaults.this.m507BorderBoxnbWgWpA(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void OutlinedTextFieldDecorationBox(final String str, final Function2 function2, final boolean z, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final boolean z2, final Function2 function22, final Function2 function23, final Function2 function24, final Shape shape, final TextFieldColors textFieldColors, PaddingValues paddingValues, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        String str2;
        int i2;
        Function2 function25;
        boolean z3;
        Function2 function26;
        GapComposer gapComposer;
        final PaddingValues paddingValues2;
        int i3;
        PaddingValues paddingValuesImpl;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1154925202);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer2.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            function25 = function2;
            i2 |= gapComposer2.changedInstance(function25) ? 32 : 16;
        } else {
            function25 = function2;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z3 = z;
            i2 |= gapComposer2.changed(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(VisualTransformation.Companion.None) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i2 |= gapComposer2.changed(mutableInteractionSourceImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= gapComposer2.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer2.changedInstance(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function26 = function22;
            i2 |= gapComposer2.changedInstance(function26) ? 67108864 : 33554432;
        } else {
            function26 = function22;
        }
        if ((i & 805306368) == 0) {
            i2 |= gapComposer2.changedInstance(function23) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i4 = 221184 | (gapComposer2.changedInstance(function24) ? 4 : 2) | (gapComposer2.changed(shape) ? 32 : 16) | (gapComposer2.changed(textFieldColors) ? 256 : 128) | 1024;
        if (gapComposer2.shouldExecute(i2 & 1, ((306783379 & i2) == 306783378 && (74899 & i4) == 74898) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                i3 = i4 & (-7169);
                paddingValuesImpl = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i4 & (-7169);
                paddingValuesImpl = paddingValues;
            }
            gapComposer2.endDefaults();
            int i5 = i2 << 3;
            int i6 = i2 >> 9;
            int i7 = i3 << 6;
            gapComposer = gapComposer2;
            String str3 = str2;
            Function2 function27 = function26;
            Function2 function28 = function25;
            boolean z4 = z3;
            CardKt.CommonDecorationBox(TextFieldType.Outlined, str3, function28, function27, function23, function24, false, z4, z2, mutableInteractionSourceImpl, paddingValuesImpl, shape, textFieldColors, composableLambdaImpl, gapComposer, (i5 & 896) | (i5 & 112) | 6 | ((i2 >> 3) & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | ((i3 << 21) & 29360128) | ((i2 << 15) & 234881024) | ((i2 << 21) & 1879048192), ((i2 >> 12) & 112) | ((i2 >> 18) & 14) | (i7 & 7168) | (i7 & 57344) | 196608);
            paddingValues2 = paddingValuesImpl;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, mutableInteractionSourceImpl, z2, function22, function23, function24, shape, textFieldColors, paddingValues2, composableLambdaImpl, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void TextFieldDecorationBox(String str, Function2 function2, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, Function2 function22, Shape shape, DefaultTextFieldColors defaultTextFieldColors, PaddingValuesImpl paddingValuesImpl, Composer composer, int i) {
        int i2;
        boolean z2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        GapComposer gapComposer;
        Shape shape2;
        int i3;
        Shape copy$default;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2088762355);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i2 |= gapComposer2.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(VisualTransformation.Companion.None) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            i2 |= gapComposer2.changed(mutableInteractionSourceImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        int i4 = i2 | 14155776;
        if ((100663296 & i) == 0) {
            i4 |= gapComposer2.changedInstance(function22) ? 67108864 : 33554432;
        }
        int i5 = i4 | 805306368;
        int i6 = (gapComposer2.changed(defaultTextFieldColors) ? 256 : 128) | 27670;
        if (gapComposer2.shouldExecute(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                CornerBasedShape cornerBasedShape = ((Shapes) gapComposer2.consume(ShapesKt.LocalShapes)).small;
                Trifle trifle = CornerSizeKt.ZeroCornerSize;
                i3 = i6 & (-113);
                copy$default = CornerBasedShape.copy$default(cornerBasedShape, null, null, trifle, trifle, 3);
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i6 & (-113);
                copy$default = shape;
            }
            gapComposer2.endDefaults();
            int i7 = i5 << 3;
            int i8 = i5 >> 9;
            gapComposer = gapComposer2;
            CardKt.CommonDecorationBox(TextFieldType.Filled, str, function2, function22, null, null, true, z2, false, mutableInteractionSourceImpl2, paddingValuesImpl, copy$default, defaultTextFieldColors, null, gapComposer, (i7 & 896) | (i7 & 112) | 6 | ((i5 >> 3) & 7168) | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | 12582912 | ((i5 << 15) & 234881024) | ((i5 << 21) & 1879048192), ((i5 >> 12) & 112) | ((i5 >> 18) & 14) | 196608 | MLKEMEngine.KyberPolyBytes | ((i3 << 6) & 57344));
            shape2 = copy$default;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            shape2 = shape;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldDefaults$$ExternalSyntheticLambda3(this, str, function2, z, mutableInteractionSourceImpl, function22, shape2, defaultTextFieldColors, paddingValuesImpl, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0150, code lost:
    
        if (r30 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0129, code lost:
    
        if (r30 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018c  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m508TransitionDTcfvLk(InputPhase inputPhase, long j, long j2, TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        float f;
        int ordinal;
        float f2;
        int ordinal2;
        float f3;
        int ordinal3;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        CrossfadeKt$Crossfade$3$1 crossfadeKt$Crossfade$3$1 = CrossfadeKt$Crossfade$3$1.INSTANCE$9;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(509439888);
        int i2 = i | (gapComposer.changed(inputPhase.ordinal()) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(j2) ? 256 : 128) | (gapComposer.changedInstance(textFieldImplKt$CommonDecorationBox$labelColor$1) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Transition updateTransition = AnimatableKt.updateTransition(inputPhase, "TextFieldInputState", gapComposer, (i2 & 14) | 48, 0);
            InteractionResult interactionResult = updateTransition.transitionState;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = updateTransition.targetState$delegate;
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
            InputPhase inputPhase2 = (InputPhase) interactionResult.getCurrentState();
            gapComposer.startReplaceGroup(389927550);
            int ordinal4 = inputPhase2.ordinal();
            float f4 = RecyclerView.DECELERATION_RATE;
            if (ordinal4 != 0) {
                if (ordinal4 == 1) {
                    f = 0.0f;
                    gapComposer.end(false);
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase3 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer.startReplaceGroup(389927550);
                    ordinal = inputPhase3.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f2 = 0.0f;
                            gapComposer.end(false);
                            Float valueOf2 = Float.valueOf(f2);
                            updateTransition.getSegment();
                            gapComposer.startReplaceGroup(-883519390);
                            TweenSpec tween$default = AnimatableKt.tween$default(150, 0, null, 6);
                            gapComposer.end(false);
                            Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, tween$default, twoWayConverterImpl, gapComposer, 196608);
                            FullScreenKt$$ExternalSyntheticLambda0 fullScreenKt$$ExternalSyntheticLambda0 = new FullScreenKt$$ExternalSyntheticLambda0(8);
                            InputPhase inputPhase4 = (InputPhase) interactionResult.getCurrentState();
                            gapComposer.startReplaceGroup(1246942589);
                            ordinal2 = inputPhase4.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                gapComposer.end(false);
                                Float valueOf3 = Float.valueOf(f3);
                                InputPhase inputPhase5 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                gapComposer.startReplaceGroup(1246942589);
                                ordinal3 = inputPhase5.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return;
                                        }
                                    }
                                    gapComposer.end(false);
                                    Transition.TransitionAnimationState createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f4), (FiniteAnimationSpec) fullScreenKt$$ExternalSyntheticLambda0.invoke(updateTransition.getSegment(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
                                    InputPhase inputPhase6 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer.startReplaceGroup(-2001931362);
                                    int[] iArr = TextFieldTransitionScope$WhenMappings.$EnumSwitchMapping$0;
                                    long j3 = iArr[inputPhase6.ordinal()] == 1 ? j : j2;
                                    gapComposer.end(false);
                                    ColorSpace m679getColorSpaceimpl = Color.m679getColorSpaceimpl(j3);
                                    changed = gapComposer.changed(m679getColorSpaceimpl);
                                    rememberedValue = gapComposer.rememberedValue();
                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                    if (!changed || rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl, 1));
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    TwoWayConverterImpl twoWayConverterImpl2 = (TwoWayConverterImpl) rememberedValue;
                                    InputPhase inputPhase7 = (InputPhase) interactionResult.getCurrentState();
                                    gapComposer.startReplaceGroup(-2001931362);
                                    Color m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, iArr[inputPhase7.ordinal()] == 1 ? j : j2);
                                    InputPhase inputPhase8 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                    gapComposer.startReplaceGroup(-2001931362);
                                    long j4 = iArr[inputPhase8.ordinal()] == 1 ? j : j2;
                                    gapComposer.end(false);
                                    Color color = new Color(j4);
                                    updateTransition.getSegment();
                                    gapComposer.startReplaceGroup(-2017811095);
                                    TweenSpec tween$default2 = AnimatableKt.tween$default(150, 0, null, 6);
                                    gapComposer.end(false);
                                    Transition.TransitionAnimationState createTransitionAnimation3 = AnimatableKt.createTransitionAnimation(updateTransition, m, color, tween$default2, twoWayConverterImpl2, gapComposer, 196608);
                                    int i3 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
                                    ColorSpace m679getColorSpaceimpl2 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i3 >> 6) & 112))).value);
                                    changed2 = gapComposer.changed(m679getColorSpaceimpl2);
                                    rememberedValue2 = gapComposer.rememberedValue();
                                    if (!changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl2, 1));
                                        gapComposer.updateRememberedValue(rememberedValue2);
                                    }
                                    TwoWayConverterImpl twoWayConverterImpl3 = (TwoWayConverterImpl) rememberedValue2;
                                    int i4 = ((((i3 << 3) & 57344) | 3072) >> 9) & 112;
                                    Object invoke = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(interactionResult.getCurrentState(), gapComposer, Integer.valueOf(i4));
                                    Object invoke2 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf(i4));
                                    updateTransition.getSegment();
                                    gapComposer.startReplaceGroup(-1176639650);
                                    TweenSpec tween$default3 = AnimatableKt.tween$default(150, 0, null, 6);
                                    gapComposer.end(false);
                                    composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation3.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke, invoke2, tween$default3, twoWayConverterImpl3, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation2.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
                                }
                                f4 = 1.0f;
                                gapComposer.end(false);
                                Transition.TransitionAnimationState createTransitionAnimation22 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f4), (FiniteAnimationSpec) fullScreenKt$$ExternalSyntheticLambda0.invoke(updateTransition.getSegment(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
                                InputPhase inputPhase62 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                gapComposer.startReplaceGroup(-2001931362);
                                int[] iArr2 = TextFieldTransitionScope$WhenMappings.$EnumSwitchMapping$0;
                                if (iArr2[inputPhase62.ordinal()] == 1) {
                                }
                                gapComposer.end(false);
                                ColorSpace m679getColorSpaceimpl3 = Color.m679getColorSpaceimpl(j3);
                                changed = gapComposer.changed(m679getColorSpaceimpl3);
                                rememberedValue = gapComposer.rememberedValue();
                                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                if (!changed) {
                                }
                                rememberedValue = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl3, 1));
                                gapComposer.updateRememberedValue(rememberedValue);
                                TwoWayConverterImpl twoWayConverterImpl22 = (TwoWayConverterImpl) rememberedValue;
                                InputPhase inputPhase72 = (InputPhase) interactionResult.getCurrentState();
                                gapComposer.startReplaceGroup(-2001931362);
                                Color m2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, iArr2[inputPhase72.ordinal()] == 1 ? j : j2);
                                InputPhase inputPhase82 = (InputPhase) parcelableSnapshotMutableState.getValue();
                                gapComposer.startReplaceGroup(-2001931362);
                                if (iArr2[inputPhase82.ordinal()] == 1) {
                                }
                                gapComposer.end(false);
                                Color color2 = new Color(j4);
                                updateTransition.getSegment();
                                gapComposer.startReplaceGroup(-2017811095);
                                TweenSpec tween$default22 = AnimatableKt.tween$default(150, 0, null, 6);
                                gapComposer.end(false);
                                Transition.TransitionAnimationState createTransitionAnimation32 = AnimatableKt.createTransitionAnimation(updateTransition, m2, color2, tween$default22, twoWayConverterImpl22, gapComposer, 196608);
                                int i32 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
                                ColorSpace m679getColorSpaceimpl22 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i32 >> 6) & 112))).value);
                                changed2 = gapComposer.changed(m679getColorSpaceimpl22);
                                rememberedValue2 = gapComposer.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl22, 1));
                                gapComposer.updateRememberedValue(rememberedValue2);
                                TwoWayConverterImpl twoWayConverterImpl32 = (TwoWayConverterImpl) rememberedValue2;
                                int i42 = ((((i32 << 3) & 57344) | 3072) >> 9) & 112;
                                Object invoke3 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(interactionResult.getCurrentState(), gapComposer, Integer.valueOf(i42));
                                Object invoke22 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf(i42));
                                updateTransition.getSegment();
                                gapComposer.startReplaceGroup(-1176639650);
                                TweenSpec tween$default32 = AnimatableKt.tween$default(150, 0, null, 6);
                                gapComposer.end(false);
                                composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation32.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke3, invoke22, tween$default32, twoWayConverterImpl32, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation22.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
                            }
                            f3 = 1.0f;
                            gapComposer.end(false);
                            Float valueOf32 = Float.valueOf(f3);
                            InputPhase inputPhase52 = (InputPhase) parcelableSnapshotMutableState.getValue();
                            gapComposer.startReplaceGroup(1246942589);
                            ordinal3 = inputPhase52.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f4 = 1.0f;
                            gapComposer.end(false);
                            Transition.TransitionAnimationState createTransitionAnimation222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf32, Float.valueOf(f4), (FiniteAnimationSpec) fullScreenKt$$ExternalSyntheticLambda0.invoke(updateTransition.getSegment(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
                            InputPhase inputPhase622 = (InputPhase) parcelableSnapshotMutableState.getValue();
                            gapComposer.startReplaceGroup(-2001931362);
                            int[] iArr22 = TextFieldTransitionScope$WhenMappings.$EnumSwitchMapping$0;
                            if (iArr22[inputPhase622.ordinal()] == 1) {
                            }
                            gapComposer.end(false);
                            ColorSpace m679getColorSpaceimpl32 = Color.m679getColorSpaceimpl(j3);
                            changed = gapComposer.changed(m679getColorSpaceimpl32);
                            rememberedValue = gapComposer.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy22 = Composer.Companion.Empty;
                            if (!changed) {
                            }
                            rememberedValue = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl32, 1));
                            gapComposer.updateRememberedValue(rememberedValue);
                            TwoWayConverterImpl twoWayConverterImpl222 = (TwoWayConverterImpl) rememberedValue;
                            InputPhase inputPhase722 = (InputPhase) interactionResult.getCurrentState();
                            gapComposer.startReplaceGroup(-2001931362);
                            Color m22 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, iArr22[inputPhase722.ordinal()] == 1 ? j : j2);
                            InputPhase inputPhase822 = (InputPhase) parcelableSnapshotMutableState.getValue();
                            gapComposer.startReplaceGroup(-2001931362);
                            if (iArr22[inputPhase822.ordinal()] == 1) {
                            }
                            gapComposer.end(false);
                            Color color22 = new Color(j4);
                            updateTransition.getSegment();
                            gapComposer.startReplaceGroup(-2017811095);
                            TweenSpec tween$default222 = AnimatableKt.tween$default(150, 0, null, 6);
                            gapComposer.end(false);
                            Transition.TransitionAnimationState createTransitionAnimation322 = AnimatableKt.createTransitionAnimation(updateTransition, m22, color22, tween$default222, twoWayConverterImpl222, gapComposer, 196608);
                            int i322 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
                            ColorSpace m679getColorSpaceimpl222 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i322 >> 6) & 112))).value);
                            changed2 = gapComposer.changed(m679getColorSpaceimpl222);
                            rememberedValue2 = gapComposer.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl222, 1));
                            gapComposer.updateRememberedValue(rememberedValue2);
                            TwoWayConverterImpl twoWayConverterImpl322 = (TwoWayConverterImpl) rememberedValue2;
                            int i422 = ((((i322 << 3) & 57344) | 3072) >> 9) & 112;
                            Object invoke32 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(interactionResult.getCurrentState(), gapComposer, Integer.valueOf(i422));
                            Object invoke222 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf(i422));
                            updateTransition.getSegment();
                            gapComposer.startReplaceGroup(-1176639650);
                            TweenSpec tween$default322 = AnimatableKt.tween$default(150, 0, null, 6);
                            gapComposer.end(false);
                            composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation322.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke32, invoke222, tween$default322, twoWayConverterImpl322, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation222.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
                        } else if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                    }
                    f2 = 1.0f;
                    gapComposer.end(false);
                    Float valueOf22 = Float.valueOf(f2);
                    updateTransition.getSegment();
                    gapComposer.startReplaceGroup(-883519390);
                    TweenSpec tween$default4 = AnimatableKt.tween$default(150, 0, null, 6);
                    gapComposer.end(false);
                    Transition.TransitionAnimationState createTransitionAnimation4 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf22, tween$default4, twoWayConverterImpl, gapComposer, 196608);
                    FullScreenKt$$ExternalSyntheticLambda0 fullScreenKt$$ExternalSyntheticLambda02 = new FullScreenKt$$ExternalSyntheticLambda0(8);
                    InputPhase inputPhase42 = (InputPhase) interactionResult.getCurrentState();
                    gapComposer.startReplaceGroup(1246942589);
                    ordinal2 = inputPhase42.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f3 = 1.0f;
                    gapComposer.end(false);
                    Float valueOf322 = Float.valueOf(f3);
                    InputPhase inputPhase522 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer.startReplaceGroup(1246942589);
                    ordinal3 = inputPhase522.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f4 = 1.0f;
                    gapComposer.end(false);
                    Transition.TransitionAnimationState createTransitionAnimation2222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf322, Float.valueOf(f4), (FiniteAnimationSpec) fullScreenKt$$ExternalSyntheticLambda02.invoke(updateTransition.getSegment(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
                    InputPhase inputPhase6222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer.startReplaceGroup(-2001931362);
                    int[] iArr222 = TextFieldTransitionScope$WhenMappings.$EnumSwitchMapping$0;
                    if (iArr222[inputPhase6222.ordinal()] == 1) {
                    }
                    gapComposer.end(false);
                    ColorSpace m679getColorSpaceimpl322 = Color.m679getColorSpaceimpl(j3);
                    changed = gapComposer.changed(m679getColorSpaceimpl322);
                    rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy222 = Composer.Companion.Empty;
                    if (!changed) {
                    }
                    rememberedValue = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl322, 1));
                    gapComposer.updateRememberedValue(rememberedValue);
                    TwoWayConverterImpl twoWayConverterImpl2222 = (TwoWayConverterImpl) rememberedValue;
                    InputPhase inputPhase7222 = (InputPhase) interactionResult.getCurrentState();
                    gapComposer.startReplaceGroup(-2001931362);
                    Color m222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, iArr222[inputPhase7222.ordinal()] == 1 ? j : j2);
                    InputPhase inputPhase8222 = (InputPhase) parcelableSnapshotMutableState.getValue();
                    gapComposer.startReplaceGroup(-2001931362);
                    if (iArr222[inputPhase8222.ordinal()] == 1) {
                    }
                    gapComposer.end(false);
                    Color color222 = new Color(j4);
                    updateTransition.getSegment();
                    gapComposer.startReplaceGroup(-2017811095);
                    TweenSpec tween$default2222 = AnimatableKt.tween$default(150, 0, null, 6);
                    gapComposer.end(false);
                    Transition.TransitionAnimationState createTransitionAnimation3222 = AnimatableKt.createTransitionAnimation(updateTransition, m222, color222, tween$default2222, twoWayConverterImpl2222, gapComposer, 196608);
                    int i3222 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
                    ColorSpace m679getColorSpaceimpl2222 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i3222 >> 6) & 112))).value);
                    changed2 = gapComposer.changed(m679getColorSpaceimpl2222);
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl2222, 1));
                    gapComposer.updateRememberedValue(rememberedValue2);
                    TwoWayConverterImpl twoWayConverterImpl3222 = (TwoWayConverterImpl) rememberedValue2;
                    int i4222 = ((((i3222 << 3) & 57344) | 3072) >> 9) & 112;
                    Object invoke322 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(interactionResult.getCurrentState(), gapComposer, Integer.valueOf(i4222));
                    Object invoke2222 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf(i4222));
                    updateTransition.getSegment();
                    gapComposer.startReplaceGroup(-1176639650);
                    TweenSpec tween$default3222 = AnimatableKt.tween$default(150, 0, null, 6);
                    gapComposer.end(false);
                    composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation4.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation3222.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke322, invoke2222, tween$default3222, twoWayConverterImpl3222, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation2222.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
                } else if (ordinal4 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            f = 1.0f;
            gapComposer.end(false);
            Float valueOf4 = Float.valueOf(f);
            InputPhase inputPhase32 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer.startReplaceGroup(389927550);
            ordinal = inputPhase32.ordinal();
            if (ordinal != 0) {
            }
            f2 = 1.0f;
            gapComposer.end(false);
            Float valueOf222 = Float.valueOf(f2);
            updateTransition.getSegment();
            gapComposer.startReplaceGroup(-883519390);
            TweenSpec tween$default42 = AnimatableKt.tween$default(150, 0, null, 6);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation42 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf4, valueOf222, tween$default42, twoWayConverterImpl, gapComposer, 196608);
            FullScreenKt$$ExternalSyntheticLambda0 fullScreenKt$$ExternalSyntheticLambda022 = new FullScreenKt$$ExternalSyntheticLambda0(8);
            InputPhase inputPhase422 = (InputPhase) interactionResult.getCurrentState();
            gapComposer.startReplaceGroup(1246942589);
            ordinal2 = inputPhase422.ordinal();
            if (ordinal2 != 0) {
            }
            f3 = 1.0f;
            gapComposer.end(false);
            Float valueOf3222 = Float.valueOf(f3);
            InputPhase inputPhase5222 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer.startReplaceGroup(1246942589);
            ordinal3 = inputPhase5222.ordinal();
            if (ordinal3 != 0) {
            }
            f4 = 1.0f;
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation22222 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3222, Float.valueOf(f4), (FiniteAnimationSpec) fullScreenKt$$ExternalSyntheticLambda022.invoke(updateTransition.getSegment(), gapComposer, 0), twoWayConverterImpl, gapComposer, 196608);
            InputPhase inputPhase62222 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer.startReplaceGroup(-2001931362);
            int[] iArr2222 = TextFieldTransitionScope$WhenMappings.$EnumSwitchMapping$0;
            if (iArr2222[inputPhase62222.ordinal()] == 1) {
            }
            gapComposer.end(false);
            ColorSpace m679getColorSpaceimpl3222 = Color.m679getColorSpaceimpl(j3);
            changed = gapComposer.changed(m679getColorSpaceimpl3222);
            rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2222 = Composer.Companion.Empty;
            if (!changed) {
            }
            rememberedValue = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl3222, 1));
            gapComposer.updateRememberedValue(rememberedValue);
            TwoWayConverterImpl twoWayConverterImpl22222 = (TwoWayConverterImpl) rememberedValue;
            InputPhase inputPhase72222 = (InputPhase) interactionResult.getCurrentState();
            gapComposer.startReplaceGroup(-2001931362);
            Color m2222 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, iArr2222[inputPhase72222.ordinal()] == 1 ? j : j2);
            InputPhase inputPhase82222 = (InputPhase) parcelableSnapshotMutableState.getValue();
            gapComposer.startReplaceGroup(-2001931362);
            if (iArr2222[inputPhase82222.ordinal()] == 1) {
            }
            gapComposer.end(false);
            Color color2222 = new Color(j4);
            updateTransition.getSegment();
            gapComposer.startReplaceGroup(-2017811095);
            TweenSpec tween$default22222 = AnimatableKt.tween$default(150, 0, null, 6);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation32222 = AnimatableKt.createTransitionAnimation(updateTransition, m2222, color2222, tween$default22222, twoWayConverterImpl22222, gapComposer, 196608);
            int i32222 = (i2 & 7168) | MLKEMEngine.KyberPolyBytes;
            ColorSpace m679getColorSpaceimpl22222 = Color.m679getColorSpaceimpl(((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf((i32222 >> 6) & 112))).value);
            changed2 = gapComposer.changed(m679getColorSpaceimpl22222);
            rememberedValue2 = gapComposer.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = new TwoWayConverterImpl(crossfadeKt$Crossfade$3$1, new BoundsAnimation$animate$1(m679getColorSpaceimpl22222, 1));
            gapComposer.updateRememberedValue(rememberedValue2);
            TwoWayConverterImpl twoWayConverterImpl32222 = (TwoWayConverterImpl) rememberedValue2;
            int i42222 = ((((i32222 << 3) & 57344) | 3072) >> 9) & 112;
            Object invoke3222 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(interactionResult.getCurrentState(), gapComposer, Integer.valueOf(i42222));
            Object invoke22222 = textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(parcelableSnapshotMutableState.getValue(), gapComposer, Integer.valueOf(i42222));
            updateTransition.getSegment();
            gapComposer.startReplaceGroup(-1176639650);
            TweenSpec tween$default32222 = AnimatableKt.tween$default(150, 0, null, 6);
            gapComposer.end(false);
            composableLambdaImpl.invoke(Float.valueOf(((Number) createTransitionAnimation42.value$delegate.getValue()).floatValue()), new Color(((Color) createTransitionAnimation32222.value$delegate.getValue()).value), new Color(((Color) AnimatableKt.createTransitionAnimation(updateTransition, invoke3222, invoke22222, tween$default32222, twoWayConverterImpl32222, gapComposer, 196608).value$delegate.getValue()).value), Float.valueOf(((Number) createTransitionAnimation22222.value$delegate.getValue()).floatValue()), (Object) gapComposer, (Object) 24576);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldTransitionScope$$ExternalSyntheticLambda1(this, inputPhase, j, j2, textFieldImplKt$CommonDecorationBox$labelColor$1, z, composableLambdaImpl, i, 0);
        }
    }
}
