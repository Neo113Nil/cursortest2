package app.cash.broadway.ui;

/* loaded from: classes.dex */
public interface Ui {

    public interface EventReceiver {
        void sendEvent(Object obj);
    }

    void setEventReceiver(EventReceiver eventReceiver);

    void setModel(Object obj);
}
