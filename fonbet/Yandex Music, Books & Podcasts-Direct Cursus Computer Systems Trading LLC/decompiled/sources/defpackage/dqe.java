package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes6.dex */
public final class dqe implements p3d {
    public static final dqe a;
    private static final /* synthetic */ j5m descriptor;

    static {
        dqe dqeVar = new dqe();
        a = dqeVar;
        j5m j5mVar = new j5m("ru.yandex.video.m3.ab.config.service.IntServiceFlag", dqeVar, 3);
        j5mVar.k("service", true);
        j5mVar.k("defaultFlagValue", true);
        j5mVar.k(Constants.KEY_VALUE, true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        cqe cqeVar = cqe.a;
        return new t9f[]{ff7.C(tkr.a), cqeVar, cqeVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        int i3;
        String str;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        if (c.m()) {
            str = (String) c.n(j5mVar, 0, tkr.a, null);
            i2 = c.k(j5mVar, 1);
            i = c.k(j5mVar, 2);
            i3 = 7;
        } else {
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            String str2 = null;
            int i6 = 0;
            while (z) {
                int w = c.w(j5mVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(j5mVar, 0, tkr.a, str2);
                    i5 |= 1;
                } else if (w == 1) {
                    i6 = c.k(j5mVar, 1);
                    i5 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    i4 = c.k(j5mVar, 2);
                    i5 |= 4;
                }
            }
            i = i4;
            i2 = i6;
            i3 = i5;
            str = str2;
        }
        c.b(j5mVar);
        return new fqe(str, i3, i2, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        fqe fqeVar = (fqe) obj;
        l6bVar.getClass();
        fqeVar.getClass();
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        cqe cqeVar = cqe.a;
        yjp.d(fqeVar, c, j5mVar);
        int i = fqeVar.d;
        int i2 = fqeVar.c;
        if (c.e(j5mVar) || i2 != 0) {
            c.A(1, i2, j5mVar);
        }
        if (c.e(j5mVar) || i != i2) {
            c.A(2, i, j5mVar);
        }
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
