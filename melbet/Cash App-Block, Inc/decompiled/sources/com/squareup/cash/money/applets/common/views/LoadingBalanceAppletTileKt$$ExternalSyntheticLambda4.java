package com.squareup.cash.money.applets.common.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class LoadingBalanceAppletTileKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ LoadingBalanceAppletTileKt$$ExternalSyntheticLambda4(Modifier modifier, Function0 function0, boolean z, boolean z2, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = function0;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                SharedUIKt.LoadingBalanceAppletTile((String) this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                AlphaKt.PersonalizePaymentButton((Modifier) this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LoadingBalanceAppletTileKt$$ExternalSyntheticLambda4(String str, Function0 function0, boolean z, boolean z2, int i) {
        this.f$0 = str;
        this.f$1 = function0;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = i;
    }
}
