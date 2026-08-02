package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class m6h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cml b;
    public final /* synthetic */ sdr c;
    public final /* synthetic */ c6h d;

    public /* synthetic */ m6h(cml cmlVar, sdr sdrVar, c6h c6hVar, int i) {
        this.a = i;
        this.b = cmlVar;
        this.c = sdrVar;
        this.d = c6hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = this.b.a;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                wxk wxkVar = (wxk) obj3;
                if (!(wxkVar instanceof oxk) && !(wxkVar instanceof pxk) && !(wxkVar instanceof txk)) {
                    if (!(wxkVar instanceof sxk) && !(wxkVar instanceof uxk)) {
                        b6e.s();
                        break;
                    } else {
                        oq5 oq5Var2 = (oq5) hq5Var;
                        oq5Var2.Z(167984012);
                        wxk wxkVar2 = (wxk) obj3;
                        u7l u7lVar = (u7l) this.c.getValue();
                        c6h c6hVar = this.d;
                        boolean h = oq5Var2.h(c6hVar);
                        Object K = oq5Var2.K();
                        if (h || K == gq5.a) {
                            le0 le0Var = new le0(2, c6hVar, c6h.class, "onSeek", "onSeek(FLcom/yandex/music/shared/player/screen/api/ui/common/SeekUiInteraction;)V", 0, 27);
                            oq5Var2.k0(le0Var);
                            K = le0Var;
                        }
                        asq.n(wxkVar2, u7lVar, (Function2) ((h9f) K), null, oq5Var2, 0);
                        oq5Var2.p(false);
                    }
                } else {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(168209165);
                    u1g.l(oq5Var3, d.e(vci.a, g6h.a(oq5Var3)));
                    oq5Var3.p(false);
                }
                break;
            default:
                Object obj4 = this.b.a;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                wxk wxkVar3 = (wxk) obj4;
                if (!(wxkVar3 instanceof oxk) && !(wxkVar3 instanceof pxk) && !(wxkVar3 instanceof txk)) {
                    if (!(wxkVar3 instanceof sxk) && !(wxkVar3 instanceof uxk)) {
                        b6e.s();
                        break;
                    } else {
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        oq5Var5.Z(1242474383);
                        wxk wxkVar4 = (wxk) obj4;
                        u7l u7lVar2 = (u7l) this.c.getValue();
                        c6h c6hVar2 = this.d;
                        boolean h2 = oq5Var5.h(c6hVar2);
                        Object K2 = oq5Var5.K();
                        if (h2 || K2 == gq5.a) {
                            le0 le0Var2 = new le0(2, c6hVar2, c6h.class, "onSeek", "onSeek(FLcom/yandex/music/shared/player/screen/api/ui/common/SeekUiInteraction;)V", 0, 28);
                            oq5Var5.k0(le0Var2);
                            K2 = le0Var2;
                        }
                        asq.n(wxkVar4, u7lVar2, (Function2) ((h9f) K2), null, oq5Var5, 0);
                        oq5Var5.p(false);
                    }
                } else {
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(1242699536);
                    u1g.l(oq5Var6, d.e(vci.a, g6h.a(oq5Var6)));
                    oq5Var6.p(false);
                }
                break;
        }
        return Unit.a;
    }
}
