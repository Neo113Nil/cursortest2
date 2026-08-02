package ru.yandex.taxi.contacts;

import ru.yandex.taxi.contacts.SelectContactMvpView;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SelectContactMvpView.UiState.values().length];
        try {
            iArr[SelectContactMvpView.UiState.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectContactMvpView.UiState.EDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectContactMvpView.UiState.EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
