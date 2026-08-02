package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ddf extends cg6 {
    public Collection j;
    public Iterator k;
    public oq l;
    public jbj m;
    public oq n;
    public Collection o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ fdf s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddf(fdf fdfVar, Continuation continuation) {
        super(continuation);
        this.s = fdfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return fdf.a(this.s, null, null, this);
    }
}
