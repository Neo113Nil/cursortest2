package defpackage;

import com.yandex.mob.model.MobNotificationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class rp20 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MobNotificationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
