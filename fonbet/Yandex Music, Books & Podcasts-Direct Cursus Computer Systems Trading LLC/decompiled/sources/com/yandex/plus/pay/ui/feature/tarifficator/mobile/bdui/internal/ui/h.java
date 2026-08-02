package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import android.os.Bundle;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import defpackage.aur;
import defpackage.lyf;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.o8g;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ TarifficatorBduiScenarioActivity l;
    public final /* synthetic */ Bundle m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity, Bundle bundle, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = tarifficatorBduiScenarioActivity;
        this.m = bundle;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h(this.l, this.m, continuation, 0);
            default:
                return new h(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity = this.l;
                com.yandex.plus.bdui.plus.content.controller.f fVar = tarifficatorBduiScenarioActivity.f;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ((ProgressView) fVar.g(TarifficatorBduiScenarioActivity.g[1])).setVisibility(0);
                    this.k = 1;
                    if (TarifficatorBduiScenarioActivity.k(tarifficatorBduiScenarioActivity, this.m, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((ProgressView) fVar.g(TarifficatorBduiScenarioActivity.g[1])).setVisibility(8);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    lyf lyfVar = lyf.c;
                    TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity2 = this.l;
                    h hVar = new h(tarifficatorBduiScenarioActivity2, this.m, null, 0);
                    this.k = 1;
                    if (o8g.K(tarifficatorBduiScenarioActivity2, lyfVar, hVar, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
