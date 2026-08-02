package defpackage;

import java.util.List;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes4.dex */
public final class m2n implements n2n {
    public final l9b a;
    public final List b;
    public final c c;
    public final String d;
    public final kxi e;

    public m2n(l9b l9bVar, List list, c cVar, String str, kxi kxiVar) {
        l9bVar.getClass();
        list.getClass();
        str.getClass();
        kxiVar.getClass();
        this.a = l9bVar;
        this.b = list;
        this.c = cVar;
        this.d = str;
        this.e = kxiVar;
    }

    @Override // defpackage.n2n
    public final Cnew a() {
        qe5 h;
        qe5 h2;
        kew kewVar = Cnew.a;
        String G = this.e.a.G();
        kewVar.getClass();
        l9b l9bVar = this.a;
        l9bVar.getClass();
        List list = this.b;
        list.getClass();
        G.getClass();
        a6l a6lVar = new a6l(new gxc(G, weo.t()), null);
        boolean z = l9bVar instanceof mqs;
        c cVar = this.c;
        if (z) {
            h2 = l3l.h(cVar, t75.c(l9bVar), a6lVar);
        } else {
            if (l9bVar instanceof oq) {
                h = list.isEmpty() ^ true ? l3l.h(cVar, list, a6lVar) : l3l.f(cVar, new qxp((oq) l9bVar), a6lVar);
                h.a((oq) l9bVar);
            } else if (l9bVar instanceof c01) {
                h2 = list.isEmpty() ^ true ? l3l.h(cVar, list, a6lVar) : l3l.f(cVar, new f4m((c01) l9bVar), a6lVar);
            } else {
                if (!(l9bVar instanceof cvl)) {
                    ssg.a(6, kew.b, (l9bVar.getClass().getSimpleName() + "(" + System.identityHashCode(l9bVar) + ")").concat(": not supported as Ynison cast target "), null);
                    return null;
                }
                h = list.isEmpty() ^ true ? l3l.h(cVar, list, a6lVar) : l3l.f(cVar, new n3m((cvl) l9bVar), a6lVar);
                h.c((cvl) l9bVar);
            }
            h2 = h;
        }
        return new mew(h2.b());
    }

    @Override // defpackage.n2n
    public final vgd b() {
        l9b l9bVar = this.a;
        l9bVar.getClass();
        String str = this.d;
        str.getClass();
        if (l9bVar instanceof mqs) {
            mqs mqsVar = (mqs) l9bVar;
            ygd ygdVar = new ygd(mqsVar.a, mqsVar.e, null);
            return new tgd(ygdVar, rre.U(ygdVar, false, 0.0d), str);
        }
        if (l9bVar instanceof oq) {
            return new pgd(ngd.ALBUM, ((oq) l9bVar).a, null, str, null);
        }
        if (l9bVar instanceof c01) {
            return new pgd(ngd.ARTIST, ((c01) l9bVar).a, null, str, null);
        }
        if (l9bVar instanceof cvl) {
            return new pgd(ngd.PLAYLIST, ((cvl) l9bVar).e(), null, str, null);
        }
        ssg.a(5, null, l9bVar.getClass().getCanonicalName() + " is not supported by Glagol", null);
        return null;
    }
}
