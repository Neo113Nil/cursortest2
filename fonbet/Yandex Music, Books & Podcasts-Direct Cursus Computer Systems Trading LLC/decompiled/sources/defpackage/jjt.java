package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class jjt implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ njt b;
    public final /* synthetic */ yit c;

    public /* synthetic */ jjt(njt njtVar, yit yitVar, int i) {
        this.a = i;
        this.b = njtVar;
        this.c = yitVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                njt njtVar = this.b;
                njtVar.getClass();
                yit yitVar = this.c;
                yitVar.getClass();
                njtVar.c.b(yitVar);
                break;
            default:
                njt njtVar2 = this.b;
                njtVar2.getClass();
                yit yitVar2 = this.c;
                yitVar2.getClass();
                njtVar2.c.b(yitVar2);
                break;
        }
        return Unit.a;
    }
}
