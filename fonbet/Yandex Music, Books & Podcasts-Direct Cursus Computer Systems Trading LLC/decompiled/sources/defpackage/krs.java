package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class krs extends cg6 {
    public List j;
    public ArrayList k;
    public lnu l;
    public Object m;
    public List n;
    public /* synthetic */ Object o;
    public final /* synthetic */ jqp p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krs(jqp jqpVar, Continuation continuation) {
        super(continuation);
        this.p = jqpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, this);
    }
}
