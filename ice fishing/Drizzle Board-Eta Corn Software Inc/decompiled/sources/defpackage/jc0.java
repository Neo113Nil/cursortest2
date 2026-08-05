package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jc0 implements j9 {
    public final ThreadLocal MdtA4re8;
    public final Object NCTxEWno;
    public final lc0 wxUZMvaN;

    public jc0(Object obj, ThreadLocal threadLocal) {
        this.NCTxEWno = obj;
        this.MdtA4re8 = threadLocal;
        this.wxUZMvaN = new lc0(threadLocal);
    }

    @Override // defpackage.l9
    public final j9 OnDfzHZD(k9 k9Var) {
        if (this.wxUZMvaN.equals(k9Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.l9
    public final Object Qr9iLBAD(Object obj, dl dlVar) {
        return dlVar.Qr9iLBAD(obj, this);
    }

    @Override // defpackage.l9
    public final l9 eVhOlqcC(l9 l9Var) {
        return fn.WYNAV5pd(this, l9Var);
    }

    @Override // defpackage.j9
    public final k9 getKey() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.l9
    public final l9 lDXGDhIF(k9 k9Var) {
        return this.wxUZMvaN.equals(k9Var) ? uf.NCTxEWno : this;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.NCTxEWno + ", threadLocal = " + this.MdtA4re8 + ')';
    }
}
