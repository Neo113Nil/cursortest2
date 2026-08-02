package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class h92 {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public h92(final b7q b7qVar) {
        final int i = 0;
        this.a = btf.b(new Function0() { // from class: f92
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        b7q b7qVar2 = b7qVar;
                        bdt I = hag.I(z66.class);
                        qdc qdcVar = b7qVar2.a;
                        qdcVar.getClass();
                        return ((z66) qdcVar.C(I)).d();
                    default:
                        b7q b7qVar3 = b7qVar;
                        bdt I2 = hag.I(dl2.class);
                        qdc qdcVar2 = b7qVar3.a;
                        qdcVar2.getClass();
                        return ((dl2) qdcVar2.C(I2)).a.k;
                }
            }
        });
        final int i2 = 1;
        this.b = btf.b(new Function0() { // from class: f92
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        b7q b7qVar2 = b7qVar;
                        bdt I = hag.I(z66.class);
                        qdc qdcVar = b7qVar2.a;
                        qdcVar.getClass();
                        return ((z66) qdcVar.C(I)).d();
                    default:
                        b7q b7qVar3 = b7qVar;
                        bdt I2 = hag.I(dl2.class);
                        qdc qdcVar2 = b7qVar3.a;
                        qdcVar2.getClass();
                        return ((dl2) qdcVar2.C(I2)).a.k;
                }
            }
        });
        this.c = b7qVar.b(hag.I(px1.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        g92 g92Var;
        int i;
        int i2;
        yzi yziVar;
        int i3;
        if (cg6Var instanceof g92) {
            g92Var = (g92) cg6Var;
            int i4 = g92Var.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g92Var.o = i4 - Integer.MIN_VALUE;
                Object obj = g92Var.m;
                nm6 nm6Var = nm6.a;
                i = g92Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    zzi zziVar = (zzi) ((vdr) this.a.getValue()).getValue();
                    i2 = ((h6r) ((vdr) this.b.getValue()).getValue()).a;
                    int i5 = zziVar.c;
                    yzi yziVar2 = zziVar.b;
                    px1 px1Var = (px1) this.c.getValue();
                    g92Var.j = yziVar2;
                    g92Var.k = i2;
                    g92Var.l = i5;
                    g92Var.o = 1;
                    px1Var.getClass();
                    Object V = x97.V(dm6.b(), new ox1(px1Var, null, 0), g92Var);
                    if (V == nm6Var) {
                        return nm6Var;
                    }
                    yziVar = yziVar2;
                    obj = V;
                    i3 = i5;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = g92Var.l;
                    i2 = g92Var.k;
                    yziVar = g92Var.j;
                    qgg.h0(obj);
                }
                return new e92(i2, i3, yziVar, (qx1) obj);
            }
        }
        g92Var = new g92(this, cg6Var);
        Object obj2 = g92Var.m;
        nm6 nm6Var2 = nm6.a;
        i = g92Var.o;
        if (i != 0) {
        }
        return new e92(i2, i3, yziVar, (qx1) obj2);
    }
}
