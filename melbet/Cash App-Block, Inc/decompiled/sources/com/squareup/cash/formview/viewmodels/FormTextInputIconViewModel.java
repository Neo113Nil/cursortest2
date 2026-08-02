package com.squareup.cash.formview.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class FormTextInputIconViewModel {
    public static final /* synthetic */ FormTextInputIconViewModel[] $VALUES;
    public static final FormTextInputIconViewModel CLEAR;
    public static final FormTextInputIconViewModel LOCK;
    public static final FormTextInputIconViewModel SHOW_HIDE;

    static {
        FormTextInputIconViewModel formTextInputIconViewModel = new FormTextInputIconViewModel("LOCK", 0);
        LOCK = formTextInputIconViewModel;
        FormTextInputIconViewModel formTextInputIconViewModel2 = new FormTextInputIconViewModel("SHOW_HIDE", 1);
        SHOW_HIDE = formTextInputIconViewModel2;
        FormTextInputIconViewModel formTextInputIconViewModel3 = new FormTextInputIconViewModel("CLEAR", 2);
        CLEAR = formTextInputIconViewModel3;
        $VALUES = new FormTextInputIconViewModel[]{formTextInputIconViewModel, formTextInputIconViewModel2, formTextInputIconViewModel3};
    }

    public static FormTextInputIconViewModel valueOf(String str) {
        return (FormTextInputIconViewModel) Enum.valueOf(FormTextInputIconViewModel.class, str);
    }

    public static FormTextInputIconViewModel[] values() {
        return (FormTextInputIconViewModel[]) $VALUES.clone();
    }
}
