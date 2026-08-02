package defpackage;

import com.yandex.go.payments.data.model.VerifyStrategy;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class x931 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = VerifyStrategy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
