package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.arf;
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
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class d6 implements p3d {
    public static final d6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d6 d6Var = new d6();
        a = d6Var;
        j5m j5mVar = new j5m("UPDATE_TARGETS_STATE", d6Var, 2);
        j5mVar.k("trackId", true);
        j5mVar.k("targets", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a), h6.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        Set set;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = h6.c;
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            set = (Set) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Set set2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    set2 = (Set) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), set2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            set = set2;
        }
        c.b(mhpVar);
        return new h6(str, i, set);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h6 h6Var = (h6) obj;
        l6bVar.getClass();
        h6Var.getClass();
        String str = h6Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = h6.c;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), h6Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
