package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class hb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.a) {
            case 0:
                ((AccessibilityManager) this.b).removeTouchExplorationStateChangeListener((gb) this.c);
                break;
            case 1:
                tmb tmbVar = (tmb) this.b;
                ud udVar = (ud) this.c;
                break;
            case 2:
                ((Function1) this.b).invoke((bxl) this.c);
                break;
            case 3:
                am amVar = (am) this.b;
                mm mmVar = (mm) ((nm) this.c);
                mqs mqsVar = mmVar.b;
                gjl gjlVar = mmVar.d;
                amVar.getClass();
                mqsVar.getClass();
                amVar.a(wjb.AddToPlaylistScreen, gjlVar != null ? new qkl(gjlVar, bkp.X(gjlVar.a.c())) : 0);
                osh oshVar = amVar.b;
                y yVar = (y) oshVar.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (((nf3) ((byb) qdcVar.C(I)).b(nf3.class)).h()) {
                    new nsh((yk) ((jyr) oshVar.c).getValue(), pd.t(new qzm[0]), yVar).T(mqsVar);
                } else {
                    v7f v7fVar = new v7f();
                    v7fVar.l = mqsVar;
                    yVar.getClass();
                    x7f.B(v7fVar, yVar, "ADD_TO_PLAYLIST_DIALOG");
                }
                break;
            case 4:
                br brVar = (br) this.b;
                oq oqVar = (oq) this.c;
                e eVar = (e) brVar.s.getValue();
                PlaybackScope playbackScope = brVar.d;
                eVar.getClass();
                break;
            case 5:
                break;
            case 6:
                ((Function1) this.b).invoke((zji) this.c);
                break;
            case 7:
                fz fzVar = (fz) this.b;
                List list = ((q00) this.c).c;
                fzVar.getClass();
                list.getClass();
                f00 f00Var = fzVar.f;
                oq a = fz.a((r00) fzVar.b.y.getValue());
                f00Var.a(new jz(list, a != null ? a.d() : null));
                break;
            case 8:
                i01 i01Var = (i01) this.b;
                u51 u51Var = ((s01) this.c).d;
                i01Var.getClass();
                rmb.j(i01Var.c, wjb.AboutArtistScreen, gld.I(u51Var, 0), null, 12);
                nsh nshVar = i01Var.b;
                y yVar2 = (y) nshVar.c;
                oa1 oa1Var = new oa1((Activity) nshVar.b, 0);
                jfu jfuVar = (jfu) nshVar.d;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(h1d.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                ovn.R(yVar2, u51Var, oa1Var, jfuVar, (h1d) qdcVar2.C(I2));
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                ia0 ia0Var = (ia0) this.b;
                ka1 ka1Var = (ka1) this.c;
                String string = ((t) ia0Var.b).getResources().getString(R.string.dialog_action_radio_artist);
                string.getClass();
                String str = ka1Var.g;
                break;
            case 13:
                break;
            case 14:
                p31 p31Var = (p31) this.b;
                break;
            case 15:
                break;
            case 16:
                fvf fvfVar = (fvf) this.b;
                u6k u6kVar = (u6k) this.c;
                if (fvfVar.h() == 0 && fvfVar.i() <= u6kVar.h()) {
                    z = true;
                }
                break;
            case 17:
                ((Function1) this.b).invoke((aki) this.c);
                break;
            case 18:
                uc1 uc1Var = (uc1) this.b;
                String str2 = ((dd1) this.c).c;
                uc1Var.getClass();
                str2.getClass();
                rmb.k(uc1Var.b, str2, ((ed1) uc1Var.a.h.getValue()).a(), null, 4);
                w1g.y(uc1Var.c.a, str2, true);
                break;
            case 19:
                ((Function1) this.b).invoke((u51) this.c);
                break;
            case 20:
                xe1 xe1Var = (xe1) this.b;
                eul eulVar = (eul) ((if1) this.c).a.b;
                xe1Var.getClass();
                rmb.j(xe1Var.c, wjb.PlaylistScreen, t7g.m(eulVar, 0), null, 12);
                ve1 ve1Var = xe1Var.b;
                int i2 = PlaylistScreenActivity.B0;
                Context context = ve1Var.a;
                context.startActivity(dxl.h(context, eulVar, d.g()));
                break;
            case 21:
                rf1 rf1Var = (rf1) this.b;
                jg1 jg1Var = (jg1) this.c;
                thj thjVar = jg1Var.c;
                dg1 dg1Var = rf1Var.a;
                kkp kkpVar = dg1Var.g;
                boolean z2 = jg1Var.b;
                rmb rmbVar = rf1Var.c;
                if (z2) {
                    rmb.a(rmbVar, sjb.Unlike, thjVar, null, 10);
                } else {
                    rmb.a(rmbVar, sjb.Like, thjVar, null, 10);
                    boolean booleanValue = ((Boolean) ((xdr) kkpVar.e).getValue()).booleanValue();
                    qf1 qf1Var = rf1Var.b;
                    if (booleanValue) {
                        y yVar3 = qf1Var.b;
                        pu0 t = pd.t(new qzm[0]);
                        yVar3.getClass();
                        cvo cvoVar = cvo.i;
                        fxf.Q(yVar3, o6m.b(wjb.PresaveHintScreen, null, 6), null, null, t, null, bkp.a, 22);
                        xdr xdrVar = (xdr) kkpVar.e;
                        Boolean bool = Boolean.FALSE;
                        xdrVar.getClass();
                        xdrVar.m(null, bool);
                        l91 l91Var = (l91) ((f91) kkpVar.b);
                        x97.y(l91Var.a, null, null, new j91(l91Var, r6, i), 3);
                    } else {
                        Context context2 = qf1Var.a;
                        context2.getClass();
                        hag.x(context2, R.string.pre_save_subscribe_toast, 0);
                    }
                }
                nf1 nf1Var = (nf1) dg1Var.k.getValue();
                if (nf1Var != null) {
                    ikm ikmVar = nf1Var.a;
                    xdr xdrVar2 = (xdr) kkpVar.d;
                    boolean booleanValue2 = ((Boolean) xdrVar2.getValue()).booleanValue();
                    gg1 gg1Var = (gg1) kkpVar.c;
                    if (booleanValue2) {
                        gg1Var.getClass();
                        lkm lkmVar = (lkm) gg1Var.a.getValue();
                        lkmVar.getClass();
                        xjm a2 = lkmVar.a();
                        x97.y(a2.a, null, null, new wjm(ikmVar, a2, r6, i), 3);
                    } else {
                        gg1Var.getClass();
                        lkm lkmVar2 = (lkm) gg1Var.a.getValue();
                        lkmVar2.getClass();
                        xjm a3 = lkmVar2.a();
                        x97.y(a3.a, null, null, new wjm(ikmVar, a3, r6, z ? 1 : 0), 3);
                    }
                    xdrVar2.m(null, Boolean.valueOf(!booleanValue2));
                }
                break;
            case 22:
                ((Function1) this.b).invoke(((ch1) this.c).a);
                break;
            case 23:
                m71 m71Var = (m71) this.b;
                sai saiVar = (sai) this.c;
                m71Var.invoke();
                saiVar.a();
                break;
            case 24:
                break;
            case 25:
                e00 e00Var = (e00) this.b;
                cq4 F = ot0.F((mj1) this.c);
                e00Var.getClass();
                bi1 bi1Var = (bi1) e00Var.b;
                u51 u51Var2 = (u51) bi1Var.a;
                break;
            case 26:
                kxi kxiVar = (kxi) this.b;
                e00 e00Var2 = (e00) this.c;
                fnb fnbVar = kxiVar.a;
                bdt I3 = hag.I(cvo.class);
                qdc qdcVar3 = e00Var2.a;
                qdcVar3.getClass();
                cvo cvoVar2 = (cvo) qdcVar3.C(I3);
                bdt I4 = hag.I(jnq.class);
                qdc qdcVar4 = e00Var2.a;
                qdcVar4.getClass();
                break;
            case 27:
                pk1 pk1Var = (pk1) this.b;
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ml1 ml1Var = (ml1) this.b;
                ArrayList arrayList = ((m0f) this.c).d;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((lk1) it.next()).b);
                }
                ml1Var.i = arrayList2;
                em1 em1Var = ml1Var.a;
                em1Var.getClass();
                em1Var.n.f(em1Var.k, arrayList2);
                break;
            default:
                ((Function1) this.b).invoke(((r91) this.c).b);
                break;
        }
        return Unit.a;
    }
}
