package app.cash.local.views.dialog;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import app.cash.local.viewmodels.LocalExplanatoryDialogViewEvent;
import app.cash.local.viewmodels.LocalExplanatoryDialogViewModel;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.ui.OutsideTapCloses;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalExplanatoryDialogView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalExplanatoryDialogView(Context context) {
        super(context, null, false, 6);
        context.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(LocalExplanatoryDialogViewModel localExplanatoryDialogViewModel) {
        localExplanatoryDialogViewModel.getClass();
        setMessage(localExplanatoryDialogViewModel.message);
        int ordinal = localExplanatoryDialogViewModel.positiveButtonType.ordinal();
        if (ordinal == 0) {
            final int i = 0;
            setPositiveButton(R.string.local_views_ok, new Function0(this) { // from class: app.cash.local.views.dialog.LocalExplanatoryDialogView$$ExternalSyntheticLambda0
                public final /* synthetic */ LocalExplanatoryDialogView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    LocalExplanatoryDialogViewEvent.PositiveClicked positiveClicked = LocalExplanatoryDialogViewEvent.PositiveClicked.INSTANCE;
                    LocalExplanatoryDialogView localExplanatoryDialogView = this.f$0;
                    switch (i2) {
                        case 0:
                            Ui.EventReceiver eventReceiver = localExplanatoryDialogView.eventReceiver;
                            if (eventReceiver != null) {
                                eventReceiver.sendEvent(positiveClicked);
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        case 1:
                            Ui.EventReceiver eventReceiver2 = localExplanatoryDialogView.eventReceiver;
                            if (eventReceiver2 != null) {
                                eventReceiver2.sendEvent(positiveClicked);
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        default:
                            Ui.EventReceiver eventReceiver3 = localExplanatoryDialogView.eventReceiver;
                            if (eventReceiver3 != null) {
                                eventReceiver3.sendEvent(LocalExplanatoryDialogViewEvent.NegativeClicked.INSTANCE);
                                return Unit.INSTANCE;
                            }
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                    }
                }
            });
            return;
        }
        final int i2 = 1;
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        setPositiveButton(R.string.local_views_open_settings, new Function0(this) { // from class: app.cash.local.views.dialog.LocalExplanatoryDialogView$$ExternalSyntheticLambda0
            public final /* synthetic */ LocalExplanatoryDialogView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LocalExplanatoryDialogViewEvent.PositiveClicked positiveClicked = LocalExplanatoryDialogViewEvent.PositiveClicked.INSTANCE;
                LocalExplanatoryDialogView localExplanatoryDialogView = this.f$0;
                switch (i22) {
                    case 0:
                        Ui.EventReceiver eventReceiver = localExplanatoryDialogView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(positiveClicked);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        Ui.EventReceiver eventReceiver2 = localExplanatoryDialogView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(positiveClicked);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver3 = localExplanatoryDialogView.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(LocalExplanatoryDialogViewEvent.NegativeClicked.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        final int i3 = 2;
        setNegativeButton(R.string.local_views_back, new Function0(this) { // from class: app.cash.local.views.dialog.LocalExplanatoryDialogView$$ExternalSyntheticLambda0
            public final /* synthetic */ LocalExplanatoryDialogView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LocalExplanatoryDialogViewEvent.PositiveClicked positiveClicked = LocalExplanatoryDialogViewEvent.PositiveClicked.INSTANCE;
                LocalExplanatoryDialogView localExplanatoryDialogView = this.f$0;
                switch (i22) {
                    case 0:
                        Ui.EventReceiver eventReceiver = localExplanatoryDialogView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(positiveClicked);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    case 1:
                        Ui.EventReceiver eventReceiver2 = localExplanatoryDialogView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(positiveClicked);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver3 = localExplanatoryDialogView.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(LocalExplanatoryDialogViewEvent.NegativeClicked.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
    }
}
