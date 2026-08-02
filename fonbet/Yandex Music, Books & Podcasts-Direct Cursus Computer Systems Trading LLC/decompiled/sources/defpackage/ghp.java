package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public class ghp extends ehp {
    public static n86 b(Iterator it) {
        it.getClass();
        return new n86(new wz0(5, it));
    }

    public static final lhc c(Sequence sequence, Function1 function1) {
        if (!(sequence instanceof o7t)) {
            return new lhc(sequence, new s3f(3), function1);
        }
        o7t o7tVar = (o7t) sequence;
        return new lhc(o7tVar.a, o7tVar.b, function1);
    }

    public static Sequence d(Function1 function1, Object obj) {
        if (obj == null) {
            return p5b.a;
        }
        return new h5d(0, new oxo(6, obj), function1);
    }
}
