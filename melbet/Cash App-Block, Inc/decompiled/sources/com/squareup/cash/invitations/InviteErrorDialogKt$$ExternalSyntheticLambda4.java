package com.squareup.cash.invitations;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.media3.datasource.BitmapUtil;
import com.squareup.cash.amountslider.ChangeCurrencyAmountCaptionKt;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InviteErrorDialogKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ int f$3;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public /* synthetic */ InviteErrorDialogKt$$ExternalSyntheticLambda4(Modifier modifier, String str, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        switch (i2) {
        }
        SplitButtons.Style style = SplitButtons.Style.MOONCAKE_PILLS;
        this.f$2 = modifier;
        this.f$1 = str;
        this.f$0 = function0;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Modifier modifier = this.f$2;
        Function0 function0 = this.f$0;
        String str = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                InviteErrorDialogKt.ErrorModal(Updater.updateChangedFlags(i2 | 1), (Composer) obj, modifier, str, function0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ChangeCurrencyAmountCaptionKt.ChangeCurrencyAmountCaption(Updater.updateChangedFlags(i2 | 1), (Composer) obj, modifier, str, function0);
                break;
            case 2:
                SplitButtons.Style style = SplitButtons.Style.MOONCAKE_PILLS;
                ((Integer) obj2).getClass();
                KeypadKt.SecondarySplitButton(Updater.updateChangedFlags(i2 | 1), (Composer) obj, modifier, str, function0);
                break;
            case 3:
                SplitButtons.Style style2 = SplitButtons.Style.MOONCAKE_PILLS;
                ((Integer) obj2).getClass();
                KeypadKt.PrimarySplitButton(Updater.updateChangedFlags(i2 | 1), (Composer) obj, modifier, str, function0);
                break;
            default:
                ((Integer) obj2).getClass();
                BitmapUtil.InputImageAttachment(Updater.updateChangedFlags(i2 | 1), (Composer) obj, modifier, str, function0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InviteErrorDialogKt$$ExternalSyntheticLambda4(String str, Modifier modifier, Function0 function0, int i) {
        this.$r8$classId = 1;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$0 = function0;
        this.f$3 = i;
    }

    public /* synthetic */ InviteErrorDialogKt$$ExternalSyntheticLambda4(String str, Function0 function0, Modifier modifier, int i) {
        this.$r8$classId = 4;
        this.f$1 = str;
        this.f$0 = function0;
        this.f$2 = modifier;
        this.f$3 = i;
    }

    public /* synthetic */ InviteErrorDialogKt$$ExternalSyntheticLambda4(Function0 function0, String str, Modifier modifier, int i) {
        this.$r8$classId = 0;
        this.f$0 = function0;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$3 = i;
    }
}
