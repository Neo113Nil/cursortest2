package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z0k extends cg6 {
    public Function2 j;
    public a1k k;
    public pfg l;
    public Collection m;
    public Iterator n;
    public c7t o;
    public int[] p;
    public Collection q;
    public Iterator r;
    public Collection s;
    public Collection t;
    public /* synthetic */ Object u;
    public final /* synthetic */ a1k v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0k(a1k a1kVar, cg6 cg6Var) {
        super(cg6Var);
        this.v = a1kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
