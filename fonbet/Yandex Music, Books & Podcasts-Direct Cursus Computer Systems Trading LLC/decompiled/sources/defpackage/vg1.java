package defpackage;

import android.content.Context;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class vg1 implements ug1 {
    public final yg1 a;
    public final sg1 b;
    public final rmb c;

    public vg1(yg1 yg1Var, sg1 sg1Var, rmb rmbVar) {
        this.a = yg1Var;
        this.b = sg1Var;
        this.c = rmbVar;
    }

    @Override // defpackage.ug1
    public final void a(boolean z, String str, lt ltVar) {
        str.getClass();
        weo.H(this.c, c3x.w(ltVar, 0, 0), z, str, null);
    }

    @Override // defpackage.ug1
    public final void b(lt ltVar) {
        ltVar.getClass();
        rmb.j(this.c, wjb.AlbumScreen, c3x.w(ltVar, 0, 0), null, 12);
        Context context = this.b.a;
        y7g.O(context, quj.V(context, ltVar, new h(Page.LAST_RELEASE)));
    }

    @Override // defpackage.ug1
    public final xdr getState() {
        return this.a.i;
    }
}
