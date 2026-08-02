package flex.signals;

import defpackage.a5p0;
import defpackage.bvf0;
import defpackage.i7;
import defpackage.ike;
import defpackage.j400;
import defpackage.l1o;
import defpackage.nbs0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.u1m;
import defpackage.ukr0;
import defpackage.uyj;
import defpackage.ywl;
import defpackage.zse;

/* loaded from: classes4.dex */
public final class a extends i7 {
    public final nbs0 a;
    public boolean b;
    public final ike c;
    public tls d;

    public a(nbs0 nbs0Var) {
        this.a = nbs0Var;
        sjh sjhVar = uyj.a;
        this.c = bvf0.a((j400) zse.a.b);
        this.d = new ukr0(13);
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void dispose() {
        this.d = new ukr0(13);
        bvf0.j(this.c, null);
        this.b = false;
    }

    @Override // defpackage.i7, defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
        this.d = new a5p0(this, ywlVar, l1oVar);
        if (this.b) {
            return;
        }
        sjh sjhVar = uyj.a;
        tje.N(this.c, ((j400) zse.a.b).R(), null, new SignalDocumentTracker$subscribeOnSignalSubject$1(this, null), 2);
        this.b = true;
    }
}
