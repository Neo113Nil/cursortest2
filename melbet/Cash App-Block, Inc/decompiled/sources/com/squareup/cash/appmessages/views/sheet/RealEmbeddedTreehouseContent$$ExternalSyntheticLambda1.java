package com.squareup.cash.appmessages.views.sheet;

import android.content.Context;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class RealEmbeddedTreehouseContent$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CashTreehouseLayout f$0;

    public /* synthetic */ RealEmbeddedTreehouseContent$$ExternalSyntheticLambda1(CashTreehouseLayout cashTreehouseLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = cashTreehouseLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CashTreehouseLayout cashTreehouseLayout = this.f$0;
        switch (i) {
            case 0:
                ((Context) obj).getClass();
                break;
            case 1:
                ((Context) obj).getClass();
                break;
            case 2:
                ((CashTreehouseLayout) obj).getClass();
                cashTreehouseLayout.getClass();
                CashTreehouseLayout.updateState$default(cashTreehouseLayout, CashTreehouseLayout.BindState.NotBound, null, 2);
                break;
            default:
                ((CashTreehouseLayout) obj).getClass();
                cashTreehouseLayout.getClass();
                CashTreehouseLayout.updateState$default(cashTreehouseLayout, CashTreehouseLayout.BindState.BoundWhenReady, null, 2);
                break;
        }
        return Unit.INSTANCE;
    }
}
