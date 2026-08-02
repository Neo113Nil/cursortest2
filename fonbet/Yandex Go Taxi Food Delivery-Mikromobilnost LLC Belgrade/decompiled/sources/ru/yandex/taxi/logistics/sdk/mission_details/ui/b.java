package ru.yandex.taxi.logistics.sdk.mission_details.ui;

import defpackage.e100;
import defpackage.hwy0;
import defpackage.mth;
import defpackage.qj20;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class b {
    public final e100 a;
    public final m0 b;

    public b(e100 e100Var, hwy0 hwy0Var, qj20 qj20Var) {
        this.a = e100Var;
        this.b = new m0(new mth(qj20Var.b, 6), hwy0Var.b, new MissionDetailsStateProvider$missionDetailsState$1(this, null));
    }
}
