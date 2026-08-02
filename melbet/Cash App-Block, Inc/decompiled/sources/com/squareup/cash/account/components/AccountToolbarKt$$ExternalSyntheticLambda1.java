package com.squareup.cash.account.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import coil3.size.DimensionKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AccountToolbarKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ AccountToolbarKt$$ExternalSyntheticLambda1(boolean z, Function0 function0, int i) {
        this.$r8$classId = 1;
        this.f$0 = z;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        boolean z = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (z) {
                    gapComposer.startReplaceGroup(-1941157229);
                    AccountToDoKt.QrModeToggle(48, gapComposer, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), function0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1941067856);
                    gapComposer.end(false);
                }
                break;
            case 1:
                num.getClass();
                KeypadKt.ClearSearchButton(z, function0, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-206995751, new StartPoolAmountKt$$ExternalSyntheticLambda9(z, function0, 3), gapComposer2), gapComposer2, 24576, 15);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountToolbarKt$$ExternalSyntheticLambda1(boolean z, Function0 function0, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = function0;
    }
}
