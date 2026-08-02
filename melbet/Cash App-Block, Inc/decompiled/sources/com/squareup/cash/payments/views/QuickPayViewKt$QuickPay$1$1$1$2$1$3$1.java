package com.squareup.cash.payments.views;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.shopping.autofill.presenters.AutofillState;
import com.squareup.cash.ui.widget.keypad.KeypadListener;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $shouldDim$delegate;

    public /* synthetic */ QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.$shouldDim$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        AutofillState.Success success = AutofillState.Success.INSTANCE;
        MutableState mutableState = this.$shouldDim$delegate;
        switch (i) {
            case 0:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 1:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 2:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 3:
                mutableState.setValue(Boolean.TRUE);
                break;
            case 4:
                mutableState.setValue(Boolean.FALSE);
                break;
            case 5:
                StatusResultViewModel statusResultViewModel = (StatusResultViewModel) mutableState.getValue();
                statusResultViewModel.getClass();
                StatusResultViewModel.Ready ready = (StatusResultViewModel.Ready) statusResultViewModel;
                StatusResult.Icon icon = ready.icon;
                String str = ready.text;
                StatusResultButton statusResultButton = ready.primaryButton;
                StatusResultButton statusResultButton2 = ready.secondaryButton;
                LayoutUpdate layoutUpdate = ready.layoutUpdate;
                ColorModel colorModel = ready.accentColor;
                StatusResultViewModel.Ready.HapticEffect hapticEffect = ready.hapticEffect;
                boolean z = ready.showConfetti;
                statusResultButton.getClass();
                mutableState.setValue(new StatusResultViewModel.Ready(icon, str, statusResultButton, statusResultButton2, layoutUpdate, colorModel, true, hapticEffect, z));
                break;
            case 6:
                KeypadListener keypadListener = (KeypadListener) mutableState.getValue();
                if (keypadListener != null) {
                    keypadListener.onLongBackspace();
                }
                break;
            case 7:
                mutableState.setValue(success);
                break;
            case 8:
                mutableState.setValue(success);
                break;
            case 9:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                break;
            case 10:
                mutableState.setValue(Boolean.valueOf(true));
                break;
            case 11:
                mutableState.setValue(null);
                break;
            case 12:
                mutableState.setValue(Boolean.valueOf(true));
                break;
            case 13:
                mutableState.setValue(Boolean.valueOf(true));
                break;
            case 14:
                mutableState.setValue(Boolean.valueOf(true));
                break;
            default:
                mutableState.setValue(Boolean.valueOf(true));
                break;
        }
        return Unit.INSTANCE;
    }
}
