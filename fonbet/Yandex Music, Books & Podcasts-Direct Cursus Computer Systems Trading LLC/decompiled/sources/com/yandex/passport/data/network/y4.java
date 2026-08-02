package com.yandex.passport.data.network;

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
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements p3d {
    public static final y4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        y4 y4Var = new y4();
        a = y4Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.GetConfigRequest.AutoLoginClientIdParametersDTO", y4Var, 2);
        j5mVar.k("client_id", false);
        j5mVar.k("extra_params", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, com.yandex.passport.data.network.utils.b.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        LinkedHashMap linkedHashMap;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            linkedHashMap = (LinkedHashMap) c.z(mhpVar, 1, com.yandex.passport.data.network.utils.b.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            LinkedHashMap linkedHashMap2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    linkedHashMap2 = (LinkedHashMap) c.z(mhpVar, 1, com.yandex.passport.data.network.utils.b.a, linkedHashMap2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            linkedHashMap = linkedHashMap2;
        }
        c.b(mhpVar);
        return new a5(i, str, linkedHashMap);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        a5 a5Var = (a5) obj;
        l6bVar.getClass();
        a5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = a5Var.a;
        LinkedHashMap linkedHashMap = a5Var.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || !Intrinsics.d(linkedHashMap, new LinkedHashMap())) {
            c.k(mhpVar, 1, com.yandex.passport.data.network.utils.b.a, linkedHashMap);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
