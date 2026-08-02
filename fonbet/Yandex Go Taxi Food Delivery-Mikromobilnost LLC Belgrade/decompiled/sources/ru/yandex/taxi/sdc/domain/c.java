package ru.yandex.taxi.sdc.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.lz60;
import defpackage.srj0;
import defpackage.tje;
import defpackage.tmp0;
import defpackage.tse;

/* loaded from: classes10.dex */
public final class c implements lz60 {
    public final tse a;
    public final Lifecycle b;
    public final srj0 c;
    public final com.yandex.go.navigation.screen.c d;
    public final tmp0 e;

    public c(tse tseVar, Lifecycle lifecycle, srj0 srj0Var, com.yandex.go.navigation.screen.c cVar, tmp0 tmp0Var) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = srj0Var;
        this.d = cVar;
        this.e = tmp0Var;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.a, null, null, new SdcResetZoneModeListener$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SdcResetZoneModeListener";
    }
}
