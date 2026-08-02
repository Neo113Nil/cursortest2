package defpackage;

/* loaded from: classes6.dex */
public class xb5 extends bd5 {
    public int w;

    public xb5() {
        super(eb5.class);
        this.w = -1;
    }

    @Override // defpackage.zc5
    public final void Cg() {
        ((eb5) Dg()).dismiss();
        super.Cg();
    }

    public Runnable Hg() {
        return pwf0.c;
    }

    public long Ig() {
        return -1L;
    }

    public void Jg(int i) {
        this.w = i;
        ((eb5) Dg()).t8(Ig(), Hg());
    }

    public void Kg() {
        ((eb5) Dg()).dismiss();
    }
}
