package com.yandex.passport.data.network.token;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements p3d {
    public static final p a;

    @NotNull
    private static final mhp descriptor;

    static {
        p pVar = new p();
        a = pVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.token.GetMasterTokenByDeviceCodeRequest.Result", pVar, 5);
        j5mVar.k("access_token", false);
        j5mVar.k("expires_in", true);
        j5mVar.k("refresh_token", false);
        j5mVar.k("token_type", false);
        j5mVar.k("scope", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C(mvg.a);
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, C, tkrVar, tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        Long l;
        String str2;
        String str3;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str5 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            Long l2 = (Long) c.n(mhpVar, 1, mvg.a, null);
            String g2 = c.g(mhpVar, 2);
            str = g;
            str3 = c.g(mhpVar, 3);
            str4 = c.g(mhpVar, 4);
            str2 = g2;
            l = l2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Long l3 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    l3 = (Long) c.n(mhpVar, 1, mvg.a, l3);
                    i2 |= 2;
                } else if (w == 2) {
                    str6 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else if (w == 3) {
                    str7 = c.g(mhpVar, 3);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    str8 = c.g(mhpVar, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str5;
            l = l3;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        }
        c.b(mhpVar);
        return new r(i, str, l, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r rVar = (r) obj;
        l6bVar.getClass();
        rVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = rVar.a;
        String str2 = rVar.e;
        Long l = rVar.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || l != null) {
            c.q(mhpVar, 1, mvg.a, l);
        }
        c.p(mhpVar, 2, rVar.c);
        c.p(mhpVar, 3, rVar.d);
        if (c.e(mhpVar) || !Intrinsics.d(str2, "")) {
            c.p(mhpVar, 4, str2);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
