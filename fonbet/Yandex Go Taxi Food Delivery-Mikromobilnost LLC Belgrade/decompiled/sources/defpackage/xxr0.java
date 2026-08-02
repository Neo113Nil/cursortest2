package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xxr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BaseShortcutModel$Source.values().length];
        try {
            iArr[BaseShortcutModel$Source.HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseShortcutModel$Source.ITEMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BaseShortcutModel$Source.TURBO_BUTTONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BaseShortcutModel$Source.TOP_ITEMS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BaseShortcutModel$Source.BOTTOM_ITEMS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BaseShortcutModel$Source.HORIZONTAL_STACK_ITEM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[BaseShortcutModel$Source.LOCAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[BaseShortcutModel$Source.MAIN_SCREEN_PROMO.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[BaseShortcutModel$Source.VERTICAL_STACK_ITEM.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
