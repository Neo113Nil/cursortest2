package ru.yandex.taxi.requirements.interactor;

import androidx.lifecycle.Lifecycle;
import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.w3r0;

/* loaded from: classes9.dex */
public final class j0 implements lz60 {
    public final w3r0 a;
    public final tt2 b;
    public final Lifecycle c;
    public final tse d;

    public j0(w3r0 w3r0Var, tt2 tt2Var, Lifecycle lifecycle, tse tseVar) {
        this.a = w3r0Var;
        this.b = tt2Var;
        this.c = lifecycle;
        this.d = tseVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.d, null, null, new UpdateRequirementsInteractor$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AutoUpdateRequirementsInteractor";
    }
}
