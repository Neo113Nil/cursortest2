package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.SkipVerifyViewEvent;
import com.squareup.cash.blockers.viewmodels.SkipVerifyViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SkipVerifyView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkipVerifyView(Context context) {
        super(context, null, true, 2);
        context.getClass();
        final int i = 1;
        final int i2 = 0;
        setNegativeButton(R.string.blockers_skip_verify_negative, new Function0(this) { // from class: com.squareup.cash.blockers.views.SkipVerifyView$$ExternalSyntheticLambda0
            public final /* synthetic */ SkipVerifyView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SkipVerifyView skipVerifyView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = skipVerifyView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(SkipVerifyViewEvent.Cancel.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = skipVerifyView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(SkipVerifyViewEvent.Confirm.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        setPositiveButton(R.string.blockers_skip_verify_positive, new Function0(this) { // from class: com.squareup.cash.blockers.views.SkipVerifyView$$ExternalSyntheticLambda0
            public final /* synthetic */ SkipVerifyView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SkipVerifyView skipVerifyView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = skipVerifyView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(SkipVerifyViewEvent.Cancel.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = skipVerifyView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(SkipVerifyViewEvent.Confirm.INSTANCE);
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
    public void setModel(SkipVerifyViewModel skipVerifyViewModel) {
        skipVerifyViewModel.getClass();
        setMessage(skipVerifyViewModel.message);
    }
}
