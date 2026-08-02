package defpackage;

import androidx.fragment.app.t;
import com.yandex.music.payment.screen.promocode.viewmodel.a;
import com.yandex.pulse.metrics.o;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class ebm extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ebm(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        int i2 = 0;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                jbm jbmVar = (jbm) this.receiver;
                oq oqVar = jbmVar.a.A;
                qbj qbjVar = jbmVar.b;
                LinkedList linkedList = oqVar.F;
                qbjVar.getClass();
                linkedList.getClass();
                qbjVar.d.I(oqVar, linkedList);
                break;
            case 1:
                jbm jbmVar2 = (jbm) this.receiver;
                jbmVar2.b.b(jbmVar2.a.A);
                break;
            case 2:
                ce5 ce5Var = ((rbm) this.receiver).a;
                rmb.a((rmb) ce5Var.h, sjb.Ok, null, null, 14);
                ((icj) ce5Var.b).F();
                break;
            case 3:
                ((qbj) ((rbm) this.receiver).a.c).a.finish();
                break;
            case 4:
                ce5 ce5Var2 = ((rbm) this.receiver).a;
                rmb.j((rmb) ce5Var2.h, wjb.SearchScreen, (thj) ce5Var2.p, null, 12);
                qbj qbjVar2 = (qbj) ce5Var2.c;
                oq oqVar2 = (oq) ce5Var2.e;
                LinkedList linkedList2 = oqVar2.F;
                qbjVar2.getClass();
                linkedList2.getClass();
                qbjVar2.d.I(oqVar2, linkedList2);
                break;
            case 5:
                ce5 ce5Var3 = ((rbm) this.receiver).a;
                rmb.j((rmb) ce5Var3.h, wjb.BottomsheetScreen, null, null, 14);
                ((qbj) ce5Var3.c).b((oq) ce5Var3.e);
                break;
            case 6:
                ((fem) this.receiver).b.getOnBackPressedDispatcher().d();
                break;
            case 7:
                efm efmVar = ((fem) this.receiver).a;
                efmVar.o = true;
                efmVar.q.h();
                break;
            case 8:
                ((fem) this.receiver).a.q.i();
                break;
            case 9:
                ((sem) this.receiver).d.B();
                break;
            case 10:
                t tVar = ((sem) this.receiver).c.a;
                int i3 = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, c0p.b, p0p.q));
                break;
            case 11:
                sem semVar = (sem) this.receiver;
                semVar.a.a(semVar.f, new bml(1, semVar.b, uem.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 10));
                break;
            case 12:
                ((sai) this.receiver).a();
                break;
            case 13:
                ojm ojmVar = (ojm) this.receiver;
                ((ebm) ojmVar.a.b).invoke();
                ujm ujmVar = ojmVar.b;
                lkm lkmVar = ujmVar.n;
                kjm kjmVar = ujmVar.k;
                lkmVar.getClass();
                kjmVar.getClass();
                xjm a = lkmVar.a();
                a.getClass();
                x97.y(a.a, null, null, new wjm(p1g.O(kjmVar), a, continuation, i), 3);
                break;
            case 14:
                ojm ojmVar2 = (ojm) this.receiver;
                ((ebm) ojmVar2.a.b).invoke();
                ujm ujmVar2 = ojmVar2.b;
                lkm lkmVar2 = ujmVar2.n;
                kjm kjmVar2 = ujmVar2.k;
                lkmVar2.getClass();
                kjmVar2.getClass();
                xjm a2 = lkmVar2.a();
                a2.getClass();
                x97.y(a2.a, null, null, new wjm(p1g.O(kjmVar2), a2, continuation, i2), 3);
                break;
            case 15:
                ((u8q) this.receiver).K();
                break;
            case 16:
                ((u8q) this.receiver).K();
                break;
            case 17:
                ((u8q) this.receiver).K();
                break;
            case 18:
                ((u8q) this.receiver).K();
                break;
            case 19:
                cum cumVar = (cum) this.receiver;
                eum b = cumVar.b();
                ((tya) b.b.getValue()).a(new qya(hlb.Fullscreen, 0), wjb.ProfileScreen, b.a.G());
                cumVar.i.a(cumVar.b).U(new i0b());
                break;
            case 20:
                ((a) this.receiver).G();
                break;
            case 21:
                ((a) this.receiver).G();
                break;
            case 22:
                ixm ixmVar = (ixm) this.receiver;
                rmb.a(ixmVar.a.b, sjb.EasyLoginSetup, ixmVar.c.d, null, 10);
                f4m f4mVar = ixmVar.b;
                kxm kxmVar = kxm.a;
                if (!kxmVar.equals(kxmVar)) {
                    b6e.s();
                    break;
                } else {
                    ((es6) f4mVar.b).U(new i0b());
                    break;
                }
            case 23:
                ((w5n) this.receiver).a();
                break;
            case 24:
                ((w5n) this.receiver).a();
                break;
            case 25:
                ((w5n) this.receiver).a();
                break;
            case 26:
                ((hn5) ((t5n) this.receiver).b.b).getOnBackPressedDispatcher().d();
                break;
            case 27:
                owu owuVar = ((m7n) this.receiver).i;
                if (owuVar != null) {
                    owuVar.b((qmu) owuVar.c().getValue());
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((bg5) this.receiver).e();
                break;
            default:
                ((bg5) this.receiver).a();
                break;
        }
        return Unit.a;
    }
}
