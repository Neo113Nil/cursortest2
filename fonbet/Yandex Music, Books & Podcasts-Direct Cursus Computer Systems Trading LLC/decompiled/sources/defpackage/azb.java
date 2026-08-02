package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class azb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ azb(Object obj, yci yciVar, long j, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = yciVar;
        this.c = j;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                lg3.c((jzb) this.e, this.b, this.c, (hq5) obj, rvf.R(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                o2g.e((cds) this.e, this.b, this.c, (hq5) obj, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
