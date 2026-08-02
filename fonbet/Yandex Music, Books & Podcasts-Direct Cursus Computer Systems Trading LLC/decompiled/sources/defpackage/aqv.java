package defpackage;

/* loaded from: classes.dex */
public abstract class aqv {
    public final kqv a;
    public zne[] b;

    public aqv() {
        this(new kqv((kqv) null));
    }

    public final void a() {
        zne[] zneVarArr = this.b;
        if (zneVarArr != null) {
            zne zneVar = zneVarArr[0];
            zne zneVar2 = zneVarArr[1];
            kqv kqvVar = this.a;
            if (zneVar2 == null) {
                zneVar2 = kqvVar.a.g(2);
            }
            if (zneVar == null) {
                zneVar = kqvVar.a.g(1);
            }
            g(zne.a(zneVar, zneVar2));
            zne zneVar3 = this.b[v5g.F(16)];
            if (zneVar3 != null) {
                f(zneVar3);
            }
            zne zneVar4 = this.b[v5g.F(32)];
            if (zneVar4 != null) {
                d(zneVar4);
            }
            zne zneVar5 = this.b[v5g.F(64)];
            if (zneVar5 != null) {
                h(zneVar5);
            }
        }
    }

    public abstract kqv b();

    public void c(int i, zne zneVar) {
        if (this.b == null) {
            this.b = new zne[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[v5g.F(i2)] = zneVar;
            }
        }
    }

    public abstract void e(zne zneVar);

    public abstract void g(zne zneVar);

    public aqv(kqv kqvVar) {
        this.a = kqvVar;
    }

    public void d(zne zneVar) {
    }

    public void f(zne zneVar) {
    }

    public void h(zne zneVar) {
    }
}
