package com.yandex.plus.pay.data.mb.dto;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements p3d {
    public static final a a;

    @NotNull
    private static final mhp descriptor;

    static {
        a aVar = new a();
        a = aVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.ClosingOfferDto", aVar, 11);
        j5mVar.k("eventSessionId", false);
        j5mVar.k("batchId", false);
        j5mVar.k("closingOfferTarget", false);
        j5mVar.k("backgroundImage", false);
        j5mVar.k("closingOfferTitle", false);
        j5mVar.k("closingOfferSubtitle", true);
        j5mVar.k("offer", false);
        j5mVar.k("offerAssets", false);
        j5mVar.k("acceptButtonText", false);
        j5mVar.k("rejectButtonText", false);
        j5mVar.k("footer", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = f.l;
        tkr tkrVar = tkr.a;
        c3 c3Var = c3.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, a2.a, c3Var, ff7.C(c3Var), j.a, arfVarArr[7].getValue(), tkrVar, tkrVar, ff7.C(c3Var)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        j3 j3Var;
        l1 l1Var;
        List list;
        j3 j3Var2;
        j3 j3Var3;
        c2 c2Var;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = f.l;
        int i3 = 9;
        char c2 = 6;
        int i4 = 7;
        String str6 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            c2 c2Var2 = (c2) c.z(mhpVar, 3, a2.a, null);
            c3 c3Var = c3.a;
            j3 j3Var4 = (j3) c.z(mhpVar, 4, c3Var, null);
            j3 j3Var5 = (j3) c.n(mhpVar, 5, c3Var, null);
            l1 l1Var2 = (l1) c.z(mhpVar, 6, j.a, null);
            List list2 = (List) c.z(mhpVar, 7, (t9f) arfVarArr[7].getValue(), null);
            String g4 = c.g(mhpVar, 8);
            list = list2;
            str2 = g;
            l1Var = l1Var2;
            str5 = c.g(mhpVar, 9);
            str4 = g4;
            j3Var2 = j3Var5;
            c2Var = c2Var2;
            j3Var = (j3) c.n(mhpVar, 10, c3Var, null);
            j3Var3 = j3Var4;
            str3 = g3;
            i = 2047;
            str = g2;
        } else {
            boolean z = true;
            int i5 = 0;
            String str7 = null;
            j3 j3Var6 = null;
            l1 l1Var3 = null;
            List list3 = null;
            j3 j3Var7 = null;
            j3 j3Var8 = null;
            c2 c2Var3 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i4 = 7;
                    case 0:
                        i5 |= 1;
                        str6 = c.g(mhpVar, 0);
                        i3 = 9;
                        c2 = 6;
                        i4 = 7;
                    case 1:
                        i5 |= 2;
                        str7 = c.g(mhpVar, 1);
                        i3 = 9;
                        c2 = 6;
                        i4 = 7;
                    case 2:
                        str8 = c.g(mhpVar, 2);
                        i5 |= 4;
                        i3 = 9;
                        c2 = 6;
                        i4 = 7;
                    case 3:
                        c2Var3 = (c2) c.z(mhpVar, 3, a2.a, c2Var3);
                        i5 |= 8;
                        i3 = 9;
                        c2 = 6;
                        i4 = 7;
                    case 4:
                        j3Var8 = (j3) c.z(mhpVar, 4, c3.a, j3Var8);
                        i5 |= 16;
                        i3 = 9;
                        c2 = 6;
                        i4 = 7;
                    case 5:
                        j3Var7 = (j3) c.n(mhpVar, 5, c3.a, j3Var7);
                        i5 |= 32;
                        i3 = 9;
                        c2 = 6;
                        i4 = 7;
                    case 6:
                        l1Var3 = (l1) c.z(mhpVar, 6, j.a, l1Var3);
                        i5 |= 64;
                        c2 = 6;
                        i3 = 9;
                        i4 = 7;
                    case 7:
                        int i6 = i4;
                        list3 = (List) c.z(mhpVar, i6, (t9f) arfVarArr[i6].getValue(), list3);
                        i5 |= 128;
                        i4 = i6;
                        i3 = 9;
                        c2 = 6;
                    case 8:
                        i2 = i4;
                        str9 = c.g(mhpVar, 8);
                        i5 |= 256;
                        i4 = i2;
                        c2 = 6;
                    case 9:
                        i2 = i4;
                        str10 = c.g(mhpVar, i3);
                        i5 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i4 = i2;
                        c2 = 6;
                    case 10:
                        i2 = i4;
                        j3Var6 = (j3) c.n(mhpVar, 10, c3.a, j3Var6);
                        i5 |= 1024;
                        i4 = i2;
                        c2 = 6;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            str = str7;
            j3Var = j3Var6;
            l1Var = l1Var3;
            list = list3;
            j3Var2 = j3Var7;
            j3Var3 = j3Var8;
            c2Var = c2Var3;
            str2 = str6;
            str3 = str8;
            str4 = str9;
            str5 = str10;
        }
        c.b(mhpVar);
        return new f(i, str2, str, str3, c2Var, j3Var3, j3Var2, l1Var, list, str4, str5, j3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f fVar = (f) obj;
        l6bVar.getClass();
        fVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = f.l;
        String str = fVar.a;
        j3 j3Var = fVar.k;
        j3 j3Var2 = fVar.f;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, fVar.b);
        c.p(mhpVar, 2, fVar.c);
        c.k(mhpVar, 3, a2.a, fVar.d);
        c3 c3Var = c3.a;
        c.k(mhpVar, 4, c3Var, fVar.e);
        if (c.e(mhpVar) || j3Var2 != null) {
            c.q(mhpVar, 5, c3Var, j3Var2);
        }
        c.k(mhpVar, 6, j.a, fVar.g);
        c.k(mhpVar, 7, (t9f) arfVarArr[7].getValue(), fVar.h);
        c.p(mhpVar, 8, fVar.i);
        c.p(mhpVar, 9, fVar.j);
        if (c.e(mhpVar) || j3Var != null) {
            c.q(mhpVar, 10, c3Var, j3Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
