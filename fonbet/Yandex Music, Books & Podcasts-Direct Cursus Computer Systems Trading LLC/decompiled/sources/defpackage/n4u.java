package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class n4u implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ n4u(String str, Function0 function0, int i) {
        this.a = i;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        jfp jfpVar = (jfp) obj;
        jfpVar.getClass();
        switch (i) {
            case 0:
                jfpVar.o(hfp.w, t75.c(new nw6(this.b, new gct(2, this.c))));
                break;
            default:
                jfpVar.o(hfp.w, t75.c(new nw6(this.b, new gct(5, this.c))));
                break;
        }
        return Unit.a;
    }
}
