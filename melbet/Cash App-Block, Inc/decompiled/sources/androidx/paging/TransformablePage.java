package androidx.paging;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class TransformablePage {
    public final List data;
    public final int hintOriginalPageOffset;
    public final int[] originalPageOffsets;

    public TransformablePage(int[] iArr, List list, int i) {
        iArr.getClass();
        list.getClass();
        this.originalPageOffsets = iArr;
        this.data = list;
        this.hintOriginalPageOffset = i;
        if (iArr.length != 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("originalPageOffsets cannot be empty when constructing TransformablePage");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformablePage.class != obj.getClass()) {
            return false;
        }
        TransformablePage transformablePage = (TransformablePage) obj;
        return Arrays.equals(this.originalPageOffsets, transformablePage.originalPageOffsets) && Intrinsics.areEqual(this.data, transformablePage.data) && this.hintOriginalPageOffset == transformablePage.hintOriginalPageOffset;
    }

    public final int hashCode() {
        return (Recorder$$ExternalSyntheticOutline2.m(Arrays.hashCode(this.originalPageOffsets) * 31, 31, this.data) + this.hintOriginalPageOffset) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.originalPageOffsets));
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", hintOriginalPageOffset=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.hintOriginalPageOffset, ", hintOriginalIndices=null)", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i, List list) {
        this(new int[]{i}, list, i);
        list.getClass();
    }
}
