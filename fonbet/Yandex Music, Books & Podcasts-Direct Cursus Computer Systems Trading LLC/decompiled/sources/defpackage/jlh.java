package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public final /* synthetic */ class jlh implements qlh {
    public final /* synthetic */ int a;
    public final /* synthetic */ ulh b;
    public final /* synthetic */ Surface c;

    public /* synthetic */ jlh(ulh ulhVar, Surface surface, int i) {
        this.a = i;
        this.b = ulhVar;
        this.c = surface;
    }

    @Override // defpackage.qlh
    public final void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 0:
                c9eVar.y0(this.b.c, i, this.c);
                break;
            default:
                c9eVar.y0(this.b.c, i, this.c);
                break;
        }
    }
}
