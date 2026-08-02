package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public interface uxs extends KSerializer {
    KSerializer[] childSerializers();

    default KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
