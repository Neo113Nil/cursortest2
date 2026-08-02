package app.cash.broadway.ui;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SingletonPresenterlessUi implements PresenterlessUi {
    public static final SingletonPresenterlessUi INSTANCE = new SingletonPresenterlessUi();

    @Override // app.cash.broadway.ui.Ui
    public final void setModel(Object obj) {
        ((Unit) obj).getClass();
    }
}
