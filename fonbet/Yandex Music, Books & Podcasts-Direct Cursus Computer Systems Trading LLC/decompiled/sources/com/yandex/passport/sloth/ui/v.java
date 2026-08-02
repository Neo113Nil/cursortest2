package com.yandex.passport.sloth.ui;

import defpackage.ph;
import defpackage.r7o;
import defpackage.rh;
import defpackage.z7o;
import defpackage.zt3;

/* loaded from: classes4.dex */
public final class v implements rh {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt3 b;

    public /* synthetic */ v(zt3 zt3Var, int i) {
        this.a = i;
        this.b = zt3Var;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        int i = this.a;
        zt3 zt3Var = this.b;
        switch (i) {
            case 0:
                ph phVar = (ph) obj;
                phVar.getClass();
                if (zt3Var.w()) {
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(phVar);
                    break;
                }
                break;
            default:
                r7o r7oVar2 = z7o.b;
                zt3Var.resumeWith(obj);
                break;
        }
    }
}
