package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aæ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÜ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aÆ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÒ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", SDKConstants.PARAM_VALUE, "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return TypographyTokensKt.getDefaultTextStyle();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:104:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036f  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2125Text4IGK_g(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
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
        Modifier.Companion companion;
        long m3443getUnspecified0d7_KjU;
        long m5936getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long m5936getUnspecifiedXSAIIZE2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long m5936getUnspecifiedXSAIIZE3;
        int m5675getClipgIe3tQ8;
        boolean z2;
        int i24;
        int i25;
        Function1<? super TextLayoutResult, Unit> function12;
        int i26;
        TextStyle textStyle2;
        int i27;
        long j5;
        long j6;
        TextStyle m5278mergedA7vx0o;
        final int i28;
        final TextDecoration textDecoration3;
        final TextAlign textAlign3;
        final Modifier modifier2;
        final int i29;
        final FontStyle fontStyle3;
        final long j7;
        final long j8;
        final int i30;
        final boolean z3;
        final Function1<? super TextLayoutResult, Unit> function13;
        final FontFamily fontFamily3;
        final long j9;
        final long j10;
        final TextStyle textStyle3;
        final FontWeight fontWeight3;
        Composer startRestartGroup = composer.startRestartGroup(-2055108902);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12)108@5588L7,117@5732L530:Text.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
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
            } else if ((i4 & 3072) == 0) {
                i7 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i7 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i7 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i7 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
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
                } else if ((100663296 & i4) == 0) {
                    i7 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i15 = i6 & 512;
                    if (i15 == 0) {
                        i7 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i7 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                        i17 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i17 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i17 = i5;
                    }
                    i18 = i6 & 2048;
                    if (i18 == 0) {
                        i17 |= 48;
                    } else if ((i5 & 48) == 0) {
                        i17 |= startRestartGroup.changed(i) ? 32 : 16;
                    }
                    int i32 = i17;
                    i19 = i6 & 4096;
                    if (i19 == 0) {
                        i32 |= 384;
                    } else if ((i5 & 384) == 0) {
                        i32 |= startRestartGroup.changed(z) ? 256 : 128;
                        i20 = i6 & 8192;
                        if (i20 != 0) {
                            i32 |= 3072;
                        } else if ((i5 & 3072) == 0) {
                            i32 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                            i21 = i6 & 16384;
                            if (i21 == 0) {
                                i32 |= 24576;
                                i22 = i21;
                            } else {
                                i22 = i21;
                                if ((i5 & 24576) == 0) {
                                    i32 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                                    i23 = i6 & 32768;
                                    if (i23 != 0) {
                                        i32 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i32 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                    }
                                    if ((i5 & 1572864) == 0) {
                                        i32 |= ((i6 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                    }
                                    if ((i7 & 306783379) == 306783378 || (599187 & i32) != 599186 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            companion = i31 != 0 ? Modifier.INSTANCE : modifier;
                                            m3443getUnspecified0d7_KjU = i8 != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j;
                                            m5936getUnspecifiedXSAIIZE = i9 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j2;
                                            fontStyle2 = i10 != 0 ? null : fontStyle;
                                            fontWeight2 = i11 != 0 ? null : fontWeight;
                                            fontFamily2 = i12 != 0 ? null : fontFamily;
                                            m5936getUnspecifiedXSAIIZE2 = i13 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j3;
                                            textDecoration2 = i14 != 0 ? null : textDecoration;
                                            textAlign2 = i15 != 0 ? null : textAlign;
                                            m5936getUnspecifiedXSAIIZE3 = i16 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j4;
                                            m5675getClipgIe3tQ8 = i18 != 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i;
                                            z2 = i19 != 0 ? true : z;
                                            i24 = i20 != 0 ? Integer.MAX_VALUE : i2;
                                            i25 = i22 == 0 ? i3 : 1;
                                            function12 = i23 == 0 ? function1 : null;
                                            if ((i6 & 65536) != 0) {
                                                TextDecoration textDecoration4 = textDecoration2;
                                                ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object consume = startRestartGroup.consume(providableCompositionLocal);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                textAlign2 = textAlign2;
                                                m5936getUnspecifiedXSAIIZE3 = m5936getUnspecifiedXSAIIZE3;
                                                i26 = i32 & (-3670017);
                                                textStyle2 = (TextStyle) consume;
                                                textDecoration2 = textDecoration4;
                                                startRestartGroup.endDefaults();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    i27 = i24;
                                                } else {
                                                    i27 = i24;
                                                    ComposerKt.traceEventStart(-2055108902, i7, i26, "androidx.compose.material3.Text (Text.kt:109)");
                                                }
                                                startRestartGroup.startReplaceableGroup(79582827);
                                                ComposerKt.sourceInformation(startRestartGroup, "");
                                                if (m3443getUnspecified0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                                    j5 = m3443getUnspecified0d7_KjU;
                                                    j6 = j5;
                                                } else {
                                                    startRestartGroup.startReplaceableGroup(79582860);
                                                    ComposerKt.sourceInformation(startRestartGroup, "*113@5703L7");
                                                    long m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                                                    if (m5263getColor0d7_KjU != Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                                        j5 = m3443getUnspecified0d7_KjU;
                                                    } else {
                                                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                                        j5 = m3443getUnspecified0d7_KjU;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                        Object consume2 = startRestartGroup.consume(localContentColor);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        m5263getColor0d7_KjU = ((Color) consume2).m3417unboximpl();
                                                    }
                                                    startRestartGroup.endReplaceableGroup();
                                                    j6 = m5263getColor0d7_KjU;
                                                }
                                                startRestartGroup.endReplaceableGroup();
                                                m5278mergedA7vx0o = textStyle2.m5278mergedA7vx0o((r58 & 1) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j6, (r58 & 2) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE, (r58 & 4) != 0 ? null : fontWeight2, (r58 & 8) != 0 ? null : fontStyle2, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : fontFamily2, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE2, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : textDecoration2, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk(), (r58 & 65536) != 0 ? TextDirection.INSTANCE.m5645getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE3, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.INSTANCE.m5559getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.INSTANCE.m5538getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                                                int i33 = i26 << 9;
                                                BasicTextKt.m842BasicTextVhcvRP8(str, companion, m5278mergedA7vx0o, function12, m5675getClipgIe3tQ8, z2, i27, i25, (ColorProducer) null, startRestartGroup, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i26 >> 6) & 7168) | (57344 & i33) | (458752 & i33) | (3670016 & i33) | (i33 & 29360128), 256);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                i28 = i27;
                                                textDecoration3 = textDecoration2;
                                                textAlign3 = textAlign2;
                                                modifier2 = companion;
                                                i29 = m5675getClipgIe3tQ8;
                                                fontStyle3 = fontStyle2;
                                                j7 = m5936getUnspecifiedXSAIIZE;
                                                j8 = m5936getUnspecifiedXSAIIZE2;
                                                i30 = i25;
                                                z3 = z2;
                                                function13 = function12;
                                                fontFamily3 = fontFamily2;
                                                j9 = m5936getUnspecifiedXSAIIZE3;
                                                j10 = j5;
                                                FontWeight fontWeight4 = fontWeight2;
                                                textStyle3 = textStyle2;
                                                fontWeight3 = fontWeight4;
                                            }
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i6 & 65536) != 0) {
                                                i32 &= -3670017;
                                            }
                                            companion = modifier;
                                            m3443getUnspecified0d7_KjU = j;
                                            m5936getUnspecifiedXSAIIZE = j2;
                                            fontStyle2 = fontStyle;
                                            fontWeight2 = fontWeight;
                                            fontFamily2 = fontFamily;
                                            m5936getUnspecifiedXSAIIZE2 = j3;
                                            textDecoration2 = textDecoration;
                                            textAlign2 = textAlign;
                                            m5936getUnspecifiedXSAIIZE3 = j4;
                                            m5675getClipgIe3tQ8 = i;
                                            z2 = z;
                                            i24 = i2;
                                            i25 = i3;
                                            function12 = function1;
                                        }
                                        i26 = i32;
                                        textStyle2 = textStyle;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.startReplaceableGroup(79582827);
                                        ComposerKt.sourceInformation(startRestartGroup, "");
                                        if (m3443getUnspecified0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        m5278mergedA7vx0o = textStyle2.m5278mergedA7vx0o((r58 & 1) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j6, (r58 & 2) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE, (r58 & 4) != 0 ? null : fontWeight2, (r58 & 8) != 0 ? null : fontStyle2, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : fontFamily2, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE2, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : textDecoration2, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk(), (r58 & 65536) != 0 ? TextDirection.INSTANCE.m5645getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE3, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.INSTANCE.m5559getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.INSTANCE.m5538getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                                        int i332 = i26 << 9;
                                        BasicTextKt.m842BasicTextVhcvRP8(str, companion, m5278mergedA7vx0o, function12, m5675getClipgIe3tQ8, z2, i27, i25, (ColorProducer) null, startRestartGroup, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i26 >> 6) & 7168) | (57344 & i332) | (458752 & i332) | (3670016 & i332) | (i332 & 29360128), 256);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i28 = i27;
                                        textDecoration3 = textDecoration2;
                                        textAlign3 = textAlign2;
                                        modifier2 = companion;
                                        i29 = m5675getClipgIe3tQ8;
                                        fontStyle3 = fontStyle2;
                                        j7 = m5936getUnspecifiedXSAIIZE;
                                        j8 = m5936getUnspecifiedXSAIIZE2;
                                        i30 = i25;
                                        z3 = z2;
                                        function13 = function12;
                                        fontFamily3 = fontFamily2;
                                        j9 = m5936getUnspecifiedXSAIIZE3;
                                        j10 = j5;
                                        FontWeight fontWeight42 = fontWeight2;
                                        textStyle3 = textStyle2;
                                        fontWeight3 = fontWeight42;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        j10 = j;
                                        j7 = j2;
                                        fontStyle3 = fontStyle;
                                        fontWeight3 = fontWeight;
                                        fontFamily3 = fontFamily;
                                        j8 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j9 = j4;
                                        i29 = i;
                                        z3 = z;
                                        i28 = i2;
                                        i30 = i3;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                    }
                                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$1
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

                                            public final void invoke(Composer composer2, int i34) {
                                                TextKt.m2125Text4IGK_g(str, modifier2, j10, j7, fontStyle3, fontWeight3, fontFamily3, j8, textDecoration3, textAlign3, j9, i29, z3, i28, i30, function13, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i23 = i6 & 32768;
                            if (i23 != 0) {
                            }
                            if ((i5 & 1572864) == 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i4 & 1) != 0) {
                            }
                            if (i31 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
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
                            if (i16 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if ((i6 & 65536) != 0) {
                            }
                        }
                        i21 = i6 & 16384;
                        if (i21 == 0) {
                        }
                        i23 = i6 & 32768;
                        if (i23 != 0) {
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                        }
                        if (i31 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
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
                        if (i16 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if ((i6 & 65536) != 0) {
                        }
                    }
                    i20 = i6 & 8192;
                    if (i20 != 0) {
                    }
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                    }
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i31 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
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
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if ((i6 & 65536) != 0) {
                    }
                }
                i15 = i6 & 512;
                if (i15 == 0) {
                }
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                i18 = i6 & 2048;
                if (i18 == 0) {
                }
                int i322 = i17;
                i19 = i6 & 4096;
                if (i19 == 0) {
                }
                i20 = i6 & 8192;
                if (i20 != 0) {
                }
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i31 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
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
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if ((i6 & 65536) != 0) {
                }
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
            if (i15 == 0) {
            }
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            i18 = i6 & 2048;
            if (i18 == 0) {
            }
            int i3222 = i17;
            i19 = i6 & 4096;
            if (i19 == 0) {
            }
            i20 = i6 & 8192;
            if (i20 != 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i31 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
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
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if ((i6 & 65536) != 0) {
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
        if (i15 == 0) {
        }
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        i18 = i6 & 2048;
        if (i18 == 0) {
        }
        int i32222 = i17;
        i19 = i6 & 4096;
        if (i19 == 0) {
        }
        i20 = i6 & 8192;
        if (i20 != 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i31 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
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
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if ((i6 & 65536) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0293  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2127TextfLXpl1I(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
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
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier.Companion companion;
        long m3443getUnspecified0d7_KjU;
        TextAlign textAlign2;
        TextDecoration textDecoration2;
        long j5;
        TextStyle textStyle2;
        int i22;
        boolean z2;
        int i23;
        int i24;
        Function1 function12;
        long j6;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long j7;
        final TextDecoration textDecoration3;
        Composer composer2;
        final TextAlign textAlign3;
        final long j8;
        final int i25;
        final boolean z3;
        final int i26;
        final Function1 function13;
        final TextStyle textStyle3;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final Modifier modifier2;
        final long j9;
        final long j10;
        final long j11;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1968784669);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)160@7042L7,162@7058L322:Text.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                i6 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i6 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
                i10 = i5 & 32;
                int i28 = 65536;
                if (i10 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i6 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i6 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                    i6 |= 100663296;
                } else if ((100663296 & i3) == 0) {
                    i6 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i14 = i5 & 512;
                    if (i14 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                        i16 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i16 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i16 = i4;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i4 & 48) == 0) {
                        i16 |= startRestartGroup.changed(i) ? 32 : 16;
                    }
                    int i29 = i16;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i29 |= 384;
                    } else if ((i4 & 384) == 0) {
                        i29 |= startRestartGroup.changed(z) ? 256 : 128;
                        i19 = i5 & 8192;
                        if (i19 != 0) {
                            i29 |= 3072;
                        } else if ((i4 & 3072) == 0) {
                            i29 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                            i20 = i5 & 16384;
                            if (i20 == 0) {
                                i29 |= 24576;
                                i21 = i20;
                            } else {
                                i21 = i20;
                                if ((i4 & 24576) == 0) {
                                    i29 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        if ((i5 & 32768) == 0 && startRestartGroup.changed(textStyle)) {
                                            i28 = 131072;
                                        }
                                        i29 |= i28;
                                    }
                                    if ((i6 & 306783379) == 306783378 || (74899 & i29) != 74898 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            companion = i27 != 0 ? Modifier.INSTANCE : modifier;
                                            m3443getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j;
                                            long m5936getUnspecifiedXSAIIZE = i8 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j2;
                                            FontStyle fontStyle4 = i9 != 0 ? null : fontStyle;
                                            FontWeight fontWeight4 = i10 != 0 ? null : fontWeight;
                                            FontFamily fontFamily4 = i11 != 0 ? null : fontFamily;
                                            long m5936getUnspecifiedXSAIIZE2 = i12 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j3;
                                            TextDecoration textDecoration4 = i13 != 0 ? null : textDecoration;
                                            textAlign2 = i14 == 0 ? textAlign : null;
                                            long m5936getUnspecifiedXSAIIZE3 = i15 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j4;
                                            int m5675getClipgIe3tQ8 = i17 != 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i;
                                            boolean z4 = i18 != 0 ? true : z;
                                            int i30 = i19 != 0 ? Integer.MAX_VALUE : i2;
                                            TextKt$Text$2 textKt$Text$2 = i21 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$2
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(TextLayoutResult textLayoutResult) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                    invoke2(textLayoutResult);
                                                    return Unit.INSTANCE;
                                                }
                                            } : function1;
                                            if ((i5 & 32768) != 0) {
                                                textDecoration2 = textDecoration4;
                                                ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object consume = startRestartGroup.consume(providableCompositionLocal);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                i29 &= -458753;
                                                j5 = m5936getUnspecifiedXSAIIZE3;
                                                textStyle2 = (TextStyle) consume;
                                            } else {
                                                textDecoration2 = textDecoration4;
                                                j5 = m5936getUnspecifiedXSAIIZE3;
                                                textStyle2 = textStyle;
                                            }
                                            i22 = m5675getClipgIe3tQ8;
                                            z2 = z4;
                                            i23 = i29;
                                            i24 = i30;
                                            function12 = textKt$Text$2;
                                            j6 = m5936getUnspecifiedXSAIIZE;
                                            fontStyle2 = fontStyle4;
                                            fontWeight2 = fontWeight4;
                                            fontFamily2 = fontFamily4;
                                            j7 = m5936getUnspecifiedXSAIIZE2;
                                            textDecoration3 = textDecoration2;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i5 & 32768) != 0) {
                                                i29 &= -458753;
                                            }
                                            companion = modifier;
                                            m3443getUnspecified0d7_KjU = j;
                                            j6 = j2;
                                            fontStyle2 = fontStyle;
                                            fontWeight2 = fontWeight;
                                            fontFamily2 = fontFamily;
                                            textDecoration3 = textDecoration;
                                            textAlign2 = textAlign;
                                            j5 = j4;
                                            i22 = i;
                                            z2 = z;
                                            i24 = i2;
                                            function12 = function1;
                                            textStyle2 = textStyle;
                                            i23 = i29;
                                            j7 = j3;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            composer2 = startRestartGroup;
                                            ComposerKt.traceEventStart(1968784669, i6, i23, "androidx.compose.material3.Text (Text.kt:161)");
                                        } else {
                                            composer2 = startRestartGroup;
                                        }
                                        int i31 = i23 << 3;
                                        m2125Text4IGK_g(str, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i31) | (i31 & 3670016), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textAlign3 = textAlign2;
                                        j8 = j5;
                                        i25 = i22;
                                        z3 = z2;
                                        i26 = i24;
                                        function13 = function12;
                                        textStyle3 = textStyle2;
                                        FontFamily fontFamily5 = fontFamily2;
                                        fontStyle3 = fontStyle2;
                                        long j12 = j7;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily5;
                                        long j13 = j6;
                                        modifier2 = companion;
                                        j9 = j13;
                                        j10 = m3443getUnspecified0d7_KjU;
                                        j11 = j12;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        j10 = j;
                                        j9 = j2;
                                        fontStyle3 = fontStyle;
                                        fontWeight3 = fontWeight;
                                        fontFamily3 = fontFamily;
                                        j11 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j8 = j4;
                                        i25 = i;
                                        z3 = z;
                                        i26 = i2;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                        composer2 = startRestartGroup;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$3
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

                                            public final void invoke(Composer composer3, int i32) {
                                                TextKt.m2127TextfLXpl1I(str, modifier2, j10, j9, fontStyle3, fontWeight3, fontFamily3, j11, textDecoration3, textAlign3, j8, i25, z3, i26, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i27 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if ((i5 & 32768) != 0) {
                            }
                            i22 = m5675getClipgIe3tQ8;
                            z2 = z4;
                            i23 = i29;
                            i24 = i30;
                            function12 = textKt$Text$2;
                            j6 = m5936getUnspecifiedXSAIIZE;
                            fontStyle2 = fontStyle4;
                            fontWeight2 = fontWeight4;
                            fontFamily2 = fontFamily4;
                            j7 = m5936getUnspecifiedXSAIIZE2;
                            textDecoration3 = textDecoration2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i312 = i23 << 3;
                            m2125Text4IGK_g(str, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i312) | (i312 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            textAlign3 = textAlign2;
                            j8 = j5;
                            i25 = i22;
                            z3 = z2;
                            i26 = i24;
                            function13 = function12;
                            textStyle3 = textStyle2;
                            FontFamily fontFamily52 = fontFamily2;
                            fontStyle3 = fontStyle2;
                            long j122 = j7;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily52;
                            long j132 = j6;
                            modifier2 = companion;
                            j9 = j132;
                            j10 = m3443getUnspecified0d7_KjU;
                            j11 = j122;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i20 = i5 & 16384;
                        if (i20 == 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i27 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if ((i5 & 32768) != 0) {
                        }
                        i22 = m5675getClipgIe3tQ8;
                        z2 = z4;
                        i23 = i29;
                        i24 = i30;
                        function12 = textKt$Text$2;
                        j6 = m5936getUnspecifiedXSAIIZE;
                        fontStyle2 = fontStyle4;
                        fontWeight2 = fontWeight4;
                        fontFamily2 = fontFamily4;
                        j7 = m5936getUnspecifiedXSAIIZE2;
                        textDecoration3 = textDecoration2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i3122 = i23 << 3;
                        m2125Text4IGK_g(str, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i3122) | (i3122 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        textAlign3 = textAlign2;
                        j8 = j5;
                        i25 = i22;
                        z3 = z2;
                        i26 = i24;
                        function13 = function12;
                        textStyle3 = textStyle2;
                        FontFamily fontFamily522 = fontFamily2;
                        fontStyle3 = fontStyle2;
                        long j1222 = j7;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily522;
                        long j1322 = j6;
                        modifier2 = companion;
                        j9 = j1322;
                        j10 = m3443getUnspecified0d7_KjU;
                        j11 = j1222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i19 = i5 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i5 & 16384;
                    if (i20 == 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if ((i5 & 32768) != 0) {
                    }
                    i22 = m5675getClipgIe3tQ8;
                    z2 = z4;
                    i23 = i29;
                    i24 = i30;
                    function12 = textKt$Text$2;
                    j6 = m5936getUnspecifiedXSAIIZE;
                    fontStyle2 = fontStyle4;
                    fontWeight2 = fontWeight4;
                    fontFamily2 = fontFamily4;
                    j7 = m5936getUnspecifiedXSAIIZE2;
                    textDecoration3 = textDecoration2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i31222 = i23 << 3;
                    m2125Text4IGK_g(str, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i31222) | (i31222 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textAlign3 = textAlign2;
                    j8 = j5;
                    i25 = i22;
                    z3 = z2;
                    i26 = i24;
                    function13 = function12;
                    textStyle3 = textStyle2;
                    FontFamily fontFamily5222 = fontFamily2;
                    fontStyle3 = fontStyle2;
                    long j12222 = j7;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily5222;
                    long j13222 = j6;
                    modifier2 = companion;
                    j9 = j13222;
                    j10 = m3443getUnspecified0d7_KjU;
                    j11 = j12222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                int i292 = i16;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i19 = i5 & 8192;
                if (i19 != 0) {
                }
                i20 = i5 & 16384;
                if (i20 == 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i27 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if ((i5 & 32768) != 0) {
                }
                i22 = m5675getClipgIe3tQ8;
                z2 = z4;
                i23 = i292;
                i24 = i30;
                function12 = textKt$Text$2;
                j6 = m5936getUnspecifiedXSAIIZE;
                fontStyle2 = fontStyle4;
                fontWeight2 = fontWeight4;
                fontFamily2 = fontFamily4;
                j7 = m5936getUnspecifiedXSAIIZE2;
                textDecoration3 = textDecoration2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i312222 = i23 << 3;
                m2125Text4IGK_g(str, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i312222) | (i312222 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                textAlign3 = textAlign2;
                j8 = j5;
                i25 = i22;
                z3 = z2;
                i26 = i24;
                function13 = function12;
                textStyle3 = textStyle2;
                FontFamily fontFamily52222 = fontFamily2;
                fontStyle3 = fontStyle2;
                long j122222 = j7;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily52222;
                long j132222 = j6;
                modifier2 = companion;
                j9 = j132222;
                j10 = m3443getUnspecified0d7_KjU;
                j11 = j122222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i10 = i5 & 32;
            int i282 = 65536;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            int i2922 = i16;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i20 = i5 & 16384;
            if (i20 == 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i27 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if ((i5 & 32768) != 0) {
            }
            i22 = m5675getClipgIe3tQ8;
            z2 = z4;
            i23 = i2922;
            i24 = i30;
            function12 = textKt$Text$2;
            j6 = m5936getUnspecifiedXSAIIZE;
            fontStyle2 = fontStyle4;
            fontWeight2 = fontWeight4;
            fontFamily2 = fontFamily4;
            j7 = m5936getUnspecifiedXSAIIZE2;
            textDecoration3 = textDecoration2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i3122222 = i23 << 3;
            m2125Text4IGK_g(str, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i3122222) | (i3122222 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            textAlign3 = textAlign2;
            j8 = j5;
            i25 = i22;
            z3 = z2;
            i26 = i24;
            function13 = function12;
            textStyle3 = textStyle2;
            FontFamily fontFamily522222 = fontFamily2;
            fontStyle3 = fontStyle2;
            long j1222222 = j7;
            fontWeight3 = fontWeight2;
            fontFamily3 = fontFamily522222;
            long j1322222 = j6;
            modifier2 = companion;
            j9 = j1322222;
            j10 = m3443getUnspecified0d7_KjU;
            j11 = j1222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        int i2822 = 65536;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i29222 = i16;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i20 = i5 & 16384;
        if (i20 == 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i27 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if ((i5 & 32768) != 0) {
        }
        i22 = m5675getClipgIe3tQ8;
        z2 = z4;
        i23 = i29222;
        i24 = i30;
        function12 = textKt$Text$2;
        j6 = m5936getUnspecifiedXSAIIZE;
        fontStyle2 = fontStyle4;
        fontWeight2 = fontWeight4;
        fontFamily2 = fontFamily4;
        j7 = m5936getUnspecifiedXSAIIZE2;
        textDecoration3 = textDecoration2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i31222222 = i23 << 3;
        m2125Text4IGK_g(str, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i22, z2, i24, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i6 & 2147483646, (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (458752 & i31222222) | (i31222222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        textAlign3 = textAlign2;
        j8 = j5;
        i25 = i22;
        z3 = z2;
        i26 = i24;
        function13 = function12;
        textStyle3 = textStyle2;
        FontFamily fontFamily5222222 = fontFamily2;
        fontStyle3 = fontStyle2;
        long j12222222 = j7;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily5222222;
        long j13222222 = j6;
        modifier2 = companion;
        j9 = j13222222;
        j10 = m3443getUnspecified0d7_KjU;
        j11 = j12222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e9  */
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2126TextIbK3jfQ(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
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
        Modifier.Companion companion;
        long m3443getUnspecified0d7_KjU;
        long m5936getUnspecifiedXSAIIZE;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        TextAlign textAlign2;
        long j5;
        TextDecoration textDecoration2;
        TextStyle textStyle2;
        int i25;
        Map<String, InlineTextContent> map2;
        Function1<? super TextLayoutResult, Unit> function12;
        FontFamily fontFamily2;
        long j6;
        int i26;
        int i27;
        boolean z2;
        int i28;
        long j7;
        TextDecoration textDecoration3;
        boolean z3;
        int i29;
        long j8;
        TextStyle m5278mergedA7vx0o;
        final TextDecoration textDecoration4;
        final TextAlign textAlign3;
        final FontFamily fontFamily3;
        int i30;
        final boolean z4;
        final int i31;
        final long j9;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final long j10;
        final Modifier modifier2;
        final long j11;
        final Map<String, InlineTextContent> map3;
        final long j12;
        final Function1<? super TextLayoutResult, Unit> function13;
        final TextStyle textStyle3;
        final int i32;
        final int i33;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2027001676);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(15,10,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,17,16:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,12:c#ui.text.style.TextOverflow,13,8,9)254@11532L7,262@11675L654:Text.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i34 = i6 & 2;
        if (i34 != 0) {
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
            } else if ((i4 & 3072) == 0) {
                i7 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i7 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i7 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i7 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
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
                    i7 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i7 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                }
                i16 = i6 & 1024;
                if (i16 != 0) {
                    i17 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i17 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
                } else {
                    i17 = i5;
                }
                i18 = i6 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                } else if ((i5 & 48) == 0) {
                    i17 |= startRestartGroup.changed(i) ? 32 : 16;
                }
                int i35 = i17;
                i19 = i6 & 4096;
                if (i19 != 0) {
                    i35 |= 384;
                } else if ((i5 & 384) == 0) {
                    i35 |= startRestartGroup.changed(z) ? 256 : 128;
                    i20 = i6 & 8192;
                    if (i20 == 0) {
                        i35 |= 3072;
                    } else if ((i5 & 3072) == 0) {
                        i35 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                        i21 = i6 & 16384;
                        if (i21 != 0) {
                            i35 |= 24576;
                            i22 = i21;
                        } else {
                            i22 = i21;
                            if ((i5 & 24576) == 0) {
                                i35 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                                i23 = i6 & 32768;
                                if (i23 == 0) {
                                    i35 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i35 |= startRestartGroup.changedInstance(map) ? 131072 : 65536;
                                }
                                i24 = i6 & 65536;
                                if (i24 == 0) {
                                    i35 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    i35 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                                }
                                if ((i5 & 12582912) == 0) {
                                    i35 |= ((i6 & 131072) == 0 && startRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                                }
                                if ((i7 & 306783379) == 306783378 || (4793491 & i35) != 4793490 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        companion = i34 == 0 ? Modifier.INSTANCE : modifier;
                                        m3443getUnspecified0d7_KjU = i8 == 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j;
                                        m5936getUnspecifiedXSAIIZE = i9 == 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j2;
                                        fontStyle2 = i10 == 0 ? null : fontStyle;
                                        fontWeight2 = i11 == 0 ? null : fontWeight;
                                        FontFamily fontFamily4 = i12 == 0 ? null : fontFamily;
                                        long m5936getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration5 = i14 == 0 ? null : textDecoration;
                                        textAlign2 = i15 == 0 ? textAlign : null;
                                        long m5936getUnspecifiedXSAIIZE3 = i16 == 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j4;
                                        int m5675getClipgIe3tQ8 = i18 == 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i;
                                        boolean z5 = i19 == 0 ? true : z;
                                        int i36 = i20 == 0 ? Integer.MAX_VALUE : i2;
                                        int i37 = i22 == 0 ? i3 : 1;
                                        Map<String, InlineTextContent> emptyMap = i23 == 0 ? MapsKt.emptyMap() : map;
                                        TextKt$Text$4 textKt$Text$4 = i24 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$4
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        if ((i6 & 131072) == 0) {
                                            j5 = m5936getUnspecifiedXSAIIZE3;
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            textDecoration2 = textDecoration5;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i35 &= -29360129;
                                            textStyle2 = (TextStyle) consume;
                                        } else {
                                            j5 = m5936getUnspecifiedXSAIIZE3;
                                            textDecoration2 = textDecoration5;
                                            textStyle2 = textStyle;
                                        }
                                        i25 = i35;
                                        map2 = emptyMap;
                                        function12 = textKt$Text$4;
                                        fontFamily2 = fontFamily4;
                                        j6 = m5936getUnspecifiedXSAIIZE2;
                                        i26 = i36;
                                        i27 = i37;
                                        z2 = z5;
                                        i28 = m5675getClipgIe3tQ8;
                                        j7 = j5;
                                        textDecoration3 = textDecoration2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i6 & 131072) != 0) {
                                            i35 &= -29360129;
                                        }
                                        companion = modifier;
                                        m3443getUnspecified0d7_KjU = j;
                                        m5936getUnspecifiedXSAIIZE = j2;
                                        fontStyle2 = fontStyle;
                                        fontWeight2 = fontWeight;
                                        fontFamily2 = fontFamily;
                                        j6 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign2 = textAlign;
                                        i28 = i;
                                        z2 = z;
                                        i26 = i2;
                                        i27 = i3;
                                        map2 = map;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        i25 = i35;
                                        j7 = j4;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        z3 = z2;
                                    } else {
                                        z3 = z2;
                                        ComposerKt.traceEventStart(2027001676, i7, i25, "androidx.compose.material3.Text (Text.kt:255)");
                                    }
                                    startRestartGroup.startReplaceableGroup(79588770);
                                    ComposerKt.sourceInformation(startRestartGroup, "");
                                    if (m3443getUnspecified0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                        i29 = i28;
                                        j8 = m3443getUnspecified0d7_KjU;
                                    } else {
                                        startRestartGroup.startReplaceableGroup(79588803);
                                        ComposerKt.sourceInformation(startRestartGroup, "*258@11646L7");
                                        long m5263getColor0d7_KjU = textStyle2.m5263getColor0d7_KjU();
                                        if (m5263getColor0d7_KjU != Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                                            i29 = i28;
                                        } else {
                                            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                            i29 = i28;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object consume2 = startRestartGroup.consume(localContentColor);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            m5263getColor0d7_KjU = ((Color) consume2).m3417unboximpl();
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        j8 = m5263getColor0d7_KjU;
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    m5278mergedA7vx0o = textStyle2.m5278mergedA7vx0o((r58 & 1) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j8, (r58 & 2) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE, (r58 & 4) != 0 ? null : fontWeight2, (r58 & 8) != 0 ? null : fontStyle2, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : fontFamily2, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j6, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : textDecoration3, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk(), (r58 & 65536) != 0 ? TextDirection.INSTANCE.m5645getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j7, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.INSTANCE.m5559getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.INSTANCE.m5538getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                                    int i38 = i25 << 9;
                                    BasicTextKt.m840BasicTextRWo7tUw(annotatedString, companion, m5278mergedA7vx0o, function12, i29, z3, i26, i27, map2, null, startRestartGroup, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 >> 9) & 7168) | (57344 & i38) | (458752 & i38) | (3670016 & i38) | (29360128 & i38) | (i38 & 234881024), 512);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    textDecoration4 = textDecoration3;
                                    textAlign3 = textAlign2;
                                    fontFamily3 = fontFamily2;
                                    i30 = i26;
                                    z4 = z3;
                                    i31 = i29;
                                    j9 = j7;
                                    fontStyle3 = fontStyle2;
                                    fontWeight3 = fontWeight2;
                                    j10 = j6;
                                    modifier2 = companion;
                                    j11 = m5936getUnspecifiedXSAIIZE;
                                    map3 = map2;
                                    j12 = m3443getUnspecified0d7_KjU;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                    i32 = i27;
                                    i33 = i30;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    j12 = j;
                                    j11 = j2;
                                    fontStyle3 = fontStyle;
                                    fontWeight3 = fontWeight;
                                    fontFamily3 = fontFamily;
                                    j10 = j3;
                                    textDecoration4 = textDecoration;
                                    textAlign3 = textAlign;
                                    j9 = j4;
                                    i31 = i;
                                    z4 = z;
                                    i33 = i2;
                                    i32 = i3;
                                    map3 = map;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$5
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

                                        public final void invoke(Composer composer2, int i39) {
                                            TextKt.m2126TextIbK3jfQ(AnnotatedString.this, modifier2, j12, j11, fontStyle3, fontWeight3, fontFamily3, j10, textDecoration4, textAlign3, j9, i31, z4, i33, i32, map3, function13, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                        i23 = i6 & 32768;
                        if (i23 == 0) {
                        }
                        i24 = i6 & 65536;
                        if (i24 == 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                        }
                        if (i34 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
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
                        if (i16 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i6 & 131072) == 0) {
                        }
                        i25 = i35;
                        map2 = emptyMap;
                        function12 = textKt$Text$4;
                        fontFamily2 = fontFamily4;
                        j6 = m5936getUnspecifiedXSAIIZE2;
                        i26 = i36;
                        i27 = i37;
                        z2 = z5;
                        i28 = m5675getClipgIe3tQ8;
                        j7 = j5;
                        textDecoration3 = textDecoration2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(79588770);
                        ComposerKt.sourceInformation(startRestartGroup, "");
                        if (m3443getUnspecified0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        m5278mergedA7vx0o = textStyle2.m5278mergedA7vx0o((r58 & 1) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j8, (r58 & 2) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE, (r58 & 4) != 0 ? null : fontWeight2, (r58 & 8) != 0 ? null : fontStyle2, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : fontFamily2, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j6, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : textDecoration3, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk(), (r58 & 65536) != 0 ? TextDirection.INSTANCE.m5645getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j7, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.INSTANCE.m5559getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.INSTANCE.m5538getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                        int i382 = i25 << 9;
                        BasicTextKt.m840BasicTextRWo7tUw(annotatedString, companion, m5278mergedA7vx0o, function12, i29, z3, i26, i27, map2, null, startRestartGroup, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 >> 9) & 7168) | (57344 & i382) | (458752 & i382) | (3670016 & i382) | (29360128 & i382) | (i382 & 234881024), 512);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        textDecoration4 = textDecoration3;
                        textAlign3 = textAlign2;
                        fontFamily3 = fontFamily2;
                        i30 = i26;
                        z4 = z3;
                        i31 = i29;
                        j9 = j7;
                        fontStyle3 = fontStyle2;
                        fontWeight3 = fontWeight2;
                        j10 = j6;
                        modifier2 = companion;
                        j11 = m5936getUnspecifiedXSAIIZE;
                        map3 = map2;
                        j12 = m3443getUnspecified0d7_KjU;
                        function13 = function12;
                        textStyle3 = textStyle2;
                        i32 = i27;
                        i33 = i30;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i21 = i6 & 16384;
                    if (i21 != 0) {
                    }
                    i23 = i6 & 32768;
                    if (i23 == 0) {
                    }
                    i24 = i6 & 65536;
                    if (i24 == 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i34 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
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
                    if (i16 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if ((i6 & 131072) == 0) {
                    }
                    i25 = i35;
                    map2 = emptyMap;
                    function12 = textKt$Text$4;
                    fontFamily2 = fontFamily4;
                    j6 = m5936getUnspecifiedXSAIIZE2;
                    i26 = i36;
                    i27 = i37;
                    z2 = z5;
                    i28 = m5675getClipgIe3tQ8;
                    j7 = j5;
                    textDecoration3 = textDecoration2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(79588770);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    if (m3443getUnspecified0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    m5278mergedA7vx0o = textStyle2.m5278mergedA7vx0o((r58 & 1) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j8, (r58 & 2) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE, (r58 & 4) != 0 ? null : fontWeight2, (r58 & 8) != 0 ? null : fontStyle2, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : fontFamily2, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j6, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : textDecoration3, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk(), (r58 & 65536) != 0 ? TextDirection.INSTANCE.m5645getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j7, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.INSTANCE.m5559getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.INSTANCE.m5538getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                    int i3822 = i25 << 9;
                    BasicTextKt.m840BasicTextRWo7tUw(annotatedString, companion, m5278mergedA7vx0o, function12, i29, z3, i26, i27, map2, null, startRestartGroup, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 >> 9) & 7168) | (57344 & i3822) | (458752 & i3822) | (3670016 & i3822) | (29360128 & i3822) | (i3822 & 234881024), 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textDecoration4 = textDecoration3;
                    textAlign3 = textAlign2;
                    fontFamily3 = fontFamily2;
                    i30 = i26;
                    z4 = z3;
                    i31 = i29;
                    j9 = j7;
                    fontStyle3 = fontStyle2;
                    fontWeight3 = fontWeight2;
                    j10 = j6;
                    modifier2 = companion;
                    j11 = m5936getUnspecifiedXSAIIZE;
                    map3 = map2;
                    j12 = m3443getUnspecified0d7_KjU;
                    function13 = function12;
                    textStyle3 = textStyle2;
                    i32 = i27;
                    i33 = i30;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i20 = i6 & 8192;
                if (i20 == 0) {
                }
                i21 = i6 & 16384;
                if (i21 != 0) {
                }
                i23 = i6 & 32768;
                if (i23 == 0) {
                }
                i24 = i6 & 65536;
                if (i24 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i34 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
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
                if (i16 == 0) {
                }
                if (i18 == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i6 & 131072) == 0) {
                }
                i25 = i35;
                map2 = emptyMap;
                function12 = textKt$Text$4;
                fontFamily2 = fontFamily4;
                j6 = m5936getUnspecifiedXSAIIZE2;
                i26 = i36;
                i27 = i37;
                z2 = z5;
                i28 = m5675getClipgIe3tQ8;
                j7 = j5;
                textDecoration3 = textDecoration2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(79588770);
                ComposerKt.sourceInformation(startRestartGroup, "");
                if (m3443getUnspecified0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                m5278mergedA7vx0o = textStyle2.m5278mergedA7vx0o((r58 & 1) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j8, (r58 & 2) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE, (r58 & 4) != 0 ? null : fontWeight2, (r58 & 8) != 0 ? null : fontStyle2, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : fontFamily2, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j6, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : textDecoration3, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk(), (r58 & 65536) != 0 ? TextDirection.INSTANCE.m5645getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j7, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.INSTANCE.m5559getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.INSTANCE.m5538getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
                int i38222 = i25 << 9;
                BasicTextKt.m840BasicTextRWo7tUw(annotatedString, companion, m5278mergedA7vx0o, function12, i29, z3, i26, i27, map2, null, startRestartGroup, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 >> 9) & 7168) | (57344 & i38222) | (458752 & i38222) | (3670016 & i38222) | (29360128 & i38222) | (i38222 & 234881024), 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                textDecoration4 = textDecoration3;
                textAlign3 = textAlign2;
                fontFamily3 = fontFamily2;
                i30 = i26;
                z4 = z3;
                i31 = i29;
                j9 = j7;
                fontStyle3 = fontStyle2;
                fontWeight3 = fontWeight2;
                j10 = j6;
                modifier2 = companion;
                j11 = m5936getUnspecifiedXSAIIZE;
                map3 = map2;
                j12 = m3443getUnspecified0d7_KjU;
                function13 = function12;
                textStyle3 = textStyle2;
                i32 = i27;
                i33 = i30;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
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
            i16 = i6 & 1024;
            if (i16 != 0) {
            }
            i18 = i6 & 2048;
            if (i18 != 0) {
            }
            int i352 = i17;
            i19 = i6 & 4096;
            if (i19 != 0) {
            }
            i20 = i6 & 8192;
            if (i20 == 0) {
            }
            i21 = i6 & 16384;
            if (i21 != 0) {
            }
            i23 = i6 & 32768;
            if (i23 == 0) {
            }
            i24 = i6 & 65536;
            if (i24 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i34 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
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
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            if (i19 == 0) {
            }
            if (i20 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i6 & 131072) == 0) {
            }
            i25 = i352;
            map2 = emptyMap;
            function12 = textKt$Text$4;
            fontFamily2 = fontFamily4;
            j6 = m5936getUnspecifiedXSAIIZE2;
            i26 = i36;
            i27 = i37;
            z2 = z5;
            i28 = m5675getClipgIe3tQ8;
            j7 = j5;
            textDecoration3 = textDecoration2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(79588770);
            ComposerKt.sourceInformation(startRestartGroup, "");
            if (m3443getUnspecified0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            m5278mergedA7vx0o = textStyle2.m5278mergedA7vx0o((r58 & 1) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j8, (r58 & 2) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE, (r58 & 4) != 0 ? null : fontWeight2, (r58 & 8) != 0 ? null : fontStyle2, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : fontFamily2, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j6, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : textDecoration3, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk(), (r58 & 65536) != 0 ? TextDirection.INSTANCE.m5645getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j7, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.INSTANCE.m5559getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.INSTANCE.m5538getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
            int i382222 = i25 << 9;
            BasicTextKt.m840BasicTextRWo7tUw(annotatedString, companion, m5278mergedA7vx0o, function12, i29, z3, i26, i27, map2, null, startRestartGroup, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 >> 9) & 7168) | (57344 & i382222) | (458752 & i382222) | (3670016 & i382222) | (29360128 & i382222) | (i382222 & 234881024), 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            textDecoration4 = textDecoration3;
            textAlign3 = textAlign2;
            fontFamily3 = fontFamily2;
            i30 = i26;
            z4 = z3;
            i31 = i29;
            j9 = j7;
            fontStyle3 = fontStyle2;
            fontWeight3 = fontWeight2;
            j10 = j6;
            modifier2 = companion;
            j11 = m5936getUnspecifiedXSAIIZE;
            map3 = map2;
            j12 = m3443getUnspecified0d7_KjU;
            function13 = function12;
            textStyle3 = textStyle2;
            i32 = i27;
            i33 = i30;
            endRestartGroup = startRestartGroup.endRestartGroup();
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
        i16 = i6 & 1024;
        if (i16 != 0) {
        }
        i18 = i6 & 2048;
        if (i18 != 0) {
        }
        int i3522 = i17;
        i19 = i6 & 4096;
        if (i19 != 0) {
        }
        i20 = i6 & 8192;
        if (i20 == 0) {
        }
        i21 = i6 & 16384;
        if (i21 != 0) {
        }
        i23 = i6 & 32768;
        if (i23 == 0) {
        }
        i24 = i6 & 65536;
        if (i24 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i34 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
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
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        if (i19 == 0) {
        }
        if (i20 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i6 & 131072) == 0) {
        }
        i25 = i3522;
        map2 = emptyMap;
        function12 = textKt$Text$4;
        fontFamily2 = fontFamily4;
        j6 = m5936getUnspecifiedXSAIIZE2;
        i26 = i36;
        i27 = i37;
        z2 = z5;
        i28 = m5675getClipgIe3tQ8;
        j7 = j5;
        textDecoration3 = textDecoration2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(79588770);
        ComposerKt.sourceInformation(startRestartGroup, "");
        if (m3443getUnspecified0d7_KjU == Color.INSTANCE.m3443getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        m5278mergedA7vx0o = textStyle2.m5278mergedA7vx0o((r58 & 1) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j8, (r58 & 2) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : m5936getUnspecifiedXSAIIZE, (r58 & 4) != 0 ? null : fontWeight2, (r58 & 8) != 0 ? null : fontStyle2, (r58 & 16) != 0 ? null : null, (r58 & 32) != 0 ? null : fontFamily2, (r58 & 64) != 0 ? null : null, (r58 & 128) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j6, (r58 & 256) != 0 ? null : null, (r58 & 512) != 0 ? null : null, (r58 & 1024) != 0 ? null : null, (r58 & 2048) != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : 0L, (r58 & 4096) != 0 ? null : textDecoration3, (r58 & 8192) != 0 ? null : null, (r58 & 16384) != 0 ? null : null, (r58 & 32768) != 0 ? TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk() : textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m5632getUnspecifiede0LSkKk(), (r58 & 65536) != 0 ? TextDirection.INSTANCE.m5645getUnspecifieds_7Xco() : 0, (r58 & 131072) != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j7, (r58 & 262144) != 0 ? null : null, (r58 & 524288) != 0 ? null : null, (r58 & 1048576) != 0 ? LineBreak.INSTANCE.m5559getUnspecifiedrAG3T2k() : 0, (r58 & 2097152) != 0 ? Hyphens.INSTANCE.m5538getUnspecifiedvmbZdU8() : 0, (r58 & 4194304) != 0 ? null : null, (r58 & 8388608) != 0 ? null : null);
        int i3822222 = i25 << 9;
        BasicTextKt.m840BasicTextRWo7tUw(annotatedString, companion, m5278mergedA7vx0o, function12, i29, z3, i26, i27, map2, null, startRestartGroup, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | ((i25 >> 9) & 7168) | (57344 & i3822222) | (458752 & i3822222) | (3670016 & i3822222) | (29360128 & i3822222) | (i3822222 & 234881024), 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        textDecoration4 = textDecoration3;
        textAlign3 = textAlign2;
        fontFamily3 = fontFamily2;
        i30 = i26;
        z4 = z3;
        i31 = i29;
        j9 = j7;
        fontStyle3 = fontStyle2;
        fontWeight3 = fontWeight2;
        j10 = j6;
        modifier2 = companion;
        j11 = m5936getUnspecifiedXSAIIZE;
        map3 = map2;
        j12 = m3443getUnspecified0d7_KjU;
        function13 = function12;
        textStyle3 = textStyle2;
        i32 = i27;
        i33 = i30;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a3  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2124Text4IGK_g(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
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
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier.Companion companion;
        long m3443getUnspecified0d7_KjU;
        TextAlign textAlign2;
        TextDecoration textDecoration2;
        long j5;
        TextStyle textStyle2;
        int i23;
        boolean z2;
        int i24;
        int i25;
        Map map2;
        Function1 function12;
        FontStyle fontStyle2;
        long j6;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long j7;
        final TextDecoration textDecoration3;
        Composer composer2;
        final TextAlign textAlign3;
        final long j8;
        final int i26;
        final boolean z3;
        final int i27;
        final Map map3;
        final Function1 function13;
        final TextStyle textStyle3;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final Modifier modifier2;
        final long j9;
        final long j10;
        final long j11;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(224529679);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)307@13179L7,309@13195L345:Text.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i28 = i5 & 2;
        if (i28 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                i6 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i6 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
                i10 = i5 & 32;
                if (i10 != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i6 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i6 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                    i6 |= 100663296;
                } else if ((100663296 & i3) == 0) {
                    i6 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i14 = i5 & 512;
                    if (i14 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
                    }
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                        i16 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        i16 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i16 = i4;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i4 & 48) == 0) {
                        i16 |= startRestartGroup.changed(i) ? 32 : 16;
                    }
                    int i29 = i16;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i29 |= 384;
                    } else if ((i4 & 384) == 0) {
                        i29 |= startRestartGroup.changed(z) ? 256 : 128;
                        i19 = i5 & 8192;
                        if (i19 != 0) {
                            i29 |= 3072;
                        } else if ((i4 & 3072) == 0) {
                            i29 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                            i20 = i5 & 16384;
                            if (i20 == 0) {
                                i29 |= 24576;
                                i21 = i20;
                            } else {
                                i21 = i20;
                                if ((i4 & 24576) == 0) {
                                    i29 |= startRestartGroup.changedInstance(map) ? 16384 : 8192;
                                    i22 = i5 & 32768;
                                    if (i22 != 0) {
                                        i29 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i29 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                    }
                                    if ((i4 & 1572864) == 0) {
                                        i29 |= ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                    }
                                    if ((i6 & 306783379) == 306783378 || (599187 & i29) != 599186 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            companion = i28 != 0 ? Modifier.INSTANCE : modifier;
                                            m3443getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m3443getUnspecified0d7_KjU() : j;
                                            long m5936getUnspecifiedXSAIIZE = i8 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j2;
                                            FontStyle fontStyle4 = i9 != 0 ? null : fontStyle;
                                            FontWeight fontWeight4 = i10 != 0 ? null : fontWeight;
                                            FontFamily fontFamily4 = i11 != 0 ? null : fontFamily;
                                            long m5936getUnspecifiedXSAIIZE2 = i12 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j3;
                                            TextDecoration textDecoration4 = i13 != 0 ? null : textDecoration;
                                            textAlign2 = i14 == 0 ? textAlign : null;
                                            long m5936getUnspecifiedXSAIIZE3 = i15 != 0 ? TextUnit.INSTANCE.m5936getUnspecifiedXSAIIZE() : j4;
                                            int m5675getClipgIe3tQ8 = i17 != 0 ? TextOverflow.INSTANCE.m5675getClipgIe3tQ8() : i;
                                            boolean z4 = i18 != 0 ? true : z;
                                            int i30 = i19 != 0 ? Integer.MAX_VALUE : i2;
                                            Map emptyMap = i21 != 0 ? MapsKt.emptyMap() : map;
                                            TextKt$Text$6 textKt$Text$6 = i22 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$6
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(TextLayoutResult textLayoutResult) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                    invoke2(textLayoutResult);
                                                    return Unit.INSTANCE;
                                                }
                                            } : function1;
                                            if ((i5 & 65536) != 0) {
                                                textDecoration2 = textDecoration4;
                                                ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object consume = startRestartGroup.consume(providableCompositionLocal);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                i29 &= -3670017;
                                                j5 = m5936getUnspecifiedXSAIIZE3;
                                                textStyle2 = (TextStyle) consume;
                                            } else {
                                                textDecoration2 = textDecoration4;
                                                j5 = m5936getUnspecifiedXSAIIZE3;
                                                textStyle2 = textStyle;
                                            }
                                            i23 = m5675getClipgIe3tQ8;
                                            z2 = z4;
                                            i24 = i29;
                                            i25 = i30;
                                            map2 = emptyMap;
                                            function12 = textKt$Text$6;
                                            fontStyle2 = fontStyle4;
                                            j6 = m5936getUnspecifiedXSAIIZE;
                                            fontWeight2 = fontWeight4;
                                            fontFamily2 = fontFamily4;
                                            j7 = m5936getUnspecifiedXSAIIZE2;
                                            textDecoration3 = textDecoration2;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i5 & 65536) != 0) {
                                                i29 &= -3670017;
                                            }
                                            companion = modifier;
                                            m3443getUnspecified0d7_KjU = j;
                                            j6 = j2;
                                            fontStyle2 = fontStyle;
                                            fontWeight2 = fontWeight;
                                            fontFamily2 = fontFamily;
                                            textDecoration3 = textDecoration;
                                            textAlign2 = textAlign;
                                            j5 = j4;
                                            i23 = i;
                                            z2 = z;
                                            i25 = i2;
                                            map2 = map;
                                            function12 = function1;
                                            textStyle2 = textStyle;
                                            i24 = i29;
                                            j7 = j3;
                                        }
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            composer2 = startRestartGroup;
                                            ComposerKt.traceEventStart(224529679, i6, i24, "androidx.compose.material3.Text (Text.kt:308)");
                                        } else {
                                            composer2 = startRestartGroup;
                                        }
                                        int i31 = i24 << 3;
                                        m2126TextIbK3jfQ(annotatedString, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | 24576 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i31) | (3670016 & i31) | (i31 & 29360128), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textAlign3 = textAlign2;
                                        j8 = j5;
                                        i26 = i23;
                                        z3 = z2;
                                        i27 = i25;
                                        map3 = map2;
                                        function13 = function12;
                                        textStyle3 = textStyle2;
                                        FontFamily fontFamily5 = fontFamily2;
                                        fontStyle3 = fontStyle2;
                                        long j12 = j7;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily5;
                                        long j13 = j6;
                                        modifier2 = companion;
                                        j9 = j13;
                                        j10 = m3443getUnspecified0d7_KjU;
                                        j11 = j12;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        j10 = j;
                                        j9 = j2;
                                        fontStyle3 = fontStyle;
                                        fontWeight3 = fontWeight;
                                        fontFamily3 = fontFamily;
                                        j11 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j8 = j4;
                                        i26 = i;
                                        z3 = z;
                                        i27 = i2;
                                        map3 = map;
                                        function13 = function1;
                                        textStyle3 = textStyle;
                                        composer2 = startRestartGroup;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$7
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

                                            public final void invoke(Composer composer3, int i32) {
                                                TextKt.m2124Text4IGK_g(AnnotatedString.this, modifier2, j10, j9, fontStyle3, fontWeight3, fontFamily3, j11, textDecoration3, textAlign3, j8, i26, z3, i27, map3, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i22 = i5 & 32768;
                            if (i22 != 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i28 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if ((i5 & 65536) != 0) {
                            }
                            i23 = m5675getClipgIe3tQ8;
                            z2 = z4;
                            i24 = i29;
                            i25 = i30;
                            map2 = emptyMap;
                            function12 = textKt$Text$6;
                            fontStyle2 = fontStyle4;
                            j6 = m5936getUnspecifiedXSAIIZE;
                            fontWeight2 = fontWeight4;
                            fontFamily2 = fontFamily4;
                            j7 = m5936getUnspecifiedXSAIIZE2;
                            textDecoration3 = textDecoration2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i312 = i24 << 3;
                            m2126TextIbK3jfQ(annotatedString, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | 24576 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i312) | (3670016 & i312) | (i312 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            textAlign3 = textAlign2;
                            j8 = j5;
                            i26 = i23;
                            z3 = z2;
                            i27 = i25;
                            map3 = map2;
                            function13 = function12;
                            textStyle3 = textStyle2;
                            FontFamily fontFamily52 = fontFamily2;
                            fontStyle3 = fontStyle2;
                            long j122 = j7;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily52;
                            long j132 = j6;
                            modifier2 = companion;
                            j9 = j132;
                            j10 = m3443getUnspecified0d7_KjU;
                            j11 = j122;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i20 = i5 & 16384;
                        if (i20 == 0) {
                        }
                        i22 = i5 & 32768;
                        if (i22 != 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i28 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if ((i5 & 65536) != 0) {
                        }
                        i23 = m5675getClipgIe3tQ8;
                        z2 = z4;
                        i24 = i29;
                        i25 = i30;
                        map2 = emptyMap;
                        function12 = textKt$Text$6;
                        fontStyle2 = fontStyle4;
                        j6 = m5936getUnspecifiedXSAIIZE;
                        fontWeight2 = fontWeight4;
                        fontFamily2 = fontFamily4;
                        j7 = m5936getUnspecifiedXSAIIZE2;
                        textDecoration3 = textDecoration2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i3122 = i24 << 3;
                        m2126TextIbK3jfQ(annotatedString, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | 24576 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i3122) | (3670016 & i3122) | (i3122 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        textAlign3 = textAlign2;
                        j8 = j5;
                        i26 = i23;
                        z3 = z2;
                        i27 = i25;
                        map3 = map2;
                        function13 = function12;
                        textStyle3 = textStyle2;
                        FontFamily fontFamily522 = fontFamily2;
                        fontStyle3 = fontStyle2;
                        long j1222 = j7;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily522;
                        long j1322 = j6;
                        modifier2 = companion;
                        j9 = j1322;
                        j10 = m3443getUnspecified0d7_KjU;
                        j11 = j1222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i19 = i5 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i5 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i5 & 32768;
                    if (i22 != 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if ((i5 & 65536) != 0) {
                    }
                    i23 = m5675getClipgIe3tQ8;
                    z2 = z4;
                    i24 = i29;
                    i25 = i30;
                    map2 = emptyMap;
                    function12 = textKt$Text$6;
                    fontStyle2 = fontStyle4;
                    j6 = m5936getUnspecifiedXSAIIZE;
                    fontWeight2 = fontWeight4;
                    fontFamily2 = fontFamily4;
                    j7 = m5936getUnspecifiedXSAIIZE2;
                    textDecoration3 = textDecoration2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i31222 = i24 << 3;
                    m2126TextIbK3jfQ(annotatedString, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | 24576 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i31222) | (3670016 & i31222) | (i31222 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textAlign3 = textAlign2;
                    j8 = j5;
                    i26 = i23;
                    z3 = z2;
                    i27 = i25;
                    map3 = map2;
                    function13 = function12;
                    textStyle3 = textStyle2;
                    FontFamily fontFamily5222 = fontFamily2;
                    fontStyle3 = fontStyle2;
                    long j12222 = j7;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily5222;
                    long j13222 = j6;
                    modifier2 = companion;
                    j9 = j13222;
                    j10 = m3443getUnspecified0d7_KjU;
                    j11 = j12222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                int i292 = i16;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i19 = i5 & 8192;
                if (i19 != 0) {
                }
                i20 = i5 & 16384;
                if (i20 == 0) {
                }
                i22 = i5 & 32768;
                if (i22 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i28 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if ((i5 & 65536) != 0) {
                }
                i23 = m5675getClipgIe3tQ8;
                z2 = z4;
                i24 = i292;
                i25 = i30;
                map2 = emptyMap;
                function12 = textKt$Text$6;
                fontStyle2 = fontStyle4;
                j6 = m5936getUnspecifiedXSAIIZE;
                fontWeight2 = fontWeight4;
                fontFamily2 = fontFamily4;
                j7 = m5936getUnspecifiedXSAIIZE2;
                textDecoration3 = textDecoration2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i312222 = i24 << 3;
                m2126TextIbK3jfQ(annotatedString, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | 24576 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i312222) | (3670016 & i312222) | (i312222 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                textAlign3 = textAlign2;
                j8 = j5;
                i26 = i23;
                z3 = z2;
                i27 = i25;
                map3 = map2;
                function13 = function12;
                textStyle3 = textStyle2;
                FontFamily fontFamily52222 = fontFamily2;
                fontStyle3 = fontStyle2;
                long j122222 = j7;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily52222;
                long j132222 = j6;
                modifier2 = companion;
                j9 = j132222;
                j10 = m3443getUnspecified0d7_KjU;
                j11 = j122222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            int i2922 = i16;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i20 = i5 & 16384;
            if (i20 == 0) {
            }
            i22 = i5 & 32768;
            if (i22 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i28 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if ((i5 & 65536) != 0) {
            }
            i23 = m5675getClipgIe3tQ8;
            z2 = z4;
            i24 = i2922;
            i25 = i30;
            map2 = emptyMap;
            function12 = textKt$Text$6;
            fontStyle2 = fontStyle4;
            j6 = m5936getUnspecifiedXSAIIZE;
            fontWeight2 = fontWeight4;
            fontFamily2 = fontFamily4;
            j7 = m5936getUnspecifiedXSAIIZE2;
            textDecoration3 = textDecoration2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i3122222 = i24 << 3;
            m2126TextIbK3jfQ(annotatedString, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | 24576 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i3122222) | (3670016 & i3122222) | (i3122222 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            textAlign3 = textAlign2;
            j8 = j5;
            i26 = i23;
            z3 = z2;
            i27 = i25;
            map3 = map2;
            function13 = function12;
            textStyle3 = textStyle2;
            FontFamily fontFamily522222 = fontFamily2;
            fontStyle3 = fontStyle2;
            long j1222222 = j7;
            fontWeight3 = fontWeight2;
            fontFamily3 = fontFamily522222;
            long j1322222 = j6;
            modifier2 = companion;
            j9 = j1322222;
            j10 = m3443getUnspecified0d7_KjU;
            j11 = j1222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i29222 = i16;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i20 = i5 & 16384;
        if (i20 == 0) {
        }
        i22 = i5 & 32768;
        if (i22 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i28 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if ((i5 & 65536) != 0) {
        }
        i23 = m5675getClipgIe3tQ8;
        z2 = z4;
        i24 = i29222;
        i25 = i30;
        map2 = emptyMap;
        function12 = textKt$Text$6;
        fontStyle2 = fontStyle4;
        j6 = m5936getUnspecifiedXSAIIZE;
        fontWeight2 = fontWeight4;
        fontFamily2 = fontFamily4;
        j7 = m5936getUnspecifiedXSAIIZE2;
        textDecoration3 = textDecoration2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i31222222 = i24 << 3;
        m2126TextIbK3jfQ(annotatedString, companion, m3443getUnspecified0d7_KjU, j6, fontStyle2, fontWeight2, fontFamily2, j7, textDecoration3, textAlign2, j5, i23, z2, i25, 1, map2, function12, textStyle2, composer2, i6 & 2147483646, (i24 & 14) | 24576 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (458752 & i31222222) | (3670016 & i31222222) | (i31222222 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        textAlign3 = textAlign2;
        j8 = j5;
        i26 = i23;
        z3 = z2;
        i27 = i25;
        map3 = map2;
        function13 = function12;
        textStyle3 = textStyle2;
        FontFamily fontFamily5222222 = fontFamily2;
        fontStyle3 = fontStyle2;
        long j12222222 = j7;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily5222222;
        long j13222222 = j6;
        modifier2 = companion;
        j9 = j13222222;
        j10 = m3443getUnspecified0d7_KjU;
        j11 = j12222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-460300127);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)P(1)350@14496L7,351@14521L80:Text.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:349)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) consume).merge(textStyle)), function2, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$ProvideTextStyle$1
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

                public final void invoke(Composer composer2, int i3) {
                    TextKt.ProvideTextStyle(TextStyle.this, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
