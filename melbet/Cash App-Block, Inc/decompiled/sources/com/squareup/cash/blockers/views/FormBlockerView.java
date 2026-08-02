package com.squareup.cash.blockers.views;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.formview.components.FormElementViewBuilder$Factory$Impl;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.coroutines.ViewKt;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
public final class FormBlockerView extends FrameLayout implements FormView.FormViewParent, Ui {
    public final FormView formView;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final InstanceFactory activity;
        public final InstanceFactory formElementViewBuilderFactory;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
            this.activity = instanceFactory;
            this.formElementViewBuilderFactory = instanceFactory2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBlockerView(Activity activity, Context context, FormElementViewBuilder$Factory$Impl formElementViewBuilder$Factory$Impl) {
        super(context, null);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        FormView formView = new FormView(activity, context, formElementViewBuilder$Factory$Impl);
        addView(formView);
        this.formView = formView;
        setBackgroundColor(colorPalette.background);
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return this.formView.onBack();
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
        this.formView.onDialogCanceled(screen);
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        this.formView.onDialogResult(screen, obj);
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onEnterTransitionFinished() {
        this.formView.onEnterTransitionFinished();
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onExitTransitionStarted() {
        FormView formView = this.formView;
        formView.getClass();
        Keyboards.hideKeyboard(formView);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new PlaidLinkView.AnonymousClass2(this, eventReceiver, (Continuation) null));
        this.formView.setOnBackListener(new FormBlockerView$$ExternalSyntheticLambda0(eventReceiver, 0));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(FormViewModel formViewModel) {
        formViewModel.getClass();
        this.formView.renderViewModel(formViewModel);
    }
}
