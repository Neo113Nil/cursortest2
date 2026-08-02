package ru.yandex.taxi.scooters.presentation.feedback.data.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;

/* loaded from: classes6.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FeedbackAttachments.Requirement.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
