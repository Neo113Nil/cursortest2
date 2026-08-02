package defpackage;

import flex.trim.memory.MemoryPriority;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class ti10 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MemoryPriority.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
