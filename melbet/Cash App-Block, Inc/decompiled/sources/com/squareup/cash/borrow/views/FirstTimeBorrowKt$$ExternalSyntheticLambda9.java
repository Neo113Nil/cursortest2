package com.squareup.cash.borrow.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class FirstTimeBorrowKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirstTimeBorrowViewModel.Content f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ FirstTimeBorrowKt$$ExternalSyntheticLambda9(FirstTimeBorrowViewModel.Content content, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = content;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BorrowHomeKt.FirstTimeBorrowContent(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
            default:
                BorrowHomeKt.FooterCta(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
