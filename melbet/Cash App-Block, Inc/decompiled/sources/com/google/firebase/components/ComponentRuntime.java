package com.google.firebase.components;

import android.util.Log;
import androidx.core.os.BundleKt;
import coil3.size.SizeKt;
import com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Provider;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ComponentRuntime implements ComponentContainer {
    public static final ComponentRuntime$$ExternalSyntheticLambda0 EMPTY_PROVIDER = new ComponentRuntime$$ExternalSyntheticLambda0(0);
    public final ComponentRegistrarProcessor componentRegistrarProcessor;
    public final EventBus eventBus;
    public final HashMap components = new HashMap();
    public final HashMap lazyInstanceMap = new HashMap();
    public final HashMap lazySetMap = new HashMap();
    public final HashSet processedCoroutineDispatcherInterfaces = new HashSet();
    public final AtomicReference eagerComponentsInitializedWith = new AtomicReference();

    public ComponentRuntime(Executor executor, ArrayList arrayList, ArrayList arrayList2, ComponentRegistrarProcessor componentRegistrarProcessor) {
        EventBus eventBus = new EventBus(executor);
        this.eventBus = eventBus;
        this.componentRegistrarProcessor = componentRegistrarProcessor;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Component.of(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList3.add(Component.of(this, ComponentRuntime.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList3.add(component);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.componentRegistrarProcessor.processRegistrar(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array2 = ((Component) it4.next()).providedInterfaces.toArray();
                int length = array2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array2[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.processedCoroutineDispatcherInterfaces.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.processedCoroutineDispatcherInterfaces.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.components.isEmpty()) {
                SizeKt.detect(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.components.keySet());
                arrayList6.addAll(arrayList3);
                SizeKt.detect(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Component component2 = (Component) it5.next();
                this.components.put(component2, new Lazy(new FirebaseApp$$ExternalSyntheticLambda0(1, this, component2)));
            }
            arrayList5.addAll(processInstanceComponents(arrayList3));
            arrayList5.addAll(processSetComponents());
            processDependencies();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.eagerComponentsInitializedWith.get();
        if (bool != null) {
            doInitializeEagerComponents(this.components, bool.booleanValue());
        }
    }

    public final void doInitializeEagerComponents(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            int i = component.instantiation;
            if (i == 1 || (i == 2 && z)) {
                provider.get();
            }
        }
        EventBus eventBus = this.eventBus;
        synchronized (eventBus) {
            try {
                arrayDeque = eventBus.pendingEvents;
                if (arrayDeque != null) {
                    eventBus.pendingEvents = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                eventBus.publish((Event) it.next());
            }
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final synchronized Provider getProvider(Qualified qualified) {
        BundleKt.checkNotNull(qualified, "Null interface requested.");
        return (Provider) this.lazyInstanceMap.get(qualified);
    }

    public final void initializeEagerComponents(boolean z) {
        HashMap hashMap;
        AtomicReference atomicReference = this.eagerComponentsInitializedWith;
        Boolean valueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.components);
        }
        doInitializeEagerComponents(hashMap, z);
    }

    public final void processDependencies() {
        for (Component component : this.components.keySet()) {
            for (Dependency dependency : component.dependencies) {
                if (dependency.f1005type == 2 && !this.lazySetMap.containsKey(dependency.anInterface)) {
                    HashMap hashMap = this.lazySetMap;
                    Qualified qualified = dependency.anInterface;
                    Set set = Collections.EMPTY_SET;
                    LazySet lazySet = new LazySet();
                    lazySet.actualSet = null;
                    lazySet.providers = Collections.newSetFromMap(new ConcurrentHashMap());
                    lazySet.providers.addAll(set);
                    hashMap.put(qualified, lazySet);
                } else if (this.lazyInstanceMap.containsKey(dependency.anInterface)) {
                    continue;
                } else {
                    int i = dependency.f1005type;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + component + ": " + dependency.anInterface);
                    }
                    if (i != 2) {
                        HashMap hashMap2 = this.lazyInstanceMap;
                        Qualified qualified2 = dependency.anInterface;
                        OptionalProvider$$ExternalSyntheticLambda0 optionalProvider$$ExternalSyntheticLambda0 = OptionalProvider.NOOP_HANDLER;
                        ComponentRuntime$$ExternalSyntheticLambda0 componentRuntime$$ExternalSyntheticLambda0 = OptionalProvider.EMPTY_PROVIDER;
                        OptionalProvider optionalProvider = new OptionalProvider();
                        optionalProvider.handler = optionalProvider$$ExternalSyntheticLambda0;
                        optionalProvider.delegate = componentRuntime$$ExternalSyntheticLambda0;
                        hashMap2.put(qualified2, optionalProvider);
                    }
                }
            }
        }
    }

    public final ArrayList processInstanceComponents(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.f1003type == 0) {
                Provider provider = (Provider) this.components.get(component);
                for (Qualified qualified : component.providedInterfaces) {
                    HashMap hashMap = this.lazyInstanceMap;
                    if (hashMap.containsKey(qualified)) {
                        arrayList2.add(new MainActivity$$ExternalSyntheticLambda8(8, (OptionalProvider) ((Provider) hashMap.get(qualified)), provider));
                    } else {
                        hashMap.put(qualified, provider);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList processSetComponents() {
        HashMap hashMap = this.lazySetMap;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.components.entrySet()) {
            Component component = (Component) entry.getKey();
            if (component.f1003type != 0) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.providedInterfaces) {
                    if (!hashMap2.containsKey(qualified)) {
                        hashMap2.put(qualified, new HashSet());
                    }
                    ((Set) hashMap2.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                LazySet lazySet = (LazySet) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new MainActivity$$ExternalSyntheticLambda8(9, lazySet, (Provider) it.next()));
                }
            } else {
                Qualified qualified2 = (Qualified) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                LazySet lazySet2 = new LazySet();
                lazySet2.actualSet = null;
                lazySet2.providers = Collections.newSetFromMap(new ConcurrentHashMap());
                lazySet2.providers.addAll(set);
                hashMap.put(qualified2, lazySet2);
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final synchronized Provider setOfProvider(Qualified qualified) {
        LazySet lazySet = (LazySet) this.lazySetMap.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return EMPTY_PROVIDER;
    }
}
