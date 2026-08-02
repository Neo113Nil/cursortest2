package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes8.dex */
public final class u9j0 extends rz4 implements pza0 {
    public final Context b;
    public final gp50 c;
    public volatile oza0 w;

    public u9j0(Context context, gp50 gp50Var) {
        super("tel");
        this.b = context;
        this.c = gp50Var;
    }

    @Override // defpackage.rz4
    public final syj0 c(Uri uri) {
        if (qke.h(this.b, "android.permission.CALL_PHONE") == 0) {
            return this.c.H(uri, "android.intent.action.CALL");
        }
        oza0 oza0Var = this.w;
        if (oza0Var == null) {
            return this.c.H(uri, "android.intent.action.DIAL");
        }
        oza0Var.e(new og7(0, this, uri));
        return q5z.N();
    }

    @Override // defpackage.pza0
    public final void l(oza0 oza0Var) {
        this.w = oza0Var;
    }
}
