package com.yandex.plus.bdui.plus.content.serializer;

import com.connectsdk.service.DeviceService;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements p3d {
    public static final p1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p1 p1Var = new p1();
        a = p1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusWebContentSerializer.FallbackTextsDto", p1Var, 4);
        j5mVar.k("text", false);
        j5mVar.k(DeviceService.KEY_DESC, false);
        j5mVar.k("retryButtonText", false);
        j5mVar.k("nextButtonText", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{tkrVar, ff7.C(tkrVar), tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str5 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String str6 = (String) c.n(mhpVar, 1, tkr.a, null);
            String g2 = c.g(mhpVar, 2);
            str = g;
            str4 = c.g(mhpVar, 3);
            str3 = g2;
            str2 = str6;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str5 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    str7 = (String) c.n(mhpVar, 1, tkr.a, str7);
                    i2 |= 2;
                } else if (w == 2) {
                    str8 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str9 = c.g(mhpVar, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str5;
            str2 = str7;
            str3 = str8;
            str4 = str9;
        }
        c.b(mhpVar);
        return new r1(i, str, str2, str3, str4);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r1 r1Var = (r1) obj;
        l6bVar.getClass();
        r1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, r1Var.a);
        c.q(mhpVar, 1, tkr.a, r1Var.b);
        c.p(mhpVar, 2, r1Var.c);
        c.p(mhpVar, 3, r1Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
