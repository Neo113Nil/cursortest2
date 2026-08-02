package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.Set;

/* loaded from: classes4.dex */
public final class TransportFactoryImpl implements TransportFactory {
    public final Set supportedPayloadEncodings;
    public final AutoValue_TransportContext transportContext;
    public final TransportRuntime transportInternal;

    public TransportFactoryImpl(Set set, AutoValue_TransportContext autoValue_TransportContext, TransportRuntime transportRuntime) {
        this.supportedPayloadEncodings = set;
        this.transportContext = autoValue_TransportContext;
        this.transportInternal = transportRuntime;
    }

    public final TransportImpl getTransport(String str, Encoding encoding2, Transformer transformer) {
        Set set = this.supportedPayloadEncodings;
        if (set.contains(encoding2)) {
            return new TransportImpl(this.transportContext, str, encoding2, transformer, this.transportInternal);
        }
        JWK$$ExternalSyntheticBUOutline0.m("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{encoding2, set});
        return null;
    }
}
