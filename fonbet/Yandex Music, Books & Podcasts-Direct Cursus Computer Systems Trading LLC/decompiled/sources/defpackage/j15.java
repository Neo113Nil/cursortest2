package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class j15 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ g15 l;
    public rjc m;
    public Collection n;
    public Iterator o;
    public Collection p;
    public int q;
    public int r;
    public int s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j15(g15 g15Var, Continuation continuation) {
        super(continuation);
        this.l = g15Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
