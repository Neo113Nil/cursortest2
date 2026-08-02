package defpackage;

import android.graphics.Bitmap;
import android.view.View;

/* loaded from: classes6.dex */
public final class fwp extends cg6 {
    public zwp j;
    public Bitmap k;
    public View l;
    public /* synthetic */ Object m;
    public final /* synthetic */ owp n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwp(owp owpVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = owpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, null, this);
    }
}
