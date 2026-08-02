package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;

/* loaded from: classes4.dex */
public final class dsu {
    public final dru a;
    public final pzl b;

    public dsu(dru druVar) {
        this.a = druVar;
        this.b = new pzl(druVar);
    }

    public final void a(t tVar, kpu kpuVar, boolean z) {
        wjb wjbVar;
        String str;
        tVar.getClass();
        kpuVar.getClass();
        pu0 a = dru.a(z);
        cvo cvoVar = cvo.i;
        jpu jpuVar = jpu.a;
        if (kpuVar.equals(jpuVar)) {
            wjbVar = wjb.MultivibeSendingInvitationScreen;
        } else if (kpuVar instanceof hpu) {
            wjbVar = wjb.MultivibeLimitScreen;
        } else if (kpuVar instanceof ipu) {
            wjbVar = wjb.MultivibeAloneScreen;
        } else {
            if (!(kpuVar instanceof gpu) && !(kpuVar instanceof fpu)) {
                b6e.s();
                return;
            }
            wjbVar = wjb.BottomsheetScreen;
        }
        cvo b = o6m.b(wjbVar, null, 6);
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        if (kpuVar.equals(jpuVar)) {
            str = "WaveForTwo_sharing";
        } else if (kpuVar instanceof gpu) {
            str = "WaveForTwo_link_opened";
        } else if (kpuVar instanceof hpu) {
            str = "WaveForTwo_multivibe_groups_limit_exceeded";
        } else if (kpuVar instanceof ipu) {
            str = "WaveForTwo_only_you_in_wave";
        } else {
            if (!(kpuVar instanceof fpu)) {
                b6e.s();
                return;
            }
            str = "WaveForTwo_error";
        }
        fxf.Q(supportFragmentManager, b, null, str, a, null, new wn5(new fb1(15, this, tVar, kpuVar), 1466536101, true), 18);
    }
}
