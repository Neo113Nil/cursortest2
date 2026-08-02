package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Typeface;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.camera.video.Recorder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotationSpan;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.BulletSpanWithLevel;
import androidx.compose.ui.text.Html_androidKt$WhenMappings;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public abstract class zzuv {
    public static final AnnotatedString createHtmlAnnotatedString(String str, TextStyle textStyle, Function1 function1, Composer composer) {
        Object[] objArr;
        boolean z;
        int i;
        String url;
        FontFamily fontFamily;
        FontFamily fontFamily2;
        FontFamily fontFamily3;
        SpanStyle spanStyle;
        str.getClass();
        textStyle.getClass();
        function1.getClass();
        FontWeight fontWeight = FontWeight.SemiBold;
        TextDecoration textDecoration = TextDecoration.Underline;
        SpanStyle spanStyle2 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, fontWeight, null, 0L, null, 0L, textDecoration, null, null, 0, 0L, null, null, 0, 16773115).spanStyle;
        int i2 = AnnotatedString.$r8$clinit;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        SpanStyle m973copyGSF8kmg$default = SpanStyle.m973copyGSF8kmg$default(spanStyle2, 0L, null, Color.m675copywmQWz5c$default(0.7f, colors.semantic.background.subtle, 14), 63487);
        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        TextLinkStyles textLinkStyles = new TextLinkStyles(spanStyle2, m973copyGSF8kmg$default, SpanStyle.m973copyGSF8kmg$default(spanStyle2, 0L, null, colors2.semantic.background.subtle, 63487), 4);
        boolean changed = gapComposer.changed(function1);
        Object rememberedValue = gapComposer.rememberedValue();
        int i3 = 2;
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DisclaimerTextKt$$ExternalSyntheticLambda1(function1, 2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        LinkInteractionListener linkInteractionListener = (LinkInteractionListener) rememberedValue;
        Spanned fromHtml = Html.fromHtml("<ContentHandlerReplacementTag />".concat(str), 63, null, TextPainterKt.TagHandler);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(fromHtml.length());
        builder.append((CharSequence) fromHtml);
        Object[] spans = fromHtml.getSpans(0, builder.text.length(), Object.class);
        int length = spans.length;
        int i4 = 0;
        while (i4 < length) {
            Object obj = spans[i4];
            long TextRange = SizeKt.TextRange(fromHtml.getSpanStart(obj), fromHtml.getSpanEnd(obj));
            int i5 = TextRange.$r8$clinit;
            int i6 = (int) (TextRange >> 32);
            int i7 = (int) (TextRange & BodyPartID.bodyIdMax);
            if (!(obj instanceof AbsoluteSizeSpan)) {
                boolean z2 = obj instanceof AlignmentSpan;
                ArrayList arrayList = builder.annotations;
                int i8 = 3;
                if (z2) {
                    Layout.Alignment alignment = ((AlignmentSpan) obj).getAlignment();
                    int i9 = alignment == null ? -1 : Html_androidKt$WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                    if (i9 == 1) {
                        i8 = 5;
                    } else if (i9 != i3) {
                        i8 = i9 != 3 ? 0 : 6;
                    }
                    arrayList.add(new AnnotatedString.Builder.MutableRange(new ParagraphStyle(i8, null, 510), i6, i7, 8));
                } else if (obj instanceof AnnotationSpan) {
                    AnnotationSpan annotationSpan = (AnnotationSpan) obj;
                    builder.addStringAnnotation(annotationSpan.key, i6, i7, annotationSpan.value);
                } else if (obj instanceof BackgroundColorSpan) {
                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, 63487), i6, i7);
                } else {
                    if (obj instanceof BulletSpanWithLevel) {
                        long j = Bullet.DefaultIndentation;
                        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
                        int i10 = bulletSpanWithLevel.indentationLevel;
                        Room.m1167checkArithmeticR2X_6o(j);
                        objArr = spans;
                        long pack = Room.pack(j & 1095216660480L, TextUnit.m1059getValueimpl(j) * i10);
                        Bullet bullet = bulletSpanWithLevel.bullet;
                        arrayList.add(new AnnotatedString.Builder.MutableRange(new ParagraphStyle(0, new TextIndent(pack, pack), 503), i6, i7, 8));
                        arrayList.add(new AnnotatedString.Builder.MutableRange(bullet, i6, i7, 8));
                    } else {
                        objArr = spans;
                        if (obj instanceof ForegroundColorSpan) {
                            builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), i6, i7);
                        } else if (obj instanceof RelativeSizeSpan) {
                            builder.addStyle(new SpanStyle(0L, Room.pack(8589934592L, ((RelativeSizeSpan) obj).getSizeChange()), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65533), i6, i7);
                        } else if (obj instanceof StrikethroughSpan) {
                            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.LineThrough, (Shadow) null, 61439), i6, i7);
                        } else {
                            if (obj instanceof StyleSpan) {
                                int style = ((StyleSpan) obj).getStyle();
                                if (style != 1) {
                                    i = 2;
                                    spanStyle = style != 2 ? style != 3 ? null : new SpanStyle(0L, 0L, FontWeight.Bold, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65523) : new SpanStyle(0L, 0L, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65527);
                                } else {
                                    i = 2;
                                    spanStyle = new SpanStyle(0L, 0L, FontWeight.Bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531);
                                }
                                if (spanStyle != null) {
                                    builder.addStyle(spanStyle, i6, i7);
                                }
                            } else {
                                i = 2;
                                if (obj instanceof SubscriptSpan) {
                                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, new BaselineShift(-0.5f), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65279), i6, i7);
                                } else if (obj instanceof SuperscriptSpan) {
                                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, new BaselineShift(0.5f), (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65279), i6, i7);
                                } else {
                                    if (obj instanceof TypefaceSpan) {
                                        TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                                        String family = typefaceSpan.getFamily();
                                        if (Intrinsics.areEqual(family, "cursive")) {
                                            fontFamily3 = FontFamily.Cursive;
                                        } else if (Intrinsics.areEqual(family, "monospace")) {
                                            fontFamily3 = FontFamily.Monospace;
                                        } else if (Intrinsics.areEqual(family, "sans-serif")) {
                                            fontFamily3 = FontFamily.SansSerif;
                                        } else if (Intrinsics.areEqual(family, "serif")) {
                                            fontFamily3 = FontFamily.Serif;
                                        } else {
                                            String family2 = typefaceSpan.getFamily();
                                            if (family2 == null || family2.length() == 0) {
                                                z = false;
                                            } else {
                                                z = false;
                                                Typeface create = Typeface.create(family2, 0);
                                                Typeface typeface = Typeface.DEFAULT;
                                                if (Intrinsics.areEqual(create, typeface) || Intrinsics.areEqual(create, Typeface.create(typeface, 0))) {
                                                    create = null;
                                                }
                                                if (create != null) {
                                                    fontFamily = new LoadedFontFamily(new Recorder.AnonymousClass6(create, 18));
                                                    fontFamily2 = fontFamily;
                                                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65503), i6, i7);
                                                }
                                            }
                                            fontFamily = null;
                                            fontFamily2 = fontFamily;
                                            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65503), i6, i7);
                                        }
                                        fontFamily2 = fontFamily3;
                                        z = false;
                                        builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65503), i6, i7);
                                    } else {
                                        z = false;
                                        if (obj instanceof UnderlineSpan) {
                                            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration, (Shadow) null, 61439), i6, i7);
                                        } else if ((obj instanceof URLSpan) && (url = ((URLSpan) obj).getURL()) != null) {
                                            builder.addLink(new LinkAnnotation.Url(url, textLinkStyles, linkInteractionListener), i6, i7);
                                        }
                                    }
                                    i4++;
                                    i3 = i;
                                    spans = objArr;
                                }
                            }
                            z = false;
                            i4++;
                            i3 = i;
                            spans = objArr;
                        }
                    }
                    i = 2;
                    z = false;
                    i4++;
                    i3 = i;
                    spans = objArr;
                }
            }
            objArr = spans;
            z = false;
            i = i3;
            i4++;
            i3 = i;
            spans = objArr;
        }
        return builder.toAnnotatedString();
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentSavingsTaxForm.deepLinkSpecs;
    }
}
