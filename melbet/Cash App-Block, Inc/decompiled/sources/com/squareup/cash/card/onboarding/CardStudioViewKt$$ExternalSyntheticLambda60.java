package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.home.SupportHomeViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda60 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda60(CardStudioViewModel.Content content, boolean z, boolean z2, boolean z3, Function1 function1, int i) {
        this.f$0 = content;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
        this.f$4 = function1;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CardStudioViewKt.CustomizationButtonColumn((CardStudioViewModel.Content) obj3, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ScreenshotReviewViewKt.ButtonBox(this.f$1, this.f$2, this.f$3, (String) obj3, this.f$4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                boolean z = this.f$1;
                boolean z2 = this.f$2;
                boolean z3 = this.f$3;
                Function1 function1 = this.f$4;
                SupportHomeViewKt.Activities(z, z2, z3, function1, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda60(boolean z, boolean z2, boolean z3, String str, Function1 function1, int i) {
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
        this.f$0 = str;
        this.f$4 = function1;
        this.f$5 = i;
    }

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda60(boolean z, boolean z2, boolean z3, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
        this.f$4 = function1;
        this.f$0 = composableLambdaImpl;
        this.f$5 = i;
    }
}
