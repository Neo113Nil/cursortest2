package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class gdi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ksk b;
    public final /* synthetic */ mfh c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public /* synthetic */ gdi(ksk kskVar, mfh mfhVar, float f, float f2, int i) {
        this.a = i;
        this.b = kskVar;
        this.c = mfhVar;
        this.d = f;
        this.e = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        switch (this.a) {
            case 0:
                jskVar.getClass();
                mfh mfhVar = this.c;
                jskVar.d(this.b, -mfhVar.L(this.d), -mfhVar.L(this.e), 0.0f);
                break;
            case 1:
                jskVar.getClass();
                mfh mfhVar2 = this.c;
                jskVar.d(this.b, -mfhVar2.L(this.d), -mfhVar2.L(this.e), 0.0f);
                break;
            default:
                jskVar.getClass();
                mfh mfhVar3 = this.c;
                jsk.g(jskVar, this.b, mfhVar3.L(this.d), mfhVar3.L(this.e));
                break;
        }
        return Unit.a;
    }
}
