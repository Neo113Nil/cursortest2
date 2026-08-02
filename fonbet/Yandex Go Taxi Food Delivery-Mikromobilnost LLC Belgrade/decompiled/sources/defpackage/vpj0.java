package defpackage;

import ru.yandex.taxi.summary.requirements.list.models.RequirementType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class vpj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequirementType.values().length];
        try {
            iArr[RequirementType.DRIVER_COMMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequirementType.COST_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequirementType.EXTRA_PHONE_NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequirementType.ORDER_FOR_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RequirementType.ORDER_DUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RequirementType.INTERCITY_CONTACT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RequirementType.TRANSFER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RequirementType.TESTING_COMMANDS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
