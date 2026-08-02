package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class jzo implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ raj b;
    public final /* synthetic */ wdj c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yci e;
    public final /* synthetic */ int f;

    public /* synthetic */ jzo(raj rajVar, wdj wdjVar, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = rajVar;
        this.c = wdjVar;
        this.d = z;
        this.e = yciVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                zwf.j(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wxf.d(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
        }
        return Unit.a;
    }
}
