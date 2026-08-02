package com.yandex.plus.pay.data.mb.dto;

import com.connectsdk.service.airplay.PListParser;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class t implements p3d {
    public static final t a;

    @NotNull
    private static final mhp descriptor;

    static {
        t tVar = new t();
        a = tVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.LegalInfo.Item", tVar, 3);
        j5mVar.k(PListParser.TAG_KEY, false);
        j5mVar.k("type", false);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, a0.d[1].getValue(), v.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        z zVar;
        x xVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = a0.d;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            zVar = (z) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            xVar = (x) c.z(mhpVar, 2, v.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            z zVar2 = null;
            x xVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    zVar2 = (z) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), zVar2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    xVar2 = (x) c.z(mhpVar, 2, v.a, xVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            zVar = zVar2;
            xVar = xVar2;
        }
        c.b(mhpVar);
        return new a0(i, str, zVar, xVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        a0 a0Var = (a0) obj;
        l6bVar.getClass();
        a0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = a0.d;
        c.p(mhpVar, 0, a0Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), a0Var.b);
        c.k(mhpVar, 2, v.a, a0Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
