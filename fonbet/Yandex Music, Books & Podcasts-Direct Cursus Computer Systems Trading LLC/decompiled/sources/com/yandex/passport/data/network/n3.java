package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements p3d {
    public static final n3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        n3 n3Var = new n3();
        a = n3Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetChallengeRequest.Result", n3Var, 7);
        j5mVar.k(Constants.KEY_ACTION, false);
        j5mVar.k("tags", false);
        j5mVar.k("reason", false);
        j5mVar.k("risk_score", false);
        j5mVar.k("rule_score", false);
        j5mVar.k("status", false);
        j5mVar.k("tx_id", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = p3.h;
        tkr tkrVar = tkr.a;
        cqe cqeVar = cqe.a;
        return new t9f[]{tkrVar, arfVarArr[1].getValue(), tkrVar, cqeVar, cqeVar, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        int i3;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = p3.h;
        int i4 = 6;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String g2 = c.g(mhpVar, 2);
            int k = c.k(mhpVar, 3);
            int k2 = c.k(mhpVar, 4);
            String g3 = c.g(mhpVar, 5);
            list = list2;
            str = g;
            str4 = c.g(mhpVar, 6);
            str3 = g3;
            i = k;
            i2 = k2;
            str2 = g2;
            i3 = 127;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            String str5 = null;
            List list3 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i7 = 0;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str5 = c.g(mhpVar, 0);
                        i6 |= 1;
                        break;
                    case 1:
                        list3 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), list3);
                        i6 |= 2;
                        break;
                    case 2:
                        str6 = c.g(mhpVar, 2);
                        i6 |= 4;
                        continue;
                    case 3:
                        i5 = c.k(mhpVar, 3);
                        i6 |= 8;
                        continue;
                    case 4:
                        i7 = c.k(mhpVar, 4);
                        i6 |= 16;
                        continue;
                    case 5:
                        str7 = c.g(mhpVar, 5);
                        i6 |= 32;
                        continue;
                    case 6:
                        str8 = c.g(mhpVar, i4);
                        i6 |= 64;
                        continue;
                    default:
                        l1j.g(w);
                        return null;
                }
                i4 = 6;
            }
            i = i5;
            i2 = i7;
            i3 = i6;
            str = str5;
            list = list3;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        }
        c.b(mhpVar);
        return new p3(i3, str, list, str2, i, i2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p3 p3Var = (p3) obj;
        l6bVar.getClass();
        p3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = p3.h;
        c.p(mhpVar, 0, p3Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), p3Var.b);
        c.p(mhpVar, 2, p3Var.c);
        c.A(3, p3Var.d, mhpVar);
        c.A(4, p3Var.e, mhpVar);
        c.p(mhpVar, 5, p3Var.f);
        c.p(mhpVar, 6, p3Var.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
