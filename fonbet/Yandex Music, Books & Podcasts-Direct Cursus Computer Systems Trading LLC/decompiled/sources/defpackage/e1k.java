package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e1k extends cg6 {
    public f1k j;
    public Function2 k;
    public Collection l;
    public Iterator m;
    public Collection n;
    public /* synthetic */ Object o;
    public final /* synthetic */ f1k p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1k(f1k f1kVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = f1kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(null, this);
    }
}
