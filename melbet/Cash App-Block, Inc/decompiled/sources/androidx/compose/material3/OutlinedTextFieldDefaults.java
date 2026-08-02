package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class OutlinedTextFieldDefaults {
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();

    public static TextFieldColors colors(Composer composer, int i) {
        return getDefaultOutlinedTextFieldColors((ColorScheme) ((GapComposer) composer).consume(ColorSchemeKt.LocalColorScheme), composer);
    }

    public static TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer) {
        GapComposer gapComposer;
        boolean z;
        TextFieldColors textFieldColors = colorScheme.defaultOutlinedTextFieldColorsCached;
        if (textFieldColors == null) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(390452338);
            gapComposer2.end(false);
            textFieldColors = null;
            z = false;
        } else {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(390452339);
            TextSelectionColors textSelectionColors = (TextSelectionColors) gapComposer3.consume(TextSelectionColorsKt.LocalTextSelectionColors);
            if (Intrinsics.areEqual(textFieldColors.textSelectionColors, textSelectionColors)) {
                z = false;
                gapComposer = gapComposer3;
            } else {
                textFieldColors = textFieldColors.m559copyejIjP34(textFieldColors.focusedTextColor, textFieldColors.unfocusedTextColor, textFieldColors.disabledTextColor, textFieldColors.errorTextColor, textFieldColors.focusedContainerColor, textFieldColors.unfocusedContainerColor, textFieldColors.disabledContainerColor, textFieldColors.errorContainerColor, textFieldColors.cursorColor, textFieldColors.errorCursorColor, textSelectionColors, textFieldColors.focusedIndicatorColor, textFieldColors.unfocusedIndicatorColor, textFieldColors.disabledIndicatorColor, textFieldColors.errorIndicatorColor, textFieldColors.focusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor, textFieldColors.disabledLeadingIconColor, textFieldColors.errorLeadingIconColor, textFieldColors.focusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor, textFieldColors.disabledTrailingIconColor, textFieldColors.errorTrailingIconColor, textFieldColors.focusedLabelColor, textFieldColors.unfocusedLabelColor, textFieldColors.disabledLabelColor, textFieldColors.errorLabelColor, textFieldColors.focusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor, textFieldColors.disabledPlaceholderColor, textFieldColors.errorPlaceholderColor, textFieldColors.focusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor, textFieldColors.disabledSupportingTextColor, textFieldColors.errorSupportingTextColor, textFieldColors.focusedPrefixColor, textFieldColors.unfocusedPrefixColor, textFieldColors.disabledPrefixColor, textFieldColors.errorPrefixColor, textFieldColors.focusedSuffixColor, textFieldColors.unfocusedSuffixColor, textFieldColors.disabledSuffixColor, textFieldColors.errorSuffixColor);
                colorScheme.defaultOutlinedTextFieldColorsCached = textFieldColors;
                gapComposer = gapComposer3;
                z = false;
            }
            gapComposer.end(z);
        }
        if (textFieldColors != null) {
            GapComposer gapComposer4 = (GapComposer) composer;
            gapComposer4.startReplaceGroup(-1788515437);
            gapComposer4.end(z);
            return textFieldColors;
        }
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startReplaceGroup(-1788321191);
        long fromToken = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.FocusInputColor);
        long fromToken2 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.InputColor);
        ColorSchemeKeyTokens colorSchemeKeyTokens = OutlinedTextFieldTokens.DisabledInputColor;
        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens), 14);
        long fromToken3 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.ErrorInputColor);
        long j = Color.Transparent;
        long fromToken4 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.CaretColor);
        long fromToken5 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.ErrorFocusCaretColor);
        TextSelectionColors textSelectionColors2 = (TextSelectionColors) gapComposer5.consume(TextSelectionColorsKt.LocalTextSelectionColors);
        long fromToken6 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.FocusOutlineColor);
        long fromToken7 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.OutlineColor);
        long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(0.12f, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.DisabledOutlineColor), 14);
        long fromToken8 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.ErrorOutlineColor);
        long fromToken9 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.FocusLeadingIconColor);
        long fromToken10 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.LeadingIconColor);
        long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.DisabledLeadingIconColor), 14);
        long fromToken11 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.ErrorLeadingIconColor);
        long fromToken12 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.FocusTrailingIconColor);
        long fromToken13 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.TrailingIconColor);
        long m675copywmQWz5c$default4 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.DisabledTrailingIconColor), 14);
        long fromToken14 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.ErrorTrailingIconColor);
        long fromToken15 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.FocusLabelColor);
        long fromToken16 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.LabelColor);
        long m675copywmQWz5c$default5 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.DisabledLabelColor), 14);
        long fromToken17 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.ErrorLabelColor);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = OutlinedTextFieldTokens.InputPlaceholderColor;
        long fromToken18 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens2);
        long fromToken19 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens2);
        long m675copywmQWz5c$default6 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens), 14);
        long fromToken20 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens2);
        long fromToken21 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.FocusSupportingColor);
        long fromToken22 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.SupportingColor);
        long m675copywmQWz5c$default7 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.DisabledSupportingColor), 14);
        long fromToken23 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.ErrorSupportingColor);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = OutlinedTextFieldTokens.InputPrefixColor;
        long fromToken24 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens3);
        long fromToken25 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens3);
        long m675copywmQWz5c$default8 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens3), 14);
        long fromToken26 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens3);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = OutlinedTextFieldTokens.InputSuffixColor;
        TextFieldColors textFieldColors2 = new TextFieldColors(fromToken, fromToken2, m675copywmQWz5c$default, fromToken3, j, j, j, j, fromToken4, fromToken5, textSelectionColors2, fromToken6, fromToken7, m675copywmQWz5c$default2, fromToken8, fromToken9, fromToken10, m675copywmQWz5c$default3, fromToken11, fromToken12, fromToken13, m675copywmQWz5c$default4, fromToken14, fromToken15, fromToken16, m675copywmQWz5c$default5, fromToken17, fromToken18, fromToken19, m675copywmQWz5c$default6, fromToken20, fromToken21, fromToken22, m675copywmQWz5c$default7, fromToken23, fromToken24, fromToken25, m675copywmQWz5c$default8, fromToken26, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens4), ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens4), Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens4), 14), ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens4));
        colorScheme.defaultOutlinedTextFieldColorsCached = textFieldColors2;
        gapComposer5.end(z);
        return textFieldColors2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b0  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m539Container4EFweAY(final boolean z, final boolean z2, final MutableInteractionSourceImpl mutableInteractionSourceImpl, Modifier modifier, final TextFieldColors textFieldColors, final Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f3;
        float f4;
        GapComposer gapComposer;
        final Modifier modifier3;
        final float f5;
        final float f6;
        RecomposeScopeImpl endRestartGroup;
        float f7;
        int i4;
        float f8;
        MotionSchemeKeyTokens motionSchemeKeyTokens;
        GapComposer gapComposer2;
        State rememberUpdatedState;
        GapComposer gapComposer3;
        State rememberUpdatedState2;
        int i5;
        int i6;
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(1035477640);
        int i7 = (gapComposer4.changed(z) ? 4 : 2) | i | (gapComposer4.changed(z2) ? 32 : 16) | (gapComposer4.changed(mutableInteractionSourceImpl) ? 256 : 128);
        int i8 = i2 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i7 |= gapComposer4.changed(modifier2) ? 2048 : 1024;
            i3 = i7 | (!gapComposer4.changed(textFieldColors) ? 16384 : PKIFailureInfo.certRevoked) | (!gapComposer4.changed(shape) ? PKIFailureInfo.unsupportedVersion : 65536);
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    if (gapComposer4.changed(f3)) {
                        i6 = PKIFailureInfo.badCertTemplate;
                        i3 |= i6;
                    }
                } else {
                    f3 = f;
                }
                i6 = PKIFailureInfo.signerNotTrusted;
                i3 |= i6;
            } else {
                f3 = f;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    if (gapComposer4.changed(f4)) {
                        i5 = 8388608;
                        i3 |= i5;
                    }
                } else {
                    f4 = f2;
                }
                i5 = 4194304;
                i3 |= i5;
            } else {
                f4 = f2;
            }
            if (gapComposer4.shouldExecute(i3 & 1, (38347923 & i3) == 38347922)) {
                gapComposer4.skipToGroupEnd();
                gapComposer = gapComposer4;
                modifier3 = modifier2;
                f5 = f3;
                f6 = f4;
            } else {
                gapComposer4.startDefaults();
                if ((i & 1) == 0 || gapComposer4.getDefaultsInvalid()) {
                    modifier3 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f7 = 2.0f;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        i4 = i3 & (-29360129);
                        f8 = 1.0f;
                        gapComposer4.endDefaults();
                        boolean booleanValue = ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer4, (i4 >> 6) & 14).getValue()).booleanValue();
                        long j = z ? textFieldColors.disabledIndicatorColor : z2 ? textFieldColors.errorIndicatorColor : booleanValue ? textFieldColors.focusedIndicatorColor : textFieldColors.unfocusedIndicatorColor;
                        MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.FastEffects;
                        SpringSpec value = MenuKt.value(motionSchemeKeyTokens2, gapComposer4);
                        if (z) {
                            motionSchemeKeyTokens = motionSchemeKeyTokens2;
                            long j2 = j;
                            gapComposer2 = gapComposer4;
                            gapComposer2.startReplaceGroup(-1674427244);
                            rememberUpdatedState = Updater.rememberUpdatedState(new Color(j2), gapComposer2);
                            gapComposer2.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(-1674507999);
                            motionSchemeKeyTokens = motionSchemeKeyTokens2;
                            rememberUpdatedState = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, value, null, gapComposer4, 0, 12);
                            gapComposer2 = gapComposer4;
                            gapComposer2.end(false);
                        }
                        SpringSpec value2 = MenuKt.value(MotionSchemeKeyTokens.FastSpatial, gapComposer2);
                        if (z) {
                            gapComposer3 = gapComposer2;
                            gapComposer3.startReplaceGroup(-1674063769);
                            rememberUpdatedState2 = Updater.rememberUpdatedState(new Dp(f8), gapComposer3);
                            gapComposer3.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-1674245832);
                            GapComposer gapComposer5 = gapComposer2;
                            rememberUpdatedState2 = AnimateAsStateKt.m155animateDpAsStateAjpBEmI(booleanValue ? f7 : f8, value2, null, null, gapComposer5, 0, 12);
                            gapComposer3 = gapComposer5;
                            gapComposer3.end(false);
                        }
                        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(CanvasKt.m173BorderStrokecXLIe8U(((Color) rememberUpdatedState.getValue()).value, ((Dp) rememberUpdatedState2.getValue()).value), gapComposer3);
                        gapComposer = gapComposer3;
                        State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(z ? textFieldColors.disabledContainerColor : z2 ? textFieldColors.errorContainerColor : booleanValue ? textFieldColors.focusedContainerColor : textFieldColors.unfocusedContainerColor, MenuKt.value(motionSchemeKeyTokens, gapComposer3), null, gapComposer, 0, 12);
                        BorderStroke borderStroke = (BorderStroke) rememberUpdatedState3.getValue();
                        BoxKt.Box(ClipKt.drawWithCache(ImageKt.m179borderziNgDLE(modifier3, borderStroke.m172getWidthD9Ej5fM(), borderStroke.getBrush(), shape), new Navigator$$ExternalSyntheticLambda0(16, shape, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new LockFreeLinkedListNode$toString$1(0, 4, State.class, m153animateColorAsStateeuL9pac, "value", "getValue()Ljava/lang/Object;")))), gapComposer, 0);
                        f5 = f7;
                        f6 = f8;
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    modifier3 = modifier2;
                    f7 = f3;
                }
                i4 = i3;
                f8 = f4;
                gapComposer4.endDefaults();
                boolean booleanValue2 = ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer4, (i4 >> 6) & 14).getValue()).booleanValue();
                if (z) {
                }
                MotionSchemeKeyTokens motionSchemeKeyTokens22 = MotionSchemeKeyTokens.FastEffects;
                SpringSpec value3 = MenuKt.value(motionSchemeKeyTokens22, gapComposer4);
                if (z) {
                }
                SpringSpec value22 = MenuKt.value(MotionSchemeKeyTokens.FastSpatial, gapComposer2);
                if (z) {
                }
                MutableState rememberUpdatedState32 = Updater.rememberUpdatedState(CanvasKt.m173BorderStrokecXLIe8U(((Color) rememberUpdatedState.getValue()).value, ((Dp) rememberUpdatedState2.getValue()).value), gapComposer3);
                gapComposer = gapComposer3;
                State m153animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(z ? textFieldColors.disabledContainerColor : z2 ? textFieldColors.errorContainerColor : booleanValue2 ? textFieldColors.focusedContainerColor : textFieldColors.unfocusedContainerColor, MenuKt.value(motionSchemeKeyTokens, gapComposer3), null, gapComposer, 0, 12);
                BorderStroke borderStroke2 = (BorderStroke) rememberUpdatedState32.getValue();
                BoxKt.Box(ClipKt.drawWithCache(ImageKt.m179borderziNgDLE(modifier3, borderStroke2.m172getWidthD9Ej5fM(), borderStroke2.getBrush(), shape), new Navigator$$ExternalSyntheticLambda0(16, shape, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new LockFreeLinkedListNode$toString$1(0, 4, State.class, m153animateColorAsStateeuL9pac2, "value", "getValue()Ljava/lang/Object;")))), gapComposer, 0);
                f5 = f7;
                f6 = f8;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        OutlinedTextFieldDefaults.this.m539Container4EFweAY(z, z2, mutableInteractionSourceImpl, modifier3, textFieldColors, shape, f5, f6, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i7 | (!gapComposer4.changed(textFieldColors) ? 16384 : PKIFailureInfo.certRevoked) | (!gapComposer4.changed(shape) ? PKIFailureInfo.unsupportedVersion : 65536);
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if (gapComposer4.shouldExecute(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public final void DecorationBox(String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z3, Function2 function22, Function2 function23, Function2 function24, TextFieldColors textFieldColors, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        boolean z4;
        boolean z5;
        GapComposer gapComposer;
        PaddingValues paddingValues2;
        PaddingValues paddingValuesImpl;
        int i3;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1732281618);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z4 = z;
            i2 |= gapComposer2.changed(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            z5 = z2;
            i2 |= gapComposer2.changed(z5) ? 2048 : 1024;
        } else {
            z5 = z2;
        }
        int i4 = i & 24576;
        int i5 = PKIFailureInfo.certRevoked;
        if (i4 == 0) {
            i2 |= gapComposer2.changed(visualTransformation) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(mutableInteractionSourceImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= gapComposer2.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer2.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= gapComposer2.changedInstance(function23) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= gapComposer2.changedInstance(null) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i6 = 14155776 | (gapComposer2.changedInstance(null) ? 4 : 2) | (gapComposer2.changedInstance(null) ? 32 : 16) | (gapComposer2.changedInstance(null) ? 256 : 128) | (gapComposer2.changedInstance(function24) ? 2048 : 1024);
        if (gapComposer2.changed(textFieldColors)) {
            i5 = 16384;
        }
        int i7 = i6 | i5 | 65536;
        if (gapComposer2.shouldExecute(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i7) == 4793490) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                paddingValuesImpl = new PaddingValuesImpl(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i7 & (-458753);
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i7 & (-458753);
                paddingValuesImpl = paddingValues;
            }
            gapComposer2.endDefaults();
            boolean z6 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z6 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(str));
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            String str2 = ((TransformedText) rememberedValue).text.text;
            TextFieldType[] textFieldTypeArr = TextFieldType.$VALUES;
            TextFieldLabelPosition$Attached textFieldLabelPosition$Attached = new TextFieldLabelPosition$Attached();
            if (function22 == null) {
                gapComposer2.startReplaceGroup(1927058812);
                gapComposer2.end(false);
                composableLambdaImpl2 = null;
            } else {
                gapComposer2.startReplaceGroup(1927058813);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1459717586, new TooltipKt$animateTooltip$2(function22, 4), gapComposer2);
                gapComposer2.end(false);
                composableLambdaImpl2 = rememberComposableLambda;
            }
            int i8 = i2 >> 9;
            int i9 = i3 << 21;
            gapComposer = gapComposer2;
            Icons$Filled.CommonDecorationBox(str2, function2, textFieldLabelPosition$Attached, composableLambdaImpl2, function23, function24, z5, z4, z3, mutableInteractionSourceImpl, paddingValuesImpl, textFieldColors, composableLambdaImpl, gapComposer, ((i2 << 3) & 896) | 6 | (i8 & 458752) | (i8 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i2 & 896) | ((i3 >> 9) & 14) | ((i2 >> 6) & 112) | (i8 & 7168) | ((i2 >> 3) & 57344) | ((i3 << 6) & 3670016) | 12582912);
            paddingValues2 = paddingValuesImpl;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldDefaults$$ExternalSyntheticLambda1(this, str, function2, z, z2, visualTransformation, mutableInteractionSourceImpl, z3, function22, function23, function24, textFieldColors, paddingValues2, composableLambdaImpl, i);
        }
    }
}
