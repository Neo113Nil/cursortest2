package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.TextUnit;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÛ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0001\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%\u001aÙ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0001\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b'\u0010(\u001aï\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020)2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010 2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b-\u0010.\u001aí\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010 2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b/\u00100\u001aÏ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0001\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b1\u00102\u001aã\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020)2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010 2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b3\u00104\u001aÃ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010 2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b5\u00106\u001aÙ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020)2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020,0+2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010 2\b\b\u0002\u0010\"\u001a\u00020#H\u0007¢\u0006\u0004\b1\u00107\u001a(\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020#2\u0011\u0010>\u001a\r\u0012\u0004\u0012\u00020\u00010?¢\u0006\u0002\b@H\u0007¢\u0006\u0002\u0010A\u001a\u0018\u0010B\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020)2\u0006\u0010C\u001a\u00020DH\u0002\u001a\r\u0010E\u001a\u00020DH\u0003¢\u0006\u0002\u0010F\"\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020#09¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006G"}, d2 = {"Text", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "autoSize", "Landroidx/compose/foundation/text/TextAutoSize;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Landroidx/compose/ui/text/TextStyle;", "Text-Nvy7gAk", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/text/TextAutoSize;JLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/ColorProducer;", "Text-eWZoKXM", "(Ljava/lang/String;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextAutoSize;JLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContent", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Text-Z58ophY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/text/TextAutoSize;JLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-G6fR4hs", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextAutoSize;JLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "createTextWithLinkStyles", "linkStyles", "Landroidx/compose/ui/text/TextLinkStyles;", "rememberTextLinkStyles", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextLinkStyles;", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TextStyle defaultTextStyle;
            defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
            return defaultTextStyle;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideTextStyle$lambda$0(TextStyle textStyle, Function2 function2, int i, Composer composer, int i2) {
        ProvideTextStyle(textStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_G6fR4hs$lambda$2(AnnotatedString annotatedString, ColorProducer colorProducer, Modifier modifier, TextAutoSize textAutoSize, long j, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j2, TextDecoration textDecoration, TextAlign textAlign, long j3, int i, boolean z, int i2, int i3, Map map, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m4290TextG6fR4hs(annotatedString, colorProducer, modifier, textAutoSize, j, fontStyle, fontWeight, fontFamily, j2, textDecoration, textAlign, j3, i, z, i2, i3, map, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_IbK3jfQ$lambda$1(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m4291TextIbK3jfQ(annotatedString, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, map, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_Nvy7gAk$lambda$1(String str, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m4292TextNvy7gAk(str, modifier, j, textAutoSize, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_Z58ophY$lambda$3(AnnotatedString annotatedString, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m4293TextZ58ophY(annotatedString, modifier, j, textAutoSize, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, map, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text__4IGK_g$lambda$0(String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m4289Text4IGK_g(str, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text__4IGK_g$lambda$2(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, int i3, int i4, int i5, Composer composer, int i6) {
        m4288Text4IGK_g(annotatedString, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, map, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_eWZoKXM$lambda$0(String str, ColorProducer colorProducer, Modifier modifier, TextAutoSize textAutoSize, long j, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j2, TextDecoration textDecoration, TextAlign textAlign, long j3, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m4294TexteWZoKXM(str, colorProducer, modifier, textAutoSize, j, fontStyle, fontWeight, fontFamily, j2, textDecoration, textAlign, j3, i, z, i2, i3, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_fLXpl1I$lambda$1(String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, int i3, int i4, int i5, Composer composer, int i6) {
        m4295TextfLXpl1I(str, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, function1, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x049f  */
    /* renamed from: Text-Nvy7gAk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4292TextNvy7gAk(final String str, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        TextAutoSize textAutoSize2;
        int i10;
        long j5;
        int i11;
        FontStyle fontStyle2;
        int i12;
        FontWeight fontWeight2;
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
        Composer composer2;
        final long j6;
        final boolean z2;
        final int i30;
        final int i31;
        final Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle2;
        final int i32;
        final TextAutoSize textAutoSize3;
        final FontStyle fontStyle3;
        final Modifier modifier3;
        final long j7;
        final FontWeight fontWeight3;
        final FontFamily fontFamily2;
        final long j8;
        final TextDecoration textDecoration2;
        final TextAlign textAlign2;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        long m6822getUnspecified0d7_KjU;
        TextDecoration textDecoration3;
        TextAlign textAlign3;
        long j10;
        long j11;
        int i33;
        FontFamily fontFamily3;
        boolean z3;
        FontWeight fontWeight4;
        long j12;
        int i34;
        TextStyle textStyle3;
        FontStyle fontStyle4;
        Function1<? super TextLayoutResult, Unit> function13;
        int i35;
        long j13;
        long m9171getColor0d7_KjU;
        Composer startRestartGroup = composer.startRestartGroup(1809465675);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,autoSize,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,minLines,onTextLayout,style)125@6459L698:Text.kt#uh7d8r");
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i36 = i6 & 2;
        if (i36 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                textAutoSize2 = textAutoSize;
                i7 |= startRestartGroup.changedInstance(textAutoSize2) ? 2048 : 1024;
                i10 = i6 & 16;
                if (i10 != 0) {
                    i7 |= 24576;
                    j5 = j2;
                } else {
                    j5 = j2;
                    if ((i4 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(j5) ? 16384 : 8192;
                    }
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontStyle2 = fontStyle;
                } else {
                    fontStyle2 = fontStyle;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i7 |= startRestartGroup.changed(fontStyle2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & 1572864) == 0) {
                        i7 |= startRestartGroup.changed(fontWeight2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i14 = i13;
                    i7 |= startRestartGroup.changed(fontFamily) ? 8388608 : 4194304;
                    i15 = i6 & 256;
                    if (i15 == 0) {
                        i7 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i7 |= startRestartGroup.changed(j3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    i16 = i6 & 512;
                    if (i16 == 0) {
                        i7 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i17 = i15;
                        i7 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i18 = i6 & 1024;
                        if (i18 != 0) {
                            i20 = i5 | 6;
                            i19 = i18;
                        } else if ((i5 & 6) == 0) {
                            i19 = i18;
                            i20 = i5 | (startRestartGroup.changed(textAlign) ? 4 : 2);
                        } else {
                            i19 = i18;
                            i20 = i5;
                        }
                        i21 = i6 & 2048;
                        if (i21 != 0) {
                            i20 |= 48;
                        } else if ((i5 & 48) == 0) {
                            i20 |= startRestartGroup.changed(j4) ? 32 : 16;
                        }
                        int i37 = i20;
                        i22 = i6 & 4096;
                        if (i22 != 0) {
                            i37 |= 384;
                        } else if ((i5 & 384) == 0) {
                            i23 = i;
                            i37 |= startRestartGroup.changed(i23) ? 256 : 128;
                            i24 = i6 & 8192;
                            if (i24 == 0) {
                                i25 = i37 | 3072;
                            } else {
                                int i38 = i37;
                                if ((i5 & 3072) == 0) {
                                    i25 = i38 | (startRestartGroup.changed(z) ? 2048 : 1024);
                                } else {
                                    i25 = i38;
                                }
                            }
                            i26 = i6 & 16384;
                            if (i26 == 0) {
                                i27 = i25 | 24576;
                            } else {
                                i27 = i25;
                                if ((i5 & 24576) == 0) {
                                    i27 |= startRestartGroup.changed(i2) ? 16384 : 8192;
                                    i28 = i6 & 32768;
                                    if (i28 != 0) {
                                        i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i27 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                                    }
                                    i29 = i6 & 65536;
                                    if (i29 != 0) {
                                        i27 |= 1572864;
                                    } else if ((i5 & 1572864) == 0) {
                                        i27 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                                    }
                                    if ((i5 & 12582912) == 0) {
                                        i27 |= ((i6 & 131072) == 0 && startRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                                    }
                                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "120@6346L7");
                                        if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i6 & 131072) != 0) {
                                                i27 &= -29360129;
                                            }
                                            m6822getUnspecified0d7_KjU = j;
                                            fontFamily3 = fontFamily;
                                            j11 = j3;
                                            textDecoration3 = textDecoration;
                                            textAlign3 = textAlign;
                                            j10 = j4;
                                            z3 = z;
                                            i33 = i2;
                                            i35 = i3;
                                            textStyle3 = textStyle;
                                            fontWeight4 = fontWeight2;
                                            j12 = j5;
                                            i34 = i27;
                                            fontStyle4 = fontStyle2;
                                            function13 = function1;
                                        } else {
                                            if (i36 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            m6822getUnspecified0d7_KjU = i8 != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
                                            if (i9 != 0) {
                                                textAutoSize2 = null;
                                            }
                                            long m9941getUnspecifiedXSAIIZE = i10 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j5;
                                            if (i11 != 0) {
                                                fontStyle2 = null;
                                            }
                                            if (i12 != 0) {
                                                fontWeight2 = null;
                                            }
                                            FontFamily fontFamily4 = i14 != 0 ? null : fontFamily;
                                            long m9941getUnspecifiedXSAIIZE2 = i17 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j3;
                                            TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                            TextAlign textAlign4 = i19 != 0 ? null : textAlign;
                                            long m9941getUnspecifiedXSAIIZE3 = i21 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j4;
                                            if (i22 != 0) {
                                                i23 = TextOverflow.INSTANCE.m9657getClipgIe3tQ8();
                                            }
                                            boolean z4 = i24 != 0 ? true : z;
                                            int i39 = i26 != 0 ? Integer.MAX_VALUE : i2;
                                            int i40 = i28 == 0 ? i3 : 1;
                                            Function1<? super TextLayoutResult, Unit> function14 = i29 == 0 ? function1 : null;
                                            if ((i6 & 131072) != 0) {
                                                long j14 = m6822getUnspecified0d7_KjU;
                                                ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                Object consume = startRestartGroup.consume(providableCompositionLocal);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                textDecoration3 = textDecoration4;
                                                textAlign3 = textAlign4;
                                                j10 = m9941getUnspecifiedXSAIIZE3;
                                                j11 = m9941getUnspecifiedXSAIIZE2;
                                                i33 = i39;
                                                fontFamily3 = fontFamily4;
                                                z3 = z4;
                                                fontWeight4 = fontWeight2;
                                                j12 = m9941getUnspecifiedXSAIIZE;
                                                i34 = i27 & (-29360129);
                                                textStyle3 = (TextStyle) consume;
                                                fontStyle4 = fontStyle2;
                                                m6822getUnspecified0d7_KjU = j14;
                                            } else {
                                                textDecoration3 = textDecoration4;
                                                textAlign3 = textAlign4;
                                                j10 = m9941getUnspecifiedXSAIIZE3;
                                                j11 = m9941getUnspecifiedXSAIIZE2;
                                                i33 = i39;
                                                fontFamily3 = fontFamily4;
                                                z3 = z4;
                                                fontWeight4 = fontWeight2;
                                                j12 = m9941getUnspecifiedXSAIIZE;
                                                i34 = i27;
                                                textStyle3 = textStyle;
                                                fontStyle4 = fontStyle2;
                                            }
                                            function13 = function14;
                                            i35 = i40;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            j13 = m6822getUnspecified0d7_KjU;
                                            ComposerKt.traceEventStart(1809465675, i7, i34, "androidx.compose.material3.Text (Text.kt:121)");
                                        } else {
                                            j13 = m6822getUnspecified0d7_KjU;
                                        }
                                        startRestartGroup.startReplaceGroup(-565217490);
                                        ComposerKt.sourceInformation(startRestartGroup, "");
                                        if (j13 != 16) {
                                            m9171getColor0d7_KjU = j13;
                                        } else {
                                            startRestartGroup.startReplaceGroup(-565216717);
                                            ComposerKt.sourceInformation(startRestartGroup, "*123@6442L7");
                                            m9171getColor0d7_KjU = textStyle3.m9171getColor0d7_KjU();
                                            if (m9171getColor0d7_KjU == 16) {
                                                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                Object consume2 = startRestartGroup.consume(localContentColor);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                m9171getColor0d7_KjU = ((Color) consume2).m6796unboximpl();
                                            }
                                            startRestartGroup.endReplaceGroup();
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        long j15 = m9171getColor0d7_KjU;
                                        int i41 = i34;
                                        int i42 = (i7 & 126) | ((i41 >> 9) & 7168);
                                        int i43 = i41 << 6;
                                        boolean z5 = z3;
                                        int i44 = i33;
                                        int i45 = i35;
                                        Function1<? super TextLayoutResult, Unit> function15 = function13;
                                        BasicTextKt.m1716BasicTextRWo7tUw(str, modifier2, TextStyle.m9161mergedA7vx0o$default(textStyle3, j15, j12, fontWeight4, fontStyle4, null, fontFamily3, null, j11, null, null, null, 0L, textDecoration3, null, null, textAlign3 != null ? textAlign3.m9599unboximpl() : TextAlign.INSTANCE.m9606getUnspecifiede0LSkKk(), 0, j10, null, null, 0, 0, null, null, 16609104, null), function15, i23, z5, i44, i45, (ColorProducer) null, textAutoSize2, startRestartGroup, (i43 & 29360128) | i42 | (57344 & i43) | (458752 & i43) | (3670016 & i43) | ((i7 << 18) & 1879048192), 256);
                                        composer2 = startRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        FontWeight fontWeight5 = fontWeight4;
                                        i32 = i23;
                                        textAutoSize3 = textAutoSize2;
                                        fontWeight3 = fontWeight5;
                                        textAlign2 = textAlign3;
                                        i30 = i44;
                                        function12 = function15;
                                        modifier3 = modifier2;
                                        j7 = j12;
                                        fontStyle3 = fontStyle4;
                                        fontFamily2 = fontFamily3;
                                        i31 = i45;
                                        textDecoration2 = textDecoration3;
                                        j9 = j10;
                                        j6 = j13;
                                        z2 = z5;
                                        long j16 = j11;
                                        textStyle2 = textStyle3;
                                        j8 = j16;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        j6 = j;
                                        z2 = z;
                                        i30 = i2;
                                        i31 = i3;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        i32 = i23;
                                        textAutoSize3 = textAutoSize2;
                                        fontStyle3 = fontStyle2;
                                        modifier3 = modifier2;
                                        j7 = j5;
                                        fontWeight3 = fontWeight2;
                                        fontFamily2 = fontFamily;
                                        j8 = j3;
                                        textDecoration2 = textDecoration;
                                        textAlign2 = textAlign;
                                        j9 = j4;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit Text_Nvy7gAk$lambda$1;
                                                Text_Nvy7gAk$lambda$1 = TextKt.Text_Nvy7gAk$lambda$1(str, modifier3, j6, textAutoSize3, j7, fontStyle3, fontWeight3, fontFamily2, j8, textDecoration2, textAlign2, j9, i32, z2, i30, i31, function12, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                                return Text_Nvy7gAk$lambda$1;
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
                            if ((i5 & 12582912) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i23 = i;
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
                        if ((i5 & 12582912) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i17 = i15;
                    i18 = i6 & 1024;
                    if (i18 != 0) {
                    }
                    i21 = i6 & 2048;
                    if (i21 != 0) {
                    }
                    int i372 = i20;
                    i22 = i6 & 4096;
                    if (i22 != 0) {
                    }
                    i23 = i;
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
                    if ((i5 & 12582912) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i13;
                i15 = i6 & 256;
                if (i15 == 0) {
                }
                i16 = i6 & 512;
                if (i16 == 0) {
                }
                i17 = i15;
                i18 = i6 & 1024;
                if (i18 != 0) {
                }
                i21 = i6 & 2048;
                if (i21 != 0) {
                }
                int i3722 = i20;
                i22 = i6 & 4096;
                if (i22 != 0) {
                }
                i23 = i;
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
                if ((i5 & 12582912) == 0) {
                }
                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textAutoSize2 = textAutoSize;
            i10 = i6 & 16;
            if (i10 != 0) {
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i6 & 256;
            if (i15 == 0) {
            }
            i16 = i6 & 512;
            if (i16 == 0) {
            }
            i17 = i15;
            i18 = i6 & 1024;
            if (i18 != 0) {
            }
            i21 = i6 & 2048;
            if (i21 != 0) {
            }
            int i37222 = i20;
            i22 = i6 & 4096;
            if (i22 != 0) {
            }
            i23 = i;
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
            if ((i5 & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        textAutoSize2 = textAutoSize;
        i10 = i6 & 16;
        if (i10 != 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i6 & 256;
        if (i15 == 0) {
        }
        i16 = i6 & 512;
        if (i16 == 0) {
        }
        i17 = i15;
        i18 = i6 & 1024;
        if (i18 != 0) {
        }
        i21 = i6 & 2048;
        if (i21 != 0) {
        }
        int i372222 = i20;
        i22 = i6 & 4096;
        if (i22 != 0) {
        }
        i23 = i;
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
        if ((i5 & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text-eWZoKXM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4294TexteWZoKXM(final String str, final ColorProducer colorProducer, Modifier modifier, TextAutoSize textAutoSize, long j, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j2, TextDecoration textDecoration, TextAlign textAlign, long j3, int i, boolean z, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        ColorProducer colorProducer2;
        Modifier modifier2;
        int i8;
        int i9;
        int i10;
        long j4;
        int i11;
        FontStyle fontStyle2;
        int i12;
        FontWeight fontWeight2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j5;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final TextAutoSize textAutoSize2;
        final TextAlign textAlign2;
        final int i29;
        final boolean z2;
        final int i30;
        final int i31;
        final Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle2;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final Modifier modifier3;
        final FontFamily fontFamily2;
        final TextDecoration textDecoration2;
        final long j6;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        TextAlign textAlign3;
        int m9657getClipgIe3tQ8;
        boolean z3;
        int i32;
        int i33;
        Function1<? super TextLayoutResult, Unit> function13;
        TextAutoSize textAutoSize3;
        TextStyle textStyle3;
        long j9;
        FontStyle fontStyle4;
        long j10;
        FontWeight fontWeight4;
        FontFamily fontFamily3;
        TextDecoration textDecoration3;
        int i34;
        long j11;
        Composer startRestartGroup = composer.startRestartGroup(1078168779);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,color,modifier,autoSize,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,minLines,onTextLayout,style)222@11437L686:Text.kt#uh7d8r");
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            colorProducer2 = colorProducer;
            i7 |= startRestartGroup.changedInstance(colorProducer2) ? 32 : 16;
        } else {
            colorProducer2 = colorProducer;
        }
        int i35 = i6 & 4;
        if (i35 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i7 |= startRestartGroup.changedInstance(textAutoSize) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                    i10 = i35;
                    j4 = j;
                } else {
                    i10 = i35;
                    j4 = j;
                    if ((i4 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                    }
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontStyle2 = fontStyle;
                } else {
                    fontStyle2 = fontStyle;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i7 |= startRestartGroup.changed(fontStyle2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & 1572864) == 0) {
                        i7 |= startRestartGroup.changed(fontWeight2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= startRestartGroup.changed(fontFamily) ? 8388608 : 4194304;
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i7 |= startRestartGroup.changed(j2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i16 = i15;
                    i7 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i17 = i6 & 1024;
                    if (i17 == 0) {
                        i19 = i5 | 6;
                        i18 = i17;
                    } else if ((i5 & 6) == 0) {
                        i18 = i17;
                        i19 = i5 | (startRestartGroup.changed(textAlign) ? 4 : 2);
                    } else {
                        i18 = i17;
                        i19 = i5;
                    }
                    i20 = i6 & 2048;
                    if (i20 == 0) {
                        i19 |= 48;
                        j5 = j3;
                    } else {
                        j5 = j3;
                        if ((i5 & 48) == 0) {
                            i19 |= startRestartGroup.changed(j5) ? 32 : 16;
                        }
                    }
                    int i36 = i19;
                    i21 = i6 & 4096;
                    if (i21 == 0) {
                        i22 = i36 | 384;
                    } else {
                        int i37 = i36;
                        if ((i5 & 384) == 0) {
                            i37 |= startRestartGroup.changed(i) ? 256 : 128;
                        }
                        i22 = i37;
                    }
                    i23 = i6 & 8192;
                    if (i23 == 0) {
                        i24 = i22 | 3072;
                    } else {
                        int i38 = i22;
                        if ((i5 & 3072) == 0) {
                            i24 = i38 | (startRestartGroup.changed(z) ? 2048 : 1024);
                        } else {
                            i24 = i38;
                        }
                    }
                    i25 = i6 & 16384;
                    if (i25 == 0) {
                        i26 = i24 | 24576;
                    } else {
                        i26 = i24;
                        if ((i5 & 24576) == 0) {
                            i26 |= startRestartGroup.changed(i2) ? 16384 : 8192;
                            i27 = i6 & 32768;
                            if (i27 != 0) {
                                i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i26 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                            }
                            i28 = i6 & 65536;
                            if (i28 != 0) {
                                i26 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i26 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                            }
                            if ((i5 & 12582912) == 0) {
                                i26 |= ((i6 & 131072) == 0 && startRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                            }
                            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i26 & 4793491) != 4793490, i7 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "219@11419L7");
                                if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 131072) != 0) {
                                        i26 &= -29360129;
                                    }
                                    textAutoSize3 = textAutoSize;
                                    fontFamily3 = fontFamily;
                                    j11 = j2;
                                    textDecoration3 = textDecoration;
                                    textAlign3 = textAlign;
                                    m9657getClipgIe3tQ8 = i;
                                    z3 = z;
                                    i32 = i2;
                                    i33 = i3;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    j9 = j5;
                                    fontStyle4 = fontStyle2;
                                    j10 = j4;
                                    fontWeight4 = fontWeight2;
                                    i34 = i26;
                                } else {
                                    if (i10 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    TextAutoSize textAutoSize4 = i8 != 0 ? null : textAutoSize;
                                    if (i9 != 0) {
                                        j4 = TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE();
                                    }
                                    if (i11 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i12 != 0) {
                                        fontWeight2 = null;
                                    }
                                    FontFamily fontFamily4 = i13 != 0 ? null : fontFamily;
                                    long m9941getUnspecifiedXSAIIZE = i14 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j2;
                                    TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                    textAlign3 = i18 != 0 ? null : textAlign;
                                    if (i20 != 0) {
                                        j5 = TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE();
                                    }
                                    m9657getClipgIe3tQ8 = i21 != 0 ? TextOverflow.INSTANCE.m9657getClipgIe3tQ8() : i;
                                    z3 = i23 != 0 ? true : z;
                                    i32 = i25 != 0 ? Integer.MAX_VALUE : i2;
                                    i33 = i27 == 0 ? i3 : 1;
                                    Function1<? super TextLayoutResult, Unit> function14 = i28 == 0 ? function1 : null;
                                    if ((i6 & 131072) != 0) {
                                        Function1<? super TextLayoutResult, Unit> function15 = function14;
                                        ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                        TextAutoSize textAutoSize5 = textAutoSize4;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(providableCompositionLocal);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        function13 = function15;
                                        textStyle3 = (TextStyle) consume;
                                        j9 = j5;
                                        fontStyle4 = fontStyle2;
                                        j10 = j4;
                                        fontWeight4 = fontWeight2;
                                        fontFamily3 = fontFamily4;
                                        textDecoration3 = textDecoration4;
                                        i34 = i26 & (-29360129);
                                        j11 = m9941getUnspecifiedXSAIIZE;
                                        textAutoSize3 = textAutoSize5;
                                    } else {
                                        TextAutoSize textAutoSize6 = textAutoSize4;
                                        function13 = function14;
                                        textAutoSize3 = textAutoSize6;
                                        textStyle3 = textStyle;
                                        j9 = j5;
                                        fontStyle4 = fontStyle2;
                                        j10 = j4;
                                        fontWeight4 = fontWeight2;
                                        fontFamily3 = fontFamily4;
                                        textDecoration3 = textDecoration4;
                                        i34 = i26;
                                        j11 = m9941getUnspecifiedXSAIIZE;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1078168779, i7, i34, "androidx.compose.material3.Text (Text.kt:220)");
                                }
                                int i39 = (i7 & 14) | ((i7 >> 3) & 112) | ((i34 >> 9) & 7168);
                                int i40 = i34 << 6;
                                TextAutoSize textAutoSize7 = textAutoSize3;
                                BasicTextKt.m1716BasicTextRWo7tUw(str, modifier2, TextStyle.m9161mergedA7vx0o$default(textStyle3, 0L, j10, fontWeight4, fontStyle4, null, fontFamily3, null, j11, null, null, null, 0L, textDecoration3, null, null, textAlign3 != null ? textAlign3.m9599unboximpl() : TextAlign.INSTANCE.m9606getUnspecifiede0LSkKk(), 0, j9, null, null, 0, 0, null, null, 16609105, null), function13, m9657getClipgIe3tQ8, z3, i32, i33, colorProducer2, textAutoSize7, startRestartGroup, (i40 & 29360128) | i39 | (57344 & i40) | (458752 & i40) | (3670016 & i40) | ((i7 << 21) & 234881024) | ((i7 << 18) & 1879048192), 0);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function12 = function13;
                                textAutoSize2 = textAutoSize7;
                                z2 = z3;
                                textAlign2 = textAlign3;
                                i29 = m9657getClipgIe3tQ8;
                                i31 = i33;
                                textStyle2 = textStyle3;
                                j7 = j10;
                                fontWeight3 = fontWeight4;
                                fontStyle3 = fontStyle4;
                                fontFamily2 = fontFamily3;
                                j8 = j11;
                                textDecoration2 = textDecoration3;
                                i30 = i32;
                                modifier3 = modifier2;
                                j6 = j9;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                textAutoSize2 = textAutoSize;
                                textAlign2 = textAlign;
                                i29 = i;
                                z2 = z;
                                i30 = i2;
                                i31 = i3;
                                function12 = function1;
                                textStyle2 = textStyle;
                                fontStyle3 = fontStyle2;
                                fontWeight3 = fontWeight2;
                                modifier3 = modifier2;
                                fontFamily2 = fontFamily;
                                textDecoration2 = textDecoration;
                                j6 = j5;
                                j7 = j4;
                                j8 = j2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Text_eWZoKXM$lambda$0;
                                        Text_eWZoKXM$lambda$0 = TextKt.Text_eWZoKXM$lambda$0(str, colorProducer, modifier3, textAutoSize2, j7, fontStyle3, fontWeight3, fontFamily2, j8, textDecoration2, textAlign2, j6, i29, z2, i30, i31, function12, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                        return Text_eWZoKXM$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    i27 = i6 & 32768;
                    if (i27 != 0) {
                    }
                    i28 = i6 & 65536;
                    if (i28 != 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i26 & 4793491) != 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i16 = i15;
                i17 = i6 & 1024;
                if (i17 == 0) {
                }
                i20 = i6 & 2048;
                if (i20 == 0) {
                }
                int i362 = i19;
                i21 = i6 & 4096;
                if (i21 == 0) {
                }
                i23 = i6 & 8192;
                if (i23 == 0) {
                }
                i25 = i6 & 16384;
                if (i25 == 0) {
                }
                i27 = i6 & 32768;
                if (i27 != 0) {
                }
                i28 = i6 & 65536;
                if (i28 != 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i26 & 4793491) != 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & 1024;
            if (i17 == 0) {
            }
            i20 = i6 & 2048;
            if (i20 == 0) {
            }
            int i3622 = i19;
            i21 = i6 & 4096;
            if (i21 == 0) {
            }
            i23 = i6 & 8192;
            if (i23 == 0) {
            }
            i25 = i6 & 16384;
            if (i25 == 0) {
            }
            i27 = i6 & 32768;
            if (i27 != 0) {
            }
            i28 = i6 & 65536;
            if (i28 != 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i26 & 4793491) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & 1024;
        if (i17 == 0) {
        }
        i20 = i6 & 2048;
        if (i20 == 0) {
        }
        int i36222 = i19;
        i21 = i6 & 4096;
        if (i21 == 0) {
        }
        i23 = i6 & 8192;
        if (i23 == 0) {
        }
        i25 = i6 & 16384;
        if (i25 == 0) {
        }
        i27 = i6 & 32768;
        if (i27 != 0) {
        }
        i28 = i6 & 65536;
        if (i28 != 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i26 & 4793491) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_Z58ophY$lambda$0$0(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0290  */
    /* renamed from: Text-Z58ophY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4293TextZ58ophY(final AnnotatedString annotatedString, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        long j5;
        int i9;
        int i10;
        long j6;
        int i11;
        FontStyle fontStyle2;
        int i12;
        FontWeight fontWeight2;
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
        Composer composer2;
        final TextAutoSize textAutoSize2;
        final int i32;
        final boolean z2;
        final int i33;
        final int i34;
        final Map<String, InlineTextContent> map2;
        final Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle2;
        final long j7;
        final Modifier modifier3;
        final FontStyle fontStyle3;
        final FontFamily fontFamily2;
        final long j8;
        final TextDecoration textDecoration2;
        final FontWeight fontWeight3;
        final long j9;
        final TextAlign textAlign2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        int m9657getClipgIe3tQ8;
        boolean z3;
        int i35;
        int i36;
        Map<String, InlineTextContent> emptyMap;
        TextAutoSize textAutoSize3;
        Function1<? super TextLayoutResult, Unit> function13;
        TextAlign textAlign3;
        TextAutoSize textAutoSize4;
        Function1<? super TextLayoutResult, Unit> function14;
        TextStyle textStyle3;
        FontWeight fontWeight4;
        FontFamily fontFamily3;
        TextDecoration textDecoration3;
        FontStyle fontStyle4;
        long j11;
        long j12;
        long j13;
        int i37;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(292247417);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,autoSize,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,minLines,inlineContent,onTextLayout,style)328@16986L24,330@17056L73,332@17135L759:Text.kt#uh7d8r");
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i38 = i6 & 2;
        if (i38 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
                j5 = j;
            } else {
                j5 = j;
                if ((i4 & 384) == 0) {
                    i7 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i7 |= startRestartGroup.changedInstance(textAutoSize) ? 2048 : 1024;
                i10 = i6 & 16;
                if (i10 != 0) {
                    i7 |= 24576;
                    j6 = j2;
                } else {
                    j6 = j2;
                    if ((i4 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(j6) ? 16384 : 8192;
                    }
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontStyle2 = fontStyle;
                } else {
                    fontStyle2 = fontStyle;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i7 |= startRestartGroup.changed(fontStyle2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & 1572864) == 0) {
                        i7 |= startRestartGroup.changed(fontWeight2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i14 = i13;
                    i7 |= startRestartGroup.changed(fontFamily) ? 8388608 : 4194304;
                    i15 = i6 & 256;
                    if (i15 == 0) {
                        i7 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i16 = i7 | (startRestartGroup.changed(j3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag);
                        i17 = i6 & 512;
                        if (i17 != 0) {
                            i16 |= 805306368;
                            i18 = i17;
                        } else if ((i4 & 805306368) == 0) {
                            i18 = i17;
                            i16 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i18 = i17;
                        }
                        i19 = i16;
                        i20 = i6 & 1024;
                        if (i20 != 0) {
                            i21 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i21 = i5 | (startRestartGroup.changed(textAlign) ? 4 : 2);
                        } else {
                            i21 = i5;
                        }
                        i22 = i6 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i5 & 48) == 0) {
                            i23 = i22;
                            i21 |= startRestartGroup.changed(j4) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i39 = i21;
                        i24 = i6 & 4096;
                        if (i24 != 0) {
                            i25 = i39 | 384;
                        } else {
                            int i40 = i39;
                            if ((i5 & 384) == 0) {
                                i40 |= startRestartGroup.changed(i) ? 256 : 128;
                            }
                            i25 = i40;
                        }
                        i26 = i6 & 8192;
                        if (i26 != 0) {
                            i27 = i25 | 3072;
                        } else {
                            int i41 = i25;
                            if ((i5 & 3072) == 0) {
                                i27 = i41 | (startRestartGroup.changed(z) ? 2048 : 1024);
                            } else {
                                i27 = i41;
                            }
                        }
                        i28 = i6 & 16384;
                        if (i28 != 0) {
                            i27 |= 24576;
                        } else if ((i5 & 24576) == 0) {
                            i27 |= startRestartGroup.changed(i2) ? 16384 : 8192;
                            i29 = i6 & 32768;
                            if (i29 == 0) {
                                i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i27 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                            }
                            i30 = i6 & 65536;
                            if (i30 == 0) {
                                i27 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i27 |= startRestartGroup.changedInstance(map) ? 1048576 : 524288;
                            }
                            i31 = i6 & 131072;
                            if (i31 == 0) {
                                i27 |= 12582912;
                            } else if ((i5 & 12582912) == 0) {
                                i27 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                            }
                            if ((i5 & 100663296) == 0) {
                                i27 |= ((i6 & 262144) == 0 && startRestartGroup.changed(textStyle)) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                            }
                            if (!startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (38347923 & i27) != 38347922, i19 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "324@16816L2,325@16858L7");
                                if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 262144) != 0) {
                                        i27 &= -234881025;
                                    }
                                    textAutoSize4 = textAutoSize;
                                    fontFamily3 = fontFamily;
                                    j12 = j3;
                                    textDecoration3 = textDecoration;
                                    textAlign3 = textAlign;
                                    j13 = j4;
                                    m9657getClipgIe3tQ8 = i;
                                    z3 = z;
                                    i35 = i2;
                                    i36 = i3;
                                    emptyMap = map;
                                    textStyle3 = textStyle;
                                    fontWeight4 = fontWeight2;
                                    fontStyle4 = fontStyle2;
                                    j11 = j6;
                                    i37 = i27;
                                    function14 = function1;
                                } else {
                                    if (i38 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        j5 = Color.INSTANCE.m6822getUnspecified0d7_KjU();
                                    }
                                    TextAutoSize textAutoSize5 = i9 != 0 ? null : textAutoSize;
                                    if (i10 != 0) {
                                        j6 = TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE();
                                    }
                                    if (i11 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i12 != 0) {
                                        fontWeight2 = null;
                                    }
                                    FontFamily fontFamily4 = i14 != 0 ? null : fontFamily;
                                    long m9941getUnspecifiedXSAIIZE = i15 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i18 != 0 ? null : textDecoration;
                                    TextAlign textAlign4 = i20 == 0 ? textAlign : null;
                                    long m9941getUnspecifiedXSAIIZE2 = i23 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j4;
                                    m9657getClipgIe3tQ8 = i24 != 0 ? TextOverflow.INSTANCE.m9657getClipgIe3tQ8() : i;
                                    z3 = i26 != 0 ? true : z;
                                    i35 = i28 != 0 ? Integer.MAX_VALUE : i2;
                                    i36 = i29 != 0 ? 1 : i3;
                                    emptyMap = i30 != 0 ? MapsKt.emptyMap() : map;
                                    TextAlign textAlign5 = textAlign4;
                                    if (i31 != 0) {
                                        textAutoSize3 = textAutoSize5;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1676916603, "CC(remember):Text.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new Function1() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit Text_Z58ophY$lambda$0$0;
                                                    Text_Z58ophY$lambda$0$0 = TextKt.Text_Z58ophY$lambda$0$0((TextLayoutResult) obj);
                                                    return Text_Z58ophY$lambda$0$0;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        function13 = (Function1) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    } else {
                                        textAutoSize3 = textAutoSize5;
                                        function13 = function1;
                                    }
                                    if ((i6 & 262144) != 0) {
                                        ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                        Function1<? super TextLayoutResult, Unit> function15 = function13;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(providableCompositionLocal);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        textAlign3 = textAlign5;
                                        textStyle3 = (TextStyle) consume;
                                        fontWeight4 = fontWeight2;
                                        fontFamily3 = fontFamily4;
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j11 = j6;
                                        j12 = m9941getUnspecifiedXSAIIZE;
                                        j13 = m9941getUnspecifiedXSAIIZE2;
                                        textAutoSize4 = textAutoSize3;
                                        i37 = i27 & (-234881025);
                                        function14 = function15;
                                    } else {
                                        Function1<? super TextLayoutResult, Unit> function16 = function13;
                                        int i42 = i27;
                                        textAlign3 = textAlign5;
                                        textAutoSize4 = textAutoSize3;
                                        function14 = function16;
                                        textStyle3 = textStyle;
                                        fontWeight4 = fontWeight2;
                                        fontFamily3 = fontFamily4;
                                        textDecoration3 = textDecoration4;
                                        fontStyle4 = fontStyle2;
                                        j11 = j6;
                                        j12 = m9941getUnspecifiedXSAIIZE;
                                        j13 = m9941getUnspecifiedXSAIIZE2;
                                        i37 = i42;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(292247417, i19, i37, "androidx.compose.material3.Text (Text.kt:326)");
                                }
                                startRestartGroup.startReplaceGroup(1676919260);
                                ComposerKt.sourceInformation(startRestartGroup, "");
                                if (j5 != 16) {
                                    j14 = j5;
                                } else {
                                    startRestartGroup.startReplaceGroup(1676920033);
                                    ComposerKt.sourceInformation(startRestartGroup, "*327@16953L7");
                                    long m9171getColor0d7_KjU = textStyle3.m9171getColor0d7_KjU();
                                    if (m9171getColor0d7_KjU == 16) {
                                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume2 = startRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        m9171getColor0d7_KjU = ((Color) consume2).m6796unboximpl();
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    j14 = m9171getColor0d7_KjU;
                                }
                                startRestartGroup.endReplaceGroup();
                                TextLinkStyles rememberTextLinkStyles = rememberTextLinkStyles(startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1676924354, "CC(remember):Text.kt#9igjgp");
                                boolean changed = ((i19 & 14) == 4) | startRestartGroup.changed(rememberTextLinkStyles);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = createTextWithLinkStyles(annotatedString, rememberTextLinkStyles);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                AnnotatedString annotatedString2 = (AnnotatedString) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i43 = (i19 & 112) | ((i37 >> 12) & 7168);
                                int i44 = i37 << 6;
                                TextAutoSize textAutoSize6 = textAutoSize4;
                                Function1<? super TextLayoutResult, Unit> function17 = function14;
                                BasicTextKt.m1714BasicTextCL7eQgs(annotatedString2, modifier2, TextStyle.m9161mergedA7vx0o$default(textStyle3, j14, j11, fontWeight4, fontStyle4, null, fontFamily3, null, j12, null, null, null, 0L, textDecoration3, null, null, textAlign3 != null ? textAlign3.m9599unboximpl() : TextAlign.INSTANCE.m9606getUnspecifiede0LSkKk(), 0, j13, null, null, 0, 0, null, null, 16609104, null), function17, m9657getClipgIe3tQ8, z3, i35, i36, emptyMap, null, textAutoSize6, startRestartGroup, (i44 & 234881024) | i43 | (57344 & i44) | (458752 & i44) | (3670016 & i44) | (29360128 & i44), (i19 >> 9) & 14, 512);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function12 = function17;
                                textAlign2 = textAlign3;
                                textAutoSize2 = textAutoSize6;
                                j7 = j5;
                                modifier3 = modifier2;
                                i34 = i36;
                                map2 = emptyMap;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                fontStyle3 = fontStyle4;
                                fontFamily2 = fontFamily3;
                                j8 = j12;
                                textDecoration2 = textDecoration3;
                                i33 = i35;
                                z2 = z3;
                                j9 = j11;
                                i32 = m9657getClipgIe3tQ8;
                                j10 = j13;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                textAutoSize2 = textAutoSize;
                                i32 = i;
                                z2 = z;
                                i33 = i2;
                                i34 = i3;
                                map2 = map;
                                function12 = function1;
                                textStyle2 = textStyle;
                                j7 = j5;
                                modifier3 = modifier2;
                                fontStyle3 = fontStyle2;
                                fontFamily2 = fontFamily;
                                j8 = j3;
                                textDecoration2 = textDecoration;
                                fontWeight3 = fontWeight2;
                                j9 = j6;
                                textAlign2 = textAlign;
                                j10 = j4;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Text_Z58ophY$lambda$3;
                                        Text_Z58ophY$lambda$3 = TextKt.Text_Z58ophY$lambda$3(AnnotatedString.this, modifier3, j7, textAutoSize2, j9, fontStyle3, fontWeight3, fontFamily2, j8, textDecoration2, textAlign2, j10, i32, z2, i33, i34, map2, function12, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                        return Text_Z58ophY$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i29 = i6 & 32768;
                        if (i29 == 0) {
                        }
                        i30 = i6 & 65536;
                        if (i30 == 0) {
                        }
                        i31 = i6 & 131072;
                        if (i31 == 0) {
                        }
                        if ((i5 & 100663296) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (38347923 & i27) != 38347922, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i16 = i7;
                    i17 = i6 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i16;
                    i20 = i6 & 1024;
                    if (i20 != 0) {
                    }
                    i22 = i6 & 2048;
                    if (i22 != 0) {
                    }
                    int i392 = i21;
                    i24 = i6 & 4096;
                    if (i24 != 0) {
                    }
                    i26 = i6 & 8192;
                    if (i26 != 0) {
                    }
                    i28 = i6 & 16384;
                    if (i28 != 0) {
                    }
                    i29 = i6 & 32768;
                    if (i29 == 0) {
                    }
                    i30 = i6 & 65536;
                    if (i30 == 0) {
                    }
                    i31 = i6 & 131072;
                    if (i31 == 0) {
                    }
                    if ((i5 & 100663296) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (38347923 & i27) != 38347922, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i14 = i13;
                i15 = i6 & 256;
                if (i15 == 0) {
                }
                i16 = i7;
                i17 = i6 & 512;
                if (i17 != 0) {
                }
                i19 = i16;
                i20 = i6 & 1024;
                if (i20 != 0) {
                }
                i22 = i6 & 2048;
                if (i22 != 0) {
                }
                int i3922 = i21;
                i24 = i6 & 4096;
                if (i24 != 0) {
                }
                i26 = i6 & 8192;
                if (i26 != 0) {
                }
                i28 = i6 & 16384;
                if (i28 != 0) {
                }
                i29 = i6 & 32768;
                if (i29 == 0) {
                }
                i30 = i6 & 65536;
                if (i30 == 0) {
                }
                i31 = i6 & 131072;
                if (i31 == 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (38347923 & i27) != 38347922, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i10 = i6 & 16;
            if (i10 != 0) {
            }
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i6 & 256;
            if (i15 == 0) {
            }
            i16 = i7;
            i17 = i6 & 512;
            if (i17 != 0) {
            }
            i19 = i16;
            i20 = i6 & 1024;
            if (i20 != 0) {
            }
            i22 = i6 & 2048;
            if (i22 != 0) {
            }
            int i39222 = i21;
            i24 = i6 & 4096;
            if (i24 != 0) {
            }
            i26 = i6 & 8192;
            if (i26 != 0) {
            }
            i28 = i6 & 16384;
            if (i28 != 0) {
            }
            i29 = i6 & 32768;
            if (i29 == 0) {
            }
            i30 = i6 & 65536;
            if (i30 == 0) {
            }
            i31 = i6 & 131072;
            if (i31 == 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (38347923 & i27) != 38347922, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 != 0) {
        }
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i6 & 256;
        if (i15 == 0) {
        }
        i16 = i7;
        i17 = i6 & 512;
        if (i17 != 0) {
        }
        i19 = i16;
        i20 = i6 & 1024;
        if (i20 != 0) {
        }
        i22 = i6 & 2048;
        if (i22 != 0) {
        }
        int i392222 = i21;
        i24 = i6 & 4096;
        if (i24 != 0) {
        }
        i26 = i6 & 8192;
        if (i26 != 0) {
        }
        i28 = i6 & 16384;
        if (i28 != 0) {
        }
        i29 = i6 & 32768;
        if (i29 == 0) {
        }
        i30 = i6 & 65536;
        if (i30 == 0) {
        }
        i31 = i6 & 131072;
        if (i31 == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (38347923 & i27) != 38347922, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_G6fR4hs$lambda$0$0(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0286  */
    /* renamed from: Text-G6fR4hs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4290TextG6fR4hs(final AnnotatedString annotatedString, final ColorProducer colorProducer, Modifier modifier, TextAutoSize textAutoSize, long j, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j2, TextDecoration textDecoration, TextAlign textAlign, long j3, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        ColorProducer colorProducer2;
        Modifier modifier2;
        int i8;
        TextAutoSize textAutoSize2;
        int i9;
        long j4;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
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
        Composer composer2;
        final int i31;
        final boolean z2;
        final int i32;
        final int i33;
        final Map<String, InlineTextContent> map2;
        final Function1<? super TextLayoutResult, Unit> function12;
        final TextStyle textStyle2;
        final TextAutoSize textAutoSize3;
        final FontStyle fontStyle3;
        final long j5;
        final Modifier modifier3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily2;
        final long j6;
        final TextDecoration textDecoration2;
        final TextAlign textAlign2;
        final long j7;
        ScopeUpdateScope endRestartGroup;
        int m9657getClipgIe3tQ8;
        boolean z3;
        int i34;
        int i35;
        Map<String, InlineTextContent> emptyMap;
        FontFamily fontFamily3;
        Function1<? super TextLayoutResult, Unit> function13;
        TextAlign textAlign3;
        FontFamily fontFamily4;
        Function1<? super TextLayoutResult, Unit> function14;
        TextStyle textStyle3;
        FontStyle fontStyle4;
        long j8;
        TextDecoration textDecoration3;
        FontWeight fontWeight4;
        long j9;
        long j10;
        Composer startRestartGroup = composer.startRestartGroup(-630635271);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,color,modifier,autoSize,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,minLines,inlineContent,onTextLayout,style)435@22579L24,437@22649L73,439@22728L747:Text.kt#uh7d8r");
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            colorProducer2 = colorProducer;
            i7 |= startRestartGroup.changedInstance(colorProducer2) ? 32 : 16;
        } else {
            colorProducer2 = colorProducer;
        }
        int i36 = i6 & 4;
        if (i36 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                textAutoSize2 = textAutoSize;
                i7 |= startRestartGroup.changedInstance(textAutoSize2) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                    j4 = j;
                } else {
                    j4 = j;
                    if ((i4 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                    }
                }
                i10 = i6 & 32;
                if (i10 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontStyle2 = fontStyle;
                } else {
                    fontStyle2 = fontStyle;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i7 |= startRestartGroup.changed(fontStyle2) ? 131072 : 65536;
                    }
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                    i7 |= 1572864;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & 1572864) == 0) {
                        i7 |= startRestartGroup.changed(fontWeight2) ? 1048576 : 524288;
                    }
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= startRestartGroup.changed(fontFamily) ? 8388608 : 4194304;
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                    i14 = i7 | 100663296;
                } else {
                    i14 = i7;
                    if ((i4 & 100663296) == 0) {
                        i15 = i12;
                        i14 |= startRestartGroup.changed(j2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i16 = i6 & 512;
                        if (i16 == 0) {
                            i14 |= 805306368;
                            i17 = i16;
                        } else if ((i4 & 805306368) == 0) {
                            i17 = i16;
                            i14 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i17 = i16;
                        }
                        i18 = i14;
                        i19 = i6 & 1024;
                        if (i19 == 0) {
                            i20 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i20 = i5 | (startRestartGroup.changed(textAlign) ? 4 : 2);
                        } else {
                            i20 = i5;
                        }
                        i21 = i6 & 2048;
                        if (i21 == 0) {
                            i20 |= 48;
                            i22 = i21;
                        } else if ((i5 & 48) == 0) {
                            i22 = i21;
                            i20 |= startRestartGroup.changed(j3) ? 32 : 16;
                        } else {
                            i22 = i21;
                        }
                        int i37 = i20;
                        i23 = i6 & 4096;
                        if (i23 == 0) {
                            i24 = i37 | 384;
                        } else {
                            int i38 = i37;
                            if ((i5 & 384) == 0) {
                                i38 |= startRestartGroup.changed(i) ? 256 : 128;
                            }
                            i24 = i38;
                        }
                        i25 = i6 & 8192;
                        if (i25 == 0) {
                            i26 = i24 | 3072;
                        } else {
                            int i39 = i24;
                            if ((i5 & 3072) == 0) {
                                i26 = i39 | (startRestartGroup.changed(z) ? 2048 : 1024);
                            } else {
                                i26 = i39;
                            }
                        }
                        i27 = i6 & 16384;
                        if (i27 == 0) {
                            i26 |= 24576;
                        } else if ((i5 & 24576) == 0) {
                            i26 |= startRestartGroup.changed(i2) ? 16384 : 8192;
                            i28 = i6 & 32768;
                            if (i28 != 0) {
                                i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i26 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                            }
                            i29 = i6 & 65536;
                            if (i29 != 0) {
                                i26 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i26 |= startRestartGroup.changedInstance(map) ? 1048576 : 524288;
                            }
                            i30 = i6 & 131072;
                            if (i30 != 0) {
                                i26 |= 12582912;
                            } else if ((i5 & 12582912) == 0) {
                                i26 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                            }
                            if ((i5 & 100663296) == 0) {
                                i26 |= ((i6 & 262144) == 0 && startRestartGroup.changed(textStyle)) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                            }
                            if (startRestartGroup.shouldExecute((i18 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i18 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "432@22503L2,433@22545L7");
                                if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 262144) != 0) {
                                        i26 &= -234881025;
                                    }
                                    fontFamily4 = fontFamily;
                                    j9 = j2;
                                    textDecoration3 = textDecoration;
                                    textAlign3 = textAlign;
                                    j10 = j3;
                                    m9657getClipgIe3tQ8 = i;
                                    z3 = z;
                                    i34 = i2;
                                    i35 = i3;
                                    emptyMap = map;
                                    function14 = function1;
                                    textStyle3 = textStyle;
                                    fontStyle4 = fontStyle2;
                                    j8 = j4;
                                    fontWeight4 = fontWeight2;
                                } else {
                                    if (i36 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        textAutoSize2 = null;
                                    }
                                    long m9941getUnspecifiedXSAIIZE = i9 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j4;
                                    if (i10 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i11 != 0) {
                                        fontWeight2 = null;
                                    }
                                    FontFamily fontFamily5 = i15 != 0 ? null : fontFamily;
                                    long m9941getUnspecifiedXSAIIZE2 = i13 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j2;
                                    TextDecoration textDecoration4 = i17 != 0 ? null : textDecoration;
                                    TextAlign textAlign4 = i19 == 0 ? textAlign : null;
                                    long m9941getUnspecifiedXSAIIZE3 = i22 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j3;
                                    m9657getClipgIe3tQ8 = i23 != 0 ? TextOverflow.INSTANCE.m9657getClipgIe3tQ8() : i;
                                    z3 = i25 != 0 ? true : z;
                                    i34 = i27 != 0 ? Integer.MAX_VALUE : i2;
                                    i35 = i28 != 0 ? 1 : i3;
                                    emptyMap = i29 != 0 ? MapsKt.emptyMap() : map;
                                    TextAlign textAlign5 = textAlign4;
                                    if (i30 != 0) {
                                        fontFamily3 = fontFamily5;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -450083973, "CC(remember):Text.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new Function1() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit Text_G6fR4hs$lambda$0$0;
                                                    Text_G6fR4hs$lambda$0$0 = TextKt.Text_G6fR4hs$lambda$0$0((TextLayoutResult) obj);
                                                    return Text_G6fR4hs$lambda$0$0;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        function13 = (Function1) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    } else {
                                        fontFamily3 = fontFamily5;
                                        function13 = function1;
                                    }
                                    if ((i6 & 262144) != 0) {
                                        ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                        Function1<? super TextLayoutResult, Unit> function15 = function13;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(providableCompositionLocal);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        i26 &= -234881025;
                                        fontFamily4 = fontFamily3;
                                        function14 = function15;
                                        textStyle3 = (TextStyle) consume;
                                        fontStyle4 = fontStyle2;
                                        j8 = m9941getUnspecifiedXSAIIZE;
                                        textDecoration3 = textDecoration4;
                                        fontWeight4 = fontWeight2;
                                        j9 = m9941getUnspecifiedXSAIIZE2;
                                        j10 = m9941getUnspecifiedXSAIIZE3;
                                        textAlign3 = textAlign5;
                                    } else {
                                        Function1<? super TextLayoutResult, Unit> function16 = function13;
                                        textAlign3 = textAlign5;
                                        fontFamily4 = fontFamily3;
                                        function14 = function16;
                                        textStyle3 = textStyle;
                                        fontStyle4 = fontStyle2;
                                        j8 = m9941getUnspecifiedXSAIIZE;
                                        textDecoration3 = textDecoration4;
                                        fontWeight4 = fontWeight2;
                                        j9 = m9941getUnspecifiedXSAIIZE2;
                                        j10 = m9941getUnspecifiedXSAIIZE3;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-630635271, i18, i26, "androidx.compose.material3.Text (Text.kt:434)");
                                }
                                TextLinkStyles rememberTextLinkStyles = rememberTextLinkStyles(startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -450079230, "CC(remember):Text.kt#9igjgp");
                                boolean changed = ((i18 & 14) == 4) | startRestartGroup.changed(rememberTextLinkStyles);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = createTextWithLinkStyles(annotatedString, rememberTextLinkStyles);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                AnnotatedString annotatedString2 = (AnnotatedString) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i40 = ((i18 >> 3) & 112) | ((i26 >> 12) & 7168);
                                int i41 = i26 << 6;
                                BasicTextKt.m1714BasicTextCL7eQgs(annotatedString2, modifier2, TextStyle.m9161mergedA7vx0o$default(textStyle3, 0L, j8, fontWeight4, fontStyle4, null, fontFamily4, null, j9, null, null, null, 0L, textDecoration3, null, null, textAlign3 != null ? textAlign3.m9599unboximpl() : TextAlign.INSTANCE.m9606getUnspecifiede0LSkKk(), 0, j10, null, null, 0, 0, null, null, 16609105, null), function14, m9657getClipgIe3tQ8, z3, i34, i35, emptyMap, colorProducer2, textAutoSize2, startRestartGroup, (i41 & 234881024) | i40 | (57344 & i41) | (458752 & i41) | (3670016 & i41) | (29360128 & i41) | ((i18 << 24) & 1879048192), (i18 >> 9) & 14, 0);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function12 = function14;
                                textAutoSize3 = textAutoSize2;
                                modifier3 = modifier2;
                                i33 = i35;
                                map2 = emptyMap;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                fontStyle3 = fontStyle4;
                                fontFamily2 = fontFamily4;
                                j6 = j9;
                                textDecoration2 = textDecoration3;
                                textAlign2 = textAlign3;
                                i32 = i34;
                                z2 = z3;
                                j5 = j8;
                                i31 = m9657getClipgIe3tQ8;
                                j7 = j10;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                i31 = i;
                                z2 = z;
                                i32 = i2;
                                i33 = i3;
                                map2 = map;
                                function12 = function1;
                                textStyle2 = textStyle;
                                textAutoSize3 = textAutoSize2;
                                fontStyle3 = fontStyle2;
                                j5 = j4;
                                modifier3 = modifier2;
                                fontWeight3 = fontWeight2;
                                fontFamily2 = fontFamily;
                                j6 = j2;
                                textDecoration2 = textDecoration;
                                textAlign2 = textAlign;
                                j7 = j3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Text_G6fR4hs$lambda$2;
                                        Text_G6fR4hs$lambda$2 = TextKt.Text_G6fR4hs$lambda$2(AnnotatedString.this, colorProducer, modifier3, textAutoSize3, j5, fontStyle3, fontWeight3, fontFamily2, j6, textDecoration2, textAlign2, j7, i31, z2, i32, i33, map2, function12, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                        return Text_G6fR4hs$lambda$2;
                                    }
                                });
                                return;
                            }
                            return;
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
                        if ((i5 & 100663296) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i18 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i18 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                }
                i15 = i12;
                i16 = i6 & 512;
                if (i16 == 0) {
                }
                i18 = i14;
                i19 = i6 & 1024;
                if (i19 == 0) {
                }
                i21 = i6 & 2048;
                if (i21 == 0) {
                }
                int i372 = i20;
                i23 = i6 & 4096;
                if (i23 == 0) {
                }
                i25 = i6 & 8192;
                if (i25 == 0) {
                }
                i27 = i6 & 16384;
                if (i27 == 0) {
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
                if ((i5 & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i18 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i18 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textAutoSize2 = textAutoSize;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            i10 = i6 & 32;
            if (i10 != 0) {
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
            i15 = i12;
            i16 = i6 & 512;
            if (i16 == 0) {
            }
            i18 = i14;
            i19 = i6 & 1024;
            if (i19 == 0) {
            }
            i21 = i6 & 2048;
            if (i21 == 0) {
            }
            int i3722 = i20;
            i23 = i6 & 4096;
            if (i23 == 0) {
            }
            i25 = i6 & 8192;
            if (i25 == 0) {
            }
            i27 = i6 & 16384;
            if (i27 == 0) {
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
            if ((i5 & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i18 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i18 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        textAutoSize2 = textAutoSize;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        i10 = i6 & 32;
        if (i10 != 0) {
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
        i15 = i12;
        i16 = i6 & 512;
        if (i16 == 0) {
        }
        i18 = i14;
        i19 = i6 & 1024;
        if (i19 == 0) {
        }
        i21 = i6 & 2048;
        if (i21 == 0) {
        }
        int i37222 = i20;
        i23 = i6 & 4096;
        if (i23 == 0) {
        }
        i25 = i6 & 8192;
        if (i25 == 0) {
        }
        i27 = i6 & 16384;
        if (i27 == 0) {
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
        if ((i5 & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i18 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i18 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with autoSize instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4289Text4IGK_g(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1 function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        long j5;
        int i9;
        int i10;
        long j6;
        int i11;
        FontStyle fontStyle2;
        int i12;
        FontWeight fontWeight2;
        int i13;
        FontFamily fontFamily2;
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
        boolean z2;
        int i26;
        int i27;
        int i28;
        int i29;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i30;
        final int i31;
        final int i32;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z3;
        final long j7;
        final FontStyle fontStyle3;
        final long j8;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        Function1 function13;
        Modifier modifier3;
        TextStyle textStyle3;
        long j11;
        Function1 function14;
        int i33;
        int i34;
        TextDecoration textDecoration3;
        boolean z4;
        long j12;
        int i35;
        TextAlign textAlign3;
        FontFamily fontFamily4;
        FontStyle fontStyle4;
        long j13;
        FontWeight fontWeight4;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(-2055108902);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,minLines,onTextLayout,style)488@24301L555:Text.kt#uh7d8r");
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i36 = i6 & 2;
        if (i36 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i9 = i7 | 384;
                j5 = j;
            } else {
                int i37 = i7;
                j5 = j;
                if ((i4 & 384) == 0) {
                    i37 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
                i9 = i37;
            }
            i10 = i6 & 8;
            if (i10 == 0) {
                i9 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i4 & 3072) == 0) {
                    i9 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i11 = i6 & 16;
            if (i11 == 0) {
                i9 |= 24576;
            } else if ((i4 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i9 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i12 = i6 & 32;
                if (i12 != 0) {
                    i9 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i9 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i13 = i6 & 64;
                if (i13 != 0) {
                    i9 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i9 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i14 = i6 & 128;
                if (i14 != 0) {
                    i9 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i15 = i9 | (startRestartGroup.changed(j3) ? 8388608 : 4194304);
                    i16 = i6 & 256;
                    if (i16 == 0) {
                        i15 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i17 = i16;
                        i15 |= startRestartGroup.changed(textDecoration) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i18 = i6 & 512;
                        if (i18 != 0) {
                            i15 |= 805306368;
                            i19 = i18;
                        } else if ((i4 & 805306368) == 0) {
                            i19 = i18;
                            i15 |= startRestartGroup.changed(textAlign) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i19 = i18;
                        }
                        i20 = i15;
                        i21 = i6 & 1024;
                        if (i21 != 0) {
                            i22 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i22 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i22 = i5;
                        }
                        i23 = i6 & 2048;
                        if (i23 != 0) {
                            i22 |= 48;
                            i24 = i23;
                        } else if ((i5 & 48) == 0) {
                            i24 = i23;
                            i22 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i24 = i23;
                        }
                        int i38 = i22;
                        i25 = i6 & 4096;
                        if (i25 != 0) {
                            i38 |= 384;
                        } else if ((i5 & 384) == 0) {
                            z2 = z;
                            i38 |= startRestartGroup.changed(z2) ? 256 : 128;
                            i26 = i6 & 8192;
                            if (i26 == 0) {
                                i27 = i38 | 3072;
                            } else {
                                int i39 = i38;
                                if ((i5 & 3072) == 0) {
                                    i27 = i39 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i27 = i39;
                                }
                            }
                            i28 = i6 & 16384;
                            if (i28 == 0) {
                                i27 |= 24576;
                            } else if ((i5 & 24576) == 0) {
                                i27 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                                i29 = i6 & 32768;
                                if (i29 != 0) {
                                    i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i27 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i5 & 1572864) == 0) {
                                    i27 |= ((i6 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "486@24284L7");
                                    if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i6 & 65536) != 0) {
                                            i27 &= -3670017;
                                        }
                                        long j15 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j15;
                                        modifier3 = modifier;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j11 = j4;
                                        i34 = i;
                                        i35 = i2;
                                        i33 = i3;
                                        function14 = function1;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        j12 = j5;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j3;
                                    } else {
                                        Modifier.Companion companion = i36 != 0 ? Modifier.INSTANCE : modifier;
                                        if (i8 != 0) {
                                            j5 = Color.INSTANCE.m6822getUnspecified0d7_KjU();
                                        }
                                        if (i10 != 0) {
                                            j6 = TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE();
                                        }
                                        if (i11 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i13 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m9941getUnspecifiedXSAIIZE = i14 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i17 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i19 != 0 ? null : textAlign;
                                        long m9941getUnspecifiedXSAIIZE2 = i21 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j4;
                                        int m9657getClipgIe3tQ8 = i24 != 0 ? TextOverflow.INSTANCE.m9657getClipgIe3tQ8() : i;
                                        if (i25 != 0) {
                                            z2 = true;
                                        }
                                        int i40 = i26 != 0 ? Integer.MAX_VALUE : i2;
                                        int i41 = i28 == 0 ? i3 : 1;
                                        Function1 function15 = i29 == 0 ? function1 : null;
                                        if ((i6 & 65536) != 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            Modifier modifier4 = companion;
                                            function13 = function15;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i27 &= -3670017;
                                            modifier3 = modifier4;
                                            textStyle3 = (TextStyle) consume;
                                        } else {
                                            function13 = function15;
                                            modifier3 = companion;
                                            textStyle3 = textStyle;
                                        }
                                        j11 = m9941getUnspecifiedXSAIIZE2;
                                        function14 = function13;
                                        i33 = i41;
                                        i34 = m9657getClipgIe3tQ8;
                                        textDecoration3 = textDecoration4;
                                        long j16 = m9941getUnspecifiedXSAIIZE;
                                        z4 = z2;
                                        j12 = j5;
                                        i35 = i40;
                                        textAlign3 = textAlign4;
                                        fontFamily4 = fontFamily2;
                                        long j17 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j17;
                                        fontWeight4 = fontWeight2;
                                        j14 = j16;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2055108902, i20, i27, "androidx.compose.material3.Text (Text.kt:488)");
                                    }
                                    int i42 = i20 << 3;
                                    int i43 = i27 << 3;
                                    composer2 = startRestartGroup;
                                    m4292TextNvy7gAk(str, modifier3, j12, null, j13, fontStyle4, fontWeight4, fontFamily4, j14, textDecoration3, textAlign3, j11, i34, z4, i35, i33, function14, textStyle3, composer2, (i20 & 14) | 3072 | (i20 & 112) | (i20 & 896) | (57344 & i42) | (458752 & i42) | (3670016 & i42) | (29360128 & i42) | (234881024 & i42) | (i42 & 1879048192), ((i20 >> 27) & 14) | (i43 & 112) | (i43 & 896) | (i43 & 7168) | (57344 & i43) | (458752 & i43) | (3670016 & i43) | (i43 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    j7 = j12;
                                    j8 = j13;
                                    fontStyle3 = fontStyle4;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j10 = j11;
                                    i30 = i34;
                                    z3 = z4;
                                    i31 = i35;
                                    i32 = i33;
                                    function12 = function14;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i30 = i;
                                    i31 = i2;
                                    i32 = i3;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j7 = j5;
                                    fontStyle3 = fontStyle2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j3;
                                    textDecoration2 = textDecoration;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Text__4IGK_g$lambda$0;
                                            Text__4IGK_g$lambda$0 = TextKt.Text__4IGK_g$lambda$0(str, modifier2, j7, j8, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i30, z3, i31, i32, function12, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                            return Text__4IGK_g$lambda$0;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i29 = i6 & 32768;
                            if (i29 != 0) {
                            }
                            if ((i5 & 1572864) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i26 = i6 & 8192;
                        if (i26 == 0) {
                        }
                        i28 = i6 & 16384;
                        if (i28 == 0) {
                        }
                        i29 = i6 & 32768;
                        if (i29 != 0) {
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i17 = i16;
                    i18 = i6 & 512;
                    if (i18 != 0) {
                    }
                    i20 = i15;
                    i21 = i6 & 1024;
                    if (i21 != 0) {
                    }
                    i23 = i6 & 2048;
                    if (i23 != 0) {
                    }
                    int i382 = i22;
                    i25 = i6 & 4096;
                    if (i25 != 0) {
                    }
                    z2 = z;
                    i26 = i6 & 8192;
                    if (i26 == 0) {
                    }
                    i28 = i6 & 16384;
                    if (i28 == 0) {
                    }
                    i29 = i6 & 32768;
                    if (i29 != 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i15 = i9;
                i16 = i6 & 256;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i6 & 512;
                if (i18 != 0) {
                }
                i20 = i15;
                i21 = i6 & 1024;
                if (i21 != 0) {
                }
                i23 = i6 & 2048;
                if (i23 != 0) {
                }
                int i3822 = i22;
                i25 = i6 & 4096;
                if (i25 != 0) {
                }
                z2 = z;
                i26 = i6 & 8192;
                if (i26 == 0) {
                }
                i28 = i6 & 16384;
                if (i28 == 0) {
                }
                i29 = i6 & 32768;
                if (i29 != 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            if (i13 != 0) {
            }
            i14 = i6 & 128;
            if (i14 != 0) {
            }
            i15 = i9;
            i16 = i6 & 256;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i6 & 512;
            if (i18 != 0) {
            }
            i20 = i15;
            i21 = i6 & 1024;
            if (i21 != 0) {
            }
            i23 = i6 & 2048;
            if (i23 != 0) {
            }
            int i38222 = i22;
            i25 = i6 & 4096;
            if (i25 != 0) {
            }
            z2 = z;
            i26 = i6 & 8192;
            if (i26 == 0) {
            }
            i28 = i6 & 16384;
            if (i28 == 0) {
            }
            i29 = i6 & 32768;
            if (i29 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i10 = i6 & 8;
        if (i10 == 0) {
        }
        i11 = i6 & 16;
        if (i11 == 0) {
        }
        fontStyle2 = fontStyle;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        if (i13 != 0) {
        }
        i14 = i6 & 128;
        if (i14 != 0) {
        }
        i15 = i9;
        i16 = i6 & 256;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i6 & 512;
        if (i18 != 0) {
        }
        i20 = i15;
        i21 = i6 & 1024;
        if (i21 != 0) {
        }
        i23 = i6 & 2048;
        if (i23 != 0) {
        }
        int i382222 = i22;
        i25 = i6 & 4096;
        if (i25 != 0) {
        }
        z2 = z;
        i26 = i6 & 8192;
        if (i26 == 0) {
        }
        i28 = i6 & 16384;
        if (i28 == 0) {
        }
        i29 = i6 & 32768;
        if (i29 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_IbK3jfQ$lambda$0$0(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with autoSize instead")
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4291TextIbK3jfQ(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        long j5;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Composer composer2;
        final Modifier modifier2;
        final long j6;
        final TextDecoration textDecoration2;
        final int i28;
        final int i29;
        final int i30;
        final Map map2;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z3;
        final FontStyle fontStyle3;
        final long j7;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j8;
        final TextAlign textAlign2;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        long m6822getUnspecified0d7_KjU;
        int i31;
        TextAlign textAlign3;
        Function1 function13;
        FontStyle fontStyle4;
        long j10;
        TextAlign textAlign4;
        Function1 function14;
        TextStyle textStyle3;
        Map map3;
        boolean z4;
        int i32;
        int i33;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j11;
        int i34;
        long j12;
        Modifier modifier3;
        TextDecoration textDecoration3;
        Composer startRestartGroup = composer.startRestartGroup(2027001676);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,minLines,inlineContent,onTextLayout,style)534@25745L594:Text.kt#uh7d8r");
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i35 = i6 & 2;
        if (i35 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(j5) ? 2048 : 1024;
                }
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i7 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i7 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i7 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i7 |= startRestartGroup.changed(textDecoration) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i16 = i15;
                    i7 |= startRestartGroup.changed(textAlign) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i17 = i6 & 1024;
                    if (i17 == 0) {
                        i18 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i18 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i18 = i5;
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                        i20 = i19;
                    } else if ((i5 & 48) == 0) {
                        i20 = i19;
                        i18 |= startRestartGroup.changed(i) ? 32 : 16;
                    } else {
                        i20 = i19;
                    }
                    int i36 = i18;
                    i21 = i6 & 4096;
                    if (i21 == 0) {
                        i36 |= 384;
                    } else if ((i5 & 384) == 0) {
                        z2 = z;
                        i36 |= startRestartGroup.changed(z2) ? 256 : 128;
                        i22 = i6 & 8192;
                        if (i22 != 0) {
                            i23 = i36 | 3072;
                        } else {
                            int i37 = i36;
                            if ((i5 & 3072) == 0) {
                                i23 = i37 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                            } else {
                                i23 = i37;
                            }
                        }
                        i24 = i6 & 16384;
                        if (i24 != 0) {
                            i25 = i23 | 24576;
                        } else {
                            i25 = i23;
                            if ((i5 & 24576) == 0) {
                                i25 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                                i26 = i6 & 32768;
                                if (i26 == 0) {
                                    i25 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i25 |= startRestartGroup.changedInstance(map) ? 131072 : 65536;
                                }
                                i27 = i6 & 65536;
                                if (i27 == 0) {
                                    i25 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    i25 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                                }
                                if ((i5 & 12582912) == 0) {
                                    i25 |= ((i6 & 131072) == 0 && startRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                                }
                                if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "531@25686L2,532@25728L7");
                                    if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i6 & 131072) != 0) {
                                            i25 &= -29360129;
                                        }
                                        fontStyle4 = fontStyle2;
                                        j10 = j5;
                                        m6822getUnspecified0d7_KjU = j;
                                        textDecoration3 = textDecoration;
                                        textAlign4 = textAlign;
                                        i32 = i;
                                        i33 = i2;
                                        i31 = i3;
                                        map3 = map;
                                        function14 = function1;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        i34 = i25;
                                        modifier3 = modifier;
                                        j11 = j3;
                                        j12 = j4;
                                    } else {
                                        Modifier.Companion companion = i35 != 0 ? Modifier.INSTANCE : modifier;
                                        m6822getUnspecified0d7_KjU = i8 != 0 ? Color.INSTANCE.m6822getUnspecified0d7_KjU() : j;
                                        if (i9 != 0) {
                                            j5 = TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m9941getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i14 != 0 ? null : textDecoration;
                                        TextAlign textAlign5 = i16 == 0 ? textAlign : null;
                                        long m9941getUnspecifiedXSAIIZE2 = i17 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j4;
                                        int m9657getClipgIe3tQ8 = i20 != 0 ? TextOverflow.INSTANCE.m9657getClipgIe3tQ8() : i;
                                        if (i21 != 0) {
                                            z2 = true;
                                        }
                                        int i38 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                        i31 = i24 == 0 ? i3 : 1;
                                        Map emptyMap = i26 != 0 ? MapsKt.emptyMap() : map;
                                        Modifier modifier4 = companion;
                                        if (i27 != 0) {
                                            textAlign3 = textAlign5;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1966519794, "CC(remember):Text.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda11
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit Text_IbK3jfQ$lambda$0$0;
                                                        Text_IbK3jfQ$lambda$0$0 = TextKt.Text_IbK3jfQ$lambda$0$0((TextLayoutResult) obj);
                                                        return Text_IbK3jfQ$lambda$0$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            function13 = (Function1) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            textAlign3 = textAlign5;
                                            function13 = function1;
                                        }
                                        if ((i6 & 131072) != 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            Function1 function15 = function13;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            fontStyle4 = fontStyle2;
                                            j10 = j5;
                                            textAlign4 = textAlign3;
                                            textStyle3 = (TextStyle) consume;
                                            map3 = emptyMap;
                                            z4 = z2;
                                            i32 = m9657getClipgIe3tQ8;
                                            i33 = i38;
                                            fontWeight4 = fontWeight2;
                                            fontFamily4 = fontFamily2;
                                            j11 = m9941getUnspecifiedXSAIIZE;
                                            i34 = i25 & (-29360129);
                                            j12 = m9941getUnspecifiedXSAIIZE2;
                                            modifier3 = modifier4;
                                            function14 = function15;
                                        } else {
                                            fontStyle4 = fontStyle2;
                                            j10 = j5;
                                            textAlign4 = textAlign3;
                                            function14 = function13;
                                            textStyle3 = textStyle;
                                            map3 = emptyMap;
                                            z4 = z2;
                                            i32 = m9657getClipgIe3tQ8;
                                            i33 = i38;
                                            fontWeight4 = fontWeight2;
                                            fontFamily4 = fontFamily2;
                                            j11 = m9941getUnspecifiedXSAIIZE;
                                            i34 = i25;
                                            j12 = m9941getUnspecifiedXSAIIZE2;
                                            modifier3 = modifier4;
                                        }
                                        textDecoration3 = textDecoration4;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2027001676, i7, i34, "androidx.compose.material3.Text (Text.kt:534)");
                                    }
                                    int i39 = i7 << 3;
                                    int i40 = i34 << 3;
                                    composer2 = startRestartGroup;
                                    long j13 = m6822getUnspecified0d7_KjU;
                                    Function1 function16 = function14;
                                    TextStyle textStyle4 = textStyle3;
                                    m4293TextZ58ophY(annotatedString, modifier3, j13, null, j10, fontStyle4, fontWeight4, fontFamily4, j11, textDecoration3, textAlign4, j12, i32, z4, i33, i31, map3, function16, textStyle4, composer2, (i7 & 14) | 3072 | (i7 & 112) | (i7 & 896) | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (29360128 & i39) | (234881024 & i39) | (i39 & 1879048192), ((i7 >> 27) & 14) | (i40 & 112) | (i40 & 896) | (i40 & 7168) | (57344 & i40) | (458752 & i40) | (3670016 & i40) | (29360128 & i40) | (i40 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    j6 = j13;
                                    j7 = j10;
                                    fontStyle3 = fontStyle4;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j8 = j11;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign4;
                                    j9 = j12;
                                    i28 = i32;
                                    z3 = z4;
                                    i29 = i33;
                                    i30 = i31;
                                    map2 = map3;
                                    function12 = function16;
                                    textStyle2 = textStyle4;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    j6 = j;
                                    textDecoration2 = textDecoration;
                                    i28 = i;
                                    i29 = i2;
                                    i30 = i3;
                                    map2 = map;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    fontStyle3 = fontStyle2;
                                    j7 = j5;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j8 = j3;
                                    textAlign2 = textAlign;
                                    j9 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Text_IbK3jfQ$lambda$1;
                                            Text_IbK3jfQ$lambda$1 = TextKt.Text_IbK3jfQ$lambda$1(AnnotatedString.this, modifier2, j6, j7, fontStyle3, fontWeight3, fontFamily3, j8, textDecoration2, textAlign2, j9, i28, z3, i29, i30, map2, function12, textStyle2, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                            return Text_IbK3jfQ$lambda$1;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        i26 = i6 & 32768;
                        if (i26 == 0) {
                        }
                        i27 = i6 & 65536;
                        if (i27 == 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z2 = z;
                    i22 = i6 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 16384;
                    if (i24 != 0) {
                    }
                    i26 = i6 & 32768;
                    if (i26 == 0) {
                    }
                    i27 = i6 & 65536;
                    if (i27 == 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i16 = i15;
                i17 = i6 & 1024;
                if (i17 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i362 = i18;
                i21 = i6 & 4096;
                if (i21 == 0) {
                }
                z2 = z;
                i22 = i6 & 8192;
                if (i22 != 0) {
                }
                i24 = i6 & 16384;
                if (i24 != 0) {
                }
                i26 = i6 & 32768;
                if (i26 == 0) {
                }
                i27 = i6 & 65536;
                if (i27 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & 1024;
            if (i17 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i3622 = i18;
            i21 = i6 & 4096;
            if (i21 == 0) {
            }
            z2 = z;
            i22 = i6 & 8192;
            if (i22 != 0) {
            }
            i24 = i6 & 16384;
            if (i24 != 0) {
            }
            i26 = i6 & 32768;
            if (i26 == 0) {
            }
            i27 = i6 & 65536;
            if (i27 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & 1024;
        if (i17 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i36222 = i18;
        i21 = i6 & 4096;
        if (i21 == 0) {
        }
        z2 = z;
        i22 = i6 & 8192;
        if (i22 != 0) {
        }
        i24 = i6 & 16384;
        if (i24 != 0) {
        }
        i26 = i6 & 32768;
        if (i26 == 0) {
        }
        i27 = i6 & 65536;
        if (i27 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_fLXpl1I$lambda$0$0(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4295TextfLXpl1I(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        boolean z2;
        int i25;
        int i26;
        int i27;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i28;
        final int i29;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z3;
        final long j7;
        final FontStyle fontStyle3;
        final long j8;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        Function1 function13;
        Function1 function14;
        Modifier modifier4;
        TextAlign textAlign3;
        TextStyle textStyle3;
        TextDecoration textDecoration3;
        int i30;
        FontFamily fontFamily4;
        Function1 function15;
        int i31;
        long j11;
        boolean z4;
        long j12;
        FontStyle fontStyle4;
        long j13;
        FontWeight fontWeight4;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(1968784669);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,onTextLayout,style)579@27135L523:Text.kt#uh7d8r");
        if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i32 = i5 & 2;
        if (i32 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                j5 = j;
            } else {
                int i33 = i6;
                j5 = j;
                if ((i3 & 384) == 0) {
                    i33 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
                i8 = i33;
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i8 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i8 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i5 & 32;
                int i34 = 65536;
                if (i11 != 0) {
                    i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i8 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i14 = i8 | (startRestartGroup.changed(j3) ? 8388608 : 4194304);
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changed(textDecoration) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i17 = i5 & 512;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= startRestartGroup.changed(textAlign) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & 1024;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i35 = i21;
                        i24 = i5 & 4096;
                        if (i24 != 0) {
                            i35 |= 384;
                        } else if ((i4 & 384) == 0) {
                            z2 = z;
                            i35 |= startRestartGroup.changed(z2) ? 256 : 128;
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i35 | 3072;
                            } else {
                                int i36 = i35;
                                if ((i4 & 3072) == 0) {
                                    i26 = i36 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i26 = i36;
                                }
                            }
                            i27 = i5 & 16384;
                            if (i27 == 0) {
                                i26 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i26 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    if ((i5 & 32768) == 0 && startRestartGroup.changed(textStyle)) {
                                        i34 = 131072;
                                    }
                                    i26 |= i34;
                                }
                                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "576@27076L2,577@27118L7");
                                    if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 32768) != 0) {
                                            i26 &= -458753;
                                        }
                                        long j15 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j15;
                                        modifier4 = modifier;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j12 = j4;
                                        i30 = i;
                                        i31 = i2;
                                        function15 = function1;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        j11 = j5;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j3;
                                    } else {
                                        Modifier.Companion companion = i32 != 0 ? Modifier.INSTANCE : modifier;
                                        if (i7 != 0) {
                                            j5 = Color.INSTANCE.m6822getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            j6 = TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m9941getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i18 == 0 ? textAlign : null;
                                        long m9941getUnspecifiedXSAIIZE2 = i20 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j4;
                                        int m9657getClipgIe3tQ8 = i23 != 0 ? TextOverflow.INSTANCE.m9657getClipgIe3tQ8() : i;
                                        boolean z5 = i24 == 0 ? z2 : true;
                                        int i37 = i25 != 0 ? Integer.MAX_VALUE : i2;
                                        if (i27 != 0) {
                                            modifier3 = companion;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2078491649, "CC(remember):Text.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda9
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit Text_fLXpl1I$lambda$0$0;
                                                        Text_fLXpl1I$lambda$0$0 = TextKt.Text_fLXpl1I$lambda$0$0((TextLayoutResult) obj);
                                                        return Text_fLXpl1I$lambda$0$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            function13 = (Function1) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            modifier3 = companion;
                                            function13 = function1;
                                        }
                                        if ((i5 & 32768) != 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            function14 = function13;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i26 &= -458753;
                                            modifier4 = modifier3;
                                            textAlign3 = textAlign4;
                                            textStyle3 = (TextStyle) consume;
                                        } else {
                                            function14 = function13;
                                            modifier4 = modifier3;
                                            textAlign3 = textAlign4;
                                            textStyle3 = textStyle;
                                        }
                                        textDecoration3 = textDecoration4;
                                        i30 = m9657getClipgIe3tQ8;
                                        fontFamily4 = fontFamily2;
                                        function15 = function14;
                                        long j16 = m9941getUnspecifiedXSAIIZE;
                                        i31 = i37;
                                        j11 = j5;
                                        z4 = z5;
                                        j12 = m9941getUnspecifiedXSAIIZE2;
                                        long j17 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j17;
                                        fontWeight4 = fontWeight2;
                                        j14 = j16;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1968784669, i19, i26, "androidx.compose.material3.Text (Text.kt:578)");
                                    }
                                    int i38 = i19 << 3;
                                    int i39 = (i19 & 1022) | (57344 & i38) | (458752 & i38) | (3670016 & i38) | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192);
                                    int i40 = i26 << 3;
                                    int i41 = ((i19 >> 27) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i40 & 112) | (i40 & 896) | (i40 & 7168) | (i40 & 57344);
                                    int i42 = i26 << 6;
                                    composer2 = startRestartGroup;
                                    m4292TextNvy7gAk(str, modifier4, j11, null, j13, fontStyle4, fontWeight4, fontFamily4, j14, textDecoration3, textAlign3, j12, i30, z4, i31, 1, function15, textStyle3, composer2, i39, i41 | (3670016 & i42) | (i42 & 29360128), 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier4;
                                    j7 = j11;
                                    j8 = j13;
                                    fontStyle3 = fontStyle4;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j10 = j12;
                                    i28 = i30;
                                    z3 = z4;
                                    i29 = i31;
                                    function12 = function15;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i28 = i;
                                    i29 = i2;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j7 = j5;
                                    fontStyle3 = fontStyle2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j3;
                                    textDecoration2 = textDecoration;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Text_fLXpl1I$lambda$1;
                                            Text_fLXpl1I$lambda$1 = TextKt.Text_fLXpl1I$lambda$1(str, modifier2, j7, j8, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i28, z3, i29, function12, textStyle2, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                            return Text_fLXpl1I$lambda$1;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & 16384;
                        if (i27 == 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & 1024;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                    }
                    int i352 = i21;
                    i24 = i5 & 4096;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & 16384;
                    if (i27 == 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & 1024;
                if (i20 != 0) {
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                }
                int i3522 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & 16384;
                if (i27 == 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            int i342 = 65536;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & 1024;
            if (i20 != 0) {
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
            }
            int i35222 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & 16384;
            if (i27 == 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        int i3422 = 65536;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & 1024;
        if (i20 != 0) {
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
        }
        int i352222 = i21;
        i24 = i5 & 4096;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & 16384;
        if (i27 == 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (74899 & i26) != 74898, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text__4IGK_g$lambda$1$0(TextLayoutResult textLayoutResult) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4288Text4IGK_g(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        boolean z2;
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i29;
        final int i30;
        final Map map2;
        final Function1 function12;
        final TextStyle textStyle2;
        final boolean z3;
        final long j7;
        final FontStyle fontStyle3;
        final long j8;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        TextAlign textAlign3;
        Function1 function13;
        TextAlign textAlign4;
        Function1 function14;
        TextStyle textStyle3;
        TextDecoration textDecoration3;
        long j11;
        Map map3;
        Modifier modifier3;
        int i31;
        long j12;
        boolean z4;
        int i32;
        FontFamily fontFamily4;
        FontStyle fontStyle4;
        long j13;
        FontWeight fontWeight4;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(224529679);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)N(text,modifier,color:c#ui.graphics.Color,fontSize:c#ui.unit.TextUnit,fontStyle:c#ui.text.font.FontStyle,fontWeight,fontFamily,letterSpacing:c#ui.unit.TextUnit,textDecoration,textAlign:c#ui.text.style.TextAlign,lineHeight:c#ui.unit.TextUnit,overflow:c#ui.text.style.TextOverflow,softWrap,maxLines,inlineContent,onTextLayout,style)624@28526L562:Text.kt#uh7d8r");
        if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i33 = i5 & 2;
        if (i33 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                j5 = j;
            } else {
                int i34 = i6;
                j5 = j;
                if ((i3 & 384) == 0) {
                    i34 |= startRestartGroup.changed(j5) ? 256 : 128;
                }
                i8 = i34;
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i8 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i8 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i5 & 32;
                if (i11 != 0) {
                    i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i8 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i14 = i8 | (startRestartGroup.changed(j3) ? 8388608 : 4194304);
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changed(textDecoration) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                        i17 = i5 & 512;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= startRestartGroup.changed(textAlign) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & 1024;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i35 = i21;
                        i24 = i5 & 4096;
                        if (i24 != 0) {
                            i35 |= 384;
                        } else if ((i4 & 384) == 0) {
                            z2 = z;
                            i35 |= startRestartGroup.changed(z2) ? 256 : 128;
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i35 | 3072;
                            } else {
                                int i36 = i35;
                                if ((i4 & 3072) == 0) {
                                    i26 = i36 | (startRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i26 = i36;
                                }
                            }
                            i27 = i5 & 16384;
                            if (i27 == 0) {
                                i26 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i26 |= startRestartGroup.changedInstance(map) ? 16384 : 8192;
                                i28 = i5 & 32768;
                                if (i28 != 0) {
                                    i26 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i26 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i4 & 1572864) == 0) {
                                    i26 |= ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "621@28467L2,622@28509L7");
                                    if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 65536) != 0) {
                                            i26 &= -3670017;
                                        }
                                        long j15 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j15;
                                        modifier3 = modifier;
                                        textDecoration3 = textDecoration;
                                        textAlign4 = textAlign;
                                        j11 = j4;
                                        i32 = i;
                                        i31 = i2;
                                        map3 = map;
                                        function14 = function1;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        j12 = j5;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j3;
                                    } else {
                                        Modifier.Companion companion = i33 != 0 ? Modifier.INSTANCE : modifier;
                                        if (i7 != 0) {
                                            j5 = Color.INSTANCE.m6822getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            j6 = TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m9941getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                        TextAlign textAlign5 = i18 == 0 ? textAlign : null;
                                        long m9941getUnspecifiedXSAIIZE2 = i20 != 0 ? TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE() : j4;
                                        int m9657getClipgIe3tQ8 = i23 != 0 ? TextOverflow.INSTANCE.m9657getClipgIe3tQ8() : i;
                                        boolean z5 = i24 == 0 ? z2 : true;
                                        int i37 = i25 != 0 ? Integer.MAX_VALUE : i2;
                                        Map emptyMap = i27 != 0 ? MapsKt.emptyMap() : map;
                                        Modifier modifier4 = companion;
                                        if (i28 != 0) {
                                            textAlign3 = textAlign5;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1024677937, "CC(remember):Text.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function1() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit Text__4IGK_g$lambda$1$0;
                                                        Text__4IGK_g$lambda$1$0 = TextKt.Text__4IGK_g$lambda$1$0((TextLayoutResult) obj);
                                                        return Text__4IGK_g$lambda$1$0;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            function13 = (Function1) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        } else {
                                            textAlign3 = textAlign5;
                                            function13 = function1;
                                        }
                                        if ((i5 & 65536) != 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            Function1 function15 = function13;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i26 &= -3670017;
                                            textAlign4 = textAlign3;
                                            function14 = function15;
                                            textStyle3 = (TextStyle) consume;
                                        } else {
                                            textAlign4 = textAlign3;
                                            function14 = function13;
                                            textStyle3 = textStyle;
                                        }
                                        textDecoration3 = textDecoration4;
                                        j11 = m9941getUnspecifiedXSAIIZE2;
                                        map3 = emptyMap;
                                        modifier3 = modifier4;
                                        long j16 = m9941getUnspecifiedXSAIIZE;
                                        i31 = i37;
                                        j12 = j5;
                                        z4 = z5;
                                        i32 = m9657getClipgIe3tQ8;
                                        fontFamily4 = fontFamily2;
                                        long j17 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j17;
                                        fontWeight4 = fontWeight2;
                                        j14 = j16;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(224529679, i19, i26, "androidx.compose.material3.Text (Text.kt:623)");
                                    }
                                    int i38 = i19 << 3;
                                    int i39 = (i19 & 1022) | (57344 & i38) | (458752 & i38) | (3670016 & i38) | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192);
                                    int i40 = i26 << 3;
                                    int i41 = ((i19 >> 27) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i40 & 112) | (i40 & 896) | (i40 & 7168) | (i40 & 57344);
                                    int i42 = i26 << 6;
                                    composer2 = startRestartGroup;
                                    m4293TextZ58ophY(annotatedString, modifier3, j12, null, j13, fontStyle4, fontWeight4, fontFamily4, j14, textDecoration3, textAlign4, j11, i32, z4, i31, 1, map3, function14, textStyle3, composer2, i39, i41 | (3670016 & i42) | (29360128 & i42) | (i42 & 234881024), 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    j7 = j12;
                                    j8 = j13;
                                    fontStyle3 = fontStyle4;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign4;
                                    j10 = j11;
                                    i29 = i32;
                                    z3 = z4;
                                    i30 = i31;
                                    map2 = map3;
                                    function12 = function14;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i29 = i;
                                    i30 = i2;
                                    map2 = map;
                                    function12 = function1;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j7 = j5;
                                    fontStyle3 = fontStyle2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j3;
                                    textDecoration2 = textDecoration;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Text__4IGK_g$lambda$2;
                                            Text__4IGK_g$lambda$2 = TextKt.Text__4IGK_g$lambda$2(AnnotatedString.this, modifier2, j7, j8, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i29, z3, i30, map2, function12, textStyle2, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                            return Text__4IGK_g$lambda$2;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i28 = i5 & 32768;
                            if (i28 != 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & 16384;
                        if (i27 == 0) {
                        }
                        i28 = i5 & 32768;
                        if (i28 != 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & 1024;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                    }
                    int i352 = i21;
                    i24 = i5 & 4096;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & 16384;
                    if (i27 == 0) {
                    }
                    i28 = i5 & 32768;
                    if (i28 != 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & 1024;
                if (i20 != 0) {
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                }
                int i3522 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & 16384;
                if (i27 == 0) {
                }
                i28 = i5 & 32768;
                if (i28 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & 1024;
            if (i20 != 0) {
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
            }
            int i35222 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & 16384;
            if (i27 == 0) {
            }
            i28 = i5 & 32768;
            if (i28 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & 1024;
        if (i20 != 0) {
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
        }
        int i352222 = i21;
        i24 = i5 & 4096;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & 16384;
        if (i27 == 0) {
        }
        i28 = i5 & 32768;
        if (i28 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(15327438);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)N(value,content)665@30044L7,666@30069L80:Text.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(15327438, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:664)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) consume).merge(textStyle)), function2, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ProvideTextStyle$lambda$0;
                    ProvideTextStyle$lambda$0 = TextKt.ProvideTextStyle$lambda$0(TextStyle.this, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ProvideTextStyle$lambda$0;
                }
            });
        }
    }

    private static final AnnotatedString createTextWithLinkStyles(AnnotatedString annotatedString, final TextLinkStyles textLinkStyles) {
        return annotatedString.mapAnnotations(new Function1() { // from class: androidx.compose.material3.TextKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AnnotatedString.Range createTextWithLinkStyles$lambda$0;
                createTextWithLinkStyles$lambda$0 = TextKt.createTextWithLinkStyles$lambda$0(TextLinkStyles.this, (AnnotatedString.Range) obj);
                return createTextWithLinkStyles$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString.Range createTextWithLinkStyles$lambda$0(TextLinkStyles textLinkStyles, AnnotatedString.Range range) {
        AnnotatedString.Annotation annotation = (AnnotatedString.Annotation) range.getItem();
        if (annotation instanceof LinkAnnotation.Url) {
            LinkAnnotation.Url url = (LinkAnnotation.Url) annotation;
            if (url.getStyles() == null) {
                Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Url>");
                return AnnotatedString.Range.copy$default(range, LinkAnnotation.Url.copy$default(url, null, textLinkStyles, null, 5, null), 0, 0, null, 14, null);
            }
        }
        if (annotation instanceof LinkAnnotation.Clickable) {
            LinkAnnotation.Clickable clickable = (LinkAnnotation.Clickable) annotation;
            if (clickable.getStyles() == null) {
                Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Clickable>");
                return AnnotatedString.Range.copy$default(range, LinkAnnotation.Clickable.copy$default(clickable, null, textLinkStyles, null, 5, null), 0, 0, null, 14, null);
            }
        }
        return range;
    }

    private static final TextLinkStyles rememberTextLinkStyles(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1113329403, "C(rememberTextLinkStyles)687@30848L11,688@30879L159:Text.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1113329403, i, -1, "androidx.compose.material3.rememberTextLinkStyles (Text.kt:686)");
        }
        long primary = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getPrimary();
        ComposerKt.sourceInformationMarkerStart(composer, 462703418, "CC(remember):Text.kt#9igjgp");
        boolean changed = composer.changed(primary);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(primary, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null), null, null, null, 14, null);
            composer.updateRememberedValue(textLinkStyles);
            rememberedValue = textLinkStyles;
        }
        TextLinkStyles textLinkStyles2 = (TextLinkStyles) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textLinkStyles2;
    }
}
