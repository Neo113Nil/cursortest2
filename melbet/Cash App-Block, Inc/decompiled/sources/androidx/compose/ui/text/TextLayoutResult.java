package androidx.compose.ui.text;

import android.graphics.RectF;
import android.text.Layout;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.common.util.TimedValueQueue;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import coil3.ComponentRegistry;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahg;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextLayoutResult {
    public final float firstBaseline;
    public final float lastBaseline;
    public final TextLayoutInput layoutInput;
    public final MultiParagraph multiParagraph;
    public final ArrayList placeholderRects;
    public final long size;

    public TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j;
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        boolean isEmpty = arrayList.isEmpty();
        float f = RecyclerView.DECELERATION_RATE;
        this.firstBaseline = isEmpty ? 0.0f : ((ParagraphInfo) arrayList.get(0)).paragraph.layout.getLineBaseline(0);
        if (!arrayList.isEmpty()) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.last((List) arrayList);
            f = paragraphInfo.paragraph.layout.getLineBaseline(r4.lineCount - 1) + paragraphInfo.top;
        }
        this.lastBaseline = f;
        this.placeholderRects = multiParagraph.placeholderRects;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextLayoutResult) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
            if (this.layoutInput.equals(textLayoutResult.layoutInput) && this.multiParagraph == textLayoutResult.multiParagraph && IntSize.m1055equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && Intrinsics.areEqual(this.placeholderRects, textLayoutResult.placeholderRects)) {
                return true;
            }
        }
        return false;
    }

    public final ResolvedTextDirection getBidiRunDirection(int i) {
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireIndexInRangeInclusiveEnd(i);
        int length = ((AnnotatedString) multiParagraph.intrinsics.mappers).text.length();
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : DBUtil.findParagraphByIndex(i, arrayList));
        return paragraphInfo.paragraph.layout.layout.isRtlCharAt(paragraphInfo.toLocalIndex(i)) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    public final Rect getBoundingBox(int i) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireIndexInRange(i);
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int localIndex = paragraphInfo.toLocalIndex(i);
        CharSequence charSequence = androidParagraph.charSequence;
        if (localIndex < 0 || localIndex >= charSequence.length()) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(localIndex, "offset(", ") is out of bounds [0,");
            m2m.append(charSequence.length());
            m2m.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(m2m.toString());
        }
        TextLayout textLayout = androidParagraph.layout;
        Layout layout = textLayout.layout;
        int lineForOffset = layout.getLineForOffset(localIndex);
        float lineTop = textLayout.getLineTop(lineForOffset);
        float lineBottom = textLayout.getLineBottom(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(localIndex);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                primaryHorizontal = textLayout.getSecondaryHorizontal(localIndex, false);
                primaryHorizontal2 = textLayout.getSecondaryHorizontal(localIndex + 1, true);
            } else if (isRtlCharAt) {
                primaryHorizontal = textLayout.getPrimaryHorizontal(localIndex, false);
                primaryHorizontal2 = textLayout.getPrimaryHorizontal(localIndex + 1, true);
            } else {
                secondaryHorizontal = textLayout.getSecondaryHorizontal(localIndex, false);
                secondaryHorizontal2 = textLayout.getSecondaryHorizontal(localIndex + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        } else {
            secondaryHorizontal = textLayout.getPrimaryHorizontal(localIndex, false);
            secondaryHorizontal2 = textLayout.getPrimaryHorizontal(localIndex + 1, true);
        }
        RectF rectF = new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
        return paragraphInfo.toGlobal(new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final Rect getCursorRect(int i) {
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireIndexInRangeInclusiveEnd(i);
        int length = ((AnnotatedString) multiParagraph.intrinsics.mappers).text.length();
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : DBUtil.findParagraphByIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int localIndex = paragraphInfo.toLocalIndex(i);
        CharSequence charSequence = androidParagraph.charSequence;
        TextLayout textLayout = androidParagraph.layout;
        if (localIndex < 0 || localIndex > charSequence.length()) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(localIndex, "offset(", ") is out of bounds [0,");
            m2m.append(charSequence.length());
            m2m.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(m2m.toString());
        }
        float primaryHorizontal = textLayout.getPrimaryHorizontal(localIndex, false);
        int lineForOffset = textLayout.layout.getLineForOffset(localIndex);
        return paragraphInfo.toGlobal(new Rect(primaryHorizontal, textLayout.getLineTop(lineForOffset), primaryHorizontal, textLayout.getLineBottom(lineForOffset)));
    }

    public final boolean getDidOverflowHeight() {
        MultiParagraph multiParagraph = this.multiParagraph;
        return multiParagraph.didExceedMaxLines || ((float) ((int) (this.size & BodyPartID.bodyIdMax))) < multiParagraph.height;
    }

    public final boolean getHasVisualOverflow() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.width || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i, boolean z) {
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireIndexInRangeInclusiveEnd(i);
        int length = ((AnnotatedString) multiParagraph.intrinsics.mappers).text.length();
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : DBUtil.findParagraphByIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int localIndex = paragraphInfo.toLocalIndex(i);
        TextLayout textLayout = androidParagraph.layout;
        return z ? textLayout.getPrimaryHorizontal(localIndex, false) : textLayout.getSecondaryHorizontal(localIndex, false);
    }

    public final float getLineBaseline(int i) {
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireLineIndexInRange(i);
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByLineIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        return androidParagraph.layout.getLineBaseline(i - paragraphInfo.startLineIndex) + paragraphInfo.top;
    }

    public final float getLineLeft(int i) {
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireLineIndexInRange(i);
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByLineIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int i2 = i - paragraphInfo.startLineIndex;
        TextLayout textLayout = androidParagraph.layout;
        return textLayout.layout.getLineLeft(i2) + (i2 == textLayout.lineCount + (-1) ? textLayout.leftPadding : RecyclerView.DECELERATION_RATE);
    }

    public final float getLineRight(int i) {
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireLineIndexInRange(i);
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByLineIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int i2 = i - paragraphInfo.startLineIndex;
        TextLayout textLayout = androidParagraph.layout;
        return textLayout.layout.getLineRight(i2) + (i2 == textLayout.lineCount + (-1) ? textLayout.rightPadding : RecyclerView.DECELERATION_RATE);
    }

    public final int getLineStart(int i) {
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireLineIndexInRange(i);
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(DBUtil.findParagraphByLineIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        return androidParagraph.layout.layout.getLineStart(i - paragraphInfo.startLineIndex) + paragraphInfo.startIndex;
    }

    public final AndroidPath getPathForRange(int i, int i2) {
        MultiParagraph multiParagraph = this.multiParagraph;
        ComponentRegistry.Builder builder = multiParagraph.intrinsics;
        if (i < 0 || i > i2 || i2 > ((AnnotatedString) builder.mappers).text.length()) {
            StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "Start(", ") or End(", ") is out of range [0..");
            m107m.append(((AnnotatedString) builder.mappers).text.length());
            m107m.append("), or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(m107m.toString());
        }
        if (i == i2) {
            return AndroidPath_androidKt.Path();
        }
        AndroidPath Path = AndroidPath_androidKt.Path();
        DBUtil.m1181findParagraphsByRangeSbBc2M(multiParagraph.paragraphInfoList, SizeKt.TextRange(i, i2), new MultiParagraph$$ExternalSyntheticLambda1(Path, i, i2, 0));
        return Path;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m978getWordBoundaryjx7JFs(int i) {
        MultiParagraph multiParagraph = this.multiParagraph;
        multiParagraph.requireIndexInRangeInclusiveEnd(i);
        int length = ((AnnotatedString) multiParagraph.intrinsics.mappers).text.length();
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt__CollectionsKt.getLastIndex(arrayList) : DBUtil.findParagraphByIndex(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.paragraph;
        int localIndex = paragraphInfo.toLocalIndex(i);
        TimedValueQueue wordIterator = androidParagraph.layout.getWordIterator();
        return paragraphInfo.m968toGlobalxdX6G0(SizeKt.TextRange(zzahg.getWordStart(wordIterator, localIndex), zzahg.getWordEnd(wordIterator, localIndex)), false);
    }

    public final int hashCode() {
        return this.placeholderRects.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.lastBaseline, CameraState$Type$EnumUnboxingLocalUtility.m(this.firstBaseline, Recorder$$ExternalSyntheticOutline2.m((this.multiParagraph.hashCode() + (this.layoutInput.hashCode() * 31)) * 31, 31, this.size), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m1056toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }
}
