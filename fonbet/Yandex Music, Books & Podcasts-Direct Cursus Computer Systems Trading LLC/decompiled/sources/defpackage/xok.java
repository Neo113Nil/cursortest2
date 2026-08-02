package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class xok extends cg6 {
    public String j;
    public e63 k;
    public dwr l;
    public ArrayList m;
    public Map n;
    public LinkedHashMap o;
    public ArrayList p;
    public /* synthetic */ Object q;
    public final /* synthetic */ epk r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xok(epk epkVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = epkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(null, null, null, this);
    }
}
