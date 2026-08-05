package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class n9 extends eVhOlqcC implements j9 {
    public static final m9 MdtA4re8 = new m9(re.MdtA4re8, new tKaxLBvG(3));

    public n9() {
        super(re.MdtA4re8);
    }

    public void FySoLYna(l9 l9Var, Runnable runnable) {
        RXQxj5Oe(l9Var, runnable);
    }

    @Override // defpackage.eVhOlqcC, defpackage.l9
    public final j9 OnDfzHZD(k9 k9Var) {
        j9 j9Var;
        k9Var.getClass();
        if (k9Var instanceof m9) {
            m9 m9Var = (m9) k9Var;
            k9 k9Var2 = this.NCTxEWno;
            if ((k9Var2 == m9Var || m9Var.MdtA4re8 == k9Var2) && (j9Var = (j9) m9Var.NCTxEWno.ow5vqvCr(this)) != null) {
                return j9Var;
            }
        } else if (re.MdtA4re8 == k9Var) {
            return this;
        }
        return null;
    }

    public abstract void RXQxj5Oe(l9 l9Var, Runnable runnable);

    public n9 WYNAV5pd(int i) {
        ra.ow5vqvCr(i);
        return new zo(this, i);
    }

    public boolean gjV1z5T1(l9 l9Var) {
        return !(this instanceof ve0);
    }

    @Override // defpackage.eVhOlqcC, defpackage.l9
    public final l9 lDXGDhIF(k9 k9Var) {
        k9Var.getClass();
        if (k9Var instanceof m9) {
            m9 m9Var = (m9) k9Var;
            k9 k9Var2 = this.NCTxEWno;
            if (k9Var2 != m9Var && m9Var.MdtA4re8 != k9Var2) {
                return this;
            }
            if (((j9) m9Var.NCTxEWno.ow5vqvCr(this)) == null) {
                return this;
            }
        } else if (re.MdtA4re8 != k9Var) {
            return this;
        }
        return uf.NCTxEWno;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ra.I5GHvsYW(this);
    }
}
