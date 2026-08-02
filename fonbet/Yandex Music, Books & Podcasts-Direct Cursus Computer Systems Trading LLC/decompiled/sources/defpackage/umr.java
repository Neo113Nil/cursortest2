package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class umr implements Sequence, ura {
    public final Sequence a;
    public final int b;
    public final int c;

    public umr(Sequence sequence, int i, int i2) {
        sequence.getClass();
        this.a = sequence;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            xq0.o(k5r.i(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            xq0.o(k5r.i(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        xq0.o(f1d.e(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    }

    @Override // defpackage.ura
    public final Sequence a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? p5b.a : new umr(this.a, i3 + i, i2);
    }

    @Override // defpackage.ura
    public final Sequence b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new umr(this.a, i3, i + i3);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new g5d(this);
    }
}
