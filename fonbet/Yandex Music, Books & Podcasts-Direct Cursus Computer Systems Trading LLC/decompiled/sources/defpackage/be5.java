package defpackage;

import android.content.Context;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final class be5 extends m18 {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rmb c;
    public final /* synthetic */ thj d;
    public final /* synthetic */ ce5 e;

    public be5(boolean z, rmb rmbVar, thj thjVar, ce5 ce5Var, int i) {
        this.b = z;
        this.c = rmbVar;
        this.d = thjVar;
        this.e = ce5Var;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        mqsVar.getClass();
        rmb.j(this.c, wjb.BottomsheetScreen, this.d, null, 12);
        ce5 ce5Var = this.e;
        qbj qbjVar = (qbj) ce5Var.c;
        oq oqVar = (oq) ce5Var.e;
        qbjVar.getClass();
        oqVar.getClass();
        qbjVar.d.J(mqsVar, null, oqVar, oqVar.F, zus.b);
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        mqsVar.getClass();
        boolean z = this.b;
        thj thjVar = this.d;
        rmb rmbVar = this.c;
        if (z) {
            rmb.j(rmbVar, wjb.AlbumScreen, thjVar, null, 12);
        }
        ce5 ce5Var = this.e;
        qbj qbjVar = (qbj) ce5Var.c;
        oq oqVar = (oq) ce5Var.e;
        ae5 ae5Var = new ae5(rmbVar, thjVar, 0);
        qbjVar.getClass();
        oqVar.getClass();
        mmo mmoVar = qbjVar.f;
        mmoVar.getClass();
        z5l z5lVar = (z5l) mmoVar.d;
        String t = weo.t();
        e eVar = (e) ((jyr) mmoVar.g).getValue();
        PlaybackScope playbackScope = (PlaybackScope) mmoVar.c;
        eVar.getClass();
        c a = e.a(playbackScope, oqVar);
        if (z5lVar.c(a, mqsVar, false)) {
            ae5Var.invoke(Boolean.valueOf(!z5lVar.i(false)), t);
        } else {
            a0g.G((Context) mmoVar.b, mqsVar, new os(mmoVar, t, a, mqsVar, oqVar, ae5Var, 0));
        }
    }
}
