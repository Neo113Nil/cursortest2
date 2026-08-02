package ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment;

import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryTariffsCommentRedirectionsExperiment.ScreenDto.values().length];
        try {
            iArr[DeliveryTariffsCommentRedirectionsExperiment.ScreenDto.EXPLICIT_COMMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryTariffsCommentRedirectionsExperiment.ScreenDto.ADDRESS_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
