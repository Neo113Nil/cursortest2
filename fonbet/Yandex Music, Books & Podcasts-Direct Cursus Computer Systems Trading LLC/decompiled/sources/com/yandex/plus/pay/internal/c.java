package com.yandex.plus.pay.internal;

import com.yandex.plus.core.analytics.h;
import com.yandex.plus.core.analytics.k;
import com.yandex.plus.core.analytics.m;
import com.yandex.plus.core.analytics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.pay.internal.common.e b;

    public /* synthetic */ c(com.yandex.plus.pay.internal.common.e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new com.yandex.plus.pay.internal.common.a(this.b);
            case 1:
                List list = this.b.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.yandex.plus.core.analytics.f eventReporter = ((h) it.next()).getEventReporter();
                    if (eventReporter != null) {
                        arrayList.add(eventReporter);
                    }
                }
                return arrayList;
            case 2:
                List list2 = this.b.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    com.yandex.plus.core.analytics.e a = ((h) it2.next()).a();
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                return arrayList2;
            case 3:
                List list3 = this.b.a;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    com.yandex.plus.core.analytics.c d = ((h) it3.next()).d();
                    if (d != null) {
                        arrayList3.add(d);
                    }
                }
                return arrayList3;
            case 4:
                List list4 = this.b.a;
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    o e = ((h) it4.next()).e();
                    if (e != null) {
                        arrayList4.add(e);
                    }
                }
                return arrayList4;
            case 5:
                List list5 = this.b.a;
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    m f = ((h) it5.next()).f();
                    if (f != null) {
                        arrayList5.add(f);
                    }
                }
                return arrayList5;
            default:
                List list6 = this.b.a;
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    k b = ((h) it6.next()).b();
                    if (b != null) {
                        arrayList6.add(b);
                    }
                }
                return arrayList6;
        }
    }
}
