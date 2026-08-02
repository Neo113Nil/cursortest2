package com.squareup.cash.blockers.views;

import android.view.View;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class InstrumentSelectionView$$ExternalSyntheticLambda17 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentSelectionView f$0;
    public final /* synthetic */ InstrumentSelectionViewEvent f$1;

    public /* synthetic */ InstrumentSelectionView$$ExternalSyntheticLambda17(InstrumentSelectionView instrumentSelectionView, InstrumentSelectionViewEvent instrumentSelectionViewEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = instrumentSelectionView;
        this.f$1 = instrumentSelectionViewEvent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        InstrumentSelectionViewEvent instrumentSelectionViewEvent = this.f$1;
        InstrumentSelectionView instrumentSelectionView = this.f$0;
        switch (i) {
            case 0:
                Ui.EventReceiver eventReceiver = instrumentSelectionView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(instrumentSelectionViewEvent);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            default:
                Ui.EventReceiver eventReceiver2 = instrumentSelectionView.eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(instrumentSelectionViewEvent);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
        }
    }
}
