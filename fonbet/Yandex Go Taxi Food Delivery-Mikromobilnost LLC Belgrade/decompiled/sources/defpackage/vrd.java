package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final /* synthetic */ class vrd implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ asd b;

    public /* synthetic */ vrd(asd asdVar, int i) {
        this.a = i;
        this.b = asdVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        asd asdVar = this.b;
        switch (i) {
            case 0:
                List list = asdVar.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    rgo eventReporter = ((h4j0) it.next()).getEventReporter();
                    if (eventReporter != null) {
                        arrayList.add(eventReporter);
                    }
                }
                return arrayList;
            case 1:
                List list2 = asdVar.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    w8o c = ((h4j0) it2.next()).c();
                    if (c != null) {
                        arrayList2.add(c);
                    }
                }
                return arrayList2;
            case 2:
                List list3 = asdVar.a;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    pcj b = ((h4j0) it3.next()).b();
                    if (b != null) {
                        arrayList3.add(b);
                    }
                }
                return arrayList3;
            case 3:
                List list4 = asdVar.a;
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    b3u0 e = ((h4j0) it4.next()).e();
                    if (e != null) {
                        arrayList4.add(e);
                    }
                }
                return arrayList4;
            case 4:
                List list5 = asdVar.a;
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    zhl0 f = ((h4j0) it5.next()).f();
                    if (f != null) {
                        arrayList5.add(f);
                    }
                }
                return arrayList5;
            case 5:
                List list6 = asdVar.a;
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    uhl0 d = ((h4j0) it6.next()).d();
                    if (d != null) {
                        arrayList6.add(d);
                    }
                }
                return arrayList6;
            default:
                return new wrd(asdVar);
        }
    }
}
