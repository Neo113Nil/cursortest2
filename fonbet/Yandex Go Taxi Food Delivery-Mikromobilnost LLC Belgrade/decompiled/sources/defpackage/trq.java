package defpackage;

import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$FeedbackBadgeType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes15.dex */
public final class trq {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FeedbackBadgeChoice$FeedbackBadgeType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
