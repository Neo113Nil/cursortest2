package defpackage;

import java.util.Set;

/* loaded from: classes5.dex */
public final class jj5 {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;

    public jj5(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, jyr jyrVar6, jyr jyrVar7) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
        this.d = jyrVar4;
        this.e = jyrVar5;
        this.f = jyrVar6;
        this.g = jyrVar7;
    }

    public final void a(zh5 zh5Var, hj5 hj5Var) {
        zh5Var.getClass();
        ssg.a(3, "CommunicationTriggerExternalActionsImpl", "onBlockingCommunicationTriggered: anchorId=" + zh5Var.a + ", type=" + hj5Var, null);
        boolean z = hj5Var == hj5.a;
        ff2 ff2Var = (ff2) this.c.getValue();
        String str = zh5Var.a;
        ff2Var.getClass();
        str.getClass();
        m73 m73Var = z ? m73.a : m73.b;
        e00 e00Var = ff2Var.a;
        bdt I = hag.I(wf2.class);
        qdc qdcVar = e00Var.a;
        qdcVar.getClass();
        wf2 wf2Var = (wf2) qdcVar.C(I);
        if (str.equals("music-launch")) {
            ssg.a(3, "AutoplayScreenObserver", "Blocking communication triggered: anchorId=" + str + ", type=" + m73Var, null);
            n73 n73Var = new n73(str, m73Var);
            xdr xdrVar = wf2Var.a;
            xdrVar.m(null, wop.j((Set) xdrVar.getValue(), n73Var));
        }
    }
}
