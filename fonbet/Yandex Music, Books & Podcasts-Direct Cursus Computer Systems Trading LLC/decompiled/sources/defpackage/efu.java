package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class efu implements arf {
    public final lm4 a;
    public final uif b;
    public final uif c;
    public final dzf d;
    public bfu e;

    /* JADX WARN: Multi-variable type inference failed */
    public efu(lm4 lm4Var, Function0 function0, Function0 function02, dzf dzfVar) {
        dzfVar.getClass();
        this.a = lm4Var;
        this.b = (uif) function0;
        this.c = (uif) function02;
        this.d = dzfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.arf
    public final Object getValue() {
        bfu bfuVar = this.e;
        if (bfuVar != null) {
            return bfuVar;
        }
        jfu jfuVar = (jfu) this.b.invoke();
        gfu gfuVar = (gfu) this.c.invoke();
        gs6 gs6Var = gs6.b;
        jfuVar.getClass();
        gfuVar.getClass();
        gs6Var.getClass();
        bjt bjtVar = new bjt(jfuVar, gfuVar, gs6Var);
        Class b = this.a.b();
        b.getClass();
        lm4 a = ern.a(b);
        String f = a.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return null;
        }
        bfu j = bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        if (j instanceof su2) {
            ((su2) j).registerLifecycleOwner(this.d);
        }
        this.e = j;
        return j;
    }

    @Override // defpackage.arf
    public final boolean isInitialized() {
        return this.e != null;
    }
}
