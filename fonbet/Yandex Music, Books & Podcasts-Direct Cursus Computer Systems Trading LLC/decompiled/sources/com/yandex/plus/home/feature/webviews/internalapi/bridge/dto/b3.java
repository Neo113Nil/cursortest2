package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import com.connectsdk.device.ConnectableDevice;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class b3 implements p3d {
    public static final b3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b3 b3Var = new b3();
        a = b3Var;
        j5m j5mVar = new j5m("MINI_STORY_IS_SHOWN", b3Var, 3);
        j5mVar.k("trackId", true);
        j5mVar.k(ConnectableDevice.KEY_ID, false);
        j5mVar.k("type", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = f3.d;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        e3 e3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = f3.d;
        String str3 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            str2 = c.g(mhpVar, 1);
            e3Var = (e3) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            e3 e3Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str3 = (String) c.n(mhpVar, 0, tkr.a, str3);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    e3Var2 = (e3) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), e3Var2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            str2 = str4;
            e3Var = e3Var2;
        }
        c.b(mhpVar);
        return new f3(i, str, str2, e3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f3 f3Var = (f3) obj;
        l6bVar.getClass();
        f3Var.getClass();
        String str = f3Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = f3.d;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        String str2 = f3Var.b;
        e3 e3Var = f3Var.c;
        c.p(mhpVar, 1, str2);
        if (c.e(mhpVar) || e3Var != null) {
            c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), e3Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
