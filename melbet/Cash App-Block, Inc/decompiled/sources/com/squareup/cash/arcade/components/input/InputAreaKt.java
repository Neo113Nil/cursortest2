package com.squareup.cash.arcade.components.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.internal.InputColors;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class InputAreaKt {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference1Impl(InputAreaKt.class, "keyboardCapitalization", "getKeyboardCapitalization(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(InputAreaKt.class, "keyboardType", "getKeyboardType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)};
    public static final SemanticsPropertyKey InputAreaKeyboardCapitalizationSemanticsKey = new SemanticsPropertyKey("InputAreaKeyboardCapitalization");
    public static final SemanticsPropertyKey InputAreaKeyboardTypeSemanticsKey = new SemanticsPropertyKey("InputAreaKeyboardType");

    /* JADX WARN: Removed duplicated region for block: B:134:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputArea(final TextFieldState textFieldState, final Modifier modifier, boolean z, boolean z2, boolean z3, Function2 function2, Function3 function3, final String str, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits.MultiLine multiLine, InputTransformation inputTransformation, OutputTransformation outputTransformation, MutableInteractionSourceImpl mutableInteractionSourceImpl, ScrollState scrollState, Composer composer, int i, int i2, int i3) {
        int i4;
        final boolean z4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        Function2 function22;
        int i7;
        Function3 function32;
        int i8;
        KeyboardOptions keyboardOptions2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        KeyboardActionHandler keyboardActionHandler2;
        final TextFieldLineLimits.MultiLine multiLine2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        final ScrollState scrollState2;
        boolean z7;
        boolean z8;
        Function2 function23;
        Function3 function33;
        InputTransformation inputTransformation2;
        OutputTransformation outputTransformation2;
        final KeyboardOptions keyboardOptions3;
        RecomposeScopeImpl endRestartGroup;
        final OutputTransformation outputTransformation3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        final Function3 function34;
        int i23;
        final KeyboardActionHandler keyboardActionHandler3;
        final InputTransformation inputTransformation3;
        int i24;
        boolean z9;
        InputColors disabled;
        int i25;
        textFieldState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-764234550);
        if ((i & 6) == 0) {
            i4 = (gapComposer.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i3 & 4) == 0) {
                z4 = z;
                if (gapComposer.changed(z4)) {
                    i25 = 256;
                    i4 |= i25;
                }
            } else {
                z4 = z;
            }
            i25 = 128;
            i4 |= i25;
        } else {
            z4 = z;
        }
        int i26 = i3 & 8;
        if (i26 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            z5 = z2;
            i4 |= gapComposer.changed(z5) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z6 = z3;
                i4 |= gapComposer.changed(z6) ? 16384 : PKIFailureInfo.certRevoked;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    function22 = function2;
                } else {
                    function22 = function2;
                    if ((i & 196608) == 0) {
                        i4 |= gapComposer.changedInstance(function22) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & 1572864) == 0) {
                        i4 |= gapComposer.changedInstance(function32) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                }
                if ((i & 12582912) == 0) {
                    i4 |= gapComposer.changed(str) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                    keyboardOptions2 = keyboardOptions;
                } else {
                    keyboardOptions2 = keyboardOptions;
                    if ((i & 100663296) == 0) {
                        i4 |= gapComposer.changed(keyboardOptions2) ? 67108864 : 33554432;
                    }
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i10 = i9;
                    i4 |= gapComposer.changed(keyboardActionHandler) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                        i12 = i11;
                    } else if ((i2 & 6) == 0) {
                        i12 = i11;
                        i13 = i2 | (gapComposer.changed(multiLine) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i16 = i13 | 48;
                        i15 = i14;
                    } else {
                        i15 = i14;
                        i16 = i13 | (gapComposer.changed(inputTransformation) ? 32 : 16);
                    }
                    int i27 = i16;
                    i17 = i4;
                    i18 = i3 & 4096;
                    if (i18 == 0) {
                        i19 = i27 | MLKEMEngine.KyberPolyBytes;
                    } else {
                        i19 = i27 | (gapComposer.changed(outputTransformation) ? 256 : 128);
                    }
                    i20 = i3 & PKIFailureInfo.certRevoked;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i28 = i19;
                        if ((i2 & 3072) == 0) {
                            i21 = i28 | (gapComposer.changed(mutableInteractionSourceImpl) ? 2048 : 1024);
                        } else {
                            i21 = i28;
                        }
                    }
                    i22 = i21 | PKIFailureInfo.certRevoked;
                    if (gapComposer.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i22 & 9363) != 9362)) {
                        gapComposer.skipToGroupEnd();
                        keyboardActionHandler2 = keyboardActionHandler;
                        multiLine2 = multiLine;
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        scrollState2 = scrollState;
                        z7 = z5;
                        z8 = z6;
                        function23 = function22;
                        function33 = function32;
                        inputTransformation2 = inputTransformation;
                        outputTransformation2 = outputTransformation;
                        keyboardOptions3 = keyboardOptions2;
                    } else {
                        gapComposer.startDefaults();
                        if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                            boolean booleanValue = (i3 & 4) != 0 ? ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue() : z4;
                            if (i26 != 0) {
                                z5 = false;
                            }
                            if (i5 != 0) {
                                z6 = false;
                            }
                            if (i6 != 0) {
                                function22 = null;
                            }
                            if (i7 != 0) {
                                function32 = null;
                            }
                            KeyboardOptions keyboardOptions4 = i8 != 0 ? KeyboardOptions.Default : keyboardOptions2;
                            KeyboardActionHandler keyboardActionHandler4 = i10 != 0 ? null : keyboardActionHandler;
                            TextFieldLineLimits.MultiLine multiLine3 = i12 != 0 ? new TextFieldLineLimits.MultiLine(3, 2, 0) : multiLine;
                            InputTransformation inputTransformation4 = i15 != 0 ? null : inputTransformation;
                            outputTransformation3 = i18 != 0 ? null : outputTransformation;
                            if (i20 != 0) {
                                Object rememberedValue = gapComposer.rememberedValue();
                                if (rememberedValue == Composer.Companion.Empty) {
                                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                                }
                                mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                            } else {
                                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                            }
                            scrollState2 = ImageKt.rememberScrollState(gapComposer);
                            function34 = function32;
                            multiLine2 = multiLine3;
                            i23 = 3;
                            keyboardActionHandler3 = keyboardActionHandler4;
                            inputTransformation3 = inputTransformation4;
                            z4 = booleanValue;
                            i24 = i22 & (-57345);
                            z9 = z6;
                            keyboardOptions3 = keyboardOptions4;
                        } else {
                            gapComposer.skipToGroupEnd();
                            keyboardActionHandler3 = keyboardActionHandler;
                            multiLine2 = multiLine;
                            outputTransformation3 = outputTransformation;
                            scrollState2 = scrollState;
                            i24 = i22 & (-57345);
                            i23 = 3;
                            z9 = z6;
                            function34 = function32;
                            inputTransformation3 = inputTransformation;
                            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                            keyboardOptions3 = keyboardOptions2;
                        }
                        final Function2 function24 = function22;
                        final boolean z10 = z5;
                        gapComposer.endDefaults();
                        int i29 = multiLine2.minHeightInLines;
                        if (i29 < i23) {
                            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i29, "InputArea requires minHeightInLines to be at least 3, but was "));
                            return;
                        }
                        int i30 = (i24 >> 9) & 14;
                        MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl3, gapComposer, i30);
                        MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl3, gapComposer, i30);
                        if (z9) {
                            gapComposer.startReplaceGroup(10040177);
                            disabled = UtilsKt.error(gapComposer);
                            gapComposer.end(false);
                        } else if (!z4 || z10) {
                            gapComposer.startReplaceGroup(10041780);
                            disabled = UtilsKt.disabled(gapComposer);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(10042970);
                            ((Boolean) collectIsPressedAsState.getValue()).getClass();
                            disabled = UtilsKt.m3397default(gapComposer);
                            gapComposer.end(false);
                        }
                        final long j = ((Boolean) collectIsFocusedAsState.getValue()).booleanValue() ? disabled.borderActive : disabled.borderColor;
                        final MutableInteractionSourceImpl mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                        final InputColors inputColors = disabled;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).input), re$$ExternalSyntheticOutline0.m(disabled.textColor, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(1494784394, new Function2() { // from class: com.squareup.cash.arcade.components.input.InputAreaKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                InputColors inputColors2 = inputColors;
                                long j2 = inputColors2.helperTextColor;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                int i31 = 0;
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Strings.getSizes(gapComposer2).getClass();
                                    DefaultSizes.spacing.getClass();
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 0);
                                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.this);
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
                                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                    boolean changed = gapComposer2.changed(keyboardOptions5);
                                    Object rememberedValue2 = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.Companion.Empty) {
                                        rememberedValue2 = new InputAreaKt$$ExternalSyntheticLambda2(keyboardOptions5, i31);
                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                    }
                                    Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue2), "InputArea");
                                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getCurrentTextStyle(gapComposer2), Strings.getCurrentTextColor(gapComposer2), 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                                    SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer2).component.input.cursor);
                                    TextFieldState textFieldState2 = textFieldState;
                                    long j3 = j;
                                    MutableInteractionSourceImpl mutableInteractionSourceImpl5 = mutableInteractionSourceImpl4;
                                    BasicTextFieldKt.BasicTextField(textFieldState2, testTag, z4, z10, inputTransformation3, m994copyp1EtxEg$default, keyboardOptions5, keyboardActionHandler3, multiLine2, mutableInteractionSourceImpl5, solidColor, outputTransformation3, new InputAreaKt$InputArea$3$1$2(textFieldState2, inputColors2, j3, mutableInteractionSourceImpl5, function24, str), scrollState2, gapComposer2, 0, 0, 512);
                                    Function3 function35 = function34;
                                    if (function35 != null) {
                                        gapComposer2.startReplaceGroup(-1734358320);
                                        Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(j2, ArcadeThemeKt.LocalTextColor), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer2).helpText), Recorder$$ExternalSyntheticOutline2.m(j2, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-535108325, new ModalKt$$ExternalSyntheticLambda3(function35, 5), gapComposer2), gapComposer2, 56);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1733910494);
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 56);
                        z8 = z9;
                        z7 = z10;
                        inputTransformation2 = inputTransformation3;
                        keyboardActionHandler2 = keyboardActionHandler3;
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl4;
                        outputTransformation2 = outputTransformation3;
                        function33 = function34;
                        function23 = function24;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda4(textFieldState, modifier, z4, z7, z8, function23, function33, str, keyboardOptions3, keyboardActionHandler2, multiLine2, inputTransformation2, outputTransformation2, mutableInteractionSourceImpl2, scrollState2, i, i2, i3);
                        return;
                    }
                    return;
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                int i272 = i16;
                i17 = i4;
                i18 = i3 & 4096;
                if (i18 == 0) {
                }
                i20 = i3 & PKIFailureInfo.certRevoked;
                if (i20 == 0) {
                }
                i22 = i21 | PKIFailureInfo.certRevoked;
                if (gapComposer.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i22 & 9363) != 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z6 = z3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            int i2722 = i16;
            i17 = i4;
            i18 = i3 & 4096;
            if (i18 == 0) {
            }
            i20 = i3 & PKIFailureInfo.certRevoked;
            if (i20 == 0) {
            }
            i22 = i21 | PKIFailureInfo.certRevoked;
            if (gapComposer.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i22 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z5 = z2;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z6 = z3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        int i27222 = i16;
        i17 = i4;
        i18 = i3 & 4096;
        if (i18 == 0) {
        }
        i20 = i3 & PKIFailureInfo.certRevoked;
        if (i20 == 0) {
        }
        i22 = i21 | PKIFailureInfo.certRevoked;
        if (gapComposer.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i22 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
