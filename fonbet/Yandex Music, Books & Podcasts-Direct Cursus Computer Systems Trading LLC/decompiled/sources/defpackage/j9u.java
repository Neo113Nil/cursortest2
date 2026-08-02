package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class j9u implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ j9u(float f, Function1 function1, int i) {
        this.a = i;
        this.b = f;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.p(jfpVar, new j9u(this.b, this.c, 1));
                return Unit.a;
            default:
                Float f = (Float) obj;
                if (f.floatValue() == this.b) {
                    z = false;
                } else {
                    this.c.invoke(f);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
