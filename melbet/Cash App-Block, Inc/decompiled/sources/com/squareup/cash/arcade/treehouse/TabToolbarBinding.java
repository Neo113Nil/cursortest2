package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.View;
import app.cash.broadway.ui.Ui;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;

/* loaded from: classes5.dex */
public final class TabToolbarBinding implements Ui, Widget {
    public Modifier modifier = Modifier.Companion.$$INSTANCE;
    public final View value;

    public TabToolbarBinding(Context context) {
        this.value = new View(context);
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.broadway.ui.Ui
    public final void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
    }

    @Override // app.cash.broadway.ui.Ui
    public final void setModel(Object obj) {
        ((TabToolbarInternalViewModel) obj).getClass();
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
