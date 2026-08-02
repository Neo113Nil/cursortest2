package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class lhc implements Sequence {
    public final Sequence a;
    public final Function1 b;
    public final Function1 c;

    public lhc(Sequence sequence, Function1 function1, Function1 function12) {
        sequence.getClass();
        this.a = sequence;
        this.b = function1;
        this.c = function12;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new kcc(this);
    }
}
