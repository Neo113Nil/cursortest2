package ru.yandex.taxi.due_selector.impl.presentation.ui;

import android.view.View;
import ru.yandex.taxi.due_selector.impl.presentation.ui.DueSelectorView;

/* loaded from: classes5.dex */
public interface a {
    View asView();

    void doneButtonClicked();

    DueSelectorView.ViewState getViewState();

    void retryButtonClicked();
}
