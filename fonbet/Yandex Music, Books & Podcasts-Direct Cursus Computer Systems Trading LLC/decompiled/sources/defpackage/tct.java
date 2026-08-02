package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class tct implements uct {
    public final Object a;
    public final /* synthetic */ Function1 b;

    public tct(Function1 function1, Object obj) {
        this.b = function1;
        this.a = obj;
    }

    @Override // defpackage.uct
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.uct
    public final boolean b(Object obj) {
        return ((Boolean) this.b.invoke(obj)).booleanValue();
    }
}
