package defpackage;

import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class k5h extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5h(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 24;
        int i2 = 0;
        int i3 = 9;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                t5h t5hVar = ((r5h) this.receiver).a;
                t5hVar.getClass();
                x97.y(ot0.F(t5hVar), null, null, new jmd(t5hVar, continuation, i), 3);
                break;
            case 1:
                ((vni) ((r5h) this.receiver).c.b).a();
                break;
            case 2:
                t tVar = ((r5h) this.receiver).b.a;
                int i4 = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, c0p.a, p0p.n));
                break;
            case 3:
                ((v0i) this.receiver).b.getOnBackPressedDispatcher().d();
                break;
            case 4:
                v0i v0iVar = (v0i) this.receiver;
                List list = v0iVar.a.m;
                if (list != null) {
                    w0i w0iVar = v0iVar.c;
                    lhd lhdVar = new lhd(23, v0iVar);
                    w0iVar.getClass();
                    t tVar2 = w0iVar.a;
                    pu0 t = pd.t(new qzm[0]);
                    List<n0i> list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    for (n0i n0iVar : list2) {
                        n0iVar.getClass();
                        String str = n0iVar.b;
                        String str2 = n0iVar.c;
                        arrayList.add(s7g.l(str2, str, str2, n0iVar.a));
                    }
                    lhd lhdVar2 = new lhd(24, lhdVar);
                    cvo cvoVar = cvo.i;
                    fxf.P(tVar2, o6m.b(wjb.SortConditionsScreen, null, 6), null, t, null, new wn5(new fb1(i3, arrayList, lhdVar2, tVar2), -240278974, true), 22);
                }
                break;
            case 5:
                ((v0i) this.receiver).a.q.h();
                break;
            case 6:
                ((v0i) this.receiver).a.q.i();
                break;
            case 7:
                ((i1i) this.receiver).b.getOnBackPressedDispatcher().d();
                break;
            case 8:
                ((i1i) this.receiver).a.m.h();
                break;
            case 9:
                ((i1i) this.receiver).a.m.i();
                break;
            case 10:
                ((b2i) this.receiver).b.getOnBackPressedDispatcher().d();
                break;
            case 11:
                b2i b2iVar = (b2i) this.receiver;
                List list3 = b2iVar.a.m;
                if (list3 != null) {
                    c2i c2iVar = b2iVar.c;
                    lhd lhdVar3 = new lhd(26, b2iVar);
                    c2iVar.getClass();
                    t tVar3 = c2iVar.a;
                    pu0 t2 = pd.t(new qzm[0]);
                    List<n0i> list4 = list3;
                    ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                    for (n0i n0iVar2 : list4) {
                        n0iVar2.getClass();
                        String str3 = n0iVar2.b;
                        String str4 = n0iVar2.c;
                        arrayList2.add(s7g.l(str4, str3, str4, n0iVar2.a));
                    }
                    lhd lhdVar4 = new lhd(27, lhdVar3);
                    cvo cvoVar2 = cvo.i;
                    fxf.P(tVar3, o6m.b(wjb.SortConditionsScreen, null, 6), null, t2, null, new wn5(new fb1(i3, arrayList2, lhdVar4, tVar3), -240278974, true), 22);
                }
                break;
            case 12:
                ((b2i) this.receiver).a.q.h();
                break;
            case 13:
                ((b2i) this.receiver).a.q.i();
                break;
            case 14:
                ((v8i) ((w8i) this.receiver).b.b).requireActivity().getOnBackPressedDispatcher().d();
                break;
            case 15:
                gmi gmiVar = ((rli) this.receiver).b;
                xdr xdrVar = gmiVar.v;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                rar rarVar = gmiVar.x;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                gmiVar.x = null;
                gmiVar.x = x97.y(ot0.F(gmiVar), null, null, new emi(continuation, gmiVar, i2), 3);
                break;
            case 16:
                t tVar4 = (t) ((rli) this.receiver).c.b;
                lhs lhsVar = MainScreenActivity.Q0;
                tVar4.startActivity(imp.J(tVar4, rf3.h, null, null, 12));
                break;
            case 17:
                ((t) ((rli) this.receiver).c.b).finish();
                break;
            case 18:
                ((sai) this.receiver).a();
                break;
            case 19:
                ((esi) this.receiver).a();
                break;
            case 20:
                ((esi) this.receiver).e();
                break;
            case 21:
                ((lti) this.receiver).a.a.finish();
                break;
            case 22:
                ((hui) this.receiver).a();
                break;
            case 23:
                ((hui) this.receiver).d();
                break;
            case 24:
                ((hui) this.receiver).e();
                break;
            case 25:
                ((jui) this.receiver).a();
                break;
            case 26:
                ((jui) this.receiver).d();
                break;
            case 27:
                ((jui) this.receiver).e();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((vti) this.receiver).b.a.finish();
                break;
            default:
                bui buiVar = ((vti) this.receiver).a;
                xdr xdrVar2 = buiVar.k;
                Boolean bool2 = Boolean.TRUE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                x97.y(ot0.F(buiVar), null, null, new m1i(buiVar, null, 9), 3);
                break;
        }
        return Unit.a;
    }
}
