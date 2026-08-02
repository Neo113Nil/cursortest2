package com.google.firebase.messaging;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.datatransport.TransportBackend;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(Qualified qualified, ComponentContainer componentContainer) {
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.get(FirebaseApp.class);
        if (componentContainer.get(FirebaseInstanceIdInternal.class) == null) {
            return new FirebaseMessaging(firebaseApp, null, componentContainer.getProvider(DefaultUserAgentPublisher.class), componentContainer.getProvider(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), componentContainer.getProvider(qualified), (Subscriber) componentContainer.get(Subscriber.class));
        }
        a$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component> getComponents() {
        Qualified qualified = new Qualified(TransportBackend.class, TransportFactory.class);
        Component.Builder builder = Component.builder(FirebaseMessaging.class);
        builder.name = LIBRARY_NAME;
        builder.add(Dependency.required(FirebaseApp.class));
        builder.add(new Dependency(0, 0, FirebaseInstanceIdInternal.class));
        builder.add(new Dependency(0, 1, DefaultUserAgentPublisher.class));
        builder.add(new Dependency(0, 1, HeartBeatInfo.class));
        builder.add(Dependency.required(FirebaseInstallationsApi.class));
        builder.add(new Dependency(qualified, 0, 1));
        builder.add(Dependency.required(Subscriber.class));
        builder.factory = new FirebaseMessagingRegistrar$$ExternalSyntheticLambda0(qualified, 0);
        if ((builder.instantiation == 0 ? 1 : 0) != 0) {
            builder.instantiation = 1;
            return Arrays.asList(builder.build(), Trace.create(LIBRARY_NAME, "25.0.2"));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Instantiation type has already been set.");
        return null;
    }
}
