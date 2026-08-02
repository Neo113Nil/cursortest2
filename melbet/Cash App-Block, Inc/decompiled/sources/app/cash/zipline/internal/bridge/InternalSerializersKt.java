package app.cash.zipline.internal.bridge;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes3.dex */
public abstract class InternalSerializersKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFamilyHome.deepLinkSpecs;
    }

    public static final KSerializer requireContextual(SerializersModule serializersModule, KClass kClass, List list) {
        serializersModule.getClass();
        kClass.getClass();
        list.getClass();
        KSerializer contextual = serializersModule.getContextual(kClass, list);
        if (contextual != null) {
            return contextual;
        }
        a$$ExternalSyntheticBUOutline0.m$1("No contextual serializer for ", kClass, " is registered");
        return null;
    }
}
