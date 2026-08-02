package com.squareup.cash.keystore;

import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.CachedAttestedKeyServiceFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class CachedAttestedKeyServiceFactory implements AttestedKeyService.Factory {
    public final ConcurrentHashMap cache = new ConcurrentHashMap();
    public final AttestedKeyService.Factory delegateFactory;

    public final class CacheItem {
        public final AttestedKeyService service;

        public CacheItem(AttestedKeyService attestedKeyService) {
            AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
            attestedKeyService.getClass();
            this.service = attestedKeyService;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheItem)) {
                return false;
            }
            AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
            return Intrinsics.areEqual(this.service, ((CacheItem) obj).service);
        }

        public final int hashCode() {
            return this.service.hashCode() + (AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP.hashCode() * 31);
        }

        public final String toString() {
            return "CacheItem(generationMode=" + AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP + ", service=" + this.service + ")";
        }
    }

    public CachedAttestedKeyServiceFactory(AttestedKeyService.Factory factory) {
        this.delegateFactory = factory;
    }

    @Override // com.squareup.cash.keystore.AttestedKeyService.Factory
    public final AttestedKeyService create(String str) {
        AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
        final ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3 = new ViewTreeObservers$$ExternalSyntheticLambda3(this, str);
        Object computeIfAbsent = this.cache.computeIfAbsent(str, new Function() { // from class: com.squareup.cash.keystore.CachedAttestedKeyServiceFactory$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (CachedAttestedKeyServiceFactory.CacheItem) ViewTreeObservers$$ExternalSyntheticLambda3.this.invoke(obj);
            }
        });
        computeIfAbsent.getClass();
        return ((CacheItem) computeIfAbsent).service;
    }
}
