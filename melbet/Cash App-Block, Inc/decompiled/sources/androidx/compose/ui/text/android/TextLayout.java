package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.common.util.TimedValueQueue;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.ComponentRegistry;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahe;
import com.squareup.cash.payments.backend.api.OfflineManagerKt;
import java.util.ArrayList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextLayout {
    public ComponentRegistry.Builder backingLayoutHelper;
    public TimedValueQueue backingWordIterator;
    public final int bottomPadding;
    public final boolean didExceedMaxLines;
    public final TextUtils.TruncateAt ellipsize;
    public final boolean includePadding;
    public final boolean isBoringLayout;
    public final int lastLineExtra;
    public final Paint.FontMetricsInt lastLineFontMetrics;
    public final Layout layout;
    public final float leftPadding;
    public final int lineCount;
    public final LineHeightStyleSpan[] lineHeightSpans;
    public final Rect rect = new Rect();
    public final float rightPadding;
    public final TextPaint textPaint;
    public final int topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, LayoutIntrinsics layoutIntrinsics) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout create;
        LineHeightStyleSpan[] lineHeightStyleSpanArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        long VerticalPaddings;
        int i15;
        long j2;
        int i16;
        Layout layout;
        int i17;
        Paint.FontMetricsInt fontMetricsInt;
        Layout.Alignment alignment;
        LineHeightStyleSpan lineHeightStyleSpan;
        LineHeightStyleSpan lineHeightStyleSpan2;
        int i18;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayout_androidKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment2 = TextAlignmentAdapter.ALIGN_LEFT_FRAMEWORK;
        Layout.Alignment alignment3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : TextAlignmentAdapter.ALIGN_RIGHT_FRAMEWORK : TextAlignmentAdapter.ALIGN_LEFT_FRAMEWORK : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        boolean z3 = z2;
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f || z3) {
                this.isBoringLayout = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristic2;
                create = StaticLayoutFactory.create(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment3, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.isBoringLayout = true;
                if (ceil < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("negative width");
                }
                if (ceil < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("negative ellipsized width");
                }
                create = Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33$$ExternalSyntheticApiModelOutline0.m(charSequence, textPaint, ceil, alignment3, boringMetrics, z, truncateAt, ceil) : OfflineManagerKt.create(charSequence, textPaint, ceil, alignment3, boringMetrics, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristic2;
            }
            this.layout = create;
            Trace.endSection();
            int min = Math.min(create.getLineCount(), i9);
            this.lineCount = min;
            int i19 = min - 1;
            this.didExceedMaxLines = min >= i9 && (create.getEllipsisCount(i19) > 0 || create.getLineEnd(i19) != charSequence.length());
            if (create.getText() instanceof Spanned) {
                CharSequence text = create.getText();
                text.getClass();
                if (StaticLayoutFactory.hasSpan((Spanned) text, LineHeightStyleSpan.class) || create.getText().length() <= 0) {
                    CharSequence text2 = create.getText();
                    text2.getClass();
                    i10 = 0;
                    lineHeightStyleSpanArr = (LineHeightStyleSpan[]) ((Spanned) text2).getSpans(0, create.getText().length(), LineHeightStyleSpan.class);
                    this.lineHeightSpans = lineHeightStyleSpanArr;
                    if (lineHeightStyleSpanArr != null || (lineHeightStyleSpan2 = (LineHeightStyleSpan) ArraysKt___ArraysKt.firstOrNull(lineHeightStyleSpanArr)) == null) {
                        i11 = 2;
                        i12 = i10;
                    } else {
                        if (lineHeightStyleSpan2.trimFirstLineTop) {
                            i11 = 2;
                            if (lineHeightStyleSpan2.mode == 2) {
                                i18 = 1;
                                i12 = i18;
                            }
                        } else {
                            i11 = 2;
                        }
                        i18 = i10;
                        i12 = i18;
                    }
                    i13 = (lineHeightStyleSpanArr == null && (lineHeightStyleSpan = (LineHeightStyleSpan) ArraysKt___ArraysKt.firstOrNull(lineHeightStyleSpanArr)) != null && lineHeightStyleSpan.trimLastLineBottom && lineHeightStyleSpan.mode == i11) ? 1 : i10;
                    if (i12 != 0 || i13 == 0) {
                        long j3 = TextLayout_androidKt.ZeroVerticalPadding;
                        if (z) {
                            if (this.isBoringLayout) {
                                c = ' ';
                                i15 = Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.isFallbackLineSpacingEnabled((BoringLayout) create) : i10;
                            } else {
                                c = ' ';
                                i15 = Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.isFallbackLineSpacingEnabled((StaticLayout) create) : 1;
                            }
                            if (i15 == 0) {
                                TextPaint paint = create.getPaint();
                                CharSequence text3 = create.getText();
                                j = BodyPartID.bodyIdMax;
                                Rect charSequenceBounds = zzahe.getCharSequenceBounds(paint, text3, create.getLineStart(i10), create.getLineEnd(i10));
                                int lineAscent = create.getLineAscent(i10);
                                int i20 = charSequenceBounds.top;
                                int topPadding = i20 < lineAscent ? lineAscent - i20 : create.getTopPadding();
                                i14 = 1;
                                charSequenceBounds = min != 1 ? zzahe.getCharSequenceBounds(paint, text3, create.getLineStart(i19), create.getLineEnd(i19)) : charSequenceBounds;
                                int lineDescent = create.getLineDescent(i19);
                                int i21 = charSequenceBounds.bottom;
                                int bottomPadding = i21 > lineDescent ? i21 - lineDescent : create.getBottomPadding();
                                if (topPadding != 0 || bottomPadding != 0) {
                                    j3 = TextLayout_androidKt.VerticalPaddings(topPadding, bottomPadding);
                                }
                                VerticalPaddings = TextLayout_androidKt.VerticalPaddings(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j));
                            }
                        } else {
                            c = ' ';
                        }
                        j = BodyPartID.bodyIdMax;
                        i14 = 1;
                        VerticalPaddings = TextLayout_androidKt.VerticalPaddings(i12 != 0 ? i10 : (int) (j3 >> c), i13 != 0 ? i10 : (int) (j3 & j));
                    } else {
                        VerticalPaddings = TextLayout_androidKt.ZeroVerticalPadding;
                        c = ' ';
                        j = BodyPartID.bodyIdMax;
                        i14 = 1;
                    }
                    if (lineHeightStyleSpanArr == null) {
                        int length2 = lineHeightStyleSpanArr.length;
                        int i22 = i10;
                        int i23 = i22;
                        for (int i24 = i23; i24 < length2; i24++) {
                            LineHeightStyleSpan lineHeightStyleSpan3 = lineHeightStyleSpanArr[i24];
                            int i25 = lineHeightStyleSpan3.firstAscentDiff;
                            i22 = i25 < 0 ? Math.max(i22, Math.abs(i25)) : i22;
                            int i26 = lineHeightStyleSpan3.lastDescentDiff;
                            if (i26 < 0) {
                                i23 = Math.max(i22, Math.abs(i26));
                            }
                        }
                        j2 = (i22 == 0 && i23 == 0) ? TextLayout_androidKt.ZeroVerticalPadding : TextLayout_androidKt.VerticalPaddings(i22, i23);
                    } else {
                        j2 = TextLayout_androidKt.ZeroVerticalPadding;
                    }
                    this.topPadding = Math.max((int) (VerticalPaddings >> c), (int) (j2 >> c));
                    this.bottomPadding = Math.max((int) (VerticalPaddings & j), (int) (j2 & j));
                    TextPaint textPaint2 = this.textPaint;
                    LineHeightStyleSpan[] lineHeightStyleSpanArr2 = this.lineHeightSpans;
                    i16 = this.lineCount - i14;
                    layout = this.layout;
                    if (layout.getLineStart(i16) == layout.getLineEnd(i16) || lineHeightStyleSpanArr2 == null || lineHeightStyleSpanArr2.length == 0) {
                        i17 = i10;
                        fontMetricsInt = null;
                    } else {
                        SpannableString spannableString = new SpannableString("\u200b");
                        LineHeightStyleSpan lineHeightStyleSpan4 = (LineHeightStyleSpan) ArraysKt___ArraysKt.first(lineHeightStyleSpanArr2);
                        spannableString.setSpan(new LineHeightStyleSpan(lineHeightStyleSpan4.lineHeight, spannableString.length(), (i16 == 0 || !lineHeightStyleSpan4.trimLastLineBottom) ? lineHeightStyleSpan4.trimLastLineBottom : i10, lineHeightStyleSpan4.trimLastLineBottom, lineHeightStyleSpan4.topRatio, lineHeightStyleSpan4.mode), i10, spannableString.length(), 33);
                        i17 = i10;
                        int length3 = spannableString.length();
                        boolean z4 = this.includePadding;
                        alignment = LayoutCompat.DEFAULT_LAYOUT_ALIGNMENT;
                        StaticLayout create2 = StaticLayoutFactory.create(spannableString, textPaint2, Integer.MAX_VALUE, length3, textDirectionHeuristic, alignment, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, z4, 0, 0, 0, 0);
                        fontMetricsInt = new Paint.FontMetricsInt();
                        fontMetricsInt.ascent = create2.getLineAscent(i17);
                        fontMetricsInt.descent = create2.getLineDescent(i17);
                        fontMetricsInt.top = create2.getLineTop(i17);
                        fontMetricsInt.bottom = create2.getLineBottom(i17);
                    }
                    this.lastLineExtra = fontMetricsInt == null ? fontMetricsInt.bottom - ((int) (getLineBottom(i19) - getLineTop(i19))) : i17;
                    this.lastLineFontMetrics = fontMetricsInt;
                    Layout layout2 = this.layout;
                    this.leftPadding = PlatformKt.getEllipsizedLeftPadding(layout2, i19, layout2.getPaint());
                    Layout layout3 = this.layout;
                    this.rightPadding = PlatformKt.getEllipsizedRightPadding(layout3, i19, layout3.getPaint());
                }
            }
            lineHeightStyleSpanArr = null;
            i10 = 0;
            this.lineHeightSpans = lineHeightStyleSpanArr;
            if (lineHeightStyleSpanArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (lineHeightStyleSpanArr == null) {
            }
            if (i12 != 0) {
            }
            long j32 = TextLayout_androidKt.ZeroVerticalPadding;
            if (z) {
            }
            j = BodyPartID.bodyIdMax;
            i14 = 1;
            VerticalPaddings = TextLayout_androidKt.VerticalPaddings(i12 != 0 ? i10 : (int) (j32 >> c), i13 != 0 ? i10 : (int) (j32 & j));
            if (lineHeightStyleSpanArr == null) {
            }
            this.topPadding = Math.max((int) (VerticalPaddings >> c), (int) (j2 >> c));
            this.bottomPadding = Math.max((int) (VerticalPaddings & j), (int) (j2 & j));
            TextPaint textPaint22 = this.textPaint;
            LineHeightStyleSpan[] lineHeightStyleSpanArr22 = this.lineHeightSpans;
            i16 = this.lineCount - i14;
            layout = this.layout;
            if (layout.getLineStart(i16) == layout.getLineEnd(i16)) {
            }
            i17 = i10;
            fontMetricsInt = null;
            this.lastLineExtra = fontMetricsInt == null ? fontMetricsInt.bottom - ((int) (getLineBottom(i19) - getLineTop(i19))) : i17;
            this.lastLineFontMetrics = fontMetricsInt;
            Layout layout22 = this.layout;
            this.leftPadding = PlatformKt.getEllipsizedLeftPadding(layout22, i19, layout22.getPaint());
            Layout layout32 = this.layout;
            this.rightPadding = PlatformKt.getEllipsizedRightPadding(layout32, i19, layout32.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int getHeight() {
        boolean z = this.didExceedMaxLines;
        Layout layout = this.layout;
        return (z ? layout.getLineBottom(this.lineCount - 1) : layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final float getHorizontalPadding(int i) {
        return i == this.lineCount + (-1) ? this.leftPadding + this.rightPadding : RecyclerView.DECELERATION_RATE;
    }

    public final ComponentRegistry.Builder getLayoutHelper() {
        ComponentRegistry.Builder builder = this.backingLayoutHelper;
        if (builder != null) {
            return builder;
        }
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        builder2.keyers = this.layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int indexOf$default = StringsKt.indexOf$default(((Layout) builder2.keyers).getText(), '\n', i, false, 4);
            i = indexOf$default < 0 ? ((Layout) builder2.keyers).getText().length() : indexOf$default + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) builder2.keyers).getText().length());
        builder2.interceptors = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        builder2.mappers = arrayList2;
        builder2.lazyFetcherFactories = new boolean[((ArrayList) builder2.interceptors).size()];
        ((ArrayList) builder2.interceptors).size();
        this.backingLayoutHelper = builder2;
        return builder2;
    }

    public final float getLineBaseline(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.topPadding + ((i != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineBaseline(i) : getLineTop(i) - fontMetricsInt.ascent);
    }

    public final float getLineBottom(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.lineCount;
        int i3 = i2 - 1;
        Layout layout = this.layout;
        if (i != i3 || (fontMetricsInt = this.lastLineFontMetrics) == null) {
            return this.topPadding + layout.getLineBottom(i) + (i == i2 + (-1) ? this.bottomPadding : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int getLineEnd(int i) {
        ThreadLocal threadLocal = TextLayout_androidKt.SharedTextAndroidCanvas;
        Layout layout = this.layout;
        return (layout.getEllipsisCount(i) <= 0 || this.ellipsize != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float getLineTop(int i) {
        return this.layout.getLineTop(i) + (i == 0 ? 0 : this.topPadding);
    }

    public final float getPrimaryHorizontal(int i, boolean z) {
        return getHorizontalPadding(this.layout.getLineForOffset(i)) + getLayoutHelper().getHorizontalPosition(i, true, z);
    }

    public final float getSecondaryHorizontal(int i, boolean z) {
        return getHorizontalPadding(this.layout.getLineForOffset(i)) + getLayoutHelper().getHorizontalPosition(i, false, z);
    }

    public final TimedValueQueue getWordIterator() {
        TimedValueQueue timedValueQueue = this.backingWordIterator;
        if (timedValueQueue != null) {
            return timedValueQueue;
        }
        Layout layout = this.layout;
        TimedValueQueue timedValueQueue2 = new TimedValueQueue(layout.getText(), layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = timedValueQueue2;
        return timedValueQueue2;
    }
}
