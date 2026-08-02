package defpackage;

/* loaded from: classes5.dex */
public final class mwe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0o b;

    public /* synthetic */ mwe(r0o r0oVar, int i) {
        this.a = i;
        this.b = r0oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0o r0oVar = this.b;
                owe oweVar = (owe) r0oVar.d;
                oweVar.m = null;
                if (oweVar.w == null) {
                    kwe kweVar = oweVar.t;
                    kwe kweVar2 = (kwe) r0oVar.c;
                    if (kweVar == kweVar2) {
                        oweVar.u = kweVar2;
                        owe oweVar2 = (owe) this.b.d;
                        oweVar2.t = null;
                        owe.e(oweVar2, r76.b);
                        break;
                    }
                } else {
                    o2g.U("Unexpected non-null activeTransport", oweVar.u == null);
                    r0o r0oVar2 = this.b;
                    ((kwe) r0oVar2.c).b(((owe) r0oVar2.d).w);
                    break;
                }
                break;
            default:
                r0o r0oVar3 = this.b;
                ((owe) r0oVar3.d).r.remove((kwe) r0oVar3.c);
                if (((owe) this.b.d).v.a == r76.e && ((owe) this.b.d).r.isEmpty()) {
                    owe oweVar3 = (owe) this.b.d;
                    oweVar3.j.execute(new gwe(oweVar3, 3));
                    break;
                }
                break;
        }
    }
}
