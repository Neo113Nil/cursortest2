package defpackage;

import com.yandex.go.overdraft.data.model.ConditionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class yxd {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ConditionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
