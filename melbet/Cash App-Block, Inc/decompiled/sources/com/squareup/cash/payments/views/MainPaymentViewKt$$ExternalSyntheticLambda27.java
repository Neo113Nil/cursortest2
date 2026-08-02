package com.squareup.cash.payments.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.FormViewCtaButtons;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.qrcodes.views.CashtagQrScanView$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentViewKt$$ExternalSyntheticLambda27 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda27(ToolbarViewModel toolbarViewModel, boolean z, boolean z2) {
        this.$r8$classId = 0;
        this.f$0 = toolbarViewModel;
        this.f$1 = z;
        this.f$2 = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        boolean z = this.f$2;
        Object obj4 = this.f$0;
        boolean z2 = this.f$1;
        switch (i) {
            case 0:
                ToolbarViewModel toolbarViewModel = (ToolbarViewModel) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    String str = toolbarViewModel.actionText;
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1218901478);
                        str = Room.stringResource(gapComposer, z2 ? R.string.send_payment_action_next : z ? R.string.payment_request : R.string.payment_send);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1218902656);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                FormViewCtaButtons formViewCtaButtons = (FormViewCtaButtons) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                int i2 = FormViewCtaButtons.$r8$clinit;
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (z2) {
                        gapComposer2.startReplaceGroup(-1401278491);
                        formViewCtaButtons.CtaButton(formViewCtaButtons.secondary, SizeKt.fillMaxWidth(companion, 1.0f), gapComposer2, 48);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1401205083);
                        gapComposer2.end(false);
                    }
                    if (z) {
                        gapComposer2.startReplaceGroup(-1401156537);
                        formViewCtaButtons.CtaButton(formViewCtaButtons.primary, SizeKt.fillMaxWidth(companion, 1.0f), gapComposer2, 48);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1401085051);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Function1 function1 = (Function1) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z2) {
                        gapComposer3.startReplaceGroup(-1731193491);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed = gapComposer3.changed(function1);
                        Object rememberedValue = gapComposer3.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new CashtagQrScanView$$ExternalSyntheticLambda0(19, function1);
                            gapComposer3.updateRememberedValue(rememberedValue);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, CameraXPreviewKt.lambda$884327832, gapComposer3, 1573296, 56);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1730942422);
                        gapComposer3.end(false);
                    }
                    if (z) {
                        gapComposer3.startReplaceGroup(-1730899084);
                        ButtonProminence buttonProminence2 = ButtonProminence.SUBTLE;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed2 = gapComposer3.changed(function1);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new CashtagQrScanView$$ExternalSyntheticLambda0(20, function1);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence2, false, false, null, CameraXPreviewKt.lambda$308235407, gapComposer3, 1573296, 56);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1730654742);
                        gapComposer3.end(false);
                    }
                    ButtonProminence buttonProminence3 = ButtonProminence.SUBTLE;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CashtagQrScanView$$ExternalSyntheticLambda0(21, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth3, buttonProminence3, false, false, null, CameraXPreviewKt.lambda$1389882301, gapComposer3, 1573296, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda27(int i, Object obj, boolean z, boolean z2) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
        this.f$2 = z2;
    }
}
