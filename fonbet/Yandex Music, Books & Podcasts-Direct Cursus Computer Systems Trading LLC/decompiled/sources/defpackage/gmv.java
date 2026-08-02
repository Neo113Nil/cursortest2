package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class gmv extends cg6 {
    public Context j;
    public dmv k;
    public Bitmap l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lmv n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmv(lmv lmvVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = lmvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
