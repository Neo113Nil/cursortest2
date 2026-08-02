package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui;

import defpackage.bvf0;
import defpackage.c5i;
import defpackage.csb;
import defpackage.ffx;
import defpackage.hhg;
import defpackage.ike;
import defpackage.lw;
import defpackage.pzt0;
import defpackage.st2;
import defpackage.tje;
import defpackage.yrb;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes5.dex */
public final class c implements lw {
    public final csb a;
    public final c5i b;
    public final ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a c;
    public final yrb d;
    public final ike e;
    public final n0 f = ffx.c(0, 0, null, 7);
    public pzt0 g;

    public c(csb csbVar, c5i c5iVar, ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a aVar, st2 st2Var, yrb yrbVar) {
        this.a = csbVar;
        this.b = c5iVar;
        this.c = aVar;
        this.d = yrbVar;
        this.e = bvf0.a(st2Var.a);
    }

    @Override // defpackage.lw
    public final void a(hhg hhgVar) {
        tje.N(this.e, null, null, new ChooseProfileActionsHandler$onAction$1(this, hhgVar, null), 3);
    }

    @Override // defpackage.lw
    public final void start() {
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = tje.N(this.e, null, null, new ChooseProfileActionsHandler$start$1(this, null), 3);
    }

    @Override // defpackage.lw
    public final void stop() {
        bvf0.j(this.e, null);
    }
}
