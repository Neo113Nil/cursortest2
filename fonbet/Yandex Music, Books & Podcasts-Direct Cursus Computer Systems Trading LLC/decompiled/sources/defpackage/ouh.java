package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ouh implements dvh, evh {
    public final /* synthetic */ gvh a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ouh(gvh gvhVar, int i, int i2) {
        this.a = gvhVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.evh
    public void b(lrl lrlVar, wrh wrhVar, List list) {
        gvh gvhVar = this.a;
        lrlVar.G(gvhVar.M0(wrhVar, lrlVar, this.b), gvhVar.M0(wrhVar, lrlVar, this.c), list);
    }

    @Override // defpackage.dvh
    public void e(lrl lrlVar, wrh wrhVar) {
        gvh gvhVar = this.a;
        lrlVar.J(gvhVar.M0(wrhVar, lrlVar, this.b), gvhVar.M0(wrhVar, lrlVar, this.c));
    }
}
