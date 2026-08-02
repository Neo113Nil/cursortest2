package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.SpannedToHtmlConverter;
import androidx.media3.ui.SubtitleView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import com.datadog.trace.api.Platform;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    public float bottomPaddingFraction;
    public final CanvasSubtitleOutput canvasSubtitleOutput;
    public float defaultTextSize;
    public int defaultTextSizeType;
    public CaptionStyleCompat style;
    public List textCues;
    public final AnonymousClass1 webView;

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$1, reason: invalid class name */
    public final class AnonymousClass1 extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.EMPTY_LIST;
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, attributeSet);
        this.webView = anonymousClass1;
        anonymousClass1.setBackgroundColor(0);
        anonymousClass1.getSettings().setAllowContentAccess(false);
        addView(canvasSubtitleOutput);
        addView(anonymousClass1);
    }

    public final String convertTextSizeToCss(float f, int i) {
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (resolveTextSize == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(resolveTextSize / getContext().getResources().getDisplayMetrics().density)};
        String str = Util.DEVICE_DEBUG_INFO;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public final void update(List list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = (Cue) list.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x01f9, code lost:
    
        if (r5 != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01fc, code lost:
    
        r9 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x01fe, code lost:
    
        r27 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0201, code lost:
    
        if (r5 != 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x053d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateWebView() {
        String format2;
        float f;
        int i;
        String format3;
        String str;
        int i2;
        Layout.Alignment alignment;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        String str4;
        Object obj;
        int i6;
        CharSequence charSequence;
        String str5;
        String str6;
        String str7;
        float f2;
        String str8;
        String str9;
        String str10;
        Platform.JvmRuntime jvmRuntime;
        boolean z;
        String str11;
        Object[] objArr;
        int i7;
        int i8;
        int i9;
        String format4;
        String str12;
        float f3;
        String str13;
        Integer num;
        String str14;
        Float f4;
        Integer num2;
        Layout.Alignment alignment2;
        int i10;
        String str15;
        StringBuilder sb = new StringBuilder();
        String cssRgba = HtmlUtils.toCssRgba(this.style.foregroundColor);
        String convertTextSizeToCss = convertTextSizeToCss(this.defaultTextSize, this.defaultTextSizeType);
        float f5 = 1.2f;
        Float valueOf = Float.valueOf(1.2f);
        CaptionStyleCompat captionStyleCompat = this.style;
        int i11 = captionStyleCompat.edgeType;
        int i12 = captionStyleCompat.edgeColor;
        int i13 = 2;
        int i14 = 1;
        if (i11 == 1) {
            Object[] objArr2 = {HtmlUtils.toCssRgba(i12)};
            String str16 = Util.DEVICE_DEBUG_INFO;
            format2 = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i11 == 2) {
            String cssRgba2 = HtmlUtils.toCssRgba(i12);
            String str17 = Util.DEVICE_DEBUG_INFO;
            Locale locale = Locale.US;
            format2 = "0.1em 0.12em 0.15em ".concat(cssRgba2);
        } else if (i11 == 3) {
            String cssRgba3 = HtmlUtils.toCssRgba(i12);
            String str18 = Util.DEVICE_DEBUG_INFO;
            Locale locale2 = Locale.US;
            format2 = "0.06em 0.08em 0.15em ".concat(cssRgba3);
        } else if (i11 != 4) {
            format2 = "unset";
        } else {
            String cssRgba4 = HtmlUtils.toCssRgba(i12);
            String str19 = Util.DEVICE_DEBUG_INFO;
            Locale locale3 = Locale.US;
            format2 = "-0.05em -0.05em 0.15em ".concat(cssRgba4);
        }
        Object[] objArr3 = {cssRgba, convertTextSizeToCss, valueOf, format2};
        String str20 = Util.DEVICE_DEBUG_INFO;
        sb.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap hashMap = new HashMap();
        String cssRgba5 = HtmlUtils.toCssRgba(this.style.backgroundColor);
        String str21 = "background-color:";
        StringBuilder sb2 = new StringBuilder("background-color:");
        sb2.append(cssRgba5);
        String str22 = ";";
        sb2.append(";");
        hashMap.put(".default_bg,.default_bg *", sb2.toString());
        int i15 = 0;
        while (i15 < this.textCues.size()) {
            Cue cue = (Cue) this.textCues.get(i15);
            float f6 = cue.position;
            int i16 = cue.verticalType;
            float f7 = f6 != -3.4028235E38f ? f6 * 100.0f : 50.0f;
            float f8 = f5;
            int i17 = cue.positionAnchor;
            int i18 = -100;
            if (i17 == i14) {
                f = -3.4028235E38f;
                i = -50;
            } else if (i17 != i13) {
                f = -3.4028235E38f;
                i = 0;
            } else {
                f = -3.4028235E38f;
                i = -100;
            }
            float f9 = cue.line;
            if (f9 == f) {
                format3 = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.bottomPaddingFraction) * 100.0f));
            } else if (cue.lineType != i14) {
                format3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f9 * 100.0f));
                int i19 = cue.lineAnchor;
                i18 = i16 == i14 ? -(i19 != i14 ? i19 != i13 ? 0 : -100 : -50) : i19 != i14 ? i19 != i13 ? 0 : -100 : -50;
            } else {
                if (f9 >= RecyclerView.DECELERATION_RATE) {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(f9 * f8));
                    i2 = 0;
                } else {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(((-f9) - 1.0f) * f8));
                    i2 = i14;
                }
                i18 = 0;
                float f10 = cue.size;
                String format5 = f10 == f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f10 * 100.0f)) : "fit-content";
                alignment = cue.textAlignment;
                String str23 = "end";
                if (alignment != null) {
                    i4 = i14;
                    str2 = "center";
                    i3 = 2;
                } else {
                    int i20 = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
                    if (i20 != i14) {
                        i3 = 2;
                        str2 = i20 != 2 ? "center" : "end";
                    } else {
                        i3 = 2;
                        str2 = "start";
                    }
                    i4 = 1;
                }
                String str24 = i16 == i4 ? i16 != i3 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
                String convertTextSizeToCss2 = convertTextSizeToCss(cue.textSize, cue.textSizeType);
                String cssRgba6 = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : this.style.windowColor);
                String str25 = "right";
                str3 = "top";
                i5 = i;
                if (i16 == 1) {
                    if (i16 != 2) {
                        str4 = i2 != 0 ? "bottom" : "top";
                        str3 = "left";
                    }
                }
                if (i16 != 2 || i16 == 1) {
                    obj = "height";
                    i6 = i18;
                    i18 = i5;
                } else {
                    obj = "width";
                    i6 = i5;
                }
                charSequence = cue.text;
                float f11 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = SpannedToHtmlConverter.NEWLINE_PATTERN;
                int i21 = i6;
                int i22 = i15;
                if (charSequence != null) {
                    str5 = "start";
                    str6 = str3;
                    jvmRuntime = new Platform.JvmRuntime("", 1, (byte) 0);
                    str9 = str22;
                    str10 = str21;
                    str7 = "";
                } else {
                    str5 = "start";
                    str6 = str3;
                    if (charSequence instanceof Spanned) {
                        str7 = "";
                        Spanned spanned = (Spanned) charSequence;
                        HashSet hashSet = new HashSet();
                        f2 = f7;
                        BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        int i23 = 0;
                        for (int length = backgroundColorSpanArr.length; i23 < length; length = length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i23].getBackgroundColor()));
                            i23++;
                        }
                        HashMap hashMap2 = new HashMap();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "bg_");
                            Iterator it2 = it;
                            String m2 = Boxes$$ExternalSyntheticOutline1.m(".", m, ",.", m, " *");
                            String cssRgba7 = HtmlUtils.toCssRgba(intValue);
                            String str26 = Util.DEVICE_DEBUG_INFO;
                            Locale locale4 = Locale.US;
                            hashMap2.put(m2, str21 + cssRgba7 + str22);
                            it = it2;
                            str23 = str23;
                        }
                        str8 = str23;
                        SparseArray sparseArray = new SparseArray();
                        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                        int length2 = spans.length;
                        int i24 = 0;
                        while (i24 < length2) {
                            Object obj2 = spans[i24];
                            String str27 = str22;
                            boolean z2 = obj2 instanceof StrikethroughSpan;
                            String str28 = null;
                            if (z2) {
                                z = z2;
                                format4 = "<span style='text-decoration:line-through;'>";
                                str11 = str21;
                            } else {
                                z = z2;
                                if (obj2 instanceof ForegroundColorSpan) {
                                    String cssRgba8 = HtmlUtils.toCssRgba(((ForegroundColorSpan) obj2).getForegroundColor());
                                    String str29 = Util.DEVICE_DEBUG_INFO;
                                    Locale locale5 = Locale.US;
                                    str11 = str21;
                                    format4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("<span style='color:", cssRgba8, ";'>");
                                } else {
                                    str11 = str21;
                                    if (obj2 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj2).getBackgroundColor();
                                        String str30 = Util.DEVICE_DEBUG_INFO;
                                        Locale locale6 = Locale.US;
                                        objArr = spans;
                                        format4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj2 instanceof HorizontalTextInVerticalContextSpan) {
                                            format4 = "<span style='text-combine-upright:all;'>";
                                        } else if (obj2 instanceof AbsoluteSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((AbsoluteSizeSpan) obj2).getDip() ? r3.getSize() : r3.getSize() / f11)};
                                            String str31 = Util.DEVICE_DEBUG_INFO;
                                            format4 = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj2 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj2).getSizeChange() * 100.0f)};
                                            String str32 = Util.DEVICE_DEBUG_INFO;
                                            format4 = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else {
                                            if (obj2 instanceof TypefaceSpan) {
                                                String family = ((TypefaceSpan) obj2).getFamily();
                                                if (family != null) {
                                                    String str33 = Util.DEVICE_DEBUG_INFO;
                                                    Locale locale7 = Locale.US;
                                                    format4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("<span style='font-family:\"", family, "\";'>");
                                                }
                                                i7 = length2;
                                                i8 = i24;
                                                format4 = null;
                                            } else if (obj2 instanceof StyleSpan) {
                                                int style = ((StyleSpan) obj2).getStyle();
                                                if (style == 1) {
                                                    format4 = "<b>";
                                                } else if (style != 2) {
                                                    if (style == 3) {
                                                        format4 = "<b><i>";
                                                    }
                                                    i7 = length2;
                                                    i8 = i24;
                                                    format4 = null;
                                                } else {
                                                    format4 = "<i>";
                                                }
                                            } else if (obj2 instanceof RubySpan) {
                                                int i25 = ((RubySpan) obj2).position;
                                                if (i25 == -1) {
                                                    format4 = "<ruby style='ruby-position:unset;'>";
                                                } else if (i25 != 1) {
                                                    if (i25 == 2) {
                                                        format4 = "<ruby style='ruby-position:under;'>";
                                                    }
                                                    i7 = length2;
                                                    i8 = i24;
                                                    format4 = null;
                                                } else {
                                                    format4 = "<ruby style='ruby-position:over;'>";
                                                }
                                            } else if (obj2 instanceof UnderlineSpan) {
                                                format4 = "<u>";
                                            } else {
                                                if (obj2 instanceof TextEmphasisSpan) {
                                                    TextEmphasisSpan textEmphasisSpan = (TextEmphasisSpan) obj2;
                                                    int i26 = textEmphasisSpan.markShape;
                                                    int i27 = textEmphasisSpan.markFill;
                                                    i7 = length2;
                                                    StringBuilder sb3 = new StringBuilder();
                                                    i8 = i24;
                                                    if (i27 != 1) {
                                                        i9 = 2;
                                                        if (i27 == 2) {
                                                            sb3.append("open ");
                                                        }
                                                    } else {
                                                        i9 = 2;
                                                        sb3.append("filled ");
                                                    }
                                                    if (i26 == 0) {
                                                        sb3.append("none");
                                                    } else if (i26 == 1) {
                                                        sb3.append("circle");
                                                    } else if (i26 == i9) {
                                                        sb3.append("dot");
                                                    } else if (i26 != 3) {
                                                        sb3.append("unset");
                                                    } else {
                                                        sb3.append("sesame");
                                                    }
                                                    Object[] objArr6 = {sb3.toString(), textEmphasisSpan.position != 2 ? "over right" : "under left"};
                                                    String str34 = Util.DEVICE_DEBUG_INFO;
                                                    format4 = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                                }
                                                i7 = length2;
                                                i8 = i24;
                                                format4 = null;
                                            }
                                            if (!z || (obj2 instanceof ForegroundColorSpan) || (obj2 instanceof BackgroundColorSpan) || (obj2 instanceof HorizontalTextInVerticalContextSpan) || (obj2 instanceof AbsoluteSizeSpan) || (obj2 instanceof RelativeSizeSpan) || (obj2 instanceof TextEmphasisSpan)) {
                                                str12 = "</span>";
                                            } else if (obj2 instanceof TypefaceSpan) {
                                                str12 = ((TypefaceSpan) obj2).getFamily() != null ? "</span>" : null;
                                            } else {
                                                if (obj2 instanceof StyleSpan) {
                                                    int style2 = ((StyleSpan) obj2).getStyle();
                                                    if (style2 == 1) {
                                                        str28 = "</b>";
                                                    } else if (style2 == 2) {
                                                        str28 = "</i>";
                                                    } else if (style2 == 3) {
                                                        str28 = "</i></b>";
                                                    }
                                                } else if (obj2 instanceof RubySpan) {
                                                    str28 = "<rt>" + SpannedToHtmlConverter.escapeHtml(((RubySpan) obj2).rubyText) + "</rt></ruby>";
                                                } else if (obj2 instanceof UnderlineSpan) {
                                                    str28 = "</u>";
                                                }
                                                str12 = str28;
                                            }
                                            int spanStart = spanned.getSpanStart(obj2);
                                            int spanEnd = spanned.getSpanEnd(obj2);
                                            if (format4 != null) {
                                                str12.getClass();
                                                SpannedToHtmlConverter.SpanInfo spanInfo = new SpannedToHtmlConverter.SpanInfo(format4, spanStart, spanEnd, str12);
                                                SpannedToHtmlConverter.Transition transition = (SpannedToHtmlConverter.Transition) sparseArray.get(spanStart);
                                                if (transition == null) {
                                                    transition = new SpannedToHtmlConverter.Transition();
                                                    sparseArray.put(spanStart, transition);
                                                }
                                                transition.spansAdded.add(spanInfo);
                                                SpannedToHtmlConverter.Transition transition2 = (SpannedToHtmlConverter.Transition) sparseArray.get(spanEnd);
                                                if (transition2 == null) {
                                                    transition2 = new SpannedToHtmlConverter.Transition();
                                                    sparseArray.put(spanEnd, transition2);
                                                }
                                                transition2.spansRemoved.add(spanInfo);
                                            }
                                            i24 = i8 + 1;
                                            str22 = str27;
                                            str21 = str11;
                                            spans = objArr;
                                            length2 = i7;
                                        }
                                    }
                                    i7 = length2;
                                    i8 = i24;
                                    if (z) {
                                    }
                                    str12 = "</span>";
                                    int spanStart2 = spanned.getSpanStart(obj2);
                                    int spanEnd2 = spanned.getSpanEnd(obj2);
                                    if (format4 != null) {
                                    }
                                    i24 = i8 + 1;
                                    str22 = str27;
                                    str21 = str11;
                                    spans = objArr;
                                    length2 = i7;
                                }
                            }
                            objArr = spans;
                            i7 = length2;
                            i8 = i24;
                            if (z) {
                            }
                            str12 = "</span>";
                            int spanStart22 = spanned.getSpanStart(obj2);
                            int spanEnd22 = spanned.getSpanEnd(obj2);
                            if (format4 != null) {
                            }
                            i24 = i8 + 1;
                            str22 = str27;
                            str21 = str11;
                            spans = objArr;
                            length2 = i7;
                        }
                        str9 = str22;
                        str10 = str21;
                        StringBuilder sb4 = new StringBuilder(spanned.length());
                        int i28 = 0;
                        int i29 = 0;
                        while (i28 < sparseArray.size()) {
                            int keyAt = sparseArray.keyAt(i28);
                            sb4.append(SpannedToHtmlConverter.escapeHtml(spanned.subSequence(i29, keyAt)));
                            SpannedToHtmlConverter.Transition transition3 = (SpannedToHtmlConverter.Transition) sparseArray.get(keyAt);
                            ArrayList arrayList = transition3.spansRemoved;
                            ArrayList arrayList2 = transition3.spansAdded;
                            int i30 = i28;
                            Collections.sort(arrayList, SpannedToHtmlConverter.SpanInfo.FOR_CLOSING_TAGS);
                            Iterator it3 = transition3.spansRemoved.iterator();
                            while (it3.hasNext()) {
                                sb4.append(((SpannedToHtmlConverter.SpanInfo) it3.next()).closingTag);
                            }
                            Collections.sort(arrayList2, SpannedToHtmlConverter.SpanInfo.FOR_OPENING_TAGS);
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                sb4.append(((SpannedToHtmlConverter.SpanInfo) it4.next()).openingTag);
                            }
                            i28 = i30 + 1;
                            i29 = keyAt;
                        }
                        sb4.append(SpannedToHtmlConverter.escapeHtml(spanned.subSequence(i29, spanned.length())));
                        jvmRuntime = new Platform.JvmRuntime(sb4.toString(), 1, (byte) 0);
                        String str35 = jvmRuntime.vendorVersion;
                        for (String str36 : hashMap.keySet()) {
                            String str37 = (String) hashMap.put(str36, (String) hashMap.get(str36));
                            Trace.checkState(str37 == null || str37.equals(hashMap.get(str36)));
                        }
                        Integer valueOf2 = Integer.valueOf(i22);
                        Float valueOf3 = Float.valueOf(f2);
                        Integer valueOf4 = Integer.valueOf(i21);
                        Integer valueOf5 = Integer.valueOf(i18);
                        f3 = cue.shearDegrees;
                        if (f3 != RecyclerView.DECELERATION_RATE) {
                            Object[] objArr7 = {(i16 == 2 || i16 == 1) ? "skewY" : "skewX", Float.valueOf(f3)};
                            String str38 = Util.DEVICE_DEBUG_INFO;
                            str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                            num = valueOf2;
                            num2 = valueOf4;
                            str14 = str6;
                            f4 = valueOf3;
                        } else {
                            str13 = str7;
                            num = valueOf2;
                            str14 = str6;
                            f4 = valueOf3;
                            num2 = valueOf4;
                        }
                        sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", num, str14, f4, str4, str, obj, format5, str2, str24, convertTextSizeToCss2, cssRgba6, num2, valueOf5, str13));
                        sb.append("<span class='default_bg'>");
                        alignment2 = cue.multiRowAlignment;
                        if (alignment2 != null) {
                            int i31 = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment2.ordinal()];
                            if (i31 != 1) {
                                i10 = 2;
                                str15 = i31 != 2 ? "center" : str8;
                            } else {
                                i10 = 2;
                                str15 = str5;
                            }
                            sb.append("<span style='display:inline-block; text-align:" + str15 + ";'>");
                            sb.append(str35);
                            sb.append("</span>");
                        } else {
                            i10 = 2;
                            sb.append(str35);
                        }
                        sb.append("</span></div>");
                        i15 = i22 + 1;
                        i13 = i10;
                        f5 = f8;
                        str22 = str9;
                        str21 = str10;
                        i14 = 1;
                    } else {
                        str7 = "";
                        str9 = str22;
                        str10 = str21;
                        jvmRuntime = new Platform.JvmRuntime(SpannedToHtmlConverter.escapeHtml(charSequence), 1, (byte) 0);
                    }
                }
                f2 = f7;
                str8 = "end";
                String str352 = jvmRuntime.vendorVersion;
                while (r5.hasNext()) {
                }
                Integer valueOf22 = Integer.valueOf(i22);
                Float valueOf32 = Float.valueOf(f2);
                Integer valueOf42 = Integer.valueOf(i21);
                Integer valueOf52 = Integer.valueOf(i18);
                f3 = cue.shearDegrees;
                if (f3 != RecyclerView.DECELERATION_RATE) {
                }
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", num, str14, f4, str4, str, obj, format5, str2, str24, convertTextSizeToCss2, cssRgba6, num2, valueOf52, str13));
                sb.append("<span class='default_bg'>");
                alignment2 = cue.multiRowAlignment;
                if (alignment2 != null) {
                }
                sb.append("</span></div>");
                i15 = i22 + 1;
                i13 = i10;
                f5 = f8;
                str22 = str9;
                str21 = str10;
                i14 = 1;
            }
            str = format3;
            i2 = 0;
            float f102 = cue.size;
            String format52 = f102 == f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f102 * 100.0f)) : "fit-content";
            alignment = cue.textAlignment;
            String str232 = "end";
            if (alignment != null) {
            }
            String str242 = i16 == i4 ? i16 != i3 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String convertTextSizeToCss22 = convertTextSizeToCss(cue.textSize, cue.textSizeType);
            String cssRgba62 = HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : this.style.windowColor);
            String str252 = "right";
            str3 = "top";
            i5 = i;
            if (i16 == 1) {
            }
            if (i16 != 2) {
            }
            obj = "height";
            i6 = i18;
            i18 = i5;
            charSequence = cue.text;
            float f112 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = SpannedToHtmlConverter.NEWLINE_PATTERN;
            int i212 = i6;
            int i222 = i15;
            if (charSequence != null) {
            }
            f2 = f7;
            str8 = "end";
            String str3522 = jvmRuntime.vendorVersion;
            while (r5.hasNext()) {
            }
            Integer valueOf222 = Integer.valueOf(i222);
            Float valueOf322 = Float.valueOf(f2);
            Integer valueOf422 = Integer.valueOf(i212);
            Integer valueOf522 = Integer.valueOf(i18);
            f3 = cue.shearDegrees;
            if (f3 != RecyclerView.DECELERATION_RATE) {
            }
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", num, str14, f4, str4, str, obj, format52, str2, str242, convertTextSizeToCss22, cssRgba62, num2, valueOf522, str13));
            sb.append("<span class='default_bg'>");
            alignment2 = cue.multiRowAlignment;
            if (alignment2 != null) {
            }
            sb.append("</span></div>");
            i15 = i222 + 1;
            i13 = i10;
            f5 = f8;
            str22 = str9;
            str21 = str10;
            i14 = 1;
        }
        sb.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str39 : hashMap.keySet()) {
            sb5.append(str39);
            sb5.append("{");
            sb5.append((String) hashMap.get(str39));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, (CharSequence) sb5);
        this.webView.loadData(Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }
}
