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
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
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
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0002\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2 \b\u0002\u0010!\u001a\u001a\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\b\b\u0002\u0010.\u001a\u00020\u00182\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\u0013\b\u0002\u00103\u001a\r\u0012\u0004\u0012\u00020$0(¢\u0006\u0002\b%H\u0007¢\u0006\u0002\u00104JY\u00105\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\tH\u0007¢\u0006\u0004\b:\u0010;J\u009c\u0002\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>2\u0011\u0010?\u001a\r\u0012\u0004\u0012\u00020$0(¢\u0006\u0002\b%2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020B2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010.\u001a\u00020\u00182\u0015\b\u0002\u0010!\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u00010(¢\u0006\u0002\b%2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\u0013\b\u0002\u00103\u001a\r\u0012\u0004\u0012\u00020$0(¢\u0006\u0002\b%H\u0007¢\u0006\u0002\u0010CJ5\u00101\u001a\u0002022\b\b\u0002\u0010D\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020\t2\b\b\u0002\u0010F\u001a\u00020\t2\b\b\u0002\u0010G\u001a\u00020\t¢\u0006\u0004\bH\u0010IJ\r\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u0010JJ¿\u0003\u0010/\u001a\u0002002\b\b\u0002\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020L2\b\b\u0002\u0010O\u001a\u00020L2\b\b\u0002\u0010P\u001a\u00020L2\b\b\u0002\u0010Q\u001a\u00020L2\b\b\u0002\u0010R\u001a\u00020L2\b\b\u0002\u0010S\u001a\u00020L2\b\b\u0002\u0010T\u001a\u00020L2\b\b\u0002\u0010U\u001a\u00020L2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W2\b\b\u0002\u0010X\u001a\u00020L2\b\b\u0002\u0010Y\u001a\u00020L2\b\b\u0002\u0010Z\u001a\u00020L2\b\b\u0002\u0010[\u001a\u00020L2\b\b\u0002\u0010\\\u001a\u00020L2\b\b\u0002\u0010]\u001a\u00020L2\b\b\u0002\u0010^\u001a\u00020L2\b\b\u0002\u0010_\u001a\u00020L2\b\b\u0002\u0010`\u001a\u00020L2\b\b\u0002\u0010a\u001a\u00020L2\b\b\u0002\u0010b\u001a\u00020L2\b\b\u0002\u0010c\u001a\u00020L2\b\b\u0002\u0010d\u001a\u00020L2\b\b\u0002\u0010e\u001a\u00020L2\b\b\u0002\u0010f\u001a\u00020L2\b\b\u0002\u0010g\u001a\u00020L2\b\b\u0002\u0010h\u001a\u00020L2\b\b\u0002\u0010i\u001a\u00020L2\b\b\u0002\u0010j\u001a\u00020L2\b\b\u0002\u0010k\u001a\u00020L2\b\b\u0002\u0010l\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020L2\b\b\u0002\u0010n\u001a\u00020L2\b\b\u0002\u0010o\u001a\u00020L2\b\b\u0002\u0010p\u001a\u00020L2\b\b\u0002\u0010q\u001a\u00020L2\b\b\u0002\u0010r\u001a\u00020L2\b\b\u0002\u0010s\u001a\u00020L2\b\b\u0002\u0010t\u001a\u00020L2\b\b\u0002\u0010u\u001a\u00020L2\b\b\u0002\u0010v\u001a\u00020L2\b\b\u0002\u0010w\u001a\u00020LH\u0007¢\u0006\u0004\bx\u0010yJP\u0010~\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\tH\u0007¢\u0006\u0005\b\u007f\u0010\u0080\u0001R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\r\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u000f\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0011\u001a\u00020\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0012\u0010\u000bR\u0018\u0010z\u001a\u000200*\u00020{8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "<init>", "()V", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "MinHeight", "Landroidx/compose/ui/unit/Dp;", "getMinHeight-D9Ej5fM", "()F", "F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "decorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "enabled", "", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TextFieldLabelScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "placeholder", "Lkotlin/Function0;", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "colors", "Landroidx/compose/material3/TextFieldColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Landroidx/compose/foundation/text/input/TextFieldState;ZLandroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldLabelPosition;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)Landroidx/compose/foundation/text/input/TextFieldDecorator;", TextFieldImplKt.ContainerId, "modifier", "Landroidx/compose/ui/Modifier;", "focusedBorderThickness", "unfocusedBorderThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "start", "top", "end", "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "ContainerBox", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m9732constructorimpl(56);
    private static final float MinWidth = Dp.m9732constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m9732constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m9732constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContainerBox_nbWgWpA$lambda$0(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, Composer composer, int i3) {
        outlinedTextFieldDefaults.m3710ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Container_4EFweAY$lambda$2(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, Composer composer, int i3) {
        outlinedTextFieldDefaults.m3709Container4EFweAY(z, z2, interactionSource, modifier, textFieldColors, shape, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecorationBox$lambda$3(OutlinedTextFieldDefaults outlinedTextFieldDefaults, String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, int i, int i2, int i3, Composer composer, int i4) {
        outlinedTextFieldDefaults.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z3, function22, function23, function24, function25, function26, function27, function28, textFieldColors, paddingValues, function29, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    private OutlinedTextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1066756961, "C(<get-shape>)866@45220L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:866)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m3714getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m3715getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m3716getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m3713getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit decorator$lambda$0(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C967@51258L5,962@51065L347:TextFieldDefaults.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-163468598, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:962)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = INSTANCE;
            outlinedTextFieldDefaults.m3709Container4EFweAY(z, z2, interactionSource, null, textFieldColors, outlinedTextFieldDefaults.getShape(composer, 6), FocusedBorderThickness, UnfocusedBorderThickness, composer, 114819072, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public final TextFieldDecorator decorator(TextFieldState textFieldState, boolean z, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, InteractionSource interactionSource, TextFieldLabelPosition textFieldLabelPosition, Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z2, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function27, Composer composer, int i, int i2, int i3) {
        OutlinedTextFieldDefaults outlinedTextFieldDefaults;
        final TextFieldColors textFieldColors2;
        final boolean z3;
        final InteractionSource interactionSource2;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function28;
        ComposerKt.sourceInformationMarkerStart(composer, -449059361, "C(decorator)N(state,enabled,lineLimits,outputTransformation,interactionSource,labelPosition,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,isError,colors,contentPadding,container)959@50939L8,961@51051L371:TextFieldDefaults.kt#uh7d8r");
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
            outlinedTextFieldDefaults = this;
            textFieldColors2 = outlinedTextFieldDefaults.colors(composer, (i2 >> 21) & 14);
        } else {
            outlinedTextFieldDefaults = this;
            textFieldColors2 = textFieldColors;
        }
        PaddingValues m3708contentPaddinga9UjIt4$default = (32768 & i3) != 0 ? m3708contentPaddinga9UjIt4$default(outlinedTextFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : paddingValues;
        if ((i3 & 65536) != 0) {
            z3 = z;
            interactionSource2 = interactionSource;
            z4 = z5;
            function28 = ComposableLambdaKt.rememberComposableLambda(-163468598, true, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit decorator$lambda$0;
                    decorator$lambda$0 = OutlinedTextFieldDefaults.decorator$lambda$0(z3, z5, interactionSource2, textFieldColors2, (Composer) obj, ((Integer) obj2).intValue());
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
            ComposerKt.traceEventStart(-449059361, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator (TextFieldDefaults.kt:972)");
        }
        OutlinedTextFieldDefaults$decorator$2 outlinedTextFieldDefaults$decorator$2 = new OutlinedTextFieldDefaults$decorator$2(outputTransformation, textFieldState, textFieldLineLimits, attached, function32, function29, function210, function211, function212, function213, function214, z3, z4, interactionSource2, m3708contentPaddinga9UjIt4$default, textFieldColors2, function28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return outlinedTextFieldDefaults$decorator$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3709Container4EFweAY(final boolean z, final boolean z2, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        Modifier modifier2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        int i4;
        final float f5;
        final TextFieldColors textFieldColors3;
        final float f6;
        final Shape shape3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        final Shape shape4;
        float f7;
        final TextFieldColors textFieldColors4;
        int i6;
        boolean z4;
        Object rememberedValue;
        boolean z5;
        Object rememberedValue2;
        final float f8;
        final float f9;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1035477640);
        ComposerKt.sourceInformation(startRestartGroup, "C(Container)N(enabled,isError,interactionSource,modifier,colors,shape,focusedBorderThickness:c#ui.unit.Dp,unfocusedBorderThickness:c#ui.unit.Dp)1031@53997L68,1032@54128L14,1034@54199L594,1033@54151L652:TextFieldDefaults.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i3 |= startRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z2;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    textFieldColors2 = textFieldColors;
                    if (startRestartGroup.changed(textFieldColors2)) {
                        i8 = 16384;
                        i3 |= i8;
                    }
                } else {
                    textFieldColors2 = textFieldColors;
                }
                i8 = 8192;
                i3 |= i8;
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
                        i7 = 8388608;
                        i3 |= i7;
                    }
                } else {
                    f4 = f2;
                }
                i7 = 4194304;
                i3 |= i7;
            } else {
                f4 = f2;
            }
            if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(this) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            }
            i4 = i3;
            boolean z6 = true;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i4 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "1026@53772L8,1027@53831L5");
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) != 0) {
                        i5 = i4 & (-57345);
                        textFieldColors2 = colors(startRestartGroup, (i4 >> 24) & 14);
                    } else {
                        i5 = i4;
                    }
                    if ((i2 & 32) != 0) {
                        i5 &= -458753;
                        shape2 = INSTANCE.getShape(startRestartGroup, 6);
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                        f3 = FocusedBorderThickness;
                    }
                    i4 = i5;
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                        TextFieldColors textFieldColors5 = textFieldColors2;
                        shape4 = shape2;
                        f7 = f3;
                        textFieldColors4 = textFieldColors5;
                        f4 = UnfocusedBorderThickness;
                        Modifier modifier4 = modifier2;
                        i6 = i4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035477640, i6, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1030)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338387412, "CC(remember):TextFieldDefaults.kt#9igjgp");
                        z4 = (i6 & 896) != 256;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new MutableStyleState(interactionSource);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                        MutableStyleState mutableStyleState = (MutableStyleState) rememberedValue;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338380422, "CC(remember):TextFieldDefaults.kt#9igjgp");
                        boolean changedInstance = ((((458752 & i6) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && startRestartGroup.changed(shape4)) || (i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((57344 & i6) ^ 24576) <= 16384 && startRestartGroup.changed(textFieldColors4)) || (i6 & 24576) == 16384) | ((i6 & 14) != 4) | ((i6 & 112) != 32) | ((((29360128 & i6) ^ 12582912) <= 8388608 && startRestartGroup.changed(f4)) || (i6 & 12582912) == 8388608) | startRestartGroup.changedInstance(value);
                        if ((((3670016 & i6) ^ 1572864) > 1048576 || !startRestartGroup.changed(f7)) && (i6 & 1572864) != 1048576) {
                            z6 = false;
                        }
                        z5 = changedInstance | z6;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            f8 = f7;
                            final boolean z7 = z3;
                            f9 = f4;
                            Object obj = new Style() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda0
                                @Override // androidx.compose.foundation.style.Style
                                public final void applyStyle(StyleScope styleScope) {
                                    OutlinedTextFieldDefaults.Container_4EFweAY$lambda$1$0(Shape.this, textFieldColors4, z, z7, f9, value, f8, styleScope);
                                }
                            };
                            startRestartGroup.updateRememberedValue(obj);
                            rememberedValue2 = obj;
                        } else {
                            f8 = f7;
                            f9 = f4;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        BoxKt.Box(StyleModifierKt.styleable(modifier4, mutableStyleState, (Style) rememberedValue2), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        shape3 = shape4;
                        textFieldColors3 = textFieldColors4;
                        f5 = f9;
                        f6 = f8;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                    }
                }
                TextFieldColors textFieldColors6 = textFieldColors2;
                shape4 = shape2;
                f7 = f3;
                textFieldColors4 = textFieldColors6;
                Modifier modifier42 = modifier2;
                i6 = i4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338387412, "CC(remember):TextFieldDefaults.kt#9igjgp");
                if ((i6 & 896) != 256) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = new MutableStyleState(interactionSource);
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                MutableStyleState mutableStyleState2 = (MutableStyleState) rememberedValue;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338380422, "CC(remember):TextFieldDefaults.kt#9igjgp");
                boolean changedInstance2 = ((((458752 & i6) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && startRestartGroup.changed(shape4)) || (i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((57344 & i6) ^ 24576) <= 16384 && startRestartGroup.changed(textFieldColors4)) || (i6 & 24576) == 16384) | ((i6 & 14) != 4) | ((i6 & 112) != 32) | ((((29360128 & i6) ^ 12582912) <= 8388608 && startRestartGroup.changed(f4)) || (i6 & 12582912) == 8388608) | startRestartGroup.changedInstance(value2);
                if (((3670016 & i6) ^ 1572864) > 1048576) {
                }
                z6 = false;
                z5 = changedInstance2 | z6;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (z5) {
                }
                f8 = f7;
                final boolean z72 = z3;
                f9 = f4;
                Object obj2 = new Style() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda0
                    @Override // androidx.compose.foundation.style.Style
                    public final void applyStyle(StyleScope styleScope) {
                        OutlinedTextFieldDefaults.Container_4EFweAY$lambda$1$0(Shape.this, textFieldColors4, z, z72, f9, value2, f8, styleScope);
                    }
                };
                startRestartGroup.updateRememberedValue(obj2);
                rememberedValue2 = obj2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                BoxKt.Box(StyleModifierKt.styleable(modifier42, mutableStyleState2, (Style) rememberedValue2), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                shape3 = shape4;
                textFieldColors3 = textFieldColors4;
                f5 = f9;
                f6 = f8;
            } else {
                startRestartGroup.skipToGroupEnd();
                f5 = f4;
                textFieldColors3 = textFieldColors2;
                f6 = f3;
                shape3 = shape2;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Unit Container_4EFweAY$lambda$2;
                        Container_4EFweAY$lambda$2 = OutlinedTextFieldDefaults.Container_4EFweAY$lambda$2(OutlinedTextFieldDefaults.this, z, z2, interactionSource, modifier3, textFieldColors3, shape3, f6, f5, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
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
        i4 = i3;
        boolean z62 = true;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0(Shape shape, final TextFieldColors textFieldColors, final boolean z, final boolean z2, float f, final FiniteAnimationSpec finiteAnimationSpec, final float f2, StyleScope styleScope) {
        styleScope.shape(shape);
        styleScope.mo1585background8_81llA(textFieldColors.m4190containerColorXeAY9LY(z, z2, false));
        styleScope.mo1588bordercXLIe8U(f, textFieldColors.m4235indicatorColorXeAY9LY(z, z2, false));
        StyleStateKt.focused(styleScope, new Style() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda5
            @Override // androidx.compose.foundation.style.Style
            public final void applyStyle(StyleScope styleScope2) {
                OutlinedTextFieldDefaults.Container_4EFweAY$lambda$1$0$0(FiniteAnimationSpec.this, textFieldColors, z, z2, f2, styleScope2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0$0(FiniteAnimationSpec finiteAnimationSpec, final TextFieldColors textFieldColors, final boolean z, final boolean z2, final float f, StyleScope styleScope) {
        styleScope.animate(finiteAnimationSpec, new Style() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda8
            @Override // androidx.compose.foundation.style.Style
            public final void applyStyle(StyleScope styleScope2) {
                OutlinedTextFieldDefaults.Container_4EFweAY$lambda$1$0$0$0(TextFieldColors.this, z, z2, f, styleScope2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0$0$0(TextFieldColors textFieldColors, boolean z, boolean z2, float f, StyleScope styleScope) {
        styleScope.mo1585background8_81llA(textFieldColors.m4190containerColorXeAY9LY(z, z2, true));
        styleScope.mo1588bordercXLIe8U(f, textFieldColors.m4235indicatorColorXeAY9LY(z, z2, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecorationBox$lambda$0(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1136@60290L5,1130@60060L384:TextFieldDefaults.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896270173, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1130)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = INSTANCE;
            outlinedTextFieldDefaults.m3709Container4EFweAY(z, z2, interactionSource, Modifier.INSTANCE, textFieldColors, outlinedTextFieldDefaults.getShape(composer, 6), FocusedBorderThickness, UnfocusedBorderThickness, composer, 114822144, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final boolean z4;
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
        int i16;
        int i17;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final TextFieldColors textFieldColors2;
        final PaddingValues paddingValues2;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        ScopeUpdateScope endRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        final TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        PaddingValues paddingValues4;
        TextFieldColors textFieldColors4;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Function2<? super Composer, ? super Integer, Unit> function224;
        int i18;
        boolean z6;
        TextFieldColors textFieldColors5;
        Function2<? super Composer, ? super Integer, Unit> function225;
        PaddingValues paddingValues5;
        Function2<? super Composer, ? super Integer, Unit> function226;
        ComposableLambda rememberComposableLambda;
        Composer startRestartGroup = composer.startRestartGroup(-1732281618);
        ComposerKt.sourceInformation(startRestartGroup, "C(DecorationBox)N(value,innerTextField,enabled,singleLine,visualTransformation,interactionSource,isError,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,colors,contentPadding,container)1143@60501L129,1149@60684L751:TextFieldDefaults.kt#uh7d8r");
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        int i19 = 8192;
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        int i20 = i3 & 64;
        if (i20 != 0) {
            i4 |= 1572864;
            z4 = z3;
        } else {
            z4 = z3;
            if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
            }
        }
        int i21 = i3 & 128;
        if (i21 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
        }
        int i22 = i3 & 256;
        if (i22 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i5 = i22;
            i4 |= startRestartGroup.changedInstance(function23) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
            i6 = i3 & 512;
            if (i6 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i7 = i6;
                i4 |= startRestartGroup.changedInstance(function24) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else if ((i2 & 6) == 0) {
                    i9 = i8;
                    i10 = i2 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i9 = i8;
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                    i12 = i11;
                } else if ((i2 & 48) == 0) {
                    i12 = i11;
                    i10 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                } else {
                    i12 = i11;
                }
                int i23 = i10;
                i13 = i3 & 4096;
                if (i13 != 0) {
                    i14 = i23 | 384;
                } else if ((i2 & 384) == 0) {
                    i14 = i23 | (startRestartGroup.changedInstance(function27) ? 256 : 128);
                } else {
                    i14 = i23;
                }
                i15 = i3 & 8192;
                if (i15 != 0) {
                    i16 = i14 | 3072;
                } else {
                    i16 = i14;
                    if ((i2 & 3072) == 0) {
                        i16 |= startRestartGroup.changedInstance(function28) ? 2048 : 1024;
                        if ((i2 & 24576) == 0) {
                            if ((i3 & 16384) == 0 && startRestartGroup.changed(textFieldColors)) {
                                i19 = 16384;
                            }
                            i16 |= i19;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i16 |= ((i3 & 32768) == 0 && startRestartGroup.changed(paddingValues)) ? 131072 : 65536;
                        }
                        i17 = i3 & 65536;
                        if (i17 == 0) {
                            i16 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i16 |= startRestartGroup.changedInstance(function29) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            i16 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 4793491) != 4793490, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "1127@59934L8,1129@60046L408");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i20 != 0) {
                                    z4 = false;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function227 = i21 != 0 ? null : function22;
                                function218 = i5 != 0 ? null : function23;
                                function219 = i7 != 0 ? null : function24;
                                function220 = i9 != 0 ? null : function25;
                                Function2<? super Composer, ? super Integer, Unit> function228 = i12 != 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function229 = i13 != 0 ? null : function27;
                                Function2<? super Composer, ? super Integer, Unit> function230 = i15 != 0 ? null : function28;
                                if ((i3 & 16384) != 0) {
                                    textFieldColors3 = colors(startRestartGroup, (i16 >> 21) & 14);
                                    i16 &= -57345;
                                } else {
                                    textFieldColors3 = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValues3 = m3708contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i16 &= -458753;
                                } else {
                                    paddingValues3 = paddingValues;
                                }
                                if (i17 != 0) {
                                    paddingValues4 = paddingValues3;
                                    Function2<? super Composer, ? super Integer, Unit> function231 = function227;
                                    textFieldColors4 = textFieldColors3;
                                    function222 = ComposableLambdaKt.rememberComposableLambda(-896270173, true, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DecorationBox$lambda$0;
                                            DecorationBox$lambda$0 = OutlinedTextFieldDefaults.DecorationBox$lambda$0(z, z4, interactionSource, textFieldColors3, (Composer) obj, ((Integer) obj2).intValue());
                                            return DecorationBox$lambda$0;
                                        }
                                    }, startRestartGroup, 54);
                                    function223 = function229;
                                    function224 = function230;
                                    i18 = i16;
                                    function221 = function231;
                                } else {
                                    paddingValues4 = paddingValues3;
                                    textFieldColors4 = textFieldColors3;
                                    function221 = function227;
                                    function222 = function29;
                                    function223 = function229;
                                    function224 = function230;
                                    i18 = i16;
                                }
                                z6 = z4;
                                textFieldColors5 = textFieldColors4;
                                function225 = function228;
                                paddingValues5 = paddingValues4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16384) != 0) {
                                    i16 &= -57345;
                                }
                                if ((i3 & 32768) != 0) {
                                    i16 &= -458753;
                                }
                                function221 = function22;
                                function218 = function23;
                                function219 = function24;
                                function220 = function25;
                                function223 = function27;
                                function224 = function28;
                                paddingValues5 = paddingValues;
                                function222 = function29;
                                z6 = z4;
                                i18 = i16;
                                function225 = function26;
                                textFieldColors5 = textFieldColors;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1732281618, i4, i18, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1724716111, "CC(remember):TextFieldDefaults.kt#9igjgp");
                            int i24 = i18;
                            boolean z7 = ((57344 & i4) == 16384) | ((i4 & 14) == 4);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z7 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = visualTransformation.filter(new AnnotatedString(str, null, 2, null));
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            String text = ((TransformedText) rememberedValue).getText().getText();
                            TextFieldType textFieldType = TextFieldType.Outlined;
                            TextFieldLabelPosition.Attached attached = new TextFieldLabelPosition.Attached(false, null, null, 7, null);
                            if (function221 == null) {
                                startRestartGroup.startReplaceGroup(1927042940);
                                startRestartGroup.endReplaceGroup();
                                function226 = function221;
                                rememberComposableLambda = null;
                            } else {
                                startRestartGroup.startReplaceGroup(1927042941);
                                ComposerKt.sourceInformation(startRestartGroup, "*1155@60965L15");
                                function226 = function221;
                                rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1459717586, true, new Function3() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        Unit DecorationBox$lambda$2$0;
                                        DecorationBox$lambda$2$0 = OutlinedTextFieldDefaults.DecorationBox$lambda$2$0(Function2.this, (TextFieldLabelScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        return DecorationBox$lambda$2$0;
                                    }
                                }, startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            }
                            int i25 = i4 >> 9;
                            int i26 = i24 << 21;
                            int i27 = ((i4 << 3) & 896) | 6 | (i25 & 458752) | (i25 & 3670016) | (i26 & 29360128) | (i26 & 234881024) | (i26 & 1879048192);
                            int i28 = ((i24 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i25 & 7168) | (57344 & (i4 >> 3)) | (i24 & 458752) | ((i24 << 6) & 3670016) | (29360128 & (i24 << 3));
                            composer2 = startRestartGroup;
                            Function2<? super Composer, ? super Integer, Unit> function232 = function218;
                            Function2<? super Composer, ? super Integer, Unit> function233 = function219;
                            Function2<? super Composer, ? super Integer, Unit> function234 = function220;
                            TextFieldImplKt.CommonDecorationBox(textFieldType, text, function2, attached, rememberComposableLambda, function232, function233, function234, function225, function223, function224, z2, z, z6, interactionSource, paddingValues5, textFieldColors5, function222, composer2, i27, i28);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function214 = function223;
                            function215 = function224;
                            paddingValues2 = paddingValues5;
                            function216 = function222;
                            function212 = function234;
                            function213 = function225;
                            function211 = function232;
                            function217 = function233;
                            z5 = z6;
                            textFieldColors2 = textFieldColors5;
                            function210 = function226;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            function210 = function22;
                            function211 = function23;
                            function212 = function25;
                            function213 = function26;
                            function214 = function27;
                            function215 = function28;
                            textFieldColors2 = textFieldColors;
                            paddingValues2 = paddingValues;
                            function216 = function29;
                            z5 = z4;
                            function217 = function24;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DecorationBox$lambda$3;
                                    DecorationBox$lambda$3 = OutlinedTextFieldDefaults.DecorationBox$lambda$3(OutlinedTextFieldDefaults.this, str, function2, z, z2, visualTransformation, interactionSource, z5, function210, function211, function217, function212, function213, function214, function215, textFieldColors2, paddingValues2, function216, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return DecorationBox$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i17 = i3 & 65536;
                if (i17 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 4793491) != 4793490, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i6;
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
            }
            int i232 = i10;
            i13 = i3 & 4096;
            if (i13 != 0) {
            }
            i15 = i3 & 8192;
            if (i15 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i17 = i3 & 65536;
            if (i17 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i22;
        i6 = i3 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
        }
        int i2322 = i10;
        i13 = i3 & 4096;
        if (i13 != 0) {
        }
        i15 = i3 & 8192;
        if (i15 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i17 = i3 & 65536;
        if (i17 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecorationBox$lambda$2$0(Function2 function2, TextFieldLabelScope textFieldLabelScope, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1155@60970L8:TextFieldDefaults.kt#uh7d8r");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1459717586, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:1155)");
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

    /* renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m3708contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return outlinedTextFieldDefaults.m3712contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m3712contentPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m1197PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -471651810, "C(colors)1188@62222L11,1188@62234L30:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1188)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedTextFieldColors;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m3711colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ComposerKt.sourceInformationMarkerStart(composer, 1767617725, "C(colors)N(focusedTextColor:c#ui.graphics.Color,unfocusedTextColor:c#ui.graphics.Color,disabledTextColor:c#ui.graphics.Color,errorTextColor:c#ui.graphics.Color,focusedContainerColor:c#ui.graphics.Color,unfocusedContainerColor:c#ui.graphics.Color,disabledContainerColor:c#ui.graphics.Color,errorContainerColor:c#ui.graphics.Color,cursorColor:c#ui.graphics.Color,errorCursorColor:c#ui.graphics.Color,selectionColors,focusedBorderColor:c#ui.graphics.Color,unfocusedBorderColor:c#ui.graphics.Color,disabledBorderColor:c#ui.graphics.Color,errorBorderColor:c#ui.graphics.Color,focusedLeadingIconColor:c#ui.graphics.Color,unfocusedLeadingIconColor:c#ui.graphics.Color,disabledLeadingIconColor:c#ui.graphics.Color,errorLeadingIconColor:c#ui.graphics.Color,focusedTrailingIconColor:c#ui.graphics.Color,unfocusedTrailingIconColor:c#ui.graphics.Color,disabledTrailingIconColor:c#ui.graphics.Color,errorTrailingIconColor:c#ui.graphics.Color,focusedLabelColor:c#ui.graphics.Color,unfocusedLabelColor:c#ui.graphics.Color,disabledLabelColor:c#ui.graphics.Color,errorLabelColor:c#ui.graphics.Color,focusedPlaceholderColor:c#ui.graphics.Color,unfocusedPlaceholderColor:c#ui.graphics.Color,disabledPlaceholderColor:c#ui.graphics.Color,errorPlaceholderColor:c#ui.graphics.Color,focusedSupportingTextColor:c#ui.graphics.Color,unfocusedSupportingTextColor:c#ui.graphics.Color,disabledSupportingTextColor:c#ui.graphics.Color,errorSupportingTextColor:c#ui.graphics.Color,focusedPrefixColor:c#ui.graphics.Color,unfocusedPrefixColor:c#ui.graphics.Color,disabledPrefixColor:c#ui.graphics.Color,errorPrefixColor:c#ui.graphics.Color,focusedSuffixColor:c#ui.graphics.Color,unfocusedSuffixColor:c#ui.graphics.Color,disabledSuffixColor:c#ui.graphics.Color,errorSuffixColor:c#ui.graphics.Color)1290@69045L11,1290@69057L30:TextFieldDefaults.kt#uh7d8r");
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
            ComposerKt.traceEventStart(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1290)");
        }
        TextFieldColors m4191copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & 112).m4191copyejIjP34(m6822getUnspecified0d7_KjU, m6822getUnspecified0d7_KjU2, m6822getUnspecified0d7_KjU3, m6822getUnspecified0d7_KjU4, m6822getUnspecified0d7_KjU5, m6822getUnspecified0d7_KjU6, m6822getUnspecified0d7_KjU7, m6822getUnspecified0d7_KjU8, m6822getUnspecified0d7_KjU9, m6822getUnspecified0d7_KjU10, textSelectionColors2, m6822getUnspecified0d7_KjU11, m6822getUnspecified0d7_KjU12, m6822getUnspecified0d7_KjU13, m6822getUnspecified0d7_KjU14, m6822getUnspecified0d7_KjU15, m6822getUnspecified0d7_KjU16, m6822getUnspecified0d7_KjU17, m6822getUnspecified0d7_KjU18, m6822getUnspecified0d7_KjU19, m6822getUnspecified0d7_KjU20, m6822getUnspecified0d7_KjU21, m6822getUnspecified0d7_KjU22, m6822getUnspecified0d7_KjU23, m6822getUnspecified0d7_KjU24, m6822getUnspecified0d7_KjU25, m6822getUnspecified0d7_KjU26, m6822getUnspecified0d7_KjU27, m6822getUnspecified0d7_KjU28, m6822getUnspecified0d7_KjU29, m6822getUnspecified0d7_KjU30, m6822getUnspecified0d7_KjU31, m6822getUnspecified0d7_KjU32, m6822getUnspecified0d7_KjU33, m6822getUnspecified0d7_KjU34, m6822getUnspecified0d7_KjU35, m6822getUnspecified0d7_KjU36, m6822getUnspecified0d7_KjU37, m6822getUnspecified0d7_KjU38, m6822getUnspecified0d7_KjU39, m6822getUnspecified0d7_KjU40, m6822getUnspecified0d7_KjU41, m6822getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m4191copyejIjP34;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        TextFieldColors textFieldColors;
        ComposerKt.sourceInformationMarkerStart(composer, -292363577, "C(<get-defaultOutlinedTextFieldColors>):TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1338)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        if (defaultOutlinedTextFieldColorsCached == null) {
            composer.startReplaceGroup(390452338);
            composer.endReplaceGroup();
            textFieldColors = null;
        } else {
            composer.startReplaceGroup(390452339);
            ComposerKt.sourceInformation(composer, "*1340@71852L7");
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextSelectionColors textSelectionColors = (TextSelectionColors) consume;
            if (!Intrinsics.areEqual(defaultOutlinedTextFieldColorsCached.getTextSelectionColors(), textSelectionColors)) {
                defaultOutlinedTextFieldColorsCached = TextFieldColors.m4189copyejIjP34$default(defaultOutlinedTextFieldColorsCached, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, textSelectionColors, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1025, 2047, null);
                colorScheme.setDefaultOutlinedTextFieldColorsCached$material3(defaultOutlinedTextFieldColorsCached);
            }
            composer.endReplaceGroup();
            textFieldColors = defaultOutlinedTextFieldColorsCached;
        }
        if (textFieldColors == null) {
            composer.startReplaceGroup(-1788321191);
            ComposerKt.sourceInformation(composer, "1362@73275L7");
            long fromToken = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusInputColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputColor());
            long m6785copywmQWz5c$default = Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long fromToken3 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorInputColor());
            long m6821getTransparent0d7_KjU = Color.INSTANCE.m6821getTransparent0d7_KjU();
            long m6821getTransparent0d7_KjU2 = Color.INSTANCE.m6821getTransparent0d7_KjU();
            long m6821getTransparent0d7_KjU3 = Color.INSTANCE.m6821getTransparent0d7_KjU();
            long m6821getTransparent0d7_KjU4 = Color.INSTANCE.m6821getTransparent0d7_KjU();
            long fromToken4 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getCaretColor());
            long fromToken5 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors2 = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localTextSelectionColors2);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextFieldColors textFieldColors2 = new TextFieldColors(fromToken, fromToken2, m6785copywmQWz5c$default, fromToken3, m6821getTransparent0d7_KjU, m6821getTransparent0d7_KjU2, m6821getTransparent0d7_KjU3, m6821getTransparent0d7_KjU4, fromToken4, fromToken5, (TextSelectionColors) consume2, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getOutlineColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLabelColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getSupportingColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m6785copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3(textFieldColors2);
            composer.endReplaceGroup();
            textFieldColors = textFieldColors2;
        } else {
            composer.startReplaceGroup(-1788515437);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColors;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0114, code lost:
    
        if ((r27 & 64) != 0) goto L112;
     */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to OutlinedTextFieldDefaults.Container", replaceWith = @ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n    focusedBorderThickness = focusedBorderThickness,\n    unfocusedBorderThickness = unfocusedBorderThickness,\n)", imports = {}))
    /* renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3710ContainerBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        final TextFieldColors textFieldColors3;
        final Shape shape3;
        final float f5;
        final float f6;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1461761386);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContainerBox)N(enabled,isError,interactionSource,colors,shape,focusedBorderThickness:c#ui.unit.Dp,unfocusedBorderThickness:c#ui.unit.Dp)1455@79129L348:TextFieldDefaults.kt#uh7d8r");
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
            interactionSource2 = interactionSource;
            i3 |= startRestartGroup.changed(interactionSource2) ? 256 : 128;
        } else {
            interactionSource2 = interactionSource;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                textFieldColors2 = textFieldColors;
                if (startRestartGroup.changed(textFieldColors2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                textFieldColors2 = textFieldColors;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            textFieldColors2 = textFieldColors;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                if (startRestartGroup.changed(f3)) {
                    i5 = 131072;
                    i3 |= i5;
                }
            } else {
                f3 = f;
            }
            i5 = 65536;
            i3 |= i5;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                if (startRestartGroup.changed(f4)) {
                    i4 = 1048576;
                    i3 |= i4;
                }
            } else {
                f4 = f2;
            }
            i4 = 524288;
            i3 |= i4;
        } else {
            f4 = f2;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "1450@78921L8,1451@78980L5");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    textFieldColors2 = colors(startRestartGroup, (i3 >> 21) & 14);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    shape2 = INSTANCE.getShape(startRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    f3 = FocusedBorderThickness;
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    f4 = UnfocusedBorderThickness;
                    i3 &= -3670017;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461761386, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1455)");
                }
                int i8 = (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896);
                int i9 = i3 << 3;
                int i10 = (i9 & 234881024) | i8 | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9);
                InteractionSource interactionSource3 = interactionSource2;
                textFieldColors3 = textFieldColors2;
                shape3 = shape2;
                f5 = f3;
                f6 = f4;
                m3709Container4EFweAY(z3, z4, interactionSource3, Modifier.INSTANCE, textFieldColors3, shape3, f5, f6, startRestartGroup, i10, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            textFieldColors3 = textFieldColors2;
            shape3 = shape2;
            f5 = f3;
            f6 = f4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ContainerBox_nbWgWpA$lambda$0;
                    ContainerBox_nbWgWpA$lambda$0 = OutlinedTextFieldDefaults.ContainerBox_nbWgWpA$lambda$0(OutlinedTextFieldDefaults.this, z, z2, interactionSource, textFieldColors3, shape3, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ContainerBox_nbWgWpA$lambda$0;
                }
            });
        }
    }
}
