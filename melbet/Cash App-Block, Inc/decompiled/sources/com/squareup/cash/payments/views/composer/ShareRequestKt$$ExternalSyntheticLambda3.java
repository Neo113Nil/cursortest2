package com.squareup.cash.payments.views.composer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ShareRequestKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ ShareRequestKt$$ExternalSyntheticLambda3(boolean z, Function0 function0, Function0 function02, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ErrorKt.ButtonCtaGroupWithProminentAddRecipient(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                ErrorKt.ButtonCtaGroupWithProminentShareLink(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
