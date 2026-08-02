package defpackage;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinStateDto;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public abstract class rta1 {
    public static final void b(q72 q72Var, SparseArray sparseArray) {
        if (q72Var.b.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            if (autofillValue.isText()) {
                p94 p94Var = q72Var.b;
                autofillValue.getTextValue().toString();
                if (p94Var.a.get(Integer.valueOf(keyAt)) != null) {
                    ny61.u();
                    return;
                }
            } else if (autofillValue.isDate()) {
                qir.p("An operation is not implemented: b/138604541: Add onFill() callback for date");
                return;
            } else if (autofillValue.isList()) {
                qir.p("An operation is not implemented: b/138604541: Add onFill() callback for list");
                return;
            } else if (autofillValue.isToggle()) {
                qir.p("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                return;
            }
        }
    }

    public static final void c(q72 q72Var, ViewStructure viewStructure) {
        p94 p94Var = q72Var.b;
        if (p94Var.a.isEmpty()) {
            return;
        }
        int addChildCount = viewStructure.addChildCount(p94Var.a.size());
        Iterator it = p94Var.a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                ny61.u();
                return;
            }
            ViewStructure newChild = viewStructure.newChild(addChildCount);
            newChild.setAutofillId(q72Var.d, intValue);
            newChild.setId(intValue, q72Var.a.getContext().getPackageName(), null, null);
            newChild.setAutofillType(1);
            throw null;
        }
    }

    public static final Route d(atj0 atj0Var) {
        if (atj0Var instanceof zsj0) {
            return ((zsj0) atj0Var).a;
        }
        if (atj0Var instanceof wsj0) {
            return ((wsj0) atj0Var).a;
        }
        if (atj0Var instanceof xsj0) {
            return ((xsj0) atj0Var).a;
        }
        if (atj0Var instanceof ysj0) {
            return ((ysj0) atj0Var).a;
        }
        if (!(atj0Var instanceof vsj0) && atj0Var != null) {
            w511.b();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0165, code lost:
    
        if (defpackage.evu0.J(r8) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r8 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        if (defpackage.evu0.J(r8) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        if (r8 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0118, code lost:
    
        if (r8 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0100, code lost:
    
        if (defpackage.evu0.J(r8) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0158, code lost:
    
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015b, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        if (r8 == null) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList e(List list) {
        nw30 iw30Var;
        String str;
        String str2;
        nw30 lw30Var;
        String str3;
        List<z6l0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (z6l0 z6l0Var : list2) {
            if (z6l0Var instanceof v6l0) {
                v6l0 v6l0Var = (v6l0) z6l0Var;
                lw30Var = new jw30(v6l0Var.a, d(v6l0Var.c));
            } else {
                if (z6l0Var instanceof w6l0) {
                    w6l0 w6l0Var = (w6l0) z6l0Var;
                    List list3 = w6l0Var.b;
                    String str4 = w6l0Var.a;
                    Route d = d(w6l0Var.c);
                    PinStateDto pinStateDto = (PinStateDto) a.R(list3);
                    if (pinStateDto != null) {
                        String str5 = pinStateDto.a;
                        if (str5 != null) {
                            if (evu0.J(str5)) {
                                str5 = null;
                            }
                        }
                        str5 = pinStateDto.f;
                        if (str5 != null) {
                        }
                    }
                    String str6 = null;
                    PinStateDto pinStateDto2 = (PinStateDto) a.b0(list3);
                    if (pinStateDto2 != null) {
                        str3 = pinStateDto2.a;
                        if (str3 != null) {
                            if (evu0.J(str3)) {
                                str3 = null;
                            }
                        }
                        String str7 = pinStateDto2.f;
                        if (str7 != null && !evu0.J(str7)) {
                            str3 = str7;
                            iw30Var = new kw30(str4, d, str6, str3, w6l0Var.d, w6l0Var.e, w6l0Var.f, w6l0Var.g, w6l0Var.h, 768);
                        }
                    }
                    str3 = null;
                    iw30Var = new kw30(str4, d, str6, str3, w6l0Var.d, w6l0Var.e, w6l0Var.f, w6l0Var.g, w6l0Var.h, 768);
                } else if (z6l0Var instanceof y6l0) {
                    y6l0 y6l0Var = (y6l0) z6l0Var;
                    lw30Var = new mw30(y6l0Var.a, d(y6l0Var.c));
                } else if (z6l0Var instanceof x6l0) {
                    x6l0 x6l0Var = (x6l0) z6l0Var;
                    lw30Var = new lw30(x6l0Var.a, d(x6l0Var.c), x6l0Var.d, x6l0Var.e);
                } else if (z6l0Var instanceof t6l0) {
                    t6l0 t6l0Var = (t6l0) z6l0Var;
                    List list4 = t6l0Var.b;
                    String str8 = t6l0Var.a;
                    Route d2 = d(t6l0Var.c);
                    PinStateDto pinStateDto3 = (PinStateDto) a.R(list4);
                    if (pinStateDto3 != null) {
                        String str9 = pinStateDto3.a;
                        if (str9 != null) {
                            if (evu0.J(str9)) {
                                str9 = null;
                            }
                        }
                        str9 = pinStateDto3.f;
                        if (str9 != null) {
                        }
                    }
                    String str10 = null;
                    PinStateDto pinStateDto4 = (PinStateDto) a.b0(list4);
                    if (pinStateDto4 != null) {
                        str2 = pinStateDto4.a;
                        if (str2 != null) {
                            if (evu0.J(str2)) {
                                str2 = null;
                            }
                        }
                        String str11 = pinStateDto4.f;
                        if (str11 != null && !evu0.J(str11)) {
                            str2 = str11;
                            iw30Var = new hw30(str8, d2, str10, str2, t6l0Var.d, t6l0Var.e, t6l0Var.f);
                        }
                    }
                    str2 = null;
                    iw30Var = new hw30(str8, d2, str10, str2, t6l0Var.d, t6l0Var.e, t6l0Var.f);
                } else {
                    if (!(z6l0Var instanceof u6l0)) {
                        w511.b();
                        return null;
                    }
                    u6l0 u6l0Var = (u6l0) z6l0Var;
                    List list5 = u6l0Var.b;
                    String str12 = u6l0Var.a;
                    Route d3 = d(u6l0Var.c);
                    PinStateDto pinStateDto5 = (PinStateDto) a.R(list5);
                    if (pinStateDto5 != null) {
                        String str13 = pinStateDto5.a;
                        if (str13 != null) {
                            if (evu0.J(str13)) {
                                str13 = null;
                            }
                        }
                        str13 = pinStateDto5.f;
                        if (str13 != null) {
                        }
                    }
                    String str14 = null;
                    PinStateDto pinStateDto6 = (PinStateDto) a.b0(list5);
                    if (pinStateDto6 != null) {
                        str = pinStateDto6.a;
                        if (str != null) {
                            if (evu0.J(str)) {
                                str = null;
                            }
                        }
                        String str15 = pinStateDto6.f;
                        if (str15 != null && !evu0.J(str15)) {
                            str = str15;
                            iw30Var = new iw30(str12, d3, str14, str, u6l0Var.d, u6l0Var.e, u6l0Var.f, 128);
                        }
                    }
                    str = null;
                    iw30Var = new iw30(str12, d3, str14, str, u6l0Var.d, u6l0Var.e, u6l0Var.f, 128);
                }
                lw30Var = iw30Var;
            }
            arrayList.add(lw30Var);
        }
        return arrayList;
    }

    public static final pzu f(pzu pzuVar, String str) {
        if (pzuVar == null) {
            return pzuVar;
        }
        if (str == null || evu0.J(str)) {
            return pzuVar;
        }
        if (pzuVar instanceof hzu) {
            hzu hzuVar = (hzu) pzuVar;
            String str2 = hzuVar.a;
            String str3 = hzuVar.b;
            HubOfferType hubOfferType = hzuVar.c;
            String str4 = hzuVar.d;
            atj0 atj0Var = hzuVar.e;
            kz6 kz6Var = hzuVar.f;
            return new hzu(str2, str3, hubOfferType, str4, atj0Var, kz6Var != null ? kz6.a(kz6Var, f(kz6Var.c, str), null, null, HProv.PP_PASSWD_TERM) : null, hzuVar.g, hzuVar.h, hzuVar.i, g(str, hzuVar.j), hzuVar.k, hzuVar.l, hzuVar.m, hzuVar.n, str, null, 32768);
        }
        if (!(pzuVar instanceof vyu)) {
            return pzuVar;
        }
        vyu vyuVar = (vyu) pzuVar;
        String str5 = vyuVar.a;
        String str6 = vyuVar.b;
        String str7 = vyuVar.c;
        kz6 kz6Var2 = vyuVar.d;
        return new vyu(str5, str6, str7, kz6Var2 != null ? kz6.a(kz6Var2, f(kz6Var2.c, str), null, null, HProv.PP_PASSWD_TERM) : null, g(str, vyuVar.e), vyuVar.f, str, null, vyuVar.i, 128);
    }

    public static final List g(String str, List list) {
        String str2;
        if (str == null || evu0.J(str)) {
            return list;
        }
        List<z6l0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (z6l0 z6l0Var : list2) {
            if (z6l0Var instanceof w6l0) {
                w6l0 w6l0Var = (w6l0) z6l0Var;
                str2 = str;
                z6l0Var = new w6l0(w6l0Var.a, w6l0Var.b, w6l0Var.c, w6l0Var.d, w6l0Var.e, w6l0Var.f, str2, w6l0Var.h);
            } else {
                str2 = str;
                if (z6l0Var instanceof t6l0) {
                    t6l0 t6l0Var = (t6l0) z6l0Var;
                    z6l0Var = new t6l0(t6l0Var.a, t6l0Var.b, t6l0Var.c, t6l0Var.d, t6l0Var.e, str2);
                } else if (z6l0Var instanceof u6l0) {
                    u6l0 u6l0Var = (u6l0) z6l0Var;
                    z6l0Var = new u6l0(u6l0Var.a, u6l0Var.b, u6l0Var.c, u6l0Var.d, u6l0Var.e, u6l0Var.f);
                }
            }
            arrayList.add(z6l0Var);
            str = str2;
        }
        return arrayList;
    }

    public static void h(int i, Object obj) {
        if (obj != null) {
            return;
        }
        ny61.t(oyr.i(i, "at index "));
    }
}
