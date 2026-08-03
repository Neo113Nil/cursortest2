package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a£\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#28\b\u0002\u0010$\u001a2\u0012\u0004\u0012\u00020&\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010'0\u0013¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0001\u0018\u00010%¢\u0006\u0002\b\u00112\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0002\u00105\u001aØ\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u0010A\u001aØ\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u00106\u001a\u00020B2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u0010C\u001a\u0084\u0002\u0010D\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010E\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u00102\u0013\u0010F\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010G\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0006\u0010=\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020I2\u0011\u0010L\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0006\u0010N\u001a\u000202H\u0001¢\u0006\u0002\u0010O\"\u0016\u0010P\u001a\u00020QX\u0080\u0004¢\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {TextFieldImplKt.TextFieldId, "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TextFieldLabelScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "placeholder", "Lkotlin/Function0;", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/material3/TextFieldLabelPosition;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;IIII)V", "value", "", "onValueChange", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "TextFieldLayout", "textField", "leading", "trailing", "labelProgress", "Landroidx/compose/material3/internal/FloatProducer;", "placeholderAlpha", "affixAlpha", "container", "supporting", "paddingValues", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/TextFieldLabelPosition;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/material3/internal/FloatProducer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "TextFieldWithLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldWithLabelVerticalPadding", "()F", "F", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m9732constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$11(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$3(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2 function27, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4, Composer composer, int i5) {
        TextField(textFieldState, modifier, z, z2, textStyle, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z3, inputTransformation, outputTransformation, keyboardOptions, keyboardActionHandler, textFieldLineLimits, function27, scrollState, shape, textFieldColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$7(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        TextField(str, (Function1<? super String, Unit>) function1, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldLayout$lambda$2(Modifier modifier, Function2 function2, Function2 function22, Function3 function3, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, FloatProducer floatProducer2, FloatProducer floatProducer3, Function2 function27, Function2 function28, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        TextFieldLayout(modifier, function2, function22, function3, function23, function24, function25, function26, z, textFieldLabelPosition, floatProducer, floatProducer2, floatProducer3, function27, function28, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f9, code lost:
    
        if (r4.changed(r92) == false) goto L252;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function27, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        TextStyle textStyle2;
        TextFieldLabelPosition textFieldLabelPosition2;
        int i8;
        Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function32;
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
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final InputTransformation inputTransformation2;
        final OutputTransformation outputTransformation2;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActionHandler keyboardActionHandler2;
        final TextFieldLineLimits textFieldLineLimits2;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function211;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final boolean z6;
        final boolean z7;
        final TextStyle textStyle3;
        final TextFieldLabelPosition textFieldLabelPosition3;
        final Modifier modifier3;
        final Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final boolean z8;
        ScopeUpdateScope endRestartGroup;
        TextFieldLineLimits textFieldLineLimits3;
        PaddingValues paddingValues3;
        final TextFieldColors textFieldColors3;
        TextStyle textStyle4;
        final Modifier modifier4;
        final Shape shape3;
        final PaddingValues paddingValues4;
        final InputTransformation inputTransformation3;
        final boolean z9;
        final TextFieldLabelPosition textFieldLabelPosition4;
        final boolean z10;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActionHandler keyboardActionHandler3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function215;
        final ScrollState scrollState3;
        int i33;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function34;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final OutputTransformation outputTransformation3;
        final TextFieldLineLimits textFieldLineLimits4;
        int i34;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        MutableInteractionSource mutableInteractionSource3;
        final boolean z11;
        final MutableInteractionSource mutableInteractionSource4;
        int i35;
        int i36;
        Composer startRestartGroup = composer.startRestartGroup(-1717599650);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)N(state,modifier,enabled,readOnly,textStyle,labelPosition,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,isError,inputTransformation,outputTransformation,keyboardOptions,onKeyboardAction,lineLimits,onTextLayout,scrollState,shape,colors,contentPadding,interactionSource)299@16478L2145,299@16391L2232:TextField.kt#uh7d8r");
        if ((i & 6) == 0) {
            i5 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        int i37 = i4 & 2;
        if (i37 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z;
                i5 |= startRestartGroup.changed(z4) ? 256 : 128;
                i7 = i4 & 8;
                int i38 = 2048;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i & 3072) == 0) {
                    z5 = z2;
                    i5 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i4 & 16) == 0) {
                            textStyle2 = textStyle;
                            if (startRestartGroup.changed(textStyle2)) {
                                i36 = 16384;
                                i5 |= i36;
                            }
                        } else {
                            textStyle2 = textStyle;
                        }
                        i36 = 8192;
                        i5 |= i36;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        textFieldLabelPosition2 = textFieldLabelPosition;
                        i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textFieldLabelPosition2)) ? 131072 : 65536;
                    } else {
                        textFieldLabelPosition2 = textFieldLabelPosition;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                        function32 = function3;
                    } else {
                        function32 = function3;
                        if ((i & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                        }
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i5 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i11 = i10;
                        i5 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i12 = i4 & 512;
                        if (i12 != 0) {
                            i5 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i13 = i12;
                            i5 |= startRestartGroup.changedInstance(function23) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i14 = i4 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (startRestartGroup.changedInstance(function24) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            i17 = i4 & 2048;
                            if (i17 == 0) {
                                i16 |= 48;
                                i18 = i17;
                            } else if ((i2 & 48) == 0) {
                                i18 = i17;
                                i16 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
                            } else {
                                i18 = i17;
                            }
                            int i39 = i16;
                            i19 = i5;
                            i20 = i4 & 4096;
                            if (i20 == 0) {
                                i21 = i39 | 384;
                            } else {
                                int i40 = i39;
                                if ((i2 & 384) == 0) {
                                    i40 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                                }
                                i21 = i40;
                            }
                            i22 = i4 & 8192;
                            if (i22 == 0) {
                                i23 = i21 | 3072;
                            } else {
                                int i41 = i21;
                                if ((i2 & 3072) == 0) {
                                    i41 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                }
                                i23 = i41;
                            }
                            i24 = i4 & 16384;
                            if (i24 == 0) {
                                i25 = i23 | 24576;
                            } else {
                                i25 = i23;
                                if ((i2 & 24576) == 0) {
                                    i25 |= startRestartGroup.changed(inputTransformation) ? 16384 : 8192;
                                    i26 = i4 & 32768;
                                    if (i26 != 0) {
                                        i25 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i25 |= startRestartGroup.changed(outputTransformation) ? 131072 : 65536;
                                    }
                                    i27 = i4 & 65536;
                                    if (i27 != 0) {
                                        i25 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i25 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                                    }
                                    i28 = i4 & 131072;
                                    if (i28 != 0) {
                                        i25 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i25 |= startRestartGroup.changed(keyboardActionHandler) ? 8388608 : 4194304;
                                    }
                                    if ((i2 & 100663296) == 0) {
                                        i25 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldLineLimits)) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                    }
                                    i29 = i4 & 524288;
                                    if (i29 != 0) {
                                        i25 |= 805306368;
                                    } else if ((i2 & 805306368) == 0) {
                                        i25 |= startRestartGroup.changedInstance(function27) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                    }
                                    if ((i3 & 6) == 0) {
                                        i30 = i3 | (((i4 & 1048576) == 0 && startRestartGroup.changed(scrollState)) ? 4 : 2);
                                    } else {
                                        i30 = i3;
                                    }
                                    if ((i3 & 48) == 0) {
                                        i30 |= ((i4 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                    }
                                    if ((i3 & 384) == 0) {
                                        if ((i4 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                            i35 = 256;
                                            i30 |= i35;
                                        }
                                        i35 = 128;
                                        i30 |= i35;
                                    }
                                    if ((i3 & 3072) == 0) {
                                        if ((8388608 & i4) != 0) {
                                        }
                                        i38 = 1024;
                                        i30 |= i38;
                                    }
                                    int i42 = i30;
                                    i31 = i4 & 16777216;
                                    if (i31 != 0) {
                                        i32 = i42 | 24576;
                                    } else {
                                        int i43 = i42;
                                        if ((i3 & 24576) == 0) {
                                            i43 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                                        }
                                        i32 = i43;
                                    }
                                    if (startRestartGroup.shouldExecute(((i19 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i32 & 9363) == 9362) ? false : true, i19 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "262@14578L7,278@15468L21,279@15528L5,280@15583L8");
                                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            i33 = (i4 & 16) != 0 ? i19 & (-57345) : i19;
                                            if ((i4 & 32) != 0) {
                                                i33 &= -458753;
                                            }
                                            if ((i4 & 262144) != 0) {
                                                i25 &= -234881025;
                                            }
                                            function220 = function2;
                                            function216 = function22;
                                            function217 = function23;
                                            function221 = function24;
                                            function218 = function25;
                                            function219 = function26;
                                            inputTransformation3 = inputTransformation;
                                            outputTransformation3 = outputTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActionHandler3 = keyboardActionHandler;
                                            function215 = function27;
                                            scrollState3 = scrollState;
                                            shape3 = shape;
                                            paddingValues4 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            z11 = z4;
                                            z9 = z5;
                                            textStyle4 = textStyle2;
                                            textFieldLabelPosition4 = textFieldLabelPosition2;
                                            modifier4 = modifier2;
                                            function34 = function32;
                                            i34 = i25;
                                            z10 = z3;
                                            textFieldLineLimits4 = textFieldLineLimits;
                                            textFieldColors3 = textFieldColors;
                                        } else {
                                            if (i37 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i6 != 0) {
                                                z4 = true;
                                            }
                                            if (i7 != 0) {
                                                z5 = false;
                                            }
                                            if ((i4 & 16) != 0) {
                                                ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                Object consume = startRestartGroup.consume(localTextStyle);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                textStyle2 = (TextStyle) consume;
                                                i19 &= -57345;
                                            }
                                            if ((i4 & 32) != 0) {
                                                textFieldLabelPosition2 = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                                                i19 &= -458753;
                                            }
                                            if (i8 != 0) {
                                                function32 = null;
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function222 = i9 != 0 ? null : function2;
                                            Function2<? super Composer, ? super Integer, Unit> function223 = i11 != 0 ? null : function22;
                                            Function2<? super Composer, ? super Integer, Unit> function224 = i13 != 0 ? null : function23;
                                            Function2<? super Composer, ? super Integer, Unit> function225 = i15 != 0 ? null : function24;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = i18 != 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function227 = i20 != 0 ? null : function26;
                                            boolean z12 = i22 != 0 ? false : z3;
                                            InputTransformation inputTransformation4 = i24 != 0 ? null : inputTransformation;
                                            OutputTransformation outputTransformation4 = i26 != 0 ? null : outputTransformation;
                                            KeyboardOptions keyboardOptions4 = i27 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActionHandler keyboardActionHandler4 = i28 != 0 ? null : keyboardActionHandler;
                                            if ((i4 & 262144) != 0) {
                                                textFieldLineLimits3 = TextFieldLineLimits.INSTANCE.getDefault();
                                                i25 &= -234881025;
                                            } else {
                                                textFieldLineLimits3 = textFieldLineLimits;
                                            }
                                            Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function228 = i29 != 0 ? null : function27;
                                            ScrollState rememberScrollState = (i4 & 1048576) != 0 ? ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1) : scrollState;
                                            Shape shape4 = (i4 & 2097152) != 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            TextFieldColors colors = (i4 & 4194304) != 0 ? TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6) : textFieldColors;
                                            if ((i4 & 8388608) == 0) {
                                                paddingValues3 = paddingValues;
                                            } else if (function32 == null || (textFieldLabelPosition2 instanceof TextFieldLabelPosition.Above)) {
                                                paddingValues3 = TextFieldDefaults.m4249contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            } else {
                                                paddingValues3 = TextFieldDefaults.m4248contentPaddingWithLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            }
                                            if (i31 != 0) {
                                                Modifier modifier5 = modifier2;
                                                textFieldColors3 = colors;
                                                textStyle4 = textStyle2;
                                                modifier4 = modifier5;
                                                shape3 = shape4;
                                                paddingValues4 = paddingValues3;
                                                inputTransformation3 = inputTransformation4;
                                                z9 = z5;
                                                textFieldLabelPosition4 = textFieldLabelPosition2;
                                                z10 = z12;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActionHandler3 = keyboardActionHandler4;
                                                function215 = function228;
                                                scrollState3 = rememberScrollState;
                                                i33 = i19;
                                                function216 = function223;
                                                function217 = function224;
                                                function34 = function32;
                                                function218 = function226;
                                                function219 = function227;
                                                outputTransformation3 = outputTransformation4;
                                                textFieldLineLimits4 = textFieldLineLimits3;
                                                i34 = i25;
                                                function220 = function222;
                                                function221 = function225;
                                                mutableInteractionSource3 = null;
                                            } else {
                                                Modifier modifier6 = modifier2;
                                                textFieldColors3 = colors;
                                                textStyle4 = textStyle2;
                                                modifier4 = modifier6;
                                                shape3 = shape4;
                                                paddingValues4 = paddingValues3;
                                                inputTransformation3 = inputTransformation4;
                                                z9 = z5;
                                                textFieldLabelPosition4 = textFieldLabelPosition2;
                                                z10 = z12;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActionHandler3 = keyboardActionHandler4;
                                                function215 = function228;
                                                scrollState3 = rememberScrollState;
                                                i33 = i19;
                                                function216 = function223;
                                                function217 = function224;
                                                function34 = function32;
                                                function218 = function226;
                                                function219 = function227;
                                                outputTransformation3 = outputTransformation4;
                                                textFieldLineLimits4 = textFieldLineLimits3;
                                                i34 = i25;
                                                function220 = function222;
                                                function221 = function225;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                            }
                                            z11 = z4;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1717599650, i33, i34, "androidx.compose.material3.TextField (TextField.kt:288)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(1230772861);
                                            ComposerKt.sourceInformation(startRestartGroup, "290@15992L39");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1345770971, "CC(remember):TextField.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            startRestartGroup.startReplaceGroup(-1345771622);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(-1345765512);
                                        ComposerKt.sourceInformation(startRestartGroup, "*294@16216L25");
                                        long m9171getColor0d7_KjU = textStyle4.m9171getColor0d7_KjU();
                                        if (m9171getColor0d7_KjU == 16) {
                                            m9171getColor0d7_KjU = textFieldColors3.m4242textColorXeAY9LY(z11, z10, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final TextStyle merge = textStyle4.merge(new TextStyle(m9171getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(484558238, true, new Function2() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit TextField$lambda$2;
                                                TextField$lambda$2 = TextFieldKt.TextField$lambda$2(Modifier.this, z10, textFieldColors3, textFieldState, z11, textFieldLineLimits4, outputTransformation3, mutableInteractionSource4, textFieldLabelPosition4, function34, function220, function216, function217, function221, function218, function219, paddingValues4, z9, inputTransformation3, merge, keyboardOptions3, keyboardActionHandler3, function215, scrollState3, shape3, (Composer) obj, ((Integer) obj2).intValue());
                                                return TextField$lambda$2;
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        z6 = z11;
                                        outputTransformation2 = outputTransformation3;
                                        textFieldLabelPosition3 = textFieldLabelPosition4;
                                        function33 = function34;
                                        function28 = function220;
                                        function212 = function216;
                                        function29 = function218;
                                        function210 = function219;
                                        paddingValues2 = paddingValues4;
                                        z7 = z9;
                                        inputTransformation2 = inputTransformation3;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActionHandler2 = keyboardActionHandler3;
                                        function211 = function215;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        textFieldColors2 = textFieldColors3;
                                        textFieldLineLimits2 = textFieldLineLimits4;
                                        function214 = function221;
                                        shape2 = shape3;
                                        z8 = z10;
                                        function213 = function217;
                                        scrollState2 = scrollState3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        function28 = function2;
                                        function29 = function25;
                                        function210 = function26;
                                        inputTransformation2 = inputTransformation;
                                        outputTransformation2 = outputTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActionHandler2 = keyboardActionHandler;
                                        textFieldLineLimits2 = textFieldLineLimits;
                                        function211 = function27;
                                        scrollState2 = scrollState;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        paddingValues2 = paddingValues;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        composer2 = startRestartGroup;
                                        z6 = z4;
                                        z7 = z5;
                                        textStyle3 = textStyle2;
                                        textFieldLabelPosition3 = textFieldLabelPosition2;
                                        modifier3 = modifier2;
                                        function33 = function32;
                                        function212 = function22;
                                        function213 = function23;
                                        function214 = function24;
                                        z8 = z3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit TextField$lambda$3;
                                                TextField$lambda$3 = TextFieldKt.TextField$lambda$3(TextFieldState.this, modifier3, z6, z7, textStyle3, textFieldLabelPosition3, function33, function28, function212, function213, function214, function29, function210, z8, inputTransformation2, outputTransformation2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function211, scrollState2, shape2, textFieldColors2, paddingValues2, mutableInteractionSource2, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                return TextField$lambda$3;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i26 = i4 & 32768;
                            if (i26 != 0) {
                            }
                            i27 = i4 & 65536;
                            if (i27 != 0) {
                            }
                            i28 = i4 & 131072;
                            if (i28 != 0) {
                            }
                            if ((i2 & 100663296) == 0) {
                            }
                            i29 = i4 & 524288;
                            if (i29 != 0) {
                            }
                            if ((i3 & 6) == 0) {
                            }
                            if ((i3 & 48) == 0) {
                            }
                            if ((i3 & 384) == 0) {
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i422 = i30;
                            i31 = i4 & 16777216;
                            if (i31 != 0) {
                            }
                            if (startRestartGroup.shouldExecute(((i19 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i32 & 9363) == 9362) ? false : true, i19 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i4 & 1024;
                        if (i14 == 0) {
                        }
                        i17 = i4 & 2048;
                        if (i17 == 0) {
                        }
                        int i392 = i16;
                        i19 = i5;
                        i20 = i4 & 4096;
                        if (i20 == 0) {
                        }
                        i22 = i4 & 8192;
                        if (i22 == 0) {
                        }
                        i24 = i4 & 16384;
                        if (i24 == 0) {
                        }
                        i26 = i4 & 32768;
                        if (i26 != 0) {
                        }
                        i27 = i4 & 65536;
                        if (i27 != 0) {
                        }
                        i28 = i4 & 131072;
                        if (i28 != 0) {
                        }
                        if ((i2 & 100663296) == 0) {
                        }
                        i29 = i4 & 524288;
                        if (i29 != 0) {
                        }
                        if ((i3 & 6) == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        if ((i3 & 384) == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i4222 = i30;
                        i31 = i4 & 16777216;
                        if (i31 != 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i19 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i32 & 9363) == 9362) ? false : true, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i10;
                    i12 = i4 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i4 & 1024;
                    if (i14 == 0) {
                    }
                    i17 = i4 & 2048;
                    if (i17 == 0) {
                    }
                    int i3922 = i16;
                    i19 = i5;
                    i20 = i4 & 4096;
                    if (i20 == 0) {
                    }
                    i22 = i4 & 8192;
                    if (i22 == 0) {
                    }
                    i24 = i4 & 16384;
                    if (i24 == 0) {
                    }
                    i26 = i4 & 32768;
                    if (i26 != 0) {
                    }
                    i27 = i4 & 65536;
                    if (i27 != 0) {
                    }
                    i28 = i4 & 131072;
                    if (i28 != 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    i29 = i4 & 524288;
                    if (i29 != 0) {
                    }
                    if ((i3 & 6) == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    if ((i3 & 384) == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i42222 = i30;
                    i31 = i4 & 16777216;
                    if (i31 != 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i19 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i32 & 9363) == 9362) ? false : true, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z2;
                if ((i & 24576) != 0) {
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i4 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i4 & 512;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i4 & 1024;
                if (i14 == 0) {
                }
                i17 = i4 & 2048;
                if (i17 == 0) {
                }
                int i39222 = i16;
                i19 = i5;
                i20 = i4 & 4096;
                if (i20 == 0) {
                }
                i22 = i4 & 8192;
                if (i22 == 0) {
                }
                i24 = i4 & 16384;
                if (i24 == 0) {
                }
                i26 = i4 & 32768;
                if (i26 != 0) {
                }
                i27 = i4 & 65536;
                if (i27 != 0) {
                }
                i28 = i4 & 131072;
                if (i28 != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i29 = i4 & 524288;
                if (i29 != 0) {
                }
                if ((i3 & 6) == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i3 & 384) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i422222 = i30;
                i31 = i4 & 16777216;
                if (i31 != 0) {
                }
                if (startRestartGroup.shouldExecute(((i19 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i32 & 9363) == 9362) ? false : true, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i7 = i4 & 8;
            int i382 = 2048;
            if (i7 != 0) {
            }
            z5 = z2;
            if ((i & 24576) != 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i4 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i4 & 1024;
            if (i14 == 0) {
            }
            i17 = i4 & 2048;
            if (i17 == 0) {
            }
            int i392222 = i16;
            i19 = i5;
            i20 = i4 & 4096;
            if (i20 == 0) {
            }
            i22 = i4 & 8192;
            if (i22 == 0) {
            }
            i24 = i4 & 16384;
            if (i24 == 0) {
            }
            i26 = i4 & 32768;
            if (i26 != 0) {
            }
            i27 = i4 & 65536;
            if (i27 != 0) {
            }
            i28 = i4 & 131072;
            if (i28 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i29 = i4 & 524288;
            if (i29 != 0) {
            }
            if ((i3 & 6) == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & 384) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i4222222 = i30;
            i31 = i4 & 16777216;
            if (i31 != 0) {
            }
            if (startRestartGroup.shouldExecute(((i19 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i32 & 9363) == 9362) ? false : true, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        z4 = z;
        i7 = i4 & 8;
        int i3822 = 2048;
        if (i7 != 0) {
        }
        z5 = z2;
        if ((i & 24576) != 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i4 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i4 & 1024;
        if (i14 == 0) {
        }
        i17 = i4 & 2048;
        if (i17 == 0) {
        }
        int i3922222 = i16;
        i19 = i5;
        i20 = i4 & 4096;
        if (i20 == 0) {
        }
        i22 = i4 & 8192;
        if (i22 == 0) {
        }
        i24 = i4 & 16384;
        if (i24 == 0) {
        }
        i26 = i4 & 32768;
        if (i26 != 0) {
        }
        i27 = i4 & 65536;
        if (i27 != 0) {
        }
        i28 = i4 & 131072;
        if (i28 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i29 = i4 & 524288;
        if (i29 != 0) {
        }
        if ((i3 & 6) == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i42222222 = i30;
        i31 = i4 & 16777216;
        if (i31 != 0) {
        }
        if (startRestartGroup.shouldExecute(((i19 & 306783379) != 306783378 && (i25 & 306783379) == 306783378 && (i32 & 9363) == 9362) ? false : true, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$2(Modifier modifier, final boolean z, final TextFieldColors textFieldColors, TextFieldState textFieldState, final boolean z2, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, final MutableInteractionSource mutableInteractionSource, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, PaddingValues paddingValues, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function27, ScrollState scrollState, final Shape shape, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C304@16631L38,339@18236L351,322@17465L1141,300@16488L2129:TextField.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(484558238, i, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:300)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            BasicTextFieldKt.BasicTextField(textFieldState, SizeKt.m1255defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier, z, Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0)), TextFieldDefaults.INSTANCE.m4264getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m4263getMinHeightD9Ej5fM()), z2, z3, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, textFieldLineLimits, (Function2<? super Density, ? super Function0<TextLayoutResult>, Unit>) function27, mutableInteractionSource, new SolidColor(textFieldColors.m4192cursorColorvNxB06k(z), null), outputTransformation, TextFieldDefaults.INSTANCE.decorator(textFieldState, z2, textFieldLineLimits, outputTransformation, mutableInteractionSource, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z, textFieldColors, paddingValues, ComposableLambdaKt.rememberComposableLambda(-2009308227, true, new Function2() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextField$lambda$2$0;
                    TextField$lambda$2$0 = TextFieldKt.TextField$lambda$2$0(z2, z, mutableInteractionSource, textFieldColors, shape, (Composer) obj, ((Integer) obj2).intValue());
                    return TextField$lambda$2$0;
                }
            }, composer, 54), composer, 0, 14155776, 0), scrollState, composer, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$2$0(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C340@18280L285:TextField.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2009308227, i, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:340)");
            }
            TextFieldDefaults.INSTANCE.m4257Container4EFweAY(z, z2, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer, 100663296, ComposerKt.invocationKey);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function29;
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
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z7;
        final int i34;
        final int i35;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        Composer composer2;
        final boolean z8;
        final boolean z9;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final boolean z10;
        final VisualTransformation visualTransformation2;
        ScopeUpdateScope endRestartGroup;
        int i36;
        int i37;
        final Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        TextStyle textStyle4;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        int i38;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final KeyboardActions keyboardActions3;
        final boolean z11;
        final int i39;
        final TextFieldColors textFieldColors3;
        final VisualTransformation visualTransformation3;
        final boolean z12;
        final boolean z13;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final boolean z14;
        final KeyboardOptions keyboardOptions3;
        final int i40;
        int i41;
        MutableInteractionSource mutableInteractionSource3;
        final MutableInteractionSource mutableInteractionSource4;
        int i42;
        Composer startRestartGroup = composer.startRestartGroup(-154966360);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)N(value,onValueChange,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,isError,visualTransformation,keyboardOptions,keyboardActions,singleLine,maxLines,minLines,interactionSource,shape,colors)454@24924L1959,454@24837L2046:TextField.kt#uh7d8r");
        if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i43 = i6 & 4;
        if (i43 != 0) {
            i7 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z5 = z;
                i7 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z6 = z2;
                    i7 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        textStyle2 = textStyle;
                        i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i6 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        function28 = function2;
                    } else {
                        function28 = function2;
                        if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                        }
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i7 |= 12582912;
                        function29 = function22;
                    } else {
                        function29 = function22;
                        if ((i3 & 12582912) == 0) {
                            i7 |= startRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i13 = i12;
                        i7 |= startRestartGroup.changedInstance(function23) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i15 = i14;
                            i7 |= startRestartGroup.changedInstance(function24) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i16 = i6 & 1024;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            i19 = i6 & 2048;
                            if (i19 == 0) {
                                i18 |= 48;
                                i20 = i19;
                            } else if ((i4 & 48) == 0) {
                                i20 = i19;
                                i18 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                            } else {
                                i20 = i19;
                            }
                            int i44 = i18;
                            i21 = i7;
                            i22 = i6 & 4096;
                            if (i22 == 0) {
                                i23 = i44 | 384;
                            } else {
                                int i45 = i44;
                                if ((i4 & 384) == 0) {
                                    i45 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                                }
                                i23 = i45;
                            }
                            i24 = i6 & 8192;
                            if (i24 == 0) {
                                i25 = i23 | 3072;
                            } else {
                                int i46 = i23;
                                if ((i4 & 3072) == 0) {
                                    i25 = i46 | (startRestartGroup.changed(z3) ? 2048 : 1024);
                                } else {
                                    i25 = i46;
                                }
                            }
                            i26 = i6 & 16384;
                            if (i26 == 0) {
                                i27 = i25 | 24576;
                            } else {
                                i27 = i25;
                                if ((i4 & 24576) == 0) {
                                    i27 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                    i28 = i6 & 32768;
                                    if (i28 != 0) {
                                        i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i27 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                    }
                                    i29 = i6 & 65536;
                                    if (i29 != 0) {
                                        i27 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i27 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                    }
                                    i30 = i6 & 131072;
                                    if (i30 != 0) {
                                        i27 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i27 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                                    }
                                    if ((i4 & 100663296) == 0) {
                                        i27 |= ((i6 & 262144) == 0 && startRestartGroup.changed(i)) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                    }
                                    i31 = i6 & 524288;
                                    if (i31 != 0) {
                                        i27 |= 805306368;
                                    } else if ((i4 & 805306368) == 0) {
                                        i27 |= startRestartGroup.changed(i2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                    }
                                    i32 = i6 & 1048576;
                                    if (i32 != 0) {
                                        i33 = i5 | 6;
                                    } else if ((i5 & 6) == 0) {
                                        i33 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                    } else {
                                        i33 = i5;
                                    }
                                    if ((i5 & 48) == 0) {
                                        i33 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                    }
                                    if ((i5 & 384) == 0) {
                                        if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                            i42 = 256;
                                            i33 |= i42;
                                        }
                                        i42 = 128;
                                        i33 |= i42;
                                    }
                                    if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "425@23492L7,441@24288L5,442@24343L8");
                                        if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            i41 = (i6 & 32) != 0 ? i21 & (-458753) : i21;
                                            if ((i6 & 262144) != 0) {
                                                i27 &= -234881025;
                                            }
                                            function217 = function23;
                                            function218 = function24;
                                            function219 = function25;
                                            function221 = function26;
                                            function222 = function27;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            z11 = z4;
                                            i40 = i;
                                            i39 = i2;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColors3 = textFieldColors;
                                            textStyle4 = textStyle2;
                                            function223 = function28;
                                            function220 = function29;
                                            modifier4 = modifier2;
                                            i38 = i27;
                                            z14 = z3;
                                            keyboardActions3 = keyboardActions;
                                            z12 = z5;
                                            z13 = z6;
                                        } else {
                                            if (i43 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i8 != 0) {
                                                z5 = true;
                                            }
                                            if (i9 != 0) {
                                                z6 = false;
                                            }
                                            if ((i6 & 32) != 0) {
                                                ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                Object consume = startRestartGroup.consume(localTextStyle);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                i36 = i21 & (-458753);
                                                textStyle2 = (TextStyle) consume;
                                            } else {
                                                i36 = i21;
                                            }
                                            if (i10 != 0) {
                                                function28 = null;
                                            }
                                            if (i11 != 0) {
                                                function29 = null;
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function224 = i13 != 0 ? null : function23;
                                            Function2<? super Composer, ? super Integer, Unit> function225 = i15 != 0 ? null : function24;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = i17 != 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function227 = i20 != 0 ? null : function26;
                                            Function2<? super Composer, ? super Integer, Unit> function228 = i22 != 0 ? null : function27;
                                            boolean z15 = i24 != 0 ? false : z3;
                                            VisualTransformation none = i26 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i28 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions4 = i29 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                            boolean z16 = i30 != 0 ? false : z4;
                                            if ((i6 & 262144) != 0) {
                                                i37 = z16 ? 1 : Integer.MAX_VALUE;
                                                i27 &= -234881025;
                                            } else {
                                                i37 = i;
                                            }
                                            int i47 = i31 != 0 ? 1 : i2;
                                            MutableInteractionSource mutableInteractionSource5 = i32 == 0 ? mutableInteractionSource : null;
                                            Shape shape4 = (i6 & 2097152) != 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            if ((i6 & 4194304) != 0) {
                                                shape3 = shape4;
                                                function217 = function224;
                                                function218 = function225;
                                                function219 = function226;
                                                function220 = function29;
                                                function221 = function227;
                                                i38 = i27;
                                                function222 = function228;
                                                keyboardActions3 = keyboardActions4;
                                                z11 = z16;
                                                i39 = i47;
                                                textFieldColors3 = TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                visualTransformation3 = none;
                                                z12 = z5;
                                                textStyle4 = textStyle2;
                                                function223 = function28;
                                                modifier4 = modifier2;
                                                z14 = z15;
                                                keyboardOptions3 = keyboardOptions4;
                                                i40 = i37;
                                                i41 = i36;
                                                z13 = z6;
                                            } else {
                                                shape3 = shape4;
                                                function217 = function224;
                                                function218 = function225;
                                                textStyle4 = textStyle2;
                                                function219 = function226;
                                                function220 = function29;
                                                modifier4 = modifier2;
                                                function221 = function227;
                                                i38 = i27;
                                                function222 = function228;
                                                keyboardActions3 = keyboardActions4;
                                                z11 = z16;
                                                i39 = i47;
                                                textFieldColors3 = textFieldColors;
                                                visualTransformation3 = none;
                                                z12 = z5;
                                                z13 = z6;
                                                function223 = function28;
                                                z14 = z15;
                                                keyboardOptions3 = keyboardOptions4;
                                                i40 = i37;
                                                i41 = i36;
                                            }
                                            mutableInteractionSource3 = mutableInteractionSource5;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-154966360, i41, i38, "androidx.compose.material3.TextField (TextField.kt:443)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(488158419);
                                            ComposerKt.sourceInformation(startRestartGroup, "445@24438L39");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1401220367, "CC(remember):TextField.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            startRestartGroup.startReplaceGroup(1401219716);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(1401225826);
                                        ComposerKt.sourceInformation(startRestartGroup, "*449@24662L25");
                                        long m9171getColor0d7_KjU = textStyle4.m9171getColor0d7_KjU();
                                        if (m9171getColor0d7_KjU == 16) {
                                            m9171getColor0d7_KjU = textFieldColors3.m4242textColorXeAY9LY(z12, z14, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final TextStyle merge = textStyle4.merge(new TextStyle(m9171getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1459735400, true, new Function2() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit TextField$lambda$6;
                                                TextField$lambda$6 = TextFieldKt.TextField$lambda$6(Modifier.this, z14, textFieldColors3, str, function1, z12, z13, merge, keyboardOptions3, keyboardActions3, z11, i40, i39, visualTransformation3, mutableInteractionSource4, function223, function220, function217, function218, function219, function221, function222, shape3, (Composer) obj, ((Integer) obj2).intValue());
                                                return TextField$lambda$6;
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        textFieldColors2 = textFieldColors3;
                                        z8 = z12;
                                        z9 = z13;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActions2 = keyboardActions3;
                                        z7 = z11;
                                        i34 = i40;
                                        i35 = i39;
                                        visualTransformation2 = visualTransformation3;
                                        function213 = function223;
                                        function214 = function220;
                                        function215 = function217;
                                        function210 = function219;
                                        function211 = function221;
                                        function212 = function222;
                                        shape2 = shape3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        z10 = z14;
                                        function216 = function218;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        function210 = function25;
                                        function211 = function26;
                                        function212 = function27;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z4;
                                        i34 = i;
                                        i35 = i2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer2 = startRestartGroup;
                                        z8 = z5;
                                        z9 = z6;
                                        textStyle3 = textStyle2;
                                        function213 = function28;
                                        function214 = function29;
                                        modifier3 = modifier2;
                                        function215 = function23;
                                        function216 = function24;
                                        z10 = z3;
                                        visualTransformation2 = visualTransformation;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit TextField$lambda$7;
                                                TextField$lambda$7 = TextFieldKt.TextField$lambda$7(str, function1, modifier3, z8, z9, textStyle3, function213, function214, function215, function216, function210, function211, function212, z10, visualTransformation2, keyboardOptions2, keyboardActions2, z7, i34, i35, mutableInteractionSource2, shape2, textFieldColors2, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                                return TextField$lambda$7;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i28 = i6 & 32768;
                            if (i28 != 0) {
                            }
                            i29 = i6 & 65536;
                            if (i29 != 0) {
                            }
                            i30 = i6 & 131072;
                            if (i30 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i31 = i6 & 524288;
                            if (i31 != 0) {
                            }
                            i32 = i6 & 1048576;
                            if (i32 != 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & 1024;
                        if (i16 == 0) {
                        }
                        i19 = i6 & 2048;
                        if (i19 == 0) {
                        }
                        int i442 = i18;
                        i21 = i7;
                        i22 = i6 & 4096;
                        if (i22 == 0) {
                        }
                        i24 = i6 & 8192;
                        if (i24 == 0) {
                        }
                        i26 = i6 & 16384;
                        if (i26 == 0) {
                        }
                        i28 = i6 & 32768;
                        if (i28 != 0) {
                        }
                        i29 = i6 & 65536;
                        if (i29 != 0) {
                        }
                        i30 = i6 & 131072;
                        if (i30 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i31 = i6 & 524288;
                        if (i31 != 0) {
                        }
                        i32 = i6 & 1048576;
                        if (i32 != 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                    }
                    int i4422 = i18;
                    i21 = i7;
                    i22 = i6 & 4096;
                    if (i22 == 0) {
                    }
                    i24 = i6 & 8192;
                    if (i24 == 0) {
                    }
                    i26 = i6 & 16384;
                    if (i26 == 0) {
                    }
                    i28 = i6 & 32768;
                    if (i28 != 0) {
                    }
                    i29 = i6 & 65536;
                    if (i29 != 0) {
                    }
                    i30 = i6 & 131072;
                    if (i30 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i31 = i6 & 524288;
                    if (i31 != 0) {
                    }
                    i32 = i6 & 1048576;
                    if (i32 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z6 = z2;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                i10 = i6 & 64;
                if (i10 == 0) {
                }
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i44222 = i18;
                i21 = i7;
                i22 = i6 & 4096;
                if (i22 == 0) {
                }
                i24 = i6 & 8192;
                if (i24 == 0) {
                }
                i26 = i6 & 16384;
                if (i26 == 0) {
                }
                i28 = i6 & 32768;
                if (i28 != 0) {
                }
                i29 = i6 & 65536;
                if (i29 != 0) {
                }
                i30 = i6 & 131072;
                if (i30 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i31 = i6 & 524288;
                if (i31 != 0) {
                }
                i32 = i6 & 1048576;
                if (i32 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            z6 = z2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            i10 = i6 & 64;
            if (i10 == 0) {
            }
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i442222 = i18;
            i21 = i7;
            i22 = i6 & 4096;
            if (i22 == 0) {
            }
            i24 = i6 & 8192;
            if (i24 == 0) {
            }
            i26 = i6 & 16384;
            if (i26 == 0) {
            }
            i28 = i6 & 32768;
            if (i28 != 0) {
            }
            i29 = i6 & 65536;
            if (i29 != 0) {
            }
            i30 = i6 & 131072;
            if (i30 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i31 = i6 & 524288;
            if (i31 != 0) {
            }
            i32 = i6 & 1048576;
            if (i32 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        z6 = z2;
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i4422222 = i18;
        i21 = i7;
        i22 = i6 & 4096;
        if (i22 == 0) {
        }
        i24 = i6 & 8192;
        if (i24 == 0) {
        }
        i26 = i6 & 16384;
        if (i26 == 0) {
        }
        i28 = i6 & 32768;
        if (i28 != 0) {
        }
        i29 = i6 & 65536;
        if (i29 != 0) {
        }
        i30 = i6 & 131072;
        if (i30 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i31 = i6 & 524288;
        if (i31 != 0) {
        }
        i32 = i6 & 1048576;
        if (i32 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$6(Modifier modifier, final boolean z, final TextFieldColors textFieldColors, final String str, Function1 function1, final boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final boolean z4, int i, int i2, final VisualTransformation visualTransformation, final MutableInteractionSource mutableInteractionSource, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final Function2 function27, final Shape shape, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C459@25077L38,477@25881L985,455@24934L1943:TextField.kt#uh7d8r");
        if (!composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1459735400, i3, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:455)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function1, SizeKt.m1255defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier, z, Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0)), TextFieldDefaults.INSTANCE.m4264getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m4263getMinHeightD9Ej5fM()), z2, z3, textStyle, keyboardOptions, keyboardActions, z4, i, i2, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m4192cursorColorvNxB06k(z), null), ComposableLambdaKt.rememberComposableLambda(1451491557, true, new Function3() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit TextField$lambda$6$0;
                    TextField$lambda$6$0 = TextFieldKt.TextField$lambda$6$0(str, z2, z4, visualTransformation, mutableInteractionSource, z, function2, function22, function23, function24, function25, function26, function27, shape, textFieldColors, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return TextField$lambda$6$0;
                }
            }, composer, 54), composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$6$0(String str, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Shape shape, TextFieldColors textFieldColors, Function2 function28, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(innerTextField)479@26036L812:TextField.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(function28) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1451491557, i2, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:479)");
            }
            TextFieldDefaults.INSTANCE.DecorationBox(str, function28, z, z2, visualTransformation, mutableInteractionSource, z3, function2, function22, function23, function24, function25, function26, function27, shape, textFieldColors, null, null, composer, (i2 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function29;
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
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z7;
        final int i34;
        final int i35;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        Composer composer2;
        final boolean z8;
        final boolean z9;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final boolean z10;
        final VisualTransformation visualTransformation2;
        ScopeUpdateScope endRestartGroup;
        int i36;
        int i37;
        final Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        TextStyle textStyle4;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        int i38;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final KeyboardActions keyboardActions3;
        final boolean z11;
        final int i39;
        final TextFieldColors textFieldColors3;
        final VisualTransformation visualTransformation3;
        final boolean z12;
        final boolean z13;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final boolean z14;
        final KeyboardOptions keyboardOptions3;
        final int i40;
        int i41;
        MutableInteractionSource mutableInteractionSource3;
        final MutableInteractionSource mutableInteractionSource4;
        int i42;
        Composer startRestartGroup = composer.startRestartGroup(-1126989771);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)N(value,onValueChange,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,isError,visualTransformation,keyboardOptions,keyboardActions,singleLine,maxLines,minLines,interactionSource,shape,colors)604@33283L1964,604@33196L2051:TextField.kt#uh7d8r");
        if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i43 = i6 & 4;
        if (i43 != 0) {
            i7 |= 384;
        } else if ((i3 & 384) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i3 & 3072) == 0) {
                z5 = z;
                i7 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z6 = z2;
                    i7 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        textStyle2 = textStyle;
                        i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i6 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        function28 = function2;
                    } else {
                        function28 = function2;
                        if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                        }
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i7 |= 12582912;
                        function29 = function22;
                    } else {
                        function29 = function22;
                        if ((i3 & 12582912) == 0) {
                            i7 |= startRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i13 = i12;
                        i7 |= startRestartGroup.changedInstance(function23) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i15 = i14;
                            i7 |= startRestartGroup.changedInstance(function24) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            i16 = i6 & 1024;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            i19 = i6 & 2048;
                            if (i19 == 0) {
                                i18 |= 48;
                                i20 = i19;
                            } else if ((i4 & 48) == 0) {
                                i20 = i19;
                                i18 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                            } else {
                                i20 = i19;
                            }
                            int i44 = i18;
                            i21 = i7;
                            i22 = i6 & 4096;
                            if (i22 == 0) {
                                i23 = i44 | 384;
                            } else {
                                int i45 = i44;
                                if ((i4 & 384) == 0) {
                                    i45 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                                }
                                i23 = i45;
                            }
                            i24 = i6 & 8192;
                            if (i24 == 0) {
                                i25 = i23 | 3072;
                            } else {
                                int i46 = i23;
                                if ((i4 & 3072) == 0) {
                                    i25 = i46 | (startRestartGroup.changed(z3) ? 2048 : 1024);
                                } else {
                                    i25 = i46;
                                }
                            }
                            i26 = i6 & 16384;
                            if (i26 == 0) {
                                i27 = i25 | 24576;
                            } else {
                                i27 = i25;
                                if ((i4 & 24576) == 0) {
                                    i27 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                    i28 = i6 & 32768;
                                    if (i28 != 0) {
                                        i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i27 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                    }
                                    i29 = i6 & 65536;
                                    if (i29 != 0) {
                                        i27 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i27 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                    }
                                    i30 = i6 & 131072;
                                    if (i30 != 0) {
                                        i27 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i27 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                                    }
                                    if ((i4 & 100663296) == 0) {
                                        i27 |= ((i6 & 262144) == 0 && startRestartGroup.changed(i)) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                                    }
                                    i31 = i6 & 524288;
                                    if (i31 != 0) {
                                        i27 |= 805306368;
                                    } else if ((i4 & 805306368) == 0) {
                                        i27 |= startRestartGroup.changed(i2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                    }
                                    i32 = i6 & 1048576;
                                    if (i32 != 0) {
                                        i33 = i5 | 6;
                                    } else if ((i5 & 6) == 0) {
                                        i33 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                    } else {
                                        i33 = i5;
                                    }
                                    if ((i5 & 48) == 0) {
                                        i33 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                    }
                                    if ((i5 & 384) == 0) {
                                        if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                            i42 = 256;
                                            i33 |= i42;
                                        }
                                        i42 = 128;
                                        i33 |= i42;
                                    }
                                    if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "575@31851L7,591@32647L5,592@32702L8");
                                        if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            i41 = (i6 & 32) != 0 ? i21 & (-458753) : i21;
                                            if ((i6 & 262144) != 0) {
                                                i27 &= -234881025;
                                            }
                                            function217 = function23;
                                            function218 = function24;
                                            function219 = function25;
                                            function221 = function26;
                                            function222 = function27;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            z11 = z4;
                                            i40 = i;
                                            i39 = i2;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColors3 = textFieldColors;
                                            textStyle4 = textStyle2;
                                            function223 = function28;
                                            function220 = function29;
                                            modifier4 = modifier2;
                                            i38 = i27;
                                            z14 = z3;
                                            keyboardActions3 = keyboardActions;
                                            z12 = z5;
                                            z13 = z6;
                                        } else {
                                            if (i43 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i8 != 0) {
                                                z5 = true;
                                            }
                                            if (i9 != 0) {
                                                z6 = false;
                                            }
                                            if ((i6 & 32) != 0) {
                                                ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                Object consume = startRestartGroup.consume(localTextStyle);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                i36 = i21 & (-458753);
                                                textStyle2 = (TextStyle) consume;
                                            } else {
                                                i36 = i21;
                                            }
                                            if (i10 != 0) {
                                                function28 = null;
                                            }
                                            if (i11 != 0) {
                                                function29 = null;
                                            }
                                            Function2<? super Composer, ? super Integer, Unit> function224 = i13 != 0 ? null : function23;
                                            Function2<? super Composer, ? super Integer, Unit> function225 = i15 != 0 ? null : function24;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = i17 != 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function227 = i20 != 0 ? null : function26;
                                            Function2<? super Composer, ? super Integer, Unit> function228 = i22 != 0 ? null : function27;
                                            boolean z15 = i24 != 0 ? false : z3;
                                            VisualTransformation none = i26 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i28 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions4 = i29 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                            boolean z16 = i30 != 0 ? false : z4;
                                            if ((i6 & 262144) != 0) {
                                                i37 = z16 ? 1 : Integer.MAX_VALUE;
                                                i27 &= -234881025;
                                            } else {
                                                i37 = i;
                                            }
                                            int i47 = i31 != 0 ? 1 : i2;
                                            MutableInteractionSource mutableInteractionSource5 = i32 == 0 ? mutableInteractionSource : null;
                                            Shape shape4 = (i6 & 2097152) != 0 ? TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            if ((i6 & 4194304) != 0) {
                                                shape3 = shape4;
                                                function217 = function224;
                                                function218 = function225;
                                                function219 = function226;
                                                function220 = function29;
                                                function221 = function227;
                                                i38 = i27;
                                                function222 = function228;
                                                keyboardActions3 = keyboardActions4;
                                                z11 = z16;
                                                i39 = i47;
                                                textFieldColors3 = TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                visualTransformation3 = none;
                                                z12 = z5;
                                                textStyle4 = textStyle2;
                                                function223 = function28;
                                                modifier4 = modifier2;
                                                z14 = z15;
                                                keyboardOptions3 = keyboardOptions4;
                                                i40 = i37;
                                                i41 = i36;
                                                z13 = z6;
                                            } else {
                                                shape3 = shape4;
                                                function217 = function224;
                                                function218 = function225;
                                                textStyle4 = textStyle2;
                                                function219 = function226;
                                                function220 = function29;
                                                modifier4 = modifier2;
                                                function221 = function227;
                                                i38 = i27;
                                                function222 = function228;
                                                keyboardActions3 = keyboardActions4;
                                                z11 = z16;
                                                i39 = i47;
                                                textFieldColors3 = textFieldColors;
                                                visualTransformation3 = none;
                                                z12 = z5;
                                                z13 = z6;
                                                function223 = function28;
                                                z14 = z15;
                                                keyboardOptions3 = keyboardOptions4;
                                                i40 = i37;
                                                i41 = i36;
                                            }
                                            mutableInteractionSource3 = mutableInteractionSource5;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1126989771, i41, i38, "androidx.compose.material3.TextField (TextField.kt:593)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(-391753178);
                                            ComposerKt.sourceInformation(startRestartGroup, "595@32797L39");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -705373860, "CC(remember):TextField.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            startRestartGroup.startReplaceGroup(-705374511);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(-705368401);
                                        ComposerKt.sourceInformation(startRestartGroup, "*599@33021L25");
                                        long m9171getColor0d7_KjU = textStyle4.m9171getColor0d7_KjU();
                                        if (m9171getColor0d7_KjU == 16) {
                                            m9171getColor0d7_KjU = textFieldColors3.m4242textColorXeAY9LY(z12, z14, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final TextStyle merge = textStyle4.merge(new TextStyle(m9171getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-306109195, true, new Function2() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit TextField$lambda$10;
                                                TextField$lambda$10 = TextFieldKt.TextField$lambda$10(Modifier.this, z14, textFieldColors3, textFieldValue, function1, z12, z13, merge, keyboardOptions3, keyboardActions3, z11, i40, i39, visualTransformation3, mutableInteractionSource4, function223, function220, function217, function218, function219, function221, function222, shape3, (Composer) obj, ((Integer) obj2).intValue());
                                                return TextField$lambda$10;
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        textFieldColors2 = textFieldColors3;
                                        z8 = z12;
                                        z9 = z13;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActions2 = keyboardActions3;
                                        z7 = z11;
                                        i34 = i40;
                                        i35 = i39;
                                        visualTransformation2 = visualTransformation3;
                                        function213 = function223;
                                        function214 = function220;
                                        function215 = function217;
                                        function210 = function219;
                                        function211 = function221;
                                        function212 = function222;
                                        shape2 = shape3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        z10 = z14;
                                        function216 = function218;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        function210 = function25;
                                        function211 = function26;
                                        function212 = function27;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z7 = z4;
                                        i34 = i;
                                        i35 = i2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer2 = startRestartGroup;
                                        z8 = z5;
                                        z9 = z6;
                                        textStyle3 = textStyle2;
                                        function213 = function28;
                                        function214 = function29;
                                        modifier3 = modifier2;
                                        function215 = function23;
                                        function216 = function24;
                                        z10 = z3;
                                        visualTransformation2 = visualTransformation;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit TextField$lambda$11;
                                                TextField$lambda$11 = TextFieldKt.TextField$lambda$11(TextFieldValue.this, function1, modifier3, z8, z9, textStyle3, function213, function214, function215, function216, function210, function211, function212, z10, visualTransformation2, keyboardOptions2, keyboardActions2, z7, i34, i35, mutableInteractionSource2, shape2, textFieldColors2, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                                return TextField$lambda$11;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i28 = i6 & 32768;
                            if (i28 != 0) {
                            }
                            i29 = i6 & 65536;
                            if (i29 != 0) {
                            }
                            i30 = i6 & 131072;
                            if (i30 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i31 = i6 & 524288;
                            if (i31 != 0) {
                            }
                            i32 = i6 & 1048576;
                            if (i32 != 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & 1024;
                        if (i16 == 0) {
                        }
                        i19 = i6 & 2048;
                        if (i19 == 0) {
                        }
                        int i442 = i18;
                        i21 = i7;
                        i22 = i6 & 4096;
                        if (i22 == 0) {
                        }
                        i24 = i6 & 8192;
                        if (i24 == 0) {
                        }
                        i26 = i6 & 16384;
                        if (i26 == 0) {
                        }
                        i28 = i6 & 32768;
                        if (i28 != 0) {
                        }
                        i29 = i6 & 65536;
                        if (i29 != 0) {
                        }
                        i30 = i6 & 131072;
                        if (i30 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i31 = i6 & 524288;
                        if (i31 != 0) {
                        }
                        i32 = i6 & 1048576;
                        if (i32 != 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                    }
                    int i4422 = i18;
                    i21 = i7;
                    i22 = i6 & 4096;
                    if (i22 == 0) {
                    }
                    i24 = i6 & 8192;
                    if (i24 == 0) {
                    }
                    i26 = i6 & 16384;
                    if (i26 == 0) {
                    }
                    i28 = i6 & 32768;
                    if (i28 != 0) {
                    }
                    i29 = i6 & 65536;
                    if (i29 != 0) {
                    }
                    i30 = i6 & 131072;
                    if (i30 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i31 = i6 & 524288;
                    if (i31 != 0) {
                    }
                    i32 = i6 & 1048576;
                    if (i32 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z6 = z2;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                i10 = i6 & 64;
                if (i10 == 0) {
                }
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i44222 = i18;
                i21 = i7;
                i22 = i6 & 4096;
                if (i22 == 0) {
                }
                i24 = i6 & 8192;
                if (i24 == 0) {
                }
                i26 = i6 & 16384;
                if (i26 == 0) {
                }
                i28 = i6 & 32768;
                if (i28 != 0) {
                }
                i29 = i6 & 65536;
                if (i29 != 0) {
                }
                i30 = i6 & 131072;
                if (i30 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i31 = i6 & 524288;
                if (i31 != 0) {
                }
                i32 = i6 & 1048576;
                if (i32 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            z6 = z2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            i10 = i6 & 64;
            if (i10 == 0) {
            }
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i442222 = i18;
            i21 = i7;
            i22 = i6 & 4096;
            if (i22 == 0) {
            }
            i24 = i6 & 8192;
            if (i24 == 0) {
            }
            i26 = i6 & 16384;
            if (i26 == 0) {
            }
            i28 = i6 & 32768;
            if (i28 != 0) {
            }
            i29 = i6 & 65536;
            if (i29 != 0) {
            }
            i30 = i6 & 131072;
            if (i30 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i31 = i6 & 524288;
            if (i31 != 0) {
            }
            i32 = i6 & 1048576;
            if (i32 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        z6 = z2;
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i4422222 = i18;
        i21 = i7;
        i22 = i6 & 4096;
        if (i22 == 0) {
        }
        i24 = i6 & 8192;
        if (i24 == 0) {
        }
        i26 = i6 & 16384;
        if (i26 == 0) {
        }
        i28 = i6 & 32768;
        if (i28 != 0) {
        }
        i29 = i6 & 65536;
        if (i29 != 0) {
        }
        i30 = i6 & 131072;
        if (i30 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i31 = i6 & 524288;
        if (i31 != 0) {
        }
        i32 = i6 & 1048576;
        if (i32 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute(((i21 & 306783379) != 306783378 && (i27 & 306783379) == 306783378 && (i33 & 147) == 146) ? false : true, i21 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$10(Modifier modifier, final boolean z, final TextFieldColors textFieldColors, final TextFieldValue textFieldValue, Function1 function1, final boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final boolean z4, int i, int i2, final VisualTransformation visualTransformation, final MutableInteractionSource mutableInteractionSource, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final Function2 function27, final Shape shape, Composer composer, int i3) {
        ComposerKt.sourceInformation(composer, "C609@33436L38,627@34240L990,605@33293L1948:TextField.kt#uh7d8r");
        if (!composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-306109195, i3, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:605)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, SizeKt.m1255defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier, z, Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0)), TextFieldDefaults.INSTANCE.m4264getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m4263getMinHeightD9Ej5fM()), z2, z3, textStyle, keyboardOptions, keyboardActions, z4, i, i2, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m4192cursorColorvNxB06k(z), null), ComposableLambdaKt.rememberComposableLambda(-609710734, true, new Function3() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit TextField$lambda$10$0;
                    TextField$lambda$10$0 = TextFieldKt.TextField$lambda$10$0(TextFieldValue.this, z2, z4, visualTransformation, mutableInteractionSource, z, function2, function22, function23, function24, function25, function26, function27, shape, textFieldColors, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return TextField$lambda$10$0;
                }
            }, composer, 54), composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField$lambda$10$0(TextFieldValue textFieldValue, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Shape shape, TextFieldColors textFieldColors, Function2 function28, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(innerTextField)629@34395L817:TextField.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(function28) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-609710734, i2, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:629)");
            }
            TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function28, z, z2, visualTransformation, mutableInteractionSource, z3, function2, function22, function23, function24, function25, function26, function27, shape, textFieldColors, null, null, composer, (i2 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Function2<? super Composer, ? super Integer, Unit> function26, final boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, final FloatProducer floatProducer2, final FloatProducer floatProducer3, final Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32;
        final TextFieldLabelPosition textFieldLabelPosition2;
        Function2<? super Composer, ? super Integer, Unit> function29;
        PaddingValues paddingValues2;
        Object textFieldMeasurePolicy;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i5;
        float f;
        Modifier m1205paddingqDBjuR0$default;
        boolean z2;
        Object rememberedValue;
        final FloatProducer floatProducer4 = floatProducer;
        Composer startRestartGroup = composer.startRestartGroup(-1552532491);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)N(modifier,textField,label,placeholder,leading,trailing,prefix,suffix,singleLine,labelPosition,labelProgress,placeholderAlpha,affixAlpha,container,supporting,paddingValues)675@36064L26,677@36123L623,696@36794L7,697@36806L4465:TextField.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(textFieldLabelPosition) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? startRestartGroup.changed(floatProducer4) : startRestartGroup.changedInstance(floatProducer4) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? startRestartGroup.changed(floatProducer2) : startRestartGroup.changedInstance(floatProducer2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? startRestartGroup.changed(floatProducer3) : startRestartGroup.changedInstance(floatProducer3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function28) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 131072 : 65536;
        }
        int i7 = i4;
        if (!startRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (74899 & i7) == 74898) ? false : true, i6 & 1)) {
            function32 = function3;
            textFieldLabelPosition2 = textFieldLabelPosition;
            function29 = function28;
            paddingValues2 = paddingValues;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1552532491, i6, i7, "androidx.compose.material3.TextFieldLayout (TextField.kt:674)");
            }
            float minimizedLabelHalfHeight = TextFieldImplKt.minimizedLabelHalfHeight(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1630048572, "CC(remember):TextField.kt#9igjgp");
            int i8 = i7 & 14;
            boolean changed = ((1879048192 & i6) == 536870912) | ((234881024 & i6) == 67108864) | (i8 == 4 || ((i7 & 8) != 0 && startRestartGroup.changed(floatProducer4))) | ((i7 & 112) == 32 || ((i7 & 64) != 0 && startRestartGroup.changed(floatProducer2))) | ((i7 & 896) == 256 || ((i7 & 512) != 0 && startRestartGroup.changed(floatProducer3))) | ((458752 & i7) == 131072) | startRestartGroup.changed(minimizedLabelHalfHeight);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                function210 = function27;
                paddingValues2 = paddingValues;
                i5 = i7;
                textFieldMeasurePolicy = new TextFieldMeasurePolicy(z, textFieldLabelPosition, floatProducer4, floatProducer2, floatProducer3, paddingValues2, minimizedLabelHalfHeight, null);
                startRestartGroup.updateRememberedValue(textFieldMeasurePolicy);
            } else {
                function210 = function27;
                paddingValues2 = paddingValues;
                i5 = i7;
                textFieldMeasurePolicy = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            TextFieldMeasurePolicy textFieldMeasurePolicy2 = (TextFieldMeasurePolicy) textFieldMeasurePolicy;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, textFieldMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 993226589, "C703@37125L11,725@37945L32,794@40585L187:TextField.kt#uh7d8r");
            function210.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
            if (function23 != null) {
                startRestartGroup.startReplaceGroup(993153366);
                ComposerKt.sourceInformation(startRestartGroup, "706@37189L224");
                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, minimumInteractiveComponentSize);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5864constructorimpl2 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 213989613, "C710@37386L9:TextField.kt#uh7d8r");
                function23.invoke(startRestartGroup, Integer.valueOf((i6 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(993399382);
                startRestartGroup.endReplaceGroup();
            }
            if (function24 != null) {
                startRestartGroup.startReplaceGroup(993442100);
                ComposerKt.sourceInformation(startRestartGroup, "714@37480L226");
                Modifier minimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId));
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m3 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, minimumInteractiveComponentSize2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5864constructorimpl3 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl3, Integer.valueOf(m3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 145939381, "C718@37678L10:TextField.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i6 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(993690038);
                startRestartGroup.endReplaceGroup();
            }
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            float textFieldHorizontalIconPadding = TextFieldImplKt.textFieldHorizontalIconPadding(startRestartGroup, 0);
            if (function23 != null) {
                calculateStartPadding = Dp.m9732constructorimpl(RangesKt.coerceAtLeast(Dp.m9732constructorimpl(calculateStartPadding - textFieldHorizontalIconPadding), Dp.m9732constructorimpl(0)));
            }
            float f2 = calculateStartPadding;
            if (function24 != null) {
                calculateEndPadding = Dp.m9732constructorimpl(RangesKt.coerceAtLeast(Dp.m9732constructorimpl(calculateEndPadding - textFieldHorizontalIconPadding), Dp.m9732constructorimpl(0)));
            }
            if (function25 != null) {
                startRestartGroup.startReplaceGroup(994466433);
                ComposerKt.sourceInformation(startRestartGroup, "740@38510L309");
                Modifier m1205paddingqDBjuR0$default2 = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m1259heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), f2, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1205paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5864constructorimpl4 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl4, Integer.valueOf(m4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -567706474, "C746@38793L8:TextField.kt#uh7d8r");
                function25.invoke(startRestartGroup, Integer.valueOf((i6 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(994794134);
                startRestartGroup.endReplaceGroup();
            }
            if (function26 != null) {
                startRestartGroup.startReplaceGroup(994837379);
                ComposerKt.sourceInformation(startRestartGroup, "750@38884L307");
                float f3 = calculateEndPadding;
                Modifier m1205paddingqDBjuR0$default3 = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m1259heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f3, 0.0f, 10, null);
                f = f3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m5 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1205paddingqDBjuR0$default3);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5864constructorimpl5 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl5, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl5, Integer.valueOf(m5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1281352267, "C756@39165L8:TextField.kt#uh7d8r");
                function26.invoke(startRestartGroup, Integer.valueOf((i6 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                f = calculateEndPadding;
                startRestartGroup.startReplaceGroup(995163158);
                startRestartGroup.endReplaceGroup();
            }
            textFieldLabelPosition2 = textFieldLabelPosition;
            if (textFieldLabelPosition2 instanceof TextFieldLabelPosition.Above) {
                m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, TextFieldImplKt.getAboveLabelHorizontalPadding(), 0.0f, TextFieldImplKt.getAboveLabelHorizontalPadding(), TextFieldImplKt.getAboveLabelBottomPadding(), 2, null);
            } else {
                m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, f2, 0.0f, f, 0.0f, 10, null);
            }
            if (function22 != null) {
                startRestartGroup.startReplaceGroup(995662971);
                ComposerKt.sourceInformation(startRestartGroup, "773@39815L123,771@39714L379");
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1353351641, "CC(remember):TextField.kt#9igjgp");
                if (i8 != 4) {
                    floatProducer4 = floatProducer;
                    if ((i5 & 8) == 0 || !startRestartGroup.changedInstance(floatProducer4)) {
                        z2 = false;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Dp TextFieldLayout$lambda$1$4$0;
                                    TextFieldLayout$lambda$1$4$0 = TextFieldKt.TextFieldLayout$lambda$1$4$0(FloatProducer.this);
                                    return TextFieldLayout$lambda$1$4$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier then = SizeKt.wrapContentHeight$default(TextFieldImplKt.textFieldLabelMinHeight(layoutId, (Function0) rememberedValue), null, false, 3, null).then(m1205paddingqDBjuR0$default);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                        int m6 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor6);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m5864constructorimpl6 = Updater.m5864constructorimpl(startRestartGroup);
                        Updater.m5872setimpl(m5864constructorimpl6, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5872setimpl(m5864constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m5872setimpl(m5864constructorimpl6, Integer.valueOf(m6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m5870reconcileimpl(m5864constructorimpl6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m5872setimpl(m5864constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1994998091, "C779@40068L7:TextField.kt#uh7d8r");
                        function22.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                    }
                } else {
                    floatProducer4 = floatProducer;
                }
                z2 = true;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue = new Function0() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Dp TextFieldLayout$lambda$1$4$0;
                        TextFieldLayout$lambda$1$4$0 = TextFieldKt.TextFieldLayout$lambda$1$4$0(FloatProducer.this);
                        return TextFieldLayout$lambda$1$4$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier then2 = SizeKt.wrapContentHeight$default(TextFieldImplKt.textFieldLabelMinHeight(layoutId, (Function0) rememberedValue), null, false, 3, null).then(m1205paddingqDBjuR0$default);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy52 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m62 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                Composer m5864constructorimpl62 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl62, maybeCachedBoxMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl62, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl62, Integer.valueOf(m62), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl62, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl62, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance52 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1994998091, "C779@40068L7:TextField.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                floatProducer4 = floatProducer;
                startRestartGroup.startReplaceGroup(996057942);
                startRestartGroup.endReplaceGroup();
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1259heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                f2 = Dp.m9732constructorimpl(0);
            }
            Modifier m1205paddingqDBjuR0$default4 = PaddingKt.m1205paddingqDBjuR0$default(wrapContentHeight$default, f2, 0.0f, function26 == null ? f : Dp.m9732constructorimpl(0), 0.0f, 10, null);
            if (function3 != null) {
                startRestartGroup.startReplaceGroup(996427927);
                ComposerKt.sourceInformation(startRestartGroup, "792@40495L63");
                function32 = function3;
                function32.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PlaceholderId).then(m1205paddingqDBjuR0$default4), startRestartGroup, Integer.valueOf((i6 >> 6) & 112));
                startRestartGroup.endReplaceGroup();
            } else {
                function32 = function3;
                startRestartGroup.startReplaceGroup(996519222);
                startRestartGroup.endReplaceGroup();
            }
            Modifier then3 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TextFieldId).then(m1205paddingqDBjuR0$default4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m7 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, then3);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor7);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl7 = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl7, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl7, Integer.valueOf(m7), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl7, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1080150426, "C798@40747L11:TextField.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (function28 != null) {
                startRestartGroup.startReplaceGroup(996767873);
                ComposerKt.sourceInformation(startRestartGroup, "803@40884L317");
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m1259heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m4254supportingTextPaddinga9UjIt4$material3$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m8 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5864constructorimpl8 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl8, maybeCachedBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl8, Integer.valueOf(m8), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl8, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 872677774, "C809@41171L12:TextField.kt#uh7d8r");
                function29 = function28;
                function29.invoke(startRestartGroup, Integer.valueOf((i5 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                function29 = function28;
                startRestartGroup.startReplaceGroup(997157078);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function33 = function32;
            final PaddingValues paddingValues3 = paddingValues2;
            final Function2<? super Composer, ? super Integer, Unit> function211 = function29;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextFieldKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextFieldLayout$lambda$2;
                    TextFieldLayout$lambda$2 = TextFieldKt.TextFieldLayout$lambda$2(Modifier.this, function2, function22, function33, function23, function24, function25, function26, z, textFieldLabelPosition2, floatProducer4, floatProducer2, floatProducer3, function27, function211, paddingValues3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TextFieldLayout$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp TextFieldLayout$lambda$1$4$0(FloatProducer floatProducer) {
        return Dp.m9730boximpl(DpKt.m9775lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), floatProducer.invoke()));
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }
}
