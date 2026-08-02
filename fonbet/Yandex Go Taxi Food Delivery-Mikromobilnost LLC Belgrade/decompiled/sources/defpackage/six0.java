package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes14.dex */
public final class six0 implements tls {
    public final /* synthetic */ fnx0 A;
    public final /* synthetic */ int a;
    public final /* synthetic */ tix0 b;
    public final /* synthetic */ mix0 c;
    public final /* synthetic */ List w;
    public final /* synthetic */ kix0 x;
    public final /* synthetic */ eij0 y;
    public final /* synthetic */ d3u z;

    public /* synthetic */ six0(tix0 tix0Var, mix0 mix0Var, lix0 lix0Var, List list, kix0 kix0Var, eij0 eij0Var, d3u d3uVar, fnx0 fnx0Var, int i) {
        this.a = i;
        this.b = tix0Var;
        this.c = mix0Var;
        this.w = list;
        this.x = kix0Var;
        this.y = eij0Var;
        this.z = d3uVar;
        this.A = fnx0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        fnx0 fnx0Var = this.A;
        d3u d3uVar = this.z;
        Object obj2 = this.y;
        kix0 kix0Var = this.x;
        List list = this.w;
        final mix0 mix0Var = this.c;
        tix0 tix0Var = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                bix0 bix0Var = (bix0) obj;
                tix0Var.w.e(fnx0Var);
                ArrayList arrayList = d3uVar.b;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                final int i2 = 0;
                int i3 = 0;
                for (Object obj3 : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    Iterable iterable = (List) obj3;
                    if (i3 == 0) {
                        iterable = a.m0(iterable, a.m0(list, d3uVar.c));
                    }
                    arrayList2.add(iterable);
                    i3 = i4;
                }
                boolean isEmpty = arrayList2.isEmpty();
                Collection collection = arrayList2;
                if (isEmpty) {
                    collection = Collections.singletonList(list);
                }
                ArrayList arrayList3 = (List) collection;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new kix0((List) it.next(), new pjv0(11)));
                }
                bix0Var.b(arrayList4, new tls() { // from class: oix0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        int i5 = i2;
                        mix0 mix0Var2 = mix0Var;
                        f3q0 f3q0Var = (f3q0) obj4;
                        switch (i5) {
                            case 0:
                                if (!f3q0Var.a) {
                                    break;
                                }
                                break;
                            default:
                                if (!f3q0Var.a) {
                                    break;
                                }
                                break;
                        }
                        return mix0Var2.a();
                    }
                });
                ArrayList arrayList5 = bix0Var.a;
                ArrayList arrayList6 = bix0Var.c;
                bix0 bix0Var2 = new bix0();
                bix0Var2.b.addAll(bix0Var.b);
                bix0Var2.a(kix0Var, null);
                ArrayList arrayList7 = bix0Var2.a;
                if (!arrayList7.isEmpty()) {
                    if (obj2 == null) {
                        obj2 = mix0Var.a();
                    }
                    if (obj2 != null) {
                        arrayList5.add(obj2);
                    }
                    arrayList5.addAll(arrayList7);
                    arrayList6.addAll(bix0Var2.c);
                    bix0Var.c(arrayList7);
                }
                return zy11Var;
            default:
                bix0 bix0Var3 = (bix0) obj;
                tix0Var.w.e(fnx0Var);
                kix0 kix0Var2 = new kix0(a.m0(list, d3uVar.c), new pjv0(12));
                ArrayList arrayList8 = d3uVar.b;
                ArrayList arrayList9 = new ArrayList(tcc.n(arrayList8, 10));
                Iterator it2 = arrayList8.iterator();
                while (it2.hasNext()) {
                    arrayList9.add(new kix0((List) it2.next(), new pjv0(13)));
                }
                final int i5 = 1;
                bix0Var3.b(a.m0(arrayList9, Collections.singletonList(kix0Var2)), new tls() { // from class: oix0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        int i52 = i5;
                        mix0 mix0Var2 = mix0Var;
                        f3q0 f3q0Var = (f3q0) obj4;
                        switch (i52) {
                            case 0:
                                if (!f3q0Var.a) {
                                    break;
                                }
                                break;
                            default:
                                if (!f3q0Var.a) {
                                    break;
                                }
                                break;
                        }
                        return mix0Var2.a();
                    }
                });
                ArrayList arrayList10 = bix0Var3.a;
                ArrayList arrayList11 = bix0Var3.c;
                bix0 bix0Var4 = new bix0();
                bix0Var4.b.addAll(bix0Var3.b);
                bix0Var4.a(kix0Var, null);
                ArrayList arrayList12 = bix0Var4.a;
                if (!arrayList12.isEmpty()) {
                    if (obj2 == null) {
                        obj2 = mix0Var.a();
                    }
                    if (obj2 != null) {
                        arrayList10.add(obj2);
                    }
                    arrayList10.addAll(arrayList12);
                    arrayList11.addAll(bix0Var4.c);
                    bix0Var3.c(arrayList12);
                }
                return zy11Var;
        }
    }
}
