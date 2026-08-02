package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.markdown.compose_ui.MarkdownTextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.ComposeColorPalette;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.workflow1.Worker;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes3.dex */
public abstract class KeyguardUtils {

    public abstract class Api23Impl {
        public static KeyguardManager getKeyguardManager(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        public static boolean isDeviceSecure(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009c  */
    /* renamed from: MarkdownText-nvClB8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14MarkdownTextnvClB8o(String str, Function2 function2, Modifier modifier, TextStyle textStyle, long j, SpanStyle spanStyle, Function1 function1, int i, int i2, TextLineBalancing textLineBalancing, int i3, Composer composer, int i4, int i5) {
        Modifier modifier2;
        SpanStyle spanStyle2;
        int i6;
        int i7;
        int i8;
        int i9;
        TextLineBalancing textLineBalancing2;
        int i10;
        int i11;
        GapComposer gapComposer;
        Function1 function12;
        int i12;
        SpanStyle spanStyle3;
        int i13;
        int i14;
        RecomposeScopeImpl endRestartGroup;
        Function1 function13;
        int i15;
        int i16;
        int i17;
        int i18;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(49757745);
        int i19 = (gapComposer2.changed(str) ? 4 : 2) | i4;
        if ((i4 & 48) == 0) {
            i19 |= gapComposer2.changedInstance(function2) ? 32 : 16;
        }
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i19 |= gapComposer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i20 = i19 | (gapComposer2.changed(textStyle) ? 2048 : 1024) | (gapComposer2.changed(j) ? 16384 : PKIFailureInfo.certRevoked);
        int i21 = i5 & 32;
        if (i21 != 0) {
            i6 = i20 | 196608;
            spanStyle2 = spanStyle;
        } else {
            spanStyle2 = spanStyle;
            i6 = i20 | (gapComposer2.changed(spanStyle2) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i22 = i6 | 14155776;
        if ((i5 & 256) == 0) {
            i7 = i2;
            if (gapComposer2.changed(i7)) {
                i8 = 67108864;
                int i23 = i22 | i8;
                i9 = i5 & 512;
                if (i9 == 0) {
                    i10 = i23 | 805306368;
                    textLineBalancing2 = textLineBalancing;
                } else {
                    textLineBalancing2 = textLineBalancing;
                    i10 = i23 | (gapComposer2.changed(textLineBalancing2) ? PKIFailureInfo.duplicateCertReq : 268435456);
                }
                i11 = i10;
                if (gapComposer2.shouldExecute(i11 & 1, (i10 & 306783379) == 306783378)) {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    function12 = function1;
                    i12 = i;
                    spanStyle3 = spanStyle2;
                    i13 = i7;
                    i14 = i3;
                } else {
                    gapComposer2.startDefaults();
                    int i24 = i4 & 1;
                    Object obj = Composer.Companion.Empty;
                    if (i24 == 0 || gapComposer2.getDefaultsInvalid()) {
                        if (i21 != 0) {
                            spanStyle2 = null;
                        }
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (rememberedValue == obj) {
                            rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda0(5);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        Function1 function14 = (Function1) rememberedValue;
                        if ((i5 & 256) != 0) {
                            i11 &= -234881025;
                            i7 = 0;
                        }
                        if (i9 != 0) {
                            textLineBalancing2 = null;
                        }
                        function13 = function14;
                        i15 = textLineBalancing2 != null ? 3 : 2;
                        i16 = i11;
                        i17 = i7;
                        i18 = Integer.MAX_VALUE;
                    } else {
                        gapComposer2.skipToGroupEnd();
                        i16 = (i5 & 256) != 0 ? i11 & (-234881025) : i11;
                        function13 = function1;
                        i15 = i3;
                        i17 = i7;
                        i18 = i;
                    }
                    TextLineBalancing textLineBalancing3 = textLineBalancing2;
                    gapComposer2.endDefaults();
                    ComposeColorPalette colors = MooncakeTheme.getColors(gapComposer2);
                    int i25 = i16;
                    boolean z = ((i16 & 14) == 4) | ((458752 & i16) == 131072);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    Object obj2 = rememberedValue2;
                    if (z || rememberedValue2 == obj) {
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        Worker.DefaultImpls.appendMarkdown(builder, str, new SpanStyle(colors.tint, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER).merge(spanStyle2), function2);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        if (function2 == null && !annotatedString.getLinkAnnotations(0, annotatedString.text.length()).isEmpty()) {
                            a$$ExternalSyntheticBUOutline0.m$1("MarkdownText() can't display links if onUrlClick is null");
                            return;
                        } else {
                            gapComposer2.updateRememberedValue(annotatedString);
                            obj2 = annotatedString;
                        }
                    }
                    gapComposer = gapComposer2;
                    KeypadKt.m3650TextPdH14aY(i18, 0, i17, i15, ((i25 >> 3) & 8176) | 221184 | (i25 & 234881024) | (i25 & 1879048192), 0, 2240, j, (Composer) gapComposer, modifier2, (AnnotatedString) obj2, textStyle, textLineBalancing3, (Map) null, function13, false);
                    spanStyle3 = spanStyle2;
                    i12 = i18;
                    i13 = i17;
                    i14 = i15;
                    textLineBalancing2 = textLineBalancing3;
                    function12 = function13;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new MarkdownTextKt$$ExternalSyntheticLambda1(str, function2, modifier, textStyle, j, spanStyle3, function12, i12, i13, textLineBalancing2, i14, i4, i5);
                    return;
                }
                return;
            }
        } else {
            i7 = i2;
        }
        i8 = 33554432;
        int i232 = i22 | i8;
        i9 = i5 & 512;
        if (i9 == 0) {
        }
        i11 = i10;
        if (gapComposer2.shouldExecute(i11 & 1, (i10 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static KeyguardManager getKeyguardManager(Context context) {
        return Api23Impl.getKeyguardManager(context);
    }

    public static boolean isDeviceSecuredWithCredential(Context context) {
        KeyguardManager keyguardManager = Api23Impl.getKeyguardManager(context);
        if (keyguardManager == null) {
            return false;
        }
        return Api23Impl.isDeviceSecure(keyguardManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[LOOP:0: B:8:0x002a->B:21:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isValidSearchQuery(CharSequence charSequence) {
        List split$default;
        Float f;
        charSequence.getClass();
        split$default = StringsKt__StringsKt.split$default(charSequence, new String[]{" "}, false, 0, 6, null);
        if (!split$default.isEmpty()) {
            List<String> list = split$default;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    if (str.length() >= 2) {
                        return true;
                    }
                    if (StringsKt__StringNumberConversionsJVMKt.isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                        f = Float.valueOf(Float.parseFloat(str));
                        if (f == null) {
                            return true;
                        }
                    }
                    f = null;
                    if (f == null) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalParsingResult parseReferenceLink(BlockContent blockContent) {
        LocalParsingResult localParsingResult;
        MarkdownElementType markdownElementType = MarkdownTokenTypes.EOL;
        blockContent.getClass();
        int i = blockContent.lineCount;
        LocalParsingResult parseLinkText = DeviceUtils.parseLinkText(blockContent);
        if (parseLinkText != null) {
            BlockContent advance = parseLinkText.iteratorPosition.advance();
            if (Intrinsics.areEqual(advance.getType(), markdownElementType)) {
                advance = advance.advance();
            }
            LocalParsingResult parseLinkLabel = DeviceUtils.parseLinkLabel(advance);
            if (parseLinkLabel != null) {
                BlockContent blockContent2 = parseLinkLabel.iteratorPosition;
                localParsingResult = new LocalParsingResult(blockContent2, (Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) parseLinkLabel.parsedNodes, parseLinkText.parsedNodes), (Object) new SequentialParser.Node(new IntRange(i, blockContent2.lineCount + 1, 1), MarkdownTokenTypes.FULL_REFERENCE_LINK)), (Collection) CollectionsKt.plus((Iterable) parseLinkLabel.rangesToProcessFurther, parseLinkText.rangesToProcessFurther));
                if (localParsingResult == null) {
                    return localParsingResult;
                }
                LocalParsingResult parseLinkLabel2 = DeviceUtils.parseLinkLabel(blockContent);
                if (parseLinkLabel2 == null) {
                    return null;
                }
                BlockContent blockContent3 = parseLinkLabel2.iteratorPosition;
                BlockContent advance2 = blockContent3.advance();
                if (Intrinsics.areEqual(advance2.getType(), markdownElementType)) {
                    advance2 = advance2.advance();
                }
                if (Intrinsics.areEqual(advance2.getType(), MarkdownTokenTypes.LBRACKET) && Intrinsics.areEqual(advance2.rawLookup(), MarkdownTokenTypes.RBRACKET)) {
                    blockContent3 = advance2.advance();
                }
                return new LocalParsingResult(blockContent3, CollectionsKt.plus(parseLinkLabel2.parsedNodes, (Object) new SequentialParser.Node(new IntRange(i, blockContent3.lineCount + 1, 1), MarkdownTokenTypes.SHORT_REFERENCE_LINK)), parseLinkLabel2.rangesToProcessFurther);
            }
        }
        localParsingResult = null;
        if (localParsingResult == null) {
        }
    }
}
