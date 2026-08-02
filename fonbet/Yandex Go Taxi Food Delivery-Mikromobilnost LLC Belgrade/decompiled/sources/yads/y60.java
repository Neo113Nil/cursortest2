package yads;

import android.content.Context;
import defpackage.h971;
import defpackage.i671;
import defpackage.pv81;
import defpackage.sa71;
import defpackage.sls;
import defpackage.x271;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class y60 extends Lambda implements sls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ h971 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y60(Context context, h971 h971Var) {
        super(0);
        this.b = context;
        this.c = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Context context = this.b;
        pv81 pv81Var = (pv81) this.c.u.getValue();
        i671 i671Var = (i671) this.c.v.getValue();
        new x271();
        return new sa71(context, pv81Var, i671Var);
    }
}
