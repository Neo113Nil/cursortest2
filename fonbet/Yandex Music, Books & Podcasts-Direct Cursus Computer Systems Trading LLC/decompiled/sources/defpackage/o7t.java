package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class o7t implements Sequence {
    public final Sequence a;
    public final Function1 b;

    public o7t(Sequence sequence, Function1 function1) {
        sequence.getClass();
        this.a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new n7t(this);
    }
}
