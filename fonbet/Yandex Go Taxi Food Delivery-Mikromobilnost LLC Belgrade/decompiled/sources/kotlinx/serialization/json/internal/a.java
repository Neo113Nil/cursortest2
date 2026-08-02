package kotlinx.serialization.json.internal;

import defpackage.pqn;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class a {
    public final pqn a;
    public boolean b;

    public a(SerialDescriptor serialDescriptor) {
        this.a = new pqn(serialDescriptor, new JsonElementMarker$origin$1(2, this, a.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
