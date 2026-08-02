package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ji4 extends cg6 {
    public int A;
    public Collection j;
    public nvl k;
    public Map l;
    public List m;
    public Set n;
    public Iterator o;
    public String p;
    public ArrayList q;
    public List r;
    public Iterator s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ pi4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji4(pi4 pi4Var, cg6 cg6Var) {
        super(cg6Var);
        this.z = pi4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, this);
    }
}
