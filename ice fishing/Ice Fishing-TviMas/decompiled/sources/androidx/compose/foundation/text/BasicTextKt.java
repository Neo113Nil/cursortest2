package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.internal.AnalyticsEvents;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010 \u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010!\u001a\u001e\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002\u001a¬\u0001\u0010'\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)2\u0014\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0018\u00010+2\u001c\u0010.\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010/0+\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "textModifier", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "textModifier-RWo7tUw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m842BasicTextVhcvRP8(final String str, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, ColorProducer colorProducer, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1<? super TextLayoutResult, Unit> function12;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier.Companion companion;
        TextStyle textStyle3;
        SelectionController selectionController;
        Function1<? super TextLayoutResult, Unit> function13;
        int m5675getClipgIe3tQ8;
        boolean z2;
        int i15;
        int i16;
        ColorProducer colorProducer2;
        final SelectionRegistrar selectionRegistrar;
        int i17;
        Modifier m843textModifierRWo7tUw;
        int currentCompositeKeyHash;
        Composer m2937constructorimpl;
        final Modifier modifier2;
        final TextStyle textStyle4;
        final Function1<? super TextLayoutResult, Unit> function14;
        final int i18;
        final int i19;
        final int i20;
        final boolean z3;
        final ColorProducer colorProducer3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1186827822);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)95@4654L7,144@6466L41:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i6 |= startRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        if (i14 == 256 || (191739611 & i6) != 38347922 || !startRestartGroup.getSkipping()) {
                            companion = i21 != 0 ? Modifier.INSTANCE : modifier;
                            textStyle3 = i7 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                            selectionController = null;
                            function13 = i8 != 0 ? null : function12;
                            m5675getClipgIe3tQ8 = i9 != 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i10;
                            z2 = i11 != 0 ? true : z;
                            i15 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            i16 = i13 == 0 ? i3 : 1;
                            colorProducer2 = i14 != 0 ? null : colorProducer;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1186827822, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:90)");
                            }
                            HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localSelectionRegistrar);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            selectionRegistrar = (SelectionRegistrar) consume;
                            startRestartGroup.startReplaceableGroup(959238528);
                            ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
                            if (selectionRegistrar != null) {
                                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localTextSelectionColors);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long backgroundColor = ((TextSelectionColors) consume2).getBackgroundColor();
                                long longValue = ((Number) RememberSaveableKt.m3024rememberSaveable(new Object[]{selectionRegistrar}, (Saver) selectionIdSaver(selectionRegistrar), (String) null, (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Long invoke() {
                                        return Long.valueOf(SelectionRegistrar.this.nextSelectableId());
                                    }
                                }, startRestartGroup, 72, 4)).longValue();
                                Long valueOf = Long.valueOf(longValue);
                                Color m3397boximpl = Color.m3397boximpl(backgroundColor);
                                startRestartGroup.startReplaceableGroup(1618982084);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(selectionRegistrar) | startRestartGroup.changed(m3397boximpl);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new SelectionController(longValue, selectionRegistrar, backgroundColor, null, 8, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                selectionController = (SelectionController) rememberedValue;
                            }
                            startRestartGroup.endReplaceableGroup();
                            if (selectionController == null || function13 != null) {
                                i17 = i15;
                                startRestartGroup.startReplaceableGroup(959239198);
                                ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
                                Modifier m3569graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3569graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                AnnotatedString annotatedString = new AnnotatedString(str, null, null, 6, null);
                                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                m843textModifierRWo7tUw = m843textModifierRWo7tUw(m3569graphicsLayerAp8cVGQ$default, annotatedString, textStyle3, function13, m5675getClipgIe3tQ8, z2, i17, i16, (FontFamily.Resolver) consume3, null, null, selectionController, colorProducer2);
                                startRestartGroup.endReplaceableGroup();
                            } else {
                                startRestartGroup.startReplaceableGroup(959239868);
                                ComposerKt.sourceInformation(startRestartGroup, "136@6279L7");
                                Modifier m3569graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3569graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume4 = startRestartGroup.consume(localFontFamilyResolver2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                i17 = i15;
                                m843textModifierRWo7tUw = m3569graphicsLayerAp8cVGQ$default2.then(new TextStringSimpleElement(str, textStyle3, (FontFamily.Resolver) consume4, m5675getClipgIe3tQ8, z2, i17, i16, colorProducer2, null));
                                startRestartGroup.endReplaceableGroup();
                            }
                            EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                            startRestartGroup.startReplaceableGroup(544976794);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m843textModifierRWo7tUw);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            final Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            startRestartGroup.startReplaceableGroup(1405779621);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-VhcvRP8$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final ComposeUiNode invoke() {
                                        return Function0.this.invoke();
                                    }
                                });
                            } else {
                                startRestartGroup.useNode();
                            }
                            m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                            Updater.m2944setimpl(m2937constructorimpl, emptyMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m2944setimpl(m2937constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                            textStyle4 = textStyle3;
                            function14 = function13;
                            i18 = m5675getClipgIe3tQ8;
                            i19 = i16;
                            i20 = i17;
                            z3 = z2;
                            colorProducer3 = colorProducer2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z;
                            i20 = i2;
                            colorProducer3 = colorProducer;
                            textStyle4 = textStyle2;
                            function14 = function12;
                            i18 = i10;
                            i19 = i3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
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

                                public final void invoke(Composer composer2, int i22) {
                                    BasicTextKt.m842BasicTextVhcvRP8(str, modifier2, textStyle4, function14, i18, z3, i20, i19, colorProducer3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 == 256) {
                    }
                    if (i21 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    selectionController = null;
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                    ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(localSelectionRegistrar2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    selectionRegistrar = (SelectionRegistrar) consume5;
                    startRestartGroup.startReplaceableGroup(959238528);
                    ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
                    if (selectionRegistrar != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (selectionController == null) {
                    }
                    i17 = i15;
                    startRestartGroup.startReplaceableGroup(959239198);
                    ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
                    Modifier m3569graphicsLayerAp8cVGQ$default3 = GraphicsLayerModifierKt.m3569graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                    AnnotatedString annotatedString2 = new AnnotatedString(str, null, null, 6, null);
                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver3 = CompositionLocalsKt.getLocalFontFamilyResolver();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(localFontFamilyResolver3);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    m843textModifierRWo7tUw = m843textModifierRWo7tUw(m3569graphicsLayerAp8cVGQ$default3, annotatedString2, textStyle3, function13, m5675getClipgIe3tQ8, z2, i17, i16, (FontFamily.Resolver) consume32, null, null, selectionController, colorProducer2);
                    startRestartGroup.endReplaceableGroup();
                    EmptyMeasurePolicy emptyMeasurePolicy2 = EmptyMeasurePolicy.INSTANCE;
                    startRestartGroup.startReplaceableGroup(544976794);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m843textModifierRWo7tUw);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    final Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    startRestartGroup.startReplaceableGroup(1405779621);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                    Updater.m2944setimpl(m2937constructorimpl, emptyMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m2944setimpl(m2937constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m2937constructorimpl.getInserting()) {
                    }
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    textStyle4 = textStyle3;
                    function14 = function13;
                    i18 = m5675getClipgIe3tQ8;
                    i19 = i16;
                    i20 = i17;
                    z3 = z2;
                    colorProducer3 = colorProducer2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 == 256) {
                }
                if (i21 != 0) {
                }
                if (i7 != 0) {
                }
                selectionController = null;
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar22 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52 = startRestartGroup.consume(localSelectionRegistrar22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                selectionRegistrar = (SelectionRegistrar) consume52;
                startRestartGroup.startReplaceableGroup(959238528);
                ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
                if (selectionRegistrar != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (selectionController == null) {
                }
                i17 = i15;
                startRestartGroup.startReplaceableGroup(959239198);
                ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
                Modifier m3569graphicsLayerAp8cVGQ$default32 = GraphicsLayerModifierKt.m3569graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                AnnotatedString annotatedString22 = new AnnotatedString(str, null, null, 6, null);
                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver32 = CompositionLocalsKt.getLocalFontFamilyResolver();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(localFontFamilyResolver32);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                m843textModifierRWo7tUw = m843textModifierRWo7tUw(m3569graphicsLayerAp8cVGQ$default32, annotatedString22, textStyle3, function13, m5675getClipgIe3tQ8, z2, i17, i16, (FontFamily.Resolver) consume322, null, null, selectionController, colorProducer2);
                startRestartGroup.endReplaceableGroup();
                EmptyMeasurePolicy emptyMeasurePolicy22 = EmptyMeasurePolicy.INSTANCE;
                startRestartGroup.startReplaceableGroup(544976794);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m843textModifierRWo7tUw);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                final Function0 constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                startRestartGroup.startReplaceableGroup(1405779621);
                ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, emptyMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m2944setimpl(m2937constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl.getInserting()) {
                }
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                textStyle4 = textStyle3;
                function14 = function13;
                i18 = m5675getClipgIe3tQ8;
                i19 = i16;
                i20 = i17;
                z3 = z2;
                colorProducer3 = colorProducer2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 == 256) {
            }
            if (i21 != 0) {
            }
            if (i7 != 0) {
            }
            selectionController = null;
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 == 0) {
            }
            if (i14 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522 = startRestartGroup.consume(localSelectionRegistrar222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionRegistrar = (SelectionRegistrar) consume522;
            startRestartGroup.startReplaceableGroup(959238528);
            ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
            if (selectionRegistrar != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (selectionController == null) {
            }
            i17 = i15;
            startRestartGroup.startReplaceableGroup(959239198);
            ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
            Modifier m3569graphicsLayerAp8cVGQ$default322 = GraphicsLayerModifierKt.m3569graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
            AnnotatedString annotatedString222 = new AnnotatedString(str, null, null, 6, null);
            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver322 = CompositionLocalsKt.getLocalFontFamilyResolver();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(localFontFamilyResolver322);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            m843textModifierRWo7tUw = m843textModifierRWo7tUw(m3569graphicsLayerAp8cVGQ$default322, annotatedString222, textStyle3, function13, m5675getClipgIe3tQ8, z2, i17, i16, (FontFamily.Resolver) consume3222, null, null, selectionController, colorProducer2);
            startRestartGroup.endReplaceableGroup();
            EmptyMeasurePolicy emptyMeasurePolicy222 = EmptyMeasurePolicy.INSTANCE;
            startRestartGroup.startReplaceableGroup(544976794);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m843textModifierRWo7tUw);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            final Function0 constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            startRestartGroup.startReplaceableGroup(1405779621);
            ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, emptyMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m2944setimpl(m2937constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m2937constructorimpl.getInserting()) {
            }
            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            textStyle4 = textStyle3;
            function14 = function13;
            i18 = m5675getClipgIe3tQ8;
            i19 = i16;
            i20 = i17;
            z3 = z2;
            colorProducer3 = colorProducer2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 == 256) {
        }
        if (i21 != 0) {
        }
        if (i7 != 0) {
        }
        selectionController = null;
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222 = startRestartGroup.consume(localSelectionRegistrar2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        selectionRegistrar = (SelectionRegistrar) consume5222;
        startRestartGroup.startReplaceableGroup(959238528);
        ComposerKt.sourceInformation(startRestartGroup, "97@4790L7,99@4853L152,102@5014L234");
        if (selectionRegistrar != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (selectionController == null) {
        }
        i17 = i15;
        startRestartGroup.startReplaceableGroup(959239198);
        ComposerKt.sourceInformation(startRestartGroup, "124@5828L7");
        Modifier m3569graphicsLayerAp8cVGQ$default3222 = GraphicsLayerModifierKt.m3569graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
        AnnotatedString annotatedString2222 = new AnnotatedString(str, null, null, 6, null);
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver3222 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(localFontFamilyResolver3222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        m843textModifierRWo7tUw = m843textModifierRWo7tUw(m3569graphicsLayerAp8cVGQ$default3222, annotatedString2222, textStyle3, function13, m5675getClipgIe3tQ8, z2, i17, i16, (FontFamily.Resolver) consume32222, null, null, selectionController, colorProducer2);
        startRestartGroup.endReplaceableGroup();
        EmptyMeasurePolicy emptyMeasurePolicy2222 = EmptyMeasurePolicy.INSTANCE;
        startRestartGroup.startReplaceableGroup(544976794);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m843textModifierRWo7tUw);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        final Function0 constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        startRestartGroup.startReplaceableGroup(1405779621);
        ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
        Updater.m2944setimpl(m2937constructorimpl, emptyMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m2944setimpl(m2937constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m2937constructorimpl.getInserting()) {
        }
        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        textStyle4 = textStyle3;
        function14 = function13;
        i18 = m5675getClipgIe3tQ8;
        i19 = i16;
        i20 = i17;
        z3 = z2;
        colorProducer3 = colorProducer2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0385  */
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m840BasicTextRWo7tUw(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, ColorProducer colorProducer, Composer composer, final int i4, final int i5) {
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
        final SelectionRegistrar selectionRegistrar;
        int i16;
        SelectionController selectionController;
        int i17;
        int i18;
        Composer composer2;
        Map<String, InlineTextContent> map2;
        final ColorProducer colorProducer2;
        final Map<String, InlineTextContent> map3;
        final Modifier modifier2;
        final TextStyle textStyle2;
        final Function1<? super TextLayoutResult, Unit> function12;
        final int i19;
        final boolean z2;
        final int i20;
        final int i21;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1064305212);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)189@8865L7:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i22 = i5 & 2;
        if (i22 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    i6 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i6 |= startRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        i15 = i5 & 512;
                        if (i15 != 0) {
                            i6 |= 268435456;
                        }
                        if ((i5 & 768) == 768 || (1533916891 & i6) != 306783378 || !startRestartGroup.getSkipping()) {
                            Modifier modifier3 = i22 != 0 ? Modifier.INSTANCE : modifier;
                            TextStyle textStyle3 = i7 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                            Function1<? super TextLayoutResult, Unit> function13 = i8 != 0 ? null : function1;
                            int m5675getClipgIe3tQ8 = i9 != 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i10;
                            boolean z3 = i11 != 0 ? true : z;
                            int i23 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            int i24 = i13 != 0 ? 1 : i3;
                            Map<String, InlineTextContent> emptyMap = i14 != 0 ? MapsKt.emptyMap() : map;
                            ColorProducer colorProducer3 = i15 != 0 ? null : colorProducer;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1064305212, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:184)");
                            }
                            HeightInLinesModifierKt.validateMinMaxLines(i24, i23);
                            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localSelectionRegistrar);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            selectionRegistrar = (SelectionRegistrar) consume;
                            startRestartGroup.startReplaceableGroup(959242739);
                            ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
                            if (selectionRegistrar != null) {
                                ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localTextSelectionColors);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long backgroundColor = ((TextSelectionColors) consume2).getBackgroundColor();
                                long longValue = ((Number) RememberSaveableKt.m3024rememberSaveable(new Object[]{selectionRegistrar}, (Saver) selectionIdSaver(selectionRegistrar), (String) null, (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Long invoke() {
                                        return Long.valueOf(SelectionRegistrar.this.nextSelectableId());
                                    }
                                }, startRestartGroup, 72, 4)).longValue();
                                Long valueOf = Long.valueOf(longValue);
                                Color m3397boximpl = Color.m3397boximpl(backgroundColor);
                                i16 = i6;
                                startRestartGroup.startReplaceableGroup(1618982084);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(selectionRegistrar) | startRestartGroup.changed(m3397boximpl);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new SelectionController(longValue, selectionRegistrar, backgroundColor, null, 8, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                selectionController = (SelectionController) rememberedValue;
                            } else {
                                i16 = i6;
                                selectionController = null;
                            }
                            startRestartGroup.endReplaceableGroup();
                            if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
                                startRestartGroup.startReplaceableGroup(959243362);
                                ComposerKt.sourceInformation(startRestartGroup, "220@10119L7,208@9605L768");
                                Modifier m3569graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3569graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume3 = startRestartGroup.consume(localFontFamilyResolver);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Map<String, InlineTextContent> map4 = emptyMap;
                                i17 = i24;
                                i18 = i23;
                                composer2 = startRestartGroup;
                                Modifier m843textModifierRWo7tUw = m843textModifierRWo7tUw(m3569graphicsLayerAp8cVGQ$default, annotatedString, textStyle3, function13, m5675getClipgIe3tQ8, z3, i23, i24, (FontFamily.Resolver) consume3, null, null, selectionController, colorProducer3);
                                EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                composer2.startReplaceableGroup(544976794);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(1)123@4784L23,126@4935L385:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m843textModifierRWo7tUw);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                final Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                composer2.startReplaceableGroup(1405779621);
                                ComposerKt.sourceInformation(composer2, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(new Function0<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-RWo7tUw$$inlined$Layout$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final ComposeUiNode invoke() {
                                            return Function0.this.invoke();
                                        }
                                    });
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                                Updater.m2944setimpl(m2937constructorimpl, emptyMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Updater.m2944setimpl(m2937constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                map2 = map4;
                            } else {
                                Map<String, InlineTextContent> map5 = emptyMap;
                                i17 = i24;
                                i18 = i23;
                                composer2 = startRestartGroup;
                                composer2.startReplaceableGroup(959244221);
                                ComposerKt.sourceInformation(composer2, "233@10597L81,249@11260L7,236@10687L908");
                                Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> resolveInlineContent = AnnotatedStringResolveInlineContentKt.resolveInlineContent(annotatedString, map5);
                                List<AnnotatedString.Range<Placeholder>> component1 = resolveInlineContent.component1();
                                List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> component2 = resolveInlineContent.component2();
                                composer2.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue2 = composer2.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                final MutableState mutableState = (MutableState) rememberedValue2;
                                Modifier m3569graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3569graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer2.consume(localFontFamilyResolver2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                FontFamily.Resolver resolver = (FontFamily.Resolver) consume4;
                                composer2.startReplaceableGroup(572128197);
                                boolean changed2 = composer2.changed(mutableState);
                                Object rememberedValue3 = composer2.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function1) new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list) {
                                            invoke2((List<Rect>) list);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(List<Rect> list) {
                                            mutableState.setValue(list);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                int i25 = i16;
                                map2 = map5;
                                Modifier m843textModifierRWo7tUw2 = m843textModifierRWo7tUw(m3569graphicsLayerAp8cVGQ$default2, annotatedString, textStyle3, function13, m5675getClipgIe3tQ8, z3, i18, i17, resolver, component1, (Function1) rememberedValue3, selectionController, colorProducer3);
                                composer2.startReplaceableGroup(572128392);
                                boolean changed3 = composer2.changed(mutableState);
                                Object rememberedValue4 = composer2.rememberedValue();
                                if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (Function0) new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final List<? extends Rect> invoke() {
                                            return mutableState.getValue();
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                TextMeasurePolicy textMeasurePolicy = new TextMeasurePolicy((Function0) rememberedValue4);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m843textModifierRWo7tUw2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                                Updater.m2944setimpl(m2937constructorimpl2, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, 1350732076, "C237@10719L63:BasicText.kt#423gt5");
                                AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, component2, composer2, (i25 & 14) | 64);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            colorProducer2 = colorProducer3;
                            map3 = map2;
                            modifier2 = modifier3;
                            textStyle2 = textStyle3;
                            function12 = function13;
                            i19 = m5675getClipgIe3tQ8;
                            z2 = z3;
                            i20 = i17;
                            i21 = i18;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            textStyle2 = textStyle;
                            function12 = function1;
                            z2 = z;
                            i21 = i2;
                            i20 = i3;
                            map3 = map;
                            i19 = i10;
                            composer2 = startRestartGroup;
                            colorProducer2 = colorProducer;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                                public final void invoke(Composer composer3, int i26) {
                                    BasicTextKt.m840BasicTextRWo7tUw(AnnotatedString.this, modifier2, textStyle2, function12, i19, z2, i21, i20, map3, colorProducer2, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i5 & 512;
                    if (i15 != 0) {
                    }
                    if ((i5 & 768) == 768) {
                    }
                    if (i22 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    HeightInLinesModifierKt.validateMinMaxLines(i24, i23);
                    ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(localSelectionRegistrar2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    selectionRegistrar = (SelectionRegistrar) consume5;
                    startRestartGroup.startReplaceableGroup(959242739);
                    ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
                    if (selectionRegistrar != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    colorProducer2 = colorProducer3;
                    map3 = map2;
                    modifier2 = modifier3;
                    textStyle2 = textStyle3;
                    function12 = function13;
                    i19 = m5675getClipgIe3tQ8;
                    z2 = z3;
                    i20 = i17;
                    i21 = i18;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                i15 = i5 & 512;
                if (i15 != 0) {
                }
                if ((i5 & 768) == 768) {
                }
                if (i22 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                HeightInLinesModifierKt.validateMinMaxLines(i24, i23);
                ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar22 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52 = startRestartGroup.consume(localSelectionRegistrar22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                selectionRegistrar = (SelectionRegistrar) consume52;
                startRestartGroup.startReplaceableGroup(959242739);
                ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
                if (selectionRegistrar != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                colorProducer2 = colorProducer3;
                map3 = map2;
                modifier2 = modifier3;
                textStyle2 = textStyle3;
                function12 = function13;
                i19 = m5675getClipgIe3tQ8;
                z2 = z3;
                i20 = i17;
                i21 = i18;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            if ((i5 & 768) == 768) {
            }
            if (i22 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            HeightInLinesModifierKt.validateMinMaxLines(i24, i23);
            ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522 = startRestartGroup.consume(localSelectionRegistrar222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionRegistrar = (SelectionRegistrar) consume522;
            startRestartGroup.startReplaceableGroup(959242739);
            ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
            if (selectionRegistrar != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            colorProducer2 = colorProducer3;
            map3 = map2;
            modifier2 = modifier3;
            textStyle2 = textStyle3;
            function12 = function13;
            i19 = m5675getClipgIe3tQ8;
            z2 = z3;
            i20 = i17;
            i21 = i18;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        if ((i5 & 768) == 768) {
        }
        if (i22 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        HeightInLinesModifierKt.validateMinMaxLines(i24, i23);
        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2222 = SelectionRegistrarKt.getLocalSelectionRegistrar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222 = startRestartGroup.consume(localSelectionRegistrar2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        selectionRegistrar = (SelectionRegistrar) consume5222;
        startRestartGroup.startReplaceableGroup(959242739);
        ComposerKt.sourceInformation(startRestartGroup, "191@9001L7,193@9064L152,196@9225L234");
        if (selectionRegistrar != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        colorProducer2 = colorProducer3;
        map3 = map2;
        modifier2 = modifier3;
        textStyle2 = textStyle3;
        function12 = function13;
        i19 = m5675getClipgIe3tQ8;
        z2 = z3;
        i20 = i17;
        i21 = i18;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0051  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m839BasicTextBpD7jsM(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        final TextStyle textStyle3;
        final int i13;
        final boolean z3;
        final int i14;
        final Function1 function13;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1022429478);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)271@11987L234:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & 458752) == 0) {
                                i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            i12 = i2;
                        } else {
                            i12 = i2;
                            if ((i3 & 3670016) == 0) {
                                i5 |= startRestartGroup.changed(i12) ? 1048576 : 524288;
                            }
                        }
                        if ((i5 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i15 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            }
                            Function1 function14 = i7 != 0 ? null : function12;
                            int m5675getClipgIe3tQ8 = i8 != 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i9;
                            boolean z4 = i10 != 0 ? true : z2;
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i12;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1022429478, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:270)");
                            }
                            m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function14, m5675getClipgIe3tQ8, z4, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            i13 = i16;
                            z3 = z4;
                            i14 = m5675getClipgIe3tQ8;
                            function13 = function14;
                            modifier3 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            i13 = i12;
                            i14 = i9;
                            z3 = z2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
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

                                public final void invoke(Composer composer2, int i17) {
                                    BasicTextKt.m839BasicTextBpD7jsM(str, modifier3, textStyle3, function13, i14, z3, i13, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i5 & 2995931) == 599186) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function14, m5675getClipgIe3tQ8, z4, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    i13 = i16;
                    z3 = z4;
                    i14 = m5675getClipgIe3tQ8;
                    function13 = function14;
                    modifier3 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i5 & 2995931) == 599186) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function14, m5675getClipgIe3tQ8, z4, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                i13 = i16;
                z3 = z4;
                i14 = m5675getClipgIe3tQ8;
                function13 = function14;
                modifier3 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i5 & 2995931) == 599186) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function14, m5675getClipgIe3tQ8, z4, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            i13 = i16;
            z3 = z4;
            i14 = m5675getClipgIe3tQ8;
            function13 = function14;
            modifier3 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i5 & 2995931) == 599186) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function14, m5675getClipgIe3tQ8, z4, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
        if (ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        i13 = i16;
        z3 = z4;
        i14 = m5675getClipgIe3tQ8;
        function13 = function14;
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0053  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m837BasicText4YKlhWE(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Map map, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        final TextStyle textStyle3;
        final Map map2;
        final int i13;
        final boolean z3;
        final Function1 function13;
        final int i14;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-648605928);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)295@12678L273:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    function12 = function1;
                    i5 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & 458752) == 0) {
                                i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i12 = i4 & 128;
                        if (i12 != 0) {
                            i5 |= 4194304;
                        }
                        if (i12 == 128 || (23967451 & i5) != 4793490 || !startRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i6 != 0) {
                                textStyle2 = TextStyle.INSTANCE.getDefault();
                            }
                            Function1 function14 = i7 != 0 ? null : function12;
                            int m5675getClipgIe3tQ8 = i8 != 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i9;
                            boolean z4 = i10 != 0 ? true : z2;
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i2;
                            Map emptyMap = i12 != 0 ? MapsKt.emptyMap() : map;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-648605928, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:294)");
                            }
                            m840BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m5675getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle2;
                            map2 = emptyMap;
                            i13 = i16;
                            z3 = z4;
                            function13 = function14;
                            Modifier modifier4 = modifier2;
                            i14 = m5675getClipgIe3tQ8;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i13 = i2;
                            modifier3 = modifier2;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            z3 = z2;
                            i14 = i9;
                            map2 = map;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
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

                                public final void invoke(Composer composer2, int i17) {
                                    BasicTextKt.m837BasicText4YKlhWE(AnnotatedString.this, modifier3, textStyle3, function13, i14, z3, i13, map2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                    }
                    if (i12 == 128) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m840BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m5675getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    map2 = emptyMap;
                    i13 = i16;
                    z3 = z4;
                    function13 = function14;
                    Modifier modifier42 = modifier2;
                    i14 = m5675getClipgIe3tQ8;
                    modifier3 = modifier42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                }
                if (i12 == 128) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m840BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m5675getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                map2 = emptyMap;
                i13 = i16;
                z3 = z4;
                function13 = function14;
                Modifier modifier422 = modifier2;
                i14 = m5675getClipgIe3tQ8;
                modifier3 = modifier422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            if (i12 == 128) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m840BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m5675getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            map2 = emptyMap;
            i13 = i16;
            z3 = z4;
            function13 = function14;
            Modifier modifier4222 = modifier2;
            i14 = m5675getClipgIe3tQ8;
            modifier3 = modifier4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        if (i12 == 128) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m840BasicTextRWo7tUw(annotatedString, modifier2, textStyle2, function14, m5675getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        map2 = emptyMap;
        i13 = i16;
        z3 = z4;
        function13 = function14;
        Modifier modifier42222 = modifier2;
        i14 = m5675getClipgIe3tQ8;
        modifier3 = modifier42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006f  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m838BasicText4YKlhWE(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        final Modifier.Companion companion;
        final Function1 function13;
        final int m5675getClipgIe3tQ8;
        final TextStyle textStyle3;
        final int i14;
        final int i15;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1542716361);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)319@13349L86:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((458752 & i4) == 0) {
                            z2 = z;
                            i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            i12 = i5 & 64;
                            if (i12 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 3670016) == 0) {
                                i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i13 = i5 & 128;
                            if (i13 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 29360128) == 0) {
                                i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                            }
                            if ((i6 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                                companion = i16 == 0 ? Modifier.INSTANCE : modifier;
                                if (i7 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                }
                                function13 = i8 == 0 ? null : function12;
                                m5675getClipgIe3tQ8 = i9 == 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i10;
                                boolean z4 = i11 == 0 ? true : z2;
                                int i17 = i12 == 0 ? Integer.MAX_VALUE : i2;
                                int i18 = i13 == 0 ? i3 : 1;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1542716361, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:319)");
                                }
                                m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function13, m5675getClipgIe3tQ8, z4, i17, i18, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textStyle3 = textStyle2;
                                i14 = i17;
                                boolean z5 = z4;
                                i15 = i18;
                                z3 = z5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier;
                                i15 = i3;
                                textStyle3 = textStyle2;
                                function13 = function12;
                                m5675getClipgIe3tQ8 = i10;
                                z3 = z2;
                                i14 = i2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
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

                                    public final void invoke(Composer composer2, int i19) {
                                        BasicTextKt.m838BasicText4YKlhWE(str, companion, textStyle3, function13, m5675getClipgIe3tQ8, z3, i14, i15, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        i12 = i5 & 64;
                        if (i12 == 0) {
                        }
                        i13 = i5 & 128;
                        if (i13 == 0) {
                        }
                        if ((i6 & 23967451) == 4793490) {
                        }
                        if (i16 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function13, m5675getClipgIe3tQ8, z4, i17, i18, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        textStyle3 = textStyle2;
                        i14 = i17;
                        boolean z52 = z4;
                        i15 = i18;
                        z3 = z52;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    z2 = z;
                    i12 = i5 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 == 0) {
                    }
                    if ((i6 & 23967451) == 4793490) {
                    }
                    if (i16 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function13, m5675getClipgIe3tQ8, z4, i17, i18, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle2;
                    i14 = i17;
                    boolean z522 = z4;
                    i15 = i18;
                    z3 = z522;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                z2 = z;
                i12 = i5 & 64;
                if (i12 == 0) {
                }
                i13 = i5 & 128;
                if (i13 == 0) {
                }
                if ((i6 & 23967451) == 4793490) {
                }
                if (i16 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function13, m5675getClipgIe3tQ8, z4, i17, i18, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle2;
                i14 = i17;
                boolean z5222 = z4;
                i15 = i18;
                z3 = z5222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            z2 = z;
            i12 = i5 & 64;
            if (i12 == 0) {
            }
            i13 = i5 & 128;
            if (i13 == 0) {
            }
            if ((i6 & 23967451) == 4793490) {
            }
            if (i16 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function13, m5675getClipgIe3tQ8, z4, i17, i18, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle2;
            i14 = i17;
            boolean z52222 = z4;
            i15 = i18;
            z3 = z52222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        z2 = z;
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & 128;
        if (i13 == 0) {
        }
        if ((i6 & 23967451) == 4793490) {
        }
        if (i16 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m842BasicTextVhcvRP8(str, companion, textStyle2, (Function1<? super TextLayoutResult, Unit>) function13, m5675getClipgIe3tQ8, z4, i17, i18, (ColorProducer) null, startRestartGroup, i6 & 33554430, 256);
        if (ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle2;
        i14 = i17;
        boolean z522222 = z4;
        i15 = i18;
        z3 = z522222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m841BasicTextVhcvRP8(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Map map, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        final Modifier.Companion companion;
        final int i15;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i16;
        final boolean z3;
        final int i17;
        final Map map2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(851408699);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)333@13901L240:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i18 = i5 & 2;
        if (i18 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    function12 = function1;
                    i6 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & 458752) == 0) {
                                i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        if (i14 == 256 || (191739611 & i6) != 38347922 || !startRestartGroup.getSkipping()) {
                            companion = i18 != 0 ? Modifier.INSTANCE : modifier;
                            TextStyle textStyle4 = i7 != 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                            Function1 function14 = i8 != 0 ? null : function12;
                            int m5675getClipgIe3tQ8 = i9 != 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i10;
                            boolean z4 = i11 != 0 ? true : z2;
                            int i19 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            i15 = i13 == 0 ? i3 : 1;
                            Map emptyMap = i14 != 0 ? MapsKt.emptyMap() : map;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(851408699, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:333)");
                            }
                            m840BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m5675getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle3 = textStyle4;
                            function13 = function14;
                            i16 = m5675getClipgIe3tQ8;
                            z3 = z4;
                            i17 = i19;
                            map2 = emptyMap;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            i17 = i2;
                            map2 = map;
                            textStyle3 = textStyle2;
                            function13 = function12;
                            z3 = z2;
                            i16 = i10;
                            i15 = i3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
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

                                public final void invoke(Composer composer2, int i20) {
                                    BasicTextKt.m841BasicTextVhcvRP8(AnnotatedString.this, companion, textStyle3, function13, i16, z3, i17, i15, map2, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 == 256) {
                    }
                    if (i18 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m840BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m5675getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textStyle3 = textStyle4;
                    function13 = function14;
                    i16 = m5675getClipgIe3tQ8;
                    z3 = z4;
                    i17 = i19;
                    map2 = emptyMap;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 == 256) {
                }
                if (i18 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m840BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m5675getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                textStyle3 = textStyle4;
                function13 = function14;
                i16 = m5675getClipgIe3tQ8;
                z3 = z4;
                i17 = i19;
                map2 = emptyMap;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 == 256) {
            }
            if (i18 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 == 0) {
            }
            if (i14 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m840BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m5675getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            textStyle3 = textStyle4;
            function13 = function14;
            i16 = m5675getClipgIe3tQ8;
            z3 = z4;
            i17 = i19;
            map2 = emptyMap;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 == 256) {
        }
        if (i18 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m840BasicTextRWo7tUw(annotatedString, companion, textStyle4, function14, m5675getClipgIe3tQ8, z4, i19, i15, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        textStyle3 = textStyle4;
        function13 = function14;
        i16 = m5675getClipgIe3tQ8;
        z3 = z4;
        i17 = i19;
        map2 = emptyMap;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l) {
                return invoke(saverScope, l.longValue());
            }

            public final Long invoke(SaverScope saverScope, long j) {
                if (SelectionRegistrarKt.hasSelection(SelectionRegistrar.this, j)) {
                    return Long.valueOf(j);
                }
                return null;
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l) {
                return invoke(l.longValue());
            }

            public final Long invoke(long j) {
                return Long.valueOf(j);
            }
        });
    }

    /* renamed from: textModifier-RWo7tUw, reason: not valid java name */
    private static final Modifier m843textModifierRWo7tUw(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer) {
        if (selectionController == null) {
            return modifier.then(Modifier.INSTANCE).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, null, colorProducer, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, null));
    }
}
