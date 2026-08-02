package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.extracted_form_common_data.api.DeliveryDataProvider$UpdateState;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySelectedFrom;

/* loaded from: classes9.dex */
public final class y5i implements elb0 {
    public final pii a;
    public final r0 b;
    public final r0 c;
    public final gci0 d;
    public final gci0 e;
    public final LinkedHashSet f;
    public lud0 g;
    public List h;
    public DeliveryDataProvider$UpdateState i;
    public String j;
    public final r0 k;

    public y5i(pii piiVar) {
        this.a = piiVar;
        r0 c = bvf0.c(b.f());
        this.b = c;
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.c = c2;
        this.d = e.d(c);
        this.e = e.d(c2);
        this.f = new LinkedHashSet();
        this.g = new lud0(null, DeliveryFormStepType.SOURCE, 5);
        this.h = EmptyList.a;
        this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
        this.k = bvf0.c(new x5i(0));
    }

    public static /* synthetic */ void i(y5i y5iVar, lud0 lud0Var, r0i r0iVar, String str, String str2, String str3, String str4, String str5, Map map, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            map = null;
        }
        y5iVar.h(lud0Var, r0iVar, str, str2, str3, str4, str5, map, null);
    }

    public static vuh j(lud0 lud0Var) {
        return new vuh(lud0Var.d, lud0Var.e, lud0Var.g, lud0Var.f, lud0Var.h, lud0Var.i, lud0Var.j, a.J0(lud0Var.k.values()), lud0Var.c.toString());
    }

    public static void n(y5i y5iVar, int i, r0i r0iVar, String str, String str2, String str3, String str4, String str5, LinkedHashMap linkedHashMap, int i2) {
        Boolean bool = Boolean.FALSE;
        if ((i2 & 2) != 0) {
            r0iVar = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            bool = null;
        }
        if ((i2 & 256) != 0) {
            linkedHashMap = null;
        }
        lud0 lud0Var = (lud0) a.S(i, y5iVar.h);
        if (lud0Var != null) {
            y5iVar.h(lud0Var, r0iVar, str, str2, str3, str4, str5, linkedHashMap, bool);
            y5iVar.k();
        }
    }

    public static void q(y5i y5iVar, r0i r0iVar, String str, String str2, String str3, String str4, String str5, LinkedHashMap linkedHashMap, int i) {
        Boolean bool = Boolean.FALSE;
        y5iVar.h(y5iVar.g, (i & 1) != 0 ? null : r0iVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 128) != 0 ? null : linkedHashMap, (i & 64) != 0 ? null : bool);
        y5iVar.k();
    }

    @Override // defpackage.elb0
    public final gci0 a() {
        return this.d;
    }

    @Override // defpackage.elb0
    public final void b(mkb0 mkb0Var, okb0 okb0Var) {
        if (this.g.k.containsKey(mkb0Var.getId())) {
            this.g.k.put(mkb0Var.getId(), mkb0Var);
            this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
            k();
            return;
        }
        for (lud0 lud0Var : this.h) {
            if (lud0Var.k.containsKey(mkb0Var.getId())) {
                lud0Var.k.put(mkb0Var.getId(), mkb0Var);
                this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
                k();
            }
        }
    }

    @Override // defpackage.elb0
    public final void c(LinkedHashMap linkedHashMap) {
    }

    @Override // defpackage.elb0
    public final gci0 d() {
        return this.e;
    }

    @Override // defpackage.elb0
    public final void e(ikb0 ikb0Var, okb0 okb0Var) {
        Integer num;
        Map map;
        mkb0 mkb0Var = null;
        if (okb0Var instanceof erv) {
            num = Integer.valueOf(((erv) okb0Var).a);
        } else {
            if (okb0Var instanceof r5s) {
                c0k0 a = ((r5s) okb0Var).a();
                yzj0 yzj0Var = a instanceof yzj0 ? (yzj0) a : null;
                if (yzj0Var != null) {
                    num = Integer.valueOf(yzj0Var.b());
                }
            }
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                this.g.k.put(ikb0Var.getId(), ikb0Var);
                this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
                k();
            } else {
                lud0 lud0Var = (lud0) a.S(intValue - 1, this.h);
                if (lud0Var != null && (map = lud0Var.k) != null) {
                    mkb0Var = (mkb0) map.put(ikb0Var.getId(), ikb0Var);
                }
                this.i = mkb0Var != null ? DeliveryDataProvider$UpdateState.NEED_UPDATE : DeliveryDataProvider$UpdateState.NOT_NEED_UPDATE;
                k();
            }
        }
    }

    @Override // defpackage.elb0
    public final void f(boolean z) {
        qv10.B(z, this.c, null);
    }

    @Override // defpackage.elb0
    public final void g(String str, okb0 okb0Var) {
        if (this.g.k.containsKey(str)) {
            this.g.k.remove(str);
            this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
            k();
        } else {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                if (((mkb0) ((lud0) it.next()).k.remove(str)) != null) {
                    this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
                    k();
                }
            }
        }
    }

    public final void h(lud0 lud0Var, r0i r0iVar, String str, String str2, String str3, String str4, String str5, Map map, Boolean bool) {
        if (str != null) {
            lud0Var.g = str;
            this.i = DeliveryDataProvider$UpdateState.NOT_NEED_UPDATE;
        }
        if (str2 != null) {
            lud0Var.h = str2;
            this.i = DeliveryDataProvider$UpdateState.NOT_NEED_UPDATE;
        }
        if (str3 != null) {
            lud0Var.i = str3;
            this.i = DeliveryDataProvider$UpdateState.NOT_NEED_UPDATE;
        }
        if (str4 != null) {
            lud0Var.e = str4;
            this.i = DeliveryDataProvider$UpdateState.NOT_NEED_UPDATE;
        }
        if (str5 != null) {
            lud0Var.f = str5;
            this.i = DeliveryDataProvider$UpdateState.NOT_NEED_UPDATE;
        }
        if (map != null) {
            lud0Var.k = map;
            this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
        }
        if (bool != null) {
            lud0Var.j = bool.booleanValue();
            this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
        }
        if (r0iVar != null) {
            lud0Var.d = r0iVar;
            DeliverySelectedFrom deliverySelectedFrom = r0iVar.c;
            lud0Var.j = deliverySelectedFrom == DeliverySelectedFrom.SUGGEST || deliverySelectedFrom == DeliverySelectedFrom.ORDER_FOR_ANOTHER;
            this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
        }
    }

    public final void k() {
        vuh j = j(this.g);
        List list = this.h;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((lud0) it.next()));
        }
        x5i x5iVar = new x5i(new cni(j, arrayList), this.i);
        r0 r0Var = this.k;
        r0Var.getClass();
        r0Var.m(null, x5iVar);
        int i = 0;
        Pair pair = new Pair(new erv(0), a.J0(this.g.k.values()));
        List list2 = this.h;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList2.add(new Pair(new erv(i2), a.J0(((lud0) obj).k.values())));
            i = i2;
        }
        LinkedHashMap l = b.l(pair);
        b.p(l, arrayList2);
        Map t = b.t(l);
        r0 r0Var2 = this.b;
        r0Var2.getClass();
        r0Var2.m(null, t);
        this.i = DeliveryDataProvider$UpdateState.NOT_NEED_UPDATE;
    }

    public final cni l() {
        return ((x5i) this.k.getValue()).a;
    }

    public final vuh m(int i) {
        List list = ((x5i) this.k.getValue()).a.b;
        return i < list.size() ? (vuh) list.get(i) : vuh.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a0, code lost:
    
        if (defpackage.i991.b(r1) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(ArrayList arrayList) {
        Object obj;
        r0i r0iVar;
        uuh uuhVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List J0 = a.J0(this.h);
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            Map map = null;
            if (i < 0) {
                scc.m();
                throw null;
            }
            uuh uuhVar2 = (uuh) obj2;
            Iterator it = J0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                lud0 lud0Var = (lud0) obj;
                uuh uuhVar3 = lud0Var.a;
                if (jl40.l(uuhVar3 != null ? uuhVar3.h : null, uuhVar2.h) && !a.G(linkedHashSet, lud0Var.a)) {
                    break;
                }
            }
            lud0 lud0Var2 = (lud0) obj;
            if (lud0Var2 != null && (uuhVar = lud0Var2.a) != null) {
                linkedHashSet.add(uuhVar);
            }
            lud0 lud0Var3 = new lud0(uuhVar2, DeliveryFormStepType.DESTINATION, 4);
            lud0 lud0Var4 = (lud0) a.S(i, J0);
            r0i r0iVar2 = lud0Var4 != null ? lud0Var4.d : null;
            if (!i991.b(lud0Var2 != null ? lud0Var2.d : null)) {
                r0iVar = uuhVar2.a;
                if (!i991.b(r0iVar)) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                i(this, lud0Var3, r0iVar, r1, r6, r7, r8, r9, map, 256);
                arrayList2.add(lud0Var3);
                i = i2;
            } else if (lud0Var2 != null) {
                r0iVar2 = lud0Var2.d;
                r0iVar = r0iVar2;
                String str = lud0Var2 != null ? lud0Var2.g : null;
                String str2 = lud0Var2 != null ? lud0Var2.h : null;
                String str3 = lud0Var2 != null ? lud0Var2.i : null;
                String str4 = lud0Var2 != null ? lud0Var2.e : null;
                String str5 = lud0Var2 != null ? lud0Var2.f : null;
                if (lud0Var2 != null) {
                    map = lud0Var2.k;
                }
                i(this, lud0Var3, r0iVar, str, str2, str3, str4, str5, map, 256);
                arrayList2.add(lud0Var3);
                i = i2;
            } else {
                r0iVar = null;
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                if (lud0Var2 != null) {
                }
                i(this, lud0Var3, r0iVar, str, str2, str3, str4, str5, map, 256);
                arrayList2.add(lud0Var3);
                i = i2;
            }
        }
        this.h = arrayList2;
        this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
        k();
    }

    public final void p(uuh uuhVar) {
        r0i r0iVar;
        DeliverySelectedFrom deliverySelectedFrom;
        if (jl40.l(this.g.a, uuhVar)) {
            return;
        }
        lud0 lud0Var = new lud0(uuhVar, DeliveryFormStepType.SOURCE, 4);
        String str = null;
        if (jl40.l(this.g.d, r0i.d) || ((deliverySelectedFrom = (r0iVar = this.g.d).c) != DeliverySelectedFrom.MANUAL && deliverySelectedFrom != DeliverySelectedFrom.CONTACTS)) {
            r0iVar = uuhVar != null ? uuhVar.a : null;
        }
        if (r0iVar == null) {
            String Ig = this.a.a.Ig();
            if (Ig == null) {
                Ig = "";
            }
            r0iVar = new r0i(str, Ig, 5);
        }
        i(this, lud0Var, r0iVar, null, null, null, null, null, null, 508);
        this.g = lud0Var;
        this.i = DeliveryDataProvider$UpdateState.NEED_UPDATE;
        k();
    }
}
