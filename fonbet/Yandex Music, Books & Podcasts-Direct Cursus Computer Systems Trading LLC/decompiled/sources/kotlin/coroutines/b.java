package kotlin.coroutines;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class b implements f {
    public final Function1 a;
    public final f b;

    public b(f fVar, Function1 function1) {
        fVar.getClass();
        this.a = function1;
        this.b = fVar instanceof b ? ((b) fVar).b : fVar;
    }
}
