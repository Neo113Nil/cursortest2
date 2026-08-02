package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class kk6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rxv b;

    public /* synthetic */ kk6(rxv rxvVar, int i) {
        this.a = i;
        this.b = rxvVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        rxv rxvVar = this.b;
        switch (i) {
            case 0:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                t6k t6kVar = rxvVar.h;
                zcoVar.k(t6kVar.e());
                zcoVar.n(t6kVar.e());
                break;
            case 1:
                long j = ((enj) ((fk0) obj).e()).a;
                act actVar = rxv.K;
                rxvVar.q(j);
                break;
            case 2:
                long j2 = ((enj) ((fk0) obj).e()).a;
                act actVar2 = rxv.K;
                rxvVar.q(j2);
                break;
            case 3:
                long j3 = ((enj) ((fk0) obj).e()).a;
                act actVar3 = rxv.K;
                rxvVar.q(j3);
                break;
            default:
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                zcoVar2.a(rxvVar.i.e());
                break;
        }
        return Unit.a;
    }
}
