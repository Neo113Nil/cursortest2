package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class t2g implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2g b;
    public final /* synthetic */ xdr c;

    public /* synthetic */ t2g(w2g w2gVar, xdr xdrVar, int i) {
        this.a = i;
        this.b = w2gVar;
        this.c = xdrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        List c;
        z2g z2gVar;
        switch (this.a) {
            case 0:
                rrl rrlVar = (rrl) obj;
                w2g w2gVar = this.b;
                w2gVar.j = rrlVar != null ? rrlVar.a : null;
                xdr xdrVar = w2gVar.d;
                if (rrlVar != null) {
                    cvl cvlVar = rrlVar.a;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(skr.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    skr skrVar = (skr) qdcVar.C(I);
                    String str = cvlVar.b;
                    int i = cvlVar.g;
                    c5b c5bVar = c5b.a;
                    String b = skrVar.b(R.plurals.contest_playlist_min_tracks_quantity, i, tt0.C(i));
                    List list = rrlVar.c;
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            List<mqs> list2 = list;
                            c = new ArrayList(v75.o(list2, 10));
                            for (mqs mqsVar : list2) {
                                String w = vz1.w(mqsVar.x0.a);
                                qo6 qo6Var = qo6.a;
                                Integer R = pd.R(mqsVar.f().a);
                                c.add(R == null ? new sgs(qo6Var, w) : new tgs(w, qo6Var, c3x.f(R.intValue())));
                            }
                            obj2 = new z2g(kwl.b(str, R.drawable.ic_playlist_24, c5bVar, c, b, 2));
                        }
                    }
                    c = t75.c(new sgs(qo6.e, vz1.w(op7.c(cvlVar).a)));
                    obj2 = new z2g(kwl.b(str, R.drawable.ic_playlist_24, c5bVar, c, b, 2));
                } else {
                    obj2 = x2g.a;
                }
                xdrVar.getClass();
                xdrVar.m(null, obj2);
                this.c.m(null, rrlVar != null ? r2g.a : p2g.a);
                break;
            default:
                bzd bzdVar = (bzd) obj;
                xdr xdrVar2 = this.b.e;
                if (bzdVar != null) {
                    String str2 = bzdVar.a;
                    List list3 = bzdVar.c;
                    List<u9b> list4 = bzdVar.b;
                    ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                    for (u9b u9bVar : list4) {
                        int s = wct.s();
                        u9bVar.getClass();
                        String e = u9bVar.e(s, WebPath$Storage.AVATARS);
                        qo6 qo6Var2 = qo6.a;
                        Integer d = u9bVar.d();
                        e.getClass();
                        arrayList.add(d == null ? new sgs(qo6Var2, e) : new tgs(e, qo6Var2, c3x.f(d.intValue())));
                    }
                    z2gVar = new z2g(kwl.b(str2, R.drawable.ic_history_24, list3, arrayList, null, 2));
                } else {
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(skr.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    String c2 = ((skr) qdcVar2.C(I2)).c(R.string.listening_history_header_title);
                    c5b c5bVar2 = c5b.a;
                    z2gVar = new z2g(new zgs(R.drawable.ic_history_24, c2, null, c5bVar2, c5bVar2));
                }
                xdrVar2.getClass();
                xdrVar2.m(null, z2gVar);
                this.c.m(null, bzdVar != null ? r2g.a : p2g.a);
                break;
        }
        return Unit.a;
    }
}
