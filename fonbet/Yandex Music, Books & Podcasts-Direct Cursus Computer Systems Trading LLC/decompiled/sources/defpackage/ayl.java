package defpackage;

import android.content.Context;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class ayl extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ayl(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                cyl cylVar = (cyl) this.receiver;
                zul zulVar = cylVar.g;
                cvl cvlVar = cylVar.h;
                if (zulVar != null) {
                    cylVar.f.a(zulVar.a, zulVar.b);
                } else if (cvlVar != null) {
                    cylVar.f.a(cvlVar, null);
                }
                break;
            case 1:
                n0m n0mVar = ((cyl) this.receiver).a;
                n0mVar.getClass();
                x97.y(ot0.F(n0mVar), null, null, new d0m(n0mVar, continuation, 6), 3);
                break;
            case 2:
                ((cyl) this.receiver).f.a.finish();
                break;
            case 3:
                cyl cylVar2 = (cyl) this.receiver;
                cvl cvlVar2 = cylVar2.h;
                List list = cylVar2.i;
                if (cvlVar2 != null && list != null) {
                    cylVar2.f.b(cvlVar2, list);
                }
                break;
            case 4:
                cyl cylVar3 = (cyl) this.receiver;
                zul zulVar2 = cylVar3.g;
                cvl cvlVar3 = cylVar3.h;
                if (zulVar2 != null) {
                    cylVar3.f.a(zulVar2.a, zulVar2.b);
                } else if (cvlVar3 != null) {
                    cylVar3.f.a(cvlVar3, null);
                }
                break;
            case 5:
                ((qzl) this.receiver).b.a.finish();
                break;
            case 6:
                ((PlaylistScreenActivity) this.receiver).z();
                break;
            case 7:
                v7g.L(((cxl) this.receiver).a, new lik(vik.b, null, null));
                break;
            case 8:
                m3m m3mVar = ((a3m) this.receiver).b;
                k3m k3mVar = (k3m) m3mVar.n.getValue();
                if (k3mVar instanceof j3m) {
                    j3m j3mVar = (j3m) k3mVar;
                    if (j3mVar.c) {
                        cvl cvlVar4 = m3mVar.k;
                        List list2 = j3mVar.b;
                        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((j1b) it.next()).b);
                        }
                        xdr xdrVar = m3mVar.t;
                        Boolean bool = Boolean.TRUE;
                        xdrVar.getClass();
                        xdrVar.m(null, bool);
                        x97.y(ot0.F(m3mVar), null, null, new l3m(m3mVar, arrayList, cvlVar4, (Continuation) null), 3);
                    } else {
                        x97.y(ot0.F(m3mVar), null, null, new g2l(m3mVar, continuation, 11), 3);
                    }
                }
                break;
            case 9:
                n4m n4mVar = (n4m) this.receiver;
                m4m m4mVar = n4mVar.a;
                cvl cvlVar5 = m4mVar.i;
                d70 d70Var = cvlVar5 != null ? new d70(cvlVar5.e(), c70.d, cvlVar5.b, 0, "") : null;
                if (d70Var != null) {
                    m4mVar.f.e(d70Var, null);
                }
                ime imeVar = n4mVar.b;
                cvl A = zwf.A(v3g.E((frt) ((jyr) imeVar.d).getValue()).a);
                Context context = (Context) imeVar.b;
                context.startActivity(ixf.E(context, A, d.p(((i4m) ((s63) imeVar.c).a).a)));
                break;
            case 10:
                ((o8m) this.receiver).getClass();
                break;
            case 11:
                ((o8m) this.receiver).getClass();
                break;
            case 12:
                ((rbm) this.receiver).a.j();
                break;
            case 13:
                ((rbm) this.receiver).a.k();
                break;
            case 14:
                ce5 ce5Var = ((rbm) this.receiver).a;
                ((icj) ce5Var.b).y(new kv4(8, ce5Var));
                break;
            case 15:
                ((rbm) this.receiver).a.h();
                break;
            case 16:
                ce5 ce5Var2 = ((rbm) this.receiver).a;
                rmb.j((rmb) ce5Var2.h, wjb.BottomsheetScreen, null, null, 14);
                ((qbj) ce5Var2.c).b((oq) ce5Var2.e);
                break;
            case 17:
                ((lam) ((mam) this.receiver).b.c).requireActivity().getOnBackPressedDispatcher().d();
                break;
            case 18:
                t tVar = ((mam) this.receiver).c.a;
                int i = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, c0p.c, p0p.w));
                break;
            case 19:
                tam tamVar = ((mam) this.receiver).a;
                tamVar.getClass();
                x97.y(ot0.F(tamVar), null, null, new g2l(tamVar, continuation, 15), 3);
                break;
            case 20:
                nnd nndVar = ((mam) this.receiver).b;
                lam lamVar = (lam) nndVar.c;
                y supportFragmentManager = lamVar.requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = new a(supportFragmentManager);
                aVar.c(null);
                int i2 = lamVar.requireArguments().getInt("arg_container_id");
                o15 o15Var = (o15) nndVar.b;
                o15Var.getClass();
                ldj ldjVar = new ldj();
                ldjVar.setArguments(cxb.K(new Pair("arg_collection_non_music_type", o15Var)));
                aVar.e(i2, ldjVar, null);
                aVar.j();
                break;
            case 21:
                nnd nndVar2 = ((mam) this.receiver).b;
                lam lamVar2 = (lam) nndVar2.c;
                y supportFragmentManager2 = lamVar2.requireActivity().getSupportFragmentManager();
                supportFragmentManager2.getClass();
                a aVar2 = new a(supportFragmentManager2);
                aVar2.c(null);
                int i3 = lamVar2.requireArguments().getInt("arg_container_id");
                o15 o15Var2 = (o15) nndVar2.b;
                o15Var2.getClass();
                k9j k9jVar = new k9j();
                k9jVar.setArguments(cxb.K(new Pair("arg_collection_non_music_type", o15Var2)));
                aVar2.e(i3, k9jVar, null);
                aVar2.j();
                break;
            case 22:
                ((jbm) this.receiver).b.a.finish();
                break;
            case 23:
                jbm jbmVar = (jbm) this.receiver;
                oq oqVar = jbmVar.a.A;
                qbj qbjVar = jbmVar.b;
                LinkedList linkedList = oqVar.F;
                qbjVar.getClass();
                linkedList.getClass();
                qbjVar.d.I(oqVar, linkedList);
                break;
            case 24:
                jbm jbmVar2 = (jbm) this.receiver;
                jbmVar2.b.b(jbmVar2.a.A);
                break;
            case 25:
                gcm gcmVar = ((jbm) this.receiver).a;
                gcmVar.getClass();
                x97.y(ot0.F(gcmVar), null, null, new ecm(gcmVar, continuation, 1), 3);
                break;
            case 26:
                ((jbm) this.receiver).b.a.finish();
                break;
            case 27:
                jbm jbmVar3 = (jbm) this.receiver;
                oq oqVar2 = jbmVar3.a.A;
                qbj qbjVar2 = jbmVar3.b;
                LinkedList linkedList2 = oqVar2.F;
                qbjVar2.getClass();
                linkedList2.getClass();
                qbjVar2.d.I(oqVar2, linkedList2);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jbm jbmVar4 = (jbm) this.receiver;
                jbmVar4.b.b(jbmVar4.a.A);
                break;
            default:
                ((jbm) this.receiver).b.a.finish();
                break;
        }
        return Unit.a;
    }
}
