package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class om extends cg6 {
    public int A;
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ pm l;
    public rjc m;
    public List n;
    public Collection o;
    public Iterator p;
    public fvl q;
    public String r;
    public mqs s;
    public Collection t;
    public eul u;
    public hwl v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(pm pmVar, Continuation continuation) {
        super(continuation);
        this.l = pmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
