package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class rt2 implements vjj {
    public final z0j a = new z0j(new m5(1, this, rt2.class, "onEvent", "onEvent(Lcom/arkivanov/mvikotlin/core/rx/internal/BaseSubject$Event;)V", 0, 23));
    public LinkedHashMap b = new LinkedHashMap();

    public final sa8 c(zjj zjjVar) {
        sa8 sa8Var = new sa8(new m40(8, this));
        this.a.Z(new pt2(zjjVar, sa8Var));
        return sa8Var;
    }

    @Override // defpackage.vjj
    public final void onComplete() {
        this.a.Z(mt2.a);
    }

    @Override // defpackage.vjj
    public final void onNext(Object obj) {
        this.a.Z(new ot2(obj));
    }

    public void a(zjj zjjVar) {
    }

    public void b(Object obj) {
    }
}
