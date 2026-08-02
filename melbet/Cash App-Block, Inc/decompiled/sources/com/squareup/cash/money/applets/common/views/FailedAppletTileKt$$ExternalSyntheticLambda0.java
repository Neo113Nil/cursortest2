package com.squareup.cash.money.applets.common.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FailedAppletTileKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ FailedAppletTileKt$$ExternalSyntheticLambda0(String str, Function0 function0, int i) {
        this.f$0 = str;
        this.f$1 = function0;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.intValue();
                SharedUIKt.FailedAppletTile(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            default:
                num.getClass();
                DirectDepositFormErrorKt.FormField(this.f$2, this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FailedAppletTileKt$$ExternalSyntheticLambda0(String str, Function0 function0, int i, int i2) {
        this.f$2 = i;
        this.f$0 = str;
        this.f$1 = function0;
    }
}
