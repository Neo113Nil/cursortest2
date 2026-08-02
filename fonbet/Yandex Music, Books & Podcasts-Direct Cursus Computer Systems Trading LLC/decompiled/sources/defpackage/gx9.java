package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class gx9 implements Sequence {
    public final jc8 a;
    public final xzb b;
    public final Function1 c;
    public final Function1 d;
    public final uif e;

    /* JADX WARN: Multi-variable type inference failed */
    public gx9(jc8 jc8Var, xzb xzbVar, Function1 function1, Function1 function12, Function1 function13) {
        this.a = jc8Var;
        this.b = xzbVar;
        this.c = function1;
        this.d = function12;
        this.e = (uif) function13;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new dx9(this, this.a, this.b, this.e);
    }
}
