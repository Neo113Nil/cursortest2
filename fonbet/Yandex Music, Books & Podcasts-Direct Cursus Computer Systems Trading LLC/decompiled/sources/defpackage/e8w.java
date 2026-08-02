package defpackage;

/* loaded from: classes4.dex */
public final class e8w {
    public static final e8w a = new e8w();
    public static final jyr b = btf.b(b8w.s);
    public static final jyr c = btf.b(b8w.t);

    public static void c() {
        if (b.getValue() == null) {
            return;
        }
        l1j.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        c8w c8wVar;
        int i;
        if (cg6Var instanceof c8w) {
            c8wVar = (c8w) cg6Var;
            int i2 = c8wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c8wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = c8wVar.j;
                nm6 nm6Var = nm6.a;
                i = c8wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    c();
                    r7o r7oVar = z7o.b;
                    return new si4();
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        c8wVar = new c8w(this, cg6Var);
        Object obj2 = c8wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = c8wVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z7o b(cg6 cg6Var) {
        d8w d8wVar;
        int i;
        if (cg6Var instanceof d8w) {
            d8wVar = (d8w) cg6Var;
            int i2 = d8wVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d8wVar.l = i2 - Integer.MIN_VALUE;
                Object obj = d8wVar.j;
                nm6 nm6Var = nm6.a;
                i = d8wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    c();
                    return null;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return new z7o(((z7o) obj).a);
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        d8wVar = new d8w(this, cg6Var);
        Object obj2 = d8wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = d8wVar.l;
        if (i != 0) {
        }
    }
}
