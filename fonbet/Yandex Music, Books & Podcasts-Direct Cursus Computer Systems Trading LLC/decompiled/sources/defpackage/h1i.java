package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class h1i extends s4k {
    public final String b;
    public final l1i c;
    public final l1i d;
    public final jyr e;
    public final int f;

    public h1i(String str, l1i l1iVar, l1i l1iVar2) {
        str.getClass();
        this.b = str;
        this.c = l1iVar;
        this.d = l1iVar2;
        this.e = l18.b.b(hag.I(k2i.class), true);
        this.f = 25;
    }

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        g1i g1iVar;
        int i;
        ap0 ap0Var;
        rj6 rj6Var;
        if (cg6Var instanceof g1i) {
            g1iVar = (g1i) cg6Var;
            int i2 = g1iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g1iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = g1iVar.k;
                nm6 nm6Var = nm6.a;
                i = g1iVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Integer num = (Integer) o4kVar.a();
                    ap0 ap0Var2 = new ap0(num != null ? num.intValue() : 0, this.f);
                    k2i k2iVar = (k2i) this.e.getValue();
                    g1iVar.j = ap0Var2;
                    g1iVar.m = 1;
                    Object b = k2iVar.b(this.b, ap0Var2, g1iVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                    obj = b;
                    ap0Var = ap0Var2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ap0Var = g1iVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        this.d.invoke();
                        return new p4k(((pj6) rj6Var).a());
                    }
                    b6e.s();
                    return null;
                }
                List list = ((o0i) ((qj6) rj6Var).a).d;
                this.c.invoke();
                Integer a = ap0Var.a();
                if (list.isEmpty()) {
                    a = null;
                }
                return new q4k(list, a);
            }
        }
        g1iVar = new g1i(this, cg6Var);
        Object obj2 = g1iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = g1iVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
