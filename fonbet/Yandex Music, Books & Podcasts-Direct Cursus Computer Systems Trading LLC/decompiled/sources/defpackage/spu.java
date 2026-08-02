package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class spu implements rpu {
    public final fqu a;
    public final lpu b;
    public final xdr c;
    public final dkn d;

    public spu(fqu fquVar, lpu lpuVar) {
        this.a = fquVar;
        this.b = lpuVar;
        this.c = fquVar.r;
        this.d = fquVar.t;
        fquVar.H();
    }

    @Override // defpackage.rpu
    public final void a() {
        tnb b;
        fqu fquVar = this.a;
        atn atnVar = fquVar.p;
        wjb E = asq.E((cqu) fquVar.q.getValue());
        atnVar.getClass();
        tmb tmbVar = (tmb) ((LinkedHashMap) atnVar.c).remove(E);
        if (tmbVar == null || (b = tmbVar.b()) == null) {
            return;
        }
        b.b();
    }

    @Override // defpackage.rpu
    public final void b() {
        lgq lgqVar = new lgq(1, this.b, lpu.class, "showSystemSharingBottomSheet", "showSystemSharingBottomSheet(Ljava/lang/String;)V", 0, 22);
        fqu fquVar = this.a;
        rar rarVar = fquVar.w;
        if (rarVar == null || !rarVar.b()) {
            fquVar.L(true);
            fquVar.w = x97.y(ot0.F(fquVar), fquVar.x, null, new npt(fquVar, lgqVar, (Continuation) null, 15), 2);
        }
    }

    @Override // defpackage.rpu
    public final void c() {
        fqu fquVar = this.a;
        fquVar.J(fquVar.k);
    }

    @Override // defpackage.rpu
    public final pjc d() {
        return this.d;
    }

    @Override // defpackage.rpu
    public final void e() {
        this.b.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("yandexmusic://collection/multivibes")));
        this.a.s.a(Unit.a);
    }

    @Override // defpackage.rpu
    public final void f(dou douVar) {
        wjb wjbVar = wjb.MultivibeAlreadyExistScreen;
        douVar.getClass();
        this.a.G(douVar, wjbVar);
    }

    @Override // defpackage.rpu
    public final void g(String str) {
        str.getClass();
        lgq lgqVar = new lgq(1, this.b, lpu.class, "showSystemSharingBottomSheet", "showSystemSharingBottomSheet(Ljava/lang/String;)V", 0, 23);
        String G = wdg.G(str);
        fqu fquVar = this.a;
        rmb.k(fquVar.p.S(asq.E((cqu) fquVar.r.getValue())).a(new jab(qkb.InformationBlock, 1, 1, 0), null), G, y7g.I(0, 0, G), null, 4);
        lgqVar.invoke(G);
        fquVar.s.a(Unit.a);
    }

    @Override // defpackage.rpu
    public final xdr getState() {
        return this.c;
    }

    @Override // defpackage.rpu
    public final void i() {
        this.a.H();
    }
}
