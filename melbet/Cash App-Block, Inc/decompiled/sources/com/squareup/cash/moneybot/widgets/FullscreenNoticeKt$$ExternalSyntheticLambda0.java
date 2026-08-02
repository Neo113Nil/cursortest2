package com.squareup.cash.moneybot.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class FullscreenNoticeKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Function0 f$3;

    public /* synthetic */ FullscreenNoticeKt$$ExternalSyntheticLambda0(String str, Function0 function0, String str2, Function0 function02) {
        this.f$0 = str;
        this.f$1 = function0;
        this.f$2 = str2;
        this.f$3 = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        Function0 function02;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        String str = this.f$2;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    if (str2 == null || (function02 = this.f$1) == null) {
                        gapComposer.startReplaceGroup(911469029);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(911254478);
                        SizeKt.ButtonCta(function02, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.STANDARD, false, false, null, Expect_jvmKt.rememberComposableLambda(-240609603, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str2, 12), gapComposer), gapComposer, 1573296, 56);
                        gapComposer.end(false);
                    }
                    if (str == null || (function0 = this.f$3) == null) {
                        gapComposer.startReplaceGroup(911767621);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(911555953);
                        SizeKt.ButtonCta(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(460017588, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 13), gapComposer), gapComposer, 1573296, 56);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), null, true, false, null, Expect_jvmKt.rememberComposableLambda(-315702296, new ShopErrorKt$$ExternalSyntheticLambda0(str2, 6), gapComposer2), gapComposer2, 1575984, 52);
                    SizeKt.ButtonCta(this.f$3, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(39138463, new ShopErrorKt$$ExternalSyntheticLambda0(str, 7), gapComposer2), gapComposer2, 1573296, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FullscreenNoticeKt$$ExternalSyntheticLambda0(Function0 function0, Function0 function02, String str, String str2) {
        this.f$1 = function0;
        this.f$3 = function02;
        this.f$0 = str;
        this.f$2 = str2;
    }
}
