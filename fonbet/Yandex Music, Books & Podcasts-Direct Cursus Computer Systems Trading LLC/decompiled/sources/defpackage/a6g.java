package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class a6g extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6g(int i, long j, List list) {
        super(1);
        this.r = i;
        this.s = j;
        this.t = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long valueOf;
        Long valueOf2;
        float value;
        Iterator it;
        int i;
        switch (this.r) {
            case 0:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                float d = nmq.d(jpaVar.e());
                float b = nmq.b(jpaVar.e());
                long j = this.s;
                long j2 = j - 30000;
                List list = this.t;
                List list2 = list;
                Iterator it2 = list2.iterator();
                Object obj2 = null;
                if (it2.hasNext()) {
                    valueOf = Long.valueOf(((z5g) it2.next()).getValue());
                    while (it2.hasNext()) {
                        Long valueOf3 = Long.valueOf(((z5g) it2.next()).getValue());
                        if (valueOf.compareTo(valueOf3) < 0) {
                            valueOf = valueOf3;
                        }
                    }
                } else {
                    valueOf = null;
                }
                float f = 0.0f;
                float longValue = valueOf != null ? valueOf.longValue() * 2.0f : 0.0f;
                Iterator it3 = list2.iterator();
                if (it3.hasNext()) {
                    valueOf2 = Long.valueOf(((z5g) it3.next()).getValue());
                    while (it3.hasNext()) {
                        Long valueOf4 = Long.valueOf(((z5g) it3.next()).getValue());
                        if (valueOf2.compareTo(valueOf4) > 0) {
                            valueOf2 = valueOf4;
                        }
                    }
                } else {
                    valueOf2 = null;
                }
                float longValue2 = valueOf2 != null ? valueOf2.longValue() * 2.0f : 0.0f;
                int i2 = 1;
                if (list.isEmpty()) {
                    value = 0.0f;
                } else {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object previous = listIterator.previous();
                            if (((z5g) previous).getTimestamp() < j2) {
                                obj2 = previous;
                            }
                        }
                    }
                    value = (1 - ((((z5g) obj2) != null ? r7.getValue() : 0L) / (longValue - longValue2))) * b;
                }
                it = list.iterator();
                while (it.hasNext()) {
                    if (((z5g) it.next()).getTimestamp() >= j2) {
                        float timestamp = ((r3.getTimestamp() - j2) / 30000.0f) * d;
                        float value2 = (i2 - (r3.getValue() / (longValue - longValue2))) * b;
                        i = i2;
                        jpaVar.s(d85.h, swf.i(f, value), swf.i(timestamp, value2), (r18 & 8) != 0 ? 0.0f : 4.0f, (r18 & 16) != 0 ? 0 : 1);
                        value = value2;
                        f = timestamp;
                    } else {
                        i = i2;
                    }
                    i2 = i;
                }
                if (j < j) {
                    d *= (j - j2) / 30000.0f;
                }
                jpaVar.s(d85.h, swf.i(f, value), swf.i(d, value), (r18 & 8) != 0 ? 0.0f : 4.0f, (r18 & 16) != 0 ? 0 : 1);
                break;
            default:
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                float b2 = nmq.b(jpaVar2.e());
                long j3 = this.s - 30000;
                for (cgg cggVar : this.t) {
                    if (cggVar.a >= j3) {
                        float d2 = ((cggVar.a - j3) / 30000.0f) * nmq.d(jpaVar2.e());
                        jpaVar2.s(cggVar.b ? d85.h : d85.g, swf.i(d2, 0.0f), swf.i(d2, b2), (r18 & 8) != 0 ? 0.0f : 4.0f, (r18 & 16) != 0 ? 0 : 1);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
