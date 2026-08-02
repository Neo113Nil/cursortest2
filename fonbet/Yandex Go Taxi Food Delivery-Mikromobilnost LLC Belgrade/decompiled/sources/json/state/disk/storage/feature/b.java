package json.state.disk.storage.feature;

import defpackage.bvf0;
import defpackage.ike;
import defpackage.j400;
import defpackage.j6x;
import defpackage.jl40;
import defpackage.jse;
import defpackage.k6x;
import defpackage.sjh;
import defpackage.sr3;
import defpackage.tje;
import defpackage.uyj;
import defpackage.xfz;
import defpackage.zjr;
import defpackage.zse;

/* loaded from: classes9.dex */
public final class b {
    public final k6x a;
    public final c b;
    public final zjr c = new zjr(xfz.b(b.class.getSimpleName()));
    public final ike d;
    public j6x e;

    public b(k6x k6xVar, c cVar) {
        this.a = k6xVar;
        this.b = cVar;
        sr3 sr3Var = new sr3(this);
        sjh sjhVar = uyj.a;
        this.d = bvf0.a(((jse) zse.a.c).plus(jl40.a()).plus(sr3Var));
    }

    public final void a() {
        sjh sjhVar = uyj.a;
        tje.N(this.d, ((j400) zse.a.b).R(), null, new JasonStateDiskStorageDaemon$start$1(this, null), 2);
    }

    public final void b() {
        sjh sjhVar = uyj.a;
        tje.N(this.d, ((j400) zse.a.b).R(), null, new JasonStateDiskStorageDaemon$stop$1(this, null), 2);
    }
}
