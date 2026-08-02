package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class jvb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jub b;

    public /* synthetic */ jvb(jub jubVar, int i) {
        this.a = i;
        this.b = jubVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                orf orfVar = (orf) obj;
                orfVar.getClass();
                this.b.h(orfVar);
                return Unit.a;
            case 1:
                ((oa8) obj).getClass();
                jub jubVar = this.b;
                jubVar.f();
                return new kwb(jubVar, 0);
            case 2:
                orf orfVar2 = (orf) obj;
                orfVar2.getClass();
                this.b.h(orfVar2);
                return Unit.a;
            default:
                ((oa8) obj).getClass();
                jub jubVar2 = this.b;
                jubVar2.f();
                return new kwb(jubVar2, 1);
        }
    }
}
