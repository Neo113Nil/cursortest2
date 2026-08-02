package com.squareup.cash.overlays;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.EncodeHelper;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.room.util.DBUtil;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public abstract class OverlayKt {
    public static final void Overlay(Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1899461106);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            OverlaysKt.WithOverlayLayer(Expect_jvmKt.rememberComposableLambda(1221866149, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, i3), gapComposer), gapComposer, 6);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function0, gapComposer);
            boolean changed = gapComposer.changed(rememberUpdatedState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OverlayKt$$ExternalSyntheticLambda1(i3, rememberUpdatedState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(function0, composableLambdaImpl, i, i3);
        }
    }

    public static final AliasType access$toAliasType(AliasRegistrar$Args.DeliveryMechanism deliveryMechanism) {
        int ordinal = deliveryMechanism.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return AliasType.EMAIL;
            }
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return AliasType.SMS;
    }

    public static final AliasType access$toCdfAliasType(BlockersScreens.VerifyAliasScreen.AliasType aliasType) {
        int ordinal = aliasType.ordinal();
        if (ordinal == 0) {
            return AliasType.EMAIL;
        }
        if (ordinal == 1) {
            return AliasType.SMS;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final CharSequence convertToCharSequence(AnnotatedString annotatedString) {
        int i;
        List spanStyles = annotatedString.getSpanStyles();
        String str = annotatedString.text;
        if (spanStyles.isEmpty()) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        EncodeHelper encodeHelper = new EncodeHelper();
        encodeHelper.parcel = Parcel.obtain();
        List spanStyles2 = annotatedString.getSpanStyles();
        int size = spanStyles2.size();
        int i2 = 0;
        while (i2 < size) {
            AnnotatedString.Range range = (AnnotatedString.Range) spanStyles2.get(i2);
            SpanStyle spanStyle = (SpanStyle) range.item;
            int i3 = range.start;
            int i4 = range.end;
            encodeHelper.parcel.recycle();
            encodeHelper.parcel = Parcel.obtain();
            TextForegroundStyle textForegroundStyle = spanStyle.textForegroundStyle;
            long j = spanStyle.background;
            long j2 = spanStyle.letterSpacing;
            long j3 = spanStyle.fontSize;
            int i5 = i2;
            long mo1007getColor0d7_KjU = textForegroundStyle.mo1007getColor0d7_KjU();
            SpannableString spannableString2 = spannableString;
            List list = spanStyles2;
            long j4 = Color.Unspecified;
            if (Color.m676equalsimpl0(mo1007getColor0d7_KjU, j4)) {
                i = i4;
            } else {
                encodeHelper.encode((byte) 1);
                i = i4;
                encodeHelper.m932encode8_81llA(spanStyle.textForegroundStyle.mo1007getColor0d7_KjU());
            }
            long j5 = TextUnit.Unspecified;
            int i6 = size;
            byte b = 2;
            if (!TextUnit.m1057equalsimpl0(j3, j5)) {
                encodeHelper.encode((byte) 2);
                encodeHelper.m931encodeR2X_6o(j3);
            }
            FontWeight fontWeight = spanStyle.fontWeight;
            if (fontWeight != null) {
                encodeHelper.encode((byte) 3);
                encodeHelper.parcel.writeInt(fontWeight.weight);
            }
            FontStyle fontStyle = spanStyle.fontStyle;
            if (fontStyle != null) {
                int i7 = fontStyle.value;
                encodeHelper.encode((byte) 4);
                encodeHelper.encode((i7 != 0 && i7 == 1) ? (byte) 1 : (byte) 0);
            }
            FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
            if (fontSynthesis != null) {
                int i8 = fontSynthesis.value;
                encodeHelper.encode((byte) 5);
                if (i8 != 0) {
                    if (i8 == 65535) {
                        b = 1;
                    } else if (i8 != 1) {
                        if (i8 == 2) {
                            b = 3;
                        }
                    }
                    encodeHelper.encode(b);
                }
                b = 0;
                encodeHelper.encode(b);
            }
            String str2 = spanStyle.fontFeatureSettings;
            if (str2 != null) {
                encodeHelper.encode((byte) 6);
                encodeHelper.parcel.writeString(str2);
            }
            if (!TextUnit.m1057equalsimpl0(j2, j5)) {
                encodeHelper.encode((byte) 7);
                encodeHelper.m931encodeR2X_6o(j2);
            }
            BaselineShift baselineShift = spanStyle.baselineShift;
            if (baselineShift != null) {
                float f = baselineShift.multiplier;
                encodeHelper.encode((byte) 8);
                encodeHelper.encode(f);
            }
            TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
            if (textGeometricTransform != null) {
                encodeHelper.encode((byte) 9);
                encodeHelper.encode(textGeometricTransform.scaleX);
                encodeHelper.encode(textGeometricTransform.skewX);
            }
            if (!Color.m676equalsimpl0(j, j4)) {
                encodeHelper.encode((byte) 10);
                encodeHelper.m932encode8_81llA(j);
            }
            TextDecoration textDecoration = spanStyle.textDecoration;
            if (textDecoration != null) {
                encodeHelper.encode((byte) 11);
                encodeHelper.parcel.writeInt(textDecoration.mask);
            }
            Shadow shadow = spanStyle.shadow;
            if (shadow != null) {
                encodeHelper.encode((byte) 12);
                encodeHelper.m932encode8_81llA(shadow.color);
                long j6 = shadow.offset;
                encodeHelper.encode(Float.intBitsToFloat((int) (j6 >> 32)));
                encodeHelper.encode(Float.intBitsToFloat((int) (j6 & BodyPartID.bodyIdMax)));
                encodeHelper.encode(shadow.blurRadius);
            }
            spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(encodeHelper.parcel.marshall(), 0)), i3, i, 33);
            i2 = i5 + 1;
            spannableString = spannableString2;
            spanStyles2 = list;
            size = i6;
        }
        return spannableString;
    }

    public static final ClipEntry toClipEntry(ClipData clipData) {
        return new ClipEntry(clipData);
    }

    public static final ClipMetadata toClipMetadata() {
        return new ClipMetadata();
    }
}
