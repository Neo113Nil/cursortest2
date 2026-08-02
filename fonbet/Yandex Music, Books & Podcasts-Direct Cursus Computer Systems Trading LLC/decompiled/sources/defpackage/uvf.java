package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class uvf implements gnq, nnq {
    public final Function2 a;
    public final pvf b = new pvf();

    public uvf(Function2 function2) {
        this.a = function2;
    }

    @Override // defpackage.gnq
    public final fnq b(String str) {
        mnq mnqVar = (mnq) this.b.b(str);
        if (mnqVar != null) {
            return mnqVar.b();
        }
        return null;
    }

    @Override // defpackage.nnq
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final mnq a(String str) {
        str.getClass();
        return (mnq) this.b.b(str);
    }

    public final void d() {
        this.a.invoke(this.b, this);
    }

    public final void e(uvf uvfVar) {
        uvfVar.getClass();
        uvfVar.a.invoke(this.b, this);
    }
}
