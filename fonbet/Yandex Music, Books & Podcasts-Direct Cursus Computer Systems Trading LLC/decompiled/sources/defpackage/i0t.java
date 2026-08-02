package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class i0t extends cg6 {
    public LinkedHashMap j;
    public ArrayList k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l0t m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0t(l0t l0tVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = l0tVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, false, null, this);
    }
}
