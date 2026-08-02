package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.history.MusicHistoryScreenActivity;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class pef extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pef(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 13;
        int i2 = 12;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                aff affVar = (aff) this.receiver;
                affVar.a.a(affVar.g, new kef(1, affVar.b, dff.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 2));
                break;
            case 1:
                vff vffVar = (vff) this.receiver;
                xff xffVar = vffVar.b;
                xdr xdrVar = xffVar.d;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                rmb.a(xffVar.a, sjb.Disable, bg3.I((wff) vffVar.c.getValue()), null, 10);
                dn9 dn9Var = vffVar.a;
                Activity activity = (Activity) dn9Var.b;
                lhs lhsVar = MainScreenActivity.Q0;
                activity.startActivity(imp.J(activity, rf3.h, null, null, 12));
                jyr jyrVar = (jyr) dn9Var.f;
                ((dtt) jyrVar.getValue()).h(pff.e, false, Boolean.FALSE);
                ((dtt) jyrVar.getValue()).h(qff.e, false, bool);
                ggf ggfVar = (ggf) ((jyr) dn9Var.c).getValue();
                rar rarVar = ggfVar.g;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                ggfVar.g = x97.y(ggfVar.f, null, null, new ptd(ggfVar, igf.a, continuation, i), 3);
                break;
            case 2:
                vff vffVar2 = (vff) this.receiver;
                dn9 dn9Var2 = vffVar2.a;
                jyr jyrVar2 = (jyr) dn9Var2.f;
                dtt dttVar = (dtt) jyrVar2.getValue();
                qff qffVar = qff.e;
                Boolean bool2 = Boolean.TRUE;
                dttVar.h(qffVar, false, bool2);
                ((dtt) jyrVar2.getValue()).h(pff.e, true, bool2);
                ggf ggfVar2 = (ggf) ((jyr) dn9Var2.c).getValue();
                rar rarVar2 = ggfVar2.g;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                ggfVar2.g = x97.y(ggfVar2.f, null, null, new ptd(ggfVar2, hgf.a, continuation, i), 3);
                xff xffVar2 = vffVar2.b;
                rmb.a(xffVar2.a, sjb.Ok, bg3.I((wff) vffVar2.c.getValue()), null, 10);
                xdr xdrVar2 = xffVar2.d;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                break;
            case 3:
                ((ygf) this.receiver).d.B();
                break;
            case 4:
                ghf ghfVar = ((zgf) this.receiver).b;
                ghfVar.getClass();
                x97.y(ot0.F(ghfVar), null, null, new jmd(ghfVar, continuation, i2), 3);
                break;
            case 5:
                t tVar = ((ygf) this.receiver).c.a;
                int i3 = SearchActivity.Z;
                tVar.startActivity(rvf.F(tVar, c0p.a, p0p.q));
                break;
            case 6:
                ((vni) ((zgf) this.receiver).d.b).a();
                break;
            case 7:
                ygf ygfVar = (ygf) this.receiver;
                ygfVar.a.a(ygfVar.j, new kef(1, ygfVar.b, fhf.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 3));
                break;
            case 8:
                t tVar2 = ((zgf) this.receiver).c.a;
                int i4 = SearchActivity.Z;
                tVar2.startActivity(rvf.F(tVar2, c0p.a, p0p.p));
                break;
            case 9:
                zgf zgfVar = (zgf) this.receiver;
                zgfVar.a.a(zgfVar.k, new kef(1, zgfVar.b, ghf.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 4));
                break;
            case 10:
                ((tjf) ((jkf) this.receiver).f.a).c();
                break;
            case 11:
                yfx yfxVar = ((tjf) ((jkf) this.receiver).f.a).c;
                if (yfxVar != null) {
                    ((u1e) yfxVar.b).d();
                }
                break;
            case 12:
                ((jkf) this.receiver).b();
                break;
            case 13:
                ((jkf) this.receiver).b();
                break;
            case 14:
                ((jkf) this.receiver).c();
                break;
            case 15:
                ((jkf) this.receiver).a();
                break;
            case 16:
                ((jkf) this.receiver).b();
                break;
            case 17:
                ((jkf) this.receiver).c();
                break;
            case 18:
                ((jkf) this.receiver).a();
                break;
            case 19:
                j2g j2gVar = (j2g) this.receiver;
                w2g w2gVar = j2gVar.a;
                cvl cvlVar = w2gVar.j;
                if (cvlVar != null) {
                    j6e j6eVar = w2gVar.f;
                    j6eVar.getClass();
                    ((q43) j6eVar.a).e(ox6.M(bfg.J(cvlVar), 0, ""), null);
                    qdc qdcVar = j2gVar.b;
                    Context context = (Context) qdcVar.b;
                    int i5 = PlaylistScreenActivity.B0;
                    context.startActivity(dxl.i(context, cvlVar, d.p((nrf) qdcVar.c), 28));
                }
                break;
            case 20:
                j2g j2gVar2 = (j2g) this.receiver;
                j6e j6eVar2 = j2gVar2.a.f;
                ((q43) j6eVar2.a).e(new d70("music_history_screen", c70.k, ((skr) ((jyr) j6eVar2.b).getValue()).c(R.string.listening_history_header_title), 1, ""), null);
                Context context2 = (Context) j2gVar2.b.b;
                int i6 = MusicHistoryScreenActivity.Y;
                context2.getClass();
                context2.startActivity(new Intent(context2, (Class<?>) MusicHistoryScreenActivity.class));
                break;
            case 21:
                ((sai) this.receiver).a();
                break;
            case 22:
                cag cagVar = (cag) this.receiver;
                cagVar.c = true;
                bag bagVar = cagVar.d;
                if (bagVar != null) {
                    cagVar.a(bagVar.a, bagVar.b, bagVar.c);
                }
                cagVar.d = null;
                break;
            case 23:
                break;
            case 24:
                ((tvg) this.receiver).A();
                break;
            case 25:
                ((c6h) this.receiver).h();
                break;
            case 26:
                ((c6h) this.receiver).r();
                break;
            case 27:
                ((c6h) this.receiver).k();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((c6h) this.receiver).x();
                break;
            default:
                ((c6h) this.receiver).k();
                break;
        }
        return Unit.a;
    }
}
