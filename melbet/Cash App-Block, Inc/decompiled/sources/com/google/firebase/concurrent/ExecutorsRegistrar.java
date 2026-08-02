package com.google.firebase.concurrent;

import androidx.core.os.BundleKt;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda0;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.components.Qualified;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final Lazy BG_EXECUTOR = new Lazy(new ComponentRuntime$$ExternalSyntheticLambda0(2));
    public static final Lazy LITE_EXECUTOR = new Lazy(new ComponentRuntime$$ExternalSyntheticLambda0(3));
    public static final Lazy BLOCKING_EXECUTOR = new Lazy(new ComponentRuntime$$ExternalSyntheticLambda0(4));
    public static final Lazy SCHEDULER = new Lazy(new ComponentRuntime$$ExternalSyntheticLambda0(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Qualified qualified = new Qualified(Background.class, ScheduledExecutorService.class);
        Qualified[] qualifiedArr = {new Qualified(Background.class, ExecutorService.class), new Qualified(Background.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qualified);
        for (Qualified qualified2 : qualifiedArr) {
            BundleKt.checkNotNull(qualified2, "Null interface");
        }
        Collections.addAll(hashSet, qualifiedArr);
        Component component = new Component(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new OptionalProvider$$ExternalSyntheticLambda0(3), hashSet3);
        Qualified qualified3 = new Qualified(Blocking.class, ScheduledExecutorService.class);
        Qualified[] qualifiedArr2 = {new Qualified(Blocking.class, ExecutorService.class), new Qualified(Blocking.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qualified3);
        for (Qualified qualified4 : qualifiedArr2) {
            BundleKt.checkNotNull(qualified4, "Null interface");
        }
        Collections.addAll(hashSet4, qualifiedArr2);
        Component component2 = new Component(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new OptionalProvider$$ExternalSyntheticLambda0(4), hashSet6);
        Qualified qualified5 = new Qualified(Lightweight.class, ScheduledExecutorService.class);
        Qualified[] qualifiedArr3 = {new Qualified(Lightweight.class, ExecutorService.class), new Qualified(Lightweight.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qualified5);
        for (Qualified qualified6 : qualifiedArr3) {
            BundleKt.checkNotNull(qualified6, "Null interface");
        }
        Collections.addAll(hashSet7, qualifiedArr3);
        Component component3 = new Component(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new OptionalProvider$$ExternalSyntheticLambda0(5), hashSet9);
        Component.Builder builder = Component.builder(new Qualified(UiThread.class, Executor.class));
        builder.factory = new OptionalProvider$$ExternalSyntheticLambda0(6);
        return Arrays.asList(component, component2, component3, builder.build());
    }
}
