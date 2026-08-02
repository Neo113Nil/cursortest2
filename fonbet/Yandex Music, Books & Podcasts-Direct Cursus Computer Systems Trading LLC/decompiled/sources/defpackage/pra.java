package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class pra implements Sequence, ura {
    public final /* synthetic */ int a;
    public final Sequence b;
    public final int c;

    public pra(Sequence sequence, int i, int i2) {
        this.a = i2;
        sequence.getClass();
        switch (i2) {
            case 1:
                this.b = sequence;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                xq0.o(hrg.o("count must be non-negative, but was ", i, '.'));
                throw null;
            default:
                this.b = sequence;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                xq0.o(hrg.o("count must be non-negative, but was ", i, '.'));
                throw null;
        }
    }

    @Override // defpackage.ura
    public final Sequence a(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c + i;
                return i2 < 0 ? new pra(this, i, 0) : new pra(this.b, i2, 0);
            default:
                int i3 = this.c;
                return i >= i3 ? p5b.a : new umr(this.b, i, i3);
        }
    }

    @Override // defpackage.ura
    public final Sequence b(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c;
                int i3 = i2 + i;
                return i3 < 0 ? new pra(this, i, 1) : new umr(this.b, i2, i3);
            default:
                return i >= this.c ? this : new pra(this.b, i, 1);
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ora(this);
            default:
                return new ora(this, (byte) 0);
        }
    }
}
