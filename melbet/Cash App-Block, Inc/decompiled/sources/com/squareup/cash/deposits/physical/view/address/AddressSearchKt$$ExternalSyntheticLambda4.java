package com.squareup.cash.deposits.physical.view.address;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.bitcoin.views.autowithdraw.BitcoinAutoWithdrawUpsellViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class AddressSearchKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Icons f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ AddressSearchKt$$ExternalSyntheticLambda4(Icons icons, String str, String str2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = icons;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        String str = this.f$2;
        String str2 = this.f$1;
        Icons icons = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AddressSearchKt.NoResults(icons, str2, str, composer, Updater.updateChangedFlags(7));
                break;
            default:
                BitcoinAutoWithdrawUpsellViewKt.InfoCell(icons, str2, str, composer, Updater.updateChangedFlags(7));
                break;
        }
        return Unit.INSTANCE;
    }
}
