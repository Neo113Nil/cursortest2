package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class puh implements dvh, evh {
    public final /* synthetic */ int a;
    public final /* synthetic */ gvh b;
    public final /* synthetic */ int c;

    public /* synthetic */ puh(gvh gvhVar, int i, int i2) {
        this.a = i2;
        this.b = gvhVar;
        this.c = i;
    }

    @Override // defpackage.evh
    public void b(lrl lrlVar, wrh wrhVar, List list) {
        switch (this.a) {
            case 1:
                lrlVar.K0(list, this.b.M0(wrhVar, lrlVar, this.c));
                break;
            case 2:
                int size = list.size();
                gvh gvhVar = this.b;
                int i = this.c;
                if (size != 1) {
                    lrlVar.G(gvhVar.M0(wrhVar, lrlVar, i), gvhVar.M0(wrhVar, lrlVar, i + 1), list);
                    break;
                } else {
                    lrlVar.W(gvhVar.M0(wrhVar, lrlVar, i), (onh) list.get(0));
                    break;
                }
            default:
                lrlVar.K0(list, this.b.M0(wrhVar, lrlVar, this.c));
                break;
        }
    }

    @Override // defpackage.dvh
    public void e(lrl lrlVar, wrh wrhVar) {
        switch (this.a) {
            case 0:
                lrlVar.q0(this.b.M0(wrhVar, lrlVar, this.c));
                break;
            default:
                lrlVar.I(this.b.M0(wrhVar, lrlVar, this.c));
                break;
        }
    }
}
