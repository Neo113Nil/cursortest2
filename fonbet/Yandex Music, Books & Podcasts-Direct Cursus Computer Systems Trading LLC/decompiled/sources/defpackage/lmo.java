package defpackage;

/* loaded from: classes.dex */
public final class lmo extends u7g {
    public float c = 0.0f;
    public final /* synthetic */ mmo d;

    public lmo(mmo mmoVar) {
        this.d = mmoVar;
    }

    @Override // defpackage.u7g
    public final void S(String str) {
        this.c = ((kmo) this.d.d).d.measureText(str) + this.c;
    }
}
