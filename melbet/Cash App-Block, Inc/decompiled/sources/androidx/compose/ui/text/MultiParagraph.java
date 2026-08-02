package androidx.compose.ui.text;

import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import coil3.ComponentRegistry;
import coil3.size.SizeKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class MultiParagraph {
    public final boolean didExceedMaxLines;
    public final float height;
    public final ComponentRegistry.Builder intrinsics;
    public final int lineCount;
    public final int maxLines;
    public final ArrayList paragraphInfoList;
    public final ArrayList placeholderRects;
    public final float width;

    public MultiParagraph(ComponentRegistry.Builder builder, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int m1024getMaxHeightimpl;
        int i5;
        this.intrinsics = builder;
        this.maxLines = i;
        if (Constraints.m1027getMinWidthimpl(j) != 0 || Constraints.m1026getMinHeightimpl(j) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) builder.interceptors;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) arrayList2.get(i6);
            AndroidParagraphIntrinsics androidParagraphIntrinsics = paragraphIntrinsicInfo.intrinsics;
            int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
            if (Constraints.m1020getHasBoundedHeightimpl(j)) {
                i4 = i6;
                m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j) - ((int) Math.ceil(f));
                if (m1024getMaxHeightimpl < 0) {
                    m1024getMaxHeightimpl = 0;
                }
            } else {
                i4 = i6;
                m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
            }
            i3 = 0;
            AndroidParagraph androidParagraph = new AndroidParagraph(androidParagraphIntrinsics, this.maxLines - i7, i2, ConstraintsKt.Constraints$default(0, m1025getMaxWidthimpl, 0, m1024getMaxHeightimpl, 5));
            float height = androidParagraph.getHeight() + f;
            TextLayout textLayout = androidParagraph.layout;
            int i8 = i7 + textLayout.lineCount;
            arrayList.add(new ParagraphInfo(androidParagraph, paragraphIntrinsicInfo.startIndex, paragraphIntrinsicInfo.endIndex, i7, i8, f, height));
            if (!textLayout.didExceedMaxLines) {
                if (i8 == this.maxLines) {
                    i5 = i4;
                    if (i5 != CollectionsKt__CollectionsKt.getLastIndex((ArrayList) this.intrinsics.interceptors)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = height;
            }
            z = true;
            i7 = i8;
            f = height;
            break;
        }
        i3 = 0;
        z = false;
        this.height = f;
        this.lineCount = i7;
        this.didExceedMaxLines = z;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m1025getMaxWidthimpl(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i9);
            List list = paragraphInfo.paragraph.placeholderRects;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                Rect rect = (Rect) list.get(i10);
                arrayList4.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.intrinsics.keyers).size()) {
            int size4 = ((List) this.intrinsics.keyers).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.plus((Iterable) arrayList5, (Collection) arrayList3);
        }
        this.placeholderRects = arrayList3;
    }

    /* renamed from: paint-LG529CI$default, reason: not valid java name */
    public static void m964paintLG529CI$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            j = Color.Unspecified;
        }
        long j2 = j;
        Shadow shadow2 = (i & 4) != 0 ? null : shadow;
        TextDecoration textDecoration2 = (i & 8) != 0 ? null : textDecoration;
        DrawStyle drawStyle2 = (i & 16) != 0 ? null : drawStyle;
        canvas.save();
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i2);
            Canvas canvas2 = canvas;
            paragraphInfo.paragraph.m958paintLG529CI(canvas2, j2, shadow2, textDecoration2, drawStyle2, 3);
            canvas2.translate(RecyclerView.DECELERATION_RATE, paragraphInfo.paragraph.getHeight());
            i2++;
            canvas = canvas2;
        }
        canvas.restore();
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final void m965fillBoundingBoxes8ffj60Q(long j, float[] fArr) {
        requireIndexInRange(TextRange.m990getMinimpl(j));
        requireIndexInRangeInclusiveEnd(TextRange.m989getMaximpl(j));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        DBUtil.m1181findParagraphsByRangeSbBc2M(this.paragraphInfoList, j, new MultiParagraph$$ExternalSyntheticLambda0(j, fArr, ref$IntRef, new Ref$FloatRef()));
    }

    public final float getLineBottom(int i) {
        requireLineIndexInRange(i);
        ArrayList arrayList = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByLineIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        return androidParagraph.layout.getLineBottom(i - paragraphInfo.startLineIndex) + paragraphInfo.top;
    }

    public final int getLineEnd(int i, boolean z) {
        int lineEnd;
        requireLineIndexInRange(i);
        ArrayList arrayList = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByLineIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int i2 = i - paragraphInfo.startLineIndex;
        TextLayout textLayout = androidParagraph.layout;
        if (z) {
            Layout layout = textLayout.layout;
            ThreadLocal threadLocal = TextLayout_androidKt.SharedTextAndroidCanvas;
            if (layout.getEllipsisCount(i2) <= 0 || textLayout.ellipsize != TextUtils.TruncateAt.END) {
                ComponentRegistry.Builder layoutHelper = textLayout.getLayoutHelper();
                Layout layout2 = (Layout) layoutHelper.keyers;
                lineEnd = layoutHelper.lineEndToVisibleEnd(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                lineEnd = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            lineEnd = textLayout.getLineEnd(i2);
        }
        return lineEnd + paragraphInfo.startIndex;
    }

    public final int getLineForOffset(int i) {
        int length = ((AnnotatedString) this.intrinsics.mappers).text.length();
        ArrayList arrayList = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i >= length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : i < 0 ? 0 : DBUtil.findParagraphByIndex(i, arrayList));
        return paragraphInfo.paragraph.layout.layout.getLineForOffset(paragraphInfo.toLocalIndex(i)) + paragraphInfo.startLineIndex;
    }

    public final int getLineForVerticalPosition(float f) {
        ArrayList arrayList = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByY(arrayList, f));
        int i = paragraphInfo.endIndex - paragraphInfo.startIndex;
        int i2 = paragraphInfo.startLineIndex;
        if (i == 0) {
            return i2;
        }
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        float f2 = f - paragraphInfo.top;
        TextLayout textLayout = androidParagraph.layout;
        return textLayout.layout.getLineForVertical(((int) f2) - textLayout.topPadding) + i2;
    }

    public final float getLineTop(int i) {
        requireLineIndexInRange(i);
        ArrayList arrayList = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByLineIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        return androidParagraph.layout.getLineTop(i - paragraphInfo.startLineIndex) + paragraphInfo.top;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m966getOffsetForPositionk4lQ0M(long j) {
        int i = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByY(arrayList, intBitsToFloat));
        int i2 = paragraphInfo.endIndex;
        int i3 = paragraphInfo.startIndex;
        if (i2 - i3 == 0) {
            return i3;
        }
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - paragraphInfo.top;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax);
        TextLayout textLayout = androidParagraph.layout;
        int lineForVertical = textLayout.layout.getLineForVertical(((int) Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & floatToRawIntBits))) - textLayout.topPadding);
        return textLayout.layout.getOffsetForHorizontal(lineForVertical, (textLayout.getHorizontalPadding(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final ResolvedTextDirection getParagraphDirection(int i) {
        requireIndexInRangeInclusiveEnd(i);
        int length = ((AnnotatedString) this.intrinsics.mappers).text.length();
        ArrayList arrayList = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : DBUtil.findParagraphByIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int localIndex = paragraphInfo.toLocalIndex(i);
        TextLayout textLayout = androidParagraph.layout;
        return textLayout.layout.getParagraphDirection(textLayout.layout.getLineForOffset(localIndex)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m967getRangeForRect86BmAI(Rect rect, int i, DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0) {
        long j;
        long j2;
        float f = rect.top;
        ArrayList arrayList = this.paragraphInfoList;
        int findParagraphByY = DBUtil.findParagraphByY(arrayList, f);
        float f2 = ((ParagraphInfo) arrayList.get(findParagraphByY)).bottom;
        float f3 = rect.bottom;
        if (f2 >= f3 || findParagraphByY == CollectionsKt__CollectionsKt.getLastIndex(arrayList)) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(findParagraphByY);
            return paragraphInfo.m968toGlobalxdX6G0(paragraphInfo.paragraph.m957getRangeForRect86BmAI(paragraphInfo.toLocal(rect), i, differentialMotionFlingController$$ExternalSyntheticLambda0), true);
        }
        int findParagraphByY2 = DBUtil.findParagraphByY(arrayList, f3);
        long j3 = TextRange.Zero;
        while (true) {
            j = TextRange.Zero;
            if (!TextRange.m986equalsimpl0(j3, j) || findParagraphByY > findParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = (ParagraphInfo) arrayList.get(findParagraphByY);
            j3 = paragraphInfo2.m968toGlobalxdX6G0(paragraphInfo2.paragraph.m957getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), i, differentialMotionFlingController$$ExternalSyntheticLambda0), true);
            findParagraphByY++;
        }
        if (TextRange.m986equalsimpl0(j3, j)) {
            return j;
        }
        while (true) {
            j2 = TextRange.Zero;
            if (!TextRange.m986equalsimpl0(j, j2) || findParagraphByY > findParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = (ParagraphInfo) arrayList.get(findParagraphByY2);
            j = paragraphInfo3.m968toGlobalxdX6G0(paragraphInfo3.paragraph.m957getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), i, differentialMotionFlingController$$ExternalSyntheticLambda0), true);
            findParagraphByY2--;
        }
        return TextRange.m986equalsimpl0(j, j2) ? j3 : SizeKt.TextRange((int) (j3 >> 32), (int) (BodyPartID.bodyIdMax & j));
    }

    public final void requireIndexInRange(int i) {
        boolean z = false;
        ComponentRegistry.Builder builder = this.intrinsics;
        if (i >= 0 && i < ((AnnotatedString) builder.mappers).text.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "offset(", ") is out of bounds [0, ");
        m2m.append(((AnnotatedString) builder.mappers).text.length());
        m2m.append(')');
        InlineClassHelperKt.throwIllegalArgumentException(m2m.toString());
    }

    public final void requireIndexInRangeInclusiveEnd(int i) {
        boolean z = false;
        ComponentRegistry.Builder builder = this.intrinsics;
        if (i >= 0 && i <= ((AnnotatedString) builder.mappers).text.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "offset(", ") is out of bounds [0, ");
        m2m.append(((AnnotatedString) builder.mappers).text.length());
        m2m.append(']');
        InlineClassHelperKt.throwIllegalArgumentException(m2m.toString());
    }

    public final void requireLineIndexInRange(int i) {
        boolean z = false;
        int i2 = this.lineCount;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
