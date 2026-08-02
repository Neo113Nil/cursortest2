package com.squareup.cash.core.views;

import com.squareup.cash.mooncake.compose_ui.components.TooltipState;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes6.dex */
public final /* synthetic */ class BottomNavigationKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TooltipState f$0;

    public /* synthetic */ BottomNavigationKt$$ExternalSyntheticLambda7(TooltipState tooltipState, int i) {
        this.$r8$classId = i;
        this.f$0 = tooltipState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TooltipState tooltipState = this.f$0;
        switch (i) {
            case 0:
                TooltipState.m3659showLRDsOJo$default(tooltipState);
                break;
            case 1:
                TooltipState.m3659showLRDsOJo$default(tooltipState);
                break;
            default:
                StandaloneCoroutine standaloneCoroutine = tooltipState.dismissJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                JobKt.launch$default(tooltipState.scope, null, null, new MusicPresenter$models$3$1(tooltipState, null, 4), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
