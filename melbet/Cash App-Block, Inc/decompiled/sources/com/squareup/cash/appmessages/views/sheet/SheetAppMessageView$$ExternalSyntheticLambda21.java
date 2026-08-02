package com.squareup.cash.appmessages.views.sheet;

import com.squareup.cash.appmessages.sheet.SheetAppMessageEvent;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class SheetAppMessageView$$ExternalSyntheticLambda21 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SheetAppMessageModel.Loaded f$1;

    public /* synthetic */ SheetAppMessageView$$ExternalSyntheticLambda21(Function1 function1, SheetAppMessageModel.Loaded loaded, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = loaded;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SheetAppMessageModel.Loaded loaded = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                SheetAppMessageModel.CtaButton ctaButton = loaded.primaryCta;
                function1.invoke(new SheetAppMessageEvent.CtaButtonClicked(ctaButton.urlToOpen, ctaButton.text, false));
                break;
            default:
                SheetAppMessageModel.CtaButton ctaButton2 = loaded.primaryCta;
                function1.invoke(new SheetAppMessageEvent.CtaButtonClicked(ctaButton2.urlToOpen, ctaButton2.text, true));
                break;
        }
        return Unit.INSTANCE;
    }
}
