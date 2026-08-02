package defpackage;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes6.dex */
public final class jwp extends cg6 {
    public zwp j;
    public Bitmap k;
    public LayoutInflater l;
    public View m;
    public /* synthetic */ Object n;
    public final /* synthetic */ owp o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwp(owp owpVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = owpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.g(null, null, this);
    }
}
