package com.squareup.cash.payments.views;

import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.DateInputKt$DateInputTextField$4$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class RecipientsInputViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$10;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ TextFieldValue f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ Function1 f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ boolean f$9;

    public /* synthetic */ RecipientsInputViewKt$$ExternalSyntheticLambda0(Modifier modifier, String str, TextFieldValue textFieldValue, String str2, int i, boolean z, boolean z2, boolean z3, Function0 function0, Function1 function1, int i2) {
        this.f$3 = modifier;
        this.f$1 = str;
        this.f$5 = textFieldValue;
        this.f$10 = str2;
        this.f$8 = i;
        this.f$2 = z;
        this.f$4 = z2;
        this.f$9 = z3;
        this.f$6 = function0;
        this.f$7 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$3;
        switch (i) {
            case 0:
                final FocusRequester focusRequester = (FocusRequester) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 16.0f, 16.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$1, (Map) null, (Function1) null, false);
                    TextSelectionColors textSelectionColors = new TextSelectionColors(Strings.getColors(gapComposer).component.input.text.f195default, Color.m675copywmQWz5c$default(0.4f, Strings.getColors(gapComposer).component.input.text.f195default, 14));
                    long j = Strings.getTypography(gapComposer).input.spanStyle.fontSize;
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Updater.mutableStateOf$default(new TextUnit(j));
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    final MutableState mutableState = (MutableState) rememberedValue;
                    final long j2 = Strings.getColors(gapComposer).semantic.text.standard;
                    ProvidedValue defaultProvidedValue$runtime = TextSelectionColorsKt.LocalTextSelectionColors.defaultProvidedValue$runtime(textSelectionColors);
                    final boolean z = this.f$4;
                    final TextFieldValue textFieldValue = this.f$5;
                    final Function0 function0 = this.f$6;
                    final Function1 function1 = this.f$7;
                    final int i2 = this.f$8;
                    final boolean z2 = this.f$9;
                    final String str = this.f$10;
                    Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(1753372239, new Function2() { // from class: com.squareup.cash.payments.views.RecipientsInputViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            VisualTransformation visualTransformation;
                            Composer composer2 = (Composer) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(FocusTraversalKt.focusRequester(Modifier.Companion.$$INSTANCE, FocusRequester.this), 1.0f), "RecipientsInput");
                                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).input, Strings.getColors(gapComposer2).component.input.text.f195default, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                                final boolean z3 = z;
                                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                                if (z3) {
                                    gapComposer2.startReplaceGroup(-677120328);
                                    final long j3 = j2;
                                    boolean changed = gapComposer2.changed(j3);
                                    Object rememberedValue2 = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue2 == neverEqualPolicy2) {
                                        rememberedValue2 = new VisualTransformation() { // from class: com.squareup.cash.payments.views.RecipientsInputViewKt$$ExternalSyntheticLambda3
                                            @Override // androidx.compose.ui.text.input.VisualTransformation
                                            public final TransformedText filter(AnnotatedString annotatedString) {
                                                annotatedString.getClass();
                                                return new TransformedText(AnnotatedStringKt.AnnotatedString$default(annotatedString.text, new SpanStyle(j3, 0L, FontWeight.SemiBold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65530)), OffsetMapping.Companion.Identity);
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                    }
                                    visualTransformation = (VisualTransformation) rememberedValue2;
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(-676625444);
                                    gapComposer2.end(false);
                                    visualTransformation = VisualTransformation.Companion.None;
                                }
                                SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer2).component.input.cursor);
                                KeyboardOptions keyboardOptions = KeyboardOptions.Default;
                                KeyboardOptions m359copyINvB4aQ$default = KeyboardOptions.m359copyINvB4aQ$default(0, 119);
                                boolean changed2 = gapComposer2.changed(z3);
                                final TextFieldValue textFieldValue2 = textFieldValue;
                                boolean changed3 = changed2 | gapComposer2.changed(textFieldValue2);
                                final Function0 function02 = function0;
                                boolean changed4 = changed3 | gapComposer2.changed(function02);
                                final Function1 function12 = function1;
                                boolean changed5 = changed4 | gapComposer2.changed(function12);
                                final int i3 = i2;
                                boolean changed6 = changed5 | gapComposer2.changed(i3);
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (changed6 || rememberedValue3 == neverEqualPolicy2) {
                                    Function1 function13 = new Function1() { // from class: com.squareup.cash.payments.views.RecipientsInputViewKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            TextFieldValue textFieldValue3 = (TextFieldValue) obj6;
                                            textFieldValue3.getClass();
                                            AnnotatedString annotatedString = textFieldValue3.annotatedString;
                                            boolean z4 = z3;
                                            Function1 function14 = function12;
                                            int i4 = i3;
                                            if (z4) {
                                                int length = textFieldValue2.annotatedString.text.length();
                                                String str2 = annotatedString.text;
                                                int length2 = str2.length();
                                                Function0 function03 = function02;
                                                if (length2 < length) {
                                                    function03.invoke();
                                                    function14.invoke(TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue3, "", coil3.size.SizeKt.TextRange(0, 0), 4));
                                                    return Unit.INSTANCE;
                                                }
                                                if (TextRange.m989getMaximpl(textFieldValue3.selection) < length) {
                                                    return Unit.INSTANCE;
                                                }
                                                if (str2.length() > length) {
                                                    String substring = str2.substring(length);
                                                    if (substring.length() <= i4) {
                                                        function03.invoke();
                                                        int length3 = substring.length();
                                                        function14.invoke(TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue3, substring, coil3.size.SizeKt.TextRange(length3, length3), 4));
                                                    }
                                                }
                                            } else if (annotatedString.text.length() <= i4) {
                                                function14.invoke(textFieldValue3);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    gapComposer2.updateRememberedValue(function13);
                                    rememberedValue3 = function13;
                                }
                                BasicTextFieldKt.BasicTextField(textFieldValue2, (Function1) rememberedValue3, testTag, false, m994copyp1EtxEg$default, m359copyINvB4aQ$default, null, z2, 0, 0, visualTransformation, null, null, solidColor, Expect_jvmKt.rememberComposableLambda(-996538574, new PoolToastKt$$ExternalSyntheticLambda0(25, textFieldValue2, str, mutableState), gapComposer2), gapComposer2, 0, 196608, 13976);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 56);
                    if (this.f$2) {
                        gapComposer.startReplaceGroup(-319450134);
                        Unit unit = Unit.INSTANCE;
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new DateInputKt$DateInputTextField$4$1(focusRequester, null, 2);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-319226221);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                QuickPayViewKt.RecipientsInputView((Modifier) obj3, this.f$1, this.f$5, this.f$10, this.f$8, this.f$2, this.f$4, this.f$9, this.f$6, this.f$7, (Composer) obj, Updater.updateChangedFlags(1572865));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RecipientsInputViewKt$$ExternalSyntheticLambda0(String str, boolean z, FocusRequester focusRequester, boolean z2, TextFieldValue textFieldValue, Function0 function0, Function1 function1, int i, boolean z3, String str2) {
        this.f$1 = str;
        this.f$2 = z;
        this.f$3 = focusRequester;
        this.f$4 = z2;
        this.f$5 = textFieldValue;
        this.f$6 = function0;
        this.f$7 = function1;
        this.f$8 = i;
        this.f$9 = z3;
        this.f$10 = str2;
    }
}
