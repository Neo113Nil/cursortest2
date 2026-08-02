package com.squareup.cash.payments.views;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentViewKt$$ExternalSyntheticLambda19 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Function1 f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda19(ToolbarViewModel toolbarViewModel, boolean z, boolean z2, boolean z3, Function1 function1, Modifier modifier, int i) {
        NavigationType navigationType = NavigationType.BACK;
        this.f$0 = toolbarViewModel;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
        this.f$5 = function1;
        this.f$6 = modifier;
        this.f$7 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$6;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ToolbarViewModel toolbarViewModel = (ToolbarViewModel) obj4;
                NavigationType navigationType = NavigationType.BACK;
                ((Integer) obj2).getClass();
                MainPaymentViewKt.Toolbar(toolbarViewModel, this.f$1, this.f$2, this.f$3, this.f$5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                Function1 function1 = this.f$5;
                boolean z = this.f$1;
                boolean z2 = this.f$2;
                boolean z3 = this.f$3;
                CardViewApi21Impl.MoneybotLoadedContent((MoneybotChatViewModel.Content) obj4, function1, z, z2, z3, (Function0) obj3, (Composer) obj, updateChangedFlags);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda19(MoneybotChatViewModel.Content content, Function1 function1, boolean z, boolean z2, boolean z3, Function0 function0, int i) {
        this.f$0 = content;
        this.f$5 = function1;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
        this.f$6 = function0;
        this.f$7 = i;
    }
}
