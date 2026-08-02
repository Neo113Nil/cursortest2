package androidx.compose.ui.text;

import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class ParagraphIntrinsicInfo {
    public final int endIndex;
    public final AndroidParagraphIntrinsics intrinsics;
    public final int startIndex;

    public ParagraphIntrinsicInfo(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2) {
        this.intrinsics = androidParagraphIntrinsics;
        this.startIndex = i;
        this.endIndex = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphIntrinsicInfo) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
            if (this.intrinsics == paragraphIntrinsicInfo.intrinsics && this.startIndex == paragraphIntrinsicInfo.startIndex && this.endIndex == paragraphIntrinsicInfo.endIndex) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.endIndex) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.startIndex, this.intrinsics.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.intrinsics);
        sb.append(", startIndex=");
        sb.append(this.startIndex);
        sb.append(", endIndex=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.endIndex, ')');
    }
}
