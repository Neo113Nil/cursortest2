package defpackage;

import com.google.android.datatransport.runtime.scheduling.persistence.b;

/* loaded from: classes.dex */
public final /* synthetic */ class z2f implements moh, v0x0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z2f(wd21 wd21Var, v111 v111Var, long j) {
        this.b = wd21Var;
        this.c = v111Var;
        this.a = j;
    }

    @Override // defpackage.v0x0
    public Object execute() {
        wd21 wd21Var = (wd21) this.b;
        v111 v111Var = (v111) this.c;
        ugo ugoVar = wd21Var.c;
        long time = wd21Var.g.getTime() + this.a;
        b bVar = (b) ugoVar;
        bVar.getClass();
        bVar.d(new qll0(time, v111Var));
        return null;
    }

    @Override // defpackage.moh
    public void f(zvf0 zvf0Var) {
        ((y2f) zvf0Var.get()).c((String) this.b, this.a, (k84) this.c);
    }

    public /* synthetic */ z2f(String str, long j, k84 k84Var) {
        this.b = str;
        this.a = j;
        this.c = k84Var;
    }
}
