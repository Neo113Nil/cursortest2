package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.Strings;
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
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.messaging.Constants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aÖ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a¨\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010-\u001aÖ\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020.2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010/\u001a¨\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020.2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001aì\u0001\u00101\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\b\u00142\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u0010\"\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u00142\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013¢\u0006\u0002\b\u00142\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\u0010;\u001ar\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020$2\u0006\u00105\u001a\u0002062\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u0002062\u0006\u00109\u001a\u00020:H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001aR\u0010J\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020$2\u0006\u0010E\u001a\u00020FH\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a\u0014\u0010T\u001a\u00020\f*\u00020\f2\u0006\u0010U\u001a\u00020VH\u0000\u001a\u009a\u0001\u0010W\u001a\u00020\u0006*\u00020X2\u0006\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020$2\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010^\u001a\u0004\u0018\u00010\\2\b\u0010_\u001a\u0004\u0018\u00010\\2\b\u0010`\u001a\u0004\u0018\u00010\\2\b\u0010a\u001a\u0004\u0018\u00010\\2\b\u0010b\u001a\u0004\u0018\u00010\\2\u0006\u0010c\u001a\u00020\\2\b\u0010d\u001a\u0004\u0018\u00010\\2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020$2\u0006\u0010f\u001a\u00020$2\u0006\u00105\u001a\u0002062\u0006\u0010G\u001a\u000206H\u0002\u001a\u0080\u0001\u0010g\u001a\u00020\u0006*\u00020X2\u0006\u0010Y\u001a\u00020$2\u0006\u0010Z\u001a\u00020$2\u0006\u0010h\u001a\u00020\\2\b\u0010^\u001a\u0004\u0018\u00010\\2\b\u0010_\u001a\u0004\u0018\u00010\\2\b\u0010`\u001a\u0004\u0018\u00010\\2\b\u0010a\u001a\u0004\u0018\u00010\\2\b\u0010b\u001a\u0004\u0018\u00010\\2\u0006\u0010c\u001a\u00020\\2\b\u0010d\u001a\u0004\u0018\u00010\\2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010G\u001a\u0002062\u0006\u00109\u001a\u00020:H\u0002\u001a\u0014\u0010i\u001a\u00020$*\u00020$2\u0006\u0010j\u001a\u00020$H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"TextFieldWithLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldWithLabelVerticalPadding", "()F", "F", TextFieldImplKt.TextFieldId, "", SDKConstants.PARAM_VALUE, "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "substractConstraintSafely", Constants.MessagePayloadKeys.FROM, "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m5734constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
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
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function211;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i30;
        Shape shape2;
        Modifier modifier3;
        boolean z6;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        TextFieldColors textFieldColors2;
        int i31;
        int i32;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z7;
        int i33;
        int i34;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        boolean z8;
        int i35;
        VisualTransformation visualTransformation2;
        boolean z9;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        long m5263getColor0d7_KjU;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final VisualTransformation visualTransformation3;
        final TextFieldColors textFieldColors3;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z10;
        final int i36;
        final int i37;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final Function2<? super Composer, ? super Integer, Unit> function224;
        final boolean z12;
        final boolean z13;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i38;
        Composer startRestartGroup = composer.startRestartGroup(-676242365);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)174@9072L7,189@9824L39,190@9902L5,191@9957L8,199@10319L15,199@10253L1913:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i3 & 384) == 0) {
                i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                        }
                        int i39 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i39 |= 384;
                        } else if ((i4 & 384) == 0) {
                            i39 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i39 |= 3072;
                            } else if ((i4 & 3072) == 0) {
                                i39 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                i20 = i6 & 16384;
                                if (i20 != 0) {
                                    i39 |= 24576;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i4 & 24576) == 0) {
                                        i39 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                        i22 = i6 & 32768;
                                        if (i22 == 0) {
                                            i39 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i39 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                        }
                                        i23 = i6 & 65536;
                                        if (i23 == 0) {
                                            i39 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
                                            i39 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                        }
                                        i24 = i6 & 131072;
                                        if (i24 == 0) {
                                            i39 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i39 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                                        }
                                        if ((i4 & 100663296) == 0) {
                                            i39 |= ((i6 & 262144) == 0 && startRestartGroup.changed(i)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        i25 = i6 & 524288;
                                        if (i25 == 0) {
                                            i39 |= 805306368;
                                        } else if ((i4 & 805306368) == 0) {
                                            i39 |= startRestartGroup.changed(i2) ? 536870912 : 268435456;
                                        }
                                        i26 = i6 & 1048576;
                                        if (i26 == 0) {
                                            i27 = i5 | 6;
                                        } else if ((i5 & 6) == 0) {
                                            i27 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                        } else {
                                            i27 = i5;
                                        }
                                        if ((i5 & 48) == 0) {
                                            i27 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                        }
                                        if ((i5 & 384) == 0) {
                                            if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                                i38 = 256;
                                                i27 |= i38;
                                            }
                                            i38 = 128;
                                            i27 |= i38;
                                        }
                                        i28 = i27;
                                        if ((i7 & 306783379) == 306783378 || (306783379 & i39) != 306783378 || (i28 & 147) != 146 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                                                boolean z14 = i9 == 0 ? true : z;
                                                boolean z15 = i10 == 0 ? false : z2;
                                                if ((i6 & 32) == 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    modifier2 = companion;
                                                    z5 = z14;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    textStyle2 = (TextStyle) consume;
                                                    i7 &= -458753;
                                                } else {
                                                    modifier2 = companion;
                                                    z5 = z14;
                                                    textStyle2 = textStyle;
                                                }
                                                function28 = i11 == 0 ? null : function2;
                                                function29 = i12 == 0 ? null : function22;
                                                Function2<? super Composer, ? super Integer, Unit> function225 = i13 == 0 ? null : function23;
                                                Function2<? super Composer, ? super Integer, Unit> function226 = i14 == 0 ? null : function24;
                                                Function2<? super Composer, ? super Integer, Unit> function227 = i15 == 0 ? null : function25;
                                                Function2<? super Composer, ? super Integer, Unit> function228 = i17 == 0 ? null : function26;
                                                function210 = i18 == 0 ? function27 : null;
                                                boolean z16 = i19 == 0 ? false : z3;
                                                VisualTransformation none = i21 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i22 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                KeyboardActions keyboardActions4 = i23 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                boolean z17 = i24 == 0 ? false : z4;
                                                if ((i6 & 262144) == 0) {
                                                    i29 = z17 ? 1 : Integer.MAX_VALUE;
                                                    i39 &= -234881025;
                                                } else {
                                                    i29 = i;
                                                }
                                                int i40 = i25 == 0 ? 1 : i2;
                                                Function2<? super Composer, ? super Integer, Unit> function229 = function225;
                                                if (i26 == 0) {
                                                    startRestartGroup.startReplaceableGroup(-1263331754);
                                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TextField.kt#9igjgp");
                                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                                    function211 = function226;
                                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                                    startRestartGroup.endReplaceableGroup();
                                                } else {
                                                    function211 = function226;
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                }
                                                if ((2097152 & i6) == 0) {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    i30 = 6;
                                                    shape2 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                                    i28 &= -113;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    i30 = 6;
                                                    shape2 = shape;
                                                }
                                                Shape shape5 = shape2;
                                                if ((i6 & 4194304) == 0) {
                                                    TextFieldColors colors = TextFieldDefaults.INSTANCE.colors(startRestartGroup, i30);
                                                    i28 &= -897;
                                                    modifier3 = modifier2;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shape5;
                                                    textFieldColors2 = colors;
                                                    i31 = i7;
                                                    i32 = i39;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    keyboardActions2 = keyboardActions4;
                                                    z7 = z17;
                                                    i33 = i29;
                                                    i34 = i40;
                                                    z6 = z5;
                                                } else {
                                                    modifier3 = modifier2;
                                                    z6 = z5;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shape5;
                                                    textFieldColors2 = textFieldColors;
                                                    i31 = i7;
                                                    i32 = i39;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    keyboardActions2 = keyboardActions4;
                                                    z7 = z17;
                                                    i33 = i29;
                                                    i34 = i40;
                                                }
                                                function212 = function229;
                                                function213 = function227;
                                                z8 = z15;
                                                i35 = i28;
                                                visualTransformation2 = none;
                                                z9 = z16;
                                                function214 = function228;
                                                function215 = function211;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i6 & 32) != 0) {
                                                    i7 &= -458753;
                                                }
                                                if ((262144 & i6) != 0) {
                                                    i39 &= -234881025;
                                                }
                                                if ((2097152 & i6) != 0) {
                                                    i28 &= -113;
                                                }
                                                if ((i6 & 4194304) != 0) {
                                                    i28 &= -897;
                                                }
                                                modifier3 = modifier;
                                                z6 = z;
                                                z8 = z2;
                                                textStyle2 = textStyle;
                                                function28 = function2;
                                                function29 = function22;
                                                function215 = function24;
                                                function214 = function26;
                                                function210 = function27;
                                                z9 = z3;
                                                keyboardOptions2 = keyboardOptions;
                                                keyboardActions2 = keyboardActions;
                                                z7 = z4;
                                                i33 = i;
                                                i34 = i2;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                shape3 = shape;
                                                i31 = i7;
                                                i32 = i39;
                                                i35 = i28;
                                                function212 = function23;
                                                function213 = function25;
                                                visualTransformation2 = visualTransformation;
                                                textFieldColors2 = textFieldColors;
                                            }
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                function216 = function214;
                                                function217 = function210;
                                            } else {
                                                function217 = function210;
                                                function216 = function214;
                                                ComposerKt.traceEventStart(-676242365, i31, i32, "androidx.compose.material3.TextField (TextField.kt:192)");
                                            }
                                            startRestartGroup.startReplaceableGroup(-1263331489);
                                            ComposerKt.sourceInformation(startRestartGroup, "*195@10117L46");
                                            m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                                            if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                                m5263getColor0d7_KjU = textFieldColors2.textColor$material3_release(z6, z9, mutableInteractionSource4, startRestartGroup, ((i31 >> 9) & 14) | ((i32 >> 6) & 112) | ((i35 << 6) & 896) | ((i35 << 3) & 7168)).getValue().m3417unboximpl();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            final TextStyle merge = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            final TextFieldColors textFieldColors4 = textFieldColors2;
                                            final Modifier modifier5 = modifier3;
                                            final boolean z18 = z9;
                                            final boolean z19 = z6;
                                            final boolean z20 = z8;
                                            final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                            final KeyboardActions keyboardActions5 = keyboardActions2;
                                            final boolean z21 = z7;
                                            final int i41 = i33;
                                            final int i42 = i34;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                            final Function2<? super Composer, ? super Integer, Unit> function230 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function231 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function232 = function212;
                                            final Function2<? super Composer, ? super Integer, Unit> function233 = function215;
                                            final Function2<? super Composer, ? super Integer, Unit> function234 = function213;
                                            final Function2<? super Composer, ? super Integer, Unit> function235 = function216;
                                            final Function2<? super Composer, ? super Integer, Unit> function236 = function217;
                                            final Shape shape6 = shape3;
                                            Modifier modifier6 = modifier3;
                                            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors4.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i43) {
                                                    ComposerKt.sourceInformation(composer2, "C203@10469L38,212@10872L20,200@10346L1814:TextField.kt#uh7d8r");
                                                    if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1859145987, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                                                        }
                                                        Modifier modifier7 = Modifier.this;
                                                        boolean z22 = z18;
                                                        Strings.Companion companion2 = Strings.INSTANCE;
                                                        Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                                        SolidColor solidColor = new SolidColor(textFieldColors4.cursorColor$material3_release(z18, composer2, 0).getValue().m3417unboximpl(), null);
                                                        String str2 = str;
                                                        Function1<String, Unit> function12 = function1;
                                                        boolean z23 = z19;
                                                        boolean z24 = z20;
                                                        TextStyle textStyle4 = merge;
                                                        KeyboardOptions keyboardOptions6 = keyboardOptions5;
                                                        KeyboardActions keyboardActions6 = keyboardActions5;
                                                        boolean z25 = z21;
                                                        int i44 = i41;
                                                        int i45 = i42;
                                                        VisualTransformation visualTransformation5 = visualTransformation4;
                                                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                        SolidColor solidColor2 = solidColor;
                                                        final String str3 = str;
                                                        final boolean z26 = z19;
                                                        final boolean z27 = z21;
                                                        final VisualTransformation visualTransformation6 = visualTransformation4;
                                                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                                        final boolean z28 = z18;
                                                        final Function2<Composer, Integer, Unit> function237 = function230;
                                                        final Function2<Composer, Integer, Unit> function238 = function231;
                                                        final Function2<Composer, Integer, Unit> function239 = function232;
                                                        final Function2<Composer, Integer, Unit> function240 = function233;
                                                        final Function2<Composer, Integer, Unit> function241 = function234;
                                                        final Function2<Composer, Integer, Unit> function242 = function235;
                                                        final Function2<Composer, Integer, Unit> function243 = function236;
                                                        final Shape shape7 = shape6;
                                                        final TextFieldColors textFieldColors5 = textFieldColors4;
                                                        BasicTextFieldKt.BasicTextField(str2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(3);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                                                int i47;
                                                                ComposerKt.sourceInformation(composer3, "C222@11393L743:TextField.kt#uh7d8r");
                                                                if ((i46 & 6) == 0) {
                                                                    i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                                                } else {
                                                                    i47 = i46;
                                                                }
                                                                if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-288211827, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                                                    }
                                                                    TextFieldDefaults.INSTANCE.DecorationBox(str3, function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer3.skipToGroupEnd();
                                                            }
                                                        }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }), startRestartGroup, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            function218 = function216;
                                            visualTransformation3 = visualTransformation2;
                                            textFieldColors3 = textFieldColors4;
                                            function219 = function28;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions3 = keyboardActions2;
                                            z10 = z7;
                                            i36 = i33;
                                            i37 = i34;
                                            mutableInteractionSource5 = mutableInteractionSource4;
                                            shape4 = shape3;
                                            function220 = function217;
                                            function221 = function213;
                                            textStyle3 = textStyle2;
                                            function222 = function29;
                                            z11 = z9;
                                            function223 = function212;
                                            function224 = function215;
                                            z12 = z6;
                                            z13 = z8;
                                            modifier4 = modifier6;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier;
                                            z12 = z;
                                            z13 = z2;
                                            textStyle3 = textStyle;
                                            function219 = function2;
                                            function222 = function22;
                                            function223 = function23;
                                            function224 = function24;
                                            function221 = function25;
                                            function218 = function26;
                                            function220 = function27;
                                            z11 = z3;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions3 = keyboardActions;
                                            z10 = z4;
                                            i36 = i;
                                            i37 = i2;
                                            mutableInteractionSource5 = mutableInteractionSource;
                                            shape4 = shape;
                                            textFieldColors3 = textFieldColors;
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i43) {
                                                    TextFieldKt.TextField(str, function1, modifier4, z12, z13, textStyle3, function219, function222, function223, function224, function221, function218, function220, z11, visualTransformation3, keyboardOptions3, keyboardActions3, z10, i36, i37, mutableInteractionSource5, shape4, textFieldColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i6 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 131072;
                                if (i24 == 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                i25 = i6 & 524288;
                                if (i25 == 0) {
                                }
                                i26 = i6 & 1048576;
                                if (i26 == 0) {
                                }
                                if ((i5 & 48) == 0) {
                                }
                                if ((i5 & 384) == 0) {
                                }
                                i28 = i27;
                                if ((i7 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i6 & 32) == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 262144) == 0) {
                                }
                                if (i25 == 0) {
                                }
                                Function2<? super Composer, ? super Integer, Unit> function2292 = function225;
                                if (i26 == 0) {
                                }
                                if ((2097152 & i6) == 0) {
                                }
                                Shape shape52 = shape2;
                                if ((i6 & 4194304) == 0) {
                                }
                                function212 = function2292;
                                function213 = function227;
                                z8 = z15;
                                i35 = i28;
                                visualTransformation2 = none;
                                z9 = z16;
                                function214 = function228;
                                function215 = function211;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(-1263331489);
                                ComposerKt.sourceInformation(startRestartGroup, "*195@10117L46");
                                m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                                if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                final TextStyle merge2 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                final TextFieldColors textFieldColors42 = textFieldColors2;
                                final Modifier modifier52 = modifier3;
                                final boolean z182 = z9;
                                final boolean z192 = z6;
                                final boolean z202 = z8;
                                final KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                final KeyboardActions keyboardActions52 = keyboardActions2;
                                final boolean z212 = z7;
                                final int i412 = i33;
                                final int i422 = i34;
                                final VisualTransformation visualTransformation42 = visualTransformation2;
                                final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                                final Function2<? super Composer, ? super Integer, Unit> function2302 = function28;
                                final Function2<? super Composer, ? super Integer, Unit> function2312 = function29;
                                final Function2<? super Composer, ? super Integer, Unit> function2322 = function212;
                                final Function2<? super Composer, ? super Integer, Unit> function2332 = function215;
                                final Function2<? super Composer, ? super Integer, Unit> function2342 = function213;
                                final Function2<? super Composer, ? super Integer, Unit> function2352 = function216;
                                final Function2<? super Composer, ? super Integer, Unit> function2362 = function217;
                                final Shape shape62 = shape3;
                                Modifier modifier62 = modifier3;
                                CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors42.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i43) {
                                        ComposerKt.sourceInformation(composer2, "C203@10469L38,212@10872L20,200@10346L1814:TextField.kt#uh7d8r");
                                        if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1859145987, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                                            }
                                            Modifier modifier7 = Modifier.this;
                                            boolean z22 = z182;
                                            Strings.Companion companion2 = Strings.INSTANCE;
                                            Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                            SolidColor solidColor = new SolidColor(textFieldColors42.cursorColor$material3_release(z182, composer2, 0).getValue().m3417unboximpl(), null);
                                            String str2 = str;
                                            Function1<String, Unit> function12 = function1;
                                            boolean z23 = z192;
                                            boolean z24 = z202;
                                            TextStyle textStyle4 = merge2;
                                            KeyboardOptions keyboardOptions6 = keyboardOptions52;
                                            KeyboardActions keyboardActions6 = keyboardActions52;
                                            boolean z25 = z212;
                                            int i44 = i412;
                                            int i45 = i422;
                                            VisualTransformation visualTransformation5 = visualTransformation42;
                                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                            SolidColor solidColor2 = solidColor;
                                            final String str3 = str;
                                            final boolean z26 = z192;
                                            final boolean z27 = z212;
                                            final VisualTransformation visualTransformation6 = visualTransformation42;
                                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62;
                                            final boolean z28 = z182;
                                            final Function2<? super Composer, ? super Integer, Unit> function237 = function2302;
                                            final Function2<? super Composer, ? super Integer, Unit> function238 = function2312;
                                            final Function2<? super Composer, ? super Integer, Unit> function239 = function2322;
                                            final Function2<? super Composer, ? super Integer, Unit> function240 = function2332;
                                            final Function2<? super Composer, ? super Integer, Unit> function241 = function2342;
                                            final Function2<? super Composer, ? super Integer, Unit> function242 = function2352;
                                            final Function2<? super Composer, ? super Integer, Unit> function243 = function2362;
                                            final Shape shape7 = shape62;
                                            final TextFieldColors textFieldColors5 = textFieldColors42;
                                            BasicTextFieldKt.BasicTextField(str2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                                    int i47;
                                                    ComposerKt.sourceInformation(composer3, "C222@11393L743:TextField.kt#uh7d8r");
                                                    if ((i46 & 6) == 0) {
                                                        i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                                    } else {
                                                        i47 = i46;
                                                    }
                                                    if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-288211827, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.DecorationBox(str3, function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function218 = function216;
                                visualTransformation3 = visualTransformation2;
                                textFieldColors3 = textFieldColors42;
                                function219 = function28;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                z10 = z7;
                                i36 = i33;
                                i37 = i34;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                shape4 = shape3;
                                function220 = function217;
                                function221 = function213;
                                textStyle3 = textStyle2;
                                function222 = function29;
                                z11 = z9;
                                function223 = function212;
                                function224 = function215;
                                z12 = z6;
                                z13 = z8;
                                modifier4 = modifier62;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 != 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i6 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 == 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i25 = i6 & 524288;
                            if (i25 == 0) {
                            }
                            i26 = i6 & 1048576;
                            if (i26 == 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            i28 = i27;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i6 & 32) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 262144) == 0) {
                            }
                            if (i25 == 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function22922 = function225;
                            if (i26 == 0) {
                            }
                            if ((2097152 & i6) == 0) {
                            }
                            Shape shape522 = shape2;
                            if ((i6 & 4194304) == 0) {
                            }
                            function212 = function22922;
                            function213 = function227;
                            z8 = z15;
                            i35 = i28;
                            visualTransformation2 = none;
                            z9 = z16;
                            function214 = function228;
                            function215 = function211;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceableGroup(-1263331489);
                            ComposerKt.sourceInformation(startRestartGroup, "*195@10117L46");
                            m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                            if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextStyle merge22 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            final TextFieldColors textFieldColors422 = textFieldColors2;
                            final Modifier modifier522 = modifier3;
                            final boolean z1822 = z9;
                            final boolean z1922 = z6;
                            final boolean z2022 = z8;
                            final KeyboardOptions keyboardOptions522 = keyboardOptions2;
                            final KeyboardActions keyboardActions522 = keyboardActions2;
                            final boolean z2122 = z7;
                            final int i4122 = i33;
                            final int i4222 = i34;
                            final VisualTransformation visualTransformation422 = visualTransformation2;
                            final MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
                            final Function2<? super Composer, ? super Integer, Unit> function23022 = function28;
                            final Function2<? super Composer, ? super Integer, Unit> function23122 = function29;
                            final Function2<? super Composer, ? super Integer, Unit> function23222 = function212;
                            final Function2<? super Composer, ? super Integer, Unit> function23322 = function215;
                            final Function2<? super Composer, ? super Integer, Unit> function23422 = function213;
                            final Function2<? super Composer, ? super Integer, Unit> function23522 = function216;
                            final Function2<? super Composer, ? super Integer, Unit> function23622 = function217;
                            final Shape shape622 = shape3;
                            Modifier modifier622 = modifier3;
                            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors422.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i43) {
                                    ComposerKt.sourceInformation(composer2, "C203@10469L38,212@10872L20,200@10346L1814:TextField.kt#uh7d8r");
                                    if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1859145987, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                                        }
                                        Modifier modifier7 = Modifier.this;
                                        boolean z22 = z1822;
                                        Strings.Companion companion2 = Strings.INSTANCE;
                                        Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                        SolidColor solidColor = new SolidColor(textFieldColors422.cursorColor$material3_release(z1822, composer2, 0).getValue().m3417unboximpl(), null);
                                        String str2 = str;
                                        Function1<String, Unit> function12 = function1;
                                        boolean z23 = z1922;
                                        boolean z24 = z2022;
                                        TextStyle textStyle4 = merge22;
                                        KeyboardOptions keyboardOptions6 = keyboardOptions522;
                                        KeyboardActions keyboardActions6 = keyboardActions522;
                                        boolean z25 = z2122;
                                        int i44 = i4122;
                                        int i45 = i4222;
                                        VisualTransformation visualTransformation5 = visualTransformation422;
                                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622;
                                        SolidColor solidColor2 = solidColor;
                                        final String str3 = str;
                                        final boolean z26 = z1922;
                                        final boolean z27 = z2122;
                                        final VisualTransformation visualTransformation6 = visualTransformation422;
                                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource622;
                                        final boolean z28 = z1822;
                                        final Function2<? super Composer, ? super Integer, Unit> function237 = function23022;
                                        final Function2<? super Composer, ? super Integer, Unit> function238 = function23122;
                                        final Function2<? super Composer, ? super Integer, Unit> function239 = function23222;
                                        final Function2<? super Composer, ? super Integer, Unit> function240 = function23322;
                                        final Function2<? super Composer, ? super Integer, Unit> function241 = function23422;
                                        final Function2<? super Composer, ? super Integer, Unit> function242 = function23522;
                                        final Function2<? super Composer, ? super Integer, Unit> function243 = function23622;
                                        final Shape shape7 = shape622;
                                        final TextFieldColors textFieldColors5 = textFieldColors422;
                                        BasicTextFieldKt.BasicTextField(str2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                                int i47;
                                                ComposerKt.sourceInformation(composer3, "C222@11393L743:TextField.kt#uh7d8r");
                                                if ((i46 & 6) == 0) {
                                                    i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                                } else {
                                                    i47 = i46;
                                                }
                                                if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-288211827, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.DecorationBox(str3, function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function218 = function216;
                            visualTransformation3 = visualTransformation2;
                            textFieldColors3 = textFieldColors422;
                            function219 = function28;
                            keyboardOptions3 = keyboardOptions2;
                            keyboardActions3 = keyboardActions2;
                            z10 = z7;
                            i36 = i33;
                            i37 = i34;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            shape4 = shape3;
                            function220 = function217;
                            function221 = function213;
                            textStyle3 = textStyle2;
                            function222 = function29;
                            z11 = z9;
                            function223 = function212;
                            function224 = function215;
                            z12 = z6;
                            z13 = z8;
                            modifier4 = modifier622;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i25 = i6 & 524288;
                        if (i25 == 0) {
                        }
                        i26 = i6 & 1048576;
                        if (i26 == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        i28 = i27;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 262144) == 0) {
                        }
                        if (i25 == 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function229222 = function225;
                        if (i26 == 0) {
                        }
                        if ((2097152 & i6) == 0) {
                        }
                        Shape shape5222 = shape2;
                        if ((i6 & 4194304) == 0) {
                        }
                        function212 = function229222;
                        function213 = function227;
                        z8 = z15;
                        i35 = i28;
                        visualTransformation2 = none;
                        z9 = z16;
                        function214 = function228;
                        function215 = function211;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(-1263331489);
                        ComposerKt.sourceInformation(startRestartGroup, "*195@10117L46");
                        m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                        if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final TextStyle merge222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        final TextFieldColors textFieldColors4222 = textFieldColors2;
                        final Modifier modifier5222 = modifier3;
                        final boolean z18222 = z9;
                        final boolean z19222 = z6;
                        final boolean z20222 = z8;
                        final KeyboardOptions keyboardOptions5222 = keyboardOptions2;
                        final KeyboardActions keyboardActions5222 = keyboardActions2;
                        final boolean z21222 = z7;
                        final int i41222 = i33;
                        final int i42222 = i34;
                        final VisualTransformation visualTransformation4222 = visualTransformation2;
                        final MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource4;
                        final Function2<? super Composer, ? super Integer, Unit> function230222 = function28;
                        final Function2<? super Composer, ? super Integer, Unit> function231222 = function29;
                        final Function2<? super Composer, ? super Integer, Unit> function232222 = function212;
                        final Function2<? super Composer, ? super Integer, Unit> function233222 = function215;
                        final Function2<? super Composer, ? super Integer, Unit> function234222 = function213;
                        final Function2<? super Composer, ? super Integer, Unit> function235222 = function216;
                        final Function2<? super Composer, ? super Integer, Unit> function236222 = function217;
                        final Shape shape6222 = shape3;
                        Modifier modifier6222 = modifier3;
                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors4222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i43) {
                                ComposerKt.sourceInformation(composer2, "C203@10469L38,212@10872L20,200@10346L1814:TextField.kt#uh7d8r");
                                if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1859145987, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                                    }
                                    Modifier modifier7 = Modifier.this;
                                    boolean z22 = z18222;
                                    Strings.Companion companion2 = Strings.INSTANCE;
                                    Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                    SolidColor solidColor = new SolidColor(textFieldColors4222.cursorColor$material3_release(z18222, composer2, 0).getValue().m3417unboximpl(), null);
                                    String str2 = str;
                                    Function1<String, Unit> function12 = function1;
                                    boolean z23 = z19222;
                                    boolean z24 = z20222;
                                    TextStyle textStyle4 = merge222;
                                    KeyboardOptions keyboardOptions6 = keyboardOptions5222;
                                    KeyboardActions keyboardActions6 = keyboardActions5222;
                                    boolean z25 = z21222;
                                    int i44 = i41222;
                                    int i45 = i42222;
                                    VisualTransformation visualTransformation5 = visualTransformation4222;
                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6222;
                                    SolidColor solidColor2 = solidColor;
                                    final String str3 = str;
                                    final boolean z26 = z19222;
                                    final boolean z27 = z21222;
                                    final VisualTransformation visualTransformation6 = visualTransformation4222;
                                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6222;
                                    final boolean z28 = z18222;
                                    final Function2<? super Composer, ? super Integer, Unit> function237 = function230222;
                                    final Function2<? super Composer, ? super Integer, Unit> function238 = function231222;
                                    final Function2<? super Composer, ? super Integer, Unit> function239 = function232222;
                                    final Function2<? super Composer, ? super Integer, Unit> function240 = function233222;
                                    final Function2<? super Composer, ? super Integer, Unit> function241 = function234222;
                                    final Function2<? super Composer, ? super Integer, Unit> function242 = function235222;
                                    final Function2<? super Composer, ? super Integer, Unit> function243 = function236222;
                                    final Shape shape7 = shape6222;
                                    final TextFieldColors textFieldColors5 = textFieldColors4222;
                                    BasicTextFieldKt.BasicTextField(str2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                            int i47;
                                            ComposerKt.sourceInformation(composer3, "C222@11393L743:TextField.kt#uh7d8r");
                                            if ((i46 & 6) == 0) {
                                                i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                            } else {
                                                i47 = i46;
                                            }
                                            if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-288211827, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                                }
                                                TextFieldDefaults.INSTANCE.DecorationBox(str3, function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function218 = function216;
                        visualTransformation3 = visualTransformation2;
                        textFieldColors3 = textFieldColors4222;
                        function219 = function28;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        z10 = z7;
                        i36 = i33;
                        i37 = i34;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape4 = shape3;
                        function220 = function217;
                        function221 = function213;
                        textStyle3 = textStyle2;
                        function222 = function29;
                        z11 = z9;
                        function223 = function212;
                        function224 = function215;
                        z12 = z6;
                        z13 = z8;
                        modifier4 = modifier6222;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i392 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i25 = i6 & 524288;
                    if (i25 == 0) {
                    }
                    i26 = i6 & 1048576;
                    if (i26 == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    i28 = i27;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 262144) == 0) {
                    }
                    if (i25 == 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function2292222 = function225;
                    if (i26 == 0) {
                    }
                    if ((2097152 & i6) == 0) {
                    }
                    Shape shape52222 = shape2;
                    if ((i6 & 4194304) == 0) {
                    }
                    function212 = function2292222;
                    function213 = function227;
                    z8 = z15;
                    i35 = i28;
                    visualTransformation2 = none;
                    z9 = z16;
                    function214 = function228;
                    function215 = function211;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-1263331489);
                    ComposerKt.sourceInformation(startRestartGroup, "*195@10117L46");
                    m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                    if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final TextStyle merge2222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    final TextFieldColors textFieldColors42222 = textFieldColors2;
                    final Modifier modifier52222 = modifier3;
                    final boolean z182222 = z9;
                    final boolean z192222 = z6;
                    final boolean z202222 = z8;
                    final KeyboardOptions keyboardOptions52222 = keyboardOptions2;
                    final KeyboardActions keyboardActions52222 = keyboardActions2;
                    final boolean z212222 = z7;
                    final int i412222 = i33;
                    final int i422222 = i34;
                    final VisualTransformation visualTransformation42222 = visualTransformation2;
                    final MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource4;
                    final Function2<? super Composer, ? super Integer, Unit> function2302222 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function2312222 = function29;
                    final Function2<? super Composer, ? super Integer, Unit> function2322222 = function212;
                    final Function2<? super Composer, ? super Integer, Unit> function2332222 = function215;
                    final Function2<? super Composer, ? super Integer, Unit> function2342222 = function213;
                    final Function2<? super Composer, ? super Integer, Unit> function2352222 = function216;
                    final Function2<? super Composer, ? super Integer, Unit> function2362222 = function217;
                    final Shape shape62222 = shape3;
                    Modifier modifier62222 = modifier3;
                    CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors42222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i43) {
                            ComposerKt.sourceInformation(composer2, "C203@10469L38,212@10872L20,200@10346L1814:TextField.kt#uh7d8r");
                            if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1859145987, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                                }
                                Modifier modifier7 = Modifier.this;
                                boolean z22 = z182222;
                                Strings.Companion companion2 = Strings.INSTANCE;
                                Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                SolidColor solidColor = new SolidColor(textFieldColors42222.cursorColor$material3_release(z182222, composer2, 0).getValue().m3417unboximpl(), null);
                                String str2 = str;
                                Function1<String, Unit> function12 = function1;
                                boolean z23 = z192222;
                                boolean z24 = z202222;
                                TextStyle textStyle4 = merge2222;
                                KeyboardOptions keyboardOptions6 = keyboardOptions52222;
                                KeyboardActions keyboardActions6 = keyboardActions52222;
                                boolean z25 = z212222;
                                int i44 = i412222;
                                int i45 = i422222;
                                VisualTransformation visualTransformation5 = visualTransformation42222;
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62222;
                                SolidColor solidColor2 = solidColor;
                                final String str3 = str;
                                final boolean z26 = z192222;
                                final boolean z27 = z212222;
                                final VisualTransformation visualTransformation6 = visualTransformation42222;
                                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62222;
                                final boolean z28 = z182222;
                                final Function2<? super Composer, ? super Integer, Unit> function237 = function2302222;
                                final Function2<? super Composer, ? super Integer, Unit> function238 = function2312222;
                                final Function2<? super Composer, ? super Integer, Unit> function239 = function2322222;
                                final Function2<? super Composer, ? super Integer, Unit> function240 = function2332222;
                                final Function2<? super Composer, ? super Integer, Unit> function241 = function2342222;
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function2352222;
                                final Function2<? super Composer, ? super Integer, Unit> function243 = function2362222;
                                final Shape shape7 = shape62222;
                                final TextFieldColors textFieldColors5 = textFieldColors42222;
                                BasicTextFieldKt.BasicTextField(str2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                        int i47;
                                        ComposerKt.sourceInformation(composer3, "C222@11393L743:TextField.kt#uh7d8r");
                                        if ((i46 & 6) == 0) {
                                            i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                        } else {
                                            i47 = i46;
                                        }
                                        if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-288211827, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                            }
                                            TextFieldDefaults.INSTANCE.DecorationBox(str3, function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function218 = function216;
                    visualTransformation3 = visualTransformation2;
                    textFieldColors3 = textFieldColors42222;
                    function219 = function28;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    z10 = z7;
                    i36 = i33;
                    i37 = i34;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    function220 = function217;
                    function221 = function213;
                    textStyle3 = textStyle2;
                    function222 = function29;
                    z11 = z9;
                    function223 = function212;
                    function224 = function215;
                    z12 = z6;
                    z13 = z8;
                    modifier4 = modifier62222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3922 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 != 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                i23 = i6 & 65536;
                if (i23 == 0) {
                }
                i24 = i6 & 131072;
                if (i24 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i25 = i6 & 524288;
                if (i25 == 0) {
                }
                i26 = i6 & 1048576;
                if (i26 == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                i28 = i27;
                if ((i7 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i6 & 262144) == 0) {
                }
                if (i25 == 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function22922222 = function225;
                if (i26 == 0) {
                }
                if ((2097152 & i6) == 0) {
                }
                Shape shape522222 = shape2;
                if ((i6 & 4194304) == 0) {
                }
                function212 = function22922222;
                function213 = function227;
                z8 = z15;
                i35 = i28;
                visualTransformation2 = none;
                z9 = z16;
                function214 = function228;
                function215 = function211;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1263331489);
                ComposerKt.sourceInformation(startRestartGroup, "*195@10117L46");
                m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                final TextStyle merge22222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                final TextFieldColors textFieldColors422222 = textFieldColors2;
                final Modifier modifier522222 = modifier3;
                final boolean z1822222 = z9;
                final boolean z1922222 = z6;
                final boolean z2022222 = z8;
                final KeyboardOptions keyboardOptions522222 = keyboardOptions2;
                final KeyboardActions keyboardActions522222 = keyboardActions2;
                final boolean z2122222 = z7;
                final int i4122222 = i33;
                final int i4222222 = i34;
                final VisualTransformation visualTransformation422222 = visualTransformation2;
                final MutableInteractionSource mutableInteractionSource622222 = mutableInteractionSource4;
                final Function2<? super Composer, ? super Integer, Unit> function23022222 = function28;
                final Function2<? super Composer, ? super Integer, Unit> function23122222 = function29;
                final Function2<? super Composer, ? super Integer, Unit> function23222222 = function212;
                final Function2<? super Composer, ? super Integer, Unit> function23322222 = function215;
                final Function2<? super Composer, ? super Integer, Unit> function23422222 = function213;
                final Function2<? super Composer, ? super Integer, Unit> function23522222 = function216;
                final Function2<? super Composer, ? super Integer, Unit> function23622222 = function217;
                final Shape shape622222 = shape3;
                Modifier modifier622222 = modifier3;
                CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors422222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i43) {
                        ComposerKt.sourceInformation(composer2, "C203@10469L38,212@10872L20,200@10346L1814:TextField.kt#uh7d8r");
                        if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1859145987, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                            }
                            Modifier modifier7 = Modifier.this;
                            boolean z22 = z1822222;
                            Strings.Companion companion2 = Strings.INSTANCE;
                            Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                            SolidColor solidColor = new SolidColor(textFieldColors422222.cursorColor$material3_release(z1822222, composer2, 0).getValue().m3417unboximpl(), null);
                            String str2 = str;
                            Function1<String, Unit> function12 = function1;
                            boolean z23 = z1922222;
                            boolean z24 = z2022222;
                            TextStyle textStyle4 = merge22222;
                            KeyboardOptions keyboardOptions6 = keyboardOptions522222;
                            KeyboardActions keyboardActions6 = keyboardActions522222;
                            boolean z25 = z2122222;
                            int i44 = i4122222;
                            int i45 = i4222222;
                            VisualTransformation visualTransformation5 = visualTransformation422222;
                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622222;
                            SolidColor solidColor2 = solidColor;
                            final String str3 = str;
                            final boolean z26 = z1922222;
                            final boolean z27 = z2122222;
                            final VisualTransformation visualTransformation6 = visualTransformation422222;
                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource622222;
                            final boolean z28 = z1822222;
                            final Function2<? super Composer, ? super Integer, Unit> function237 = function23022222;
                            final Function2<? super Composer, ? super Integer, Unit> function238 = function23122222;
                            final Function2<? super Composer, ? super Integer, Unit> function239 = function23222222;
                            final Function2<? super Composer, ? super Integer, Unit> function240 = function23322222;
                            final Function2<? super Composer, ? super Integer, Unit> function241 = function23422222;
                            final Function2<? super Composer, ? super Integer, Unit> function242 = function23522222;
                            final Function2<? super Composer, ? super Integer, Unit> function243 = function23622222;
                            final Shape shape7 = shape622222;
                            final TextFieldColors textFieldColors5 = textFieldColors422222;
                            BasicTextFieldKt.BasicTextField(str2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                    int i47;
                                    ComposerKt.sourceInformation(composer3, "C222@11393L743:TextField.kt#uh7d8r");
                                    if ((i46 & 6) == 0) {
                                        i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                    } else {
                                        i47 = i46;
                                    }
                                    if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-288211827, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                        }
                                        TextFieldDefaults.INSTANCE.DecorationBox(str3, function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                function218 = function216;
                visualTransformation3 = visualTransformation2;
                textFieldColors3 = textFieldColors422222;
                function219 = function28;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                z10 = z7;
                i36 = i33;
                i37 = i34;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape4 = shape3;
                function220 = function217;
                function221 = function213;
                textStyle3 = textStyle2;
                function222 = function29;
                z11 = z9;
                function223 = function212;
                function224 = function215;
                z12 = z6;
                z13 = z8;
                modifier4 = modifier622222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i39222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 != 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            i23 = i6 & 65536;
            if (i23 == 0) {
            }
            i24 = i6 & 131072;
            if (i24 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i25 = i6 & 524288;
            if (i25 == 0) {
            }
            i26 = i6 & 1048576;
            if (i26 == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            i28 = i27;
            if ((i7 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i6 & 262144) == 0) {
            }
            if (i25 == 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function229222222 = function225;
            if (i26 == 0) {
            }
            if ((2097152 & i6) == 0) {
            }
            Shape shape5222222 = shape2;
            if ((i6 & 4194304) == 0) {
            }
            function212 = function229222222;
            function213 = function227;
            z8 = z15;
            i35 = i28;
            visualTransformation2 = none;
            z9 = z16;
            function214 = function228;
            function215 = function211;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1263331489);
            ComposerKt.sourceInformation(startRestartGroup, "*195@10117L46");
            m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
            if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            final TextStyle merge222222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            final TextFieldColors textFieldColors4222222 = textFieldColors2;
            final Modifier modifier5222222 = modifier3;
            final boolean z18222222 = z9;
            final boolean z19222222 = z6;
            final boolean z20222222 = z8;
            final KeyboardOptions keyboardOptions5222222 = keyboardOptions2;
            final KeyboardActions keyboardActions5222222 = keyboardActions2;
            final boolean z21222222 = z7;
            final int i41222222 = i33;
            final int i42222222 = i34;
            final VisualTransformation visualTransformation4222222 = visualTransformation2;
            final MutableInteractionSource mutableInteractionSource6222222 = mutableInteractionSource4;
            final Function2<? super Composer, ? super Integer, Unit> function230222222 = function28;
            final Function2<? super Composer, ? super Integer, Unit> function231222222 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function232222222 = function212;
            final Function2<? super Composer, ? super Integer, Unit> function233222222 = function215;
            final Function2<? super Composer, ? super Integer, Unit> function234222222 = function213;
            final Function2<? super Composer, ? super Integer, Unit> function235222222 = function216;
            final Function2<? super Composer, ? super Integer, Unit> function236222222 = function217;
            final Shape shape6222222 = shape3;
            Modifier modifier6222222 = modifier3;
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors4222222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i43) {
                    ComposerKt.sourceInformation(composer2, "C203@10469L38,212@10872L20,200@10346L1814:TextField.kt#uh7d8r");
                    if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1859145987, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                        }
                        Modifier modifier7 = Modifier.this;
                        boolean z22 = z18222222;
                        Strings.Companion companion2 = Strings.INSTANCE;
                        Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                        SolidColor solidColor = new SolidColor(textFieldColors4222222.cursorColor$material3_release(z18222222, composer2, 0).getValue().m3417unboximpl(), null);
                        String str2 = str;
                        Function1<String, Unit> function12 = function1;
                        boolean z23 = z19222222;
                        boolean z24 = z20222222;
                        TextStyle textStyle4 = merge222222;
                        KeyboardOptions keyboardOptions6 = keyboardOptions5222222;
                        KeyboardActions keyboardActions6 = keyboardActions5222222;
                        boolean z25 = z21222222;
                        int i44 = i41222222;
                        int i45 = i42222222;
                        VisualTransformation visualTransformation5 = visualTransformation4222222;
                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6222222;
                        SolidColor solidColor2 = solidColor;
                        final String str3 = str;
                        final boolean z26 = z19222222;
                        final boolean z27 = z21222222;
                        final VisualTransformation visualTransformation6 = visualTransformation4222222;
                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6222222;
                        final boolean z28 = z18222222;
                        final Function2<? super Composer, ? super Integer, Unit> function237 = function230222222;
                        final Function2<? super Composer, ? super Integer, Unit> function238 = function231222222;
                        final Function2<? super Composer, ? super Integer, Unit> function239 = function232222222;
                        final Function2<? super Composer, ? super Integer, Unit> function240 = function233222222;
                        final Function2<? super Composer, ? super Integer, Unit> function241 = function234222222;
                        final Function2<? super Composer, ? super Integer, Unit> function242 = function235222222;
                        final Function2<? super Composer, ? super Integer, Unit> function243 = function236222222;
                        final Shape shape7 = shape6222222;
                        final TextFieldColors textFieldColors5 = textFieldColors4222222;
                        BasicTextFieldKt.BasicTextField(str2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                int i47;
                                ComposerKt.sourceInformation(composer3, "C222@11393L743:TextField.kt#uh7d8r");
                                if ((i46 & 6) == 0) {
                                    i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                } else {
                                    i47 = i46;
                                }
                                if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-288211827, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                    }
                                    TextFieldDefaults.INSTANCE.DecorationBox(str3, function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            function218 = function216;
            visualTransformation3 = visualTransformation2;
            textFieldColors3 = textFieldColors4222222;
            function219 = function28;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            z10 = z7;
            i36 = i33;
            i37 = i34;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            function220 = function217;
            function221 = function213;
            textStyle3 = textStyle2;
            function222 = function29;
            z11 = z9;
            function223 = function212;
            function224 = function215;
            z12 = z6;
            z13 = z8;
            modifier4 = modifier6222222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i392222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 != 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        i23 = i6 & 65536;
        if (i23 == 0) {
        }
        i24 = i6 & 131072;
        if (i24 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i25 = i6 & 524288;
        if (i25 == 0) {
        }
        i26 = i6 & 1048576;
        if (i26 == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        i28 = i27;
        if ((i7 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i6 & 262144) == 0) {
        }
        if (i25 == 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function2292222222 = function225;
        if (i26 == 0) {
        }
        if ((2097152 & i6) == 0) {
        }
        Shape shape52222222 = shape2;
        if ((i6 & 4194304) == 0) {
        }
        function212 = function2292222222;
        function213 = function227;
        z8 = z15;
        i35 = i28;
        visualTransformation2 = none;
        z9 = z16;
        function214 = function228;
        function215 = function211;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1263331489);
        ComposerKt.sourceInformation(startRestartGroup, "*195@10117L46");
        m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
        if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        final TextStyle merge2222222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        final TextFieldColors textFieldColors42222222 = textFieldColors2;
        final Modifier modifier52222222 = modifier3;
        final boolean z182222222 = z9;
        final boolean z192222222 = z6;
        final boolean z202222222 = z8;
        final KeyboardOptions keyboardOptions52222222 = keyboardOptions2;
        final KeyboardActions keyboardActions52222222 = keyboardActions2;
        final boolean z212222222 = z7;
        final int i412222222 = i33;
        final int i422222222 = i34;
        final VisualTransformation visualTransformation42222222 = visualTransformation2;
        final MutableInteractionSource mutableInteractionSource62222222 = mutableInteractionSource4;
        final Function2<? super Composer, ? super Integer, Unit> function2302222222 = function28;
        final Function2<? super Composer, ? super Integer, Unit> function2312222222 = function29;
        final Function2<? super Composer, ? super Integer, Unit> function2322222222 = function212;
        final Function2<? super Composer, ? super Integer, Unit> function2332222222 = function215;
        final Function2<? super Composer, ? super Integer, Unit> function2342222222 = function213;
        final Function2<? super Composer, ? super Integer, Unit> function2352222222 = function216;
        final Function2<? super Composer, ? super Integer, Unit> function2362222222 = function217;
        final Shape shape62222222 = shape3;
        Modifier modifier62222222 = modifier3;
        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors42222222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, 1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i43) {
                ComposerKt.sourceInformation(composer2, "C203@10469L38,212@10872L20,200@10346L1814:TextField.kt#uh7d8r");
                if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1859145987, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:200)");
                    }
                    Modifier modifier7 = Modifier.this;
                    boolean z22 = z182222222;
                    Strings.Companion companion2 = Strings.INSTANCE;
                    Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                    SolidColor solidColor = new SolidColor(textFieldColors42222222.cursorColor$material3_release(z182222222, composer2, 0).getValue().m3417unboximpl(), null);
                    String str2 = str;
                    Function1<String, Unit> function12 = function1;
                    boolean z23 = z192222222;
                    boolean z24 = z202222222;
                    TextStyle textStyle4 = merge2222222;
                    KeyboardOptions keyboardOptions6 = keyboardOptions52222222;
                    KeyboardActions keyboardActions6 = keyboardActions52222222;
                    boolean z25 = z212222222;
                    int i44 = i412222222;
                    int i45 = i422222222;
                    VisualTransformation visualTransformation5 = visualTransformation42222222;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62222222;
                    SolidColor solidColor2 = solidColor;
                    final String str3 = str;
                    final boolean z26 = z192222222;
                    final boolean z27 = z212222222;
                    final VisualTransformation visualTransformation6 = visualTransformation42222222;
                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62222222;
                    final boolean z28 = z182222222;
                    final Function2<? super Composer, ? super Integer, Unit> function237 = function2302222222;
                    final Function2<? super Composer, ? super Integer, Unit> function238 = function2312222222;
                    final Function2<? super Composer, ? super Integer, Unit> function239 = function2322222222;
                    final Function2<? super Composer, ? super Integer, Unit> function240 = function2332222222;
                    final Function2<? super Composer, ? super Integer, Unit> function241 = function2342222222;
                    final Function2<? super Composer, ? super Integer, Unit> function242 = function2352222222;
                    final Function2<? super Composer, ? super Integer, Unit> function243 = function2362222222;
                    final Shape shape7 = shape62222222;
                    final TextFieldColors textFieldColors5 = textFieldColors42222222;
                    BasicTextFieldKt.BasicTextField(str2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, -288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                            int i47;
                            ComposerKt.sourceInformation(composer3, "C222@11393L743:TextField.kt#uh7d8r");
                            if ((i46 & 6) == 0) {
                                i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                            } else {
                                i47 = i46;
                            }
                            if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-288211827, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:222)");
                                }
                                TextFieldDefaults.INSTANCE.DecorationBox(str3, function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
        }
        function218 = function216;
        visualTransformation3 = visualTransformation2;
        textFieldColors3 = textFieldColors42222222;
        function219 = function28;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        z10 = z7;
        i36 = i33;
        i37 = i34;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        function220 = function217;
        function221 = function213;
        textStyle3 = textStyle2;
        function222 = function29;
        z11 = z9;
        function223 = function212;
        function224 = function215;
        z12 = z6;
        z13 = z8;
        modifier4 = modifier62222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
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
        Modifier modifier2;
        boolean z5;
        TextStyle textStyle2;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i29;
        Function2<? super Composer, ? super Integer, Unit> function211;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i30;
        Shape shape2;
        Modifier modifier3;
        boolean z6;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        TextFieldColors textFieldColors2;
        int i31;
        int i32;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z7;
        int i33;
        int i34;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        boolean z8;
        int i35;
        VisualTransformation visualTransformation2;
        boolean z9;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Function2<? super Composer, ? super Integer, Unit> function217;
        long m5263getColor0d7_KjU;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final VisualTransformation visualTransformation3;
        final TextFieldColors textFieldColors3;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z10;
        final int i36;
        final int i37;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final Function2<? super Composer, ? super Integer, Unit> function224;
        final boolean z12;
        final boolean z13;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i38;
        Composer startRestartGroup = composer.startRestartGroup(-1268528240);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)320@17250L7,335@18002L39,336@18080L5,337@18135L8,345@18497L15,345@18431L1918:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i3 & 384) == 0) {
                i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                        }
                        int i39 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i39 |= 384;
                        } else if ((i4 & 384) == 0) {
                            i39 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i39 |= 3072;
                            } else if ((i4 & 3072) == 0) {
                                i39 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                i20 = i6 & 16384;
                                if (i20 != 0) {
                                    i39 |= 24576;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i4 & 24576) == 0) {
                                        i39 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                                        i22 = i6 & 32768;
                                        if (i22 == 0) {
                                            i39 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i39 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                                        }
                                        i23 = i6 & 65536;
                                        if (i23 == 0) {
                                            i39 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
                                            i39 |= startRestartGroup.changed(keyboardActions) ? 1048576 : 524288;
                                        }
                                        i24 = i6 & 131072;
                                        if (i24 == 0) {
                                            i39 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i39 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
                                        }
                                        if ((i4 & 100663296) == 0) {
                                            i39 |= ((i6 & 262144) == 0 && startRestartGroup.changed(i)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        i25 = i6 & 524288;
                                        if (i25 == 0) {
                                            i39 |= 805306368;
                                        } else if ((i4 & 805306368) == 0) {
                                            i39 |= startRestartGroup.changed(i2) ? 536870912 : 268435456;
                                        }
                                        i26 = i6 & 1048576;
                                        if (i26 == 0) {
                                            i27 = i5 | 6;
                                        } else if ((i5 & 6) == 0) {
                                            i27 = i5 | (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                        } else {
                                            i27 = i5;
                                        }
                                        if ((i5 & 48) == 0) {
                                            i27 |= ((i6 & 2097152) == 0 && startRestartGroup.changed(shape)) ? 32 : 16;
                                        }
                                        if ((i5 & 384) == 0) {
                                            if ((i6 & 4194304) == 0 && startRestartGroup.changed(textFieldColors)) {
                                                i38 = 256;
                                                i27 |= i38;
                                            }
                                            i38 = 128;
                                            i27 |= i38;
                                        }
                                        i28 = i27;
                                        if ((i7 & 306783379) == 306783378 || (306783379 & i39) != 306783378 || (i28 & 147) != 146 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                                                boolean z14 = i9 == 0 ? true : z;
                                                boolean z15 = i10 == 0 ? false : z2;
                                                if ((i6 & 32) == 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    modifier2 = companion;
                                                    z5 = z14;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    textStyle2 = (TextStyle) consume;
                                                    i7 &= -458753;
                                                } else {
                                                    modifier2 = companion;
                                                    z5 = z14;
                                                    textStyle2 = textStyle;
                                                }
                                                function28 = i11 == 0 ? null : function2;
                                                function29 = i12 == 0 ? null : function22;
                                                Function2<? super Composer, ? super Integer, Unit> function225 = i13 == 0 ? null : function23;
                                                Function2<? super Composer, ? super Integer, Unit> function226 = i14 == 0 ? null : function24;
                                                Function2<? super Composer, ? super Integer, Unit> function227 = i15 == 0 ? null : function25;
                                                Function2<? super Composer, ? super Integer, Unit> function228 = i17 == 0 ? null : function26;
                                                function210 = i18 == 0 ? function27 : null;
                                                boolean z16 = i19 == 0 ? false : z3;
                                                VisualTransformation none = i21 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i22 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                KeyboardActions keyboardActions4 = i23 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                boolean z17 = i24 == 0 ? false : z4;
                                                if ((i6 & 262144) == 0) {
                                                    i29 = z17 ? 1 : Integer.MAX_VALUE;
                                                    i39 &= -234881025;
                                                } else {
                                                    i29 = i;
                                                }
                                                int i40 = i25 == 0 ? 1 : i2;
                                                Function2<? super Composer, ? super Integer, Unit> function229 = function225;
                                                if (i26 == 0) {
                                                    startRestartGroup.startReplaceableGroup(-1263323576);
                                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TextField.kt#9igjgp");
                                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                                    function211 = function226;
                                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                                    startRestartGroup.endReplaceableGroup();
                                                } else {
                                                    function211 = function226;
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                }
                                                if ((2097152 & i6) == 0) {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    i30 = 6;
                                                    shape2 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                                    i28 &= -113;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    i30 = 6;
                                                    shape2 = shape;
                                                }
                                                Shape shape5 = shape2;
                                                if ((i6 & 4194304) == 0) {
                                                    TextFieldColors colors = TextFieldDefaults.INSTANCE.colors(startRestartGroup, i30);
                                                    i28 &= -897;
                                                    modifier3 = modifier2;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shape5;
                                                    textFieldColors2 = colors;
                                                    i31 = i7;
                                                    i32 = i39;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    keyboardActions2 = keyboardActions4;
                                                    z7 = z17;
                                                    i33 = i29;
                                                    i34 = i40;
                                                    z6 = z5;
                                                } else {
                                                    modifier3 = modifier2;
                                                    z6 = z5;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shape5;
                                                    textFieldColors2 = textFieldColors;
                                                    i31 = i7;
                                                    i32 = i39;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    keyboardActions2 = keyboardActions4;
                                                    z7 = z17;
                                                    i33 = i29;
                                                    i34 = i40;
                                                }
                                                function212 = function229;
                                                function213 = function227;
                                                z8 = z15;
                                                i35 = i28;
                                                visualTransformation2 = none;
                                                z9 = z16;
                                                function214 = function228;
                                                function215 = function211;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i6 & 32) != 0) {
                                                    i7 &= -458753;
                                                }
                                                if ((262144 & i6) != 0) {
                                                    i39 &= -234881025;
                                                }
                                                if ((2097152 & i6) != 0) {
                                                    i28 &= -113;
                                                }
                                                if ((i6 & 4194304) != 0) {
                                                    i28 &= -897;
                                                }
                                                modifier3 = modifier;
                                                z6 = z;
                                                z8 = z2;
                                                textStyle2 = textStyle;
                                                function28 = function2;
                                                function29 = function22;
                                                function215 = function24;
                                                function214 = function26;
                                                function210 = function27;
                                                z9 = z3;
                                                keyboardOptions2 = keyboardOptions;
                                                keyboardActions2 = keyboardActions;
                                                z7 = z4;
                                                i33 = i;
                                                i34 = i2;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                shape3 = shape;
                                                i31 = i7;
                                                i32 = i39;
                                                i35 = i28;
                                                function212 = function23;
                                                function213 = function25;
                                                visualTransformation2 = visualTransformation;
                                                textFieldColors2 = textFieldColors;
                                            }
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                function216 = function214;
                                                function217 = function210;
                                            } else {
                                                function217 = function210;
                                                function216 = function214;
                                                ComposerKt.traceEventStart(-1268528240, i31, i32, "androidx.compose.material3.TextField (TextField.kt:338)");
                                            }
                                            startRestartGroup.startReplaceableGroup(-1263323311);
                                            ComposerKt.sourceInformation(startRestartGroup, "*341@18295L46");
                                            m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                                            if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                                m5263getColor0d7_KjU = textFieldColors2.textColor$material3_release(z6, z9, mutableInteractionSource4, startRestartGroup, ((i31 >> 9) & 14) | ((i32 >> 6) & 112) | ((i35 << 6) & 896) | ((i35 << 3) & 7168)).getValue().m3417unboximpl();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            final TextStyle merge = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            final TextFieldColors textFieldColors4 = textFieldColors2;
                                            final Modifier modifier5 = modifier3;
                                            final boolean z18 = z9;
                                            final boolean z19 = z6;
                                            final boolean z20 = z8;
                                            final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                            final KeyboardActions keyboardActions5 = keyboardActions2;
                                            final boolean z21 = z7;
                                            final int i41 = i33;
                                            final int i42 = i34;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                            final Function2<? super Composer, ? super Integer, Unit> function230 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function231 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function232 = function212;
                                            final Function2<? super Composer, ? super Integer, Unit> function233 = function215;
                                            final Function2<? super Composer, ? super Integer, Unit> function234 = function213;
                                            final Function2<? super Composer, ? super Integer, Unit> function235 = function216;
                                            final Function2<? super Composer, ? super Integer, Unit> function236 = function217;
                                            final Shape shape6 = shape3;
                                            Modifier modifier6 = modifier3;
                                            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors4.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i43) {
                                                    ComposerKt.sourceInformation(composer2, "C349@18647L38,358@19050L20,346@18524L1819:TextField.kt#uh7d8r");
                                                    if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1163788208, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                                                        }
                                                        Modifier modifier7 = Modifier.this;
                                                        boolean z22 = z18;
                                                        Strings.Companion companion2 = Strings.INSTANCE;
                                                        Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                                        SolidColor solidColor = new SolidColor(textFieldColors4.cursorColor$material3_release(z18, composer2, 0).getValue().m3417unboximpl(), null);
                                                        TextFieldValue textFieldValue2 = textFieldValue;
                                                        Function1<TextFieldValue, Unit> function12 = function1;
                                                        boolean z23 = z19;
                                                        boolean z24 = z20;
                                                        TextStyle textStyle4 = merge;
                                                        KeyboardOptions keyboardOptions6 = keyboardOptions5;
                                                        KeyboardActions keyboardActions6 = keyboardActions5;
                                                        boolean z25 = z21;
                                                        int i44 = i41;
                                                        int i45 = i42;
                                                        VisualTransformation visualTransformation5 = visualTransformation4;
                                                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                        SolidColor solidColor2 = solidColor;
                                                        final TextFieldValue textFieldValue3 = textFieldValue;
                                                        final boolean z26 = z19;
                                                        final boolean z27 = z21;
                                                        final VisualTransformation visualTransformation6 = visualTransformation4;
                                                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                                        final boolean z28 = z18;
                                                        final Function2<Composer, Integer, Unit> function237 = function230;
                                                        final Function2<Composer, Integer, Unit> function238 = function231;
                                                        final Function2<Composer, Integer, Unit> function239 = function232;
                                                        final Function2<Composer, Integer, Unit> function240 = function233;
                                                        final Function2<Composer, Integer, Unit> function241 = function234;
                                                        final Function2<Composer, Integer, Unit> function242 = function235;
                                                        final Function2<Composer, Integer, Unit> function243 = function236;
                                                        final Shape shape7 = shape6;
                                                        final TextFieldColors textFieldColors5 = textFieldColors4;
                                                        BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(3);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function3
                                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                                                int i47;
                                                                ComposerKt.sourceInformation(composer3, "C368@19571L748:TextField.kt#uh7d8r");
                                                                if ((i46 & 6) == 0) {
                                                                    i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                                                } else {
                                                                    i47 = i46;
                                                                }
                                                                if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1751957978, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                                                    }
                                                                    TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer3.skipToGroupEnd();
                                                            }
                                                        }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }), startRestartGroup, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            function218 = function216;
                                            visualTransformation3 = visualTransformation2;
                                            textFieldColors3 = textFieldColors4;
                                            function219 = function28;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions3 = keyboardActions2;
                                            z10 = z7;
                                            i36 = i33;
                                            i37 = i34;
                                            mutableInteractionSource5 = mutableInteractionSource4;
                                            shape4 = shape3;
                                            function220 = function217;
                                            function221 = function213;
                                            textStyle3 = textStyle2;
                                            function222 = function29;
                                            z11 = z9;
                                            function223 = function212;
                                            function224 = function215;
                                            z12 = z6;
                                            z13 = z8;
                                            modifier4 = modifier6;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier;
                                            z12 = z;
                                            z13 = z2;
                                            textStyle3 = textStyle;
                                            function219 = function2;
                                            function222 = function22;
                                            function223 = function23;
                                            function224 = function24;
                                            function221 = function25;
                                            function218 = function26;
                                            function220 = function27;
                                            z11 = z3;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions3 = keyboardActions;
                                            z10 = z4;
                                            i36 = i;
                                            i37 = i2;
                                            mutableInteractionSource5 = mutableInteractionSource;
                                            shape4 = shape;
                                            textFieldColors3 = textFieldColors;
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$6
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i43) {
                                                    TextFieldKt.TextField(TextFieldValue.this, function1, modifier4, z12, z13, textStyle3, function219, function222, function223, function224, function221, function218, function220, z11, visualTransformation3, keyboardOptions3, keyboardActions3, z10, i36, i37, mutableInteractionSource5, shape4, textFieldColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i6 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 131072;
                                if (i24 == 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                i25 = i6 & 524288;
                                if (i25 == 0) {
                                }
                                i26 = i6 & 1048576;
                                if (i26 == 0) {
                                }
                                if ((i5 & 48) == 0) {
                                }
                                if ((i5 & 384) == 0) {
                                }
                                i28 = i27;
                                if ((i7 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i6 & 32) == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if ((i6 & 262144) == 0) {
                                }
                                if (i25 == 0) {
                                }
                                Function2<? super Composer, ? super Integer, Unit> function2292 = function225;
                                if (i26 == 0) {
                                }
                                if ((2097152 & i6) == 0) {
                                }
                                Shape shape52 = shape2;
                                if ((i6 & 4194304) == 0) {
                                }
                                function212 = function2292;
                                function213 = function227;
                                z8 = z15;
                                i35 = i28;
                                visualTransformation2 = none;
                                z9 = z16;
                                function214 = function228;
                                function215 = function211;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(-1263323311);
                                ComposerKt.sourceInformation(startRestartGroup, "*341@18295L46");
                                m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                                if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                final TextStyle merge2 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                final TextFieldColors textFieldColors42 = textFieldColors2;
                                final Modifier modifier52 = modifier3;
                                final boolean z182 = z9;
                                final boolean z192 = z6;
                                final boolean z202 = z8;
                                final KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                final KeyboardActions keyboardActions52 = keyboardActions2;
                                final boolean z212 = z7;
                                final int i412 = i33;
                                final int i422 = i34;
                                final VisualTransformation visualTransformation42 = visualTransformation2;
                                final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                                final Function2<? super Composer, ? super Integer, Unit> function2302 = function28;
                                final Function2<? super Composer, ? super Integer, Unit> function2312 = function29;
                                final Function2<? super Composer, ? super Integer, Unit> function2322 = function212;
                                final Function2<? super Composer, ? super Integer, Unit> function2332 = function215;
                                final Function2<? super Composer, ? super Integer, Unit> function2342 = function213;
                                final Function2<? super Composer, ? super Integer, Unit> function2352 = function216;
                                final Function2<? super Composer, ? super Integer, Unit> function2362 = function217;
                                final Shape shape62 = shape3;
                                Modifier modifier62 = modifier3;
                                CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors42.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i43) {
                                        ComposerKt.sourceInformation(composer2, "C349@18647L38,358@19050L20,346@18524L1819:TextField.kt#uh7d8r");
                                        if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1163788208, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                                            }
                                            Modifier modifier7 = Modifier.this;
                                            boolean z22 = z182;
                                            Strings.Companion companion2 = Strings.INSTANCE;
                                            Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                            SolidColor solidColor = new SolidColor(textFieldColors42.cursorColor$material3_release(z182, composer2, 0).getValue().m3417unboximpl(), null);
                                            TextFieldValue textFieldValue2 = textFieldValue;
                                            Function1<TextFieldValue, Unit> function12 = function1;
                                            boolean z23 = z192;
                                            boolean z24 = z202;
                                            TextStyle textStyle4 = merge2;
                                            KeyboardOptions keyboardOptions6 = keyboardOptions52;
                                            KeyboardActions keyboardActions6 = keyboardActions52;
                                            boolean z25 = z212;
                                            int i44 = i412;
                                            int i45 = i422;
                                            VisualTransformation visualTransformation5 = visualTransformation42;
                                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                            SolidColor solidColor2 = solidColor;
                                            final TextFieldValue textFieldValue3 = textFieldValue;
                                            final boolean z26 = z192;
                                            final boolean z27 = z212;
                                            final VisualTransformation visualTransformation6 = visualTransformation42;
                                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62;
                                            final boolean z28 = z182;
                                            final Function2<? super Composer, ? super Integer, Unit> function237 = function2302;
                                            final Function2<? super Composer, ? super Integer, Unit> function238 = function2312;
                                            final Function2<? super Composer, ? super Integer, Unit> function239 = function2322;
                                            final Function2<? super Composer, ? super Integer, Unit> function240 = function2332;
                                            final Function2<? super Composer, ? super Integer, Unit> function241 = function2342;
                                            final Function2<? super Composer, ? super Integer, Unit> function242 = function2352;
                                            final Function2<? super Composer, ? super Integer, Unit> function243 = function2362;
                                            final Shape shape7 = shape62;
                                            final TextFieldColors textFieldColors5 = textFieldColors42;
                                            BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                                    int i47;
                                                    ComposerKt.sourceInformation(composer3, "C368@19571L748:TextField.kt#uh7d8r");
                                                    if ((i46 & 6) == 0) {
                                                        i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                                    } else {
                                                        i47 = i46;
                                                    }
                                                    if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1751957978, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function218 = function216;
                                visualTransformation3 = visualTransformation2;
                                textFieldColors3 = textFieldColors42;
                                function219 = function28;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                z10 = z7;
                                i36 = i33;
                                i37 = i34;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                shape4 = shape3;
                                function220 = function217;
                                function221 = function213;
                                textStyle3 = textStyle2;
                                function222 = function29;
                                z11 = z9;
                                function223 = function212;
                                function224 = function215;
                                z12 = z6;
                                z13 = z8;
                                modifier4 = modifier62;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 != 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i6 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 == 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            i25 = i6 & 524288;
                            if (i25 == 0) {
                            }
                            i26 = i6 & 1048576;
                            if (i26 == 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            if ((i5 & 384) == 0) {
                            }
                            i28 = i27;
                            if ((i7 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i6 & 32) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            if ((i6 & 262144) == 0) {
                            }
                            if (i25 == 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function22922 = function225;
                            if (i26 == 0) {
                            }
                            if ((2097152 & i6) == 0) {
                            }
                            Shape shape522 = shape2;
                            if ((i6 & 4194304) == 0) {
                            }
                            function212 = function22922;
                            function213 = function227;
                            z8 = z15;
                            i35 = i28;
                            visualTransformation2 = none;
                            z9 = z16;
                            function214 = function228;
                            function215 = function211;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceableGroup(-1263323311);
                            ComposerKt.sourceInformation(startRestartGroup, "*341@18295L46");
                            m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                            if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            final TextStyle merge22 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                            final TextFieldColors textFieldColors422 = textFieldColors2;
                            final Modifier modifier522 = modifier3;
                            final boolean z1822 = z9;
                            final boolean z1922 = z6;
                            final boolean z2022 = z8;
                            final KeyboardOptions keyboardOptions522 = keyboardOptions2;
                            final KeyboardActions keyboardActions522 = keyboardActions2;
                            final boolean z2122 = z7;
                            final int i4122 = i33;
                            final int i4222 = i34;
                            final VisualTransformation visualTransformation422 = visualTransformation2;
                            final MutableInteractionSource mutableInteractionSource622 = mutableInteractionSource4;
                            final Function2<? super Composer, ? super Integer, Unit> function23022 = function28;
                            final Function2<? super Composer, ? super Integer, Unit> function23122 = function29;
                            final Function2<? super Composer, ? super Integer, Unit> function23222 = function212;
                            final Function2<? super Composer, ? super Integer, Unit> function23322 = function215;
                            final Function2<? super Composer, ? super Integer, Unit> function23422 = function213;
                            final Function2<? super Composer, ? super Integer, Unit> function23522 = function216;
                            final Function2<? super Composer, ? super Integer, Unit> function23622 = function217;
                            final Shape shape622 = shape3;
                            Modifier modifier622 = modifier3;
                            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors422.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i43) {
                                    ComposerKt.sourceInformation(composer2, "C349@18647L38,358@19050L20,346@18524L1819:TextField.kt#uh7d8r");
                                    if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1163788208, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                                        }
                                        Modifier modifier7 = Modifier.this;
                                        boolean z22 = z1822;
                                        Strings.Companion companion2 = Strings.INSTANCE;
                                        Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                        SolidColor solidColor = new SolidColor(textFieldColors422.cursorColor$material3_release(z1822, composer2, 0).getValue().m3417unboximpl(), null);
                                        TextFieldValue textFieldValue2 = textFieldValue;
                                        Function1<TextFieldValue, Unit> function12 = function1;
                                        boolean z23 = z1922;
                                        boolean z24 = z2022;
                                        TextStyle textStyle4 = merge22;
                                        KeyboardOptions keyboardOptions6 = keyboardOptions522;
                                        KeyboardActions keyboardActions6 = keyboardActions522;
                                        boolean z25 = z2122;
                                        int i44 = i4122;
                                        int i45 = i4222;
                                        VisualTransformation visualTransformation5 = visualTransformation422;
                                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622;
                                        SolidColor solidColor2 = solidColor;
                                        final TextFieldValue textFieldValue3 = textFieldValue;
                                        final boolean z26 = z1922;
                                        final boolean z27 = z2122;
                                        final VisualTransformation visualTransformation6 = visualTransformation422;
                                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource622;
                                        final boolean z28 = z1822;
                                        final Function2<? super Composer, ? super Integer, Unit> function237 = function23022;
                                        final Function2<? super Composer, ? super Integer, Unit> function238 = function23122;
                                        final Function2<? super Composer, ? super Integer, Unit> function239 = function23222;
                                        final Function2<? super Composer, ? super Integer, Unit> function240 = function23322;
                                        final Function2<? super Composer, ? super Integer, Unit> function241 = function23422;
                                        final Function2<? super Composer, ? super Integer, Unit> function242 = function23522;
                                        final Function2<? super Composer, ? super Integer, Unit> function243 = function23622;
                                        final Shape shape7 = shape622;
                                        final TextFieldColors textFieldColors5 = textFieldColors422;
                                        BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                                int i47;
                                                ComposerKt.sourceInformation(composer3, "C368@19571L748:TextField.kt#uh7d8r");
                                                if ((i46 & 6) == 0) {
                                                    i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                                } else {
                                                    i47 = i46;
                                                }
                                                if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1751957978, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function218 = function216;
                            visualTransformation3 = visualTransformation2;
                            textFieldColors3 = textFieldColors422;
                            function219 = function28;
                            keyboardOptions3 = keyboardOptions2;
                            keyboardActions3 = keyboardActions2;
                            z10 = z7;
                            i36 = i33;
                            i37 = i34;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            shape4 = shape3;
                            function220 = function217;
                            function221 = function213;
                            textStyle3 = textStyle2;
                            function222 = function29;
                            z11 = z9;
                            function223 = function212;
                            function224 = function215;
                            z12 = z6;
                            z13 = z8;
                            modifier4 = modifier622;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i6 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        i25 = i6 & 524288;
                        if (i25 == 0) {
                        }
                        i26 = i6 & 1048576;
                        if (i26 == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        if ((i5 & 384) == 0) {
                        }
                        i28 = i27;
                        if ((i7 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 262144) == 0) {
                        }
                        if (i25 == 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function229222 = function225;
                        if (i26 == 0) {
                        }
                        if ((2097152 & i6) == 0) {
                        }
                        Shape shape5222 = shape2;
                        if ((i6 & 4194304) == 0) {
                        }
                        function212 = function229222;
                        function213 = function227;
                        z8 = z15;
                        i35 = i28;
                        visualTransformation2 = none;
                        z9 = z16;
                        function214 = function228;
                        function215 = function211;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(-1263323311);
                        ComposerKt.sourceInformation(startRestartGroup, "*341@18295L46");
                        m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                        if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        final TextStyle merge222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        final TextFieldColors textFieldColors4222 = textFieldColors2;
                        final Modifier modifier5222 = modifier3;
                        final boolean z18222 = z9;
                        final boolean z19222 = z6;
                        final boolean z20222 = z8;
                        final KeyboardOptions keyboardOptions5222 = keyboardOptions2;
                        final KeyboardActions keyboardActions5222 = keyboardActions2;
                        final boolean z21222 = z7;
                        final int i41222 = i33;
                        final int i42222 = i34;
                        final VisualTransformation visualTransformation4222 = visualTransformation2;
                        final MutableInteractionSource mutableInteractionSource6222 = mutableInteractionSource4;
                        final Function2<? super Composer, ? super Integer, Unit> function230222 = function28;
                        final Function2<? super Composer, ? super Integer, Unit> function231222 = function29;
                        final Function2<? super Composer, ? super Integer, Unit> function232222 = function212;
                        final Function2<? super Composer, ? super Integer, Unit> function233222 = function215;
                        final Function2<? super Composer, ? super Integer, Unit> function234222 = function213;
                        final Function2<? super Composer, ? super Integer, Unit> function235222 = function216;
                        final Function2<? super Composer, ? super Integer, Unit> function236222 = function217;
                        final Shape shape6222 = shape3;
                        Modifier modifier6222 = modifier3;
                        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors4222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i43) {
                                ComposerKt.sourceInformation(composer2, "C349@18647L38,358@19050L20,346@18524L1819:TextField.kt#uh7d8r");
                                if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1163788208, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                                    }
                                    Modifier modifier7 = Modifier.this;
                                    boolean z22 = z18222;
                                    Strings.Companion companion2 = Strings.INSTANCE;
                                    Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                    SolidColor solidColor = new SolidColor(textFieldColors4222.cursorColor$material3_release(z18222, composer2, 0).getValue().m3417unboximpl(), null);
                                    TextFieldValue textFieldValue2 = textFieldValue;
                                    Function1<TextFieldValue, Unit> function12 = function1;
                                    boolean z23 = z19222;
                                    boolean z24 = z20222;
                                    TextStyle textStyle4 = merge222;
                                    KeyboardOptions keyboardOptions6 = keyboardOptions5222;
                                    KeyboardActions keyboardActions6 = keyboardActions5222;
                                    boolean z25 = z21222;
                                    int i44 = i41222;
                                    int i45 = i42222;
                                    VisualTransformation visualTransformation5 = visualTransformation4222;
                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6222;
                                    SolidColor solidColor2 = solidColor;
                                    final TextFieldValue textFieldValue3 = textFieldValue;
                                    final boolean z26 = z19222;
                                    final boolean z27 = z21222;
                                    final VisualTransformation visualTransformation6 = visualTransformation4222;
                                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6222;
                                    final boolean z28 = z18222;
                                    final Function2<? super Composer, ? super Integer, Unit> function237 = function230222;
                                    final Function2<? super Composer, ? super Integer, Unit> function238 = function231222;
                                    final Function2<? super Composer, ? super Integer, Unit> function239 = function232222;
                                    final Function2<? super Composer, ? super Integer, Unit> function240 = function233222;
                                    final Function2<? super Composer, ? super Integer, Unit> function241 = function234222;
                                    final Function2<? super Composer, ? super Integer, Unit> function242 = function235222;
                                    final Function2<? super Composer, ? super Integer, Unit> function243 = function236222;
                                    final Shape shape7 = shape6222;
                                    final TextFieldColors textFieldColors5 = textFieldColors4222;
                                    BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                            int i47;
                                            ComposerKt.sourceInformation(composer3, "C368@19571L748:TextField.kt#uh7d8r");
                                            if ((i46 & 6) == 0) {
                                                i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                            } else {
                                                i47 = i46;
                                            }
                                            if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1751957978, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                                }
                                                TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function218 = function216;
                        visualTransformation3 = visualTransformation2;
                        textFieldColors3 = textFieldColors4222;
                        function219 = function28;
                        keyboardOptions3 = keyboardOptions2;
                        keyboardActions3 = keyboardActions2;
                        z10 = z7;
                        i36 = i33;
                        i37 = i34;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape4 = shape3;
                        function220 = function217;
                        function221 = function213;
                        textStyle3 = textStyle2;
                        function222 = function29;
                        z11 = z9;
                        function223 = function212;
                        function224 = function215;
                        z12 = z6;
                        z13 = z8;
                        modifier4 = modifier6222;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i392 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i6 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    i25 = i6 & 524288;
                    if (i25 == 0) {
                    }
                    i26 = i6 & 1048576;
                    if (i26 == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    if ((i5 & 384) == 0) {
                    }
                    i28 = i27;
                    if ((i7 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 262144) == 0) {
                    }
                    if (i25 == 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function2292222 = function225;
                    if (i26 == 0) {
                    }
                    if ((2097152 & i6) == 0) {
                    }
                    Shape shape52222 = shape2;
                    if ((i6 & 4194304) == 0) {
                    }
                    function212 = function2292222;
                    function213 = function227;
                    z8 = z15;
                    i35 = i28;
                    visualTransformation2 = none;
                    z9 = z16;
                    function214 = function228;
                    function215 = function211;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-1263323311);
                    ComposerKt.sourceInformation(startRestartGroup, "*341@18295L46");
                    m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                    if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    final TextStyle merge2222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    final TextFieldColors textFieldColors42222 = textFieldColors2;
                    final Modifier modifier52222 = modifier3;
                    final boolean z182222 = z9;
                    final boolean z192222 = z6;
                    final boolean z202222 = z8;
                    final KeyboardOptions keyboardOptions52222 = keyboardOptions2;
                    final KeyboardActions keyboardActions52222 = keyboardActions2;
                    final boolean z212222 = z7;
                    final int i412222 = i33;
                    final int i422222 = i34;
                    final VisualTransformation visualTransformation42222 = visualTransformation2;
                    final MutableInteractionSource mutableInteractionSource62222 = mutableInteractionSource4;
                    final Function2<? super Composer, ? super Integer, Unit> function2302222 = function28;
                    final Function2<? super Composer, ? super Integer, Unit> function2312222 = function29;
                    final Function2<? super Composer, ? super Integer, Unit> function2322222 = function212;
                    final Function2<? super Composer, ? super Integer, Unit> function2332222 = function215;
                    final Function2<? super Composer, ? super Integer, Unit> function2342222 = function213;
                    final Function2<? super Composer, ? super Integer, Unit> function2352222 = function216;
                    final Function2<? super Composer, ? super Integer, Unit> function2362222 = function217;
                    final Shape shape62222 = shape3;
                    Modifier modifier62222 = modifier3;
                    CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors42222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i43) {
                            ComposerKt.sourceInformation(composer2, "C349@18647L38,358@19050L20,346@18524L1819:TextField.kt#uh7d8r");
                            if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1163788208, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                                }
                                Modifier modifier7 = Modifier.this;
                                boolean z22 = z182222;
                                Strings.Companion companion2 = Strings.INSTANCE;
                                Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                                SolidColor solidColor = new SolidColor(textFieldColors42222.cursorColor$material3_release(z182222, composer2, 0).getValue().m3417unboximpl(), null);
                                TextFieldValue textFieldValue2 = textFieldValue;
                                Function1<TextFieldValue, Unit> function12 = function1;
                                boolean z23 = z192222;
                                boolean z24 = z202222;
                                TextStyle textStyle4 = merge2222;
                                KeyboardOptions keyboardOptions6 = keyboardOptions52222;
                                KeyboardActions keyboardActions6 = keyboardActions52222;
                                boolean z25 = z212222;
                                int i44 = i412222;
                                int i45 = i422222;
                                VisualTransformation visualTransformation5 = visualTransformation42222;
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62222;
                                SolidColor solidColor2 = solidColor;
                                final TextFieldValue textFieldValue3 = textFieldValue;
                                final boolean z26 = z192222;
                                final boolean z27 = z212222;
                                final VisualTransformation visualTransformation6 = visualTransformation42222;
                                final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62222;
                                final boolean z28 = z182222;
                                final Function2<? super Composer, ? super Integer, Unit> function237 = function2302222;
                                final Function2<? super Composer, ? super Integer, Unit> function238 = function2312222;
                                final Function2<? super Composer, ? super Integer, Unit> function239 = function2322222;
                                final Function2<? super Composer, ? super Integer, Unit> function240 = function2332222;
                                final Function2<? super Composer, ? super Integer, Unit> function241 = function2342222;
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function2352222;
                                final Function2<? super Composer, ? super Integer, Unit> function243 = function2362222;
                                final Shape shape7 = shape62222;
                                final TextFieldColors textFieldColors5 = textFieldColors42222;
                                BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                        int i47;
                                        ComposerKt.sourceInformation(composer3, "C368@19571L748:TextField.kt#uh7d8r");
                                        if ((i46 & 6) == 0) {
                                            i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                        } else {
                                            i47 = i46;
                                        }
                                        if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1751957978, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                            }
                                            TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function218 = function216;
                    visualTransformation3 = visualTransformation2;
                    textFieldColors3 = textFieldColors42222;
                    function219 = function28;
                    keyboardOptions3 = keyboardOptions2;
                    keyboardActions3 = keyboardActions2;
                    z10 = z7;
                    i36 = i33;
                    i37 = i34;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    function220 = function217;
                    function221 = function213;
                    textStyle3 = textStyle2;
                    function222 = function29;
                    z11 = z9;
                    function223 = function212;
                    function224 = function215;
                    z12 = z6;
                    z13 = z8;
                    modifier4 = modifier62222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3922 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 != 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                i23 = i6 & 65536;
                if (i23 == 0) {
                }
                i24 = i6 & 131072;
                if (i24 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                i25 = i6 & 524288;
                if (i25 == 0) {
                }
                i26 = i6 & 1048576;
                if (i26 == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                if ((i5 & 384) == 0) {
                }
                i28 = i27;
                if ((i7 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i6 & 262144) == 0) {
                }
                if (i25 == 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function22922222 = function225;
                if (i26 == 0) {
                }
                if ((2097152 & i6) == 0) {
                }
                Shape shape522222 = shape2;
                if ((i6 & 4194304) == 0) {
                }
                function212 = function22922222;
                function213 = function227;
                z8 = z15;
                i35 = i28;
                visualTransformation2 = none;
                z9 = z16;
                function214 = function228;
                function215 = function211;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1263323311);
                ComposerKt.sourceInformation(startRestartGroup, "*341@18295L46");
                m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                final TextStyle merge22222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                final TextFieldColors textFieldColors422222 = textFieldColors2;
                final Modifier modifier522222 = modifier3;
                final boolean z1822222 = z9;
                final boolean z1922222 = z6;
                final boolean z2022222 = z8;
                final KeyboardOptions keyboardOptions522222 = keyboardOptions2;
                final KeyboardActions keyboardActions522222 = keyboardActions2;
                final boolean z2122222 = z7;
                final int i4122222 = i33;
                final int i4222222 = i34;
                final VisualTransformation visualTransformation422222 = visualTransformation2;
                final MutableInteractionSource mutableInteractionSource622222 = mutableInteractionSource4;
                final Function2<? super Composer, ? super Integer, Unit> function23022222 = function28;
                final Function2<? super Composer, ? super Integer, Unit> function23122222 = function29;
                final Function2<? super Composer, ? super Integer, Unit> function23222222 = function212;
                final Function2<? super Composer, ? super Integer, Unit> function23322222 = function215;
                final Function2<? super Composer, ? super Integer, Unit> function23422222 = function213;
                final Function2<? super Composer, ? super Integer, Unit> function23522222 = function216;
                final Function2<? super Composer, ? super Integer, Unit> function23622222 = function217;
                final Shape shape622222 = shape3;
                Modifier modifier622222 = modifier3;
                CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors422222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i43) {
                        ComposerKt.sourceInformation(composer2, "C349@18647L38,358@19050L20,346@18524L1819:TextField.kt#uh7d8r");
                        if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1163788208, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                            }
                            Modifier modifier7 = Modifier.this;
                            boolean z22 = z1822222;
                            Strings.Companion companion2 = Strings.INSTANCE;
                            Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                            SolidColor solidColor = new SolidColor(textFieldColors422222.cursorColor$material3_release(z1822222, composer2, 0).getValue().m3417unboximpl(), null);
                            TextFieldValue textFieldValue2 = textFieldValue;
                            Function1<TextFieldValue, Unit> function12 = function1;
                            boolean z23 = z1922222;
                            boolean z24 = z2022222;
                            TextStyle textStyle4 = merge22222;
                            KeyboardOptions keyboardOptions6 = keyboardOptions522222;
                            KeyboardActions keyboardActions6 = keyboardActions522222;
                            boolean z25 = z2122222;
                            int i44 = i4122222;
                            int i45 = i4222222;
                            VisualTransformation visualTransformation5 = visualTransformation422222;
                            MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource622222;
                            SolidColor solidColor2 = solidColor;
                            final TextFieldValue textFieldValue3 = textFieldValue;
                            final boolean z26 = z1922222;
                            final boolean z27 = z2122222;
                            final VisualTransformation visualTransformation6 = visualTransformation422222;
                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource622222;
                            final boolean z28 = z1822222;
                            final Function2<? super Composer, ? super Integer, Unit> function237 = function23022222;
                            final Function2<? super Composer, ? super Integer, Unit> function238 = function23122222;
                            final Function2<? super Composer, ? super Integer, Unit> function239 = function23222222;
                            final Function2<? super Composer, ? super Integer, Unit> function240 = function23322222;
                            final Function2<? super Composer, ? super Integer, Unit> function241 = function23422222;
                            final Function2<? super Composer, ? super Integer, Unit> function242 = function23522222;
                            final Function2<? super Composer, ? super Integer, Unit> function243 = function23622222;
                            final Shape shape7 = shape622222;
                            final TextFieldColors textFieldColors5 = textFieldColors422222;
                            BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                    int i47;
                                    ComposerKt.sourceInformation(composer3, "C368@19571L748:TextField.kt#uh7d8r");
                                    if ((i46 & 6) == 0) {
                                        i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                    } else {
                                        i47 = i46;
                                    }
                                    if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1751957978, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                        }
                                        TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                function218 = function216;
                visualTransformation3 = visualTransformation2;
                textFieldColors3 = textFieldColors422222;
                function219 = function28;
                keyboardOptions3 = keyboardOptions2;
                keyboardActions3 = keyboardActions2;
                z10 = z7;
                i36 = i33;
                i37 = i34;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape4 = shape3;
                function220 = function217;
                function221 = function213;
                textStyle3 = textStyle2;
                function222 = function29;
                z11 = z9;
                function223 = function212;
                function224 = function215;
                z12 = z6;
                z13 = z8;
                modifier4 = modifier622222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i39222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 != 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            i23 = i6 & 65536;
            if (i23 == 0) {
            }
            i24 = i6 & 131072;
            if (i24 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i25 = i6 & 524288;
            if (i25 == 0) {
            }
            i26 = i6 & 1048576;
            if (i26 == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            i28 = i27;
            if ((i7 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i6 & 262144) == 0) {
            }
            if (i25 == 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function229222222 = function225;
            if (i26 == 0) {
            }
            if ((2097152 & i6) == 0) {
            }
            Shape shape5222222 = shape2;
            if ((i6 & 4194304) == 0) {
            }
            function212 = function229222222;
            function213 = function227;
            z8 = z15;
            i35 = i28;
            visualTransformation2 = none;
            z9 = z16;
            function214 = function228;
            function215 = function211;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1263323311);
            ComposerKt.sourceInformation(startRestartGroup, "*341@18295L46");
            m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
            if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            final TextStyle merge222222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            final TextFieldColors textFieldColors4222222 = textFieldColors2;
            final Modifier modifier5222222 = modifier3;
            final boolean z18222222 = z9;
            final boolean z19222222 = z6;
            final boolean z20222222 = z8;
            final KeyboardOptions keyboardOptions5222222 = keyboardOptions2;
            final KeyboardActions keyboardActions5222222 = keyboardActions2;
            final boolean z21222222 = z7;
            final int i41222222 = i33;
            final int i42222222 = i34;
            final VisualTransformation visualTransformation4222222 = visualTransformation2;
            final MutableInteractionSource mutableInteractionSource6222222 = mutableInteractionSource4;
            final Function2<? super Composer, ? super Integer, Unit> function230222222 = function28;
            final Function2<? super Composer, ? super Integer, Unit> function231222222 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function232222222 = function212;
            final Function2<? super Composer, ? super Integer, Unit> function233222222 = function215;
            final Function2<? super Composer, ? super Integer, Unit> function234222222 = function213;
            final Function2<? super Composer, ? super Integer, Unit> function235222222 = function216;
            final Function2<? super Composer, ? super Integer, Unit> function236222222 = function217;
            final Shape shape6222222 = shape3;
            Modifier modifier6222222 = modifier3;
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors4222222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i43) {
                    ComposerKt.sourceInformation(composer2, "C349@18647L38,358@19050L20,346@18524L1819:TextField.kt#uh7d8r");
                    if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1163788208, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                        }
                        Modifier modifier7 = Modifier.this;
                        boolean z22 = z18222222;
                        Strings.Companion companion2 = Strings.INSTANCE;
                        Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                        SolidColor solidColor = new SolidColor(textFieldColors4222222.cursorColor$material3_release(z18222222, composer2, 0).getValue().m3417unboximpl(), null);
                        TextFieldValue textFieldValue2 = textFieldValue;
                        Function1<TextFieldValue, Unit> function12 = function1;
                        boolean z23 = z19222222;
                        boolean z24 = z20222222;
                        TextStyle textStyle4 = merge222222;
                        KeyboardOptions keyboardOptions6 = keyboardOptions5222222;
                        KeyboardActions keyboardActions6 = keyboardActions5222222;
                        boolean z25 = z21222222;
                        int i44 = i41222222;
                        int i45 = i42222222;
                        VisualTransformation visualTransformation5 = visualTransformation4222222;
                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6222222;
                        SolidColor solidColor2 = solidColor;
                        final TextFieldValue textFieldValue3 = textFieldValue;
                        final boolean z26 = z19222222;
                        final boolean z27 = z21222222;
                        final VisualTransformation visualTransformation6 = visualTransformation4222222;
                        final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6222222;
                        final boolean z28 = z18222222;
                        final Function2<? super Composer, ? super Integer, Unit> function237 = function230222222;
                        final Function2<? super Composer, ? super Integer, Unit> function238 = function231222222;
                        final Function2<? super Composer, ? super Integer, Unit> function239 = function232222222;
                        final Function2<? super Composer, ? super Integer, Unit> function240 = function233222222;
                        final Function2<? super Composer, ? super Integer, Unit> function241 = function234222222;
                        final Function2<? super Composer, ? super Integer, Unit> function242 = function235222222;
                        final Function2<? super Composer, ? super Integer, Unit> function243 = function236222222;
                        final Shape shape7 = shape6222222;
                        final TextFieldColors textFieldColors5 = textFieldColors4222222;
                        BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                                int i47;
                                ComposerKt.sourceInformation(composer3, "C368@19571L748:TextField.kt#uh7d8r");
                                if ((i46 & 6) == 0) {
                                    i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                                } else {
                                    i47 = i46;
                                }
                                if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1751957978, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                    }
                                    TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            function218 = function216;
            visualTransformation3 = visualTransformation2;
            textFieldColors3 = textFieldColors4222222;
            function219 = function28;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            z10 = z7;
            i36 = i33;
            i37 = i34;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            function220 = function217;
            function221 = function213;
            textStyle3 = textStyle2;
            function222 = function29;
            z11 = z9;
            function223 = function212;
            function224 = function215;
            z12 = z6;
            z13 = z8;
            modifier4 = modifier6222222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i392222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 != 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        i23 = i6 & 65536;
        if (i23 == 0) {
        }
        i24 = i6 & 131072;
        if (i24 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i25 = i6 & 524288;
        if (i25 == 0) {
        }
        i26 = i6 & 1048576;
        if (i26 == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        i28 = i27;
        if ((i7 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i6 & 262144) == 0) {
        }
        if (i25 == 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function2292222222 = function225;
        if (i26 == 0) {
        }
        if ((2097152 & i6) == 0) {
        }
        Shape shape52222222 = shape2;
        if ((i6 & 4194304) == 0) {
        }
        function212 = function2292222222;
        function213 = function227;
        z8 = z15;
        i35 = i28;
        visualTransformation2 = none;
        z9 = z16;
        function214 = function228;
        function215 = function211;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1263323311);
        ComposerKt.sourceInformation(startRestartGroup, "*341@18295L46");
        m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
        if (m5263getColor0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        final TextStyle merge2222222 = textStyle2.merge(new TextStyle(m5263getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        final TextFieldColors textFieldColors42222222 = textFieldColors2;
        final Modifier modifier52222222 = modifier3;
        final boolean z182222222 = z9;
        final boolean z192222222 = z6;
        final boolean z202222222 = z8;
        final KeyboardOptions keyboardOptions52222222 = keyboardOptions2;
        final KeyboardActions keyboardActions52222222 = keyboardActions2;
        final boolean z212222222 = z7;
        final int i412222222 = i33;
        final int i422222222 = i34;
        final VisualTransformation visualTransformation42222222 = visualTransformation2;
        final MutableInteractionSource mutableInteractionSource62222222 = mutableInteractionSource4;
        final Function2<? super Composer, ? super Integer, Unit> function2302222222 = function28;
        final Function2<? super Composer, ? super Integer, Unit> function2312222222 = function29;
        final Function2<? super Composer, ? super Integer, Unit> function2322222222 = function212;
        final Function2<? super Composer, ? super Integer, Unit> function2332222222 = function215;
        final Function2<? super Composer, ? super Integer, Unit> function2342222222 = function213;
        final Function2<? super Composer, ? super Integer, Unit> function2352222222 = function216;
        final Function2<? super Composer, ? super Integer, Unit> function2362222222 = function217;
        final Shape shape62222222 = shape3;
        Modifier modifier62222222 = modifier3;
        CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors42222222.getSelectionColors(startRestartGroup, (i35 >> 6) & 14)), ComposableLambdaKt.composableLambda(startRestartGroup, -1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i43) {
                ComposerKt.sourceInformation(composer2, "C349@18647L38,358@19050L20,346@18524L1819:TextField.kt#uh7d8r");
                if ((i43 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1163788208, i43, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
                    }
                    Modifier modifier7 = Modifier.this;
                    boolean z22 = z182222222;
                    Strings.Companion companion2 = Strings.INSTANCE;
                    Modifier m595defaultMinSizeVpY3zN4 = SizeKt.m595defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier7, z22, Strings_androidKt.m1967getStringNWtq28(Strings.m1898constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2101getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2100getMinHeightD9Ej5fM());
                    SolidColor solidColor = new SolidColor(textFieldColors42222222.cursorColor$material3_release(z182222222, composer2, 0).getValue().m3417unboximpl(), null);
                    TextFieldValue textFieldValue2 = textFieldValue;
                    Function1<TextFieldValue, Unit> function12 = function1;
                    boolean z23 = z192222222;
                    boolean z24 = z202222222;
                    TextStyle textStyle4 = merge2222222;
                    KeyboardOptions keyboardOptions6 = keyboardOptions52222222;
                    KeyboardActions keyboardActions6 = keyboardActions52222222;
                    boolean z25 = z212222222;
                    int i44 = i412222222;
                    int i45 = i422222222;
                    VisualTransformation visualTransformation5 = visualTransformation42222222;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62222222;
                    SolidColor solidColor2 = solidColor;
                    final TextFieldValue textFieldValue3 = textFieldValue;
                    final boolean z26 = z192222222;
                    final boolean z27 = z212222222;
                    final VisualTransformation visualTransformation6 = visualTransformation42222222;
                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource62222222;
                    final boolean z28 = z182222222;
                    final Function2<? super Composer, ? super Integer, Unit> function237 = function2302222222;
                    final Function2<? super Composer, ? super Integer, Unit> function238 = function2312222222;
                    final Function2<? super Composer, ? super Integer, Unit> function239 = function2322222222;
                    final Function2<? super Composer, ? super Integer, Unit> function240 = function2332222222;
                    final Function2<? super Composer, ? super Integer, Unit> function241 = function2342222222;
                    final Function2<? super Composer, ? super Integer, Unit> function242 = function2352222222;
                    final Function2<? super Composer, ? super Integer, Unit> function243 = function2362222222;
                    final Shape shape7 = shape62222222;
                    final TextFieldColors textFieldColors5 = textFieldColors42222222;
                    BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m595defaultMinSizeVpY3zN4, z23, z24, textStyle4, keyboardOptions6, keyboardActions6, z25, i44, i45, visualTransformation5, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, solidColor2, ComposableLambdaKt.composableLambda(composer2, 1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function244, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function244, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function244, Composer composer3, int i46) {
                            int i47;
                            ComposerKt.sourceInformation(composer3, "C368@19571L748:TextField.kt#uh7d8r");
                            if ((i46 & 6) == 0) {
                                i47 = i46 | (composer3.changedInstance(function244) ? 4 : 2);
                            } else {
                                i47 = i46;
                            }
                            if ((i47 & 19) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1751957978, i47, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
                                }
                                TextFieldDefaults.INSTANCE.DecorationBox(TextFieldValue.this.getText(), function244, z26, z27, visualTransformation6, mutableInteractionSource8, z28, function237, function238, function239, function240, function241, function242, function243, shape7, textFieldColors5, null, null, composer3, (i47 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
        }
        function218 = function216;
        visualTransformation3 = visualTransformation2;
        textFieldColors3 = textFieldColors42222222;
        function219 = function28;
        keyboardOptions3 = keyboardOptions2;
        keyboardActions3 = keyboardActions2;
        z10 = z7;
        i36 = i33;
        i37 = i34;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        function220 = function217;
        function221 = function213;
        textStyle3 = textStyle2;
        function222 = function29;
        z11 = z9;
        function223 = function212;
        function224 = function215;
        z12 = z6;
        z13 = z8;
        modifier4 = modifier62222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z5;
        Modifier modifier2;
        TextStyle textStyle2;
        Function2 function26;
        Function2 function27;
        final Function2 function28;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i26;
        Function2 function29;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i27;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        TextFieldColors textFieldColors2;
        int i28;
        int i29;
        boolean z6;
        int i30;
        boolean z7;
        int i31;
        Modifier modifier3;
        Function2 function210;
        VisualTransformation visualTransformation2;
        boolean z8;
        Function2 function211;
        Composer composer2;
        KeyboardActions keyboardActions3;
        final KeyboardActions keyboardActions4;
        final Function2 function212;
        final VisualTransformation visualTransformation3;
        final TextStyle textStyle3;
        final Function2 function213;
        final boolean z9;
        final int i32;
        final int i33;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final TextFieldColors textFieldColors3;
        final Modifier modifier4;
        final Function2 function214;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final KeyboardOptions keyboardOptions3;
        final Function2 function215;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1500728277);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(19,11,10,1,13,17,6,12,7,18,16,3,20,5,4,15,8,9,2,14)400@20694L7,413@21354L39,414@21432L5,415@21487L8,417@21504L763:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i3 & 384) == 0) {
                i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= startRestartGroup.changed(z3) ? 32 : 16;
                        }
                        int i34 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i34 |= 384;
                        } else if ((i4 & 384) == 0) {
                            i34 |= startRestartGroup.changed(visualTransformation) ? 256 : 128;
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i34 |= 3072;
                            } else if ((i4 & 3072) == 0) {
                                i34 |= startRestartGroup.changed(keyboardOptions) ? 2048 : 1024;
                                i20 = i6 & 16384;
                                if (i20 != 0) {
                                    i34 |= 24576;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i4 & 24576) == 0) {
                                        i34 |= startRestartGroup.changed(keyboardActions) ? 16384 : 8192;
                                        i22 = i6 & 32768;
                                        if (i22 == 0) {
                                            i34 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i34 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                                        }
                                        if ((i4 & 1572864) == 0) {
                                            i34 |= ((i6 & 65536) == 0 && startRestartGroup.changed(i)) ? 1048576 : 524288;
                                        }
                                        i23 = i6 & 131072;
                                        if (i23 == 0) {
                                            i34 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i34 |= startRestartGroup.changed(i2) ? 8388608 : 4194304;
                                        }
                                        i24 = i6 & 262144;
                                        if (i24 == 0) {
                                            i34 |= 100663296;
                                        } else if ((i4 & 100663296) == 0) {
                                            i34 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        if ((i4 & 805306368) == 0) {
                                            i34 |= ((i6 & 524288) == 0 && startRestartGroup.changed(shape)) ? 536870912 : 268435456;
                                        }
                                        if ((i5 & 6) != 0) {
                                            i25 = i5 | (((i6 & 1048576) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2);
                                        } else {
                                            i25 = i5;
                                        }
                                        if ((i7 & 306783379) == 306783378 || (306783379 & i34) != 306783378 || (i25 & 3) != 2 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                                                z5 = i9 == 0 ? true : z;
                                                boolean z13 = i10 == 0 ? false : z2;
                                                if ((i6 & 32) == 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    modifier2 = companion;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    textStyle2 = (TextStyle) consume;
                                                    i7 &= -458753;
                                                } else {
                                                    modifier2 = companion;
                                                    textStyle2 = textStyle;
                                                }
                                                function26 = i11 == 0 ? null : function2;
                                                function27 = i12 == 0 ? null : function22;
                                                Function2 function216 = i13 == 0 ? null : function23;
                                                Function2 function217 = i14 == 0 ? null : function24;
                                                function28 = i15 == 0 ? function25 : null;
                                                boolean z14 = i17 == 0 ? false : z3;
                                                VisualTransformation none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                keyboardOptions2 = i19 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                keyboardActions2 = i21 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                boolean z15 = i22 == 0 ? false : z4;
                                                if ((i6 & 65536) == 0) {
                                                    i26 = z15 ? 1 : Integer.MAX_VALUE;
                                                    i34 &= -3670017;
                                                } else {
                                                    i26 = i;
                                                }
                                                int i35 = i23 == 0 ? 1 : i2;
                                                Function2 function218 = function216;
                                                if (i24 == 0) {
                                                    startRestartGroup.startReplaceableGroup(-1263320224);
                                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TextField.kt#9igjgp");
                                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                                    function29 = function217;
                                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                                    startRestartGroup.endReplaceableGroup();
                                                } else {
                                                    function29 = function217;
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                }
                                                if ((i6 & 524288) == 0) {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    i27 = 6;
                                                    shape2 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                                    i34 &= -1879048193;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    i27 = 6;
                                                    shape2 = shape;
                                                }
                                                Shape shape5 = shape2;
                                                if ((i6 & 1048576) == 0) {
                                                    i25 &= -15;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shape5;
                                                    textFieldColors2 = TextFieldDefaults.INSTANCE.colors(startRestartGroup, i27);
                                                } else {
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shape5;
                                                    textFieldColors2 = textFieldColors;
                                                }
                                                i28 = i7;
                                                i29 = i34;
                                                z6 = z15;
                                                i30 = i26;
                                                z7 = z13;
                                                i31 = i35;
                                                modifier3 = modifier2;
                                                function210 = function29;
                                                visualTransformation2 = none;
                                                z8 = z14;
                                                function211 = function218;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i6 & 32) != 0) {
                                                    i7 &= -458753;
                                                }
                                                if ((i6 & 65536) != 0) {
                                                    i34 &= -3670017;
                                                }
                                                if ((i6 & 524288) != 0) {
                                                    i34 &= -1879048193;
                                                }
                                                if ((i6 & 1048576) != 0) {
                                                    i25 &= -15;
                                                }
                                                modifier3 = modifier;
                                                z5 = z;
                                                z7 = z2;
                                                textStyle2 = textStyle;
                                                function26 = function2;
                                                function27 = function22;
                                                function211 = function23;
                                                function28 = function25;
                                                z8 = z3;
                                                keyboardOptions2 = keyboardOptions;
                                                keyboardActions2 = keyboardActions;
                                                z6 = z4;
                                                i30 = i;
                                                i31 = i2;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                shape3 = shape;
                                                textFieldColors2 = textFieldColors;
                                                i28 = i7;
                                                i29 = i34;
                                                function210 = function24;
                                                visualTransformation2 = visualTransformation;
                                            }
                                            startRestartGroup.endDefaults();
                                            composer2 = startRestartGroup;
                                            if (ComposerKt.isTraceInProgress()) {
                                                keyboardActions3 = keyboardActions2;
                                            } else {
                                                keyboardActions3 = keyboardActions2;
                                                ComposerKt.traceEventStart(-1500728277, i28, i29, "androidx.compose.material3.TextField (TextField.kt:416)");
                                            }
                                            int i36 = i29 << 6;
                                            TextField(str, (Function1<? super String, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i36 & 896) | 54 | (i36 & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            keyboardActions4 = keyboardActions3;
                                            function212 = function211;
                                            visualTransformation3 = visualTransformation2;
                                            textStyle3 = textStyle2;
                                            function213 = function27;
                                            z9 = z6;
                                            i32 = i30;
                                            i33 = i31;
                                            mutableInteractionSource5 = mutableInteractionSource4;
                                            shape4 = shape3;
                                            textFieldColors3 = textFieldColors2;
                                            modifier4 = modifier3;
                                            function214 = function210;
                                            z10 = z5;
                                            z11 = z8;
                                            z12 = z7;
                                            Function2 function219 = function26;
                                            keyboardOptions3 = keyboardOptions2;
                                            function215 = function219;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier;
                                            z10 = z;
                                            z12 = z2;
                                            textStyle3 = textStyle;
                                            function215 = function2;
                                            function213 = function22;
                                            function212 = function23;
                                            function214 = function24;
                                            function28 = function25;
                                            z11 = z3;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions4 = keyboardActions;
                                            z9 = z4;
                                            i32 = i;
                                            i33 = i2;
                                            mutableInteractionSource5 = mutableInteractionSource;
                                            shape4 = shape;
                                            textFieldColors3 = textFieldColors;
                                            composer2 = startRestartGroup;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$8
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i37) {
                                                    TextFieldKt.TextField(str, function1, modifier4, z10, z12, textStyle3, function215, function213, function212, function214, function28, z11, visualTransformation3, keyboardOptions3, keyboardActions4, z9, i32, i33, mutableInteractionSource5, shape4, textFieldColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                if ((i4 & 1572864) == 0) {
                                }
                                i23 = i6 & 131072;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 262144;
                                if (i24 == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                if ((i5 & 6) != 0) {
                                }
                                if ((i7 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i6 & 32) == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if ((i6 & 65536) == 0) {
                                }
                                if (i23 == 0) {
                                }
                                Function2 function2182 = function216;
                                if (i24 == 0) {
                                }
                                if ((i6 & 524288) == 0) {
                                }
                                Shape shape52 = shape2;
                                if ((i6 & 1048576) == 0) {
                                }
                                i28 = i7;
                                i29 = i34;
                                z6 = z15;
                                i30 = i26;
                                z7 = z13;
                                i31 = i35;
                                modifier3 = modifier2;
                                function210 = function29;
                                visualTransformation2 = none;
                                z8 = z14;
                                function211 = function2182;
                                startRestartGroup.endDefaults();
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i362 = i29 << 6;
                                TextField(str, (Function1<? super String, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i362 & 896) | 54 | (i362 & 7168) | (57344 & i362) | (458752 & i362) | (3670016 & i362) | (29360128 & i362) | (234881024 & i362) | (i362 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                keyboardActions4 = keyboardActions3;
                                function212 = function211;
                                visualTransformation3 = visualTransformation2;
                                textStyle3 = textStyle2;
                                function213 = function27;
                                z9 = z6;
                                i32 = i30;
                                i33 = i31;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors2;
                                modifier4 = modifier3;
                                function214 = function210;
                                z10 = z5;
                                z11 = z8;
                                z12 = z7;
                                Function2 function2192 = function26;
                                keyboardOptions3 = keyboardOptions2;
                                function215 = function2192;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 != 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            i23 = i6 & 131072;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 262144;
                            if (i24 == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            if ((i5 & 6) != 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i6 & 32) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if ((i6 & 65536) == 0) {
                            }
                            if (i23 == 0) {
                            }
                            Function2 function21822 = function216;
                            if (i24 == 0) {
                            }
                            if ((i6 & 524288) == 0) {
                            }
                            Shape shape522 = shape2;
                            if ((i6 & 1048576) == 0) {
                            }
                            i28 = i7;
                            i29 = i34;
                            z6 = z15;
                            i30 = i26;
                            z7 = z13;
                            i31 = i35;
                            modifier3 = modifier2;
                            function210 = function29;
                            visualTransformation2 = none;
                            z8 = z14;
                            function211 = function21822;
                            startRestartGroup.endDefaults();
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i3622 = i29 << 6;
                            TextField(str, (Function1<? super String, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i3622 & 896) | 54 | (i3622 & 7168) | (57344 & i3622) | (458752 & i3622) | (3670016 & i3622) | (29360128 & i3622) | (234881024 & i3622) | (i3622 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            keyboardActions4 = keyboardActions3;
                            function212 = function211;
                            visualTransformation3 = visualTransformation2;
                            textStyle3 = textStyle2;
                            function213 = function27;
                            z9 = z6;
                            i32 = i30;
                            i33 = i31;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            shape4 = shape3;
                            textFieldColors3 = textFieldColors2;
                            modifier4 = modifier3;
                            function214 = function210;
                            z10 = z5;
                            z11 = z8;
                            z12 = z7;
                            Function2 function21922 = function26;
                            keyboardOptions3 = keyboardOptions2;
                            function215 = function21922;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        i23 = i6 & 131072;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 262144;
                        if (i24 == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        if ((i5 & 6) != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if ((i6 & 65536) == 0) {
                        }
                        if (i23 == 0) {
                        }
                        Function2 function218222 = function216;
                        if (i24 == 0) {
                        }
                        if ((i6 & 524288) == 0) {
                        }
                        Shape shape5222 = shape2;
                        if ((i6 & 1048576) == 0) {
                        }
                        i28 = i7;
                        i29 = i34;
                        z6 = z15;
                        i30 = i26;
                        z7 = z13;
                        i31 = i35;
                        modifier3 = modifier2;
                        function210 = function29;
                        visualTransformation2 = none;
                        z8 = z14;
                        function211 = function218222;
                        startRestartGroup.endDefaults();
                        composer2 = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i36222 = i29 << 6;
                        TextField(str, (Function1<? super String, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i36222 & 896) | 54 | (i36222 & 7168) | (57344 & i36222) | (458752 & i36222) | (3670016 & i36222) | (29360128 & i36222) | (234881024 & i36222) | (i36222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        keyboardActions4 = keyboardActions3;
                        function212 = function211;
                        visualTransformation3 = visualTransformation2;
                        textStyle3 = textStyle2;
                        function213 = function27;
                        z9 = z6;
                        i32 = i30;
                        i33 = i31;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape4 = shape3;
                        textFieldColors3 = textFieldColors2;
                        modifier4 = modifier3;
                        function214 = function210;
                        z10 = z5;
                        z11 = z8;
                        z12 = z7;
                        Function2 function219222 = function26;
                        keyboardOptions3 = keyboardOptions2;
                        function215 = function219222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i342 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    i23 = i6 & 131072;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 262144;
                    if (i24 == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    if ((i5 & 6) != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if ((i6 & 65536) == 0) {
                    }
                    if (i23 == 0) {
                    }
                    Function2 function2182222 = function216;
                    if (i24 == 0) {
                    }
                    if ((i6 & 524288) == 0) {
                    }
                    Shape shape52222 = shape2;
                    if ((i6 & 1048576) == 0) {
                    }
                    i28 = i7;
                    i29 = i342;
                    z6 = z15;
                    i30 = i26;
                    z7 = z13;
                    i31 = i35;
                    modifier3 = modifier2;
                    function210 = function29;
                    visualTransformation2 = none;
                    z8 = z14;
                    function211 = function2182222;
                    startRestartGroup.endDefaults();
                    composer2 = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i362222 = i29 << 6;
                    TextField(str, (Function1<? super String, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i362222 & 896) | 54 | (i362222 & 7168) | (57344 & i362222) | (458752 & i362222) | (3670016 & i362222) | (29360128 & i362222) | (234881024 & i362222) | (i362222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    keyboardActions4 = keyboardActions3;
                    function212 = function211;
                    visualTransformation3 = visualTransformation2;
                    textStyle3 = textStyle2;
                    function213 = function27;
                    z9 = z6;
                    i32 = i30;
                    i33 = i31;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    textFieldColors3 = textFieldColors2;
                    modifier4 = modifier3;
                    function214 = function210;
                    z10 = z5;
                    z11 = z8;
                    z12 = z7;
                    Function2 function2192222 = function26;
                    keyboardOptions3 = keyboardOptions2;
                    function215 = function2192222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3422 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 != 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                i23 = i6 & 131072;
                if (i23 == 0) {
                }
                i24 = i6 & 262144;
                if (i24 == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if ((i5 & 6) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if ((i6 & 65536) == 0) {
                }
                if (i23 == 0) {
                }
                Function2 function21822222 = function216;
                if (i24 == 0) {
                }
                if ((i6 & 524288) == 0) {
                }
                Shape shape522222 = shape2;
                if ((i6 & 1048576) == 0) {
                }
                i28 = i7;
                i29 = i3422;
                z6 = z15;
                i30 = i26;
                z7 = z13;
                i31 = i35;
                modifier3 = modifier2;
                function210 = function29;
                visualTransformation2 = none;
                z8 = z14;
                function211 = function21822222;
                startRestartGroup.endDefaults();
                composer2 = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                int i3622222 = i29 << 6;
                TextField(str, (Function1<? super String, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i3622222 & 896) | 54 | (i3622222 & 7168) | (57344 & i3622222) | (458752 & i3622222) | (3670016 & i3622222) | (29360128 & i3622222) | (234881024 & i3622222) | (i3622222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                keyboardActions4 = keyboardActions3;
                function212 = function211;
                visualTransformation3 = visualTransformation2;
                textStyle3 = textStyle2;
                function213 = function27;
                z9 = z6;
                i32 = i30;
                i33 = i31;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape4 = shape3;
                textFieldColors3 = textFieldColors2;
                modifier4 = modifier3;
                function214 = function210;
                z10 = z5;
                z11 = z8;
                z12 = z7;
                Function2 function21922222 = function26;
                keyboardOptions3 = keyboardOptions2;
                function215 = function21922222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i34222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 != 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            i23 = i6 & 131072;
            if (i23 == 0) {
            }
            i24 = i6 & 262144;
            if (i24 == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i5 & 6) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if ((i6 & 65536) == 0) {
            }
            if (i23 == 0) {
            }
            Function2 function218222222 = function216;
            if (i24 == 0) {
            }
            if ((i6 & 524288) == 0) {
            }
            Shape shape5222222 = shape2;
            if ((i6 & 1048576) == 0) {
            }
            i28 = i7;
            i29 = i34222;
            z6 = z15;
            i30 = i26;
            z7 = z13;
            i31 = i35;
            modifier3 = modifier2;
            function210 = function29;
            visualTransformation2 = none;
            z8 = z14;
            function211 = function218222222;
            startRestartGroup.endDefaults();
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            int i36222222 = i29 << 6;
            TextField(str, (Function1<? super String, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i36222222 & 896) | 54 | (i36222222 & 7168) | (57344 & i36222222) | (458752 & i36222222) | (3670016 & i36222222) | (29360128 & i36222222) | (234881024 & i36222222) | (i36222222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            keyboardActions4 = keyboardActions3;
            function212 = function211;
            visualTransformation3 = visualTransformation2;
            textStyle3 = textStyle2;
            function213 = function27;
            z9 = z6;
            i32 = i30;
            i33 = i31;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            textFieldColors3 = textFieldColors2;
            modifier4 = modifier3;
            function214 = function210;
            z10 = z5;
            z11 = z8;
            z12 = z7;
            Function2 function219222222 = function26;
            keyboardOptions3 = keyboardOptions2;
            function215 = function219222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i342222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 != 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i23 = i6 & 131072;
        if (i23 == 0) {
        }
        i24 = i6 & 262144;
        if (i24 == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i5 & 6) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if ((i6 & 65536) == 0) {
        }
        if (i23 == 0) {
        }
        Function2 function2182222222 = function216;
        if (i24 == 0) {
        }
        if ((i6 & 524288) == 0) {
        }
        Shape shape52222222 = shape2;
        if ((i6 & 1048576) == 0) {
        }
        i28 = i7;
        i29 = i342222;
        z6 = z15;
        i30 = i26;
        z7 = z13;
        i31 = i35;
        modifier3 = modifier2;
        function210 = function29;
        visualTransformation2 = none;
        z8 = z14;
        function211 = function2182222222;
        startRestartGroup.endDefaults();
        composer2 = startRestartGroup;
        if (ComposerKt.isTraceInProgress()) {
        }
        int i362222222 = i29 << 6;
        TextField(str, (Function1<? super String, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i362222222 & 896) | 54 | (i362222222 & 7168) | (57344 & i362222222) | (458752 & i362222222) | (3670016 & i362222222) | (29360128 & i362222222) | (234881024 & i362222222) | (i362222222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        keyboardActions4 = keyboardActions3;
        function212 = function211;
        visualTransformation3 = visualTransformation2;
        textStyle3 = textStyle2;
        function213 = function27;
        z9 = z6;
        i32 = i30;
        i33 = i31;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        textFieldColors3 = textFieldColors2;
        modifier4 = modifier3;
        function214 = function210;
        z10 = z5;
        z11 = z8;
        z12 = z7;
        Function2 function2192222222 = function26;
        keyboardOptions3 = keyboardOptions2;
        function215 = function2192222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5, final int i6) {
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z5;
        Modifier modifier2;
        TextStyle textStyle2;
        Function2 function26;
        Function2 function27;
        final Function2 function28;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i26;
        Function2 function29;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i27;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        TextFieldColors textFieldColors2;
        int i28;
        int i29;
        boolean z6;
        int i30;
        boolean z7;
        int i31;
        Modifier modifier3;
        Function2 function210;
        VisualTransformation visualTransformation2;
        boolean z8;
        Function2 function211;
        Composer composer2;
        KeyboardActions keyboardActions3;
        final KeyboardActions keyboardActions4;
        final Function2 function212;
        final VisualTransformation visualTransformation3;
        final TextStyle textStyle3;
        final Function2 function213;
        final boolean z9;
        final int i32;
        final int i33;
        final MutableInteractionSource mutableInteractionSource5;
        final Shape shape4;
        final TextFieldColors textFieldColors3;
        final Modifier modifier4;
        final Function2 function214;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final KeyboardOptions keyboardOptions3;
        final Function2 function215;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1523846136);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(19,11,10,1,13,17,6,12,7,18,16,3,20,5,4,15,8,9,2,14)453@22628L7,466@23288L39,467@23366L5,468@23421L8,470@23438L763:TextField.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i3 & 384) == 0) {
                i7 |= startRestartGroup.changed(modifier) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        i11 = i6 & 64;
                        if (i11 != 0) {
                            i7 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i7 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        }
                        i12 = i6 & 128;
                        if (i12 != 0) {
                            i7 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i7 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i13 = i6 & 256;
                        if (i13 != 0) {
                            i7 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i7 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            i7 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i15 = i6 & 1024;
                        if (i15 != 0) {
                            i16 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i16 = i4 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i16 = i4;
                        }
                        i17 = i6 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i16 |= startRestartGroup.changed(z3) ? 32 : 16;
                        }
                        int i34 = i16;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i34 |= 384;
                        } else if ((i4 & 384) == 0) {
                            i34 |= startRestartGroup.changed(visualTransformation) ? 256 : 128;
                            i19 = i6 & 8192;
                            if (i19 == 0) {
                                i34 |= 3072;
                            } else if ((i4 & 3072) == 0) {
                                i34 |= startRestartGroup.changed(keyboardOptions) ? 2048 : 1024;
                                i20 = i6 & 16384;
                                if (i20 != 0) {
                                    i34 |= 24576;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i4 & 24576) == 0) {
                                        i34 |= startRestartGroup.changed(keyboardActions) ? 16384 : 8192;
                                        i22 = i6 & 32768;
                                        if (i22 == 0) {
                                            i34 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i34 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                                        }
                                        if ((i4 & 1572864) == 0) {
                                            i34 |= ((i6 & 65536) == 0 && startRestartGroup.changed(i)) ? 1048576 : 524288;
                                        }
                                        i23 = i6 & 131072;
                                        if (i23 == 0) {
                                            i34 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i34 |= startRestartGroup.changed(i2) ? 8388608 : 4194304;
                                        }
                                        i24 = i6 & 262144;
                                        if (i24 == 0) {
                                            i34 |= 100663296;
                                        } else if ((i4 & 100663296) == 0) {
                                            i34 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        if ((i4 & 805306368) == 0) {
                                            i34 |= ((i6 & 524288) == 0 && startRestartGroup.changed(shape)) ? 536870912 : 268435456;
                                        }
                                        if ((i5 & 6) != 0) {
                                            i25 = i5 | (((i6 & 1048576) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2);
                                        } else {
                                            i25 = i5;
                                        }
                                        if ((i7 & 306783379) == 306783378 || (306783379 & i34) != 306783378 || (i25 & 3) != 2 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                                                z5 = i9 == 0 ? true : z;
                                                boolean z13 = i10 == 0 ? false : z2;
                                                if ((i6 & 32) == 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    modifier2 = companion;
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    textStyle2 = (TextStyle) consume;
                                                    i7 &= -458753;
                                                } else {
                                                    modifier2 = companion;
                                                    textStyle2 = textStyle;
                                                }
                                                function26 = i11 == 0 ? null : function2;
                                                function27 = i12 == 0 ? null : function22;
                                                Function2 function216 = i13 == 0 ? null : function23;
                                                Function2 function217 = i14 == 0 ? null : function24;
                                                function28 = i15 == 0 ? function25 : null;
                                                boolean z14 = i17 == 0 ? false : z3;
                                                VisualTransformation none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                keyboardOptions2 = i19 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                keyboardActions2 = i21 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                boolean z15 = i22 == 0 ? false : z4;
                                                if ((i6 & 65536) == 0) {
                                                    i26 = z15 ? 1 : Integer.MAX_VALUE;
                                                    i34 &= -3670017;
                                                } else {
                                                    i26 = i;
                                                }
                                                int i35 = i23 == 0 ? 1 : i2;
                                                Function2 function218 = function216;
                                                if (i24 == 0) {
                                                    startRestartGroup.startReplaceableGroup(-1263318290);
                                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TextField.kt#9igjgp");
                                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                                    function29 = function217;
                                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                                    startRestartGroup.endReplaceableGroup();
                                                } else {
                                                    function29 = function217;
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                }
                                                if ((i6 & 524288) == 0) {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    i27 = 6;
                                                    shape2 = TextFieldDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                                    i34 &= -1879048193;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    i27 = 6;
                                                    shape2 = shape;
                                                }
                                                Shape shape5 = shape2;
                                                if ((i6 & 1048576) == 0) {
                                                    i25 &= -15;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shape5;
                                                    textFieldColors2 = TextFieldDefaults.INSTANCE.colors(startRestartGroup, i27);
                                                } else {
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shape5;
                                                    textFieldColors2 = textFieldColors;
                                                }
                                                i28 = i7;
                                                i29 = i34;
                                                z6 = z15;
                                                i30 = i26;
                                                z7 = z13;
                                                i31 = i35;
                                                modifier3 = modifier2;
                                                function210 = function29;
                                                visualTransformation2 = none;
                                                z8 = z14;
                                                function211 = function218;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i6 & 32) != 0) {
                                                    i7 &= -458753;
                                                }
                                                if ((i6 & 65536) != 0) {
                                                    i34 &= -3670017;
                                                }
                                                if ((i6 & 524288) != 0) {
                                                    i34 &= -1879048193;
                                                }
                                                if ((i6 & 1048576) != 0) {
                                                    i25 &= -15;
                                                }
                                                modifier3 = modifier;
                                                z5 = z;
                                                z7 = z2;
                                                textStyle2 = textStyle;
                                                function26 = function2;
                                                function27 = function22;
                                                function211 = function23;
                                                function28 = function25;
                                                z8 = z3;
                                                keyboardOptions2 = keyboardOptions;
                                                keyboardActions2 = keyboardActions;
                                                z6 = z4;
                                                i30 = i;
                                                i31 = i2;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                shape3 = shape;
                                                textFieldColors2 = textFieldColors;
                                                i28 = i7;
                                                i29 = i34;
                                                function210 = function24;
                                                visualTransformation2 = visualTransformation;
                                            }
                                            startRestartGroup.endDefaults();
                                            composer2 = startRestartGroup;
                                            if (ComposerKt.isTraceInProgress()) {
                                                keyboardActions3 = keyboardActions2;
                                            } else {
                                                keyboardActions3 = keyboardActions2;
                                                ComposerKt.traceEventStart(1523846136, i28, i29, "androidx.compose.material3.TextField (TextField.kt:469)");
                                            }
                                            int i36 = i29 << 6;
                                            TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i36 & 896) | 54 | (i36 & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            keyboardActions4 = keyboardActions3;
                                            function212 = function211;
                                            visualTransformation3 = visualTransformation2;
                                            textStyle3 = textStyle2;
                                            function213 = function27;
                                            z9 = z6;
                                            i32 = i30;
                                            i33 = i31;
                                            mutableInteractionSource5 = mutableInteractionSource4;
                                            shape4 = shape3;
                                            textFieldColors3 = textFieldColors2;
                                            modifier4 = modifier3;
                                            function214 = function210;
                                            z10 = z5;
                                            z11 = z8;
                                            z12 = z7;
                                            Function2 function219 = function26;
                                            keyboardOptions3 = keyboardOptions2;
                                            function215 = function219;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier;
                                            z10 = z;
                                            z12 = z2;
                                            textStyle3 = textStyle;
                                            function215 = function2;
                                            function213 = function22;
                                            function212 = function23;
                                            function214 = function24;
                                            function28 = function25;
                                            z11 = z3;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions4 = keyboardActions;
                                            z9 = z4;
                                            i32 = i;
                                            i33 = i2;
                                            mutableInteractionSource5 = mutableInteractionSource;
                                            shape4 = shape;
                                            textFieldColors3 = textFieldColors;
                                            composer2 = startRestartGroup;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$10
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i37) {
                                                    TextFieldKt.TextField(TextFieldValue.this, function1, modifier4, z10, z12, textStyle3, function215, function213, function212, function214, function28, z11, visualTransformation3, keyboardOptions3, keyboardActions4, z9, i32, i33, mutableInteractionSource5, shape4, textFieldColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i22 = i6 & 32768;
                                if (i22 == 0) {
                                }
                                if ((i4 & 1572864) == 0) {
                                }
                                i23 = i6 & 131072;
                                if (i23 == 0) {
                                }
                                i24 = i6 & 262144;
                                if (i24 == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                if ((i5 & 6) != 0) {
                                }
                                if ((i7 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i6 & 32) == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if ((i6 & 65536) == 0) {
                                }
                                if (i23 == 0) {
                                }
                                Function2 function2182 = function216;
                                if (i24 == 0) {
                                }
                                if ((i6 & 524288) == 0) {
                                }
                                Shape shape52 = shape2;
                                if ((i6 & 1048576) == 0) {
                                }
                                i28 = i7;
                                i29 = i34;
                                z6 = z15;
                                i30 = i26;
                                z7 = z13;
                                i31 = i35;
                                modifier3 = modifier2;
                                function210 = function29;
                                visualTransformation2 = none;
                                z8 = z14;
                                function211 = function2182;
                                startRestartGroup.endDefaults();
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i362 = i29 << 6;
                                TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i362 & 896) | 54 | (i362 & 7168) | (57344 & i362) | (458752 & i362) | (3670016 & i362) | (29360128 & i362) | (234881024 & i362) | (i362 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                keyboardActions4 = keyboardActions3;
                                function212 = function211;
                                visualTransformation3 = visualTransformation2;
                                textStyle3 = textStyle2;
                                function213 = function27;
                                z9 = z6;
                                i32 = i30;
                                i33 = i31;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors2;
                                modifier4 = modifier3;
                                function214 = function210;
                                z10 = z5;
                                z11 = z8;
                                z12 = z7;
                                Function2 function2192 = function26;
                                keyboardOptions3 = keyboardOptions2;
                                function215 = function2192;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i20 = i6 & 16384;
                            if (i20 != 0) {
                            }
                            i22 = i6 & 32768;
                            if (i22 == 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            i23 = i6 & 131072;
                            if (i23 == 0) {
                            }
                            i24 = i6 & 262144;
                            if (i24 == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            if ((i5 & 6) != 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i6 & 32) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if ((i6 & 65536) == 0) {
                            }
                            if (i23 == 0) {
                            }
                            Function2 function21822 = function216;
                            if (i24 == 0) {
                            }
                            if ((i6 & 524288) == 0) {
                            }
                            Shape shape522 = shape2;
                            if ((i6 & 1048576) == 0) {
                            }
                            i28 = i7;
                            i29 = i34;
                            z6 = z15;
                            i30 = i26;
                            z7 = z13;
                            i31 = i35;
                            modifier3 = modifier2;
                            function210 = function29;
                            visualTransformation2 = none;
                            z8 = z14;
                            function211 = function21822;
                            startRestartGroup.endDefaults();
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i3622 = i29 << 6;
                            TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i3622 & 896) | 54 | (i3622 & 7168) | (57344 & i3622) | (458752 & i3622) | (3670016 & i3622) | (29360128 & i3622) | (234881024 & i3622) | (i3622 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            keyboardActions4 = keyboardActions3;
                            function212 = function211;
                            visualTransformation3 = visualTransformation2;
                            textStyle3 = textStyle2;
                            function213 = function27;
                            z9 = z6;
                            i32 = i30;
                            i33 = i31;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            shape4 = shape3;
                            textFieldColors3 = textFieldColors2;
                            modifier4 = modifier3;
                            function214 = function210;
                            z10 = z5;
                            z11 = z8;
                            z12 = z7;
                            Function2 function21922 = function26;
                            keyboardOptions3 = keyboardOptions2;
                            function215 = function21922;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i19 = i6 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i6 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i6 & 32768;
                        if (i22 == 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        i23 = i6 & 131072;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 262144;
                        if (i24 == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        if ((i5 & 6) != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i6 & 32) == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if ((i6 & 65536) == 0) {
                        }
                        if (i23 == 0) {
                        }
                        Function2 function218222 = function216;
                        if (i24 == 0) {
                        }
                        if ((i6 & 524288) == 0) {
                        }
                        Shape shape5222 = shape2;
                        if ((i6 & 1048576) == 0) {
                        }
                        i28 = i7;
                        i29 = i34;
                        z6 = z15;
                        i30 = i26;
                        z7 = z13;
                        i31 = i35;
                        modifier3 = modifier2;
                        function210 = function29;
                        visualTransformation2 = none;
                        z8 = z14;
                        function211 = function218222;
                        startRestartGroup.endDefaults();
                        composer2 = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i36222 = i29 << 6;
                        TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i36222 & 896) | 54 | (i36222 & 7168) | (57344 & i36222) | (458752 & i36222) | (3670016 & i36222) | (29360128 & i36222) | (234881024 & i36222) | (i36222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        keyboardActions4 = keyboardActions3;
                        function212 = function211;
                        visualTransformation3 = visualTransformation2;
                        textStyle3 = textStyle2;
                        function213 = function27;
                        z9 = z6;
                        i32 = i30;
                        i33 = i31;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape4 = shape3;
                        textFieldColors3 = textFieldColors2;
                        modifier4 = modifier3;
                        function214 = function210;
                        z10 = z5;
                        z11 = z8;
                        z12 = z7;
                        Function2 function219222 = function26;
                        keyboardOptions3 = keyboardOptions2;
                        function215 = function219222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i11 = i6 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i6 & 2048;
                    if (i17 != 0) {
                    }
                    int i342 = i16;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i6 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i6 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 32768;
                    if (i22 == 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    i23 = i6 & 131072;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 262144;
                    if (i24 == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    if ((i5 & 6) != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i6 & 32) == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if ((i6 & 65536) == 0) {
                    }
                    if (i23 == 0) {
                    }
                    Function2 function2182222 = function216;
                    if (i24 == 0) {
                    }
                    if ((i6 & 524288) == 0) {
                    }
                    Shape shape52222 = shape2;
                    if ((i6 & 1048576) == 0) {
                    }
                    i28 = i7;
                    i29 = i342;
                    z6 = z15;
                    i30 = i26;
                    z7 = z13;
                    i31 = i35;
                    modifier3 = modifier2;
                    function210 = function29;
                    visualTransformation2 = none;
                    z8 = z14;
                    function211 = function2182222;
                    startRestartGroup.endDefaults();
                    composer2 = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i362222 = i29 << 6;
                    TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i362222 & 896) | 54 | (i362222 & 7168) | (57344 & i362222) | (458752 & i362222) | (3670016 & i362222) | (29360128 & i362222) | (234881024 & i362222) | (i362222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    keyboardActions4 = keyboardActions3;
                    function212 = function211;
                    visualTransformation3 = visualTransformation2;
                    textStyle3 = textStyle2;
                    function213 = function27;
                    z9 = z6;
                    i32 = i30;
                    i33 = i31;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape4 = shape3;
                    textFieldColors3 = textFieldColors2;
                    modifier4 = modifier3;
                    function214 = function210;
                    z10 = z5;
                    z11 = z8;
                    z12 = z7;
                    Function2 function2192222 = function26;
                    keyboardOptions3 = keyboardOptions2;
                    function215 = function2192222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                }
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i6 & 1024;
                if (i15 != 0) {
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                }
                int i3422 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i19 = i6 & 8192;
                if (i19 == 0) {
                }
                i20 = i6 & 16384;
                if (i20 != 0) {
                }
                i22 = i6 & 32768;
                if (i22 == 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                i23 = i6 & 131072;
                if (i23 == 0) {
                }
                i24 = i6 & 262144;
                if (i24 == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if ((i5 & 6) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if ((i6 & 32) == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if ((i6 & 65536) == 0) {
                }
                if (i23 == 0) {
                }
                Function2 function21822222 = function216;
                if (i24 == 0) {
                }
                if ((i6 & 524288) == 0) {
                }
                Shape shape522222 = shape2;
                if ((i6 & 1048576) == 0) {
                }
                i28 = i7;
                i29 = i3422;
                z6 = z15;
                i30 = i26;
                z7 = z13;
                i31 = i35;
                modifier3 = modifier2;
                function210 = function29;
                visualTransformation2 = none;
                z8 = z14;
                function211 = function21822222;
                startRestartGroup.endDefaults();
                composer2 = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                int i3622222 = i29 << 6;
                TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i3622222 & 896) | 54 | (i3622222 & 7168) | (57344 & i3622222) | (458752 & i3622222) | (3670016 & i3622222) | (29360128 & i3622222) | (234881024 & i3622222) | (i3622222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                keyboardActions4 = keyboardActions3;
                function212 = function211;
                visualTransformation3 = visualTransformation2;
                textStyle3 = textStyle2;
                function213 = function27;
                z9 = z6;
                i32 = i30;
                i33 = i31;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape4 = shape3;
                textFieldColors3 = textFieldColors2;
                modifier4 = modifier3;
                function214 = function210;
                z10 = z5;
                z11 = z8;
                z12 = z7;
                Function2 function21922222 = function26;
                keyboardOptions3 = keyboardOptions2;
                function215 = function21922222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i34222 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i19 = i6 & 8192;
            if (i19 == 0) {
            }
            i20 = i6 & 16384;
            if (i20 != 0) {
            }
            i22 = i6 & 32768;
            if (i22 == 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            i23 = i6 & 131072;
            if (i23 == 0) {
            }
            i24 = i6 & 262144;
            if (i24 == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i5 & 6) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if ((i6 & 32) == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if ((i6 & 65536) == 0) {
            }
            if (i23 == 0) {
            }
            Function2 function218222222 = function216;
            if (i24 == 0) {
            }
            if ((i6 & 524288) == 0) {
            }
            Shape shape5222222 = shape2;
            if ((i6 & 1048576) == 0) {
            }
            i28 = i7;
            i29 = i34222;
            z6 = z15;
            i30 = i26;
            z7 = z13;
            i31 = i35;
            modifier3 = modifier2;
            function210 = function29;
            visualTransformation2 = none;
            z8 = z14;
            function211 = function218222222;
            startRestartGroup.endDefaults();
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            int i36222222 = i29 << 6;
            TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i36222222 & 896) | 54 | (i36222222 & 7168) | (57344 & i36222222) | (458752 & i36222222) | (3670016 & i36222222) | (29360128 & i36222222) | (234881024 & i36222222) | (i36222222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            keyboardActions4 = keyboardActions3;
            function212 = function211;
            visualTransformation3 = visualTransformation2;
            textStyle3 = textStyle2;
            function213 = function27;
            z9 = z6;
            i32 = i30;
            i33 = i31;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape4 = shape3;
            textFieldColors3 = textFieldColors2;
            modifier4 = modifier3;
            function214 = function210;
            z10 = z5;
            z11 = z8;
            z12 = z7;
            Function2 function219222222 = function26;
            keyboardOptions3 = keyboardOptions2;
            function215 = function219222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i342222 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i19 = i6 & 8192;
        if (i19 == 0) {
        }
        i20 = i6 & 16384;
        if (i20 != 0) {
        }
        i22 = i6 & 32768;
        if (i22 == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i23 = i6 & 131072;
        if (i23 == 0) {
        }
        i24 = i6 & 262144;
        if (i24 == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i5 & 6) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if ((i6 & 65536) == 0) {
        }
        if (i23 == 0) {
        }
        Function2 function2182222222 = function216;
        if (i24 == 0) {
        }
        if ((i6 & 524288) == 0) {
        }
        Shape shape52222222 = shape2;
        if ((i6 & 1048576) == 0) {
        }
        i28 = i7;
        i29 = i342222;
        z6 = z15;
        i30 = i26;
        z7 = z13;
        i31 = i35;
        modifier3 = modifier2;
        function210 = function29;
        visualTransformation2 = none;
        z8 = z14;
        function211 = function2182222222;
        startRestartGroup.endDefaults();
        composer2 = startRestartGroup;
        if (ComposerKt.isTraceInProgress()) {
        }
        int i362222222 = i29 << 6;
        TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z5, z7, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function26, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function210, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) function28, z8, visualTransformation2, keyboardOptions2, keyboardActions3, z6, i30, i31, mutableInteractionSource4, shape3, textFieldColors2, composer2, i28 & 2147483646, (i362222222 & 896) | 54 | (i362222222 & 7168) | (57344 & i362222222) | (458752 & i362222222) | (3670016 & i362222222) | (29360128 & i362222222) | (234881024 & i362222222) | (i362222222 & 1879048192), ((i29 >> 24) & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 << 6) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        keyboardActions4 = keyboardActions3;
        function212 = function211;
        visualTransformation3 = visualTransformation2;
        textStyle3 = textStyle2;
        function213 = function27;
        z9 = z6;
        i32 = i30;
        i33 = i31;
        mutableInteractionSource5 = mutableInteractionSource4;
        shape4 = shape3;
        textFieldColors3 = textFieldColors2;
        modifier4 = modifier3;
        function214 = function210;
        z10 = z5;
        z11 = z8;
        z12 = z7;
        Function2 function2192222222 = function26;
        keyboardOptions3 = keyboardOptions2;
        function215 = function2192222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final Function2<? super Composer, ? super Integer, Unit> function26, final boolean z, final float f, final Function2<? super Composer, ? super Integer, Unit> function27, final Function2<? super Composer, ? super Integer, Unit> function28, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        float f2;
        Composer startRestartGroup = composer.startRestartGroup(-1830307184);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)P(4,11,2,6,3,12,7,9,8!2,10)517@24891L139,520@25078L7,521@25090L3994:TextField.kt#uh7d8r");
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
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function27) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function28) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        int i8 = i4;
        if ((i7 & 306783379) != 306783378 || (i8 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i7, i8, "androidx.compose.material3.TextFieldLayout (TextField.kt:516)");
            }
            startRestartGroup.startReplaceableGroup(243139239);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):TextField.kt#9igjgp");
            boolean z2 = ((1879048192 & i7) == 536870912) | ((234881024 & i7) == 67108864) | ((i8 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, textFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -95271730, "C527@25409L11,610@28405L229:TextField.kt#uh7d8r");
            function27.invoke(startRestartGroup, Integer.valueOf(i8 & 14));
            startRestartGroup.startReplaceableGroup(-95271705);
            ComposerKt.sourceInformation(startRestartGroup, "530@25473L269");
            if (function23 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                i5 = i8;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl2 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219124385, "C536@25715L9:TextField.kt#uh7d8r");
                function23.invoke(startRestartGroup, Integer.valueOf((i7 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                i5 = i8;
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95271370);
            ComposerKt.sourceInformation(startRestartGroup, "540@25809L271");
            if (function24 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl3 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl3.getInserting() || !Intrinsics.areEqual(m2937constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2937constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2937constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219124722, "C546@26052L10:TextField.kt#uh7d8r");
                function24.invoke(startRestartGroup, Integer.valueOf((i7 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (function23 != null) {
                i6 = 0;
                calculateStartPadding = Dp.m5734constructorimpl(RangesKt.coerceAtLeast(Dp.m5734constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5734constructorimpl(0)));
            } else {
                i6 = 0;
            }
            if (function24 != null) {
                calculateEndPadding = Dp.m5734constructorimpl(RangesKt.coerceAtLeast(Dp.m5734constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5734constructorimpl(i6)));
            }
            startRestartGroup.startReplaceableGroup(-95270430);
            ComposerKt.sourceInformation(startRestartGroup, "565@26747L334");
            if (function25 != null) {
                Modifier m566paddingqDBjuR0$default = PaddingKt.m566paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m599heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl4 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl4.getInserting() || !Intrinsics.areEqual(m2937constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m2937constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m2937constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219125725, "C572@27055L8:TextField.kt#uh7d8r");
                function25.invoke(startRestartGroup, Integer.valueOf((i7 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95270031);
            ComposerKt.sourceInformation(startRestartGroup, "576@27146L332");
            if (function26 != null) {
                Modifier m566paddingqDBjuR0$default2 = PaddingKt.m566paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m599heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl5 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl5, rememberBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl5.getInserting() || !Intrinsics.areEqual(m2937constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m2937constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m2937constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219126122, "C583@27452L8:TextField.kt#uh7d8r");
                function26.invoke(startRestartGroup, Integer.valueOf((i7 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-95269633);
            ComposerKt.sourceInformation(startRestartGroup, "588@27543L347");
            if (function22 != null) {
                Modifier m566paddingqDBjuR0$default3 = PaddingKt.m566paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m599heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId), DpKt.m5777lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(m566paddingqDBjuR0$default3);
                f2 = calculateEndPadding;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor6);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl6 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl6, rememberBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl6.getInserting() || !Intrinsics.areEqual(m2937constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    m2937constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m2937constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                modifierMaterializerOf6.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219126551, "C594@27881L7:TextField.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i7 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                f2 = calculateEndPadding;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m599heightInVpY3zN4$default(Modifier.INSTANCE, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                calculateStartPadding = Dp.m5734constructorimpl(0);
            }
            Modifier m566paddingqDBjuR0$default4 = PaddingKt.m566paddingqDBjuR0$default(wrapContentHeight$default, calculateStartPadding, 0.0f, function26 == null ? f2 : Dp.m5734constructorimpl(0), 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(-95268909);
            ComposerKt.sourceInformation(startRestartGroup, "606@28273L105");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PlaceholderId).then(m566paddingqDBjuR0$default4), startRestartGroup, Integer.valueOf((i7 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TextFieldId).then(m566paddingqDBjuR0$default4);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor7);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl7 = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl7, rememberBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl7.getInserting() || !Intrinsics.areEqual(m2937constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                m2937constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                m2937constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            modifierMaterializerOf7.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219127279, "C616@28609L11:TextField.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(243142996);
            ComposerKt.sourceInformation(startRestartGroup, "621@28746L269");
            if (function28 != null) {
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m599heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2091supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(padding);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2937constructorimpl8 = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl8, rememberBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m2937constructorimpl8.getInserting() || !Intrinsics.areEqual(m2937constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    m2937constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    m2937constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                modifierMaterializerOf8.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1219127671, "C626@29001L12:TextField.kt#uh7d8r");
                function28.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    TextFieldKt.TextFieldLayout(Modifier.this, function2, function22, function3, function23, function24, function25, function26, z, f, function27, function28, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m2122calculateWidthyeHjK3Y(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, Constraints.m5692getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m2121calculateHeightmKXJcVc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        boolean z = i2 > 0;
        float m5734constructorimpl = Dp.m5734constructorimpl(paddingValues.getTop() + paddingValues.getBottom()) * f2;
        if (z) {
            m5734constructorimpl = MathHelpersKt.lerp(Dp.m5734constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2) * f2, m5734constructorimpl, f);
        }
        return Math.max(Constraints.m5691getMinHeightimpl(j), Math.max(i3, Math.max(i4, MathKt.roundToInt(m5734constructorimpl + MathHelpersKt.lerp(0, i2, f) + ComparisonsKt.maxOf(i, i7, i5, i6, MathHelpersKt.lerp(i2, 0, f))))) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i3, int i4, float f, float f2) {
        int roundToInt;
        Placeable.PlacementScope.m4729place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m5872getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), heightOrZero);
            } else {
                roundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), roundToInt - MathKt.roundToInt((roundToInt - i3) * f), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i4, 0.0f, 4, null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable4) + TextFieldImplKt.widthOrZero(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, i4, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f, PaddingValues paddingValues) {
        Placeable.PlacementScope.m4729place70tqf50$default(placementScope, placeable7, IntOffset.INSTANCE.m5872getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable8);
        int roundToInt = MathKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable5), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable6), 0.0f, 4, null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z, heightOrZero, roundToInt, placeable2), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z, int i, int i2, Placeable placeable) {
        return z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke borderStroke) {
        final float width = borderStroke.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt$drawIndicatorLine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                if (Dp.m5739equalsimpl0(width, Dp.INSTANCE.m5752getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * contentDrawScope.getDensity();
                float m3232getHeightimpl = Size.m3232getHeightimpl(contentDrawScope.mo3957getSizeNHjbRc()) - (density / 2);
                DrawScope.m3943drawLine1RTmtNc$default(contentDrawScope, borderStroke.getBrush(), OffsetKt.Offset(0.0f, m3232getHeightimpl), OffsetKt.Offset(Size.m3235getWidthimpl(contentDrawScope.mo3957getSizeNHjbRc()), m3232getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }
}
