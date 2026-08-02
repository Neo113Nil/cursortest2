package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class tmx {
    public final KSerializer a;

    public tmx(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    public final String a(Enum r1) {
        return this.a.getDescriptor().f(r1.ordinal());
    }
}
