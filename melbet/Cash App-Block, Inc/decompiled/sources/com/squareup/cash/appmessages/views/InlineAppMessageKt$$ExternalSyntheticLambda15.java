package com.squareup.cash.appmessages.views;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class InlineAppMessageKt$$ExternalSyntheticLambda15 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ InlineAppMessageKt$$ExternalSyntheticLambda15(String str, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = str;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        String str = this.f$1;
        switch (i) {
            case 0:
                ((AsyncImagePainter.State.Success) obj).getClass();
                function1.invoke(new AppMessageViewEvent.AppMessageViewed(str));
                break;
            case 1:
                ((AsyncImagePainter.State.Success) obj).getClass();
                function1.invoke(new AppMessageViewEvent.AppMessageViewed(str));
                break;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new ActionMenuKt$$ExternalSyntheticLambda0(6, function1));
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str);
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver2, null, new ActionMenuKt$$ExternalSyntheticLambda0(5, function1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InlineAppMessageKt$$ExternalSyntheticLambda15(Function1 function1, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = str;
    }
}
