package com.squareup.cash.shopping.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class ProductSearchViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ ProductSearchViewKt$$ExternalSyntheticLambda0(boolean z, Function0 function0, boolean z2) {
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        boolean z = this.f$2;
        boolean z2 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 12.0f));
                    if (z2) {
                        gapComposer.startReplaceGroup(-451793193);
                        KeypadKt.IconButton(this.f$1, null, null, false, Expect_jvmKt.rememberComposableLambda(-1861532581, new SignatureViewKt$$ExternalSyntheticLambda2(z, 7), gapComposer), gapComposer, 24576, 14);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-451307888);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ManualEntryScreenKt.ManualEntryFooter(z2, z, function0, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ManualEntryScreenKt.ManualEntryFooter(z2, z, function0, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ProductSearchViewKt$$ExternalSyntheticLambda0(boolean z, boolean z2, Function0 function0) {
        this.f$0 = z;
        this.f$2 = z2;
        this.f$1 = function0;
    }

    public /* synthetic */ ProductSearchViewKt$$ExternalSyntheticLambda0(boolean z, boolean z2, Function0 function0, int i) {
        this.f$0 = z;
        this.f$2 = z2;
        this.f$1 = function0;
    }
}
