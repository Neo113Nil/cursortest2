package defpackage;

import androidx.media3.session.i;

/* loaded from: classes.dex */
public final /* synthetic */ class q56 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ wrh c;

    public /* synthetic */ q56(i iVar, wrh wrhVar, int i) {
        this.a = i;
        this.b = iVar;
        this.c = wrhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                if (!iVar.k()) {
                    if (iVar.A) {
                        wrh wrhVar = this.c;
                        if (!i.l(wrhVar)) {
                            if (iVar.j(wrhVar)) {
                                iVar.A = false;
                            }
                        }
                    }
                    iVar.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.O0(this.c, Integer.MIN_VALUE, 1, gvh.Q0(new dlh(16)));
                break;
            case 2:
                gvh gvhVar = this.b.g;
                gvhVar.getClass();
                wrh wrhVar2 = this.c;
                gvhVar.O0(wrhVar2, Integer.MIN_VALUE, 1, gvh.Q0(new v13(29, gvhVar, wrhVar2)));
                break;
            case 3:
                gvh gvhVar2 = this.b.g;
                gvhVar2.getClass();
                wrh wrhVar3 = this.c;
                gvhVar2.O0(wrhVar3, Integer.MIN_VALUE, 1, gvh.Q0(new v13(29, gvhVar2, wrhVar3)));
                break;
            case 4:
                this.b.g.O0(this.c, Integer.MIN_VALUE, 1, gvh.Q0(new dlh(16)));
                break;
            case 5:
                this.b.g.O0(this.c, Integer.MIN_VALUE, 9, gvh.Q0(new dlh(24)));
                break;
            case 6:
                this.b.g.O0(this.c, Integer.MIN_VALUE, 7, gvh.Q0(new dlh(20)));
                break;
            case 7:
                this.b.g.O0(this.c, Integer.MIN_VALUE, 12, gvh.Q0(new dlh(23)));
                break;
            case 8:
                this.b.g.O0(this.c, Integer.MIN_VALUE, 11, gvh.Q0(new dlh(19)));
                break;
            default:
                this.b.g.O0(this.c, Integer.MIN_VALUE, 3, gvh.Q0(new dlh(29)));
                break;
        }
    }
}
