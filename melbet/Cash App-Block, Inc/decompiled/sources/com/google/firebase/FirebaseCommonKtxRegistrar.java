package com.google.firebase;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component> getComponents() {
        Component.Builder builder = Component.builder(new Qualified(Background.class, CoroutineDispatcher.class));
        builder.add(new Dependency(new Qualified(Background.class, Executor.class), 1, 0));
        builder.factory = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE;
        Component build = builder.build();
        Component.Builder builder2 = Component.builder(new Qualified(Lightweight.class, CoroutineDispatcher.class));
        builder2.add(new Dependency(new Qualified(Lightweight.class, Executor.class), 1, 0));
        builder2.factory = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE$1;
        Component build2 = builder2.build();
        Component.Builder builder3 = Component.builder(new Qualified(Blocking.class, CoroutineDispatcher.class));
        builder3.add(new Dependency(new Qualified(Blocking.class, Executor.class), 1, 0));
        builder3.factory = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE$2;
        Component build3 = builder3.build();
        Component.Builder builder4 = Component.builder(new Qualified(UiThread.class, CoroutineDispatcher.class));
        builder4.add(new Dependency(new Qualified(UiThread.class, Executor.class), 1, 0));
        builder4.factory = FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE$3;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Component[]{build, build2, build3, builder4.build()});
    }
}
