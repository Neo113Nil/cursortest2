package com.yandex.passport.data.network;

import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
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
public final /* synthetic */ class u8 implements p3d {
    public static final u8 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u8 u8Var = new u8();
        a = u8Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetUserInfoRequest.MasterMember", u8Var, 6);
        j5mVar.k("uid", false);
        j5mVar.k("display_login", true);
        j5mVar.k("public_name", true);
        j5mVar.k("secure_phone_number", false);
        j5mVar.k("avatar_url", true);
        j5mVar.k("primary_alias_type", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{mvg.a, ff7.C(tkrVar), ff7.C(tkrVar), tkrVar, ff7.C(tkrVar), cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i3 = 5;
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            tkr tkrVar = tkr.a;
            String str5 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str6 = (String) c.n(mhpVar, 2, tkrVar, null);
            String g = c.g(mhpVar, 3);
            str4 = (String) c.n(mhpVar, 4, tkrVar, null);
            i = c.k(mhpVar, 5);
            str3 = g;
            i2 = 63;
            str2 = str6;
            str = str5;
            j = q;
        } else {
            boolean z = true;
            int i4 = 0;
            String str7 = null;
            String str8 = null;
            long j2 = 0;
            int i5 = 0;
            String str9 = null;
            String str10 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        j2 = c.q(mhpVar, 0);
                        i5 |= 1;
                        break;
                    case 1:
                        str9 = (String) c.n(mhpVar, 1, tkr.a, str9);
                        i5 |= 2;
                        break;
                    case 2:
                        str10 = (String) c.n(mhpVar, 2, tkr.a, str10);
                        i5 |= 4;
                        break;
                    case 3:
                        str7 = c.g(mhpVar, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        str8 = (String) c.n(mhpVar, 4, tkr.a, str8);
                        i5 |= 16;
                        break;
                    case 5:
                        i4 = c.k(mhpVar, i3);
                        i5 |= 32;
                        continue;
                    default:
                        l1j.g(w);
                        return null;
                }
                i3 = 5;
            }
            i = i4;
            i2 = i5;
            str = str9;
            str2 = str10;
            str3 = str7;
            str4 = str8;
            j = j2;
        }
        c.b(mhpVar);
        return new w8(i2, j, str, str2, str3, str4, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w8 w8Var = (w8) obj;
        l6bVar.getClass();
        w8Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        long j = w8Var.a;
        String str = w8Var.e;
        String str2 = w8Var.c;
        String str3 = w8Var.b;
        c.g(mhpVar, 0, j);
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 1, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 2, tkr.a, str2);
        }
        c.p(mhpVar, 3, w8Var.d);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 4, tkr.a, str);
        }
        c.A(5, w8Var.f, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
