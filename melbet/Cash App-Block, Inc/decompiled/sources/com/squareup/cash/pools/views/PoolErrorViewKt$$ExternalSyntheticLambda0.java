package com.squareup.cash.pools.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.media3.exoplayer.audio.DeviceTypeUtil;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerKt;
import com.squareup.cash.earningstracker.views.components.LoadingErrorKt;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolErrorViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PoolErrorViewKt$$ExternalSyntheticLambda0(int i, Modifier modifier, Function0 function0) {
        this.$r8$classId = 4;
        this.f$1 = modifier;
        this.f$0 = function0;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PoolToastKt.PoolErrorView(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$1, this.f$0);
                break;
            case 1:
                BitcoinDepositsViewKt.QrError(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$1, this.f$0);
                break;
            case 2:
                BitcoinKeypadAmountPickerKt.MaxButton(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$1, this.f$0);
                break;
            case 3:
                LoadingErrorKt.LoadingError(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$1, this.f$0);
                break;
            case 4:
                UtilsKt.CancelButton(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$1, this.f$0);
                break;
            case 5:
                DeviceTypeUtil.RemoveAttachmentButton(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$1, this.f$0);
                break;
            default:
                MessageFileKt.MessageStatusIcon(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$1, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PoolErrorViewKt$$ExternalSyntheticLambda0(Function0 function0, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = i;
    }
}
