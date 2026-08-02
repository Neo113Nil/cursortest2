package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class kww extends bt1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nww d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kww(nww nwwVar, Object obj, int i) {
        super(2, nwwVar);
        this.c = i;
        this.d = nwwVar;
        this.e = obj;
    }

    @Override // defpackage.bt1
    public final void c() {
        rfq rfqVar;
        Set set;
        switch (this.c) {
            case 0:
                nww nwwVar = this.d;
                xww xwwVar = nwwVar.a;
                Context context = nwwVar.c;
                y8p y8pVar = new y8p(nwwVar.d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.e;
                for (fo0 fo0Var : hashMap.keySet()) {
                    fo0Var.getClass();
                    if (((iww) hashMap.get(fo0Var)).c) {
                        arrayList2.add(fo0Var);
                    } else {
                        arrayList.add(fo0Var);
                    }
                }
                int i = 0;
                int i2 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i < size) {
                        i2 = y8pVar.q(context, (fo0) arrayList2.get(i));
                        i++;
                        if (i2 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        i2 = y8pVar.q(context, (fo0) arrayList.get(i));
                        i++;
                        if (i2 != 0) {
                        }
                    }
                }
                if (i2 != 0) {
                    jww jwwVar = new jww(this, nwwVar, new h66(i2, null));
                    sww swwVar = xwwVar.k;
                    swwVar.sendMessage(swwVar.obtainMessage(1, jwwVar));
                    break;
                } else {
                    if (nwwVar.m && (rfqVar = nwwVar.k) != null) {
                        rfqVar.j(new dr2(rfqVar));
                    }
                    for (fo0 fo0Var2 : hashMap.keySet()) {
                        cr2 cr2Var = (cr2) hashMap.get(fo0Var2);
                        fo0Var2.getClass();
                        if (y8pVar.q(context, fo0Var2) != 0) {
                            gww gwwVar = new gww(nwwVar, cr2Var);
                            sww swwVar2 = xwwVar.k;
                            swwVar2.sendMessage(swwVar2.obtainMessage(1, gwwVar));
                        } else {
                            fo0Var2.j(cr2Var);
                        }
                    }
                    break;
                }
            default:
                nww nwwVar2 = this.d;
                xww xwwVar2 = nwwVar2.a;
                uww uwwVar = xwwVar2.s;
                rn5 rn5Var = nwwVar2.r;
                if (rn5Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) rn5Var.b);
                    Map map = (Map) rn5Var.d;
                    for (po0 po0Var : map.keySet()) {
                        if (!xwwVar2.m.containsKey(po0Var.b)) {
                            map.get(po0Var).getClass();
                            l1j.f();
                            break;
                        }
                    }
                    set = hashSet;
                }
                uwwVar.p = set;
                ArrayList arrayList3 = (ArrayList) this.e;
                int size3 = arrayList3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((fo0) arrayList3.get(i3)).f(nwwVar2.o, xwwVar2.s.p);
                }
                break;
        }
    }
}
