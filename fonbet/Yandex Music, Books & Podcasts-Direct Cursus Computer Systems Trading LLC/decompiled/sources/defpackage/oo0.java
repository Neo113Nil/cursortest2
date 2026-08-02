package defpackage;

import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class oo0 extends SegmentFinder {
    public final /* synthetic */ atn a;

    public oo0(atn atnVar) {
        this.a = atnVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.h(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.r(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.g(i);
    }
}
