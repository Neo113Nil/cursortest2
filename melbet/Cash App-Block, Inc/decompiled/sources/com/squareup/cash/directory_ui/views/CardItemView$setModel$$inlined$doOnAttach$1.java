package com.squareup.cash.directory_ui.views;

import android.view.View;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import com.squareup.contour.ContourLayout;

/* loaded from: classes6.dex */
public final class CardItemView$setModel$$inlined$doOnAttach$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int $position$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ui.EventReceiver $receiver$inlined;
    public final /* synthetic */ ContourLayout $this_doOnAttach;
    public final /* synthetic */ DirectoryListItem.ItemViewModel $viewModel$inlined;

    public /* synthetic */ CardItemView$setModel$$inlined$doOnAttach$1(ContourLayout contourLayout, DirectoryListItem.ItemViewModel itemViewModel, Ui.EventReceiver eventReceiver, int i, int i2) {
        this.$r8$classId = i2;
        this.$this_doOnAttach = contourLayout;
        this.$viewModel$inlined = itemViewModel;
        this.$receiver$inlined = eventReceiver;
        this.$position$inlined = i;
    }

    private final void onViewDetachedFromWindow$com$squareup$cash$directory_ui$views$CardItemView$setModel$$inlined$doOnAttach$1(View view) {
    }

    private final void onViewDetachedFromWindow$com$squareup$cash$directory_ui$views$MooncakeAvatarView$setModel$$inlined$doOnAttach$1(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.$r8$classId;
        int i2 = this.$position$inlined;
        Ui.EventReceiver eventReceiver = this.$receiver$inlined;
        DirectoryListItem.ItemViewModel itemViewModel = this.$viewModel$inlined;
        ContourLayout contourLayout = this.$this_doOnAttach;
        switch (i) {
            case 0:
                ((CardItemView) contourLayout).removeOnAttachStateChangeListener(this);
                CardItemView$setModel$1$1 cardItemView$setModel$1$1 = new CardItemView$setModel$1$1(eventReceiver, itemViewModel, i2, 0);
                itemViewModel.getClass();
                itemViewModel.$$delegate_0.reportViewed(cardItemView$setModel$1$1);
                break;
            default:
                ((MooncakeAvatarView) contourLayout).removeOnAttachStateChangeListener(this);
                CardItemView$setModel$1$1 cardItemView$setModel$1$12 = new CardItemView$setModel$1$1(eventReceiver, itemViewModel, i2, 1);
                itemViewModel.getClass();
                itemViewModel.$$delegate_0.reportViewed(cardItemView$setModel$1$12);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.$r8$classId;
    }
}
