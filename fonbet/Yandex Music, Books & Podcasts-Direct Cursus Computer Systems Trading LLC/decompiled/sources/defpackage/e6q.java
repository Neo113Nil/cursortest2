package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class e6q implements uaa {
    public static final String g = "Downloading:".concat("DownloadHistory");
    public final jur a;
    public final wka b;
    public final tf6 c;
    public final xdr d;
    public final xdr e;
    public final oi f;

    public e6q(jur jurVar, wka wkaVar) {
        this.a = jurVar;
        this.b = wkaVar;
        dq7 dq7Var = ca8.a;
        tf6 e = gld.e(mn7.d.plus(a4g.n()));
        this.c = e;
        q5b q5bVar = q5b.a;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        xdr a = ydr.a(new lja(q5bVar, e5bVar, q5bVar, q5bVar, q5bVar));
        this.d = a;
        this.e = a;
        this.f = bg3.i(e, null, 0, null, new lco(this, (Continuation) null, 11), 15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2.s(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r5.f.m(r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        d6q d6qVar;
        int i;
        gm5 j;
        if (continuation instanceof d6q) {
            d6qVar = (d6q) continuation;
            int i2 = d6qVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d6qVar.m = i2 - Integer.MIN_VALUE;
                Object obj = d6qVar.k;
                nm6 nm6Var = nm6.a;
                i = d6qVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    j = hld.j();
                    d6qVar.j = j;
                    d6qVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = d6qVar.j;
                    qgg.h0(obj);
                }
                d6qVar.j = null;
                d6qVar.m = 2;
            }
        }
        d6qVar = new d6q(this, continuation);
        Object obj2 = d6qVar.k;
        nm6 nm6Var2 = nm6.a;
        i = d6qVar.m;
        if (i != 0) {
        }
        d6qVar.j = null;
        d6qVar.m = 2;
    }
}
