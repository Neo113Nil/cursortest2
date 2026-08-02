package ru.yandex.taxi.design;

import ru.yandex.taxi.design.DialogueComponent;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DialogueComponent.AnimationType.values().length];
        try {
            iArr[DialogueComponent.AnimationType.NOTIFICATION_SLIDE_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DialogueComponent.AnimationType.CONTENT_SLIDE_BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DialogueComponent.State.values().length];
        try {
            iArr2[DialogueComponent.State.Open.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DialogueComponent.State.AnimateClose.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[DialogueComponent.RoundedType.values().length];
        try {
            iArr3[DialogueComponent.RoundedType.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[DialogueComponent.RoundedType.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        c = iArr3;
    }
}
