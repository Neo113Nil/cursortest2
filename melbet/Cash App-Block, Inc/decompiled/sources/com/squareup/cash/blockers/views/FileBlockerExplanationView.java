package com.squareup.cash.blockers.views;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.FileBlockerExplanationViewEvent;
import com.squareup.cash.blockers.viewmodels.FileBlockerExplanationViewModel;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class FileBlockerExplanationView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileBlockerExplanationView(Context context) {
        super(context, null, false, 6);
        context.getClass();
        final int i = 0;
        setNegativeButton(R.string.selfie_explanation_negative, new Function0(this) { // from class: com.squareup.cash.blockers.views.FileBlockerExplanationView$$ExternalSyntheticLambda0
            public final /* synthetic */ FileBlockerExplanationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FileBlockerExplanationView fileBlockerExplanationView = this.f$0;
                switch (i2) {
                    case 0:
                        Ui.EventReceiver eventReceiver = fileBlockerExplanationView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FileBlockerExplanationViewEvent.Cancel.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = fileBlockerExplanationView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(FileBlockerExplanationViewEvent.Confirm.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        setPositiveButton(R.string.selfie_explanation_positive, new Function0(this) { // from class: com.squareup.cash.blockers.views.FileBlockerExplanationView$$ExternalSyntheticLambda0
            public final /* synthetic */ FileBlockerExplanationView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FileBlockerExplanationView fileBlockerExplanationView = this.f$0;
                switch (i22) {
                    case 0:
                        Ui.EventReceiver eventReceiver = fileBlockerExplanationView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FileBlockerExplanationViewEvent.Cancel.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = fileBlockerExplanationView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(FileBlockerExplanationViewEvent.Confirm.INSTANCE);
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
    public void setModel(FileBlockerExplanationViewModel fileBlockerExplanationViewModel) {
        fileBlockerExplanationViewModel.getClass();
        setMessage(fileBlockerExplanationViewModel.message);
    }
}
