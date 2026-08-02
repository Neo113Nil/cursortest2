package defpackage;

/* loaded from: classes.dex */
public abstract class a86 {
    public static final soi a;

    static {
        rdo rdoVar = n95.e;
        int i = rdoVar.c;
        w76 w76Var = new w76(rdoVar, rdoVar, 1);
        int i2 = rdoVar.c;
        fpj fpjVar = n95.x;
        int i3 = (fpjVar.c << 6) | i2;
        z76 z76Var = new z76(rdoVar, fpjVar, 0);
        int i4 = (i2 << 6) | fpjVar.c;
        z76 z76Var2 = new z76(fpjVar, rdoVar, 0);
        soi soiVar = vpe.a;
        soi soiVar2 = new soi();
        soiVar2.h(i | (i << 6), w76Var);
        soiVar2.h(i3, z76Var);
        soiVar2.h(i4, z76Var2);
        a = soiVar2;
    }
}
