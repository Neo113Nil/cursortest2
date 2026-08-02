package com.yandex.plus.bdui.plus.checkout.action.serializer;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements p3d {
    public static final j0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        j0 j0Var = new j0();
        a = j0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.action.serializer.PlusPayShareActionSerializer.DataDto", j0Var, 3);
        j5mVar.k("title", true);
        j5mVar.k("text", false);
        j5mVar.k("mimeType", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), tkrVar, tkrVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str4 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            str2 = c.g(mhpVar, 1);
            str3 = c.g(mhpVar, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str4 = (String) c.n(mhpVar, 0, tkr.a, str4);
                    i2 |= 1;
                } else if (w == 1) {
                    str5 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = c.g(mhpVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        c.b(mhpVar);
        return new l0(str, i, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l0 l0Var = (l0) obj;
        l6bVar.getClass();
        l0Var.getClass();
        String str = l0Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        String str2 = l0Var.b;
        String str3 = l0Var.c;
        c.p(mhpVar, 1, str2);
        if (c.e(mhpVar) || !Intrinsics.d(str3, "text/plain")) {
            c.p(mhpVar, 2, str3);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
