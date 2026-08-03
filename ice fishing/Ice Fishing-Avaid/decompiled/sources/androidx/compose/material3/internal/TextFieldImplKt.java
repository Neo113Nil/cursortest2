package androidx.compose.material3.internal;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.TextFieldLabelScope;
import androidx.compose.material3.Typography;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.profileinstaller.ProfileVerifier;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.ranges.RangesKt;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\u001a\u0099\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\t\u001a\u00020\n2\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\b¢\u0006\u0002\b\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010 \u001a\u0081\u0001\u0010!\u001a\u00020\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\b¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0002\u0010.\u001a2\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020+2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b<\u0010=\u001a*\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020:2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b>\u0010?\u001a\u001c\u0010@\u001a\u00020A*\u00020A2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010B\u001a\u00020CH\u0000\u001a\u001c\u0010D\u001a\u00020A*\u00020A2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0000\u001a\u001a\u0010I\u001a\u00020A*\u00020A2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u0007H\u0000\u001a%\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010/\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010L\u001a%\u0010M\u001a\b\u0012\u0004\u0012\u00020$0#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010/\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010L\u001a%\u0010N\u001a\b\u0012\u0004\u0012\u00020$0#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010/\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010L\u001a/\u0010O\u001a\b\u0012\u0004\u0012\u00020:0#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020:H\u0003¢\u0006\u0004\bR\u0010S\u001a'\u0010T\u001a\b\u0012\u0004\u0012\u00020:0#*\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010U\u001a\u00020:H\u0003¢\u0006\u0004\bV\u0010W\u001a\r\u0010a\u001a\u00020KH\u0001¢\u0006\u0002\u0010b\u001a\r\u0010c\u001a\u00020KH\u0001¢\u0006\u0002\u0010b\"\u0018\u0010/\u001a\u00020\u0016*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0018\u00102\u001a\u000203*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0018\u00106\u001a\u000203*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00105\"\u000e\u0010X\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010Y\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010Z\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010[\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\\\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010]\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010^\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010_\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010`\u001a\u00020CX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010d\u001a\u00020KX\u0080\u0004¢\u0006\n\n\u0002\u0010g\u001a\u0004\be\u0010f\"\u0016\u0010h\u001a\u00020KX\u0080\u0004¢\u0006\n\n\u0002\u0010g\u001a\u0004\bi\u0010f\"\u0016\u0010j\u001a\u00020KX\u0080\u0004¢\u0006\n\n\u0002\u0010g\u001a\u0004\bk\u0010f\"\u0016\u0010l\u001a\u00020KX\u0080\u0004¢\u0006\n\n\u0002\u0010g\u001a\u0004\bm\u0010f\"\u0016\u0010n\u001a\u00020KX\u0080\u0004¢\u0006\n\n\u0002\u0010g\u001a\u0004\bo\u0010f\"\u0016\u0010p\u001a\u00020KX\u0080\u0004¢\u0006\n\n\u0002\u0010g\u001a\u0004\bq\u0010f\"\u0016\u0010r\u001a\u00020KX\u0080\u0004¢\u0006\n\n\u0002\u0010g\u001a\u0004\bs\u0010f\"\u0016\u0010t\u001a\u00020KX\u0080\u0004¢\u0006\n\n\u0002\u0010g\u001a\u0004\bu\u0010f¨\u0006v²\u0006\n\u0010w\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010x\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"CommonDecorationBox", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/material3/internal/TextFieldType;", "visualText", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "labelPosition", "Landroidx/compose/material3/TextFieldLabelPosition;", "label", "Lkotlin/Function1;", "Landroidx/compose/material3/TextFieldLabelScope;", "Lkotlin/ExtensionFunctionType;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldLabelPosition;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DecoratedLabel", "labelProgress", "Landroidx/compose/runtime/State;", "", "isFocused", "overrideLabelTextStyleColor", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/material3/internal/InputPhase;", "bodySmall", "Landroidx/compose/ui/text/TextStyle;", "bodyLarge", "content", "(Landroidx/compose/runtime/State;Landroidx/compose/material3/TextFieldColors;ZZZZLandroidx/compose/animation/core/Transition;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "showExpandedLabel", "getShowExpandedLabel", "(Landroidx/compose/material3/TextFieldLabelPosition;)Z", "minimizedAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "getMinimizedAlignment", "(Landroidx/compose/material3/TextFieldLabelPosition;)Landroidx/compose/ui/Alignment$Horizontal;", "expandedAlignment", "getExpandedAlignment", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "textStyle", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "defaultErrorSemantics", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "", "textFieldBackground", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "shape", "Landroidx/compose/ui/graphics/Shape;", "textFieldLabelMinHeight", "minHeight", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/animation/core/Transition;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "placeholderOpacity", "affixOpacity", "labelTextStyleColor", "focusedLabelTextStyleColor", "unfocusedLabelTextStyleColor", "labelTextStyleColor-1wkBAMs", "(Landroidx/compose/animation/core/Transition;JJLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelContentColor", "labelColor", "labelContentColor-RPmYEkk", "(Landroidx/compose/animation/core/Transition;JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "TextFieldId", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "PrefixId", "SuffixId", "SupportingId", "ContainerId", "textFieldHorizontalIconPadding", "(Landroidx/compose/runtime/Composer;I)F", "minimizedLabelHalfHeight", "TextFieldPadding", "getTextFieldPadding", "()F", "F", "AboveLabelHorizontalPadding", "getAboveLabelHorizontalPadding", "AboveLabelBottomPadding", "getAboveLabelBottomPadding", "SupportingTopPadding", "getSupportingTopPadding", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "MinTextLineHeight", "getMinTextLineHeight", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "material3", "showPlaceholder", "showAffix"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    private static final float AboveLabelBottomPadding;
    private static final float AboveLabelHorizontalPadding;
    public static final String ContainerId = "Container";
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    private static final float SupportingTopPadding;
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final float PrefixSuffixTextPadding = Dp.m9732constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m9732constructorimpl(24);

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$18(TextFieldType textFieldType, CharSequence charSequence, Function2 function2, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, Function2 function28, int i, int i2, Composer composer, int i3) {
        CommonDecorationBox(textFieldType, charSequence, function2, textFieldLabelPosition, function3, function22, function23, function24, function25, function26, function27, z, z2, z3, interactionSource, paddingValues, textFieldColors, function28, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecoratedLabel$lambda$5(State state, TextFieldColors textFieldColors, boolean z, boolean z2, boolean z3, boolean z4, Transition transition, TextStyle textStyle, TextStyle textStyle2, Function3 function3, int i, Composer composer, int i2) {
        DecoratedLabel(state, textFieldColors, z, z2, z3, z4, transition, textStyle, textStyle2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_3J_VO9M$lambda$0(long j, TextStyle textStyle, Function2 function2, int i, Composer composer, int i2) {
        m4910Decoration3JVO9M(j, textStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_Iv8Zu3U$lambda$0(long j, Function2 function2, int i, Composer composer, int i2) {
        m4911DecorationIv8Zu3U(j, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CommonDecorationBox(final TextFieldType textFieldType, final CharSequence charSequence, final Function2<? super Composer, ? super Integer, Unit> function2, final TextFieldLabelPosition textFieldLabelPosition, final Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Function2<? super Composer, ? super Integer, Unit> function26, final Function2<? super Composer, ? super Integer, Unit> function27, final boolean z, final boolean z2, final boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final TextFieldColors textFieldColors, final Function2<? super Composer, ? super Integer, Unit> function28, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Composer composer2;
        final State<Float> state;
        State<Float> state2;
        boolean z4;
        final State<Float> affixOpacity;
        int i6;
        Composer composer3;
        final boolean z5;
        State<Float> state3;
        boolean z6;
        final TextFieldColors textFieldColors2;
        State<Float> state4;
        boolean z7;
        boolean z8;
        final TextStyle textStyle;
        ComposableLambda composableLambda;
        final State<Float> state5;
        ComposableLambda composableLambda2;
        ComposableLambda composableLambda3;
        ComposableLambda composableLambda4;
        ComposableLambda composableLambda5;
        ComposableLambda rememberComposableLambda;
        ComposableLambda composableLambda6;
        ComposableLambda composableLambda7;
        ComposableLambda composableLambda8;
        ComposableLambda rememberComposableLambda2;
        ComposableLambda composableLambda9;
        Composer startRestartGroup = composer.startRestartGroup(546805032);
        ComposerKt.sourceInformation(startRestartGroup, "C(CommonDecorationBox)N(type,visualText,innerTextField,labelPosition,label,placeholder,leadingIcon,trailingIcon,prefix,suffix,supportingText,singleLine,enabled,isError,interactionSource,contentPadding,colors,container)95@3914L25,103@4183L10,110@4517L59,156@6024L108,173@6696L102,211@8252L30,212@8318L33,213@8381L27:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i4 = i3 | (startRestartGroup.changedInstance(charSequence) ? 32 : 16);
        } else {
            i4 = i3;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(textFieldLabelPosition) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function25) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(function26) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i7 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changedInstance(function27) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(interactionSource) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= startRestartGroup.changed(textFieldColors) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
        }
        int i8 = i5;
        if (startRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (4793491 & i8) == 4793490) ? false : true, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(546805032, i7, i8, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:94)");
            }
            boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i8 >> 12) & 14).getValue().booleanValue();
            InputPhase inputPhase = booleanValue ? InputPhase.Focused : charSequence.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            final TextStyle bodyLarge = typography.getBodyLarge();
            final TextStyle bodySmall = typography.getBodySmall();
            final boolean z9 = (Color.m6787equalsimpl0(bodyLarge.m9171getColor0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU()) && !Color.m6787equalsimpl0(bodySmall.m9171getColor0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU())) || (!Color.m6787equalsimpl0(bodyLarge.m9171getColor0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU()) && Color.m6787equalsimpl0(bodySmall.m9171getColor0d7_KjU(), Color.INSTANCE.m6822getUnspecified0d7_KjU()));
            final Transition updateTransition = TransitionKt.updateTransition(inputPhase, "TextFieldInputState", startRestartGroup, 48, 0);
            boolean z10 = function3 != null && getShowExpandedLabel(textFieldLabelPosition);
            if (function3 != null) {
                startRestartGroup.startReplaceGroup(-940723593);
                ComposerKt.sourceInformation(startRestartGroup, "116@4732L32");
                state = labelProgress(updateTransition, z10, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-940652386);
                startRestartGroup.endReplaceGroup();
                state = null;
            }
            if (function22 != null) {
                startRestartGroup.startReplaceGroup(-940561742);
                ComposerKt.sourceInformation(startRestartGroup, "123@4895L37");
                state2 = placeholderOpacity(updateTransition, z10, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-940485730);
                startRestartGroup.endReplaceGroup();
                state2 = null;
            }
            if (function25 == null && function26 == null) {
                startRestartGroup.startReplaceGroup(-940318082);
                startRestartGroup.endReplaceGroup();
                affixOpacity = null;
                z4 = false;
            } else {
                startRestartGroup.startReplaceGroup(-940388328);
                ComposerKt.sourceInformation(startRestartGroup, "130@5070L31");
                z4 = false;
                affixOpacity = affixOpacity(updateTransition, z10, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (function3 == null) {
                startRestartGroup.startReplaceGroup(-940231841);
                startRestartGroup.endReplaceGroup();
                i6 = i7;
                z6 = z4;
                state4 = state;
                composer3 = startRestartGroup;
                z7 = z2;
                z8 = z3;
                z5 = booleanValue;
                textStyle = bodyLarge;
                state3 = state2;
                composableLambda = null;
                textFieldColors2 = textFieldColors;
            } else {
                startRestartGroup.startReplaceGroup(-940231840);
                ComposerKt.sourceInformation(startRestartGroup, "*137@5226L521");
                i6 = i7;
                composer3 = startRestartGroup;
                z5 = booleanValue;
                state3 = state2;
                z6 = false;
                textFieldColors2 = textFieldColors;
                Function2 function29 = new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CommonDecorationBox$lambda$0$0;
                        CommonDecorationBox$lambda$0$0 = TextFieldImplKt.CommonDecorationBox$lambda$0$0(State.this, textFieldColors2, z2, z3, z5, z9, updateTransition, bodySmall, bodyLarge, function3, (Composer) obj, ((Integer) obj2).intValue());
                        return CommonDecorationBox$lambda$0$0;
                    }
                };
                state4 = state;
                z7 = z2;
                z8 = z3;
                textStyle = bodyLarge;
                ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1632654811, true, function29, composer3, 54);
                composer3.endReplaceGroup();
                composableLambda = rememberComposableLambda3;
            }
            final long m4238placeholderColorXeAY9LY = textFieldColors2.m4238placeholderColorXeAY9LY(z7, z8, z5);
            ComposableLambda composableLambda10 = composableLambda;
            ComposerKt.sourceInformationMarkerStart(composer3, 1493716916, "CC(remember):TextFieldImpl.kt#9igjgp");
            Object rememberedValue = composer3.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                state5 = state3;
                rememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean CommonDecorationBox$lambda$1$0;
                        CommonDecorationBox$lambda$1$0 = TextFieldImplKt.CommonDecorationBox$lambda$1$0(State.this);
                        return Boolean.valueOf(CommonDecorationBox$lambda$1$0);
                    }
                });
                composer3.updateRememberedValue(rememberedValue);
            } else {
                state5 = state3;
            }
            State state6 = (State) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (function22 != null && charSequence.length() == 0 && CommonDecorationBox$lambda$2(state6)) {
                composer3.startReplaceGroup(-939160356);
                ComposerKt.sourceInformation(composer3, "161@6301L282");
                composableLambda2 = ComposableLambdaKt.rememberComposableLambda(-720601610, true, new Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit CommonDecorationBox$lambda$3;
                        CommonDecorationBox$lambda$3 = TextFieldImplKt.CommonDecorationBox$lambda$3(m4238placeholderColorXeAY9LY, textStyle, function22, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return CommonDecorationBox$lambda$3;
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-938848683);
                composer3.endReplaceGroup();
                composableLambda2 = null;
            }
            final long m4239prefixColorXeAY9LY = textFieldColors2.m4239prefixColorXeAY9LY(z7, z8, z5);
            ComposerKt.sourceInformationMarkerStart(composer3, 1493738414, "CC(remember):TextFieldImpl.kt#9igjgp");
            Object rememberedValue2 = composer3.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean CommonDecorationBox$lambda$4$0;
                        CommonDecorationBox$lambda$4$0 = TextFieldImplKt.CommonDecorationBox$lambda$4$0(State.this);
                        return Boolean.valueOf(CommonDecorationBox$lambda$4$0);
                    }
                });
                composer3.updateRememberedValue(rememberedValue2);
            }
            State state7 = (State) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (function25 == null || !CommonDecorationBox$lambda$5(state7)) {
                composableLambda3 = composableLambda2;
                composer3.startReplaceGroup(-938405259);
                composer3.endReplaceGroup();
                composableLambda4 = null;
            } else {
                composer3.startReplaceGroup(-938552601);
                ComposerKt.sourceInformation(composer3, "178@6919L111");
                composableLambda3 = composableLambda2;
                ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-1271185508, true, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CommonDecorationBox$lambda$6;
                        CommonDecorationBox$lambda$6 = TextFieldImplKt.CommonDecorationBox$lambda$6(m4239prefixColorXeAY9LY, textStyle, function25, (Composer) obj, ((Integer) obj2).intValue());
                        return CommonDecorationBox$lambda$6;
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
                composableLambda4 = rememberComposableLambda4;
            }
            final long m4240suffixColorXeAY9LY = textFieldColors2.m4240suffixColorXeAY9LY(z7, z8, z5);
            if (function26 == null || !CommonDecorationBox$lambda$5(state7)) {
                composer3.startReplaceGroup(-938084843);
                composer3.endReplaceGroup();
                composableLambda5 = null;
            } else {
                composer3.startReplaceGroup(-938232185);
                ComposerKt.sourceInformation(composer3, "186@7242L111");
                ComposableLambda rememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(123777469, true, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CommonDecorationBox$lambda$7;
                        CommonDecorationBox$lambda$7 = TextFieldImplKt.CommonDecorationBox$lambda$7(m4240suffixColorXeAY9LY, textStyle, function26, (Composer) obj, ((Integer) obj2).intValue());
                        return CommonDecorationBox$lambda$7;
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
                composableLambda5 = rememberComposableLambda5;
            }
            final long m4237leadingIconColorXeAY9LY = textFieldColors2.m4237leadingIconColorXeAY9LY(z7, z8, z5);
            if (function23 == null) {
                composer3.startReplaceGroup(-937922124);
                composer3.endReplaceGroup();
                rememberComposableLambda = null;
            } else {
                composer3.startReplaceGroup(-937922123);
                ComposerKt.sourceInformation(composer3, "*194@7560L61");
                rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-906968406, true, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CommonDecorationBox$lambda$8$0;
                        CommonDecorationBox$lambda$8$0 = TextFieldImplKt.CommonDecorationBox$lambda$8$0(m4237leadingIconColorXeAY9LY, function23, (Composer) obj, ((Integer) obj2).intValue());
                        return CommonDecorationBox$lambda$8$0;
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
            }
            final long m4243trailingIconColorXeAY9LY = textFieldColors2.m4243trailingIconColorXeAY9LY(z7, z8, z5);
            if (function24 == null) {
                composer3.startReplaceGroup(-937662189);
                composer3.endReplaceGroup();
                composableLambda6 = rememberComposableLambda;
                composableLambda7 = null;
            } else {
                composer3.startReplaceGroup(-937662188);
                ComposerKt.sourceInformation(composer3, "*200@7822L62");
                composableLambda6 = rememberComposableLambda;
                ComposableLambda rememberComposableLambda6 = ComposableLambdaKt.rememberComposableLambda(-1287792574, true, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CommonDecorationBox$lambda$9$0;
                        CommonDecorationBox$lambda$9$0 = TextFieldImplKt.CommonDecorationBox$lambda$9$0(m4243trailingIconColorXeAY9LY, function24, (Composer) obj, ((Integer) obj2).intValue());
                        return CommonDecorationBox$lambda$9$0;
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
                composableLambda7 = rememberComposableLambda6;
            }
            final long m4241supportingTextColorXeAY9LY = textFieldColors2.m4241supportingTextColorXeAY9LY(z7, z8, z5);
            if (function27 == null) {
                composer3.startReplaceGroup(-937391714);
                composer3.endReplaceGroup();
                composableLambda8 = composableLambda7;
                rememberComposableLambda2 = null;
            } else {
                composer3.startReplaceGroup(-937391713);
                ComposerKt.sourceInformation(composer3, "*206@8093L115");
                composableLambda8 = composableLambda7;
                rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1612592437, true, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CommonDecorationBox$lambda$10$0;
                        CommonDecorationBox$lambda$10$0 = TextFieldImplKt.CommonDecorationBox$lambda$10$0(m4241supportingTextColorXeAY9LY, bodySmall, function27, (Composer) obj, ((Integer) obj2).intValue());
                        return CommonDecorationBox$lambda$10$0;
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(composer3, 1493788134, "CC(remember):TextFieldImpl.kt#9igjgp");
            final State<Float> state8 = state4;
            boolean changed = composer3.changed(state8);
            Object rememberedValue3 = composer3.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float CommonDecorationBox$lambda$11$0;
                        CommonDecorationBox$lambda$11$0 = TextFieldImplKt.CommonDecorationBox$lambda$11$0(State.this);
                        return Float.valueOf(CommonDecorationBox$lambda$11$0);
                    }
                };
                composer3.updateRememberedValue(rememberedValue3);
            }
            final Function0 function0 = (Function0) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerStart(composer3, 1493790249, "CC(remember):TextFieldImpl.kt#9igjgp");
            boolean changed2 = composer3.changed(state5);
            Object rememberedValue4 = composer3.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float CommonDecorationBox$lambda$12$0;
                        CommonDecorationBox$lambda$12$0 = TextFieldImplKt.CommonDecorationBox$lambda$12$0(State.this);
                        return Float.valueOf(CommonDecorationBox$lambda$12$0);
                    }
                };
                composer3.updateRememberedValue(rememberedValue4);
            }
            Function0 function02 = (Function0) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerStart(composer3, 1493792259, "CC(remember):TextFieldImpl.kt#9igjgp");
            boolean changed3 = composer3.changed(affixOpacity);
            Object rememberedValue5 = composer3.rememberedValue();
            if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float CommonDecorationBox$lambda$13$0;
                        CommonDecorationBox$lambda$13$0 = TextFieldImplKt.CommonDecorationBox$lambda$13$0(State.this);
                        return Float.valueOf(CommonDecorationBox$lambda$13$0);
                    }
                };
                composer3.updateRememberedValue(rememberedValue5);
            }
            Function0 function03 = (Function0) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            int i9 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
            if (i9 == 1) {
                int i10 = i6;
                composer3.startReplaceGroup(-936973554);
                ComposerKt.sourceInformation(composer3, "216@8519L115,220@8648L773");
                Composer composer4 = composer3;
                TextFieldKt.TextFieldLayout(Modifier.INSTANCE, function2, composableLambda10, composableLambda3, composableLambda6, composableLambda8, composableLambda4, composableLambda5, z, textFieldLabelPosition, new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(function0), new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(function02), new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(function03), ComposableLambdaKt.rememberComposableLambda(-358432442, true, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CommonDecorationBox$lambda$14;
                        CommonDecorationBox$lambda$14 = TextFieldImplKt.CommonDecorationBox$lambda$14(Function2.this, (Composer) obj, ((Integer) obj2).intValue());
                        return CommonDecorationBox$lambda$14;
                    }
                }, composer3, 54), rememberComposableLambda2, paddingValues, composer4, ((i10 >> 3) & 112) | 6 | ((i8 << 21) & 234881024) | ((i10 << 18) & 1879048192), (i8 & 458752) | 3072);
                composer2 = composer4;
                composer2.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else {
                if (i9 != 2) {
                    composer3.startReplaceGroup(1493796415);
                    composer3.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer3.startReplaceGroup(-935939642);
                ComposerKt.sourceInformation(composer3, "241@9528L38,242@9631L469,267@10611L619,256@10114L1442");
                ComposerKt.sourceInformationMarkerStart(composer3, 1493828974, "CC(remember):TextFieldImpl.kt#9igjgp");
                Object rememberedValue6 = composer3.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    composableLambda9 = rememberComposableLambda2;
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m6576boximpl(Size.INSTANCE.m6597getZeroNHjbRc()), null, 2, null);
                    composer3.updateRememberedValue(rememberedValue6);
                } else {
                    composableLambda9 = rememberComposableLambda2;
                }
                final MutableState mutableState = (MutableState) rememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposableLambda composableLambda11 = composableLambda4;
                ComposableLambda composableLambda12 = composableLambda5;
                ComposableLambda rememberComposableLambda7 = ComposableLambdaKt.rememberComposableLambda(-403938615, true, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CommonDecorationBox$lambda$16;
                        CommonDecorationBox$lambda$16 = TextFieldImplKt.CommonDecorationBox$lambda$16(MutableState.this, textFieldLabelPosition, paddingValues, function28, (Composer) obj, ((Integer) obj2).intValue());
                        return CommonDecorationBox$lambda$16;
                    }
                }, composer3, 54);
                Modifier.Companion companion = Modifier.INSTANCE;
                TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(function0);
                TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(function02);
                TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$03 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(function03);
                Modifier.Companion companion2 = companion;
                ComposerKt.sourceInformationMarkerStart(composer3, 1493864211, "CC(remember):TextFieldImpl.kt#9igjgp");
                int i11 = i6;
                boolean changed4 = ((i11 & 7168) == 2048 ? true : z6) | composer3.changed(function0);
                Object rememberedValue7 = composer3.rememberedValue();
                if (changed4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit CommonDecorationBox$lambda$17$0;
                            CommonDecorationBox$lambda$17$0 = TextFieldImplKt.CommonDecorationBox$lambda$17$0(TextFieldLabelPosition.this, function0, mutableState, (Size) obj);
                            return CommonDecorationBox$lambda$17$0;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue7);
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                Composer composer5 = composer3;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(companion2, function2, composableLambda3, composableLambda10, composableLambda6, composableLambda8, composableLambda11, composableLambda12, z, textFieldLabelPosition, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$03, (Function1) rememberedValue7, rememberComposableLambda7, composableLambda9, paddingValues, composer5, ((i11 >> 3) & 112) | 6 | ((i8 << 21) & 234881024) | ((i11 << 18) & 1879048192), (3670016 & (i8 << 3)) | 24576);
                composer2 = composer5;
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CommonDecorationBox$lambda$18;
                    CommonDecorationBox$lambda$18 = TextFieldImplKt.CommonDecorationBox$lambda$18(TextFieldType.this, charSequence, function2, textFieldLabelPosition, function3, function22, function23, function24, function25, function26, function27, z, z2, z3, interactionSource, paddingValues, textFieldColors, function28, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CommonDecorationBox$lambda$18;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$0$0(State state, TextFieldColors textFieldColors, boolean z, boolean z2, boolean z3, boolean z4, Transition transition, TextStyle textStyle, TextStyle textStyle2, Function3 function3, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C138@5244L489:TextFieldImpl.kt#mqatfk");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1632654811, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:138)");
            }
            DecoratedLabel(state, textFieldColors, z, z2, z3, z4, transition, textStyle, textStyle2, function3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonDecorationBox$lambda$1$0(State state) {
        return (state != null ? ((Number) state.getValue()).floatValue() : 0.0f) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$3(long j, TextStyle textStyle, Function2 function2, Modifier modifier, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "CN(modifier)162@6331L238:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i |= composer.changed(modifier) ? 4 : 2;
        }
        if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-720601610, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:162)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1119186161, "C163@6367L184:TextFieldImpl.kt#mqatfk");
            m4910Decoration3JVO9M(j, textStyle, function2, composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonDecorationBox$lambda$4$0(State state) {
        return (state != null ? ((Number) state.getValue()).floatValue() : 0.0f) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$6(long j, TextStyle textStyle, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C179@6937L79:TextFieldImpl.kt#mqatfk");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271185508, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:179)");
            }
            m4910Decoration3JVO9M(j, textStyle, function2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$7(long j, TextStyle textStyle, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C187@7260L79:TextFieldImpl.kt#mqatfk");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(123777469, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:187)");
            }
            m4910Decoration3JVO9M(j, textStyle, function2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$8$0(long j, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C194@7562L57:TextFieldImpl.kt#mqatfk");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-906968406, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:194)");
            }
            m4911DecorationIv8Zu3U(j, function2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$9$0(long j, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C200@7824L58:TextFieldImpl.kt#mqatfk");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1287792574, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:200)");
            }
            m4911DecorationIv8Zu3U(j, function2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$10$0(long j, TextStyle textStyle, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C207@8111L83:TextFieldImpl.kt#mqatfk");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1612592437, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:207)");
            }
            m4910Decoration3JVO9M(j, textStyle, function2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CommonDecorationBox$lambda$11$0(State state) {
        if (state != null) {
            return ((Number) state.getValue()).floatValue();
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CommonDecorationBox$lambda$12$0(State state) {
        if (state != null) {
            return ((Number) state.getValue()).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CommonDecorationBox$lambda$13$0(State state) {
        if (state != null) {
            return ((Number) state.getValue()).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$14(Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C217@8537L83:TextFieldImpl.kt#mqatfk");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-358432442, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:217)");
            }
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, ContainerId);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, layoutId);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1188034280, "C217@8607L11:TextFieldImpl.kt#mqatfk");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$16(final MutableState mutableState, TextFieldLabelPosition textFieldLabelPosition, PaddingValues paddingValues, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C243@9649L437:TextFieldImpl.kt#mqatfk");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-403938615, i, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:243)");
            }
            Modifier outlineCutout = OutlinedTextFieldKt.outlineCutout(LayoutIdKt.layoutId(Modifier.INSTANCE, ContainerId), new MutablePropertyReference0Impl(mutableState) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$borderContainerWithId$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((MutableState) this.receiver).getValue();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(Object obj) {
                    ((MutableState) this.receiver).setValue(obj);
                }
            }, getMinimizedAlignment(textFieldLabelPosition), paddingValues);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, outlineCutout);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 843988021, "C252@10057L11:TextFieldImpl.kt#mqatfk");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$17$0(TextFieldLabelPosition textFieldLabelPosition, Function0 function0, MutableState mutableState, Size size) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return Unit.INSTANCE;
        }
        float floatValue = ((Number) function0.invoke()).floatValue();
        float intBitsToFloat = Float.intBitsToFloat((int) (size.m6593unboximpl() >> 32)) * floatValue;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (size.m6593unboximpl() & 4294967295L)) * floatValue;
        if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m6593unboximpl() >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m6593unboximpl() & 4294967295L)) != intBitsToFloat2) {
            mutableState.setValue(Size.m6576boximpl(Size.m6579constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L))));
        }
        return Unit.INSTANCE;
    }

    private static final void DecoratedLabel(final State<Float> state, final TextFieldColors textFieldColors, final boolean z, final boolean z2, final boolean z3, final boolean z4, Transition<InputPhase> transition, final TextStyle textStyle, final TextStyle textStyle2, final Function3<? super TextFieldLabelScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Transition<InputPhase> transition2;
        int i3;
        long j;
        State<Color> state2;
        Composer startRestartGroup = composer.startRestartGroup(376119213);
        ComposerKt.sourceInformation(startRestartGroup, "C(DecoratedLabel)N(labelProgress,colors,enabled,isError,isFocused,overrideLabelTextStyleColor,transition,bodySmall,bodyLarge,content)305@11965L171,328@12842L29,337@13221L24,337@13169L76:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textFieldColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(transition) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(textStyle2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (!startRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            transition2 = transition;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(376119213, i2, -1, "androidx.compose.material3.internal.DecoratedLabel (TextFieldImpl.kt:304)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 673322808, "CC(remember):TextFieldImpl.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TextFieldLabelScope() { // from class: androidx.compose.material3.internal.TextFieldImplKt$DecoratedLabel$labelScope$1$1
                    @Override // androidx.compose.material3.TextFieldLabelScope
                    public float getLabelMinimizedProgress() {
                        State<Float> state3 = state;
                        if (state3 != null) {
                            return state3.getValue().floatValue();
                        }
                        return 1.0f;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final TextFieldImplKt$DecoratedLabel$labelScope$1$1 textFieldImplKt$DecoratedLabel$labelScope$1$1 = (TextFieldImplKt$DecoratedLabel$labelScope$1$1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long m4236labelColorXeAY9LY = textFieldColors.m4236labelColorXeAY9LY(z, z2, z3);
            if (z4) {
                startRestartGroup.startReplaceGroup(-601510006);
                ComposerKt.sourceInformation(startRestartGroup, "315@12302L456");
                long m9171getColor0d7_KjU = textStyle.m9171getColor0d7_KjU();
                if (z4 && m9171getColor0d7_KjU == 16) {
                    m9171getColor0d7_KjU = m4236labelColorXeAY9LY;
                }
                long m9171getColor0d7_KjU2 = textStyle2.m9171getColor0d7_KjU();
                if (z4 && m9171getColor0d7_KjU2 == 16) {
                    m9171getColor0d7_KjU2 = m4236labelColorXeAY9LY;
                }
                j = m4236labelColorXeAY9LY;
                i3 = i2;
                state2 = m4913labelTextStyleColor1wkBAMs(transition, m9171getColor0d7_KjU, m9171getColor0d7_KjU2, startRestartGroup, (i2 >> 18) & 14);
                transition2 = transition;
                startRestartGroup = startRestartGroup;
                startRestartGroup.endReplaceGroup();
            } else {
                i3 = i2;
                j = m4236labelColorXeAY9LY;
                transition2 = transition;
                startRestartGroup.startReplaceGroup(-601031335);
                startRestartGroup.endReplaceGroup();
                state2 = null;
            }
            State<Color> m4912labelContentColorRPmYEkk = m4912labelContentColorRPmYEkk(transition2, j, startRestartGroup, (i3 >> 18) & 14);
            TextStyle lerp = TextStyleKt.lerp(textStyle2, textStyle, state != null ? state.getValue().floatValue() : 1.0f);
            if (z4) {
                Intrinsics.checkNotNull(state2);
                lerp = TextStyle.m9154copyp1EtxEg$default(lerp, state2.getValue().m6796unboximpl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            }
            m4910Decoration3JVO9M(m4912labelContentColorRPmYEkk.getValue().m6796unboximpl(), lerp, ComposableLambdaKt.rememberComposableLambda(57043598, true, new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DecoratedLabel$lambda$4;
                    DecoratedLabel$lambda$4 = TextFieldImplKt.DecoratedLabel$lambda$4(Function3.this, textFieldImplKt$DecoratedLabel$labelScope$1$1, (Composer) obj, ((Integer) obj2).intValue());
                    return DecoratedLabel$lambda$4;
                }
            }, startRestartGroup, 54), startRestartGroup, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Transition<InputPhase> transition3 = transition2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DecoratedLabel$lambda$5;
                    DecoratedLabel$lambda$5 = TextFieldImplKt.DecoratedLabel$lambda$5(State.this, textFieldColors, z, z2, z3, z4, transition3, textStyle, textStyle2, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DecoratedLabel$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecoratedLabel$lambda$4(Function3 function3, TextFieldImplKt$DecoratedLabel$labelScope$1$1 textFieldImplKt$DecoratedLabel$labelScope$1$1, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C337@13234L9:TextFieldImpl.kt#mqatfk");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(57043598, i, -1, "androidx.compose.material3.internal.DecoratedLabel.<anonymous> (TextFieldImpl.kt:337)");
            }
            function3.invoke(textFieldImplKt$DecoratedLabel$labelScope$1$1, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final boolean getShowExpandedLabel(TextFieldLabelPosition textFieldLabelPosition) {
        return (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) && !((TextFieldLabelPosition.Attached) textFieldLabelPosition).getAlwaysMinimize();
    }

    public static final Alignment.Horizontal getMinimizedAlignment(TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return ((TextFieldLabelPosition.Above) textFieldLabelPosition).getAlignment();
        }
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).getMinimizedAlignment();
        }
        throw new IllegalArgumentException("Unknown position: " + textFieldLabelPosition);
    }

    public static final Alignment.Horizontal getExpandedAlignment(TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return ((TextFieldLabelPosition.Above) textFieldLabelPosition).getAlignment();
        }
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).getExpandedAlignment();
        }
        throw new IllegalArgumentException("Unknown position: " + textFieldLabelPosition);
    }

    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    private static final void m4910Decoration3JVO9M(long j, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final TextStyle textStyle2;
        final long j2;
        Composer startRestartGroup = composer.startRestartGroup(396611577);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)N(contentColor:c#ui.graphics.Color,textStyle,content)362@14214L62:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(396611577, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:362)");
            }
            ProvideContentColorTextStyleKt.m4806ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, startRestartGroup, i2 & 1022);
            j2 = j;
            textStyle2 = textStyle;
            function22 = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function22 = function2;
            textStyle2 = textStyle;
            j2 = j;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Decoration_3J_VO9M$lambda$0;
                    Decoration_3J_VO9M$lambda$0 = TextFieldImplKt.Decoration_3J_VO9M$lambda$0(j2, textStyle2, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Decoration_3J_VO9M$lambda$0;
                }
            });
        }
    }

    /* renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    private static final void m4911DecorationIv8Zu3U(final long j, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(590397809);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)N(contentColor:c#ui.graphics.Color,content)367@14421L84:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590397809, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:367)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6776boximpl(j)), function2, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Decoration_Iv8Zu3U$lambda$0;
                    Decoration_Iv8Zu3U$lambda$0 = TextFieldImplKt.Decoration_Iv8Zu3U$lambda$0(j, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Decoration_Iv8Zu3U$lambda$0;
                }
            });
        }
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit defaultErrorSemantics$lambda$0;
                defaultErrorSemantics$lambda$0 = TextFieldImplKt.defaultErrorSemantics$lambda$0(str, (SemanticsPropertyReceiver) obj);
                return defaultErrorSemantics$lambda$0;
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit defaultErrorSemantics$lambda$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    public static final Modifier textFieldBackground(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawResult textFieldBackground$lambda$0;
                textFieldBackground$lambda$0 = TextFieldImplKt.textFieldBackground$lambda$0(Shape.this, colorProducer, (CacheDrawScope) obj);
                return textFieldBackground$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult textFieldBackground$lambda$0(Shape shape, final ColorProducer colorProducer, CacheDrawScope cacheDrawScope) {
        final Outline mo422createOutlinePq9zytI = shape.mo422createOutlinePq9zytI(cacheDrawScope.m6299getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        return cacheDrawScope.onDrawBehind(new Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit textFieldBackground$lambda$0$0;
                textFieldBackground$lambda$0$0 = TextFieldImplKt.textFieldBackground$lambda$0$0(Outline.this, colorProducer, (DrawScope) obj);
                return textFieldBackground$lambda$0$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit textFieldBackground$lambda$0$0(Outline outline, ColorProducer colorProducer, DrawScope drawScope) {
        OutlineKt.m7070drawOutlinewDX37Ww$default(drawScope, outline, colorProducer.mo3041invoke0d7_KjU(), 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }

    public static final Modifier textFieldLabelMinHeight(Modifier modifier, final Function0<Dp> function0) {
        return LayoutModifierKt.layout(modifier, new Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult textFieldLabelMinHeight$lambda$0;
                textFieldLabelMinHeight$lambda$0 = TextFieldImplKt.textFieldLabelMinHeight$lambda$0(Function0.this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return textFieldLabelMinHeight$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult textFieldLabelMinHeight$lambda$0(Function0 function0, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        float m9746unboximpl = ((Dp) function0.invoke()).m9746unboximpl();
        final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(constraints.getValue(), 0, 0, ConstraintsKt.m9691constrainHeightK40F9xA(constraints.getValue(), !Dp.m9737equalsimpl0(m9746unboximpl, Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM()) ? measureScope.mo522roundToPx0680j_4(m9746unboximpl) : 0), 0, 11, null));
        return MeasureScope.CC.layout$default(measureScope, mo8285measureBRTryo0.getWidth(), mo8285measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit textFieldLabelMinHeight$lambda$0$0;
                textFieldLabelMinHeight$lambda$0$0 = TextFieldImplKt.textFieldLabelMinHeight$lambda$0$0(Placeable.this, (Placeable.PlacementScope) obj);
                return textFieldLabelMinHeight$lambda$0$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit textFieldLabelMinHeight$lambda$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final State<Float> labelProgress(final Transition<InputPhase> transition, boolean z, Composer composer, int i) {
        Object currentState;
        float f;
        boolean z2;
        Object rememberedValue;
        int i2;
        boolean z3;
        Object rememberedValue2;
        ComposerKt.sourceInformationMarkerStart(composer, 927190202, "C(labelProgress)N(showExpandedLabel)403@16059L14,404@16085L276:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(927190202, i, -1, "androidx.compose.material3.internal.labelProgress (TextFieldImpl.kt:402)");
        }
        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6);
        Function3 function3 = new Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                FiniteAnimationSpec labelProgress$lambda$0;
                labelProgress$lambda$0 = TextFieldImplKt.labelProgress$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return labelProgress$lambda$0;
            }
        };
        ComposerKt.sourceInformationMarkerStart(composer, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i3 = (((i & 14) | 384) & 14) | 3072;
        ComposerKt.sourceInformationMarkerStart(composer, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            ComposerKt.sourceInformation(composer, "1864@79141L67");
            ComposerKt.sourceInformationMarkerStart(composer, -1054612652, "CC(remember):Transition.kt#9igjgp");
            boolean z4 = (((i3 & 14) ^ 6) > 4 && composer.changed(transition)) || (i3 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z4 || currentState == Composer.INSTANCE.getEmpty()) {
                Snapshot.Companion companion = Snapshot.INSTANCE;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    InputPhase currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        InputPhase inputPhase = (InputPhase) currentState;
        composer.startReplaceGroup(1071902915);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1071902915, 0, -1, "androidx.compose.material3.internal.labelProgress.<anonymous> (TextFieldImpl.kt:405)");
        }
        int i4 = WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()];
        float f2 = 1.0f;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z) {
                f = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf = Float.valueOf(f);
                ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
                int i5 = i3 & 14;
                int i6 = i5 ^ 6;
                z2 = (i6 <= 4 && composer.changed(transition)) || (i3 & 6) == 4;
                rememberedValue = composer.rememberedValue();
                if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelProgress$$inlined$animateFloat$1
                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final InputPhase invoke() {
                            return Transition.this.getTargetState();
                        }
                    });
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                InputPhase inputPhase2 = (InputPhase) ((State) rememberedValue).getValue();
                composer.startReplaceGroup(1071902915);
                ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1071902915, 0, -1, "androidx.compose.material3.internal.labelProgress.<anonymous> (TextFieldImpl.kt:405)");
                }
                i2 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z) {
                        f2 = 0.0f;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf2 = Float.valueOf(f2);
                ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
                z3 = (i6 <= 4 && composer.changed(transition)) || (i3 & 6) == 4;
                rememberedValue2 = composer.rememberedValue();
                if (!z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelProgress$$inlined$animateFloat$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Transition.Segment<InputPhase> invoke() {
                            return Transition.this.getSegment();
                        }
                    });
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                State<Float> createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, valueOf, valueOf2, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), composer, 0), vectorConverter, "LabelProgress", composer, i5 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                return createTransitionAnimation;
            }
        }
        f = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf3 = Float.valueOf(f);
        ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
        int i52 = i3 & 14;
        int i62 = i52 ^ 6;
        if (i62 <= 4) {
        }
        rememberedValue = composer.rememberedValue();
        if (!z2) {
        }
        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelProgress$$inlined$animateFloat$1
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final InputPhase invoke() {
                return Transition.this.getTargetState();
            }
        });
        composer.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(composer);
        InputPhase inputPhase22 = (InputPhase) ((State) rememberedValue).getValue();
        composer.startReplaceGroup(1071902915);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i2 = WhenMappings.$EnumSwitchMapping$1[inputPhase22.ordinal()];
        if (i2 != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf22 = Float.valueOf(f2);
        ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
        if (i62 <= 4) {
        }
        rememberedValue2 = composer.rememberedValue();
        if (!z3) {
        }
        rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelProgress$$inlined$animateFloat$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Transition.Segment<InputPhase> invoke() {
                return Transition.this.getSegment();
            }
        });
        composer.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        State<Float> createTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition, valueOf3, valueOf22, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), composer, 0), vectorConverter, "LabelProgress", composer, i52 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return createTransitionAnimation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec labelProgress$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(1806589607);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1806589607, i, -1, "androidx.compose.material3.internal.labelProgress.<anonymous> (TextFieldImpl.kt:404)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
    
        if (r22 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
    
        if (r22 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final State<Float> placeholderOpacity(final Transition<InputPhase> transition, boolean z, Composer composer, int i) {
        Object currentState;
        float f;
        int i2;
        boolean z2;
        Object rememberedValue;
        int i3;
        boolean z3;
        Object rememberedValue2;
        ComposerKt.sourceInformationMarkerStart(composer, -1386921849, "C(placeholderOpacity)N(showExpandedLabel)415@16545L14,416@16630L14,417@16656L750:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1386921849, i, -1, "androidx.compose.material3.internal.placeholderOpacity (TextFieldImpl.kt:414)");
        }
        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        final FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, composer, 6);
        Function3 function3 = new Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                FiniteAnimationSpec placeholderOpacity$lambda$0;
                placeholderOpacity$lambda$0 = TextFieldImplKt.placeholderOpacity$lambda$0(FiniteAnimationSpec.this, value2, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return placeholderOpacity$lambda$0;
            }
        };
        ComposerKt.sourceInformationMarkerStart(composer, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i4 = (((i & 14) | 384) & 14) | 3072;
        ComposerKt.sourceInformationMarkerStart(composer, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            ComposerKt.sourceInformation(composer, "1864@79141L67");
            ComposerKt.sourceInformationMarkerStart(composer, -1054612652, "CC(remember):Transition.kt#9igjgp");
            boolean z4 = (((i4 & 14) ^ 6) > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z4 || currentState == Composer.INSTANCE.getEmpty()) {
                Snapshot.Companion companion = Snapshot.INSTANCE;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    InputPhase currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        InputPhase inputPhase = (InputPhase) currentState;
        composer.startReplaceGroup(-2037958114);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2037958114, 0, -1, "androidx.compose.material3.internal.placeholderOpacity.<anonymous> (TextFieldImpl.kt:432)");
        }
        int i5 = WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()];
        float f2 = 0.0f;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            Float valueOf = Float.valueOf(f);
            ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
            int i6 = i4 & 14;
            i2 = i6 ^ 6;
            z2 = (i2 <= 4 && composer.changed(transition)) || (i4 & 6) == 4;
            rememberedValue = composer.rememberedValue();
            if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$placeholderOpacity$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final InputPhase invoke() {
                        return Transition.this.getTargetState();
                    }
                });
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            InputPhase inputPhase2 = (InputPhase) ((State) rememberedValue).getValue();
            composer.startReplaceGroup(-2037958114);
            ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2037958114, 0, -1, "androidx.compose.material3.internal.placeholderOpacity.<anonymous> (TextFieldImpl.kt:432)");
            }
            i3 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf2 = Float.valueOf(f2);
                ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
                z3 = (i2 <= 4 && composer.changed(transition)) || (i4 & 6) == 4;
                rememberedValue2 = composer.rememberedValue();
                if (!z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$placeholderOpacity$$inlined$animateFloat$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Transition.Segment<InputPhase> invoke() {
                            return Transition.this.getSegment();
                        }
                    });
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                State<Float> createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, valueOf, valueOf2, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), composer, 0), vectorConverter, "PlaceholderOpacity", composer, i6 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                return createTransitionAnimation;
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            Float valueOf22 = Float.valueOf(f2);
            ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
            if (i2 <= 4) {
            }
            rememberedValue2 = composer.rememberedValue();
            if (!z3) {
            }
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$placeholderOpacity$$inlined$animateFloat$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Transition.Segment<InputPhase> invoke() {
                    return Transition.this.getSegment();
                }
            });
            composer.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(composer);
            State<Float> createTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition, valueOf, valueOf22, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), composer, 0), vectorConverter, "PlaceholderOpacity", composer, i6 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return createTransitionAnimation2;
        }
        f = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf3 = Float.valueOf(f);
        ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
        int i62 = i4 & 14;
        i2 = i62 ^ 6;
        if (i2 <= 4) {
        }
        rememberedValue = composer.rememberedValue();
        if (!z2) {
        }
        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$placeholderOpacity$$inlined$animateFloat$1
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final InputPhase invoke() {
                return Transition.this.getTargetState();
            }
        });
        composer.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(composer);
        InputPhase inputPhase22 = (InputPhase) ((State) rememberedValue).getValue();
        composer.startReplaceGroup(-2037958114);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i3 = WhenMappings.$EnumSwitchMapping$1[inputPhase22.ordinal()];
        if (i3 != 1) {
        }
        f2 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf222 = Float.valueOf(f2);
        ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
        if (i2 <= 4) {
        }
        rememberedValue2 = composer.rememberedValue();
        if (!z3) {
        }
        rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$placeholderOpacity$$inlined$animateFloat$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Transition.Segment<InputPhase> invoke() {
                return Transition.this.getSegment();
            }
        });
        composer.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        State<Float> createTransitionAnimation22 = TransitionKt.createTransitionAnimation(transition, valueOf3, valueOf222, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), composer, 0), vectorConverter, "PlaceholderOpacity", composer, i62 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return createTransitionAnimation22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec placeholderOpacity$lambda$0(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-1370891590);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1370891590, i, -1, "androidx.compose.material3.internal.placeholderOpacity.<anonymous> (TextFieldImpl.kt:420)");
        }
        if (!segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty) && (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty))) {
            finiteAnimationSpec = finiteAnimationSpec2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final State<Float> affixOpacity(final Transition<InputPhase> transition, boolean z, Composer composer, int i) {
        Object currentState;
        float f;
        boolean z2;
        Object rememberedValue;
        int i2;
        boolean z3;
        Object rememberedValue2;
        ComposerKt.sourceInformationMarkerStart(composer, -1040715446, "C(affixOpacity)N(showExpandedLabel)442@17584L14,443@17610L311:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1040715446, i, -1, "androidx.compose.material3.internal.affixOpacity (TextFieldImpl.kt:441)");
        }
        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        Function3 function3 = new Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                FiniteAnimationSpec affixOpacity$lambda$0;
                affixOpacity$lambda$0 = TextFieldImplKt.affixOpacity$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return affixOpacity$lambda$0;
            }
        };
        ComposerKt.sourceInformationMarkerStart(composer, 844118987, "CC(animateFloat)N(transitionSpec,label,targetValueByState)1971@84243L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int i3 = (((i & 14) | 384) & 14) | 3072;
        ComposerKt.sourceInformationMarkerStart(composer, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            ComposerKt.sourceInformation(composer, "1864@79141L67");
            ComposerKt.sourceInformationMarkerStart(composer, -1054612652, "CC(remember):Transition.kt#9igjgp");
            boolean z4 = (((i3 & 14) ^ 6) > 4 && composer.changed(transition)) || (i3 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z4 || currentState == Composer.INSTANCE.getEmpty()) {
                Snapshot.Companion companion = Snapshot.INSTANCE;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    InputPhase currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        InputPhase inputPhase = (InputPhase) currentState;
        composer.startReplaceGroup(-2144425951);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2144425951, 0, -1, "androidx.compose.material3.internal.affixOpacity.<anonymous> (TextFieldImpl.kt:447)");
        }
        int i4 = WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()];
        float f2 = 1.0f;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (z) {
                f = 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf = Float.valueOf(f);
                ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
                int i5 = i3 & 14;
                int i6 = i5 ^ 6;
                z2 = (i6 <= 4 && composer.changed(transition)) || (i3 & 6) == 4;
                rememberedValue = composer.rememberedValue();
                if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$affixOpacity$$inlined$animateFloat$1
                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final InputPhase invoke() {
                            return Transition.this.getTargetState();
                        }
                    });
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                InputPhase inputPhase2 = (InputPhase) ((State) rememberedValue).getValue();
                composer.startReplaceGroup(-2144425951);
                ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2144425951, 0, -1, "androidx.compose.material3.internal.affixOpacity.<anonymous> (TextFieldImpl.kt:447)");
                }
                i2 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z) {
                        f2 = 0.0f;
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float valueOf2 = Float.valueOf(f2);
                ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
                z3 = (i6 <= 4 && composer.changed(transition)) || (i3 & 6) == 4;
                rememberedValue2 = composer.rememberedValue();
                if (!z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$affixOpacity$$inlined$animateFloat$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Transition.Segment<InputPhase> invoke() {
                            return Transition.this.getSegment();
                        }
                    });
                    composer.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                State<Float> createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, valueOf, valueOf2, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), composer, 0), vectorConverter, "PrefixSuffixOpacity", composer, i5 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                return createTransitionAnimation;
            }
        }
        f = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf3 = Float.valueOf(f);
        ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
        int i52 = i3 & 14;
        int i62 = i52 ^ 6;
        if (i62 <= 4) {
        }
        rememberedValue = composer.rememberedValue();
        if (!z2) {
        }
        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$affixOpacity$$inlined$animateFloat$1
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final InputPhase invoke() {
                return Transition.this.getTargetState();
            }
        });
        composer.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(composer);
        InputPhase inputPhase22 = (InputPhase) ((State) rememberedValue).getValue();
        composer.startReplaceGroup(-2144425951);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i2 = WhenMappings.$EnumSwitchMapping$1[inputPhase22.ordinal()];
        if (i2 != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float valueOf22 = Float.valueOf(f2);
        ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
        if (i62 <= 4) {
        }
        rememberedValue2 = composer.rememberedValue();
        if (!z3) {
        }
        rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$affixOpacity$$inlined$animateFloat$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Transition.Segment<InputPhase> invoke() {
                return Transition.this.getSegment();
            }
        });
        composer.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        State<Float> createTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition, valueOf3, valueOf22, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue2).getValue(), composer, 0), vectorConverter, "PrefixSuffixOpacity", composer, i52 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return createTransitionAnimation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec affixOpacity$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-735253059);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-735253059, i, -1, "androidx.compose.material3.internal.affixOpacity.<anonymous> (TextFieldImpl.kt:445)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* renamed from: labelTextStyleColor-1wkBAMs, reason: not valid java name */
    private static final State<Color> m4913labelTextStyleColor1wkBAMs(final Transition<InputPhase> transition, long j, long j2, Composer composer, int i) {
        Object currentState;
        ComposerKt.sourceInformationMarkerStart(composer, -182681442, "C(labelTextStyleColor)N(focusedLabelTextStyleColor:c#ui.graphics.Color,unfocusedLabelTextStyleColor:c#ui.graphics.Color)460@18155L14,461@18181L233:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-182681442, i, -1, "androidx.compose.material3.internal.labelTextStyleColor (TextFieldImpl.kt:459)");
        }
        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        Function3 function3 = new Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                FiniteAnimationSpec labelTextStyleColor_1wkBAMs$lambda$0;
                labelTextStyleColor_1wkBAMs$lambda$0 = TextFieldImplKt.labelTextStyleColor_1wkBAMs$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return labelTextStyleColor_1wkBAMs$lambda$0;
            }
        };
        int i2 = (i & 14) | 384;
        ComposerKt.sourceInformationMarkerStart(composer, -64433887, "CC(animateColor)N(transitionSpec,label,targetValueByState)67@3230L31,68@3297L58,70@3368L70:Transition.kt#xbi5r1");
        InputPhase targetState = transition.getTargetState();
        composer.startReplaceGroup(-759924327);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        long j3 = WhenMappings.$EnumSwitchMapping$1[targetState.ordinal()] == 1 ? j : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        ColorSpace m6790getColorSpaceimpl = Color.m6790getColorSpaceimpl(j3);
        ComposerKt.sourceInformationMarkerStart(composer, -1791411589, "CC(remember):Transition.kt#9igjgp");
        boolean changed = composer.changed(m6790getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6790getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i3 = (i2 & 14) | 3072;
        ComposerKt.sourceInformationMarkerStart(composer, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            ComposerKt.sourceInformation(composer, "1864@79141L67");
            ComposerKt.sourceInformationMarkerStart(composer, -1054612652, "CC(remember):Transition.kt#9igjgp");
            boolean z = (((i3 & 14) ^ 6) > 4 && composer.changed(transition)) || (i3 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.INSTANCE.getEmpty()) {
                Snapshot.Companion companion = Snapshot.INSTANCE;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    InputPhase currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        InputPhase inputPhase = (InputPhase) currentState;
        composer.startReplaceGroup(-759924327);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        long j4 = WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] == 1 ? j : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Color m6776boximpl = Color.m6776boximpl(j4);
        ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
        int i4 = i3 & 14;
        int i5 = i4 ^ 6;
        boolean z2 = (i5 > 4 && composer.changed(transition)) || (i3 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelTextStyleColor-1wkBAMs$$inlined$animateColor$1
                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final InputPhase invoke() {
                    return Transition.this.getTargetState();
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        InputPhase inputPhase2 = (InputPhase) ((State) rememberedValue2).getValue();
        composer.startReplaceGroup(-759924327);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        long j5 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()] == 1 ? j : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Color m6776boximpl2 = Color.m6776boximpl(j5);
        ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
        boolean z3 = (i5 > 4 && composer.changed(transition)) || (i3 & 6) == 4;
        Object rememberedValue3 = composer.rememberedValue();
        if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelTextStyleColor-1wkBAMs$$inlined$animateColor$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Transition.Segment<InputPhase> invoke() {
                    return Transition.this.getSegment();
                }
            });
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        State<Color> createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, m6776boximpl, m6776boximpl2, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue3).getValue(), composer, 0), twoWayConverter, "LabelTextStyleColor", composer, i4 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return createTransitionAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec labelTextStyleColor_1wkBAMs$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(1730286052);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1730286052, i, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:461)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* renamed from: labelContentColor-RPmYEkk, reason: not valid java name */
    private static final State<Color> m4912labelContentColorRPmYEkk(final Transition<InputPhase> transition, long j, Composer composer, int i) {
        Object currentState;
        ComposerKt.sourceInformationMarkerStart(composer, -1365844622, "C(labelContentColor)N(labelColor:c#ui.graphics.Color)471@18582L14,473@18662L151:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1365844622, i, -1, "androidx.compose.material3.internal.labelContentColor (TextFieldImpl.kt:470)");
        }
        final FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        Function3 function3 = new Function3() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                FiniteAnimationSpec labelContentColor_RPmYEkk$lambda$0;
                labelContentColor_RPmYEkk$lambda$0 = TextFieldImplKt.labelContentColor_RPmYEkk$lambda$0(FiniteAnimationSpec.this, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return labelContentColor_RPmYEkk$lambda$0;
            }
        };
        int i2 = (i & 14) | 384;
        ComposerKt.sourceInformationMarkerStart(composer, -64433887, "CC(animateColor)N(transitionSpec,label,targetValueByState)67@3230L31,68@3297L58,70@3368L70:Transition.kt#xbi5r1");
        transition.getTargetState();
        composer.startReplaceGroup(1139343725);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        ColorSpace m6790getColorSpaceimpl = Color.m6790getColorSpaceimpl(j);
        ComposerKt.sourceInformationMarkerStart(composer, -1791411589, "CC(remember):Transition.kt#9igjgp");
        boolean changed = composer.changed(m6790getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6790getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i3 = (i2 & 14) | 3072;
        ComposerKt.sourceInformationMarkerStart(composer, 1143035377, "CC(animateValue)N(typeConverter,transitionSpec,label,targetValueByState)1868@79284L32,1875@79757L49,1875@79738L75,1876@79853L45,1876@79838L67,1878@79918L89:Transition.kt#pdpnli");
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            ComposerKt.sourceInformation(composer, "1864@79141L67");
            ComposerKt.sourceInformationMarkerStart(composer, -1054612652, "CC(remember):Transition.kt#9igjgp");
            boolean z = (((i3 & 14) ^ 6) > 4 && composer.changed(transition)) || (i3 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.INSTANCE.getEmpty()) {
                Snapshot.Companion companion = Snapshot.INSTANCE;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    InputPhase currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        }
        composer.startReplaceGroup(1139343725);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Color m6776boximpl = Color.m6776boximpl(j);
        ComposerKt.sourceInformationMarkerStart(composer, -1054592958, "CC(remember):Transition.kt#9igjgp");
        int i4 = i3 & 14;
        int i5 = i4 ^ 6;
        boolean z2 = (i5 > 4 && composer.changed(transition)) || (i3 & 6) == 4;
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelContentColor-RPmYEkk$$inlined$animateColor$1
                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final InputPhase invoke() {
                    return Transition.this.getTargetState();
                }
            });
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.startReplaceGroup(1139343725);
        ComposerKt.sourceInformation(composer, "CN(it):TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Color m6776boximpl2 = Color.m6776boximpl(j);
        ComposerKt.sourceInformationMarkerStart(composer, -1054589890, "CC(remember):Transition.kt#9igjgp");
        boolean z3 = (i5 > 4 && composer.changed(transition)) || (i3 & 6) == 4;
        Object rememberedValue3 = composer.rememberedValue();
        if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelContentColor-RPmYEkk$$inlined$animateColor$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Transition.Segment<InputPhase> invoke() {
                    return Transition.this.getSegment();
                }
            });
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        State<Color> createTransitionAnimation = TransitionKt.createTransitionAnimation(transition, m6776boximpl, m6776boximpl2, (FiniteAnimationSpec) function3.invoke(((State) rememberedValue3).getValue(), composer, 0), twoWayConverter, "LabelContentColor", composer, i4 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return createTransitionAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec labelContentColor_RPmYEkk$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i) {
        composer.startReplaceGroup(-1207102280);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1207102280, i, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:474)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    public static final float textFieldHorizontalIconPadding(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1986450462, "C(textFieldHorizontalIconPadding)506@19804L7:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1986450462, i, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:505)");
        }
        ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localMinimumInteractiveComponentSize);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float m9746unboximpl = ((Dp) consume).m9746unboximpl();
        if (Float.isNaN(m9746unboximpl)) {
            m9746unboximpl = Dp.m9732constructorimpl(0);
        }
        float m9732constructorimpl = Dp.m9732constructorimpl(RangesKt.coerceAtLeast(Dp.m9732constructorimpl(Dp.m9732constructorimpl(m9746unboximpl - SmallIconButtonTokens.INSTANCE.m5587getIconSizeD9Ej5fM()) / 2), Dp.m9732constructorimpl(0)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m9732constructorimpl;
    }

    public static final float minimizedLabelHalfHeight(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1251545215, "C(minimizedLabelHalfHeight)513@20104L10,516@20314L7:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1251545215, i, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:512)");
        }
        long m9180getLineHeightXSAIIZE = MaterialTheme.INSTANCE.getTypography(composer, 6).getBodySmall().m9180getLineHeightXSAIIZE();
        long m5696getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m5696getBodySmallLineHeightXSAIIZE();
        if (!TextUnit.m9933isSpimpl(m9180getLineHeightXSAIIZE)) {
            m9180getLineHeightXSAIIZE = m5696getBodySmallLineHeightXSAIIZE;
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float m9732constructorimpl = Dp.m9732constructorimpl(((Density) consume).mo523toDpGaN1DYA(m9180getLineHeightXSAIIZE) / 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m9732constructorimpl;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getAboveLabelHorizontalPadding() {
        return AboveLabelHorizontalPadding;
    }

    public static final float getAboveLabelBottomPadding() {
        return AboveLabelBottomPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    private static final boolean CommonDecorationBox$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CommonDecorationBox$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static {
        float f = 16;
        TextFieldPadding = Dp.m9732constructorimpl(f);
        float f2 = 4;
        AboveLabelHorizontalPadding = Dp.m9732constructorimpl(f2);
        AboveLabelBottomPadding = Dp.m9732constructorimpl(f2);
        SupportingTopPadding = Dp.m9732constructorimpl(f2);
        MinFocusedLabelLineHeight = Dp.m9732constructorimpl(f);
        MinSupportingTextLineHeight = Dp.m9732constructorimpl(f);
    }
}
