package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x40 extends cg6 {
    public Collection j;
    public Iterator k;
    public oq l;
    public jbj m;
    public oq n;
    public Collection o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ y40 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x40(y40 y40Var, Continuation continuation) {
        super(continuation);
        this.s = y40Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return y40.a(this.s, null, null, this);
    }
}
