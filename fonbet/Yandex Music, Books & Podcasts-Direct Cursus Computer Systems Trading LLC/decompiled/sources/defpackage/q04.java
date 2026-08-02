package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class q04 {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public q04(int i) {
        switch (i) {
            case 1:
                bdt I = hag.I(skr.class);
                l18 l18Var = l18.b;
                this.a = l18Var.b(I, true);
                this.b = l18Var.b(hag.I(ow4.class), true);
                final int i2 = 0;
                this.c = btf.b(new Function0(this) { // from class: ola
                    public final /* synthetic */ q04 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return ((ow4) this.b.b.getValue()).e;
                            case 1:
                                return ((ow4) this.b.b.getValue()).f;
                            default:
                                return ((ow4) this.b.b.getValue()).g;
                        }
                    }
                });
                final int i3 = 1;
                this.d = btf.b(new Function0(this) { // from class: ola
                    public final /* synthetic */ q04 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return ((ow4) this.b.b.getValue()).e;
                            case 1:
                                return ((ow4) this.b.b.getValue()).f;
                            default:
                                return ((ow4) this.b.b.getValue()).g;
                        }
                    }
                });
                final int i4 = 2;
                this.e = btf.b(new Function0(this) { // from class: ola
                    public final /* synthetic */ q04 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return ((ow4) this.b.b.getValue()).e;
                            case 1:
                                return ((ow4) this.b.b.getValue()).f;
                            default:
                                return ((ow4) this.b.b.getValue()).g;
                        }
                    }
                });
                break;
            default:
                bdt I2 = hag.I(dp1.class);
                l18 l18Var2 = l18.b;
                this.a = l18Var2.b(I2, true);
                this.b = l18Var2.b(hag.I(jp1.class), true);
                this.c = btf.b(new uf3(6));
                this.d = btf.b(new uf3(7));
                this.e = btf.b(new uf3(8));
                break;
        }
    }

    public static p21 a() {
        fz3 fz3Var;
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String b = ((gz3) ((byb) qdcVar.C(I)).b(gz3.class)).b();
        int hashCode = b.hashCode();
        if (hashCode == -1939100487) {
            if (b.equals("expanded")) {
                fz3Var = fz3.c;
            }
            fz3Var = fz3.a;
        } else if (hashCode != 115029) {
            if (hashCode == 1544803905 && b.equals("default")) {
                fz3Var = fz3.a;
            }
            fz3Var = fz3.a;
        } else {
            if (b.equals("top")) {
                fz3Var = fz3.b;
            }
            fz3Var = fz3.a;
        }
        int ordinal = fz3Var.ordinal();
        if (ordinal == 0) {
            return p21.a;
        }
        if (ordinal == 1) {
            return p21.b;
        }
        if (ordinal == 2) {
            return p21.c;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(cg6 cg6Var) {
        pla plaVar;
        int i;
        if (cg6Var instanceof pla) {
            plaVar = (pla) cg6Var;
            int i2 = plaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = plaVar.j;
                nm6 nm6Var = nm6.a;
                i = plaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    plaVar.l = 1;
                    obj = gld.Q(new st7(this, null), plaVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new qj6(obj);
            }
        }
        plaVar = new pla(this, cg6Var);
        Object obj2 = plaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = plaVar.l;
        if (i != 0) {
        }
        return new qj6(obj2);
    }

    public q04(ia0 ia0Var, l13 l13Var) {
        this.a = btf.b(new e1v(ia0Var, 2));
        this.b = btf.b(new e1v(ia0Var, 3));
        this.c = btf.b(new e1v(ia0Var, 4));
        this.d = btf.b(new h4d(l13Var, 14));
        this.e = btf.b(new e1v(ia0Var, 5));
    }
}
