package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class j2b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ f6q c;

    public /* synthetic */ j2b(int i, f6q f6qVar, int i2) {
        this.a = i2;
        this.b = i;
        this.c = f6qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p3i p3iVar = (p3i) obj;
        switch (this.a) {
            case 0:
                p3iVar.getClass();
                p3iVar.c(Integer.valueOf(this.b), "audioSessionId");
                p3iVar.d("effectsImpl", this.c.a);
                break;
            default:
                p3iVar.getClass();
                p3iVar.c(Integer.valueOf(this.b), "audioSessionId");
                p3iVar.d("effectsImpl", this.c.a);
                break;
        }
        return Unit.a;
    }
}
