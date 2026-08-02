package defpackage;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class bqb implements we9 {
    public final Context b;
    public final qxp c;

    public bqb(Context context) {
        this.b = context;
        this.c = new qxp(context);
    }

    @Override // defpackage.we9
    public final af9 a(Context context) {
        return new cqb(context);
    }

    @Override // defpackage.we9
    public final ze9 b() {
        return new nsb(this.b, this.c);
    }

    @Override // defpackage.we9
    public final se9 c(List list, xe9 xe9Var) {
        return new aqb(this.b, list, xe9Var, (ip3) this.c.a);
    }
}
