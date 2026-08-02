package androidx.compose.ui.text;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.geometry.Rect;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class ParagraphInfo {
    public final float bottom;
    public final int endIndex;
    public final int endLineIndex;
    public final AndroidParagraph paragraph;
    public final int startIndex;
    public final int startLineIndex;
    public final float top;

    public ParagraphInfo(AndroidParagraph androidParagraph, int i, int i2, int i3, int i4, float f, float f2) {
        this.paragraph = androidParagraph;
        this.startIndex = i;
        this.endIndex = i2;
        this.startLineIndex = i3;
        this.endLineIndex = i4;
        this.top = f;
        this.bottom = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphInfo) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
            if (this.paragraph == paragraphInfo.paragraph && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.bottom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.top, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.endLineIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.startLineIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.endIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.startIndex, this.paragraph.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final Rect toGlobal(Rect rect) {
        return rect.m637translatek4lQ0M((Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(this.top) & BodyPartID.bodyIdMax));
    }

    /* renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m968toGlobalxdX6G0(long j, boolean z) {
        if (z) {
            long j2 = TextRange.Zero;
            if (TextRange.m986equalsimpl0(j, j2)) {
                return j2;
            }
        }
        int i = TextRange.$r8$clinit;
        int i2 = this.startIndex;
        return SizeKt.TextRange(((int) (j >> 32)) + i2, ((int) (j & BodyPartID.bodyIdMax)) + i2);
    }

    public final Rect toLocal(Rect rect) {
        float f = -this.top;
        return rect.m637translatek4lQ0M((Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax));
    }

    public final int toLocalIndex(int i) {
        int i2 = this.endIndex;
        int i3 = this.startIndex;
        return RangesKt___RangesKt.coerceIn(i, i3, i2) - i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.paragraph);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        sb.append(this.endIndex);
        sb.append(", startLineIndex=");
        sb.append(this.startLineIndex);
        sb.append(", endLineIndex=");
        sb.append(this.endLineIndex);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", bottom=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.bottom, ')');
    }
}
