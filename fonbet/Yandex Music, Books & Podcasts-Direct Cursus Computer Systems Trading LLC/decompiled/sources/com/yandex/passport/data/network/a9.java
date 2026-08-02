package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.c5b;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements p3d {
    public static final a9 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a9 a9Var = new a9();
        a = a9Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetUserInfoRequest.Response", a9Var, 9);
        j5mVar.k("status", true);
        j5mVar.k("is_complete", true);
        j5mVar.k("is_completion_available", true);
        j5mVar.k("is_completion_recommended", true);
        j5mVar.k("is_completion_required", true);
        j5mVar.k("completion_url", true);
        j5mVar.k("members", true);
        j5mVar.k("x_token_client_id", true);
        j5mVar.k("x_token_need_reset", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = c9.j;
        tkr tkrVar = tkr.a;
        oc3 oc3Var = oc3.a;
        return new t9f[]{ff7.C(tkrVar), oc3Var, oc3Var, oc3Var, oc3Var, ff7.C(tkrVar), arfVarArr[6].getValue(), ff7.C(tkrVar), oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        String str;
        String str2;
        List list;
        String str3;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = c9.j;
        int i2 = 7;
        int i3 = 5;
        int i4 = 3;
        int i5 = 8;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str4 = (String) c.n(mhpVar, 0, tkrVar, null);
            boolean D = c.D(mhpVar, 1);
            boolean D2 = c.D(mhpVar, 2);
            boolean D3 = c.D(mhpVar, 3);
            boolean D4 = c.D(mhpVar, 4);
            String str5 = (String) c.n(mhpVar, 5, tkrVar, null);
            list = (List) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), null);
            str2 = (String) c.n(mhpVar, 7, tkrVar, null);
            z = c.D(mhpVar, 8);
            str3 = str5;
            z2 = D3;
            i = 511;
            z3 = D4;
            z4 = D2;
            z5 = D;
            str = str4;
        } else {
            boolean z6 = true;
            boolean z7 = false;
            int i6 = 0;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            String str6 = null;
            List list2 = null;
            String str7 = null;
            boolean z11 = false;
            String str8 = null;
            while (z6) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z6 = false;
                        i3 = 5;
                        i4 = 3;
                        i5 = 8;
                    case 0:
                        str7 = (String) c.n(mhpVar, 0, tkr.a, str7);
                        i6 |= 1;
                        i2 = 7;
                        i3 = 5;
                        i4 = 3;
                        i5 = 8;
                    case 1:
                        z10 = c.D(mhpVar, 1);
                        i6 |= 2;
                        i2 = 7;
                        i5 = 8;
                    case 2:
                        z9 = c.D(mhpVar, 2);
                        i6 |= 4;
                        i5 = 8;
                    case 3:
                        z11 = c.D(mhpVar, i4);
                        i6 |= 8;
                        i5 = 8;
                    case 4:
                        z8 = c.D(mhpVar, 4);
                        i6 |= 16;
                        i5 = 8;
                    case 5:
                        str8 = (String) c.n(mhpVar, i3, tkr.a, str8);
                        i6 |= 32;
                        i5 = 8;
                    case 6:
                        list2 = (List) c.z(mhpVar, 6, (t9f) arfVarArr[6].getValue(), list2);
                        i6 |= 64;
                        i5 = 8;
                    case 7:
                        str6 = (String) c.n(mhpVar, i2, tkr.a, str6);
                        i6 |= 128;
                        i5 = 8;
                    case 8:
                        z7 = c.D(mhpVar, i5);
                        i6 |= 256;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            z = z7;
            str = str7;
            str2 = str6;
            list = list2;
            str3 = str8;
            z2 = z11;
            i = i6;
            z3 = z8;
            z4 = z9;
            z5 = z10;
        }
        c.b(mhpVar);
        return new c9(i, str, z5, z4, z2, z3, str3, list, str2, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c9 c9Var = (c9) obj;
        l6bVar.getClass();
        c9Var.getClass();
        boolean z = c9Var.i;
        String str = c9Var.h;
        List list = c9Var.g;
        String str2 = c9Var.f;
        boolean z2 = c9Var.e;
        boolean z3 = c9Var.d;
        boolean z4 = c9Var.c;
        boolean z5 = c9Var.b;
        String str3 = c9Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = c9.j;
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 0, tkr.a, str3);
        }
        if (c.e(mhpVar) || z5) {
            c.j(mhpVar, 1, z5);
        }
        if (c.e(mhpVar) || z4) {
            c.j(mhpVar, 2, z4);
        }
        if (c.e(mhpVar) || z3) {
            c.j(mhpVar, 3, z3);
        }
        if (c.e(mhpVar) || z2) {
            c.j(mhpVar, 4, z2);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 5, tkr.a, str2);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 6, (t9f) arfVarArr[6].getValue(), list);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 7, tkr.a, str);
        }
        if (c.e(mhpVar) || z) {
            c.j(mhpVar, 8, z);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
