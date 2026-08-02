package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class b60 extends oj implements ryc {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b60(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        List h;
        List o0;
        dwj dwjVar;
        tnl tnlVar;
        switch (this.a) {
            case 0:
                rr3 rr3Var = (rr3) obj;
                List list = (List) obj2;
                dr3 dr3Var = (dr3) obj3;
                e60 e60Var = (e60) this.receiver;
                e60Var.getClass();
                List list2 = dr3Var.a;
                jyr jyrVar = dr3Var.b;
                if (list2.isEmpty()) {
                    return i60.a;
                }
                ((h60) e60Var.p.getValue()).getClass();
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj5 = it.next();
                        if (((vbc) obj5).b()) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                vbc vbcVar = (vbc) obj5;
                kja a = vbcVar != null ? h60.a(vbcVar) : kja.a;
                if (((List) ((Pair) jyrVar.getValue()).a).isEmpty() || ((List) ((Pair) jyrVar.getValue()).b).isEmpty()) {
                    rr3Var = null;
                }
                int i = rr3Var == null ? -1 : c60.a[rr3Var.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        list2 = (List) ((Pair) jyrVar.getValue()).a;
                    } else if (i == 2) {
                        list2 = (List) ((Pair) jyrVar.getValue()).b;
                    } else if (i != 3) {
                        b6e.s();
                        return null;
                    }
                }
                o8q o8qVar = (o8q) e60Var.n.getValue();
                o8qVar.getClass();
                skr skrVar = o8qVar.a;
                if (rr3Var == null) {
                    h = c5b.a;
                } else {
                    String c = skrVar.c(R.string.downloads_filter_own);
                    rr3 rr3Var2 = rr3.a;
                    sr3 sr3Var = new sr3(c, rr3Var2, rr3Var == rr3Var2);
                    String c2 = skrVar.c(R.string.downloads_filter_auto_cache);
                    rr3 rr3Var3 = rr3.b;
                    sr3 sr3Var2 = new sr3(c2, rr3Var3, rr3Var == rr3Var3);
                    String c3 = skrVar.c(R.string.downloads_filter_all);
                    rr3 rr3Var4 = rr3.c;
                    h = u75.h(sr3Var, sr3Var2, new sr3(c3, rr3Var4, rr3Var == rr3Var4));
                }
                int ordinal = a.ordinal();
                if (ordinal == 0) {
                    o0 = CollectionsKt.o0(list2, new C1318t(18));
                } else if (ordinal == 1) {
                    o0 = CollectionsKt.o0(list2, new C1318t(16));
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    o0 = CollectionsKt.o0(list2, new C1318t(17));
                }
                List list3 = o0;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    mqs mqsVar = ((jja) it2.next()).a;
                    arrayList.add(new b2t(oo6.a.a(mqsVar), mqsVar));
                }
                return new j60(arrayList, h);
            case 1:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                ((g64) this.receiver).getClass();
                return g64.a((gfw) obj, booleanValue, booleanValue2);
            case 2:
                ukj ukjVar = (ukj) obj;
                x66 x66Var = (x66) obj2;
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                cwj cwjVar = (cwj) this.receiver;
                skr skrVar2 = cwjVar.q;
                xdr xdrVar = cwjVar.x;
                if (booleanValue3) {
                    xdrVar.l(null);
                    dwjVar = new dwj(skrVar2.c(R.string.option_paywall_only_for_owner_message), null);
                } else {
                    if (!x66Var.a) {
                        xdrVar.l(null);
                        return hwj.a;
                    }
                    if (ukjVar == null) {
                        return gwj.a;
                    }
                    if (!(ukjVar instanceof skj)) {
                        if (!(ukjVar instanceof tkj)) {
                            b6e.s();
                            return null;
                        }
                        mkj mkjVar = ((tkj) ukjVar).a;
                        Map.Entry entry = (Map.Entry) CollectionsKt.R(mkjVar.b.entrySet());
                        bve bveVar = entry != null ? (bve) entry.getValue() : null;
                        xdrVar.l(bveVar != null ? bveVar.n : null);
                        if (bveVar == null) {
                            return new dwj(skrVar2.c(R.string.option_paywall_no_offers_message), mkjVar);
                        }
                        vat vatVar = new vat(skrVar2.c(R.string.subscribe_yandex_music), null, null);
                        String str = bveVar.g;
                        if (str != null) {
                            vatVar = new vat(str, bveVar.i, bveVar.k);
                        }
                        return new ewj(new o3n(mkjVar, (String) vatVar.a, (String) vatVar.b, (String) vatVar.c, bveVar.n != null));
                    }
                    xdrVar.l(null);
                    dwjVar = new dwj(skrVar2.c(R.string.option_paywall_no_offers_message), null);
                }
                return dwjVar;
            case 3:
                boolean booleanValue4 = ((Boolean) obj3).booleanValue();
                ((efl) this.receiver).getClass();
                return new yel(new zel((egl) obj, booleanValue4), (vbn) obj2);
            case 4:
                q1n q1nVar = (q1n) obj;
                q1n q1nVar2 = (q1n) obj2;
                q1n q1nVar3 = (q1n) obj3;
                ((j2n) this.receiver).getClass();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(s74.c);
                arrayList2.addAll(q1nVar2.a);
                arrayList2.addAll(q1nVar.a);
                arrayList2.addAll(q1nVar3.a);
                arrayList2.addAll(q1nVar2.b);
                arrayList2.addAll(q1nVar.b);
                arrayList2.addAll(q1nVar3.b);
                return arrayList2;
            default:
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                boolean booleanValue6 = ((Boolean) obj3).booleanValue();
                n5q n5qVar = (n5q) this.receiver;
                n5qVar.getClass();
                int ordinal2 = ((h5q) obj).ordinal();
                if (ordinal2 == 0) {
                    tnlVar = tnl.a;
                } else if (ordinal2 == 1) {
                    tnlVar = tnl.b;
                } else if (ordinal2 == 2) {
                    tnlVar = tnl.c;
                } else if (ordinal2 == 3) {
                    tnlVar = tnl.d;
                } else {
                    if (ordinal2 != 4) {
                        b6e.s();
                        return null;
                    }
                    tnlVar = tnl.e;
                }
                return new gzk(n5qVar.f.b, tnlVar, booleanValue5, booleanValue6);
        }
    }
}
