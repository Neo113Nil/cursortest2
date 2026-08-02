package defpackage;

import ru.yandex.music.common.media.context.c;

/* loaded from: classes5.dex */
public final class qe5 {
    public final c a;
    public final sfm b;
    public final pe5 c;
    public final r0q d;
    public int e;
    public long f;
    public mqs g;
    public int h;
    public hyn i;
    public tb j;
    public boolean k;
    public String l;

    public qe5(c cVar, sfm sfmVar, pe5 pe5Var) {
        cVar.getClass();
        this.a = cVar;
        this.b = sfmVar;
        this.c = pe5Var;
        this.d = new r0q(0);
        this.e = -1;
        this.f = -1L;
        this.j = new tb(null);
    }

    public final void a(oq oqVar) {
        this.j = new tb(oqVar);
    }

    public final se5 b() {
        return new se5(new ubn(), this.a, this.b, this.i, this.h, null, this.g, this.e, this.f, this.c, this.j, this.k, this.l, this.d);
    }

    public final void c(cvl cvlVar) {
        this.j = new tb(cvlVar);
    }

    public final void d(int i) {
        if (i == 0) {
            throw null;
        }
        this.h = i;
    }
}
