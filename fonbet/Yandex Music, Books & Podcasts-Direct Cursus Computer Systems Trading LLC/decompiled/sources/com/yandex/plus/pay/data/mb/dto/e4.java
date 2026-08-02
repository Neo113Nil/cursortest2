package com.yandex.plus.pay.data.mb.dto;

import com.yandex.auth.LegacyAccountType;
import defpackage.arf;
import defpackage.c5b;
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
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class e4 implements p3d {
    public static final e4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e4 e4Var = new e4();
        a = e4Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.UserStatusDto", e4Var, 4);
        j5mVar.k("uid", false);
        j5mVar.k(LegacyAccountType.STRING_LOGIN, true);
        j5mVar.k("familyRole", true);
        j5mVar.k("features", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = g4.e;
        return new t9f[]{mvg.a, ff7.C(tkr.a), arfVarArr[2].getValue(), arfVarArr[3].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        w1 w1Var;
        List list;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = g4.e;
        String str2 = null;
        if (c.m()) {
            long q = c.q(mhpVar, 0);
            String str3 = (String) c.n(mhpVar, 1, tkr.a, null);
            w1 w1Var2 = (w1) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            list = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = str3;
            i = 15;
            w1Var = w1Var2;
            j = q;
        } else {
            boolean z = true;
            int i2 = 0;
            long j2 = 0;
            w1 w1Var3 = null;
            List list2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j2 = c.q(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str2 = (String) c.n(mhpVar, 1, tkr.a, str2);
                    i2 |= 2;
                } else if (w == 2) {
                    w1Var3 = (w1) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), w1Var3);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            w1Var = w1Var3;
            list = list2;
            j = j2;
        }
        c.b(mhpVar);
        return new g4(i, j, str, w1Var, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g4 g4Var = (g4) obj;
        l6bVar.getClass();
        g4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = g4.e;
        long j = g4Var.a;
        List list = g4Var.d;
        w1 w1Var = g4Var.c;
        String str = g4Var.b;
        c.g(mhpVar, 0, j);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 1, tkr.a, str);
        }
        if (c.e(mhpVar) || w1Var != w1.b) {
            c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), w1Var);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
