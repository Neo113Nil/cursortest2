package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public class ozb extends szb {
    public final Object a;

    public ozb(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.szb
    public Object a(xzb xzbVar) {
        return this.a;
    }

    @Override // defpackage.szb
    public final Object b() {
        Object obj = this.a;
        obj.getClass();
        return obj;
    }

    @Override // defpackage.szb
    public final ja8 c(xzb xzbVar, Function1 function1) {
        return ja8.b0;
    }

    @Override // defpackage.szb
    public final ja8 d(xzb xzbVar, Function1 function1) {
        function1.invoke(this.a);
        return ja8.b0;
    }
}
