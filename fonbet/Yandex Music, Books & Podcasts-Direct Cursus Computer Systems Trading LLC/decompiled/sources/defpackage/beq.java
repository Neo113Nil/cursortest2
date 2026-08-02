package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes3.dex */
public final class beq extends jt2 {
    public final o4s g;
    public final NotificationManager h;

    public beq(Context context, f7l f7lVar, f5s f5sVar, t5s t5sVar, vx2 vx2Var, o4s o4sVar, z66 z66Var) {
        super(f7lVar, f5sVar, t5sVar, vx2Var, z66Var);
        this.g = o4sVar;
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        this.h = (NotificationManager) systemService;
    }

    @Override // defpackage.jt2
    public final boolean a(boolean z, sx2 sx2Var, boolean z2, long j, boolean z3, boolean z4) {
        o4s o4sVar = this.g;
        l18 l18Var = l18.b;
        sx2Var.getClass();
        if (!this.h.areNotificationsEnabled()) {
            bdt I = hag.I(m4s.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            return false;
        }
        if (!z4) {
            bdt I2 = hag.I(m4s.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            return false;
        }
        if (z3) {
            bdt I3 = hag.I(m4s.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            return false;
        }
        o4sVar.getClass();
        if (!o4s.b()) {
            bdt I4 = hag.I(m4s.class);
            qdc qdcVar4 = l18Var.a;
            qdcVar4.getClass();
            return false;
        }
        if (!o4s.d()) {
            bdt I5 = hag.I(m4s.class);
            qdc qdcVar5 = l18Var.a;
            qdcVar5.getClass();
            return false;
        }
        if (!z) {
            bdt I6 = hag.I(m4s.class);
            qdc qdcVar6 = l18Var.a;
            qdcVar6.getClass();
            return false;
        }
        if (sx2Var.b) {
            bdt I7 = hag.I(m4s.class);
            qdc qdcVar7 = l18Var.a;
            qdcVar7.getClass();
            return false;
        }
        if (sx2Var.a > o4s.a()) {
            bdt I8 = hag.I(m4s.class);
            qdc qdcVar8 = l18Var.a;
            qdcVar8.getClass();
            return false;
        }
        if (System.currentTimeMillis() < j) {
            bdt I9 = hag.I(m4s.class);
            qdc qdcVar9 = l18Var.a;
            qdcVar9.getClass();
            return false;
        }
        if (!z2) {
            return true;
        }
        bdt I10 = hag.I(m4s.class);
        qdc qdcVar10 = l18Var.a;
        qdcVar10.getClass();
        return false;
    }
}
