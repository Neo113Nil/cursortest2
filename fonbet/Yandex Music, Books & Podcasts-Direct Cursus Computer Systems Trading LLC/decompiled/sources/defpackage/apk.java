package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class apk extends cg6 {
    public String A;
    public Collection B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ epk F;
    public int G;
    public String j;
    public cr k;
    public hwr l;
    public f63 m;
    public ewr n;
    public Map o;
    public List p;
    public Map q;
    public HashSet r;
    public List s;
    public List t;
    public Iterator u;
    public Collection v;
    public Iterator w;
    public rrl x;
    public cvl y;
    public xtl z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apk(epk epkVar, cg6 cg6Var) {
        super(cg6Var);
        this.F = epkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h(null, null, null, null, this);
    }
}
