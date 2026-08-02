package defpackage;

/* loaded from: classes3.dex */
public final class bz4 implements nnq {
    public final /* synthetic */ int a = 0;
    public final tmb b;
    public final uvf c;
    public final Object d;
    public final nnq e;

    public bz4(fnb fnbVar, cvo cvoVar, tmb tmbVar, zh zhVar) {
        cvoVar.getClass();
        zhVar.getClass();
        this.b = tmbVar;
        jnq jnqVar = new jnq(fnbVar, cvoVar);
        this.d = l18.b.b(hag.I(ow4.class), true);
        uvf uvfVar = new uvf(new m32(22, this, zhVar));
        uvfVar.e(qne.u(new qne(14), jnqVar, tmbVar));
        uvfVar.d();
        qrf qrfVar = new qrf(new v5(25, this));
        pvf pvfVar = qrfVar.a;
        pvfVar.getClass();
        pvf pvfVar2 = uvfVar.b;
        pvfVar2.getClass();
        pvfVar.a.putAll(pvfVar2.a);
        this.e = qrfVar;
        this.c = uvfVar;
    }

    @Override // defpackage.nnq
    public final prf a(String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                return ((qrf) this.e).a(str);
            default:
                str.getClass();
                return this.c.a(str);
        }
    }

    public bz4(kxi kxiVar, cvo cvoVar, tmb tmbVar) {
        cvoVar.getClass();
        fnb fnbVar = kxiVar.a;
        jnq jnqVar = new jnq(fnbVar, cvoVar);
        this.d = jnqVar;
        tmb tmbVar2 = new tmb(12, fnbVar, cvoVar);
        this.b = tmbVar2;
        uvf uvfVar = new uvf(new q6h(11, this, tmbVar, kxiVar));
        uvfVar.e(qne.u(new qne(14), jnqVar, tmbVar2));
        uvfVar.d();
        this.c = uvfVar;
        this.e = uvfVar;
    }
}
