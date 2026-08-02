package com.squareup.cash.formview.components;

import com.squareup.protos.franklin.api.FormBlocker;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class FormElementViewBuilderKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[FormBlocker.Element.TextInputElement.InputField.SecureFieldAccessory.values().length];
        try {
            iArr[FormBlocker.Element.TextInputElement.InputField.SecureFieldAccessory.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormBlocker.Element.TextInputElement.InputField.SecureFieldAccessory.SHOW_HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FormBlocker.Element.TextInputElement.InputField.SecureFieldAccessory.LOCK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[FormBlocker.Element.TextInputElement.InputField.TrailingFieldAccessory.values().length];
        try {
            iArr2[FormBlocker.Element.TextInputElement.InputField.TrailingFieldAccessory.SECURE_FIELD_SHOW_HIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FormBlocker.Element.TextInputElement.InputField.TrailingFieldAccessory.SECURE_FIELD_LOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FormBlocker.Element.TextInputElement.InputField.TrailingFieldAccessory.CLEAR_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
