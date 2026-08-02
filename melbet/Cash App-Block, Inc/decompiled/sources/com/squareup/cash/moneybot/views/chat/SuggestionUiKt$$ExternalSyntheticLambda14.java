package com.squareup.cash.moneybot.views.chat;

import androidx.compose.ui.layout.LayoutCoordinates;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewEvent;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class SuggestionUiKt$$ExternalSyntheticLambda14 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SuggestionUiKt$$ExternalSyntheticLambda14(int i, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = i;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                if (i2 == 0) {
                    function1.invoke(Integer.valueOf((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)));
                }
                break;
            case 1:
                ((Boolean) obj).getClass();
                function1.invoke(new SelectPaymentPlanViewEvent.SelectOption(i2));
                break;
            default:
                ((Boolean) obj).getClass();
                function1.invoke(new ChatSurveyViewEvent.ChangeRating(i2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SuggestionUiKt$$ExternalSyntheticLambda14(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$1 = function1;
        this.f$0 = i;
    }
}
