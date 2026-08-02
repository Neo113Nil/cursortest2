package com.braze.ui.contentcards.adapters;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ContentCardAdapter$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ ContentCardAdapter f$1;

    public /* synthetic */ ContentCardAdapter$$ExternalSyntheticLambda1(int i, int i2, ContentCardAdapter contentCardAdapter) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = contentCardAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String onItemDismiss$lambda$0;
        String cardAtIndex$lambda$0;
        int i = this.$r8$classId;
        ContentCardAdapter contentCardAdapter = this.f$1;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                onItemDismiss$lambda$0 = ContentCardAdapter.onItemDismiss$lambda$0(i2, contentCardAdapter);
                return onItemDismiss$lambda$0;
            default:
                cardAtIndex$lambda$0 = ContentCardAdapter.getCardAtIndex$lambda$0(i2, contentCardAdapter);
                return cardAtIndex$lambda$0;
        }
    }
}
