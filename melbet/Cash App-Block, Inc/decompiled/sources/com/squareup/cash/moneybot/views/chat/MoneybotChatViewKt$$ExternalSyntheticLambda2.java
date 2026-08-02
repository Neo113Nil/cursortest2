package com.squareup.cash.moneybot.views.chat;

import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotChatViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MoneybotChatViewModel f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ MoneybotChatViewKt$$ExternalSyntheticLambda2(MoneybotChatViewModel moneybotChatViewModel, boolean z, Function1 function1) {
        this.f$0 = moneybotChatViewModel;
        this.f$1 = z;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        boolean z = this.f$1;
        MoneybotChatViewModel moneybotChatViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Transformations.UI(moneybotChatViewModel, z, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                Transformations.UI(moneybotChatViewModel, z, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotChatViewKt$$ExternalSyntheticLambda2(MoneybotChatViewModel moneybotChatViewModel, boolean z, Function1 function1, int i) {
        this.f$0 = moneybotChatViewModel;
        this.f$1 = z;
        this.f$2 = function1;
    }
}
