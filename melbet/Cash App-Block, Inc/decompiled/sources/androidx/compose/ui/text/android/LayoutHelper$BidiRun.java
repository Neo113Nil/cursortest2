package androidx.compose.ui.text.android;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class LayoutHelper$BidiRun {
    public final int end;
    public final boolean isRtl;
    public final int start;

    public LayoutHelper$BidiRun(int i, int i2, boolean z) {
        this.start = i;
        this.end = i2;
        this.isRtl = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutHelper$BidiRun)) {
            return false;
        }
        LayoutHelper$BidiRun layoutHelper$BidiRun = (LayoutHelper$BidiRun) obj;
        return this.start == layoutHelper$BidiRun.start && this.end == layoutHelper$BidiRun.end && this.isRtl == layoutHelper$BidiRun.isRtl;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isRtl) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.end, Integer.hashCode(this.start) * 31, 31);
    }

    public final boolean isRtl() {
        return this.isRtl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", isRtl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isRtl, ')');
    }
}
