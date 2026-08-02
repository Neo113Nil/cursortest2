package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.StaticLayoutFactory;
import androidx.compose.ui.text.android.TextAndroidCanvas;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.media3.ui.PlayerView;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AndroidParagraph {
    public final CharSequence charSequence;
    public final long constraints;
    public final TextLayout layout;
    public final int maxLines;
    public final AndroidParagraphIntrinsics paragraphIntrinsics;
    public final List placeholderRects;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2, long j) {
        int i3;
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        CharSequence charSequence2;
        int i11;
        CharSequence charSequence3;
        char c;
        int i12;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        TextLayout constructTextLayout;
        int i13;
        int i14;
        int i15;
        AndroidParagraph androidParagraph;
        int i16;
        int i17;
        int i18;
        int i19;
        Layout layout;
        ShaderBrushSpan[] shaderBrushSpanArr;
        CharSequence charSequence4;
        List list;
        Rect rect;
        float secondaryHorizontal;
        int widthPx;
        float primaryHorizontal;
        int widthPx2;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float f;
        float lineBaseline2;
        int i20;
        int i21;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i;
        this.constraints = j;
        if (Constraints.m1026getMinHeightimpl(j) != 0 || Constraints.m1027getMinWidthimpl(j) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("maxLines should be greater than 0");
        }
        TextStyle textStyle = androidParagraphIntrinsics.style;
        CharSequence charSequence5 = androidParagraphIntrinsics.charSequence;
        if (i2 == 2) {
            i3 = 0;
            if (!TextUnit.m1057equalsimpl0(textStyle.spanStyle.letterSpacing, Room.getSp(0)) && !TextUnit.m1057equalsimpl0(textStyle.spanStyle.letterSpacing, TextUnit.Unspecified) && (i21 = textStyle.paragraphStyle.textAlign) != 0 && i21 != 5 && i21 != 4 && charSequence5.length() != 0) {
                Spannable spannable = charSequence5 instanceof Spannable ? (Spannable) charSequence5 : null;
                spannable = spannable == null ? new SpannableString(charSequence5) : spannable;
                if (!StaticLayoutFactory.hasSpan(spannable, IndentationFixSpan.class)) {
                    spannable.setSpan(new IndentationFixSpan(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence5 = spannable;
            }
        } else {
            i3 = 0;
        }
        this.charSequence = charSequence5;
        ParagraphStyle paragraphStyle = textStyle.paragraphStyle;
        int i22 = paragraphStyle.textAlign;
        if (i22 == 1) {
            charSequence = charSequence5;
            i4 = 3;
        } else if (i22 == 2) {
            charSequence = charSequence5;
            i4 = 4;
        } else if (i22 == 3) {
            charSequence = charSequence5;
            i4 = 2;
        } else if (i22 != 5 && i22 == 6) {
            charSequence = charSequence5;
            i4 = 1;
        } else {
            charSequence = charSequence5;
            i4 = i3;
        }
        int i23 = i22 == 4 ? 1 : i3;
        int i24 = paragraphStyle.hyphens == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i25 = paragraphStyle.lineBreak;
        int i26 = LineBreak.Simple;
        int i27 = i25 & 255;
        if (i27 != 1) {
            if (i27 == 2) {
                i5 = i23;
                i6 = 1;
            } else if (i27 == 3) {
                i5 = i23;
                i6 = 2;
            }
            i7 = (i25 >> 8) & 255;
            if (i7 != 1) {
                if (i7 == 2) {
                    i8 = 1;
                } else if (i7 == 3) {
                    i8 = 2;
                } else if (i7 == 4) {
                    i8 = 3;
                }
                i9 = (i25 >> 16) & 255;
                if (i9 == 1) {
                    i10 = 2;
                } else {
                    i10 = 2;
                    if (i9 == 2) {
                        charSequence2 = charSequence;
                        i11 = 1;
                        if (i2 != i10) {
                            charSequence3 = charSequence2;
                            c = ' ';
                            i12 = i24;
                            truncateAt = TextUtils.TruncateAt.END;
                        } else {
                            if (i2 == 5) {
                                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                            } else if (i2 == 4) {
                                truncateAt2 = TextUtils.TruncateAt.START;
                            } else {
                                charSequence3 = charSequence2;
                                c = ' ';
                                i12 = i24;
                                truncateAt = null;
                            }
                            charSequence3 = charSequence2;
                            c = ' ';
                            i12 = i24;
                            truncateAt = truncateAt2;
                        }
                        constructTextLayout = constructTextLayout(i4, i5, truncateAt, i, i12, i6, i8, i11, charSequence3);
                        CharSequence charSequence6 = charSequence3;
                        i13 = i12;
                        Layout layout2 = constructTextLayout.layout;
                        i14 = i4;
                        if (Build.VERSION.SDK_INT < 35 || androidParagraphIntrinsics.textPaint.getLetterSpacing() == RecyclerView.DECELERATION_RATE || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                            i15 = 2;
                            androidParagraph = this;
                            i16 = i;
                            i17 = i13;
                            i18 = i14;
                        } else {
                            int ellipsisStart = layout2.getEllipsisStart(0);
                            i15 = 2;
                            CharSequence concat = TextUtils.concat(charSequence6.subSequence(0, ellipsisStart), "…", charSequence6.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence6.length()));
                            i16 = i;
                            i17 = i13;
                            i18 = i14;
                            androidParagraph = this;
                            constructTextLayout = androidParagraph.constructTextLayout(i18, i5, truncateAt, i16, i17, i6, i8, i11, concat);
                        }
                        i19 = constructTextLayout.lineCount;
                        if (i2 == i15 && constructTextLayout.getHeight() > Constraints.m1024getMaxHeightimpl(j) && i16 > 1) {
                            int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
                            i20 = 0;
                            while (true) {
                                if (i20 < i19) {
                                    i20 = i19;
                                    break;
                                } else if (constructTextLayout.getLineBottom(i20) > m1024getMaxHeightimpl) {
                                    break;
                                } else {
                                    i20++;
                                }
                            }
                            if (i20 >= 0 && i20 != androidParagraph.maxLines) {
                                constructTextLayout = androidParagraph.constructTextLayout(i18, i5, truncateAt, i20 >= 1 ? 1 : i20, i17, i6, i8, i11, androidParagraph.charSequence);
                            }
                            androidParagraph.layout = constructTextLayout;
                            androidParagraph.paragraphIntrinsics.textPaint.m1004setBrush12SF9DM(textStyle.getBrush(), (Float.floatToRawIntBits(androidParagraph.getHeight()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << c), textStyle.spanStyle.textForegroundStyle.getAlpha());
                            layout = androidParagraph.layout.layout;
                            if (layout.getText() instanceof Spanned) {
                                CharSequence text = layout.getText();
                                text.getClass();
                                Spanned spanned = (Spanned) text;
                                if (spanned.nextSpanTransition(-1, spanned.length(), ShaderBrushSpan.class) != spanned.length()) {
                                    CharSequence text2 = layout.getText();
                                    text2.getClass();
                                    shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, layout.getText().length(), ShaderBrushSpan.class);
                                    if (shaderBrushSpanArr != null) {
                                        for (ShaderBrushSpan shaderBrushSpan : shaderBrushSpanArr) {
                                            shaderBrushSpan.size$delegate.setValue(new Size((Float.floatToRawIntBits(androidParagraph.getHeight()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << c)));
                                        }
                                    }
                                    charSequence4 = androidParagraph.charSequence;
                                    if (charSequence4 instanceof Spanned) {
                                        Spanned spanned2 = (Spanned) charSequence4;
                                        Object[] spans = spanned2.getSpans(0, charSequence4.length(), PlaceholderSpan.class);
                                        ArrayList arrayList = new ArrayList(spans.length);
                                        for (Object obj : spans) {
                                            PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                                            int spanStart = spanned2.getSpanStart(placeholderSpan);
                                            int spanEnd = spanned2.getSpanEnd(placeholderSpan);
                                            int lineForOffset = androidParagraph.layout.layout.getLineForOffset(spanStart);
                                            boolean z = lineForOffset >= androidParagraph.maxLines;
                                            boolean z2 = androidParagraph.layout.layout.getEllipsisCount(lineForOffset) > 0 && spanEnd > androidParagraph.layout.layout.getEllipsisStart(lineForOffset) + androidParagraph.layout.layout.getLineStart(lineForOffset);
                                            boolean z3 = spanEnd > androidParagraph.layout.getLineEnd(lineForOffset);
                                            if (z2 || z3 || z) {
                                                rect = null;
                                            } else {
                                                boolean z4 = androidParagraph.layout.layout.getParagraphDirection(lineForOffset) == 1;
                                                boolean isRtlCharAt = androidParagraph.layout.layout.isRtlCharAt(spanStart);
                                                if (!z4 || isRtlCharAt) {
                                                    if (z4 && isRtlCharAt) {
                                                        primaryHorizontal = androidParagraph.layout.getSecondaryHorizontal(spanStart, false);
                                                        widthPx2 = placeholderSpan.getWidthPx();
                                                    } else {
                                                        TextLayout textLayout = androidParagraph.layout;
                                                        if (isRtlCharAt) {
                                                            primaryHorizontal = textLayout.getPrimaryHorizontal(spanStart, false);
                                                            widthPx2 = placeholderSpan.getWidthPx();
                                                        } else {
                                                            secondaryHorizontal = textLayout.getSecondaryHorizontal(spanStart, false);
                                                            widthPx = placeholderSpan.getWidthPx();
                                                        }
                                                    }
                                                    secondaryHorizontal = primaryHorizontal - widthPx2;
                                                    TextLayout textLayout2 = androidParagraph.layout;
                                                    switch (placeholderSpan.verticalAlign) {
                                                        case 0:
                                                            lineBaseline = textLayout2.getLineBaseline(lineForOffset);
                                                            heightPx = placeholderSpan.getHeightPx();
                                                            lineTop = lineBaseline - heightPx;
                                                            rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                                            break;
                                                        case 1:
                                                            lineTop = textLayout2.getLineTop(lineForOffset);
                                                            rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                                            break;
                                                        case 2:
                                                            lineBaseline = textLayout2.getLineBottom(lineForOffset);
                                                            heightPx = placeholderSpan.getHeightPx();
                                                            lineTop = lineBaseline - heightPx;
                                                            rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                                            break;
                                                        case 3:
                                                            lineTop = ((textLayout2.getLineBottom(lineForOffset) + textLayout2.getLineTop(lineForOffset)) - placeholderSpan.getHeightPx()) / 2.0f;
                                                            rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                                            break;
                                                        case 4:
                                                            f = placeholderSpan.getFontMetrics().ascent;
                                                            lineBaseline2 = textLayout2.getLineBaseline(lineForOffset);
                                                            lineTop = lineBaseline2 + f;
                                                            rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                                            break;
                                                        case 5:
                                                            lineBaseline = textLayout2.getLineBaseline(lineForOffset) + placeholderSpan.getFontMetrics().descent;
                                                            heightPx = placeholderSpan.getHeightPx();
                                                            lineTop = lineBaseline - heightPx;
                                                            rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                                            break;
                                                        case 6:
                                                            Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                                            f = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                                            lineBaseline2 = textLayout2.getLineBaseline(lineForOffset);
                                                            lineTop = lineBaseline2 + f;
                                                            rect = new Rect(secondaryHorizontal, lineTop, primaryHorizontal, placeholderSpan.getHeightPx() + lineTop);
                                                            break;
                                                        default:
                                                            a$$ExternalSyntheticBUOutline0.m$1("unexpected verticalAlignment");
                                                            throw null;
                                                    }
                                                } else {
                                                    secondaryHorizontal = androidParagraph.layout.getPrimaryHorizontal(spanStart, false);
                                                    widthPx = placeholderSpan.getWidthPx();
                                                }
                                                primaryHorizontal = widthPx + secondaryHorizontal;
                                                TextLayout textLayout22 = androidParagraph.layout;
                                                switch (placeholderSpan.verticalAlign) {
                                                }
                                            }
                                            arrayList.add(rect);
                                        }
                                        list = arrayList;
                                    } else {
                                        list = EmptyList.INSTANCE;
                                    }
                                    androidParagraph.placeholderRects = list;
                                }
                            }
                            shaderBrushSpanArr = null;
                            if (shaderBrushSpanArr != null) {
                            }
                            charSequence4 = androidParagraph.charSequence;
                            if (charSequence4 instanceof Spanned) {
                            }
                            androidParagraph.placeholderRects = list;
                        }
                        androidParagraph.layout = constructTextLayout;
                        androidParagraph.paragraphIntrinsics.textPaint.m1004setBrush12SF9DM(textStyle.getBrush(), (Float.floatToRawIntBits(androidParagraph.getHeight()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << c), textStyle.spanStyle.textForegroundStyle.getAlpha());
                        layout = androidParagraph.layout.layout;
                        if (layout.getText() instanceof Spanned) {
                        }
                        shaderBrushSpanArr = null;
                        if (shaderBrushSpanArr != null) {
                        }
                        charSequence4 = androidParagraph.charSequence;
                        if (charSequence4 instanceof Spanned) {
                        }
                        androidParagraph.placeholderRects = list;
                    }
                }
                charSequence2 = charSequence;
                i11 = i3;
                if (i2 != i10) {
                }
                constructTextLayout = constructTextLayout(i4, i5, truncateAt, i, i12, i6, i8, i11, charSequence3);
                CharSequence charSequence62 = charSequence3;
                i13 = i12;
                Layout layout22 = constructTextLayout.layout;
                i14 = i4;
                if (Build.VERSION.SDK_INT < 35) {
                }
                i15 = 2;
                androidParagraph = this;
                i16 = i;
                i17 = i13;
                i18 = i14;
                i19 = constructTextLayout.lineCount;
                if (i2 == i15) {
                    int m1024getMaxHeightimpl2 = Constraints.m1024getMaxHeightimpl(j);
                    i20 = 0;
                    while (true) {
                        if (i20 < i19) {
                        }
                        i20++;
                    }
                    if (i20 >= 0) {
                        constructTextLayout = androidParagraph.constructTextLayout(i18, i5, truncateAt, i20 >= 1 ? 1 : i20, i17, i6, i8, i11, androidParagraph.charSequence);
                    }
                    androidParagraph.layout = constructTextLayout;
                    androidParagraph.paragraphIntrinsics.textPaint.m1004setBrush12SF9DM(textStyle.getBrush(), (Float.floatToRawIntBits(androidParagraph.getHeight()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << c), textStyle.spanStyle.textForegroundStyle.getAlpha());
                    layout = androidParagraph.layout.layout;
                    if (layout.getText() instanceof Spanned) {
                    }
                    shaderBrushSpanArr = null;
                    if (shaderBrushSpanArr != null) {
                    }
                    charSequence4 = androidParagraph.charSequence;
                    if (charSequence4 instanceof Spanned) {
                    }
                    androidParagraph.placeholderRects = list;
                }
                androidParagraph.layout = constructTextLayout;
                androidParagraph.paragraphIntrinsics.textPaint.m1004setBrush12SF9DM(textStyle.getBrush(), (Float.floatToRawIntBits(androidParagraph.getHeight()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << c), textStyle.spanStyle.textForegroundStyle.getAlpha());
                layout = androidParagraph.layout.layout;
                if (layout.getText() instanceof Spanned) {
                }
                shaderBrushSpanArr = null;
                if (shaderBrushSpanArr != null) {
                }
                charSequence4 = androidParagraph.charSequence;
                if (charSequence4 instanceof Spanned) {
                }
                androidParagraph.placeholderRects = list;
            }
            i8 = i3;
            i9 = (i25 >> 16) & 255;
            if (i9 == 1) {
            }
            charSequence2 = charSequence;
            i11 = i3;
            if (i2 != i10) {
            }
            constructTextLayout = constructTextLayout(i4, i5, truncateAt, i, i12, i6, i8, i11, charSequence3);
            CharSequence charSequence622 = charSequence3;
            i13 = i12;
            Layout layout222 = constructTextLayout.layout;
            i14 = i4;
            if (Build.VERSION.SDK_INT < 35) {
            }
            i15 = 2;
            androidParagraph = this;
            i16 = i;
            i17 = i13;
            i18 = i14;
            i19 = constructTextLayout.lineCount;
            if (i2 == i15) {
            }
            androidParagraph.layout = constructTextLayout;
            androidParagraph.paragraphIntrinsics.textPaint.m1004setBrush12SF9DM(textStyle.getBrush(), (Float.floatToRawIntBits(androidParagraph.getHeight()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << c), textStyle.spanStyle.textForegroundStyle.getAlpha());
            layout = androidParagraph.layout.layout;
            if (layout.getText() instanceof Spanned) {
            }
            shaderBrushSpanArr = null;
            if (shaderBrushSpanArr != null) {
            }
            charSequence4 = androidParagraph.charSequence;
            if (charSequence4 instanceof Spanned) {
            }
            androidParagraph.placeholderRects = list;
        }
        i5 = i23;
        i6 = i3;
        i7 = (i25 >> 8) & 255;
        if (i7 != 1) {
        }
        i8 = i3;
        i9 = (i25 >> 16) & 255;
        if (i9 == 1) {
        }
        charSequence2 = charSequence;
        i11 = i3;
        if (i2 != i10) {
        }
        constructTextLayout = constructTextLayout(i4, i5, truncateAt, i, i12, i6, i8, i11, charSequence3);
        CharSequence charSequence6222 = charSequence3;
        i13 = i12;
        Layout layout2222 = constructTextLayout.layout;
        i14 = i4;
        if (Build.VERSION.SDK_INT < 35) {
        }
        i15 = 2;
        androidParagraph = this;
        i16 = i;
        i17 = i13;
        i18 = i14;
        i19 = constructTextLayout.lineCount;
        if (i2 == i15) {
        }
        androidParagraph.layout = constructTextLayout;
        androidParagraph.paragraphIntrinsics.textPaint.m1004setBrush12SF9DM(textStyle.getBrush(), (Float.floatToRawIntBits(androidParagraph.getHeight()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(androidParagraph.getWidth()) << c), textStyle.spanStyle.textForegroundStyle.getAlpha());
        layout = androidParagraph.layout.layout;
        if (layout.getText() instanceof Spanned) {
        }
        shaderBrushSpanArr = null;
        if (shaderBrushSpanArr != null) {
        }
        charSequence4 = androidParagraph.charSequence;
        if (charSequence4 instanceof Spanned) {
        }
        androidParagraph.placeholderRects = list;
    }

    public final TextLayout constructTextLayout(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        PlatformParagraphStyle platformParagraphStyle;
        float width = getWidth();
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.paragraphIntrinsics;
        AndroidTextPaint androidTextPaint = androidParagraphIntrinsics.textPaint;
        int i8 = androidParagraphIntrinsics.textDirectionHeuristic;
        LayoutIntrinsics layoutIntrinsics = androidParagraphIntrinsics.layoutIntrinsics;
        TextStyle textStyle = androidParagraphIntrinsics.style;
        AndroidParagraphHelper_androidKt$NoopSpan$1 androidParagraphHelper_androidKt$NoopSpan$1 = AndroidParagraphHelper_androidKt.NoopSpan;
        PlatformTextStyle platformTextStyle = textStyle.platformStyle;
        return new TextLayout(charSequence, width, androidTextPaint, i, truncateAt, i8, (platformTextStyle == null || (platformParagraphStyle = platformTextStyle.paragraphStyle) == null) ? false : platformParagraphStyle.includeFontPadding, i3, i5, i6, i7, i4, i2, layoutIntrinsics);
    }

    public final float getHeight() {
        return this.layout.getHeight();
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m957getRangeForRect86BmAI(Rect rect, int i, DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0) {
        int[] rangeForRect;
        RectF androidRectF = ColorKt.toAndroidRectF(rect);
        int i2 = (!TextPainterKt.m982equalsimpl0$1(i, 0) && TextPainterKt.m982equalsimpl0$1(i, 1)) ? 1 : 0;
        HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0 = new HintHandler$$ExternalSyntheticLambda0(differentialMotionFlingController$$ExternalSyntheticLambda0, 19);
        int i3 = Build.VERSION.SDK_INT;
        TextLayout textLayout = this.layout;
        if (i3 >= 34) {
            textLayout.getClass();
            rangeForRect = PlayerView.Api34.getRangeForRect$ui_text(textLayout, androidRectF, i2, hintHandler$$ExternalSyntheticLambda0);
        } else {
            rangeForRect = AnalyticsHelperKt.getRangeForRect(textLayout, textLayout.layout, textLayout.getLayoutHelper(), androidRectF, i2, hintHandler$$ExternalSyntheticLambda0);
        }
        return rangeForRect == null ? TextRange.Zero : SizeKt.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    public final float getWidth() {
        return Constraints.m1025getMaxWidthimpl(this.constraints);
    }

    public final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        TextLayout textLayout = this.layout;
        if (textLayout.didExceedMaxLines) {
            nativeCanvas.save();
            nativeCanvas.clipRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, getWidth(), getHeight());
        }
        int i = textLayout.topPadding;
        if (nativeCanvas.getClipBounds(textLayout.rect)) {
            if (i != 0) {
                nativeCanvas.translate(RecyclerView.DECELERATION_RATE, i);
            }
            ThreadLocal threadLocal = TextLayout_androidKt.SharedTextAndroidCanvas;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new TextAndroidCanvas();
                threadLocal.set(obj);
            }
            TextAndroidCanvas textAndroidCanvas = (TextAndroidCanvas) obj;
            textAndroidCanvas._nativeCanvas = nativeCanvas;
            try {
                textLayout.layout.draw(textAndroidCanvas);
                if (i != 0) {
                    nativeCanvas.translate(RecyclerView.DECELERATION_RATE, (-1.0f) * i);
                }
            } finally {
                textAndroidCanvas._nativeCanvas = null;
            }
        }
        if (textLayout.didExceedMaxLines) {
            nativeCanvas.restore();
        }
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m958paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        AndroidTextPaint androidTextPaint = this.paragraphIntrinsics.textPaint;
        int i2 = androidTextPaint.backingBlendMode;
        androidTextPaint.m1005setColor8_81llA(j);
        androidTextPaint.setShadow(shadow);
        androidTextPaint.setTextDecoration(textDecoration);
        androidTextPaint.setDrawStyle(drawStyle);
        androidTextPaint.m1003setBlendModes9anfk8(i);
        paint(canvas);
        androidTextPaint.m1003setBlendModes9anfk8(i2);
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m959painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        AndroidTextPaint androidTextPaint = this.paragraphIntrinsics.textPaint;
        int i = androidTextPaint.backingBlendMode;
        float width = getWidth();
        float height = getHeight();
        androidTextPaint.m1004setBrush12SF9DM(brush, (Float.floatToRawIntBits(height) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(width) << 32), f);
        androidTextPaint.setShadow(shadow);
        androidTextPaint.setTextDecoration(textDecoration);
        androidTextPaint.setDrawStyle(drawStyle);
        androidTextPaint.m1003setBlendModes9anfk8(3);
        paint(canvas);
        androidTextPaint.m1003setBlendModes9anfk8(i);
    }
}
