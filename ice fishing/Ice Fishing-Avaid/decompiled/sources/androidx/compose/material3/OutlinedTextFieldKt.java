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
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a£\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#28\b\u0002\u0010$\u001a2\u0012\u0004\u0012\u00020&\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010'0\u0013¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0001\u0018\u00010%¢\u0006\u0002\b\u00112\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0002\u00105\u001aØ\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u0010A\u001aØ\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u00106\u001a\u00020B2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020\u00072\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u0010C\u001a\u0098\u0002\u0010D\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010E\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u00102\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u00102\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010F\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010G\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0006\u0010=\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020I2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00010\u000e2\u0011\u0010N\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u00102\u0013\u0010O\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0002\b\u00102\u0006\u0010P\u001a\u000202H\u0001¢\u0006\u0002\u0010Q\u001a*\u0010R\u001a\u00020\u0005*\u00020\u00052\f\u0010S\u001a\b\u0012\u0004\u0012\u00020M0\u00132\u0006\u0010T\u001a\u00020U2\u0006\u0010P\u001a\u000202H\u0000\"\u0010\u0010V\u001a\u00020WX\u0082\u0004¢\u0006\u0004\n\u0002\u0010X¨\u0006Y"}, d2 = {"OutlinedTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TextFieldLabelScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "placeholder", "Lkotlin/Function0;", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/material3/TextFieldLabelPosition;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;IIII)V", "value", "", "onValueChange", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "labelProgress", "Landroidx/compose/material3/internal/FloatProducer;", "placeholderAlpha", "affixAlpha", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "container", "supporting", "paddingValues", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/TextFieldLabelPosition;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/material3/internal/FloatProducer;Landroidx/compose/material3/internal/FloatProducer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "outlineCutout", "labelSize", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m9732constructorimpl(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$11(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$3(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2 function27, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4, Composer composer, int i5) {
        OutlinedTextField(textFieldState, modifier, z, z2, textStyle, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z3, inputTransformation, outputTransformation, keyboardOptions, keyboardActionHandler, textFieldLineLimits, function27, scrollState, shape, textFieldColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$7(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        OutlinedTextField(str, (Function1<? super String, Unit>) function1, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextFieldLayout$lambda$2(Modifier modifier, Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, FloatProducer floatProducer2, FloatProducer floatProducer3, Function1 function1, Function2 function27, Function2 function28, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        OutlinedTextFieldLayout(modifier, function2, function3, function22, function23, function24, function25, function26, z, textFieldLabelPosition, floatProducer, floatProducer2, floatProducer3, function1, function27, function28, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
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
    /* JADX WARN: Removed duplicated region for block: B:160:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x004b  */
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
    public static final void OutlinedTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, TextFieldLabelPosition textFieldLabelPosition, Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function27, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3, final int i4) {
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
        final boolean z6;
        final InputTransformation inputTransformation2;
        final OutputTransformation outputTransformation2;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActionHandler keyboardActionHandler2;
        final TextFieldLineLimits textFieldLineLimits2;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function210;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final boolean z7;
        final boolean z8;
        final TextStyle textStyle3;
        final TextFieldLabelPosition textFieldLabelPosition3;
        final Modifier modifier3;
        final Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        ScopeUpdateScope endRestartGroup;
        TextFieldLineLimits textFieldLineLimits3;
        final TextFieldColors textFieldColors3;
        TextStyle textStyle4;
        final Modifier modifier4;
        final TextFieldLabelPosition textFieldLabelPosition4;
        final Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function34;
        final Shape shape3;
        final PaddingValues paddingValues3;
        final InputTransformation inputTransformation3;
        final boolean z9;
        final OutputTransformation outputTransformation3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActionHandler keyboardActionHandler3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function215;
        final ScrollState scrollState3;
        int i33;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final TextFieldLineLimits textFieldLineLimits4;
        int i34;
        MutableInteractionSource mutableInteractionSource3;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final boolean z11;
        final MutableInteractionSource mutableInteractionSource4;
        int i35;
        int i36;
        Composer startRestartGroup = composer.startRestartGroup(-2007078942);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)N(state,modifier,enabled,readOnly,textStyle,labelPosition,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,isError,inputTransformation,outputTransformation,keyboardOptions,onKeyboardAction,lineLimits,onTextLayout,scrollState,shape,colors,contentPadding,interactionSource)239@14004L2781,239@13917L2868:OutlinedTextField.kt#uh7d8r");
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
                                        ComposerKt.sourceInformation(startRestartGroup, "207@12265L7,223@13155L21,224@13223L5,225@13286L8");
                                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            i33 = (i4 & 16) != 0 ? i19 & (-57345) : i19;
                                            if ((i4 & 32) != 0) {
                                                i33 &= -458753;
                                            }
                                            if ((i4 & 262144) != 0) {
                                                i25 &= -234881025;
                                            }
                                            function216 = function2;
                                            function217 = function22;
                                            function218 = function23;
                                            function221 = function24;
                                            function219 = function25;
                                            function220 = function26;
                                            z11 = z3;
                                            inputTransformation3 = inputTransformation;
                                            outputTransformation3 = outputTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActionHandler3 = keyboardActionHandler;
                                            textFieldLineLimits4 = textFieldLineLimits;
                                            function215 = function27;
                                            scrollState3 = scrollState;
                                            shape3 = shape;
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            z10 = z4;
                                            z9 = z5;
                                            textStyle4 = textStyle2;
                                            modifier4 = modifier2;
                                            i34 = i25;
                                            textFieldLabelPosition4 = textFieldLabelPosition2;
                                            function34 = function32;
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
                                            Shape shape4 = (i4 & 2097152) != 0 ? OutlinedTextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            TextFieldColors colors = (i4 & 4194304) != 0 ? OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6) : textFieldColors;
                                            PaddingValues m3708contentPaddinga9UjIt4$default = (i4 & 8388608) != 0 ? OutlinedTextFieldDefaults.m3708contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : paddingValues;
                                            if (i31 != 0) {
                                                Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function35 = function32;
                                                textFieldColors3 = colors;
                                                textStyle4 = textStyle2;
                                                modifier4 = modifier2;
                                                textFieldLabelPosition4 = textFieldLabelPosition2;
                                                function34 = function35;
                                                shape3 = shape4;
                                                paddingValues3 = m3708contentPaddinga9UjIt4$default;
                                                inputTransformation3 = inputTransformation4;
                                                z9 = z5;
                                                outputTransformation3 = outputTransformation4;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActionHandler3 = keyboardActionHandler4;
                                                function215 = function228;
                                                scrollState3 = rememberScrollState;
                                                i33 = i19;
                                                function216 = function222;
                                                function217 = function223;
                                                function218 = function224;
                                                function219 = function226;
                                                function220 = function227;
                                                textFieldLineLimits4 = textFieldLineLimits3;
                                                i34 = i25;
                                                mutableInteractionSource3 = null;
                                            } else {
                                                Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function36 = function32;
                                                textFieldColors3 = colors;
                                                textStyle4 = textStyle2;
                                                modifier4 = modifier2;
                                                textFieldLabelPosition4 = textFieldLabelPosition2;
                                                function34 = function36;
                                                shape3 = shape4;
                                                paddingValues3 = m3708contentPaddinga9UjIt4$default;
                                                inputTransformation3 = inputTransformation4;
                                                z9 = z5;
                                                outputTransformation3 = outputTransformation4;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActionHandler3 = keyboardActionHandler4;
                                                function215 = function228;
                                                scrollState3 = rememberScrollState;
                                                i33 = i19;
                                                function216 = function222;
                                                function217 = function223;
                                                function218 = function224;
                                                function219 = function226;
                                                function220 = function227;
                                                textFieldLineLimits4 = textFieldLineLimits3;
                                                i34 = i25;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                            }
                                            z10 = z4;
                                            function221 = function225;
                                            z11 = z12;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2007078942, i33, i34, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:228)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(1647363481);
                                            ComposerKt.sourceInformation(startRestartGroup, "230@13518L39");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -362501239, "CC(remember):OutlinedTextField.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            startRestartGroup.startReplaceGroup(-362501890);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(-362495780);
                                        ComposerKt.sourceInformation(startRestartGroup, "*234@13742L25");
                                        long m9171getColor0d7_KjU = textStyle4.m9171getColor0d7_KjU();
                                        if (m9171getColor0d7_KjU == 16) {
                                            m9171getColor0d7_KjU = textFieldColors3.m4242textColorXeAY9LY(z10, z11, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final TextStyle merge = textStyle4.merge(new TextStyle(m9171getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-416142558, true, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit OutlinedTextField$lambda$2;
                                                OutlinedTextField$lambda$2 = OutlinedTextFieldKt.OutlinedTextField$lambda$2(Modifier.this, function34, textFieldLabelPosition4, z11, textFieldColors3, textFieldState, z10, textFieldLineLimits4, outputTransformation3, mutableInteractionSource4, function216, function217, function218, function221, function219, function220, paddingValues3, z9, inputTransformation3, merge, keyboardOptions3, keyboardActionHandler3, function215, scrollState3, shape3, (Composer) obj, ((Integer) obj2).intValue());
                                                return OutlinedTextField$lambda$2;
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        function33 = function34;
                                        textFieldLabelPosition3 = textFieldLabelPosition4;
                                        z6 = z11;
                                        z7 = z10;
                                        function28 = function216;
                                        function211 = function217;
                                        function212 = function218;
                                        function213 = function221;
                                        function29 = function219;
                                        z8 = z9;
                                        inputTransformation2 = inputTransformation3;
                                        keyboardActionHandler2 = keyboardActionHandler3;
                                        function210 = function215;
                                        scrollState2 = scrollState3;
                                        shape2 = shape3;
                                        textFieldColors2 = textFieldColors3;
                                        textFieldLineLimits2 = textFieldLineLimits4;
                                        outputTransformation2 = outputTransformation3;
                                        function214 = function220;
                                        paddingValues2 = paddingValues3;
                                        keyboardOptions2 = keyboardOptions3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        function28 = function2;
                                        function29 = function25;
                                        z6 = z3;
                                        inputTransformation2 = inputTransformation;
                                        outputTransformation2 = outputTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActionHandler2 = keyboardActionHandler;
                                        textFieldLineLimits2 = textFieldLineLimits;
                                        function210 = function27;
                                        scrollState2 = scrollState;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        paddingValues2 = paddingValues;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        composer2 = startRestartGroup;
                                        z7 = z4;
                                        z8 = z5;
                                        textStyle3 = textStyle2;
                                        textFieldLabelPosition3 = textFieldLabelPosition2;
                                        modifier3 = modifier2;
                                        function33 = function32;
                                        function211 = function22;
                                        function212 = function23;
                                        function213 = function24;
                                        function214 = function26;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit OutlinedTextField$lambda$3;
                                                OutlinedTextField$lambda$3 = OutlinedTextFieldKt.OutlinedTextField$lambda$3(TextFieldState.this, modifier3, z7, z8, textStyle3, textFieldLabelPosition3, function33, function28, function211, function212, function213, function29, function214, z6, inputTransformation2, outputTransformation2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function210, scrollState2, shape2, textFieldColors2, paddingValues2, mutableInteractionSource2, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                return OutlinedTextField$lambda$3;
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
    public static final Unit OutlinedTextField$lambda$2(Modifier modifier, Function3 function3, TextFieldLabelPosition textFieldLabelPosition, final boolean z, final TextFieldColors textFieldColors, TextFieldState textFieldState, final boolean z2, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, final MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, PaddingValues paddingValues, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2 function27, ScrollState scrollState, final Shape shape, Composer composer, int i) {
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C255@14761L38,290@16390L359,273@15619L1149,240@14014L2765:OutlinedTextField.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-416142558, i, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:240)");
            }
            if (function3 != null && !(textFieldLabelPosition instanceof TextFieldLabelPosition.Above)) {
                composer.startReplaceGroup(-2027097767);
                ComposerKt.sourceInformation(composer, "249@14513L2,250@14563L26");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -481023420, "CC(remember):OutlinedTextField.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit OutlinedTextField$lambda$2$0$0;
                            OutlinedTextField$lambda$2$0$0 = OutlinedTextFieldKt.OutlinedTextField$lambda$2$0$0((SemanticsPropertyReceiver) obj);
                            return OutlinedTextField$lambda$2$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                companion = PaddingKt.m1205paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue), 0.0f, TextFieldImplKt.minimizedLabelHalfHeight(composer, 0), 0.0f, 0.0f, 13, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2026714080);
                composer.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = modifier.then(companion);
            Strings.Companion companion3 = Strings.INSTANCE;
            BasicTextFieldKt.BasicTextField(textFieldState, SizeKt.m1255defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(then, z, Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0)), OutlinedTextFieldDefaults.INSTANCE.m3715getMinWidthD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m3714getMinHeightD9Ej5fM()), z2, z3, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, textFieldLineLimits, (Function2<? super Density, ? super Function0<TextLayoutResult>, Unit>) function27, mutableInteractionSource, new SolidColor(textFieldColors.m4192cursorColorvNxB06k(z), null), outputTransformation, OutlinedTextFieldDefaults.INSTANCE.decorator(textFieldState, z2, textFieldLineLimits, outputTransformation, mutableInteractionSource, textFieldLabelPosition, function3, function2, function22, function23, function24, function25, function26, z, textFieldColors, paddingValues, ComposableLambdaKt.rememberComposableLambda(-98391231, true, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OutlinedTextField$lambda$2$1;
                    OutlinedTextField$lambda$2$1 = OutlinedTextFieldKt.OutlinedTextField$lambda$2$1(z2, z, mutableInteractionSource, textFieldColors, shape, (Composer) obj, ((Integer) obj2).intValue());
                    return OutlinedTextField$lambda$2$1;
                }
            }, composer, 54), composer, 0, 14155776, 0), scrollState, composer, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$2$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$2$1(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C291@16442L285:OutlinedTextField.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-98391231, i, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:291)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m3709Container4EFweAY(z, z2, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer, 100663296, ComposerKt.invocationKey);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0581  */
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
    public static final void OutlinedTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        final Function2<? super Composer, ? super Integer, Unit> function28;
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
        final boolean z7;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z8;
        final int i34;
        final int i35;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        Composer composer2;
        final boolean z9;
        final boolean z10;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
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
        final boolean z11;
        int i38;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z12;
        final int i39;
        final int i40;
        final TextFieldColors textFieldColors3;
        final VisualTransformation visualTransformation3;
        final boolean z13;
        final boolean z14;
        int i41;
        MutableInteractionSource mutableInteractionSource3;
        final MutableInteractionSource mutableInteractionSource4;
        int i42;
        Composer startRestartGroup = composer.startRestartGroup(1901501544);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)N(value,onValueChange,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,isError,visualTransformation,keyboardOptions,keyboardActions,singleLine,maxLines,minLines,interactionSource,shape,colors)404@23117L2830,404@23030L2917:OutlinedTextField.kt#uh7d8r");
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
                                        ComposerKt.sourceInformation(startRestartGroup, "375@21669L7,391@22473L5,392@22536L8");
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
                                            z11 = z3;
                                            visualTransformation3 = visualTransformation;
                                            keyboardActions3 = keyboardActions;
                                            z12 = z4;
                                            i39 = i;
                                            i40 = i2;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            shape3 = shape;
                                            z14 = z6;
                                            textStyle4 = textStyle2;
                                            function220 = function29;
                                            modifier4 = modifier2;
                                            i38 = i27;
                                            keyboardOptions3 = keyboardOptions;
                                            textFieldColors3 = textFieldColors;
                                            z13 = z5;
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
                                            Function2<? super Composer, ? super Integer, Unit> function223 = i13 != 0 ? null : function23;
                                            Function2<? super Composer, ? super Integer, Unit> function224 = i15 != 0 ? null : function24;
                                            Function2<? super Composer, ? super Integer, Unit> function225 = i17 != 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = i20 != 0 ? null : function26;
                                            Function2<? super Composer, ? super Integer, Unit> function227 = i22 != 0 ? null : function27;
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
                                            Shape shape4 = (i6 & 2097152) != 0 ? OutlinedTextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            if ((i6 & 4194304) != 0) {
                                                shape3 = shape4;
                                                function217 = function223;
                                                function218 = function224;
                                                function219 = function225;
                                                function220 = function29;
                                                function221 = function226;
                                                z11 = z15;
                                                i38 = i27;
                                                function222 = function227;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActions3 = keyboardActions4;
                                                z12 = z16;
                                                i39 = i37;
                                                i40 = i47;
                                                textFieldColors3 = OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                visualTransformation3 = none;
                                                z14 = z6;
                                                textStyle4 = textStyle2;
                                                modifier4 = modifier2;
                                                i41 = i36;
                                                z13 = z5;
                                            } else {
                                                shape3 = shape4;
                                                function217 = function223;
                                                function218 = function224;
                                                textStyle4 = textStyle2;
                                                function219 = function225;
                                                function220 = function29;
                                                modifier4 = modifier2;
                                                function221 = function226;
                                                z11 = z15;
                                                i38 = i27;
                                                function222 = function227;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActions3 = keyboardActions4;
                                                z12 = z16;
                                                i39 = i37;
                                                i40 = i47;
                                                textFieldColors3 = textFieldColors;
                                                visualTransformation3 = none;
                                                z13 = z5;
                                                z14 = z6;
                                                i41 = i36;
                                            }
                                            mutableInteractionSource3 = mutableInteractionSource5;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1901501544, i41, i38, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:393)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(1310000147);
                                            ComposerKt.sourceInformation(startRestartGroup, "395@22631L39");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1981920719, "CC(remember):OutlinedTextField.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            startRestartGroup.startReplaceGroup(1981920068);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(1981926178);
                                        ComposerKt.sourceInformation(startRestartGroup, "*399@22855L25");
                                        long m9171getColor0d7_KjU = textStyle4.m9171getColor0d7_KjU();
                                        if (m9171getColor0d7_KjU == 16) {
                                            m9171getColor0d7_KjU = textFieldColors3.m4242textColorXeAY9LY(z13, z11, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final TextStyle merge = textStyle4.merge(new TextStyle(m9171getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1874034984, true, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit OutlinedTextField$lambda$6;
                                                OutlinedTextField$lambda$6 = OutlinedTextFieldKt.OutlinedTextField$lambda$6(Modifier.this, function28, z11, textFieldColors3, str, function1, z13, z14, merge, keyboardOptions3, keyboardActions3, z12, i39, i40, visualTransformation3, mutableInteractionSource4, function220, function217, function218, function219, function221, function222, shape3, (Composer) obj, ((Integer) obj2).intValue());
                                                return OutlinedTextField$lambda$6;
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        function212 = function28;
                                        z7 = z11;
                                        z9 = z13;
                                        z10 = z14;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActions2 = keyboardActions3;
                                        z8 = z12;
                                        i34 = i39;
                                        i35 = i40;
                                        visualTransformation2 = visualTransformation3;
                                        function213 = function220;
                                        function214 = function217;
                                        function215 = function218;
                                        function210 = function219;
                                        function211 = function222;
                                        shape2 = shape3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        textFieldColors2 = textFieldColors3;
                                        function216 = function221;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        function210 = function25;
                                        function211 = function27;
                                        z7 = z3;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z8 = z4;
                                        i34 = i;
                                        i35 = i2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer2 = startRestartGroup;
                                        z9 = z5;
                                        z10 = z6;
                                        textStyle3 = textStyle2;
                                        function212 = function28;
                                        function213 = function29;
                                        modifier3 = modifier2;
                                        function214 = function23;
                                        function215 = function24;
                                        function216 = function26;
                                        visualTransformation2 = visualTransformation;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit OutlinedTextField$lambda$7;
                                                OutlinedTextField$lambda$7 = OutlinedTextFieldKt.OutlinedTextField$lambda$7(str, function1, modifier3, z9, z10, textStyle3, function212, function213, function214, function215, function210, function216, function211, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i34, i35, mutableInteractionSource2, shape2, textFieldColors2, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                                return OutlinedTextField$lambda$7;
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
    public static final Unit OutlinedTextField$lambda$6(Modifier modifier, final Function2 function2, final boolean z, final TextFieldColors textFieldColors, final String str, Function1 function1, final boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final boolean z4, int i, int i2, final VisualTransformation visualTransformation, final MutableInteractionSource mutableInteractionSource, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final Function2 function27, final Shape shape, Composer composer, int i3) {
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C420@23824L38,438@24644L1286,405@23127L2814:OutlinedTextField.kt#uh7d8r");
        if (!composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1874034984, i3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:405)");
            }
            if (function2 != null) {
                composer.startReplaceGroup(-903490605);
                ComposerKt.sourceInformation(composer, "414@23576L2,415@23626L26");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1356337290, "CC(remember):OutlinedTextField.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit OutlinedTextField$lambda$6$0$0;
                            OutlinedTextField$lambda$6$0$0 = OutlinedTextFieldKt.OutlinedTextField$lambda$6$0$0((SemanticsPropertyReceiver) obj);
                            return OutlinedTextField$lambda$6$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                companion = PaddingKt.m1205paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue), 0.0f, TextFieldImplKt.minimizedLabelHalfHeight(composer, 0), 0.0f, 0.0f, 13, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-903106918);
                composer.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = modifier.then(companion);
            Strings.Companion companion3 = Strings.INSTANCE;
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function1, SizeKt.m1255defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(then, z, Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0)), OutlinedTextFieldDefaults.INSTANCE.m3715getMinWidthD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m3714getMinHeightD9Ej5fM()), z2, z3, textStyle, keyboardOptions, keyboardActions, z4, i, i2, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m4192cursorColorvNxB06k(z), null), ComposableLambdaKt.rememberComposableLambda(-1189274459, true, new Function3() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit OutlinedTextField$lambda$6$1;
                    OutlinedTextField$lambda$6$1 = OutlinedTextFieldKt.OutlinedTextField$lambda$6$1(str, z2, z4, visualTransformation, mutableInteractionSource, z, function2, function22, function23, function24, function25, function26, function27, textFieldColors, shape, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return OutlinedTextField$lambda$6$1;
                }
            }, composer, 54), composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$6$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$6$1(String str, final boolean z, boolean z2, VisualTransformation visualTransformation, final MutableInteractionSource mutableInteractionSource, final boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, final TextFieldColors textFieldColors, final Shape shape, Function2 function28, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(innerTextField)455@25498L391,439@24710L1202:OutlinedTextField.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(function28) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1189274459, i2, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:439)");
            }
            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str, function28, z, z2, visualTransformation, mutableInteractionSource, z3, function2, function22, function23, function24, function25, function26, function27, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(-656940872, true, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OutlinedTextField$lambda$6$1$0;
                    OutlinedTextField$lambda$6$1$0 = OutlinedTextFieldKt.OutlinedTextField$lambda$6$1$0(z, z3, mutableInteractionSource, textFieldColors, shape, (Composer) obj, ((Integer) obj2).intValue());
                    return OutlinedTextField$lambda$6$1$0;
                }
            }, composer, 54), composer, (i2 << 3) & 112, 14155776, 32768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$6$1$0(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C456@25554L309:OutlinedTextField.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-656940872, i, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:456)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m3709Container4EFweAY(z, z2, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer, 100663296, ComposerKt.invocationKey);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0581  */
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
    public static final void OutlinedTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        final Function2<? super Composer, ? super Integer, Unit> function28;
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
        final boolean z7;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z8;
        final int i34;
        final int i35;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        Composer composer2;
        final boolean z9;
        final boolean z10;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
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
        final boolean z11;
        int i38;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z12;
        final int i39;
        final int i40;
        final TextFieldColors textFieldColors3;
        final VisualTransformation visualTransformation3;
        final boolean z13;
        final boolean z14;
        int i41;
        MutableInteractionSource mutableInteractionSource3;
        final MutableInteractionSource mutableInteractionSource4;
        int i42;
        Composer startRestartGroup = composer.startRestartGroup(2057288437);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)N(value,onValueChange,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,isError,visualTransformation,keyboardOptions,keyboardActions,singleLine,maxLines,minLines,interactionSource,shape,colors)571@32380L2835,571@32293L2922:OutlinedTextField.kt#uh7d8r");
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
                                        ComposerKt.sourceInformation(startRestartGroup, "542@30932L7,558@31736L5,559@31799L8");
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
                                            z11 = z3;
                                            visualTransformation3 = visualTransformation;
                                            keyboardActions3 = keyboardActions;
                                            z12 = z4;
                                            i39 = i;
                                            i40 = i2;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            shape3 = shape;
                                            z14 = z6;
                                            textStyle4 = textStyle2;
                                            function220 = function29;
                                            modifier4 = modifier2;
                                            i38 = i27;
                                            keyboardOptions3 = keyboardOptions;
                                            textFieldColors3 = textFieldColors;
                                            z13 = z5;
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
                                            Function2<? super Composer, ? super Integer, Unit> function223 = i13 != 0 ? null : function23;
                                            Function2<? super Composer, ? super Integer, Unit> function224 = i15 != 0 ? null : function24;
                                            Function2<? super Composer, ? super Integer, Unit> function225 = i17 != 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = i20 != 0 ? null : function26;
                                            Function2<? super Composer, ? super Integer, Unit> function227 = i22 != 0 ? null : function27;
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
                                            Shape shape4 = (i6 & 2097152) != 0 ? OutlinedTextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6) : shape;
                                            if ((i6 & 4194304) != 0) {
                                                shape3 = shape4;
                                                function217 = function223;
                                                function218 = function224;
                                                function219 = function225;
                                                function220 = function29;
                                                function221 = function226;
                                                z11 = z15;
                                                i38 = i27;
                                                function222 = function227;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActions3 = keyboardActions4;
                                                z12 = z16;
                                                i39 = i37;
                                                i40 = i47;
                                                textFieldColors3 = OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                visualTransformation3 = none;
                                                z14 = z6;
                                                textStyle4 = textStyle2;
                                                modifier4 = modifier2;
                                                i41 = i36;
                                                z13 = z5;
                                            } else {
                                                shape3 = shape4;
                                                function217 = function223;
                                                function218 = function224;
                                                textStyle4 = textStyle2;
                                                function219 = function225;
                                                function220 = function29;
                                                modifier4 = modifier2;
                                                function221 = function226;
                                                z11 = z15;
                                                i38 = i27;
                                                function222 = function227;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActions3 = keyboardActions4;
                                                z12 = z16;
                                                i39 = i37;
                                                i40 = i47;
                                                textFieldColors3 = textFieldColors;
                                                visualTransformation3 = none;
                                                z13 = z5;
                                                z14 = z6;
                                                i41 = i36;
                                            }
                                            mutableInteractionSource3 = mutableInteractionSource5;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2057288437, i41, i38, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:560)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            startRestartGroup.startReplaceGroup(-502301594);
                                            ComposerKt.sourceInformation(startRestartGroup, "562@31894L39");
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1369270044, "CC(remember):OutlinedTextField.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            startRestartGroup.startReplaceGroup(1369269393);
                                            startRestartGroup.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        startRestartGroup.startReplaceGroup(1369275503);
                                        ComposerKt.sourceInformation(startRestartGroup, "*566@32118L25");
                                        long m9171getColor0d7_KjU = textStyle4.m9171getColor0d7_KjU();
                                        if (m9171getColor0d7_KjU == 16) {
                                            m9171getColor0d7_KjU = textFieldColors3.m4242textColorXeAY9LY(z13, z11, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, startRestartGroup, 0).getValue().booleanValue());
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        final TextStyle merge = textStyle4.merge(new TextStyle(m9171getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors3.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(-2094276683, true, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit OutlinedTextField$lambda$10;
                                                OutlinedTextField$lambda$10 = OutlinedTextFieldKt.OutlinedTextField$lambda$10(Modifier.this, function28, z11, textFieldColors3, textFieldValue, function1, z13, z14, merge, keyboardOptions3, keyboardActions3, z12, i39, i40, visualTransformation3, mutableInteractionSource4, function220, function217, function218, function219, function221, function222, shape3, (Composer) obj, ((Integer) obj2).intValue());
                                                return OutlinedTextField$lambda$10;
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textStyle3 = textStyle4;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        function212 = function28;
                                        z7 = z11;
                                        z9 = z13;
                                        z10 = z14;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActions2 = keyboardActions3;
                                        z8 = z12;
                                        i34 = i39;
                                        i35 = i40;
                                        visualTransformation2 = visualTransformation3;
                                        function213 = function220;
                                        function214 = function217;
                                        function215 = function218;
                                        function210 = function219;
                                        function211 = function222;
                                        shape2 = shape3;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        textFieldColors2 = textFieldColors3;
                                        function216 = function221;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        function210 = function25;
                                        function211 = function27;
                                        z7 = z3;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z8 = z4;
                                        i34 = i;
                                        i35 = i2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer2 = startRestartGroup;
                                        z9 = z5;
                                        z10 = z6;
                                        textStyle3 = textStyle2;
                                        function212 = function28;
                                        function213 = function29;
                                        modifier3 = modifier2;
                                        function214 = function23;
                                        function215 = function24;
                                        function216 = function26;
                                        visualTransformation2 = visualTransformation;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit OutlinedTextField$lambda$11;
                                                OutlinedTextField$lambda$11 = OutlinedTextFieldKt.OutlinedTextField$lambda$11(TextFieldValue.this, function1, modifier3, z9, z10, textStyle3, function212, function213, function214, function215, function210, function216, function211, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i34, i35, mutableInteractionSource2, shape2, textFieldColors2, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                                return OutlinedTextField$lambda$11;
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
    public static final Unit OutlinedTextField$lambda$10(Modifier modifier, final Function2 function2, final boolean z, final TextFieldColors textFieldColors, final TextFieldValue textFieldValue, Function1 function1, final boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final boolean z4, int i, int i2, final VisualTransformation visualTransformation, final MutableInteractionSource mutableInteractionSource, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final Function2 function27, final Shape shape, Composer composer, int i3) {
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C587@33087L38,605@33907L1291,572@32390L2819:OutlinedTextField.kt#uh7d8r");
        if (!composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2094276683, i3, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:572)");
            }
            if (function2 != null) {
                composer.startReplaceGroup(-1901539802);
                ComposerKt.sourceInformation(composer, "581@32839L2,582@32889L26");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1739784151, "CC(remember):OutlinedTextField.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit OutlinedTextField$lambda$10$0$0;
                            OutlinedTextField$lambda$10$0$0 = OutlinedTextFieldKt.OutlinedTextField$lambda$10$0$0((SemanticsPropertyReceiver) obj);
                            return OutlinedTextField$lambda$10$0$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                companion = PaddingKt.m1205paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue), 0.0f, TextFieldImplKt.minimizedLabelHalfHeight(composer, 0), 0.0f, 0.0f, 13, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1901156115);
                composer.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = modifier.then(companion);
            Strings.Companion companion3 = Strings.INSTANCE;
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, SizeKt.m1255defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(then, z, Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0)), OutlinedTextFieldDefaults.INSTANCE.m3715getMinWidthD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m3714getMinHeightD9Ej5fM()), z2, z3, textStyle, keyboardOptions, keyboardActions, z4, i, i2, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m4192cursorColorvNxB06k(z), null), ComposableLambdaKt.rememberComposableLambda(674541106, true, new Function3() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit OutlinedTextField$lambda$10$1;
                    OutlinedTextField$lambda$10$1 = OutlinedTextFieldKt.OutlinedTextField$lambda$10$1(TextFieldValue.this, z2, z4, visualTransformation, mutableInteractionSource, z, function2, function22, function23, function24, function25, function26, function27, textFieldColors, shape, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return OutlinedTextField$lambda$10$1;
                }
            }, composer, 54), composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$10$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$10$1(TextFieldValue textFieldValue, final boolean z, boolean z2, VisualTransformation visualTransformation, final MutableInteractionSource mutableInteractionSource, final boolean z3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, final TextFieldColors textFieldColors, final Shape shape, Function2 function28, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(innerTextField)622@34766L391,606@33973L1207:OutlinedTextField.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changedInstance(function28) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674541106, i2, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:606)");
            }
            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function28, z, z2, visualTransformation, mutableInteractionSource, z3, function2, function22, function23, function24, function25, function26, function27, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(1409265477, true, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OutlinedTextField$lambda$10$1$0;
                    OutlinedTextField$lambda$10$1$0 = OutlinedTextFieldKt.OutlinedTextField$lambda$10$1$0(z, z3, mutableInteractionSource, textFieldColors, shape, (Composer) obj, ((Integer) obj2).intValue());
                    return OutlinedTextField$lambda$10$1$0;
                }
            }, composer, 54), composer, (i2 << 3) & 112, 14155776, 32768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$10$1$0(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C623@34822L309:OutlinedTextField.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1409265477, i, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:623)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m3709Container4EFweAY(z, z2, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer, 100663296, ComposerKt.invocationKey);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x088d, code lost:
    
        if (r0.changedInstance(r13) != false) goto L286;
     */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0915  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Function2<? super Composer, ? super Integer, Unit> function26, final boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, final FloatProducer floatProducer2, final FloatProducer floatProducer3, final Function1<? super Size, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function29;
        PaddingValues paddingValues2;
        float f;
        Object outlinedTextFieldMeasurePolicy;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i5;
        int i6;
        float f2;
        Modifier.Companion companion;
        boolean z2;
        Object rememberedValue;
        TextFieldLabelPosition textFieldLabelPosition2 = textFieldLabelPosition;
        final FloatProducer floatProducer4 = floatProducer;
        Composer startRestartGroup = composer.startRestartGroup(-401536574);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldLayout)N(modifier,textField,placeholder,label,leading,trailing,prefix,suffix,singleLine,labelPosition,labelProgress,placeholderAlpha,affixAlpha,onLabelMeasured,container,supporting,paddingValues)662@36180L32,664@36245L702,685@36995L7,686@37007L4040:OutlinedTextField.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(textFieldLabelPosition2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i7 = i3;
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
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function27) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(function28) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
        }
        int i8 = i4;
        if (!startRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (599187 & i8) == 599186) ? false : true, i7 & 1)) {
            function32 = function3;
            function29 = function28;
            paddingValues2 = paddingValues;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-401536574, i7, i8, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:661)");
            }
            float textFieldHorizontalIconPadding = TextFieldImplKt.textFieldHorizontalIconPadding(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 670434208, "CC(remember):OutlinedTextField.kt#9igjgp");
            int i9 = i8 & 14;
            boolean changed = ((3670016 & i8) == 1048576) | ((i8 & 7168) == 2048) | ((234881024 & i7) == 67108864) | ((1879048192 & i7) == 536870912) | (i9 == 4 || ((i8 & 8) != 0 && startRestartGroup.changed(floatProducer4))) | ((i8 & 112) == 32 || ((i8 & 64) != 0 && startRestartGroup.changed(floatProducer2))) | ((i8 & 896) == 256 || ((i8 & 512) != 0 && startRestartGroup.changed(floatProducer3))) | startRestartGroup.changed(textFieldHorizontalIconPadding);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                f = textFieldHorizontalIconPadding;
                function210 = function27;
                i5 = i9;
                outlinedTextFieldMeasurePolicy = new OutlinedTextFieldMeasurePolicy(function1, z, textFieldLabelPosition2, floatProducer4, floatProducer2, floatProducer3, paddingValues, f, null);
                paddingValues2 = paddingValues;
                startRestartGroup.updateRememberedValue(outlinedTextFieldMeasurePolicy);
            } else {
                function210 = function27;
                f = textFieldHorizontalIconPadding;
                i5 = i9;
                paddingValues2 = paddingValues;
                outlinedTextFieldMeasurePolicy = rememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = (OutlinedTextFieldMeasurePolicy) outlinedTextFieldMeasurePolicy;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = i5;
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
            Updater.m5872setimpl(m5864constructorimpl, outlinedTextFieldMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -832814273, "C689@37076L11,757@39562L187:OutlinedTextField.kt#uh7d8r");
            function210.invoke(startRestartGroup, Integer.valueOf((i8 >> 12) & 14));
            if (function23 != null) {
                startRestartGroup.startReplaceGroup(-832882071);
                ComposerKt.sourceInformation(startRestartGroup, "692@37140L224");
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 616430080, "C696@37337L9:OutlinedTextField.kt#uh7d8r");
                function23.invoke(startRestartGroup, Integer.valueOf((i7 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-832636055);
                startRestartGroup.endReplaceGroup();
            }
            if (function24 != null) {
                startRestartGroup.startReplaceGroup(-832593337);
                ComposerKt.sourceInformation(startRestartGroup, "700@37431L226");
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1217211272, "C704@37629L10:OutlinedTextField.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i7 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-832345399);
                startRestartGroup.endReplaceGroup();
            }
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (function23 != null) {
                i6 = 0;
                calculateStartPadding = Dp.m9732constructorimpl(RangesKt.coerceAtLeast(Dp.m9732constructorimpl(calculateStartPadding - f), Dp.m9732constructorimpl(0)));
            } else {
                i6 = 0;
            }
            float f3 = calculateStartPadding;
            if (function24 != null) {
                calculateEndPadding = Dp.m9732constructorimpl(RangesKt.coerceAtLeast(Dp.m9732constructorimpl(calculateEndPadding - f), Dp.m9732constructorimpl(i6)));
            }
            if (function25 != null) {
                startRestartGroup.startReplaceGroup(-831641420);
                ComposerKt.sourceInformation(startRestartGroup, "725@38388L309");
                Modifier m1205paddingqDBjuR0$default = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m1259heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), f3, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m4 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m1205paddingqDBjuR0$default);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2099407959, "C731@38671L8:OutlinedTextField.kt#uh7d8r");
                function25.invoke(startRestartGroup, Integer.valueOf((i7 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-831313719);
                startRestartGroup.endReplaceGroup();
            }
            if (function26 != null) {
                startRestartGroup.startReplaceGroup(-831270474);
                ComposerKt.sourceInformation(startRestartGroup, "735@38762L307");
                f2 = calculateEndPadding;
                Modifier m1205paddingqDBjuR0$default2 = PaddingKt.m1205paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m1259heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f2, 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m5 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1205paddingqDBjuR0$default2);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1121059832, "C741@39043L8:OutlinedTextField.kt#uh7d8r");
                function26.invoke(startRestartGroup, Integer.valueOf((i7 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                f2 = calculateEndPadding;
                startRestartGroup.startReplaceGroup(-830944695);
                startRestartGroup.endReplaceGroup();
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1259heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                f3 = Dp.m9732constructorimpl(0);
            }
            Modifier m1205paddingqDBjuR0$default3 = PaddingKt.m1205paddingqDBjuR0$default(wrapContentHeight$default, f3, 0.0f, function26 == null ? f2 : Dp.m9732constructorimpl(0), 0.0f, 10, null);
            if (function3 != null) {
                startRestartGroup.startReplaceGroup(-830574710);
                ComposerKt.sourceInformation(startRestartGroup, "754@39471L63");
                function32 = function3;
                function32.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PlaceholderId).then(m1205paddingqDBjuR0$default3), startRestartGroup, Integer.valueOf((i7 >> 3) & 112));
                startRestartGroup.endReplaceGroup();
            } else {
                function32 = function3;
                startRestartGroup.startReplaceGroup(-830483415);
                startRestartGroup.endReplaceGroup();
            }
            Modifier then = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TextFieldId).then(m1205paddingqDBjuR0$default3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
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
            if (startRestartGroup.getInserting()) {
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2019242937, "C761@39724L11:OutlinedTextField.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            textFieldLabelPosition2 = textFieldLabelPosition;
            if (textFieldLabelPosition2 instanceof TextFieldLabelPosition.Above) {
                companion = PaddingKt.m1205paddingqDBjuR0$default(Modifier.INSTANCE, TextFieldImplKt.getAboveLabelHorizontalPadding(), 0.0f, TextFieldImplKt.getAboveLabelHorizontalPadding(), TextFieldImplKt.getAboveLabelBottomPadding(), 2, null);
            } else {
                companion = Modifier.INSTANCE;
            }
            if (function22 != null) {
                startRestartGroup.startReplaceGroup(-829830834);
                ComposerKt.sourceInformation(startRestartGroup, "777@40269L123,776@40211L379");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 665970068, "CC(remember):OutlinedTextField.kt#9igjgp");
                if (i10 != 4) {
                    if ((i8 & 8) != 0) {
                        floatProducer4 = floatProducer;
                    } else {
                        floatProducer4 = floatProducer;
                    }
                    z2 = false;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Dp OutlinedTextFieldLayout$lambda$1$5$0;
                                OutlinedTextFieldLayout$lambda$1$5$0 = OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$1$5$0(FloatProducer.this);
                                return OutlinedTextFieldLayout$lambda$1$5$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier then2 = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(TextFieldImplKt.textFieldLabelMinHeight(companion2, (Function0) rememberedValue), null, false, 3, null), TextFieldImplKt.LabelId).then(companion);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                    int m7 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 835636391, "C784@40565L7:OutlinedTextField.kt#uh7d8r");
                    function22.invoke(startRestartGroup, Integer.valueOf((i7 >> 9) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                } else {
                    floatProducer4 = floatProducer;
                }
                z2 = true;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue = new Function0() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Dp OutlinedTextFieldLayout$lambda$1$5$0;
                        OutlinedTextFieldLayout$lambda$1$5$0 = OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$1$5$0(FloatProducer.this);
                        return OutlinedTextFieldLayout$lambda$1$5$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier then22 = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(TextFieldImplKt.textFieldLabelMinHeight(companion2, (Function0) rememberedValue), null, false, 3, null), TextFieldImplKt.LabelId).then(companion);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy62 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m72 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap72 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                Composer m5864constructorimpl72 = Updater.m5864constructorimpl(startRestartGroup);
                Updater.m5872setimpl(m5864constructorimpl72, maybeCachedBoxMeasurePolicy62, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl72, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl72, Integer.valueOf(m72), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl72, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl72, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance62 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 835636391, "C784@40565L7:OutlinedTextField.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i7 >> 9) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                floatProducer4 = floatProducer;
                startRestartGroup.startReplaceGroup(-829435863);
                startRestartGroup.endReplaceGroup();
            }
            if (function28 != null) {
                startRestartGroup.startReplaceGroup(-829387348);
                ComposerKt.sourceInformation(startRestartGroup, "789@40660L317");
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1813984673, "C795@40947L12:OutlinedTextField.kt#uh7d8r");
                function29 = function28;
                function29.invoke(startRestartGroup, Integer.valueOf((i8 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                function29 = function28;
                startRestartGroup.startReplaceGroup(-829051959);
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
            final Function2<? super Composer, ? super Integer, Unit> function211 = function29;
            final PaddingValues paddingValues3 = paddingValues2;
            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function33 = function32;
            final TextFieldLabelPosition textFieldLabelPosition3 = textFieldLabelPosition2;
            final FloatProducer floatProducer5 = floatProducer4;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OutlinedTextFieldLayout$lambda$2;
                    OutlinedTextFieldLayout$lambda$2 = OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$2(Modifier.this, function2, function33, function22, function23, function24, function25, function26, z, textFieldLabelPosition3, floatProducer5, floatProducer2, floatProducer3, function1, function27, function211, paddingValues3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OutlinedTextFieldLayout$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp OutlinedTextFieldLayout$lambda$1$5$0(FloatProducer floatProducer) {
        return Dp.m9730boximpl(DpKt.m9775lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), floatProducer.invoke()));
    }

    public static final Modifier outlineCutout(Modifier modifier, final Function0<Size> function0, final Alignment.Horizontal horizontal, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit outlineCutout$lambda$0;
                outlineCutout$lambda$0 = OutlinedTextFieldKt.outlineCutout$lambda$0(Function0.this, paddingValues, horizontal, (ContentDrawScope) obj);
                return outlineCutout$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit outlineCutout$lambda$0(Function0 function0, PaddingValues paddingValues, Alignment.Horizontal horizontal, ContentDrawScope contentDrawScope) {
        long m6593unboximpl = ((Size) function0.invoke()).m6593unboximpl();
        float intBitsToFloat = Float.intBitsToFloat((int) (m6593unboximpl >> 32));
        if (intBitsToFloat > 0.0f) {
            float f = contentDrawScope.mo528toPx0680j_4(OutlinedTextFieldInnerPadding);
            float align = horizontal.align(MathKt.roundToInt(intBitsToFloat), MathKt.roundToInt((Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> 32)) - r5) - contentDrawScope.mo528toPx0680j_4(paddingValues.mo1147calculateRightPaddingu2uoSUM(contentDrawScope.getLayoutDirection()))), contentDrawScope.getLayoutDirection()) + contentDrawScope.mo528toPx0680j_4(paddingValues.mo1146calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection()));
            float f2 = 2;
            float f3 = intBitsToFloat / f2;
            float f4 = align + f3;
            float coerceAtLeast = RangesKt.coerceAtLeast((f4 - f3) - f, 0.0f);
            float coerceAtMost = RangesKt.coerceAtMost(f4 + f3 + f, Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> 32)));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & m6593unboximpl));
            float f5 = (-intBitsToFloat2) / f2;
            float f6 = intBitsToFloat2 / f2;
            int m6774getDifferencertfAjoo = ClipOp.INSTANCE.m6774getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo7301getSizeNHjbRc = drawContext.mo7301getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo7304clipRectN_I0leg(coerceAtLeast, f5, coerceAtMost, f6, m6774getDifferencertfAjoo);
                contentDrawScope.drawContent();
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo7302setSizeuvyYCjk(mo7301getSizeNHjbRc);
            }
        } else {
            contentDrawScope.drawContent();
        }
        return Unit.INSTANCE;
    }
}
