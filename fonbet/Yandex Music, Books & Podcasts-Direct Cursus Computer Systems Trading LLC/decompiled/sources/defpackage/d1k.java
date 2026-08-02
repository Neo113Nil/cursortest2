package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d1k extends cg6 {
    public f1k j;
    public Function2 k;
    public Collection l;
    public Iterator m;
    public /* synthetic */ Object n;
    public final /* synthetic */ f1k o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1k(f1k f1kVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = f1kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
