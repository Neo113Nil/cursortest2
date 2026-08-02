package ru.yandex.taxi.address.clarification.impl.ui;

import android.view.ContextThemeWrapper;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.ac1;
import defpackage.ap0;
import defpackage.bc1;
import defpackage.bp0;
import defpackage.ep0;
import defpackage.er0;
import defpackage.evu0;
import defpackage.fp0;
import defpackage.fr0;
import defpackage.gfq0;
import defpackage.gh00;
import defpackage.gp0;
import defpackage.gtd0;
import defpackage.h56;
import defpackage.itd0;
import defpackage.jl40;
import defpackage.jud0;
import defpackage.k56;
import defpackage.lrq0;
import defpackage.ptd0;
import defpackage.pv0;
import defpackage.scc;
import defpackage.sp0;
import defpackage.sy0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u6r;
import defpackage.utd0;
import defpackage.v6r;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wb1;
import defpackage.xp0;
import defpackage.xtd0;
import defpackage.zp0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;
import ru.yandex.taxi.address.clarification.UpdateReason;
import ru.yandex.taxi.common_models.net.map_object.a0;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027f  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        zy11 zy11Var;
        String str;
        bc1 bc1Var;
        String str2;
        List list;
        u6r u6rVar;
        k56 k56Var;
        bc1 bc1Var2;
        wb1 wb1Var;
        ru.yandex.taxi.address.clarification.impl.repo.a aVar;
        Object obj2;
        int i;
        ap0 gfq0Var;
        int i2 = this.a;
        zy11 zy11Var2 = zy11.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                bc1 bc1Var3 = (bc1) obj;
                zp0 zp0Var = (zp0) obj3;
                if (jl40.l(bc1Var3, bc1.g)) {
                    zp0Var.C.a("RestrictedAreaPopup.MovePinOutOfArea", false, zp0Var.x, zp0Var.L, null);
                    ((sp0) obj4).Eb(AddressClarificationCloseReason.MOVE_PIN_OUT_AREA);
                    zy11Var = zy11Var2;
                } else {
                    v6r a = bc1Var3.a();
                    String str3 = bc1Var3.c;
                    a0 a0Var = bc1Var3.a;
                    wb1 wb1Var2 = zp0Var.D;
                    ru.yandex.taxi.address.clarification.impl.repo.a aVar2 = zp0Var.E;
                    xp0 xp0Var = zp0Var.x;
                    bp0 bp0Var = zp0Var.C;
                    fr0 fr0Var = zp0Var.A;
                    fr0Var.getClass();
                    utd0 utd0Var = a0Var.d;
                    utd0 utd0Var2 = a0Var.d;
                    List list2 = utd0Var.b;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    int i3 = -1;
                    int i4 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        zy11 zy11Var3 = zy11Var2;
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            scc.m();
                            throw null;
                        }
                        Iterator it2 = it;
                        itd0 itd0Var = (itd0) next;
                        if (itd0Var == null) {
                            bc1Var2 = bc1Var3;
                            i = i5;
                            wb1Var = wb1Var2;
                            aVar = aVar2;
                            gfq0Var = null;
                        } else {
                            bc1Var2 = bc1Var3;
                            if (itd0Var instanceof jud0) {
                                gfq0Var = new lrq0(((jud0) itd0Var).a);
                                i = i5;
                                wb1Var = wb1Var2;
                                aVar = aVar2;
                            } else {
                                if (!(itd0Var instanceof xtd0)) {
                                    w511.b();
                                    return null;
                                }
                                xtd0 xtd0Var = (xtd0) itd0Var;
                                List list3 = xtd0Var.d;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj5 : list3) {
                                    wb1 wb1Var3 = wb1Var2;
                                    ru.yandex.taxi.address.clarification.impl.repo.a aVar3 = aVar2;
                                    if (obj5 instanceof ptd0) {
                                        arrayList2.add(obj5);
                                    }
                                    wb1Var2 = wb1Var3;
                                    aVar2 = aVar3;
                                }
                                wb1Var = wb1Var2;
                                aVar = aVar2;
                                Iterator it3 = arrayList2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj2 = it3.next();
                                        if (jl40.l(((ptd0) obj2).a, str3)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                boolean z = obj2 != null;
                                if (z) {
                                    i3 = i4;
                                }
                                List list4 = utd0Var2.b;
                                i = i5;
                                itd0 itd0Var2 = (itd0) kotlin.collections.a.S(i5, list4);
                                gfq0Var = new gfq0(xtd0Var, z, (i4 == list4.size() + (-1) || itd0Var2 == null || (itd0Var2 instanceof jud0)) ? false : true);
                            }
                        }
                        if (gfq0Var != null) {
                            arrayList.add(gfq0Var);
                        }
                        bc1Var3 = bc1Var2;
                        zy11Var2 = zy11Var3;
                        it = it2;
                        wb1Var2 = wb1Var;
                        aVar2 = aVar;
                        i4 = i;
                    }
                    bc1 bc1Var4 = bc1Var3;
                    zy11Var = zy11Var2;
                    wb1 wb1Var4 = wb1Var2;
                    ru.yandex.taxi.address.clarification.impl.repo.a aVar4 = aVar2;
                    fr0Var.a = new er0(arrayList, i3);
                    tje.N(zp0Var.Jg(), null, null, new AddressAdjustmentPresenter$initTitleAndSubtitle$1(zp0Var, a0Var, null), 3);
                    ((sp0) zp0Var.Dg()).A1(fr0Var.a);
                    tje.N(zp0Var.Jg(), null, null, new AddressAdjustmentPresenter$initButton$1(zp0Var, a0Var, null), 3);
                    if (a == null || (u6rVar = a.a) == null || (k56Var = u6rVar.e) == null || (str = k56Var.d) == null) {
                        str = "";
                    }
                    if (jl40.l(zp0Var.L, str)) {
                        bc1Var = bc1Var4;
                        UpdateReason updateReason = bc1Var.b;
                        if (updateReason == UpdateReason.NEW_FINAL_SUGGEST) {
                            bp0Var.a("RestrictedAreaPopup.MovePinInsideOfArea", false, xp0Var, zp0Var.L, null);
                            if (evu0.J(str3)) {
                                wb1Var4.j(bc1Var);
                            }
                        } else if (updateReason == UpdateReason.UPDATE_PICKUP_POINT_BY_CLICK_IN_LIST) {
                            bp0Var.c(str3, xp0Var, zp0Var.L, aVar4.e);
                        }
                    } else {
                        if (!jl40.l(zp0Var.L, "")) {
                            bp0Var.b(xp0Var, zp0Var.L);
                        }
                        zp0Var.L = str;
                        Object S = kotlin.collections.a.S(utd0Var2.a, utd0Var2.b);
                        xtd0 xtd0Var2 = S instanceof xtd0 ? (xtd0) S : null;
                        if (xtd0Var2 != null && (list = xtd0Var2.d) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj6 : list) {
                                if (obj6 instanceof gtd0) {
                                    arrayList3.add(obj6);
                                }
                            }
                            gtd0 gtd0Var = (gtd0) kotlin.collections.a.R(arrayList3);
                            if (gtd0Var != null) {
                                str2 = gtd0Var.a;
                                aVar4.e = str2;
                                Object S2 = kotlin.collections.a.S(utd0Var2.a, utd0Var2.b);
                                xtd0 xtd0Var3 = !(S2 instanceof xtd0) ? (xtd0) S2 : null;
                                String str4 = xtd0Var3 == null ? xtd0Var3.e : null;
                                String str5 = zp0Var.L;
                                String str6 = aVar4.e;
                                bp0Var.b = str4;
                                bp0Var.a("RestrictedAreaPopup.Shown", true, xp0Var, str5, str6);
                                bc1Var = bc1Var4;
                                wb1Var4.j(bc1Var);
                            }
                        }
                        str2 = null;
                        aVar4.e = str2;
                        Object S22 = kotlin.collections.a.S(utd0Var2.a, utd0Var2.b);
                        if (!(S22 instanceof xtd0)) {
                        }
                        if (xtd0Var3 == null) {
                        }
                        String str52 = zp0Var.L;
                        String str62 = aVar4.e;
                        bp0Var.b = str4;
                        bp0Var.a("RestrictedAreaPopup.Shown", true, xp0Var, str52, str62);
                        bc1Var = bc1Var4;
                        wb1Var4.j(bc1Var);
                    }
                    pv0 pv0Var = bc1Var.d;
                    if (pv0Var != null) {
                        h56 h56Var = zp0Var.H;
                        h56.b(h56Var, h56Var.b.b(pv0Var, false), h56Var.c, pv0Var, zp0Var.G.a, null, 16);
                    }
                }
                return zy11Var;
            default:
                sy0 sy0Var = (sy0) obj4;
                d dVar = (d) obj3;
                gp0 gp0Var = (gp0) obj;
                if (!(gp0Var instanceof ep0)) {
                    if (gp0Var instanceof fp0) {
                        dVar.K.a().k(dVar.N.a(new ContextThemeWrapper(dVar.D, dVar.O.a(dVar.P.getThemeType()).b), dVar.M.a(dVar.J.d, new AddressMapPickerAdjustmentRouterImpl$showAddressAdjustmentModalView$modalView$1(1, dVar, d.class, "handleAddressAdjustmentClose", "handleAddressAdjustmentClose(Lru/yandex/taxi/address/clarification/AddressClarificationCloseReason;)V", 0), sy0Var.b)), 2.0f, true);
                        return zy11Var2;
                    }
                    w511.b();
                    return null;
                }
                ep0 ep0Var = (ep0) gp0Var;
                ac1 ac1Var = ep0Var.a;
                PlainAddress plainAddress = ac1Var.a;
                tls tlsVar = sy0Var.c;
                ((com.yandex.go.clarify_address.a) dVar.L).c(true, AddressClarificationReason.Map);
                dVar.H.m(new ZoneAddress(plainAddress, dVar.F.f(plainAddress.getZoneName())), null);
                tlsVar.invoke(plainAddress);
                if (!ep0Var.b) {
                    return zy11Var2;
                }
                zzs zzsVar = ac1Var.b;
                gh00 gh00Var = (gh00) dVar.E;
                gh00Var.D(ru.yandex.taxi.map.utils.a.F(zzsVar), gh00Var.j(), 300.0f, null);
                return zy11Var2;
        }
    }
}
