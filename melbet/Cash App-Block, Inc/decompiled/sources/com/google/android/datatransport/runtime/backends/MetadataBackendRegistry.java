package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.gms.auth.api.zbc;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class MetadataBackendRegistry {
    public final zbc backendFactoryProvider;
    public final HashMap backends;
    public final SVG creationContextFactory;

    public MetadataBackendRegistry(Context context, SVG svg) {
        zbc zbcVar = new zbc(context);
        this.backends = new HashMap();
        this.backendFactoryProvider = zbcVar;
        this.creationContextFactory = svg;
    }

    public final synchronized TransportBackend get(String str) {
        if (this.backends.containsKey(str)) {
            return (TransportBackend) this.backends.get(str);
        }
        CctBackendFactory cctBackendFactory = this.backendFactoryProvider.get(str);
        if (cctBackendFactory == null) {
            return null;
        }
        SVG svg = this.creationContextFactory;
        TransportBackend create = cctBackendFactory.create(new AutoValue_CreationContext((Context) svg.rootElement, (Clock) svg.cssRules, (Clock) svg.idToElementMap, str));
        this.backends.put(str, create);
        return create;
    }
}
