package ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment;

/* loaded from: classes9.dex */
public final class i {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DeliveryTariffsCommentRedirectionsExperiment.ScreenDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
