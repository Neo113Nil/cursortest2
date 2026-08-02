package defpackage;

import just.adapter.snapping.IntervalType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class vuw {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = IntervalType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
