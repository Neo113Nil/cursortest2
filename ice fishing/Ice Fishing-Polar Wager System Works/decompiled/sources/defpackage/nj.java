package defpackage;

/* loaded from: classes.dex */
public abstract class nj extends defpackage.EgCjBq0SZwJ implements defpackage.jj {
    public static final defpackage.mj xiZrDbcSW0 = new defpackage.mj(defpackage.n.QQUzIjv3iOC5, new defpackage.JX5fKip1C6(11));

    public nj() {
        super(defpackage.n.QQUzIjv3iOC5);
    }

    public void D2vUnMij(defpackage.lj ljVar, java.lang.Runnable runnable) {
        v5iciZok(ljVar, runnable);
    }

    public defpackage.nj SiPhmbmu(int i) {
        defpackage.l80.riuEU0zW4(i);
        return new defpackage.de0(this, i);
    }

    @Override // defpackage.EgCjBq0SZwJ, defpackage.lj
    public final defpackage.lj V7bD7b8KA(defpackage.kj kjVar) {
        kjVar.getClass();
        if (kjVar instanceof defpackage.mj) {
            defpackage.mj mjVar = (defpackage.mj) kjVar;
            defpackage.kj kjVar2 = this.adDC3e2L;
            if (kjVar2 != mjVar && mjVar.xiZrDbcSW0 != kjVar2) {
                return this;
            }
            if (((defpackage.jj) mjVar.adDC3e2L.AARZUJiTa(this)) == null) {
                return this;
            }
        } else if (defpackage.n.QQUzIjv3iOC5 != kjVar) {
            return this;
        }
        return defpackage.lt.adDC3e2L;
    }

    @Override // defpackage.EgCjBq0SZwJ, defpackage.lj
    public final defpackage.jj cnag84Bm(defpackage.kj kjVar) {
        defpackage.jj jjVar;
        kjVar.getClass();
        if (kjVar instanceof defpackage.mj) {
            defpackage.mj mjVar = (defpackage.mj) kjVar;
            defpackage.kj kjVar2 = this.adDC3e2L;
            if ((kjVar2 == mjVar || mjVar.xiZrDbcSW0 == kjVar2) && (jjVar = (defpackage.jj) mjVar.adDC3e2L.AARZUJiTa(this)) != null) {
                return jjVar;
            }
        } else if (defpackage.n.QQUzIjv3iOC5 == kjVar) {
            return this;
        }
        return null;
    }

    public boolean frpfPPIgqM9O(defpackage.lj ljVar) {
        return !(this instanceof defpackage.kk1);
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + defpackage.fm.UsuH8pd5P(this);
    }

    public abstract void v5iciZok(defpackage.lj ljVar, java.lang.Runnable runnable);
}
