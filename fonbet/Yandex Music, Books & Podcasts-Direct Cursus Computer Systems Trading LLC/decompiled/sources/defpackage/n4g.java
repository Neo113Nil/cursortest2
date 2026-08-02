package defpackage;

import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class n4g {
    public final y a;
    public final g4g b;
    public final pjc c;
    public final p4g d;
    public final mm6 e;
    public rar f;

    public n4g(y yVar, g4g g4gVar, pjc pjcVar, p4g p4gVar, tf6 tf6Var) {
        pjcVar.getClass();
        p4gVar.getClass();
        tf6Var.getClass();
        this.a = yVar;
        this.b = g4gVar;
        this.c = pjcVar;
        this.d = p4gVar;
        this.e = tf6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r7.b(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (defpackage.zsd.h0(r2, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n4g n4gVar, cg6 cg6Var) {
        m4g m4gVar;
        int i;
        if (cg6Var instanceof m4g) {
            m4gVar = (m4g) cg6Var;
            int i2 = m4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = m4gVar.j;
                Object obj2 = nm6.a;
                i = m4gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ifd ifdVar = new ifd(zsd.b0(n4gVar.c), 19);
                    j4g j4gVar = new j4g(n4gVar, null, 1);
                    m4gVar.l = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                m4gVar.l = 2;
            }
        }
        m4gVar = new m4g(n4gVar, cg6Var);
        Object obj3 = m4gVar.j;
        Object obj22 = nm6.a;
        i = m4gVar.l;
        if (i != 0) {
        }
        m4gVar.l = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (defpackage.x97.V(r8, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (defpackage.y2x.o(1000, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        k4g k4gVar;
        int i;
        if (cg6Var instanceof k4g) {
            k4gVar = (k4g) cg6Var;
            int i2 = k4gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k4gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = k4gVar.j;
                nm6 nm6Var = nm6.a;
                i = k4gVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    k4gVar.l = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                dq7 dq7Var = ca8.a;
                bsd bsdVar = j5h.a;
                ox1 ox1Var = new ox1(this, continuation, 25);
                k4gVar.l = 2;
            }
        }
        k4gVar = new k4g(this, cg6Var);
        Object obj2 = k4gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = k4gVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        dq7 dq7Var2 = ca8.a;
        bsd bsdVar2 = j5h.a;
        ox1 ox1Var2 = new ox1(this, continuation2, 25);
        k4gVar.l = 2;
    }
}
