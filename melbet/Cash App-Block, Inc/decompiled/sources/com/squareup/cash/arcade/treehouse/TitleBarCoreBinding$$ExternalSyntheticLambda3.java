package com.squareup.cash.arcade.treehouse;

import app.cash.broadway.ui.Ui;
import com.squareup.cash.arcade.treehouse.TitleBarCoreBinding;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class TitleBarCoreBinding$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TitleBarCoreBinding f$0;

    public /* synthetic */ TitleBarCoreBinding$$ExternalSyntheticLambda3(TitleBarCoreBinding titleBarCoreBinding, int i) {
        this.$r8$classId = i;
        this.f$0 = titleBarCoreBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TitleBarCoreBinding titleBarCoreBinding = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = ((TitleBarCoreBinding.ActionBinding) titleBarCoreBinding.startAction$delegate.getValue()).callback;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                Function0 function02 = ((TitleBarCoreBinding.ActionBinding) titleBarCoreBinding.endPrimaryAction$delegate.getValue()).callback;
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                Function0 function03 = ((TitleBarCoreBinding.ActionBinding) titleBarCoreBinding.endSecondaryAction$delegate.getValue()).callback;
                if (function03 != null) {
                    function03.invoke();
                }
                return Unit.INSTANCE;
            default:
                Ui.EventReceiver eventReceiver = titleBarCoreBinding.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(TabToolbarInternalViewEvent.ProfileLongClick.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
        }
    }
}
