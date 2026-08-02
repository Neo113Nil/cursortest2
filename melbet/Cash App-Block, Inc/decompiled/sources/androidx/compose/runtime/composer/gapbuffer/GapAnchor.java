package androidx.compose.runtime.composer.gapbuffer;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class GapAnchor {
    public int location;

    public GapAnchor(int i) {
        this.location = i;
    }

    public final boolean getValid() {
        return this.location != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.location, " }", sb);
    }
}
