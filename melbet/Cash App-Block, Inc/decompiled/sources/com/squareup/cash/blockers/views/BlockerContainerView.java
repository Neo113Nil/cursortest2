package com.squareup.cash.blockers.views;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.camera.video.VideoCapture;
import androidx.core.view.WindowCompat$Api35Impl;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.UiFactory;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.actions.viewevents.GoBack;
import com.squareup.cash.mooncake.components.MooncakeToolbar;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.OnBackListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BlockerContainerView extends LinearLayout implements OnBackListener, Ui {
    public final Ui childUi;
    public Ui.EventReceiver eventReceiver;
    public final boolean isBottomSheet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockerContainerView(Context context, UiFactory.ViewUi viewUi, boolean z) {
        super(context, null);
        context.getClass();
        this.isBottomSheet = z;
        Ui ui = viewUi.ui;
        ui.getClass();
        this.childUi = ui;
        setOrientation(1);
        if (!z) {
            WindowInsets windowInsets = InsetsCollector.CONSUMED;
            WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
            Context context2 = getContext();
            context2.getClass();
            MooncakeToolbar mooncakeToolbar = new MooncakeToolbar(context2, null, 2, null);
            mooncakeToolbar.setBackground(null);
            mooncakeToolbar.setNavigationOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 23));
            addView(mooncakeToolbar);
        }
        addView(viewUi.view);
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(GoBack.INSTANCE);
            return this.isBottomSheet;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
        throw null;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
        this.childUi.setEventReceiver(eventReceiver);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Object obj) {
        obj.getClass();
        this.childUi.setModel(obj);
    }
}
