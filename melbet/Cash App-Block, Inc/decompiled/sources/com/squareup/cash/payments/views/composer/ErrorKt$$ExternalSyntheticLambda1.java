package com.squareup.cash.payments.views.composer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ErrorKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ErrorKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = i;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ErrorKt.Error(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1), this.f$3);
                break;
            default:
                ErrorKt.OwnLinkMessage(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1), this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }
}
