package com.squareup.cash.deposits.physical.view.onboarding;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaperCashDepositBlocker.TutorialCarousel.Page f$0;

    public /* synthetic */ PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda10(PaperCashDepositBlocker.TutorialCarousel.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        PaperCashDepositBlocker.TutorialCarousel.Page page = this.f$0;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(637072955, new PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda10(page, i3), gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(1238162622, new PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda10(page, i2), gapComposer), gapComposer, 3078, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    String str = page.title;
                    str.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer2, fillMaxWidth, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    String str2 = page.description;
                    str2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4092, 0L, (Composer) gapComposer3, fillMaxWidth2, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
