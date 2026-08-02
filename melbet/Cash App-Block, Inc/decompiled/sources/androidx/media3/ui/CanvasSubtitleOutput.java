package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.SubtitleView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CanvasSubtitleOutput extends View implements SubtitleView.Output {
    public float bottomPaddingFraction;
    public List cues;
    public final ArrayList painters;
    public CaptionStyleCompat style;
    public float textSize;
    public int textSizeType;

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.cues = Collections.EMPTY_LIST;
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03a1  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [com.google.common.base.Splitter] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.google.common.base.Splitter] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        boolean z;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List splitToList;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        BidiFormatter bidiFormatter;
        int i9;
        int i10;
        int i11;
        int i12;
        float f2;
        int i13;
        float f3;
        int i14;
        TextPaint textPaint;
        int i15;
        int i16;
        int i17;
        int i18;
        CanvasSubtitleOutput canvasSubtitleOutput = this;
        Canvas canvas2 = canvas;
        List list = canvasSubtitleOutput.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = canvasSubtitleOutput.getHeight();
        int paddingLeft = canvasSubtitleOutput.getPaddingLeft();
        int paddingTop = canvasSubtitleOutput.getPaddingTop();
        int width = canvasSubtitleOutput.getWidth() - canvasSubtitleOutput.getPaddingRight();
        int paddingBottom = height - canvasSubtitleOutput.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i19 = paddingBottom - paddingTop;
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(canvasSubtitleOutput.textSize, canvasSubtitleOutput.textSizeType, height, i19);
        float f4 = RecyclerView.DECELERATION_RATE;
        if (resolveTextSize <= RecyclerView.DECELERATION_RATE) {
            return;
        }
        int size = list.size();
        int i20 = 0;
        while (i20 < size) {
            Cue cue = (Cue) list.get(i20);
            float f5 = f4;
            if (cue.verticalType != Integer.MIN_VALUE) {
                Cue.Builder buildUpon = cue.buildUpon();
                buildUpon.position = -3.4028235E38f;
                buildUpon.positionAnchor = PKIFailureInfo.systemUnavail;
                buildUpon.textAlignment = null;
                int i21 = cue.lineType;
                float f6 = cue.line;
                if (i21 == 0) {
                    buildUpon.line = 1.0f - f6;
                    i18 = 0;
                    buildUpon.lineType = 0;
                } else {
                    i18 = 0;
                    buildUpon.line = (-f6) - 1.0f;
                    buildUpon.lineType = 1;
                }
                int i22 = cue.lineAnchor;
                if (i22 == 0) {
                    buildUpon.lineAnchor = 2;
                } else if (i22 == 2) {
                    buildUpon.lineAnchor = i18;
                }
                cue = buildUpon.build();
            }
            float resolveTextSize2 = SubtitleViewUtils.resolveTextSize(cue.textSize, cue.textSizeType, height, i19);
            SubtitlePainter subtitlePainter = (SubtitlePainter) canvasSubtitleOutput.painters.get(i20);
            CaptionStyleCompat captionStyleCompat = canvasSubtitleOutput.style;
            List list2 = list;
            float f7 = canvasSubtitleOutput.bottomPaddingFraction;
            TextPaint textPaint2 = subtitlePainter.textPaint;
            int i23 = height;
            Bitmap bitmap = cue.bitmap;
            int i24 = i19;
            float f8 = cue.bitmapHeight;
            int i25 = size;
            float f9 = cue.size;
            int i26 = i20;
            int i27 = cue.positionAnchor;
            float f10 = cue.position;
            int i28 = cue.lineAnchor;
            float f11 = resolveTextSize;
            int i29 = cue.lineType;
            float f12 = cue.line;
            Layout.Alignment alignment = cue.textAlignment;
            ?? r11 = cue.text;
            boolean z2 = bitmap == null;
            if (z2) {
                if (!TextUtils.isEmpty(r11)) {
                    f = f10;
                    i = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
                }
                i12 = paddingLeft;
                i10 = paddingTop;
                i11 = paddingBottom;
                i20 = i26 + 1;
                canvasSubtitleOutput = this;
                paddingTop = i10;
                paddingBottom = i11;
                f4 = f5;
                list = list2;
                height = i23;
                i19 = i24;
                size = i25;
                resolveTextSize = f11;
                paddingLeft = i12;
            } else {
                f = f10;
                i = -16777216;
            }
            ?? r14 = subtitlePainter.cueText;
            if ((r14 == r11 || (r14 != 0 && r14.equals(r11))) && Objects.equals(subtitlePainter.cueTextAlignment, alignment) && subtitlePainter.cueBitmap == bitmap && subtitlePainter.cueLine == f12 && subtitlePainter.cueLineType == i29) {
                i2 = i28;
                if (Integer.valueOf(subtitlePainter.cueLineAnchor).equals(Integer.valueOf(i2)) && subtitlePainter.cuePosition == f && Integer.valueOf(subtitlePainter.cuePositionAnchor).equals(Integer.valueOf(i27)) && subtitlePainter.cueSize == f9 && subtitlePainter.cueBitmapHeight == f8 && subtitlePainter.foregroundColor == captionStyleCompat.foregroundColor && subtitlePainter.backgroundColor == captionStyleCompat.backgroundColor && subtitlePainter.windowColor == i && subtitlePainter.edgeType == captionStyleCompat.edgeType && subtitlePainter.edgeColor == captionStyleCompat.edgeColor && Objects.equals(textPaint2.getTypeface(), captionStyleCompat.typeface) && subtitlePainter.defaultTextSizePx == f11 && subtitlePainter.cueTextSizePx == resolveTextSize2 && subtitlePainter.bottomPaddingFraction == f7 && subtitlePainter.parentLeft == paddingLeft && subtitlePainter.parentTop == paddingTop && subtitlePainter.parentRight == width && subtitlePainter.parentBottom == paddingBottom) {
                    subtitlePainter.drawLayout(canvas2, z2);
                    i12 = paddingLeft;
                    i10 = paddingTop;
                    i11 = paddingBottom;
                    i20 = i26 + 1;
                    canvasSubtitleOutput = this;
                    paddingTop = i10;
                    paddingBottom = i11;
                    f4 = f5;
                    list = list2;
                    height = i23;
                    i19 = i24;
                    size = i25;
                    resolveTextSize = f11;
                    paddingLeft = i12;
                }
            } else {
                i2 = i28;
            }
            Splitter splitter = BidiUtils.LF_SPLITTER;
            if (r11 != 0) {
                int length = r11.length();
                int i30 = 0;
                while (i30 < length) {
                    int codePointAt = Character.codePointAt((CharSequence) r11, i30);
                    int i31 = length;
                    byte directionality = Character.getDirectionality(codePointAt);
                    int i32 = i30;
                    if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                        BidiFormatter bidiFormatter2 = BidiFormatter.getInstance();
                        if (r11 instanceof Spanned) {
                            spanned = (Spanned) r11;
                            z = z2;
                            i3 = paddingBottom;
                            Object[] spans = spanned.getSpans(0, r11.length(), Object.class);
                            int[] iArr3 = new int[spans.length];
                            iArr = new int[spans.length];
                            Arrays.fill(iArr3, -1);
                            Arrays.fill(iArr, -1);
                            objArr = spans;
                            iArr2 = iArr3;
                        } else {
                            i3 = paddingBottom;
                            z = z2;
                            objArr = null;
                            iArr = null;
                            spanned = null;
                            iArr2 = null;
                        }
                        int[] iArr4 = iArr;
                        if (r11.toString().contains("\r\n")) {
                            splitToList = BidiUtils.CRLF_SPLITTER.splitToList(r11);
                            i4 = 2;
                        } else {
                            splitToList = BidiUtils.LF_SPLITTER.splitToList(r11);
                            i4 = 1;
                        }
                        List<String> list3 = splitToList;
                        ArrayList arrayList = new ArrayList(list3.size());
                        int i33 = 0;
                        int i34 = 0;
                        for (String str : list3) {
                            int i35 = width;
                            int i36 = paddingTop;
                            String unicodeWrap = bidiFormatter2.unicodeWrap(str, TextDirectionHeuristics.LTR);
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int length2 = unicodeWrap.length() - str.length();
                                if (length2 > 0) {
                                    i34++;
                                }
                                i8 = paddingLeft;
                                bidiFormatter = bidiFormatter2;
                                for (int i37 = 0; i37 < objArr.length; i37 = i9 + 1) {
                                    if (iArr2[i37] >= 0 || spanned.getSpanStart(objArr[i37]) < i33) {
                                        i9 = i37;
                                    } else {
                                        i9 = i37;
                                        if (spanned.getSpanStart(objArr[i37]) < str.length() + i33) {
                                            iArr2[i9] = i34;
                                        }
                                    }
                                    if (iArr4[i9] < 0 && spanned.getSpanEnd(objArr[i9]) - 1 >= i33 && spanned.getSpanEnd(objArr[i9]) - 1 < str.length() + i33) {
                                        iArr4[i9] = i34;
                                    }
                                }
                                int m = Boxes$$ExternalSyntheticOutline1.m(i4, i33, str);
                                if (length2 > 0) {
                                    i34++;
                                }
                                i33 = m;
                            } else {
                                i8 = paddingLeft;
                                bidiFormatter = bidiFormatter2;
                            }
                            arrayList.add(unicodeWrap);
                            paddingTop = i36;
                            width = i35;
                            bidiFormatter2 = bidiFormatter;
                            paddingLeft = i8;
                        }
                        i5 = paddingLeft;
                        i6 = paddingTop;
                        i7 = width;
                        Joiner joiner = BidiUtils.LF_JOINER;
                        joiner.getClass();
                        r11 = new SpannableStringBuilder(joiner.join(arrayList.iterator()));
                        if (objArr != null) {
                            spanned.getClass();
                            iArr2.getClass();
                            iArr4.getClass();
                            for (int i38 = 0; i38 < objArr.length; i38++) {
                                int spanStart = spanned.getSpanStart(objArr[i38]) + iArr2[i38];
                                int spanEnd = spanned.getSpanEnd(objArr[i38]) + iArr4[i38];
                                int spanFlags = spanned.getSpanFlags(objArr[i38]);
                                if (spanStart < 0 || spanStart >= r11.length() || spanEnd < 0 || spanEnd > r11.length()) {
                                    StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                                    m107m.append(r11.length());
                                    Log.w("BidiUtils", m107m.toString());
                                } else {
                                    r11.setSpan(objArr[i38], spanStart, spanEnd, spanFlags);
                                }
                            }
                        }
                        subtitlePainter.cueText = r11;
                        subtitlePainter.cueTextAlignment = alignment;
                        subtitlePainter.cueBitmap = bitmap;
                        subtitlePainter.cueLine = f12;
                        subtitlePainter.cueLineType = i29;
                        subtitlePainter.cueLineAnchor = i2;
                        subtitlePainter.cuePosition = f;
                        subtitlePainter.cuePositionAnchor = i27;
                        subtitlePainter.cueSize = f9;
                        subtitlePainter.cueBitmapHeight = f8;
                        subtitlePainter.foregroundColor = captionStyleCompat.foregroundColor;
                        subtitlePainter.backgroundColor = captionStyleCompat.backgroundColor;
                        subtitlePainter.windowColor = i;
                        subtitlePainter.edgeType = captionStyleCompat.edgeType;
                        subtitlePainter.edgeColor = captionStyleCompat.edgeColor;
                        textPaint2.setTypeface(captionStyleCompat.typeface);
                        subtitlePainter.defaultTextSizePx = f11;
                        subtitlePainter.cueTextSizePx = resolveTextSize2;
                        subtitlePainter.bottomPaddingFraction = f7;
                        int i39 = i5;
                        subtitlePainter.parentLeft = i39;
                        i10 = i6;
                        subtitlePainter.parentTop = i10;
                        width = i7;
                        subtitlePainter.parentRight = width;
                        i11 = i3;
                        subtitlePainter.parentBottom = i11;
                        if (z) {
                            f11 = f11;
                            i12 = i39;
                            subtitlePainter.cueBitmap.getClass();
                            Bitmap bitmap2 = subtitlePainter.cueBitmap;
                            int i40 = subtitlePainter.parentRight;
                            int i41 = subtitlePainter.parentLeft;
                            int i42 = subtitlePainter.parentBottom;
                            int i43 = subtitlePainter.parentTop;
                            float f13 = i40 - i41;
                            float f14 = (subtitlePainter.cuePosition * f13) + i41;
                            float f15 = i42 - i43;
                            float f16 = (subtitlePainter.cueLine * f15) + i43;
                            int round = Math.round(f13 * subtitlePainter.cueSize);
                            float f17 = subtitlePainter.cueBitmapHeight;
                            int round2 = f17 != -3.4028235E38f ? Math.round(f15 * f17) : Recorder$$ExternalSyntheticOutline2.m(bitmap2.getHeight(), bitmap2.getWidth(), round);
                            int i44 = subtitlePainter.cuePositionAnchor;
                            if (i44 == 2) {
                                f2 = round;
                            } else {
                                if (i44 == 1) {
                                    f2 = round / 2;
                                }
                                int round3 = Math.round(f14);
                                i13 = subtitlePainter.cueLineAnchor;
                                if (i13 != 2) {
                                    f3 = round2;
                                } else {
                                    if (i13 == 1) {
                                        f3 = round2 / 2;
                                    }
                                    int round4 = Math.round(f16);
                                    subtitlePainter.bitmapRect = new Rect(round3, round4, round + round3, round2 + round4);
                                }
                                f16 -= f3;
                                int round42 = Math.round(f16);
                                subtitlePainter.bitmapRect = new Rect(round3, round42, round + round3, round2 + round42);
                            }
                            f14 -= f2;
                            int round32 = Math.round(f14);
                            i13 = subtitlePainter.cueLineAnchor;
                            if (i13 != 2) {
                            }
                            f16 -= f3;
                            int round422 = Math.round(f16);
                            subtitlePainter.bitmapRect = new Rect(round32, round422, round + round32, round2 + round422);
                        } else {
                            subtitlePainter.cueText.getClass();
                            CharSequence charSequence = subtitlePainter.cueText;
                            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(subtitlePainter.cueText);
                            int i45 = subtitlePainter.parentRight - subtitlePainter.parentLeft;
                            int i46 = subtitlePainter.parentBottom - subtitlePainter.parentTop;
                            textPaint2.setTextSize(subtitlePainter.defaultTextSizePx);
                            int i47 = (int) ((subtitlePainter.defaultTextSizePx * 0.125f) + 0.5f);
                            int i48 = i47 * 2;
                            int i49 = i45 - i48;
                            float f18 = subtitlePainter.cueSize;
                            if (f18 != -3.4028235E38f) {
                                i49 = (int) (i49 * f18);
                            }
                            int i50 = i49;
                            if (i50 <= 0) {
                                Log.w("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                                f11 = f11;
                                i12 = i39;
                            } else {
                                if (subtitlePainter.cueTextSizePx > f5) {
                                    f11 = f11;
                                    i14 = 0;
                                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) subtitlePainter.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
                                } else {
                                    f11 = f11;
                                    i14 = 0;
                                }
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                                if (subtitlePainter.edgeType == 1) {
                                    ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i14, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                                    int i51 = 0;
                                    for (int length3 = foregroundColorSpanArr.length; i51 < length3; length3 = length3) {
                                        spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i51]);
                                        i51++;
                                    }
                                }
                                if (Color.alpha(subtitlePainter.backgroundColor) > 0) {
                                    int i52 = subtitlePainter.edgeType;
                                    if (i52 == 0 || i52 == 2) {
                                        textPaint = textPaint2;
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(subtitlePainter.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
                                    } else {
                                        textPaint = textPaint2;
                                        spannableStringBuilder2.setSpan(new BackgroundColorSpan(subtitlePainter.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
                                    }
                                } else {
                                    textPaint = textPaint2;
                                }
                                Layout.Alignment alignment2 = subtitlePainter.cueTextAlignment;
                                if (alignment2 == null) {
                                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                                }
                                Layout.Alignment alignment3 = alignment2;
                                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i50, alignment3, subtitlePainter.spacingMult, subtitlePainter.spacingAdd, true);
                                subtitlePainter.textLayout = staticLayout;
                                int height2 = staticLayout.getHeight();
                                int lineCount = subtitlePainter.textLayout.getLineCount();
                                int i53 = 0;
                                int i54 = 0;
                                while (i53 < lineCount) {
                                    i54 = Math.max((int) Math.ceil(subtitlePainter.textLayout.getLineWidth(i53)), i54);
                                    i53++;
                                    height2 = height2;
                                    i39 = i39;
                                }
                                int i55 = height2;
                                i12 = i39;
                                int i56 = ((subtitlePainter.cueSize == -3.4028235E38f || i54 >= i50) ? i54 : i50) + i48;
                                float f19 = subtitlePainter.cuePosition;
                                if (f19 != -3.4028235E38f) {
                                    int round5 = Math.round(i45 * f19);
                                    int i57 = subtitlePainter.parentLeft;
                                    int i58 = round5 + i57;
                                    int i59 = subtitlePainter.cuePositionAnchor;
                                    if (i59 == 1) {
                                        i58 = ((i58 * 2) - i56) / 2;
                                    } else if (i59 == 2) {
                                        i58 -= i56;
                                    }
                                    i15 = Math.max(i58, i57);
                                    i16 = Math.min(i15 + i56, subtitlePainter.parentRight);
                                } else {
                                    i15 = subtitlePainter.parentLeft + ((i45 - i56) / 2);
                                    i16 = i15 + i56;
                                }
                                int i60 = i16 - i15;
                                if (i60 <= 0) {
                                    Log.w("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                                } else {
                                    float f20 = subtitlePainter.cueLine;
                                    if (f20 != -3.4028235E38f) {
                                        if (subtitlePainter.cueLineType == 0) {
                                            i17 = Math.round(i46 * f20) + subtitlePainter.parentTop;
                                            int i61 = subtitlePainter.cueLineAnchor;
                                            if (i61 == 2) {
                                                i17 -= i55;
                                            } else if (i61 == 1) {
                                                i17 = ((i17 * 2) - i55) / 2;
                                            }
                                        } else {
                                            int lineBottom = subtitlePainter.textLayout.getLineBottom(0) - subtitlePainter.textLayout.getLineTop(0);
                                            float f21 = subtitlePainter.cueLine;
                                            i17 = f21 >= f5 ? Math.round(f21 * lineBottom) + subtitlePainter.parentTop : (Math.round((f21 + 1.0f) * lineBottom) + subtitlePainter.parentBottom) - i55;
                                        }
                                        int i62 = i17 + i55;
                                        int i63 = subtitlePainter.parentBottom;
                                        if (i62 > i63) {
                                            i17 = i63 - i55;
                                        } else {
                                            int i64 = subtitlePainter.parentTop;
                                            if (i17 < i64) {
                                                i17 = i64;
                                            }
                                        }
                                    } else {
                                        i17 = (subtitlePainter.parentBottom - i55) - ((int) (i46 * subtitlePainter.bottomPaddingFraction));
                                    }
                                    subtitlePainter.textLayout = new StaticLayout(spannableStringBuilder3, textPaint, i60, alignment3, subtitlePainter.spacingMult, subtitlePainter.spacingAdd, true);
                                    subtitlePainter.edgeLayout = new StaticLayout(spannableStringBuilder2, textPaint, i60, alignment3, subtitlePainter.spacingMult, subtitlePainter.spacingAdd, true);
                                    subtitlePainter.textLeft = i15;
                                    subtitlePainter.textTop = i17;
                                    subtitlePainter.textPaddingX = i47;
                                }
                            }
                        }
                        canvas2 = canvas;
                        subtitlePainter.drawLayout(canvas2, z);
                        i20 = i26 + 1;
                        canvasSubtitleOutput = this;
                        paddingTop = i10;
                        paddingBottom = i11;
                        f4 = f5;
                        list = list2;
                        height = i23;
                        i19 = i24;
                        size = i25;
                        resolveTextSize = f11;
                        paddingLeft = i12;
                    } else {
                        i30 = Character.charCount(codePointAt) + i32;
                        length = i31;
                    }
                }
            }
            i5 = paddingLeft;
            i6 = paddingTop;
            i7 = width;
            i3 = paddingBottom;
            z = z2;
            subtitlePainter.cueText = r11;
            subtitlePainter.cueTextAlignment = alignment;
            subtitlePainter.cueBitmap = bitmap;
            subtitlePainter.cueLine = f12;
            subtitlePainter.cueLineType = i29;
            subtitlePainter.cueLineAnchor = i2;
            subtitlePainter.cuePosition = f;
            subtitlePainter.cuePositionAnchor = i27;
            subtitlePainter.cueSize = f9;
            subtitlePainter.cueBitmapHeight = f8;
            subtitlePainter.foregroundColor = captionStyleCompat.foregroundColor;
            subtitlePainter.backgroundColor = captionStyleCompat.backgroundColor;
            subtitlePainter.windowColor = i;
            subtitlePainter.edgeType = captionStyleCompat.edgeType;
            subtitlePainter.edgeColor = captionStyleCompat.edgeColor;
            textPaint2.setTypeface(captionStyleCompat.typeface);
            subtitlePainter.defaultTextSizePx = f11;
            subtitlePainter.cueTextSizePx = resolveTextSize2;
            subtitlePainter.bottomPaddingFraction = f7;
            int i392 = i5;
            subtitlePainter.parentLeft = i392;
            i10 = i6;
            subtitlePainter.parentTop = i10;
            width = i7;
            subtitlePainter.parentRight = width;
            i11 = i3;
            subtitlePainter.parentBottom = i11;
            if (z) {
            }
            canvas2 = canvas;
            subtitlePainter.drawLayout(canvas2, z);
            i20 = i26 + 1;
            canvasSubtitleOutput = this;
            paddingTop = i10;
            paddingBottom = i11;
            f4 = f5;
            list = list2;
            height = i23;
            i19 = i24;
            size = i25;
            resolveTextSize = f11;
            paddingLeft = i12;
        }
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public final void update(List list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f;
        this.textSizeType = i;
        this.bottomPaddingFraction = f2;
        while (true) {
            ArrayList arrayList = this.painters;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new SubtitlePainter(getContext()));
        }
    }

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }
}
