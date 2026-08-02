package com.squareup.cash.blockers.actions.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import app.cash.broadway.ui.Ui;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.util.android.Views;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BlockerActionFileDownloadDialog extends AlertDialogView implements OutsideTapCloses, Ui {
    public Ui.EventReceiver eventReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockerActionFileDownloadDialog(Context context, BlockersScreens.BlockerActionFileDownloadDialogScreen blockerActionFileDownloadDialogScreen) {
        super(context, null, false, 6);
        context.getClass();
        MooncakeProgress mooncakeProgress = new MooncakeProgress(context, null, false, 6, null);
        mooncakeProgress.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        Views.updateMargins$default(this.dialog.titleView, 0, 0, 0, Views.dip((View) this, 32), 7);
        setNegativeButton(R.string.blockers_cancel, new ErrorView$$ExternalSyntheticLambda0(this, 20));
        this.dialog.contentContainerView.addView(mooncakeProgress, 0);
        ViewGroup.LayoutParams layoutParams = mooncakeProgress.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            throw null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 17;
        mooncakeProgress.setLayoutParams(layoutParams2);
        setTitle(blockerActionFileDownloadDialogScreen.title);
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
