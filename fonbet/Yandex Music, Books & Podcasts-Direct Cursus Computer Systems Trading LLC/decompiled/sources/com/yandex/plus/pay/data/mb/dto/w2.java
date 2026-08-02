package com.yandex.plus.pay.data.mb.dto;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class w2 implements p3d {
    public static final w2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        w2 w2Var = new w2();
        a = w2Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.PresaleDto", w2Var, 13);
        j5mVar.k("loadingTitle", false);
        j5mVar.k("benefitTitle", false);
        j5mVar.k("periodTitle", false);
        j5mVar.k("price", false);
        j5mVar.k("presaleAdditionalTitle", false);
        j5mVar.k("loadingDelayMillis", false);
        j5mVar.k("acceptAdditionalButtonText", false);
        j5mVar.k("acceptButtonText", false);
        j5mVar.k("rejectButtonText", false);
        j5mVar.k("batchId", false);
        j5mVar.k("eventSessionId", false);
        j5mVar.k("presaleTarget", false);
        j5mVar.k("offer", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        c3 c3Var = c3.a;
        t9f C = ff7.C(c3Var);
        tkr tkrVar = tkr.a;
        return new t9f[]{c3Var, C, c3Var, c3Var, c3Var, mvg.a, c3Var, c3Var, c3Var, tkrVar, tkrVar, tkrVar, j.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        j3 j3Var;
        j3 j3Var2;
        int i;
        l1 l1Var;
        j3 j3Var3;
        j3 j3Var4;
        j3 j3Var5;
        j3 j3Var6;
        j3 j3Var7;
        j3 j3Var8;
        String str;
        String str2;
        String str3;
        long j;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        char c2 = '\b';
        j3 j3Var9 = null;
        if (c.m()) {
            c3 c3Var = c3.a;
            j3 j3Var10 = (j3) c.z(mhpVar, 0, c3Var, null);
            j3 j3Var11 = (j3) c.n(mhpVar, 1, c3Var, null);
            j3 j3Var12 = (j3) c.z(mhpVar, 2, c3Var, null);
            j3 j3Var13 = (j3) c.z(mhpVar, 3, c3Var, null);
            j3 j3Var14 = (j3) c.z(mhpVar, 4, c3Var, null);
            long q = c.q(mhpVar, 5);
            j3 j3Var15 = (j3) c.z(mhpVar, 6, c3Var, null);
            j3 j3Var16 = (j3) c.z(mhpVar, 7, c3Var, null);
            j3 j3Var17 = (j3) c.z(mhpVar, 8, c3Var, null);
            String g = c.g(mhpVar, 9);
            String g2 = c.g(mhpVar, 10);
            String g3 = c.g(mhpVar, 11);
            j3Var3 = j3Var17;
            l1Var = (l1) c.z(mhpVar, 12, j.a, null);
            str3 = g3;
            str2 = g2;
            str = g;
            j3Var5 = j3Var16;
            j3Var4 = j3Var15;
            i = 8191;
            j3Var7 = j3Var13;
            j3Var6 = j3Var14;
            j3Var8 = j3Var12;
            j3Var = j3Var11;
            j3Var2 = j3Var10;
            j = q;
        } else {
            j3 j3Var18 = null;
            l1 l1Var2 = null;
            j3 j3Var19 = null;
            j3 j3Var20 = null;
            j3 j3Var21 = null;
            j3 j3Var22 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z = true;
            int i6 = 0;
            long j2 = 0;
            j3 j3Var23 = null;
            j3 j3Var24 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i4 = 10;
                        c2 = '\b';
                    case 0:
                        i2 = i5;
                        j3Var9 = (j3) c.z(mhpVar, 0, c3.a, j3Var9);
                        i6 |= 1;
                        i5 = i2;
                        i3 = 11;
                        i4 = 10;
                        c2 = '\b';
                    case 1:
                        i2 = i5;
                        j3Var18 = (j3) c.n(mhpVar, 1, c3.a, j3Var18);
                        i6 |= 2;
                        i5 = i2;
                        i3 = 11;
                        i4 = 10;
                        c2 = '\b';
                    case 2:
                        i2 = i5;
                        j3Var24 = (j3) c.z(mhpVar, 2, c3.a, j3Var24);
                        i6 |= 4;
                        i5 = i2;
                        i3 = 11;
                        i4 = 10;
                        c2 = '\b';
                    case 3:
                        i2 = i5;
                        j3Var23 = (j3) c.z(mhpVar, 3, c3.a, j3Var23);
                        i6 |= 8;
                        i5 = i2;
                        i3 = 11;
                        i4 = 10;
                        c2 = '\b';
                    case 4:
                        i2 = i5;
                        j3Var22 = (j3) c.z(mhpVar, 4, c3.a, j3Var22);
                        i6 |= 16;
                        i5 = i2;
                        i3 = 11;
                        i4 = 10;
                        c2 = '\b';
                    case 5:
                        i2 = i5;
                        j2 = c.q(mhpVar, 5);
                        i6 |= 32;
                        i5 = i2;
                        i3 = 11;
                        i4 = 10;
                        c2 = '\b';
                    case 6:
                        i2 = i5;
                        j3Var20 = (j3) c.z(mhpVar, 6, c3.a, j3Var20);
                        i6 |= 64;
                        i5 = i2;
                        i3 = 11;
                        i4 = 10;
                        c2 = '\b';
                    case 7:
                        i2 = i5;
                        j3Var21 = (j3) c.z(mhpVar, 7, c3.a, j3Var21);
                        i6 |= 128;
                        i5 = i2;
                        i3 = 11;
                        i4 = 10;
                        c2 = '\b';
                    case 8:
                        j3Var19 = (j3) c.z(mhpVar, 8, c3.a, j3Var19);
                        i6 |= 256;
                        i5 = i5;
                        i3 = 11;
                        c2 = '\b';
                        i4 = 10;
                    case 9:
                        int i7 = i5;
                        str4 = c.g(mhpVar, i7);
                        i6 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i5 = i7;
                        c2 = '\b';
                    case 10:
                        str5 = c.g(mhpVar, i4);
                        i6 |= 1024;
                        i5 = 9;
                        c2 = '\b';
                    case 11:
                        str6 = c.g(mhpVar, i3);
                        i6 |= 2048;
                        i5 = 9;
                        c2 = '\b';
                    case 12:
                        l1Var2 = (l1) c.z(mhpVar, 12, j.a, l1Var2);
                        i6 |= 4096;
                        i5 = 9;
                        c2 = '\b';
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            j3Var = j3Var18;
            j3Var2 = j3Var9;
            i = i6;
            l1Var = l1Var2;
            j3Var3 = j3Var19;
            j3Var4 = j3Var20;
            j3Var5 = j3Var21;
            j3Var6 = j3Var22;
            j3Var7 = j3Var23;
            j3Var8 = j3Var24;
            str = str4;
            str2 = str5;
            str3 = str6;
            j = j2;
        }
        c.b(mhpVar);
        return new y2(i, j3Var2, j3Var, j3Var8, j3Var7, j3Var6, j, j3Var4, j3Var5, j3Var3, str, str2, str3, l1Var);
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
        c3 c3Var = c3.a;
        c.k(mhpVar, 0, c3Var, y2Var.a);
        c.q(mhpVar, 1, c3Var, y2Var.b);
        c.k(mhpVar, 2, c3Var, y2Var.c);
        c.k(mhpVar, 3, c3Var, y2Var.d);
        c.k(mhpVar, 4, c3Var, y2Var.e);
        c.g(mhpVar, 5, y2Var.f);
        c.k(mhpVar, 6, c3Var, y2Var.g);
        c.k(mhpVar, 7, c3Var, y2Var.h);
        c.k(mhpVar, 8, c3Var, y2Var.i);
        c.p(mhpVar, 9, y2Var.j);
        c.p(mhpVar, 10, y2Var.k);
        c.p(mhpVar, 11, y2Var.l);
        c.k(mhpVar, 12, j.a, y2Var.m);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
