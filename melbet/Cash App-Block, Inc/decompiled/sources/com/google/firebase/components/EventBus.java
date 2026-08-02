package com.google.firebase.components;

import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class EventBus implements Subscriber, Publisher {
    public final Executor defaultExecutor;
    public final HashMap handlerMap = new HashMap();
    public ArrayDeque pendingEvents = new ArrayDeque();

    public EventBus(Executor executor) {
        this.defaultExecutor = executor;
    }

    @Override // com.google.firebase.events.Publisher
    public final void publish(Event event) {
        Set<Map.Entry> entrySet;
        event.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.pendingEvents;
                if (arrayDeque != null) {
                    arrayDeque.add(event);
                    return;
                }
                synchronized (this) {
                    try {
                        Map map = (Map) this.handlerMap.get(DataCollectionDefaultChange.class);
                        entrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                    } finally {
                    }
                }
                for (Map.Entry entry : entrySet) {
                    ((Executor) entry.getValue()).execute(new r6$$ExternalSyntheticLambda0(1, entry, event));
                }
            } finally {
            }
        }
    }

    public final synchronized void subscribe(Executor executor, EventHandler eventHandler) {
        try {
            executor.getClass();
            if (!this.handlerMap.containsKey(DataCollectionDefaultChange.class)) {
                this.handlerMap.put(DataCollectionDefaultChange.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.handlerMap.get(DataCollectionDefaultChange.class)).put(eventHandler, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void unsubscribe(FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0 firebaseMessaging$AutoInit$$ExternalSyntheticLambda0) {
        firebaseMessaging$AutoInit$$ExternalSyntheticLambda0.getClass();
        if (this.handlerMap.containsKey(DataCollectionDefaultChange.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.handlerMap.get(DataCollectionDefaultChange.class);
            concurrentHashMap.remove(firebaseMessaging$AutoInit$$ExternalSyntheticLambda0);
            if (concurrentHashMap.isEmpty()) {
                this.handlerMap.remove(DataCollectionDefaultChange.class);
            }
        }
    }
}
