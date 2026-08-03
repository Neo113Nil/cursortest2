package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.style.MutableStyleState;
import androidx.compose.foundation.style.Style;
import androidx.compose.foundation.style.StyleModifierKt;
import androidx.compose.foundation.style.StyleScope;
import androidx.compose.foundation.style.StyleStateKt;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0002\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2 \b\u0002\u0010!\u001a\u001a\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\b\b\u0002\u0010.\u001a\u00020\u00182\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\u0013\b\u0002\u00103\u001a\r\u0012\u0004\u0012\u00020$0(¢\u0006\u0002\b%H\u0007¢\u0006\u0002\u00104JY\u00105\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\tH\u0007¢\u0006\u0004\b:\u0010;JU\u0010<\u001a\u000207*\u0002072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\t¢\u0006\u0004\b>\u0010?J¦\u0002\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020B2\u0011\u0010C\u001a\r\u0012\u0004\u0012\u00020$0(¢\u0006\u0002\b%2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020F2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020\u00182\u0015\b\u0002\u0010!\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\u0013\b\u0002\u00103\u001a\r\u0012\u0004\u0012\u00020$0(¢\u0006\u0002\b%H\u0007¢\u0006\u0002\u0010GJ5\u0010H\u001a\u0002022\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\t¢\u0006\u0004\bM\u0010NJ5\u0010O\u001a\u0002022\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\t¢\u0006\u0004\bP\u0010NJ7\u0010Q\u001a\u0002022\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\tH\u0000¢\u0006\u0004\bR\u0010NJ\r\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u0010SJÂ\u0003\u0010/\u001a\u0002002\b\b\u0002\u0010T\u001a\u00020U2\b\b\u0002\u0010V\u001a\u00020U2\b\b\u0002\u0010W\u001a\u00020U2\b\b\u0002\u0010X\u001a\u00020U2\b\b\u0002\u0010Y\u001a\u00020U2\b\b\u0002\u0010Z\u001a\u00020U2\b\b\u0002\u0010[\u001a\u00020U2\b\b\u0002\u0010\\\u001a\u00020U2\b\b\u0002\u0010]\u001a\u00020U2\b\b\u0002\u0010^\u001a\u00020U2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`2\b\b\u0002\u0010a\u001a\u00020U2\b\b\u0002\u0010b\u001a\u00020U2\b\b\u0002\u0010c\u001a\u00020U2\b\b\u0002\u0010d\u001a\u00020U2\b\b\u0002\u0010e\u001a\u00020U2\b\b\u0002\u0010f\u001a\u00020U2\b\b\u0002\u0010g\u001a\u00020U2\b\b\u0002\u0010h\u001a\u00020U2\b\b\u0002\u0010i\u001a\u00020U2\b\b\u0002\u0010j\u001a\u00020U2\b\b\u0002\u0010k\u001a\u00020U2\b\b\u0002\u0010l\u001a\u00020U2\b\b\u0002\u0010m\u001a\u00020U2\b\b\u0002\u0010n\u001a\u00020U2\b\b\u0002\u0010o\u001a\u00020U2\b\b\u0002\u0010p\u001a\u00020U2\b\b\u0002\u0010q\u001a\u00020U2\b\b\u0002\u0010r\u001a\u00020U2\b\b\u0002\u0010s\u001a\u00020U2\b\b\u0002\u0010t\u001a\u00020U2\b\b\u0002\u0010u\u001a\u00020U2\b\b\u0002\u0010v\u001a\u00020U2\b\b\u0002\u0010w\u001a\u00020U2\b\b\u0002\u0010x\u001a\u00020U2\b\b\u0002\u0010y\u001a\u00020U2\b\b\u0002\u0010z\u001a\u00020U2\b\b\u0002\u0010{\u001a\u00020U2\b\b\u0002\u0010|\u001a\u00020U2\b\b\u0002\u0010}\u001a\u00020U2\b\b\u0002\u0010~\u001a\u00020U2\b\b\u0002\u0010\u007f\u001a\u00020U2\t\b\u0002\u0010\u0080\u0001\u001a\u00020UH\u0007¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001d\u0010\u0083\u0001\u001a\u000200*\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020`H\u0000¢\u0006\u0003\b\u0086\u0001J9\u0010\u0087\u0001\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0003\u0010\u0088\u0001J9\u0010\u0096\u0001\u001a\u0002022\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\tH\u0007¢\u0006\u0005\b\u0097\u0001\u0010NJ9\u0010\u0098\u0001\u001a\u0002022\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\tH\u0007¢\u0006\u0005\b\u0099\u0001\u0010NJ9\u0010\u009a\u0001\u001a\u0002022\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010K\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\tH\u0007¢\u0006\u0005\b\u009b\u0001\u0010NR\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\r\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u000f\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0011\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0012\u0010\u000bR\u001e\u0010\u0089\u0001\u001a\u00020\u00058GX\u0087\u0004¢\u0006\u000f\u0012\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010\u0007R\u001e\u0010\u008d\u0001\u001a\u00020\u00058GX\u0087\u0004¢\u0006\u000f\u0012\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0005\b\u008f\u0001\u0010\u0007R!\u0010\u0090\u0001\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010\f\u0012\u0005\b\u0091\u0001\u0010\u0003\u001a\u0005\b\u0092\u0001\u0010\u000bR!\u0010\u0093\u0001\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010\f\u0012\u0005\b\u0094\u0001\u0010\u0003\u001a\u0005\b\u0095\u0001\u0010\u000b¨\u0006\u009c\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "<init>", "()V", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "MinHeight", "Landroidx/compose/ui/unit/Dp;", "getMinHeight-D9Ej5fM", "()F", "F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "decorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "enabled", "", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TextFieldLabelScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "placeholder", "Lkotlin/Function0;", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "colors", "Landroidx/compose/material3/TextFieldColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Landroidx/compose/foundation/text/input/TextFieldState;ZLandroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldLabelPosition;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)Landroidx/compose/foundation/text/input/TextFieldDecorator;", TextFieldImplKt.ContainerId, "modifier", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "indicatorLine", "textFieldShape", "indicatorLine-AWlRVLg", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FF)Landroidx/compose/ui/Modifier;", "DecorationBox", "value", "", "innerTextField", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "contentPaddingWithLabel", "start", "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithoutLabel", "contentPaddingWithoutLabel-a9UjIt4", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "defaultTextFieldColors", "Landroidx/compose/material3/ColorScheme;", "localTextSelectionColors", "defaultTextFieldColors$material3", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "outlinedShape", "getOutlinedShape$annotations", "(Landroidx/compose/runtime/Composer;I)V", "getOutlinedShape", "filledShape", "getFilledShape$annotations", "getFilledShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM$annotations", "getFocusedBorderThickness-D9Ej5fM", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m9732constructorimpl(56);
    private static final float MinWidth = Dp.m9732constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContainerBox$lambda$0(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2, Composer composer, int i3) {
        textFieldDefaults.ContainerBox(z, z2, interactionSource, textFieldColors, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Container_4EFweAY$lambda$2(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, Composer composer, int i3) {
        textFieldDefaults.m4257Container4EFweAY(z, z2, interactionSource, modifier, textFieldColors, shape, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecorationBox$lambda$3(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, int i, int i2, int i3, Composer composer, int i4) {
        textFieldDefaults.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z3, function22, function23, function24, function25, function26, function27, function28, shape, textFieldColors, paddingValues, function29, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations(Composer composer, int i) {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4250getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations(Composer composer, int i) {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4251getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    private TextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1941327459, "C(<get-shape>)68@3226L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:68)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m4263getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m4264getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m4266getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m4262getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit decorator$lambda$0(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C173@9342L5,168@9149L367:TextFieldDefaults.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(245572296, i, -1, "androidx.compose.material3.TextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:168)");
            }
            TextFieldDefaults textFieldDefaults = INSTANCE;
            textFieldDefaults.m4257Container4EFweAY(z, z2, interactionSource, null, textFieldColors, textFieldDefaults.getShape(composer, 6), FocusedIndicatorThickness, UnfocusedIndicatorThickness, composer, 114819072, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public final TextFieldDecorator decorator(TextFieldState textFieldState, boolean z, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, InteractionSource interactionSource, TextFieldLabelPosition textFieldLabelPosition, Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z2, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function27, Composer composer, int i, int i2, int i3) {
        TextFieldDefaults textFieldDefaults;
        final TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        final boolean z3;
        final InteractionSource interactionSource2;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function28;
        PaddingValues m4249contentPaddingWithoutLabela9UjIt4$default;
        ComposerKt.sourceInformationMarkerStart(composer, 320881373, "C(decorator)N(state,enabled,lineLimits,outputTransformation,interactionSource,labelPosition,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,isError,colors,contentPadding,container)160@8836L8,167@9135L391:TextFieldDefaults.kt#uh7d8r");
        TextFieldLabelPosition attached = (i3 & 32) != 0 ? new TextFieldLabelPosition.Attached(false, null, null, 7, null) : textFieldLabelPosition;
        Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function32 = (i3 & 64) != 0 ? null : function3;
        Function2<? super Composer, ? super Integer, Unit> function29 = (i3 & 128) != 0 ? null : function2;
        Function2<? super Composer, ? super Integer, Unit> function210 = (i3 & 256) != 0 ? null : function22;
        Function2<? super Composer, ? super Integer, Unit> function211 = (i3 & 512) != 0 ? null : function23;
        Function2<? super Composer, ? super Integer, Unit> function212 = (i3 & 1024) != 0 ? null : function24;
        Function2<? super Composer, ? super Integer, Unit> function213 = (i3 & 2048) != 0 ? null : function25;
        Function2<? super Composer, ? super Integer, Unit> function214 = (i3 & 4096) != 0 ? null : function26;
        final boolean z5 = (i3 & 8192) != 0 ? false : z2;
        if ((i3 & 16384) != 0) {
            textFieldDefaults = this;
            textFieldColors2 = textFieldDefaults.colors(composer, (i2 >> 21) & 14);
        } else {
            textFieldDefaults = this;
            textFieldColors2 = textFieldColors;
        }
        if ((32768 & i3) != 0) {
            if (function32 == null || (attached instanceof TextFieldLabelPosition.Above)) {
                m4249contentPaddingWithoutLabela9UjIt4$default = m4249contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            } else {
                m4249contentPaddingWithoutLabela9UjIt4$default = m4248contentPaddingWithLabela9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            }
            paddingValues2 = m4249contentPaddingWithoutLabela9UjIt4$default;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i3 & 65536) != 0) {
            z3 = z;
            interactionSource2 = interactionSource;
            z4 = z5;
            function28 = ComposableLambdaKt.rememberComposableLambda(245572296, true, new Function2() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit decorator$lambda$0;
                    decorator$lambda$0 = TextFieldDefaults.decorator$lambda$0(z3, z5, interactionSource2, textFieldColors2, (Composer) obj, ((Integer) obj2).intValue());
                    return decorator$lambda$0;
                }
            }, composer, 54);
        } else {
            z3 = z;
            interactionSource2 = interactionSource;
            z4 = z5;
            function28 = function27;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(320881373, i, i2, "androidx.compose.material3.TextFieldDefaults.decorator (TextFieldDefaults.kt:178)");
        }
        TextFieldDefaults$decorator$2 textFieldDefaults$decorator$2 = new TextFieldDefaults$decorator$2(outputTransformation, textFieldState, textFieldLineLimits, attached, function32, function29, function210, function211, function212, function213, function214, z3, z4, interactionSource2, paddingValues2, textFieldColors2, function28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldDefaults$decorator$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a1  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4257Container4EFweAY(final boolean z, final boolean z2, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        Modifier modifier2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        Composer composer2;
        final TextFieldColors textFieldColors3;
        final float f5;
        final float f6;
        final Shape shape3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        float f7;
        int i4;
        boolean z5;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        Shape shape5;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-818661242);
        ComposerKt.sourceInformation(startRestartGroup, "C(Container)N(enabled,isError,interactionSource,modifier,colors,shape,focusedIndicatorLineThickness:c#ui.unit.Dp,unfocusedIndicatorLineThickness:c#ui.unit.Dp)240@12176L68,242@12383L14,245@12471L344,243@12406L857:TextFieldDefaults.kt#uh7d8r");
        if ((i & 6) == 0) {
            z3 = z;
            i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            z4 = z2;
            i3 |= startRestartGroup.changed(z4) ? 32 : 16;
        } else {
            z4 = z2;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    textFieldColors2 = textFieldColors;
                    if (startRestartGroup.changed(textFieldColors2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    textFieldColors2 = textFieldColors;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                textFieldColors2 = textFieldColors;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                shape2 = shape;
                i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
            } else {
                shape2 = shape;
            }
            if ((i & 1572864) != 0) {
                f3 = f;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(f3)) ? 1048576 : 524288;
            } else {
                f3 = f;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    if (startRestartGroup.changed(f4)) {
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
            if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(this) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "235@11939L8,236@11990L5");
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) != 0) {
                        TextFieldColors colors = colors(startRestartGroup, (i3 >> 24) & 14);
                        i3 &= -57345;
                        textFieldColors2 = colors;
                    }
                    if ((i2 & 32) != 0) {
                        shape4 = INSTANCE.getShape(startRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f3 = FocusedIndicatorThickness;
                    }
                    if ((i2 & 128) != 0) {
                        f7 = UnfocusedIndicatorThickness;
                        i4 = i3 & (-29360129);
                        final TextFieldColors textFieldColors4 = textFieldColors2;
                        float f8 = f3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-818661242, i4, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:239)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -754424790, "CC(remember):TextFieldDefaults.kt#9igjgp");
                        z5 = (i4 & 896) != 256;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new MutableStyleState(interactionSource);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                        MutableStyleState mutableStyleState = (MutableStyleState) rememberedValue;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -754415074, "CC(remember):TextFieldDefaults.kt#9igjgp");
                        changedInstance = ((((57344 & i4) ^ 24576) <= 16384 && startRestartGroup.changed(textFieldColors4)) || (i4 & 24576) == 16384) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && startRestartGroup.changed(shape4)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((i4 & 14) != 4) | ((i4 & 112) == 32) | startRestartGroup.changedInstance(value);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final Shape shape6 = shape4;
                            final boolean z6 = z3;
                            final boolean z7 = z4;
                            rememberedValue2 = new Style() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda6
                                @Override // androidx.compose.foundation.style.Style
                                public final void applyStyle(StyleScope styleScope) {
                                    TextFieldDefaults.Container_4EFweAY$lambda$1$0(Shape.this, textFieldColors4, z6, z7, value, styleScope);
                                }
                            };
                            shape5 = shape6;
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            shape5 = shape4;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        BoxKt.Box(m4267indicatorLineAWlRVLg(StyleModifierKt.styleable(modifier2, mutableStyleState, (Style) rememberedValue2), z, z2, interactionSource, textFieldColors4, shape5, f8, f7), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = startRestartGroup;
                        f6 = f7;
                        f5 = f8;
                        shape3 = shape5;
                        textFieldColors3 = textFieldColors4;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    shape4 = shape2;
                }
                i4 = i3;
                f7 = f4;
                final TextFieldColors textFieldColors42 = textFieldColors2;
                float f82 = f3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -754424790, "CC(remember):TextFieldDefaults.kt#9igjgp");
                if ((i4 & 896) != 256) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue = new MutableStyleState(interactionSource);
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                MutableStyleState mutableStyleState2 = (MutableStyleState) rememberedValue;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -754415074, "CC(remember):TextFieldDefaults.kt#9igjgp");
                if (((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                }
                changedInstance = ((((57344 & i4) ^ 24576) <= 16384 && startRestartGroup.changed(textFieldColors42)) || (i4 & 24576) == 16384) | ((((458752 & i4) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && startRestartGroup.changed(shape4)) || (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((i4 & 14) != 4) | ((i4 & 112) == 32) | startRestartGroup.changedInstance(value2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                final Shape shape62 = shape4;
                final boolean z62 = z3;
                final boolean z72 = z4;
                rememberedValue2 = new Style() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda6
                    @Override // androidx.compose.foundation.style.Style
                    public final void applyStyle(StyleScope styleScope) {
                        TextFieldDefaults.Container_4EFweAY$lambda$1$0(Shape.this, textFieldColors42, z62, z72, value2, styleScope);
                    }
                };
                shape5 = shape62;
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                BoxKt.Box(m4267indicatorLineAWlRVLg(StyleModifierKt.styleable(modifier2, mutableStyleState2, (Style) rememberedValue2), z, z2, interactionSource, textFieldColors42, shape5, f82, f7), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                f6 = f7;
                f5 = f82;
                shape3 = shape5;
                textFieldColors3 = textFieldColors42;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                textFieldColors3 = textFieldColors2;
                f5 = f3;
                f6 = f4;
                shape3 = shape2;
            }
            final Modifier modifier3 = modifier2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Container_4EFweAY$lambda$2;
                        Container_4EFweAY$lambda$2 = TextFieldDefaults.Container_4EFweAY$lambda$2(TextFieldDefaults.this, z, z2, interactionSource, modifier3, textFieldColors3, shape3, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Container_4EFweAY$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        final Modifier modifier32 = modifier2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0(Shape shape, final TextFieldColors textFieldColors, final boolean z, final boolean z2, final FiniteAnimationSpec finiteAnimationSpec, StyleScope styleScope) {
        styleScope.shape(shape);
        styleScope.mo1585background8_81llA(textFieldColors.m4190containerColorXeAY9LY(z, z2, false));
        StyleStateKt.focused(styleScope, new Style() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.style.Style
            public final void applyStyle(StyleScope styleScope2) {
                TextFieldDefaults.Container_4EFweAY$lambda$1$0$0(FiniteAnimationSpec.this, textFieldColors, z, z2, styleScope2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0$0(FiniteAnimationSpec finiteAnimationSpec, final TextFieldColors textFieldColors, final boolean z, final boolean z2, StyleScope styleScope) {
        styleScope.animate(finiteAnimationSpec, new Style() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda8
            @Override // androidx.compose.foundation.style.Style
            public final void applyStyle(StyleScope styleScope2) {
                TextFieldDefaults.Container_4EFweAY$lambda$1$0$0$0(TextFieldColors.this, z, z2, styleScope2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0$0$0(TextFieldColors textFieldColors, boolean z, boolean z2, StyleScope styleScope) {
        styleScope.mo1585background8_81llA(textFieldColors.m4190containerColorXeAY9LY(z, z2, true));
    }

    /* renamed from: indicatorLine-AWlRVLg$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4252indicatorLineAWlRVLg$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, Object obj) {
        if ((i & 8) != 0) {
            textFieldColors = null;
        }
        if ((i & 16) != 0) {
            shape = null;
        }
        if ((i & 32) != 0) {
            f = FocusedIndicatorThickness;
        }
        if ((i & 64) != 0) {
            f2 = UnfocusedIndicatorThickness;
        }
        return textFieldDefaults.m4267indicatorLineAWlRVLg(modifier, z, z2, interactionSource, textFieldColors, shape, f, f2);
    }

    /* renamed from: indicatorLine-AWlRVLg, reason: not valid java name */
    public final Modifier m4267indicatorLineAWlRVLg(Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2) {
        return modifier.then(new IndicatorLineElement(z, z2, interactionSource, textFieldColors, shape, f, f2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecorationBox$lambda$0(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C392@20659L404:TextFieldDefaults.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(417908150, i, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:392)");
            }
            INSTANCE.m4257Container4EFweAY(z, z2, interactionSource, Modifier.INSTANCE, textFieldColors, shape, FocusedIndicatorThickness, UnfocusedIndicatorThickness, composer, 114822144, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function210;
        boolean z4;
        InteractionSource interactionSource2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function211;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final PaddingValues paddingValues2;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        PaddingValues paddingValues4;
        Shape shape4;
        TextFieldColors textFieldColors4;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        TextFieldColors textFieldColors5;
        Shape shape5;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        boolean z7;
        int i16;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Function2<? super Composer, ? super Integer, Unit> function224;
        Function2<? super Composer, ? super Integer, Unit> function225;
        Function2<? super Composer, ? super Integer, Unit> function226;
        PaddingValues paddingValues5;
        Function2<? super Composer, ? super Integer, Unit> function227;
        Function2<? super Composer, ? super Integer, Unit> function228;
        Shape shape6;
        ComposableLambda composableLambda;
        Composer startRestartGroup = composer.startRestartGroup(1806980801);
        ComposerKt.sourceInformation(startRestartGroup, "C(DecorationBox)N(value,innerTextField,enabled,singleLine,visualTransformation,interactionSource,isError,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,shape,colors,contentPadding,container)405@21120L129,411@21303L749:TextFieldDefaults.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function210 = function2;
            i4 |= startRestartGroup.changedInstance(function210) ? 32 : 16;
        } else {
            function210 = function2;
        }
        if ((i & 384) == 0) {
            z4 = z;
            i4 |= startRestartGroup.changed(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        int i17 = 8192;
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            interactionSource2 = interactionSource;
            i4 |= startRestartGroup.changed(interactionSource2) ? 131072 : 65536;
        } else {
            interactionSource2 = interactionSource;
        }
        int i18 = i3 & 64;
        if (i18 != 0) {
            i4 |= 1572864;
            z5 = z3;
        } else {
            z5 = z3;
            if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
            }
        }
        int i19 = i3 & 128;
        if (i19 != 0) {
            i4 |= 12582912;
            function211 = function22;
        } else {
            function211 = function22;
            if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changedInstance(function211) ? 8388608 : 4194304;
            }
        }
        int i20 = i3 & 256;
        if (i20 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        int i21 = i3 & 512;
        if (i21 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i5 = i21;
            i4 |= startRestartGroup.changedInstance(function24) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
            i6 = i3 & 1024;
            if (i6 == 0) {
                i8 = i2 | 6;
                i7 = i6;
            } else if ((i2 & 6) == 0) {
                i7 = i6;
                i8 = i2 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
            } else {
                i7 = i6;
                i8 = i2;
            }
            i9 = i3 & 2048;
            if (i9 == 0) {
                i8 |= 48;
                i10 = i9;
            } else if ((i2 & 48) == 0) {
                i10 = i9;
                i8 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
            } else {
                i10 = i9;
            }
            int i22 = i8;
            i11 = i3 & 4096;
            if (i11 == 0) {
                i12 = i22 | 384;
            } else if ((i2 & 384) == 0) {
                i12 = i22 | (startRestartGroup.changedInstance(function27) ? 256 : 128);
            } else {
                i12 = i22;
            }
            i13 = i3 & 8192;
            if (i13 == 0) {
                i14 = i12 | 3072;
            } else {
                int i23 = i12;
                if ((i2 & 3072) == 0) {
                    i14 = i23 | (startRestartGroup.changedInstance(function28) ? 2048 : 1024);
                } else {
                    i14 = i23;
                }
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16384) == 0 && startRestartGroup.changed(shape)) {
                    i17 = 16384;
                }
                i14 |= i17;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i14 |= ((i3 & 32768) == 0 && startRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i14 |= ((i3 & 65536) == 0 && startRestartGroup.changed(paddingValues)) ? 1048576 : 524288;
            }
            i15 = i3 & 131072;
            if (i15 == 0) {
                i14 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i14 |= startRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i14 |= startRestartGroup.changed(this) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 38347923) != 38347922, i4 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "383@20354L5,384@20395L8,391@20645L428");
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i18 != 0) {
                        z5 = false;
                    }
                    if (i19 != 0) {
                        function211 = null;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function229 = i20 != 0 ? null : function23;
                    Function2<? super Composer, ? super Integer, Unit> function230 = i5 != 0 ? null : function24;
                    Function2<? super Composer, ? super Integer, Unit> function231 = i7 != 0 ? null : function25;
                    Function2<? super Composer, ? super Integer, Unit> function232 = i10 != 0 ? null : function26;
                    Function2<? super Composer, ? super Integer, Unit> function233 = i11 != 0 ? null : function27;
                    Function2<? super Composer, ? super Integer, Unit> function234 = i13 != 0 ? null : function28;
                    if ((i3 & 16384) != 0) {
                        shape3 = INSTANCE.getShape(startRestartGroup, 6);
                        i14 &= -57345;
                    } else {
                        shape3 = shape;
                    }
                    if ((i3 & 32768) != 0) {
                        textFieldColors3 = colors(startRestartGroup, (i14 >> 24) & 14);
                        i14 &= -458753;
                    } else {
                        textFieldColors3 = textFieldColors;
                    }
                    if ((i3 & 65536) != 0) {
                        if (function211 == null) {
                            paddingValues3 = m4249contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValues3 = m4248contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i14 &= -3670017;
                    } else {
                        paddingValues3 = paddingValues;
                    }
                    if (i15 != 0) {
                        final TextFieldColors textFieldColors6 = textFieldColors3;
                        final Shape shape7 = shape3;
                        final boolean z8 = z4;
                        final InteractionSource interactionSource3 = interactionSource2;
                        final boolean z9 = z5;
                        Function2 function235 = new Function2() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DecorationBox$lambda$0;
                                DecorationBox$lambda$0 = TextFieldDefaults.DecorationBox$lambda$0(z8, z9, interactionSource3, textFieldColors6, shape7, (Composer) obj, ((Integer) obj2).intValue());
                                return DecorationBox$lambda$0;
                            }
                        };
                        textFieldColors4 = textFieldColors6;
                        shape4 = shape7;
                        paddingValues4 = paddingValues3;
                        function220 = function229;
                        function221 = ComposableLambdaKt.rememberComposableLambda(417908150, true, function235, startRestartGroup, 54);
                    } else {
                        paddingValues4 = paddingValues3;
                        shape4 = shape3;
                        textFieldColors4 = textFieldColors3;
                        function220 = function229;
                        function221 = function29;
                    }
                    textFieldColors5 = textFieldColors4;
                    shape5 = shape4;
                    function222 = function211;
                    z7 = z5;
                    i16 = i14;
                    function223 = function233;
                    function224 = function231;
                    function225 = function234;
                    function226 = function232;
                    paddingValues5 = paddingValues4;
                    function227 = function230;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 16384) != 0) {
                        i14 &= -57345;
                    }
                    if ((i3 & 32768) != 0) {
                        i14 &= -458753;
                    }
                    if ((i3 & 65536) != 0) {
                        i14 &= -3670017;
                    }
                    function220 = function23;
                    function224 = function25;
                    function225 = function28;
                    shape5 = shape;
                    textFieldColors5 = textFieldColors;
                    paddingValues5 = paddingValues;
                    function221 = function29;
                    function222 = function211;
                    z7 = z5;
                    i16 = i14;
                    function227 = function24;
                    function226 = function26;
                    function223 = function27;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1806980801, i4, i16, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:403)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341808930, "CC(remember):TextFieldDefaults.kt#9igjgp");
                boolean z10 = ((i4 & 14) == 4) | ((57344 & i4) == 16384);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z10 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = visualTransformation.filter(new AnnotatedString(str, null, 2, null));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                String text = ((TransformedText) rememberedValue).getText().getText();
                TextFieldType textFieldType = TextFieldType.Filled;
                TextFieldLabelPosition.Attached attached = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                if (function222 == null) {
                    startRestartGroup.startReplaceGroup(-1353147063);
                    startRestartGroup.endReplaceGroup();
                    function228 = function222;
                    shape6 = shape5;
                    composableLambda = null;
                } else {
                    startRestartGroup.startReplaceGroup(-1353147062);
                    ComposerKt.sourceInformation(startRestartGroup, "*417@21582L15");
                    function228 = function222;
                    shape6 = shape5;
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1110058497, true, new Function3() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Unit DecorationBox$lambda$2$0;
                            DecorationBox$lambda$2$0 = TextFieldDefaults.DecorationBox$lambda$2$0(Function2.this, (TextFieldLabelScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                            return DecorationBox$lambda$2$0;
                        }
                    }, startRestartGroup, 54);
                    startRestartGroup.endReplaceGroup();
                    composableLambda = rememberComposableLambda;
                }
                int i24 = i4 >> 9;
                int i25 = i16 << 21;
                composer2 = startRestartGroup;
                TextFieldImplKt.CommonDecorationBox(textFieldType, text, function210, attached, composableLambda, function220, function227, function224, function226, function223, function225, z2, z, z7, interactionSource, paddingValues5, textFieldColors5, function221, composer2, ((i4 << 3) & 896) | 6 | (458752 & i24) | (3670016 & i24) | (i25 & 29360128) | (i25 & 234881024) | (i25 & 1879048192), ((i16 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i24 & 7168) | (57344 & (i4 >> 3)) | ((i16 >> 3) & 458752) | ((i16 << 3) & 3670016) | (29360128 & i16));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function217 = function228;
                function212 = function220;
                function213 = function227;
                function214 = function224;
                function218 = function226;
                function215 = function223;
                function219 = function225;
                z6 = z7;
                paddingValues2 = paddingValues5;
                textFieldColors2 = textFieldColors5;
                function216 = function221;
                shape2 = shape6;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function212 = function23;
                function213 = function24;
                function214 = function25;
                function215 = function27;
                shape2 = shape;
                textFieldColors2 = textFieldColors;
                paddingValues2 = paddingValues;
                function216 = function29;
                function217 = function211;
                z6 = z5;
                function218 = function26;
                function219 = function28;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DecorationBox$lambda$3;
                        DecorationBox$lambda$3 = TextFieldDefaults.DecorationBox$lambda$3(TextFieldDefaults.this, str, function2, z, z2, visualTransformation, interactionSource, z6, function217, function212, function213, function214, function218, function215, function219, shape2, textFieldColors2, paddingValues2, function216, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return DecorationBox$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        i5 = i21;
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        i9 = i3 & 2048;
        if (i9 == 0) {
        }
        int i222 = i8;
        i11 = i3 & 4096;
        if (i11 == 0) {
        }
        i13 = i3 & 8192;
        if (i13 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i15 = i3 & 131072;
        if (i15 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 38347923) != 38347922, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecorationBox$lambda$2$0(Function2 function2, TextFieldLabelScope textFieldLabelScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C417@21587L8:TextFieldDefaults.kt#uh7d8r");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1110058497, i, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:417)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4248contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m4259contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m4259contentPaddingWithLabela9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m1197PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4249contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m4260contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m4260contentPaddingWithoutLabela9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m1197PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4254supportingTextPaddinga9UjIt4$material3$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = Dp.m9732constructorimpl(0);
        }
        return textFieldDefaults.m4269supportingTextPaddinga9UjIt4$material3(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3, reason: not valid java name */
    public final PaddingValues m4269supportingTextPaddinga9UjIt4$material3(float start, float top, float end, float bottom) {
        return PaddingKt.m1197PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 831731228, "C(colors)480@24124L11,480@24184L7:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:480)");
        }
        ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer, 6);
        ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localTextSelectionColors);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldColors defaultTextFieldColors$material3 = defaultTextFieldColors$material3(colorScheme, (TextSelectionColors) consume);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColors$material3;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m4258colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ComposerKt.sourceInformationMarkerStart(composer, 1513344955, "C(colors)N(focusedTextColor:c#ui.graphics.Color,unfocusedTextColor:c#ui.graphics.Color,disabledTextColor:c#ui.graphics.Color,errorTextColor:c#ui.graphics.Color,focusedContainerColor:c#ui.graphics.Color,unfocusedContainerColor:c#ui.graphics.Color,disabledContainerColor:c#ui.graphics.Color,errorContainerColor:c#ui.graphics.Color,cursorColor:c#ui.graphics.Color,errorCursorColor:c#ui.graphics.Color,selectionColors,focusedIndicatorColor:c#ui.graphics.Color,unfocusedIndicatorColor:c#ui.graphics.Color,disabledIndicatorColor:c#ui.graphics.Color,errorIndicatorColor:c#ui.graphics.Color,focusedLeadingIconColor:c#ui.graphics.Color,unfocusedLeadingIconColor:c#ui.graphics.Color,disabledLeadingIconColor:c#ui.graphics.Color,errorLeadingIconColor:c#ui.graphics.Color,focusedTrailingIconColor:c#ui.graphics.Color,unfocusedTrailingIconColor:c#ui.graphics.Color,disabledTrailingIconColor:c#ui.graphics.Color,errorTrailingIconColor:c#ui.graphics.Color,focusedLabelColor:c#ui.graphics.Color,unfocusedLabelColor:c#ui.graphics.Color,disabledLabelColor:c#ui.graphics.Color,errorLabelColor:c#ui.graphics.Color,focusedPlaceholderColor:c#ui.graphics.Color,unfocusedPlaceholderColor:c#ui.graphics.Color,disabledPlaceholderColor:c#ui.graphics.Color,errorPlaceholderColor:c#ui.graphics.Color,focusedSupportingTextColor:c#ui.graphics.Color,unfocusedSupportingTextColor:c#ui.graphics.Color,disabledSupportingTextColor:c#ui.graphics.Color,errorSupportingTextColor:c#ui.graphics.Color,focusedPrefixColor:c#ui.graphics.Color,unfocusedPrefixColor:c#ui.graphics.Color,disabledPrefixColor:c#ui.graphics.Color,errorPrefixColor:c#ui.graphics.Color,focusedSuffixColor:c#ui.graphics.Color,unfocusedSuffixColor:c#ui.graphics.Color,disabledSuffixColor:c#ui.graphics.Color,errorSuffixColor:c#ui.graphics.Color)582@31000L11,583@31073L7:TextFieldDefaults.kt#uh7d8r");
        long m6822getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
        long m6822getUnspecified0d7_KjU2 = (i6 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j2;
        long m6822getUnspecified0d7_KjU3 = (i6 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j3;
        long m6822getUnspecified0d7_KjU4 = (i6 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j4;
        long m6822getUnspecified0d7_KjU5 = (i6 & 16) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j5;
        long m6822getUnspecified0d7_KjU6 = (i6 & 32) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j6;
        long m6822getUnspecified0d7_KjU7 = (i6 & 64) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j7;
        long m6822getUnspecified0d7_KjU8 = (i6 & 128) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j8;
        long m6822getUnspecified0d7_KjU9 = (i6 & 256) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j9;
        long m6822getUnspecified0d7_KjU10 = (i6 & 512) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j10;
        TextSelectionColors textSelectionColors2 = (i6 & 1024) != 0 ? null : textSelectionColors;
        long m6822getUnspecified0d7_KjU11 = (i6 & 2048) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j11;
        long m6822getUnspecified0d7_KjU12 = (i6 & 4096) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j12;
        long m6822getUnspecified0d7_KjU13 = (i6 & 8192) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j13;
        long m6822getUnspecified0d7_KjU14 = (i6 & 16384) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j14;
        long m6822getUnspecified0d7_KjU15 = (32768 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j15;
        long m6822getUnspecified0d7_KjU16 = (65536 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j16;
        long m6822getUnspecified0d7_KjU17 = (131072 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j17;
        long m6822getUnspecified0d7_KjU18 = (262144 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j18;
        long m6822getUnspecified0d7_KjU19 = (524288 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j19;
        long m6822getUnspecified0d7_KjU20 = (1048576 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j20;
        long m6822getUnspecified0d7_KjU21 = (2097152 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j21;
        long m6822getUnspecified0d7_KjU22 = (4194304 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j22;
        long m6822getUnspecified0d7_KjU23 = (8388608 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j23;
        long m6822getUnspecified0d7_KjU24 = (16777216 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j24;
        long m6822getUnspecified0d7_KjU25 = (33554432 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j25;
        long m6822getUnspecified0d7_KjU26 = (67108864 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j26;
        long m6822getUnspecified0d7_KjU27 = (134217728 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j27;
        long m6822getUnspecified0d7_KjU28 = (268435456 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j28;
        long m6822getUnspecified0d7_KjU29 = (536870912 & i6) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j29;
        long m6822getUnspecified0d7_KjU30 = (i6 & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j30;
        long m6822getUnspecified0d7_KjU31 = (i7 & 1) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j31;
        long m6822getUnspecified0d7_KjU32 = (i7 & 2) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j32;
        long m6822getUnspecified0d7_KjU33 = (i7 & 4) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j33;
        long m6822getUnspecified0d7_KjU34 = (i7 & 8) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j34;
        long m6822getUnspecified0d7_KjU35 = (i7 & 16) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j35;
        long m6822getUnspecified0d7_KjU36 = (i7 & 32) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j36;
        long m6822getUnspecified0d7_KjU37 = (i7 & 64) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j37;
        long m6822getUnspecified0d7_KjU38 = (i7 & 128) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j38;
        long m6822getUnspecified0d7_KjU39 = (i7 & 256) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j39;
        long m6822getUnspecified0d7_KjU40 = (i7 & 512) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j40;
        long m6822getUnspecified0d7_KjU41 = (i7 & 1024) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j41;
        long m6822getUnspecified0d7_KjU42 = (i7 & 2048) != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:582)");
        }
        ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer, 6);
        ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localTextSelectionColors);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldColors m4191copyejIjP34 = defaultTextFieldColors$material3(colorScheme, (TextSelectionColors) consume).m4191copyejIjP34(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4, m6822getUnspecified0d7_KjU5, m6822getUnspecified0d7_KjU6, m6822getUnspecified0d7_KjU7, m6822getUnspecified0d7_KjU8, m6822getUnspecified0d7_KjU9, m6822getUnspecified0d7_KjU10, textSelectionColors2, m6822getUnspecified0d7_KjU11, m6822getUnspecified0d7_KjU12, m6822getUnspecified0d7_KjU13, m6822getUnspecified0d7_KjU14, m6822getUnspecified0d7_KjU15, m6822getUnspecified0d7_KjU16, m6822getUnspecified0d7_KjU17, m6822getUnspecified0d7_KjU18, m6822getUnspecified0d7_KjU19, m6822getUnspecified0d7_KjU20, m6822getUnspecified0d7_KjU21, m6822getUnspecified0d7_KjU22, m6822getUnspecified0d7_KjU23, m6822getUnspecified0d7_KjU24, m6822getUnspecified0d7_KjU25, m6822getUnspecified0d7_KjU26, m6822getUnspecified0d7_KjU27, m6822getUnspecified0d7_KjU28, m6822getUnspecified0d7_KjU29, m6822getUnspecified0d7_KjU30, m6822getUnspecified0d7_KjU31, m6822getUnspecified0d7_KjU32, m6822getUnspecified0d7_KjU33, m6822getUnspecified0d7_KjU34, m6822getUnspecified0d7_KjU35, m6822getUnspecified0d7_KjU36, m6822getUnspecified0d7_KjU37, m6822getUnspecified0d7_KjU38, m6822getUnspecified0d7_KjU39, m6822getUnspecified0d7_KjU40, m6822getUnspecified0d7_KjU41, m6822getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m4191copyejIjP34;
    }

    public final TextFieldColors defaultTextFieldColors$material3(ColorScheme colorScheme, TextSelectionColors textSelectionColors) {
        TextFieldColors defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        if (defaultTextFieldColorsCached != null) {
            if (!Intrinsics.areEqual(defaultTextFieldColorsCached.getTextSelectionColors(), textSelectionColors)) {
                defaultTextFieldColorsCached = TextFieldColors.m4189copyejIjP34$default(defaultTextFieldColorsCached, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, textSelectionColors, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1025, 2047, null);
                colorScheme.setDefaultTextFieldColorsCached$material3(defaultTextFieldColorsCached);
            }
            if (defaultTextFieldColorsCached != null) {
                return defaultTextFieldColorsCached;
            }
        }
        TextFieldColors textFieldColors = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorInputColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor()), textSelectionColors, ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor()), FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getLabelColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledLabelColor()), FilledTextFieldTokens.INSTANCE.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getSupportingColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor()), FilledTextFieldTokens.INSTANCE.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
        colorScheme.setDefaultTextFieldColorsCached$material3(textFieldColors);
        return textFieldColors;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        if ((r28 & 16) != 0) goto L66;
     */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TextFieldDefaults.Container", replaceWith = @ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ContainerBox(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, Shape shape, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        Composer composer2;
        final Shape shape3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(918564008);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContainerBox)N(enabled,isError,interactionSource,colors,shape)740@40538L368:TextFieldDefaults.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(textFieldColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i4 = 16384;
                    i3 |= i4;
                }
            } else {
                shape2 = shape;
            }
            i4 = 8192;
            i3 |= i4;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "738@40515L5");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    shape2 = INSTANCE.getShape(startRestartGroup, 6);
                    i3 &= -57345;
                }
                Shape shape4 = shape2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(918564008, i3, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:740)");
                }
                int i5 = i3 << 3;
                composer2 = startRestartGroup;
                m4257Container4EFweAY(z, z2, interactionSource, Modifier.INSTANCE, textFieldColors, shape4, FocusedIndicatorThickness, UnfocusedIndicatorThickness, composer2, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896) | (57344 & i5) | (i5 & 458752) | ((i3 << 9) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            shape3 = shape2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextFieldDefaults$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ContainerBox$lambda$0;
                    ContainerBox$lambda$0 = TextFieldDefaults.ContainerBox$lambda$0(TextFieldDefaults.this, z, z2, interactionSource, textFieldColors, shape3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ContainerBox$lambda$0;
                }
            });
        }
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -584749279, "C(<get-outlinedShape>)761@41306L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:761)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shape;
    }

    public final Shape getFilledShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 611926497, "C(<get-filledShape>)769@41553L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:769)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m4265getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m4261getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4255textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m4270textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m4270textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return m4259contentPaddingWithLabela9UjIt4(start, end, top, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4256textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m4271textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m4271textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return m4260contentPaddingWithoutLabela9UjIt4(start, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4253outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m4268outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m4268outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return OutlinedTextFieldDefaults.INSTANCE.m3712contentPaddinga9UjIt4(start, top, end, bottom);
    }

    static {
        float m9732constructorimpl = Dp.m9732constructorimpl(1);
        UnfocusedIndicatorThickness = m9732constructorimpl;
        float m9732constructorimpl2 = Dp.m9732constructorimpl(2);
        FocusedIndicatorThickness = m9732constructorimpl2;
        UnfocusedBorderThickness = m9732constructorimpl;
        FocusedBorderThickness = m9732constructorimpl2;
    }
}
