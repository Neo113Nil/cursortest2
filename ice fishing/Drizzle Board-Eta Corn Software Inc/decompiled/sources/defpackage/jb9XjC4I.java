package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class jb9XjC4I extends vn implements g9, t9 {
    public final l9 wxUZMvaN;

    public jb9XjC4I(l9 l9Var, boolean z) {
        super(z);
        eIA6dogk((vn) l9Var.OnDfzHZD(re.VgvYg0wo));
        this.wxUZMvaN = l9Var.eVhOlqcC(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ESscZ9M1(w9 w9Var, jb9XjC4I jb9xjc4i, dl dlVar) {
        int ordinal = w9Var.ordinal();
        xe0 xe0Var = xe0.qoPGr6Ce;
        if (ordinal == 0) {
            try {
                fn.i7xS8jrb(w30.SgZGMMPL(((h9) dlVar).lDXGDhIF(this, jb9xjc4i)), xe0Var);
                return;
            } finally {
                P7K7Inc8(new k30(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                w30.SgZGMMPL(((h9) dlVar).lDXGDhIF(this, jb9xjc4i)).P7K7Inc8(xe0Var);
                return;
            }
            if (ordinal != 3) {
                throw new d7();
            }
            try {
                l9 l9Var = this.wxUZMvaN;
                Object gmkaJpmS = w30.gmkaJpmS(l9Var, null);
                try {
                    le0.VgvYg0wo(2, dlVar);
                    Object Qr9iLBAD = dlVar.Qr9iLBAD(jb9xjc4i, this);
                    if (Qr9iLBAD != u9.NCTxEWno) {
                        P7K7Inc8(Qr9iLBAD);
                    }
                } finally {
                    w30.FXJmAAN1(l9Var, gmkaJpmS);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // defpackage.vn
    public final void FXJmAAN1(Object obj) {
        if (!(obj instanceof c7)) {
            g2aRJUAd(obj);
        } else {
            c7 c7Var = (c7) obj;
            TrssYQ34(c7Var.qoPGr6Ce, b1.qoPGr6Ce.getIntVolatile(c7Var, c7.NCTxEWno) != 0);
        }
    }

    @Override // defpackage.vn
    public final String I5GHvsYW() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.g9
    public final void P7K7Inc8(Object obj) {
        Throwable qoPGr6Ce = l30.qoPGr6Ce(obj);
        if (qoPGr6Ce != null) {
            obj = new c7(qoPGr6Ce, false);
        }
        Object Xkz7p5xa = Xkz7p5xa(obj);
        if (Xkz7p5xa == fn.k3x7lurq) {
            return;
        }
        OxcuoDLp(Xkz7p5xa);
    }

    @Override // defpackage.t9
    public final l9 VgvYg0wo() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.g9
    public final l9 wxUZMvaN() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.vn
    public final void ytu5o6f4(d7 d7Var) {
        ej0.gjV1z5T1(this.wxUZMvaN, d7Var);
    }

    public void g2aRJUAd(Object obj) {
    }

    public void TrssYQ34(Throwable th, boolean z) {
    }
}
