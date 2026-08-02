package com.yandex.plus.home.dailyquests.repository.rest.prefs;

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
public final /* synthetic */ class u implements p3d {
    public static final u a;

    @NotNull
    private static final mhp descriptor;

    static {
        u uVar = new u();
        a = uVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.dailyquests.repository.rest.prefs.DailyQuestDao.InProgressDailyQuestDao.ToolbarPart", uVar, 2);
        j5mVar.k("chain_text", false);
        j5mVar.k("reward_data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a), ff7.C(r.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        t tVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            tVar = (t) c.n(mhpVar, 1, r.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            t tVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    tVar2 = (t) c.n(mhpVar, 1, r.a, tVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            tVar = tVar2;
        }
        c.b(mhpVar);
        return new w(i, str, tVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w wVar = (w) obj;
        l6bVar.getClass();
        wVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, tkr.a, wVar.a);
        c.q(mhpVar, 1, r.a, wVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
