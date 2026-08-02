package com.squareup.cash.earnings.views.home;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.taptopay.views.TapToPayKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsHomeKt$$ExternalSyntheticLambda15 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ EarningsHomeKt$$ExternalSyntheticLambda15(String str, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        String str = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                EarningsHomeKt.DisclosureMarkdownText(str, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, false, 5);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, (Function2) rememberedValue, fillMaxWidth, null, 0L, null, null, null, 0, 0, this.f$2, gapComposer, MLKEMEngine.KyberPolyBytes, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ExpandableContentKt.MoneybotPreambleEditorContent(str, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                TapToPayKt.TapToPayPaymentConfirmation(str, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
