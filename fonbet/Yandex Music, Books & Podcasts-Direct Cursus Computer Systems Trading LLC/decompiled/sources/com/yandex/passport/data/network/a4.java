package com.yandex.passport.data.network;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements p3d {
    public static final a4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a4 a4Var = new a4();
        a = a4Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetChildrenInfoRequest.Member", a4Var, 6);
        j5mVar.k("uid", false);
        j5mVar.k("has_plus", true);
        j5mVar.k("display_login", true);
        j5mVar.k("display_name", true);
        j5mVar.k("public_name", true);
        j5mVar.k("avatar_url", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{mvg.a, oc3.a, tkrVar, tkrVar, tkrVar, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i2 = 0;
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            z = c.D(mhpVar, 1);
            String g = c.g(mhpVar, 2);
            String g2 = c.g(mhpVar, 3);
            String g3 = c.g(mhpVar, 4);
            str4 = (String) c.n(mhpVar, 5, tkr.a, null);
            str2 = g2;
            str3 = g3;
            str = g;
            i = 63;
            j = q;
        } else {
            int i3 = 1;
            z = false;
            String str5 = null;
            String str6 = null;
            long j2 = 0;
            int i4 = 0;
            String str7 = null;
            String str8 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        i3 = i2;
                        continue;
                    case 0:
                        j2 = c.q(mhpVar, i2);
                        i4 |= 1;
                        continue;
                    case 1:
                        z = c.D(mhpVar, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        str7 = c.g(mhpVar, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        str8 = c.g(mhpVar, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        str5 = c.g(mhpVar, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str6 = (String) c.n(mhpVar, 5, tkr.a, str6);
                        i4 |= 32;
                        break;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 0;
            }
            i = i4;
            str = str7;
            str2 = str8;
            str3 = str5;
            str4 = str6;
            j = j2;
        }
        boolean z2 = z;
        c.b(mhpVar);
        return new c4(i, j, z2, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c4 c4Var = (c4) obj;
        l6bVar.getClass();
        c4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        long j = c4Var.a;
        String str = c4Var.f;
        String str2 = c4Var.e;
        String str3 = c4Var.d;
        String str4 = c4Var.c;
        boolean z = c4Var.b;
        c.g(mhpVar, 0, j);
        if (c.e(mhpVar) || z) {
            c.j(mhpVar, 1, z);
        }
        if (c.e(mhpVar) || !Intrinsics.d(str4, "")) {
            c.p(mhpVar, 2, str4);
        }
        if (c.e(mhpVar) || !Intrinsics.d(str3, "")) {
            c.p(mhpVar, 3, str3);
        }
        if (c.e(mhpVar) || !Intrinsics.d(str2, "")) {
            c.p(mhpVar, 4, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 5, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
