package com.plaid.internal;

import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes5.dex */
public abstract class V<T> {
    public final String a;

    public static final class a extends V<X6> {
        public static final a b = new a();

        public a() {
            super(Reflection.factory.getOrCreateKotlinClass(X6.class));
        }
    }

    public V(KClass kClass) {
        this.a = PapaEvent.getJavaClass(kClass).getSimpleName();
    }
}
