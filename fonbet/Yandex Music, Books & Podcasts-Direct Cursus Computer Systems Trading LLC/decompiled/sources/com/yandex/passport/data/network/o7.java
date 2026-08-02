package com.yandex.passport.data.network;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class o7 implements p3d {
    public static final o7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o7 o7Var = new o7();
        a = o7Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetQrLinkRequest.Result", o7Var, 7);
        j5mVar.k("status", false);
        j5mVar.k("qr_url", false);
        j5mVar.k("track_id", false);
        j5mVar.k("csrf_token", false);
        j5mVar.k("user_code", false);
        j5mVar.k("expires_in", true);
        j5mVar.k("verification_url", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, mvg.a, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            String g3 = c.g(mhpVar, 3);
            String g4 = c.g(mhpVar, 4);
            long q = c.q(mhpVar, 5);
            str2 = c.g(mhpVar, 6);
            i = 127;
            str3 = g3;
            str4 = g4;
            str5 = g2;
            str6 = g;
            j = q;
        } else {
            str = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            boolean z = true;
            long j2 = 0;
            String str11 = null;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = c.g(mhpVar, 0);
                        i2 |= 1;
                        break;
                    case 1:
                        str10 = c.g(mhpVar, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        str9 = c.g(mhpVar, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        str7 = c.g(mhpVar, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        str8 = c.g(mhpVar, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        j2 = c.q(mhpVar, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        str11 = c.g(mhpVar, 6);
                        i2 |= 64;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            str2 = str11;
            i = i2;
            str3 = str7;
            str4 = str8;
            str5 = str9;
            str6 = str10;
            j = j2;
        }
        String str12 = str;
        c.b(mhpVar);
        return new q7(i, str12, str6, str5, str3, str4, j, str2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q7 q7Var = (q7) obj;
        l6bVar.getClass();
        q7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = q7Var.a;
        long j = q7Var.f;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, q7Var.b);
        c.p(mhpVar, 2, q7Var.c);
        c.p(mhpVar, 3, q7Var.d);
        c.p(mhpVar, 4, q7Var.e);
        if (c.e(mhpVar) || j != 2147483647L) {
            c.g(mhpVar, 5, j);
        }
        c.p(mhpVar, 6, q7Var.g);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
