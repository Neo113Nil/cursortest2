package com.yandex.plus.home.dailyquests.feature.internal.utils;

import defpackage.dzf;
import defpackage.gzf;
import defpackage.nyf;
import defpackage.r7o;
import defpackage.yn7;
import defpackage.z7o;
import defpackage.zt3;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class b implements yn7 {
    public final /* synthetic */ nyf a;
    public final /* synthetic */ zt3 b;

    public b(gzf gzfVar, zt3 zt3Var) {
        this.a = gzfVar;
        this.b = zt3Var;
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        dzfVar.getClass();
        this.a.d(this);
        zt3 zt3Var = this.b;
        if (zt3Var.w()) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(Unit.a);
        }
    }
}
