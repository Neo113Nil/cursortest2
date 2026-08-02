package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class sa2 extends cg6 {
    public drf j;
    public String k;
    public String l;
    public String m;
    public Object n;
    public Object o;
    public ArrayList p;
    public Collection q;
    public Iterator r;
    public Collection s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ za2 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa2(za2 za2Var, cg6 cg6Var) {
        super(cg6Var);
        this.w = za2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return za2.a(this.w, null, this);
    }
}
