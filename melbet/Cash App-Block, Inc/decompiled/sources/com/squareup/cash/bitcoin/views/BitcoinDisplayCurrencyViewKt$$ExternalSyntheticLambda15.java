package com.squareup.cash.bitcoin.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.stripe.android.financialconnections.ui.components.TextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinDisplayCurrencyViewKt$$ExternalSyntheticLambda15 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ Modifier f$4;

    public /* synthetic */ BitcoinDisplayCurrencyViewKt$$ExternalSyntheticLambda15(int i, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        this.$r8$classId = 2;
        this.f$2 = z;
        this.f$0 = str;
        this.f$3 = function0;
        this.f$4 = modifier;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencyItem(Updater.updateChangedFlags(1), (Composer) obj, this.f$4, this.f$0, this.f$1, this.f$3, this.f$2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocaleToggleKt.FAQExpandableItem(Updater.updateChangedFlags(1), (Composer) obj, this.f$4, this.f$0, this.f$1, this.f$3, this.f$2);
                break;
            default:
                ((Integer) obj2).getClass();
                TextKt.TestModeBanner(Updater.updateChangedFlags(1), (Composer) obj, this.f$4, this.f$0, this.f$1, this.f$3, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinDisplayCurrencyViewKt$$ExternalSyntheticLambda15(String str, String str2, boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = z;
        this.f$3 = function0;
        this.f$4 = modifier;
    }
}
