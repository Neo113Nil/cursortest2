package yads;

import defpackage.fk71;
import defpackage.nl61;
import defpackage.nw71;
import defpackage.tls;
import defpackage.zn71;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ln extends Lambda implements tls {
    public final /* synthetic */ fk71 b;
    public final /* synthetic */ zn71 c;
    public final /* synthetic */ nw71 d;
    public final /* synthetic */ nl61 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(fk71 fk71Var, zn71 zn71Var, nw71 nw71Var, nl61 nl61Var) {
        super(1);
        this.b = fk71Var;
        this.c = zn71Var;
        this.d = nw71Var;
        this.e = nl61Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        fk71 fk71Var = this.b;
        kn knVar = new kn(this.c, this.d, this.e);
        if (fk71Var.f.compareAndSet(false, true)) {
            knVar.invoke();
        }
        return zy11.a;
    }
}
