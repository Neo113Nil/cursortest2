package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class vb7 {
    public final ugu a;
    public final CoroutineContext b;
    public final File c;
    public final qqi d;
    public final xdr e;
    public final fkn f;

    public vb7(Context context, String str, tf6 tf6Var, ugu uguVar) {
        this.a = uguVar;
        CoroutineContext coroutineContext = tf6Var.a;
        this.b = coroutineContext;
        this.c = new File(context.getApplicationContext().getFilesDir(), str);
        this.d = rqi.a();
        xdr a = ydr.a(pb7.a);
        this.e = a;
        this.f = zsd.F0(new ub7(0, new clc(a, new ja4(this, null, 24)), this), tf6Var, new hdr(0L, Long.MAX_VALUE), null);
        new db(2, 7, null);
        r2f r2fVar = (r2f) coroutineContext.get(o6c.l);
        if (r2fVar != null) {
            r2fVar.R(new az6(5, this));
        }
    }
}
