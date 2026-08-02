package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class kl1 extends s4k {
    public final boolean b;
    public final String c;
    public final nm1 d;
    public final cm1 e;
    public final cm1 f;
    public final jyr g;
    public final jyr h;
    public final int i;

    public kl1(boolean z, String str, nm1 nm1Var, cm1 cm1Var, cm1 cm1Var2) {
        str.getClass();
        nm1Var.getClass();
        this.b = z;
        this.c = str;
        this.d = nm1Var;
        this.e = cm1Var;
        this.f = cm1Var2;
        bdt I = hag.I(il1.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = l18Var.b(hag.I(ol1.class), true);
        this.i = 20;
    }

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1 A[Catch: IOException -> 0x0031, TryCatch #0 {IOException -> 0x0031, blocks: (B:11:0x002d, B:12:0x006d, B:18:0x003d, B:19:0x00ab, B:21:0x00b1, B:23:0x00ca, B:24:0x00ce, B:26:0x00d8, B:28:0x00dc, B:29:0x00e2, B:30:0x00e3, B:31:0x00e8, B:33:0x0044, B:37:0x0050, B:41:0x0078, B:42:0x007d, B:43:0x007e, B:45:0x0088, B:46:0x008e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8 A[Catch: IOException -> 0x0031, TryCatch #0 {IOException -> 0x0031, blocks: (B:11:0x002d, B:12:0x006d, B:18:0x003d, B:19:0x00ab, B:21:0x00b1, B:23:0x00ca, B:24:0x00ce, B:26:0x00d8, B:28:0x00dc, B:29:0x00e2, B:30:0x00e3, B:31:0x00e8, B:33:0x0044, B:37:0x0050, B:41:0x0078, B:42:0x007d, B:43:0x007e, B:45:0x0088, B:46:0x008e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        jl1 jl1Var;
        int i;
        ap0 ap0Var;
        rj6 rj6Var;
        try {
            if (cg6Var instanceof jl1) {
                jl1Var = (jl1) cg6Var;
                int i2 = jl1Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jl1Var.m = i2 - Integer.MIN_VALUE;
                    Object obj = jl1Var.k;
                    nm6 nm6Var = nm6.a;
                    i = jl1Var.m;
                    cm1 cm1Var = this.e;
                    Object[] objArr = 0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            cm1Var.invoke();
                            return new q4k((List) obj, null);
                        }
                        ap0Var = jl1Var.j;
                        qgg.h0(obj);
                        rj6Var = (rj6) obj;
                        if (rj6Var instanceof qj6) {
                            if (rj6Var instanceof pj6) {
                                throw ((pj6) rj6Var).a();
                            }
                            throw new x7j();
                        }
                        ql1 ql1Var = (ql1) ((qj6) rj6Var).a;
                        cm1Var.invoke();
                        ArrayList arrayList = ql1Var.a;
                        int i3 = ql1Var.b.c;
                        int i4 = ap0Var.a + 1;
                        return new q4k(arrayList, null, ap0Var.b * i4 < i3 ? Integer.valueOf(i4) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                    qgg.h0(obj);
                    int ordinal = this.d.ordinal();
                    String str = this.c;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            throw new x7j();
                        }
                        il1 il1Var = (il1) this.g.getValue();
                        jl1Var.m = 2;
                        il1Var.getClass();
                        obj = x97.V(dm6.b, new qi((Object) il1Var, (Object) str, (Continuation) (objArr == true ? 1 : 0), 9), jl1Var);
                        if (obj == nm6Var) {
                        }
                        cm1Var.invoke();
                        return new q4k((List) obj, null);
                    }
                    Integer num = (Integer) o4kVar.a();
                    ap0 ap0Var2 = new ap0(num != null ? num.intValue() : 0, this.i);
                    ol1 ol1Var = (ol1) this.h.getValue();
                    boolean z = this.b;
                    jl1Var.j = ap0Var2;
                    jl1Var.m = 1;
                    Object b = ol1Var.b(str, ap0Var2, z, jl1Var);
                    if (b != nm6Var) {
                        ap0Var = ap0Var2;
                        obj = b;
                        rj6Var = (rj6) obj;
                        if (rj6Var instanceof qj6) {
                        }
                    }
                    return nm6Var;
                }
            }
            if (i == 0) {
            }
        } catch (IOException e) {
            this.f.invoke();
            return new p4k(e);
        }
        jl1Var = new jl1(this, cg6Var);
        Object obj2 = jl1Var.k;
        nm6 nm6Var2 = nm6.a;
        i = jl1Var.m;
        cm1 cm1Var2 = this.e;
        Object[] objArr2 = 0;
    }
}
