package com.squareup.cash.earnings.views.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsHeaderKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ComposableLambdaImpl f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ EarningsHeaderKt$$ExternalSyntheticLambda14(ComposableLambdaImpl composableLambdaImpl, boolean z, Modifier modifier, int i) {
        this.f$0 = composableLambdaImpl;
        this.f$1 = z;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        boolean z = this.f$1;
        Modifier modifier = this.f$2;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                EarningsHeaderKt.LoadingHeader(Updater.updateChangedFlags(7), composer, composableLambdaImpl, modifier, z);
                break;
            default:
                AfterpaySearchViewKt.AfterpayListUnordered(Updater.updateChangedFlags(433), composer, composableLambdaImpl, modifier, z);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarningsHeaderKt$$ExternalSyntheticLambda14(Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$2 = modifier;
        this.f$1 = z;
        this.f$0 = composableLambdaImpl;
    }
}
