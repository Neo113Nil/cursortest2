package defpackage;

import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class z7p extends cg6 {
    public i4p j;
    public Object k;
    public Parcelable l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ mmo o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7p(mmo mmoVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = mmoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.W0(null, this);
    }
}
