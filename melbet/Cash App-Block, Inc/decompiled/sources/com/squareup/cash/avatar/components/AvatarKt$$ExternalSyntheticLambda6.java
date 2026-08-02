package com.squareup.cash.avatar.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ TextStyle f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda6(Modifier modifier, long j, String str, TextStyle textStyle, int i) {
        this.f$0 = modifier;
        this.f$1 = j;
        this.f$2 = str;
        this.f$3 = textStyle;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                AvatarKt.m3405MonogramsW7UJKQ(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                ReceiptWheelContentKt.m3699InnerContentTextT042LqI(this.f$2, this.f$3, this.f$1, this.f$0, (Composer) obj, updateChangedFlags, this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda6(String str, TextStyle textStyle, long j, Modifier modifier, int i, int i2) {
        this.f$2 = str;
        this.f$3 = textStyle;
        this.f$1 = j;
        this.f$0 = modifier;
        this.f$4 = i2;
    }
}
