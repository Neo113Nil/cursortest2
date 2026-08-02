package com.squareup.cash.agents.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class AgentsHomeViewKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ Modifier f$3;

    public /* synthetic */ AgentsHomeViewKt$$ExternalSyntheticLambda16(String str, Function0 function0, Modifier modifier, String str2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = function0;
        this.f$3 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                AgentsHomeViewKt.AgentsHomeHeader(Updater.updateChangedFlags(1), (Composer) obj, this.f$3, this.f$0, this.f$1, this.f$2);
                break;
            default:
                ((Integer) obj2).getClass();
                OnUndeliveredElementKt.InvestingGraphLegend(Updater.updateChangedFlags(1), (Composer) obj, this.f$3, this.f$0, this.f$1, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }
}
