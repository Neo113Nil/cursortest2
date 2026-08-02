package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class xwd {
    public final ywd a;
    public final va7 b;
    public final a c;
    public db7 d;

    public xwd(ywd ywdVar, va7 va7Var) {
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        this.a = ywdVar;
        this.b = va7Var;
        this.c = mn7Var;
    }

    public static final zsj a(xwd xwdVar, db7 db7Var, Uri uri, nb7 nb7Var, boolean z) {
        nb7 nb7Var2 = nb7Var;
        if (!Intrinsics.d(nb7Var2.a, uri)) {
            nb7Var2 = new nb7(uri, nb7Var2.b, nb7Var2.c, nb7Var2.d, nb7Var2.e, nb7Var2.f, nb7Var2.g, nb7Var2.h, nb7Var2.i);
        }
        nb7 d = nb7Var2.d(0L);
        ssg.a(3, "HedgedDataSourceHelper", "open: opening " + d + " with new DataSource", null);
        long a = db7Var.a(d);
        ssg.a(3, "HedgedDataSourceHelper", dfi.e(a, "open: opened with ", " content length"), null);
        return new zsj(uri, a, d, db7Var, !z);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, nb7 nb7Var, cg6 cg6Var) {
        vwd vwdVar;
        int i;
        tf6 tf6Var;
        if (cg6Var instanceof vwd) {
            vwdVar = (vwd) cg6Var;
            int i2 = vwdVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vwdVar.m = i2 - Integer.MIN_VALUE;
                vwd vwdVar2 = vwdVar;
                Object obj = vwdVar2.k;
                nm6 nm6Var = nm6.a;
                i = vwdVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    tf6 e = gld.e(g.a);
                    gm5 j = hld.j();
                    AtomicInteger atomicInteger = new AtomicInteger(0);
                    int i3 = 0;
                    for (Object obj2 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        x97.y(e, this.c, null, new wwd(i3, this, j, atomicInteger, list, (Uri) obj2, nb7Var, null), 2);
                        i3 = i4;
                    }
                    try {
                        vwdVar2.j = e;
                        vwdVar2.m = 1;
                        obj = j.s(vwdVar2);
                        nm6 nm6Var2 = nm6.a;
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        tf6Var = e;
                    } catch (Throwable th) {
                        th = th;
                        tf6Var = e;
                        saf.E(saf.Q(tf6Var.getCoroutineContext()));
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tf6Var = vwdVar2.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        saf.E(saf.Q(tf6Var.getCoroutineContext()));
                        throw th;
                    }
                }
                this.d = ((zsj) obj).d;
                zsj zsjVar = (zsj) obj;
                saf.E(saf.Q(tf6Var.getCoroutineContext()));
                return zsjVar;
            }
        }
        vwdVar = new vwd(this, cg6Var);
        vwd vwdVar22 = vwdVar;
        Object obj3 = vwdVar22.k;
        nm6 nm6Var3 = nm6.a;
        i = vwdVar22.m;
        if (i != 0) {
        }
        this.d = ((zsj) obj3).d;
        zsj zsjVar2 = (zsj) obj3;
        saf.E(saf.Q(tf6Var.getCoroutineContext()));
        return zsjVar2;
    }
}
