package defpackage;

/* loaded from: classes.dex */
public final class vh extends defpackage.x9 {
    public final defpackage.t9 fnWB2E7cs;

    public vh(int i, defpackage.t9 t9Var) {
        super(i);
        this.fnWB2E7cs = t9Var;
        if (t9Var == defpackage.t9.adDC3e2L) {
            defpackage.db.QoRHpC4k("This implementation does not support suspension for senders, use ", defpackage.sz0.IHQe1A4L2xu(defpackage.x9.class).r1MBDhnF(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        defpackage.db.adDC3e2L(defpackage.fx0.riuEU0zW4(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.x9, defpackage.w71
    public final java.lang.Object IHQe1A4L2xu(defpackage.ej ejVar, java.lang.Object obj) {
        if (TFRaUu83X3E(obj, true) instanceof defpackage.bc) {
            throw fnWB2E7cs();
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    public final java.lang.Object TFRaUu83X3E(java.lang.Object obj, boolean z) {
        if (this.fnWB2E7cs != defpackage.t9.AARZUJiTa) {
            return hyxIchWRW(obj);
        }
        java.lang.Object riuEU0zW4 = super.riuEU0zW4(obj);
        return (!(riuEU0zW4 instanceof defpackage.cc) || (riuEU0zW4 instanceof defpackage.bc)) ? riuEU0zW4 : defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.x9
    public final boolean UsuH8pd5P() {
        return this.fnWB2E7cs == defpackage.t9.xiZrDbcSW0;
    }

    @Override // defpackage.x9, defpackage.w71
    public final java.lang.Object riuEU0zW4(java.lang.Object obj) {
        return TFRaUu83X3E(obj, false);
    }
}
