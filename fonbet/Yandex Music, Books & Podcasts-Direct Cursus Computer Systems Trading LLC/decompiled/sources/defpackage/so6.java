package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class so6 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ so6(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (Integer) ((ro6) this.b).invoke(obj);
            case 1:
                return (ConcurrentHashMap) ((qxb) this.b).invoke(obj);
            case 2:
                return (a5m) ((i50) this.b).invoke(obj);
            case 3:
                return (oqi) ((osl) this.b).invoke(obj);
            default:
                return this.b.invoke(obj);
        }
    }
}
