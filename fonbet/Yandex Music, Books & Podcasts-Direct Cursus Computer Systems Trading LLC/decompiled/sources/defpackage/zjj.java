package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zjj implements vjj {
    public final Function0 a;
    public final Object b;

    public zjj(kgk kgkVar, Function1 function1) {
        this.a = kgkVar;
        this.b = function1;
    }

    @Override // defpackage.vjj
    public final void onComplete() {
        Function0 function0 = this.a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // defpackage.vjj
    public final void onNext(Object obj) {
        this.b.invoke(obj);
    }
}
