package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class t44 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ t44(List list) {
        this.a = 5;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                up6.f(this.b, (hq5) obj, R);
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                c3x.o(this.b, (hq5) obj, R2);
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(1);
                avf.a(this.b, (hq5) obj, R3);
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                int R4 = rvf.R(1);
                swf.a(this.b, (hq5) obj, R4);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                int R5 = rvf.R(1);
                swf.b(this.b, (hq5) obj, R5);
                return Unit.a;
            case 5:
                ohb ohbVar = (ohb) obj2;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    obj = ((rqn) it.next()).b(obj, ohbVar);
                }
                return obj;
            default:
                ((Integer) obj2).getClass();
                int R6 = rvf.R(1);
                qzv.a(this.b, (hq5) obj, R6);
                return Unit.a;
        }
    }

    public /* synthetic */ t44(int i, int i2, List list) {
        this.a = i2;
        this.b = list;
    }
}
