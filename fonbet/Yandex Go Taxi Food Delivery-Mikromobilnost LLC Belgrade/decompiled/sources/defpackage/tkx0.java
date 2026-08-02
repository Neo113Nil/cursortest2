package defpackage;

import ru.yandex.taxi.requirements.models.domain.RequirementBubbleAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class tkx0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequirementBubbleAction.values().length];
        try {
            iArr[RequirementBubbleAction.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequirementBubbleAction.REMOVE_ALT_CHOICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequirementBubbleAction.PREORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequirementBubbleAction.INTERCITY_CONTACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RequirementBubbleAction.COMPOUND_OPTIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RequirementBubbleAction.COUNTER_PLUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RequirementBubbleAction.COUNTER_MINUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
