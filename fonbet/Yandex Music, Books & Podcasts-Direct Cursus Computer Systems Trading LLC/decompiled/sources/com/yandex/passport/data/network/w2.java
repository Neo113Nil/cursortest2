package com.yandex.passport.data.network;

import defpackage.arf;
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
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements p3d {
    public static final w2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        w2 w2Var = new w2();
        a = w2Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetBadgesSpecificationRequest.BadgeSpecification", w2Var, 3);
        j5mVar.k("name", false);
        j5mVar.k("strings", false);
        j5mVar.k("localized_icon_urls", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = y2.d;
        return new t9f[]{tkr.a, arfVarArr[1].getValue(), arfVarArr[2].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        HashMap hashMap;
        HashMap hashMap2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = y2.d;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            hashMap = (HashMap) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            hashMap2 = (HashMap) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            HashMap hashMap3 = null;
            HashMap hashMap4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    hashMap3 = (HashMap) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), hashMap3);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    hashMap4 = (HashMap) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), hashMap4);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            hashMap = hashMap3;
            hashMap2 = hashMap4;
        }
        c.b(mhpVar);
        return new y2(i, str, hashMap, hashMap2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y2 y2Var = (y2) obj;
        l6bVar.getClass();
        y2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = y2.d;
        c.p(mhpVar, 0, y2Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), y2Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), y2Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
