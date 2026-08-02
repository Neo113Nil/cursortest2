package com.netcetera.threeds.sdk.infrastructure;

import java.io.Serializable;
import java.util.Comparator;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes5.dex */
public final class ok<T> implements Serializable {
    private final Comparator<T> ThreeDS2Service;
    private final T ThreeDS2ServiceInstance;
    private final T get;

    public enum ThreeDS2ServiceInstance implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    private ok(T t, T t2, Comparator<T> comparator) {
        if (t == null || t2 == null) {
            Handlers$$ExternalSyntheticBUOutline0.m$1("Elements in a range must not be null: element1=", t, ", element2=", t2);
            throw null;
        }
        if (comparator == null) {
            this.ThreeDS2Service = ThreeDS2ServiceInstance.INSTANCE;
        } else {
            this.ThreeDS2Service = comparator;
        }
        if (this.ThreeDS2Service.compare(t, t2) < 1) {
            this.ThreeDS2ServiceInstance = t;
            this.get = t2;
        } else {
            this.ThreeDS2ServiceInstance = t2;
            this.get = t;
        }
    }

    public static <T> ok<T> initialize(T t, T t2, Comparator<T> comparator) {
        return new ok<>(t, t2, comparator);
    }

    public boolean getWarnings(T t) {
        return t != null && this.ThreeDS2Service.compare(t, this.ThreeDS2ServiceInstance) > -1 && this.ThreeDS2Service.compare(t, this.get) < 1;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;TT;)Lcom/netcetera/threeds/sdk/infrastructure/ok<TT;>; */
    public static ok getWarnings(Comparable comparable, Comparable comparable2) {
        return initialize(comparable, comparable2, null);
    }
}
