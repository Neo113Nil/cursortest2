package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class mv0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mv0(Object obj, Object obj2, Object obj3, long j, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = j;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ((pv0) this.b).c((yks) this.c, (vov) this.f, this.d, (hq5) obj, rvf.R(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((pv0) this.b).d((yks) this.c, (uov) this.f, this.d, (hq5) obj, rvf.R(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                qgg.h((dh3) this.b, (zyj) this.c, (Function0) this.f, this.d, (hq5) obj, rvf.R(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
