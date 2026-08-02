package com.yandex.plus.pay.data.mb.dto;

import defpackage.eg7;
import defpackage.ff7;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class p2 implements p3d {
    public static final p2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p2 p2Var = new p2();
        a = p2Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.PaymentSubmitRequestDto", p2Var, 7);
        j5mVar.k("dataSignature", false);
        j5mVar.k("origin", false);
        j5mVar.k("purchaseData", false);
        j5mVar.k("eventSessionId", false);
        j5mVar.k("batchPositionId", true);
        j5mVar.k("positionId", false);
        j5mVar.k("externalCallerPayload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, tkrVar, ff7.C(tkrVar), tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 6;
        String str8 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            String g4 = c.g(mhpVar, 3);
            String str9 = (String) c.n(mhpVar, 4, tkr.a, null);
            String g5 = c.g(mhpVar, 5);
            str = g;
            str7 = c.g(mhpVar, 6);
            str6 = g5;
            str4 = g4;
            str5 = str9;
            str3 = g3;
            str2 = g2;
            i = 127;
        } else {
            boolean z = true;
            int i3 = 0;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str8 = c.g(mhpVar, 0);
                        i3 |= 1;
                        break;
                    case 1:
                        str10 = c.g(mhpVar, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        str11 = c.g(mhpVar, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        str12 = c.g(mhpVar, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        str13 = (String) c.n(mhpVar, 4, tkr.a, str13);
                        i3 |= 16;
                        break;
                    case 5:
                        str14 = c.g(mhpVar, 5);
                        i3 |= 32;
                        continue;
                    case 6:
                        str15 = c.g(mhpVar, i2);
                        i3 |= 64;
                        continue;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 6;
            }
            i = i3;
            str = str8;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
        }
        c.b(mhpVar);
        return new r2(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r2 r2Var = (r2) obj;
        l6bVar.getClass();
        r2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = r2Var.a;
        String str2 = r2Var.e;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, r2Var.b);
        c.p(mhpVar, 2, r2Var.c);
        c.p(mhpVar, 3, r2Var.d);
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 4, tkr.a, str2);
        }
        c.p(mhpVar, 5, r2Var.f);
        c.p(mhpVar, 6, r2Var.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
