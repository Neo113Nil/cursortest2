package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class nu6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sdr c;

    public /* synthetic */ nu6(boolean z, sdr sdrVar, int i) {
        this.a = i;
        this.b = z;
        this.c = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zco zcoVar = (zco) obj;
        zcoVar.getClass();
        switch (i) {
            case 0:
                zcoVar.a(((Number) this.c.getValue()).floatValue());
                if (!this.b) {
                    zcoVar.d(2);
                    zcoVar.c(false);
                }
                break;
            default:
                zcoVar.a(this.b ? ((Number) this.c.getValue()).floatValue() : 1.0f);
                zcoVar.c(false);
                zcoVar.d(2);
                break;
        }
        return Unit.a;
    }
}
