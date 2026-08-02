package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tpf implements lfh {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ upf d;
    public final /* synthetic */ zpf e;
    public final /* synthetic */ Function1 f;

    public tpf(int i, int i2, Map map, upf upfVar, zpf zpfVar, Function1 function1) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = upfVar;
        this.e = zpfVar;
        this.f = function1;
    }

    @Override // defpackage.lfh
    public final int a() {
        return this.b;
    }

    @Override // defpackage.lfh
    public final Map b() {
        return this.c;
    }

    @Override // defpackage.lfh
    public final int c() {
        return this.a;
    }

    @Override // defpackage.lfh
    public final void d() {
        zme zmeVar;
        mpf mpfVar = this.e.a;
        boolean F = this.d.F();
        Function1 function1 = this.f;
        if (!F || (zmeVar = ((ane) mpfVar.F.c).Y) == null) {
            function1.invoke(((ane) mpfVar.F.c).i);
        } else {
            function1.invoke(zmeVar.i);
        }
    }

    @Override // defpackage.lfh
    public final Function1 e() {
        return null;
    }
}
