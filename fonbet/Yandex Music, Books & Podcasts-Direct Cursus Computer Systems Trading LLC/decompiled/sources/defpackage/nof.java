package defpackage;

import android.media.ImageReader;

/* loaded from: classes.dex */
public final class nof extends cg6 {
    public ImageReader j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x2i l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nof(x2i x2iVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = x2iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.N(null, this);
    }
}
