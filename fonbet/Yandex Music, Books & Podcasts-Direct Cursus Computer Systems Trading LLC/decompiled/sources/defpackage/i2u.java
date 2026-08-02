package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i2u {
    public final fvf a;
    public final y8u b;
    public final int c;
    public final x6k d;
    public final x6k e;
    public final x6k f;

    public i2u(fvf fvfVar, y8u y8uVar, int i) {
        fvfVar.getClass();
        this.a = fvfVar;
        this.b = y8uVar;
        this.c = i;
        this.d = szf.g0(null);
        this.e = szf.g0(Integer.valueOf(i));
        this.f = szf.g0(Float.valueOf(0.0f));
    }

    public final c2u a() {
        return (c2u) this.d.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (defpackage.zsd.O(r10, r11, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r9.a.m(r9.c, 0, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(eno enoVar, eno enoVar2, cg6 cg6Var) {
        h2u h2uVar;
        int i;
        if (cg6Var instanceof h2u) {
            h2uVar = (h2u) cg6Var;
            int i2 = h2uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h2uVar.n = i2 - Integer.MIN_VALUE;
                Object obj = h2uVar.l;
                nm6 nm6Var = nm6.a;
                i = h2uVar.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    h2uVar.j = enoVar;
                    h2uVar.k = enoVar2;
                    h2uVar.n = 1;
                    apo apoVar = fvf.w;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    enoVar2 = h2uVar.k;
                    enoVar = h2uVar.j;
                    qgg.h0(obj);
                }
                act S = weo.S(200, 0, null, 6);
                int i3 = 18;
                mpq mpqVar = new mpq(19, new bca(zsd.u0(enoVar, zsd.d0(new f9l(17, new mpq(i3, zsd.b0(enoVar2), this)), 1)), i3), this);
                lxg lxgVar = new lxg(this, S, continuation, 4);
                h2uVar.j = null;
                h2uVar.k = null;
                h2uVar.n = 2;
            }
        }
        h2uVar = new h2u(this, cg6Var);
        Object obj2 = h2uVar.l;
        nm6 nm6Var2 = nm6.a;
        i = h2uVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        act S2 = weo.S(200, 0, null, 6);
        int i32 = 18;
        mpq mpqVar2 = new mpq(19, new bca(zsd.u0(enoVar, zsd.d0(new f9l(17, new mpq(i32, zsd.b0(enoVar2), this)), 1)), i32), this);
        lxg lxgVar2 = new lxg(this, S2, continuation2, 4);
        h2uVar.j = null;
        h2uVar.k = null;
        h2uVar.n = 2;
    }
}
