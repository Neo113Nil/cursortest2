package com.squareup.cash.arcade.components.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
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
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.internal.InputColors;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class InputFieldKt {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference1Impl(InputFieldKt.class, "keyboardCapitalization", "getKeyboardCapitalization(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(InputFieldKt.class, "keyboardType", "getKeyboardType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)};
    public static final SemanticsPropertyKey KeyboardCapitalizationSemanticsKey = new SemanticsPropertyKey("KeyboardCapitalization");
    public static final SemanticsPropertyKey KeyboardTypeSemanticsKey = new SemanticsPropertyKey("KeyboardType");

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function3 function3, final String str, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, InputTransformation inputTransformation, OutputTransformation outputTransformation, MutableInteractionSourceImpl mutableInteractionSourceImpl, ScrollState scrollState, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        int i8;
        int i9;
        Function2 function24;
        int i10;
        Function2 function25;
        int i11;
        Function2 function26;
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
        int i23;
        int i24;
        int i25;
        int i26;
        final boolean z6;
        final KeyboardActionHandler keyboardActionHandler2;
        final OutputTransformation outputTransformation2;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        final ScrollState scrollState2;
        boolean z7;
        final Function2 function27;
        final Function2 function28;
        final Modifier modifier3;
        final boolean z8;
        final Function2 function29;
        final Function3 function32;
        final KeyboardOptions keyboardOptions2;
        final InputTransformation inputTransformation2;
        RecomposeScopeImpl endRestartGroup;
        int i27;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        int i28;
        Modifier modifier4;
        boolean z9;
        final Function2 function210;
        final Function2 function211;
        final boolean z10;
        final Function2 function212;
        final InputTransformation inputTransformation3;
        final boolean z11;
        final OutputTransformation outputTransformation3;
        KeyboardOptions keyboardOptions3;
        final KeyboardActionHandler keyboardActionHandler3;
        final ScrollState rememberScrollState;
        final Function3 function33;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        InputColors disabled;
        boolean z12;
        long j;
        textFieldState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2011927447);
        int i29 = i | (gapComposer.changed(textFieldState) ? 4 : 2);
        int i30 = i3 & 2;
        if (i30 != 0) {
            i29 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i29 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i3 & 4) != 0) {
                z4 = z;
                if (gapComposer.changed(z4)) {
                    i4 = 256;
                    int i31 = i29 | i4;
                    i5 = i3 & 8;
                    if (i5 != 0) {
                        i6 = i31 | 3072;
                    } else {
                        i6 = i31 | (gapComposer.changed(z2) ? 2048 : 1024);
                    }
                    i7 = i3 & 16;
                    int i32 = PKIFailureInfo.certRevoked;
                    if (i7 != 0) {
                        i8 = i6 | 24576;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        i8 = i6 | (gapComposer.changed(z5) ? 16384 : 8192);
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        i8 |= 196608;
                        function24 = function2;
                    } else {
                        function24 = function2;
                        if ((i & 196608) == 0) {
                            i8 |= gapComposer.changedInstance(function24) ? PKIFailureInfo.unsupportedVersion : 65536;
                        }
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i8 |= 1572864;
                        function25 = function22;
                    } else {
                        function25 = function22;
                        if ((i & 1572864) == 0) {
                            i8 |= gapComposer.changedInstance(function25) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        }
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                        i8 |= 12582912;
                        function26 = function23;
                    } else {
                        function26 = function23;
                        if ((i & 12582912) == 0) {
                            i8 |= gapComposer.changedInstance(function26) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i3 & 256;
                    if (i12 != 0) {
                        i13 = i8 | 100663296;
                    } else {
                        i13 = i8 | (gapComposer.changedInstance(function3) ? 67108864 : 33554432);
                    }
                    i14 = i13 | (gapComposer.changed(str) ? PKIFailureInfo.duplicateCertReq : 268435456);
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                        i17 = i2 | 6;
                        i16 = i15;
                    } else if ((i2 & 6) == 0) {
                        i16 = i15;
                        i17 = i2 | (gapComposer.changed(keyboardOptions) ? 4 : 2);
                    } else {
                        i16 = i15;
                        i17 = i2;
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                        i20 = i17 | 48;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        i20 = i17 | (gapComposer.changed(keyboardActionHandler) ? 32 : 16);
                    }
                    int i33 = i20;
                    i21 = i3 & 4096;
                    if (i21 != 0) {
                        i22 = i33 | MLKEMEngine.KyberPolyBytes;
                    } else {
                        int i34 = i33;
                        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                            i34 |= gapComposer.changed(inputTransformation) ? 256 : 128;
                        }
                        i22 = i34;
                    }
                    i23 = i3 & PKIFailureInfo.certRevoked;
                    if (i23 != 0) {
                        i24 = i22 | 3072;
                    } else {
                        int i35 = i22;
                        if ((i2 & 3072) == 0) {
                            i24 = i35 | (gapComposer.changed(outputTransformation) ? 2048 : 1024);
                        } else {
                            i24 = i35;
                        }
                    }
                    i25 = i3 & 16384;
                    if (i25 != 0) {
                        i24 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        if (gapComposer.changed(mutableInteractionSourceImpl)) {
                            i32 = 16384;
                        }
                        i24 |= i32;
                        i26 = i24 | 65536;
                        if (gapComposer.shouldExecute(i14 & 1, (i14 & 306783379) == 306783378 || (i26 & 74899) != 74898)) {
                            gapComposer.skipToGroupEnd();
                            z6 = z2;
                            keyboardActionHandler2 = keyboardActionHandler;
                            outputTransformation2 = outputTransformation;
                            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                            scrollState2 = scrollState;
                            z7 = z5;
                            function27 = function24;
                            function28 = function25;
                            modifier3 = modifier2;
                            z8 = z4;
                            function29 = function26;
                            function32 = function3;
                            keyboardOptions2 = keyboardOptions;
                            inputTransformation2 = inputTransformation;
                        } else {
                            gapComposer.startDefaults();
                            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                                Modifier modifier5 = i30 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                boolean booleanValue = (i3 & 4) != 0 ? ((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue() : z4;
                                boolean z13 = i5 != 0 ? false : z2;
                                if (i7 != 0) {
                                    z5 = false;
                                }
                                if (i9 != 0) {
                                    function24 = null;
                                }
                                if (i10 != 0) {
                                    function25 = null;
                                }
                                if (i11 != 0) {
                                    function26 = null;
                                }
                                Function3 function34 = i12 != 0 ? null : function3;
                                KeyboardOptions keyboardOptions4 = i16 != 0 ? KeyboardOptions.Default : keyboardOptions;
                                KeyboardActionHandler keyboardActionHandler4 = i19 != 0 ? null : keyboardActionHandler;
                                InputTransformation inputTransformation4 = i21 != 0 ? null : inputTransformation;
                                OutputTransformation outputTransformation4 = i23 == 0 ? outputTransformation : null;
                                if (i25 != 0) {
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    i27 = -458753;
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                                    }
                                    mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
                                } else {
                                    i27 = -458753;
                                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                                }
                                i28 = i26 & i27;
                                boolean z14 = z5;
                                modifier4 = modifier5;
                                z9 = z14;
                                function210 = function24;
                                function211 = function25;
                                z10 = z13;
                                function212 = function26;
                                inputTransformation3 = inputTransformation4;
                                z11 = booleanValue;
                                outputTransformation3 = outputTransformation4;
                                keyboardOptions3 = keyboardOptions4;
                                keyboardActionHandler3 = keyboardActionHandler4;
                                rememberScrollState = ImageKt.rememberScrollState(gapComposer);
                                function33 = function34;
                                mutableInteractionSourceImpl4 = mutableInteractionSourceImpl3;
                            } else {
                                gapComposer.skipToGroupEnd();
                                function33 = function3;
                                keyboardOptions3 = keyboardOptions;
                                mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                                rememberScrollState = scrollState;
                                i28 = i26 & (-458753);
                                z9 = z5;
                                function210 = function24;
                                function211 = function25;
                                modifier4 = modifier2;
                                z11 = z4;
                                function212 = function26;
                                z10 = z2;
                                keyboardActionHandler3 = keyboardActionHandler;
                                inputTransformation3 = inputTransformation;
                                outputTransformation3 = outputTransformation;
                            }
                            gapComposer.endDefaults();
                            int i36 = (i28 >> 12) & 14;
                            MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl4, gapComposer, i36);
                            MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl4, gapComposer, i36);
                            if (z9) {
                                gapComposer.startReplaceGroup(-726962768);
                                disabled = UtilsKt.error(gapComposer);
                                gapComposer.end(false);
                            } else if (!z11 || z10) {
                                gapComposer.startReplaceGroup(-726961165);
                                disabled = UtilsKt.disabled(gapComposer);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-726959975);
                                ((Boolean) collectIsPressedAsState.getValue()).getClass();
                                disabled = UtilsKt.m3397default(gapComposer);
                                gapComposer.end(false);
                            }
                            if (((Boolean) collectIsFocusedAsState.getValue()).booleanValue()) {
                                z12 = z9;
                                j = disabled.borderActive;
                            } else {
                                z12 = z9;
                                j = disabled.borderColor;
                            }
                            final long j2 = j;
                            final KeyboardOptions keyboardOptions5 = keyboardOptions3;
                            final InputColors inputColors = disabled;
                            modifier3 = modifier4;
                            Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).input), re$$ExternalSyntheticOutline0.m(disabled.textColor, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(-1074310871, new Function2() { // from class: com.squareup.cash.arcade.components.input.InputFieldKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    InputColors inputColors2 = inputColors;
                                    long j3 = inputColors2.helperTextColor;
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    int i37 = 0;
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 6);
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
                                        KeyboardOptions keyboardOptions6 = keyboardOptions5;
                                        boolean changed = gapComposer2.changed(keyboardOptions6);
                                        Object rememberedValue2 = gapComposer2.rememberedValue();
                                        if (changed || rememberedValue2 == Composer.Companion.Empty) {
                                            rememberedValue2 = new CashApp$$ExternalSyntheticLambda2(keyboardOptions6, 29);
                                            gapComposer2.updateRememberedValue(rememberedValue2);
                                        }
                                        Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue2), "InputField");
                                        TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getCurrentTextStyle(gapComposer2), Strings.getCurrentTextColor(gapComposer2), 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                                        SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer2).component.input.cursor);
                                        TextFieldState textFieldState2 = textFieldState;
                                        long j4 = j2;
                                        MutableInteractionSourceImpl mutableInteractionSourceImpl5 = mutableInteractionSourceImpl4;
                                        BasicTextFieldKt.BasicTextField(textFieldState2, testTag, z11, z10, inputTransformation3, m994copyp1EtxEg$default, keyboardOptions6, keyboardActionHandler3, TextFieldLineLimits.SingleLine.INSTANCE, mutableInteractionSourceImpl5, solidColor, outputTransformation3, new InputFieldKt$InputField$7$1$2(textFieldState2, inputColors2, j4, mutableInteractionSourceImpl5, function210, function211, function212, str), rememberScrollState, gapComposer2, 100663296, 0, 512);
                                        Function3 function35 = function33;
                                        if (function35 != null) {
                                            gapComposer2.startReplaceGroup(-711284467);
                                            Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(j3, ArcadeThemeKt.LocalTextColor), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer2).helpText), Recorder$$ExternalSyntheticOutline2.m(j3, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(977213626, new InputFieldKt$$ExternalSyntheticLambda11(function35, i37), gapComposer2), gapComposer2, 56);
                                            gapComposer2.end(false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-710863549);
                                            gapComposer2.end(false);
                                        }
                                        gapComposer2.end(true);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer), gapComposer, 56);
                            z7 = z12;
                            z8 = z11;
                            z6 = z10;
                            scrollState2 = rememberScrollState;
                            function32 = function33;
                            function28 = function211;
                            function29 = function212;
                            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl4;
                            outputTransformation2 = outputTransformation3;
                            inputTransformation2 = inputTransformation3;
                            keyboardActionHandler2 = keyboardActionHandler3;
                            keyboardOptions2 = keyboardOptions5;
                            function27 = function210;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            final Modifier modifier6 = modifier3;
                            final boolean z15 = z7;
                            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.input.InputFieldKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                                    InputFieldKt.InputField(TextFieldState.this, modifier6, z8, z6, z15, function27, function28, function29, function32, str, keyboardOptions2, keyboardActionHandler2, inputTransformation2, outputTransformation2, mutableInteractionSourceImpl2, scrollState2, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i26 = i24 | 65536;
                    if (gapComposer.shouldExecute(i14 & 1, (i14 & 306783379) == 306783378 || (i26 & 74899) != 74898)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
            } else {
                z4 = z;
            }
            i4 = 128;
            int i312 = i29 | i4;
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            i7 = i3 & 16;
            int i322 = PKIFailureInfo.certRevoked;
            if (i7 != 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i11 = i3 & 128;
            if (i11 != 0) {
            }
            i12 = i3 & 256;
            if (i12 != 0) {
            }
            i14 = i13 | (gapComposer.changed(str) ? PKIFailureInfo.duplicateCertReq : 268435456);
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            int i332 = i20;
            i21 = i3 & 4096;
            if (i21 != 0) {
            }
            i23 = i3 & PKIFailureInfo.certRevoked;
            if (i23 != 0) {
            }
            i25 = i3 & 16384;
            if (i25 != 0) {
            }
            i26 = i24 | 65536;
            if (gapComposer.shouldExecute(i14 & 1, (i14 & 306783379) == 306783378 || (i26 & 74899) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 4) != 0) {
        }
        i4 = 128;
        int i3122 = i29 | i4;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        i7 = i3 & 16;
        int i3222 = PKIFailureInfo.certRevoked;
        if (i7 != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i11 = i3 & 128;
        if (i11 != 0) {
        }
        i12 = i3 & 256;
        if (i12 != 0) {
        }
        i14 = i13 | (gapComposer.changed(str) ? PKIFailureInfo.duplicateCertReq : 268435456);
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        int i3322 = i20;
        i21 = i3 & 4096;
        if (i21 != 0) {
        }
        i23 = i3 & PKIFailureInfo.certRevoked;
        if (i23 != 0) {
        }
        i25 = i3 & 16384;
        if (i25 != 0) {
        }
        i26 = i24 | 65536;
        if (gapComposer.shouldExecute(i14 & 1, (i14 & 306783379) == 306783378 || (i26 & 74899) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputField(final TextFieldValue textFieldValue, Function1 function1, Modifier modifier, InputState inputState, Function2 function2, Function2 function22, Function2 function23, Function3 function3, String str, final KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, Composer composer, int i, int i2, int i3) {
        int i4;
        Function1 function12;
        Modifier modifier2;
        Function2 function24;
        int i5;
        Function2 function25;
        int i6;
        int i7;
        Function3 function32;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        InputState inputState2;
        String str2;
        VisualTransformation visualTransformation2;
        Function3 function33;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        KeyboardActions keyboardActions2;
        RecomposeScopeImpl endRestartGroup;
        int i14;
        final KeyboardActions keyboardActions3;
        InputColors m3397default;
        long j;
        textFieldValue.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1673519829);
        if ((i & 6) == 0) {
            i4 = (gapComposer.changed(textFieldValue) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function12 = function1;
            i4 |= gapComposer.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= gapComposer.changed(inputState == null ? -1 : inputState.ordinal()) ? 2048 : 1024;
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            function24 = function2;
            i4 |= gapComposer.changedInstance(function24) ? 16384 : PKIFailureInfo.certRevoked;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i) == 0) {
                function25 = function22;
                i4 |= gapComposer.changedInstance(function25) ? PKIFailureInfo.unsupportedVersion : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= gapComposer.changedInstance(function23) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & 12582912) == 0) {
                        i4 |= gapComposer.changedInstance(function32) ? 8388608 : 4194304;
                    }
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= gapComposer.changed(str) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    i4 |= gapComposer.changed(keyboardOptions) ? PKIFailureInfo.duplicateCertReq : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i11 = i2 | 6;
                    i10 = i9;
                } else if ((i2 & 6) == 0) {
                    i10 = i9;
                    i11 = i2 | (gapComposer.changed(keyboardActions) ? 4 : 2);
                } else {
                    i10 = i9;
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 48) == 0) {
                    i13 = i12;
                    i11 |= gapComposer.changed(visualTransformation) ? 32 : 16;
                    if (!gapComposer.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 19) != 18)) {
                        final InputState inputState3 = i15 != 0 ? InputState.DEFAULT : inputState;
                        final Function2 function29 = i16 != 0 ? null : function24;
                        final Function2 function210 = i5 != 0 ? null : function25;
                        final Function2 function211 = i6 != 0 ? null : function23;
                        final Function3 function34 = i7 != 0 ? null : function32;
                        final String str3 = i8 != 0 ? null : str;
                        if (i10 != 0) {
                            KeyboardActions keyboardActions4 = KeyboardActions.Default;
                            KeyMappingKt.getDefault();
                            int i17 = i13;
                            keyboardActions3 = KeyboardActions.Default;
                            i14 = i17;
                        } else {
                            i14 = i13;
                            keyboardActions3 = keyboardActions;
                        }
                        final VisualTransformation visualTransformation3 = i14 != 0 ? VisualTransformation.Companion.None : visualTransformation;
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        final MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                        MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 6);
                        MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer, 6);
                        int ordinal = inputState3.ordinal();
                        if (ordinal == 0) {
                            gapComposer.startReplaceGroup(1934813189);
                            ((Boolean) collectIsPressedAsState.getValue()).getClass();
                            m3397default = UtilsKt.m3397default(gapComposer);
                            gapComposer.end(false);
                        } else if (ordinal == 1) {
                            gapComposer.startReplaceGroup(1934815900);
                            m3397default = UtilsKt.error(gapComposer);
                            gapComposer.end(false);
                        } else if (ordinal == 2) {
                            gapComposer.startReplaceGroup(1934814687);
                            m3397default = UtilsKt.disabled(gapComposer);
                            gapComposer.end(false);
                        } else {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1934811907, false);
                        }
                        if (((Boolean) collectIsFocusedAsState.getValue()).booleanValue()) {
                            j = m3397default.borderActive;
                        } else {
                            j = m3397default.borderColor;
                        }
                        final long j2 = j;
                        final InputColors inputColors = m3397default;
                        final Function1 function13 = function12;
                        final Modifier modifier3 = modifier2;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).input), re$$ExternalSyntheticOutline0.m(m3397default.textColor, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(-1885669483, new Function2() { // from class: com.squareup.cash.arcade.components.input.InputFieldKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                InputColors inputColors2 = inputColors;
                                long j3 = inputColors2.helperTextColor;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                int i18 = 1;
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    int i19 = 6;
                                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 6);
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
                                    KeyboardOptions keyboardOptions2 = keyboardOptions;
                                    boolean changed = gapComposer2.changed(keyboardOptions2);
                                    Object rememberedValue2 = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.Companion.Empty) {
                                        rememberedValue2 = new InputAreaKt$$ExternalSyntheticLambda2(keyboardOptions2, i18);
                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                    }
                                    Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue2), "InputField");
                                    boolean z = inputState3 != InputState.DISABLED;
                                    SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer2).component.input.cursor);
                                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getCurrentTextStyle(gapComposer2), Strings.getCurrentTextColor(gapComposer2), 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                                    TextFieldValue textFieldValue2 = textFieldValue;
                                    long j4 = j2;
                                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                                    BasicTextFieldKt.BasicTextField(textFieldValue2, function13, testTag, z, m994copyp1EtxEg$default, keyboardOptions2, keyboardActions3, true, 0, 0, visualTransformation3, null, mutableInteractionSourceImpl2, solidColor, Expect_jvmKt.rememberComposableLambda(1372685512, new InputFieldKt$$ExternalSyntheticLambda8(textFieldValue2, inputColors2, j4, mutableInteractionSourceImpl2, function29, function210, function211, str3), gapComposer2), gapComposer2, 100663296, 199680, 5648);
                                    Function3 function35 = function34;
                                    if (function35 != null) {
                                        gapComposer2.startReplaceGroup(-1480568223);
                                        Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(j3, ArcadeThemeKt.LocalTextColor), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer2).helpText), Recorder$$ExternalSyntheticOutline2.m(j3, ArcadeThemeKt.LocalIconColor)}, Expect_jvmKt.rememberComposableLambda(-473401498, new ModalKt$$ExternalSyntheticLambda3(function35, i19), gapComposer2), gapComposer2, 56);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1480147305);
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(true);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 56);
                        inputState2 = inputState3;
                        keyboardActions2 = keyboardActions3;
                        visualTransformation2 = visualTransformation3;
                        function33 = function34;
                        function26 = function29;
                        function27 = function210;
                        function28 = function211;
                        str2 = str3;
                    } else {
                        gapComposer.skipToGroupEnd();
                        inputState2 = inputState;
                        str2 = str;
                        visualTransformation2 = visualTransformation;
                        function33 = function32;
                        function26 = function24;
                        function27 = function25;
                        function28 = function23;
                        keyboardActions2 = keyboardActions;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new InputFieldKt$$ExternalSyntheticLambda4(textFieldValue, function1, modifier, inputState2, function26, function27, function28, function33, str2, keyboardOptions, keyboardActions2, visualTransformation2, i, i2, i3);
                        return;
                    }
                    return;
                }
                i13 = i12;
                if (!gapComposer.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 19) != 18)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function25 = function22;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            i13 = i12;
            if (!gapComposer.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function24 = function2;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        function25 = function22;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        i13 = i12;
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputField(String str, Function1 function1, Modifier modifier, InputState inputState, Function2 function2, Function2 function22, Function2 function23, Function3 function3, String str2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, VisualTransformation visualTransformation, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function2 function24;
        int i7;
        int i8;
        Function2 function25;
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
        GapComposer gapComposer;
        InputState inputState2;
        Function2 function26;
        Function3 function32;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        Modifier modifier3;
        Function2 function27;
        String str3;
        VisualTransformation visualTransformation2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function28;
        int i20;
        int i21;
        Function3 function33;
        int i22;
        String str4;
        int i23;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        str.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2102006462);
        if ((i & 6) == 0) {
            i4 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i24 = i3 & 4;
        if (i24 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= gapComposer2.changed(inputState == null ? -1 : inputState.ordinal()) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                function24 = function2;
                i4 |= gapComposer2.changedInstance(function24) ? 16384 : PKIFailureInfo.certRevoked;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= gapComposer2.changedInstance(function22) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    function25 = function23;
                } else {
                    function25 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= gapComposer2.changedInstance(function25) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= gapComposer2.changedInstance(function3) ? 8388608 : 4194304;
                }
                i10 = i4;
                i11 = i3 & 256;
                if (i11 != 0) {
                    i10 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i12 = i11;
                    i10 |= gapComposer2.changed(str2) ? 67108864 : 33554432;
                    i13 = i3 & 512;
                    if (i13 == 0) {
                        i10 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i14 = i13;
                        i10 |= gapComposer2.changed(keyboardOptions) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                            i17 = i2 | 6;
                            i16 = i15;
                        } else {
                            i16 = i15;
                            i17 = i2 | (gapComposer2.changed(keyboardActions) ? 4 : 2);
                        }
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                            i17 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i19 = i18;
                            i17 |= gapComposer2.changed(visualTransformation) ? 32 : 16;
                            if (!gapComposer2.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378 || (i17 & 19) != 18)) {
                                Modifier modifier4 = i24 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                InputState inputState3 = i5 != 0 ? InputState.DEFAULT : inputState;
                                int i25 = i10;
                                Function2 function29 = i6 != 0 ? null : function24;
                                int i26 = i12;
                                Function2 function210 = i7 != 0 ? null : function22;
                                if (i8 != 0) {
                                    i20 = i14;
                                    function28 = null;
                                } else {
                                    int i27 = i14;
                                    function28 = function25;
                                    i20 = i27;
                                }
                                if (i9 != 0) {
                                    i21 = i17;
                                    function33 = null;
                                } else {
                                    i21 = i17;
                                    function33 = function3;
                                }
                                if (i26 != 0) {
                                    int i28 = i16;
                                    str4 = null;
                                    i22 = i28;
                                } else {
                                    i22 = i16;
                                    str4 = str2;
                                }
                                if (i20 != 0) {
                                    int i29 = i19;
                                    keyboardOptions3 = KeyboardOptions.Default;
                                    i23 = i29;
                                } else {
                                    i23 = i19;
                                    keyboardOptions3 = keyboardOptions;
                                }
                                if (i22 != 0) {
                                    KeyboardActions keyboardActions4 = KeyboardActions.Default;
                                    KeyMappingKt.getDefault();
                                    keyboardActions3 = KeyboardActions.Default;
                                } else {
                                    keyboardActions3 = keyboardActions;
                                }
                                VisualTransformation visualTransformation3 = i23 != 0 ? VisualTransformation.Companion.None : visualTransformation;
                                Object rememberedValue = gapComposer2.rememberedValue();
                                Object obj = Composer.Companion.Empty;
                                if (rememberedValue == obj) {
                                    rememberedValue = Updater.mutableStateOf$default(new TextFieldValue(str, 0L, 6));
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                MutableState mutableState = (MutableState) rememberedValue;
                                TextFieldValue m1002copy3r_uNRQ$default = TextFieldValue.m1002copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), str, 0L, 6);
                                boolean changed = gapComposer2.changed(m1002copy3r_uNRQ$default);
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (changed || rememberedValue2 == obj) {
                                    rememberedValue2 = new BasicTextFieldKt$$ExternalSyntheticLambda1(m1002copy3r_uNRQ$default, mutableState, 1);
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                Updater.SideEffect((Function0) rememberedValue2, gapComposer2);
                                boolean z = (i25 & 14) == 4;
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (z || rememberedValue3 == obj) {
                                    rememberedValue3 = Updater.mutableStateOf$default(str);
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                MutableState mutableState2 = (MutableState) rememberedValue3;
                                boolean changed2 = gapComposer2.changed(mutableState2) | ((i25 & 112) == 32);
                                Object rememberedValue4 = gapComposer2.rememberedValue();
                                if (changed2 || rememberedValue4 == obj) {
                                    rememberedValue4 = new BasicTextFieldKt$$ExternalSyntheticLambda2(1, mutableState, mutableState2, function1);
                                    gapComposer2.updateRememberedValue(rememberedValue4);
                                }
                                gapComposer = gapComposer2;
                                InputField(m1002copy3r_uNRQ$default, (Function1) rememberedValue4, modifier4, inputState3, function29, function210, function28, function33, str4, keyboardOptions3, keyboardActions3, visualTransformation3, gapComposer, i25 & 2147483520, i21 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                                modifier3 = modifier4;
                                inputState2 = inputState3;
                                function27 = function29;
                                function26 = function210;
                                function25 = function28;
                                function32 = function33;
                                str3 = str4;
                                keyboardOptions2 = keyboardOptions3;
                                keyboardActions2 = keyboardActions3;
                                visualTransformation2 = visualTransformation3;
                            } else {
                                gapComposer = gapComposer2;
                                gapComposer.skipToGroupEnd();
                                inputState2 = inputState;
                                function26 = function22;
                                function32 = function3;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActions2 = keyboardActions;
                                modifier3 = modifier2;
                                function27 = function24;
                                str3 = str2;
                                visualTransformation2 = visualTransformation;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new InputFieldKt$$ExternalSyntheticLambda4(str, function1, modifier3, inputState2, function27, function26, function25, function32, str3, keyboardOptions2, keyboardActions2, visualTransformation2, i, i2, i3);
                                return;
                            }
                            return;
                        }
                        i19 = i18;
                        if (!gapComposer2.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378 || (i17 & 19) != 18)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    if (!gapComposer2.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378 || (i17 & 19) != 18)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i12 = i11;
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 != 0) {
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                i19 = i18;
                if (!gapComposer2.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378 || (i17 & 19) != 18)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function2;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i4;
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            i19 = i18;
            if (!gapComposer2.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378 || (i17 & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        function24 = function2;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i4;
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        i19 = i18;
        if (!gapComposer2.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378 || (i17 & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
