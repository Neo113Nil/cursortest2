package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class InstrumentSelectionView$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentSelectionView f$0;

    public /* synthetic */ InstrumentSelectionView$$ExternalSyntheticLambda2(InstrumentSelectionView instrumentSelectionView, int i) {
        this.$r8$classId = i;
        this.f$0 = instrumentSelectionView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InstrumentSelectionView instrumentSelectionView = this.f$0;
        switch (i) {
            case 0:
                Ui.EventReceiver eventReceiver = instrumentSelectionView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(InstrumentSelectionViewEvent.Close.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            default:
                Context context = instrumentSelectionView.getContext();
                context.getClass();
                return new LabelValueView(context);
        }
    }
}
