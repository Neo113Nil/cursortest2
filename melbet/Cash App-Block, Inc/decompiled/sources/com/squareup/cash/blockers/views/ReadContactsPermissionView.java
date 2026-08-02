package com.squareup.cash.blockers.views;

import android.content.Context;
import android.widget.FrameLayout;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.ReadContactsPermissionViewEvent;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ReadContactsPermissionView extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadContactsPermissionView(Context context) {
        super(context, null, false, 6);
        context.getClass();
        final int i = 0;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setIcon(PlatformKt.getDrawableCompat(context, R.drawable.contacts, Integer.valueOf(colorPalette.tint)));
        setMessage(R.string.blockers_verify_contacts_perms_message);
        setPositiveButton(R.string.blockers_verify_contacts_open_settings, new Function0(this) { // from class: com.squareup.cash.blockers.views.ReadContactsPermissionView$$ExternalSyntheticLambda0
            public final /* synthetic */ ReadContactsPermissionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReadContactsPermissionView readContactsPermissionView = this.f$0;
                switch (i2) {
                    case 0:
                        Ui.EventReceiver eventReceiver = readContactsPermissionView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ReadContactsPermissionViewEvent.PositiveClick.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = readContactsPermissionView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(ReadContactsPermissionViewEvent.NegativeClick.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        setNegativeButton(R.string.blockers_verify_contacts_back, new Function0(this) { // from class: com.squareup.cash.blockers.views.ReadContactsPermissionView$$ExternalSyntheticLambda0
            public final /* synthetic */ ReadContactsPermissionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReadContactsPermissionView readContactsPermissionView = this.f$0;
                switch (i22) {
                    case 0:
                        Ui.EventReceiver eventReceiver = readContactsPermissionView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(ReadContactsPermissionViewEvent.PositiveClick.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        Ui.EventReceiver eventReceiver2 = readContactsPermissionView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(ReadContactsPermissionViewEvent.NegativeClick.INSTANCE);
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
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
