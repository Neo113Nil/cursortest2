package com.google.firebase.installations;

import androidx.tracing.Trace;
import app.cash.trifle.Trifle;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$$ExternalSyntheticLambda0;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.SequentialExecutor;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseInstallations((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(HeartBeatController.class), (ExecutorService) componentContainer.get(new Qualified(Background.class, ExecutorService.class)), new SequentialExecutor((Executor) componentContainer.get(new Qualified(Blocking.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component> getComponents() {
        Component.Builder builder = Component.builder(FirebaseInstallationsApi.class);
        builder.name = LIBRARY_NAME;
        builder.add(Dependency.required(FirebaseApp.class));
        builder.add(new Dependency(0, 1, HeartBeatController.class));
        builder.add(new Dependency(new Qualified(Background.class, ExecutorService.class), 1, 0));
        builder.add(new Dependency(new Qualified(Blocking.class, Executor.class), 1, 0));
        builder.factory = new OptionalProvider$$ExternalSyntheticLambda0(10);
        Component build = builder.build();
        Trifle trifle = new Trifle(1);
        Component.Builder builder2 = Component.builder(Trifle.class);
        builder2.f1004type = 1;
        builder2.factory = new Component$$ExternalSyntheticLambda0(trifle, 0);
        return Arrays.asList(build, builder2.build(), Trace.create(LIBRARY_NAME, "19.1.0"));
    }
}
