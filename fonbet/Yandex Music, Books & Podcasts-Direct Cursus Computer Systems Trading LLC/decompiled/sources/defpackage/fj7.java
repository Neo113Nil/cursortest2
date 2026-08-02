package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class fj7 implements ycg, ua6 {
    public final /* synthetic */ cfg a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ IOException c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fj7(Object obj, cfg cfgVar, boh bohVar, IOException iOException, boolean z) {
        this.e = obj;
        this.a = cfgVar;
        this.b = bohVar;
        this.c = iOException;
        this.d = z;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        x0 x0Var = (x0) this.e;
        ((bwh) obj).i(x0Var.b, (uvh) x0Var.c, this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        ((d80) obj).j((c80) this.e, this.a, this.b, this.c, this.d);
    }
}
