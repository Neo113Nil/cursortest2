package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class um7 implements swd, twd {
    public final qn5 a;
    public final Context b;
    public final uzm c;
    public final Set d;
    public final Executor e;

    public um7(Context context, String str, Set set, uzm uzmVar, Executor executor) {
        this.a = new qn5(1, context, str);
        this.d = set;
        this.e = executor;
        this.c = uzmVar;
        this.b = context;
    }

    public final onx a() {
        if (!a4g.I(this.b)) {
            return ywf.w("");
        }
        return ywf.p(this.e, new tm7(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            ywf.w(null);
        } else if (!a4g.I(this.b)) {
            ywf.w(null);
        } else {
            ywf.p(this.e, new tm7(this, 1));
        }
    }
}
