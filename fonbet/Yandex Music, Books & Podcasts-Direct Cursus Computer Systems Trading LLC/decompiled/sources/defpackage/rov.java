package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class rov implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ukd c;
    public final /* synthetic */ kes d;
    public final /* synthetic */ plv e;

    public /* synthetic */ rov(String str, ukd ukdVar, kes kesVar, plv plvVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = ukdVar;
        this.d = kesVar;
        this.e = plvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                o2g.m(this.b, this.c, this.d, this.e, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                o2g.b(this.b, this.c, this.d, this.e, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }
}
