package kotlinx.serialization.modules;

import defpackage.lfx;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    public SerializerAlreadyRegisteredException(lfx lfxVar, lfx lfxVar2) {
        super("Serializer for " + lfxVar2 + " already registered in the scope of " + lfxVar);
    }

    public SerializerAlreadyRegisteredException(String str) {
        super(str);
    }
}
