package com.yandex.plus.bdui.plus.checkout.content.serializer;

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

/* loaded from: classes4.dex */
public final /* synthetic */ class k7 implements p3d {
    public static final k7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k7 k7Var = new k7();
        a = k7Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayUpsaleContentSerializer.DataDto", k7Var, 10);
        j5mVar.k("benefits", false);
        j5mVar.k("buttonText", false);
        j5mVar.k("buttonAdditionalText", false);
        j5mVar.k("acceptButtonText", false);
        j5mVar.k("rejectButtonText", false);
        j5mVar.k("mainImageMobile", false);
        j5mVar.k("titleText", false);
        j5mVar.k("subtitleText", false);
        j5mVar.k("legalText", false);
        j5mVar.k("user", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{m7.k[0].getValue(), tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, tkrVar, ff7.C(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a), ff7.C(a.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        c cVar;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = m7.k;
        int i2 = 9;
        int i3 = 7;
        int i4 = 2;
        List list2 = null;
        if (c.m()) {
            List list3 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            String g3 = c.g(mhpVar, 3);
            String g4 = c.g(mhpVar, 4);
            String g5 = c.g(mhpVar, 5);
            String g6 = c.g(mhpVar, 6);
            String g7 = c.g(mhpVar, 7);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 8, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, null);
            list = list3;
            str = g;
            cVar = (c) c.n(mhpVar, 9, a.a, null);
            str7 = g7;
            str6 = g6;
            str5 = g5;
            str3 = g3;
            m1Var = m1Var2;
            str4 = g4;
            str2 = g2;
            i = 1023;
        } else {
            boolean z = true;
            int i5 = 0;
            c cVar2 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i3 = 7;
                    case 0:
                        list2 = (List) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), list2);
                        i5 |= 1;
                        i2 = 9;
                        i3 = 7;
                    case 1:
                        i5 |= 2;
                        str8 = c.g(mhpVar, 1);
                    case 2:
                        str9 = c.g(mhpVar, i4);
                        i5 |= 4;
                    case 3:
                        str10 = c.g(mhpVar, 3);
                        i5 |= 8;
                        i4 = 2;
                    case 4:
                        str11 = c.g(mhpVar, 4);
                        i5 |= 16;
                        i4 = 2;
                    case 5:
                        str12 = c.g(mhpVar, 5);
                        i5 |= 32;
                        i4 = 2;
                    case 6:
                        str13 = c.g(mhpVar, 6);
                        i5 |= 64;
                        i4 = 2;
                    case 7:
                        str14 = c.g(mhpVar, i3);
                        i5 |= 128;
                        i4 = 2;
                    case 8:
                        m1Var3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 8, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var3);
                        i5 |= 256;
                        i4 = 2;
                    case 9:
                        cVar2 = (c) c.n(mhpVar, i2, a.a, cVar2);
                        i5 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i4 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i5;
            cVar = cVar2;
            m1Var = m1Var3;
            list = list2;
            str = str8;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
            str6 = str13;
            str7 = str14;
        }
        c.b(mhpVar);
        return new m7(i, list, str, str2, str3, str4, str5, str6, str7, m1Var, cVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m7 m7Var = (m7) obj;
        l6bVar.getClass();
        m7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) m7.k[0].getValue(), m7Var.a);
        c.p(mhpVar, 1, m7Var.b);
        c.p(mhpVar, 2, m7Var.c);
        c.p(mhpVar, 3, m7Var.d);
        c.p(mhpVar, 4, m7Var.e);
        c.p(mhpVar, 5, m7Var.f);
        c.p(mhpVar, 6, m7Var.g);
        c.p(mhpVar, 7, m7Var.h);
        c.q(mhpVar, 8, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m7Var.i);
        c.q(mhpVar, 9, a.a, m7Var.j);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
