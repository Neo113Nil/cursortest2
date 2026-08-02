package com.squareup.cash.phoneplans;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.TransactorKt;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ PhonePlansEsimCheckViewModel.Cta f$1;

    public /* synthetic */ PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda3(Function1 function1, PhonePlansEsimCheckViewModel.Cta cta, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = cta;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        PhonePlansEsimCheckViewModel.Cta cta = this.f$1;
        Function1 function1 = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    TransactorKt.CustomAction(titleBarActionScope, null, null, Expect_jvmKt.rememberComposableLambda(-1899948747, new PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda3(function1, cta, i2), gapComposer), gapComposer, (intValue & 14) | 3072, 3);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(cta);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda7(function1, cta, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCompact((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-548657347, new PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda8(cta, r2), gapComposer2), gapComposer2, 1572864, 62);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
