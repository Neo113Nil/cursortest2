package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements p3d {
    public static final s1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s1 s1Var = new s1();
        a = s1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusWebContentSerializer.LoadingDto", s1Var, 5);
        j5mVar.k("retryCount", false);
        j5mVar.k("retryDelay", false);
        j5mVar.k("maxRedirects", false);
        j5mVar.k(UgcLiveVideoData$UgcLiveStatus.READY, false);
        j5mVar.k("fallback", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        cqe cqeVar = cqe.a;
        return new t9f[]{cqeVar, ff7.C(b2.a), ff7.C(cqeVar), y1.a, m1.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        d2 d2Var;
        Integer num;
        a2 a2Var;
        o1 o1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            i = c.k(mhpVar, 0);
            d2 d2Var2 = (d2) c.n(mhpVar, 1, b2.a, null);
            Integer num2 = (Integer) c.n(mhpVar, 2, cqe.a, null);
            a2Var = (a2) c.z(mhpVar, 3, y1.a, null);
            o1Var = (o1) c.z(mhpVar, 4, m1.a, null);
            num = num2;
            d2Var = d2Var2;
            i2 = 31;
        } else {
            boolean z = true;
            i = 0;
            d2 d2Var3 = null;
            Integer num3 = null;
            a2 a2Var2 = null;
            o1 o1Var2 = null;
            int i3 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    i = c.k(mhpVar, 0);
                    i3 |= 1;
                } else if (w == 1) {
                    d2Var3 = (d2) c.n(mhpVar, 1, b2.a, d2Var3);
                    i3 |= 2;
                } else if (w == 2) {
                    num3 = (Integer) c.n(mhpVar, 2, cqe.a, num3);
                    i3 |= 4;
                } else if (w == 3) {
                    a2Var2 = (a2) c.z(mhpVar, 3, y1.a, a2Var2);
                    i3 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    o1Var2 = (o1) c.z(mhpVar, 4, m1.a, o1Var2);
                    i3 |= 16;
                }
            }
            i2 = i3;
            d2Var = d2Var3;
            num = num3;
            a2Var = a2Var2;
            o1Var = o1Var2;
        }
        int i4 = i;
        c.b(mhpVar);
        return new u1(i2, i4, d2Var, num, a2Var, o1Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u1 u1Var = (u1) obj;
        l6bVar.getClass();
        u1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.A(0, u1Var.a, mhpVar);
        c.q(mhpVar, 1, b2.a, u1Var.b);
        c.q(mhpVar, 2, cqe.a, u1Var.c);
        c.k(mhpVar, 3, y1.a, u1Var.d);
        c.k(mhpVar, 4, m1.a, u1Var.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
