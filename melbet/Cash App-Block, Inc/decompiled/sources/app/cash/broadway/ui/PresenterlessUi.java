package app.cash.broadway.ui;

import app.cash.broadway.ui.Ui;

/* loaded from: classes.dex */
public interface PresenterlessUi extends Ui {
    @Override // app.cash.broadway.ui.Ui
    default void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
    }
}
