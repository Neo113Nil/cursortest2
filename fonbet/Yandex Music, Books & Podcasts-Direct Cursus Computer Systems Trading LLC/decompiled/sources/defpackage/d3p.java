package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d3p extends cg6 {
    public boolean j;
    public Collection k;
    public Iterator l;
    public bqi m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ e3p r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3p(e3p e3pVar, Continuation continuation) {
        super(continuation);
        this.r = e3pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return e3p.a(this.r, this);
    }
}
