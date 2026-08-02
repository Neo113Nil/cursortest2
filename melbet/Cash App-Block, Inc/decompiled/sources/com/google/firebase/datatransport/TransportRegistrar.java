package com.google.firebase.datatransport;

import android.content.Context;
import androidx.tracing.Trace;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.components.Qualified;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$0(ComponentContainer componentContainer) {
        TransportRuntime.initialize((Context) componentContainer.get(Context.class));
        return TransportRuntime.getInstance().newFactory(CCTDestination.LEGACY_INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$1(ComponentContainer componentContainer) {
        TransportRuntime.initialize((Context) componentContainer.get(Context.class));
        return TransportRuntime.getInstance().newFactory(CCTDestination.LEGACY_INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$2(ComponentContainer componentContainer) {
        TransportRuntime.initialize((Context) componentContainer.get(Context.class));
        return TransportRuntime.getInstance().newFactory(CCTDestination.INSTANCE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component> getComponents() {
        Component.Builder builder = Component.builder(TransportFactory.class);
        builder.name = LIBRARY_NAME;
        builder.add(Dependency.required(Context.class));
        builder.factory = new OptionalProvider$$ExternalSyntheticLambda0(7);
        Component build = builder.build();
        Component.Builder builder2 = Component.builder(new Qualified(LegacyTransportBackend.class, TransportFactory.class));
        builder2.add(Dependency.required(Context.class));
        builder2.factory = new OptionalProvider$$ExternalSyntheticLambda0(8);
        Component build2 = builder2.build();
        Component.Builder builder3 = Component.builder(new Qualified(TransportBackend.class, TransportFactory.class));
        builder3.add(Dependency.required(Context.class));
        builder3.factory = new OptionalProvider$$ExternalSyntheticLambda0(9);
        return Arrays.asList(build, build2, builder3.build(), Trace.create(LIBRARY_NAME, "18.2.0"));
    }
}
