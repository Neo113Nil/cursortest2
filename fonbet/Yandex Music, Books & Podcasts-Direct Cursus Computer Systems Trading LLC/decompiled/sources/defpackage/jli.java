package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class jli extends cg6 {
    public List j;
    public rj6 k;
    public Collection l;
    public Iterator m;
    public yji n;
    public Collection o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ kli w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jli(kli kliVar, cg6 cg6Var) {
        super(cg6Var);
        this.w = kliVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.e(null, this);
    }
}
