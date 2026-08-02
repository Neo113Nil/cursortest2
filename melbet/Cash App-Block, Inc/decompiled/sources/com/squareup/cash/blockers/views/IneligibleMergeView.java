package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.IneligibleMergeViewEvent;
import com.squareup.cash.blockers.viewmodels.IneligibleMergeViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class IneligibleMergeView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IneligibleMergeView(Context context) {
        super(context, null, false, 6);
        context.getClass();
        final int i = 0;
        setNegativeButton(R.string.blockers_ineligible_merge_negative, new Function0(this) { // from class: com.squareup.cash.blockers.views.IneligibleMergeView$$ExternalSyntheticLambda0
            public final /* synthetic */ IneligibleMergeView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IneligibleMergeView ineligibleMergeView = this.f$0;
                switch (i2) {
                    case 0:
                        Ui.EventReceiver eventReceiver = ineligibleMergeView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(IneligibleMergeViewEvent.Cancel.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = ineligibleMergeView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(IneligibleMergeViewEvent.Confirm.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        setPositiveButton(R.string.blockers_ineligible_merge_positive, new Function0(this) { // from class: com.squareup.cash.blockers.views.IneligibleMergeView$$ExternalSyntheticLambda0
            public final /* synthetic */ IneligibleMergeView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IneligibleMergeView ineligibleMergeView = this.f$0;
                switch (i22) {
                    case 0:
                        Ui.EventReceiver eventReceiver = ineligibleMergeView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(IneligibleMergeViewEvent.Cancel.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = ineligibleMergeView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(IneligibleMergeViewEvent.Confirm.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(IneligibleMergeViewModel ineligibleMergeViewModel) {
        ineligibleMergeViewModel.getClass();
        setMessage(ineligibleMergeViewModel.message);
    }
}
