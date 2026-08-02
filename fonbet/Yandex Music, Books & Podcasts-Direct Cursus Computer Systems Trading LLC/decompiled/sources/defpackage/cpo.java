package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class cpo implements zoo {
    public final /* synthetic */ uif a;
    public final /* synthetic */ uif b;

    /* JADX WARN: Multi-variable type inference failed */
    public cpo(Function2 function2, Function1 function1) {
        this.a = (uif) function2;
        this.b = (uif) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2, uif] */
    @Override // defpackage.zoo
    public final Object a(goo gooVar, Object obj) {
        return this.a.invoke(gooVar, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.zoo
    public final Object f(Object obj) {
        return this.b.invoke(obj);
    }
}
