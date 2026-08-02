package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class r2q {
    public final tfj a;
    public final Context b;
    public final tf6 c;
    public final xdr d;
    public final xdr e;

    public r2q(tfj tfjVar, Context context) {
        this.a = tfjVar;
        this.b = context;
        tf6 e = gld.e(dm6.b);
        this.c = e;
        xdr a = ydr.a(Boolean.FALSE);
        this.d = a;
        this.e = a;
        x97.y(e, null, null, new v5p(this, (Continuation) null, 10), 3);
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        ctm.i.f.a(new s3b(2, this));
    }

    public final void a(boolean z) {
        x97.y(this.c, null, null, new z11(this, z, (Continuation) null, 18), 3);
    }
}
