package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class qzl implements jwi0 {
    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        if (str.equals("DocumentEventCallbacksTracker")) {
            return pzl.Companion.serializer();
        }
        return null;
    }
}
