package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class rkn extends cg6 {
    public skn j;
    public q0o k;
    public rce l;
    public hib m;
    public Bitmap n;
    public /* synthetic */ Object o;
    public final /* synthetic */ skn p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkn(skn sknVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = sknVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return skn.e(this.p, null, 0, this);
    }
}
