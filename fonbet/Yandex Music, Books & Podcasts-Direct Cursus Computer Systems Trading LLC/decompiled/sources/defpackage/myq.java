package defpackage;

import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class myq extends cg6 {
    public opb j;
    public urj k;
    public g4w l;
    public d4w m;
    public gzq n;
    public Object o;
    public TimeZone p;
    public /* synthetic */ Object q;
    public final /* synthetic */ nyq r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myq(nyq nyqVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = nyqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(this);
    }
}
