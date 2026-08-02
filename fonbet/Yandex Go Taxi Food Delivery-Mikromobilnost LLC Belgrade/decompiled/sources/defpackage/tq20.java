package defpackage;

import com.yandex.mob.model.MobRemoteNotificationCommand;
import kotlinx.serialization.KSerializer;

/* loaded from: classes15.dex */
public final class tq20 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MobRemoteNotificationCommand.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
