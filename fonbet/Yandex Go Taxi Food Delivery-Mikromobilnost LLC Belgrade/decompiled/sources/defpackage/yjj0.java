package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.t8i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.orderforanother.repository.a;
import ru.yandex.taxi.requirements.models.domain.BubbleAvailability;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class yjj0 implements bxi0 {
    public final dqe0 a;
    public final w3r0 b;
    public final jbn c;
    public final axm d;
    public final a e;
    public final wiq0 f;
    public final t8i g;
    public final wt90 h;
    public final czi0 i;
    public final cjj0 j;
    public final hqj0 k;
    public final b8r l;
    public final maj0 m;
    public final c4r0 n;
    public final d o;
    public final o3i p;
    public final d9w q;

    public yjj0(dqe0 dqe0Var, w3r0 w3r0Var, jbn jbnVar, axm axmVar, a aVar, wiq0 wiq0Var, t8i t8iVar, wt90 wt90Var, czi0 czi0Var, cjj0 cjj0Var, hqj0 hqj0Var, b8r b8rVar, maj0 maj0Var, c4r0 c4r0Var, d dVar, o3i o3iVar, d9w d9wVar) {
        this.a = dqe0Var;
        this.b = w3r0Var;
        this.c = jbnVar;
        this.d = axmVar;
        this.e = aVar;
        this.f = wiq0Var;
        this.g = t8iVar;
        this.h = wt90Var;
        this.i = czi0Var;
        this.j = cjj0Var;
        this.k = hqj0Var;
        this.l = b8rVar;
        this.m = maj0Var;
        this.n = c4r0Var;
        this.o = dVar;
        this.p = o3iVar;
        this.q = d9wVar;
    }

    public static void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (jl40.l(((b580) it.next()).a, str)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            jst.e.j(new IllegalStateException(oyr.p("Try to remove requirement ", str, " but it does not exist!")));
            return;
        }
        b580 b580Var = (b580) arrayList.get(i2);
        if (str2.length() == 0) {
            arrayList.remove(i2);
            return;
        }
        boolean c = b580Var.c();
        List list = b580Var.e;
        if (!c) {
            jst.e.j(new IllegalStateException(unr0.p("Try to remove requirement ", str, " option ", str2, " but requirement is not selectable!")));
            arrayList.remove(i2);
            return;
        }
        int indexOf = list.indexOf(str2);
        if (indexOf < 0) {
            jst.e.j(new IllegalStateException(unr0.p("Try to remove requirement ", str, " option ", str2, " but it does not exist!")));
            return;
        }
        rf70 b = b580Var.b();
        nf70 nf70Var = b instanceof nf70 ? (nf70) b : null;
        if (nf70Var == null) {
            if (indexOf == 0) {
                arrayList.remove(i2);
                return;
            } else {
                jst.e.j(new IllegalStateException(unr0.p("Try to remove requirement ", str, " option ", str2, " but picked option name an values miss match")));
                return;
            }
        }
        ArrayList arrayList2 = nf70Var.a;
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        for (Object obj : arrayList2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            if (i3 != indexOf) {
                arrayList3.add(obj);
            }
            i3 = i4;
        }
        rf70 nf70Var2 = arrayList3.size() > 1 ? new nf70(arrayList3) : (rf70) arrayList3.get(0);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i5 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (i != indexOf) {
                arrayList4.add(obj2);
            }
            i = i5;
        }
        arrayList.set(i2, b580.a(b580Var, nf70Var2, arrayList4, null, 39));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, String str2, String str3, String str4) {
        pex0 pex0Var;
        pex0 pex0Var2;
        Object value;
        Object value2;
        pex0 pex0Var3;
        t8i.a aVar = t8i.a.b;
        qtb1 qtb1Var = qtb1.D;
        switch (str.hashCode()) {
            case -2044464599:
                if (str.equals("__order_for_other__")) {
                    this.e.f();
                    return;
                }
                break;
            case -1959289347:
                if (str.equals("__pay_on_delivery__")) {
                    this.h.a(false);
                    return;
                }
                break;
            case -1932536996:
                if (str.equals("__REMOVE_ALL_UNSUPPORTED__")) {
                    if (str3 == null) {
                        pex0Var2 = ((k) this.f).m();
                    } else {
                        mi31 d = b8r.d(this.l, str3, str4, 4);
                        if (d == null) {
                            pex0Var = null;
                            if (pex0Var != null) {
                                jst.e.j(new IllegalStateException(g8e.o("Try to remove all unavailable requirement on missing tariff ", str3)));
                                return;
                            }
                            ArrayList arrayList = new ArrayList(this.a.a.x);
                            bdj0 c = this.j.c(pex0Var, str4, arrayList, this.k.b(), cdj0.a);
                            if (c.b()) {
                                this.d.a(qtb1Var);
                            }
                            if (c.a()) {
                                this.e.f();
                            }
                            BubbleAvailability bubbleAvailability = c.f;
                            BubbleAvailability bubbleAvailability2 = BubbleAvailability.UNAVAILABLE;
                            if (bubbleAvailability == bubbleAvailability2) {
                                t8i t8iVar = this.g;
                                r0 r0Var = t8iVar.a;
                                do {
                                    value = r0Var.getValue();
                                } while (!r0Var.k(value, aVar));
                                t8iVar.c = null;
                            }
                            if (c.g == bubbleAvailability2) {
                                this.h.a(false);
                            }
                            for (Pair pair : c.b) {
                                if (((List) pair.f()).isEmpty()) {
                                    b((String) pair.c(), "", arrayList);
                                } else {
                                    Iterator it = ((List) pair.f()).iterator();
                                    while (it.hasNext()) {
                                        b((String) pair.c(), (String) it.next(), arrayList);
                                    }
                                }
                            }
                            w3r0.b(this.b, arrayList, null, null, null, 14);
                            return;
                        }
                        pex0Var2 = d.a;
                    }
                    pex0Var = pex0Var2;
                    if (pex0Var != null) {
                    }
                }
                break;
            case -1703473624:
                if (str.equals("__intercity_contact__")) {
                    ((e9w) this.q).c(null);
                    return;
                }
                break;
            case -1493878731:
                if (str.equals("__MULTICLASS_UNSUPPORTED__")) {
                    this.d.a(qtb1Var);
                    this.e.f();
                    w3r0.b(this.b, EmptyList.a, null, RequirementsChangedNotifier.ChangeType.REMOVE_UNSUPPORTED, null, 10);
                    return;
                }
                break;
            case -1236735989:
                if (str.equals("__delivery_d2d__")) {
                    o3i o3iVar = this.p;
                    Boolean bool = Boolean.FALSE;
                    r0 r0Var2 = o3iVar.a;
                    r0Var2.getClass();
                    r0Var2.m(null, bool);
                    return;
                }
                break;
            case -1236710517:
                if (str.equals("__preorder__")) {
                    this.d.a(qtb1Var);
                    return;
                }
                break;
            case -611872686:
                if (str.equals("__delivery_paid_insurance__")) {
                    this.o.a(false);
                    return;
                }
                break;
            case 764115876:
                if (str.equals("__delivery_rent__")) {
                    this.i.a.l(null);
                    return;
                }
                break;
            case 1693398143:
                if (str.equals("__delivery_explicit_comment__")) {
                    t8i t8iVar2 = this.g;
                    r0 r0Var3 = t8iVar2.a;
                    do {
                        value2 = r0Var3.getValue();
                    } while (!r0Var3.k(value2, aVar));
                    t8iVar2.c = null;
                    return;
                }
                break;
            case 2131255543:
                if (str.equals("alt_choice")) {
                    pex0 m = ((k) this.f).m();
                    if (m == null || !(m.O instanceof jjj0) || (pex0Var3 = m.M0) == null) {
                        return;
                    }
                    c4r0.g(this.n, SelectionOrigin.USER, pex0Var3.J0, null, 12);
                    this.m.a(m.b);
                    return;
                }
                break;
        }
        if (this.c.d().contains(str)) {
            this.d.a(qtb1Var);
        }
        ArrayList arrayList2 = new ArrayList(this.a.a.x);
        b(str, str2, arrayList2);
        w3r0.b(this.b, arrayList2, null, null, null, 14);
    }
}
