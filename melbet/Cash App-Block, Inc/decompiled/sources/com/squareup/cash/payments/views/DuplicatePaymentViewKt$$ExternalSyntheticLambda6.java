package com.squareup.cash.payments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DuplicatePaymentViewKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ Modifier f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ DuplicatePaymentViewKt$$ExternalSyntheticLambda6(int i, Modifier modifier, String str, String str2, Function0 function0, Function0 function02) {
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = modifier;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                QuickPayViewKt.DuplicatePayment(Updater.updateChangedFlags(this.f$5 | 1), (Composer) obj, this.f$4, this.f$2, this.f$3, this.f$0, this.f$1);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                AfterpaySearchViewKt.AfterpayAppletLoading(this.f$4, this.f$2, this.f$3, this.f$0, this.f$1, (Composer) obj, updateChangedFlags, this.f$5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DuplicatePaymentViewKt$$ExternalSyntheticLambda6(Modifier modifier, String str, String str2, Function0 function0, Function0 function02, int i, int i2) {
        this.f$4 = modifier;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$5 = i2;
    }
}
