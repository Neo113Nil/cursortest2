package com.google.android.gms.internal.mlkit_genai_prompt;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.ComposeClickableSpan;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.room.util.DBUtil;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzahu {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ClientScenario.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamilyResolverImpl fontFamilyResolverImpl, GrpcMethod grpcMethod) {
        String str;
        int i;
        LocaleList localeList;
        long j;
        String str2 = annotatedString.text;
        SpannableString spannableString = new SpannableString(str2);
        ArrayList arrayList = annotatedString.spanStylesOrNull;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                AnnotatedString.Range range = (AnnotatedString.Range) arrayList.get(i2);
                SpanStyle spanStyle = (SpanStyle) range.item;
                int i3 = range.start;
                int i4 = range.end;
                SpanStyle m973copyGSF8kmg$default = SpanStyle.m973copyGSF8kmg$default(spanStyle, 0L, null, 0L, 65503);
                TextForegroundStyle textForegroundStyle = m973copyGSF8kmg$default.textForegroundStyle;
                TextGeometricTransform textGeometricTransform = m973copyGSF8kmg$default.textGeometricTransform;
                TextDecoration textDecoration = m973copyGSF8kmg$default.textDecoration;
                FontFamily fontFamily = m973copyGSF8kmg$default.fontFamily;
                FontStyle fontStyle = m973copyGSF8kmg$default.fontStyle;
                DBUtil.m1184setColorRPmYEkk(spannableString, textForegroundStyle.mo1007getColor0d7_KjU(), i3, i4);
                DBUtil.m1185setFontSizeKmRG4DE(spannableString, m973copyGSF8kmg$default.fontSize, density, i3, i4);
                FontWeight fontWeight = m973copyGSF8kmg$default.fontWeight;
                if (fontWeight == null && fontStyle == null) {
                    str = str2;
                    i = 33;
                } else {
                    if (fontWeight == null) {
                        fontWeight = FontWeight.Normal;
                    }
                    int i5 = fontStyle != null ? fontStyle.value : 0;
                    str = str2;
                    boolean z = fontWeight.compareTo(FontWeight.W600) >= 0;
                    boolean z2 = i5 == 1;
                    StyleSpan styleSpan = new StyleSpan((z2 && z) ? 3 : z ? 1 : z2 ? 2 : 0);
                    i = 33;
                    spannableString.setSpan(styleSpan, i3, i4, 33);
                }
                if (fontFamily != null) {
                    if (fontFamily instanceof GenericFontFamily) {
                        spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) fontFamily).name), i3, i4, i);
                    } else {
                        FontSynthesis fontSynthesis = m973copyGSF8kmg$default.fontSynthesis;
                        Object value = fontFamilyResolverImpl.m997resolveDPcqOEQ(fontFamily, FontWeight.Normal, 0, fontSynthesis != null ? fontSynthesis.value : 65535).getValue();
                        value.getClass();
                        TypefaceSpan typefaceSpan = new TypefaceSpan((Typeface) value);
                        i = 33;
                        spannableString.setSpan(typefaceSpan, i3, i4, 33);
                        if (textDecoration != null) {
                            int i6 = textDecoration.mask;
                            if ((i6 | 1) == i6) {
                                spannableString.setSpan(new UnderlineSpan(), i3, i4, i);
                            }
                            if ((i6 | 2) == i6) {
                                spannableString.setSpan(new StrikethroughSpan(), i3, i4, i);
                            }
                        }
                        if (textGeometricTransform != null) {
                            spannableString.setSpan(new ScaleXSpan(textGeometricTransform.scaleX), i3, i4, i);
                        }
                        localeList = m973copyGSF8kmg$default.localeList;
                        if (localeList != null) {
                            spannableString.setSpan(zzahx.localeSpan(localeList), i3, i4, i);
                        }
                        j = m973copyGSF8kmg$default.background;
                        if (j == 16) {
                            spannableString.setSpan(new BackgroundColorSpan(ColorKt.m694toArgb8_81llA(j)), i3, i4, i);
                        }
                        i2++;
                        str2 = str;
                    }
                }
                if (textDecoration != null) {
                }
                if (textGeometricTransform != null) {
                }
                localeList = m973copyGSF8kmg$default.localeList;
                if (localeList != null) {
                }
                j = m973copyGSF8kmg$default.background;
                if (j == 16) {
                }
                i2++;
                str2 = str;
            }
        }
        String str3 = str2;
        List ttsAnnotations = annotatedString.getTtsAnnotations(str3.length());
        int size2 = ttsAnnotations.size();
        for (int i7 = 0; i7 < size2; i7++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) ttsAnnotations.get(i7);
            VerbatimTtsAnnotation verbatimTtsAnnotation = (VerbatimTtsAnnotation) range2.item;
            int i8 = range2.start;
            int i9 = range2.end;
            if (!(verbatimTtsAnnotation instanceof VerbatimTtsAnnotation)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.verbatim).build(), i8, i9, 33);
        }
        List urlAnnotations = annotatedString.getUrlAnnotations(str3.length());
        int size3 = urlAnnotations.size();
        for (int i10 = 0; i10 < size3; i10++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) urlAnnotations.get(i10);
            UrlAnnotation urlAnnotation = (UrlAnnotation) range3.item;
            int i11 = range3.start;
            int i12 = range3.end;
            WeakHashMap weakHashMap = (WeakHashMap) grpcMethod.path;
            Object obj = weakHashMap.get(urlAnnotation);
            if (obj == null) {
                obj = new URLSpan(urlAnnotation.url);
                weakHashMap.put(urlAnnotation, obj);
            }
            spannableString.setSpan((URLSpan) obj, i11, i12, 33);
        }
        List linkAnnotations = annotatedString.getLinkAnnotations(0, str3.length());
        int size4 = linkAnnotations.size();
        for (int i13 = 0; i13 < size4; i13++) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) linkAnnotations.get(i13);
            int i14 = range4.start;
            Object obj2 = range4.item;
            int i15 = range4.end;
            if (i14 != i15) {
                LinkAnnotation linkAnnotation = (LinkAnnotation) obj2;
                if ((linkAnnotation instanceof LinkAnnotation.Url) && ((LinkAnnotation.Url) linkAnnotation).linkInteractionListener == null) {
                    obj2.getClass();
                    LinkAnnotation.Url url = (LinkAnnotation.Url) obj2;
                    AnnotatedString.Range range5 = new AnnotatedString.Range(url, i14, i15);
                    WeakHashMap weakHashMap2 = (WeakHashMap) grpcMethod.requestAdapter;
                    Object obj3 = weakHashMap2.get(range5);
                    if (obj3 == null) {
                        obj3 = new URLSpan(url.url);
                        weakHashMap2.put(range5, obj3);
                    }
                    spannableString.setSpan((URLSpan) obj3, i14, i15, 33);
                } else {
                    WeakHashMap weakHashMap3 = (WeakHashMap) grpcMethod.responseAdapter;
                    Object obj4 = weakHashMap3.get(range4);
                    if (obj4 == null) {
                        obj4 = new ComposeClickableSpan(linkAnnotation);
                        weakHashMap3.put(range4, obj4);
                    }
                    spannableString.setSpan((ClickableSpan) obj4, i14, i15, 33);
                }
            }
        }
        return spannableString;
    }
}
