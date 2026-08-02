package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;

/* loaded from: classes3.dex */
public final class cju {
    public static final String k;
    public final Context a;
    public final String b;
    public final nfw c;
    public final tf6 d;
    public rar e;
    public final AtomicInteger f;
    public final jyr g;
    public final bju h;
    public final x0q i;
    public final pjc j;

    static {
        String str = xhw.w;
        k = "YnisonCore:".concat("VolumeController");
    }

    public cju(Context context, String str, nfw nfwVar) {
        str.getClass();
        this.a = context;
        this.b = str;
        this.c = nfwVar;
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        this.d = gld.e(e.c(n, mn7.d));
        this.f = new AtomicInteger(0);
        this.g = btf.b(new wfs(18, this));
        this.h = new bju(this, (Handler) tj2.a.getValue());
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.i = b;
        Continuation continuation = null;
        this.j = zsd.k0(ox6.L(new alc(new clc(zsd.b0(b), new pjt(this, continuation, 5)), new ow1(this, continuation, 8)), 1000L), dm6.b());
    }
}
